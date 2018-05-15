COMPILE_DEPS = [
    '//lib:CORE_DEPS',
    '//lib:JACKSON',
    '//core/api:onos-api',
    '//incubator/api:onos-incubator-api',
    '//core/common:onos-core-common',
    '//utils/rest:onlab-rest',
    '//lib:javax.ws.rs-api',
]

osgi_jar_with_tests (
    deps = COMPILE_DEPS,
)


REQUIRE_APPS = [
    'org.onosproject.proxyarp',
]


onos_app (
    title = 'Mao Load-Balance Reactive Forward',
    category = 'Traffic Steering',
    url = 'http://www.maojianwei.com',
    description = 'Mao Load-Balance Reactive Forward',
    required_apps = REQUIRE_APPS,
)
