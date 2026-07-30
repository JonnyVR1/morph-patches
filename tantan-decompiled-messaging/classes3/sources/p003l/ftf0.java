package p003l;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ftf0 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f3700a;

    /* JADX INFO: renamed from: c */
    public C0497r1 f3702c;

    /* JADX INFO: renamed from: d */
    public int f3703d;

    /* JADX INFO: renamed from: e */
    public int f3704e;

    /* JADX INFO: renamed from: f */
    public int f3705f;

    /* JADX INFO: renamed from: g */
    public int f3706g;

    /* JADX INFO: renamed from: h */
    public int[] f3707h;

    /* JADX INFO: renamed from: j */
    public List<Bitmap> f3709j;

    /* JADX INFO: renamed from: k */
    public Bitmap f3710k;

    /* JADX INFO: renamed from: l */
    public Bitmap f3711l;

    /* JADX INFO: renamed from: i */
    @NonNull
    public Bitmap.Config f3708i = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b */
    public C0522s1 f3701b = new C0522s1();

    /* JADX INFO: renamed from: n */
    public static void m4408n(int i, byte[] bArr, int i2) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, 4);
        if (i2 > 0) {
            crc32.update(bArr, i + 4, i2);
        }
        m4409o((int) crc32.getValue(), bArr, i + 4 + i2);
    }

    /* JADX INFO: renamed from: o */
    public static void m4409o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: a */
    public final void m4410a(byte[] bArr, int i) {
        int i2 = this.f3702c.f6766p;
        if (i2 != 0) {
            this.f3700a.position(i2);
            this.f3700a.get(bArr, i, 12);
            return;
        }
        byte[] bArr2 = {0, 0, 0, 0, 73, 69, 78, 68};
        for (int i3 = 0; i3 < 8; i3++) {
            bArr[i] = bArr2[i3];
            i++;
        }
        m4408n(i - 4, bArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public void m4411b() {
        this.f3703d = (this.f3703d + 1) % this.f3702c.f9086b;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m4412c() {
        if (this.f3709j.get(this.f3703d) == null) {
            C0489q1 c0489q1 = (C0489q1) this.f3702c.f9088d.get(this.f3703d);
            int i = this.f3703d - 1;
            C0489q1 c0489q2 = i >= 0 ? (C0489q1) this.f3702c.f9088d.get(i) : null;
            Bitmap bitmapM4413d = m4413d(c0489q1);
            if (this.f3702c.f6765o && c0489q2 == null) {
                int[] iArr = this.f3707h;
                int i2 = this.f3705f;
                bitmapM4413d.getPixels(iArr, 0, i2, 0, 0, i2, this.f3706g);
                Bitmap bitmap = this.f3710k;
                int[] iArr2 = this.f3707h;
                int i3 = this.f3705f;
                bitmap.setPixels(iArr2, 0, i3, 0, 0, i3, this.f3706g);
                this.f3709j.add(this.f3703d, bitmapM4413d);
            } else {
                Bitmap bitmapM4417h = m4417h();
                Canvas canvas = new Canvas(bitmapM4417h);
                if (c0489q2 == null) {
                    canvas.drawBitmap(this.f3711l, 0.0f, 0.0f, (Paint) null);
                } else {
                    canvas.drawBitmap(this.f3710k, 0.0f, 0.0f, (Paint) null);
                }
                if (c0489q1.f6574i == 0) {
                    int i4 = c0489q1.f6572g;
                    int i5 = c0489q1.f6573h;
                    canvas.clipRect(i4, i5, c0489q1.f6570e + i4, c0489q1.f6571f + i5);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    canvas.clipRect(0, 0, this.f3705f, this.f3706g);
                }
                canvas.drawBitmap(bitmapM4413d, c0489q1.f6572g, c0489q1.f6573h, (Paint) null);
                canvas.setBitmap(null);
                bitmapM4413d.recycle();
                int i6 = c0489q1.f8807a;
                if (i6 == 0 || i6 == 1 || i6 == 2) {
                    int[] iArr3 = this.f3707h;
                    int i7 = this.f3705f;
                    bitmapM4417h.getPixels(iArr3, 0, i7, 0, 0, i7, this.f3706g);
                    Bitmap bitmap2 = this.f3710k;
                    int[] iArr4 = this.f3707h;
                    int i8 = this.f3705f;
                    bitmap2.setPixels(iArr4, 0, i8, 0, 0, i8, this.f3706g);
                    if (c0489q1.f8807a == 2) {
                        for (int i9 = c0489q1.f6572g; i9 < c0489q1.f6572g + c0489q1.f6570e; i9++) {
                            for (int i10 = c0489q1.f6573h; i10 < c0489q1.f6573h + c0489q1.f6571f; i10++) {
                                this.f3710k.setPixel(i9, i10, 0);
                            }
                        }
                    }
                } else if (i6 == 3 && c0489q2 == null) {
                    Bitmap bitmap3 = this.f3711l;
                    int[] iArr5 = this.f3707h;
                    int i11 = this.f3705f;
                    bitmap3.getPixels(iArr5, 0, i11, 0, 0, i11, this.f3706g);
                    Bitmap bitmap4 = this.f3710k;
                    int[] iArr6 = this.f3707h;
                    int i12 = this.f3705f;
                    bitmap4.setPixels(iArr6, 0, i12, 0, 0, i12, this.f3706g);
                }
                this.f3709j.add(this.f3703d, bitmapM4417h);
            }
        }
        return this.f3709j.get(this.f3703d);
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m4413d(C0489q1 c0489q1) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        C0497r1 c0497r1 = this.f3702c;
        int i3 = c0497r1.f6764n;
        if (i3 <= 0) {
            i3 = c0497r1.f6763m;
        }
        if (c0489q1 == null || !c0489q1.f6576k) {
            int i4 = c0497r1.f6763m;
            int i5 = i4 - 20;
            if (c0489q1 != null) {
                i5 = i4 - 58;
            }
            this.f3700a.position(i4);
            while (this.f3700a.position() <= i3) {
                int i6 = this.f3700a.getInt();
                int i7 = this.f3700a.getInt();
                if (i7 != 1633899596 && i7 != 1717785676) {
                    i5 += i6 + 12;
                }
                ByteBuffer byteBuffer = this.f3700a;
                byteBuffer.position(byteBuffer.position() + i6 + 4);
            }
            i = i5 + 12;
        } else {
            i = ((c0497r1.f6763m - 20) - (c0497r1.f6765o ? 38 : 0)) + c0489q1.f6575j + 24;
        }
        C0444o1[] c0444o1Arr = this.f3702c.f6767q;
        if (c0444o1Arr != null && c0444o1Arr.length > 0) {
            for (C0444o1 c0444o1 : c0444o1Arr) {
                i += c0444o1.f6009a;
            }
        }
        byte[] bArr = new byte[i];
        int i8 = 0;
        for (int i9 = 0; i9 < 8; i9++) {
            bArr[i8] = C0464p1.f6300a[i9];
            i8++;
        }
        this.f3700a.position(i8);
        if (c0489q1 == null || !c0489q1.f6576k) {
            while (this.f3700a.position() <= i3) {
                int i10 = this.f3700a.getInt();
                int i11 = this.f3700a.getInt();
                if (i11 == 1633899596 || i11 == 1717785676) {
                    ByteBuffer byteBuffer2 = this.f3700a;
                    byteBuffer2.position(byteBuffer2.position() + i10 + 4);
                } else {
                    ByteBuffer byteBuffer3 = this.f3700a;
                    byteBuffer3.position(byteBuffer3.position() - 8);
                    int i12 = i10 + 12;
                    this.f3700a.get(bArr, i8, i12);
                    i8 += i12;
                }
            }
            i2 = i8;
        } else {
            while (this.f3700a.position() < this.f3702c.f6763m) {
                int i13 = this.f3700a.getInt();
                int i14 = this.f3700a.getInt();
                if (i14 == 1633899596 || i14 == 1717785676) {
                    ByteBuffer byteBuffer4 = this.f3700a;
                    byteBuffer4.position(byteBuffer4.position() + i13 + 4);
                } else {
                    ByteBuffer byteBuffer5 = this.f3700a;
                    byteBuffer5.position(byteBuffer5.position() - 8);
                    int i15 = i13 + 12;
                    this.f3700a.get(bArr, i8, i15);
                    if (i14 == 1229472850) {
                        int i16 = this.f3702c.f9089e;
                        int i17 = c0489q1.f6570e;
                        z = true;
                        if (i16 != i17) {
                            m4409o(i17, bArr, i8 + 8);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i18 = this.f3702c.f9090f;
                        int i19 = c0489q1.f6571f;
                        if (i18 != i19) {
                            m4409o(i19, bArr, i8 + 12);
                        } else {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        m4408n(i8 + 4, bArr, 13);
                    }
                    i8 += i15;
                }
            }
            m4409o(c0489q1.f6575j, bArr, i8);
            bArr[i8 + 4] = 73;
            bArr[i8 + 5] = 68;
            bArr[i8 + 6] = 65;
            bArr[i8 + 7] = 84;
            int i20 = i8 + 8;
            this.f3700a.position(c0489q1.f8809c);
            this.f3700a.get(bArr, i20, c0489q1.f6575j);
            m4408n(i8 + 4, bArr, c0489q1.f6575j);
            i2 = i20 + c0489q1.f6575j + 4;
        }
        C0444o1[] c0444o1Arr2 = this.f3702c.f6767q;
        if (c0444o1Arr2 != null && c0444o1Arr2.length > 0) {
            for (C0444o1 c0444o2 : c0444o1Arr2) {
                this.f3700a.position(c0444o2.f6010b);
                this.f3700a.get(bArr, i2, c0444o2.f6009a);
                i2 += c0444o2.f6009a;
            }
        }
        m4410a(bArr, i2);
        return BitmapFactory.decodeByteArray(bArr, 0, i);
    }

    /* JADX INFO: renamed from: e */
    public int m4414e(int i) {
        if (i < 0) {
            return -1;
        }
        C0497r1 c0497r1 = this.f3702c;
        if (i < c0497r1.f9086b) {
            return ((C0489q1) c0497r1.f9088d.get(i)).f8808b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public int m4415f() {
        return this.f3702c.f9086b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final C0522s1 m4416g() {
        if (this.f3701b == null) {
            this.f3701b = new C0522s1();
        }
        return this.f3701b;
    }

    /* JADX INFO: renamed from: h */
    public final Bitmap m4417h() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f3705f, this.f3706g, this.f3708i);
        bitmapCreateBitmap.setHasAlpha(true);
        return bitmapCreateBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Bitmap m4418i() {
        if (this.f3702c.f9086b <= 0 || this.f3703d < 0) {
            this.f3704e = 1;
        }
        int i = this.f3704e;
        if (i == 1 || i == 2) {
            return null;
        }
        this.f3704e = 0;
        return m4412c();
    }

    /* JADX INFO: renamed from: j */
    public int m4419j(@Nullable byte[] bArr) {
        C0497r1 c0497r1M7409c = m4416g().m7424r(bArr).m7409c();
        this.f3702c = c0497r1M7409c;
        if (bArr != null) {
            m4422m(c0497r1M7409c, bArr);
        }
        return this.f3704e;
    }

    /* JADX INFO: renamed from: k */
    public void m4420k() {
        this.f3703d = -1;
    }

    /* JADX INFO: renamed from: l */
    public void m4421l(@NonNull C0497r1 c0497r1, @NonNull ByteBuffer byteBuffer) {
        this.f3704e = 0;
        this.f3702c = c0497r1;
        this.f3703d = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f3700a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f3700a.order(ByteOrder.BIG_ENDIAN);
        int i = c0497r1.f9089e;
        this.f3705f = i;
        int i2 = c0497r1.f9090f;
        this.f3706g = i2;
        this.f3707h = new int[i * i2];
        this.f3709j = new ArrayList(Collections.nCopies(c0497r1.f9086b, null));
        this.f3710k = m4417h();
        if (c0497r1.f6765o) {
            return;
        }
        this.f3711l = m4413d(null);
    }

    /* JADX INFO: renamed from: m */
    public void m4422m(@NonNull C0497r1 c0497r1, @NonNull byte[] bArr) {
        m4421l(c0497r1, ByteBuffer.wrap(bArr));
    }
}
