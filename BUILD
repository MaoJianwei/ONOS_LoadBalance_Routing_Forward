COMPILE_DEPS = CORE_DEPS + JACKSON + REST + [
    "//core/common:onos-core-common",
]

osgi_jar_with_tests (
    karaf_command_packages = ["com.maojianwei.lb.routing"],
    deps = COMPILE_DEPS,
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
