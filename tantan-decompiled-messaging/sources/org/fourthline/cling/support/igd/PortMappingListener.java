package org.fourthline.cling.support.igd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.DeviceType;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDADeviceType;
import org.fourthline.cling.model.types.UDAServiceType;
import org.fourthline.cling.registry.DefaultRegistryListener;
import org.fourthline.cling.registry.Registry;
import org.fourthline.cling.support.igd.callback.PortMappingAdd;
import org.fourthline.cling.support.igd.callback.PortMappingDelete;
import org.fourthline.cling.support.model.PortMapping;

/* JADX INFO: loaded from: classes3.dex */
public class PortMappingListener extends DefaultRegistryListener {
    protected Map<Service, List<PortMapping>> activePortMappings;
    protected PortMapping[] portMappings;
    private static final Logger log = Logger.getLogger(PortMappingListener.class.getName());
    public static final DeviceType IGD_DEVICE_TYPE = new UDADeviceType("InternetGatewayDevice", 1);
    public static final DeviceType CONNECTION_DEVICE_TYPE = new UDADeviceType("WANConnectionDevice", 1);
    public static final ServiceType IP_SERVICE_TYPE = new UDAServiceType("WANIPConnection", 1);
    public static final ServiceType PPP_SERVICE_TYPE = new UDAServiceType("WANPPPConnection", 1);

    public PortMappingListener(PortMapping[] portMappingArr) {
        this.activePortMappings = new HashMap();
        this.portMappings = portMappingArr;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:? -> B:13:0x005f). Please report as a decompilation issue!!! */
    @Override // org.fourthline.cling.registry.DefaultRegistryListener, org.fourthline.cling.registry.RegistryListener
    public synchronized void beforeShutdown(Registry registry) throws Throwable {
        PortMappingListener portMappingListener;
        try {
            for (Map.Entry<Service, List<PortMapping>> entry : this.activePortMappings.entrySet()) {
                final Iterator<PortMapping> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    final PortMapping next = it.next();
                    log.fine("Trying to delete port mapping on IGD: " + next);
                    portMappingListener = this;
                    try {
                        new PortMappingDelete(entry.getKey(), registry.getUpnpService().getControlPoint(), next) { // from class: org.fourthline.cling.support.igd.PortMappingListener.2
                            @Override // org.fourthline.cling.controlpoint.ActionCallback
                            public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str) {
                                PortMappingListener.this.handleFailureMessage("Failed to delete port mapping: " + next);
                                PortMappingListener.this.handleFailureMessage("Reason: " + str);
                            }

                            @Override // org.fourthline.cling.controlpoint.ActionCallback
                            public void success(ActionInvocation actionInvocation) {
                                PortMappingListener.log.fine("Port mapping deleted: " + next);
                                it.remove();
                            }
                        }.run();
                        this = portMappingListener;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            portMappingListener = this;
            Throwable th4 = th;
            throw th4;
        }
    }

    @Override // org.fourthline.cling.registry.DefaultRegistryListener
    public synchronized void deviceAdded(Registry registry, Device device) throws Throwable {
        try {
            try {
                Service serviceDiscoverConnectionService = discoverConnectionService(device);
                if (serviceDiscoverConnectionService != null) {
                    log.fine("Activating port mappings on: " + serviceDiscoverConnectionService);
                    final ArrayList arrayList = new ArrayList();
                    PortMapping[] portMappingArr = this.portMappings;
                    int length = portMappingArr.length;
                    int i = 0;
                    while (i < length) {
                        final PortMapping portMapping = portMappingArr[i];
                        PortMappingListener portMappingListener = this;
                        new PortMappingAdd(serviceDiscoverConnectionService, registry.getUpnpService().getControlPoint(), portMapping) { // from class: org.fourthline.cling.support.igd.PortMappingListener.1
                            @Override // org.fourthline.cling.controlpoint.ActionCallback
                            public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str) {
                                PortMappingListener.this.handleFailureMessage("Failed to add port mapping: " + portMapping);
                                PortMappingListener.this.handleFailureMessage("Reason: " + str);
                            }

                            @Override // org.fourthline.cling.controlpoint.ActionCallback
                            public void success(ActionInvocation actionInvocation) {
                                PortMappingListener.log.fine("Port mapping added: " + portMapping);
                                arrayList.add(portMapping);
                            }
                        }.run();
                        i++;
                        this = portMappingListener;
                    }
                    PortMappingListener portMappingListener2 = this;
                    portMappingListener2.activePortMappings.put(serviceDiscoverConnectionService, arrayList);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            PortMappingListener portMappingListener3 = this;
            Throwable th4 = th;
            throw th4;
        }
    }

    @Override // org.fourthline.cling.registry.DefaultRegistryListener
    public synchronized void deviceRemoved(Registry registry, Device device) {
        try {
            for (Service service : device.findServices()) {
                Iterator<Map.Entry<Service, List<PortMapping>>> it = this.activePortMappings.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Service, List<PortMapping>> next = it.next();
                    if (next.getKey().equals(service)) {
                        if (next.getValue().size() > 0) {
                            handleFailureMessage("Device disappeared, couldn't delete port mappings: " + next.getValue().size());
                        }
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Service discoverConnectionService(Device device) {
        if (!device.getType().equals(IGD_DEVICE_TYPE)) {
            return null;
        }
        DeviceType deviceType = CONNECTION_DEVICE_TYPE;
        Device[] deviceArrFindDevices = device.findDevices(deviceType);
        if (deviceArrFindDevices.length == 0) {
            log.fine("IGD doesn't support '" + deviceType + "': " + device);
            return null;
        }
        Device device2 = deviceArrFindDevices[0];
        Logger logger = log;
        logger.fine("Using first discovered WAN connection device: " + device2);
        Service serviceFindService = device2.findService(IP_SERVICE_TYPE);
        Service serviceFindService2 = device2.findService(PPP_SERVICE_TYPE);
        if (serviceFindService == null && serviceFindService2 == null) {
            logger.fine("IGD doesn't support IP or PPP WAN connection service: " + device);
        }
        return serviceFindService != null ? serviceFindService : serviceFindService2;
    }

    public void handleFailureMessage(String str) {
        log.warning(str);
    }

    public PortMappingListener(PortMapping portMapping) {
        this(new PortMapping[]{portMapping});
    }
}
