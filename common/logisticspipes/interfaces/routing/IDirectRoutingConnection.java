package logisticspipes.interfaces.routing;

import java.util.UUID;

import logisticspipes.logisticspipes.IRoutedItem.TransportMode;
import logisticspipes.utils.ItemIdentifier;

public interface IDirectRoutingConnection {
	public int getConnectionResistance();
	public void addItem(ItemIdentifier item, int i, int j, TransportMode mode);
}
