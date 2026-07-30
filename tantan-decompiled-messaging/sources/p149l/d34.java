package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import p147v.VFrame;
import p147v.VSwitch;

/* JADX INFO: loaded from: classes5.dex */
public class d34 implements s7m<sy3> {

    /* JADX INFO: renamed from: a */
    public View f83452a;

    /* JADX INFO: renamed from: b */
    public TextView f83453b;

    /* JADX INFO: renamed from: c */
    public VFrame f83454c;

    /* JADX INFO: renamed from: d */
    public VSwitch f83455d;

    /* JADX INFO: renamed from: e */
    public TextView f83456e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f83457f;

    /* JADX INFO: renamed from: g */
    public DialogC12611a f83458g;

    /* JADX INFO: renamed from: h */
    public sy3 f83459h;

    /* JADX INFO: renamed from: f */
    private void m109858f() {
        if (this.f83458g == null) {
            byr byrVar = new byr(this.f83459h, m109859c(act().inflater(), null));
            this.f83458g = byrVar;
            byrVar.m71778j0(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
            xdl0.m208329E0(this.f83454c, new View.OnClickListener() { // from class: l.b34
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f72802a.m109862i(view);
                }
            });
            xdl0.m208329E0(this.f83452a, new View.OnClickListener() { // from class: l.c34
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f78435a.m109863j(view);
                }
            });
            m109866m(0);
            this.f83456e.setText(R$string.f47072Y0);
            xdl0.m208344M(this.f83457f, false);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f83459h.act();
    }

    /* JADX INFO: renamed from: c */
    public View m109859c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e34.m114582b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sy3 sy3Var) {
        this.f83459h = sy3Var;
    }

    /* JADX INFO: renamed from: e */
    public void m109861e() {
        uep0.m193327n(this.f83458g);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m109862i(View view) {
        this.f83459h.m186599U3(!this.f83455d.isChecked());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m109863j(View view) {
        m109861e();
    }

    /* JADX INFO: renamed from: k */
    public void m109864k(boolean z) {
        this.f83456e.setText(z ? R$string.f47510s1 : R$string.f47072Y0);
        this.f83455d.setChecked(z);
        FrameLayout frameLayout = this.f83457f;
        if (z) {
            xdl0.m208344M(frameLayout, true);
        } else {
            frameLayout.removeAllViews();
            xdl0.m208344M(this.f83457f, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m109865l() {
        DialogC12611a dialogC12611a = this.f83458g;
        if (dialogC12611a != null) {
            dialogC12611a.show();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m109866m(int i) {
        TextView textView = this.f83453b;
        if (textView != null) {
            textView.setText(ypv.f199497e.getString(R$string.f46774Jj, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m109867r() {
        m109858f();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
