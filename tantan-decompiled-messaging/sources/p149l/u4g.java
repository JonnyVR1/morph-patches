package p149l;

import android.app.Application;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class u4g extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public ArrayList<d1q<?>> f174596j = new ArrayList<>();

    /* JADX INFO: renamed from: e0 */
    public final String m191731e0(fdg.C16810a c16810a) {
        Application application = ypv.f199497e;
        if (c16810a.f97039b.equals("fanBaseScore-audience-day-fanbaseuserscore")) {
            return application.getString(R$string.f46928R3);
        }
        if (c16810a.f97039b.equals("business-audience-month-fanbaseuseractive")) {
            return application.getString(R$string.f46970T3);
        }
        if (c16810a.f97039b.equals("gift-audience-day-fanbaseusergift")) {
            return application.getString(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f47033W3 : R$string.f47012V3);
        }
        return "%s";
    }

    /* JADX INFO: renamed from: f0 */
    public pgg m191732f0(BFansRecallUser bFansRecallUser) {
        for (d1q<?> d1qVar : this.f174596j) {
            if (d1qVar instanceof pgg) {
                pgg pggVar = (pgg) d1qVar;
                if (TextUtils.equals(pggVar.m168718L().userId, bFansRecallUser.userId)) {
                    pggVar.m168723R(bFansRecallUser);
                    return pggVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public void m191733g0(fdg fdgVar, kgg kggVar, x8g x8gVar) {
        this.f174596j.clear();
        this.f174596j.add(new gx2(x8gVar.m206032L2(), 4, fdgVar.m120976c(), fdgVar.m120975b()));
        qgg qggVar = new qgg(x8gVar);
        qggVar.m174412H(kggVar);
        this.f174596j.add(qggVar);
        if (kggVar.m145891b().users.size() != 0) {
            cgg cggVar = new cgg(x8gVar);
            cggVar.m106707J(kggVar);
            this.f174596j.add(cggVar);
        }
        for (BFansRecallUser bFansRecallUser : kggVar.m145891b().users) {
            pgg pggVar = new pgg(x8gVar);
            pggVar.m168722Q(bFansRecallUser, kggVar.m145890a());
            this.f174596j.add(pggVar);
        }
        m67371Z(this.f174596j);
    }

    /* JADX INFO: renamed from: h0 */
    public void m191734h0(y8g y8gVar, fdg fdgVar, lk2 lk2Var) {
        this.f174596j.clear();
        this.f174596j.add(new gx2(lk2Var.m206032L2(), 3, fdgVar.m120976c(), fdgVar.m120975b()));
        fdg.C16810a c16810aM120974a = fdgVar.m120974a();
        int i = 0;
        if (vwb.m200296J(y8gVar.m213372b())) {
            this.f174596j.add(new ajj());
        } else {
            List<BLiveLeaderboardRecord> listM213372b = y8gVar.m213372b();
            for (int i2 = 0; i2 < listM213372b.size(); i2++) {
                BLiveLeaderboardRecord bLiveLeaderboardRecord = listM213372b.get(i2);
                this.f174596j.add(new kx2(lk2Var, bLiveLeaderboardRecord, y8gVar.m213374d(bLiveLeaderboardRecord.owner.f44419id), y8gVar.m213373c(bLiveLeaderboardRecord.owner.f44419id), y8gVar.m213371a(), m191731e0(c16810aM120974a)));
            }
        }
        if (c16810aM120974a.f97039b.equals("fanBaseScore-audience-day-fanbaseuserscore")) {
            i = R$string.f46991U3;
        } else if (c16810aM120974a.f97039b.equals("business-audience-month-fanbaseuseractive")) {
            i = R$string.f46949S3;
        } else if (c16810aM120974a.f97039b.equals("gift-audience-day-fanbaseusergift")) {
            i = ((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f47054X3 : R$string.f46907Q3;
        }
        this.f174596j.add(new ex2(ypv.f199497e.getString(i)));
        m67371Z(this.f174596j);
    }

    /* JADX INFO: renamed from: i0 */
    public void m191735i0(boolean z, fdg fdgVar, lk2 lk2Var) {
        this.f174596j.clear();
        this.f174596j.add(new gx2(lk2Var.m206032L2(), z ? 4 : 3, fdgVar.m120976c(), fdgVar.m120975b()));
        for (int i = 1; i < 7; i++) {
            ArrayList<d1q<?>> arrayList = this.f174596j;
            if (z) {
                arrayList.add(new hx2(-1));
            } else {
                arrayList.add(new hx2(i));
            }
        }
        m67371Z(this.f174596j);
    }
}
