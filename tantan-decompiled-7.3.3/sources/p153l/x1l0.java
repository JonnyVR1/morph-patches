package p153l;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class x1l0 {

    /* JADX INFO: renamed from: a */
    public final float[] f192078a = new float[20];

    /* JADX INFO: renamed from: b */
    public final long[] f192079b = new long[20];

    /* JADX INFO: renamed from: c */
    public float f192080c = 0.0f;

    /* JADX INFO: renamed from: d */
    public int f192081d = 0;

    /* JADX INFO: renamed from: e */
    public int f192082e = 0;

    /* JADX INFO: renamed from: f */
    public static float m209095f(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    /* JADX INFO: renamed from: a */
    public void m209096a(@NonNull MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f192081d != 0 && eventTime - this.f192079b[this.f192082e] > 40) {
            m209097b();
        }
        int i = (this.f192082e + 1) % 20;
        this.f192082e = i;
        int i2 = this.f192081d;
        if (i2 != 20) {
            this.f192081d = i2 + 1;
        }
        this.f192078a[i] = motionEvent.getAxisValue(26);
        this.f192079b[this.f192082e] = eventTime;
    }

    /* JADX INFO: renamed from: b */
    public final void m209097b() {
        this.f192081d = 0;
        this.f192080c = 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public void m209098c(int i, float f) {
        float fM209100e = m209100e() * i;
        this.f192080c = fM209100e;
        if (fM209100e < (-Math.abs(f))) {
            this.f192080c = -Math.abs(f);
        } else if (this.f192080c > Math.abs(f)) {
            this.f192080c = Math.abs(f);
        }
    }

    /* JADX INFO: renamed from: d */
    public float m209099d(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f192080c;
    }

    /* JADX INFO: renamed from: e */
    public final float m209100e() {
        long[] jArr;
        long j;
        int i;
        int i2 = this.f192081d;
        if (i2 < 2) {
            return 0.0f;
        }
        int i3 = this.f192082e;
        int i4 = ((i3 + 20) - (i2 - 1)) % 20;
        long j2 = this.f192079b[i3];
        while (true) {
            jArr = this.f192079b;
            j = jArr[i4];
            long j3 = j2 - j;
            i = this.f192081d;
            if (j3 <= 100) {
                break;
            }
            this.f192081d = i - 1;
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
            return this.f192078a[i5] / (j4 - j);
        }
        float fAbs = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f192081d - 1; i7++) {
            int i8 = i7 + i4;
            long[] jArr2 = this.f192079b;
            long j5 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j5) {
                i6++;
                float fM209095f = m209095f(fAbs);
                float f = this.f192078a[i9] / (this.f192079b[i9] - j5);
                fAbs += (f - fM209095f) * Math.abs(f);
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return m209095f(fAbs);
    }
}
