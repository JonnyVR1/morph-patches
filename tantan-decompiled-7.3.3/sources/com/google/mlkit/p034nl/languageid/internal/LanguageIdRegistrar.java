package com.google.mlkit.p034nl.languageid.internal;

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
import com.google.mlkit.p034nl.languageid.internal.LanguageIdentifierImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p153l.a9r;
import p153l.c7f;
import p153l.drw0;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class LanguageIdRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzu.zzi(Component.builder(drw0.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.setOf((Class<?>) a9r.class)).factory(new ComponentFactory() { // from class: l.gar0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                ArrayList arrayList = new ArrayList(componentContainer.setOf(a9r.class));
                Preconditions.checkState(!arrayList.isEmpty(), "No delegate creator registered.");
                Collections.sort(arrayList, new Comparator() { // from class: l.j6t0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((a9r) obj2).getPriority() - ((a9r) obj).getPriority();
                    }
                });
                return new drw0((Context) componentContainer.get(Context.class), (a9r) arrayList.get(0));
            }
        }).build(), Component.builder(LanguageIdentifierImpl.C3387a.class).add(Dependency.required((Class<?>) drw0.class)).add(Dependency.required((Class<?>) c7f.class)).factory(new ComponentFactory() { // from class: l.t9s0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new LanguageIdentifierImpl.C3387a((drw0) componentContainer.get(drw0.class), (c7f) componentContainer.get(c7f.class));
            }
        }).build());
    }
}
