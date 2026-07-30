package com.tencent.liteav.beauty.p098b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.beauty.C14263d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.z */
/* JADX INFO: loaded from: classes2.dex */
public class C14261z extends C14178h {

    /* JADX INFO: renamed from: B */
    private String f59668B;

    /* JADX INFO: renamed from: r */
    protected a[] f59669r;

    /* JADX INFO: renamed from: s */
    protected List<C14263d.f> f59670s;

    /* JADX INFO: renamed from: t */
    protected boolean f59671t;

    /* JADX INFO: renamed from: u */
    protected int f59672u;

    /* JADX INFO: renamed from: w */
    protected ShortBuffer f59673w;

    /* JADX INFO: renamed from: x */
    private a f59674x;

    /* JADX INFO: renamed from: y */
    private int f59675y;

    /* JADX INFO: renamed from: v */
    protected static final short[] f59666v = {1, 2, 0, 2, 0, 3};

    /* JADX INFO: renamed from: z */
    private static final float[] f59667z = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: A */
    private static final float[] f59665A = {0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.z$a */
    public class a {

        /* JADX INFO: renamed from: c */
        public Bitmap f59678c;

        /* JADX INFO: renamed from: a */
        public FloatBuffer f59676a = null;

        /* JADX INFO: renamed from: b */
        public FloatBuffer f59677b = null;

        /* JADX INFO: renamed from: d */
        public int[] f59679d = null;

        public a() {
        }
    }

    public C14261z(String str, String str2) {
        super(str, str2);
        this.f59669r = null;
        this.f59674x = null;
        this.f59670s = null;
        this.f59671t = false;
        this.f59672u = 1;
        this.f59675y = 1;
        this.f59673w = null;
        this.f59668B = "GPUWatermark";
        short[] sArr = f59666v;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f59673w = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f59673w.position(0);
        this.f59030o = true;
    }

    /* JADX INFO: renamed from: q */
    private void m84350q() {
        if (this.f59669r != null) {
            int i = 0;
            while (true) {
                a[] aVarArr = this.f59669r;
                if (i >= aVarArr.length) {
                    break;
                }
                a aVar = aVarArr[i];
                if (aVar != null) {
                    int[] iArr = aVar.f59679d;
                    if (iArr != null) {
                        GLES20.glDeleteTextures(1, iArr, 0);
                    }
                    a[] aVarArr2 = this.f59669r;
                    a aVar2 = aVarArr2[i];
                    aVar2.f59679d = null;
                    aVar2.f59678c = null;
                    aVarArr2[i] = null;
                }
                i++;
            }
        }
        this.f59669r = null;
    }

    /* JADX INFO: renamed from: a */
    public void m84353a(Bitmap bitmap, float f, float f2, float f3, int i) {
        a aVar;
        a[] aVarArr = this.f59669r;
        if (bitmap == null) {
            if (aVarArr == null || (aVar = aVarArr[i]) == null) {
                return;
            }
            int[] iArr = aVar.f59679d;
            if (iArr != null) {
                GLES20.glDeleteTextures(1, iArr, 0);
            }
            a[] aVarArr2 = this.f59669r;
            a aVar2 = aVarArr2[i];
            aVar2.f59679d = null;
            aVar2.f59678c = null;
            aVarArr2[i] = null;
            return;
        }
        if (aVarArr[i] == null || i >= aVarArr.length) {
            Log.e(this.f59668B, "index is too large for mSzWaterMark!");
            return;
        }
        m84351a(bitmap.getWidth(), bitmap.getHeight(), f, f2, f3, i);
        a aVar3 = this.f59669r[i];
        if (aVar3.f59679d == null) {
            int[] iArr2 = new int[1];
            aVar3.f59679d = iArr2;
            GLES20.glGenTextures(1, iArr2, 0);
            GLES20.glBindTexture(3553, this.f59669r[i].f59679d[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        Bitmap bitmap2 = this.f59669r[i].f59678c;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            GLES20.glBindTexture(3553, this.f59669r[i].f59679d[0]);
            if (bitmap.isRecycled()) {
                TXCLog.m84149e(this.f59668B, "SetWaterMark when bitmap is recycled");
            } else {
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            }
        }
        this.f59669r[i].f59678c = bitmap;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: d */
    public void mo83989d() {
        super.mo83989d();
        this.f59671t = false;
        m84350q();
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: j */
    public void mo83995j() {
        super.mo83995j();
        if (!this.f59671t) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(this.f59672u, 771);
        GLES20.glActiveTexture(33984);
        int i = 0;
        while (true) {
            a[] aVarArr = this.f59669r;
            if (i >= aVarArr.length) {
                GLES20.glDisable(3042);
                return;
            }
            a aVar = aVarArr[i];
            if (aVar != null) {
                GLES20.glBindTexture(3553, aVar.f59679d[0]);
                GLES20.glUniform1i(this.f59018c, 0);
                GLES20.glVertexAttribPointer(this.f59017b, 2, 5126, false, 8, (Buffer) this.f59669r[i].f59676a);
                GLES20.glEnableVertexAttribArray(this.f59017b);
                GLES20.glVertexAttribPointer(this.f59019d, 4, 5126, false, 16, (Buffer) this.f59669r[i].f59677b);
                GLES20.glEnableVertexAttribArray(this.f59019d);
                GLES20.glDrawElements(4, f59666v.length, 5123, this.f59673w);
                GLES20.glDisableVertexAttribArray(this.f59017b);
                GLES20.glDisableVertexAttribArray(this.f59019d);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m84354d(boolean z) {
        this.f59671t = z;
    }

    public C14261z() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    /* JADX INFO: renamed from: a */
    public void m84351a(int i, int i2, float f, float f2, float f3, int i3) {
        float[] fArr = f59667z;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.f59669r[i3].f59676a = byteBufferAllocateDirect.asFloatBuffer();
        float[] fArr2 = new float[fArr.length];
        float f4 = (((i2 / i) * f3) * this.f59020e) / this.f59021f;
        float f5 = (f * 2.0f) - 1.0f;
        fArr2[0] = f5;
        float f6 = 1.0f - (f2 * 2.0f);
        fArr2[1] = f6;
        fArr2[2] = f5;
        float f7 = f6 - (f4 * 2.0f);
        fArr2[3] = f7;
        float f8 = f5 + (f3 * 2.0f);
        fArr2[4] = f8;
        fArr2[5] = f7;
        fArr2[6] = f8;
        fArr2[7] = f6;
        for (int i4 = 1; i4 <= 7; i4 += 2) {
            fArr2[i4] = fArr2[i4] * (-1.0f);
        }
        this.f59669r[i3].f59676a.put(fArr2);
        this.f59669r[i3].f59676a.position(0);
        float[] fArr3 = f59665A;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr3.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.f59669r[i3].f59677b = byteBufferAllocateDirect2.asFloatBuffer();
        this.f59669r[i3].f59677b.put(fArr3);
        this.f59669r[i3].f59677b.position(0);
    }

    /* JADX INFO: renamed from: a */
    public void m84352a(Bitmap bitmap, float f, float f2, float f3) {
        if (this.f59669r == null) {
            this.f59669r = new a[1];
        }
        a[] aVarArr = this.f59669r;
        if (aVarArr[0] == null) {
            aVarArr[0] = new a();
        }
        m84353a(bitmap, f, f2, f3, 0);
        this.f59674x = this.f59669r[0];
    }
}
