/* eslint-disable no-console */
import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpHeaders, HttpResponse } from '@angular/common/http';
import { JhiEventManager } from 'ng-jhipster';

import { ChartService } from './chart.service';

import { IChart } from 'app/shared/model/chart-model';
import { ActivatedRoute } from '@angular/router';

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
  xAxisLabel = 'Year';
  yAxisLabel = 'Total';
  timeline = true;

  colorScheme = {
    domain: ['#5AA454', '#E44D25', '#CFC0BB', '#7aa3e5', '#a8385d', '#aae3f5']
  };

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ chart }) => {
      this.chart = chart;
    });
  }

  ngOnDestroy(): void {
    // throw new Error("Method not implemented.");
  }

  previousState() {
    window.history.back();
  }

  // chart select event
  onSelect(event) {
    console.debug(event);
  }
}
