package com.p051p1.mobile.putong.core.p058ui.banner;

import android.view.View;
import com.tencent.liteav.audio.TXEAudioDef;
import java.util.ArrayList;
import java.util.Locale;
import p153l.jyb;

/* JADX INFO: loaded from: classes9.dex */
public class BannerUrlLoader {

    /* JADX INFO: renamed from: a */
    public static ArrayList<Integer> f29323a = jyb.m147507f0(180, 480, 720, Integer.valueOf(TXEAudioDef.TXE_OPUS_SAMPLE_NUM));

    /* JADX INFO: renamed from: b */
    public static int f29324b = 0;

    /* JADX INFO: renamed from: c */
    public static int f29325c = 0;

    public enum BannerType {
        drawer,
        moment
    }

    /* JADX INFO: renamed from: a */
    public static int m45516a(int i) {
        int iIntValue = 0;
        for (Integer num : f29323a) {
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
    public static String m45517b(String str, BannerType bannerType, View view) {
        return str + String.format(Locale.US, "?format=max_%dxX", Integer.valueOf(m45518c(bannerType, view)));
    }

    /* JADX INFO: renamed from: c */
    public static int m45518c(BannerType bannerType, View view) {
        if (view == null || view.getWidth() <= 0) {
            return 720;
        }
        if (bannerType == BannerType.drawer) {
            if (f29324b <= 0) {
                f29324b = m45516a(view.getWidth());
            }
            return f29324b;
        }
        if (f29325c <= 0) {
            f29325c = m45516a(view.getWidth());
        }
        return f29325c;
    }
}
