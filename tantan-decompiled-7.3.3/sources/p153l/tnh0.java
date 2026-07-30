package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.account.SwitchAccountV2Act;
import com.p051p1.mobile.putong.core.p058ui.account.view.AccountViewV2;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton_FakeShadowSmall;
import p151v.VImage;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class tnh0 implements iam<mnh0>, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VLinear f175263a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f175264b;

    /* JADX INFO: renamed from: c */
    public VImage f175265c;

    /* JADX INFO: renamed from: d */
    public TextView f175266d;

    /* JADX INFO: renamed from: e */
    public TextView f175267e;

    /* JADX INFO: renamed from: f */
    public AccountViewV2 f175268f;

    /* JADX INFO: renamed from: g */
    public AccountViewV2 f175269g;

    /* JADX INFO: renamed from: h */
    public VButton_FakeShadowSmall f175270h;

    /* JADX INFO: renamed from: i */
    public SwitchAccountV2Act f175271i;

    /* JADX INFO: renamed from: j */
    public boolean f175272j = false;

    /* JADX INFO: renamed from: k */
    public mnh0 f175273k;

    public tnh0(SwitchAccountV2Act switchAccountV2Act) {
        this.f175271i = switchAccountV2Act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m191887a() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m191888b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m191893n(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m191894p() {
        RememberUserInfo rememberUserInfoM159183s0 = this.f175273k.m159183s0();
        m191897w(this.f175268f.m45390d(new x20() { // from class: l.rnh0
            @Override // p153l.x20
            public final void call() {
                tnh0.m191887a();
            }
        }));
        this.f175268f.setData(rememberUserInfoM159183s0);
        this.f175269g.setData(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m191895q() {
        this.f175273k.m159184t0();
        m191897w(this.f175269g.m45390d(new x20() { // from class: l.snh0
            @Override // p153l.x20
            public final void call() {
                tnh0.m191888b();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m191896s(RememberUserInfo rememberUserInfo, View view) {
        m191897w(!this.f175273k.m159182q0(rememberUserInfo) ? this.f175268f.m45390d(new x20() { // from class: l.pnh0
            @Override // p153l.x20
            public final void call() {
                this.f153307a.m191894p();
            }
        }) : this.f175269g.m45390d(new x20() { // from class: l.qnh0
            @Override // p153l.x20
            public final void call() {
                this.f158487a.m191895q();
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    private void m191897w(boolean z) {
        TextView textView = this.f175266d;
        if (z) {
            textView.setText(act().getResources().getText(R$string.f28637U3));
            this.f175270h.setText(act().getResources().getText(R$string.f28643W));
            this.f175267e.setVisibility(0);
            this.f175268f.setClickable(false);
            this.f175269g.setClickable(false);
            return;
        }
        textView.setText(act().getResources().getText(R$string.f28632T3));
        this.f175267e.setVisibility(4);
        this.f175268f.setClickable(true);
        this.f175269g.setClickable(true);
        boolean zM159186x0 = this.f175273k.m159186x0();
        VButton_FakeShadowSmall vButton_FakeShadowSmall = this.f175270h;
        if (zM159186x0) {
            vButton_FakeShadowSmall.setVisibility(8);
        } else {
            vButton_FakeShadowSmall.setVisibility(0);
            this.f175270h.setText(act().getResources().getText(R$string.f28637U3));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f175271i;
    }

    /* JADX INFO: renamed from: i */
    public View m191898i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return unh0.m196865b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m191898i(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public SwitchAccountV2Act act() {
        return this.f175271i;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mnh0 mnh0Var) {
        this.f175273k = mnh0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m191901l(boolean z) {
        if (z) {
            this.f175272j = false;
        }
        this.f175268f.setClickable(z);
        this.f175269g.setClickable(z);
        this.f175270h.setClickable(z);
    }

    /* JADX INFO: renamed from: m */
    public void m191902m(final RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        this.f175264b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.nnh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142793a.m191893n(view);
            }
        });
        this.f175268f.setData(rememberUserInfo);
        this.f175268f.setOnClickListener(this);
        this.f175269g.setData(rememberUserInfo2);
        this.f175269g.setOnClickListener(this);
        if (NullChecker.m82486a(rememberUserInfo2)) {
            this.f175270h.setVisibility(0);
            bnl0.m105509E0(this.f175270h, new View.OnClickListener() { // from class: l.onh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f148091a.m191896s(rememberUserInfo, view);
                }
            });
        }
        m191903u(rememberUserInfo, rememberUserInfo2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m191901l(false);
        if (this.f175272j) {
            return;
        }
        this.f175272j = true;
        if (view == this.f175268f) {
            this.f175273k.m159180o0();
        } else if (view == this.f175269g) {
            this.f175273k.m159181p0();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m191903u(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        if (act().toolbar() == null) {
            return;
        }
        if (this.f175273k.m159182q0(rememberUserInfo) || this.f175273k.m159182q0(rememberUserInfo2)) {
            bnl0.m105525M0(this.f175264b, true);
        } else {
            bnl0.m105525M0(this.f175264b, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m191904v(RememberUserInfo rememberUserInfo, RememberUserInfo rememberUserInfo2) {
        act().setSwipeBackEnable(false);
        this.f175268f.setData(rememberUserInfo);
        this.f175269g.setData(rememberUserInfo2);
        m191903u(rememberUserInfo, rememberUserInfo2);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
