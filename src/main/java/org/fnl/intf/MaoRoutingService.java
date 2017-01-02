package org.fnl.intf;

import org.onosproject.net.ElementId;
import org.onosproject.net.Path;
import org.onosproject.net.topology.Topology;

import java.util.Set;

/**
 * Created by mao on 9/10/16.
 */
public interface MaoRoutingService {

    Set<Path> getLoadBalancePaths(ElementId src, ElementId dst);
    Set<Path> getLoadBalancePaths(Topology topo, ElementId src, ElementId dst);
}
