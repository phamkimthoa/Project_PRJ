create database FinalProject 

use FinalProject 

create table Account (
    AccountID int IDENTITY(1,1) primary key,
    Email nvarchar(50) not null unique,
    [Password] varchar(50) not null,
    [Name] nvarchar(50) not null,
    Phone varchar(50) not null,
    [Address] nvarchar(250),
    [Role] int not null -- 1: admin, 2: user
);
GO


create table Category (
    CategoryID int IDENTITY(1,1) primary key,
    [Name] nvarchar(50) not NULL,
);
GO

create table Review (
	ReviewID int identity(1,1) primary key , 
	ReviewDate date not null , 
	ReviewDetail nvarchar(250) , 
	AccountID int , 
	foreign key (AccountID) references Account(AccountID)
	); 
	GO 
	
create table Product (
    ProductID INT IDENTITY(1,1) PRIMARY KEY,
    [Name] varchar(50) not null,
    Price int not null,
    [Description] varchar(50) not null,
    [Image] varchar(500),
    CategoryID int not null,
	Inventoryproduct int , 
	Soldproduct int ,
	[Status] int not null DEFAULT 1, -- 0 deleted -- 1: available, 2: not available
	ReviewID int ,
    foreign key (CategoryID) references Category(CategoryID)
);
GO

create table Invoice (
    InvoiceID int IDENTITY(1,1) primary key,
    AccountID int not null,
    OrderDate date not null,
    [Address] nvarchar(250) not null,
	TotalPrice int not null,
	ProductID int not null,
    Quantity int not null ,
    [Status] int not null, -- 1: Completed, 2: processing, 0: Cancelled 
    foreign key (AccountID) references Account(AccountID),
	foreign key (ProductID) references Product(ProductID)
);
GO


--------------------------- Insert data ---------------------------

-- account
insert into Account values ('anh@gmail.com', '1', 'minh anh', '0124727283', 'Ha Dong, Ha Noi', 2);
insert into Account values ('long@abc.com', '123456', 'viet long', '0199928372', 'Nam Tu Liem, Ha Noi', 2);
insert into Account values ('dung@fu.com', '123456', 'thi dung', '0123456789', 'Hung Yen', 2);
insert into Account values ('admin', '13', 'admin', '0123456789', 'Khoai Chau', 1);

-- invoice 
insert into Invoice values (1 , '2024-04-02', 'Khoai Chau , Hung Yen' , 300000 , 2, 3 , 1) ; 

-- category
insert into Category values ( 'Fruits');
insert into Category values ('Vegetables');


-- type 1: Fruites

insert into Product values ('Grapes',378, 'Grapes made in China ', 'https://themewagon.github.io/fruitables/img/fruite-item-5.jpg', 1, 47,2,1,'7');
insert into Product values ('Blueberry', 100, 'Blueberry from Australia', 'https://themewagon.github.io/fruitables/img/fruite-item-2.jpg', 1, 7,2,1,'7');

insert into Product values ('Apricots', 40, 'No description', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/2e1628f5f7131a9eb328ec1fb2c22fd3/c/k/ck_set_milkis.png', 1, 1);
insert into Product values ('Banana', 40, 'Combo 6Pcs Chicken Cheese', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/2e1628f5f7131a9eb328ec1fb2c22fd3/m/i/milkis_-_c.thu_n_99.png', 1, 1);
insert into Product values ('Oranges', 40, 'No description', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/2e1628f5f7131a9eb328ec1fb2c22fd3/d/e/dessert-534x374px_squid-ring_2.png', 1, 1);
insert into Product values ('Apple', 40, 'No description', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/2e1628f5f7131a9eb328ec1fb2c22fd3/d/e/dessert-534x374px_squid-ring_2.png', 1, 1);
insert into Product values ('Strawberry', 40, 'No description', 'https://dscnnwjxnwl3f.cloudfront.net/media/catalog/product/cache/2e1628f5f7131a9eb328ec1fb2c22fd3/d/e/dessert-534x374px_squid-ring_2.png', 1, 1);

SET IDENTITY_INSERT [FinalProject].[dbo].[Review] ON;

-- Thêm d? li?u vào b?ng Review v?i giá tr? cho c?t Identity
INSERT INTO [FinalProject].[dbo].[Review] ([ReviewID], [ReviewDate], [ReviewDetail], [AccountID])
VALUES
    (7, '2024-03-10', 'Great product! Highly recommended.', 1),
    (743, '2024-03-09', 'Very satisfied with my purchase.', 2),
    (67, '2024-03-08', 'Excellent service and fast delivery.', 3),
    -- Thêm các b?n ghi khác t?i ?ây...
    (17, '2024-01-01', 'Good quality. Will buy again.', 4);

SET IDENTITY_INSERT [FinalProject].[dbo].[Review] OFF;