package p003l;

import android.opengl.GLES20;
import java.io.File;
import org.spongycastle.crypto.tls.CipherSuite;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zd5 extends AbstractC0341i4 {

    /* JADX INFO: renamed from: a */
    private String[] f9311a;

    /* JADX INFO: renamed from: b */
    private int[] f9312b;

    /* JADX INFO: renamed from: c */
    private int[] f9313c;

    /* JADX INFO: renamed from: d */
    private int f9314d;

    /* JADX INFO: renamed from: e */
    private float f9315e;

    /* JADX INFO: renamed from: f */
    private int f9316f = CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA;

    /* JADX INFO: renamed from: g */
    private int f9317g;

    public zd5() {
        m9406R1();
    }

    /* JADX INFO: renamed from: Q1 */
    private void m9405Q1() {
        int i = 0;
        while (true) {
            int[] iArr = this.f9312b;
            if (i >= iArr.length) {
                return;
            }
            if (iArr[i] > 0) {
                GLES20.glDeleteTextures(1, new int[1], 0);
                this.f9312b[i] = 0;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: R1 */
    private void m9406R1() {
        this.f9317g = 2;
        this.f9312b = new int[2];
        this.f9313c = new int[2];
        this.f9311a = new String[2];
    }

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        m9405Q1();
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform float uTime;\n\nconst float pi = 3.14159;\nconst float stepDis = 1.0 / 8.0;\nconst float perPixel = 1.0 / 512.0;\nconst float halfPixel = 0.5 / 512.0;\n\nvec4 lookup(vec4 color, sampler2D lookupTexture) {\n    float blue = color.b * 63.0;\n    vec2 coord;\n    coord.y = floor(blue / 8.0);\n    coord.x = floor(blue) - (coord.y * 8.0);\n    coord = coord * stepDis + halfPixel + (stepDis - perPixel) * color.xy;\n    return texture2D(lookupTexture, coord);\n}\n\nvoid main() {\n    vec4 inputColor = texture2D(inputImageTexture, textureCoordinate);\n    vec4 lookupColor1 = lookup(inputColor, inputImageTexture1);\n    vec4 lookupColor2 = lookup(inputColor, inputImageTexture2);\n\n    float density = sin(uTime);\n    density = ((density + 1.0) / 2.0);\n\tgl_FragColor = mix(lookupColor2, lookupColor1, density);\n}";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        int i = 0;
        while (i < this.f9317g) {
            int[] iArr = this.f9313c;
            int i2 = this.programHandle;
            StringBuilder sb = new StringBuilder(zs2.UNIFORM_TEXTUREBASE);
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
        this.f9314d = GLES20.glGetUniformLocation(this.programHandle, "uTime");
    }

    @Override // p003l.AbstractC0341i4, p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f9312b;
            if (i2 >= iArr.length) {
                super.newTextureReady(i, mcjVar, z);
                return;
            } else {
                if (iArr[i2] == 0) {
                    iArr[i2] = lgm.m6021a(lgm.m6023c(this.f9311a[i2]));
                }
                i2++;
            }
        }
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        passTextureValues();
        int i = this.f9316f;
        if (i > 0) {
            this.f9315e = (float) (((double) this.f9315e) + (3.141592653589793d / ((double) i)));
        } else {
            this.f9315e = (float) (((double) ((System.currentTimeMillis() % 100000) / 1000.0f)) * 3.141592653589793d);
        }
        GLES20.glUniform1f(this.f9314d, this.f9315e);
    }

    public void passTextureValues() {
        int i = 0;
        int i2 = 0;
        while (i < this.f9317g) {
            if (i == 0) {
                i2 = 33985;
            } else if (i == 1) {
                i2 = 33986;
            }
            GLES20.glActiveTexture(i2);
            GLES20.glBindTexture(3553, this.f9312b[i]);
            int i3 = this.f9313c[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }

    @Override // p003l.mcj, p003l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        m9405Q1();
    }

    @Override // p003l.AbstractC0341i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        String[] strArr = this.f9311a;
        StringBuilder sb = new StringBuilder();
        sb.append(filterOptions.getFolder());
        String str = File.separator;
        sb.append(str);
        sb.append("lut_0.png");
        strArr[0] = sb.toString();
        this.f9311a[1] = filterOptions.getFolder() + str + "lut_1.png";
        this.f9316f = filterOptions.getFrameCost();
    }
}
