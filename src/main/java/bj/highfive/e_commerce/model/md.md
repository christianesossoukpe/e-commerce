   .   ____          _            __ _ _   
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \  
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \ 
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / / 
 =========|_|==============|___/=/_/_/_/  
##### tables de la base de données 


1-table users :infos sur le susers
-------------------------------------------------------------
|nom de la colonne | Type de donnée|Description    |
------------------------------------------------------------|
|id               |BIGINT          |CLE PRIMAIRE            |
|username         |varchar         |pseudo unique du client |           
|email            |varchar         |email du client         |    
|password         |varchar         |MDP du client           |           
|created_at       |Timestampvarchar|date de creation        |    
|updated_at       |Timestampvarchar|date de modification    | 
------------------------------------------------------------|  

2-table products: infos sur kes produits

-------------------------------------------------------------
|nom de la colonne | Type de donnée|Description    |
------------------------------------------------------------|
|id               |BIGINT          |CLE PRIMAIRE            |
|username         |varchar         |pseudo unique du client |           
|email            |varchar         |email du client         |    
|password         |varchar         |MDP du client           |           
|created_at       |Timestampvarchar|date de creation        |    
|updated_at       |Timestampvarchar|date de modification    | 
------------------------------------------------------------| 
3-tables orders: infos sur les commandes
-------------------------------------------------------------
|nom de la  colonne | Type de donnée|Description    |
------------------------------------------------------------|
|id               |BIGINT   |CLE PRIMAIRE                   |
|user_id          |BIGINT     |clé secondaire               |           
|total_amount     |DECIMAL       |montant total             |    
|status           |varchar        |Status(en cours...)      |           
|created_at       |Timestampvarchar|date de creation        |    
|updated_at       |Timestampvarchar|date de modification    | 
------------------------------------------------------------|       

####
4-table orders items: infos sur les produits inclus dans chaque commande.
-------------------------------------------------------------
|nom de la colonne | Type de donnée|Description    |
------------------------------------------------------------|
|id               |BIGINT          |CLE PRIMAIRE            |
|order_id         |BIGINT          |clé secondaire->'orders'|           
|product_id       |BIGINT          |clé secondaire->products|    
|quantity         |INT       |quantité de produits commandée|           
|price            |DECIMAL         |prix du produit         |           
|created_at       |Timestampvarchar|date de creation        |    
|updated_at       |Timestampvarchar|date de modification    | 
------------------------------------------------------------|       

###### relations
* 'user'->orders:un user peut faire plusieurs commandes
* 'orders'->order_items:une commande peut avoir plusoeurs items
* 'produits'->orders_items:un produit peut etre commander plusieurs fois dans la journée.



