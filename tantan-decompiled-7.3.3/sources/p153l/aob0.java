package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.C1236a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/aob0;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/a;", "systemActionHandler", "Ll/c0c;", "c", "(Lcom/clevertap/android/sdk/inapp/a;)Ll/c0c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class aob0 {

    @NotNull
    public static final aob0 INSTANCE = new aob0();

    private aob0() {
    }

    /* JADX INFO: renamed from: a */
    public static Unit m99056a(final C1236a c1236a, c0c.C16157b c16157b) {
        c1236a.getClass();
        c16157b.getClass();
        c16157b.m107405h(true);
        c16157b.m107403f("ctsystem_pushpermission");
        c16157b.m107400b(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS, false);
        c16157b.m107404g(new ddj() { // from class: l.znb0
            @Override // p153l.e0c
            /* JADX INFO: renamed from: b */
            public final void mo118834b(d0c d0cVar) {
                aob0.m99057b(c1236a, (d0c.C16404c) d0cVar);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m99057b(C1236a c1236a, d0c.C16404c c16404c) {
        c1236a.getClass();
        c16404c.getClass();
        if (c1236a.m6335e(Intrinsics.m88377d(c16404c.m113382b(Constants.KEY_FALLBACK_NOTIFICATION_SETTINGS), Boolean.TRUE))) {
            c16404c.m113386h();
        }
        c16404c.m113385g();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final c0c m99058c(@NotNull final C1236a systemActionHandler) {
        systemActionHandler.getClass();
        return f0c.m123478a(true, new Function1() { // from class: l.ynb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return aob0.m99056a(systemActionHandler, (c0c.C16157b) obj);
            }
        });
    }
}
