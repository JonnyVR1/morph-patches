package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.data.Moments;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import l.e30;
import l.mkd0;
import l.roj0;
import p007l.e1c0;
import p007l.zs00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsOrStoriesFeedPage extends SwipeRefreshLayout implements SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: S */
    public MomentsOrStoriesFeedPage f5427S;

    /* JADX INFO: renamed from: T */
    public MomentsFeedRecyclerList f5428T;

    public MomentsOrStoriesFeedPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8218A(Throwable th) {
        setRefreshing(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8220y(this);
        this.f5427S.setOnRefreshListener(this);
        this.f5427S.setColorSchemeResources(new int[]{e1c0.f7149k0, e1c0.f7143h0, e1c0.f7145i0, e1c0.f7147j0});
    }

    /* JADX INFO: renamed from: q */
    public void m8219q() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f5428T.m8087V().subscribe(mkd0.H(new e30() { // from class: l.xs00
            public final void call(Object obj) {
                this.f15112a.m8221z(jElapsedRealtime, (roj0) obj);
            }
        }, new e30() { // from class: l.ys00
            public final void call(Object obj) {
                this.f15496a.m8218A((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m8220y(View view) {
        zs00.m17537a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8221z(long j, roj0 roj0Var) {
        setRefreshing(false);
        TrackMediaUploadUtil.b0(Moments.TYPE, SystemClock.elapsedRealtime() - j);
    }

    public MomentsOrStoriesFeedPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
