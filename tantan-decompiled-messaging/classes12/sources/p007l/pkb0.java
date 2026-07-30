package p007l;

import android.graphics.Color;
import android.view.View;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import l.t100;
import l.xdl0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pkb0 extends C2124a {

    /* JADX INFO: renamed from: E */
    public o7i f11876E;

    public pkb0(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, o7i o7iVar, VRecyclerView vRecyclerView, String str, String str2, int i) {
        super(photoAlbumFeedBaseFrag, vRecyclerView, str, str2, i, false);
        this.f11876E = o7iVar;
    }

    /* JADX INFO: renamed from: A0 */
    public String m13066A0() {
        String string = this.f2841e.getString(R$string.f361G2);
        if (this.f2854r) {
            return this.f2841e.getString(R$string.f504d4);
        }
        return this.f11876E.m12458n0() ? this.f2841e.getString(R$string.f544j2) : string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a
    /* JADX INFO: renamed from: O */
    public void mo4938A(View view, MomentItem momentItem, int i, int i2) {
        if (view instanceof QATopicPhotoAlbumTopView) {
            ((QATopicPhotoAlbumTopView) view).setTopicMoment(this.f11876E.f11369f);
        }
        super.mo4938A(view, momentItem, i, i2);
        if (momentItem != null) {
            momentItem.f2812d.topics.size();
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a
    /* JADX INFO: renamed from: o0 */
    public void mo4964o0(CommonEmptyView commonEmptyView) {
        if (!this.f2848l) {
            xdl0.M0(commonEmptyView, false);
            return;
        }
        xdl0.M0(commonEmptyView, true);
        xdl0.M(commonEmptyView.f2281a, false);
        commonEmptyView.f2282b.setText(m13066A0());
        commonEmptyView.f2282b.setTextColor(Color.parseColor("#d0d0d0"));
        xdl0.X(commonEmptyView.f2281a, t100.d(21.0f));
        commonEmptyView.setBackgroundColor(-1);
    }
}
