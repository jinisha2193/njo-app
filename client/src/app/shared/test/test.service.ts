import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

import { enableProdMode } from '@angular/core';

enableProdMode();

@Injectable({providedIn: 'root'})
export class TestService {

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<any>{

    let headers = new HttpHeaders();
      headers.append('Content-Type', 'application/json');
      headers.append('Access-Control-Allow-Origin' , '*');
    
    return this.http.get('//marginsandpadding-env.hvapzvqmt9.us-east-1.elasticbeanstalk.com/users', { headers: headers });
    
  }
}