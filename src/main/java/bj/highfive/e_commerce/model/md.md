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

1-'none'

hibernate ,l'orm utilisé par defaut dans spring Boot, peut automiquement 


none: Désactive la gestion automatisue du schema  par hibernate
Aucune ùodification du shema de BDD ne sera effectué au démarramge de l'application . 
 

 ###### 2 -validate
 Hibernate vérifie que ke schema de bdd correspond à la structure définie dans les entitésJPA . Aucune modification  du schéma ne sera effectuée, mais si le schema est incorrecte ou ne correspond pas, une exception  est levée.
 

 #### 3 -update
 Hibernate met à jour le schema de la bdd pour qu'il corresponde aux entités JPJA définies. Cela inclut l'ajout de nouvelles tables ,colonnes, ou contraintes existantes.

###### 4 -create 
 Hibernate supprime le schema existant et crée un nouveau schéma à partir des entités JPA définies. Cela implique de perdre toutes les données existantes puisque le schéma est  recréé à chaque démarrage de l 'application.

### 5- create-drop
 Similaire à ' create', mais avec la particularité que le schema est supprimé lorsque l'aplication est arreté.Cela signifie que la bdd est recréée à chaque démarrage et supprimée à chaque arre se l'application.

 ### Schema d'une BDD
 Le schema d'une bdd est une representation de la structure logique des données , incluant les tables , les colonnes ,les relations entre les tables , et les contraintes.Il definit comment les données sont organisées,interconnectées et gereer pour assurer leur cohérance et intégrité.




















