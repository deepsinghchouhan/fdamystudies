import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {AppDetails} from './app-details';
import {EntityService} from 'src/app/service/entity.service';

@Injectable({
  providedIn: 'root',
})
export class AppDetailsService {
  constructor(private readonly entityService: EntityService<AppDetails>) {}

  getAppDetails(appId: string): Observable<AppDetails> {
    return this.entityService.get(`apps/${appId}/participants`);
  }
}
