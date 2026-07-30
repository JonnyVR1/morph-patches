package com.p051p1.mobile.putong.feed.helper.audioplayer;

import android.text.TextUtils;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p153l.o1j0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAudioCanWorkControl {

    /* JADX INFO: renamed from: a */
    public static Map<TanTanAudioPlayType, String> f40102a = new HashMap<TanTanAudioPlayType, String>() { // from class: com.p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl.1
        {
            put(TanTanAudioPlayType.VOICE_CALL, FeedModule.f39700a.getString(R$string.f40034z2));
        }
    };

    /* JADX INFO: renamed from: b */
    public static Map<TanTanAudioPlayType, String> f40103b = new HashMap<TanTanAudioPlayType, String>() { // from class: com.p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl.2
        {
            put(TanTanAudioPlayType.VOICE_CALL, FeedModule.f39700a.getString(R$string.f39813R1));
        }
    };

    public enum TanTanAudioPlayType {
        MONET_VOICE,
        VOICE_CALL
    }

    /* JADX INFO: renamed from: a */
    public static boolean m62102a() {
        TanTanAudioPlayType tanTanAudioPlayTypeM62104c = m62104c();
        if (!NullChecker.m82486a(tanTanAudioPlayTypeM62104c)) {
            return true;
        }
        String str = f40102a.get(tanTanAudioPlayTypeM62104c);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        o1j0.m165636j(str);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m62103b() {
        TanTanAudioPlayType tanTanAudioPlayTypeM62104c = m62104c();
        if (!NullChecker.m82486a(tanTanAudioPlayTypeM62104c)) {
            return true;
        }
        String str = f40103b.get(tanTanAudioPlayTypeM62104c);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        o1j0.m165636j(str);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static TanTanAudioPlayType m62104c() {
        if (FeedModule.m61406H().mo31725Qf()) {
            return TanTanAudioPlayType.VOICE_CALL;
        }
        return null;
    }
}
