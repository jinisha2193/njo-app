import { Component, OnInit } from '@angular/core';
import { TestService } from '../shared/test/test.service';
import { TouchSequence } from 'selenium-webdriver';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.css']
})
export class TitleComponent implements OnInit {

  //myTitle: string;
  users: Array<any>
  

  constructor(private titleService : TestService) { 
  }

  ngOnInit() {
     console.log("inInit");
     
    this.titleService.getAll().subscribe(data => {
      this.users = data;
    });

    console.log("failed");
    
  
  }
}
