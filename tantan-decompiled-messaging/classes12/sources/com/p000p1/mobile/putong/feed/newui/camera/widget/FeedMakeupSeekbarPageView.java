package com.p000p1.mobile.putong.feed.newui.camera.widget;

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
import com.p000p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p000p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.n250;
import l.xaj0;
import l.xdl0;
import p007l.tch;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMakeupSeekbarPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupSeekbarPageView f1084a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f1085b;

    /* JADX INFO: renamed from: c */
    public View f1086c;

    /* JADX INFO: renamed from: d */
    public FeedTextSeekBar f1087d;

    /* JADX INFO: renamed from: e */
    public VText f1088e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f1089f;

    /* JADX INFO: renamed from: g */
    public VImage f1090g;

    /* JADX INFO: renamed from: h */
    public FeedTextSeekBar f1091h;

    /* JADX INFO: renamed from: i */
    public VText f1092i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f1093j;

    /* JADX INFO: renamed from: k */
    public e30<Float> f1094k;

    /* JADX INFO: renamed from: l */
    public e30<Float> f1095l;

    /* JADX INFO: renamed from: m */
    public boolean f1096m;

    /* JADX INFO: renamed from: n */
    public MakeupSharedViewModel f1097n;

    /* JADX INFO: renamed from: o */
    public boolean f1098o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView$a */
    public class C2012a implements FeedTextSeekBar.InterfaceC2014a {
        public C2012a() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: a */
        public void mo2510a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (z) {
                float fM2497g = FeedMakeupSeekbarPageView.this.m2497g(i);
                FeedMakeupSeekbarPageView.this.f1087d.setText(String.valueOf((int) (100.0f * fM2497g)));
                CameraEffectMgr.m2289V().m2315X().m2820m(new Pair<>(Float.valueOf(fM2497g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: b */
        public void mo2511b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: c */
        public void mo2512c(FeedTextSeekBar feedTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView$b */
    public class C2013b implements FeedTextSeekBar.InterfaceC2014a {
        public C2013b() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: a */
        public void mo2510a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (z) {
                float fM2497g = FeedMakeupSeekbarPageView.this.m2497g(i);
                FeedMakeupSeekbarPageView.this.f1091h.setText(String.valueOf((int) (100.0f * fM2497g)));
                CameraEffectMgr.m2289V().m2315X().m2818k(new Pair<>(Float.valueOf(fM2497g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: b */
        public void mo2511b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC2014a
        /* JADX INFO: renamed from: c */
        public void mo2512c(FeedTextSeekBar feedTextSeekBar) {
        }
    }

    public FeedMakeupSeekbarPageView(Context context) {
        super(context);
        this.f1096m = false;
        this.f1098o = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m2495e(View view) {
        tch.m14481a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m2496f() {
        return getContext();
    }

    /* JADX INFO: renamed from: g */
    public final float m2497g(int i) {
        return this.f1096m ? CameraEffectMgr.m2292s(i) : CameraEffectMgr.m2287I(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public void m2498h() {
        this.f1090g.setOnTouchListener(new View.OnTouchListener() { // from class: l.rch
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f12592a.m2501k(view, motionEvent);
            }
        });
        this.f1087d.setOnSeekBarChangeListener(new C2012a());
        this.f1091h.setOnSeekBarChangeListener(new C2013b());
        CameraEffectMgr.m2289V().m2315X().m2815h().i(m2496f(), new n250() { // from class: l.sch
            public final void onChanged(Object obj) {
                this.f12887a.m2502l((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m2499i() {
        if (this.f1098o) {
            return;
        }
        this.f1097n.m2814g().i(m2496f(), new n250() { // from class: l.qch
            public final void onChanged(Object obj) {
                this.f12206a.m2503m((Pair) obj);
            }
        });
        this.f1098o = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m2500j() {
        this.f1097n = (MakeupSharedViewModel) new t(m2496f()).a(MakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m2501k(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && NullChecker.a(this.f1093j)) {
                this.f1093j.call(Boolean.TRUE);
            }
        } else if (NullChecker.a(this.f1093j)) {
            this.f1093j.call(Boolean.FALSE);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2502l(xaj0 xaj0Var) {
        this.f1096m = ((Boolean) xaj0Var.a).booleanValue();
        int iFloatValue = (int) (((Float) xaj0Var.b).floatValue() * 100.0f);
        this.f1091h.setText(String.valueOf((int) (((Float) xaj0Var.c).floatValue() * 100.0f)));
        this.f1087d.setText(String.valueOf(iFloatValue));
        int iM2294u = CameraEffectMgr.m2294u(this.f1096m, ((Float) xaj0Var.b).floatValue());
        this.f1091h.setProgress(CameraEffectMgr.m2294u(this.f1096m, ((Float) xaj0Var.c).floatValue()));
        this.f1087d.setProgress(iM2294u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2503m(Pair pair) {
        m2507q(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: n */
    public void m2504n() {
        xdl0.M0(this.f1085b, false);
        xdl0.M0(this.f1089f, true);
        xdl0.M0(this.f1090g, true);
        xdl0.M0(this.f1091h, false);
        xdl0.M0(this.f1092i, false);
        this.f1096m = false;
        m2498h();
    }

    /* JADX INFO: renamed from: o */
    public void m2505o(C2033f.b bVar) {
        xdl0.M0(this.f1085b, false);
        xdl0.M0(this.f1089f, true);
        xdl0.M0(this.f1090g, true);
        xdl0.M0(this.f1091h, true);
        xdl0.M0(this.f1092i, false);
        this.f1096m = bVar.f1345d;
        this.f1091h.setText(String.valueOf((int) (bVar.f1343b * 100.0f)));
        this.f1091h.setProgress(CameraEffectMgr.m2294u(bVar.f1345d, bVar.f1343b));
        m2498h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2495e(this);
        m2500j();
    }

    /* JADX INFO: renamed from: p */
    public void m2506p(C2033f.b bVar) {
        xdl0.M0(this.f1085b, false);
        xdl0.M0(this.f1089f, true);
        xdl0.M0(this.f1090g, true);
        xdl0.M0(this.f1091h, true ^ bVar.f1344c);
        xdl0.M0(this.f1092i, false);
        this.f1096m = false;
        this.f1091h.setText(String.valueOf((int) (bVar.f1343b * 100.0f)));
        this.f1091h.setProgress(CameraEffectMgr.m2294u(bVar.f1345d, bVar.f1343b));
        m2498h();
    }

    /* JADX INFO: renamed from: q */
    public final void m2507q(int i, int i2) {
        if (i != ((Integer) getTag()).intValue()) {
            return;
        }
        if (i2 == 0) {
            xdl0.M0(this.f1085b, false);
            xdl0.M0(this.f1089f, true);
            xdl0.M0(this.f1091h, false);
            xdl0.M0(this.f1092i, false);
            return;
        }
        if (i2 == 1) {
            xdl0.M0(this.f1085b, false);
            xdl0.M0(this.f1089f, true);
            xdl0.M0(this.f1091h, true);
            xdl0.M0(this.f1092i, false);
            return;
        }
        if (i2 != 2) {
            return;
        }
        xdl0.M0(this.f1085b, true);
        xdl0.M0(this.f1089f, true);
        xdl0.M0(this.f1091h, true);
        xdl0.M0(this.f1092i, true);
    }

    /* JADX INFO: renamed from: r */
    public void m2508r(C2033f.b bVar) {
        xdl0.M0(this.f1085b, false);
        xdl0.M0(this.f1089f, true);
        xdl0.M0(this.f1090g, true);
        xdl0.M0(this.f1091h, true);
        xdl0.M0(this.f1092i, false);
        boolean z = bVar.f1345d;
        this.f1096m = z;
        float f = bVar.f1343b;
        int i = (int) (100.0f * f);
        this.f1091h.setProgress(CameraEffectMgr.m2294u(z, f));
        this.f1091h.setText(String.valueOf(i));
        m2498h();
    }

    /* JADX INFO: renamed from: s */
    public void m2509s(C2033f.b bVar) {
        xdl0.M0(this.f1085b, !bVar.f1344c);
        xdl0.M0(this.f1089f, true);
        xdl0.M0(this.f1090g, true);
        xdl0.M0(this.f1091h, !bVar.f1344c);
        xdl0.M0(this.f1092i, !bVar.f1344c);
        this.f1096m = bVar.f1345d;
        int i = (int) (bVar.f1342a * 100.0f);
        this.f1091h.setText(String.valueOf((int) (bVar.f1343b * 100.0f)));
        this.f1087d.setText(String.valueOf(i));
        int iM2294u = CameraEffectMgr.m2294u(bVar.f1345d, bVar.f1342a);
        this.f1091h.setProgress(CameraEffectMgr.m2294u(bVar.f1345d, bVar.f1343b));
        this.f1087d.setProgress(iM2294u);
        m2498h();
    }

    public void setOnAllSeekbarChanged(e30<Float> e30Var) {
        this.f1095l = e30Var;
    }

    public void setOnLutSeekbarChanged(e30<Float> e30Var) {
        this.f1094k = e30Var;
    }

    public void setOnResetItemClick(e30<Boolean> e30Var) {
        this.f1093j = e30Var;
    }

    public FeedMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1096m = false;
        this.f1098o = false;
    }

    public FeedMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1096m = false;
        this.f1098o = false;
    }
}
