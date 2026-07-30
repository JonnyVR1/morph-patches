package p153l;

import android.content.Context;
import android.view.View;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public abstract class fo00<T> {

    /* JADX INFO: renamed from: e */
    public static final int f99996e = qa00.m175859d(12.0f);

    /* JADX INFO: renamed from: a */
    public String f99997a;

    /* JADX INFO: renamed from: b */
    public RawFeed f99998b;

    /* JADX INFO: renamed from: c */
    public boolean f99999c;

    /* JADX INFO: renamed from: d */
    public boolean f100000d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m126433a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m126434b(View view) {
        if (NullChecker.m82486a(view)) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.eo00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    fo00.m126433a(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo99052c(VLinear vLinear, Context context, T t) {
        if (NullChecker.m82486a(vLinear)) {
            vLinear.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m126435d(FeedCenterView feedCenterView) {
        jyb.m147537z(jyb.m147507f0(feedCenterView.f42739f.getTextView(), feedCenterView.f42740g, feedCenterView.f42734a), new y20() { // from class: l.do00
            @Override // p153l.y20
            public final void call(Object obj) {
                fo00.m126434b((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m126436e(boolean z, boolean z2) {
        this.f99999c = z;
        this.f100000d = z2;
    }

    /* JADX INFO: renamed from: f */
    public void m126437f(String str) {
        this.f99997a = str;
    }

    /* JADX INFO: renamed from: g */
    public void m126438g(RawFeed rawFeed) {
        this.f99998b = rawFeed;
    }
}
