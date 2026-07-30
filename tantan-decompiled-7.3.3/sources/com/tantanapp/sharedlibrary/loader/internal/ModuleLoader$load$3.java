package com.tantanapp.sharedlibrary.loader.internal;

import com.tantanapp.sharedlibrary.loader.C13846a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p153l.q5d0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
public /* synthetic */ class ModuleLoader$load$3 extends FunctionReferenceImpl implements Function3<C13846a, ModuleZipInfo, Map<String, Object>, q5d0<Unit>> {
    public ModuleLoader$load$3(Object obj) {
        super(3, obj, ModuleLoader.class, "unzip", "unzip(Lcom/tantanapp/sharedlibrary/loader/Config;Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;Ljava/util/Map;)Lcom/tantanapp/sharedlibrary/loader/Result;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    @NotNull
    public final q5d0<Unit> invoke(@NotNull C13846a c13846a, @NotNull ModuleZipInfo moduleZipInfo, @NotNull Map<String, Object> map) {
        c13846a.getClass();
        moduleZipInfo.getClass();
        map.getClass();
        return ((ModuleLoader) this.receiver).m82695n(c13846a, moduleZipInfo, map);
    }
}
