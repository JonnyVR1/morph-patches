package com.cosmos.photon.baseim.p024im;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface IMJConnectionAddressProvider {
    void connectFailed(Address address);

    void connectSuccess(Address address);

    Address getAddress();

    void saveDirectAddress(Address address);

    void saveDirectAddressList(List<Address> list);
}
