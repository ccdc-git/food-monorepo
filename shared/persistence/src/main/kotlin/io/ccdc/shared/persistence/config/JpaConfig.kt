package io.ccdc.shared.persistence.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EntityScan("io.ccdc.shared.persistence")
@EnableJpaRepositories("io.ccdc.shared.persistence")
class JpaConfig
