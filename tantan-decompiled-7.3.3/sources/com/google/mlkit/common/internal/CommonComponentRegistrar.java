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
import p153l.c7f;
import p153l.crw0;
import p153l.h4f0;
import p153l.n85;
import p153l.pe00;
import p153l.rd00;
import p153l.sd00;
import p153l.ta5;
import p153l.yyc0;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class CommonComponentRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzaf.zzi(h4f0.f107804b, Component.builder(pe00.class).add(Dependency.required((Class<?>) rd00.class)).factory(new ComponentFactory() { // from class: l.car0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new pe00((rd00) componentContainer.get(rd00.class));
            }
        }).build(), Component.builder(sd00.class).factory(new ComponentFactory() { // from class: l.r9s0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new sd00();
            }
        }).build(), Component.builder(yyc0.class).add(Dependency.setOf((Class<?>) yyc0.C21722a.class)).factory(new ComponentFactory() { // from class: l.h6t0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new yyc0(componentContainer.setOf(yyc0.C21722a.class));
            }
        }).build(), Component.builder(c7f.class).add(Dependency.requiredProvider((Class<?>) sd00.class)).factory(new ComponentFactory() { // from class: l.s4u0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new c7f(componentContainer.getProvider(sd00.class));
            }
        }).build(), Component.builder(n85.class).factory(new ComponentFactory() { // from class: l.y1v0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return n85.m161892a();
            }
        }).build(), Component.builder(ta5.class).add(Dependency.required((Class<?>) n85.class)).factory(new ComponentFactory() { // from class: l.jyv0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new ta5((n85) componentContainer.get(n85.class));
            }
        }).build(), Component.builder(crw0.class).add(Dependency.required((Class<?>) rd00.class)).factory(new ComponentFactory() { // from class: l.brw0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new crw0((rd00) componentContainer.get(rd00.class));
            }
        }).build(), Component.intoSetBuilder(yyc0.C21722a.class).add(Dependency.requiredProvider((Class<?>) crw0.class)).factory(new ComponentFactory() { // from class: l.nix0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new yyc0.C21722a(mzb.class, componentContainer.getProvider(crw0.class));
            }
        }).build());
    }
}
