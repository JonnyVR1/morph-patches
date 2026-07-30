package p149l;

import android.graphics.Bitmap;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class xem extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f192606a;

    /* JADX INFO: renamed from: b */
    private int f192607b;

    /* JADX INFO: renamed from: c */
    private int f192608c;

    /* JADX INFO: renamed from: d */
    private Bitmap f192609d;

    /* JADX INFO: renamed from: e */
    private float f192610e;

    /* JADX INFO: renamed from: f */
    private int f192611f;

    public xem() {
        super(2);
        this.f192607b = 0;
        this.f192610e = 1.0f;
    }

    @Override // p149l.xj10, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.f192608c;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f192608c = 0;
        }
        Bitmap bitmap = this.f192609d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f192609d.recycle();
        this.f192609d = null;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\nuniform int useLookUp;\nvoid main(){\n  vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n  if(useLookUp == 1){   float blueColor = texColour.b * 63.0;\n  vec2 quad1;\n  quad1.y = floor(floor(blueColor) / 8.0);\n  quad1.x = floor(blueColor) - (quad1.y * 8.0);\n  vec2 quad2;\n  quad2.y = floor(ceil(blueColor) / 8.0);\n  quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n  vec2 texPos1;\n  texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec2 texPos2;\n  texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n  vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n  vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n  gl_FragColor = mix(texColour, vec4(newColor.rgb, texColour.a), intensity);\n  }else{\n  gl_FragColor = texColour;\n  }\n}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f192611f = GLES20.glGetUniformLocation(this.programHandle, "intensity");
        this.f192606a = GLES20.glGetUniformLocation(this.programHandle, "useLookUp");
    }

    @Override // p149l.xj10, p149l.ts2, p149l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            if (this.filterLocations.size() < 2 || !mcjVar.equals(this.filterLocations.get(0))) {
                clearRegisteredFilterLocations();
                registerFilterLocation(mcjVar, 0);
                registerFilterLocation(this, 1);
            }
            Bitmap bitmap = this.f192609d;
            if (bitmap != null) {
                this.f192607b = 1;
                if (this.f192608c == 0) {
                    this.f192608c = lgm.m149781a(bitmap);
                }
            } else {
                this.f192607b = 0;
            }
            super.newTextureReady(this.f192608c, this, z);
            super.newTextureReady(i, mcjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f192611f, this.f192610e);
        GLES20.glUniform1i(this.f192606a, this.f192607b);
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.f192608c;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f192608c = 0;
        }
    }

    public void setIntensity(float f) {
        this.f192610e = f;
    }

    public synchronized void setLookupBitmap(Bitmap bitmap) {
        try {
            int i = this.f192608c;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.f192608c = 0;
            }
            this.f192609d = bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }
}
