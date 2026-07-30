package p149l;

import android.graphics.Color;
import android.view.View;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class pkb0 extends C11280a {

    /* JADX INFO: renamed from: E */
    public o7i f149960E;

    public pkb0(PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag, o7i o7iVar, VRecyclerView vRecyclerView, String str, String str2, int i) {
        super(photoAlbumFeedBaseFrag, vRecyclerView, str, str2, i, false);
        this.f149960E = o7iVar;
    }

    /* JADX INFO: renamed from: A0 */
    public String m170019A0() {
        String string = this.f41380e.getString(R$string.f38900G2);
        if (this.f41393r) {
            return this.f41380e.getString(R$string.f39043d4);
        }
        return this.f149960E.m162992n0() ? this.f41380e.getString(R$string.f39083j2) : string;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a, p149l.dac0
    /* JADX INFO: renamed from: O */
    public void mo28823A(View view, MomentItem momentItem, int i, int i2) {
        if (view instanceof QATopicPhotoAlbumTopView) {
            ((QATopicPhotoAlbumTopView) view).setTopicMoment(this.f149960E.f142497f);
        }
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
        commonEmptyView.f40821b.setText(m170019A0());
        commonEmptyView.f40821b.setTextColor(Color.parseColor("#d0d0d0"));
        xdl0.m208360X(commonEmptyView.f40820a, t100.m186890d(21.0f));
        commonEmptyView.setBackgroundColor(-1);
    }
}
