package p149l;

import android.text.TextUtils;
import androidx.room.RoomDatabase;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ltj extends aj2<ytj> {

    /* JADX INFO: renamed from: c */
    public final atj f129971c;

    public ltj(e0e e0eVar, atj atjVar) {
        super(e0eVar);
        this.f129971c = atjVar;
    }

    @Override // p149l.aj2, p149l.q0m
    public void destroy() {
        super.destroy();
        CoreModule.f17545c.f19643f1.m118045I3();
    }

    /* JADX INFO: renamed from: h */
    public void m151697h(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return;
        }
        CoreGiftInfo coreGiftInfoM174530a = qhe.m174529b().m174530a(coreGiftInfo.f56011id);
        if (NullChecker.m81303a(coreGiftInfoM174530a)) {
            wfe.m202983b("video").mo102510c(coreGiftInfoM174530a.f56011id, true, new dwc0());
        } else {
            qhe.m174529b().m174534f(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: k */
    public int m151698k() {
        return this.f129971c.f71627u;
    }

    /* JADX INFO: renamed from: l */
    public void m151699l() {
        ((ytj) this.f70081a).m216047r();
        duringCreated(CoreModule.f17545c.f19643f1.m118070h4()).filter(new w9j() { // from class: l.gtj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).distinctUntilChanged().map(new w9j() { // from class: l.htj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f109392a.m151701n((List) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.itj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114889a.m151702o((List) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.jtj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119612a.m151703r((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public boolean m151700m() {
        CoreGiftPanelName coreGiftPanelNameM98806G = this.f129971c.m98806G();
        return coreGiftPanelNameM98806G == CoreGiftPanelName.get("note") || coreGiftPanelNameM98806G == CoreGiftPanelName.get("greet");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ List m151701n(List list) {
        if (CoreModule.m29935P().m94658i().mo158371f() && m151700m()) {
            CoreGiftInfo coreGiftInfoNew_ = CoreGiftInfo.new_();
            coreGiftInfoNew_.f56011id = "o_diamond_gift_id";
            coreGiftInfoNew_.name = "无限打招呼";
            coreGiftInfoNew_.quota = RoomDatabase.MAX_BIND_PARAMETER_CNT;
            ((NewGiftInfoPanelWrapper) list.get(0)).giftInfos.add(coreGiftInfoNew_);
        }
        return list;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m151702o(List list) {
        ((ytj) this.f70081a).m216051w(list, this.f129971c.m98811N());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m151703r(UserPrivilege userPrivilege) {
        if (m151700m()) {
            CoreModule.f17545c.f19643f1.m118047K3(this.f129971c.m98806G(), this.f129971c.m98811N());
        } else {
            CoreModule.f17545c.f19643f1.m118051O3(this.f129971c.m98811N());
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m151704s(CoreGiftInfo coreGiftInfo, roj0 roj0Var) {
        int iM210347Y4 = (int) CoreModule.f17545c.f19570H0.m210347Y4();
        if (CoreModule.f17545c.f19643f1.m118046J3(coreGiftInfo.f56011id) > 0 || iM210347Y4 >= coreGiftInfo.unitCoinPrice) {
            if (NullChecker.m81303a(this.f129971c.f71622p)) {
                this.f129971c.f71622p.call(coreGiftInfo);
            }
            this.f129971c.dismiss();
        } else if (TextUtils.equals(m151705t().m98805F(), "from_meet_picks")) {
            zvf0.m220399u("e_chat_gift_bar_gift_send", "p_meet", vwb.m200311Y("showfrom_meet_sayhi", "picks_say_hi"), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id));
            CoreModule.m29935P().m94658i().mo158338Z(m96966b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        } else if (!TextUtils.equals(m151705t().m98805F(), "from_meet_liked")) {
            CoreModule.m29935P().m94658i().mo158338Z(m96966b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        } else {
            zvf0.m220399u("e_chat_gift_bar_gift_send", "p_meet", vwb.m200311Y("showfrom_meet_sayhi", "I_like_say_hi"), vwb.m200311Y("chat_gift_id", coreGiftInfo.f56011id));
            CoreModule.m29935P().m94658i().mo158338Z(m96966b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        }
    }

    /* JADX INFO: renamed from: t */
    public atj m151705t() {
        return this.f129971c;
    }

    /* JADX INFO: renamed from: u */
    public void m151706u(CoreGiftInfo coreGiftInfo) {
        ((ytj) this.f70081a).m216050v(coreGiftInfo);
    }

    /* JADX INFO: renamed from: v */
    public void m151707v(final CoreGiftInfo coreGiftInfo) {
        duringCreated(CoreModule.f17545c.f19570H0.m210361k5()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.ktj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124591a.m151704s(coreGiftInfo, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: w */
    public void m151708w(String str) {
        ((ytj) this.f70081a).m216053y(str);
    }

    /* JADX INFO: renamed from: x */
    public void m151709x() {
        ((ytj) this.f70081a).m216054z();
    }
}
