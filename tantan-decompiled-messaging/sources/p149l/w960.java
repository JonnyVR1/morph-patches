package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.app.PutongAct;
import p133rx.C22306c;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;

/* JADX INFO: loaded from: classes9.dex */
public class w960 implements s7m<s960> {

    /* JADX INFO: renamed from: a */
    public VMaterialEdit f185304a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f185305b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f185306c;

    /* JADX INFO: renamed from: d */
    public s960 f185307d;

    public w960(PutongAct putongAct) {
        this.f185306c = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m202239i(View view) {
        this.f185307d.m182719t0(this.f185304a.getText().toString());
        zvf0.m220396r("e_reset_password_done_button", this.f185306c.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m202240k(CharSequence charSequence) {
        xvf0.m211279a("e_new_password_input", this.f185306c.pageId(), this.f185306c.getClass().getName(), new Object[0]);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f185306c;
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f185306c;
    }

    /* JADX INFO: renamed from: d */
    public View m202241d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x960.m207484b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(s960 s960Var) {
        this.f185307d = s960Var;
    }

    /* JADX INFO: renamed from: f */
    public void m202243f(boolean z) {
        xdl0.m208411y(this.f185305b, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m202241d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m202244j() {
        this.f185304a.requestFocus();
    }

    /* JADX INFO: renamed from: l */
    public C22306c<CharSequence> m202245l() {
        return this.f185304a.m223127H();
    }

    /* JADX INFO: renamed from: m */
    public void m202246m() {
        this.f185304a.requestFocus();
    }

    /* JADX INFO: renamed from: r */
    public void m202247r() {
        this.f185305b.setOnClickListener(new View.OnClickListener() { // from class: l.t960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168993a.m202239i(view);
            }
        });
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().mo134136w(false);
        e51.m114742G(new Runnable() { // from class: l.u960
            @Override // java.lang.Runnable
            public final void run() {
                this.f175195a.m202244j();
            }
        });
        this.f185304a.setHint(R$string.f16281s3);
        this.f185304a.m223128I(false).subscribe(mkd0.m154955G(new e30() { // from class: l.v960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180615a.m202240k((CharSequence) obj);
            }
        }));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
