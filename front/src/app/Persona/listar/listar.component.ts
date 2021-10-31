import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from 'src/app/modelo/Persona';
import { ServiceService } from 'src/app/Service/service.service';


@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

   personas:Persona[] | undefined;
  service: any;
  constructor(private http:ServiceService, private router:Router ) { }

  ngOnInit(){
    this.service.getPersonas()
    .subscribe((data: Persona[] | undefined)=>{
      this.personas=data;
      
    })
    
   
    
  }

}
