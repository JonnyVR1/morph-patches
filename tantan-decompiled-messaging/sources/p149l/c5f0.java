package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.account.PhoneVerificationAct;
import com.p046p1.mobile.putong.account.p050ui.account.SignInAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;
import p147v.VMaterialEdit_FakeSpinner;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class c5f0 extends c3f0<o4f0, SignInAct> {

    /* JADX INFO: renamed from: c */
    public VMaterialEdit_FakeSpinner f79375c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f79376d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f79377e;

    /* JADX INFO: renamed from: f */
    public VText f79378f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f79379g;

    public c5f0(@NonNull SignInAct signInAct) {
        super(signInAct);
    }

    @Override // p149l.c3f0
    /* JADX INFO: renamed from: i */
    public void mo103522i(String str) {
        this.f79377e.setError(str);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m105316q(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m105316q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d5f0.m110056b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m105317r() {
        qu60.m176552z(this.f79375c, act());
        this.f79375c.setOnClickListener(new View.OnClickListener() { // from class: l.w4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184558a.m105319u(view);
            }
        });
        if (NullChecker.m81303a(WelcomeAct.f17059h)) {
            this.f79375c.setText(WelcomeAct.f17059h);
        }
        if (NullChecker.m81303a(WelcomeAct.f17058g)) {
            this.f79376d.setText(WelcomeAct.f17058g);
        }
        this.f79376d.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.x4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191020a.m105320v((CharSequence) obj);
            }
        }));
        this.f79377e.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.y4f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196276a.m105321w((CharSequence) obj);
            }
        }));
        this.f79379g.setOnClickListener(new View.OnClickListener() { // from class: l.z4f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201591a.m105322x(view);
            }
        });
        this.f79378f.setOnClickListener(new View.OnClickListener() { // from class: l.a5f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67706a.m105323y(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m105318s(String str) {
        this.f79375c.setText(str);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m105319u(View view) {
        C21176xm.m210001b0(act(), new e30() { // from class: l.b5f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73655a.m105318s((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m105320v(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            this.f79376d.setError(null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m105321w(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            mo103522i(null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m105322x(View view) {
        if (this.f79376d.getText().toString().isEmpty()) {
            mo103522i(act().string(R$string.f16266p3));
            return;
        }
        if (this.f79377e.getText().toString().isEmpty()) {
            mo103522i(act().string(R$string.f16260o3));
            return;
        }
        String str = vwb.m200345q(this.f79375c.getText().toString()) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + vwb.m200345q(this.f79376d.getText().toString());
        String string = this.f79377e.getText().toString();
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get(SignInGrantType.password);
        signInData.username = str;
        signInData.password = string;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        ((o4f0) this.f78942b).m100081I0(signInData);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m105323y(View view) {
        m105019f(PhoneVerificationAct.m28385Y1(act(), VerifyReason.get(VerifyReason.forgot_password)));
    }

    /* JADX INFO: renamed from: z */
    public void m105324z() {
        m105017d(this.f79375c, this.f79376d);
    }
}
