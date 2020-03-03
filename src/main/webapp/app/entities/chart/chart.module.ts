import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ChartsSharedModule } from 'app/shared/shared.module';

import { NgxChartsModule } from '@swimlane/ngx-charts';
import { ChartComponent } from './chart.component';
import { chartRoute } from './chart.route';

@NgModule({
  imports: [ChartsSharedModule, RouterModule.forChild(chartRoute), NgxChartsModule],
  declarations: [ChartComponent]
})
export class ChartsChartModule {}
