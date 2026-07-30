package com.p000p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.app.Application;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.data.LangModel;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveGiftMultiCallGiftRole;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray;
import com.p1.mobile.putong.live.base.data.BLiveLuckyGiftInfo;
import com.p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.fld0;
import l.ggv;
import l.vwb;
import l.w8u;
import l.w9j;
import l.ypv;
import p002l.ho2;
import p002l.w220;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftTrayData {

    /* JADX INFO: renamed from: Y */
    public static final Long f6111Y = 1L;

    /* JADX INFO: renamed from: Z */
    public static final Long f6112Z = 0L;

    /* JADX INFO: renamed from: F */
    public BLiveEnterRoom f6118F;

    /* JADX INFO: renamed from: G */
    public BLiveGiftExtraDrawInfo f6119G;

    /* JADX INFO: renamed from: H */
    public String f6120H;

    /* JADX INFO: renamed from: I */
    public boolean f6121I;

    /* JADX INFO: renamed from: J */
    public BLiveUserMask f6122J;

    /* JADX INFO: renamed from: N */
    public boolean f6126N;

    /* JADX INFO: renamed from: P */
    public long f6128P;

    /* JADX INFO: renamed from: Q */
    public long f6129Q;

    /* JADX INFO: renamed from: R */
    public BLiveGivenGiftBriefTray f6130R;

    /* JADX INFO: renamed from: S */
    public BLiveGiftMultiCall f6131S;

    /* JADX INFO: renamed from: T */
    public BLiveGiftMultiCall f6132T;

    /* JADX INFO: renamed from: U */
    public String f6133U;

    /* JADX INFO: renamed from: V */
    public String f6134V;

    /* JADX INFO: renamed from: X */
    public LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray f6136X;

    /* JADX INFO: renamed from: d */
    public int f6140d;

    /* JADX INFO: renamed from: e */
    public int f6141e;

    /* JADX INFO: renamed from: f */
    public String f6142f;

    /* JADX INFO: renamed from: g */
    public int f6143g;

    /* JADX INFO: renamed from: h */
    public String f6144h;

    /* JADX INFO: renamed from: i */
    public long f6145i;

    /* JADX INFO: renamed from: j */
    public String f6146j;

    /* JADX INFO: renamed from: k */
    public int f6147k;

    /* JADX INFO: renamed from: l */
    public int f6148l;

    /* JADX INFO: renamed from: p */
    public boolean f6152p;

    /* JADX INFO: renamed from: r */
    public String f6154r;

    /* JADX INFO: renamed from: s */
    public String f6155s;

    /* JADX INFO: renamed from: t */
    public boolean f6156t;

    /* JADX INFO: renamed from: u */
    public int f6157u;

    /* JADX INFO: renamed from: a */
    public BLiveGivenGiftBrief f6137a = BLiveGivenGiftBrief.new_();

    /* JADX INFO: renamed from: b */
    public BLiveGiftItem f6138b = BLiveGiftItem.new_();

    /* JADX INFO: renamed from: c */
    public long f6139c = 0;

    /* JADX INFO: renamed from: m */
    public boolean f6149m = false;

    /* JADX INFO: renamed from: n */
    public String f6150n = "";

    /* JADX INFO: renamed from: o */
    public List<Integer> f6151o = new ArrayList();

    /* JADX INFO: renamed from: q */
    public boolean f6153q = false;

    /* JADX INFO: renamed from: v */
    public String f6158v = "";

    /* JADX INFO: renamed from: w */
    public String f6159w = "";

    /* JADX INFO: renamed from: x */
    public String f6160x = "";

    /* JADX INFO: renamed from: y */
    public String f6161y = "";

    /* JADX INFO: renamed from: z */
    public String f6162z = "";

    /* JADX INFO: renamed from: A */
    public String f6113A = "";

    /* JADX INFO: renamed from: B */
    public String f6114B = "";

    /* JADX INFO: renamed from: C */
    public String f6115C = "";

    /* JADX INFO: renamed from: D */
    public String f6116D = "";

    /* JADX INFO: renamed from: E */
    public String f6117E = "";

    /* JADX INFO: renamed from: K */
    public boolean f6123K = false;

    /* JADX INFO: renamed from: L */
    public boolean f6124L = false;

    /* JADX INFO: renamed from: M */
    public List<BLiveSpecialEffectResources> f6125M = new ArrayList();

    /* JADX INFO: renamed from: O */
    public String f6127O = "";

    /* JADX INFO: renamed from: W */
    public SparseArray<Object> f6135W = new SparseArray<>();

    public enum GiftPriority {
        otherNormal,
        otherLuxury,
        owmNormal,
        ownLuxury
    }

    /* JADX INFO: renamed from: D */
    public static void m7707D(BLiveGiftItem bLiveGiftItem, GiftTrayData giftTrayData, BLiveGivenGiftBrief bLiveGivenGiftBrief, ho2 ho2Var) {
        int i = bLiveGivenGiftBrief.lotteryGiftId;
        if (i <= 0) {
            String str = bLiveGiftItem.url;
            giftTrayData.f6160x = str;
            giftTrayData.f6159w = str;
            return;
        }
        BLiveGiftItem bLiveGiftItemM14607w0 = ho2Var.m14607w0(i);
        if (NullChecker.a(bLiveGiftItemM14607w0)) {
            String str2 = bLiveGiftItemM14607w0.url;
            giftTrayData.f6160x = str2;
            giftTrayData.f6159w = str2;
        } else {
            String str3 = bLiveGiftItem.url;
            giftTrayData.f6160x = str3;
            giftTrayData.f6159w = str3;
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m7708E(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, GiftTrayData giftTrayData) {
        final int i = bLiveGivenGiftBrief.luckyPrizeGiftInfoGiftItemId;
        BLiveLuckyGiftInfo bLiveLuckyGiftInfo = (BLiveLuckyGiftInfo) vwb.r(bLiveGiftItem.luckyPrizeGiftInfos, new w9j() { // from class: l.bxj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveLuckyGiftInfo) obj).giftItemId == i);
            }
        });
        BLiveGiftItem bLiveGiftItemL = ((ggv) ypv.l(fld0.c)).l(i);
        LangModel langModel = bLiveGiftItem.localName;
        if (bLiveGiftItemL != null) {
            giftTrayData.f6158v = langModel.getLocalName() + "开出" + bLiveGiftItemL.localName.getLocalName();
            if (bLiveLuckyGiftInfo != null) {
                giftTrayData.f6159w = bLiveLuckyGiftInfo.giftPicUrl;
            } else {
                giftTrayData.f6159w = bLiveGiftItemL.url;
            }
            giftTrayData.f6161y = bLiveGiftItemL.liveResourceId;
            giftTrayData.f6160x = bLiveGiftItemL.url;
            giftTrayData.f6140d = bLiveGiftItemL.giftLevel;
            giftTrayData.f6145i = bLiveGiftItemL.trayDuration;
        } else {
            giftTrayData.f6158v = langModel.getLocalName() + "开出" + bLiveGiftItem.localName.getLocalName();
            String str = bLiveGiftItem.url;
            giftTrayData.f6159w = str;
            if (bLiveLuckyGiftInfo != null) {
                giftTrayData.f6159w = bLiveLuckyGiftInfo.giftPicUrl;
            } else {
                giftTrayData.f6159w = str;
            }
        }
        giftTrayData.f6133U = bLiveGivenGiftBrief.avatarTag;
        giftTrayData.f6134V = bLiveGivenGiftBrief.giftBottomTag;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m7709a(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: renamed from: f */
    public static int m7711f(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return (int) ((((long) m7713h(bLiveGiftExtraDrawInfo)) * m7716m(bLiveGiftExtraDrawInfo)) + 200.0f + 500.0f);
    }

    /* JADX INFO: renamed from: g */
    public static GiftTrayData m7712g(BLiveEnterRoom bLiveEnterRoom, String str) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f6140d = 300;
        giftTrayData.f6161y = bLiveEnterRoom.getMixResId();
        giftTrayData.f6157u = -1;
        giftTrayData.f6145i = bLiveEnterRoom.showDuration - 750;
        giftTrayData.f6152p = false;
        giftTrayData.f6120H = str;
        giftTrayData.f6127O = bLiveEnterRoom.newResourceId;
        giftTrayData.f6128P = bLiveEnterRoom.animationSizeType;
        giftTrayData.f6129Q = bLiveEnterRoom.enterVersion;
        boolean zJ = vwb.J(bLiveEnterRoom.videoEffectExtras);
        giftTrayData.f6123K = !zJ;
        if (!zJ) {
            giftTrayData.f6125M = bLiveEnterRoom.videoEffectExtras;
        }
        return giftTrayData;
    }

    /* JADX INFO: renamed from: h */
    public static int m7713h(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return bLiveGiftExtraDrawInfo.coordinates.size();
    }

    /* JADX INFO: renamed from: j */
    public static GiftTrayData m7714j(LongLinkSocketMessage.LiveAnimationPlayMsg liveAnimationPlayMsg, String str) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f6140d = 300;
        giftTrayData.f6161y = liveAnimationPlayMsg.getLiveResourceId();
        giftTrayData.f6157u = 2;
        giftTrayData.f6145i = liveAnimationPlayMsg.getDuration() - 750;
        giftTrayData.f6152p = false;
        giftTrayData.m7721B(Long.valueOf(liveAnimationPlayMsg.getPriority()));
        giftTrayData.f6120H = str;
        giftTrayData.f6126N = liveAnimationPlayMsg.getToMyQueue();
        if (!vwb.J(liveAnimationPlayMsg.getVideoEffectExtrasList())) {
            ArrayList arrayList = new ArrayList();
            giftTrayData.f6123K = true;
            for (LongLinkSocketMessage.VideoEffectExtra videoEffectExtra : liveAnimationPlayMsg.getVideoEffectExtrasList()) {
                arrayList.add(new BLiveSpecialEffectResources(videoEffectExtra.getId(), (int) videoEffectExtra.getType(), videoEffectExtra.getValue()));
            }
            giftTrayData.f6125M = arrayList;
        }
        return giftTrayData;
    }

    /* JADX INFO: renamed from: k */
    public static GiftTrayData m7715k(String str, String str2) {
        BLiveGiftItem bLiveGiftItemM = ((ggv) ypv.l(fld0.c)).m(str);
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f6141e = bLiveGiftItemM.id;
        giftTrayData.f6161y = bLiveGiftItemM.liveResourceId;
        giftTrayData.f6157u = 2;
        giftTrayData.f6126N = true;
        giftTrayData.f6140d = 300;
        giftTrayData.f6145i = bLiveGiftItemM.trayDuration - 750;
        giftTrayData.f6152p = false;
        giftTrayData.m7721B(f6111Y);
        giftTrayData.f6146j = bLiveGiftItemM.animationType;
        giftTrayData.f6120H = str2;
        return giftTrayData;
    }

    /* JADX INFO: renamed from: m */
    public static long m7716m(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return bLiveGiftExtraDrawInfo.coordinates.size() > ypv.k().j4() ? ypv.k().i4() : ypv.k().h4();
    }

    /* JADX INFO: renamed from: n */
    public static int m7717n(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return (int) (m7711f(bLiveGiftExtraDrawInfo) + 400.0f);
    }

    /* JADX INFO: renamed from: o */
    public static GiftTrayData m7718o(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable ho2 ho2Var) {
        GiftTrayData giftTrayData = new GiftTrayData();
        giftTrayData.f6141e = bLiveGivenGiftBrief.id;
        giftTrayData.f6142f = bLiveGiftItem.getLocalName();
        giftTrayData.f6143g = bLiveGiftItem.giftSource;
        giftTrayData.f6147k = bLiveGivenGiftBrief.combos;
        giftTrayData.f6150n = bLiveGivenGiftBrief.comboId;
        giftTrayData.f6162z = bLiveGivenGiftBrief.fpUrl;
        BLiveUserMask bLiveUserMask = bLiveGivenGiftBrief.liveUserMask;
        if (bLiveUserMask == null || TextUtils.isEmpty(bLiveUserMask.name)) {
            giftTrayData.f6113A = bLiveGivenGiftBrief.userName;
        } else {
            giftTrayData.f6113A = bLiveGivenGiftBrief.liveUserMask.name;
        }
        BLiveUserMask bLiveUserMask2 = bLiveGivenGiftBrief.liveUserMask;
        if (bLiveUserMask2 == null || TextUtils.isEmpty(bLiveUserMask2.userId)) {
            giftTrayData.f6114B = bLiveGivenGiftBrief.sendGiftExtraInfo.d();
        } else {
            giftTrayData.f6114B = bLiveGivenGiftBrief.liveUserMask.userId;
        }
        giftTrayData.f6116D = bLiveGivenGiftBrief.sendGiftExtraInfo.b();
        giftTrayData.f6115C = bLiveGivenGiftBrief.sendGiftExtraInfo.a();
        giftTrayData.f6117E = bLiveGivenGiftBrief.sendGiftExtraInfo.c();
        giftTrayData.f6152p = true;
        if (ho2Var != null) {
            m7707D(bLiveGiftItem, giftTrayData, bLiveGivenGiftBrief, ho2Var);
            giftTrayData.f6120H = ho2Var.mo14489A0();
        }
        giftTrayData.f6161y = bLiveGiftItem.liveResourceId;
        giftTrayData.f6140d = bLiveGiftItem.giftLevel;
        giftTrayData.f6145i = bLiveGiftItem.trayDuration;
        giftTrayData.f6146j = bLiveGiftItem.animationType;
        giftTrayData.f6119G = bLiveGivenGiftBrief.drawParam;
        giftTrayData.f6131S = bLiveGivenGiftBrief.multiCall;
        giftTrayData.f6132T = bLiveGivenGiftBrief.guildCall;
        giftTrayData.f6130R = bLiveGivenGiftBrief.tray;
        if (bLiveGivenGiftBrief.isGiftBrief() || bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief()) {
            giftTrayData.f6157u = 1;
        } else if (bLiveGivenGiftBrief.isEnterRoomBrief()) {
            giftTrayData.f6157u = -1;
        }
        if (giftTrayData.m7730r()) {
            giftTrayData.f6145i = m7719p(giftTrayData.f6119G);
            giftTrayData.f6140d = 200;
            giftTrayData.f6119G.imgUrl = bLiveGiftItem.url;
        }
        if (bLiveGivenGiftBrief.isLianMaiBrief() || bLiveGivenGiftBrief.isAudienceBrief()) {
            giftTrayData.f6158v = ypv.e.getString(R$string.f3534r5) + bLiveGivenGiftBrief.sendGiftExtraInfo.b();
        } else if (bLiveGivenGiftBrief.isMultiCall()) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole = giftTrayData.f6131S.receiveGiftRole;
            giftTrayData.f6158v = w8u.v(R$string.f3416lj, new Object[]{bLiveGiftMultiCallGiftRole.position, bLiveGiftMultiCallGiftRole.name});
        } else if (bLiveGivenGiftBrief.isGuildCall()) {
            BLiveGiftMultiCallGiftRole bLiveGiftMultiCallGiftRole2 = giftTrayData.f6132T.receiveGiftRole;
            giftTrayData.f6158v = w8u.v(R$string.f3416lj, new Object[]{bLiveGiftMultiCallGiftRole2.position, bLiveGiftMultiCallGiftRole2.name});
        } else if (bLiveGiftItem.isLuckyGift()) {
            m7708E(bLiveGiftItem, bLiveGivenGiftBrief, giftTrayData);
        } else if (giftTrayData.m7730r()) {
            Application application = ypv.e;
            giftTrayData.f6158v = application.getString(R$string.f3498pd, application.getString(R$string.f3118Y4));
        } else {
            giftTrayData.f6158v = ypv.e.getString(R$string.f3498pd, bLiveGiftItem.localName.getLocalName());
        }
        if (bLiveGivenGiftBrief.isFirstGivenGift) {
            giftTrayData.f6145i += 10000;
        }
        giftTrayData.f6121I = bLiveGivenGiftBrief.hasVoiceMode;
        giftTrayData.f6122J = bLiveGivenGiftBrief.liveUserMask;
        boolean zJ = vwb.J(bLiveGivenGiftBrief.videoEffectExtras);
        giftTrayData.f6123K = !zJ;
        if (!zJ) {
            giftTrayData.f6125M = bLiveGivenGiftBrief.videoEffectExtras;
        }
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.effectExt)) {
            giftTrayData.f6153q = true;
            giftTrayData.f6155s = bLiveGivenGiftBrief.effectExt;
        }
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.tradeNo)) {
            giftTrayData.f6154r = bLiveGivenGiftBrief.tradeNo;
        }
        giftTrayData.f6148l = bLiveGivenGiftBrief.num;
        giftTrayData.f6156t = bLiveGivenGiftBrief.isNamed;
        giftTrayData.f6133U = bLiveGivenGiftBrief.avatarTag;
        giftTrayData.f6134V = bLiveGivenGiftBrief.giftBottomTag;
        giftTrayData.f6137a = bLiveGivenGiftBrief;
        giftTrayData.f6138b = bLiveGiftItem;
        return giftTrayData;
    }

    /* JADX INFO: renamed from: p */
    public static long m7719p(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo) {
        return m7717n(bLiveGiftExtraDrawInfo) - 750;
    }

    /* JADX INFO: renamed from: A */
    public void m7720A(List<Integer> list) {
        this.f6151o.addAll(list);
        Collections.sort(this.f6151o, new Comparator() { // from class: l.cxj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return GiftTrayData.m7709a((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m7721B(Object obj) {
        this.f6135W.put(this.f6157u, obj);
    }

    /* JADX INFO: renamed from: C */
    public Integer m7722C() {
        if (m7732t()) {
            return null;
        }
        return this.f6151o.remove(0);
    }

    /* JADX INFO: renamed from: F */
    public void m7723F(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        this.f6136X = intlLuckyGiftTray;
    }

    /* JADX INFO: renamed from: c */
    public void m7724c(Integer num) {
        this.f6151o.add(num);
    }

    /* JADX INFO: renamed from: d */
    public void m7725d() {
        this.f6151o.clear();
    }

    /* JADX INFO: renamed from: e */
    public BLiveGivenGiftBrief m7726e() {
        return this.f6137a;
    }

    /* JADX INFO: renamed from: i */
    public GiftPriority m7727i() {
        if (m7738z()) {
            return m7736x() ? GiftPriority.ownLuxury : GiftPriority.owmNormal;
        }
        return m7736x() ? GiftPriority.otherLuxury : GiftPriority.otherNormal;
    }

    /* JADX INFO: renamed from: l */
    public String m7728l() {
        return "SendGiftExtraInfo{sendGiftUserId='" + this.f6114B + "', receiveGiftUserId='" + this.f6115C + "', receiveGiftUserName='" + this.f6116D + "', roomId='" + this.f6117E + "'}";
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public <T> T m7729q() {
        return (T) this.f6135W.get(this.f6157u);
    }

    /* JADX INFO: renamed from: r */
    public boolean m7730r() {
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f6119G;
        return (bLiveGiftExtraDrawInfo == null || vwb.J(bLiveGiftExtraDrawInfo.coordinates)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m7731s() {
        int i = this.f6140d;
        return i == 100 || i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: t */
    public boolean m7732t() {
        return vwb.J(this.f6151o);
    }

    /* JADX INFO: renamed from: u */
    public boolean m7733u() {
        return this.f6157u == -1;
    }

    /* JADX INFO: renamed from: v */
    public boolean m7734v() {
        return TextUtils.equals(this.f6146j, "stickFace");
    }

    /* JADX INFO: renamed from: w */
    public boolean m7735w() {
        return this.f6157u == 1;
    }

    /* JADX INFO: renamed from: x */
    public boolean m7736x() {
        int i = this.f6140d;
        return i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: y */
    public boolean m7737y() {
        return this.f6157u == 2;
    }

    /* JADX INFO: renamed from: z */
    public boolean m7738z() {
        if (TextUtils.equals(this.f6114B, ypv.a.D0())) {
            return true;
        }
        if (w220.m24291b()) {
            return TextUtils.equals(this.f6114B, w220.m24290a());
        }
        return false;
    }
}
