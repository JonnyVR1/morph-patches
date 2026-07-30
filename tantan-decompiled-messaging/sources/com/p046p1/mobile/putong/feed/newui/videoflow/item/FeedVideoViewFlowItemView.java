package com.p046p1.mobile.putong.feed.newui.videoflow.item;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.preview.act.C11315a;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.d30;
import p149l.lqv;
import p149l.s8i;
import p149l.x770;
import p149l.xdl0;
import p149l.xvh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedVideoViewFlowItemView extends FrameLayout implements xvh {

    /* JADX INFO: renamed from: a */
    public C11315a f43288a;

    /* JADX INFO: renamed from: b */
    public x770 f43289b;

    /* JADX INFO: renamed from: c */
    public boolean f43290c;

    /* JADX INFO: renamed from: d */
    public boolean f43291d;

    /* JADX INFO: renamed from: e */
    public boolean f43292e;

    /* JADX INFO: renamed from: f */
    public int f43293f;

    /* JADX INFO: renamed from: g */
    public int f43294g;

    /* JADX INFO: renamed from: h */
    public boolean f43295h;

    /* JADX INFO: renamed from: i */
    public String f43296i;

    /* JADX INFO: renamed from: j */
    public s8i f43297j;

    public FeedVideoViewFlowItemView(@NonNull Context context, String str, int i, boolean z, boolean z2, boolean z3) {
        super(context);
        this.f43296i = str;
        if (TextUtils.isEmpty(str)) {
            this.f43296i = "from_video_flow";
        }
        this.f43290c = z;
        this.f43291d = z2;
        this.f43292e = z3;
        this.f43294g = i;
        m66202d(context);
    }

    /* JADX INFO: renamed from: c */
    public static PhotoAlbumPlayerView m66199c(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        return childAt instanceof PhotoAlbumPlayerView ? (PhotoAlbumPlayerView) childAt : m66199c(childAt);
    }

    private PhotoAlbumPlayerView getVideoPlayView() {
        if (!NullChecker.m81303a(this.f43288a.f42610b)) {
            return null;
        }
        return m66199c(this.f43288a.f42610b.findViewWithTag(Integer.valueOf(this.f43288a.f42610b.getCurrentItem())));
    }

    @Override // p149l.xvh
    /* JADX INFO: renamed from: a */
    public boolean mo66200a(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        return false;
    }

    @Override // p149l.xvh
    /* JADX INFO: renamed from: b */
    public boolean mo66201b(int i, PhotoAlbumPlayerView photoAlbumPlayerView) {
        return this.f43291d;
    }

    /* JADX INFO: renamed from: d */
    public final void m66202d(Context context) {
        if (context instanceof Act) {
            Act act = (Act) context;
            this.f43289b = new x770(act);
            s8i s8iVar = new s8i(act, this);
            this.f43297j = s8iVar;
            s8iVar.f163065p1 = this.f43292e;
            s8iVar.f163064o1 = this.f43290c;
            C11315a c11315aM65335b = C11315a.a.m65334a().m65337d(act).m65336c(this.f43297j).m65339f(this.f43297j).m65338e(this.f43296i).m65335b();
            this.f43288a = c11315aM65335b;
            this.f43289b.mo51532C(c11315aM65335b);
            View viewInflateView = this.f43288a.inflateView(LayoutInflater.from(context), this);
            int iM208412y0 = xdl0.m208412y0();
            int iM208408w0 = this.f43294g;
            if (iM208408w0 == 0) {
                iM208408w0 = xdl0.m208408w0() - xdl0.m208331F0();
            }
            viewInflateView.setLayoutParams(new ViewGroup.MarginLayoutParams(iM208412y0, iM208408w0));
            addView(viewInflateView);
            this.f43289b.mo39470a0();
            this.f43288a.m65322f();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m66203e() {
        if (NullChecker.m81303a(this.f43297j)) {
            this.f43297j.m182594z1();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m66204f(Moment moment, int i) {
        if (NullChecker.m81303a(moment)) {
            x770 x770Var = this.f43289b;
            x770Var.f191324e = moment;
            x770Var.f191320a = FeedModule.f38855d.m209447e8(moment.owner);
            this.f43288a.m65333v((ArrayList) moment.media);
            this.f43288a.m65331s();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m66205g() {
        PhotoAlbumPlayerView videoPlayView = getVideoPlayView();
        this.f43295h = true;
        if (NullChecker.m81303a(videoPlayView) && !videoPlayView.m65431y()) {
            videoPlayView.m65418F();
            this.f43295h = false;
        }
        if (this.f43295h) {
            this.f43297j.m182591w1();
        }
    }

    public int getShowInVideoFlowPosition() {
        return this.f43293f;
    }

    public C11315a getViewModel() {
        return this.f43288a;
    }

    /* JADX INFO: renamed from: h */
    public void m66206h() {
        PhotoAlbumPlayerView videoPlayView = getVideoPlayView();
        if (NullChecker.m81303a(videoPlayView) && videoPlayView.m65431y()) {
            videoPlayView.m65422J();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m66207i() {
        if (NullChecker.m81303a(this.f43297j)) {
            this.f43297j.m182590A1();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m66207i();
    }

    public void setAutoNextVideo(d30 d30Var) {
        this.f43297j.m192315l1(d30Var);
    }

    public void setLivingStore(lqv lqvVar) {
        s8i s8iVar = this.f43297j;
        if (s8iVar != null) {
            s8iVar.f119156F = lqvVar;
        }
    }

    public void setShowInVideoFlowPosition(int i) {
        this.f43293f = i;
    }

    public FeedVideoViewFlowItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66202d(context);
    }

    public FeedVideoViewFlowItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66202d(context);
    }
}
