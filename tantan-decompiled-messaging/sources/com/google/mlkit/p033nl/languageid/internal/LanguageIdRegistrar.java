package com.google.mlkit.p033nl.languageid.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_language_id_common.zzu;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.mlkit.p033nl.languageid.internal.LanguageIdentifierImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p149l.w5f;
import p149l.xhw0;
import p149l.z6r;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class LanguageIdRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzu.zzi(Component.builder(xhw0.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.setOf((Class<?>) z6r.class)).factory(new ComponentFactory() { // from class: l.a1r0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                ArrayList arrayList = new ArrayList(componentContainer.setOf(z6r.class));
                Preconditions.checkState(!arrayList.isEmpty(), "No delegate creator registered.");
                Collections.sort(arrayList, new Comparator() { // from class: l.dxs0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((z6r) obj2).getPriority() - ((z6r) obj).getPriority();
                    }
                });
                return new xhw0((Context) componentContainer.get(Context.class), (z6r) arrayList.get(0));
            }
        }).build(), Component.builder(LanguageIdentifierImpl.C3364a.class).add(Dependency.required((Class<?>) xhw0.class)).add(Dependency.required((Class<?>) w5f.class)).factory(new ComponentFactory() { // from class: l.n0s0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new LanguageIdentifierImpl.C3364a((xhw0) componentContainer.get(xhw0.class), (w5f) componentContainer.get(w5f.class));
            }
        }).build());
    }
}
