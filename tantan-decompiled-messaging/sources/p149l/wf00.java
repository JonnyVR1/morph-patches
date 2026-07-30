package p149l;

import android.content.Context;
import android.view.View;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public abstract class wf00<T> {

    /* JADX INFO: renamed from: e */
    public static final int f185998e = t100.m186890d(12.0f);

    /* JADX INFO: renamed from: a */
    public String f185999a;

    /* JADX INFO: renamed from: b */
    public RawFeed f186000b;

    /* JADX INFO: renamed from: c */
    public boolean f186001c;

    /* JADX INFO: renamed from: d */
    public boolean f186002d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m202939a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m202940b(View view) {
        if (NullChecker.m81303a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.vf00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    wf00.m202939a(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo96278c(VLinear vLinear, Context context, T t) {
        if (NullChecker.m81303a(vLinear)) {
            vLinear.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m202941d(FeedCenterView feedCenterView) {
        vwb.m200354z(vwb.m200324f0(feedCenterView.f41891f.getTextView(), feedCenterView.f41892g, feedCenterView.f41886a), new e30() { // from class: l.uf00
            @Override // p149l.e30
            public final void call(Object obj) {
                wf00.m202940b((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m202942e(boolean z, boolean z2) {
        this.f186001c = z;
        this.f186002d = z2;
    }

    /* JADX INFO: renamed from: f */
    public void m202943f(String str) {
        this.f185999a = str;
    }

    /* JADX INFO: renamed from: g */
    public void m202944g(RawFeed rawFeed) {
        this.f186000b = rawFeed;
    }
}
