package p153l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardAnchorRankInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsRuleInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fvk {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m127652c(List list, List list2, final User user) {
        BLiveUserMask bLiveUserMask = (BLiveUserMask) jyb.m147529r(list, new qcj() { // from class: l.evk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserMask) obj).userId, user.f56859id));
            }
        });
        if (bLiveUserMask != null) {
            list2.add(nsv.m164636f(user).m164641e(bLiveUserMask));
        } else {
            list2.add(nsv.m164636f(user));
        }
    }

    /* JADX INFO: renamed from: e */
    public static nsv<User> m127654e(final BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary, BLiveData bLiveData) {
        User user = (User) jyb.m147529r(bLiveData.users, new qcj() { // from class: l.bvk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((User) obj).f56859id, bLiveUserKnightInfoSummary.userId));
            }
        });
        BLiveUserMask bLiveUserMask = (BLiveUserMask) jyb.m147529r(bLiveData.masks, new qcj() { // from class: l.cvk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserMask) obj).userId, bLiveUserKnightInfoSummary.userId));
            }
        });
        return bLiveUserMask == null ? nsv.m164636f(user) : nsv.m164636f(user).m164641e(bLiveUserMask);
    }

    /* JADX INFO: renamed from: f */
    public static List<nsv<User>> m127655f(@Nullable BLiveData bLiveData) {
        final ArrayList arrayList = new ArrayList();
        if (bLiveData == null) {
            return arrayList;
        }
        final List<BLiveUserMask> list = bLiveData.masks;
        jyb.m147537z(bLiveData.users, new y20() { // from class: l.dvk
            @Override // p153l.y20
            public final void call(Object obj) {
                fvk.m127652c(list, arrayList, (User) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static String m127656g(long j, long j2) {
        long j3 = j - j2;
        long j4 = j3 / 3600;
        long j5 = (j3 / 60) - (j4 * 60);
        return String.format("%1s %2s:%3s:%4s", xau.m209910t(R$string.f47583I2), kdu.m149273R(j4), kdu.m149273R(j5), kdu.m149273R((j3 - (60 * j5)) - (3600 * j4)));
    }

    /* JADX INFO: renamed from: h */
    public static String m127657h(BLiveGuardType bLiveGuardType, boolean z, int i) {
        if (lsw.C18451a.m155734b(bLiveGuardType)) {
            return xau.m209911u(z ? R$string.f47586I5 : R$string.f47673M5, xau.m209911u(R$string.f48384t5, Integer.valueOf(i)));
        }
        return xau.m209911u(z ? R$string.f47608J5 : R$string.f47694N5, xau.m209911u(R$string.f48384t5, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: i */
    public static List<lsw.C18452b> m127658i(BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(bLiveKnightsRuleInfoItem.guardPrivileges)) {
            for (BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem : bLiveKnightsRuleInfoItem.guardPrivileges) {
                lsw.C18452b c18452b = new lsw.C18452b(bLiveKnightsPrivilegeItem.icon, bLiveKnightsPrivilegeItem.title, bLiveKnightsPrivilegeItem.remain);
                c18452b.f133502b = m127659j(bLiveKnightsRuleInfoItem.guardType);
                arrayList.add(c18452b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static String m127659j(BLiveGuardType bLiveGuardType) {
        return lsw.C18451a.m155734b(bLiveGuardType) ? "#cc3253e1" : "#cc9732e1";
    }

    /* JADX INFO: renamed from: k */
    public static String m127660k(long j, boolean z) {
        if (j > 0) {
            return xau.m209911u(z ? R$string.f48119h3 : R$string.f47521F6, Long.valueOf(j));
        }
        return "";
    }

    /* JADX INFO: renamed from: l */
    public static List<lsw.C18451a> m127661l(yuk yukVar, List<BLiveKnightsRuleInfoItem> list, BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo) {
        long j;
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            for (BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem : list) {
                if (TEnum.equals(bLiveKnightsRuleInfoItem.guardType, "heartbeat") || TEnum.equals(bLiveKnightsRuleInfoItem.guardType, BLiveGuardType.cherish)) {
                    lsw.C18451a c18451a = new lsw.C18451a();
                    BLiveGuardType bLiveGuardType = bLiveKnightsRuleInfoItem.guardType;
                    c18451a.f133480a = bLiveGuardType;
                    c18451a.f133485f = yukVar.m217434z4(bLiveGuardType);
                    c18451a.f133486g = yukVar.m217427s4(bLiveKnightsRuleInfoItem.guardType);
                    c18451a.f133499t = bLiveKnightsRuleInfoItem.guardNotice;
                    c18451a.f133500u = bLiveKnightsRuleInfoItem.guardPopupIcon;
                    if (lsw.C18451a.m155734b(bLiveKnightsRuleInfoItem.guardType)) {
                        j = bLiveGuardAnchorRankInfo.heartbeatGuardNums;
                        c18451a.f133481b = xau.m209910t(R$string.f47542G5);
                        c18451a.f133487h = obc0.f146553y;
                        c18451a.f133488i = obc0.f145968A2;
                        c18451a.f133491l = obc0.f146040G2;
                        c18451a.f133492m = obc0.f146052H2;
                        c18451a.f133493n = Color.parseColor("#3253e1");
                        c18451a.f133494o = Color.parseColor("#993353dd");
                        c18451a.f133495p = obc0.f146541x;
                        c18451a.f133496q = "#993353dd";
                        c18451a.f133497r = "#e0edff";
                    } else if (lsw.C18451a.m155733a(bLiveKnightsRuleInfoItem.guardType)) {
                        j = bLiveGuardAnchorRankInfo.cherishGuardNums;
                        c18451a.f133481b = xau.m209910t(R$string.f47564H5);
                        c18451a.f133487h = obc0.f146085K;
                        c18451a.f133488i = obc0.f146568z2;
                        c18451a.f133491l = obc0.f145980B2;
                        c18451a.f133492m = obc0.f145992C2;
                        c18451a.f133493n = Color.parseColor("#9f00d1");
                        c18451a.f133494o = Color.parseColor("#999f00d1");
                        c18451a.f133495p = obc0.f146061I;
                        c18451a.f133496q = "#999f00d1";
                        c18451a.f133497r = "#f3e0ff";
                    } else {
                        j = 0;
                    }
                    c18451a.f133498s = m127660k(yukVar.m217425q4(bLiveKnightsRuleInfoItem.guardType), c18451a.f133485f);
                    c18451a.f133484e = m127657h(bLiveKnightsRuleInfoItem.guardType, c18451a.f133485f, c18451a.f133486g);
                    c18451a.f133490k = yukVar.m217427s4(bLiveKnightsRuleInfoItem.guardType);
                    if (c18451a.f133485f) {
                        c18451a.f133482c = xau.m209911u(R$string.f47952Zb, Integer.valueOf(m127665p(yukVar.m217417i4(bLiveKnightsRuleInfoItem.guardType))));
                    }
                    c18451a.f133483d = xau.m209912v(R$string.f47652L5, Long.valueOf(j), Integer.valueOf(bLiveKnightsRuleInfoItem.guardPrivileges.size()));
                    c18451a.f133489j = m127658i(bLiveKnightsRuleInfoItem);
                    arrayList.add(c18451a);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static int m127662m(double d) {
        return (int) Math.ceil((((double) (pzi0.m174454o() / 1000.0f)) - d) / 3600.0d);
    }

    /* JADX INFO: renamed from: n */
    public static String m127663n(long j) {
        return j > 100 ? "100+" : String.valueOf(j);
    }

    @StringRes
    /* JADX INFO: renamed from: o */
    public static int m127664o(BLiveGuardType bLiveGuardType, boolean z) {
        if (z) {
            return lsw.C18451a.m155734b(bLiveGuardType) ? R$string.f48428v5 : R$string.f48406u5;
        }
        return lsw.C18451a.m155734b(bLiveGuardType) ? R$string.f48472x5 : R$string.f48450w5;
    }

    /* JADX INFO: renamed from: p */
    public static int m127665p(double d) {
        return (int) Math.ceil(((d - ((double) (pzi0.m174454o() / 1000.0f))) - 100.0d) / 86400.0d);
    }

    /* JADX INFO: renamed from: q */
    public static SpannableString m127666q(String str, String str2) {
        return m127667r(str, str2, n9c0.f140766E0);
    }

    /* JADX INFO: renamed from: r */
    public static SpannableString m127667r(String str, String str2, @ColorRes int i) {
        int iIndexOf = str.indexOf(str2);
        SpannableString spannableString = new SpannableString(str);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(zrv.f205803e.getResources().getColor(i)), iIndexOf, str2.length() + iIndexOf, 18);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m127668s(double d) {
        return (((double) (((float) pzi0.m174454o()) / 1000.0f)) - d) / 3600.0d <= 24.0d;
    }

    /* JADX INFO: renamed from: t */
    public static void m127669t(BLiveGuardboardRecord bLiveGuardboardRecord, String str) {
        afu.m97559h(kfd0.m149385x().m149409r(bLiveGuardboardRecord.liveId).m149398g(bLiveGuardboardRecord.userId).m149412u(bLiveGuardboardRecord.liveStates.toString()).m149404m(String.valueOf(bLiveGuardboardRecord.rank)).m149414w("e_guardboard").m149392a(), str);
    }
}
