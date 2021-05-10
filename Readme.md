# Example of using Vault with Spring

This is simple example of using `Vault.` <br><br>
`Vault` is used for storing secure data (e.g. credentials). Documentation about `Vault` [vaultproject.io/docs].<br>
In this example `spring-vault` client was used. Documentation about it [docs.spring.io/spring-vault/docs]<br>
<br>
Authentication to `Vault` is implemented threw `approle` method ([vaultproject.io/docs/auth/approle])<br>
Properties for authentication are stored in `resources:vault.properties` file. `VaultProperties.class` reads these properties and run standard `EnvironmentVaultConfiguration` build in `spring-vault-core` library.

[vaultproject.io/docs]: https://www.vaultproject.io/docs
[docs.spring.io/spring-vault/docs]: https://docs.spring.io/spring-vault/docs/current/reference/html/index.html#reference-documentation
[vaultproject.io/docs/auth/approle]: https://www.vaultproject.io/docs/auth/approle