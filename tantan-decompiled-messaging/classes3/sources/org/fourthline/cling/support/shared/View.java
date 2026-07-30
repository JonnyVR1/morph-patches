package org.fourthline.cling.support.shared;

import java.awt.Component;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface View<P> {
    Component asUIComponent();

    void setPresenter(P p);
}
