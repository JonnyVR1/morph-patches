package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import p149l.e1c0;
import p149l.e30;
import p149l.mkd0;
import p149l.roj0;
import p149l.zs00;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsOrStoriesFeedPage extends SwipeRefreshLayout implements SwipeRefreshLayout.InterfaceC0700j {

    /* JADX INFO: renamed from: S */
    public MomentsOrStoriesFeedPage f43966S;

    /* JADX INFO: renamed from: T */
    public MomentsFeedRecyclerList f43967T;

    public MomentsOrStoriesFeedPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m67016A(Throwable th) {
        setRefreshing(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67017y(this);
        this.f43966S.setOnRefreshListener(this);
        this.f43966S.setColorSchemeResources(e1c0.f88793k0, e1c0.f88787h0, e1c0.f88789i0, e1c0.f88791j0);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
    /* JADX INFO: renamed from: q */
    public void mo4094q() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f43967T.m66893V().subscribe(mkd0.m154956H(new e30() { // from class: l.xs00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194195a.m67018z(jElapsedRealtime, (roj0) obj);
            }
        }, new e30() { // from class: l.ys00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199736a.m67016A((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m67017y(View view) {
        zs00.m219998a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m67018z(long j, roj0 roj0Var) {
        setRefreshing(false);
        TrackMediaUploadUtil.m80298b0(Moments.TYPE, SystemClock.elapsedRealtime() - j);
    }

    public MomentsOrStoriesFeedPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
