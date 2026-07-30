package p153l;

import android.view.View;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class e7j0 extends C11443a {

    /* JADX INFO: renamed from: E */
    public d9i f92444E;

    public e7j0(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, d9i d9iVar, VRecyclerView vRecyclerView, String str, String str2, int i) {
        super(photoAlbumFeedBaseFrag, vRecyclerView, str, str2, i, false);
        this.f92444E = d9iVar;
    }

    /* JADX INFO: renamed from: A0 */
    public String m119712A0() {
        String string = this.f42228e.getString(R$string.f39770K0);
        if (this.f42241r) {
            return this.f42228e.getString(R$string.f39891d4);
        }
        return (this.f92444E == null || !this.f92444E.m115075n0()) ? string : this.f42228e.getString(R$string.f39931j2);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a, p153l.jic0
    /* JADX INFO: renamed from: O */
    public void mo29822A(View view, MomentItem momentItem, int i, int i2) {
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
        commonEmptyView.f41669b.setText(m119712A0());
        bnl0.m105540X(commonEmptyView.f41668a, qa00.m175859d(21.0f));
        commonEmptyView.setBackgroundColor(-1);
    }
}
