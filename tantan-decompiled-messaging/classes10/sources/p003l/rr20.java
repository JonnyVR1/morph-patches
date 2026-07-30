package p003l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.data.MyMeetExtra;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
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
public class rr20 extends aj2<bs20> {

    /* JADX INFO: renamed from: c */
    public fr20 f7231c;

    /* JADX INFO: renamed from: d */
    public vr20 f7232d;

    public rr20(e0e e0eVar, fr20 fr20Var) {
        super(e0eVar);
        this.f7231c = fr20Var;
    }

    /* JADX INFO: renamed from: A */
    public void m9165A() {
        ((bs20) ((aj2) this).a).m5802C();
    }

    /* JADX INFO: renamed from: k */
    public void m9166k(CoreGiftInfo coreGiftInfo) {
        m9170o(coreGiftInfo);
    }

    /* JADX INFO: renamed from: l */
    public int m9167l() {
        return this.f7231c.f4500u;
    }

    /* JADX INFO: renamed from: m */
    public void m9168m() {
        if (this.f7231c.m6496G() == CoreGiftPanelName.get("note") || this.f7231c.m6496G() == CoreGiftPanelName.get(GiftSubBizType.greet)) {
            CoreModule.c.f1.K3(this.f7231c.m6496G(), this.f7231c.m6501N());
        } else {
            CoreModule.c.f1.O3(this.f7231c.m6501N());
        }
        if (CoreModule.P().i().f()) {
            CoreModule.c.C0.u4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m9169n() {
        ((bs20) ((aj2) this).a).m5807r();
        duringCreated(CoreModule.c.f1.h4()).filter(new w9j() { // from class: l.lr20
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.mr20
            public final void call(Object obj) {
                this.f6405a.m9171r((List) obj);
            }
        }));
        if (vwb.J(CoreModule.c.f1.P3())) {
            duringCreated(ConnectivityReceiver.m()).filter(new w9j() { // from class: l.nr20
                public final Object call(Object obj) {
                    return Boolean.valueOf(ConnectivityReceiver.g());
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.or20
                public final void call(Object obj) {
                    this.f6744a.m9172s((NetworkInfo) obj);
                }
            }));
        }
        if (this.f7231c.m6496G() == CoreGiftPanelName.get("note")) {
            duringCreated(CoreModule.c.f1.g4()).subscribe(mkd0.G(new e30() { // from class: l.pr20
                public final void call(Object obj) {
                    this.f6912a.m9173t((MyMeetExtra) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9170o(CoreGiftInfo coreGiftInfo) {
        if (!coreGiftInfo.dynamicGift || TextUtils.isEmpty(coreGiftInfo.dynamicURL)) {
            return true;
        }
        CoreGiftInfo coreGiftInfoM8997a = qhe.m8996b().m8997a(((DbObject) coreGiftInfo).id);
        if (coreGiftInfoM8997a != null) {
            return wfe.m10496b("video").mo5737c(((DbObject) coreGiftInfoM8997a).id, true, new dwc0());
        }
        qhe.m8996b().m9001f(coreGiftInfo);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m9171r(List list) {
        ((bs20) ((aj2) this).a).m5810x(list);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m9172s(NetworkInfo networkInfo) {
        m9168m();
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m9173t(MyMeetExtra myMeetExtra) {
        ((bs20) ((aj2) this).a).m5811y(myMeetExtra.title, myMeetExtra.subTitle);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m9174u(CoreGiftInfo coreGiftInfo, roj0 roj0Var) {
        int iY4 = (int) CoreModule.c.H0.Y4();
        if (CoreModule.c.f1.J3(((DbObject) coreGiftInfo).id) > 0 || iY4 >= coreGiftInfo.unitCoinPrice) {
            if (NullChecker.a(this.f7231c.f4495p)) {
                this.f7231c.f4495p.call(coreGiftInfo);
            }
            this.f7231c.dismiss();
        } else if (TextUtils.equals(m9175v().m6495F(), "from_meet_picks")) {
            zvf0.u("e_chat_gift_bar_gift_send", "p_meet", new j760[]{vwb.Y("showfrom_meet_sayhi", "picks_say_hi"), vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id)});
            CoreModule.P().i().Z(b(), "p_meet_view,e_meet_gift_bar_picks,click", (long) coreGiftInfo.unitCoinPrice);
        } else if (!TextUtils.equals(m9175v().m6495F(), "from_meet_liked")) {
            CoreModule.P().i().Z(b(), ftj.m6508b(this.f7231c.m6500L(), "e_gift"), (long) coreGiftInfo.unitCoinPrice);
        } else {
            zvf0.u("e_chat_gift_bar_gift_send", "p_meet", new j760[]{vwb.Y("showfrom_meet_sayhi", "I_like_say_hi"), vwb.Y("chat_gift_id", ((DbObject) coreGiftInfo).id)});
            CoreModule.P().i().Z(b(), "p_meet_view,e_meet_gift_bar_ilike,click", (long) coreGiftInfo.unitCoinPrice);
        }
    }

    /* JADX INFO: renamed from: v */
    public fr20 m9175v() {
        return this.f7231c;
    }

    /* JADX INFO: renamed from: w */
    public void m9176w(CoreGiftInfo coreGiftInfo) {
        ((bs20) ((aj2) this).a).m5809w(coreGiftInfo);
    }

    /* JADX INFO: renamed from: x */
    public void m9177x(final CoreGiftInfo coreGiftInfo) {
        duringCreated(CoreModule.c.H0.k5()).take(1).subscribe(mkd0.H(new e30() { // from class: l.qr20
            public final void call(Object obj) {
                this.f7088a.m9174u(coreGiftInfo, (roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: y */
    public void m9178y(vr20 vr20Var) {
        if (NullChecker.a(this.f7232d)) {
            this.f7232d.m10266I();
        }
        this.f7232d = vr20Var;
    }

    /* JADX INFO: renamed from: z */
    public void m9179z(String str) {
        ((bs20) ((aj2) this).a).m5801B(str);
    }
}
