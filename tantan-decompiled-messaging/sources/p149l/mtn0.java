package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0004J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0004J%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\b¨\u0006#"}, m87232d2 = {"Ll/mtn0;", "Ll/s7m;", "Ll/cho0;", "<init>", "()V", "presenter", "", "c", "(Ll/cho0;)V", "e", Constants.INAPP_DATA_TAG, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Ll/f2s;", "a", "Ll/f2s;", "getDialog", "()Ll/f2s;", "setDialog", "(Ll/f2s;)V", OMSTemplateType.dialog, "b", "Ll/cho0;", "getPresenter", "()Ll/cho0;", "setPresenter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mtn0 implements s7m<cho0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public f2s dialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public cho0 presenter;

    /* JADX INFO: renamed from: a */
    public static void m156333a(mtn0 mtn0Var) {
        f2s f2sVar = mtn0Var.dialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        cho0 cho0Var = mtn0Var.presenter;
        if (cho0Var != null) {
            cho0Var.m106979k4();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m156334b(mtn0 mtn0Var) {
        f2s f2sVar = mtn0Var.dialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        cho0 cho0Var = mtn0Var.presenter;
        if (cho0Var != null) {
            cho0Var.m106981m4();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        cho0 cho0Var = this.presenter;
        cho0Var.getClass();
        return cho0Var.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable cho0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: d */
    public final void m156336d() {
        f2s f2sVar;
        f2s f2sVar2 = this.dialog;
        if (f2sVar2 == null || f2sVar2 == null || !f2sVar2.isShowing() || (f2sVar = this.dialog) == null) {
            return;
        }
        f2sVar.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m156337e() {
        if (this.dialog == null) {
            cho0 cho0Var = this.presenter;
            cho0Var.getClass();
            boolean zM106980l4 = cho0Var.m106980l4();
            cho0 cho0Var2 = this.presenter;
            if (zM106980l4) {
                cho0Var2.getClass();
                Act act = cho0Var2.act();
                act.getClass();
                fyu fyuVar = new fyu(act);
                f2s f2sVar = new f2s(this.presenter, fyuVar.m128733b());
                this.dialog = f2sVar;
                cho0 cho0Var3 = this.presenter;
                cho0Var3.getClass();
                fyuVar.m123798f(f2sVar, cho0Var3);
            } else {
                cho0Var2.getClass();
                Act act2 = cho0Var2.act();
                act2.getClass();
                vsn0 vsn0Var = new vsn0(act2);
                this.dialog = new f2s(this.presenter, vsn0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
                String strM202217t = w8u.m202217t(R$string.f46772Jh);
                strM202217t.getClass();
                String strM202217t2 = w8u.m202217t(R$string.f46794Kh);
                strM202217t2.getClass();
                vsn0Var.m199889j(strM202217t, strM202217t2, R$string.f46999Ub, R$string.f47574v, new d30() { // from class: l.ktn0
                    @Override // p149l.d30
                    public final void call() {
                        mtn0.m156334b(this.f124601a);
                    }
                }, new d30() { // from class: l.ltn0
                    @Override // p149l.d30
                    public final void call() {
                        mtn0.m156333a(this.f129983a);
                    }
                });
            }
        }
        f2s f2sVar2 = this.dialog;
        if (f2sVar2 != null) {
            f2sVar2.show();
        }
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
