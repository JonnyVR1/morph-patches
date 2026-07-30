package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.e51;
import l.mkd0;
import l.s7m;
import l.xdl0;
import l.xvf0;
import l.zvf0;
import rx.c;
import v.VButton_FakeShadow;
import v.VMaterialEdit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w960 implements s7m<s960> {

    /* JADX INFO: renamed from: a */
    public VMaterialEdit f25032a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f25033b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f25034c;

    /* JADX INFO: renamed from: d */
    public s960 f25035d;

    public w960(PutongAct putongAct) {
        this.f25034c = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m26250i(View view) {
        this.f25035d.m23541t0(this.f25032a.getText().toString());
        zvf0.r("e_reset_password_done_button", this.f25034c.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m26251k(CharSequence charSequence) {
        xvf0.a("e_new_password_input", this.f25034c.pageId(), this.f25034c.getClass().getName(), new Object[0]);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m26252C0() {
        return this.f25034c;
    }

    public Act act() {
        return this.f25034c;
    }

    /* JADX INFO: renamed from: d */
    public View m26253d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x960.m27158b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m26256i1(s960 s960Var) {
        this.f25035d = s960Var;
    }

    /* JADX INFO: renamed from: f */
    public void m26255f(boolean z) {
        xdl0.y(this.f25033b, z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m26253d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m26257j() {
        this.f25032a.requestFocus();
    }

    /* JADX INFO: renamed from: l */
    public c<CharSequence> m26258l() {
        return this.f25032a.H();
    }

    /* JADX INFO: renamed from: m */
    public void m26259m() {
        this.f25032a.requestFocus();
    }

    /* JADX INFO: renamed from: r */
    public void m26260r() {
        this.f25033b.setOnClickListener(new View.OnClickListener() { // from class: l.t960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21957a.m26250i(view);
            }
        });
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().w(false);
        e51.G(new Runnable() { // from class: l.u960
            @Override // java.lang.Runnable
            public final void run() {
                this.f23432a.m26257j();
            }
        });
        this.f25032a.setHint(R$string.f270s3);
        this.f25032a.I(false).subscribe(mkd0.G(new e30() { // from class: l.v960
            public final void call(Object obj) {
                this.f24222a.m26251k((CharSequence) obj);
            }
        }));
    }

    public void destroy() {
    }
}
