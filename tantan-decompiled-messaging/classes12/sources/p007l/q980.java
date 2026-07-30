package p007l;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.PoiLocation;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiNearbyUsesEnterView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q980 implements yzl {

    /* JADX INFO: renamed from: a */
    public Act f12158a;

    /* JADX INFO: renamed from: b */
    public C2124a f12159b;

    /* JADX INFO: renamed from: c */
    public d7h f12160c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumBaseFrag f12161d;

    /* JADX INFO: renamed from: e */
    public dnh f12162e;

    /* JADX INFO: renamed from: f */
    public umh f12163f;

    /* JADX INFO: renamed from: g */
    public FeedPoiNearbyUsesEnterView f12164g;

    public q980(Act act, umh umhVar) {
        this.f12158a = act;
        this.f12163f = umhVar;
        m13494d();
    }

    /* JADX INFO: renamed from: f */
    private void m13490f() {
        this.f12161d.m5072h5(this);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        dnh dnhVar = new dnh(this.f12161d, this, this.f12163f.m15104j());
        this.f12162e = dnhVar;
        return dnhVar;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        this.f12160c = new d7h(this.f12159b);
        LinearLayout linearLayout = new LinearLayout(this.f12158a);
        linearLayout.setOrientation(1);
        linearLayout.addView(m13492b());
        linearLayout.addView(m13493c());
        this.f12160c.H(linearLayout);
        this.f12159b.m4968s0(1);
        return this.f12160c;
    }

    /* JADX INFO: renamed from: a */
    public void m13491a() {
        FeedPoiNearbyUsesEnterView feedPoiNearbyUsesEnterView = this.f12164g;
        if (feedPoiNearbyUsesEnterView == null) {
            return;
        }
        feedPoiNearbyUsesEnterView.m6131Q();
        xdl0.M(this.f12163f.f13875m, true);
    }

    /* JADX INFO: renamed from: b */
    public FeedPoiNearbyUsesEnterView m13492b() {
        this.f12164g = (FeedPoiNearbyUsesEnterView) this.f12158a.inflater().inflate(o6c0.f11286q2, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = t100.j;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        this.f12164g.setLayoutParams(layoutParams);
        return this.f12164g;
    }

    /* JADX INFO: renamed from: c */
    public RelativeLayout m13493c() {
        VText vText = new VText(this.f12158a);
        vText.setText(R$string.f358G);
        vText.setTextColor(this.f12158a.getResources().getColor(e1c0.f7102A));
        vText.setTextSize(15.0f);
        vText.getPaint().setFakeBoldText(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        vText.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f12158a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = t100.j;
        layoutParams2.topMargin = t100.o;
        layoutParams2.bottomMargin = t100.d;
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(vText);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: d */
    public final void m13494d() {
        PhotoAlbumBaseFrag photoAlbumBaseFragI0 = this.f12158a.getSupportFragmentManager().i0("PhotoAlbumBaseFrag");
        this.f12161d = photoAlbumBaseFragI0;
        if (NullChecker.a(photoAlbumBaseFragI0)) {
            this.f12161d.m5075k5(true);
            this.f12161d.m5074j5(true);
            m13490f();
            return;
        }
        PhotoAlbumBaseFrag photoAlbumBaseFragM5047N4 = PhotoAlbumBaseFrag.m5047N4(false, FeedModule.m1139F().userId(), "from_poi_aggregation", -1, User.ID_TEAM_ACCOUNT, 20, false);
        this.f12161d = photoAlbumBaseFragM5047N4;
        photoAlbumBaseFragM5047N4.m5075k5(true);
        this.f12161d.m5074j5(true);
        m13490f();
        k kVarM = this.f12158a.getSupportFragmentManager().m();
        kVarM.c(b5c0.f6011W0, this.f12161d, "PhotoAlbumBaseFrag");
        kVarM.j();
    }

    /* JADX INFO: renamed from: e */
    public void m13495e(PoiLocation poiLocation) {
        this.f12163f.m15107p(poiLocation);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i) {
        return false;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f12161d;
        C2124a c2124a = new C2124a(photoAlbumBaseFrag, photoAlbumBaseFrag.f2915z.f13114b, FeedModule.m1139F().userId(), "from_poi_aggregation", 20, false);
        this.f12159b = c2124a;
        return c2124a;
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: q */
    public void mo3013q() {
    }
}
