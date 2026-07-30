package org.fourthline.cling.support.connectionmanager;

import java.beans.PropertyChangeSupport;
import java.util.logging.Logger;
import org.fourthline.cling.binding.annotations.UpnpAction;
import org.fourthline.cling.binding.annotations.UpnpInputArgument;
import org.fourthline.cling.binding.annotations.UpnpOutputArgument;
import org.fourthline.cling.controlpoint.ControlPoint;
import org.fourthline.cling.model.ServiceReference;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.model.types.csv.CSV;
import org.fourthline.cling.support.connectionmanager.callback.ConnectionComplete;
import org.fourthline.cling.support.connectionmanager.callback.PrepareForConnection;
import org.fourthline.cling.support.model.ConnectionInfo;
import org.fourthline.cling.support.model.ProtocolInfo;
import org.fourthline.cling.support.model.ProtocolInfos;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractPeeringConnectionManagerService extends ConnectionManagerService {
    private static final Logger log = Logger.getLogger(AbstractPeeringConnectionManagerService.class.getName());

    public AbstractPeeringConnectionManagerService(ConnectionInfo... connectionInfoArr) {
        super(connectionInfoArr);
    }

    public abstract void closeConnection(ConnectionInfo connectionInfo);

    public synchronized void closeConnectionWithPeer(ControlPoint controlPoint, Service service, final ConnectionInfo connectionInfo) throws Throwable {
        try {
            try {
                log.fine("Closing connection ID " + connectionInfo.getConnectionID() + " with peer: " + service);
                new ConnectionComplete(service, controlPoint, connectionInfo.getPeerConnectionID()) { // from class: org.fourthline.cling.support.connectionmanager.AbstractPeeringConnectionManagerService.2
                    @Override // org.fourthline.cling.controlpoint.ActionCallback
                    public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str) {
                        AbstractPeeringConnectionManagerService.this.peerFailure(actionInvocation, upnpResponse, str);
                    }

                    @Override // org.fourthline.cling.controlpoint.ActionCallback
                    public void success(ActionInvocation actionInvocation) {
                        AbstractPeeringConnectionManagerService.this.removeConnection(connectionInfo.getConnectionID());
                    }
                }.run();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @UpnpAction
    public synchronized void connectionComplete(@UpnpInputArgument(name = "ConnectionID", stateVariable = "A_ARG_TYPE_ConnectionID") int i) throws ActionException {
        ConnectionInfo currentConnectionInfo = getCurrentConnectionInfo(i);
        log.fine("Closing connection ID " + i);
        closeConnection(currentConnectionInfo);
        removeConnection(i);
    }

    public abstract ConnectionInfo createConnection(int i, int i2, ServiceReference serviceReference, ConnectionInfo.Direction direction, ProtocolInfo protocolInfo) throws ActionException;

    public synchronized int createConnectionWithPeer(ServiceReference serviceReference, ControlPoint controlPoint, final Service service, final ProtocolInfo protocolInfo, final ConnectionInfo.Direction direction) {
        final int newConnectionId;
        newConnectionId = getNewConnectionId();
        log.fine("Creating new connection ID " + newConnectionId + " with peer: " + service);
        final boolean[] zArr = new boolean[1];
        new PrepareForConnection(service, controlPoint, protocolInfo, serviceReference, newConnectionId, direction) { // from class: org.fourthline.cling.support.connectionmanager.AbstractPeeringConnectionManagerService.1
            @Override // org.fourthline.cling.controlpoint.ActionCallback
            public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str) {
                AbstractPeeringConnectionManagerService.this.peerFailure(actionInvocation, upnpResponse, str);
                zArr[0] = true;
            }

            @Override // org.fourthline.cling.support.connectionmanager.callback.PrepareForConnection
            public void received(ActionInvocation actionInvocation, int i, int i2, int i3) {
                AbstractPeeringConnectionManagerService.this.storeConnection(new ConnectionInfo(newConnectionId, i2, i3, protocolInfo, service.getReference(), i, direction.getOpposite(), ConnectionInfo.Status.OK));
            }
        }.run();
        if (zArr[0]) {
            newConnectionId = -1;
        }
        return newConnectionId;
    }

    public synchronized int getNewConnectionId() {
        int iIntValue;
        iIntValue = -1;
        for (Integer num : this.activeConnections.keySet()) {
            if (num.intValue() > iIntValue) {
                iIntValue = num.intValue();
            }
        }
        return iIntValue + 1;
    }

    public abstract void peerFailure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str);

    @UpnpAction(out = {@UpnpOutputArgument(getterName = "getConnectionID", name = "ConnectionID", stateVariable = "A_ARG_TYPE_ConnectionID"), @UpnpOutputArgument(getterName = "getAvTransportID", name = "AVTransportID", stateVariable = "A_ARG_TYPE_AVTransportID"), @UpnpOutputArgument(getterName = "getRcsID", name = "RcsID", stateVariable = "A_ARG_TYPE_RcsID")})
    public synchronized ConnectionInfo prepareForConnection(@UpnpInputArgument(name = "RemoteProtocolInfo", stateVariable = "A_ARG_TYPE_ProtocolInfo") ProtocolInfo protocolInfo, @UpnpInputArgument(name = "PeerConnectionManager", stateVariable = "A_ARG_TYPE_ConnectionManager") ServiceReference serviceReference, @UpnpInputArgument(name = "PeerConnectionID", stateVariable = "A_ARG_TYPE_ConnectionID") int i, @UpnpInputArgument(name = "Direction", stateVariable = "A_ARG_TYPE_Direction") String str) throws Throwable {
        try {
            try {
                int newConnectionId = getNewConnectionId();
                try {
                    ConnectionInfo.Direction directionValueOf = ConnectionInfo.Direction.valueOf(str);
                    log.fine("Preparing for connection with local new ID " + newConnectionId + " and peer connection ID: " + i);
                    ConnectionInfo connectionInfoCreateConnection = createConnection(newConnectionId, i, serviceReference, directionValueOf, protocolInfo);
                    storeConnection(connectionInfoCreateConnection);
                    return connectionInfoCreateConnection;
                } catch (Exception unused) {
                    throw new ConnectionManagerException(ErrorCode.ARGUMENT_VALUE_INVALID, "Unsupported direction: " + str);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized void removeConnection(int i) {
        CSV<UnsignedIntegerFourBytes> currentConnectionIDs = getCurrentConnectionIDs();
        this.activeConnections.remove(Integer.valueOf(i));
        log.fine("Connection removed, firing event: " + i);
        getPropertyChangeSupport().firePropertyChange("CurrentConnectionIDs", currentConnectionIDs, getCurrentConnectionIDs());
    }

    public synchronized void storeConnection(ConnectionInfo connectionInfo) {
        CSV<UnsignedIntegerFourBytes> currentConnectionIDs = getCurrentConnectionIDs();
        this.activeConnections.put(Integer.valueOf(connectionInfo.getConnectionID()), connectionInfo);
        log.fine("Connection stored, firing event: " + connectionInfo.getConnectionID());
        getPropertyChangeSupport().firePropertyChange("CurrentConnectionIDs", currentConnectionIDs, getCurrentConnectionIDs());
    }

    public AbstractPeeringConnectionManagerService(ProtocolInfos protocolInfos, ProtocolInfos protocolInfos2, ConnectionInfo... connectionInfoArr) {
        super(protocolInfos, protocolInfos2, connectionInfoArr);
    }

    public AbstractPeeringConnectionManagerService(PropertyChangeSupport propertyChangeSupport, ProtocolInfos protocolInfos, ProtocolInfos protocolInfos2, ConnectionInfo... connectionInfoArr) {
        super(propertyChangeSupport, protocolInfos, protocolInfos2, connectionInfoArr);
    }

    public synchronized void closeConnectionWithPeer(ControlPoint controlPoint, Service service, int i) throws ActionException {
        closeConnectionWithPeer(controlPoint, service, getCurrentConnectionInfo(i));
    }
}
