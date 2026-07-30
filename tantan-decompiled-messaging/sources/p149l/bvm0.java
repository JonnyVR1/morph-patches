package p149l;

import android.graphics.Color;

/* JADX INFO: loaded from: classes13.dex */
public class bvm0 {

    /* JADX INFO: renamed from: a */
    public static final j760<String, String>[] f77474a = {new j760("#fff5eb", "#fff9f3"), new j760("#ecf0ff", "#f2f5ff"), new j760("#e6faff", "#f2feff"), new j760("#f8edff", "#f5f2ff"), new j760("#ffeadf", "#fff8ed")};

    /* JADX INFO: renamed from: b */
    public static final j760<String, String>[] f77475b = {new j760("#354959", "#2d3e4b"), new j760("#554f59", "#554f59"), new j760("#26455e", "#2a4762"), new j760("#324e56", "#33494e"), new j760("#3e5a54", "#3d5d52"), new j760("#333c55", "#292d3a")};

    /* JADX INFO: renamed from: c */
    public static final int[] f77476c = {g3c0.f100430m0, g3c0.f100434o0, g3c0.f100432n0, g3c0.f100428l0, g3c0.f100426k0};

    /* JADX INFO: renamed from: d */
    public static final String[] f77477d = {"#f6e7d7", "#dae0f7", "#cbe9f0", "#eddcf7"};

    /* JADX INFO: renamed from: e */
    public static final String[] f77478e = {"#dcc0a1", "#b3bee6", "#a1d1dc", "#dcc1eb"};

    /* JADX INFO: renamed from: a */
    public static j760<String, String> m104058a(int i) {
        j760<String, String>[] j760VarArr = f77475b;
        return i > j760VarArr.length ? j760VarArr[0] : j760VarArr[i - 1];
    }

    /* JADX INFO: renamed from: b */
    public static j760<String, String> m104059b(int i) {
        j760<String, String>[] j760VarArr = f77474a;
        return i >= j760VarArr.length ? j760VarArr[0] : j760VarArr[i];
    }

    /* JADX INFO: renamed from: c */
    public static int m104060c(int i) {
        String[] strArr = f77477d;
        return i >= strArr.length ? Color.parseColor(strArr[0]) : Color.parseColor(strArr[i]);
    }

    /* JADX INFO: renamed from: d */
    public static int m104061d(int i) {
        String[] strArr = f77478e;
        return i >= strArr.length ? Color.parseColor(strArr[0]) : Color.parseColor(strArr[i]);
    }
}
