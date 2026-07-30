package com.google.mlkit.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import java.util.List;
import p149l.awe0;
import p149l.c500;
import p149l.d500;
import p149l.g600;
import p149l.m75;
import p149l.s95;
import p149l.tqc0;
import p149l.w5f;
import p149l.whw0;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class CommonComponentRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzaf.zzi(awe0.f72037b, Component.builder(g600.class).add(Dependency.required((Class<?>) c500.class)).factory(new ComponentFactory() { // from class: l.w0r0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new g600((c500) componentContainer.get(c500.class));
            }
        }).build(), Component.builder(d500.class).factory(new ComponentFactory() { // from class: l.l0s0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new d500();
            }
        }).build(), Component.builder(tqc0.class).add(Dependency.setOf((Class<?>) tqc0.C20246a.class)).factory(new ComponentFactory() { // from class: l.bxs0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new tqc0(componentContainer.setOf(tqc0.C20246a.class));
            }
        }).build(), Component.builder(w5f.class).add(Dependency.requiredProvider((Class<?>) d500.class)).factory(new ComponentFactory() { // from class: l.mvt0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new w5f(componentContainer.getProvider(d500.class));
            }
        }).build(), Component.builder(m75.class).factory(new ComponentFactory() { // from class: l.ssu0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return m75.m153347a();
            }
        }).build(), Component.builder(s95.class).add(Dependency.required((Class<?>) m75.class)).factory(new ComponentFactory() { // from class: l.dpv0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new s95((m75) componentContainer.get(m75.class));
            }
        }).build(), Component.builder(whw0.class).add(Dependency.required((Class<?>) c500.class)).factory(new ComponentFactory() { // from class: l.vhw0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new whw0((c500) componentContainer.get(c500.class));
            }
        }).build(), Component.intoSetBuilder(tqc0.C20246a.class).add(Dependency.requiredProvider((Class<?>) whw0.class)).factory(new ComponentFactory() { // from class: l.h9x0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new tqc0.C20246a(yxb.class, componentContainer.getProvider(whw0.class));
            }
        }).build());
    }
}
