package com.p046p1.mobile.putong.feed.newui.camera.widget;

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
import com.p046p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p046p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.n250;
import p149l.tch;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMakeupSeekbarPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupSeekbarPageView f39623a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f39624b;

    /* JADX INFO: renamed from: c */
    public View f39625c;

    /* JADX INFO: renamed from: d */
    public FeedTextSeekBar f39626d;

    /* JADX INFO: renamed from: e */
    public VText f39627e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f39628f;

    /* JADX INFO: renamed from: g */
    public VImage f39629g;

    /* JADX INFO: renamed from: h */
    public FeedTextSeekBar f39630h;

    /* JADX INFO: renamed from: i */
    public VText f39631i;

    /* JADX INFO: renamed from: j */
    public e30<Boolean> f39632j;

    /* JADX INFO: renamed from: k */
    public e30<Float> f39633k;

    /* JADX INFO: renamed from: l */
    public e30<Float> f39634l;

    /* JADX INFO: renamed from: m */
    public boolean f39635m;

    /* JADX INFO: renamed from: n */
    public MakeupSharedViewModel f39636n;

    /* JADX INFO: renamed from: o */
    public boolean f39637o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView$a */
    public class C11168a implements FeedTextSeekBar.InterfaceC11170a {
        public C11168a() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: a */
        public void mo61558a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (z) {
                float fM61545g = FeedMakeupSeekbarPageView.this.m61545g(i);
                FeedMakeupSeekbarPageView.this.f39626d.setText(String.valueOf((int) (100.0f * fM61545g)));
                CameraEffectMgr.m61340V().m61366X().m61853m(new Pair<>(Float.valueOf(fM61545g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: b */
        public void mo61559b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: c */
        public void mo61560c(FeedTextSeekBar feedTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView$b */
    public class C11169b implements FeedTextSeekBar.InterfaceC11170a {
        public C11169b() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: a */
        public void mo61558a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (z) {
                float fM61545g = FeedMakeupSeekbarPageView.this.m61545g(i);
                FeedMakeupSeekbarPageView.this.f39630h.setText(String.valueOf((int) (100.0f * fM61545g)));
                CameraEffectMgr.m61340V().m61366X().m61851k(new Pair<>(Float.valueOf(fM61545g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: b */
        public void mo61559b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11170a
        /* JADX INFO: renamed from: c */
        public void mo61560c(FeedTextSeekBar feedTextSeekBar) {
        }
    }

    public FeedMakeupSeekbarPageView(Context context) {
        super(context);
        this.f39635m = false;
        this.f39637o = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m61543e(View view) {
        tch.m187986a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m61544f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final float m61545g(int i) {
        return this.f39635m ? CameraEffectMgr.m61343s(i) : CameraEffectMgr.m61338I(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public void m61546h() {
        this.f39629g.setOnTouchListener(new View.OnTouchListener() { // from class: l.rch
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f158772a.m61549k(view, motionEvent);
            }
        });
        this.f39626d.setOnSeekBarChangeListener(new C11168a());
        this.f39630h.setOnSeekBarChangeListener(new C11169b());
        CameraEffectMgr.m61340V().m61366X().m61848h().m2983i(m61544f(), new n250() { // from class: l.sch
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f163730a.m61550l((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m61547i() {
        if (this.f39637o) {
            return;
        }
        this.f39636n.m61847g().m2983i(m61544f(), new n250() { // from class: l.qch
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f153755a.m61551m((Pair) obj);
            }
        });
        this.f39637o = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m61548j() {
        this.f39636n = (MakeupSharedViewModel) new C0490t(m61544f()).m3073a(MakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m61549k(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && NullChecker.m81303a(this.f39632j)) {
                this.f39632j.call(Boolean.TRUE);
            }
        } else if (NullChecker.m81303a(this.f39632j)) {
            this.f39632j.call(Boolean.FALSE);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m61550l(xaj0 xaj0Var) {
        this.f39635m = ((Boolean) xaj0Var.f191751a).booleanValue();
        int iFloatValue = (int) (((Float) xaj0Var.f191752b).floatValue() * 100.0f);
        this.f39630h.setText(String.valueOf((int) (((Float) xaj0Var.f191753c).floatValue() * 100.0f)));
        this.f39626d.setText(String.valueOf(iFloatValue));
        int iM61345u = CameraEffectMgr.m61345u(this.f39635m, ((Float) xaj0Var.f191752b).floatValue());
        this.f39630h.setProgress(CameraEffectMgr.m61345u(this.f39635m, ((Float) xaj0Var.f191753c).floatValue()));
        this.f39626d.setProgress(iM61345u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m61551m(Pair pair) {
        m61555q(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: n */
    public void m61552n() {
        xdl0.m208345M0(this.f39624b, false);
        xdl0.m208345M0(this.f39628f, true);
        xdl0.m208345M0(this.f39629g, true);
        xdl0.m208345M0(this.f39630h, false);
        xdl0.m208345M0(this.f39631i, false);
        this.f39635m = false;
        m61546h();
    }

    /* JADX INFO: renamed from: o */
    public void m61553o(C11189f.b bVar) {
        xdl0.m208345M0(this.f39624b, false);
        xdl0.m208345M0(this.f39628f, true);
        xdl0.m208345M0(this.f39629g, true);
        xdl0.m208345M0(this.f39630h, true);
        xdl0.m208345M0(this.f39631i, false);
        this.f39635m = bVar.f39884d;
        this.f39630h.setText(String.valueOf((int) (bVar.f39882b * 100.0f)));
        this.f39630h.setProgress(CameraEffectMgr.m61345u(bVar.f39884d, bVar.f39882b));
        m61546h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61543e(this);
        m61548j();
    }

    /* JADX INFO: renamed from: p */
    public void m61554p(C11189f.b bVar) {
        xdl0.m208345M0(this.f39624b, false);
        xdl0.m208345M0(this.f39628f, true);
        xdl0.m208345M0(this.f39629g, true);
        xdl0.m208345M0(this.f39630h, true ^ bVar.f39883c);
        xdl0.m208345M0(this.f39631i, false);
        this.f39635m = false;
        this.f39630h.setText(String.valueOf((int) (bVar.f39882b * 100.0f)));
        this.f39630h.setProgress(CameraEffectMgr.m61345u(bVar.f39884d, bVar.f39882b));
        m61546h();
    }

    /* JADX INFO: renamed from: q */
    public final void m61555q(int i, int i2) {
        if (i != ((Integer) getTag()).intValue()) {
            return;
        }
        if (i2 == 0) {
            xdl0.m208345M0(this.f39624b, false);
            xdl0.m208345M0(this.f39628f, true);
            xdl0.m208345M0(this.f39630h, false);
            xdl0.m208345M0(this.f39631i, false);
            return;
        }
        if (i2 == 1) {
            xdl0.m208345M0(this.f39624b, false);
            xdl0.m208345M0(this.f39628f, true);
            xdl0.m208345M0(this.f39630h, true);
            xdl0.m208345M0(this.f39631i, false);
            return;
        }
        if (i2 != 2) {
            return;
        }
        xdl0.m208345M0(this.f39624b, true);
        xdl0.m208345M0(this.f39628f, true);
        xdl0.m208345M0(this.f39630h, true);
        xdl0.m208345M0(this.f39631i, true);
    }

    /* JADX INFO: renamed from: r */
    public void m61556r(C11189f.b bVar) {
        xdl0.m208345M0(this.f39624b, false);
        xdl0.m208345M0(this.f39628f, true);
        xdl0.m208345M0(this.f39629g, true);
        xdl0.m208345M0(this.f39630h, true);
        xdl0.m208345M0(this.f39631i, false);
        boolean z = bVar.f39884d;
        this.f39635m = z;
        float f = bVar.f39882b;
        int i = (int) (100.0f * f);
        this.f39630h.setProgress(CameraEffectMgr.m61345u(z, f));
        this.f39630h.setText(String.valueOf(i));
        m61546h();
    }

    /* JADX INFO: renamed from: s */
    public void m61557s(C11189f.b bVar) {
        xdl0.m208345M0(this.f39624b, !bVar.f39883c);
        xdl0.m208345M0(this.f39628f, true);
        xdl0.m208345M0(this.f39629g, true);
        xdl0.m208345M0(this.f39630h, !bVar.f39883c);
        xdl0.m208345M0(this.f39631i, !bVar.f39883c);
        this.f39635m = bVar.f39884d;
        int i = (int) (bVar.f39881a * 100.0f);
        this.f39630h.setText(String.valueOf((int) (bVar.f39882b * 100.0f)));
        this.f39626d.setText(String.valueOf(i));
        int iM61345u = CameraEffectMgr.m61345u(bVar.f39884d, bVar.f39881a);
        this.f39630h.setProgress(CameraEffectMgr.m61345u(bVar.f39884d, bVar.f39882b));
        this.f39626d.setProgress(iM61345u);
        m61546h();
    }

    public void setOnAllSeekbarChanged(e30<Float> e30Var) {
        this.f39634l = e30Var;
    }

    public void setOnLutSeekbarChanged(e30<Float> e30Var) {
        this.f39633k = e30Var;
    }

    public void setOnResetItemClick(e30<Boolean> e30Var) {
        this.f39632j = e30Var;
    }

    public FeedMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39635m = false;
        this.f39637o = false;
    }

    public FeedMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39635m = false;
        this.f39637o = false;
    }
}
