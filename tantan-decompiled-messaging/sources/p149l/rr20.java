package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.MyMeetExtra;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class rr20 extends aj2<bs20> {

    /* JADX INFO: renamed from: c */
    public fr20 f160720c;

    /* JADX INFO: renamed from: d */
    public vr20 f160721d;

    public rr20(e0e e0eVar, fr20 fr20Var) {
        super(e0eVar);
        this.f160720c = fr20Var;
    }

    /* JADX INFO: renamed from: A */
    public void m180528A() {
        ((bs20) this.f70081a).m103643C();
    }

    /* JADX INFO: renamed from: k */
    public void m180529k(CoreGiftInfo coreGiftInfo) {
        m180533o(coreGiftInfo);
    }

    /* JADX INFO: renamed from: l */
    public int m180530l() {
        return this.f160720c.f98889u;
    }

    /* JADX INFO: renamed from: m */
    public void m180531m() {
        if (this.f160720c.m122795G() == CoreGiftPanelName.get("note") || this.f160720c.m122795G() == CoreGiftPanelName.get("greet")) {
            CoreModule.f17545c.f19643f1.m118047K3(this.f160720c.m122795G(), this.f160720c.m122800N());
        } else {
            CoreModule.f17545c.f19643f1.m118051O3(this.f160720c.m122800N());
        }
        if (CoreModule.m29935P().m94658i().mo158371f()) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m180532n() {
        ((bs20) this.f70081a).m103646r();
        duringCreated(CoreModule.f17545c.f19643f1.m118070h4()).filter(new w9j() { // from class: l.lr20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.mr20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135327a.m180534r((List) obj);
            }
        }));
        if (vwb.m200296J(CoreModule.f17545c.f19643f1.m118052P3())) {
            duringCreated(ConnectivityReceiver.m81290m()).filter(new w9j() { // from class: l.nr20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(ConnectivityReceiver.m81284g());
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.or20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145220a.m180535s((NetworkInfo) obj);
                }
            }));
        }
        if (this.f160720c.m122795G() == CoreGiftPanelName.get("note")) {
            duringCreated(CoreModule.f17545c.f19643f1.m118069g4()).subscribe(mkd0.m154955G(new e30() { // from class: l.pr20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150854a.m180536t((MyMeetExtra) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m180533o(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return true;
        }
        CoreGiftInfo coreGiftInfoM174530a = qhe.m174529b().m174530a(coreGiftInfo.f56011id);
        if (coreGiftInfoM174530a != null) {
            return wfe.m202983b("video").mo102510c(coreGiftInfoM174530a.f56011id, true, new dwc0());
        }
        qhe.m174529b().m174534f(coreGiftInfo);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m180534r(List list) {
        ((bs20) this.f70081a).m103649x(list);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m180535s(NetworkInfo networkInfo) {
        m180531m();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m180536t(MyMeetExtra myMeetExtra) {
        ((bs20) this.f70081a).m103650y(myMeetExtra.title, myMeetExtra.subTitle);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m180537u(CoreGiftInfo coreGiftInfo, roj0 roj0Var) {
        int iM210347Y4 = (int) CoreModule.f17545c.f19570H0.m210347Y4();
        if (CoreModule.f17545c.f19643f1.m118046J3(coreGiftInfo.f56011id) > 0 || iM210347Y4 >= coreGiftInfo.unitCoinPrice) {
            if (NullChecker.m81303a(this.f160720c.f98884p)) {
                this.f160720c.f98884p.call(coreGiftInfo);
            }
            this.f160720c.dismiss();
        } else if (TextUtils.equals(m180538v().m122794F(), "from_meet_picks")) {
            zvf0.m220399u("e_chat_gift_bar_gift_send", "p_meet", vwb.m200311Y("showfrom_meet_sayhi", "picks_say_hi"), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id));
            CoreModule.m29935P().m94658i().mo158338Z(m96966b(), "p_meet_view,e_meet_gift_bar_picks,click", (long) coreGiftInfo.unitCoinPrice);
        } else if (!TextUtils.equals(m180538v().m122794F(), "from_meet_liked")) {
            CoreModule.m29935P().m94658i().mo158338Z(m96966b(), ftj.m123057b(this.f160720c.m122799L(), "e_gift"), (long) coreGiftInfo.unitCoinPrice);
        } else {
            zvf0.m220399u("e_chat_gift_bar_gift_send", "p_meet", vwb.m200311Y("showfrom_meet_sayhi", "I_like_say_hi"), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id));
            CoreModule.m29935P().m94658i().mo158338Z(m96966b(), "p_meet_view,e_meet_gift_bar_ilike,click", (long) coreGiftInfo.unitCoinPrice);
        }
    }

    /* JADX INFO: renamed from: v */
    public fr20 m180538v() {
        return this.f160720c;
    }

    /* JADX INFO: renamed from: w */
    public void m180539w(CoreGiftInfo coreGiftInfo) {
        ((bs20) this.f70081a).m103648w(coreGiftInfo);
    }

    /* JADX INFO: renamed from: x */
    public void m180540x(final CoreGiftInfo coreGiftInfo) {
        duringCreated(CoreModule.f17545c.f19570H0.m210361k5()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.qr20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155960a.m180537u(coreGiftInfo, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: y */
    public void m180541y(vr20 vr20Var) {
        if (NullChecker.m81303a(this.f160721d)) {
            this.f160721d.m199614I();
        }
        this.f160721d = vr20Var;
    }

    /* JADX INFO: renamed from: z */
    public void m180542z(String str) {
        ((bs20) this.f70081a).m103642B(str);
    }
}
