package com.p000p1.mobile.putong.feed.newui.videoflow.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.preview.act.C2159a;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.xdl0;
import p007l.lqv;
import p007l.s8i;
import p007l.x770;
import p007l.xvh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedVideoViewFlowItemView extends FrameLayout implements xvh {

    /* JADX INFO: renamed from: a */
    public C2159a f4749a;

    /* JADX INFO: renamed from: b */
    public x770 f4750b;

    /* JADX INFO: renamed from: c */
    public boolean f4751c;

    /* JADX INFO: renamed from: d */
    public boolean f4752d;

    /* JADX INFO: renamed from: e */
    public boolean f4753e;

    /* JADX INFO: renamed from: f */
    public int f4754f;

    /* JADX INFO: renamed from: g */
    public int f4755g;

    /* JADX INFO: renamed from: h */
    public boolean f4756h;

    /* JADX INFO: renamed from: i */
    public String f4757i;

    /* JADX INFO: renamed from: j */
    public s8i f4758j;

    public FeedVideoViewFlowItemView(@NonNull Context context, String str, int i, boolean z, boolean z2, boolean z3) {
        super(context);
        this.f4757i = str;
        if (TextUtils.isEmpty(str)) {
            this.f4757i = "from_video_flow";
        }
        this.f4751c = z;
        this.f4752d = z2;
        this.f4753e = z3;
        this.f4755g = i;
        m7360d(context);
    }

    /* JADX INFO: renamed from: c */
    public static PhotoAlbumPlayerView m7357c(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        return childAt instanceof PhotoAlbumPlayerView ? (PhotoAlbumPlayerView) childAt : m7357c(childAt);
    }

    private PhotoAlbumPlayerView getVideoPlayView() {
        if (!NullChecker.a(this.f4749a.f4071b)) {
            return null;
        }
        return m7357c(this.f4749a.f4071b.findViewWithTag(Integer.valueOf(this.f4749a.f4071b.getCurrentItem())));
    }

    @Override // p007l.xvh
    /* JADX INFO: renamed from: a */
    public boolean mo7358a(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        return false;
    }

    @Override // p007l.xvh
    /* JADX INFO: renamed from: b */
    public boolean mo7359b(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        return this.f4752d;
    }

    /* JADX INFO: renamed from: d */
    public final void m7360d(Context context) {
        if (context instanceof Act) {
            Act act = (Act) context;
            this.f4750b = new x770(act);
            s8i s8iVar = new s8i(act, this);
            this.f4758j = s8iVar;
            s8iVar.f12824p1 = this.f4753e;
            s8iVar.f12823o1 = this.f4751c;
            C2159a c2159aM6438b = C2159a.a.m6437a().m6440d(act).m6439c(this.f4758j).m6442f(this.f4758j).m6441e(this.f4757i).m6438b();
            this.f4749a = c2159aM6438b;
            this.f4750b.C(c2159aM6438b);
            View viewInflateView = this.f4749a.inflateView(LayoutInflater.from(context), this);
            int iY0 = xdl0.y0();
            int iW0 = this.f4755g;
            if (iW0 == 0) {
                iW0 = xdl0.w0() - xdl0.F0();
            }
            viewInflateView.setLayoutParams(new ViewGroup.MarginLayoutParams(iY0, iW0));
            addView(viewInflateView);
            this.f4750b.m16028a0();
            this.f4749a.m6424f();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m7361e() {
        if (NullChecker.a(this.f4758j)) {
            this.f4758j.m14053z1();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7362f(Moment moment, int i) {
        if (NullChecker.a(moment)) {
            x770 x770Var = this.f4750b;
            x770Var.f14788e = moment;
            x770Var.f14784a = FeedModule.f316d.m16628e8(moment.owner);
            this.f4749a.m6436v((ArrayList) moment.media);
            this.f4749a.m6434s();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m7363g() {
        PhotoAlbumPlayerView videoPlayView = getVideoPlayView();
        this.f4756h = true;
        if (NullChecker.a(videoPlayView) && !videoPlayView.m6550y()) {
            videoPlayView.m6537F();
            this.f4756h = false;
        }
        if (this.f4756h) {
            this.f4758j.m14050w1();
        }
    }

    public int getShowInVideoFlowPosition() {
        return this.f4754f;
    }

    public C2159a getViewModel() {
        return this.f4749a;
    }

    /* JADX INFO: renamed from: h */
    public void m7364h() {
        PhotoAlbumPlayerView videoPlayView = getVideoPlayView();
        if (NullChecker.a(videoPlayView) && videoPlayView.m6550y()) {
            videoPlayView.m6541J();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7365i() {
        if (NullChecker.a(this.f4758j)) {
            this.f4758j.m14049A1();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7365i();
    }

    public void setAutoNextVideo(d30 d30Var) {
        this.f4758j.m14835l1(d30Var);
    }

    public void setLivingStore(lqv lqvVar) {
        s8i s8iVar = this.f4758j;
        if (s8iVar != null) {
            s8iVar.f9471F = lqvVar;
        }
    }

    public void setShowInVideoFlowPosition(int i) {
        this.f4754f = i;
    }

    public FeedVideoViewFlowItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7360d(context);
    }

    public FeedVideoViewFlowItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7360d(context);
    }
}
