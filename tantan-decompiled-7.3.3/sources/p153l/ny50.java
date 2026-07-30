package p153l;

import com.clevertap.android.sdk.inapp.C1236a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/ny50;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/a;", "systemActionHandler", "Ll/c0c;", "c", "(Lcom/clevertap/android/sdk/inapp/a;)Ll/c0c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ny50 {

    @NotNull
    public static final ny50 INSTANCE = new ny50();

    private ny50() {
    }

    /* JADX INFO: renamed from: a */
    public static void m165310a(C1236a c1236a, d0c.C16404c c16404c) {
        c1236a.getClass();
        c16404c.getClass();
        String strM113383d = c16404c.m113383d("Android");
        if (kx3.m151795p(strM113383d) && C1236a.m6331j(c1236a, strM113383d, null, 2, null)) {
            c16404c.m113386h();
        }
        c16404c.m113385g();
    }

    /* JADX INFO: renamed from: b */
    public static Unit m165311b(final C1236a c1236a, c0c.C16157b c16157b) {
        c1236a.getClass();
        c16157b.getClass();
        c16157b.m107405h(true);
        c16157b.m107403f("ctsystem_openurl");
        c16157b.m107406i("Android", "");
        c16157b.m107404g(new ddj() { // from class: l.my50
            @Override // p153l.e0c
            /* JADX INFO: renamed from: b */
            public final void mo118834b(d0c d0cVar) {
                ny50.m165310a(c1236a, (d0c.C16404c) d0cVar);
            }
        });
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final c0c m165312c(@NotNull final C1236a systemActionHandler) {
        systemActionHandler.getClass();
        return f0c.m123478a(true, new Function1() { // from class: l.ly50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ny50.m165311b(systemActionHandler, (c0c.C16157b) obj);
            }
        });
    }
}
