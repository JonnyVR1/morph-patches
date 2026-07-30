package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.account.PhoneVerificationAct;
import com.p000p1.mobile.putong.account.p002ui.account.SignInAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.mkd0;
import l.vwb;
import v.VButton_FakeShadow;
import v.VMaterialEdit;
import v.VMaterialEdit_FakeSpinner;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c5f0 extends c3f0<o4f0, SignInAct> {

    /* JADX INFO: renamed from: c */
    public VMaterialEdit_FakeSpinner f9372c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f9373d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f9374e;

    /* JADX INFO: renamed from: f */
    public VText f9375f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f9376g;

    public c5f0(@NonNull SignInAct signInAct) {
        super(signInAct);
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo12892i(String str) {
        this.f9374e.setError(str);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13192q(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m13192q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d5f0.m13795b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m13193r() {
        qu60.m22393z(this.f9372c, act());
        this.f9372c.setOnClickListener(new View.OnClickListener() { // from class: l.w4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24974a.m13195u(view);
            }
        });
        if (NullChecker.a(WelcomeAct.f1048h)) {
            this.f9372c.setText(WelcomeAct.f1048h);
        }
        if (NullChecker.a(WelcomeAct.f1047g)) {
            this.f9373d.setText(WelcomeAct.f1047g);
        }
        this.f9373d.H().subscribe(mkd0.G(new e30() { // from class: l.x4f0
            public final void call(Object obj) {
                this.f27348a.m13196v((CharSequence) obj);
            }
        }));
        this.f9374e.H().subscribe(mkd0.G(new e30() { // from class: l.y4f0
            public final void call(Object obj) {
                this.f28003a.m13197w((CharSequence) obj);
            }
        }));
        this.f9376g.setOnClickListener(new View.OnClickListener() { // from class: l.z4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28622a.m13198x(view);
            }
        });
        this.f9375f.setOnClickListener(new View.OnClickListener() { // from class: l.a5f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8113a.m13199y(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m13194s(String str) {
        this.f9372c.setText(str);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m13195u(View view) {
        C1444xm.m27308b0(act(), new e30() { // from class: l.b5f0
            public final void call(Object obj) {
                this.f8736a.m13194s((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m13196v(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            this.f9373d.setError((CharSequence) null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m13197w(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            mo12892i(null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m13198x(View view) {
        if (this.f9373d.getText().toString().isEmpty()) {
            mo12892i(act().string(R$string.f255p3));
            return;
        }
        if (this.f9374e.getText().toString().isEmpty()) {
            mo12892i(act().string(R$string.f249o3));
            return;
        }
        String str = vwb.q(this.f9372c.getText().toString()) + " " + vwb.q(this.f9373d.getText().toString());
        String string = this.f9374e.getText().toString();
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("password");
        signInData.username = str;
        signInData.password = string;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        ((o4f0) this.f9324b).m12504I0(signInData);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m13199y(View view) {
        m13097f(PhoneVerificationAct.m281Y1(act(), VerifyReason.get("forgot-password")));
    }

    /* JADX INFO: renamed from: z */
    public void m13200z() {
        m13095d(this.f9372c, this.f9373d);
    }
}
