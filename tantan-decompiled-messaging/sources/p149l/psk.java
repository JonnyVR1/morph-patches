package p149l;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardAnchorRankInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem;
import com.p046p1.mobile.putong.live.base.data.BLiveKnightsRuleInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveUserKnightInfoSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class psk {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m171160c(List list, List list2, final User user) {
        BLiveUserMask bLiveUserMask = (BLiveUserMask) vwb.m200346r(list, new w9j() { // from class: l.osk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserMask) obj).userId, user.f56011id));
            }
        });
        if (bLiveUserMask != null) {
            list2.add(mqv.m155998f(user).m156003e(bLiveUserMask));
        } else {
            list2.add(mqv.m155998f(user));
        }
    }

    /* JADX INFO: renamed from: e */
    public static mqv<User> m171162e(final BLiveUserKnightInfoSummary bLiveUserKnightInfoSummary, BLiveData bLiveData) {
        User user = (User) vwb.m200346r(bLiveData.users, new w9j() { // from class: l.lsk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((User) obj).f56011id, bLiveUserKnightInfoSummary.userId));
            }
        });
        BLiveUserMask bLiveUserMask = (BLiveUserMask) vwb.m200346r(bLiveData.masks, new w9j() { // from class: l.msk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUserMask) obj).userId, bLiveUserKnightInfoSummary.userId));
            }
        });
        return bLiveUserMask == null ? mqv.m155998f(user) : mqv.m155998f(user).m156003e(bLiveUserMask);
    }

    /* JADX INFO: renamed from: f */
    public static List<mqv<User>> m171163f(@Nullable BLiveData bLiveData) {
        final ArrayList arrayList = new ArrayList();
        if (bLiveData == null) {
            return arrayList;
        }
        final List<BLiveUserMask> list = bLiveData.masks;
        vwb.m200354z(bLiveData.users, new e30() { // from class: l.nsk
            @Override // p149l.e30
            public final void call(Object obj) {
                psk.m171160c(list, arrayList, (User) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static String m171164g(long j, long j2) {
        long j3 = j - j2;
        long j4 = j3 / 3600;
        long j5 = (j3 / 60) - (j4 * 60);
        return String.format("%1s %2s:%3s:%4s", w8u.m202217t(R$string.f46735I2), jbu.m140810R(j4), jbu.m140810R(j5), jbu.m140810R((j3 - (60 * j5)) - (3600 * j4)));
    }

    /* JADX INFO: renamed from: h */
    public static String m171165h(BLiveGuardType bLiveGuardType, boolean z, int i) {
        if (mpw.C18528a.m155839b(bLiveGuardType)) {
            return w8u.m202218u(z ? R$string.f46738I5 : R$string.f46825M5, w8u.m202218u(R$string.f47536t5, Integer.valueOf(i)));
        }
        return w8u.m202218u(z ? R$string.f46760J5 : R$string.f46846N5, w8u.m202218u(R$string.f47536t5, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: i */
    public static List<mpw.C18529b> m171166i(BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(bLiveKnightsRuleInfoItem.guardPrivileges)) {
            for (BLiveKnightsPrivilegeItem bLiveKnightsPrivilegeItem : bLiveKnightsRuleInfoItem.guardPrivileges) {
                mpw.C18529b c18529b = new mpw.C18529b(bLiveKnightsPrivilegeItem.icon, bLiveKnightsPrivilegeItem.title, bLiveKnightsPrivilegeItem.remain);
                c18529b.f135126b = m171167j(bLiveKnightsRuleInfoItem.guardType);
                arrayList.add(c18529b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static String m171167j(BLiveGuardType bLiveGuardType) {
        return mpw.C18528a.m155839b(bLiveGuardType) ? "#cc3253e1" : "#cc9732e1";
    }

    /* JADX INFO: renamed from: k */
    public static String m171168k(long j, boolean z) {
        if (j > 0) {
            return w8u.m202218u(z ? R$string.f47271h3 : R$string.f46673F6, Long.valueOf(j));
        }
        return "";
    }

    /* JADX INFO: renamed from: l */
    public static List<mpw.C18528a> m171169l(isk iskVar, List<BLiveKnightsRuleInfoItem> list, BLiveGuardAnchorRankInfo bLiveGuardAnchorRankInfo) {
        long j;
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            for (BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem : list) {
                if (TEnum.equals(bLiveKnightsRuleInfoItem.guardType, "heartbeat") || TEnum.equals(bLiveKnightsRuleInfoItem.guardType, BLiveGuardType.cherish)) {
                    mpw.C18528a c18528a = new mpw.C18528a();
                    BLiveGuardType bLiveGuardType = bLiveKnightsRuleInfoItem.guardType;
                    c18528a.f135104a = bLiveGuardType;
                    c18528a.f135109f = iskVar.m138034z4(bLiveGuardType);
                    c18528a.f135110g = iskVar.m138027s4(bLiveKnightsRuleInfoItem.guardType);
                    c18528a.f135123t = bLiveKnightsRuleInfoItem.guardNotice;
                    c18528a.f135124u = bLiveKnightsRuleInfoItem.guardPopupIcon;
                    if (mpw.C18528a.m155839b(bLiveKnightsRuleInfoItem.guardType)) {
                        j = bLiveGuardAnchorRankInfo.heartbeatGuardNums;
                        c18528a.f135105b = w8u.m202217t(R$string.f46694G5);
                        c18528a.f135111h = i3c0.f111225y;
                        c18528a.f135112i = i3c0.f110640A2;
                        c18528a.f135115l = i3c0.f110712G2;
                        c18528a.f135116m = i3c0.f110724H2;
                        c18528a.f135117n = Color.parseColor("#3253e1");
                        c18528a.f135118o = Color.parseColor("#993353dd");
                        c18528a.f135119p = i3c0.f111213x;
                        c18528a.f135120q = "#993353dd";
                        c18528a.f135121r = "#e0edff";
                    } else if (mpw.C18528a.m155838a(bLiveKnightsRuleInfoItem.guardType)) {
                        j = bLiveGuardAnchorRankInfo.cherishGuardNums;
                        c18528a.f135105b = w8u.m202217t(R$string.f46716H5);
                        c18528a.f135111h = i3c0.f110757K;
                        c18528a.f135112i = i3c0.f111240z2;
                        c18528a.f135115l = i3c0.f110652B2;
                        c18528a.f135116m = i3c0.f110664C2;
                        c18528a.f135117n = Color.parseColor("#9f00d1");
                        c18528a.f135118o = Color.parseColor("#999f00d1");
                        c18528a.f135119p = i3c0.f110733I;
                        c18528a.f135120q = "#999f00d1";
                        c18528a.f135121r = "#f3e0ff";
                    } else {
                        j = 0;
                    }
                    c18528a.f135122s = m171168k(iskVar.m138025q4(bLiveKnightsRuleInfoItem.guardType), c18528a.f135109f);
                    c18528a.f135108e = m171165h(bLiveKnightsRuleInfoItem.guardType, c18528a.f135109f, c18528a.f135110g);
                    c18528a.f135114k = iskVar.m138027s4(bLiveKnightsRuleInfoItem.guardType);
                    if (c18528a.f135109f) {
                        c18528a.f135106c = w8u.m202218u(R$string.f47104Zb, Integer.valueOf(m171173p(iskVar.m138017i4(bLiveKnightsRuleInfoItem.guardType))));
                    }
                    c18528a.f135107d = w8u.m202219v(R$string.f46804L5, Long.valueOf(j), Integer.valueOf(bLiveKnightsRuleInfoItem.guardPrivileges.size()));
                    c18528a.f135113j = m171166i(bLiveKnightsRuleInfoItem);
                    arrayList.add(c18528a);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static int m171170m(double d) {
        return (int) Math.ceil((((double) (mqi0.m155944o() / 1000.0f)) - d) / 3600.0d);
    }

    /* JADX INFO: renamed from: n */
    public static String m171171n(long j) {
        return j > 100 ? "100+" : String.valueOf(j);
    }

    @StringRes
    /* JADX INFO: renamed from: o */
    public static int m171172o(BLiveGuardType bLiveGuardType, boolean z) {
        if (z) {
            return mpw.C18528a.m155839b(bLiveGuardType) ? R$string.f47580v5 : R$string.f47558u5;
        }
        return mpw.C18528a.m155839b(bLiveGuardType) ? R$string.f47624x5 : R$string.f47602w5;
    }

    /* JADX INFO: renamed from: p */
    public static int m171173p(double d) {
        return (int) Math.ceil(((d - ((double) (mqi0.m155944o() / 1000.0f))) - 100.0d) / 86400.0d);
    }

    /* JADX INFO: renamed from: q */
    public static SpannableString m171174q(String str, String str2) {
        return m171175r(str, str2, h1c0.f105305E0);
    }

    /* JADX INFO: renamed from: r */
    public static SpannableString m171175r(String str, String str2, @ColorRes int i) {
        int iIndexOf = str.indexOf(str2);
        SpannableString spannableString = new SpannableString(str);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(ypv.f199497e.getResources().getColor(i)), iIndexOf, str2.length() + iIndexOf, 18);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m171176s(double d) {
        return (((double) (((float) mqi0.m155944o()) / 1000.0f)) - d) / 3600.0d <= 24.0d;
    }

    /* JADX INFO: renamed from: t */
    public static void m171177t(BLiveGuardboardRecord bLiveGuardboardRecord, String str) {
        zcu.m218093h(h7d0.m129655x().m129679r(bLiveGuardboardRecord.liveId).m129668g(bLiveGuardboardRecord.userId).m129682u(bLiveGuardboardRecord.liveStates.toString()).m129674m(String.valueOf(bLiveGuardboardRecord.rank)).m129684w("e_guardboard").m129662a(), str);
    }
}
