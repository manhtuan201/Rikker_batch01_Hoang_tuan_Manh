import { Component, OnInit } from '@angular/core';
export class NhanVien {
  makh: string;
  tenkh: string;
  ngaysinh: Date;
  sodt: string;
  gmail: string;
  diachi: string;
}


@Component({
  selector: 'app-nhan-vien',
  templateUrl: './nhan-vien.component.html',
  styleUrls: ['./nhan-vien.component.css']
})
export class NhanVienComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
