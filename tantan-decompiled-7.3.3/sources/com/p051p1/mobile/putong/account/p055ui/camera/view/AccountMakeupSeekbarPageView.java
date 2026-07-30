package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0491t;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountCameraEffectMgr;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountMakeupSharedViewModel;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.C18249ks;
import p153l.C19203os;
import p153l.bkj0;
import p153l.bnl0;
import p153l.cb50;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeupSeekbarPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AccountMakeupSeekbarPageView f17591a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f17592b;

    /* JADX INFO: renamed from: c */
    public View f17593c;

    /* JADX INFO: renamed from: d */
    public AccountTextSeekBar f17594d;

    /* JADX INFO: renamed from: e */
    public VText f17595e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f17596f;

    /* JADX INFO: renamed from: g */
    public VImage f17597g;

    /* JADX INFO: renamed from: h */
    public AccountTextSeekBar f17598h;

    /* JADX INFO: renamed from: i */
    public VText f17599i;

    /* JADX INFO: renamed from: j */
    public y20<Boolean> f17600j;

    /* JADX INFO: renamed from: k */
    public y20<Float> f17601k;

    /* JADX INFO: renamed from: l */
    public y20<Float> f17602l;

    /* JADX INFO: renamed from: m */
    public boolean f17603m;

    /* JADX INFO: renamed from: n */
    public AccountMakeupSharedViewModel f17604n;

    /* JADX INFO: renamed from: o */
    public boolean f17605o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeupSeekbarPageView$a */
    public class C4813a implements AccountTextSeekBar.InterfaceC4816a {
        public C4813a() {
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: a */
        public void mo29979a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (z) {
                float fM30084g = AccountMakeupSeekbarPageView.this.m30084g(i);
                AccountMakeupSeekbarPageView.this.f17594d.setText(String.valueOf((int) (100.0f * fM30084g)));
                AccountCameraEffectMgr.m29697V().m29723X().m29777m(new Pair<>(Float.valueOf(fM30084g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: b */
        public void mo29980b(AccountTextSeekBar accountTextSeekBar) {
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: c */
        public void mo29981c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeupSeekbarPageView$b */
    public class C4814b implements AccountTextSeekBar.InterfaceC4816a {
        public C4814b() {
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: a */
        public void mo29979a(AccountTextSeekBar accountTextSeekBar, int i, boolean z) {
            if (z) {
                float fM30084g = AccountMakeupSeekbarPageView.this.m30084g(i);
                AccountMakeupSeekbarPageView.this.f17598h.setText(String.valueOf((int) (100.0f * fM30084g)));
                AccountCameraEffectMgr.m29697V().m29723X().m29775k(new Pair<>(Float.valueOf(fM30084g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: b */
        public void mo29980b(AccountTextSeekBar accountTextSeekBar) {
        }

        @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.AccountTextSeekBar.InterfaceC4816a
        /* JADX INFO: renamed from: c */
        public void mo29981c(AccountTextSeekBar accountTextSeekBar) {
        }
    }

    public AccountMakeupSeekbarPageView(Context context) {
        super(context);
        this.f17603m = false;
        this.f17605o = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m30082e(View view) {
        C19203os.m168956a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m30083f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final float m30084g(int i) {
        return this.f17603m ? AccountCameraEffectMgr.m29700s(i) : AccountCameraEffectMgr.m29695I(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public void m30085h() {
        this.f17597g.setOnTouchListener(new View.OnTouchListener() { // from class: l.ms
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f138434a.m30088k(view, motionEvent);
            }
        });
        this.f17594d.setOnSeekBarChangeListener(new C4813a());
        this.f17598h.setOnSeekBarChangeListener(new C4814b());
        AccountCameraEffectMgr.m29697V().m29723X().m29772h().m2984i(m30083f(), new cb50() { // from class: l.ns
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f143451a.m30089l((bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m30086i() {
        if (this.f17605o) {
            return;
        }
        this.f17604n.m29771g().m2984i(m30083f(), new cb50() { // from class: l.ls
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f133379a.m30090m((Pair) obj);
            }
        });
        this.f17605o = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m30087j() {
        this.f17604n = (AccountMakeupSharedViewModel) new C0491t(m30083f()).m3074a(AccountMakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m30088k(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && NullChecker.m82486a(this.f17600j)) {
                this.f17600j.call(Boolean.TRUE);
            }
        } else if (NullChecker.m82486a(this.f17600j)) {
            this.f17600j.call(Boolean.FALSE);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m30089l(bkj0 bkj0Var) {
        this.f17603m = ((Boolean) bkj0Var.f77081a).booleanValue();
        int iFloatValue = (int) (((Float) bkj0Var.f77082b).floatValue() * 100.0f);
        this.f17598h.setText(String.valueOf((int) (((Float) bkj0Var.f77083c).floatValue() * 100.0f)));
        this.f17594d.setText(String.valueOf(iFloatValue));
        int iM29702u = AccountCameraEffectMgr.m29702u(this.f17603m, ((Float) bkj0Var.f77082b).floatValue());
        this.f17598h.setProgress(AccountCameraEffectMgr.m29702u(this.f17603m, ((Float) bkj0Var.f77083c).floatValue()));
        this.f17594d.setProgress(iM29702u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m30090m(Pair pair) {
        m30094q(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: n */
    public void m30091n() {
        bnl0.m105525M0(this.f17592b, false);
        bnl0.m105525M0(this.f17596f, true);
        bnl0.m105525M0(this.f17597g, true);
        bnl0.m105525M0(this.f17598h, false);
        bnl0.m105525M0(this.f17599i, false);
        this.f17603m = false;
        m30085h();
    }

    /* JADX INFO: renamed from: o */
    public void m30092o(C18249ks.b bVar) {
        bnl0.m105525M0(this.f17592b, false);
        bnl0.m105525M0(this.f17596f, true);
        bnl0.m105525M0(this.f17597g, true);
        bnl0.m105525M0(this.f17598h, true);
        bnl0.m105525M0(this.f17599i, false);
        this.f17603m = bVar.f128519d;
        this.f17598h.setText(String.valueOf((int) (bVar.f128517b * 100.0f)));
        this.f17598h.setProgress(AccountCameraEffectMgr.m29702u(bVar.f128519d, bVar.f128517b));
        m30085h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30082e(this);
        m30087j();
    }

    /* JADX INFO: renamed from: p */
    public void m30093p(C18249ks.b bVar) {
        bnl0.m105525M0(this.f17592b, false);
        bnl0.m105525M0(this.f17596f, true);
        bnl0.m105525M0(this.f17597g, true);
        bnl0.m105525M0(this.f17598h, true ^ bVar.f128518c);
        bnl0.m105525M0(this.f17599i, false);
        this.f17603m = false;
        this.f17598h.setText(String.valueOf((int) (bVar.f128517b * 100.0f)));
        this.f17598h.setProgress(AccountCameraEffectMgr.m29702u(bVar.f128519d, bVar.f128517b));
        m30085h();
    }

    /* JADX INFO: renamed from: q */
    public final void m30094q(int i, int i2) {
        if (i != ((Integer) getTag()).intValue()) {
            return;
        }
        if (i2 == 0) {
            bnl0.m105525M0(this.f17592b, false);
            bnl0.m105525M0(this.f17596f, true);
            bnl0.m105525M0(this.f17598h, false);
            bnl0.m105525M0(this.f17599i, false);
            return;
        }
        if (i2 == 1) {
            bnl0.m105525M0(this.f17592b, false);
            bnl0.m105525M0(this.f17596f, true);
            bnl0.m105525M0(this.f17598h, true);
            bnl0.m105525M0(this.f17599i, false);
            return;
        }
        if (i2 != 2) {
            return;
        }
        bnl0.m105525M0(this.f17592b, true);
        bnl0.m105525M0(this.f17596f, true);
        bnl0.m105525M0(this.f17598h, true);
        bnl0.m105525M0(this.f17599i, true);
    }

    /* JADX INFO: renamed from: r */
    public void m30095r(C18249ks.b bVar) {
        bnl0.m105525M0(this.f17592b, false);
        bnl0.m105525M0(this.f17596f, true);
        bnl0.m105525M0(this.f17597g, true);
        bnl0.m105525M0(this.f17598h, true);
        bnl0.m105525M0(this.f17599i, false);
        boolean z = bVar.f128519d;
        this.f17603m = z;
        float f = bVar.f128517b;
        int i = (int) (100.0f * f);
        this.f17598h.setProgress(AccountCameraEffectMgr.m29702u(z, f));
        this.f17598h.setText(String.valueOf(i));
        m30085h();
    }

    /* JADX INFO: renamed from: s */
    public void m30096s(C18249ks.b bVar) {
        bnl0.m105525M0(this.f17592b, !bVar.f128518c);
        bnl0.m105525M0(this.f17596f, true);
        bnl0.m105525M0(this.f17597g, true);
        bnl0.m105525M0(this.f17598h, !bVar.f128518c);
        bnl0.m105525M0(this.f17599i, !bVar.f128518c);
        this.f17603m = bVar.f128519d;
        int i = (int) (bVar.f128516a * 100.0f);
        this.f17598h.setText(String.valueOf((int) (bVar.f128517b * 100.0f)));
        this.f17594d.setText(String.valueOf(i));
        int iM29702u = AccountCameraEffectMgr.m29702u(bVar.f128519d, bVar.f128516a);
        this.f17598h.setProgress(AccountCameraEffectMgr.m29702u(bVar.f128519d, bVar.f128517b));
        this.f17594d.setProgress(iM29702u);
        m30085h();
    }

    public void setOnAllSeekbarChanged(y20<Float> y20Var) {
        this.f17602l = y20Var;
    }

    public void setOnLutSeekbarChanged(y20<Float> y20Var) {
        this.f17601k = y20Var;
    }

    public void setOnResetItemClick(y20<Boolean> y20Var) {
        this.f17600j = y20Var;
    }

    public AccountMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17603m = false;
        this.f17605o = false;
    }

    public AccountMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17603m = false;
        this.f17605o = false;
    }
}
