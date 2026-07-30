package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.app.Application;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray;
import com.p051p1.mobile.putong.live.base.data.BLiveLuckyGiftInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p153l.eb20;
import p153l.hiv;
import p153l.htd0;
import p153l.jyb;
import p153l.oo2;
import p153l.qcj;
import p153l.xau;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftTrayData {

    /* JADX INFO: renamed from: Y */
    public static final Long f50917Y = 1L;

    /* JADX INFO: renamed from: Z */
    public static final Long f50918Z = 0L;

    /* JADX INFO: renamed from: F */
    public BLiveEnterRoom f50924F;

    /* JADX INFO: renamed from: G */
    public BLiveGiftExtraDrawInfo f50925G;

    /* JADX INFO: renamed from: H */
    public String f50926H;

    /* JADX INFO: renamed from: I */
    public boolean f50927I;

    /* JADX INFO: renamed from: J */
    public BLiveUserMask f50928J;

    /* JADX INFO: renamed from: N */
    public boolean f50932N;

    /* JADX INFO: renamed from: P */
    public long f50934P;

    /* JADX INFO: renamed from: Q */
    public long f50935Q;

    /* JADX INFO: renamed from: R */
    public BLiveGivenGiftBriefTray f50936R;

    /* JADX INFO: renamed from: S */
    public BLiveGiftMultiCall f50937S;

    /* JADX INFO: renamed from: T */
    public BLiveGiftMultiCall f50938T;

    /* JADX INFO: renamed from: U */
    public String f50939U;

    /* JADX INFO: renamed from: V */
    public String f50940V;

    /* JADX INFO: renamed from: X */
    public LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray f50942X;

    /* JADX INFO: renamed from: d */
    public int f50946d;

    /* JADX INFO: renamed from: e */
    public int f50947e;

    /* JADX INFO: renamed from: f */
    public String f50948f;

    /* JADX INFO: renamed from: g */
    public int f50949g;

    /* JADX INFO: renamed from: h */
    public String f50950h;

    /* JADX INFO: renamed from: i */
    public long f50951i;

    /* JADX INFO: renamed from: j */
    public String f50952j;

    /* JADX INFO: renamed from: k */
    public int f50953k;

    /* JADX INFO: renamed from: l */
    public int f50954l;

    /* JADX INFO: renamed from: p */
    public boolean f50958p;

    /* JADX INFO: renamed from: r */
    public String f50960r;

    /* JADX INFO: renamed from: s */
    public String f50961s;

    /* JADX INFO: renamed from: t */
    public boolean f50962t;

    /* JADX INFO: renamed from: u */
    public int f50963u;

    /* JADX INFO: renamed from: a */
    public BLiveGivenGiftBrief f50943a = BLiveGivenGiftBrief.new_();

    /* JADX INFO: renamed from: b */
    public BLiveGiftItem f50944b = BLiveGiftItem.new_();

    /* JADX INFO: renamed from: c */
    public long f50945c = 0;

    /* JADX INFO: renamed from: m */
    public boolean f50955m = false;

    /* JADX INFO: renamed from: n */
    public String f50956n = "";

    /* JADX INFO: renamed from: o */
    public List<Integer> f50957o = new ArrayList();

    /* JADX INFO: renamed from: q */
    public boolean f50959q = false;

    /* JADX INFO: renamed from: v */
    public String f50964v = "";

    /* JADX INFO: renamed from: w */
    public String f50965w = "";

    /* JADX INFO: renamed from: x */
    public String f50966x = "";

    /* JADX INFO: renamed from: y */
    public String f50967y = "";

    /* JADX INFO: renamed from: z */
    public String f50968z = "";

    /* JADX INFO: renamed from: A */
    public String f50919A = "";

    /* JADX INFO: renamed from: B */
    public String f50920B = "";

    /* JADX INFO: renamed from: C */
    public String f50921C = "";

    /* JADX INFO: renamed from: D */
    public String f50922D = "";

    /* JADX INFO: renamed from: E */
    public String f50923E = "";

    /* JADX INFO: renamed from: K */
    public boolean f50929K = false;

    /* JADX INFO: renamed from: L */
    public boolean f50930L = false;

    /* JADX INFO: renamed from: M */
    public List<BLiveSpecialEffectResources> f50931M = new ArrayList();

    /* JADX INFO: renamed from: O */
    public String f50933O = "";

    /* JADX INFO: renamed from: W */
    public SparseArray<Object> f50941W = new SparseArray<>();

    public enum GiftPriority {
        otherNormal,
        otherLuxury,
        owmNormal,
        ownLuxury
    }

    /* JADX INFO: renamed from: D */
    public static void m75325D(BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData, BLiveGivenGiftBrief bLiveGivenGiftBrief, oo2 oo2Var) {
        int i = bLiveGivenGiftBrief.lotteryGiftId;
        if (i <= 0) {
            String str = bLiveGiftItem.url;
            giftTrayData.f50966x = str;
            giftTrayData.f50965w = str;
            return;
        }
        BLiveGiftItem bLiveGiftItemM168555w0 = oo2Var.m168555w0(i);
        if (NullChecker.m82486a(bLiveGiftItemM168555w0)) {
            String str2 = bLiveGiftItemM168555w0.url;
            giftTrayData.f50966x = str2;
            giftTrayData.f50965w = str2;
        } else {
            String str3 = bLiveGiftItem.url;
            giftTrayData.f50966x = str3;
            giftTrayData.f50965w = str3;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m75326E(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, GiftTrayData giftTrayData) {
        final int i = bLiveGivenGiftBrief.luckyPrizeGiftInfoGiftItemId;
        BLiveLuckyGiftInfo bLiveLuckyGiftInfo = (BLiveLuckyGiftInfo) jyb.m147529r(bLiveGiftItem.luckyPrizeGiftInfos, new qcj() { // from class: l.rzj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLuckyGiftInfo) obj).giftItemId == i);
            }
        });
        BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(i);
        LangModel langModel = bLiveGiftItem.localName;
        if (bLiveGiftItemM135160l != null) {
            giftTrayData.f50964v = langModel.getLocalName() + "开出" + bLiveGiftItemM135160l.localName.getLocalName();
            if (bLiveLuckyGiftInfo != null) {
                giftTrayData.f50965w = bLiveLuckyGiftInfo.giftPicUrl;
            } else {
                giftTrayData.f50965w = bLiveGiftItemM135160l.url;
            }
            giftTrayData.f50967y = bLiveGiftItemM135160l.liveResourceId;
            giftTrayData.f50966x = bLiveGiftItemM135160l.url;
            giftTrayData.f50946d = bLiveGiftItemM135160l.giftLevel;
            giftTrayData.f50951i = bLiveGiftItemM135160l.trayDuration;
        } else {
            giftTrayData.f50964v = langModel.getLocalName() + "开出" + bLiveGiftItem.localName.getLocalName();
            String str = bLiveGiftItem.url;
            giftTrayData.f50965w = str;
            if (bLiveLuckyGiftInfo != null) {
                giftTrayData.f50965w = bLiveLuckyGiftInfo.giftPicUrl;
            } else {
                giftTrayData.f50965w = str;
            }
        }
        giftTrayData.f50939U = bLiveGivenGiftBrief.avatarTag;
        giftTrayData.f50940V = bLiveGivenGiftBrief.giftBottomTag;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m75327a(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m75329f(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return (int) ((((long) m75331h(bLiveGiftExtraDrawInfo)) * m75334m(bLiveGiftExtraDrawInfo)) + 200.0f + 500.0f);
    }

    /* JADX INFO: renamed from: g */
    public static GiftTrayData m75330g(BLiveEnterRoom bLiveEnterRoom, String str) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f50946d = 300;
        giftTrayData.f50967y = bLiveEnterRoom.getMixResId();
        giftTrayData.f50963u = -1;
        giftTrayData.f50951i = bLiveEnterRoom.showDuration - 750;
        giftTrayData.f50958p = false;
        giftTrayData.f50926H = str;
        giftTrayData.f50933O = bLiveEnterRoom.newResourceId;
        giftTrayData.f50934P = bLiveEnterRoom.animationSizeType;
        giftTrayData.f50935Q = bLiveEnterRoom.enterVersion;
        boolean zM147479J = jyb.m147479J(bLiveEnterRoom.videoEffectExtras);
        giftTrayData.f50929K = !zM147479J;
        if (!zM147479J) {
            giftTrayData.f50931M = bLiveEnterRoom.videoEffectExtras;
        }
        return giftTrayData;
    }

    /* JADX INFO: renamed from: h */
    public static int m75331h(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return bLiveGiftExtraDrawInfo.coordinates.size();
    }

    /* JADX INFO: renamed from: j */
    public static GiftTrayData m75332j(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg, String str) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f50946d = 300;
        giftTrayData.f50967y = liveAnimationPlayMsg.getLiveResourceId();
        giftTrayData.f50963u = 2;
        giftTrayData.f50951i = liveAnimationPlayMsg.getDuration() - 750;
        giftTrayData.f50958p = false;
        giftTrayData.m75339B(Long.valueOf(liveAnimationPlayMsg.getPriority()));
        giftTrayData.f50926H = str;
        giftTrayData.f50932N = liveAnimationPlayMsg.getToMyQueue();
        if (!jyb.m147479J(liveAnimationPlayMsg.getVideoEffectExtrasList())) {
            ArrayList arrayList = new ArrayList();
            giftTrayData.f50929K = true;
            for (LongLinkSocketMessage.VideoEffectExtra videoEffectExtra : liveAnimationPlayMsg.getVideoEffectExtrasList()) {
                arrayList.add(new BLiveSpecialEffectResources(videoEffectExtra.getId(), (int) videoEffectExtra.getType(), videoEffectExtra.getValue()));
            }
            giftTrayData.f50931M = arrayList;
        }
        return giftTrayData;
    }

    /* JADX INFO: renamed from: k */
    public static GiftTrayData m75333k(String str, String str2) {
        BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(str);
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f50947e = bLiveGiftItemM135161m.f45225id;
        giftTrayData.f50967y = bLiveGiftItemM135161m.liveResourceId;
        giftTrayData.f50963u = 2;
        giftTrayData.f50932N = true;
        giftTrayData.f50946d = 300;
        giftTrayData.f50951i = bLiveGiftItemM135161m.trayDuration - 750;
        giftTrayData.f50958p = false;
        giftTrayData.m75339B(f50917Y);
        giftTrayData.f50952j = bLiveGiftItemM135161m.animationType;
        giftTrayData.f50926H = str2;
        return giftTrayData;
    }

    /* JADX INFO: renamed from: m */
    public static long m75334m(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return bLiveGiftExtraDrawInfo.coordinates.size() > zrv.m221193k().m203650j4() ? zrv.m221193k().m203642i4() : zrv.m221193k().m203634h4();
    }

    /* JADX INFO: renamed from: n */
    public static int m75335n(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return (int) (m75329f(bLiveGiftExtraDrawInfo) + 400.0f);
    }

    /* JADX INFO: renamed from: o */
    public static GiftTrayData m75336o(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable oo2 oo2Var) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f50947e = bLiveGivenGiftBrief.f45233id;
        giftTrayData.f50948f = bLiveGiftItem.getLocalName();
        giftTrayData.f50949g = bLiveGiftItem.giftSource;
        giftTrayData.f50953k = bLiveGivenGiftBrief.combos;
        giftTrayData.f50956n = bLiveGivenGiftBrief.comboId;
        giftTrayData.f50968z = bLiveGivenGiftBrief.fpUrl;
        BLiveUserMask bLiveUserMask = bLiveGivenGiftBrief.liveUserMask;
        if (bLiveUserMask == null || TextUtils.isEmpty(bLiveUserMask.name)) {
            giftTrayData.f50919A = bLiveGivenGiftBrief.userName;
        } else {
            giftTrayData.f50919A = bLiveGivenGiftBrief.liveUserMask.name;
        }
        BLiveUserMask bLiveUserMask2 = bLiveGivenGiftBrief.liveUserMask;
        if (bLiveUserMask2 == null || TextUtils.isEmpty(bLiveUserMask2.userId)) {
            giftTrayData.f50920B = bLiveGivenGiftBrief.sendGiftExtraInfo.m141111d();
        } else {
            giftTrayData.f50920B = bLiveGivenGiftBrief.liveUserMask.userId;
        }
        giftTrayData.f50922D = bLiveGivenGiftBrief.sendGiftExtraInfo.m141109b();
        giftTrayData.f50921C = bLiveGivenGiftBrief.sendGiftExtraInfo.m141108a();
        giftTrayData.f50923E = bLiveGivenGiftBrief.sendGiftExtraInfo.m141110c();
        giftTrayData.f50958p = true;
        if (oo2Var != null) {
            m75325D(bLiveGiftItem, giftTrayData, bLiveGivenGiftBrief, oo2Var);
            giftTrayData.f50926H = oo2Var.mo118362A0();
        }
        giftTrayData.f50967y = bLiveGiftItem.liveResourceId;
        giftTrayData.f50946d = bLiveGiftItem.giftLevel;
        giftTrayData.f50951i = bLiveGiftItem.trayDuration;
        giftTrayData.f50952j = bLiveGiftItem.animationType;
        giftTrayData.f50925G = bLiveGivenGiftBrief.drawParam;
        giftTrayData.f50937S = bLiveGivenGiftBrief.multiCall;
        giftTrayData.f50938T = bLiveGivenGiftBrief.guildCall;
        giftTrayData.f50936R = bLiveGivenGiftBrief.tray;
        if (bLiveGivenGiftBrief.isGiftBrief() || bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief()) {
            giftTrayData.f50963u = 1;
        } else if (bLiveGivenGiftBrief.isEnterRoomBrief()) {
            giftTrayData.f50963u = -1;
        }
        if (giftTrayData.m75348r()) {
            giftTrayData.f50951i = m75337p(giftTrayData.f50925G);
            giftTrayData.f50946d = 200;
            giftTrayData.f50925G.imgUrl = bLiveGiftItem.url;
        }
        if (bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief()) {
            giftTrayData.f50964v = zrv.f205803e.getString(R$string.f48340r5) + bLiveGivenGiftBrief.sendGiftExtraInfo.m141109b();
        } else if (bLiveGivenGiftBrief.isMultiCall()) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = giftTrayData.f50937S.receiveGiftRole;
            giftTrayData.f50964v = xau.m209912v(R$string.f48222lj, bLiveGiftMultiCallGiftRole.position, bLiveGiftMultiCallGiftRole.name);
        } else if (bLiveGivenGiftBrief.isGuildCall()) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole2 = giftTrayData.f50938T.receiveGiftRole;
            giftTrayData.f50964v = xau.m209912v(R$string.f48222lj, bLiveGiftMultiCallGiftRole2.position, bLiveGiftMultiCallGiftRole2.name);
        } else if (bLiveGiftItem.isLuckyGift()) {
            m75326E(bLiveGiftItem, bLiveGivenGiftBrief, giftTrayData);
        } else if (giftTrayData.m75348r()) {
            Application application = zrv.f205803e;
            giftTrayData.f50964v = application.getString(R$string.f48304pd, application.getString(R$string.f47924Y4));
        } else {
            giftTrayData.f50964v = zrv.f205803e.getString(R$string.f48304pd, bLiveGiftItem.localName.getLocalName());
        }
        if (bLiveGivenGiftBrief.isFirstGivenGift) {
            giftTrayData.f50951i += 10000;
        }
        giftTrayData.f50927I = bLiveGivenGiftBrief.hasVoiceMode;
        giftTrayData.f50928J = bLiveGivenGiftBrief.liveUserMask;
        boolean zM147479J = jyb.m147479J(bLiveGivenGiftBrief.videoEffectExtras);
        giftTrayData.f50929K = !zM147479J;
        if (!zM147479J) {
            giftTrayData.f50931M = bLiveGivenGiftBrief.videoEffectExtras;
        }
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.effectExt)) {
            giftTrayData.f50959q = true;
            giftTrayData.f50961s = bLiveGivenGiftBrief.effectExt;
        }
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.tradeNo)) {
            giftTrayData.f50960r = bLiveGivenGiftBrief.tradeNo;
        }
        giftTrayData.f50954l = bLiveGivenGiftBrief.num;
        giftTrayData.f50962t = bLiveGivenGiftBrief.isNamed;
        giftTrayData.f50939U = bLiveGivenGiftBrief.avatarTag;
        giftTrayData.f50940V = bLiveGivenGiftBrief.giftBottomTag;
        giftTrayData.f50943a = bLiveGivenGiftBrief;
        giftTrayData.f50944b = bLiveGiftItem;
        return giftTrayData;
    }

    /* JADX INFO: renamed from: p */
    public static long m75337p(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return m75335n(bLiveGiftExtraDrawInfo) - 750;
    }

    /* JADX INFO: renamed from: A */
    public void m75338A(List<Integer> list) {
        this.f50957o.addAll(list);
        Collections.sort(this.f50957o, new Comparator() { // from class: l.szj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return GiftTrayData.m75327a((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m75339B(Object obj) {
        this.f50941W.put(this.f50963u, obj);
    }

    /* JADX INFO: renamed from: C */
    public Integer m75340C() {
        if (m75350t()) {
            return null;
        }
        return this.f50957o.remove(0);
    }

    /* JADX INFO: renamed from: F */
    public void m75341F(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        this.f50942X = intlLuckyGiftTray;
    }

    /* JADX INFO: renamed from: c */
    public void m75342c(Integer num) {
        this.f50957o.add(num);
    }

    /* JADX INFO: renamed from: d */
    public void m75343d() {
        this.f50957o.clear();
    }

    /* JADX INFO: renamed from: e */
    public BLiveGivenGiftBrief m75344e() {
        return this.f50943a;
    }

    /* JADX INFO: renamed from: i */
    public GiftPriority m75345i() {
        if (m75356z()) {
            return m75354x() ? GiftPriority.ownLuxury : GiftPriority.owmNormal;
        }
        return m75354x() ? GiftPriority.otherLuxury : GiftPriority.otherNormal;
    }

    /* JADX INFO: renamed from: l */
    public String m75346l() {
        return "SendGiftExtraInfo{sendGiftUserId='" + this.f50920B + "', receiveGiftUserId='" + this.f50921C + "', receiveGiftUserName='" + this.f50922D + "', roomId='" + this.f50923E + "'}";
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public <T> T m75347q() {
        return (T) this.f50941W.get(this.f50963u);
    }

    /* JADX INFO: renamed from: r */
    public boolean m75348r() {
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f50925G;
        return (bLiveGiftExtraDrawInfo == null || jyb.m147479J(bLiveGiftExtraDrawInfo.coordinates)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m75349s() {
        int i = this.f50946d;
        return i == 100 || i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: t */
    public boolean m75350t() {
        return jyb.m147479J(this.f50957o);
    }

    /* JADX INFO: renamed from: u */
    public boolean m75351u() {
        return this.f50963u == -1;
    }

    /* JADX INFO: renamed from: v */
    public boolean m75352v() {
        return TextUtils.equals(this.f50952j, "stickFace");
    }

    /* JADX INFO: renamed from: w */
    public boolean m75353w() {
        return this.f50963u == 1;
    }

    /* JADX INFO: renamed from: x */
    public boolean m75354x() {
        int i = this.f50946d;
        return i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: y */
    public boolean m75355y() {
        return this.f50963u == 2;
    }

    /* JADX INFO: renamed from: z */
    public boolean m75356z() {
        if (TextUtils.equals(this.f50920B, zrv.f205799a.m207631D0())) {
            return true;
        }
        if (eb20.m120149b()) {
            return TextUtils.equals(this.f50920B, eb20.m120148a());
        }
        return false;
    }
}
