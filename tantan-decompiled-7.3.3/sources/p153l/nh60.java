package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.PasswordChangeAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import p151v.VButton_FakeShadow;
import p151v.VButton_FakeShadowSmall;
import p151v.VMaterialEdit;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class nh60 implements iam<eh60> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f141932a;

    /* JADX INFO: renamed from: b */
    public TextView f141933b;

    /* JADX INFO: renamed from: c */
    public TextView f141934c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadowSmall f141935d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f141936e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f141937f;

    /* JADX INFO: renamed from: g */
    public VText f141938g;

    /* JADX INFO: renamed from: h */
    public VText f141939h;

    /* JADX INFO: renamed from: i */
    public VButton_FakeShadow f141940i;

    /* JADX INFO: renamed from: j */
    public eh60 f141941j;

    /* JADX INFO: renamed from: k */
    public PasswordChangeAct f141942k;

    public nh60(PasswordChangeAct passwordChangeAct) {
        this.f141942k = passwordChangeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m163043A(CharSequence charSequence) {
        if (charSequence.length() < CoreModule.m30929H().mo29158N9() && charSequence.length() > 0) {
            this.f141937f.setError(lu6.m155847c(this.f141942k.string(R$string.f28587K3)));
        }
        m163068u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m163044B(CharSequence charSequence) {
        if (charSequence.length() != CoreModule.m30929H().mo29163eq() && charSequence.length() > 0) {
            this.f141936e.setError(this.f141942k.string(R$string.f28793v3));
        }
        m163068u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m163045C(View view) {
        this.f141941j.m120844j0();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m163049d(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    private void m163054v() {
        bnl0.m105591y(this.f141935d, false);
        bnl0.m105525M0(this.f141933b, true);
        this.f141935d.setTextColor(this.f141942k.getResources().getColor(j9c0.f118875l));
        PasswordChangeAct passwordChangeAct = this.f141942k;
        passwordChangeAct.duringCreated(l51.m152894N(passwordChangeAct.getLocalClassName(), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.kh60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126697a.m163069w((Long) obj);
            }
        }, new y20() { // from class: l.lh60
            @Override // p153l.y20
            public final void call(Object obj) {
                nh60.m163049d((Throwable) obj);
            }
        }, new x20() { // from class: l.mh60
            @Override // p153l.x20
            public final void call() {
                this.f136829a.m163070x();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m163055y(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m163056z(View view) {
        this.f141941j.m120845k0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f141942k;
    }

    /* JADX INFO: renamed from: E */
    public void m163057E() {
        this.f141942k.progressDismiss();
        this.f141936e.setText("");
        this.f141935d.setText(this.f141942k.getString(R$string.f28817z3, 60));
        m163054v();
    }

    /* JADX INFO: renamed from: F */
    public void m163058F(String str) {
        this.f141934c.setText(str);
    }

    /* JADX INFO: renamed from: G */
    public void m163059G() {
        this.f141936e.requestFocus();
        act().showInput(this.f141936e, 0);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f141942k;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m163060k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m163060k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oh60.m167691b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m163061l() {
        act().hideInput();
        l51.m152891K(act().getLocalClassName());
        act().progressDismiss();
        act().m51642n2();
        o1j0.m165650x(R$string.f28802x0, false);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(eh60 eh60Var) {
        this.f141941j = eh60Var;
    }

    /* JADX INFO: renamed from: n */
    public void m163063n(Throwable th) {
        act().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: p */
    public int m163064p() {
        return bsj0.m106251I(this.f141936e);
    }

    /* JADX INFO: renamed from: q */
    public void m163065q(Throwable th) {
        bnl0.m105591y(this.f141935d, true);
        this.f141942k.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: r */
    public void m163066r() {
        this.f141932a.setTitle(R$string.f28754p0);
        this.f141932a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.fh60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99015a.m163055y(view);
            }
        });
        this.f141935d.setOnClickListener(new View.OnClickListener() { // from class: l.gh60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104071a.m163056z(view);
            }
        });
        this.f141937f.m224374I(false).subscribe(psd0.m173596G(new y20() { // from class: l.hh60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109484a.m163043A((CharSequence) obj);
            }
        }));
        this.f141936e.m224374I(false).subscribe(psd0.m173596G(new y20() { // from class: l.ih60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114872a.m163044B((CharSequence) obj);
            }
        }));
        bnl0.m105591y(this.f141940i, false);
        if (l51.m152882B(this.f141942k.getLocalClassName())) {
            this.f141941j.f94006c = true;
            m163054v();
        } else {
            bnl0.m105591y(this.f141935d, true);
            bnl0.m105525M0(this.f141933b, false);
        }
        this.f141940i.setOnClickListener(new View.OnClickListener() { // from class: l.jh60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120823a.m163045C(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public String m163067s() {
        return this.f141937f.getText().toString().trim();
    }

    /* JADX INFO: renamed from: u */
    public final void m163068u() {
        bnl0.m105591y(this.f141940i, this.f141941j.f94006c && this.f141937f.getError() == null && this.f141936e.getError() == null && !TextUtils.isEmpty(this.f141937f.getText()) && this.f141937f.getText().length() >= CoreModule.m30929H().mo29158N9() && !TextUtils.isEmpty(this.f141936e.getText()) && this.f141936e.getText().length() == 4);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m163069w(Long l2) {
        this.f141935d.setText(this.f141942k.getString(R$string.f28817z3, Long.valueOf(59 - l2.longValue())));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m163070x() {
        bnl0.m105591y(this.f141935d, true);
        bnl0.m105525M0(this.f141933b, false);
        this.f141935d.setTextColor(this.f141942k.getResources().getColor(j9c0.f118878o));
        this.f141935d.setText(this.f141942k.getString(R$string.f28562F3));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
