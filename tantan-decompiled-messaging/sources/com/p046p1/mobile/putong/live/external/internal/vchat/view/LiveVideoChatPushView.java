package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.p107im.C14373IM;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.e51;
import p149l.fpu;
import p149l.hxs;
import p149l.qvu;
import p149l.s7m;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoChatPushView extends FrameLayout implements s7m<fpu> {

    /* JADX INFO: renamed from: a */
    public VFrame f45454a;

    /* JADX INFO: renamed from: b */
    public VFrame f45455b;

    /* JADX INFO: renamed from: c */
    public View f45456c;

    /* JADX INFO: renamed from: d */
    public View f45457d;

    /* JADX INFO: renamed from: e */
    public VFrame f45458e;

    /* JADX INFO: renamed from: f */
    public VFrame f45459f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f45460g;

    /* JADX INFO: renamed from: h */
    public fpu f45461h;

    /* JADX INFO: renamed from: i */
    public boolean f45462i;

    /* JADX INFO: renamed from: j */
    public ViewGroup.LayoutParams f45463j;

    /* JADX INFO: renamed from: k */
    public ViewGroup.LayoutParams f45464k;

    /* JADX INFO: renamed from: l */
    public Runnable f45465l;

    /* JADX INFO: renamed from: m */
    public final Runnable f45466m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView$a */
    public class RunnableC12533a implements Runnable {
        public RunnableC12533a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m69820b(View view) {
            LiveVideoChatPushView liveVideoChatPushView = LiveVideoChatPushView.this;
            liveVideoChatPushView.m69814l(!liveVideoChatPushView.f45462i);
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveVideoChatPushView liveVideoChatPushView = LiveVideoChatPushView.this;
            liveVideoChatPushView.f45454a.setLayoutParams(liveVideoChatPushView.f45463j);
            LiveVideoChatPushView liveVideoChatPushView2 = LiveVideoChatPushView.this;
            liveVideoChatPushView2.f45458e.setLayoutParams(liveVideoChatPushView2.f45464k);
            LiveVideoChatPushView.this.f45458e.setClickable(true);
            xdl0.m208329E0(LiveVideoChatPushView.this.f45458e, new View.OnClickListener() { // from class: l.ovu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145852a.m69820b(view);
                }
            });
            xdl0.m208329E0(LiveVideoChatPushView.this.f45454a, null);
            LiveVideoChatPushView.this.f45454a.setClickable(false);
            LiveVideoChatPushView liveVideoChatPushView3 = LiveVideoChatPushView.this;
            liveVideoChatPushView3.setSurfaceViewOrder(liveVideoChatPushView3.f45462i);
            LiveVideoChatPushView liveVideoChatPushView4 = LiveVideoChatPushView.this;
            liveVideoChatPushView4.setPushChildOrder(liveVideoChatPushView4.f45462i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView$b */
    public class RunnableC12534b implements Runnable {
        public RunnableC12534b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m69822b(View view) {
            LiveVideoChatPushView liveVideoChatPushView = LiveVideoChatPushView.this;
            liveVideoChatPushView.m69814l(!liveVideoChatPushView.f45462i);
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveVideoChatPushView liveVideoChatPushView = LiveVideoChatPushView.this;
            liveVideoChatPushView.f45454a.setLayoutParams(liveVideoChatPushView.f45464k);
            LiveVideoChatPushView liveVideoChatPushView2 = LiveVideoChatPushView.this;
            liveVideoChatPushView2.f45458e.setLayoutParams(liveVideoChatPushView2.f45463j);
            xdl0.m208329E0(LiveVideoChatPushView.this.f45458e, null);
            LiveVideoChatPushView.this.f45454a.setClickable(true);
            xdl0.m208329E0(LiveVideoChatPushView.this.f45454a, new View.OnClickListener() { // from class: l.pvu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151505a.m69822b(view);
                }
            });
            LiveVideoChatPushView.this.f45458e.setClickable(false);
            LiveVideoChatPushView liveVideoChatPushView3 = LiveVideoChatPushView.this;
            liveVideoChatPushView3.setSurfaceViewOrder(liveVideoChatPushView3.f45462i);
            LiveVideoChatPushView liveVideoChatPushView4 = LiveVideoChatPushView.this;
            liveVideoChatPushView4.setPushChildOrder(liveVideoChatPushView4.f45462i);
        }
    }

    public LiveVideoChatPushView(@NonNull Context context) {
        super(context);
        this.f45462i = true;
        this.f45465l = new RunnableC12533a();
        this.f45466m = new RunnableC12534b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m69809m(View view) {
        if (NullChecker.m81303a(this.f45461h)) {
            m69813k();
            this.f45461h.m122672i3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m69810n(View view) {
        m69814l(!this.f45462i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushChildOrder(boolean z) {
        if (z) {
            this.f45454a.bringToFront();
            this.f45455b.bringToFront();
            this.f45458e.bringToFront();
        } else {
            this.f45458e.bringToFront();
            this.f45455b.bringToFront();
            this.f45454a.bringToFront();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: i */
    public final void m69811i(View view) {
        qvu.m176710a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(fpu fpuVar) {
        this.f45461h = fpuVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m69813k() {
        VFrame vFrame = this.f45455b;
        xdl0.m208344M(vFrame, !xdl0.m208349O0(vFrame));
    }

    /* JADX INFO: renamed from: l */
    public void m69814l(boolean z) {
        if (z == this.f45462i) {
            return;
        }
        e51.m114745J(this.f45466m);
        e51.m114745J(this.f45465l);
        this.f45462i = z;
        fpu fpuVar = this.f45461h;
        if (z) {
            if (fpuVar.m218414N2()) {
                this.f45461h.m218409H2().m203944u().m100102a().mo99451C(getMeasuredWidth(), getMeasuredHeight());
            }
            e51.m114743H(this.f45461h.act(), this.f45465l, 500L);
            return;
        }
        if (!fpuVar.m218414N2() && !xdl0.m208349O0(this.f45460g)) {
            this.f45461h.m218409H2().m203944u().m100102a().mo99451C(getMeasuredWidth(), getMeasuredHeight());
        }
        if (xdl0.m208349O0(this.f45460g)) {
            this.f45466m.run();
        } else {
            e51.m114743H(this.f45461h.act(), this.f45466m, 500L);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69811i(this);
        xdl0.m208344M(this.f45460g, false);
        View view = this.f45456c;
        int color = Color.parseColor("#4d000000");
        int color2 = Color.parseColor("#00000000");
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        view.setBackground(yb2.m213886k(color, color2, 0, orientation));
        this.f45457d.setBackground(yb2.m213886k(Color.parseColor("#00000000"), Color.parseColor("#4d000000"), 0, orientation));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.mvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f135989a.m69809m(view2);
            }
        });
        xdl0.m208329E0(this.f45458e, new View.OnClickListener() { // from class: l.nvu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f140847a.m69810n(view2);
            }
        });
        this.f45463j = this.f45454a.getLayoutParams();
        this.f45464k = this.f45458e.getLayoutParams();
    }

    /* JADX INFO: renamed from: p */
    public void m69815p() {
        xdl0.m208344M(this.f45455b, true);
    }

    /* JADX INFO: renamed from: q */
    public void m69816q() {
        setSurfaceViewOrder(this.f45462i);
    }

    /* JADX INFO: renamed from: s */
    public void m69817s(boolean z) {
        xdl0.m208344M(this, z);
    }

    public void setSurfaceViewOrder(boolean z) {
        if (this.f45454a.getChildCount() > 0 && (this.f45454a.getChildAt(0) instanceof SurfaceView)) {
            SurfaceView surfaceView = (SurfaceView) this.f45454a.getChildAt(0);
            surfaceView.setZOrderOnTop(!z);
            surfaceView.setZOrderMediaOverlay(!z);
        }
        if (this.f45459f.getChildCount() <= 0 || !(this.f45459f.getChildAt(0) instanceof SurfaceView)) {
            return;
        }
        SurfaceView surfaceView2 = (SurfaceView) this.f45459f.getChildAt(0);
        surfaceView2.setZOrderOnTop(z);
        surfaceView2.setZOrderMediaOverlay(z);
    }

    /* JADX INFO: renamed from: u */
    public void m69818u(boolean z, BLiveVideoChat bLiveVideoChat) {
        xdl0.m208344M(this.f45460g, z);
        if (z && NullChecker.m81303a(bLiveVideoChat)) {
            hxs.m133408u(C14373IM.CHAT_TYPE_VIDEO_CHAT, this.f45460g, bLiveVideoChat.getAttendee().avatar, xdl0.m208412y0(), xdl0.m208408w0());
        }
    }

    public LiveVideoChatPushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45462i = true;
        this.f45465l = new RunnableC12533a();
        this.f45466m = new RunnableC12534b();
    }

    public LiveVideoChatPushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45462i = true;
        this.f45465l = new RunnableC12533a();
        this.f45466m = new RunnableC12534b();
    }

    public LiveVideoChatPushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f45462i = true;
        this.f45465l = new RunnableC12533a();
        this.f45466m = new RunnableC12534b();
    }
}
