package p153l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class l13 extends is10 {

    /* JADX INFO: renamed from: I */
    private Bitmap f129643I;

    /* JADX INFO: renamed from: J */
    private int f129644J;

    /* JADX INFO: renamed from: K */
    private boolean f129645K;

    /* JADX INFO: renamed from: L */
    private HashMap<String, String> f129646L;

    /* JADX INFO: renamed from: M */
    public String f129647M;

    /* JADX INFO: renamed from: N */
    private String f129648N;

    public l13() {
        super(2);
        this.f129648N = null;
        HashMap<String, String> map = new HashMap<>();
        this.f129646L = map;
        map.put("Add", m152433R());
        this.f129646L.put("Color", m152436U());
        this.f129646L.put("ColorBurn", m152434S());
        this.f129646L.put("ColorDodge", m152435T());
        this.f129646L.put("Darken", m152437V());
        this.f129646L.put("Difference", m152438W());
        this.f129646L.put("Divide", m152439X());
        this.f129646L.put("Exclusion", m152440Y());
        this.f129646L.put("HardLight", m152441Z());
        this.f129646L.put("Hue", m152442a0());
        this.f129646L.put("Lighten", m152443b0());
        this.f129646L.put("LinearBurn", m152444c0());
        this.f129646L.put("Luminosity", m152445d0());
        this.f129646L.put("Mask", m152446e0());
        this.f129646L.put("Multiply", m152447f0());
        this.f129646L.put("Normal", m152448g0());
        this.f129646L.put("Overlay", m152449h0());
        this.f129646L.put(p7f.TAG_SATURATION, m152450i0());
        this.f129646L.put("Screen", m152451j0());
        this.f129646L.put("SoftLight", m152452k0());
        this.f129646L.put("SourceOver", m152453l0());
        this.f129646L.put("Subtract", m152454m0());
    }

    /* JADX INFO: renamed from: R */
    public String m152433R() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color2.r * color1.a + color1.r * color2.a >= color2.a * color1.a) {\n     r = color2.a * color1.a + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.r + color1.r;\n   }\n   float g;\n   if (color2.g * color1.a + color1.g * color2.a >= color2.a * color1.a) {\n     g = color2.a * color1.a + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.g + color1.g;\n   }\n   float b;\n   if (color2.b * color1.a + color1.b * color2.a >= color2.a * color1.a) {\n     b = color2.a * color1.a + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.b + color1.b;\n   }\n   float a  = color2.a + color1.a - color2.a * color1.a;\n   gl_FragColor = vec4(r, g, b, a);\n}\n";
    }

    /* JADX INFO: renamed from: S */
    public String m152434S() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 whiteColor = vec4(1.0);\n   gl_FragColor = whiteColor - (whiteColor - color1) / color2;\n}\n";
    }

    /* JADX INFO: renamed from: T */
    public String m152435T() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec3 baseOverlayAlphaProduct = vec3(color2.a * color1.a);\n   vec3 rightHandProduct = color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a);\n   vec3 firstBlendColor = baseOverlayAlphaProduct + rightHandProduct;\n   vec3 overlayRGB = clamp((color2.rgb / clamp(color2.a, 0.01, 1.0)) * step(0.0, color2.a), 0.0, 0.99);\n   vec3 secondBlendColor = (color1.rgb * color2.a) / (1.0 - overlayRGB) + rightHandProduct;\n   vec3 colorChoice = step((color2.rgb * color1.a + color1.rgb * color2.a), baseOverlayAlphaProduct);\n   gl_FragColor = vec4(mix(firstBlendColor, secondBlendColor, colorChoice), 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: U */
    public String m152436U() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color2.rgb, lum(color1.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: V */
    public String m152437V() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(min(color2.rgb * color1.a, color1.rgb * color2.a) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: W */
    public String m152438W() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(abs(color2.rgb - color1.rgb), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: X */
    public String m152439X() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color2.r == 0.0 || ((color1.r / color2.r) > (color1.a / color2.a))) {\n     r = color2.a * color1.a + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = (color1.r * color2.a * color2.a) / color2.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (color2.g == 0.0 || ((color1.g / color2.g) > (color1.a / color2.a))) {\n     g = color2.a * color1.a + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = (color1.g * color2.a * color2.a) / color2.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (color2.b == 0.0 || ((color1.b / color2.b) > (color1.a / color2.a))) {\n     b = color2.a * color1.a + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = (color1.b * color2.a * color2.a) / color2.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   float a  = color2.a + color1.a - color2.a * color1.a;\n   gl_FragColor = vec4(r, g, b, a);\n}\n";
    }

    /* JADX INFO: renamed from: Y */
    public String m152440Y() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4((color2.rgb * color1.a + color1.rgb * color2.a - 2.0 * color2.rgb * color1.rgb) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: Z */
    public String m152441Z() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (2.0 * color2.r < color2.a) {\n     r = 2.0 * color2.r * color1.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.a * color1.a - 2.0 * (color1.a - color1.r) * (color2.a - color2.r) + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (2.0 * color2.g < color2.a) {\n     g = 2.0 * color2.g * color1.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.a * color1.a - 2.0 * (color1.a - color1.g) * (color2.a - color2.g) + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (2.0 * color2.b < color2.a) {\n     b = 2.0 * color2.b * color1.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.a * color1.a - 2.0 * (color1.a - color1.b) * (color2.a - color2.b) + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   gl_FragColor = vec4(r, g, b, 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: a0 */
    public String m152442a0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nlowp vec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nhighp float sat(lowp vec3 c) {\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     return x - n;\n}\nlowp float mid(lowp float cmin, lowp float cmid, lowp float cmax, highp float s) {\n     return ((cmid - cmin) * s) / (cmax - cmin);\n}\nlowp vec3 setsat(lowp vec3 c, highp float s) {\n     if (c.r > c.g) {\n         if (c.r > c.b) {\n             if (c.g > c.b) {\n                 c.g = mid(c.b, c.g, c.r, s);\n                 c.b = 0.0;\n             } else {\n                 c.b = mid(c.g, c.b, c.r, s);\n                 c.g = 0.0;\n             }\n             c.r = s;\n        } else {\n             c.r = mid(c.g, c.r, c.b, s);\n             c.b = s;\n             c.g = 0.0;\n         }\n     } else if (c.r > c.b) {\n         c.r = mid(c.b, c.r, c.g, s);\n         c.g = s;\n         c.b = 0.0;\n     } else if (c.g > c.b) {\n         c.b = mid(c.r, c.b, c.g, s);\n         c.g = s;\n         c.r = 0.0;\n     } else if (c.b > c.g) {\n         c.g = mid(c.r, c.g, c.b, s);\n         c.b = s;\n         c.r = 0.0;\n     } else {\n         c = vec3(0.0);\n     }\n     return c;\n}\nvoid main(){\n   highp vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   highp vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(setsat(color2.rgb, sat(color1.rgb)), lum(color1.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: b0 */
    public String m152443b0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = max(color1, color2);\n}\n";
    }

    @Override // p153l.is10, p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        if (this.f116620F.size() < 2 || !hfjVar.equals(this.f116620F.get(0))) {
            m141853O();
            m141855Q(hfjVar, 0);
            m141855Q(this, 1);
        }
        if (this.f129644J == 0 || this.f129645K) {
            Bitmap bitmap = this.f129643I;
            if (bitmap != null) {
                this.f129644J = pim.m172385a(bitmap);
            } else {
                this.f129644J = pim.m172385a(pim.m172387c(this.f129648N));
            }
            this.f129645K = false;
        }
        super.mo96079c(this.f129644J, this, z);
        super.mo96079c(i, hfjVar, z);
    }

    /* JADX INFO: renamed from: c0 */
    public String m152444c0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(clamp(color1.rgb + color2.rgb - vec3(1.0), vec3(0.0), vec3(1.0)), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: d0 */
    public String m152445d0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color1.rgb, lum(color2.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: e0 */
    public String m152446e0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float newAlpha = dot(color2.rgb, vec3(.33333334, .33333334, .33333334)) * color2.a;\n   gl_FragColor = vec4(color1.xyz, newAlpha);\n}\n";
    }

    @Override // p153l.is10, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        int i = this.f129644J;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f129644J = 0;
        }
        Bitmap bitmap = this.f129643I;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f129643I.recycle();
        this.f129643I = null;
    }

    /* JADX INFO: renamed from: f0 */
    public String m152447f0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color2 * color1 + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    /* JADX INFO: renamed from: g0 */
    public String m152448g0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color2 * color1 + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    /* JADX INFO: renamed from: h0 */
    public String m152449h0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (2.0 * color1.r < color1.a) {\n     r = 2.0 * color2.r * color1.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.a * color1.a - 2.0 * (color1.a - color1.r) * (color2.a - color2.r) + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (2.0 * color1.g < color1.a) {\n     g = 2.0 * color2.g * color1.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.a * color1.a - 2.0 * (color1.a - color1.g) * (color2.a - color2.g) + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (2.0 * color1.b < color1.a) {\n     b = 2.0 * color2.b * color1.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.a * color1.a - 2.0 * (color1.a - color1.b) * (color2.a - color2.b) + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   gl_FragColor = vec4(r, g, b, 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: i0 */
    public String m152450i0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nlowp vec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nhighp float sat(lowp vec3 c) {\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     return x - n;\n}\nlowp float mid(lowp float cmin, lowp float cmid, lowp float cmax, highp float s) {\n     return ((cmid - cmin) * s) / (cmax - cmin);\n}\nlowp vec3 setsat(lowp vec3 c, highp float s) {\n     if (c.r > c.g) {\n         if (c.r > c.b) {\n             if (c.g > c.b) {\n                 c.g = mid(c.b, c.g, c.r, s);\n                 c.b = 0.0;\n             } else {\n                 c.b = mid(c.g, c.b, c.r, s);\n                 c.g = 0.0;\n             }\n             c.r = s;\n        } else {\n             c.r = mid(c.g, c.r, c.b, s);\n             c.b = s;\n             c.g = 0.0;\n         }\n     } else if (c.r > c.b) {\n         c.r = mid(c.b, c.r, c.g, s);\n         c.g = s;\n         c.b = 0.0;\n     } else if (c.g > c.b) {\n         c.b = mid(c.r, c.b, c.g, s);\n         c.g = s;\n         c.r = 0.0;\n     } else if (c.b > c.g) {\n         c.g = mid(c.r, c.g, c.b, s);\n         c.b = s;\n         c.r = 0.0;\n     } else {\n         c = vec3(0.0);\n     }\n     return c;\n}\nvoid main(){\n   highp vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   highp vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(setsat(color1.rgb, sat(color1.rgb)), lum(color2.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: j0 */
    public String m152451j0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 whiteColor = vec4(1.0);\n   gl_FragColor = whiteColor - ((whiteColor - color2) * (whiteColor - color1));\n}\n";
    }

    /* JADX INFO: renamed from: k0 */
    public String m152452k0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color1 * (color2.a * (color1 / color1.a) + (2.0 * color2 * (1.0 - (color1 / color1.a)))) + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    /* JADX INFO: renamed from: l0 */
    public String m152453l0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = mix(color1, color2, color2.a);\n}\n";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        String str = !TextUtils.isEmpty(this.f129647M) ? this.f129646L.get(this.f129647M) : null;
        return TextUtils.isEmpty(str) ? "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n  vec2 textCood = textureCoordinate;  vec2 textCanvas = vec2(textCood.x,1.0 - textCood.y);   vec4 color2 = texture2D(inputImageTexture0,textCood);\n   vec4 color1 = texture2D(inputImageTexture1,textCanvas);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = a;\n   gl_FragColor = outputColor;\n}\n" : str;
    }

    /* JADX INFO: renamed from: m0 */
    public String m152454m0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb - color2.rgb, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: n0 */
    public void m152455n0(Bitmap bitmap) {
        synchronized (m134800I()) {
            this.f129643I = bitmap;
            this.f129645K = true;
        }
    }
}
