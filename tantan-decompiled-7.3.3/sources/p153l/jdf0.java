package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.account.PhoneVerificationAct;
import com.p051p1.mobile.putong.account.p055ui.account.SignInAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;
import p151v.VMaterialEdit_FakeSpinner;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jdf0 extends jbf0<vcf0, SignInAct> {

    /* JADX INFO: renamed from: c */
    public VMaterialEdit_FakeSpinner f120249c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f120250d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f120251e;

    /* JADX INFO: renamed from: f */
    public VText f120252f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f120253g;

    public jdf0(@NonNull SignInAct signInAct) {
        super(signInAct);
    }

    @Override // p153l.jbf0
    /* JADX INFO: renamed from: i */
    public void mo107593i(String str) {
        this.f120251e.setError(str);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m144414q(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m144414q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kdf0.m149203b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m144415r() {
        w270.m204551z(this.f120249c, act());
        this.f120249c.setOnClickListener(new View.OnClickListener() { // from class: l.ddf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87933a.m144417u(view);
            }
        });
        if (NullChecker.m82486a(WelcomeAct.f17778h)) {
            this.f120249c.setText(WelcomeAct.f17778h);
        }
        if (NullChecker.m82486a(WelcomeAct.f17777g)) {
            this.f120250d.setText(WelcomeAct.f17777g);
        }
        this.f120250d.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.edf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93508a.m144418v((CharSequence) obj);
            }
        }));
        this.f120251e.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.fdf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98472a.m144419w((CharSequence) obj);
            }
        }));
        this.f120253g.setOnClickListener(new View.OnClickListener() { // from class: l.gdf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103709a.m144420x(view);
            }
        });
        this.f120252f.setOnClickListener(new View.OnClickListener() { // from class: l.hdf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108986a.m144421y(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m144416s(String str) {
        this.f120249c.setText(str);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m144417u(View view) {
        C20102sm.m186686b0(act(), new y20() { // from class: l.idf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114503a.m144416s((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m144418v(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            this.f120250d.setError(null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m144419w(CharSequence charSequence) {
        if (charSequence.length() > 0) {
            mo107593i(null);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m144420x(View view) {
        if (this.f120250d.getText().toString().isEmpty()) {
            mo107593i(act().string(R$string.f16985p3));
            return;
        }
        if (this.f120251e.getText().toString().isEmpty()) {
            mo107593i(act().string(R$string.f16979o3));
            return;
        }
        String str = jyb.m147528q(this.f120249c.getText().toString()) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + jyb.m147528q(this.f120250d.getText().toString());
        String string = this.f120251e.getText().toString();
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get(SignInGrantType.password);
        signInData.username = str;
        signInData.password = string;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        ((vcf0) this.f119873b).m139324I0(signInData);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m144421y(View view) {
        m144221f(PhoneVerificationAct.m29384Z1(act(), VerifyReason.get(VerifyReason.forgot_password)));
    }

    /* JADX INFO: renamed from: z */
    public void m144422z() {
        m144219d(this.f120249c, this.f120250d);
    }
}
