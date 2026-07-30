package org.fourthline.cling.binding.xml;

import org.fourthline.cling.model.Namespace;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes3.dex */
public interface DeviceDescriptorBinder {
    Document buildDOM(Device device, RemoteClientInfo remoteClientInfo, Namespace namespace) throws DescriptorBindingException;

    <T extends Device> T describe(T t, String str) throws ValidationException, DescriptorBindingException;

    <T extends Device> T describe(T t, Document document) throws ValidationException, DescriptorBindingException;

    String generate(Device device, RemoteClientInfo remoteClientInfo, Namespace namespace) throws DescriptorBindingException;
}
