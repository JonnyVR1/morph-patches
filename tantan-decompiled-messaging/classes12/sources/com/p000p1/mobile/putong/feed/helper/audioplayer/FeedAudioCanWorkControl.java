package com.p000p1.mobile.putong.feed.helper.audioplayer;

import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.lsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAudioCanWorkControl {

    /* JADX INFO: renamed from: a */
    public static Map<TanTanAudioPlayType, String> f715a = new HashMap<TanTanAudioPlayType, String>() { // from class: com.p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl.1
        {
            put(TanTanAudioPlayType.VOICE_CALL, FeedModule.f313a.getString(R$string.f647z2));
        }
    };

    /* JADX INFO: renamed from: b */
    public static Map<TanTanAudioPlayType, String> f716b = new HashMap<TanTanAudioPlayType, String>() { // from class: com.p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl.2
        {
            put(TanTanAudioPlayType.VOICE_CALL, FeedModule.f313a.getString(R$string.f426R1));
        }
    };

    public enum TanTanAudioPlayType {
        MONET_VOICE,
        VOICE_CALL
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1844a() {
        TanTanAudioPlayType tanTanAudioPlayTypeM1846c = m1846c();
        if (!NullChecker.a(tanTanAudioPlayTypeM1846c)) {
            return true;
        }
        String str = f715a.get(tanTanAudioPlayTypeM1846c);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        lsi0.j(str);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1845b() {
        TanTanAudioPlayType tanTanAudioPlayTypeM1846c = m1846c();
        if (!NullChecker.a(tanTanAudioPlayTypeM1846c)) {
            return true;
        }
        String str = f716b.get(tanTanAudioPlayTypeM1846c);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        lsi0.j(str);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static TanTanAudioPlayType m1846c() {
        if (FeedModule.m1140H().Qf()) {
            return TanTanAudioPlayType.VOICE_CALL;
        }
        return null;
    }
}
