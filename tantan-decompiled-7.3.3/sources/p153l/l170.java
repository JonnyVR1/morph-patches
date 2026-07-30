package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.slf4j.Marker;
import p151v.VButton_FakeShadow;
import p151v.VLinear;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;

/* JADX INFO: loaded from: classes9.dex */
public class l170 implements iam<i170> {

    /* JADX INFO: renamed from: a */
    public VLinear f129654a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f129655b;

    /* JADX INFO: renamed from: c */
    public VMaterialEdit_FakeSpinner f129656c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f129657d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f129658e;

    /* JADX INFO: renamed from: f */
    public i170 f129659f;

    /* JADX INFO: renamed from: g */
    public PutongAct f129660g;

    public l170(PutongAct putongAct) {
        this.f129660g = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m152458f(View view) {
        if (TextUtils.isEmpty(this.f129657d.getText())) {
            this.f129657d.setError(act().string(R$string.f16985p3));
        } else if (!this.f129659f.m138084h0(this.f129657d.getText().toString())) {
            this.f129657d.setError(act().string(R$string.f16815K3));
        } else {
            i4g0.m138520r("e_reset_password_verify_number_next_button", this.f129660g.pageId());
            this.f129659f.m138087m0(this.f129657d.getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m152459i(CharSequence charSequence) {
        g4g0.m128878a("e_reset_password_verify_number_input", this.f129660g.pageId(), this.f129660g.getClass().getName(), new Object[0]);
        m152460k();
    }

    /* JADX INFO: renamed from: k */
    private void m152460k() {
        this.f129658e.setActivated(!(!TextUtils.isEmpty(this.f129657d.getText()) && this.f129659f.m138084h0(this.f129657d.getText().toString())));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f129660g;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f129660g;
    }

    /* JADX INFO: renamed from: c */
    public View m152461c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m170.m156600b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i170 i170Var) {
        this.f129659f = i170Var;
    }

    /* JADX INFO: renamed from: e */
    public int m152463e() {
        return NullChecker.m82488c(this.f129656c, SchemeKey.account, CrashHelper.ReportLevel.p9) ? Integer.valueOf(this.f129656c.getText().toString().substring(1)).intValue() : nsb.f143476d.get(0).f143479b;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m152461c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m152464j(int i, String str) {
        this.f129656c.setText(Marker.ANY_NON_NULL_MARKER + i);
        this.f129657d.setText(str);
        this.f129657d.setSelection(str.length());
    }

    /* JADX INFO: renamed from: r */
    public void m152465r() {
        this.f129660g.setTitle(R$string.f16891a);
        bnl0.m105509E0(this.f129658e, new View.OnClickListener() { // from class: l.j170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117936a.m152458f(view);
            }
        });
        this.f129657d.setFloatingLabel(0);
        this.f129657d.m224374I(false).subscribe(psd0.m173596G(new y20() { // from class: l.k170
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123452a.m152459i((CharSequence) obj);
            }
        }));
        this.f129656c.setFocusable(false);
        this.f129656c.setFocusableInTouchMode(false);
        this.f129657d.setFocusable(false);
        this.f129657d.setFocusableInTouchMode(false);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
