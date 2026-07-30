package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.aj2;
import l.e0e;
import l.e30;
import l.j760;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.yaf0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ltj extends aj2<ytj> {

    /* JADX INFO: renamed from: c */
    public final atj f6220c;

    public ltj(e0e e0eVar, atj atjVar) {
        super(e0eVar);
        this.f6220c = atjVar;
    }

    public void destroy() {
        super.destroy();
        CoreModule.c.f1.I3();
    }

    /* JADX INFO: renamed from: h */
    public void m7906h(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return;
        }
        CoreGiftInfo coreGiftInfoM8997a = qhe.m8996b().m8997a(((DbObject) coreGiftInfo).id);
        if (NullChecker.a(coreGiftInfoM8997a)) {
            wfe.m10496b("video").mo5737c(((DbObject) coreGiftInfoM8997a).id, true, new dwc0());
        } else {
            qhe.m8996b().m9001f(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: k */
    public int m7907k() {
        return this.f6220c.f2887u;
    }

    /* JADX INFO: renamed from: l */
    public void m7908l() {
        ((ytj) ((aj2) this).a).m11299r();
        duringCreated(CoreModule.c.f1.h4()).filter(new w9j() { // from class: l.gtj
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).distinctUntilChanged().map(new w9j() { // from class: l.htj
            public final Object call(Object obj) {
                return this.f4958a.m7910n((List) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.itj
            public final void call(Object obj) {
                this.f5215a.m7911o((List) obj);
            }
        }));
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.jtj
            public final void call(Object obj) {
                this.f5383a.m7912r((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public boolean m7909m() {
        CoreGiftPanelName coreGiftPanelNameM5631G = this.f6220c.m5631G();
        return coreGiftPanelNameM5631G == CoreGiftPanelName.get("note") || coreGiftPanelNameM5631G == CoreGiftPanelName.get(GiftSubBizType.greet);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ List m7910n(List list) {
        if (CoreModule.P().i().f() && m7909m()) {
            CoreGiftInfo coreGiftInfoNew_ = CoreGiftInfo.new_();
            ((DbObject) coreGiftInfoNew_).id = "o_diamond_gift_id";
            coreGiftInfoNew_.name = "无限打招呼";
            coreGiftInfoNew_.quota = 999;
            ((NewGiftInfoPanelWrapper) list.get(0)).giftInfos.add(coreGiftInfoNew_);
        }
        return list;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m7911o(List list) {
        ((ytj) ((aj2) this).a).m11303w(list, this.f6220c.m5636N());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7912r(UserPrivilege userPrivilege) {
        if (m7909m()) {
            CoreModule.c.f1.K3(this.f6220c.m5631G(), this.f6220c.m5636N());
        } else {
            CoreModule.c.f1.O3(this.f6220c.m5636N());
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7913s(CoreGiftInfo coreGiftInfo, roj0 roj0Var) {
        int iY4 = (int) CoreModule.c.H0.Y4();
        if (CoreModule.c.f1.J3(((DbObject) coreGiftInfo).id) > 0 || iY4 >= coreGiftInfo.unitCoinPrice) {
            if (NullChecker.a(this.f6220c.f2882p)) {
                this.f6220c.f2882p.call(coreGiftInfo);
            }
            this.f6220c.dismiss();
        } else if (TextUtils.equals(m7914t().m5630F(), "from_meet_picks")) {
            zvf0.u("e_chat_gift_bar_gift_send", "p_meet", new j760[]{vwb.Y("showfrom_meet_sayhi", "picks_say_hi"), vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id)});
            CoreModule.P().i().Z(b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        } else if (!TextUtils.equals(m7914t().m5630F(), "from_meet_liked")) {
            CoreModule.P().i().Z(b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        } else {
            zvf0.u("e_chat_gift_bar_gift_send", "p_meet", new j760[]{vwb.Y("showfrom_meet_sayhi", "I_like_say_hi"), vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id)});
            CoreModule.P().i().Z(b(), "p_chat,gift_send", (long) coreGiftInfo.unitCoinPrice);
        }
    }

    /* JADX INFO: renamed from: t */
    public atj m7914t() {
        return this.f6220c;
    }

    /* JADX INFO: renamed from: u */
    public void m7915u(CoreGiftInfo coreGiftInfo) {
        ((ytj) ((aj2) this).a).m11302v(coreGiftInfo);
    }

    /* JADX INFO: renamed from: v */
    public void m7916v(final CoreGiftInfo coreGiftInfo) {
        duringCreated(CoreModule.c.H0.k5()).take(1).subscribe(mkd0.H(new e30() { // from class: l.ktj
            public final void call(Object obj) {
                this.f5711a.m7913s(coreGiftInfo, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: w */
    public void m7917w(String str) {
        ((ytj) ((aj2) this).a).m11305y(str);
    }

    /* JADX INFO: renamed from: x */
    public void m7918x() {
        ((ytj) ((aj2) this).a).m11306z();
    }
}
