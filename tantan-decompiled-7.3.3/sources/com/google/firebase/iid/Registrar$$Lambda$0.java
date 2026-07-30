package com.google.firebase.iid;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class Registrar$$Lambda$0 implements ComponentFactory {
    static final ComponentFactory $instance = new Registrar$$Lambda$0();

    private Registrar$$Lambda$0() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(ComponentContainer componentContainer) {
        return Registrar.lambda$getComponents$0$Registrar(componentContainer);
    }
}
