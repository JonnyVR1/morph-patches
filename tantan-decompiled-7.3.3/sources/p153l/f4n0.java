package p153l;

import android.graphics.Color;

/* JADX INFO: loaded from: classes13.dex */
public class f4n0 {

    /* JADX INFO: renamed from: a */
    public static final pf60<String, String>[] f97117a = {new pf60("#fff5eb", "#fff9f3"), new pf60("#ecf0ff", "#f2f5ff"), new pf60("#e6faff", "#f2feff"), new pf60("#f8edff", "#f5f2ff"), new pf60("#ffeadf", "#fff8ed")};

    /* JADX INFO: renamed from: b */
    public static final pf60<String, String>[] f97118b = {new pf60("#354959", "#2d3e4b"), new pf60("#554f59", "#554f59"), new pf60("#26455e", "#2a4762"), new pf60("#324e56", "#33494e"), new pf60("#3e5a54", "#3d5d52"), new pf60("#333c55", "#292d3a")};

    /* JADX INFO: renamed from: c */
    public static final int[] f97119c = {mbc0.f135692m0, mbc0.f135696o0, mbc0.f135694n0, mbc0.f135690l0, mbc0.f135688k0};

    /* JADX INFO: renamed from: d */
    public static final String[] f97120d = {"#f6e7d7", "#dae0f7", "#cbe9f0", "#eddcf7"};

    /* JADX INFO: renamed from: e */
    public static final String[] f97121e = {"#dcc0a1", "#b3bee6", "#a1d1dc", "#dcc1eb"};

    /* JADX INFO: renamed from: a */
    public static pf60<String, String> m124013a(int i) {
        pf60<String, String>[] pf60VarArr = f97118b;
        return i > pf60VarArr.length ? pf60VarArr[0] : pf60VarArr[i - 1];
    }

    /* JADX INFO: renamed from: b */
    public static pf60<String, String> m124014b(int i) {
        pf60<String, String>[] pf60VarArr = f97117a;
        return i >= pf60VarArr.length ? pf60VarArr[0] : pf60VarArr[i];
    }

    /* JADX INFO: renamed from: c */
    public static int m124015c(int i) {
        String[] strArr = f97120d;
        return i >= strArr.length ? Color.parseColor(strArr[0]) : Color.parseColor(strArr[i]);
    }

    /* JADX INFO: renamed from: d */
    public static int m124016d(int i) {
        String[] strArr = f97121e;
        return i >= strArr.length ? Color.parseColor(strArr[0]) : Color.parseColor(strArr[i]);
    }
}
