package p002l;

import android.app.Application;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import java.util.ArrayList;
import java.util.List;
import l.bgv;
import l.d1q;
import l.fld0;
import l.vwb;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u4g extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public ArrayList<d1q<?>> f20486j = new ArrayList<>();

    /* JADX INFO: renamed from: e0 */
    public final String m23279e0(fdg.C0564a c0564a) {
        Application application = ypv.e;
        if (c0564a.f10301b.equals("fanBaseScore-audience-day-fanbaseuserscore")) {
            return application.getString(R$string.f2970R3);
        }
        if (c0564a.f10301b.equals("business-audience-month-fanbaseuseractive")) {
            return application.getString(R$string.f3012T3);
        }
        if (c0564a.f10301b.equals("gift-audience-day-fanbaseusergift")) {
            return application.getString(((bgv) ypv.l(fld0.f)).n() ? R$string.f3075W3 : R$string.f3054V3);
        }
        return "%s";
    }

    /* JADX INFO: renamed from: f0 */
    public pgg m23280f0(BFansRecallUser bFansRecallUser) {
        for (d1q<?> d1qVar : this.f20486j) {
            if (d1qVar instanceof pgg) {
                pgg pggVar = (pgg) d1qVar;
                if (TextUtils.equals(pggVar.m20266L().userId, bFansRecallUser.userId)) {
                    pggVar.m20271R(bFansRecallUser);
                    return pggVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public void m23281g0(fdg fdgVar, kgg kggVar, x8g x8gVar) {
        this.f20486j.clear();
        this.f20486j.add(new gx2(x8gVar.m25552L2(), 4, fdgVar.m13128c(), fdgVar.m13127b()));
        qgg qggVar = new qgg(x8gVar);
        qggVar.m21261H(kggVar);
        this.f20486j.add(qggVar);
        if (kggVar.m16617b().users.size() != 0) {
            cgg cggVar = new cgg(x8gVar);
            cggVar.m11033J(kggVar);
            this.f20486j.add(cggVar);
        }
        for (BFansRecallUser bFansRecallUser : kggVar.m16617b().users) {
            pgg pggVar = new pgg(x8gVar);
            pggVar.m20270Q(bFansRecallUser, kggVar.m16616a());
            this.f20486j.add(pggVar);
        }
        Z(this.f20486j);
    }

    /* JADX INFO: renamed from: h0 */
    public void m23282h0(y8g y8gVar, fdg fdgVar, lk2 lk2Var) {
        this.f20486j.clear();
        this.f20486j.add(new gx2(lk2Var.m25552L2(), 3, fdgVar.m13128c(), fdgVar.m13127b()));
        fdg.C0564a c0564aM13126a = fdgVar.m13126a();
        int i = 0;
        if (vwb.J(y8gVar.m26437b())) {
            this.f20486j.add(new ajj());
        } else {
            List<BLiveLeaderboardRecord> listM26437b = y8gVar.m26437b();
            for (int i2 = 0; i2 < listM26437b.size(); i2++) {
                BLiveLeaderboardRecord bLiveLeaderboardRecord = listM26437b.get(i2);
                this.f20486j.add(new kx2(lk2Var, bLiveLeaderboardRecord, y8gVar.m26439d(bLiveLeaderboardRecord.owner.id), y8gVar.m26438c(bLiveLeaderboardRecord.owner.id), y8gVar.m26436a(), m23279e0(c0564aM13126a)));
            }
        }
        if (c0564aM13126a.f10301b.equals("fanBaseScore-audience-day-fanbaseuserscore")) {
            i = R$string.f3033U3;
        } else if (c0564aM13126a.f10301b.equals("business-audience-month-fanbaseuseractive")) {
            i = R$string.f2991S3;
        } else if (c0564aM13126a.f10301b.equals("gift-audience-day-fanbaseusergift")) {
            i = ((bgv) ypv.l(fld0.f)).n() ? R$string.f3096X3 : R$string.f2949Q3;
        }
        this.f20486j.add(new ex2(ypv.e.getString(i)));
        Z(this.f20486j);
    }

    /* JADX INFO: renamed from: i0 */
    public void m23283i0(boolean z, fdg fdgVar, lk2 lk2Var) {
        this.f20486j.clear();
        this.f20486j.add(new gx2(lk2Var.m25552L2(), z ? 4 : 3, fdgVar.m13128c(), fdgVar.m13127b()));
        for (int i = 1; i < 7; i++) {
            ArrayList<d1q<?>> arrayList = this.f20486j;
            if (z) {
                arrayList.add(new hx2(-1));
            } else {
                arrayList.add(new hx2(i));
            }
        }
        Z(this.f20486j);
    }
}
