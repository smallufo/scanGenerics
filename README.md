It shows spring seems cannot inject by interface defining nested generics , scanned by component-scan.

To make `inject by interface defining nested generics` working , the only way is to define a bean in @Configuration . See ContextConfig.kt for more info.

