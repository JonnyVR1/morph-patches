package com.momo.mcamera.mask.p047st;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import com.core.glcore.util.TextureHelper;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p153l.jt2;

/* JADX INFO: loaded from: classes8.dex */
public class RuddyFilter extends jt2 {
    private WeakReference<Context> contextWeakReference;
    protected final String BEAUTY_VALUE = "whitenValue";
    protected final String RUDDY_VALUE = "ruddyValue";
    protected final String TEXTURE_WHITEN = "whitenTexture";
    protected final String TEXTURE_RUDDY = "ruddyTexture";
    private int ruddyTextureId = 0;
    private int whitenTextureId = 0;
    protected float ruddyValue = 0.0f;
    protected float whitenValue = 0.0f;
    private int ruddyTableUniform = 0;
    private int whitenTableUniform = 0;
    private int reddenUniform = 0;
    private int whitenUniform = 0;

    public RuddyFilter(Context context) {
        this.contextWeakReference = new WeakReference<>(context);
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\n varying vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform sampler2D ruddyTexture;\n uniform sampler2D whitenTexture;\n uniform float whitenValue;\n uniform float ruddyValue;\n vec3 filterColor(vec3 src, sampler2D table, float factor){\n    highp float blue = src.b * 63.0;\n    highp vec2 q1;\n    float fb = floor(blue);\n    q1.y = floor(fb * 0.125);\n    q1.x = fb - (q1.y * 8.0);\n    highp vec2 q2;\n    float cb = ceil(blue);\n    q2.y = floor(cb * 0.125);\n    q2.x = cb - (q2.y * 8.0);\n    vec2 t = 0.123 * src.rg + vec2(0.000976563);\n    vec2 t1 = q1 * 0.125 + t;\n    vec3 p1 = texture2D(table, t1).rgb;\n    vec2 t2 = q2 * 0.125 + t;\n    vec3 p2 = texture2D(table, t2).rgb;\n    vec3 filtered = mix(p1, p2, fract(blue));\n    return mix(src, filtered, factor);\n}\n void main() {\n    vec4 src = texture2D(inputImageTexture0, textureCoordinate);\n    vec3 whitenResult = filterColor(src.rgb, whitenTexture, whitenValue);\n    vec3 reddenResult = filterColor(whitenResult, ruddyTexture, ruddyValue);\n    gl_FragColor = vec4(reddenResult, src.a);\n}\n";
    }

    public String getRuddyPic() {
        return "ruddy.png";
    }

    public String getWhitePic() {
        return "white.png";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        Bitmap bitmapDecodeStream;
        super.initShaderHandles();
        this.whitenUniform = GLES20.glGetUniformLocation(this.programHandle, "whitenValue");
        this.reddenUniform = GLES20.glGetUniformLocation(this.programHandle, "ruddyValue");
        this.whitenTableUniform = GLES20.glGetUniformLocation(this.programHandle, "whitenTexture");
        this.ruddyTableUniform = GLES20.glGetUniformLocation(this.programHandle, "ruddyTexture");
        Context context = this.contextWeakReference.get();
        if (context != null) {
            Bitmap bitmapDecodeStream2 = null;
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(getWhitePic()));
                try {
                    bitmapDecodeStream2 = BitmapFactory.decodeStream(context.getAssets().open(getRuddyPic()));
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                e = e2;
                bitmapDecodeStream = null;
            }
            this.whitenTextureId = TextureHelper.bitmapToTexture(bitmapDecodeStream);
            this.ruddyTextureId = TextureHelper.bitmapToTexture(bitmapDecodeStream2);
        }
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.whitenTextureId);
        GLES20.glUniform1i(this.whitenTableUniform, 3);
        GLES20.glActiveTexture(33988);
        GLES20.glBindTexture(3553, this.ruddyTextureId);
        GLES20.glUniform1i(this.ruddyTableUniform, 4);
        GLES20.glUniform1f(this.whitenUniform, this.whitenValue);
        GLES20.glUniform1f(this.reddenUniform, this.ruddyValue);
    }

    public void setRuddyValue(float f) {
        this.ruddyValue = f;
    }
}
