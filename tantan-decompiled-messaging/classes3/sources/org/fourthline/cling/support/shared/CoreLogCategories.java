package org.fourthline.cling.support.shared;

import java.util.ArrayList;
import java.util.logging.Level;
import org.fourthline.cling.binding.xml.DeviceDescriptorBinder;
import org.fourthline.cling.binding.xml.ServiceDescriptorBinder;
import org.fourthline.cling.model.DefaultServiceManager;
import org.fourthline.cling.model.message.UpnpHeaders;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.protocol.RetrieveRemoteDescriptors;
import org.fourthline.cling.protocol.sync.ReceivingAction;
import org.fourthline.cling.protocol.sync.ReceivingEvent;
import org.fourthline.cling.protocol.sync.ReceivingRetrieval;
import org.fourthline.cling.protocol.sync.ReceivingSubscribe;
import org.fourthline.cling.protocol.sync.ReceivingUnsubscribe;
import org.fourthline.cling.protocol.sync.SendingAction;
import org.fourthline.cling.protocol.sync.SendingEvent;
import org.fourthline.cling.protocol.sync.SendingRenewal;
import org.fourthline.cling.protocol.sync.SendingSubscribe;
import org.fourthline.cling.protocol.sync.SendingUnsubscribe;
import org.fourthline.cling.registry.Registry;
import org.fourthline.cling.transport.Router;
import org.fourthline.cling.transport.spi.DatagramIO;
import org.fourthline.cling.transport.spi.DatagramProcessor;
import org.fourthline.cling.transport.spi.GENAEventProcessor;
import org.fourthline.cling.transport.spi.MulticastReceiver;
import org.fourthline.cling.transport.spi.SOAPActionProcessor;
import org.fourthline.cling.transport.spi.StreamClient;
import org.fourthline.cling.transport.spi.StreamServer;
import org.fourthline.cling.transport.spi.UpnpStream;
import org.seamless.swing.logging.LogCategory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CoreLogCategories extends ArrayList<LogCategory> {
    public CoreLogCategories() {
        super(10);
        String name = DatagramIO.class.getName();
        Level level = Level.FINE;
        LogCategory.LoggerLevel[] loggerLevelArr = {new LogCategory.LoggerLevel(name, level), new LogCategory.LoggerLevel(MulticastReceiver.class.getName(), level)};
        String name2 = DatagramProcessor.class.getName();
        Level level2 = Level.FINER;
        add(new LogCategory("Network", new LogCategory.Group[]{new LogCategory.Group("UDP communication", loggerLevelArr), new LogCategory.Group("UDP datagram processing and content", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(name2, level2)}), new LogCategory.Group("TCP communication", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(UpnpStream.class.getName(), level2), new LogCategory.LoggerLevel(StreamServer.class.getName(), level), new LogCategory.LoggerLevel(StreamClient.class.getName(), level)}), new LogCategory.Group("SOAP action message processing and content", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(SOAPActionProcessor.class.getName(), level2)}), new LogCategory.Group("GENA event message processing and content", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(GENAEventProcessor.class.getName(), level2)}), new LogCategory.Group("HTTP header processing", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(UpnpHeaders.class.getName(), level2)})}));
        add(new LogCategory("UPnP Protocol", new LogCategory.Group[]{new LogCategory.Group("Discovery (Notification & Search)", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(ProtocolFactory.class.getName(), level2), new LogCategory.LoggerLevel("org.fourthline.cling.protocol.async", level2)}), new LogCategory.Group("Description", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(ProtocolFactory.class.getName(), level2), new LogCategory.LoggerLevel(RetrieveRemoteDescriptors.class.getName(), level), new LogCategory.LoggerLevel(ReceivingRetrieval.class.getName(), level), new LogCategory.LoggerLevel(DeviceDescriptorBinder.class.getName(), level), new LogCategory.LoggerLevel(ServiceDescriptorBinder.class.getName(), level)}), new LogCategory.Group("Control", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(ProtocolFactory.class.getName(), level2), new LogCategory.LoggerLevel(ReceivingAction.class.getName(), level2), new LogCategory.LoggerLevel(SendingAction.class.getName(), level2)}), new LogCategory.Group("GENA ", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel("org.fourthline.cling.model.gena", level2), new LogCategory.LoggerLevel(ProtocolFactory.class.getName(), level2), new LogCategory.LoggerLevel(ReceivingEvent.class.getName(), level2), new LogCategory.LoggerLevel(ReceivingSubscribe.class.getName(), level2), new LogCategory.LoggerLevel(ReceivingUnsubscribe.class.getName(), level2), new LogCategory.LoggerLevel(SendingEvent.class.getName(), level2), new LogCategory.LoggerLevel(SendingSubscribe.class.getName(), level2), new LogCategory.LoggerLevel(SendingUnsubscribe.class.getName(), level2), new LogCategory.LoggerLevel(SendingRenewal.class.getName(), level2)})}));
        add(new LogCategory("Core", new LogCategory.Group[]{new LogCategory.Group("Router", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(Router.class.getName(), level2)}), new LogCategory.Group("Registry", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel(Registry.class.getName(), level2)}), new LogCategory.Group("Local service binding & invocation", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel("org.fourthline.cling.binding.annotations", level2), new LogCategory.LoggerLevel(LocalService.class.getName(), level2), new LogCategory.LoggerLevel("org.fourthline.cling.model.action", level2), new LogCategory.LoggerLevel("org.fourthline.cling.model.state", level2), new LogCategory.LoggerLevel(DefaultServiceManager.class.getName(), level2)}), new LogCategory.Group("Control Point interaction", new LogCategory.LoggerLevel[]{new LogCategory.LoggerLevel("org.fourthline.cling.controlpoint", level2)})}));
    }
}
