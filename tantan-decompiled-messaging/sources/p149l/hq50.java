package p149l;

import com.clevertap.android.sdk.inapp.C1213a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/hq50;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/a;", "systemActionHandler", "Ll/oyb;", "c", "(Lcom/clevertap/android/sdk/inapp/a;)Ll/oyb;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class hq50 {

    @NotNull
    public static final hq50 INSTANCE = new hq50();

    private hq50() {
    }

    /* JADX INFO: renamed from: a */
    public static void m132429a(C1213a c1213a, pyb.C19373c c19373c) {
        c1213a.getClass();
        c19373c.getClass();
        String strM172104d = c19373c.m172104d("Android");
        if (lw3.m151946p(strM172104d) && C1213a.m6277j(c1213a, strM172104d, null, 2, null)) {
            c19373c.m172107h();
        }
        c19373c.m172106g();
    }

    /* JADX INFO: renamed from: b */
    public static Unit m132430b(final C1213a c1213a, oyb.C19079b c19079b) {
        c1213a.getClass();
        c19079b.getClass();
        c19079b.m166645h(true);
        c19079b.m166643f("ctsystem_openurl");
        c19079b.m166646i("Android", "");
        c19079b.m166644g(new jaj() { // from class: l.gq50
            @Override // p149l.qyb
            /* JADX INFO: renamed from: b */
            public final void mo127536b(pyb pybVar) {
                hq50.m132429a(c1213a, (pyb.C19373c) pybVar);
            }
        });
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final oyb m132431c(@NotNull final C1213a systemActionHandler) {
        systemActionHandler.getClass();
        return ryb.m181660a(true, new Function1() { // from class: l.fq50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return hq50.m132430b(systemActionHandler, (oyb.C19079b) obj);
            }
        });
    }
}
