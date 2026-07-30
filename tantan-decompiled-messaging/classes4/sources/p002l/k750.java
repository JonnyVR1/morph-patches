package p002l;

import com.p1.mobile.longlink.msg.mln.OfficialShowMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k750 extends bk2<OfficialShowMessage.OfficialShowUpdateStatus, OfficialShowMessage.OfficialShowUpdateStatus> {
    public k750(p3g0<OfficialShowMessage.OfficialShowUpdateStatus, OfficialShowMessage.OfficialShowUpdateStatus> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<OfficialShowMessage.OfficialShowUpdateStatus> mo9244b() {
        return OfficialShowMessage.OfficialShowUpdateStatus.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.officialShow.update";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public OfficialShowMessage.OfficialShowUpdateStatus mo9251z(String str, OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus) {
        return officialShowUpdateStatus;
    }
}
