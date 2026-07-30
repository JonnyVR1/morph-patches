package com.tencent.liteav.beauty.p093b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.beauty.C14100d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.z */
/* JADX INFO: loaded from: classes2.dex */
public class C14098z extends C14015h {

    /* JADX INFO: renamed from: B */
    private String f58820B;

    /* JADX INFO: renamed from: r */
    protected a[] f58821r;

    /* JADX INFO: renamed from: s */
    protected List<C14100d.f> f58822s;

    /* JADX INFO: renamed from: t */
    protected boolean f58823t;

    /* JADX INFO: renamed from: u */
    protected int f58824u;

    /* JADX INFO: renamed from: w */
    protected ShortBuffer f58825w;

    /* JADX INFO: renamed from: x */
    private a f58826x;

    /* JADX INFO: renamed from: y */
    private int f58827y;

    /* JADX INFO: renamed from: v */
    protected static final short[] f58818v = {1, 2, 0, 2, 0, 3};

    /* JADX INFO: renamed from: z */
    private static final float[] f58819z = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: A */
    private static final float[] f58817A = {0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.b.z$a */
    public class a {

        /* JADX INFO: renamed from: c */
        public Bitmap f58830c;

        /* JADX INFO: renamed from: a */
        public FloatBuffer f58828a = null;

        /* JADX INFO: renamed from: b */
        public FloatBuffer f58829b = null;

        /* JADX INFO: renamed from: d */
        public int[] f58831d = null;

        public a() {
        }
    }

    public C14098z(String str, String str2) {
        super(str, str2);
        this.f58821r = null;
        this.f58826x = null;
        this.f58822s = null;
        this.f58823t = false;
        this.f58824u = 1;
        this.f58827y = 1;
        this.f58825w = null;
        this.f58820B = "GPUWatermark";
        short[] sArr = f58818v;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f58825w = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f58825w.position(0);
        this.f58182o = true;
    }

    /* JADX INFO: renamed from: q */
    private void m83167q() {
        if (this.f58821r != null) {
            int i = 0;
            while (true) {
                a[] aVarArr = this.f58821r;
                if (i >= aVarArr.length) {
                    break;
                }
                a aVar = aVarArr[i];
                if (aVar != null) {
                    int[] iArr = aVar.f58831d;
                    if (iArr != null) {
                        GLES20.glDeleteTextures(1, iArr, 0);
                    }
                    a[] aVarArr2 = this.f58821r;
                    a aVar2 = aVarArr2[i];
                    aVar2.f58831d = null;
                    aVar2.f58830c = null;
                    aVarArr2[i] = null;
                }
                i++;
            }
        }
        this.f58821r = null;
    }

    /* JADX INFO: renamed from: a */
    public void m83170a(Bitmap bitmap, float f, float f2, float f3, int i) {
        a aVar;
        a[] aVarArr = this.f58821r;
        if (bitmap == null) {
            if (aVarArr == null || (aVar = aVarArr[i]) == null) {
                return;
            }
            int[] iArr = aVar.f58831d;
            if (iArr != null) {
                GLES20.glDeleteTextures(1, iArr, 0);
            }
            a[] aVarArr2 = this.f58821r;
            a aVar2 = aVarArr2[i];
            aVar2.f58831d = null;
            aVar2.f58830c = null;
            aVarArr2[i] = null;
            return;
        }
        if (aVarArr[i] == null || i >= aVarArr.length) {
            Log.e(this.f58820B, "index is too large for mSzWaterMark!");
            return;
        }
        m83168a(bitmap.getWidth(), bitmap.getHeight(), f, f2, f3, i);
        a aVar3 = this.f58821r[i];
        if (aVar3.f58831d == null) {
            int[] iArr2 = new int[1];
            aVar3.f58831d = iArr2;
            GLES20.glGenTextures(1, iArr2, 0);
            GLES20.glBindTexture(3553, this.f58821r[i].f58831d[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        Bitmap bitmap2 = this.f58821r[i].f58830c;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            GLES20.glBindTexture(3553, this.f58821r[i].f58831d[0]);
            if (bitmap.isRecycled()) {
                TXCLog.m82966e(this.f58820B, "SetWaterMark when bitmap is recycled");
            } else {
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            }
        }
        this.f58821r[i].f58830c = bitmap;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: d */
    public void mo82806d() {
        super.mo82806d();
        this.f58823t = false;
        m83167q();
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: j */
    public void mo82812j() {
        super.mo82812j();
        if (!this.f58823t) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(this.f58824u, 771);
        GLES20.glActiveTexture(33984);
        int i = 0;
        while (true) {
            a[] aVarArr = this.f58821r;
            if (i >= aVarArr.length) {
                GLES20.glDisable(3042);
                return;
            }
            a aVar = aVarArr[i];
            if (aVar != null) {
                GLES20.glBindTexture(3553, aVar.f58831d[0]);
                GLES20.glUniform1i(this.f58170c, 0);
                GLES20.glVertexAttribPointer(this.f58169b, 2, 5126, false, 8, (Buffer) this.f58821r[i].f58828a);
                GLES20.glEnableVertexAttribArray(this.f58169b);
                GLES20.glVertexAttribPointer(this.f58171d, 4, 5126, false, 16, (Buffer) this.f58821r[i].f58829b);
                GLES20.glEnableVertexAttribArray(this.f58171d);
                GLES20.glDrawElements(4, f58818v.length, 5123, this.f58825w);
                GLES20.glDisableVertexAttribArray(this.f58169b);
                GLES20.glDisableVertexAttribArray(this.f58171d);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m83171d(boolean z) {
        this.f58823t = z;
    }

    public C14098z() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    /* JADX INFO: renamed from: a */
    public void m83168a(int i, int i2, float f, float f2, float f3, int i3) {
        float[] fArr = f58819z;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.f58821r[i3].f58828a = byteBufferAllocateDirect.asFloatBuffer();
        float[] fArr2 = new float[fArr.length];
        float f4 = (((i2 / i) * f3) * this.f58172e) / this.f58173f;
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
        this.f58821r[i3].f58828a.put(fArr2);
        this.f58821r[i3].f58828a.position(0);
        float[] fArr3 = f58817A;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr3.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.f58821r[i3].f58829b = byteBufferAllocateDirect2.asFloatBuffer();
        this.f58821r[i3].f58829b.put(fArr3);
        this.f58821r[i3].f58829b.position(0);
    }

    /* JADX INFO: renamed from: a */
    public void m83169a(Bitmap bitmap, float f, float f2, float f3) {
        if (this.f58821r == null) {
            this.f58821r = new a[1];
        }
        a[] aVarArr = this.f58821r;
        if (aVarArr[0] == null) {
            aVarArr[0] = new a();
        }
        m83170a(bitmap, f, f2, f3, 0);
        this.f58826x = this.f58821r[0];
    }
}
