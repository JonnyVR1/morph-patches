package com.momo.mcamera.filtermanager.filterext;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.util.HashMap;
import p153l.gfj;
import p153l.hs10;
import p153l.oim;

/* JADX INFO: loaded from: classes6.dex */
public class BitmapBlendFilter extends hs10 {
    private static final String BLEND_KEY_ADD = "Add";
    private static final String BLEND_KEY_COLOR = "Color";
    private static final String BLEND_KEY_COLOR_BURN = "ColorBurn";
    private static final String BLEND_KEY_COLOR_DODGE = "ColorDodge";
    private static final String BLEND_KEY_DARKEN = "Darken";
    private static final String BLEND_KEY_DIFFERENCE = "Difference";
    private static final String BLEND_KEY_DIVIDE = "Divide";
    private static final String BLEND_KEY_EXCLUSION = "Exclusion";
    private static final String BLEND_KEY_HARDLIGHT = "HardLight";
    private static final String BLEND_KEY_HUE = "Hue";
    private static final String BLEND_KEY_LIGHTEN = "Lighten";
    private static final String BLEND_KEY_LINEARBURN = "LinearBurn";
    private static final String BLEND_KEY_LUMINOSITY = "Luminosity";
    private static final String BLEND_KEY_MASK = "Mask";
    private static final String BLEND_KEY_MULTIPLY = "Multiply";
    private static final String BLEND_KEY_NORMAL = "Normal";
    private static final String BLEND_KEY_OVERLAY = "Overlay";
    private static final String BLEND_KEY_SATURATION = "Saturation";
    private static final String BLEND_KEY_SCREEN_BLEND = "Screen";
    private static final String BLEND_KEY_SOFT_LIGHT = "SoftLight";
    private static final String BLEND_KEY_SOURCE_OVER = "SourceOver";
    private static final String BLEND_KEY_SUBTRACT = "Subtract";
    private boolean bitMapChanged;
    private HashMap<String, String> blendFragmentShaderMap;
    public String blendType;
    private Bitmap maskBitmap;
    private int mask_texture;

    public BitmapBlendFilter() {
        super(2);
        HashMap<String, String> map = new HashMap<>();
        this.blendFragmentShaderMap = map;
        map.put(BLEND_KEY_ADD, getAddBlendFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_COLOR, getColorFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_COLOR_BURN, getColorBurnFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_COLOR_DODGE, getColorDodgeFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_DARKEN, getDarkenFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_DIFFERENCE, getDifferenceFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_DIVIDE, getDivideFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_EXCLUSION, getExclusionFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_HARDLIGHT, getHardLightFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_HUE, getHueFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_LIGHTEN, getLightenFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_LINEARBURN, getLinearBurnFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_LUMINOSITY, getLuminosityFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_MASK, getMaskFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_MULTIPLY, getMultiplyFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_NORMAL, getNormalFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_OVERLAY, getOverlayFragmentShader());
        this.blendFragmentShaderMap.put("Saturation", getSaturationFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_SCREEN_BLEND, getScreenFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_SOFT_LIGHT, getSoftLightFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_SOURCE_OVER, getSourceoverFragmentShader());
        this.blendFragmentShaderMap.put(BLEND_KEY_SUBTRACT, getSubtractFragmentShader());
    }

