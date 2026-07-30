package p149l;

import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class nl60 extends C11280a {

    /* JADX INFO: renamed from: E */
    public vyp f139509E;

    /* JADX INFO: renamed from: F */
    public int f139510F;

    /* JADX INFO: renamed from: G */
    public String f139511G;

    public nl60(PhotoAlbumBaseFrag photoAlbumBaseFrag, vyp vypVar, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        super(photoAlbumBaseFrag, vRecyclerView, str, str2, i, z);
        this.f139509E = vypVar;
        this.f139511G = str2;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m160014A0() {
        return this.f41387l;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m160015B0() {
        return this.f41393r;
    }

    /* JADX INFO: renamed from: C0 */
    public void m160016C0(int i) {
        this.f139510F = i;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a
    /* JADX INFO: renamed from: o0 */
    public void mo63926o0(CommonEmptyView commonEmptyView) {
        if (!this.f41387l) {
            xdl0.m208345M0(commonEmptyView, false);
            return;
        }
        boolean zEquals = FeedModule.m60221F().userId().equals(this.f41382g);
        xdl0.m208345M0(commonEmptyView, true);
        commonEmptyView.setBackgroundColor(-1);
        if (this.f139509E.mo62037w1()) {
            commonEmptyView.f40821b.setText(R$string.f39085j4);
            commonEmptyView.f40820a.setImageResource(f3c0.f94616s);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) commonEmptyView.f40820a.getLayoutParams();
            if (NullChecker.m81303a(layoutParams)) {
                layoutParams.width = t100.m186890d(210.0f);
                layoutParams.height = t100.m186890d(150.0f);
                layoutParams.topMargin = t100.m186890d(116.0f);
                commonEmptyView.f40820a.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (this.f41393r) {
            commonEmptyView.f40821b.setText(R$string.f39063g3);
            commonEmptyView.f40820a.setImageResource(f3c0.f94454X2);
            xdl0.m208360X(commonEmptyView.f40820a, t100.m186890d(40.0f));
            return;
        }
        if (zEquals) {
            xdl0.m208345M0(commonEmptyView, false);
            return;
        }
        int i = this.f139510F;
        if (i == 0) {
            i = zEquals ? R$string.f39029b4 : R$string.f39078i4;
        }
        commonEmptyView.f40821b.setText(i);
        commonEmptyView.f40820a.setImageResource(f3c0.f94600q);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) commonEmptyView.f40820a.getLayoutParams();
        if (NullChecker.m81303a(layoutParams2)) {
            layoutParams2.width = t100.m186890d(210.0f);
            layoutParams2.height = t100.m186890d(150.0f);
            layoutParams2.topMargin = t100.m186890d(116.0f);
            commonEmptyView.f40820a.setLayoutParams(layoutParams2);
        }
    }
}
