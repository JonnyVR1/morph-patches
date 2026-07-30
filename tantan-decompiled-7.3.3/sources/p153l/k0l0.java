package p153l;

import com.p051p1.mobile.putong.data.BloodType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m88121d2 = {"Ll/k0l0;", "I", BloodType.f39576O, "", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface k0l0<I, O> {

    /* JADX INFO: renamed from: l.k0l0$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C18073a {
        /* JADX INFO: renamed from: a */
        public static <I, O> void m147796a(@NotNull k0l0<I, O> k0l0Var, @NotNull axl axlVar, @NotNull String str, @NotNull j0l0 j0l0Var) {
            axlVar.getClass();
            str.getClass();
            j0l0Var.getClass();
            if (j0l0Var instanceof j0l0.C17839a) {
                StringBuilder sb = new StringBuilder("Dropped. Reason: ");
                j0l0.C17839a c17839a = (j0l0.C17839a) j0l0Var;
                sb.append(c17839a.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
                axlVar.verbose(str, sb.toString());
                for (s0l0 s0l0Var : c17839a.mo142980a()) {
                    axlVar.verbose(str, s0l0Var.m183967a() + ": " + s0l0Var.m183968b());
                }
                return;
            }
            if (!(j0l0Var instanceof j0l0.C17841c)) {
                if (j0l0Var instanceof j0l0.C17840b) {
                    return;
                }
                nbr.m162172a();
                return;
            }
            for (s0l0 s0l0Var2 : ((j0l0.C17841c) j0l0Var).mo142980a()) {
                axlVar.verbose(str, s0l0Var2.m183967a() + ": " + s0l0Var2.m183968b());
            }
        }
    }
}
