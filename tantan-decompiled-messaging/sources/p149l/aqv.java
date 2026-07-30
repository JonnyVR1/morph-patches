package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;

/* JADX INFO: loaded from: classes5.dex */
public class aqv implements zpv {
    @Override // p149l.zpv
    /* JADX INFO: renamed from: a */
    public boolean mo98345a() {
        return ycp0.m214190d().m214197h();
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: b */
    public void mo98346b() {
        ycp0.m214190d().m214192a();
        pxm.m171910c().m171912b();
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: c */
    public User mo98347c(String str) {
        return ((idv) ypv.m215673l(fld0.f98147b)).m135637i(str);
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: d */
    public void mo98348d(Context context, String str, String str2) {
        if (context != null) {
            context.startActivity(s91.m182688a(ypv.f199497e, AudienceStartData.getBuilder().m67606Q(true).m67594E(str).m67604O(str2).m67611u()));
        }
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: e */
    public long mo98349e() {
        return ((hdv) ypv.m215673l(fld0.f98150e)).f107297c.get().longValue();
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: f */
    public void mo98350f() {
        ycp0.m214190d().m214193b();
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: g */
    public boolean mo98351g() {
        return ycp0.m214190d().m214196f();
    }

    @Override // p149l.zpv
    public String getFakeId() {
        return w220.m201014a();
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: h */
    public long mo98352h() {
        return ((hdv) ypv.m215673l(fld0.f98150e)).f107296b.get().longValue();
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: i */
    public String mo98353i() {
        return ycp0.m214190d().m214195e();
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: j */
    public void mo98354j(Context context, String str) {
        if (context != null) {
            context.startActivity(LiveCoverAct.m75466b2(ypv.f199497e, "", str));
        }
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: k */
    public void mo98355k(boolean z) {
        aqe.m98261i().m98277t(z);
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: l */
    public Intent mo98356l(AudienceStartData audienceStartData) {
        return s91.m182688a(ypv.f199497e, audienceStartData);
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: m */
    public void mo98357m(Act act, AnchorStartData anchorStartData) {
        tn0.m189747o(act, anchorStartData);
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: n */
    public void mo98358n(Act act) {
        jvn0.m143530i(act);
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: o */
    public void mo98359o(Act act, AnchorStartData anchorStartData) {
        if (anchorStartData == null) {
            tn0.m189749q(act);
        } else {
            tn0.m189750r(act, anchorStartData);
        }
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: p */
    public boolean mo98360p(Activity activity) {
        return activity instanceof LiveAct;
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: q */
    public void mo98361q(boolean z) {
        aqe.m98261i().m98274q(z);
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: r */
    public BLiveAnchorLevel mo98362r(long j) {
        return ((ggv) ypv.m215673l(fld0.f98148c)).m126020f(j);
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: s */
    public void mo98363s(LiveRegionTag liveRegionTag) {
        zfv.m218542Y0(liveRegionTag).subscribe(ffw.m121192c());
    }

    @Override // p149l.zpv
    /* JADX INFO: renamed from: t */
    public void mo98364t(User user, boolean z) {
        ((idv) ypv.m215673l(fld0.f98147b)).m135641m(user, z);
    }
}
