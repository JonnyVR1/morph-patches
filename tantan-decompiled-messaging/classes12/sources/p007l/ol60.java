package p007l;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.xdl0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ol60 extends nl60 {

    /* JADX INFO: renamed from: H */
    public RecyclerView f11496H;

    /* JADX INFO: renamed from: I */
    public xah f11497I;

    public ol60(PhotoAlbumBaseFrag photoAlbumBaseFrag, vyp vypVar, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        super(photoAlbumBaseFrag, vypVar, vRecyclerView, str, str2, i, z);
        this.f11496H = vRecyclerView;
    }

    /* JADX INFO: renamed from: D0 */
    public void m12654D0(xah xahVar) {
        this.f11497I = xahVar;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a
    /* JADX INFO: renamed from: l0 */
    public void mo4961l0() {
        super.mo4961l0();
        xah xahVar = this.f11497I;
        if (xahVar != null) {
            xahVar.mo5542U3();
        }
    }

    @Override // p007l.nl60, com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a
    /* JADX INFO: renamed from: o0 */
    public void mo4964o0(CommonEmptyView commonEmptyView) {
        super.mo4964o0(commonEmptyView);
        xah xahVar = this.f11497I;
        if (xahVar != null) {
            xahVar.mo5548g0();
        }
        if (!nkg.m12225W()) {
            xdl0.C0(commonEmptyView, 0);
            return;
        }
        commonEmptyView.setVisibility(0);
        commonEmptyView.f2282b.setText(R$string.f364H);
        commonEmptyView.f2281a.setImageResource(f3c0.f7722V1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) commonEmptyView.f2281a.getLayoutParams();
        if (NullChecker.a(layoutParams)) {
            layoutParams.width = t100.d(210.0f);
            layoutParams.height = t100.d(150.0f);
            layoutParams.topMargin = t100.d(56.0f);
            commonEmptyView.f2281a.setLayoutParams(layoutParams);
        }
        commonEmptyView.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.d(300.0f)));
    }
}
