package p149l;

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
public class ftf0 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f99195a;

    /* JADX INFO: renamed from: c */
    public C19618r1 f99197c;

    /* JADX INFO: renamed from: d */
    public int f99198d;

    /* JADX INFO: renamed from: e */
    public int f99199e;

    /* JADX INFO: renamed from: f */
    public int f99200f;

    /* JADX INFO: renamed from: g */
    public int f99201g;

    /* JADX INFO: renamed from: h */
    public int[] f99202h;

    /* JADX INFO: renamed from: j */
    public List<Bitmap> f99204j;

    /* JADX INFO: renamed from: k */
    public Bitmap f99205k;

    /* JADX INFO: renamed from: l */
    public Bitmap f99206l;

    /* JADX INFO: renamed from: i */
    @NonNull
    public Bitmap.Config f99203i = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b */
    public C19823s1 f99196b = new C19823s1();

    /* JADX INFO: renamed from: n */
    public static void m123036n(int i, byte[] bArr, int i2) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, 4);
        if (i2 > 0) {
            crc32.update(bArr, i + 4, i2);
        }
        m123037o((int) crc32.getValue(), bArr, i + 4 + i2);
    }

    /* JADX INFO: renamed from: o */
    public static void m123037o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: a */
    public final void m123038a(byte[] bArr, int i) {
        int i2 = this.f99197c.f157221p;
        if (i2 != 0) {
            this.f99195a.position(i2);
            this.f99195a.get(bArr, i, 12);
            return;
        }
        byte[] bArr2 = {0, 0, 0, 0, 73, 69, 78, 68};
        for (int i3 = 0; i3 < 8; i3++) {
            bArr[i] = bArr2[i3];
            i++;
        }
        m123036n(i - 4, bArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public void m123039b() {
        this.f99198d = (this.f99198d + 1) % this.f99197c.f199249b;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m123040c() {
        if (this.f99204j.get(this.f99198d) == null) {
            C19388q1 c19388q1 = (C19388q1) this.f99197c.f199251d.get(this.f99198d);
            int i = this.f99198d - 1;
            C19388q1 c19388q2 = i >= 0 ? (C19388q1) this.f99197c.f199251d.get(i) : null;
            Bitmap bitmapM123041d = m123041d(c19388q1);
            if (this.f99197c.f157220o && c19388q2 == null) {
                int[] iArr = this.f99202h;
                int i2 = this.f99200f;
                bitmapM123041d.getPixels(iArr, 0, i2, 0, 0, i2, this.f99201g);
                Bitmap bitmap = this.f99205k;
                int[] iArr2 = this.f99202h;
                int i3 = this.f99200f;
                bitmap.setPixels(iArr2, 0, i3, 0, 0, i3, this.f99201g);
                this.f99204j.add(this.f99198d, bitmapM123041d);
            } else {
                Bitmap bitmapM123045h = m123045h();
                Canvas canvas = new Canvas(bitmapM123045h);
                if (c19388q2 == null) {
                    canvas.drawBitmap(this.f99206l, 0.0f, 0.0f, (Paint) null);
                } else {
                    canvas.drawBitmap(this.f99205k, 0.0f, 0.0f, (Paint) null);
                }
                if (c19388q1.f152098i == 0) {
                    int i4 = c19388q1.f152096g;
                    int i5 = c19388q1.f152097h;
                    canvas.clipRect(i4, i5, c19388q1.f152094e + i4, c19388q1.f152095f + i5);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    canvas.clipRect(0, 0, this.f99200f, this.f99201g);
                }
                canvas.drawBitmap(bitmapM123041d, c19388q1.f152096g, c19388q1.f152097h, (Paint) null);
                canvas.setBitmap(null);
                bitmapM123041d.recycle();
                int i6 = c19388q1.f193770a;
                if (i6 == 0 || i6 == 1 || i6 == 2) {
                    int[] iArr3 = this.f99202h;
                    int i7 = this.f99200f;
                    bitmapM123045h.getPixels(iArr3, 0, i7, 0, 0, i7, this.f99201g);
                    Bitmap bitmap2 = this.f99205k;
                    int[] iArr4 = this.f99202h;
                    int i8 = this.f99200f;
                    bitmap2.setPixels(iArr4, 0, i8, 0, 0, i8, this.f99201g);
                    if (c19388q1.f193770a == 2) {
                        for (int i9 = c19388q1.f152096g; i9 < c19388q1.f152096g + c19388q1.f152094e; i9++) {
                            for (int i10 = c19388q1.f152097h; i10 < c19388q1.f152097h + c19388q1.f152095f; i10++) {
                                this.f99205k.setPixel(i9, i10, 0);
                            }
                        }
                    }
                } else if (i6 == 3 && c19388q2 == null) {
                    Bitmap bitmap3 = this.f99206l;
                    int[] iArr5 = this.f99202h;
                    int i11 = this.f99200f;
                    bitmap3.getPixels(iArr5, 0, i11, 0, 0, i11, this.f99201g);
                    Bitmap bitmap4 = this.f99205k;
                    int[] iArr6 = this.f99202h;
                    int i12 = this.f99200f;
                    bitmap4.setPixels(iArr6, 0, i12, 0, 0, i12, this.f99201g);
                }
                this.f99204j.add(this.f99198d, bitmapM123045h);
            }
        }
        return this.f99204j.get(this.f99198d);
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m123041d(C19388q1 c19388q1) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        C19618r1 c19618r1 = this.f99197c;
        int i3 = c19618r1.f157219n;
        if (i3 <= 0) {
            i3 = c19618r1.f157218m;
        }
        if (c19388q1 == null || !c19388q1.f152100k) {
            int i4 = c19618r1.f157218m;
            int i5 = i4 - 20;
            if (c19388q1 != null) {
                i5 = i4 - 58;
            }
            this.f99195a.position(i4);
            while (this.f99195a.position() <= i3) {
                int i6 = this.f99195a.getInt();
                int i7 = this.f99195a.getInt();
                if (i7 != 1633899596 && i7 != 1717785676) {
                    i5 += i6 + 12;
                }
                ByteBuffer byteBuffer = this.f99195a;
                byteBuffer.position(byteBuffer.position() + i6 + 4);
            }
            i = i5 + 12;
        } else {
            i = ((c19618r1.f157218m - 20) - (c19618r1.f157220o ? 38 : 0)) + c19388q1.f152099j + 24;
        }
        C18813o1[] c18813o1Arr = this.f99197c.f157222q;
        if (c18813o1Arr != null && c18813o1Arr.length > 0) {
            for (C18813o1 c18813o1 : c18813o1Arr) {
                i += c18813o1.f141394a;
            }
        }
        byte[] bArr = new byte[i];
        int i8 = 0;
        for (int i9 = 0; i9 < 8; i9++) {
            bArr[i8] = C19096p1.f146633a[i9];
            i8++;
        }
        this.f99195a.position(i8);
        if (c19388q1 == null || !c19388q1.f152100k) {
            while (this.f99195a.position() <= i3) {
                int i10 = this.f99195a.getInt();
                int i11 = this.f99195a.getInt();
                if (i11 == 1633899596 || i11 == 1717785676) {
                    ByteBuffer byteBuffer2 = this.f99195a;
                    byteBuffer2.position(byteBuffer2.position() + i10 + 4);
                } else {
                    ByteBuffer byteBuffer3 = this.f99195a;
                    byteBuffer3.position(byteBuffer3.position() - 8);
                    int i12 = i10 + 12;
                    this.f99195a.get(bArr, i8, i12);
                    i8 += i12;
                }
            }
            i2 = i8;
        } else {
            while (this.f99195a.position() < this.f99197c.f157218m) {
                int i13 = this.f99195a.getInt();
                int i14 = this.f99195a.getInt();
                if (i14 == 1633899596 || i14 == 1717785676) {
                    ByteBuffer byteBuffer4 = this.f99195a;
                    byteBuffer4.position(byteBuffer4.position() + i13 + 4);
                } else {
                    ByteBuffer byteBuffer5 = this.f99195a;
                    byteBuffer5.position(byteBuffer5.position() - 8);
                    int i15 = i13 + 12;
                    this.f99195a.get(bArr, i8, i15);
                    if (i14 == 1229472850) {
                        int i16 = this.f99197c.f199252e;
                        int i17 = c19388q1.f152094e;
                        z = true;
                        if (i16 != i17) {
                            m123037o(i17, bArr, i8 + 8);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i18 = this.f99197c.f199253f;
                        int i19 = c19388q1.f152095f;
                        if (i18 != i19) {
                            m123037o(i19, bArr, i8 + 12);
                        } else {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        m123036n(i8 + 4, bArr, 13);
                    }
                    i8 += i15;
                }
            }
            m123037o(c19388q1.f152099j, bArr, i8);
            bArr[i8 + 4] = 73;
            bArr[i8 + 5] = 68;
            bArr[i8 + 6] = 65;
            bArr[i8 + 7] = 84;
            int i20 = i8 + 8;
            this.f99195a.position(c19388q1.f193772c);
            this.f99195a.get(bArr, i20, c19388q1.f152099j);
            m123036n(i8 + 4, bArr, c19388q1.f152099j);
            i2 = i20 + c19388q1.f152099j + 4;
        }
        C18813o1[] c18813o1Arr2 = this.f99197c.f157222q;
        if (c18813o1Arr2 != null && c18813o1Arr2.length > 0) {
            for (C18813o1 c18813o2 : c18813o1Arr2) {
                this.f99195a.position(c18813o2.f141395b);
                this.f99195a.get(bArr, i2, c18813o2.f141394a);
                i2 += c18813o2.f141394a;
            }
        }
        m123038a(bArr, i2);
        return BitmapFactory.decodeByteArray(bArr, 0, i);
    }

    /* JADX INFO: renamed from: e */
    public int m123042e(int i) {
        if (i < 0) {
            return -1;
        }
        C19618r1 c19618r1 = this.f99197c;
        if (i < c19618r1.f199249b) {
            return ((C19388q1) c19618r1.f199251d.get(i)).f193771b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public int m123043f() {
        return this.f99197c.f199249b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final C19823s1 m123044g() {
        if (this.f99196b == null) {
            this.f99196b = new C19823s1();
        }
        return this.f99196b;
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap m123045h() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f99200f, this.f99201g, this.f99203i);
        bitmapCreateBitmap.setHasAlpha(true);
        return bitmapCreateBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Bitmap m123046i() {
        if (this.f99197c.f199249b <= 0 || this.f99198d < 0) {
            this.f99199e = 1;
        }
        int i = this.f99199e;
        if (i == 1 || i == 2) {
            return null;
        }
        this.f99199e = 0;
        return m123040c();
    }

    /* JADX INFO: renamed from: j */
    public int m123047j(@Nullable byte[] bArr) {
        C19618r1 c19618r1M181897c = m123044g().m181912r(bArr).m181897c();
        this.f99197c = c19618r1M181897c;
        if (bArr != null) {
            m123050m(c19618r1M181897c, bArr);
        }
        return this.f99199e;
    }

    /* JADX INFO: renamed from: k */
    public void m123048k() {
        this.f99198d = -1;
    }

    /* JADX INFO: renamed from: l */
    public void m123049l(@NonNull C19618r1 c19618r1, @NonNull ByteBuffer byteBuffer) {
        this.f99199e = 0;
        this.f99197c = c19618r1;
        this.f99198d = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f99195a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f99195a.order(ByteOrder.BIG_ENDIAN);
        int i = c19618r1.f199252e;
        this.f99200f = i;
        int i2 = c19618r1.f199253f;
        this.f99201g = i2;
        this.f99202h = new int[i * i2];
        this.f99204j = new ArrayList(Collections.nCopies(c19618r1.f199249b, null));
        this.f99205k = m123045h();
        if (c19618r1.f157220o) {
            return;
        }
        this.f99206l = m123041d(null);
    }

    /* JADX INFO: renamed from: m */
    public void m123050m(@NonNull C19618r1 c19618r1, @NonNull byte[] bArr) {
        m123049l(c19618r1, ByteBuffer.wrap(bArr));
    }
}
