package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.PasswordChangeAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import p147v.VButton_FakeShadow;
import p147v.VButton_FakeShadowSmall;
import p147v.VMaterialEdit;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes8.dex */
public class i960 implements s7m<z860> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f112107a;

    /* JADX INFO: renamed from: b */
    public TextView f112108b;

    /* JADX INFO: renamed from: c */
    public TextView f112109c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadowSmall f112110d;

    /* JADX INFO: renamed from: e */
    public VMaterialEdit f112111e;

    /* JADX INFO: renamed from: f */
    public VMaterialEdit f112112f;

    /* JADX INFO: renamed from: g */
    public VText f112113g;

    /* JADX INFO: renamed from: h */
    public VText f112114h;

    /* JADX INFO: renamed from: i */
    public VButton_FakeShadow f112115i;

    /* JADX INFO: renamed from: j */
    public z860 f112116j;

    /* JADX INFO: renamed from: k */
    public PasswordChangeAct f112117k;

    public i960(PasswordChangeAct passwordChangeAct) {
        this.f112117k = passwordChangeAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m135018A(CharSequence charSequence) {
        if (charSequence.length() < CoreModule.m29931H().mo28159N9() && charSequence.length() > 0) {
            this.f112112f.setError(it6.m138182c(this.f112117k.string(R$string.f27739K3)));
        }
        m135043u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m135019B(CharSequence charSequence) {
        if (charSequence.length() != CoreModule.m29931H().mo28164eq() && charSequence.length() > 0) {
            this.f112111e.setError(this.f112117k.string(R$string.f27945v3));
        }
        m135043u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m135020C(View view) {
        this.f112116j.m217587j0();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m135024d(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    private void m135029v() {
        xdl0.m208411y(this.f112110d, false);
        xdl0.m208345M0(this.f112108b, true);
        this.f112110d.setTextColor(this.f112117k.getResources().getColor(c1c0.f78255l));
        PasswordChangeAct passwordChangeAct = this.f112117k;
        passwordChangeAct.duringCreated(e51.m114749N(passwordChangeAct.getLocalClassName(), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.f960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96456a.m135044w((Long) obj);
            }
        }, new e30() { // from class: l.g960
            @Override // p149l.e30
            public final void call(Object obj) {
                i960.m135024d((Throwable) obj);
            }
        }, new d30() { // from class: l.h960
            @Override // p149l.d30
            public final void call() {
                this.f106517a.m135045x();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m135030y(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m135031z(View view) {
        this.f112116j.m217588k0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112117k;
    }

    /* JADX INFO: renamed from: E */
    public void m135032E() {
        this.f112117k.progressDismiss();
        this.f112111e.setText("");
        this.f112110d.setText(this.f112117k.getString(R$string.f27969z3, 60));
        m135029v();
    }

    /* JADX INFO: renamed from: F */
    public void m135033F(String str) {
        this.f112109c.setText(str);
    }

    /* JADX INFO: renamed from: G */
    public void m135034G() {
        this.f112111e.requestFocus();
        act().showInput(this.f112111e, 0);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f112117k;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m135035k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m135035k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j960.m140546b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m135036l() {
        act().hideInput();
        e51.m114746K(act().getLocalClassName());
        act().progressDismiss();
        act().m50458m2();
        lsi0.m151594x(R$string.f27954x0, false);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(z860 z860Var) {
        this.f112116j = z860Var;
    }

    /* JADX INFO: renamed from: n */
    public void m135038n(Throwable th) {
        act().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: p */
    public int m135039p() {
        return yij0.m214931I(this.f112111e);
    }

    /* JADX INFO: renamed from: q */
    public void m135040q(Throwable th) {
        xdl0.m208411y(this.f112110d, true);
        this.f112117k.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: r */
    public void m135041r() {
        this.f112107a.setTitle(R$string.f27906p0);
        this.f112107a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.a960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68117a.m135030y(view);
            }
        });
        this.f112110d.setOnClickListener(new View.OnClickListener() { // from class: l.b960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74202a.m135031z(view);
            }
        });
        this.f112112f.m223128I(false).subscribe(mkd0.m154955G(new e30() { // from class: l.c960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79866a.m135018A((CharSequence) obj);
            }
        }));
        this.f112111e.m223128I(false).subscribe(mkd0.m154955G(new e30() { // from class: l.d960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84937a.m135019B((CharSequence) obj);
            }
        }));
        xdl0.m208411y(this.f112115i, false);
        if (e51.m114737B(this.f112117k.getLocalClassName())) {
            this.f112116j.f202107c = true;
            m135029v();
        } else {
            xdl0.m208411y(this.f112110d, true);
            xdl0.m208345M0(this.f112108b, false);
        }
        this.f112115i.setOnClickListener(new View.OnClickListener() { // from class: l.e960
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89924a.m135020C(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public String m135042s() {
        return this.f112112f.getText().toString().trim();
    }

    /* JADX INFO: renamed from: u */
    public final void m135043u() {
        xdl0.m208411y(this.f112115i, this.f112116j.f202107c && this.f112112f.getError() == null && this.f112111e.getError() == null && !TextUtils.isEmpty(this.f112112f.getText()) && this.f112112f.getText().length() >= CoreModule.m29931H().mo28159N9() && !TextUtils.isEmpty(this.f112111e.getText()) && this.f112111e.getText().length() == 4);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m135044w(Long l2) {
        this.f112110d.setText(this.f112117k.getString(R$string.f27969z3, Long.valueOf(59 - l2.longValue())));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m135045x() {
        xdl0.m208411y(this.f112110d, true);
        xdl0.m208345M0(this.f112108b, false);
        this.f112110d.setTextColor(this.f112117k.getResources().getColor(c1c0.f78258o));
        this.f112110d.setText(this.f112117k.getString(R$string.f27714F3));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
