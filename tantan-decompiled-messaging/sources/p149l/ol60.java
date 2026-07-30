package p149l;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class ol60 extends nl60 {

    /* JADX INFO: renamed from: H */
    public RecyclerView f144479H;

    /* JADX INFO: renamed from: I */
    public xah f144480I;

    public ol60(PhotoAlbumBaseFrag photoAlbumBaseFrag, vyp vypVar, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        super(photoAlbumBaseFrag, vypVar, vRecyclerView, str, str2, i, z);
        this.f144479H = vRecyclerView;
    }

    /* JADX INFO: renamed from: D0 */
    public void m164924D0(xah xahVar) {
        this.f144480I = xahVar;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a
    /* JADX INFO: renamed from: l0 */
    public void mo63923l0() {
        super.mo63923l0();
        xah xahVar = this.f144480I;
        if (xahVar != null) {
            xahVar.mo64457U3();
        }
    }

    @Override // p149l.nl60, com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a
    /* JADX INFO: renamed from: o0 */
    public void mo63926o0(CommonEmptyView commonEmptyView) {
        super.mo63926o0(commonEmptyView);
        xah xahVar = this.f144480I;
        if (xahVar != null) {
            xahVar.mo64462g0();
        }
        if (!nkg.m159866W()) {
            xdl0.m208325C0(commonEmptyView, 0);
            return;
        }
        commonEmptyView.setVisibility(0);
        commonEmptyView.f40821b.setText(R$string.f38903H);
        commonEmptyView.f40820a.setImageResource(f3c0.f94439V1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) commonEmptyView.f40820a.getLayoutParams();
        if (NullChecker.m81303a(layoutParams)) {
            layoutParams.width = t100.m186890d(210.0f);
            layoutParams.height = t100.m186890d(150.0f);
            layoutParams.topMargin = t100.m186890d(56.0f);
            commonEmptyView.f40820a.setLayoutParams(layoutParams);
        }
        commonEmptyView.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.m186890d(300.0f)));
    }
}
