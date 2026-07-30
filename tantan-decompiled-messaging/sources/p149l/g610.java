package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/g610;", "Ll/l5t;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/k610;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/k610;)V", "", "K", "()V", "p", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class g610 extends l5t {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g610(@NotNull Act act, @NotNull k610 k610Var) {
        super(act, k610Var);
        act.getClass();
        k610Var.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: I */
    public static void m124548I(g610 g610Var) {
        VImage vImage = g610Var.f126201n;
        xdl0.m208325C0(vImage, (int) (((double) vImage.getWidth()) * 0.46d));
    }

    /* JADX INFO: renamed from: J */
    public static Unit m124549J(g610 g610Var, View view) {
        view.getClass();
        g610Var.mo71838p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final void m124550K() {
        VText vText = this.f126202o;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.e610
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g610.m124549J(this.f89488a, (View) obj);
            }
        });
        this.f126201n.post(new Runnable() { // from class: l.f610
            @Override // java.lang.Runnable
            public final void run() {
                g610.m124548I(this.f95228a);
            }
        });
    }
}
