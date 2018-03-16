package org.soundarya.datacreator;

public class Person {
	private int id;
	private String name;
	private String address;
	private String phone;
		
		public Person() {
			super();
		}
		public Person(int id, String name, String address, String phone) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
		}
   	}