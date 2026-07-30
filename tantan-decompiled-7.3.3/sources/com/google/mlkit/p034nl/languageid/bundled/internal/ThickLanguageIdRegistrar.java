package com.google.mlkit.p034nl.languageid.bundled.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_language_id_bundled.zbi;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p153l.a9r;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class ThickLanguageIdRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zba = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zbi.zbg(Component.intoSetBuilder(a9r.class).factory(new ComponentFactory() { // from class: l.p8r0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return new r8r0();
            }
        }).build());
    }
}
