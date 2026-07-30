package p153l;

import android.app.Application;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class i6g extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public ArrayList<d3q<?>> f113164j = new ArrayList<>();

    /* JADX INFO: renamed from: e0 */
    public final String m138815e0(teg.C20297a c20297a) {
        Application application = zrv.f205803e;
        if (c20297a.f173813b.equals("fanBaseScore-audience-day-fanbaseuserscore")) {
            return application.getString(R$string.f47776R3);
        }
        if (c20297a.f173813b.equals("business-audience-month-fanbaseuseractive")) {
            return application.getString(R$string.f47818T3);
        }
        if (c20297a.f173813b.equals("gift-audience-day-fanbaseusergift")) {
            return application.getString(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f47881W3 : R$string.f47860V3);
        }
        return "%s";
    }

    /* JADX INFO: renamed from: f0 */
    public dig m138816f0(BFansRecallUser bFansRecallUser) {
        for (d3q<?> d3qVar : this.f113164j) {
            if (d3qVar instanceof dig) {
                dig digVar = (dig) d3qVar;
                if (TextUtils.equals(digVar.m115878L().userId, bFansRecallUser.userId)) {
                    digVar.m115883R(bFansRecallUser);
                    return digVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g0 */
    public void m138817g0(teg tegVar, yhg yhgVar, lag lagVar) {
        this.f113164j.clear();
        this.f113164j.add(new vx2(lagVar.m213815L2(), 4, tegVar.m190696c(), tegVar.m190695b()));
        eig eigVar = new eig(lagVar);
        eigVar.m120891H(yhgVar);
        this.f113164j.add(eigVar);
        if (yhgVar.m215960b().users.size() != 0) {
            qhg qhgVar = new qhg(lagVar);
            qhgVar.m176546J(yhgVar);
            this.f113164j.add(qhgVar);
        }
        for (BFansRecallUser bFansRecallUser : yhgVar.m215960b().users) {
            dig digVar = new dig(lagVar);
            digVar.m115882Q(bFansRecallUser, yhgVar.m215959a());
            this.f113164j.add(digVar);
        }
        m68554Z(this.f113164j);
    }

    /* JADX INFO: renamed from: h0 */
    public void m138818h0(mag magVar, teg tegVar, tk2 tk2Var) {
        this.f113164j.clear();
        this.f113164j.add(new vx2(tk2Var.m213815L2(), 3, tegVar.m190696c(), tegVar.m190695b()));
        teg.C20297a c20297aM190694a = tegVar.m190694a();
        int i = 0;
        if (jyb.m147479J(magVar.m157644b())) {
            this.f113164j.add(new tlj());
        } else {
            List<BLiveLeaderboardRecord> listM157644b = magVar.m157644b();
            for (int i2 = 0; i2 < listM157644b.size(); i2++) {
                BLiveLeaderboardRecord bLiveLeaderboardRecord = listM157644b.get(i2);
                this.f113164j.add(new zx2(tk2Var, bLiveLeaderboardRecord, magVar.m157646d(bLiveLeaderboardRecord.owner.f45267id), magVar.m157645c(bLiveLeaderboardRecord.owner.f45267id), magVar.m157643a(), m138815e0(c20297aM190694a)));
            }
        }
        if (c20297aM190694a.f173813b.equals("fanBaseScore-audience-day-fanbaseuserscore")) {
            i = R$string.f47839U3;
        } else if (c20297aM190694a.f173813b.equals("business-audience-month-fanbaseuseractive")) {
            i = R$string.f47797S3;
        } else if (c20297aM190694a.f173813b.equals("gift-audience-day-fanbaseusergift")) {
            i = ((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f47902X3 : R$string.f47755Q3;
        }
        this.f113164j.add(new tx2(zrv.f205803e.getString(i)));
        m68554Z(this.f113164j);
    }

    /* JADX INFO: renamed from: i0 */
    public void m138819i0(boolean z, teg tegVar, tk2 tk2Var) {
        this.f113164j.clear();
        this.f113164j.add(new vx2(tk2Var.m213815L2(), z ? 4 : 3, tegVar.m190696c(), tegVar.m190695b()));
        for (int i = 1; i < 7; i++) {
            ArrayList<d3q<?>> arrayList = this.f113164j;
            if (z) {
                arrayList.add(new wx2(-1));
            } else {
                arrayList.add(new wx2(i));
            }
        }
        m68554Z(this.f113164j);
    }
}
