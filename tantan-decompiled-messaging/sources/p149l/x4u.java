package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareNearByConfig;
import com.p046p1.mobile.putong.live.external.internal.live.square.featuredExp.LiveSquareFrag;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.tantanapp.common.utils.CrashHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class x4u {

    /* JADX INFO: renamed from: a */
    public static int f191061a = 30;

    /* JADX INFO: renamed from: b */
    public static final int f191062b = t100.f167256e;

    /* JADX INFO: renamed from: c */
    public static final SimpleDateFormat f191063c;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        f191063c = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m207016b() {
        i4t i4tVar = s9s.f163232f;
        if (i4tVar == null) {
            return false;
        }
        long jM134376i = i4tVar.m134376i();
        return jM134376i != 0 && mqi0.m155944o() >= qqi0.m175935c(jM134376i + 86400000);
    }

    /* JADX INFO: renamed from: c */
    public static void m207017c(FragmentManager fragmentManager) {
        if (uvr.m196087d().m162721v0()) {
            try {
                List<Fragment> listM2589t0 = fragmentManager.m2589t0();
                gkh0.m126627j("[live][square]", "开始检查是否已存在squareFragment >>>>>>>>>>>>>");
                if (vwb.m200296J(listM2589t0)) {
                    gkh0.m126627j("[live][square]", "并不存在 ，检查结束 >>>>>>>>>>");
                    return;
                }
                gkh0.m126627j("[live][square]", "存在squareFragment 开始移除");
                AbstractC0427k abstractC0427kM2567m = fragmentManager.m2567m();
                for (Fragment fragment : listM2589t0) {
                    if (fragment != null) {
                        abstractC0427kM2567m.mo2715r(fragment);
                    }
                }
                abstractC0427kM2567m.mo2710l();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m207018d(Collection<T> collection, Collection<T> collection2, final w9j<T, String> w9jVar) {
        final ArrayList arrayListM200303Q = vwb.m200303Q(collection, w9jVar);
        collection.addAll(vwb.m200339n(collection2, new w9j() { // from class: l.w4u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!arrayListM200303Q.contains(w9jVar.call(obj)));
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static BLiveConfig m207019e() {
        BLiveSettings bLiveSettingsM195583A3 = s9s.f163228b.m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return null;
        }
        return bLiveSettingsM195583A3.liveConfig;
    }

    /* JADX INFO: renamed from: f */
    public static String m207020f(long j) {
        Date date = new Date(j);
        long time = new Date(qib0.f154693H.guessedCurrentServerTime()).getTime() - date.getTime();
        return time < 86400000 ? s9s.f163227a.getString(R$string.f44224z, f191063c.format(date)) : s9s.f163227a.getString(R$string.f44092A, Long.valueOf(time / 86400000));
    }

    /* JADX INFO: renamed from: g */
    public static String m207021g(double d) {
        BLiveConfig bLiveConfigM207019e = m207019e();
        if (bLiveConfigM207019e == null) {
            return "";
        }
        BLiveSquareNearByConfig bLiveSquareNearByConfig = bLiveConfigM207019e.square.nearby;
        return bLiveSquareNearByConfig.showMemberCount ? String.format(bLiveSquareNearByConfig.showMemberText, i0g0.m133882v(d)) : "";
    }

    /* JADX INFO: renamed from: h */
    public static int m207022h(int i) {
        int i2 = f191062b * 2;
        return i <= 0 ? xdl0.m208412y0() - i2 : ((xdl0.m208412y0() - ((i + 1) * i2)) / i) + i2;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m207023i(@NonNull User user) {
        Location location = user.location;
        int i = location.distance;
        if (i < 100000) {
            return i0g0.m133876p(i, false);
        }
        boolean zIsEmpty = TextUtils.isEmpty(location.region.city);
        Location location2 = user.location;
        return !zIsEmpty ? location2.region.city : location2.region.country;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m207024j(@Nullable mtn mtnVar) {
        Pagination paginationM156319k;
        return (mtnVar == null || mtnVar.m156317i() == null || vwb.m200296J(mtnVar.m156317i()) || (paginationM156319k = mtnVar.m156319k()) == null || TextUtils.isEmpty(paginationM156319k.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m207025k(@Nullable qrr qrrVar) {
        Pagination paginationM176117k;
        return (qrrVar == null || qrrVar.m176115i() == null || vwb.m200296J(qrrVar.m176115i()) || (paginationM176117k = qrrVar.m176117k()) == null || TextUtils.isEmpty(paginationM176117k.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m207026l(String str) {
        return TextUtils.equals(str, "fakePlayground");
    }

    /* JADX INFO: renamed from: m */
    public static boolean m207027m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "square-intlGame".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m207028n(String str) {
        return (TextUtils.isEmpty(str) || m207035u(str) || TextUtils.equals(str, "videoChat") || "fakeLiveSquare".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m207029o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !m207035u(str);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m207030p(@NonNull BLiveAbsData bLiveAbsData) {
        return (bLiveAbsData instanceof BLive) && ((BLive) bLiveAbsData).isMultiCall();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m207031q(@NonNull String str) {
        return "onlive".equals(str);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m207032r(@NonNull BLiveAbsData bLiveAbsData) {
        return TEnum.equals(bLiveAbsData.state, "onlive") || TEnum.equals(bLiveAbsData.state, "suspended");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m207033s(String str) {
        return TextUtils.equals(str, "videoChat");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m207034t() {
        return s9s.f163228b.m195826e7();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m207035u(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("voice") || TextUtils.equals(str, BLiveAbsData.VOICE_LIVE) || TextUtils.equals(str, "tab_voice");
    }

    /* JADX INFO: renamed from: v */
    public static void m207036v(View view, boolean z) {
        if (z) {
            view.findViewById(d5c0.f84519w0).setVisibility(0);
            view.findViewById(d5c0.f84453X0).setVisibility(8);
        } else {
            view.findViewById(d5c0.f84519w0).setVisibility(8);
            view.findViewById(d5c0.f84453X0).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m207037w(Context context) {
        m207038x(context, new Bundle());
    }

    /* JADX INFO: renamed from: x */
    public static void m207038x(Context context, Bundle bundle) {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        if (c4299rForeground_ == null || c4299rForeground_.f15343a == null) {
            return;
        }
        Activity activity = Act.foreground_().f15343a.get();
        if (activity instanceof LiveIndependentSettingAct) {
            LiveIndependentSettingAct liveIndependentSettingAct = (LiveIndependentSettingAct) activity;
            if (TextUtils.equals(liveIndependentSettingAct.f46166c, "live_video_square_page")) {
                Fragment fragmentM2557i0 = liveIndependentSettingAct.getSupportFragmentManager().m2557i0("live_video_square_page");
                if (fragmentM2557i0 instanceof LiveSquareFrag) {
                    ((LiveSquareFrag) fragmentM2557i0).m69031R4(bundle);
                    return;
                }
                return;
            }
        }
        context.startActivity(LiveIndependentSettingAct.m70699Y1(context, "live_video_square_page", bundle));
    }
}
