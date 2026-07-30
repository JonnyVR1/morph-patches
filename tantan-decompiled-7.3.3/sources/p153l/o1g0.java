package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes3.dex */
public class o1g0 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f144640a;

    /* JADX INFO: renamed from: c */
    public C19723r1 f144642c;

    /* JADX INFO: renamed from: d */
    public int f144643d;

    /* JADX INFO: renamed from: e */
    public int f144644e;

    /* JADX INFO: renamed from: f */
    public int f144645f;

    /* JADX INFO: renamed from: g */
    public int f144646g;

    /* JADX INFO: renamed from: h */
    public int[] f144647h;

    /* JADX INFO: renamed from: j */
    public List<Bitmap> f144649j;

    /* JADX INFO: renamed from: k */
    public Bitmap f144650k;

    /* JADX INFO: renamed from: l */
    public Bitmap f144651l;

    /* JADX INFO: renamed from: i */
    @NonNull
    public Bitmap.Config f144648i = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b */
    public C19950s1 f144641b = new C19950s1();

    /* JADX INFO: renamed from: n */
    public static void m165594n(int i, byte[] bArr, int i2) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, 4);
        if (i2 > 0) {
            crc32.update(bArr, i + 4, i2);
        }
        m165595o((int) crc32.getValue(), bArr, i + 4 + i2);
    }

    /* JADX INFO: renamed from: o */
    public static void m165595o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: a */
    public final void m165596a(byte[] bArr, int i) {
        int i2 = this.f144642c.f160745p;
        if (i2 != 0) {
            this.f144640a.position(i2);
            this.f144640a.get(bArr, i, 12);
            return;
        }
        byte[] bArr2 = {0, 0, 0, 0, 73, 69, 78, 68};
        for (int i3 = 0; i3 < 8; i3++) {
            bArr[i] = bArr2[i3];
            i++;
        }
        m165594n(i - 4, bArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public void m165597b() {
        this.f144643d = (this.f144643d + 1) % this.f144642c.f180003b;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m165598c() {
        if (this.f144649j.get(this.f144643d) == null) {
            C19485q1 c19485q1 = (C19485q1) this.f144642c.f180005d.get(this.f144643d);
            int i = this.f144643d - 1;
            C19485q1 c19485q2 = i >= 0 ? (C19485q1) this.f144642c.f180005d.get(i) : null;
            Bitmap bitmapM165599d = m165599d(c19485q1);
            if (this.f144642c.f160744o && c19485q2 == null) {
                int[] iArr = this.f144647h;
                int i2 = this.f144645f;
                bitmapM165599d.getPixels(iArr, 0, i2, 0, 0, i2, this.f144646g);
                Bitmap bitmap = this.f144650k;
                int[] iArr2 = this.f144647h;
                int i3 = this.f144645f;
                bitmap.setPixels(iArr2, 0, i3, 0, 0, i3, this.f144646g);
                this.f144649j.add(this.f144643d, bitmapM165599d);
            } else {
                Bitmap bitmapM165603h = m165603h();
                Canvas canvas = new Canvas(bitmapM165603h);
                if (c19485q2 == null) {
                    canvas.drawBitmap(this.f144651l, 0.0f, 0.0f, (Paint) null);
                } else {
                    canvas.drawBitmap(this.f144650k, 0.0f, 0.0f, (Paint) null);
                }
                if (c19485q1.f155131i == 0) {
                    int i4 = c19485q1.f155129g;
                    int i5 = c19485q1.f155130h;
                    canvas.clipRect(i4, i5, c19485q1.f155127e + i4, c19485q1.f155128f + i5);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    canvas.clipRect(0, 0, this.f144645f, this.f144646g);
                }
                canvas.drawBitmap(bitmapM165599d, c19485q1.f155129g, c19485q1.f155130h, (Paint) null);
                canvas.setBitmap(null);
                bitmapM165599d.recycle();
                int i6 = c19485q1.f175343a;
                if (i6 == 0 || i6 == 1 || i6 == 2) {
                    int[] iArr3 = this.f144647h;
                    int i7 = this.f144645f;
                    bitmapM165603h.getPixels(iArr3, 0, i7, 0, 0, i7, this.f144646g);
                    Bitmap bitmap2 = this.f144650k;
                    int[] iArr4 = this.f144647h;
                    int i8 = this.f144645f;
                    bitmap2.setPixels(iArr4, 0, i8, 0, 0, i8, this.f144646g);
                    if (c19485q1.f175343a == 2) {
                        for (int i9 = c19485q1.f155129g; i9 < c19485q1.f155129g + c19485q1.f155127e; i9++) {
                            for (int i10 = c19485q1.f155130h; i10 < c19485q1.f155130h + c19485q1.f155128f; i10++) {
                                this.f144650k.setPixel(i9, i10, 0);
                            }
                        }
                    }
                } else if (i6 == 3 && c19485q2 == null) {
                    Bitmap bitmap3 = this.f144651l;
                    int[] iArr5 = this.f144647h;
                    int i11 = this.f144645f;
                    bitmap3.getPixels(iArr5, 0, i11, 0, 0, i11, this.f144646g);
                    Bitmap bitmap4 = this.f144650k;
                    int[] iArr6 = this.f144647h;
                    int i12 = this.f144645f;
                    bitmap4.setPixels(iArr6, 0, i12, 0, 0, i12, this.f144646g);
                }
                this.f144649j.add(this.f144643d, bitmapM165603h);
            }
        }
        return this.f144649j.get(this.f144643d);
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m165599d(C19485q1 c19485q1) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        C19723r1 c19723r1 = this.f144642c;
        int i3 = c19723r1.f160743n;
        if (i3 <= 0) {
            i3 = c19723r1.f160742m;
        }
        if (c19485q1 == null || !c19485q1.f155133k) {
            int i4 = c19723r1.f160742m;
            int i5 = i4 - 20;
            if (c19485q1 != null) {
                i5 = i4 - 58;
            }
            this.f144640a.position(i4);
            while (this.f144640a.position() <= i3) {
                int i6 = this.f144640a.getInt();
                int i7 = this.f144640a.getInt();
                if (i7 != 1633899596 && i7 != 1717785676) {
                    i5 += i6 + 12;
                }
                ByteBuffer byteBuffer = this.f144640a;
                byteBuffer.position(byteBuffer.position() + i6 + 4);
            }
            i = i5 + 12;
        } else {
            i = ((c19723r1.f160742m - 20) - (c19723r1.f160744o ? 38 : 0)) + c19485q1.f155132j + 24;
        }
        C19009o1[] c19009o1Arr = this.f144642c.f160746q;
        if (c19009o1Arr != null && c19009o1Arr.length > 0) {
            for (C19009o1 c19009o1 : c19009o1Arr) {
                i += c19009o1.f144615a;
            }
        }
        byte[] bArr = new byte[i];
        int i8 = 0;
        for (int i9 = 0; i9 < 8; i9++) {
            bArr[i8] = C19268p1.f150125a[i9];
            i8++;
        }
        this.f144640a.position(i8);
        if (c19485q1 == null || !c19485q1.f155133k) {
            while (this.f144640a.position() <= i3) {
                int i10 = this.f144640a.getInt();
                int i11 = this.f144640a.getInt();
                if (i11 == 1633899596 || i11 == 1717785676) {
                    ByteBuffer byteBuffer2 = this.f144640a;
                    byteBuffer2.position(byteBuffer2.position() + i10 + 4);
                } else {
                    ByteBuffer byteBuffer3 = this.f144640a;
                    byteBuffer3.position(byteBuffer3.position() - 8);
                    int i12 = i10 + 12;
                    this.f144640a.get(bArr, i8, i12);
                    i8 += i12;
                }
            }
            i2 = i8;
        } else {
            while (this.f144640a.position() < this.f144642c.f160742m) {
                int i13 = this.f144640a.getInt();
                int i14 = this.f144640a.getInt();
                if (i14 == 1633899596 || i14 == 1717785676) {
                    ByteBuffer byteBuffer4 = this.f144640a;
                    byteBuffer4.position(byteBuffer4.position() + i13 + 4);
                } else {
                    ByteBuffer byteBuffer5 = this.f144640a;
                    byteBuffer5.position(byteBuffer5.position() - 8);
                    int i15 = i13 + 12;
                    this.f144640a.get(bArr, i8, i15);
                    if (i14 == 1229472850) {
                        int i16 = this.f144642c.f180006e;
                        int i17 = c19485q1.f155127e;
                        z = true;
                        if (i16 != i17) {
                            m165595o(i17, bArr, i8 + 8);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i18 = this.f144642c.f180007f;
                        int i19 = c19485q1.f155128f;
                        if (i18 != i19) {
                            m165595o(i19, bArr, i8 + 12);
                        } else {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        m165594n(i8 + 4, bArr, 13);
                    }
                    i8 += i15;
                }
            }
            m165595o(c19485q1.f155132j, bArr, i8);
            bArr[i8 + 4] = 73;
            bArr[i8 + 5] = 68;
            bArr[i8 + 6] = 65;
            bArr[i8 + 7] = 84;
            int i20 = i8 + 8;
            this.f144640a.position(c19485q1.f175345c);
            this.f144640a.get(bArr, i20, c19485q1.f155132j);
            m165594n(i8 + 4, bArr, c19485q1.f155132j);
            i2 = i20 + c19485q1.f155132j + 4;
        }
        C19009o1[] c19009o1Arr2 = this.f144642c.f160746q;
        if (c19009o1Arr2 != null && c19009o1Arr2.length > 0) {
            for (C19009o1 c19009o2 : c19009o1Arr2) {
                this.f144640a.position(c19009o2.f144616b);
                this.f144640a.get(bArr, i2, c19009o2.f144615a);
                i2 += c19009o2.f144615a;
            }
        }
        m165596a(bArr, i2);
        return BitmapFactory.decodeByteArray(bArr, 0, i);
    }

    /* JADX INFO: renamed from: e */
    public int m165600e(int i) {
        if (i < 0) {
            return -1;
        }
        C19723r1 c19723r1 = this.f144642c;
        if (i < c19723r1.f180003b) {
            return ((C19485q1) c19723r1.f180005d.get(i)).f175344b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public int m165601f() {
        return this.f144642c.f180003b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final C19950s1 m165602g() {
        if (this.f144641b == null) {
            this.f144641b = new C19950s1();
        }
        return this.f144641b;
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap m165603h() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f144645f, this.f144646g, this.f144648i);
        bitmapCreateBitmap.setHasAlpha(true);
        return bitmapCreateBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Bitmap m165604i() {
        if (this.f144642c.f180003b <= 0 || this.f144643d < 0) {
            this.f144644e = 1;
        }
        int i = this.f144644e;
        if (i == 1 || i == 2) {
            return null;
        }
        this.f144644e = 0;
        return m165598c();
    }

    /* JADX INFO: renamed from: j */
    public int m165605j(@Nullable byte[] bArr) {
        C19723r1 c19723r1M183995c = m165602g().m184010r(bArr).m183995c();
        this.f144642c = c19723r1M183995c;
        if (bArr != null) {
            m165608m(c19723r1M183995c, bArr);
        }
        return this.f144644e;
    }

    /* JADX INFO: renamed from: k */
    public void m165606k() {
        this.f144643d = -1;
    }

    /* JADX INFO: renamed from: l */
    public void m165607l(@NonNull C19723r1 c19723r1, @NonNull ByteBuffer byteBuffer) {
        this.f144644e = 0;
        this.f144642c = c19723r1;
        this.f144643d = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f144640a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f144640a.order(ByteOrder.BIG_ENDIAN);
        int i = c19723r1.f180006e;
        this.f144645f = i;
        int i2 = c19723r1.f180007f;
        this.f144646g = i2;
        this.f144647h = new int[i * i2];
        this.f144649j = new ArrayList(Collections.nCopies(c19723r1.f180003b, null));
        this.f144650k = m165603h();
        if (c19723r1.f160744o) {
            return;
        }
        this.f144651l = m165599d(null);
    }

    /* JADX INFO: renamed from: m */
    public void m165608m(@NonNull C19723r1 c19723r1, @NonNull byte[] bArr) {
        m165607l(c19723r1, ByteBuffer.wrap(bArr));
    }
}
