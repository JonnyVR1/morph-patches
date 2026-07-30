package p153l;

import android.text.TextUtils;
import androidx.room.RoomDatabase;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bwj extends ij2<owj> {

    /* JADX INFO: renamed from: c */
    public final qvj f78743c;

    public bwj(s1e s1eVar, qvj qvjVar) {
        super(s1eVar);
        this.f78743c = qvjVar;
    }

    @Override // p153l.ij2, p153l.k3m
    public void destroy() {
        super.destroy();
        CoreModule.f18264c.f20385f1.m155883I3();
    }

    /* JADX INFO: renamed from: h */
    public void m106706h(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return;
        }
        CoreGiftInfo coreGiftInfoM196155a = uie.m196154b().m196155a(coreGiftInfo.f56859id);
        if (NullChecker.m82486a(coreGiftInfoM196155a)) {
            ahe.m97794b("video").mo115525c(coreGiftInfoM196155a.f56859id, true, new g4d0());
        } else {
            uie.m196154b().m196159f(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: k */
    public int m106707k() {
        return this.f78743c.f159773u;
    }

    /* JADX INFO: renamed from: l */
    public void m106708l() {
        ((owj) this.f115168a).m169582r();
        duringCreated(CoreModule.f18264c.f20385f1.m155908h4()).filter(new qcj() { // from class: l.wvj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).distinctUntilChanged().map(new qcj() { // from class: l.xvj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196406a.m106710n((List) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.yvj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201726a.m106711o((List) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.zvj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206222a.m106712r((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public boolean m106709m() {
        CoreGiftPanelName coreGiftPanelNameM178294G = this.f78743c.m178294G();
        return coreGiftPanelNameM178294G == CoreGiftPanelName.get("note") || coreGiftPanelNameM178294G == CoreGiftPanelName.get("greet");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ List m106710n(List list) {
        if (CoreModule.m30933P().m143412i().mo180463f() && m106709m()) {
            CoreGiftInfo coreGiftInfoNew_ = CoreGiftInfo.new_();
            coreGiftInfoNew_.f56859id = "o_diamond_gift_id";
            coreGiftInfoNew_.name = "无限打招呼";
            coreGiftInfoNew_.quota = RoomDatabase.MAX_BIND_PARAMETER_CNT;
            ((NewGiftInfoPanelWrapper) list.get(0)).giftInfos.add(coreGiftInfoNew_);
        }
        return list;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m106711o(List list) {
        ((owj) this.f115168a).m169586w(list, this.f78743c.m178299N());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m106712r(UserPrivilege userPrivilege) {
        if (m106709m()) {
            CoreModule.f18264c.f20385f1.m155885K3(this.f78743c.m178294G(), this.f78743c.m178299N());
        } else {
            CoreModule.f18264c.f20385f1.m155889O3(this.f78743c.m178299N());
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m106713s(CoreGiftInfo coreGiftInfo, uxj0 uxj0Var) {
        int iM155435Y4 = (int) CoreModule.f18264c.f20312H0.m155435Y4();
        if (CoreModule.f18264c.f20385f1.m155884J3(coreGiftInfo.f56859id) > 0 || iM155435Y4 >= coreGiftInfo.unitCoinPrice) {
            if (NullChecker.m82486a(this.f78743c.f159768p)) {
                this.f78743c.f159768p.call(coreGiftInfo);
            }
            this.f78743c.dismiss();
        } else if (TextUtils.equals(m106714t().m178293F(), "from_meet_picks")) {
            i4g0.m138523u("e_chat_gift_bar_gift_send", "p_meet", jyb.m147494Y("showfrom_meet_sayhi", "picks_say_hi"), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id));
            CoreModule.m30933P().m143412i().mo180430Z(m140179b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        } else if (!TextUtils.equals(m106714t().m178293F(), "from_meet_liked")) {
            CoreModule.m30933P().m143412i().mo180430Z(m140179b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        } else {
            i4g0.m138523u("e_chat_gift_bar_gift_send", "p_meet", jyb.m147494Y("showfrom_meet_sayhi", "I_like_say_hi"), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id));
            CoreModule.m30933P().m143412i().mo180430Z(m140179b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        }
    }

    /* JADX INFO: renamed from: t */
    public qvj m106714t() {
        return this.f78743c;
    }

    /* JADX INFO: renamed from: u */
    public void m106715u(CoreGiftInfo coreGiftInfo) {
        ((owj) this.f115168a).m169585v(coreGiftInfo);
    }

    /* JADX INFO: renamed from: v */
    public void m106716v(final CoreGiftInfo coreGiftInfo) {
        duringCreated(CoreModule.f18264c.f20312H0.m155449k5()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.awj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73765a.m106713s(coreGiftInfo, (uxj0) obj);
            }
        }, new fjf0()));
    }

    /* JADX INFO: renamed from: w */
    public void m106717w(String str) {
        ((owj) this.f115168a).m169588y(str);
    }

    /* JADX INFO: renamed from: x */
    public void m106718x() {
        ((owj) this.f115168a).m169589z();
    }
}
