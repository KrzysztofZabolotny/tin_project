package com.tin_project.scraper;

import java.util.ArrayList;
import java.util.List;

public class ScraperPackage {
  public Status status;
  List<Data> data = new ArrayList<>();



  public ScraperPackage(Status status, List<Data> dataList) {
    this.status = status;
    this.data = dataList;
  }

  public ScraperPackage() {
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public List<Data> getData() {
    return data;
  }

  public void setData(List<Data> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "AboveRoot{" +
            "status=" + status +
            ", data=" + data +
            '}';
  }
}