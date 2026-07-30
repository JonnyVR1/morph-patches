package p007l;

import android.content.Context;
import android.view.View;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.t100;
import l.vwb;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class wf00<T> {

    /* JADX INFO: renamed from: e */
    public static final int f14523e = t100.d(12.0f);

    /* JADX INFO: renamed from: a */
    public String f14524a;

    /* JADX INFO: renamed from: b */
    public RawFeed f14525b;

    /* JADX INFO: renamed from: c */
    public boolean f14526c;

    /* JADX INFO: renamed from: d */
    public boolean f14527d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15807a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15808b(View view) {
        if (NullChecker.a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.vf00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    wf00.m15807a(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo8538c(VLinear vLinear, Context context, T t) {
        if (NullChecker.a(vLinear)) {
            vLinear.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15809d(FeedCenterView feedCenterView) {
        vwb.z(vwb.f0(new View[]{feedCenterView.f3352f.getTextView(), feedCenterView.f3353g, feedCenterView.f3347a}), new e30() { // from class: l.uf00
            public final void call(Object obj) {
                wf00.m15808b((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m15810e(boolean z, boolean z2) {
        this.f14526c = z;
        this.f14527d = z2;
    }

    /* JADX INFO: renamed from: f */
    public void m15811f(String str) {
        this.f14524a = str;
    }

    /* JADX INFO: renamed from: g */
    public void m15812g(RawFeed rawFeed) {
        this.f14525b = rawFeed;
    }
}
