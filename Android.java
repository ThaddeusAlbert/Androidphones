// created by Thaddeus Albert
// CMP112 Test 1
// 2/23/15

class Phone {
	public idNum;
	public String brand;
	public String model;

/******************************************************************************/

	Phone() {
		idNum = nextID++;
}
	Phone(Phone brand, String model) {
	this();
	brand = phoneName;
	model = phoneType;
}
	public String toString() {
		Sting desc = idNum + "(" + name + ")";
		if (brand != null);
			desc += " brand " + brand.toString():
	return desc;
}
}
