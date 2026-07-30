package com.p046p1.mobile.putong.core.p053ui.banner;

import android.view.View;
import com.tencent.liteav.audio.TXEAudioDef;
import java.util.ArrayList;
import java.util.Locale;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class BannerUrlLoader {

    /* JADX INFO: renamed from: a */
    public static ArrayList<Integer> f28475a = vwb.m200324f0(180, 480, 720, Integer.valueOf(TXEAudioDef.TXE_OPUS_SAMPLE_NUM));

    /* JADX INFO: renamed from: b */
    public static int f28476b = 0;

    /* JADX INFO: renamed from: c */
    public static int f28477c = 0;

    public enum BannerType {
        drawer,
        moment
    }

    /* JADX INFO: renamed from: a */
    public static int m44333a(int i) {
        int iIntValue = 0;
        for (Integer num : f28475a) {
            if (num.intValue() >= i) {
                if (num.intValue() - i > i - iIntValue) {
                    break;
                }
                return num.intValue();
            }
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: b */
    public static String m44334b(String str, BannerType bannerType, View view) {
        return str + String.format(Locale.US, "?format=max_%dxX", Integer.valueOf(m44335c(bannerType, view)));
    }

    /* JADX INFO: renamed from: c */
    public static int m44335c(BannerType bannerType, View view) {
        if (view == null || view.getWidth() <= 0) {
            return 720;
        }
        if (bannerType == BannerType.drawer) {
            if (f28476b <= 0) {
                f28476b = m44333a(view.getWidth());
            }
            return f28476b;
        }
        if (f28477c <= 0) {
            f28477c = m44333a(view.getWidth());
        }
        return f28477c;
    }
}
