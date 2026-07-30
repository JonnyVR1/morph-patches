package p149l;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.PoiLocation;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiNearbyUsesEnterView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class q980 implements yzl {

    /* JADX INFO: renamed from: a */
    public Act f153377a;

    /* JADX INFO: renamed from: b */
    public C11280a f153378b;

    /* JADX INFO: renamed from: c */
    public d7h f153379c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumBaseFrag f153380d;

    /* JADX INFO: renamed from: e */
    public dnh f153381e;

    /* JADX INFO: renamed from: f */
    public umh f153382f;

    /* JADX INFO: renamed from: g */
    public FeedPoiNearbyUsesEnterView f153383g;

    public q980(Act act, umh umhVar) {
        this.f153377a = act;
        this.f153382f = umhVar;
        m173604d();
    }

    /* JADX INFO: renamed from: f */
    private void m173600f() {
        this.f153380d.m64027h5(this);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo62028L0() {
        dnh dnhVar = new dnh(this.f153380d, this, this.f153382f.m194358j());
        this.f153381e = dnhVar;
        return dnhVar;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        this.f153379c = new d7h(this.f153378b);
        LinearLayout linearLayout = new LinearLayout(this.f153377a);
        linearLayout.setOrientation(1);
        linearLayout.addView(m173602b());
        linearLayout.addView(m173603c());
        this.f153379c.m143815H(linearLayout);
        this.f153378b.m63930s0(1);
        return this.f153379c;
    }

    /* JADX INFO: renamed from: a */
    public void m173601a() {
        FeedPoiNearbyUsesEnterView feedPoiNearbyUsesEnterView = this.f153383g;
        if (feedPoiNearbyUsesEnterView == null) {
            return;
        }
        feedPoiNearbyUsesEnterView.m65030Q();
        xdl0.m208344M(this.f153382f.f177238m, true);
    }

    /* JADX INFO: renamed from: b */
    public FeedPoiNearbyUsesEnterView m173602b() {
        this.f153383g = (FeedPoiNearbyUsesEnterView) this.f153377a.inflater().inflate(o6c0.f142267q2, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = t100.f167261j;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f153383g.setLayoutParams(layoutParams);
        return this.f153383g;
    }

    /* JADX INFO: renamed from: c */
    public RelativeLayout m173603c() {
        VText vText = new VText(this.f153377a);
        vText.setText(R$string.f38897G);
        vText.setTextColor(this.f153377a.getResources().getColor(e1c0.f88746A));
        vText.setTextSize(15.0f);
        vText.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        vText.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f153377a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = t100.f167261j;
        layoutParams2.topMargin = t100.f167266o;
        layoutParams2.bottomMargin = t100.f167255d;
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: d */
    public final void m173604d() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = (PhotoAlbumBaseFrag) this.f153377a.getSupportFragmentManager().m2557i0("PhotoAlbumBaseFrag");
        this.f153380d = photoAlbumBaseFrag;
        if (NullChecker.m81303a(photoAlbumBaseFrag)) {
            this.f153380d.m64030k5(true);
            this.f153380d.m64029j5(true);
            m173600f();
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM64004N4 = PhotoAlbumBaseFrag.m64004N4(false, FeedModule.m60221F().userId(), "from_poi_aggregation", -1, User.ID_TEAM_ACCOUNT, 20, false);
        this.f153380d = photoAlbumBaseFragM64004N4;
        photoAlbumBaseFragM64004N4.m64030k5(true);
        this.f153380d.m64029j5(true);
        m173600f();
        AbstractC0427k abstractC0427kM2567m = this.f153377a.getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73530W0, this.f153380d, "PhotoAlbumBaseFrag");
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: e */
    public void m173605e(PoiLocation poiLocation) {
        this.f153382f.m194361p(poiLocation);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: s0 */
    public C11280a mo62036s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f153380d;
        C11280a c11280a = new C11280a(photoAlbumBaseFrag, photoAlbumBaseFrag.f41454z.f166899b, FeedModule.m60221F().userId(), "from_poi_aggregation", 20, false);
        this.f153378b = c11280a;
        return c11280a;
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: q */
    public void mo62035q() {
    }
}
