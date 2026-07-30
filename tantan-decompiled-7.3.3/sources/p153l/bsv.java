package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;

/* JADX INFO: loaded from: classes5.dex */
public class bsv implements asv {
    @Override // p153l.asv
    /* JADX INFO: renamed from: a */
    public boolean mo99970a() {
        return cmp0.m111299d().m111306h();
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: b */
    public void mo99971b() {
        cmp0.m111299d().m111301a();
        pzm.m174537c().m174539b();
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: c */
    public User mo99972c(String str) {
        return ((jfv) zrv.m221194l(htd0.f111520b)).m144722i(str);
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: d */
    public void mo99973d(Context context, String str, String str2) {
        if (context != null) {
            context.startActivity(z91.m219041a(zrv.f205803e, AudienceStartData.getBuilder().m68789Q(true).m68777E(str).m68787O(str2).m68794u()));
        }
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: e */
    public long mo99974e() {
        return ((ifv) zrv.m221194l(htd0.f111523e)).f114694c.get().longValue();
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: f */
    public void mo99975f() {
        cmp0.m111299d().m111302b();
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: g */
    public boolean mo99976g() {
        return cmp0.m111299d().m111305f();
    }

    @Override // p153l.asv
    public String getFakeId() {
        return eb20.m120148a();
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: h */
    public long mo99977h() {
        return ((ifv) zrv.m221194l(htd0.f111523e)).f114693b.get().longValue();
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: i */
    public String mo99978i() {
        return cmp0.m111299d().m111304e();
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: j */
    public void mo99979j(Context context, String str) {
        if (context != null) {
            context.startActivity(LiveCoverAct.m76649c2(zrv.f205803e, "", str));
        }
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: k */
    public void mo99980k(boolean z) {
        ere.m122146i().m122162t(z);
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: l */
    public Intent mo99981l(AudienceStartData audienceStartData) {
        return z91.m219041a(zrv.f205803e, audienceStartData);
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: m */
    public void mo99982m(Act act, AnchorStartData anchorStartData) {
        pn0.m172991o(act, anchorStartData);
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: n */
    public void mo99983n(Act act) {
        n4o0.m161577i(act);
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: o */
    public void mo99984o(Act act, AnchorStartData anchorStartData) {
        if (anchorStartData == null) {
            pn0.m172993q(act);
        } else {
            pn0.m172994r(act, anchorStartData);
        }
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: p */
    public boolean mo99985p(Activity activity) {
        return activity instanceof LiveAct;
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: q */
    public void mo99986q(boolean z) {
        ere.m122146i().m122159q(z);
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: r */
    public BLiveAnchorLevel mo99987r(long j) {
        return ((hiv) zrv.m221194l(htd0.f111521c)).m135154f(j);
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: s */
    public void mo99988s(LiveRegionTag liveRegionTag) {
        aiv.m98076Y0(liveRegionTag).subscribe(dhw.m115824c());
    }

    @Override // p153l.asv
    /* JADX INFO: renamed from: t */
    public void mo99989t(User user, boolean z) {
        ((jfv) zrv.m221194l(htd0.f111520b)).m144726m(user, z);
    }
}
