package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.mkd0;
import l.s7m;
import l.xdl0;
import l.xvf0;
import l.zqb;
import l.zvf0;
import v.VButton_FakeShadow;
import v.VLinear;
import v.VMaterialEdit;
import v.VMaterialEdit_FakeSpinner;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ft60 implements s7m<ct60> {

    /* JADX INFO: renamed from: a */
    public VLinear f12891a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f12892b;

    /* JADX INFO: renamed from: c */
    public VMaterialEdit_FakeSpinner f12893c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f12894d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f12895e;

    /* JADX INFO: renamed from: f */
    public ct60 f12896f;

    /* JADX INFO: renamed from: g */
    public PutongAct f12897g;

    public ft60(PutongAct putongAct) {
        this.f12897g = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m15462f(View view) {
        if (TextUtils.isEmpty(this.f12894d.getText())) {
            this.f12894d.setError(act().string(R$string.f255p3));
        } else if (!this.f12896f.m13636h0(this.f12894d.getText().toString())) {
            this.f12894d.setError(act().string(R$string.f85K3));
        } else {
            zvf0.r("e_reset_password_verify_number_next_button", this.f12897g.pageId());
            this.f12896f.m13639m0(this.f12894d.getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m15463i(CharSequence charSequence) {
        xvf0.a("e_reset_password_verify_number_input", this.f12897g.pageId(), this.f12897g.getClass().getName(), new Object[0]);
        m15464k();
    }

    /* JADX INFO: renamed from: k */
    private void m15464k() {
        this.f12895e.setActivated(!(!TextUtils.isEmpty(this.f12894d.getText()) && this.f12896f.m13636h0(this.f12894d.getText().toString())));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15465C0() {
        return this.f12897g;
    }

    @Nullable
    public Act act() {
        return this.f12897g;
    }

    /* JADX INFO: renamed from: c */
    public View m15466c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gt60.m15968b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m15469i1(ct60 ct60Var) {
        this.f12896f = ct60Var;
    }

    /* JADX INFO: renamed from: e */
    public int m15468e() {
        return NullChecker.c(this.f12893c, "account", CrashHelper.ReportLevel.p9) ? Integer.valueOf(this.f12893c.getText().toString().substring(1)).intValue() : ((zqb) zqb.d.get(0)).b;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m15466c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m15470j(int i, String str) {
        this.f12893c.setText("+" + i);
        this.f12894d.setText(str);
        this.f12894d.setSelection(str.length());
    }

    /* JADX INFO: renamed from: r */
    public void m15471r() {
        this.f12897g.setTitle(R$string.f161a);
        xdl0.E0(this.f12895e, new View.OnClickListener() { // from class: l.dt60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10559a.m15462f(view);
            }
        });
        this.f12894d.setFloatingLabel(0);
        this.f12894d.I(false).subscribe(mkd0.G(new e30() { // from class: l.et60
            public final void call(Object obj) {
                this.f11427a.m15463i((CharSequence) obj);
            }
        }));
        this.f12893c.setFocusable(false);
        this.f12893c.setFocusableInTouchMode(false);
        this.f12894d.setFocusable(false);
        this.f12894d.setFocusableInTouchMode(false);
    }

    public void destroy() {
    }
}
