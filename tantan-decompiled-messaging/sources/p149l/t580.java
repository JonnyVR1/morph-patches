package p149l;

import com.clevertap.android.sdk.inapp.C1213a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/t580;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/inapp/a;", "systemActionHandler", "Ll/oyb;", "e", "(Lcom/clevertap/android/sdk/inapp/a;)Ll/oyb;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class t580 {

    @NotNull
    public static final t580 INSTANCE = new t580();

    private t580() {
    }

    /* JADX INFO: renamed from: a */
    public static Unit m187272a(final C1213a c1213a, oyb.C19079b c19079b) {
        c1213a.getClass();
        c19079b.getClass();
        c19079b.m166645h(true);
        c19079b.m166643f("ctsystem_apprating");
        c19079b.m166644g(new jaj() { // from class: l.q580
            @Override // p149l.qyb
            /* JADX INFO: renamed from: b */
            public final void mo127536b(pyb pybVar) {
                t580.m187273b(c1213a, (pyb.C19373c) pybVar);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m187273b(C1213a c1213a, final pyb.C19373c c19373c) {
        c1213a.getClass();
        c19373c.getClass();
        c1213a.m6280d(new Function0() { // from class: l.r580
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t580.m187274c(c19373c);
            }
        }, new Function1() { // from class: l.s580
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t580.m187275d(c19373c, (Exception) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static Unit m187274c(pyb.C19373c c19373c) {
        c19373c.getClass();
        c19373c.m172107h();
        c19373c.m172106g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m187275d(pyb.C19373c c19373c, Exception exc) {
        c19373c.getClass();
        c19373c.m172106g();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final oyb m187276e(@NotNull final C1213a systemActionHandler) {
        systemActionHandler.getClass();
        if (systemActionHandler.m6279c()) {
            return ryb.m181660a(true, new Function1() { // from class: l.p580
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t580.m187272a(systemActionHandler, (oyb.C19079b) obj);
                }
            });
        }
        return null;
    }
}
