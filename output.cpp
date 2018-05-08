#include <iostream>
#include <vector>
#include <string>


struct Matrix
{
	std::vector<double> data;
	std::vector<int> size;
}

int main()
{
	Matrix A;
	A.size.push_back(2);
	A.size.push_back(4);
	A.data.push_back(1.0);
	A.data.push_back(2.0);
	A.data.push_back(3.0);
	A.data.push_back(4.0);
	A.data.push_back(5.0);
	A.data.push_back(6.0);
	A.data.push_back(7.0);
	A.data.push_back(8.0);
	double b = 5.0;
	return 0;
}