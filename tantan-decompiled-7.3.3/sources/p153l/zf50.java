package p153l;

import com.p051p1.mobile.longlink.msg.mln.OfficialShowMessage;

/* JADX INFO: loaded from: classes4.dex */
public class zf50 extends jk2<OfficialShowMessage.OfficialShowUpdateStatus, OfficialShowMessage.OfficialShowUpdateStatus> {
    public zf50(wbg0<OfficialShowMessage.OfficialShowUpdateStatus, OfficialShowMessage.OfficialShowUpdateStatus> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<OfficialShowMessage.OfficialShowUpdateStatus> mo95510b() {
        return OfficialShowMessage.OfficialShowUpdateStatus.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.officialShow.update";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public OfficialShowMessage.OfficialShowUpdateStatus mo95993z(String str, OfficialShowMessage.OfficialShowUpdateStatus officialShowUpdateStatus) {
        return officialShowUpdateStatus;
    }
}
