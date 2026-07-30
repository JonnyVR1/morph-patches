package com.p051p1.mobile.putong.feed.newui.videoflow.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.preview.act.C11478a;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.bnl0;
import p153l.dg70;
import p153l.hai;
import p153l.msv;
import p153l.mxh;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedVideoViewFlowItemView extends FrameLayout implements mxh {

    /* JADX INFO: renamed from: a */
    public C11478a f44136a;

    /* JADX INFO: renamed from: b */
    public dg70 f44137b;

    /* JADX INFO: renamed from: c */
    public boolean f44138c;

    /* JADX INFO: renamed from: d */
    public boolean f44139d;

    /* JADX INFO: renamed from: e */
    public boolean f44140e;

    /* JADX INFO: renamed from: f */
    public int f44141f;

    /* JADX INFO: renamed from: g */
    public int f44142g;

    /* JADX INFO: renamed from: h */
    public boolean f44143h;

    /* JADX INFO: renamed from: i */
    public String f44144i;

    /* JADX INFO: renamed from: j */
    public hai f44145j;

    public FeedVideoViewFlowItemView(@NonNull Context context, String str, int i, boolean z, boolean z2, boolean z3) {
        super(context);
        this.f44144i = str;
        if (TextUtils.isEmpty(str)) {
            this.f44144i = "from_video_flow";
        }
        this.f44138c = z;
        this.f44139d = z2;
        this.f44140e = z3;
        this.f44142g = i;
        m67385d(context);
    }

    /* JADX INFO: renamed from: c */
    public static PhotoAlbumPlayerView m67382c(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        return childAt instanceof PhotoAlbumPlayerView ? (PhotoAlbumPlayerView) childAt : m67382c(childAt);
    }

    private PhotoAlbumPlayerView getVideoPlayView() {
        if (!NullChecker.m82486a(this.f44136a.f43458b)) {
            return null;
        }
        return m67382c(this.f44136a.f43458b.findViewWithTag(Integer.valueOf(this.f44136a.f43458b.getCurrentItem())));
    }

    @Override // p153l.mxh
    /* JADX INFO: renamed from: a */
    public boolean mo67383a(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        return false;
    }

    @Override // p153l.mxh
    /* JADX INFO: renamed from: b */
    public boolean mo67384b(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        return this.f44139d;
    }

    /* JADX INFO: renamed from: d */
    public final void m67385d(Context context) {
        if (context instanceof Act) {
            Act act = (Act) context;
            this.f44137b = new dg70(act);
            hai haiVar = new hai(act, this);
            this.f44145j = haiVar;
            haiVar.f108499p1 = this.f44140e;
            haiVar.f108498o1 = this.f44138c;
            C11478a c11478aM66518b = C11478a.a.m66517a().m66520d(act).m66519c(this.f44145j).m66522f(this.f44145j).m66521e(this.f44144i).m66518b();
            this.f44136a = c11478aM66518b;
            this.f44137b.mo52715C(c11478aM66518b);
            View viewInflateView = this.f44136a.inflateView(LayoutInflater.from(context), this);
            int iM105592y0 = bnl0.m105592y0();
            int iM105588w0 = this.f44142g;
            if (iM105588w0 == 0) {
                iM105588w0 = bnl0.m105588w0() - bnl0.m105511F0();
            }
            viewInflateView.setLayoutParams(new ViewGroup.MarginLayoutParams(iM105592y0, iM105588w0));
            addView(viewInflateView);
            this.f44137b.mo40473a0();
            this.f44136a.m66505f();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m67386e() {
        if (NullChecker.m82486a(this.f44145j)) {
            this.f44145j.m134163z1();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m67387f(Moment moment, int i) {
        if (NullChecker.m82486a(moment)) {
            dg70 dg70Var = this.f44137b;
            dg70Var.f88270e = moment;
            dg70Var.f88266a = FeedModule.f39703d.m145688e8(moment.owner);
            this.f44136a.m66516v((ArrayList) moment.media);
            this.f44136a.m66514s();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m67388g() {
        PhotoAlbumPlayerView videoPlayView = getVideoPlayView();
        this.f44143h = true;
        if (NullChecker.m82486a(videoPlayView) && !videoPlayView.m66614y()) {
            videoPlayView.m66601F();
            this.f44143h = false;
        }
        if (this.f44143h) {
            this.f44145j.m134160w1();
        }
    }

    public int getShowInVideoFlowPosition() {
        return this.f44141f;
    }

    public C11478a getViewModel() {
        return this.f44136a;
    }

    /* JADX INFO: renamed from: h */
    public void m67389h() {
        PhotoAlbumPlayerView videoPlayView = getVideoPlayView();
        if (NullChecker.m82486a(videoPlayView) && videoPlayView.m66614y()) {
            videoPlayView.m66605J();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m67390i() {
        if (NullChecker.m82486a(this.f44145j)) {
            this.f44145j.m134155A1();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m67390i();
    }

    public void setAutoNextVideo(x20 x20Var) {
        this.f44145j.m144273l1(x20Var);
    }

    public void setLivingStore(msv msvVar) {
        hai haiVar = this.f44145j;
        if (haiVar != null) {
            haiVar.f201183F = msvVar;
        }
    }

    public void setShowInVideoFlowPosition(int i) {
        this.f44141f = i;
    }

    public FeedVideoViewFlowItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67385d(context);
    }

    public FeedVideoViewFlowItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67385d(context);
    }
}
