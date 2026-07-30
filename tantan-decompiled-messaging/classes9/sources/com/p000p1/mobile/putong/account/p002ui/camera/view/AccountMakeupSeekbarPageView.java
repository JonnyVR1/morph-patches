package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.t;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountCameraEffectMgr;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountMakeupSharedViewModel;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.n250;
import l.xaj0;
import l.xdl0;
import p006l.C1188qs;
import p006l.C1354us;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMakeupSeekbarPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupSeekbarPageView f861a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f862b;

    /* JADX INFO: renamed from: c */
    public View f863c;

    /* JADX INFO: renamed from: d */
    public AccountTextSeekBar f864d;

    /* JADX INFO: renamed from: e */
    public VText f865e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f866f;

    /* JADX INFO: renamed from: g */
    public VImage f867g;

    /* JADX INFO: renamed from: h */
    public AccountTextSeekBar f868h;

    /* JADX INFO: renamed from: i */
    public VText f869i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f870j;

    /* JADX INFO: renamed from: k */
    public e30<Float> f871k;

    /* JADX INFO: renamed from: l */
    public e30<Float> f872l;

    /* JADX INFO: renamed from: m */
    public boolean f873m;

    /* JADX INFO: renamed from: n */
    public AccountMakeupSharedViewModel f874n;

    /* JADX INFO: renamed from: o */
    public boolean f875o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeupSeekbarPageView$a */
    public class C0088a implements AccountTextSeekBar.InterfaceC0091a {
        public C0088a() {
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: a */
        public void mo886a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (z) {
                float fM991g = AccountMakeupSeekbarPageView.this.m991g(i);
                AccountMakeupSeekbarPageView.this.f864d.setText(String.valueOf((int) (100.0f * fM991g)));
                AccountCameraEffectMgr.m597V().m623X().m677m(new Pair<>(Float.valueOf(fM991g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: b */
        public void mo887b(AccountTextSeekBar accountTextSeekBar) {
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: c */
        public void mo888c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeupSeekbarPageView$b */
    public class C0089b implements AccountTextSeekBar.InterfaceC0091a {
        public C0089b() {
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: a */
        public void mo886a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (z) {
                float fM991g = AccountMakeupSeekbarPageView.this.m991g(i);
                AccountMakeupSeekbarPageView.this.f868h.setText(String.valueOf((int) (100.0f * fM991g)));
                AccountCameraEffectMgr.m597V().m623X().m675k(new Pair<>(Float.valueOf(fM991g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: b */
        public void mo887b(AccountTextSeekBar accountTextSeekBar) {
        }

        @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.AccountTextSeekBar.InterfaceC0091a
        /* JADX INFO: renamed from: c */
        public void mo888c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    public AccountMakeupSeekbarPageView(Context context) {
        super(context);
        this.f873m = false;
        this.f875o = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m989e(View view) {
        C1354us.m25560a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m990f() {
        return getContext();
    }

    /* JADX INFO: renamed from: g */
    public final float m991g(int i) {
        return this.f873m ? AccountCameraEffectMgr.m600s(i) : AccountCameraEffectMgr.m595I(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public void m992h() {
        this.f867g.setOnTouchListener(new View.OnTouchListener() { // from class: l.ss
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f21629a.m995k(view, motionEvent);
            }
        });
        this.f864d.setOnSeekBarChangeListener(new C0088a());
        this.f868h.setOnSeekBarChangeListener(new C0089b());
        AccountCameraEffectMgr.m597V().m623X().m672h().i(m990f(), new n250() { // from class: l.ts
            public final void onChanged(Object obj) {
                this.f22254a.m996l((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m993i() {
        if (this.f875o) {
            return;
        }
        this.f874n.m671g().i(m990f(), new n250() { // from class: l.rs
            public final void onChanged(Object obj) {
                this.f20695a.m997m((Pair) obj);
            }
        });
        this.f875o = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m994j() {
        this.f874n = (AccountMakeupSharedViewModel) new t(m990f()).a(AccountMakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m995k(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && NullChecker.a(this.f870j)) {
                this.f870j.call(Boolean.TRUE);
            }
        } else if (NullChecker.a(this.f870j)) {
            this.f870j.call(Boolean.FALSE);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m996l(xaj0 xaj0Var) {
        this.f873m = ((Boolean) xaj0Var.a).booleanValue();
        int iFloatValue = (int) (((Float) xaj0Var.b).floatValue() * 100.0f);
        this.f868h.setText(String.valueOf((int) (((Float) xaj0Var.c).floatValue() * 100.0f)));
        this.f864d.setText(String.valueOf(iFloatValue));
        int iM602u = AccountCameraEffectMgr.m602u(this.f873m, ((Float) xaj0Var.b).floatValue());
        this.f868h.setProgress(AccountCameraEffectMgr.m602u(this.f873m, ((Float) xaj0Var.c).floatValue()));
        this.f864d.setProgress(iM602u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m997m(Pair pair) {
        m1001q(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: n */
    public void m998n() {
        xdl0.M0(this.f862b, false);
        xdl0.M0(this.f866f, true);
        xdl0.M0(this.f867g, true);
        xdl0.M0(this.f868h, false);
        xdl0.M0(this.f869i, false);
        this.f873m = false;
        m992h();
    }

    /* JADX INFO: renamed from: o */
    public void m999o(C1188qs.b bVar) {
        xdl0.M0(this.f862b, false);
        xdl0.M0(this.f866f, true);
        xdl0.M0(this.f867g, true);
        xdl0.M0(this.f868h, true);
        xdl0.M0(this.f869i, false);
        this.f873m = bVar.f20000d;
        this.f868h.setText(String.valueOf((int) (bVar.f19998b * 100.0f)));
        this.f868h.setProgress(AccountCameraEffectMgr.m602u(bVar.f20000d, bVar.f19998b));
        m992h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m989e(this);
        m994j();
    }

    /* JADX INFO: renamed from: p */
    public void m1000p(C1188qs.b bVar) {
        xdl0.M0(this.f862b, false);
        xdl0.M0(this.f866f, true);
        xdl0.M0(this.f867g, true);
        xdl0.M0(this.f868h, true ^ bVar.f19999c);
        xdl0.M0(this.f869i, false);
        this.f873m = false;
        this.f868h.setText(String.valueOf((int) (bVar.f19998b * 100.0f)));
        this.f868h.setProgress(AccountCameraEffectMgr.m602u(bVar.f20000d, bVar.f19998b));
        m992h();
    }

    /* JADX INFO: renamed from: q */
    public final void m1001q(int i, int i2) {
        if (i != ((Integer) getTag()).intValue()) {
            return;
        }
        if (i2 == 0) {
            xdl0.M0(this.f862b, false);
            xdl0.M0(this.f866f, true);
            xdl0.M0(this.f868h, false);
            xdl0.M0(this.f869i, false);
            return;
        }
        if (i2 == 1) {
            xdl0.M0(this.f862b, false);
            xdl0.M0(this.f866f, true);
            xdl0.M0(this.f868h, true);
            xdl0.M0(this.f869i, false);
            return;
        }
        if (i2 != 2) {
            return;
        }
        xdl0.M0(this.f862b, true);
        xdl0.M0(this.f866f, true);
        xdl0.M0(this.f868h, true);
        xdl0.M0(this.f869i, true);
    }

    /* JADX INFO: renamed from: r */
    public void m1002r(C1188qs.b bVar) {
        xdl0.M0(this.f862b, false);
        xdl0.M0(this.f866f, true);
        xdl0.M0(this.f867g, true);
        xdl0.M0(this.f868h, true);
        xdl0.M0(this.f869i, false);
        boolean z = bVar.f20000d;
        this.f873m = z;
        float f = bVar.f19998b;
        int i = (int) (100.0f * f);
        this.f868h.setProgress(AccountCameraEffectMgr.m602u(z, f));
        this.f868h.setText(String.valueOf(i));
        m992h();
    }

    /* JADX INFO: renamed from: s */
    public void m1003s(C1188qs.b bVar) {
        xdl0.M0(this.f862b, !bVar.f19999c);
        xdl0.M0(this.f866f, true);
        xdl0.M0(this.f867g, true);
        xdl0.M0(this.f868h, !bVar.f19999c);
        xdl0.M0(this.f869i, !bVar.f19999c);
        this.f873m = bVar.f20000d;
        int i = (int) (bVar.f19997a * 100.0f);
        this.f868h.setText(String.valueOf((int) (bVar.f19998b * 100.0f)));
        this.f864d.setText(String.valueOf(i));
        int iM602u = AccountCameraEffectMgr.m602u(bVar.f20000d, bVar.f19997a);
        this.f868h.setProgress(AccountCameraEffectMgr.m602u(bVar.f20000d, bVar.f19998b));
        this.f864d.setProgress(iM602u);
        m992h();
    }

    public void setOnAllSeekbarChanged(e30<Float> e30Var) {
        this.f872l = e30Var;
    }

    public void setOnLutSeekbarChanged(e30<Float> e30Var) {
        this.f871k = e30Var;
    }

    public void setOnResetItemClick(e30<Boolean> e30Var) {
        this.f870j = e30Var;
    }

    public AccountMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f873m = false;
        this.f875o = false;
    }

    public AccountMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f873m = false;
        this.f875o = false;
    }
}
