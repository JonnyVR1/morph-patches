package p149l;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class rsk0 {

    /* JADX INFO: renamed from: a */
    public final float[] f160874a = new float[20];

    /* JADX INFO: renamed from: b */
    public final long[] f160875b = new long[20];

    /* JADX INFO: renamed from: c */
    public float f160876c = 0.0f;

    /* JADX INFO: renamed from: d */
    public int f160877d = 0;

    /* JADX INFO: renamed from: e */
    public int f160878e = 0;

    /* JADX INFO: renamed from: f */
    public static float m180686f(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    /* JADX INFO: renamed from: a */
    public void m180687a(@NonNull MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f160877d != 0 && eventTime - this.f160875b[this.f160878e] > 40) {
            m180688b();
        }
        int i = (this.f160878e + 1) % 20;
        this.f160878e = i;
        int i2 = this.f160877d;
        if (i2 != 20) {
            this.f160877d = i2 + 1;
        }
        this.f160874a[i] = motionEvent.getAxisValue(26);
        this.f160875b[this.f160878e] = eventTime;
    }

    /* JADX INFO: renamed from: b */
    public final void m180688b() {
        this.f160877d = 0;
        this.f160876c = 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public void m180689c(int i, float f) {
        float fM180691e = m180691e() * i;
        this.f160876c = fM180691e;
        if (fM180691e < (-Math.abs(f))) {
            this.f160876c = -Math.abs(f);
        } else if (this.f160876c > Math.abs(f)) {
            this.f160876c = Math.abs(f);
        }
    }

    /* JADX INFO: renamed from: d */
    public float m180690d(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f160876c;
    }

    /* JADX INFO: renamed from: e */
    public final float m180691e() {
        long[] jArr;
        long j;
        int i;
        int i2 = this.f160877d;
        if (i2 < 2) {
            return 0.0f;
        }
        int i3 = this.f160878e;
        int i4 = ((i3 + 20) - (i2 - 1)) % 20;
        long j2 = this.f160875b[i3];
        while (true) {
            jArr = this.f160875b;
            j = jArr[i4];
            long j3 = j2 - j;
            i = this.f160877d;
            if (j3 <= 100) {
                break;
            }
            this.f160877d = i - 1;
            i4 = (i4 + 1) % 20;
        }
        if (i < 2) {
            return 0.0f;
        }
        if (i == 2) {
            int i5 = (i4 + 1) % 20;
            long j4 = jArr[i5];
            if (j == j4) {
                return 0.0f;
            }
            return this.f160874a[i5] / (j4 - j);
        }
        float fAbs = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f160877d - 1; i7++) {
            int i8 = i7 + i4;
            long[] jArr2 = this.f160875b;
            long j5 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j5) {
                i6++;
                float fM180686f = m180686f(fAbs);
                float f = this.f160874a[i9] / (this.f160875b[i9] - j5);
                fAbs += (f - fM180686f) * Math.abs(f);
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return m180686f(fAbs);
    }
}
