package p149l;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ll/p5j0;", "", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "block", "a", "(Ll/p5j0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class r5j0 {
    /* JADX INFO: renamed from: a */
    public static final <T> T m177945a(@NotNull p5j0 p5j0Var, @NotNull String str, @NotNull Function0<? extends T> function0) {
        p5j0Var.getClass();
        str.getClass();
        function0.getClass();
        boolean zIsEnabled = p5j0Var.isEnabled();
        if (zIsEnabled) {
            try {
                p5j0Var.mo167486a(str);
            } finally {
                InlineMarker.m87483b(1);
                if (zIsEnabled) {
                    p5j0Var.mo167487b();
                }
                InlineMarker.m87482a(1);
            }
        }
        return function0.invoke();
    }
}
