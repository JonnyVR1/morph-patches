package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import com.p051p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p051p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.cb50;
import p153l.ieh;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMakeupSeekbarPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupSeekbarPageView f40471a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f40472b;

    /* JADX INFO: renamed from: c */
    public View f40473c;

    /* JADX INFO: renamed from: d */
    public FeedTextSeekBar f40474d;

    /* JADX INFO: renamed from: e */
    public VText f40475e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f40476f;

    /* JADX INFO: renamed from: g */
    public VImage f40477g;

    /* JADX INFO: renamed from: h */
    public FeedTextSeekBar f40478h;

    /* JADX INFO: renamed from: i */
    public VText f40479i;

    /* JADX INFO: renamed from: j */
    public y20<Boolean> f40480j;

    /* JADX INFO: renamed from: k */
    public y20<Float> f40481k;

    /* JADX INFO: renamed from: l */
    public y20<Float> f40482l;

    /* JADX INFO: renamed from: m */
    public boolean f40483m;

    /* JADX INFO: renamed from: n */
    public MakeupSharedViewModel f40484n;

    /* JADX INFO: renamed from: o */
    public boolean f40485o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView$a */
    public class C11331a implements FeedTextSeekBar.InterfaceC11333a {
        public C11331a() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: a */
        public void mo62742a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (z) {
                float fM62729g = FeedMakeupSeekbarPageView.this.m62729g(i);
                FeedMakeupSeekbarPageView.this.f40474d.setText(String.valueOf((int) (100.0f * fM62729g)));
                CameraEffectMgr.m62524V().m62550X().m63036m(new Pair<>(Float.valueOf(fM62729g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: b */
        public void mo62743b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: c */
        public void mo62744c(FeedTextSeekBar feedTextSeekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView$b */
    public class C11332b implements FeedTextSeekBar.InterfaceC11333a {
        public C11332b() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: a */
        public void mo62742a(FeedTextSeekBar feedTextSeekBar, int i, boolean z) {
            if (z) {
                float fM62729g = FeedMakeupSeekbarPageView.this.m62729g(i);
                FeedMakeupSeekbarPageView.this.f40478h.setText(String.valueOf((int) (100.0f * fM62729g)));
                CameraEffectMgr.m62524V().m62550X().m63034k(new Pair<>(Float.valueOf(fM62729g), Boolean.valueOf(z)));
            }
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: b */
        public void mo62743b(FeedTextSeekBar feedTextSeekBar) {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar.InterfaceC11333a
        /* JADX INFO: renamed from: c */
        public void mo62744c(FeedTextSeekBar feedTextSeekBar) {
        }
    }

    public FeedMakeupSeekbarPageView(Context context) {
        super(context);
        this.f40483m = false;
        this.f40485o = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m62727e(View view) {
        ieh.m139611a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Act m62728f() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final float m62729g(int i) {
        return this.f40483m ? CameraEffectMgr.m62527s(i) : CameraEffectMgr.m62522I(i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public void m62730h() {
        this.f40477g.setOnTouchListener(new View.OnTouchListener() { // from class: l.geh
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f103835a.m62733k(view, motionEvent);
            }
        });
        this.f40474d.setOnSeekBarChangeListener(new C11331a());
        this.f40478h.setOnSeekBarChangeListener(new C11332b());
        CameraEffectMgr.m62524V().m62550X().m63031h().m2984i(m62728f(), new cb50() { // from class: l.heh
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f109150a.m62734l((bkj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m62731i() {
        if (this.f40485o) {
            return;
        }
        this.f40484n.m63030g().m2984i(m62728f(), new cb50() { // from class: l.feh
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f98675a.m62735m((Pair) obj);
            }
        });
        this.f40485o = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m62732j() {
        this.f40484n = (MakeupSharedViewModel) new C0491t(m62728f()).m3074a(MakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m62733k(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && NullChecker.m82486a(this.f40480j)) {
                this.f40480j.call(Boolean.TRUE);
            }
        } else if (NullChecker.m82486a(this.f40480j)) {
            this.f40480j.call(Boolean.FALSE);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m62734l(bkj0 bkj0Var) {
        this.f40483m = ((Boolean) bkj0Var.f77081a).booleanValue();
        int iFloatValue = (int) (((Float) bkj0Var.f77082b).floatValue() * 100.0f);
        this.f40478h.setText(String.valueOf((int) (((Float) bkj0Var.f77083c).floatValue() * 100.0f)));
        this.f40474d.setText(String.valueOf(iFloatValue));
        int iM62529u = CameraEffectMgr.m62529u(this.f40483m, ((Float) bkj0Var.f77082b).floatValue());
        this.f40478h.setProgress(CameraEffectMgr.m62529u(this.f40483m, ((Float) bkj0Var.f77083c).floatValue()));
        this.f40474d.setProgress(iM62529u);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m62735m(Pair pair) {
        m62739q(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    /* JADX INFO: renamed from: n */
    public void m62736n() {
        bnl0.m105525M0(this.f40472b, false);
        bnl0.m105525M0(this.f40476f, true);
        bnl0.m105525M0(this.f40477g, true);
        bnl0.m105525M0(this.f40478h, false);
        bnl0.m105525M0(this.f40479i, false);
        this.f40483m = false;
        m62730h();
    }

    /* JADX INFO: renamed from: o */
    public void m62737o(C11352f.b bVar) {
        bnl0.m105525M0(this.f40472b, false);
        bnl0.m105525M0(this.f40476f, true);
        bnl0.m105525M0(this.f40477g, true);
        bnl0.m105525M0(this.f40478h, true);
        bnl0.m105525M0(this.f40479i, false);
        this.f40483m = bVar.f40732d;
        this.f40478h.setText(String.valueOf((int) (bVar.f40730b * 100.0f)));
        this.f40478h.setProgress(CameraEffectMgr.m62529u(bVar.f40732d, bVar.f40730b));
        m62730h();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62727e(this);
        m62732j();
    }

    /* JADX INFO: renamed from: p */
    public void m62738p(C11352f.b bVar) {
        bnl0.m105525M0(this.f40472b, false);
        bnl0.m105525M0(this.f40476f, true);
        bnl0.m105525M0(this.f40477g, true);
        bnl0.m105525M0(this.f40478h, true ^ bVar.f40731c);
        bnl0.m105525M0(this.f40479i, false);
        this.f40483m = false;
        this.f40478h.setText(String.valueOf((int) (bVar.f40730b * 100.0f)));
        this.f40478h.setProgress(CameraEffectMgr.m62529u(bVar.f40732d, bVar.f40730b));
        m62730h();
    }

    /* JADX INFO: renamed from: q */
    public final void m62739q(int i, int i2) {
        if (i != ((Integer) getTag()).intValue()) {
            return;
        }
        if (i2 == 0) {
            bnl0.m105525M0(this.f40472b, false);
            bnl0.m105525M0(this.f40476f, true);
            bnl0.m105525M0(this.f40478h, false);
            bnl0.m105525M0(this.f40479i, false);
            return;
        }
        if (i2 == 1) {
            bnl0.m105525M0(this.f40472b, false);
            bnl0.m105525M0(this.f40476f, true);
            bnl0.m105525M0(this.f40478h, true);
            bnl0.m105525M0(this.f40479i, false);
            return;
        }
        if (i2 != 2) {
            return;
        }
        bnl0.m105525M0(this.f40472b, true);
        bnl0.m105525M0(this.f40476f, true);
        bnl0.m105525M0(this.f40478h, true);
        bnl0.m105525M0(this.f40479i, true);
    }

    /* JADX INFO: renamed from: r */
    public void m62740r(C11352f.b bVar) {
        bnl0.m105525M0(this.f40472b, false);
        bnl0.m105525M0(this.f40476f, true);
        bnl0.m105525M0(this.f40477g, true);
        bnl0.m105525M0(this.f40478h, true);
        bnl0.m105525M0(this.f40479i, false);
        boolean z = bVar.f40732d;
        this.f40483m = z;
        float f = bVar.f40730b;
        int i = (int) (100.0f * f);
        this.f40478h.setProgress(CameraEffectMgr.m62529u(z, f));
        this.f40478h.setText(String.valueOf(i));
        m62730h();
    }

    /* JADX INFO: renamed from: s */
    public void m62741s(C11352f.b bVar) {
        bnl0.m105525M0(this.f40472b, !bVar.f40731c);
        bnl0.m105525M0(this.f40476f, true);
        bnl0.m105525M0(this.f40477g, true);
        bnl0.m105525M0(this.f40478h, !bVar.f40731c);
        bnl0.m105525M0(this.f40479i, !bVar.f40731c);
        this.f40483m = bVar.f40732d;
        int i = (int) (bVar.f40729a * 100.0f);
        this.f40478h.setText(String.valueOf((int) (bVar.f40730b * 100.0f)));
        this.f40474d.setText(String.valueOf(i));
        int iM62529u = CameraEffectMgr.m62529u(bVar.f40732d, bVar.f40729a);
        this.f40478h.setProgress(CameraEffectMgr.m62529u(bVar.f40732d, bVar.f40730b));
        this.f40474d.setProgress(iM62529u);
        m62730h();
    }

    public void setOnAllSeekbarChanged(y20<Float> y20Var) {
        this.f40482l = y20Var;
    }

    public void setOnLutSeekbarChanged(y20<Float> y20Var) {
        this.f40481k = y20Var;
    }

    public void setOnResetItemClick(y20<Boolean> y20Var) {
        this.f40480j = y20Var;
    }

    public FeedMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40483m = false;
        this.f40485o = false;
    }

    public FeedMakeupSeekbarPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40483m = false;
        this.f40485o = false;
    }
}
