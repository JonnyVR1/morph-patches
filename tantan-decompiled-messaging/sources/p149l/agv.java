package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;

/* JADX INFO: loaded from: classes5.dex */
public class agv {
    /* JADX INFO: renamed from: a */
    public static String m96343a(int i, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        if (i == -1) {
            return bLiveAvatarFrameConfig.dynamicUrl;
        }
        if (i == 0) {
            if (!TextUtils.isEmpty(bLiveAvatarFrameConfig.smallDynamicUrl)) {
                return bLiveAvatarFrameConfig.smallDynamicUrl;
            }
            m96354l(bLiveAvatarFrameConfig.dynamicUrl);
            return bLiveAvatarFrameConfig.dynamicUrl;
        }
        if (i != 1) {
            return i == 2 ? bLiveAvatarFrameConfig.dynamicUrl : "";
        }
        if (!TextUtils.isEmpty(bLiveAvatarFrameConfig.mediumDynamicUrl)) {
            return bLiveAvatarFrameConfig.mediumDynamicUrl;
        }
        m96354l(bLiveAvatarFrameConfig.dynamicUrl);
        return bLiveAvatarFrameConfig.dynamicUrl;
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m96344b(CommonMaskAvatarView commonMaskAvatarView, int i, mqv<T> mqvVar, w9j<T, String> w9jVar) {
        m96347e(commonMaskAvatarView, i, mqvVar, true, w9jVar, -1);
    }

    /* JADX INFO: renamed from: c */
    public static <T> void m96345c(CommonMaskAvatarView commonMaskAvatarView, int i, mqv<T> mqvVar, w9j<T, String> w9jVar, int i2) {
        m96347e(commonMaskAvatarView, i, mqvVar, true, w9jVar, i2);
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m96346d(CommonMaskAvatarView commonMaskAvatarView, int i, mqv<T> mqvVar, boolean z, w9j<T, String> w9jVar) {
        m96347e(commonMaskAvatarView, i, mqvVar, z, w9jVar, -1);
    }

    /* JADX INFO: renamed from: e */
    public static <T> void m96347e(CommonMaskAvatarView commonMaskAvatarView, int i, mqv<T> mqvVar, boolean z, w9j<T, String> w9jVar, int i2) {
        if (hxn0.m133350c(mqvVar).m133354e()) {
            BLiveUserMask bLiveUserMask = hxn0.m133350c(mqvVar).f109896b;
            String strM96343a = bLiveUserMask.avatarConfig.frameConfig.dynamicUrl;
            if (uvr.m196087d().m162680L1()) {
                strM96343a = m96343a(i2, bLiveUserMask.avatarConfig.frameConfig);
            }
            m96350h(commonMaskAvatarView, i, bLiveUserMask.avatarResourceType, bLiveUserMask.avatar, bLiveUserMask.avatarConfig.frameConfig.staticUrl, strM96343a);
            return;
        }
        if (!d1t.m109678a(mqvVar).m109682e()) {
            m96349g(commonMaskAvatarView, i, w9jVar.call(mqvVar.f135304a), null, null);
            return;
        }
        BLiveUserMask bLiveUserMask2 = d1t.m109678a(mqvVar).f83297a;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask2.avatarConfig.frameConfig;
        if (uvr.m196087d().m162680L1()) {
            bLiveAvatarFrameConfig.dynamicUrl = m96343a(i2, bLiveAvatarFrameConfig);
        }
        String str = bLiveUserMask2.avatar;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig2 = bLiveUserMask2.avatarConfig.frameConfig;
        m96349g(commonMaskAvatarView, i, str, bLiveAvatarFrameConfig2.staticUrl, bLiveAvatarFrameConfig2.dynamicUrl);
    }

    /* JADX INFO: renamed from: f */
    public static void m96348f(@NonNull CommonMaskAvatarView commonMaskAvatarView, int i, @NonNull BLiveUserMask bLiveUserMask) {
        String str = bLiveUserMask.avatarResourceType;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask.avatarConfig.frameConfig;
        commonMaskAvatarView.m72127r0(i, str, bLiveAvatarFrameConfig.staticUrl, bLiveUserMask.avatar, bLiveAvatarFrameConfig.dynamicUrl);
    }

    /* JADX INFO: renamed from: g */
    public static void m96349g(@NonNull CommonMaskAvatarView commonMaskAvatarView, int i, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        m96350h(commonMaskAvatarView, i, null, str, str2, str3);
    }

    /* JADX INFO: renamed from: h */
    public static void m96350h(@NonNull CommonMaskAvatarView commonMaskAvatarView, int i, String str, @NonNull String str2, @Nullable String str3, @Nullable String str4) {
        commonMaskAvatarView.m72127r0(i, str, str3, str2, str4);
    }

    /* JADX INFO: renamed from: i */
    public static void m96351i(@NonNull CommonMedalView commonMedalView, int i, @NonNull String str, String str2) {
        commonMedalView.m73290m0(i, str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static void m96352j(@NonNull CommonMedalView commonMedalView, @NonNull String str, String str2) {
        commonMedalView.m73290m0(0, str, str2);
    }

    /* JADX INFO: renamed from: k */
    public static void m96353k(@NonNull CommonMaskAvatarView commonMaskAvatarView, int i, @NonNull BLiveUserMask bLiveUserMask) {
        if (bLiveUserMask != null) {
            commonMaskAvatarView.m72127r0(i, bLiveUserMask.avatarResourceType, "", bLiveUserMask.avatar, "");
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m96354l(String str) {
        TextUtils.isEmpty(str);
    }
}
