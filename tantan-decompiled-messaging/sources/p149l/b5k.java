package p149l;

import android.opengl.GLES20;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class b5k extends acj {

    /* JADX INFO: renamed from: h */
    private int f73670h;

    /* JADX INFO: renamed from: i */
    private int f73671i;

    /* JADX INFO: renamed from: j */
    private int f73672j;

    /* JADX INFO: renamed from: k */
    private FloatBuffer f73673k;

    /* JADX INFO: renamed from: l */
    private float[] f73674l = new float[14400];

    /* JADX INFO: renamed from: m */
    private d5k f73675m;

    /* JADX INFO: renamed from: m */
    private FloatBuffer m100340m() {
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
                this.f73674l[i] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d6)));
                this.f73674l[i + 1] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.f73674l[i + 2] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d6)));
                this.f73674l[i + 3] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d4)));
                this.f73674l[i + 4] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                this.f73674l[i + 5] = (float) ((-1.0d) + (Math.sin(d3) * 1.0d * Math.sin(d4)));
                this.f73674l[i + 6] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d6)));
                this.f73674l[i + 7] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                this.f73674l[i + 8] = (float) ((-1.0d) + (Math.sin(d3) * 1.0d * Math.sin(d6)));
                this.f73674l[i + 9] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d6)));
                this.f73674l[i + 10] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.f73674l[i + 11] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d6)));
                this.f73674l[i + 12] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d4)));
                this.f73674l[i + 13] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.f73674l[i + 14] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d4)));
                this.f73674l[i + 15] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d4)));
                int i4 = i + 17;
                this.f73674l[i + 16] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                i += 18;
                this.f73674l[i4] = (float) ((-1.0d) + (1.0d * Math.sin(d3) * Math.sin(d4)));
                i3 += 9;
                d = 3.141592653589793d;
                d2 = 180.0d;
            }
        }
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(this.f73674l.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f73674l);
        this.f73673k = floatBufferPut;
        floatBufferPut.position(0);
        return this.f73673k;
    }

    @Override // p149l.acj
    /* JADX INFO: renamed from: e */
    public void mo95809e() {
        int iM215835b = yre0.m215835b("attribute vec2 vPosition;            \nvoid main(){                         \n   gl_Position = vec4(vPosition,0,1);\n}", "precision mediump float;         \nuniform vec4 uColor;             \nvoid main(){                     \n   gl_FragColor = uColor;        \n}");
        this.f73670h = iM215835b;
        this.f73671i = GLES20.glGetAttribLocation(iM215835b, "vPosition");
        this.f73672j = GLES20.glGetUniformLocation(this.f73670h, "uColor");
        this.f73673k = m100340m();
    }

    @Override // p149l.acj
    /* JADX INFO: renamed from: g */
    public void mo95811g(gcj gcjVar) {
        double dCurrentTimeMillis = System.currentTimeMillis();
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        for (int i = 0; i < 1500; i++) {
            GLES20.glUseProgram(this.f73670h);
            GLES20.glVertexAttribPointer(this.f73671i, 3, 5126, false, 12, (Buffer) this.f73673k);
            GLES20.glEnableVertexAttribArray(this.f73671i);
            GLES20.glUniform4f(this.f73672j, 0.0f, 1.0f, 0.0f, 1.0f);
            GLES20.glDrawArrays(4, 0, 4800);
        }
        this.f73675m.getRenderTime(System.currentTimeMillis() - dCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: n */
    public void m100341n(d5k d5kVar) {
        this.f73675m = d5kVar;
    }

    @Override // p149l.acj
    /* JADX INFO: renamed from: f */
    public void mo95810f() {
    }

    @Override // p149l.acj
    /* JADX INFO: renamed from: h */
    public void mo95812h() {
    }
}
