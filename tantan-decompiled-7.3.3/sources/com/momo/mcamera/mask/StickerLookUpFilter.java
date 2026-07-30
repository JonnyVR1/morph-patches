package com.momo.mcamera.mask;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import p153l.gfj;
import p153l.oim;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class StickerLookUpFilter extends FaceDetectFilter {
    private Bitmap lookUpBitmap;
    private int lookup_texture;
    Sticker sticker;
    private int numOfInputs = 2;
    private int[] textureHandle = new int[2 - 1];
    protected int[] texture = new int[2 - 1];

    public StickerLookUpFilter(Sticker sticker) {
        this.sticker = sticker;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        this.lookUpBitmap = BitmapFactory.decodeFile(sticker.getLookUpModel().getLookupPath(), options);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        Bitmap bitmap = this.lookUpBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.lookUpBitmap = null;
        }
        int i = this.lookup_texture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.lookup_texture = 0;
        }
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n  vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n  float blueColor = texColour.b * 63.0;\n  vec2 quad1;\n  quad1.y = floor(floor(blueColor) / 8.0);\n  quad1.x = floor(blueColor) - (quad1.y * 8.0);\n  vec2 quad2;\n  quad2.y = floor(ceil(blueColor) / 8.0);\n  quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n  vec2 texPos1;\n  texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec2 texPos2;\n  texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n  vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n  vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n  gl_FragColor = vec4(newColor.rgb, texColour.a);\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        int i = 0;
        while (i < this.numOfInputs - 1) {
            int[] iArr = this.textureHandle;
            int i2 = this.programHandle;
            StringBuilder sb = new StringBuilder("inputImageTexture");
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        if (this.lookup_texture == 0) {
            this.lookup_texture = oim.m167794a(this.lookUpBitmap);
        }
        this.texture_in = i;
        this.texture[0] = this.lookup_texture;
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        onDrawFrame();
        gfjVar.unlockRenderBuffer();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.texture[0]);
        GLES20.glUniform1i(this.textureHandle[0], 1);
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.lookup_texture;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.lookup_texture = 0;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
    }
}
