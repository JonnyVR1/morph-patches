package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class i5w extends is10 implements d5w {

    /* JADX INFO: renamed from: I */
    private int f113101I;

    /* JADX INFO: renamed from: J */
    private Bitmap f113102J;

    /* JADX INFO: renamed from: K */
    private float f113103K;

    /* JADX INFO: renamed from: L */
    private int f113104L;

    /* JADX INFO: renamed from: M */
    private Context f113105M;

    /* JADX INFO: renamed from: N */
    private int f113106N;

    /* JADX INFO: renamed from: O */
    private String f113107O;

    /* JADX INFO: renamed from: P */
    private boolean f113108P;

    public i5w() {
        super(2);
        this.f113103K = 1.0f;
        this.f113108P = false;
    }

    /* JADX INFO: renamed from: R */
    private Bitmap m138776R() throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        Bitmap bitmapDecodeStream = null;
        try {
            inputStreamOpen = this.f113105M.getResources().getAssets().open(this.f113107O);
            try {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    inputStreamOpen.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
            inputStreamOpen.close();
            throw th;
        }
        try {
            inputStreamOpen.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: S */
    private Bitmap m138777S() {
        if (TextUtils.isEmpty(this.f113107O)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeFile(this.f113107O, options);
    }

    /* JADX INFO: renamed from: T */
    private Bitmap m138778T() {
        if (this.f113105M == null || this.f113106N <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(this.f113105M.getResources(), this.f113106N, options);
    }

    /* JADX INFO: renamed from: U */
    public void m138779U(Context context, String str) {
        this.f113105M = context;
        this.f113107O = str;
        this.f113108P = true;
    }

    /* JADX INFO: renamed from: V */
    public void m138780V(String str) {
        this.f113107O = str;
    }

    @Override // p153l.is10, p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        Bitmap bitmapM138776R;
        if (this.f116620F.size() < 2 || !hfjVar.equals(this.f116620F.get(0))) {
            m141853O();
            m141855Q(hfjVar, 0);
            m141855Q(this, 1);
        }
        if (this.f113101I == 0) {
            Bitmap bitmap = this.f113102J;
            if (bitmap == null || bitmap.isRecycled()) {
                if (this.f113106N > 0) {
                    bitmapM138776R = m138778T();
                } else {
                    bitmapM138776R = this.f113108P ? m138776R() : m138777S();
                }
                this.f113102J = bitmapM138776R;
            }
            this.f113101I = pim.m172385a(this.f113102J);
        }
        super.mo96079c(this.f113101I, this, z);
        super.mo96079c(i, hfjVar, z);
    }

    @Override // p153l.is10, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        int i = this.f113101I;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f113101I = 0;
        }
        Bitmap bitmap = this.f113102J;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f113102J.recycle();
        this.f113102J = null;
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\nvoid main(){\n  vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n  float blueColor = texColour.b * 63.0;\n  vec2 quad1;\n  quad1.y = floor(floor(blueColor) / 8.0);\n  quad1.x = floor(blueColor) - (quad1.y * 8.0);\n  vec2 quad2;\n  quad2.y = floor(ceil(blueColor) / 8.0);\n  quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n  vec2 texPos1;\n  texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec2 texPos2;\n  texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n  vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n  vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n  gl_FragColor = mix(texColour, vec4(newColor.rgb, texColour.a), intensity);\n}\n";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return super.mo112467o();
    }

    @Override // p153l.is10, p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
        this.f113104L = GLES20.glGetUniformLocation(this.f193943d, "intensity");
    }

    @Override // p153l.is10, p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        GLES20.glUniform1f(this.f113104L, this.f113103K);
    }
}
