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
	A.rowSize = 1;
	A.columnSize = 5;
	A.data.push_back(1.0);
	A.data.push_back(2.0);
	A.data.push_back(3.0);
	A.data.push_back(4.0);
	A.data.push_back(5.0);

	// Transpose of matrix C
	Matrix C;
	C.rowSize = 5;
	C.columnSize = 1;
	for (int j1 = 0; j1 < C.rowSize; j1++)
	{
		for (int j2 = 0; j2 < C.columnSize; j2++)
		{
			C.data.push_back(A.data[j1 + j2 * C.rowSize]);
		}
	}

	// Initialization of matrix B by eye
	Matrix B;
	B.rowSize = 5;
	B.columnSize = 5;
	for (int j1 = 0; j1 < B.rowSize; j1++)
	{
		for (int j2 = 0; j2 < B.columnSize; j2++)
		{
			if(j1 == j2)
			{
				B.data.push_back(1);
			}
			else
			{
				B.data.push_back(0);
			}
		}
	}

	// Multiplying matrix by matrix
	Matrix tmp1;
	tmp1.rowSize = 5;
	tmp1.columnSize = 5;
	for (int j1 = 0; j1 < tmp1.rowSize; j1++)
	{
		for (int j2 = 0; j2 < tmp1.columnSize; j2++)
		{
			tmp1.data.push_back(B.data[j2 + j1 * tmp1.rowSize] * C.data[j2]);
		}
	}

	// Matrix plus matrix
	Matrix D;
	D.rowSize = 5;
	D.columnSize = 5;
	for (int j1 = 0; j1 < D.rowSize; j1++)
	{
		for (int j2 = 0; j2 < D.columnSize; j2++)
		{
			D.data.push_back(tmp1.data[j2 + j1 * D.rowSize] + A.data[j2]);
		}
	}

	return 0;
}