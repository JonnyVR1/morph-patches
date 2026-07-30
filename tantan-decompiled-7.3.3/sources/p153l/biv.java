package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;

/* JADX INFO: loaded from: classes5.dex */
public class biv {
    /* JADX INFO: renamed from: a */
    public static String m104516a(int i, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        if (i == -1) {
            return bLiveAvatarFrameConfig.dynamicUrl;
        }
        if (i == 0) {
            if (!TextUtils.isEmpty(bLiveAvatarFrameConfig.smallDynamicUrl)) {
                return bLiveAvatarFrameConfig.smallDynamicUrl;
            }
            m104527l(bLiveAvatarFrameConfig.dynamicUrl);
            return bLiveAvatarFrameConfig.dynamicUrl;
        }
        if (i != 1) {
            return i == 2 ? bLiveAvatarFrameConfig.dynamicUrl : "";
        }
        if (!TextUtils.isEmpty(bLiveAvatarFrameConfig.mediumDynamicUrl)) {
            return bLiveAvatarFrameConfig.mediumDynamicUrl;
        }
        m104527l(bLiveAvatarFrameConfig.dynamicUrl);
        return bLiveAvatarFrameConfig.dynamicUrl;
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m104517b(CommonMaskAvatarView commonMaskAvatarView, int i, nsv<T> nsvVar, qcj<T, String> qcjVar) {
        m104520e(commonMaskAvatarView, i, nsvVar, true, qcjVar, -1);
    }

    /* JADX INFO: renamed from: c */
    public static <T> void m104518c(CommonMaskAvatarView commonMaskAvatarView, int i, nsv<T> nsvVar, qcj<T, String> qcjVar, int i2) {
        m104520e(commonMaskAvatarView, i, nsvVar, true, qcjVar, i2);
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m104519d(CommonMaskAvatarView commonMaskAvatarView, int i, nsv<T> nsvVar, boolean z, qcj<T, String> qcjVar) {
        m104520e(commonMaskAvatarView, i, nsvVar, z, qcjVar, -1);
    }

    /* JADX INFO: renamed from: e */
    public static <T> void m104520e(CommonMaskAvatarView commonMaskAvatarView, int i, nsv<T> nsvVar, boolean z, qcj<T, String> qcjVar, int i2) {
        if (l6o0.m153068c(nsvVar).m153072e()) {
            BLiveUserMask bLiveUserMask = l6o0.m153068c(nsvVar).f130275b;
            String strM104516a = bLiveUserMask.avatarConfig.frameConfig.dynamicUrl;
            if (vxr.m203876d().m170987L1()) {
                strM104516a = m104516a(i2, bLiveUserMask.avatarConfig.frameConfig);
            }
            m104523h(commonMaskAvatarView, i, bLiveUserMask.avatarResourceType, bLiveUserMask.avatar, bLiveUserMask.avatarConfig.frameConfig.staticUrl, strM104516a);
            return;
        }
        if (!e3t.m119319a(nsvVar).m119323e()) {
            m104522g(commonMaskAvatarView, i, qcjVar.call(nsvVar.f143542a), null, null);
            return;
        }
        BLiveUserMask bLiveUserMask2 = e3t.m119319a(nsvVar).f91997a;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask2.avatarConfig.frameConfig;
        if (vxr.m203876d().m170987L1()) {
            bLiveAvatarFrameConfig.dynamicUrl = m104516a(i2, bLiveAvatarFrameConfig);
        }
        String str = bLiveUserMask2.avatar;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig2 = bLiveUserMask2.avatarConfig.frameConfig;
        m104522g(commonMaskAvatarView, i, str, bLiveAvatarFrameConfig2.staticUrl, bLiveAvatarFrameConfig2.dynamicUrl);
    }

    /* JADX INFO: renamed from: f */
    public static void m104521f(@NonNull CommonMaskAvatarView commonMaskAvatarView, int i, @NonNull BLiveUserMask bLiveUserMask) {
        String str = bLiveUserMask.avatarResourceType;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask.avatarConfig.frameConfig;
        commonMaskAvatarView.m73310r0(i, str, bLiveAvatarFrameConfig.staticUrl, bLiveUserMask.avatar, bLiveAvatarFrameConfig.dynamicUrl);
    }

    /* JADX INFO: renamed from: g */
    public static void m104522g(@NonNull CommonMaskAvatarView commonMaskAvatarView, int i, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        m104523h(commonMaskAvatarView, i, null, str, str2, str3);
    }

    /* JADX INFO: renamed from: h */
    public static void m104523h(@NonNull CommonMaskAvatarView commonMaskAvatarView, int i, String str, @NonNull String str2, @Nullable String str3, @Nullable String str4) {
        commonMaskAvatarView.m73310r0(i, str, str3, str2, str4);
    }

    /* JADX INFO: renamed from: i */
    public static void m104524i(@NonNull CommonMedalView commonMedalView, int i, @NonNull String str, String str2) {
        commonMedalView.m74473m0(i, str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static void m104525j(@NonNull CommonMedalView commonMedalView, @NonNull String str, String str2) {
        commonMedalView.m74473m0(0, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m104526k(@NonNull CommonMaskAvatarView commonMaskAvatarView, int i, @NonNull BLiveUserMask bLiveUserMask) {
        if (bLiveUserMask != null) {
            commonMaskAvatarView.m73310r0(i, bLiveUserMask.avatarResourceType, "", bLiveUserMask.avatar, "");
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m104527l(String str) {
        TextUtils.isEmpty(str);
    }
}
