#include <iostream>
#include <vector>
#include <string>

struct Matrix
{
	std::vector<double> data;
	int rowSize;
	int columnSize;
};

int main()
{
	// Initialization of matrix A by list of values
	Matrix A;
	A.rowSize = 3;
	A.columnSize = 3;
	A.data.push_back(-1.0);
	A.data.push_back(2.0);
	A.data.push_back(3.0);
	A.data.push_back(3.0);
	A.data.push_back(4.0);
	A.data.push_back(5.0);
	A.data.push_back(5.0);
	A.data.push_back(6.0);
	A.data.push_back(7.0);

	// Unary minus for matrix tmp0 
	Matrix tmp0;
	tmp0.rowSize = 3;
	tmp0.columnSize = 3;
	for (int j1 = 0; j1 < 3; j1++)
	{
		for (int j2 = 0; j2 < 3; j2++)
		{
			tmp0.data.push_back(A.data[j2 + j1 * tmp0.rowSize] * (-1));
		}
	}

	// Transpose of matrix B
	Matrix B;
	B.rowSize = 3;
	B.columnSize = 3;
	for (int j1 = 0; j1 < 3; j1++)
	{
		for (int j2 = 0; j2 < 3; j2++)
		{
			B.data.push_back(tmp0.data[j1 + j2 * B.rowSize]);
		}
	}

	// Initialization of variable C
	double C = 10.0;

	// Unary minus for variable C 
	C = -C;

	return 0;
}