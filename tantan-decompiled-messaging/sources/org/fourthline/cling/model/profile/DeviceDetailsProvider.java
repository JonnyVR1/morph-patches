package org.fourthline.cling.model.profile;

import org.fourthline.cling.model.meta.DeviceDetails;

/* JADX INFO: loaded from: classes3.dex */
public interface DeviceDetailsProvider {
    DeviceDetails provide(RemoteClientInfo remoteClientInfo);
}
