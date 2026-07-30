package com.tantanapp.sharedlibrary.loader.internal;

import com.tantanapp.sharedlibrary.loader.C13683a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p149l.nxc0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
public /* synthetic */ class ModuleLoader$load$4 extends FunctionReferenceImpl implements Function3<C13683a, ModuleZipInfo, Map<String, Object>, nxc0<Unit>> {
    public ModuleLoader$load$4(Object obj) {
        super(3, obj, ModuleLoader.class, "copySo", "copySo(Lcom/tantanapp/sharedlibrary/loader/Config;Lcom/tantanapp/sharedlibrary/loader/internal/ModuleZipInfo;Ljava/util/Map;)Lcom/tantanapp/sharedlibrary/loader/Result;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    @NotNull
    public final nxc0<Unit> invoke(@NotNull C13683a c13683a, @NotNull ModuleZipInfo moduleZipInfo, @NotNull Map<String, Object> map) {
        c13683a.getClass();
        moduleZipInfo.getClass();
        map.getClass();
        return ((ModuleLoader) this.receiver).m81506g(c13683a, moduleZipInfo, map);
    }
}
