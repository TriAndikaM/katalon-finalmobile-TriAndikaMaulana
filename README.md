# Mobile Automation Final Project Using Katalon

## Test Case Coverage

| Expected Result                | Test Suites                  | Test Case                   |
|-------------------------------|------------------------------|-----------------------------|
| Positive                      | Account Management           | Login Success               |
|                               |                              | Register Success            |
|                               | Product Management            | Search product success     |
|                               |                              |Product Details by category |
| Negatives                     | Account Management           | Login Failed                |
|                               |                              | Register Failed             |
|                               | Product Management            | Search Product Failed      |


## Positive Result
### 1. Login Success
#### Deskripsi
Pada test case ini, otomasi dilakukan untuk proses login pengguna ke dalam aplikasi. Dalam konteks ini, test case dirancang dengan menggunakan dua global variabel, yaitu username dan password, dengan tujuan menghasilkan output positif dimana pengguna berhasil masuk ke dalam aplikasi.

Global Varibel yang digunakan : 
- Username 
- Password
### 2. Regiter Success
#### Deskripsi
Test case ini mengotomasi proses pendaftaran pengguna yang belum memiliki akun dengan mengisi secara otomatis formulir pendaftaran dengan data yang relevan. Diharapkan hasilnya positif, di mana pengguna berhasil terdaftar dalam aplikasi.

### 3. Search Product Success
#### Deskripsi
Test case otomasi ini akan mencari produk tertentu dengan menggunakan kata kunci pencarian yang relevan. Hasil yang diharapkan adalah sistem dapat menemukan dan menampilkan produk yang sesuai dengan kriteria pencarian yang telah ditentukan.

Data yang digunakan:
- List nama produk yaitu "bose soundlink" dan "hp envy"

### 4. Product Details by category
##### Deskripsi
Test case ini dirancang proses otomasi yang melibatkan navigasi melalui berbagai kategori produk yang tersedia di aplikasi dan memverifikasi kemampuan sistem untuk menampilkan detail lengkap produk yang dipilih dalam kategori tersebut

## Negative Result
### 1. Login Failed
#### Deskripsi
Otomasi ini akan mensimulasikan situasi di mana pengguna memberikan informasi login yang tidak valid, seperti username atau password yang salah. Proses otomasi akan memastikan bahwa sistem memberikan tanggapan yang tepat dalam kasus kegagalan login, termasuk tampilan pesan error yang sesuai dan tindakan lanjutan yang diperlukan, seperti meminta pengguna untuk memasukkan kembali informasi login yang benar.

Data yang digunakan:
| No.             | Username                  | Password                    |
|-----------------|---------------------------|-----------------------------|
|1                | harimau                   | Harimau1                    |
|2                | angsa                     | Angsa                        |

### 2. Register Failed
#### Deskripsi
Otomasi ini mensimulasikan situasi di mana pengguna mengisi formulir pendaftaran dengan informasi yang tidak valid, seperti username yang sudah ada. Proses otomasi akan memastikan bahwa sistem memberikan tanggapan yang sesuai dalam kasus kegagalan pendaftaran, termasuk tampilan pesan error yang jelas dan petunjuk yang diperlukan untuk memperbaiki masalah pendaftaran.

### 3. Search Product Failed
#### Deskripsi
Test case ini menangani skenario ketika pengguna mencari produk tetapi tidak berhasil menemukannya karena kata kunci pencarian yang diberikan tidak sesuai dengan produk yang tersedia atau tidak ada dalam database aplikasi. Diimplementasikan metode if else apabila produk yang ditemukan tidak ada maka akan dicari produk lain yang ada dalam aplikasi
