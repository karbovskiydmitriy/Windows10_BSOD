#include <Windows.h>

void main()
{
	HANDLE file = CreateFile("\\\\.\\globalroot\\device\\condrv\\kernelconnect", GENERIC_READ, 0, 0, OPEN_EXISTING, FILE_ATTRIBUTE_NORMAL, 0);
}