package p153l;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class ut60 extends tt60 {

    /* JADX INFO: renamed from: H */
    public RecyclerView f180892H;

    /* JADX INFO: renamed from: I */
    public mch f180893I;

    public ut60(PhotoAlbumBaseFrag photoAlbumBaseFrag, v0q v0qVar, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        super(photoAlbumBaseFrag, v0qVar, vRecyclerView, str, str2, i, z);
        this.f180892H = vRecyclerView;
    }

    /* JADX INFO: renamed from: D0 */
    public void m197961D0(mch mchVar) {
        this.f180893I = mchVar;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a
    /* JADX INFO: renamed from: l0 */
    public void mo65106l0() {
        super.mo65106l0();
        mch mchVar = this.f180893I;
        if (mchVar != null) {
            mchVar.mo65640U3();
        }
    }

    @Override // p153l.tt60, com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a
    /* JADX INFO: renamed from: o0 */
    public void mo65109o0(CommonEmptyView commonEmptyView) {
        super.mo65109o0(commonEmptyView);
        mch mchVar = this.f180893I;
        if (mchVar != null) {
            mchVar.mo65645g0();
        }
        if (!cmg.m111195W()) {
            bnl0.m105505C0(commonEmptyView, 0);
            return;
        }
        commonEmptyView.setVisibility(0);
        commonEmptyView.f41669b.setText(R$string.f39751H);
        commonEmptyView.f41668a.setImageResource(lbc0.f130957V1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) commonEmptyView.f41668a.getLayoutParams();
        if (NullChecker.m82486a(layoutParams)) {
            layoutParams.width = qa00.m175859d(210.0f);
            layoutParams.height = qa00.m175859d(150.0f);
            layoutParams.topMargin = qa00.m175859d(56.0f);
            commonEmptyView.f41668a.setLayoutParams(layoutParams);
        }
        commonEmptyView.setLayoutParams(new ViewGroup.LayoutParams(-1, qa00.m175859d(300.0f)));
    }
}
