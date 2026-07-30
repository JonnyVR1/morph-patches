package p153l;

import android.opengl.GLES20;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class t7k extends uej {

    /* JADX INFO: renamed from: h */
    private int f172445h;

    /* JADX INFO: renamed from: i */
    private int f172446i;

    /* JADX INFO: renamed from: j */
    private int f172447j;

    /* JADX INFO: renamed from: k */
    private FloatBuffer f172448k;

    /* JADX INFO: renamed from: l */
    private float[] f172449l = new float[14400];

    /* JADX INFO: renamed from: m */
    private v7k f172450m;

    /* JADX INFO: renamed from: m */
    private FloatBuffer m189617m() {
        int i = 0;
        for (int i2 = 0; i2 < 180; i2 += 9) {
            double d = 3.141592653589793d;
            double d2 = 180.0d;
            double d3 = (((double) i2) * 3.141592653589793d) / 180.0d;
            int i3 = 0;
            while (i3 < 360) {
                double d4 = (((double) i3) * d) / d2;
                double d5 = d3 + 0.15707963267948966d;
                double d6 = 0.15707963267948966d + d4;
                this.f172449l[i] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d6)));
                this.f172449l[i + 1] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.f172449l[i + 2] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d6)));
                this.f172449l[i + 3] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d4)));
                this.f172449l[i + 4] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                this.f172449l[i + 5] = (float) ((-1.0d) + (Math.sin(d3) * 1.0d * Math.sin(d4)));
                this.f172449l[i + 6] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d6)));
                this.f172449l[i + 7] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                this.f172449l[i + 8] = (float) ((-1.0d) + (Math.sin(d3) * 1.0d * Math.sin(d6)));
                this.f172449l[i + 9] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d6)));
                this.f172449l[i + 10] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.f172449l[i + 11] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d6)));
                this.f172449l[i + 12] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d4)));
                this.f172449l[i + 13] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.f172449l[i + 14] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d4)));
                this.f172449l[i + 15] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d4)));
                int i4 = i + 17;
                this.f172449l[i + 16] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                i += 18;
                this.f172449l[i4] = (float) ((-1.0d) + (1.0d * Math.sin(d3) * Math.sin(d4)));
                i3 += 9;
                d = 3.141592653589793d;
                d2 = 180.0d;
            }
        }
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(this.f172449l.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f172449l);
        this.f172448k = floatBufferPut;
        floatBufferPut.position(0);
        return this.f172448k;
    }

    @Override // p153l.uej
    /* JADX INFO: renamed from: e */
    public void mo189618e() {
        int iM123483b = f0f0.m123483b("attribute vec2 vPosition;            \nvoid main(){                         \n   gl_Position = vec4(vPosition,0,1);\n}", "precision mediump float;         \nuniform vec4 uColor;             \nvoid main(){                     \n   gl_FragColor = uColor;        \n}");
        this.f172445h = iM123483b;
        this.f172446i = GLES20.glGetAttribLocation(iM123483b, "vPosition");
        this.f172447j = GLES20.glGetUniformLocation(this.f172445h, "uColor");
        this.f172448k = m189617m();
    }

    @Override // p153l.uej
    /* JADX INFO: renamed from: g */
    public void mo189620g(afj afjVar) {
        double dCurrentTimeMillis = System.currentTimeMillis();
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        for (int i = 0; i < 1500; i++) {
            GLES20.glUseProgram(this.f172445h);
            GLES20.glVertexAttribPointer(this.f172446i, 3, 5126, false, 12, (Buffer) this.f172448k);
            GLES20.glEnableVertexAttribArray(this.f172446i);
            GLES20.glUniform4f(this.f172447j, 0.0f, 1.0f, 0.0f, 1.0f);
            GLES20.glDrawArrays(4, 0, 4800);
        }
        this.f172450m.getRenderTime(System.currentTimeMillis() - dCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: n */
    public void m189622n(v7k v7kVar) {
        this.f172450m = v7kVar;
    }

    @Override // p153l.uej
    /* JADX INFO: renamed from: f */
    public void mo189619f() {
    }

    @Override // p153l.uej
    /* JADX INFO: renamed from: h */
    public void mo189621h() {
    }
}
