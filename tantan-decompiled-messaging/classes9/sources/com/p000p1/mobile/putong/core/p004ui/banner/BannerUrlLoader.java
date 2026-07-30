package com.p000p1.mobile.putong.core.p004ui.banner;

import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class BannerUrlLoader {

    /* JADX INFO: renamed from: a */
    public static ArrayList<Integer> f4542a = vwb.f0(new Integer[]{180, 480, 720, 960});

    /* JADX INFO: renamed from: b */
    public static int f4543b = 0;

    /* JADX INFO: renamed from: c */
    public static int f4544c = 0;

    public enum BannerType {
        drawer,
        moment
    }

    /* JADX INFO: renamed from: a */
    public static int m7289a(int i) {
        int iIntValue = 0;
        for (Integer num : f4542a) {
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
    public static String m7290b(String str, BannerType bannerType, View view) {
        return str + String.format(Locale.US, "?format=max_%dxX", Integer.valueOf(m7291c(bannerType, view)));
    }

    /* JADX INFO: renamed from: c */
    public static int m7291c(BannerType bannerType, View view) {
        if (view == null || view.getWidth() <= 0) {
            return 720;
        }
        if (bannerType == BannerType.drawer) {
            if (f4543b <= 0) {
                f4543b = m7289a(view.getWidth());
            }
            return f4543b;
        }
        if (f4544c <= 0) {
            f4544c = m7289a(view.getWidth());
        }
        return f4544c;
    }
}
