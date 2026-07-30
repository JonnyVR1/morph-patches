package p149l;

import android.view.View;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class ayi0 extends C11280a {

    /* JADX INFO: renamed from: E */
    public o7i f72293E;

    public ayi0(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, o7i o7iVar, VRecyclerView vRecyclerView, String str, String str2, int i) {
        super(photoAlbumFeedBaseFrag, vRecyclerView, str, str2, i, false);
        this.f72293E = o7iVar;
    }

    /* JADX INFO: renamed from: A0 */
    public String m99565A0() {
        String string = this.f41380e.getString(R$string.f38922K0);
        if (this.f41393r) {
            return this.f41380e.getString(R$string.f39043d4);
        }
        return (this.f72293E == null || !this.f72293E.m162992n0()) ? string : this.f41380e.getString(R$string.f39083j2);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a, p149l.dac0
    /* JADX INFO: renamed from: O */
    public void mo28823A(View view, MomentItem momentItem, int i, int i2) {
        super.mo28823A(view, momentItem, i, i2);
        if (momentItem != null) {
            momentItem.f41351d.topics.size();
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a
    /* JADX INFO: renamed from: o0 */
    public void mo63926o0(CommonEmptyView commonEmptyView) {
        if (!this.f41387l) {
            xdl0.m208345M0(commonEmptyView, false);
            return;
        }
        xdl0.m208345M0(commonEmptyView, true);
        xdl0.m208344M(commonEmptyView.f40820a, false);
        commonEmptyView.f40821b.setText(m99565A0());
        xdl0.m208360X(commonEmptyView.f40820a, t100.m186890d(21.0f));
        commonEmptyView.setBackgroundColor(-1);
    }
}
