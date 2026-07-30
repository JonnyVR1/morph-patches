package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;
import p147v.VButton_FakeShadow;
import p147v.VLinear;
import p147v.VMaterialEdit;
import p147v.VMaterialEdit_FakeSpinner;

/* JADX INFO: loaded from: classes9.dex */
public class ft60 implements s7m<ct60> {

    /* JADX INFO: renamed from: a */
    public VLinear f99145a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f99146b;

    /* JADX INFO: renamed from: c */
    public VMaterialEdit_FakeSpinner f99147c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f99148d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f99149e;

    /* JADX INFO: renamed from: f */
    public ct60 f99150f;

    /* JADX INFO: renamed from: g */
    public PutongAct f99151g;

    public ft60(PutongAct putongAct) {
        this.f99151g = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m123021f(View view) {
        if (TextUtils.isEmpty(this.f99148d.getText())) {
            this.f99148d.setError(act().string(R$string.f16266p3));
        } else if (!this.f99150f.m108663h0(this.f99148d.getText().toString())) {
            this.f99148d.setError(act().string(R$string.f16096K3));
        } else {
            zvf0.m220396r("e_reset_password_verify_number_next_button", this.f99151g.pageId());
            this.f99150f.m108666m0(this.f99148d.getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m123022i(CharSequence charSequence) {
        xvf0.m211279a("e_reset_password_verify_number_input", this.f99151g.pageId(), this.f99151g.getClass().getName(), new Object[0]);
        m123023k();
    }

    /* JADX INFO: renamed from: k */
    private void m123023k() {
        this.f99149e.setActivated(!(!TextUtils.isEmpty(this.f99148d.getText()) && this.f99150f.m108663h0(this.f99148d.getText().toString())));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f99151g;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f99151g;
    }

    /* JADX INFO: renamed from: c */
    public View m123024c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gt60.m127877b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ct60 ct60Var) {
        this.f99150f = ct60Var;
    }

    /* JADX INFO: renamed from: e */
    public int m123026e() {
        return NullChecker.m81305c(this.f99147c, SchemeKey.account, CrashHelper.ReportLevel.p9) ? Integer.valueOf(this.f99147c.getText().toString().substring(1)).intValue() : zqb.f204369d.get(0).f204372b;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m123024c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m123027j(int i, String str) {
        this.f99147c.setText(Marker.ANY_NON_NULL_MARKER + i);
        this.f99148d.setText(str);
        this.f99148d.setSelection(str.length());
    }

    /* JADX INFO: renamed from: r */
    public void m123028r() {
        this.f99151g.setTitle(R$string.f16172a);
        xdl0.m208329E0(this.f99149e, new View.OnClickListener() { // from class: l.dt60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87822a.m123021f(view);
            }
        });
        this.f99148d.setFloatingLabel(0);
        this.f99148d.m223128I(false).subscribe(mkd0.m154955G(new e30() { // from class: l.et60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93085a.m123022i((CharSequence) obj);
            }
        }));
        this.f99147c.setFocusable(false);
        this.f99147c.setFocusableInTouchMode(false);
        this.f99148d.setFocusable(false);
        this.f99148d.setFocusableInTouchMode(false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
