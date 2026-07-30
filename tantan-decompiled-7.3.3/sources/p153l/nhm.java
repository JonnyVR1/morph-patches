package p153l;

import android.graphics.Bitmap;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class nhm extends hs10 {

    /* JADX INFO: renamed from: a */
    private int f142005a;

    /* JADX INFO: renamed from: b */
    private int f142006b;

    /* JADX INFO: renamed from: c */
    private int f142007c;

    /* JADX INFO: renamed from: d */
    private Bitmap f142008d;

    /* JADX INFO: renamed from: e */
    private float f142009e;

    /* JADX INFO: renamed from: f */
    private int f142010f;

    public nhm() {
        super(2);
        this.f142006b = 0;
        this.f142009e = 1.0f;
    }

    @Override // p153l.hs10, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.f142007c;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f142007c = 0;
        }
        Bitmap bitmap = this.f142008d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f142008d.recycle();
        this.f142008d = null;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\nuniform int useLookUp;\nvoid main(){\n  vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n  if(useLookUp == 1){   float blueColor = texColour.b * 63.0;\n  vec2 quad1;\n  quad1.y = floor(floor(blueColor) / 8.0);\n  quad1.x = floor(blueColor) - (quad1.y * 8.0);\n  vec2 quad2;\n  quad2.y = floor(ceil(blueColor) / 8.0);\n  quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n  vec2 texPos1;\n  texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec2 texPos2;\n  texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n  vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n  vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n  gl_FragColor = mix(texColour, vec4(newColor.rgb, texColour.a), intensity);\n  }else{\n  gl_FragColor = texColour;\n  }\n}\n";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f142010f = GLES20.glGetUniformLocation(this.programHandle, "intensity");
        this.f142005a = GLES20.glGetUniformLocation(this.programHandle, "useLookUp");
    }

    @Override // p153l.hs10, p153l.jt2, p153l.dfj
    public synchronized void newTextureReady(int i, gfj gfjVar, boolean z) {
        try {
            if (this.filterLocations.size() < 2 || !gfjVar.equals(this.filterLocations.get(0))) {
                clearRegisteredFilterLocations();
                registerFilterLocation(gfjVar, 0);
                registerFilterLocation(this, 1);
            }
            Bitmap bitmap = this.f142008d;
            if (bitmap != null) {
                this.f142006b = 1;
                if (this.f142007c == 0) {
                    this.f142007c = oim.m167794a(bitmap);
                }
            } else {
                this.f142006b = 0;
            }
            super.newTextureReady(this.f142007c, this, z);
            super.newTextureReady(i, gfjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f142010f, this.f142009e);
        GLES20.glUniform1i(this.f142005a, this.f142006b);
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.f142007c;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f142007c = 0;
        }
    }

    public void setIntensity(float f) {
        this.f142009e = f;
    }

    public synchronized void setLookupBitmap(Bitmap bitmap) {
        try {
            int i = this.f142007c;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.f142007c = 0;
            }
            this.f142008d = bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }
}
