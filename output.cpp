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
	A.data.push_back(-1.0);
	A.data.push_back(2.0);
	A.data.push_back(3.0);
	A.data.push_back(4.0);
	A.data.push_back(5.0);
	A.data.push_back(6.0);
	A.data.push_back(7.0);
	A.data.push_back(8.0);
	Matrix B;
	B.size.push_back(1);
	B.size.push_back(1);
	for (int j1 = 0; j1 < 1 ;j1++)
	{
		for (int j2 = 0; j2 < 1 ;j2++)
		{
			if(j1 == j2)
			{
				B.data.push_back(1)
			}
			else
			{				B.data.push_back(0)
			}
		}
	}
	Matrix C;
	C.size.push_back(49);
	C.size.push_back(1);
	double C_start = 1.0;
	double C_step = 2.0;
	double C_end = 100.0;
	int C_size = (int) ((C_end - C_start) / C_step);
	for (int j = 0; j < C_size ;j++)
	{
		C.data.push_back(start + j * step)
	}
	Matrix D;
	D.size.push_back(1);
	D.size.push_back(2);
	D.size.push_back(3);
	for (int j = 0; j < 6 ;j++)
	{
		D.data.push_back(0)
	}
	Matrix E;
	E.size.push_back(3);
	E.size.push_back(2);
	E.size.push_back(1);
	for (int j = 0; j < 6 ;j++)
	{
		E.data.push_back(1)
	}
	return 0;
}