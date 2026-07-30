package p149l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class w03 extends yj10 {

    /* JADX INFO: renamed from: I */
    private Bitmap f183702I;

    /* JADX INFO: renamed from: J */
    private int f183703J;

    /* JADX INFO: renamed from: K */
    private boolean f183704K;

    /* JADX INFO: renamed from: L */
    private HashMap<String, String> f183705L;

    /* JADX INFO: renamed from: M */
    public String f183706M;

    /* JADX INFO: renamed from: N */
    private String f183707N;

    public w03() {
        super(2);
        this.f183707N = null;
        HashMap<String, String> map = new HashMap<>();
        this.f183705L = map;
        map.put("Add", m200798R());
        this.f183705L.put("Color", m200801U());
        this.f183705L.put("ColorBurn", m200799S());
        this.f183705L.put("ColorDodge", m200800T());
        this.f183705L.put("Darken", m200802V());
        this.f183705L.put("Difference", m200803W());
        this.f183705L.put("Divide", m200804X());
        this.f183705L.put("Exclusion", m200805Y());
        this.f183705L.put("HardLight", m200806Z());
        this.f183705L.put("Hue", m200807a0());
        this.f183705L.put("Lighten", m200808b0());
        this.f183705L.put("LinearBurn", m200809c0());
        this.f183705L.put("Luminosity", m200810d0());
        this.f183705L.put("Mask", m200811e0());
        this.f183705L.put("Multiply", m200812f0());
        this.f183705L.put("Normal", m200813g0());
        this.f183705L.put("Overlay", m200814h0());
        this.f183705L.put(j6f.TAG_SATURATION, m200815i0());
        this.f183705L.put("Screen", m200816j0());
        this.f183705L.put("SoftLight", m200817k0());
        this.f183705L.put("SourceOver", m200818l0());
        this.f183705L.put("Subtract", m200819m0());
    }

    /* JADX INFO: renamed from: R */
    public String m200798R() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color2.r * color1.a + color1.r * color2.a >= color2.a * color1.a) {\n     r = color2.a * color1.a + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.r + color1.r;\n   }\n   float g;\n   if (color2.g * color1.a + color1.g * color2.a >= color2.a * color1.a) {\n     g = color2.a * color1.a + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.g + color1.g;\n   }\n   float b;\n   if (color2.b * color1.a + color1.b * color2.a >= color2.a * color1.a) {\n     b = color2.a * color1.a + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.b + color1.b;\n   }\n   float a  = color2.a + color1.a - color2.a * color1.a;\n   gl_FragColor = vec4(r, g, b, a);\n}\n";
    }

    /* JADX INFO: renamed from: S */
    public String m200799S() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 whiteColor = vec4(1.0);\n   gl_FragColor = whiteColor - (whiteColor - color1) / color2;\n}\n";
    }

    /* JADX INFO: renamed from: T */
    public String m200800T() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec3 baseOverlayAlphaProduct = vec3(color2.a * color1.a);\n   vec3 rightHandProduct = color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a);\n   vec3 firstBlendColor = baseOverlayAlphaProduct + rightHandProduct;\n   vec3 overlayRGB = clamp((color2.rgb / clamp(color2.a, 0.01, 1.0)) * step(0.0, color2.a), 0.0, 0.99);\n   vec3 secondBlendColor = (color1.rgb * color2.a) / (1.0 - overlayRGB) + rightHandProduct;\n   vec3 colorChoice = step((color2.rgb * color1.a + color1.rgb * color2.a), baseOverlayAlphaProduct);\n   gl_FragColor = vec4(mix(firstBlendColor, secondBlendColor, colorChoice), 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: U */
    public String m200801U() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color2.rgb, lum(color1.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: V */
    public String m200802V() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(min(color2.rgb * color1.a, color1.rgb * color2.a) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: W */
    public String m200803W() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(abs(color2.rgb - color1.rgb), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: X */
    public String m200804X() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color2.r == 0.0 || ((color1.r / color2.r) > (color1.a / color2.a))) {\n     r = color2.a * color1.a + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = (color1.r * color2.a * color2.a) / color2.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (color2.g == 0.0 || ((color1.g / color2.g) > (color1.a / color2.a))) {\n     g = color2.a * color1.a + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = (color1.g * color2.a * color2.a) / color2.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (color2.b == 0.0 || ((color1.b / color2.b) > (color1.a / color2.a))) {\n     b = color2.a * color1.a + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = (color1.b * color2.a * color2.a) / color2.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   float a  = color2.a + color1.a - color2.a * color1.a;\n   gl_FragColor = vec4(r, g, b, a);\n}\n";
    }

    /* JADX INFO: renamed from: Y */
    public String m200805Y() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4((color2.rgb * color1.a + color1.rgb * color2.a - 2.0 * color2.rgb * color1.rgb) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: Z */
    public String m200806Z() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (2.0 * color2.r < color2.a) {\n     r = 2.0 * color2.r * color1.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.a * color1.a - 2.0 * (color1.a - color1.r) * (color2.a - color2.r) + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (2.0 * color2.g < color2.a) {\n     g = 2.0 * color2.g * color1.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.a * color1.a - 2.0 * (color1.a - color1.g) * (color2.a - color2.g) + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (2.0 * color2.b < color2.a) {\n     b = 2.0 * color2.b * color1.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.a * color1.a - 2.0 * (color1.a - color1.b) * (color2.a - color2.b) + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   gl_FragColor = vec4(r, g, b, 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: a0 */
    public String m200807a0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nlowp vec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nhighp float sat(lowp vec3 c) {\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     return x - n;\n}\nlowp float mid(lowp float cmin, lowp float cmid, lowp float cmax, highp float s) {\n     return ((cmid - cmin) * s) / (cmax - cmin);\n}\nlowp vec3 setsat(lowp vec3 c, highp float s) {\n     if (c.r > c.g) {\n         if (c.r > c.b) {\n             if (c.g > c.b) {\n                 c.g = mid(c.b, c.g, c.r, s);\n                 c.b = 0.0;\n             } else {\n                 c.b = mid(c.g, c.b, c.r, s);\n                 c.g = 0.0;\n             }\n             c.r = s;\n        } else {\n             c.r = mid(c.g, c.r, c.b, s);\n             c.b = s;\n             c.g = 0.0;\n         }\n     } else if (c.r > c.b) {\n         c.r = mid(c.b, c.r, c.g, s);\n         c.g = s;\n         c.b = 0.0;\n     } else if (c.g > c.b) {\n         c.b = mid(c.r, c.b, c.g, s);\n         c.g = s;\n         c.r = 0.0;\n     } else if (c.b > c.g) {\n         c.g = mid(c.r, c.g, c.b, s);\n         c.b = s;\n         c.r = 0.0;\n     } else {\n         c = vec3(0.0);\n     }\n     return c;\n}\nvoid main(){\n   highp vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   highp vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(setsat(color2.rgb, sat(color1.rgb)), lum(color1.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: b0 */
    public String m200808b0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = max(color1, color2);\n}\n";
    }

    @Override // p149l.yj10, p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        if (this.f198573F.size() < 2 || !ncjVar.equals(this.f198573F.get(0))) {
            m215027O();
            m215029Q(ncjVar, 0);
            m215029Q(this, 1);
        }
        if (this.f183703J == 0 || this.f183704K) {
            Bitmap bitmap = this.f183702I;
            if (bitmap != null) {
                this.f183703J = mgm.m154569a(bitmap);
            } else {
                this.f183703J = mgm.m154569a(mgm.m154571c(this.f183707N));
            }
            this.f183704K = false;
        }
        super.mo102037c(this.f183703J, this, z);
        super.mo102037c(i, ncjVar, z);
    }

    /* JADX INFO: renamed from: c0 */
    public String m200809c0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(clamp(color1.rgb + color2.rgb - vec3(1.0), vec3(0.0), vec3(1.0)), color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: d0 */
    public String m200810d0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color1.rgb, lum(color2.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: e0 */
    public String m200811e0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float newAlpha = dot(color2.rgb, vec3(.33333334, .33333334, .33333334)) * color2.a;\n   gl_FragColor = vec4(color1.xyz, newAlpha);\n}\n";
    }

    @Override // p149l.yj10, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        int i = this.f183703J;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f183703J = 0;
        }
        Bitmap bitmap = this.f183702I;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f183702I.recycle();
        this.f183702I = null;
    }

    /* JADX INFO: renamed from: f0 */
    public String m200812f0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color2 * color1 + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    /* JADX INFO: renamed from: g0 */
    public String m200813g0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color2 * color1 + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    /* JADX INFO: renamed from: h0 */
    public String m200814h0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (2.0 * color1.r < color1.a) {\n     r = 2.0 * color2.r * color1.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.a * color1.a - 2.0 * (color1.a - color1.r) * (color2.a - color2.r) + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (2.0 * color1.g < color1.a) {\n     g = 2.0 * color2.g * color1.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.a * color1.a - 2.0 * (color1.a - color1.g) * (color2.a - color2.g) + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (2.0 * color1.b < color1.a) {\n     b = 2.0 * color2.b * color1.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.a * color1.a - 2.0 * (color1.a - color1.b) * (color2.a - color2.b) + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   gl_FragColor = vec4(r, g, b, 1.0);\n}\n";
    }

    /* JADX INFO: renamed from: i0 */
    public String m200815i0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nlowp vec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nhighp float sat(lowp vec3 c) {\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     return x - n;\n}\nlowp float mid(lowp float cmin, lowp float cmid, lowp float cmax, highp float s) {\n     return ((cmid - cmin) * s) / (cmax - cmin);\n}\nlowp vec3 setsat(lowp vec3 c, highp float s) {\n     if (c.r > c.g) {\n         if (c.r > c.b) {\n             if (c.g > c.b) {\n                 c.g = mid(c.b, c.g, c.r, s);\n                 c.b = 0.0;\n             } else {\n                 c.b = mid(c.g, c.b, c.r, s);\n                 c.g = 0.0;\n             }\n             c.r = s;\n        } else {\n             c.r = mid(c.g, c.r, c.b, s);\n             c.b = s;\n             c.g = 0.0;\n         }\n     } else if (c.r > c.b) {\n         c.r = mid(c.b, c.r, c.g, s);\n         c.g = s;\n         c.b = 0.0;\n     } else if (c.g > c.b) {\n         c.b = mid(c.r, c.b, c.g, s);\n         c.g = s;\n         c.r = 0.0;\n     } else if (c.b > c.g) {\n         c.g = mid(c.r, c.g, c.b, s);\n         c.b = s;\n         c.r = 0.0;\n     } else {\n         c = vec3(0.0);\n     }\n     return c;\n}\nvoid main(){\n   highp vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   highp vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(setsat(color1.rgb, sat(color1.rgb)), lum(color2.rgb)) * color2.a, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: j0 */
    public String m200816j0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 whiteColor = vec4(1.0);\n   gl_FragColor = whiteColor - ((whiteColor - color2) * (whiteColor - color1));\n}\n";
    }

    /* JADX INFO: renamed from: k0 */
    public String m200817k0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color1 * (color2.a * (color1 / color1.a) + (2.0 * color2 * (1.0 - (color1 / color1.a)))) + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    /* JADX INFO: renamed from: l0 */
    public String m200818l0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = mix(color1, color2, color2.a);\n}\n";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        String str = !TextUtils.isEmpty(this.f183706M) ? this.f183705L.get(this.f183706M) : null;
        return TextUtils.isEmpty(str) ? "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n  vec2 textCood = textureCoordinate;  vec2 textCanvas = vec2(textCood.x,1.0 - textCood.y);   vec4 color2 = texture2D(inputImageTexture0,textCood);\n   vec4 color1 = texture2D(inputImageTexture1,textCanvas);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = a;\n   gl_FragColor = outputColor;\n}\n" : str;
    }

    /* JADX INFO: renamed from: m0 */
    public String m200819m0() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb - color2.rgb, color1.a);\n}\n";
    }

    /* JADX INFO: renamed from: n0 */
    public void m200820n0(Bitmap bitmap) {
        synchronized (m158947I()) {
            this.f183702I = bitmap;
            this.f183704K = true;
        }
    }
}
