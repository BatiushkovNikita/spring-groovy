sessionFactory(ConfigurableLocalSessionFactoryBean) { bean ->
    // Sets the initialization method to 'init'. [init-method]
    bean.initMethod = 'init'

    // Sets the destruction method to 'destroy'. [destroy-method]
    bean.destroyMethod = 'destroy'

    // Sets the scope of the bean. [scope]
    bean.scope = 'request'
    dataSource = ref('dataSource')

    hibernateProperties = ["hibernate.hbm2ddl.auto": "create-drop",
                           "hibernate.show_sql":     "true"]
}
