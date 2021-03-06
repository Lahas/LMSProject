package org.mifosplatform.logistics.item.service;

import java.util.List;

import org.mifosplatform.infrastructure.core.data.EnumOptionData;
import org.mifosplatform.infrastructure.core.service.Page;
import org.mifosplatform.logistics.item.data.ItemData;
import org.mifosplatform.logistics.supplier.service.SearchSqlQuery;
import org.mifosplatform.chargecode.data.ChargesData;

public interface ItemReadPlatformService {

	List<EnumOptionData> retrieveItemClassType();

	List<EnumOptionData> retrieveUnitTypes();

	List<ChargesData> retrieveChargeCode();

	List<ItemData> retrieveAllItems();

	ItemData retrieveSingleItemDetails(Long clientId, Long itemId, String region, boolean isWithClientId);

	Page<ItemData> retrieveAllItems(SearchSqlQuery searchItems);

	List<ItemData> retrieveAuditDetails(Long itemId);

	List<ItemData> retrieveItemPrice(Long itemId);


}
