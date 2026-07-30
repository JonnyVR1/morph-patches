package p153l;

import android.graphics.Color;
import android.view.View;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class tsb0 extends C11443a {

    /* JADX INFO: renamed from: E */
    public d9i f175972E;

    public tsb0(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, d9i d9iVar, VRecyclerView vRecyclerView, String str, String str2, int i) {
        super(photoAlbumFeedBaseFrag, vRecyclerView, str, str2, i, false);
        this.f175972E = d9iVar;
    }

    /* JADX INFO: renamed from: A0 */
    public String m192574A0() {
        String string = this.f42228e.getString(R$string.f39748G2);
        if (this.f42241r) {
            return this.f42228e.getString(R$string.f39891d4);
        }
        return this.f175972E.m115075n0() ? this.f42228e.getString(R$string.f39931j2) : string;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a, p153l.jic0
    /* JADX INFO: renamed from: O */
    public void mo29822A(View view, MomentItem momentItem, int i, int i2) {
        if (view instanceof QATopicPhotoAlbumTopView) {
            ((QATopicPhotoAlbumTopView) view).setTopicMoment(this.f175972E.f85782f);
        }
        super.mo29822A(view, momentItem, i, i2);
        if (momentItem != null) {
            momentItem.f42199d.topics.size();
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a
    /* JADX INFO: renamed from: o0 */
    public void mo65109o0(CommonEmptyView commonEmptyView) {
        if (!this.f42235l) {
            bnl0.m105525M0(commonEmptyView, false);
            return;
        }
        bnl0.m105525M0(commonEmptyView, true);
        bnl0.m105524M(commonEmptyView.f41668a, false);
        commonEmptyView.f41669b.setText(m192574A0());
        commonEmptyView.f41669b.setTextColor(Color.parseColor("#d0d0d0"));
        bnl0.m105540X(commonEmptyView.f41668a, qa00.m175859d(21.0f));
        commonEmptyView.setBackgroundColor(-1);
    }
}
