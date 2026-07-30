package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareNearByConfig;
import com.p051p1.mobile.putong.live.external.internal.live.square.featuredExp.LiveSquareFrag;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.tantanapp.common.utils.CrashHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class y6u {

    /* JADX INFO: renamed from: a */
    public static int f197714a = 30;

    /* JADX INFO: renamed from: b */
    public static final int f197715b = qa00.f156318e;

    /* JADX INFO: renamed from: c */
    public static final SimpleDateFormat f197716c;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        f197716c = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m214498b() {
        j6t j6tVar = tbs.f172993f;
        if (j6tVar == null) {
            return false;
        }
        long jM143707i = j6tVar.m143707i();
        return jM143707i != 0 && pzi0.m174454o() >= tzi0.m193665c(jM143707i + 86400000);
    }

    /* JADX INFO: renamed from: c */
    public static void m214499c(FragmentManager fragmentManager) {
        if (vxr.m203876d().m171028v0()) {
            try {
                List<Fragment> listM2590t0 = fragmentManager.m2590t0();
                nsh0.m164608j("[live][square]", "开始检查是否已存在squareFragment >>>>>>>>>>>>>");
                if (jyb.m147479J(listM2590t0)) {
                    nsh0.m164608j("[live][square]", "并不存在 ，检查结束 >>>>>>>>>>");
                    return;
                }
                nsh0.m164608j("[live][square]", "存在squareFragment 开始移除");
                AbstractC0428k abstractC0428kM2568m = fragmentManager.m2568m();
                for (Fragment fragment : listM2590t0) {
                    if (fragment != null) {
                        abstractC0428kM2568m.mo2716r(fragment);
                    }
                }
                abstractC0428kM2568m.mo2711l();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m214500d(Collection<T> collection, Collection<T> collection2, final qcj<T, String> qcjVar) {
        final ArrayList arrayListM147486Q = jyb.m147486Q(collection, qcjVar);
        collection.addAll(jyb.m147522n(collection2, new qcj() { // from class: l.x6u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayListM147486Q.contains(qcjVar.call(obj)));
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static BLiveConfig m214501e() {
        BLiveSettings bLiveSettingsM203370A3 = tbs.f172989b.m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return null;
        }
        return bLiveSettingsM203370A3.liveConfig;
    }

    /* JADX INFO: renamed from: f */
    public static String m214502f(long j) {
        Date date = new Date(j);
        long time = new Date(uqb0.f180376H.guessedCurrentServerTime()).getTime() - date.getTime();
        return time < 86400000 ? tbs.f172988a.getString(R$string.f45072z, f197716c.format(date)) : tbs.f172988a.getString(R$string.f44940A, Long.valueOf(time / 86400000));
    }

    /* JADX INFO: renamed from: g */
    public static String m214503g(double d) {
        BLiveConfig bLiveConfigM214501e = m214501e();
        if (bLiveConfigM214501e == null) {
            return "";
        }
        BLiveSquareNearByConfig bLiveSquareNearByConfig = bLiveConfigM214501e.square.nearby;
        return bLiveSquareNearByConfig.showMemberCount ? String.format(bLiveSquareNearByConfig.showMemberText, q8g0.m175817v(d)) : "";
    }

    /* JADX INFO: renamed from: h */
    public static int m214504h(int i) {
        int i2 = f197715b * 2;
        return i <= 0 ? bnl0.m105592y0() - i2 : ((bnl0.m105592y0() - ((i + 1) * i2)) / i) + i2;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m214505i(@NonNull User user) {
        Location location = user.location;
        int i = location.distance;
        if (i < 100000) {
            return q8g0.m175811p(i, false);
        }
        boolean zIsEmpty = TextUtils.isEmpty(location.region.city);
        Location location2 = user.location;
        return !zIsEmpty ? location2.region.city : location2.region.country;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m214506j(@Nullable mvn mvnVar) {
        Pagination paginationM160291k;
        return (mvnVar == null || mvnVar.m160289i() == null || jyb.m147479J(mvnVar.m160289i()) || (paginationM160291k = mvnVar.m160291k()) == null || TextUtils.isEmpty(paginationM160291k.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m214507k(@Nullable rtr rtrVar) {
        Pagination paginationM183151k;
        return (rtrVar == null || rtrVar.m183149i() == null || jyb.m147479J(rtrVar.m183149i()) || (paginationM183151k = rtrVar.m183151k()) == null || TextUtils.isEmpty(paginationM183151k.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m214508l(String str) {
        return TextUtils.equals(str, "fakePlayground");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m214509m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "square-intlGame".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m214510n(String str) {
        return (TextUtils.isEmpty(str) || m214517u(str) || TextUtils.equals(str, "videoChat") || "fakeLiveSquare".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m214511o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !m214517u(str);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m214512p(@NonNull BLiveAbsData bLiveAbsData) {
        return (bLiveAbsData instanceof BLive) && ((BLive) bLiveAbsData).isMultiCall();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m214513q(@NonNull String str) {
        return "onlive".equals(str);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m214514r(@NonNull BLiveAbsData bLiveAbsData) {
        return TEnum.equals(bLiveAbsData.state, "onlive") || TEnum.equals(bLiveAbsData.state, "suspended");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m214515s(String str) {
        return TextUtils.equals(str, "videoChat");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m214516t() {
        return tbs.f172989b.m203613e7();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m214517u(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("voice") || TextUtils.equals(str, BLiveAbsData.VOICE_LIVE) || TextUtils.equals(str, "tab_voice");
    }

    /* JADX INFO: renamed from: v */
    public static void m214518v(View view, boolean z) {
        if (z) {
            view.findViewById(jdc0.f120237w0).setVisibility(0);
            view.findViewById(jdc0.f120171X0).setVisibility(8);
        } else {
            view.findViewById(jdc0.f120237w0).setVisibility(8);
            view.findViewById(jdc0.f120171X0).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m214519w(Context context) {
        m214520x(context, new Bundle());
    }

    /* JADX INFO: renamed from: x */
    public static void m214520x(Context context, Bundle bundle) {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (c4450rForeground_ == null || c4450rForeground_.f16062a == null) {
            return;
        }
        Activity activity = Act.foreground_().f16062a.get();
        if (activity instanceof LiveIndependentSettingAct) {
            LiveIndependentSettingAct liveIndependentSettingAct = (LiveIndependentSettingAct) activity;
            if (TextUtils.equals(liveIndependentSettingAct.f47014c, "live_video_square_page")) {
                Fragment fragmentM2558i0 = liveIndependentSettingAct.getSupportFragmentManager().m2558i0("live_video_square_page");
                if (fragmentM2558i0 instanceof LiveSquareFrag) {
                    ((LiveSquareFrag) fragmentM2558i0).m70214R4(bundle);
                    return;
                }
                return;
            }
        }
        context.startActivity(LiveIndependentSettingAct.m71882Z1(context, "live_video_square_page", bundle));
    }
}
