package com.p046p1.mobile.putong.feed.helper.audioplayer;

import android.text.TextUtils;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p149l.lsi0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAudioCanWorkControl {

    /* JADX INFO: renamed from: a */
    public static Map<TanTanAudioPlayType, String> f39254a = new HashMap<TanTanAudioPlayType, String>() { // from class: com.p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl.1
        {
            put(TanTanAudioPlayType.VOICE_CALL, FeedModule.f38852a.getString(R$string.f39186z2));
        }
    };

    /* JADX INFO: renamed from: b */
    public static Map<TanTanAudioPlayType, String> f39255b = new HashMap<TanTanAudioPlayType, String>() { // from class: com.p1.mobile.putong.feed.helper.audioplayer.FeedAudioCanWorkControl.2
        {
            put(TanTanAudioPlayType.VOICE_CALL, FeedModule.f38852a.getString(R$string.f38965R1));
        }
    };

    public enum TanTanAudioPlayType {
        MONET_VOICE,
        VOICE_CALL
    }

    /* JADX INFO: renamed from: a */
    public static boolean m60918a() {
        TanTanAudioPlayType tanTanAudioPlayTypeM60920c = m60920c();
        if (!NullChecker.m81303a(tanTanAudioPlayTypeM60920c)) {
            return true;
        }
        String str = f39254a.get(tanTanAudioPlayTypeM60920c);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        lsi0.m151580j(str);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m60919b() {
        TanTanAudioPlayType tanTanAudioPlayTypeM60920c = m60920c();
        if (!NullChecker.m81303a(tanTanAudioPlayTypeM60920c)) {
            return true;
        }
        String str = f39255b.get(tanTanAudioPlayTypeM60920c);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        lsi0.m151580j(str);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static TanTanAudioPlayType m60920c() {
        if (FeedModule.m60222H().mo30722Qf()) {
            return TanTanAudioPlayType.VOICE_CALL;
        }
        return null;
    }
}
