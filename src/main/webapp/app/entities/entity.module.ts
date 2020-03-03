import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'product',
        loadChildren: () => import('./product/product.module').then(m => m.ChartsProductModule)
      },
      {
        path: 'chart',
        loadChildren: () => import('./chart/chart.module').then(m => m.ChartsChartModule)
      }

      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class ChartsEntityModule {}
