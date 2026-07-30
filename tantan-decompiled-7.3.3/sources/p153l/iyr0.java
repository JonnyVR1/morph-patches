package p153l;

import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.MovieHeaderBox;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class iyr0 extends zox0 {

    /* JADX INFO: renamed from: l */
    public Date f117623l;

    /* JADX INFO: renamed from: m */
    public Date f117624m;

    /* JADX INFO: renamed from: n */
    public long f117625n;

    /* JADX INFO: renamed from: o */
    public long f117626o;

    /* JADX INFO: renamed from: p */
    public double f117627p;

    /* JADX INFO: renamed from: q */
    public float f117628q;

    /* JADX INFO: renamed from: r */
    public jpx0 f117629r;

    /* JADX INFO: renamed from: s */
    public long f117630s;

    public iyr0() {
        super(MovieHeaderBox.TYPE);
        this.f117627p = 1.0d;
        this.f117628q = 1.0f;
        this.f117629r = jpx0.f122157j;
    }

    @Override // p153l.xox0
    /* JADX INFO: renamed from: c */
    public final void mo99380c(ByteBuffer byteBuffer) {
        m220799g(byteBuffer);
        if (m220798f() == 1) {
            this.f117623l = epx0.m121886a(eyr0.m123241f(byteBuffer));
            this.f117624m = epx0.m121886a(eyr0.m123241f(byteBuffer));
            this.f117625n = eyr0.m123240e(byteBuffer);
            this.f117626o = eyr0.m123241f(byteBuffer);
        } else {
            this.f117623l = epx0.m121886a(eyr0.m123240e(byteBuffer));
            this.f117624m = epx0.m121886a(eyr0.m123240e(byteBuffer));
            this.f117625n = eyr0.m123240e(byteBuffer);
            this.f117626o = eyr0.m123240e(byteBuffer);
        }
        this.f117627p = eyr0.m123237b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f117628q = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        eyr0.m123239d(byteBuffer);
        eyr0.m123240e(byteBuffer);
        eyr0.m123240e(byteBuffer);
        this.f117629r = new jpx0(eyr0.m123237b(byteBuffer), eyr0.m123237b(byteBuffer), eyr0.m123237b(byteBuffer), eyr0.m123237b(byteBuffer), eyr0.m123236a(byteBuffer), eyr0.m123236a(byteBuffer), eyr0.m123236a(byteBuffer), eyr0.m123237b(byteBuffer), eyr0.m123237b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f117630s = eyr0.m123240e(byteBuffer);
    }

    /* JADX INFO: renamed from: h */
    public final long m142719h() {
        return this.f117626o;
    }

    /* JADX INFO: renamed from: i */
    public final long m142720i() {
        return this.f117625n;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f117623l + ";modificationTime=" + this.f117624m + ";timescale=" + this.f117625n + ";duration=" + this.f117626o + ";rate=" + this.f117627p + ";volume=" + this.f117628q + ";matrix=" + this.f117629r + ";nextTrackId=" + this.f117630s + Constants.AES_SUFFIX;
    }
}
