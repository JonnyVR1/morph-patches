package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/qe10;", "Ll/m7t;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/ue10;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/ue10;)V", "", "K", "()V", "p", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qe10 extends m7t {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe10(@NotNull Act act, @NotNull ue10 ue10Var) {
        super(act, ue10Var);
        act.getClass();
        ue10Var.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: I */
    public static void m176215I(qe10 qe10Var) {
        VImage vImage = qe10Var.f135105n;
        bnl0.m105505C0(vImage, (int) (((double) vImage.getWidth()) * 0.46d));
    }

    /* JADX INFO: renamed from: J */
    public static Unit m176216J(qe10 qe10Var, View view) {
        view.getClass();
        qe10Var.mo73021p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final void m176217K() {
        VText vText = this.f135106o;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.oe10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qe10.m176216J(this.f146960a, (View) obj);
            }
        });
        this.f135105n.post(new Runnable() { // from class: l.pe10
            @Override // java.lang.Runnable
            public final void run() {
                qe10.m176215I(this.f151859a);
            }
        });
    }
}
