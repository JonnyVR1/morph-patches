package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.MyMeetExtra;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b030 extends ij2<l030> {

    /* JADX INFO: renamed from: c */
    public pz20 f74246c;

    /* JADX INFO: renamed from: d */
    public f030 f74247d;

    public b030(s1e s1eVar, pz20 pz20Var) {
        super(s1eVar);
        this.f74246c = pz20Var;
    }

    /* JADX INFO: renamed from: A */
    public void m101247A() {
        ((l030) this.f115168a).m152270C();
    }

    /* JADX INFO: renamed from: k */
    public void m101248k(CoreGiftInfo coreGiftInfo) {
        m101252o(coreGiftInfo);
    }

    /* JADX INFO: renamed from: l */
    public int m101249l() {
        return this.f74246c.f154717u;
    }

    /* JADX INFO: renamed from: m */
    public void m101250m() {
        if (this.f74246c.m174331G() == CoreGiftPanelName.get("note") || this.f74246c.m174331G() == CoreGiftPanelName.get("greet")) {
            CoreModule.f18264c.f20385f1.m155885K3(this.f74246c.m174331G(), this.f74246c.m174336N());
        } else {
            CoreModule.f18264c.f20385f1.m155889O3(this.f74246c.m174336N());
        }
        if (CoreModule.m30933P().m143412i().mo180463f()) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m101251n() {
        ((l030) this.f115168a).m152273r();
        duringCreated(CoreModule.f18264c.f20385f1.m155908h4()).filter(new qcj() { // from class: l.vz20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.wz20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191724a.m101253r((List) obj);
            }
        }));
        if (jyb.m147479J(CoreModule.f18264c.f20385f1.m155890P3())) {
            duringCreated(ConnectivityReceiver.m82473m()).filter(new qcj() { // from class: l.xz20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(ConnectivityReceiver.m82467g());
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.yz20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202167a.m101254s((NetworkInfo) obj);
                }
            }));
        }
        if (this.f74246c.m174331G() == CoreGiftPanelName.get("note")) {
            duringCreated(CoreModule.f18264c.f20385f1.m155907g4()).subscribe(psd0.m173596G(new y20() { // from class: l.zz20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f206668a.m101255t((MyMeetExtra) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m101252o(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return true;
        }
        CoreGiftInfo coreGiftInfoM196155a = uie.m196154b().m196155a(coreGiftInfo.f56859id);
        if (coreGiftInfoM196155a != null) {
            return ahe.m97794b("video").mo115525c(coreGiftInfoM196155a.f56859id, true, new g4d0());
        }
        uie.m196154b().m196159f(coreGiftInfo);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m101253r(List list) {
        ((l030) this.f115168a).m152276x(list);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m101254s(NetworkInfo networkInfo) {
        m101250m();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m101255t(MyMeetExtra myMeetExtra) {
        ((l030) this.f115168a).m152277y(myMeetExtra.title, myMeetExtra.subTitle);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m101256u(CoreGiftInfo coreGiftInfo, uxj0 uxj0Var) {
        int iM155435Y4 = (int) CoreModule.f18264c.f20312H0.m155435Y4();
        if (CoreModule.f18264c.f20385f1.m155884J3(coreGiftInfo.f56859id) > 0 || iM155435Y4 >= coreGiftInfo.unitCoinPrice) {
            if (NullChecker.m82486a(this.f74246c.f154712p)) {
                this.f74246c.f154712p.call(coreGiftInfo);
            }
            this.f74246c.dismiss();
        } else if (TextUtils.equals(m101257v().m174330F(), "from_meet_picks")) {
            i4g0.m138523u("e_chat_gift_bar_gift_send", "p_meet", jyb.m147494Y("showfrom_meet_sayhi", "picks_say_hi"), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id));
            CoreModule.m30933P().m143412i().mo180430Z(m140179b(), "p_meet_view,e_meet_gift_bar_picks,click", (long) coreGiftInfo.unitCoinPrice);
        } else if (!TextUtils.equals(m101257v().m174330F(), "from_meet_liked")) {
            CoreModule.m30933P().m143412i().mo180430Z(m140179b(), vvj.m203014b(this.f74246c.m174335L(), "e_gift"), (long) coreGiftInfo.unitCoinPrice);
        } else {
            i4g0.m138523u("e_chat_gift_bar_gift_send", "p_meet", jyb.m147494Y("showfrom_meet_sayhi", "I_like_say_hi"), jyb.m147494Y("chat_gift_id", coreGiftInfo.f56859id));
            CoreModule.m30933P().m143412i().mo180430Z(m140179b(), "p_meet_view,e_meet_gift_bar_ilike,click", (long) coreGiftInfo.unitCoinPrice);
        }
    }

    /* JADX INFO: renamed from: v */
    public pz20 m101257v() {
        return this.f74246c;
    }

    /* JADX INFO: renamed from: w */
    public void m101258w(CoreGiftInfo coreGiftInfo) {
        ((l030) this.f115168a).m152275w(coreGiftInfo);
    }

    /* JADX INFO: renamed from: x */
    public void m101259x(final CoreGiftInfo coreGiftInfo) {
        duringCreated(CoreModule.f18264c.f20312H0.m155449k5()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.a030
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67685a.m101256u(coreGiftInfo, (uxj0) obj);
            }
        }, new fjf0()));
    }

    /* JADX INFO: renamed from: y */
    public void m101260y(f030 f030Var) {
        if (NullChecker.m82486a(this.f74247d)) {
            this.f74247d.m123441I();
        }
        this.f74247d = f030Var;
    }

    /* JADX INFO: renamed from: z */
    public void m101261z(String str) {
        ((l030) this.f115168a).m152269B(str);
    }
}