    @Override // p153l.hs10, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.mask_texture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.mask_texture = 0;
        }
        Bitmap bitmap = this.maskBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.maskBitmap.recycle();
        this.maskBitmap = null;
    }

    public String getAddBlendFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color2.r * color1.a + color1.r * color2.a >= color2.a * color1.a) {\n     r = color2.a * color1.a + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.r + color1.r;\n   }\n   float g;\n   if (color2.g * color1.a + color1.g * color2.a >= color2.a * color1.a) {\n     g = color2.a * color1.a + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.g + color1.g;\n   }\n   float b;\n   if (color2.b * color1.a + color1.b * color2.a >= color2.a * color1.a) {\n     b = color2.a * color1.a + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.b + color1.b;\n   }\n   float a  = color2.a + color1.a - color2.a * color1.a;\n   gl_FragColor = vec4(r, g, b, a);\n}\n";
    }

    public String getBlendType() {
        return this.blendType;
    }

    public String getColorBurnFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 whiteColor = vec4(1.0);\n   gl_FragColor = whiteColor - (whiteColor - color1) / color2;\n}\n";
    }

    public String getColorDodgeFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec3 baseOverlayAlphaProduct = vec3(color2.a * color1.a);\n   vec3 rightHandProduct = color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a);\n   vec3 firstBlendColor = baseOverlayAlphaProduct + rightHandProduct;\n   vec3 overlayRGB = clamp((color2.rgb / clamp(color2.a, 0.01, 1.0)) * step(0.0, color2.a), 0.0, 0.99);\n   vec3 secondBlendColor = (color1.rgb * color2.a) / (1.0 - overlayRGB) + rightHandProduct;\n   vec3 colorChoice = step((color2.rgb * color1.a + color1.rgb * color2.a), baseOverlayAlphaProduct);\n   gl_FragColor = vec4(mix(firstBlendColor, secondBlendColor, colorChoice), 1.0);\n}\n";
    }

    public String getColorFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color2.rgb, lum(color1.rgb)) * color2.a, color1.a);\n}\n";
    }

    public String getDarkenFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(min(color2.rgb * color1.a, color1.rgb * color2.a) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), 1.0);\n}\n";
    }

    public String getDifferenceFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(abs(color2.rgb - color1.rgb), color1.a);\n}\n";
    }

    public String getDivideFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color2.r == 0.0 || ((color1.r / color2.r) > (color1.a / color2.a))) {\n     r = color2.a * color1.a + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = (color1.r * color2.a * color2.a) / color2.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (color2.g == 0.0 || ((color1.g / color2.g) > (color1.a / color2.a))) {\n     g = color2.a * color1.a + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = (color1.g * color2.a * color2.a) / color2.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (color2.b == 0.0 || ((color1.b / color2.b) > (color1.a / color2.a))) {\n     b = color2.a * color1.a + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = (color1.b * color2.a * color2.a) / color2.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   float a  = color2.a + color1.a - color2.a * color1.a;\n   gl_FragColor = vec4(r, g, b, a);\n}\n";
    }

    public String getExclusionFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4((color2.rgb * color1.a + color1.rgb * color2.a - 2.0 * color2.rgb * color1.rgb) + color2.rgb * (1.0 - color1.a) + color1.rgb * (1.0 - color2.a), color1.a);\n}\n";
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        String str = !TextUtils.isEmpty(this.blendType) ? this.blendFragmentShaderMap.get(this.blendType) : null;
        return TextUtils.isEmpty(str) ? "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n  vec2 textCood = textureCoordinate;  vec2 textCanvas = vec2(textCood.x,1.0 - textCood.y);   vec4 color2 = texture2D(inputImageTexture0,textCood);\n   vec4 color1 = texture2D(inputImageTexture1,textCanvas);\n   vec4 outputColor;\n   if (color1.a > 0.0) {color1.rgb = color1.rgb/color1.a;}   float a = color1.a + color2.a * (1.0 - color1.a);\n   a = a + step(a,0.0);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = a;\n   gl_FragColor = outputColor;\n}\n" : str;
    }

    public String getHardLightFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (2.0 * color2.r < color2.a) {\n     r = 2.0 * color2.r * color1.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.a * color1.a - 2.0 * (color1.a - color1.r) * (color2.a - color2.r) + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (2.0 * color2.g < color2.a) {\n     g = 2.0 * color2.g * color1.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.a * color1.a - 2.0 * (color1.a - color1.g) * (color2.a - color2.g) + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (2.0 * color2.b < color2.a) {\n     b = 2.0 * color2.b * color1.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.a * color1.a - 2.0 * (color1.a - color1.b) * (color2.a - color2.b) + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   gl_FragColor = vec4(r, g, b, 1.0);\n}\n";
    }

    public String getHueFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nlowp vec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nhighp float sat(lowp vec3 c) {\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     return x - n;\n}\nlowp float mid(lowp float cmin, lowp float cmid, lowp float cmax, highp float s) {\n     return ((cmid - cmin) * s) / (cmax - cmin);\n}\nlowp vec3 setsat(lowp vec3 c, highp float s) {\n     if (c.r > c.g) {\n         if (c.r > c.b) {\n             if (c.g > c.b) {\n                 c.g = mid(c.b, c.g, c.r, s);\n                 c.b = 0.0;\n             } else {\n                 c.b = mid(c.g, c.b, c.r, s);\n                 c.g = 0.0;\n             }\n             c.r = s;\n        } else {\n             c.r = mid(c.g, c.r, c.b, s);\n             c.b = s;\n             c.g = 0.0;\n         }\n     } else if (c.r > c.b) {\n         c.r = mid(c.b, c.r, c.g, s);\n         c.g = s;\n         c.b = 0.0;\n     } else if (c.g > c.b) {\n         c.b = mid(c.r, c.b, c.g, s);\n         c.g = s;\n         c.r = 0.0;\n     } else if (c.b > c.g) {\n         c.g = mid(c.r, c.g, c.b, s);\n         c.b = s;\n         c.r = 0.0;\n     } else {\n         c = vec3(0.0);\n     }\n     return c;\n}\nvoid main(){\n   highp vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   highp vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(setsat(color2.rgb, sat(color1.rgb)), lum(color1.rgb)) * color2.a, color1.a);\n}\n";
    }

    public String getLightenFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = max(color1, color2);\n}\n";
    }

    public String getLinearBurnFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(clamp(color1.rgb + color2.rgb - vec3(1.0), vec3(0.0), vec3(1.0)), color1.a);\n}\n";
    }

    public String getLuminosityFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nvec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(color1.rgb, lum(color2.rgb)) * color2.a, color1.a);\n}\n";
    }

    public String getMaskFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float newAlpha = dot(color2.rgb, vec3(.33333334, .33333334, .33333334)) * color2.a;\n   gl_FragColor = vec4(color1.xyz, newAlpha);\n}\n";
    }

    public String getMultiplyFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color2 * color1 + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    public String getNormalFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color2 * color1 + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    public String getOverlayFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   float r;\n   if (color1.a > 0.0) {color1.rgb = color1.rgb/color1.a;}   if (2.0 * color1.r < color1.a) {\n     r = 2.0 * color2.r * color1.r + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   } else {\n     r = color2.a * color1.a - 2.0 * (color1.a - color1.r) * (color2.a - color2.r) + color2.r * (1.0 - color1.a) + color1.r * (1.0 - color2.a);\n   }\n   float g;\n   if (2.0 * color1.g < color1.a) {\n     g = 2.0 * color2.g * color1.g + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   } else {\n     g = color2.a * color1.a - 2.0 * (color1.a - color1.g) * (color2.a - color2.g) + color2.g * (1.0 - color1.a) + color1.g * (1.0 - color2.a);\n   }\n   float b;\n   if (2.0 * color1.b < color1.a) {\n     b = 2.0 * color2.b * color1.b + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   } else {\n     b = color2.a * color1.a - 2.0 * (color1.a - color1.b) * (color2.a - color2.b) + color2.b * (1.0 - color1.a) + color1.b * (1.0 - color2.a);\n   }\n   gl_FragColor = vec4(r, g, b, 1.0);\n}\n";
    }

    public String getSaturationFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nhighp float lum(lowp vec3 c) {\n  return dot(c, vec3(0.3, 0.59, 0.11));\n}\nlowp vec3 setlum(lowp vec3 c, highp float l2) {\n  float d = l2 - lum(c);\n  c = c + vec3(d);\n  float l = lum(c);\n  float n = min(min(c.r, c.g), c.b);\n  float x = max(max(c.r, c.g), c.b);\n  if (n < 0.0) {\n    c.r = l + ((c.r - l) * l) / (l - n);\n    c.g = l + ((c.g - l) * l) / (l - n);\n    c.b = l + ((c.b - l) * l) / (l - n);\n  }\n  if (x > 1.0) {\n    c.r = l + ((c.r - l) * (1.0 - l)) / (x - l);\n    c.g = l + ((c.g - l) * (1.0 - l)) / (x - l);\n    c.b = l + ((c.b - l) * (1.0 - l)) / (x - l);\n  }\n  return c;\n}\nhighp float sat(lowp vec3 c) {\n     lowp float n = min(min(c.r, c.g), c.b);\n     lowp float x = max(max(c.r, c.g), c.b);\n     return x - n;\n}\nlowp float mid(lowp float cmin, lowp float cmid, lowp float cmax, highp float s) {\n     return ((cmid - cmin) * s) / (cmax - cmin);\n}\nlowp vec3 setsat(lowp vec3 c, highp float s) {\n     if (c.r > c.g) {\n         if (c.r > c.b) {\n             if (c.g > c.b) {\n                 c.g = mid(c.b, c.g, c.r, s);\n                 c.b = 0.0;\n             } else {\n                 c.b = mid(c.g, c.b, c.r, s);\n                 c.g = 0.0;\n             }\n             c.r = s;\n        } else {\n             c.r = mid(c.g, c.r, c.b, s);\n             c.b = s;\n             c.g = 0.0;\n         }\n     } else if (c.r > c.b) {\n         c.r = mid(c.b, c.r, c.g, s);\n         c.g = s;\n         c.b = 0.0;\n     } else if (c.g > c.b) {\n         c.b = mid(c.r, c.b, c.g, s);\n         c.g = s;\n         c.r = 0.0;\n     } else if (c.b > c.g) {\n         c.g = mid(c.r, c.g, c.b, s);\n         c.b = s;\n         c.r = 0.0;\n     } else {\n         c = vec3(0.0);\n     }\n     return c;\n}\nvoid main(){\n   highp vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   highp vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb * (1.0 - color2.a) + setlum(setsat(color1.rgb, sat(color1.rgb)), lum(color2.rgb)) * color2.a, color1.a);\n}\n";
    }

    public String getScreenFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 whiteColor = vec4(1.0);\n   gl_FragColor = whiteColor - ((whiteColor - color2) * (whiteColor - color1));\n}\n";
    }

    public String getSoftLightFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color1 * (color2.a * (color1 / color1.a) + (2.0 * color2 * (1.0 - (color1 / color1.a)))) + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }

    public String getSourceoverFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = mix(color1, color2, color2.a);\n}\n";
    }

    public String getSubtractFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb - color2.rgb, color1.a);\n}\n";
    }

    @Override // p153l.hs10, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (this.filterLocations.size() < 2 || !gfjVar.equals(this.filterLocations.get(0))) {
            clearRegisteredFilterLocations();
            registerFilterLocation(gfjVar, 0);
            registerFilterLocation(this, 1);
        }
        int i2 = this.mask_texture;
        if (i2 == 0 || this.bitMapChanged) {
            if (i2 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                this.mask_texture = 0;
            }
            this.mask_texture = oim.m167794a(this.maskBitmap);
            this.bitMapChanged = false;
        }
        super.newTextureReady(this.mask_texture, this, z);
        super.newTextureReady(i, gfjVar, z);
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.mask_texture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.mask_texture = 0;
        }
    }

    public void setBlendBitmap(Bitmap bitmap) {
        synchronized (getLockObject()) {
            this.maskBitmap = bitmap;
            this.bitMapChanged = true;
        }
    }

    public void setBlendType(String str) {
        this.blendType = str;
    }
}
