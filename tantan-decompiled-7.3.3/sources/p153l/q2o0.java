package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0004J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0004J%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\b¨\u0006#"}, m88121d2 = {"Ll/q2o0;", "Ll/iam;", "Ll/gqo0;", "<init>", "()V", "presenter", "", "c", "(Ll/gqo0;)V", "e", Constants.INAPP_DATA_TAG, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Ll/g4s;", "a", "Ll/g4s;", "getDialog", "()Ll/g4s;", "setDialog", "(Ll/g4s;)V", OMSTemplateType.dialog, "b", "Ll/gqo0;", "getPresenter", "()Ll/gqo0;", "setPresenter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class q2o0 implements iam<gqo0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public g4s dialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public gqo0 presenter;

    /* JADX INFO: renamed from: a */
    public static void m175088a(q2o0 q2o0Var) {
        g4s g4sVar = q2o0Var.dialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        gqo0 gqo0Var = q2o0Var.presenter;
        if (gqo0Var != null) {
            gqo0Var.m131411k4();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m175089b(q2o0 q2o0Var) {
        g4s g4sVar = q2o0Var.dialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        gqo0 gqo0Var = q2o0Var.presenter;
        if (gqo0Var != null) {
            gqo0Var.m131413m4();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        gqo0 gqo0Var = this.presenter;
        gqo0Var.getClass();
        return gqo0Var.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable gqo0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: d */
    public final void m175091d() {
        g4s g4sVar;
        g4s g4sVar2 = this.dialog;
        if (g4sVar2 == null || g4sVar2 == null || !g4sVar2.isShowing() || (g4sVar = this.dialog) == null) {
            return;
        }
        g4sVar.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m175092e() {
        if (this.dialog == null) {
            gqo0 gqo0Var = this.presenter;
            gqo0Var.getClass();
            boolean zM131412l4 = gqo0Var.m131412l4();
            gqo0 gqo0Var2 = this.presenter;
            if (zM131412l4) {
                gqo0Var2.getClass();
                Act act = gqo0Var2.act();
                act.getClass();
                g0v g0vVar = new g0v(act);
                g4s g4sVar = new g4s(this.presenter, g0vVar.m133198b());
                this.dialog = g4sVar;
                gqo0 gqo0Var3 = this.presenter;
                gqo0Var3.getClass();
                g0vVar.m128471f(g4sVar, gqo0Var3);
            } else {
                gqo0Var2.getClass();
                Act act2 = gqo0Var2.act();
                act2.getClass();
                z1o0 z1o0Var = new z1o0(act2);
                this.dialog = new g4s(this.presenter, z1o0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
                String strM209910t = xau.m209910t(R$string.f47620Jh);
                strM209910t.getClass();
                String strM209910t2 = xau.m209910t(R$string.f47642Kh);
                strM209910t2.getClass();
                z1o0Var.m218362j(strM209910t, strM209910t2, R$string.f47847Ub, R$string.f48422v, new x20() { // from class: l.o2o0
                    @Override // p153l.x20
                    public final void call() {
                        q2o0.m175089b(this.f144759a);
                    }
                }, new x20() { // from class: l.p2o0
                    @Override // p153l.x20
                    public final void call() {
                        q2o0.m175088a(this.f150284a);
                    }
                });
            }
        }
        g4s g4sVar2 = this.dialog;
        if (g4sVar2 != null) {
            g4sVar2.show();
        }
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
