package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0490t;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountCameraEffectMgr;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountMakeupSharedViewModel;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.C19563qs;
import p149l.C20499us;
import p149l.e30;
import p149l.n250;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupSeekbarPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupSeekbarPageView f16872a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f16873b;

    /* JADX INFO: renamed from: c */
    public View f16874c;

    /* JADX INFO: renamed from: d */
    public AccountTextSeekBar f16875d;

    /* JADX INFO: renamed from: e */
    public VText f16876e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f16877f;

    /* JADX INFO: renamed from: g */
    public VImage f16878g;

    /* JADX INFO: renamed from: h */
    public AccountTextSeekBar f16879h;

    /* JADX INFO: renamed from: i */
    public VText f16880i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f16881j;

    /* JADX INFO: renamed from: k */
    public e30<Float> f16882k;

    /* JADX INFO: renamed from: l */
    public e30<Float> f16883l;

    /* JADX INFO: renamed from: m */
    public boolean f16884m;

    /* JADX INFO: renamed from: n */
    public AccountMakeupSharedViewModel f16885n;

    /* JADX INFO: renamed from: o */
    public boolean f16886o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeupSeekbarPageView$a */
    public class C4662a implements AccountTextSeekBar.InterfaceC4665a {
        public C4662a() {
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: a */
        public void mo28980a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (z) {
                float fM29085g = AccountMakeupSeekbarPageView.this.m29085g(i);
                AccountMakeupSeekbarPageView.this.f16875d.setText(String.valueOf((int) (100.0f * fM29085g)));
                AccountCameraEffectMgr.m28698V().m28724X().m28778m(new Pair<>(Float.valueOf(fM29085g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: b */
        public void mo28981b(AccountTextSeekBar accountTextSeekBar) {
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: c */
        public void mo28982c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeupSeekbarPageView$b */
    public class C4663b implements AccountTextSeekBar.InterfaceC4665a {
        public C4663b() {
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: a */
        public void mo28980a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (z) {
                float fM29085g = AccountMakeupSeekbarPageView.this.m29085g(i);
                AccountMakeupSeekbarPageView.this.f16879h.setText(String.valueOf((int) (100.0f * fM29085g)));
                AccountCameraEffectMgr.m28698V().m28724X().m28776k(new Pair<>(Float.valueOf(fM29085g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: b */
        public void mo28981b(AccountTextSeekBar accountTextSeekBar) {
        }

        @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.AccountTextSeekBar.InterfaceC4665a
        /* JADX INFO: renamed from: c */
        public void mo28982c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    public AccountMakeupSeekbarPageView(Context context) {
        super(context);
        this.f16884m = false;
        this.f16886o = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m29083e(View view) {
        C20499us.m195174a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m29084f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final float m29085g(int i) {
        return this.f16884m ? AccountCameraEffectMgr.m28701s(i) : AccountCameraEffectMgr.m28696I(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public void m29086h() {
        this.f16878g.setOnTouchListener(new View.OnTouchListener() { // from class: l.ss
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f166153a.m29089k(view, motionEvent);
            }
        });
        this.f16875d.setOnSeekBarChangeListener(new C4662a());
        this.f16879h.setOnSeekBarChangeListener(new C4663b());
        AccountCameraEffectMgr.m28698V().m28724X().m28773h().m2983i(m29084f(), new n250() { // from class: l.ts
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f171885a.m29090l((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m29087i() {
        if (this.f16886o) {
            return;
        }
        this.f16885n.m28772g().m2983i(m29084f(), new n250() { // from class: l.rs
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f160799a.m29091m((Pair) obj);
            }
        });
        this.f16886o = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m29088j() {
        this.f16885n = (AccountMakeupSharedViewModel) new C0490t(m29084f()).m3073a(AccountMakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m29089k(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && NullChecker.m81303a(this.f16881j)) {
                this.f16881j.call(Boolean.TRUE);
            }
        } else if (NullChecker.m81303a(this.f16881j)) {
            this.f16881j.call(Boolean.FALSE);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m29090l(xaj0 xaj0Var) {
        this.f16884m = ((Boolean) xaj0Var.f191751a).booleanValue();
        int iFloatValue = (int) (((Float) xaj0Var.f191752b).floatValue() * 100.0f);
        this.f16879h.setText(String.valueOf((int) (((Float) xaj0Var.f191753c).floatValue() * 100.0f)));
        this.f16875d.setText(String.valueOf(iFloatValue));
        int iM28703u = AccountCameraEffectMgr.m28703u(this.f16884m, ((Float) xaj0Var.f191752b).floatValue());
        this.f16879h.setProgress(AccountCameraEffectMgr.m28703u(this.f16884m, ((Float) xaj0Var.f191753c).floatValue()));
        this.f16875d.setProgress(iM28703u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m29091m(Pair pair) {
        m29095q(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: n */
    public void m29092n() {
        xdl0.m208345M0(this.f16873b, false);
        xdl0.m208345M0(this.f16877f, true);
        xdl0.m208345M0(this.f16878g, true);
        xdl0.m208345M0(this.f16879h, false);
        xdl0.m208345M0(this.f16880i, false);
        this.f16884m = false;
        m29086h();
    }

    /* JADX INFO: renamed from: o */
    public void m29093o(C19563qs.b bVar) {
        xdl0.m208345M0(this.f16873b, false);
        xdl0.m208345M0(this.f16877f, true);
        xdl0.m208345M0(this.f16878g, true);
        xdl0.m208345M0(this.f16879h, true);
        xdl0.m208345M0(this.f16880i, false);
        this.f16884m = bVar.f156082d;
        this.f16879h.setText(String.valueOf((int) (bVar.f156080b * 100.0f)));
        this.f16879h.setProgress(AccountCameraEffectMgr.m28703u(bVar.f156082d, bVar.f156080b));
        m29086h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29083e(this);
        m29088j();
    }

    /* JADX INFO: renamed from: p */
    public void m29094p(C19563qs.b bVar) {
        xdl0.m208345M0(this.f16873b, false);
        xdl0.m208345M0(this.f16877f, true);
        xdl0.m208345M0(this.f16878g, true);
        xdl0.m208345M0(this.f16879h, true ^ bVar.f156081c);
        xdl0.m208345M0(this.f16880i, false);
        this.f16884m = false;
        this.f16879h.setText(String.valueOf((int) (bVar.f156080b * 100.0f)));
        this.f16879h.setProgress(AccountCameraEffectMgr.m28703u(bVar.f156082d, bVar.f156080b));
        m29086h();
    }

    /* JADX INFO: renamed from: q */
    public final void m29095q(int i, int i2) {
        if (i != ((Integer) getTag()).intValue()) {
            return;
        }
        if (i2 == 0) {
            xdl0.m208345M0(this.f16873b, false);
            xdl0.m208345M0(this.f16877f, true);
            xdl0.m208345M0(this.f16879h, false);
            xdl0.m208345M0(this.f16880i, false);
            return;
        }
        if (i2 == 1) {
            xdl0.m208345M0(this.f16873b, false);
            xdl0.m208345M0(this.f16877f, true);
            xdl0.m208345M0(this.f16879h, true);
            xdl0.m208345M0(this.f16880i, false);
            return;
        }
        if (i2 != 2) {
            return;
        }
        xdl0.m208345M0(this.f16873b, true);
        xdl0.m208345M0(this.f16877f, true);
        xdl0.m208345M0(this.f16879h, true);
        xdl0.m208345M0(this.f16880i, true);
    }

    /* JADX INFO: renamed from: r */
    public void m29096r(C19563qs.b bVar) {
        xdl0.m208345M0(this.f16873b, false);
        xdl0.m208345M0(this.f16877f, true);
        xdl0.m208345M0(this.f16878g, true);
        xdl0.m208345M0(this.f16879h, true);
        xdl0.m208345M0(this.f16880i, false);
        boolean z = bVar.f156082d;
        this.f16884m = z;
        float f = bVar.f156080b;
        int i = (int) (100.0f * f);
        this.f16879h.setProgress(AccountCameraEffectMgr.m28703u(z, f));
        this.f16879h.setText(String.valueOf(i));
        m29086h();
    }

    /* JADX INFO: renamed from: s */
    public void m29097s(C19563qs.b bVar) {
        xdl0.m208345M0(this.f16873b, !bVar.f156081c);
        xdl0.m208345M0(this.f16877f, true);
        xdl0.m208345M0(this.f16878g, true);
        xdl0.m208345M0(this.f16879h, !bVar.f156081c);
        xdl0.m208345M0(this.f16880i, !bVar.f156081c);
        this.f16884m = bVar.f156082d;
        int i = (int) (bVar.f156079a * 100.0f);
        this.f16879h.setText(String.valueOf((int) (bVar.f156080b * 100.0f)));
        this.f16875d.setText(String.valueOf(i));
        int iM28703u = AccountCameraEffectMgr.m28703u(bVar.f156082d, bVar.f156079a);
        this.f16879h.setProgress(AccountCameraEffectMgr.m28703u(bVar.f156082d, bVar.f156080b));
        this.f16875d.setProgress(iM28703u);
        m29086h();
    }

    public void setOnAllSeekbarChanged(e30<Float> e30Var) {
        this.f16883l = e30Var;
    }

    public void setOnLutSeekbarChanged(e30<Float> e30Var) {
        this.f16882k = e30Var;
    }

    public void setOnResetItemClick(e30<Boolean> e30Var) {
        this.f16881j = e30Var;
    }

    public AccountMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16884m = false;
        this.f16886o = false;
    }

    public AccountMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16884m = false;
        this.f16886o = false;
    }
}
