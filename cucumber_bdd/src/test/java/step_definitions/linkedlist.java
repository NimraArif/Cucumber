package step_definitions;

import java.util.ArrayList;

public class linkedlist {
	
	ArrayList<ResturantMenuItemCart> MenuItems = new ArrayList<ResturantMenuItemCart>();
	
	public boolean adddItem(ResturantMenuItemCart card) {
		return MenuItems.add(card);
	}
	

}
