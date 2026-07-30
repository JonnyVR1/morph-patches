package p007l;

import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import l.xdl0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nl60 extends C2124a {

    /* JADX INFO: renamed from: E */
    public vyp f10821E;

    /* JADX INFO: renamed from: F */
    public int f10822F;

    /* JADX INFO: renamed from: G */
    public String f10823G;

    public nl60(PhotoAlbumBaseFrag photoAlbumBaseFrag, vyp vypVar, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        super(photoAlbumBaseFrag, vRecyclerView, str, str2, i, z);
        this.f10821E = vypVar;
        this.f10823G = str2;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m12283A0() {
        return this.f2848l;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m12284B0() {
        return this.f2854r;
    }

    /* JADX INFO: renamed from: C0 */
    public void m12285C0(int i) {
        this.f10822F = i;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a
    /* JADX INFO: renamed from: o0 */
    public void mo4964o0(CommonEmptyView commonEmptyView) {
        if (!this.f2848l) {
            xdl0.M0(commonEmptyView, false);
            return;
        }
        boolean zEquals = FeedModule.m1139F().userId().equals(this.f2843g);
        xdl0.M0(commonEmptyView, true);
        commonEmptyView.setBackgroundColor(-1);
        if (this.f10821E.mo3015w1()) {
            commonEmptyView.f2282b.setText(R$string.f546j4);
            commonEmptyView.f2281a.setImageResource(f3c0.f7899s);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) commonEmptyView.f2281a.getLayoutParams();
            if (NullChecker.a(layoutParams)) {
                layoutParams.width = t100.d(210.0f);
                layoutParams.height = t100.d(150.0f);
                layoutParams.topMargin = t100.d(116.0f);
                commonEmptyView.f2281a.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (this.f2854r) {
            commonEmptyView.f2282b.setText(R$string.f524g3);
            commonEmptyView.f2281a.setImageResource(f3c0.f7737X2);
            xdl0.X(commonEmptyView.f2281a, t100.d(40.0f));
            return;
        }
        if (zEquals) {
            xdl0.M0(commonEmptyView, false);
            return;
        }
        int i = this.f10822F;
        if (i == 0) {
            i = zEquals ? R$string.f490b4 : R$string.f539i4;
        }
        commonEmptyView.f2282b.setText(i);
        commonEmptyView.f2281a.setImageResource(f3c0.f7883q);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) commonEmptyView.f2281a.getLayoutParams();
        if (NullChecker.a(layoutParams2)) {
            layoutParams2.width = t100.d(210.0f);
            layoutParams2.height = t100.d(150.0f);
            layoutParams2.topMargin = t100.d(116.0f);
            commonEmptyView.f2281a.setLayoutParams(layoutParams2);
        }
    }
}
