package com.p046p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.app.Application;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray;
import com.p046p1.mobile.putong.live.base.data.BLiveLuckyGiftInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p149l.fld0;
import p149l.ggv;
import p149l.ho2;
import p149l.vwb;
import p149l.w220;
import p149l.w8u;
import p149l.w9j;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftTrayData {

    /* JADX INFO: renamed from: Y */
    public static final Long f50069Y = 1L;

    /* JADX INFO: renamed from: Z */
    public static final Long f50070Z = 0L;

    /* JADX INFO: renamed from: F */
    public BLiveEnterRoom f50076F;

    /* JADX INFO: renamed from: G */
    public BLiveGiftExtraDrawInfo f50077G;

    /* JADX INFO: renamed from: H */
    public String f50078H;

    /* JADX INFO: renamed from: I */
    public boolean f50079I;

    /* JADX INFO: renamed from: J */
    public BLiveUserMask f50080J;

    /* JADX INFO: renamed from: N */
    public boolean f50084N;

    /* JADX INFO: renamed from: P */
    public long f50086P;

    /* JADX INFO: renamed from: Q */
    public long f50087Q;

    /* JADX INFO: renamed from: R */
    public BLiveGivenGiftBriefTray f50088R;

    /* JADX INFO: renamed from: S */
    public BLiveGiftMultiCall f50089S;

    /* JADX INFO: renamed from: T */
    public BLiveGiftMultiCall f50090T;

    /* JADX INFO: renamed from: U */
    public String f50091U;

    /* JADX INFO: renamed from: V */
    public String f50092V;

    /* JADX INFO: renamed from: X */
    public LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray f50094X;

    /* JADX INFO: renamed from: d */
    public int f50098d;

    /* JADX INFO: renamed from: e */
    public int f50099e;

    /* JADX INFO: renamed from: f */
    public String f50100f;

    /* JADX INFO: renamed from: g */
    public int f50101g;

    /* JADX INFO: renamed from: h */
    public String f50102h;

    /* JADX INFO: renamed from: i */
    public long f50103i;

    /* JADX INFO: renamed from: j */
    public String f50104j;

    /* JADX INFO: renamed from: k */
    public int f50105k;

    /* JADX INFO: renamed from: l */
    public int f50106l;

    /* JADX INFO: renamed from: p */
    public boolean f50110p;

    /* JADX INFO: renamed from: r */
    public String f50112r;

    /* JADX INFO: renamed from: s */
    public String f50113s;

    /* JADX INFO: renamed from: t */
    public boolean f50114t;

    /* JADX INFO: renamed from: u */
    public int f50115u;

    /* JADX INFO: renamed from: a */
    public BLiveGivenGiftBrief f50095a = BLiveGivenGiftBrief.new_();

    /* JADX INFO: renamed from: b */
    public BLiveGiftItem f50096b = BLiveGiftItem.new_();

    /* JADX INFO: renamed from: c */
    public long f50097c = 0;

    /* JADX INFO: renamed from: m */
    public boolean f50107m = false;

    /* JADX INFO: renamed from: n */
    public String f50108n = "";

    /* JADX INFO: renamed from: o */
    public List<Integer> f50109o = new ArrayList();

    /* JADX INFO: renamed from: q */
    public boolean f50111q = false;

    /* JADX INFO: renamed from: v */
    public String f50116v = "";

    /* JADX INFO: renamed from: w */
    public String f50117w = "";

    /* JADX INFO: renamed from: x */
    public String f50118x = "";

    /* JADX INFO: renamed from: y */
    public String f50119y = "";

    /* JADX INFO: renamed from: z */
    public String f50120z = "";

    /* JADX INFO: renamed from: A */
    public String f50071A = "";

    /* JADX INFO: renamed from: B */
    public String f50072B = "";

    /* JADX INFO: renamed from: C */
    public String f50073C = "";

    /* JADX INFO: renamed from: D */
    public String f50074D = "";

    /* JADX INFO: renamed from: E */
    public String f50075E = "";

    /* JADX INFO: renamed from: K */
    public boolean f50081K = false;

    /* JADX INFO: renamed from: L */
    public boolean f50082L = false;

    /* JADX INFO: renamed from: M */
    public List<BLiveSpecialEffectResources> f50083M = new ArrayList();

    /* JADX INFO: renamed from: O */
    public String f50085O = "";

    /* JADX INFO: renamed from: W */
    public SparseArray<Object> f50093W = new SparseArray<>();

    public enum GiftPriority {
        otherNormal,
        otherLuxury,
        owmNormal,
        ownLuxury
    }

    /* JADX INFO: renamed from: D */
    public static void m74142D(BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData, BLiveGivenGiftBrief bLiveGivenGiftBrief, ho2 ho2Var) {
        int i = bLiveGivenGiftBrief.lotteryGiftId;
        if (i <= 0) {
            String str = bLiveGiftItem.url;
            giftTrayData.f50118x = str;
            giftTrayData.f50117w = str;
            return;
        }
        BLiveGiftItem bLiveGiftItemM132171w0 = ho2Var.m132171w0(i);
        if (NullChecker.m81303a(bLiveGiftItemM132171w0)) {
            String str2 = bLiveGiftItemM132171w0.url;
            giftTrayData.f50118x = str2;
            giftTrayData.f50117w = str2;
        } else {
            String str3 = bLiveGiftItem.url;
            giftTrayData.f50118x = str3;
            giftTrayData.f50117w = str3;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m74143E(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, GiftTrayData giftTrayData) {
        final int i = bLiveGivenGiftBrief.luckyPrizeGiftInfoGiftItemId;
        BLiveLuckyGiftInfo bLiveLuckyGiftInfo = (BLiveLuckyGiftInfo) vwb.m200346r(bLiveGiftItem.luckyPrizeGiftInfos, new w9j() { // from class: l.bxj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLuckyGiftInfo) obj).giftItemId == i);
            }
        });
        BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(i);
        LangModel langModel = bLiveGiftItem.localName;
        if (bLiveGiftItemM126026l != null) {
            giftTrayData.f50116v = langModel.getLocalName() + "开出" + bLiveGiftItemM126026l.localName.getLocalName();
            if (bLiveLuckyGiftInfo != null) {
                giftTrayData.f50117w = bLiveLuckyGiftInfo.giftPicUrl;
            } else {
                giftTrayData.f50117w = bLiveGiftItemM126026l.url;
            }
            giftTrayData.f50119y = bLiveGiftItemM126026l.liveResourceId;
            giftTrayData.f50118x = bLiveGiftItemM126026l.url;
            giftTrayData.f50098d = bLiveGiftItemM126026l.giftLevel;
            giftTrayData.f50103i = bLiveGiftItemM126026l.trayDuration;
        } else {
            giftTrayData.f50116v = langModel.getLocalName() + "开出" + bLiveGiftItem.localName.getLocalName();
            String str = bLiveGiftItem.url;
            giftTrayData.f50117w = str;
            if (bLiveLuckyGiftInfo != null) {
                giftTrayData.f50117w = bLiveLuckyGiftInfo.giftPicUrl;
            } else {
                giftTrayData.f50117w = str;
            }
        }
        giftTrayData.f50091U = bLiveGivenGiftBrief.avatarTag;
        giftTrayData.f50092V = bLiveGivenGiftBrief.giftBottomTag;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m74144a(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m74146f(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return (int) ((((long) m74148h(bLiveGiftExtraDrawInfo)) * m74151m(bLiveGiftExtraDrawInfo)) + 200.0f + 500.0f);
    }

    /* JADX INFO: renamed from: g */
    public static GiftTrayData m74147g(BLiveEnterRoom bLiveEnterRoom, String str) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f50098d = 300;
        giftTrayData.f50119y = bLiveEnterRoom.getMixResId();
        giftTrayData.f50115u = -1;
        giftTrayData.f50103i = bLiveEnterRoom.showDuration - 750;
        giftTrayData.f50110p = false;
        giftTrayData.f50078H = str;
        giftTrayData.f50085O = bLiveEnterRoom.newResourceId;
        giftTrayData.f50086P = bLiveEnterRoom.animationSizeType;
        giftTrayData.f50087Q = bLiveEnterRoom.enterVersion;
        boolean zM200296J = vwb.m200296J(bLiveEnterRoom.videoEffectExtras);
        giftTrayData.f50081K = !zM200296J;
        if (!zM200296J) {
            giftTrayData.f50083M = bLiveEnterRoom.videoEffectExtras;
        }
        return giftTrayData;
    }

    /* JADX INFO: renamed from: h */
    public static int m74148h(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return bLiveGiftExtraDrawInfo.coordinates.size();
    }

    /* JADX INFO: renamed from: j */
    public static GiftTrayData m74149j(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg, String str) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f50098d = 300;
        giftTrayData.f50119y = liveAnimationPlayMsg.getLiveResourceId();
        giftTrayData.f50115u = 2;
        giftTrayData.f50103i = liveAnimationPlayMsg.getDuration() - 750;
        giftTrayData.f50110p = false;
        giftTrayData.m74156B(Long.valueOf(liveAnimationPlayMsg.getPriority()));
        giftTrayData.f50078H = str;
        giftTrayData.f50084N = liveAnimationPlayMsg.getToMyQueue();
        if (!vwb.m200296J(liveAnimationPlayMsg.getVideoEffectExtrasList())) {
            ArrayList arrayList = new ArrayList();
            giftTrayData.f50081K = true;
            for (LongLinkSocketMessage.VideoEffectExtra videoEffectExtra : liveAnimationPlayMsg.getVideoEffectExtrasList()) {
                arrayList.add(new BLiveSpecialEffectResources(videoEffectExtra.getId(), (int) videoEffectExtra.getType(), videoEffectExtra.getValue()));
            }
            giftTrayData.f50083M = arrayList;
        }
        return giftTrayData;
    }

    /* JADX INFO: renamed from: k */
    public static GiftTrayData m74150k(String str, String str2) {
        BLiveGiftItem bLiveGiftItemM126027m = ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(str);
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f50099e = bLiveGiftItemM126027m.f44377id;
        giftTrayData.f50119y = bLiveGiftItemM126027m.liveResourceId;
        giftTrayData.f50115u = 2;
        giftTrayData.f50084N = true;
        giftTrayData.f50098d = 300;
        giftTrayData.f50103i = bLiveGiftItemM126027m.trayDuration - 750;
        giftTrayData.f50110p = false;
        giftTrayData.m74156B(f50069Y);
        giftTrayData.f50104j = bLiveGiftItemM126027m.animationType;
        giftTrayData.f50078H = str2;
        return giftTrayData;
    }

    /* JADX INFO: renamed from: m */
    public static long m74151m(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return bLiveGiftExtraDrawInfo.coordinates.size() > ypv.m215672k().m195863j4() ? ypv.m215672k().m195855i4() : ypv.m215672k().m195847h4();
    }

    /* JADX INFO: renamed from: n */
    public static int m74152n(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return (int) (m74146f(bLiveGiftExtraDrawInfo) + 400.0f);
    }

    /* JADX INFO: renamed from: o */
    public static GiftTrayData m74153o(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable ho2 ho2Var) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f50099e = bLiveGivenGiftBrief.f44385id;
        giftTrayData.f50100f = bLiveGiftItem.getLocalName();
        giftTrayData.f50101g = bLiveGiftItem.giftSource;
        giftTrayData.f50105k = bLiveGivenGiftBrief.combos;
        giftTrayData.f50108n = bLiveGivenGiftBrief.comboId;
        giftTrayData.f50120z = bLiveGivenGiftBrief.fpUrl;
        BLiveUserMask bLiveUserMask = bLiveGivenGiftBrief.liveUserMask;
        if (bLiveUserMask == null || TextUtils.isEmpty(bLiveUserMask.name)) {
            giftTrayData.f50071A = bLiveGivenGiftBrief.userName;
        } else {
            giftTrayData.f50071A = bLiveGivenGiftBrief.liveUserMask.name;
        }
        BLiveUserMask bLiveUserMask2 = bLiveGivenGiftBrief.liveUserMask;
        if (bLiveUserMask2 == null || TextUtils.isEmpty(bLiveUserMask2.userId)) {
            giftTrayData.f50072B = bLiveGivenGiftBrief.sendGiftExtraInfo.m111448d();
        } else {
            giftTrayData.f50072B = bLiveGivenGiftBrief.liveUserMask.userId;
        }
        giftTrayData.f50074D = bLiveGivenGiftBrief.sendGiftExtraInfo.m111446b();
        giftTrayData.f50073C = bLiveGivenGiftBrief.sendGiftExtraInfo.m111445a();
        giftTrayData.f50075E = bLiveGivenGiftBrief.sendGiftExtraInfo.m111447c();
        giftTrayData.f50110p = true;
        if (ho2Var != null) {
            m74142D(bLiveGiftItem, giftTrayData, bLiveGivenGiftBrief, ho2Var);
            giftTrayData.f50078H = ho2Var.mo132054A0();
        }
        giftTrayData.f50119y = bLiveGiftItem.liveResourceId;
        giftTrayData.f50098d = bLiveGiftItem.giftLevel;
        giftTrayData.f50103i = bLiveGiftItem.trayDuration;
        giftTrayData.f50104j = bLiveGiftItem.animationType;
        giftTrayData.f50077G = bLiveGivenGiftBrief.drawParam;
        giftTrayData.f50089S = bLiveGivenGiftBrief.multiCall;
        giftTrayData.f50090T = bLiveGivenGiftBrief.guildCall;
        giftTrayData.f50088R = bLiveGivenGiftBrief.tray;
        if (bLiveGivenGiftBrief.isGiftBrief() || bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief()) {
            giftTrayData.f50115u = 1;
        } else if (bLiveGivenGiftBrief.isEnterRoomBrief()) {
            giftTrayData.f50115u = -1;
        }
        if (giftTrayData.m74165r()) {
            giftTrayData.f50103i = m74154p(giftTrayData.f50077G);
            giftTrayData.f50098d = 200;
            giftTrayData.f50077G.imgUrl = bLiveGiftItem.url;
        }
        if (bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief()) {
            giftTrayData.f50116v = ypv.f199497e.getString(R$string.f47492r5) + bLiveGivenGiftBrief.sendGiftExtraInfo.m111446b();
        } else if (bLiveGivenGiftBrief.isMultiCall()) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = giftTrayData.f50089S.receiveGiftRole;
            giftTrayData.f50116v = w8u.m202219v(R$string.f47374lj, bLiveGiftMultiCallGiftRole.position, bLiveGiftMultiCallGiftRole.name);
        } else if (bLiveGivenGiftBrief.isGuildCall()) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole2 = giftTrayData.f50090T.receiveGiftRole;
            giftTrayData.f50116v = w8u.m202219v(R$string.f47374lj, bLiveGiftMultiCallGiftRole2.position, bLiveGiftMultiCallGiftRole2.name);
        } else if (bLiveGiftItem.isLuckyGift()) {
            m74143E(bLiveGiftItem, bLiveGivenGiftBrief, giftTrayData);
        } else if (giftTrayData.m74165r()) {
            Application application = ypv.f199497e;
            giftTrayData.f50116v = application.getString(R$string.f47456pd, application.getString(R$string.f47076Y4));
        } else {
            giftTrayData.f50116v = ypv.f199497e.getString(R$string.f47456pd, bLiveGiftItem.localName.getLocalName());
        }
        if (bLiveGivenGiftBrief.isFirstGivenGift) {
            giftTrayData.f50103i += 10000;
        }
        giftTrayData.f50079I = bLiveGivenGiftBrief.hasVoiceMode;
        giftTrayData.f50080J = bLiveGivenGiftBrief.liveUserMask;
        boolean zM200296J = vwb.m200296J(bLiveGivenGiftBrief.videoEffectExtras);
        giftTrayData.f50081K = !zM200296J;
        if (!zM200296J) {
            giftTrayData.f50083M = bLiveGivenGiftBrief.videoEffectExtras;
        }
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.effectExt)) {
            giftTrayData.f50111q = true;
            giftTrayData.f50113s = bLiveGivenGiftBrief.effectExt;
        }
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.tradeNo)) {
            giftTrayData.f50112r = bLiveGivenGiftBrief.tradeNo;
        }
        giftTrayData.f50106l = bLiveGivenGiftBrief.num;
        giftTrayData.f50114t = bLiveGivenGiftBrief.isNamed;
        giftTrayData.f50091U = bLiveGivenGiftBrief.avatarTag;
        giftTrayData.f50092V = bLiveGivenGiftBrief.giftBottomTag;
        giftTrayData.f50095a = bLiveGivenGiftBrief;
        giftTrayData.f50096b = bLiveGiftItem;
        return giftTrayData;
    }

    /* JADX INFO: renamed from: p */
    public static long m74154p(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return m74152n(bLiveGiftExtraDrawInfo) - 750;
    }

    /* JADX INFO: renamed from: A */
    public void m74155A(List<Integer> list) {
        this.f50109o.addAll(list);
        Collections.sort(this.f50109o, new Comparator() { // from class: l.cxj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return GiftTrayData.m74144a((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m74156B(Object obj) {
        this.f50093W.put(this.f50115u, obj);
    }

    /* JADX INFO: renamed from: C */
    public Integer m74157C() {
        if (m74167t()) {
            return null;
        }
        return this.f50109o.remove(0);
    }

    /* JADX INFO: renamed from: F */
    public void m74158F(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        this.f50094X = intlLuckyGiftTray;
    }

    /* JADX INFO: renamed from: c */
    public void m74159c(Integer num) {
        this.f50109o.add(num);
    }

    /* JADX INFO: renamed from: d */
    public void m74160d() {
        this.f50109o.clear();
    }

    /* JADX INFO: renamed from: e */
    public BLiveGivenGiftBrief m74161e() {
        return this.f50095a;
    }

    /* JADX INFO: renamed from: i */
    public GiftPriority m74162i() {
        if (m74173z()) {
            return m74171x() ? GiftPriority.ownLuxury : GiftPriority.owmNormal;
        }
        return m74171x() ? GiftPriority.otherLuxury : GiftPriority.otherNormal;
    }

    /* JADX INFO: renamed from: l */
    public String m74163l() {
        return "SendGiftExtraInfo{sendGiftUserId='" + this.f50072B + "', receiveGiftUserId='" + this.f50073C + "', receiveGiftUserName='" + this.f50074D + "', roomId='" + this.f50075E + "'}";
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public <T> T m74164q() {
        return (T) this.f50093W.get(this.f50115u);
    }

    /* JADX INFO: renamed from: r */
    public boolean m74165r() {
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f50077G;
        return (bLiveGiftExtraDrawInfo == null || vwb.m200296J(bLiveGiftExtraDrawInfo.coordinates)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m74166s() {
        int i = this.f50098d;
        return i == 100 || i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: t */
    public boolean m74167t() {
        return vwb.m200296J(this.f50109o);
    }

    /* JADX INFO: renamed from: u */
    public boolean m74168u() {
        return this.f50115u == -1;
    }

    /* JADX INFO: renamed from: v */
    public boolean m74169v() {
        return TextUtils.equals(this.f50104j, "stickFace");
    }

    /* JADX INFO: renamed from: w */
    public boolean m74170w() {
        return this.f50115u == 1;
    }

    /* JADX INFO: renamed from: x */
    public boolean m74171x() {
        int i = this.f50098d;
        return i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: y */
    public boolean m74172y() {
        return this.f50115u == 2;
    }

    /* JADX INFO: renamed from: z */
    public boolean m74173z() {
        if (TextUtils.equals(this.f50072B, ypv.f199493a.m199309D0())) {
            return true;
        }
        if (w220.m201015b()) {
            return TextUtils.equals(this.f50072B, w220.m201014a());
        }
        return false;
    }
}
