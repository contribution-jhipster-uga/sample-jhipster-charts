/* eslint-disable no-console */
import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpHeaders, HttpResponse } from '@angular/common/http';
import { JhiEventManager } from 'ng-jhipster';

import { ChartService } from './chart.service';

import { IChart } from 'app/shared/model/chart-model';

// A voir l'exemple https://github.com/swimlane/ngx-charts/blob/master/src/app/app.component.ts

@Component({
  selector: 'jhi-chart',
  templateUrl: './chart.component.html'
})
export class ChartComponent implements OnInit, OnDestroy {
  chart: IChart;
  view: any[] = [1000, 500];

  // options
  legend = true;
  showLabels = true;
  animations = true;
  xAxis = true;
  yAxis = true;
  showYAxisLabel = true;
  showXAxisLabel = true;
  xAxisLabel = 'Mois';
  yAxisLabel = "Chiffre d'affaire";
  timeline = true;

  colorScheme = {
    domain: ['#5AA454', '#E44D25', '#CFC0BB', '#7aa3e5', '#a8385d', '#aae3f5']
  };

  constructor(protected chartService: ChartService, protected eventManager: JhiEventManager) {}

  // chart select event
  onSelect(event) {
    console.debug(event);
  }

  load(id: number) {
    this.chartService.find(id).subscribe((res: HttpResponse<IChart>) => {
      return this.processChart(res.body, res.headers);
    });
  }

  protected processChart(chart: IChart, headers: HttpHeaders) {
    this.chart = chart;
  }

  ngOnInit() {
    this.load(1);
  }

  ngOnDestroy() {
    //
  }
}
