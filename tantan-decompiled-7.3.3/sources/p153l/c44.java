package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import p151v.VFrame;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes5.dex */
public class c44 implements iam<rz3> {

    /* JADX INFO: renamed from: a */
    public View f79662a;

    /* JADX INFO: renamed from: b */
    public TextView f79663b;

    /* JADX INFO: renamed from: c */
    public VFrame f79664c;

    /* JADX INFO: renamed from: d */
    public VSwitch f79665d;

    /* JADX INFO: renamed from: e */
    public TextView f79666e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f79667f;

    /* JADX INFO: renamed from: g */
    public DialogC12774a f79668g;

    /* JADX INFO: renamed from: h */
    public rz3 f79669h;

    /* JADX INFO: renamed from: f */
    private void m107851f() {
        if (this.f79668g == null) {
            c0s c0sVar = new c0s(this.f79669h, m107852c(act().inflater(), null));
            this.f79668g = c0sVar;
            c0sVar.m72961j0(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
            bnl0.m105509E0(this.f79664c, new View.OnClickListener() { // from class: l.a44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68351a.m107855i(view);
                }
            });
            bnl0.m105509E0(this.f79662a, new View.OnClickListener() { // from class: l.b44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74858a.m107856j(view);
                }
            });
            m107859m(0);
            this.f79666e.setText(R$string.f47920Y0);
            bnl0.m105524M(this.f79667f, false);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f79669h.act();
    }

    /* JADX INFO: renamed from: c */
    public View m107852c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d44.m114107b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rz3 rz3Var) {
        this.f79669h = rz3Var;
    }

    /* JADX INFO: renamed from: e */
    public void m107854e() {
        ynp0.m216937n(this.f79668g);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m107855i(View view) {
        this.f79669h.m183681U3(!this.f79665d.isChecked());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m107856j(View view) {
        m107854e();
    }

    /* JADX INFO: renamed from: k */
    public void m107857k(boolean z) {
        this.f79666e.setText(z ? R$string.f48358s1 : R$string.f47920Y0);
        this.f79665d.setChecked(z);
        FrameLayout frameLayout = this.f79667f;
        if (z) {
            bnl0.m105524M(frameLayout, true);
        } else {
            frameLayout.removeAllViews();
            bnl0.m105524M(this.f79667f, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m107858l() {
        DialogC12774a dialogC12774a = this.f79668g;
        if (dialogC12774a != null) {
            dialogC12774a.show();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m107859m(int i) {
        TextView textView = this.f79663b;
        if (textView != null) {
            textView.setText(zrv.f205803e.getString(R$string.f47622Jj, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m107860r() {
        m107851f();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
