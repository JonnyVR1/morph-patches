package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, m88121d2 = {"Ll/iiv;", "", "<init>", "()V", "Ll/twl;", "bridge", "", "c", "(Ll/twl;)V", "a", "b", "()Ll/twl;", "Ll/twl;", "livingJsBridge", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iiv {

    @NotNull
    public static final iiv INSTANCE = new iiv();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static twl livingJsBridge;

    /* JADX INFO: renamed from: l.iiv$a */
    @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"l/iiv$a", "Ll/twl;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17724a implements twl {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m140144a(@NotNull twl bridge) {
        bridge.getClass();
        if (Intrinsics.m88377d(bridge, livingJsBridge)) {
            livingJsBridge = null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final twl m140145b() {
        twl twlVar = livingJsBridge;
        return twlVar != null ? twlVar : new C17724a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m140146c(@NotNull twl bridge) {
        bridge.getClass();
        livingJsBridge = bridge;
    }
}
