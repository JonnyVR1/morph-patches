package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class k3w extends yj10 implements f3w {

    /* JADX INFO: renamed from: I */
    private int f120892I;

    /* JADX INFO: renamed from: J */
    private Bitmap f120893J;

    /* JADX INFO: renamed from: K */
    private float f120894K;

    /* JADX INFO: renamed from: L */
    private int f120895L;

    /* JADX INFO: renamed from: M */
    private Context f120896M;

    /* JADX INFO: renamed from: N */
    private int f120897N;

    /* JADX INFO: renamed from: O */
    private String f120898O;

    /* JADX INFO: renamed from: P */
    private boolean f120899P;

    public k3w() {
        super(2);
        this.f120894K = 1.0f;
        this.f120899P = false;
    }

    /* JADX INFO: renamed from: R */
    private Bitmap m144439R() throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        Bitmap bitmapDecodeStream = null;
        try {
            inputStreamOpen = this.f120896M.getResources().getAssets().open(this.f120898O);
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
    private Bitmap m144440S() {
        if (TextUtils.isEmpty(this.f120898O)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeFile(this.f120898O, options);
    }

    /* JADX INFO: renamed from: T */
    private Bitmap m144441T() {
        if (this.f120896M == null || this.f120897N <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        return BitmapFactory.decodeResource(this.f120896M.getResources(), this.f120897N, options);
    }

    /* JADX INFO: renamed from: U */
    public void m144442U(Context context, String str) {
        this.f120896M = context;
        this.f120898O = str;
        this.f120899P = true;
    }

    /* JADX INFO: renamed from: V */
    public void m144443V(String str) {
        this.f120898O = str;
    }

    @Override // p149l.yj10, p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        Bitmap bitmapM144439R;
        if (this.f198573F.size() < 2 || !ncjVar.equals(this.f198573F.get(0))) {
            m215027O();
            m215029Q(ncjVar, 0);
            m215029Q(this, 1);
        }
        if (this.f120892I == 0) {
            Bitmap bitmap = this.f120893J;
            if (bitmap == null || bitmap.isRecycled()) {
                if (this.f120897N > 0) {
                    bitmapM144439R = m144441T();
                } else {
                    bitmapM144439R = this.f120899P ? m144439R() : m144440S();
                }
                this.f120893J = bitmapM144439R;
            }
            this.f120892I = mgm.m154569a(this.f120893J);
        }
        super.mo102037c(this.f120892I, this, z);
        super.mo102037c(i, ncjVar, z);
    }

    @Override // p149l.yj10, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        int i = this.f120892I;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f120892I = 0;
        }
        Bitmap bitmap = this.f120893J;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f120893J.recycle();
        this.f120893J = null;
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\nvoid main(){\n  vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n  float blueColor = texColour.b * 63.0;\n  vec2 quad1;\n  quad1.y = floor(floor(blueColor) / 8.0);\n  quad1.x = floor(blueColor) - (quad1.y * 8.0);\n  vec2 quad2;\n  quad2.y = floor(ceil(blueColor) / 8.0);\n  quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n  vec2 texPos1;\n  texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec2 texPos2;\n  texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n  vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n  vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n  gl_FragColor = mix(texColour, vec4(newColor.rgb, texColour.a), intensity);\n}\n";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: o */
    public String mo110702o() {
        return super.mo110702o();
    }

    @Override // p149l.yj10, p149l.dcj
    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        super.mo110707t();
        this.f120895L = GLES20.glGetUniformLocation(this.f85418d, "intensity");
    }

    @Override // p149l.yj10, p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        super.mo110710w();
        GLES20.glUniform1f(this.f120895L, this.f120894K);
    }
}
