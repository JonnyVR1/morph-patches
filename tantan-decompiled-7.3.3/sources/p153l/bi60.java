package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.app.PutongAct;
import p137rx.C22421c;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;

/* JADX INFO: loaded from: classes9.dex */
public class bi60 implements iam<xh60> {

    /* JADX INFO: renamed from: a */
    public VMaterialEdit f76840a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f76841b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f76842c;

    /* JADX INFO: renamed from: d */
    public xh60 f76843d;

    public bi60(PutongAct putongAct) {
        this.f76842c = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m104414i(View view) {
        this.f76843d.m211021t0(this.f76840a.getText().toString());
        i4g0.m138520r("e_reset_password_done_button", this.f76842c.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m104415k(CharSequence charSequence) {
        g4g0.m128878a("e_new_password_input", this.f76842c.pageId(), this.f76842c.getClass().getName(), new Object[0]);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76842c;
    }

    @Override // p153l.iam
    public Act act() {
        return this.f76842c;
    }

    /* JADX INFO: renamed from: d */
    public View m104416d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ci60.m109853b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xh60 xh60Var) {
        this.f76843d = xh60Var;
    }

    /* JADX INFO: renamed from: f */
    public void m104418f(boolean z) {
        bnl0.m105591y(this.f76841b, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m104416d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m104419j() {
        this.f76840a.requestFocus();
    }

    /* JADX INFO: renamed from: l */
    public C22421c<CharSequence> m104420l() {
        return this.f76840a.m224373H();
    }

    /* JADX INFO: renamed from: m */
    public void m104421m() {
        this.f76840a.requestFocus();
    }

    /* JADX INFO: renamed from: r */
    public void m104422r() {
        this.f76841b.setOnClickListener(new View.OnClickListener() { // from class: l.yh60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199908a.m104414i(view);
            }
        });
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().mo102196w(false);
        l51.m152887G(new Runnable() { // from class: l.zh60
            @Override // java.lang.Runnable
            public final void run() {
                this.f204385a.m104419j();
            }
        });
        this.f76840a.setHint(R$string.f17000s3);
        this.f76840a.m224374I(false).subscribe(psd0.m173596G(new y20() { // from class: l.ai60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71457a.m104415k((CharSequence) obj);
            }
        }));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
