package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class zn00 extends fo00<Moment> {

    /* JADX INFO: renamed from: f */
    public FeedCenterForwardVideoView f205168f;

    @Override // p153l.fo00
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo99052c(VLinear vLinear, Context context, Moment moment) {
        super.mo99052c(vLinear, context, moment);
        if (NullChecker.m82487b(vLinear)) {
            View viewInflate = LayoutInflater.from(context).inflate(tec0.f173616Z0, (ViewGroup) vLinear, false);
            if (viewInflate instanceof FeedCenterForwardVideoView) {
                FeedCenterForwardVideoView feedCenterForwardVideoView = (FeedCenterForwardVideoView) viewInflate;
                this.f205168f = feedCenterForwardVideoView;
                feedCenterForwardVideoView.m65788l0(0, moment, new HashMap<>(), 12);
                FeedCenterForwardVideoView feedCenterForwardVideoView2 = this.f205168f;
                feedCenterForwardVideoView2.f42744k = this.f99997a;
                feedCenterForwardVideoView2.f42745l = true;
                feedCenterForwardVideoView2.f42746m = this.f99999c;
                feedCenterForwardVideoView2.f42747n = this.f100000d;
                vLinear.addView(feedCenterForwardVideoView2);
                m126435d(this.f205168f);
                if (s1j.m184047a(moment)) {
                    return;
                }
                lb1.m153552b(null, 1);
            }
        }
    }
}
