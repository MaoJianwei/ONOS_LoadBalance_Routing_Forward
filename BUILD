COMPILE_DEPS = CORE_DEPS + JACKSON + REST + [
    "//core/common:onos-core-common",
]

osgi_jar_with_tests (
    deps = COMPILE_DEPS,

    api_package = "com.maojianwei.lb.routing",
    api_description = "BigMao Radio Station REST API v1.0, for Load-Balance Routing",
    api_title = "BigMao Radio Station REST API v1.0",
    api_version = "/onos/v1/Mao",
    web_context = "/onos/Mao",
)

REQUIRE_APPS = [
    "org.onosproject.proxyarp",
]

onos_app (
    title = "Mao Load-Balance Reactive Forward",
    category = "Traffic Steering",
    url = "https://www.maojianwei.com",
    description = "Mao Load-Balance Reactive Forward",
    required_apps = REQUIRE_APPS,
)
