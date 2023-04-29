package com.pjp.cinema.dto;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

enum Status {
	Avaible("avaible"),
	Bought("bought");

	private String str;
	private Status(String str) {
		this.str = str;
	}
}

//@Entity
//public class Status {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	private String name;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Status other = (Status) obj;
//		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
//	}
//
//	@Override
//	public String toString() {
//		return "Status[id=" + id + ", name=" + name + "]";
//	}
//
//}
