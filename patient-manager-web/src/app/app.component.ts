import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Patient } from './patient';
import { PatientService } from './patient.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'patient-manager-web';
  public patients: Patient[] = [];

  constructor(private patientService: PatientService){  }

  ngOnInit() {
      this.getPatients();
  }

  public getPatients(): void{
    this.patientService.getActives().subscribe(
      (response: Patient[]) => {
        this.patients = response;
      },
      // (error: HttpErrorResponse) => {
      //   alert(error.message);
      // }
    )
  }


}
