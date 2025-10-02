/* function hai (nama) {
   console.log("Haii " + nama + "!")
}

hai ("Dimas")
hai ("Fitri")  

function nambah(a,b) {
    return a + b
}

let hasil = nambah(77, 33)
console.log("Hasil:" + hasil)

let car = {
    name: "Flat",
    model:500,
    weight:"850kg",
    color: "white",

    start: function() {
        console.log("Mobil Dinyalakan.");
    },
       drive: function() {
        console.log("Mobil jalan.");
    },
       brake: function() {
        console.log("Mobil ngerem.");
    },
       stop: function() {
        console.log("Mobil berhenti.");
    }
};

    console.log(car.name);
        console.log(car.weight);

        car.start();
        car.drive();

let sepeda = {
    merk: "Polygon",
    gigi: 24,
    warna: "hitam",

    start: function () {
        console.log("Sepeda dikayuh");
    },
    brake: function () {
        console.log("Sepeda mengerem");
    }
}

console.log (sepeda.merk);
console.log(sepeda.gigi);
console.log(sepeda.warna);

sepeda.start();
sepeda.brake();

function car(name, model, color, weight) {
    this.name = name;
    this.model = model;
    this.color = color;
    this.weight = weight;

    this.start = function () {
        console.log(`${this.name} dinyalakan`); 
    };
    
    this.drive = function () {
        console.log(`${this.name} sedang berjalan`);
    };
}

let car1 = new car("toyota",2020,"blue","1000kg");
let car2 = new car("honda", 2021, "red", "950kg");

car1.start();

class sepeda {
    constructor(merk, Jumlah_Gear, Warna) {
        this.merk = merk;
        this.Jumlah_Gear = Jumlah_Gear;
        this.Warna = Warna;
    }

    start() {
        console.log(`${this.merk} dikayuh`);
    }

    brake() {
        console.log(`${this.merk} sedang berhenti`);
    }
}

let sepeda1 = new sepeda("sepeda toyota", 2020, "blue");
let sepeda2 = new sepeda("sepeda", 200, "apalah");

sepeda1.start();
sepeda1.brake();

class Student {
  constructor(nama, nim, jurusan, tahun) {
    this.nama = nama;
    this.nim = nim;
    this.jurusan = jurusan;
    this.tahun =- tahun;
  }

  introduce() {
    console.log(`Halo saya ${this.nama}, mahasiswa ${this.jurusan} angkatan ${this.tahun}`);
  }

  isSenior() {
    return this.tahun < 2025;
  }
}

const mhs1 = new Student("Hanif", "12345678", "Informatika", 2026);
mhs1.introduce();
console.log(mhs1.isSenior());

class Animal {
  constructor(name) {
    this.name = name;
  }

  eat() {
    console.log(`${this.name} sedang makan`);
  }
}

class Cat extends Animal { 
  constructor(name, color) {
    super(name);
    this.color = color;
  }

  meow() {
    console.log(`${this.name} si ${this.color} mengeong`);
  }
}
class Dog extends Animal {
  augh() {
    console.log(`${this.name} menggonggong`);
  }
}


const kucing = new Cat("Tom", "Hitam");
const anjing = new Dog("Dogi");

kucing.eat();
kucing.meow(); 
anjing.augh();
anjing.eat();


class Employee {
  constructor(name, position, salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }
}

class Manager extends Employee {
  constructor(name, position, salary, department) {
    super(name, position, salary);
    this.department = department;
  }

  lead() {
    console.log(`${this.name} memimpin departemen ${this.department}`);
  }
}


const manager = new Manager("Budi", "Manager", 10000000, "IT");
manager.lead(); 

class Animal {
  speak() {
    console.log("hewan bersuara");
  }
}

class Cat extends Animal {
  speak() {
    console.log("meong");
  }
}

const c = new Cat();
c.speak();

class BankAccount {
  constructor() {
    this._balance = 0;
  }

  deposit(amount) {
    this._balance += amount;
  }

  showBalance() {
    console.log(`Saldo saat ini: ${this._balance}`);
  }
}

const akun = new BankAccount();
akun.deposit(500000);
akun.showBalance();

akun._balance = 9999999;
akun.showBalance();

class SecureAccount {
  #balance = 0;

  deposit(amount) {
    this.#balance += amount;
  }

  showBalance() {
    console.log(`Saldo aman: ${this.#balance}`);
  }
}

const akun = new SecureAccount();
akun.deposit(500);
akun.showBalance();

class Message {
  send() {
    console.log("Mengirim pesan umum.");
  }
}

class Email extends Message {
  send() {
    console.log("Mengirim email ke pengguna.");
  }
}

class SMS extends Message {
  send() {
    console.log("Mengirim SMS ke nomor penerima.");
  }
}

const pesan1 = new Message();
const pesan2 = new Email();
const pesan3 = new SMS();

pesan1.send();
pesan2.send();
pesan3.send();

class User {
  #password;

  constructor(password) {
    this.#password = password;
  }

  checkPassword(input) {
    if (input === this.#password) {
      console.log("benar");
    } else {
      console.log("salah");
    }
  }
}

const u = new User("rahasia");
u.checkPassword("rahasia");
u.checkPassword("1234");

class Account {
  #balance = 0;

  deposit(amount) {
    this.#balance += amount;
  }

  getBalance() {
    return this.#balance;
  }

  showBalance() {
    console.log(`Saldo saat ini: ${this.#balance}`);
  }
}

class PremiumAccount extends Account {
  showBalance() {
    console.log(`Saldo anda adalah: ${this.getBalance()} (akun premium)`);
  }
}


const akunBiasa = new Account();
akunBiasa.deposit(1000);
akunBiasa.showBalance(); 

const akunPremium = new PremiumAccount();
akunPremium.deposit(5000);
akunPremium.showBalance(); */


