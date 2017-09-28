package logic;

import common.CellState;
import common.ShipType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 26-Sep-17.
 */
public class Ship
{
	private ShipType type;
	private boolean isHorizontal;
	private Size dimension;
	private List<CellState> cells;

	public Ship(ShipType type)
	{
		this(type, getRandomBoolean());
	}

	public Ship(ShipType type, boolean isHorizontal)
	{
		this.type = type;
		this.isHorizontal = isHorizontal;
		switch (type)
		{
			case DD:
			{
				dimension = new Size(2,1);
				break;
			}
			case CA:
			{
				dimension = new Size(3,1);
				break;
			}
			case SS:
			{
				dimension = new Size(3,1);
				break;
			}
			case BB:
			{
				dimension = new Size(4,1);
				break;
			}
			case CV:
			{
				dimension = new Size(5,1);
				break;
			}
		}

		if (!isHorizontal)
		{
			dimension = new Size(dimension.height, dimension.width);
		}

		cells = new ArrayList<>();
		for (int i = 0; i<dimension.width*dimension.height; i++)
		{
			cells.add(CellState.OCCUPIED);
		}
	}

	private static boolean getRandomBoolean()
	{
		Random random = new Random();
		return random.nextBoolean();
	}
}
