package com.p051p1.mobile.putong.live.external.internal.vchat.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.p112im.C14536IM;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.fc2;
import p153l.gru;
import p153l.iam;
import p153l.izs;
import p153l.l51;
import p153l.rxu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVideoChatPushView extends FrameLayout implements iam<gru> {

    /* JADX INFO: renamed from: a */
    public VFrame f46302a;

    /* JADX INFO: renamed from: b */
    public VFrame f46303b;

    /* JADX INFO: renamed from: c */
    public View f46304c;

    /* JADX INFO: renamed from: d */
    public View f46305d;

    /* JADX INFO: renamed from: e */
    public VFrame f46306e;

    /* JADX INFO: renamed from: f */
    public VFrame f46307f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f46308g;

    /* JADX INFO: renamed from: h */
    public gru f46309h;

    /* JADX INFO: renamed from: i */
    public boolean f46310i;

    /* JADX INFO: renamed from: j */
    public ViewGroup.LayoutParams f46311j;

    /* JADX INFO: renamed from: k */
    public ViewGroup.LayoutParams f46312k;

    /* JADX INFO: renamed from: l */
    public Runnable f46313l;

    /* JADX INFO: renamed from: m */
    public final Runnable f46314m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView$a */
    public class RunnableC12696a implements Runnable {
        public RunnableC12696a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m71003b(View view) {
            LiveVideoChatPushView liveVideoChatPushView = LiveVideoChatPushView.this;
            liveVideoChatPushView.m70997l(!liveVideoChatPushView.f46310i);
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveVideoChatPushView liveVideoChatPushView = LiveVideoChatPushView.this;
            liveVideoChatPushView.f46302a.setLayoutParams(liveVideoChatPushView.f46311j);
            LiveVideoChatPushView liveVideoChatPushView2 = LiveVideoChatPushView.this;
            liveVideoChatPushView2.f46306e.setLayoutParams(liveVideoChatPushView2.f46312k);
            LiveVideoChatPushView.this.f46306e.setClickable(true);
            bnl0.m105509E0(LiveVideoChatPushView.this.f46306e, new View.OnClickListener() { // from class: l.pxu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f154592a.m71003b(view);
                }
            });
            bnl0.m105509E0(LiveVideoChatPushView.this.f46302a, null);
            LiveVideoChatPushView.this.f46302a.setClickable(false);
            LiveVideoChatPushView liveVideoChatPushView3 = LiveVideoChatPushView.this;
            liveVideoChatPushView3.setSurfaceViewOrder(liveVideoChatPushView3.f46310i);
            LiveVideoChatPushView liveVideoChatPushView4 = LiveVideoChatPushView.this;
            liveVideoChatPushView4.setPushChildOrder(liveVideoChatPushView4.f46310i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.view.LiveVideoChatPushView$b */
    public class RunnableC12697b implements Runnable {
        public RunnableC12697b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m71005b(View view) {
            LiveVideoChatPushView liveVideoChatPushView = LiveVideoChatPushView.this;
            liveVideoChatPushView.m70997l(!liveVideoChatPushView.f46310i);
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveVideoChatPushView liveVideoChatPushView = LiveVideoChatPushView.this;
            liveVideoChatPushView.f46302a.setLayoutParams(liveVideoChatPushView.f46312k);
            LiveVideoChatPushView liveVideoChatPushView2 = LiveVideoChatPushView.this;
            liveVideoChatPushView2.f46306e.setLayoutParams(liveVideoChatPushView2.f46311j);
            bnl0.m105509E0(LiveVideoChatPushView.this.f46306e, null);
            LiveVideoChatPushView.this.f46302a.setClickable(true);
            bnl0.m105509E0(LiveVideoChatPushView.this.f46302a, new View.OnClickListener() { // from class: l.qxu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f160074a.m71005b(view);
                }
            });
            LiveVideoChatPushView.this.f46306e.setClickable(false);
            LiveVideoChatPushView liveVideoChatPushView3 = LiveVideoChatPushView.this;
            liveVideoChatPushView3.setSurfaceViewOrder(liveVideoChatPushView3.f46310i);
            LiveVideoChatPushView liveVideoChatPushView4 = LiveVideoChatPushView.this;
            liveVideoChatPushView4.setPushChildOrder(liveVideoChatPushView4.f46310i);
        }
    }

    public LiveVideoChatPushView(@NonNull Context context) {
        super(context);
        this.f46310i = true;
        this.f46313l = new RunnableC12696a();
        this.f46314m = new RunnableC12697b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m70992m(View view) {
        if (NullChecker.m82486a(this.f46309h)) {
            m70996k();
            this.f46309h.m131887i3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m70993n(View view) {
        m70997l(!this.f46310i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushChildOrder(boolean z) {
        if (z) {
            this.f46302a.bringToFront();
            this.f46303b.bringToFront();
            this.f46306e.bringToFront();
        } else {
            this.f46306e.bringToFront();
            this.f46303b.bringToFront();
            this.f46302a.bringToFront();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: i */
    public final void m70994i(View view) {
        rxu.m183566a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gru gruVar) {
        this.f46309h = gruVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m70996k() {
        VFrame vFrame = this.f46303b;
        bnl0.m105524M(vFrame, !bnl0.m105529O0(vFrame));
    }

    /* JADX INFO: renamed from: l */
    public void m70997l(boolean z) {
        if (z == this.f46310i) {
            return;
        }
        l51.m152890J(this.f46314m);
        l51.m152890J(this.f46313l);
        this.f46310i = z;
        gru gruVar = this.f46309h;
        if (z) {
            if (gruVar.m97931N2()) {
                this.f46309h.m97926H2().m212351u().m129893a().mo95594C(getMeasuredWidth(), getMeasuredHeight());
            }
            l51.m152888H(this.f46309h.act(), this.f46313l, 500L);
            return;
        }
        if (!gruVar.m97931N2() && !bnl0.m105529O0(this.f46308g)) {
            this.f46309h.m97926H2().m212351u().m129893a().mo95594C(getMeasuredWidth(), getMeasuredHeight());
        }
        if (bnl0.m105529O0(this.f46308g)) {
            this.f46314m.run();
        } else {
            l51.m152888H(this.f46309h.act(), this.f46314m, 500L);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70994i(this);
        bnl0.m105524M(this.f46308g, false);
        View view = this.f46304c;
        int color = Color.parseColor("#4d000000");
        int color2 = Color.parseColor("#00000000");
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        view.setBackground(fc2.m124981k(color, color2, 0, orientation));
        this.f46305d.setBackground(fc2.m124981k(Color.parseColor("#00000000"), Color.parseColor("#4d000000"), 0, orientation));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.nxu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f144245a.m70992m(view2);
            }
        });
        bnl0.m105509E0(this.f46306e, new View.OnClickListener() { // from class: l.oxu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f149686a.m70993n(view2);
            }
        });
        this.f46311j = this.f46302a.getLayoutParams();
        this.f46312k = this.f46306e.getLayoutParams();
    }

    /* JADX INFO: renamed from: p */
    public void m70998p() {
        bnl0.m105524M(this.f46303b, true);
    }

    /* JADX INFO: renamed from: q */
    public void m70999q() {
        setSurfaceViewOrder(this.f46310i);
    }

    /* JADX INFO: renamed from: s */
    public void m71000s(boolean z) {
        bnl0.m105524M(this, z);
    }

    public void setSurfaceViewOrder(boolean z) {
        if (this.f46302a.getChildCount() > 0 && (this.f46302a.getChildAt(0) instanceof SurfaceView)) {
            SurfaceView surfaceView = (SurfaceView) this.f46302a.getChildAt(0);
            surfaceView.setZOrderOnTop(!z);
            surfaceView.setZOrderMediaOverlay(!z);
        }
        if (this.f46307f.getChildCount() <= 0 || !(this.f46307f.getChildAt(0) instanceof SurfaceView)) {
            return;
        }
        SurfaceView surfaceView2 = (SurfaceView) this.f46307f.getChildAt(0);
        surfaceView2.setZOrderOnTop(z);
        surfaceView2.setZOrderMediaOverlay(z);
    }

    /* JADX INFO: renamed from: u */
    public void m71001u(boolean z, BLiveVideoChat bLiveVideoChat) {
        bnl0.m105524M(this.f46308g, z);
        if (z && NullChecker.m82486a(bLiveVideoChat)) {
            izs.m142870u(C14536IM.CHAT_TYPE_VIDEO_CHAT, this.f46308g, bLiveVideoChat.getAttendee().avatar, bnl0.m105592y0(), bnl0.m105588w0());
        }
    }

    public LiveVideoChatPushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46310i = true;
        this.f46313l = new RunnableC12696a();
        this.f46314m = new RunnableC12697b();
    }

    public LiveVideoChatPushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46310i = true;
        this.f46313l = new RunnableC12696a();
        this.f46314m = new RunnableC12697b();
    }

    public LiveVideoChatPushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f46310i = true;
        this.f46313l = new RunnableC12696a();
        this.f46314m = new RunnableC12697b();
    }
}
