package p149l;

import com.p046p1.mobile.putong.data.BloodType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/erk0;", "I", BloodType.f38728O, "", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface erk0<I, O> {

    /* JADX INFO: renamed from: l.erk0$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C16670a {
        /* JADX INFO: renamed from: a */
        public static <I, O> void m117847a(@NotNull erk0<I, O> erk0Var, @NotNull nul nulVar, @NotNull String str, @NotNull drk0 drk0Var) {
            nulVar.getClass();
            str.getClass();
            drk0Var.getClass();
            if (drk0Var instanceof drk0.C16456a) {
                StringBuilder sb = new StringBuilder("Dropped. Reason: ");
                drk0.C16456a c16456a = (drk0.C16456a) drk0Var;
                sb.append(c16456a.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
                nulVar.verbose(str, sb.toString());
                for (mrk0 mrk0Var : c16456a.mo113310a()) {
                    nulVar.verbose(str, mrk0Var.m156034a() + ": " + mrk0Var.m156035b());
                }
                return;
            }
            if (!(drk0Var instanceof drk0.C16458c)) {
                if (drk0Var instanceof drk0.C16457b) {
                    return;
                }
                l9r.m149037a();
                return;
            }
            for (mrk0 mrk0Var2 : ((drk0.C16458c) drk0Var).mo113310a()) {
                nulVar.verbose(str, mrk0Var2.m156034a() + ": " + mrk0Var2.m156035b());
            }
        }
    }
}
