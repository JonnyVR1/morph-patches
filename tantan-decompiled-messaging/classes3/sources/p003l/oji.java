package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class oji {
    /* JADX INFO: renamed from: a */
    public static String m6714a() {
        return "vec4 blendBaseAlpha(vec4 Cb, vec4 Cs, vec4 B) {\n   vec4 Cr = vec4((1.0 - Cb.a) * Cs.rgb + Cb.a * clamp(B.rgb, 0.0, 1.0), Cs.a);\n   return normalBlend(Cb, Cr);\n}\n";
    }

    /* JADX INFO: renamed from: b */
    public static String m6715b(boolean z) {
        return z ? m6716c() : m6717d();
    }

    /* JADX INFO: renamed from: c */
    private static String m6716c() {
        return "vec4 normalBlend(vec4 Cb, vec4 Cs) {\n   vec4 dst = premultiply(Cb);\n   vec4 src = premultiply(Cs);\n   return unpremultiply(src + dst * (1.0 - src.a));\n}\n";
    }

    /* JADX INFO: renamed from: d */
    private static String m6717d() {
        return "vec4 normalBlend(vec4 Cb, vec4 Cs) {\n   vec4 dst = Cb;\n   vec4 src = Cs;\n   return src + dst * (1.0 - src.a);\n}\n";
    }

    /* JADX INFO: renamed from: e */
    public static String m6718e() {
        return "vec4 premultiply(vec4 s) {\n   return vec4(s.rgb * s.a, s.a);\n}\n";
    }

    /* JADX INFO: renamed from: f */
    public static String m6719f() {
        return "vec4 screenBlend(vec4 Cb, vec4 Cs) {\n    vec4 White = vec4(1.0);\n    vec4 B = White - ((White - Cs) * (White - Cb));\n    return blendBaseAlpha(Cb, Cs, B);\n}\n";
    }

    /* JADX INFO: renamed from: g */
    public static String m6720g() {
        return "vec4 unpremultiply(vec4 s) {\n   return vec4(s.rgb / max(s.a, 0.00001), s.a);\n}\n";
    }
}
