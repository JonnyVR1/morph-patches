package p153l;

import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class tt60 extends C11443a {

    /* JADX INFO: renamed from: E */
    public v0q f176057E;

    /* JADX INFO: renamed from: F */
    public int f176058F;

    /* JADX INFO: renamed from: G */
    public String f176059G;

    public tt60(PhotoAlbumBaseFrag photoAlbumBaseFrag, v0q v0qVar, VRecyclerView vRecyclerView, String str, String str2, int i, boolean z) {
        super(photoAlbumBaseFrag, vRecyclerView, str, str2, i, z);
        this.f176057E = v0qVar;
        this.f176059G = str2;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m192654A0() {
        return this.f42235l;
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m192655B0() {
        return this.f42241r;
    }

    /* JADX INFO: renamed from: C0 */
    public void m192656C0(int i) {
        this.f176058F = i;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a
    /* JADX INFO: renamed from: o0 */
    public void mo65109o0(CommonEmptyView commonEmptyView) {
        if (!this.f42235l) {
            bnl0.m105525M0(commonEmptyView, false);
            return;
        }
        boolean zEquals = FeedModule.m61405F().userId().equals(this.f42230g);
        bnl0.m105525M0(commonEmptyView, true);
        commonEmptyView.setBackgroundColor(-1);
        if (this.f176057E.mo63220w1()) {
            commonEmptyView.f41669b.setText(R$string.f39933j4);
            commonEmptyView.f41668a.setImageResource(lbc0.f131134s);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) commonEmptyView.f41668a.getLayoutParams();
            if (NullChecker.m82486a(layoutParams)) {
                layoutParams.width = qa00.m175859d(210.0f);
                layoutParams.height = qa00.m175859d(150.0f);
                layoutParams.topMargin = qa00.m175859d(116.0f);
                commonEmptyView.f41668a.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (this.f42241r) {
            commonEmptyView.f41669b.setText(R$string.f39911g3);
            commonEmptyView.f41668a.setImageResource(lbc0.f130972X2);
            bnl0.m105540X(commonEmptyView.f41668a, qa00.m175859d(40.0f));
            return;
        }
        if (zEquals) {
            bnl0.m105525M0(commonEmptyView, false);
            return;
        }
        int i = this.f176058F;
        if (i == 0) {
            i = zEquals ? R$string.f39877b4 : R$string.f39926i4;
        }
        commonEmptyView.f41669b.setText(i);
        commonEmptyView.f41668a.setImageResource(lbc0.f131118q);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) commonEmptyView.f41668a.getLayoutParams();
        if (NullChecker.m82486a(layoutParams2)) {
            layoutParams2.width = qa00.m175859d(210.0f);
            layoutParams2.height = qa00.m175859d(150.0f);
            layoutParams2.topMargin = qa00.m175859d(116.0f);
            commonEmptyView.f41668a.setLayoutParams(layoutParams2);
        }
    }
}
