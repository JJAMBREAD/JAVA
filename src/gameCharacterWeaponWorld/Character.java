package gameCharacterWeaponWorld;

public abstract class Character {
	//�ٸ� ĳ���Ͱ� �����ϴ� �߻�Ŭ���� ����. 
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void setWeapon (WeaponBehavior w) {
		
	}
	
}
