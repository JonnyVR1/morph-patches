package p153l;

import com.clevertap.android.sdk.inapp.C1236a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/zd80;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/a;", "systemActionHandler", "Ll/c0c;", "e", "(Lcom/clevertap/android/sdk/inapp/a;)Ll/c0c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class zd80 {

    @NotNull
    public static final zd80 INSTANCE = new zd80();

    private zd80() {
    }

    /* JADX INFO: renamed from: a */
    public static Unit m219277a(final C1236a c1236a, c0c.C16157b c16157b) {
        c1236a.getClass();
        c16157b.getClass();
        c16157b.m107405h(true);
        c16157b.m107403f("ctsystem_apprating");
        c16157b.m107404g(new ddj() { // from class: l.wd80
            @Override // p153l.e0c
            /* JADX INFO: renamed from: b */
            public final void mo118834b(d0c d0cVar) {
                zd80.m219278b(c1236a, (d0c.C16404c) d0cVar);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m219278b(C1236a c1236a, final d0c.C16404c c16404c) {
        c1236a.getClass();
        c16404c.getClass();
        c1236a.m6334d(new Function0() { // from class: l.xd80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zd80.m219279c(c16404c);
            }
        }, new Function1() { // from class: l.yd80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zd80.m219280d(c16404c, (Exception) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static Unit m219279c(d0c.C16404c c16404c) {
        c16404c.getClass();
        c16404c.m113386h();
        c16404c.m113385g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m219280d(d0c.C16404c c16404c, Exception exc) {
        c16404c.getClass();
        c16404c.m113385g();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final c0c m219281e(@NotNull final C1236a systemActionHandler) {
        systemActionHandler.getClass();
        if (systemActionHandler.m6333c()) {
            return f0c.m123478a(true, new Function1() { // from class: l.vd80
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return zd80.m219277a(systemActionHandler, (c0c.C16157b) obj);
                }
            });
        }
        return null;
    }
}
