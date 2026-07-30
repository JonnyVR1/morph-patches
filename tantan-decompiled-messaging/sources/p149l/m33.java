package p149l;

import android.text.TextUtils;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public class m33 {
    /* JADX INFO: renamed from: a */
    public static String m152809a() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color2.r * color1.a + color1.r * color2.a >= color2.a * color1.a) {\n     r = color2.a * color1.a + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.r + color1.r;\n   }\n   float g;\n   if (color2.g * color1.a + color1.g * color2.a >= color2.a * color1.a) {\n     g = color2.a * color1.a + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.g + color1.g;\n   }\n   float b;\n   if (color2.b * color1.a + color1.b * color2.a >= color2.a * color1.a) {\n     b = color2.a * color1.a + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.b + color1.b;\n   }\n   float a  = color2.a + color1.a - color2.a * color1.a;\n   gl_FragColor = vec4(r, g, b, a);\n}\n";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static String m152810b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2090723660:
                if (str.equals("LinearBurn")) {
                    b = 0;
                }
                break;
            case -1995604172:
                if (str.equals("Subtract")) {
                    b = 1;
                }
                break;
            case -1955878649:
                if (str.equals("Normal")) {
                    b = 2;
                }
                break;
            case -1823822708:
                if (str.equals("Screen")) {
                    b = 3;
                }
                break;
            case -1036907948:
                if (str.equals("ColorDodge")) {
                    b = 4;
                }
                break;
            case -793734080:
                if (str.equals("ColorDistortion")) {
                    b = 5;
                }
                break;
            case -604381778:
                if (str.equals("Exclusion")) {
                    b = 6;
                }
                break;
            case -573140643:
                if (str.equals("Difference")) {
                    b = 7;
                }
                break;
            case -310596686:
                if (str.equals("ColorBurn")) {
                    b = 8;
                }
                break;
            case -127279647:
                if (str.equals("Luminosity")) {
                    b = 9;
                }
                break;
            case -85951764:
                if (str.equals("SoftLight")) {
                    b = 10;
                }
                break;
            case 65665:
                if (str.equals("Add")) {
                    b = 11;
                }
                break;
            case 72920:
                if (str.equals("Hue")) {
                    b = 12;
                }
                break;
            case 2390796:
                if (str.equals("Mask")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 65290051:
                if (str.equals("Color")) {
                    b = 14;
                }
                break;
            case 474967308:
                if (str.equals("ScreenWithAlpha")) {
                    b = 15;
                }
                break;
            case 573365296:
                if (str.equals("Overlay")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 718473796:
                if (str.equals("Multiply")) {
                    b = 17;
                }
                break;
            case 881881007:
                if (str.equals("SourceOver")) {
                    b = 18;
                }
                break;
            case 1293713099:
                if (str.equals("HardLight")) {
                    b = 19;
                }
                break;
            case 1762973682:
                if (str.equals(j6f.TAG_SATURATION)) {
                    b = 20;
                }
                break;
            case 1835199519:
                if (str.equals("Lighten")) {
                    b = 21;
                }
                break;
            case 2039866047:
                if (str.equals("Darken")) {
                    b = 22;
                }
                break;
            case 2047371417:
                if (str.equals("Divide")) {
                    b = 23;
                }
                break;
        }
        switch (b) {
            case 0:
                return m152822n();
            case 1:
                return m152833y();
            case 2:
                return m152826r();
            case 3:
                return m152829u();
            case 4:
                return m152813e();
            case 5:
                return m152812d();
            case 6:
                return m152818j();
            case 7:
                return m152816h();
            case 8:
                return m152811c();
            case 9:
                return m152823o();
            case 10:
                return m152831w();
            case 11:
                return m152809a();
            case 12:
                return m152820l();
            case 13:
                return m152824p();
            case 14:
                return m152814f();
            case 15:
                return m152830v();
            case 16:
                return m152827s();
            case 17:
                return m152825q();
            case 18:
                return m152832x();
            case 19:
                return m152819k();
            case 20:
                return m152828t();
            case 21:
                return m152821m();
            case 22:
                return m152815g();
            case 23:
                return m152817i();
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m152811c() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 whiteColor = vec4(1.0);\n   gl_FragColor = whiteColor - (whiteColor - color1) / color2;\n}\n";
    }

    /* JADX INFO: renamed from: d */
    public static String m152812d() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\nvoid main() {\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   float multX = -0.59;\n   vec2 uvDist = textureCoordinate + ((color.rg + multX) * -0.12);\n   vec4 VertDist = texture2D(inputImageTexture1, uvDist) * intensity;\n   vec4 modColor = color * (VertDist + vec4(1.0));\n   vec4 color3 = modColor;\n   gl_FragColor = mix(color, color3, intensity);\n}\n";
    }

    /* JADX INFO: renamed from: e */
    public static String m152813e() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec3 baseOverlayAlphaProduct = vec3(color2.a * color1.a);\n   vec3 rightHandProduct = color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a);\n   vec3 firstBlendColor = baseOverlayAlphaProduct + rightHandProduct;\n   vec3 overlayRGB = clamp((color2.rgb / clamp(color2.a, 0.01, 1.0)) * step(0.0, color2.a), 0.0, 0.99);\n   vec3 secondBlendColor = (color1.rgb * color2.a) / (1.0 - overlayRGB) + rightHandProduct;\n   vec3 colorChoice = step((color2.rgb * color1.a + color1.rgb * color2.a), baseOverlayAlphaProduct);\n   gl_FragColor = vec4(mix(firstBlendColor, secondBlendColor, colorChoice), 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: f */
    public static String m152814f() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color2.rgb, lum(color1.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: g */
    public static String m152815g() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(min(color2.rgb * color1.a, color1.rgb * color2.a) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: h */
    public static String m152816h() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(abs(color2.rgb - color1.rgb), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: i */
    public static String m152817i() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color2.r == 0.0 || ((color1.r / color2.r) > (color1.a / color2.a))) {\n     r = color2.a * color1.a + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = (color1.r * color2.a * color2.a) / color2.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (color2.g == 0.0 || ((color1.g / color2.g) > (color1.a / color2.a))) {\n     g = color2.a * color1.a + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = (color1.g * color2.a * color2.a) / color2.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (color2.b == 0.0 || ((color1.b / color2.b) > (color1.a / color2.a))) {\n     b = color2.a * color1.a + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = (color1.b * color2.a * color2.a) / color2.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   float a  = color2.a + color1.a - color2.a * color1.a;\n   gl_FragColor = vec4(r, g, b, a);\n}\n";
    }

    /* JADX INFO: renamed from: j */
    public static String m152818j() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4((color2.rgb * color1.a + color1.rgb * color2.a - 2.0 * color2.rgb * color1.rgb) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: k */
    public static String m152819k() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nmediump vec4 unpremultiply(mediump vec4 s) {\n     return vec4(s.rgb/max(s.a,0.00001), s.a);\n }\n mediump vec4 premultiply(mediump vec4 s) {\n     return vec4(s.rgb * s.a, s.a);\n }\n mediump float overlaySingleChannel(mediump float b, mediump float s) {\n     return b < 0.5 ? (2.0 * s * b) : (1.0 - 2.0 * (1.0 - b) * (1.0 - s));\n }\n mediump vec4 normalBlend(mediump vec4 Cb, mediump vec4 Cs) {\n     mediump vec4 dst = premultiply(Cb);\n     mediump vec4 src = premultiply(Cs);\n     return unpremultiply(src + dst * (1.0 - src.a));\n }\n mediump vec4 blendBaseAlpha(mediump vec4 Cb, mediump vec4 Cs, mediump vec4 B) {\n     mediump vec4 Cr = vec4((1.0 - Cb.a) * Cs.rgb + Cb.a * clamp(B.rgb, 0.0,  1.0), Cs.a);\n     return normalBlend(Cb, Cr);\n }void main(){\n   vec4 Cs = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 Cb = texture2D(inputImageTexture1,textureCoordinate);\n   mediump vec4 B = vec4(overlaySingleChannel(Cb.r, Cs.r),overlaySingleChannel(Cb.g, Cs.g),overlaySingleChannel(Cb.b,Cs.b),Cs.a);\n   gl_FragColor = blendBaseAlpha(Cb, Cs, B);\n}\n";
    }

    /* JADX INFO: renamed from: l */
    public static String m152820l() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nlowp vec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nhighp float sat(lowp vec3 c) {\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     return x - n;\n}\nlowp float mid(lowp float cmin, lowp float cmid, lowp float cmax, highp float s) {\n     return ((cmid - cmin) * s) / (cmax - cmin);\n}\nlowp vec3 setsat(lowp vec3 c, highp float s) {\n     if (c.r > c.g) {\n         if (c.r > c.b) {\n             if (c.g > c.b) {\n                 c.g = mid(c.b, c.g, c.r, s);\n                 c.b = 0.0;\n             } else {\n                 c.b = mid(c.g, c.b, c.r, s);\n                 c.g = 0.0;\n             }\n             c.r = s;\n        } else {\n             c.r = mid(c.g, c.r, c.b, s);\n             c.b = s;\n             c.g = 0.0;\n         }\n     } else if (c.r > c.b) {\n         c.r = mid(c.b, c.r, c.g, s);\n         c.g = s;\n         c.b = 0.0;\n     } else if (c.g > c.b) {\n         c.b = mid(c.r, c.b, c.g, s);\n         c.g = s;\n         c.r = 0.0;\n     } else if (c.b > c.g) {\n         c.g = mid(c.r, c.g, c.b, s);\n         c.b = s;\n         c.r = 0.0;\n     } else {\n         c = vec3(0.0);\n     }\n     return c;\n}\nvoid main(){\n   highp vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   highp vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(setsat(color2.rgb, sat(color1.rgb)), lum(color1.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: m */
    public static String m152821m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = max(color1, color2);\n}\n";
    }

    /* JADX INFO: renamed from: n */
    public static String m152822n() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(clamp(color1.rgb + color2.rgb - vec3(1.0), vec3(0.0), vec3(1.0)), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: o */
    public static String m152823o() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color1.rgb, lum(color2.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: p */
    public static String m152824p() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float newAlpha = dot(color2.rgb, vec3(.33333334, .33333334, .33333334)) * color2.a;\n   gl_FragColor = vec4(color1.xyz, newAlpha);\n}\n";
    }

    /* JADX INFO: renamed from: q */
    public static String m152825q() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\n mediump vec4 unpremultiply(mediump vec4 s) {\n     return vec4(s.rgb/max(s.a,0.00001), s.a);\n }\n mediump vec4 premultiply(mediump vec4 s) {\n     return vec4(s.rgb * s.a, s.a);\n }\n mediump vec4 normalBlend(mediump vec4 Cb, mediump vec4 Cs) {\n     mediump vec4 dst = premultiply(Cb);\n     mediump vec4 src = premultiply(Cs);\n     return unpremultiply(src + dst * (1.0 - src.a));\n }\n mediump vec4 blendBaseAlpha(mediump vec4 Cb, mediump vec4 Cs, mediump vec4 B) {\n     mediump vec4 Cr = vec4((1.0 - Cb.a) * Cs.rgb + Cb.a * clamp(B.rgb, 0.0,  1.0), Cs.a);\n     return normalBlend(Cb, Cr);\n }void main(){\n   vec4 Cb = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 Cs = texture2D(inputImageTexture1,textureCoordinate);\n   lowp vec4 B = vec4(Cb.rgb * Cs.rgb, Cs.a);\n   gl_FragColor = blendBaseAlpha(Cb, Cs, B);\n}\n";
    }

    /* JADX INFO: renamed from: r */
    public static String m152826r() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color2 * color1 + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    /* JADX INFO: renamed from: s */
    public static String m152827s() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nmediump vec4 unpremultiply(mediump vec4 s) {\n     return vec4(s.rgb/max(s.a,0.00001), s.a);\n }\n mediump vec4 premultiply(mediump vec4 s) {\n     return vec4(s.rgb * s.a, s.a);\n }\n mediump float overlaySingleChannel(mediump float b, mediump float s) {\n     return b < 0.5 ? (2.0 * s * b) : (1.0 - 2.0 * (1.0 - b) * (1.0 - s));\n }\n mediump vec4 normalBlend(mediump vec4 Cb, mediump vec4 Cs) {\n     mediump vec4 dst = premultiply(Cb);\n     mediump vec4 src = premultiply(Cs);\n     return unpremultiply(src + dst * (1.0 - src.a));\n }\n mediump vec4 blendBaseAlpha(mediump vec4 Cb, mediump vec4 Cs, mediump vec4 B) {\n     mediump vec4 Cr = vec4((1.0 - Cb.a) * Cs.rgb + Cb.a * clamp(B.rgb, 0.0,  1.0), Cs.a);\n     return normalBlend(Cb, Cr);\n }void main(){\n   vec4 Cb = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 Cs = texture2D(inputImageTexture1,textureCoordinate);\n   mediump vec4 B = vec4(overlaySingleChannel(Cb.r, Cs.r),overlaySingleChannel(Cb.g, Cs.g),overlaySingleChannel(Cb.b,Cs.b),Cs.a);\n   gl_FragColor = blendBaseAlpha(Cb, Cs, B);\n}\n";
    }

    /* JADX INFO: renamed from: t */
    public static String m152828t() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nlowp vec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nhighp float sat(lowp vec3 c) {\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     return x - n;\n}\nlowp float mid(lowp float cmin, lowp float cmid, lowp float cmax, highp float s) {\n     return ((cmid - cmin) * s) / (cmax - cmin);\n}\nlowp vec3 setsat(lowp vec3 c, highp float s) {\n     if (c.r > c.g) {\n         if (c.r > c.b) {\n             if (c.g > c.b) {\n                 c.g = mid(c.b, c.g, c.r, s);\n                 c.b = 0.0;\n             } else {\n                 c.b = mid(c.g, c.b, c.r, s);\n                 c.g = 0.0;\n             }\n             c.r = s;\n        } else {\n             c.r = mid(c.g, c.r, c.b, s);\n             c.b = s;\n             c.g = 0.0;\n         }\n     } else if (c.r > c.b) {\n         c.r = mid(c.b, c.r, c.g, s);\n         c.g = s;\n         c.b = 0.0;\n     } else if (c.g > c.b) {\n         c.b = mid(c.r, c.b, c.g, s);\n         c.g = s;\n         c.r = 0.0;\n     } else if (c.b > c.g) {\n         c.g = mid(c.r, c.g, c.b, s);\n         c.b = s;\n         c.r = 0.0;\n     } else {\n         c = vec3(0.0);\n     }\n     return c;\n}\nvoid main(){\n   highp vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   highp vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(setsat(color1.rgb, sat(color1.rgb)), lum(color2.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: u */
    public static String m152829u() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 whiteColor = vec4(1.0);\n   gl_FragColor = whiteColor - ((whiteColor - color2) * (whiteColor - color1));\n}\n";
    }

    /* JADX INFO: renamed from: v */
    public static String m152830v() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\n" + oji.m164660g() + oji.m164658e() + oji.m164655b(true) + oji.m164654a() + oji.m164659f() + "void main(){\n   vec4 uCb = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 uCf = texture2D(inputImageTexture1,vec2(textureCoordinate.x,textureCoordinate.y));\n   vec4 blendedColor = screenBlend(uCb, uCf);\n   gl_FragColor = mix(uCb, blendedColor,intensity);\n}\n";
    }

    /* JADX INFO: renamed from: w */
    public static String m152831w() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\n mediump vec4 unpremultiply(mediump vec4 s) {\n     return vec4(s.rgb/max(s.a,0.00001), s.a);\n }\n mediump vec4 premultiply(mediump vec4 s) {\n     return vec4(s.rgb * s.a, s.a);\n }\n mediump vec4 normalBlend(mediump vec4 Cb, mediump vec4 Cs) {\n     mediump vec4 dst = premultiply(Cb);\n     mediump vec4 src = premultiply(Cs);\n     return unpremultiply(src + dst * (1.0 - src.a));\n }\n mediump vec4 blendBaseAlpha(mediump vec4 Cb, mediump vec4 Cs, mediump vec4 B) {\n     mediump vec4 Cr = vec4((1.0 - Cb.a) * Cs.rgb + Cb.a * clamp(B.rgb, 0.0,  1.0), Cs.a);\n     return normalBlend(Cb, Cr);\n }\n mediump float softLightBlendSingleChannelD(mediump float b) {\n     return b <= 0.25? (((16.0 * b - 12.0) * b + 4.0) * b): sqrt(b);\n }\n mediump float softLightBlendSingleChannel(mediump float b,mediump float s) {\n     return s < 0.5? (b - (1.0 - 2.0 * s) * b * (1.0 - b)) : (b + (2.0 * s - 1.0) * (softLightBlendSingleChannelD(b) - b));\n }\nvoid main(){\n   vec4 Cb = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 Cs = texture2D(inputImageTexture1,textureCoordinate);\n   mediump vec4 B = vec4(softLightBlendSingleChannel(Cb.r, Cs.r), softLightBlendSingleChannel(Cb.g, Cs.g), softLightBlendSingleChannel(Cb.b, Cs.b), Cs.a);\n   gl_FragColor = blendBaseAlpha(Cb, Cs, B);\n}\n";
    }

    /* JADX INFO: renamed from: x */
    public static String m152832x() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = mix(color1, color2, color2.a);\n}\n";
    }

    /* JADX INFO: renamed from: y */
    public static String m152833y() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb - color2.rgb, color1.a);\n}\n";
    }
}
