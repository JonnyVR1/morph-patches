package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import p153l.i110;
import p153l.k9c0;
import p153l.psd0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsOrStoriesFeedPage extends SwipeRefreshLayout implements SwipeRefreshLayout.InterfaceC0702j {

    /* JADX INFO: renamed from: S */
    public MomentsOrStoriesFeedPage f44814S;

    /* JADX INFO: renamed from: T */
    public MomentsFeedRecyclerList f44815T;

    public MomentsOrStoriesFeedPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m68199A(Throwable th) {
        setRefreshing(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68200y(this);
        this.f44814S.setOnRefreshListener(this);
        this.f44814S.setColorSchemeResources(k9c0.f124516k0, k9c0.f124510h0, k9c0.f124512i0, k9c0.f124514j0);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
    /* JADX INFO: renamed from: p */
    public void mo4096p() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f44815T.m68076V().subscribe(psd0.m173597H(new y20() { // from class: l.g110
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101708a.m68201z(jElapsedRealtime, (uxj0) obj);
            }
        }, new y20() { // from class: l.h110
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107397a.m68199A((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m68200y(View view) {
        i110.m138054a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m68201z(long j, uxj0 uxj0Var) {
        setRefreshing(false);
        TrackMediaUploadUtil.m81481b0(Moments.TYPE, SystemClock.elapsedRealtime() - j);
    }

    public MomentsOrStoriesFeedPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
