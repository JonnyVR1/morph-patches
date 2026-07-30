package p153l;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.PoiLocation;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiNearbyUsesEnterView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class wh80 implements s2m {

    /* JADX INFO: renamed from: a */
    public Act f189092a;

    /* JADX INFO: renamed from: b */
    public C11443a f189093b;

    /* JADX INFO: renamed from: c */
    public s8h f189094c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumBaseFrag f189095d;

    /* JADX INFO: renamed from: e */
    public soh f189096e;

    /* JADX INFO: renamed from: f */
    public joh f189097f;

    /* JADX INFO: renamed from: g */
    public FeedPoiNearbyUsesEnterView f189098g;

    public wh80(Act act, joh johVar) {
        this.f189092a = act;
        this.f189097f = johVar;
        m206340d();
    }

    /* JADX INFO: renamed from: f */
    private void m206336f() {
        this.f189095d.m65210h5(this);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: L0 */
    public n570 mo63211L0() {
        soh sohVar = new soh(this.f189095d, this, this.f189097f.m146454j());
        this.f189096e = sohVar;
        return sohVar;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        this.f189094c = new s8h(this.f189093b);
        LinearLayout linearLayout = new LinearLayout(this.f189092a);
        linearLayout.setOrientation(1);
        linearLayout.addView(m206338b());
        linearLayout.addView(m206339c());
        this.f189094c.m222265H(linearLayout);
        this.f189093b.m65113s0(1);
        return this.f189094c;
    }

    /* JADX INFO: renamed from: a */
    public void m206337a() {
        FeedPoiNearbyUsesEnterView feedPoiNearbyUsesEnterView = this.f189098g;
        if (feedPoiNearbyUsesEnterView == null) {
            return;
        }
        feedPoiNearbyUsesEnterView.m66213Q();
        bnl0.m105524M(this.f189097f.f122013m, true);
    }

    /* JADX INFO: renamed from: b */
    public FeedPoiNearbyUsesEnterView m206338b() {
        this.f189098g = (FeedPoiNearbyUsesEnterView) this.f189092a.inflater().inflate(tec0.f173736q2, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = qa00.f156323j;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f189098g.setLayoutParams(layoutParams);
        return this.f189098g;
    }

    /* JADX INFO: renamed from: c */
    public RelativeLayout m206339c() {
        VText vText = new VText(this.f189092a);
        vText.setText(R$string.f39745G);
        vText.setTextColor(this.f189092a.getResources().getColor(k9c0.f124469A));
        vText.setTextSize(15.0f);
        vText.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        vText.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f189092a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = qa00.f156323j;
        layoutParams2.topMargin = qa00.f156328o;
        layoutParams2.bottomMargin = qa00.f156317d;
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: d */
    public final void m206340d() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = (PhotoAlbumBaseFrag) this.f189092a.getSupportFragmentManager().m2558i0("PhotoAlbumBaseFrag");
        this.f189095d = photoAlbumBaseFrag;
        if (NullChecker.m82486a(photoAlbumBaseFrag)) {
            this.f189095d.m65213k5(true);
            this.f189095d.m65212j5(true);
            m206336f();
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM65187N4 = PhotoAlbumBaseFrag.m65187N4(false, FeedModule.m61405F().userId(), "from_poi_aggregation", -1, User.ID_TEAM_ACCOUNT, 20, false);
        this.f189095d = photoAlbumBaseFragM65187N4;
        photoAlbumBaseFragM65187N4.m65213k5(true);
        this.f189095d.m65212j5(true);
        m206336f();
        AbstractC0428k abstractC0428kM2568m = this.f189092a.getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108883W0, this.f189095d, "PhotoAlbumBaseFrag");
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: e */
    public void m206341e(PoiLocation poiLocation) {
        this.f189097f.m146457p(poiLocation);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: n1 */
    public boolean mo63216n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: s0 */
    public C11443a mo63219s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f189095d;
        C11443a c11443a = new C11443a(photoAlbumBaseFrag, photoAlbumBaseFrag.f42302z.f197638b, FeedModule.m61405F().userId(), "from_poi_aggregation", 20, false);
        this.f189093b = c11443a;
        return c11443a;
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: p */
    public void mo63218p() {
    }
}
