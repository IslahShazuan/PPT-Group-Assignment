public class Combat
{
	//Variables
	private int pact, eact;

	//Method for player action
	public int combatPhasePlayer(int patt, int pcho, int ehp, int edef, int echo)
	{
		if(pcho == 1)
		{
			if(echo == 1)
			{
				pact = patt - edef;

				if(pact < 0)
				{
					pact = 0;
				}

				ehp = ehp - pact;
			}
			else if(echo == 2)
			{
				pact = patt - (edef  * 2);

				if(pact < 0)
				{
					pact = 0;
				}

				ehp = ehp - pact;
			}
		}
		else if(pcho == 2)
		{
			if(echo == 1)
			{
				pact = patt - edef;

				if(pact < 0)
				{
					pact = 0;
				}

				ehp = ehp - pact;
			}
			else if(echo == 2)
			{
				pact = patt - (edef * 2);

				if(pact < 0)
				{
					pact = 0;
				}

				ehp = ehp - pact;
			}
		}
		else if(pcho == 4)
		{
			if(echo == 1)
			{
				pact = (patt * 2) - edef;

				if(pact < 0)
				{
					pact = 0;
				}

				ehp = ehp - pact;
			}
			else if(echo == 2)
			{
				pact = (patt * 2) - (edef * 2);

				if(pact < 0)
				{
					pact = 0;
				}

				ehp = ehp - pact;
			}
		}

		return ehp;
	}

		//Method for AI enemy action
	public int combatPhaseEnemy(int php, int pdef, int pcho, int eatt, int echo)
	{
		if(pcho == 1)
		{
			if(echo == 1)
			{
				eact = eatt - pdef;

				if(eact < 0)
				{
					eact = 0;
				}

				php = php - eact;
			}
			else if(echo == 2)
			{
				eact = eatt - pdef;

				if(eact < 0)
				{
					eact = 0;
				}

				php = php - eact;
			}
		}
		else if(pcho == 2)
		{
			if(echo == 1)
			{
				eact = eatt - (pdef * 2 );

				if(eact < 0)
				{
					eact = 0;
				}

				php = php - eact;
			}
			else if(echo == 2)
			{
				eact = eatt - (pdef * 2);

				if(eact < 0)
				{
					eact = 0;
				}

				php = php - eact;
			}
		}
		else if(pcho == 3)
		{
			if(echo == 1)
			{
				eact = eatt - pdef;

				if(eact < 0)
				{
					eact = 0;
				}

				php = php - eact + 2;
			}
			else if(echo == 2)
			{
				php = php + 2;
			}
		}
		else if(pcho == 4)
		{
			if(echo == 1)
			{
				eact = eatt - pdef;

				if(eact < 0)
				{
					eact = 0;
				}

				php = php - eact;
			}
			else if(echo == 2)
			{
				eact = eatt - pdef;

				if(eact < 0)
				{
					eact = 0;
				}

				php = php - eact;
			}
		}

		return php;
	}
}