package p002l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveGuardAnchorRankInfo;
import com.p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem;
import com.p1.mobile.putong.live.base.data.BLiveKnightsRuleInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.h7d0;
import l.jbu;
import l.mqi0;
import l.mqv;
import l.vwb;
import l.w8u;
import l.w9j;
import l.ypv;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class psk {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20656c(List list, List list2, final User user) {
        BLiveUserMask bLiveUserMask = (BLiveUserMask) vwb.r(list, new w9j() { // from class: l.osk
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserMask) obj).userId, ((DbObject) user).id));
            }
        });
        if (bLiveUserMask != null) {
            list2.add(mqv.f(user).e(bLiveUserMask));
        } else {
            list2.add(mqv.f(user));
        }
    }

    /* JADX INFO: renamed from: e */
    public static mqv<User> m20658e(final BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary, BLiveData bLiveData) {
        User user = (User) vwb.r(bLiveData.users, new w9j() { // from class: l.lsk
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((DbObject) ((User) obj)).id, bLiveUserKnightInfoSummary.userId));
            }
        });
        BLiveUserMask bLiveUserMask = (BLiveUserMask) vwb.r(bLiveData.masks, new w9j() { // from class: l.msk
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserMask) obj).userId, bLiveUserKnightInfoSummary.userId));
            }
        });
        return bLiveUserMask == null ? mqv.f(user) : mqv.f(user).e(bLiveUserMask);
    }

    /* JADX INFO: renamed from: f */
    public static List<mqv<User>> m20659f(@Nullable BLiveData bLiveData) {
        final ArrayList arrayList = new ArrayList();
        if (bLiveData == null) {
            return arrayList;
        }
        final List list = bLiveData.masks;
        vwb.z(bLiveData.users, new e30() { // from class: l.nsk
            public final void call(Object obj) {
                psk.m20656c(list, arrayList, (User) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static String m20660g(long j, long j2) {
        long j3 = j - j2;
        long j4 = j3 / 3600;
        long j5 = (j3 / 60) - (j4 * 60);
        return String.format("%1s %2s:%3s:%4s", w8u.t(R$string.f2777I2), jbu.R(j4), jbu.R(j5), jbu.R((j3 - (60 * j5)) - (3600 * j4)));
    }

    /* JADX INFO: renamed from: h */
    public static String m20661h(BLiveGuardType bLiveGuardType, boolean z, int i) {
        if (mpw.C0681a.m18130b(bLiveGuardType)) {
            return w8u.u(z ? R$string.f2780I5 : R$string.f2867M5, w8u.u(R$string.f3578t5, Integer.valueOf(i)));
        }
        return w8u.u(z ? R$string.f2802J5 : R$string.f2888N5, w8u.u(R$string.f3578t5, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: i */
    public static List<mpw.C0682b> m20662i(BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(bLiveKnightsRuleInfoItem.guardPrivileges)) {
            for (BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem : bLiveKnightsRuleInfoItem.guardPrivileges) {
                mpw.C0682b c0682b = new mpw.C0682b(bLiveKnightsPrivilegeItem.icon, bLiveKnightsPrivilegeItem.title, bLiveKnightsPrivilegeItem.remain);
                c0682b.f15554b = m20663j(bLiveKnightsRuleInfoItem.guardType);
                arrayList.add(c0682b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static String m20663j(BLiveGuardType bLiveGuardType) {
        return mpw.C0681a.m18130b(bLiveGuardType) ? "#cc3253e1" : "#cc9732e1";
    }

    /* JADX INFO: renamed from: k */
    public static String m20664k(long j, boolean z) {
        if (j > 0) {
            return w8u.u(z ? R$string.f3313h3 : R$string.f2715F6, Long.valueOf(j));
        }
        return "";
    }

    /* JADX INFO: renamed from: l */
    public static List<mpw.C0681a> m20665l(isk iskVar, List<BLiveKnightsRuleInfoItem> list, BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo) {
        long j;
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            for (BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem : list) {
                if (TEnum.equals(bLiveKnightsRuleInfoItem.guardType, "heartbeat") || TEnum.equals(bLiveKnightsRuleInfoItem.guardType, "cherish")) {
                    mpw.C0681a c0681a = new mpw.C0681a();
                    BLiveGuardType bLiveGuardType = bLiveKnightsRuleInfoItem.guardType;
                    c0681a.f15532a = bLiveGuardType;
                    c0681a.f15537f = iskVar.m15374z4(bLiveGuardType);
                    c0681a.f15538g = iskVar.m15366s4(bLiveKnightsRuleInfoItem.guardType);
                    c0681a.f15551t = bLiveKnightsRuleInfoItem.guardNotice;
                    c0681a.f15552u = bLiveKnightsRuleInfoItem.guardPopupIcon;
                    if (mpw.C0681a.m18130b(bLiveKnightsRuleInfoItem.guardType)) {
                        j = bLiveGuardAnchorRankInfo.heartbeatGuardNums;
                        c0681a.f15533b = w8u.t(R$string.f2736G5);
                        c0681a.f15539h = i3c0.f13010y;
                        c0681a.f15540i = i3c0.f12425A2;
                        c0681a.f15543l = i3c0.f12497G2;
                        c0681a.f15544m = i3c0.f12509H2;
                        c0681a.f15545n = Color.parseColor("#3253e1");
                        c0681a.f15546o = Color.parseColor("#993353dd");
                        c0681a.f15547p = i3c0.f12998x;
                        c0681a.f15548q = "#993353dd";
                        c0681a.f15549r = "#e0edff";
                    } else if (mpw.C0681a.m18129a(bLiveKnightsRuleInfoItem.guardType)) {
                        j = bLiveGuardAnchorRankInfo.cherishGuardNums;
                        c0681a.f15533b = w8u.t(R$string.f2758H5);
                        c0681a.f15539h = i3c0.f12542K;
                        c0681a.f15540i = i3c0.f13025z2;
                        c0681a.f15543l = i3c0.f12437B2;
                        c0681a.f15544m = i3c0.f12449C2;
                        c0681a.f15545n = Color.parseColor("#9f00d1");
                        c0681a.f15546o = Color.parseColor("#999f00d1");
                        c0681a.f15547p = i3c0.f12518I;
                        c0681a.f15548q = "#999f00d1";
                        c0681a.f15549r = "#f3e0ff";
                    } else {
                        j = 0;
                    }
                    c0681a.f15550s = m20664k(iskVar.m15364q4(bLiveKnightsRuleInfoItem.guardType), c0681a.f15537f);
                    c0681a.f15536e = m20661h(bLiveKnightsRuleInfoItem.guardType, c0681a.f15537f, c0681a.f15538g);
                    c0681a.f15542k = iskVar.m15366s4(bLiveKnightsRuleInfoItem.guardType);
                    if (c0681a.f15537f) {
                        c0681a.f15534c = w8u.u(R$string.f3146Zb, Integer.valueOf(m20669p(iskVar.m15356i4(bLiveKnightsRuleInfoItem.guardType))));
                    }
                    c0681a.f15535d = w8u.v(R$string.f2846L5, new Object[]{Long.valueOf(j), Integer.valueOf(bLiveKnightsRuleInfoItem.guardPrivileges.size())});
                    c0681a.f15541j = m20662i(bLiveKnightsRuleInfoItem);
                    arrayList.add(c0681a);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static int m20666m(double d) {
        return (int) Math.ceil((((double) (mqi0.o() / 1000.0f)) - d) / 3600.0d);
    }

    /* JADX INFO: renamed from: n */
    public static String m20667n(long j) {
        return j > 100 ? "100+" : String.valueOf(j);
    }

    @StringRes
    /* JADX INFO: renamed from: o */
    public static int m20668o(BLiveGuardType bLiveGuardType, boolean z) {
        if (z) {
            return mpw.C0681a.m18130b(bLiveGuardType) ? R$string.f3622v5 : R$string.f3600u5;
        }
        return mpw.C0681a.m18130b(bLiveGuardType) ? R$string.f3666x5 : R$string.f3644w5;
    }

    /* JADX INFO: renamed from: p */
    public static int m20669p(double d) {
        return (int) Math.ceil(((d - ((double) (mqi0.o() / 1000.0f))) - 100.0d) / 86400.0d);
    }

    /* JADX INFO: renamed from: q */
    public static SpannableString m20670q(String str, String str2) {
        return m20671r(str, str2, h1c0.f11725E0);
    }

    /* JADX INFO: renamed from: r */
    public static SpannableString m20671r(String str, String str2, @ColorRes int i) {
        int iIndexOf = str.indexOf(str2);
        SpannableString spannableString = new SpannableString(str);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(ypv.e.getResources().getColor(i)), iIndexOf, str2.length() + iIndexOf, 18);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m20672s(double d) {
        return (((double) (((float) mqi0.o()) / 1000.0f)) - d) / 3600.0d <= 24.0d;
    }

    /* JADX INFO: renamed from: t */
    public static void m20673t(BLiveGuardboardRecord bLiveGuardboardRecord, String str) {
        zcu.h(h7d0.x().r(bLiveGuardboardRecord.liveId).g(bLiveGuardboardRecord.userId).u(bLiveGuardboardRecord.liveStates.toString()).m(String.valueOf(bLiveGuardboardRecord.rank)).w("e_guardboard").a(), str);
    }
}
