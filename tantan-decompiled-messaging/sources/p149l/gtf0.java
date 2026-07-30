package p149l;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class gtf0 implements kkj {

    /* JADX INFO: renamed from: u */
    private static final String f104274u = "gtf0";

    /* JADX INFO: renamed from: a */
    @ColorInt
    private int[] f104275a;

    /* JADX INFO: renamed from: b */
    @ColorInt
    private final int[] f104276b;

    /* JADX INFO: renamed from: c */
    private final kkj.InterfaceC18040a f104277c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f104278d;

    /* JADX INFO: renamed from: e */
    private byte[] f104279e;

    /* JADX INFO: renamed from: f */
    private short[] f104280f;

    /* JADX INFO: renamed from: g */
    private byte[] f104281g;

    /* JADX INFO: renamed from: h */
    private byte[] f104282h;

    /* JADX INFO: renamed from: i */
    private byte[] f104283i;

    /* JADX INFO: renamed from: j */
    @ColorInt
    private int[] f104284j;

    /* JADX INFO: renamed from: k */
    private int f104285k;

    /* JADX INFO: renamed from: l */
    private tkj f104286l;

    /* JADX INFO: renamed from: m */
    private Bitmap f104287m;

    /* JADX INFO: renamed from: n */
    private boolean f104288n;

    /* JADX INFO: renamed from: o */
    private int f104289o;

    /* JADX INFO: renamed from: p */
    private int f104290p;

    /* JADX INFO: renamed from: q */
    private int f104291q;

    /* JADX INFO: renamed from: r */
    private int f104292r;

    /* JADX INFO: renamed from: s */
    @Nullable
    private Boolean f104293s;

    /* JADX INFO: renamed from: t */
    @NonNull
    private Bitmap.Config f104294t;

    public gtf0(@NonNull kkj.InterfaceC18040a interfaceC18040a) {
        this.f104276b = new int[256];
        this.f104294t = Bitmap.Config.ARGB_8888;
        this.f104277c = interfaceC18040a;
        this.f104286l = new tkj();
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    private int m127929f(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f104290p + i; i9++) {
            byte[] bArr = this.f104283i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f104275a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f104290p + i11; i12++) {
            byte[] bArr2 = this.f104283i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f104275a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* JADX INFO: renamed from: g */
    private void m127930g(qkj qkjVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.f104284j;
        int i5 = qkjVar.f155135d;
        int i6 = this.f104290p;
        int i7 = i5 / i6;
        int i8 = qkjVar.f155133b / i6;
        int i9 = qkjVar.f155134c / i6;
        int i10 = qkjVar.f155132a / i6;
        boolean z = this.f104285k == 0;
        int i11 = this.f104292r;
        int i12 = this.f104291q;
        byte[] bArr = this.f104283i;
        int[] iArr2 = this.f104275a;
        Boolean bool = this.f104293s;
        int i13 = 8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i15 < i7) {
            int[] iArr3 = iArr;
            if (qkjVar.f155136e) {
                if (i14 >= i7) {
                    int i17 = i16 + 1;
                    i = i7;
                    if (i17 == 2) {
                        i16 = i17;
                        i14 = 4;
                    } else if (i17 == 3) {
                        i16 = i17;
                        i13 = 4;
                        i14 = 2;
                    } else if (i17 != 4) {
                        i16 = i17;
                    } else {
                        i16 = i17;
                        i14 = 1;
                        i13 = 2;
                    }
                } else {
                    i = i7;
                }
                i2 = i14 + i13;
            } else {
                i = i7;
                i2 = i14;
                i14 = i15;
            }
            int i18 = i14 + i8;
            boolean z2 = i6 == 1;
            if (i18 < i12) {
                int i19 = i18 * i11;
                int i20 = i19 + i10;
                int i21 = i20 + i9;
                int i22 = i19 + i11;
                if (i22 < i21) {
                    i21 = i22;
                }
                i3 = i2;
                int i23 = i15 * i6 * qkjVar.f155134c;
                if (z2) {
                    int i24 = i20;
                    while (i24 < i21) {
                        int i25 = i24;
                        int i26 = iArr2[bArr[i23] & 255];
                        if (i26 != 0) {
                            iArr3[i25] = i26;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i23 += i6;
                        i24 = i25 + 1;
                    }
                } else {
                    int i27 = ((i21 - i20) * i6) + i23;
                    i4 = i6;
                    int i28 = i20;
                    while (i28 < i21) {
                        int i29 = i21;
                        int iM127929f = m127929f(i23, i27, qkjVar.f155134c);
                        if (iM127929f != 0) {
                            iArr3[i28] = iM127929f;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i23 += i4;
                        i28++;
                        i21 = i29;
                    }
                }
                i15++;
                i6 = i4;
                iArr = iArr3;
                i7 = i;
                i14 = i3;
            } else {
                i3 = i2;
            }
            i4 = i6;
            i15++;
            i6 = i4;
            iArr = iArr3;
            i7 = i;
            i14 = i3;
        }
        if (this.f104293s == null) {
            this.f104293s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m127931h(qkj qkjVar) {
        qkj qkjVar2 = qkjVar;
        int[] iArr = this.f104284j;
        int i = qkjVar2.f155135d;
        int i2 = qkjVar2.f155133b;
        int i3 = qkjVar2.f155134c;
        int i4 = qkjVar2.f155132a;
        boolean z = this.f104285k == 0;
        int i5 = this.f104292r;
        byte[] bArr = this.f104283i;
        int[] iArr2 = this.f104275a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = qkjVar2.f155134c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int[] iArr3 = iArr;
                int i13 = b2 & 255;
                if (i13 != b) {
                    int i14 = iArr2[i13];
                    if (i14 != 0) {
                        iArr3[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                iArr = iArr3;
            }
            i6++;
            qkjVar2 = qkjVar;
        }
        Boolean bool = this.f104293s;
        this.f104293s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f104293s == null && z && b != -1));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[LOOP:0: B:28:0x0064->B:29:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102 A[LOOP:3: B:52:0x0100->B:53:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0118 A[LOOP:4: B:55:0x0112->B:57:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:69:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf A[EDGE_INSN: B:70:0x00cf->B:45:0x00cf BREAK  A[LOOP:2: B:39:0x00b9->B:76:0x00b9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf A[EDGE_INSN: B:71:0x00cf->B:45:0x00cf BREAK  A[LOOP:2: B:39:0x00b9->B:76:0x00b9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x011f A[EDGE_INSN: B:82:0x011f->B:58:0x011f BREAK  A[LOOP:4: B:55:0x0112->B:57:0x0118], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13, types: [short] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: i */
    private void m127932i(qkj qkjVar) {
        int i;
        int i2;
        int i3;
        byte[] bArr;
        byte[] bArr2;
        short[] sArr;
        byte[] bArr3;
        byte[] bArr4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        byte[] bArr5;
        int iM127934l;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        short[] sArr2;
        int i25;
        int i26;
        byte[] bArr6;
        short s;
        byte b;
        gtf0 gtf0Var = this;
        if (qkjVar != null) {
            gtf0Var.f104278d.position(qkjVar.f155141j);
        }
        byte b2 = 0;
        if (qkjVar == null) {
            tkj tkjVar = gtf0Var.f104286l;
            if (tkjVar != null) {
                i = tkjVar.f170878f;
                i2 = tkjVar.f170879g;
            } else {
                i3 = 0;
            }
            bArr = gtf0Var.f104283i;
            if (bArr != null || bArr.length < i3) {
                gtf0Var.f104283i = gtf0Var.f104277c.mo141878a(i3);
            }
            bArr2 = gtf0Var.f104283i;
            if (gtf0Var.f104280f == null) {
                gtf0Var.f104280f = new short[4096];
            }
            sArr = gtf0Var.f104280f;
            if (gtf0Var.f104281g == null) {
                gtf0Var.f104281g = new byte[4096];
            }
            bArr3 = gtf0Var.f104281g;
            if (gtf0Var.f104282h == null) {
                gtf0Var.f104282h = new byte[4097];
            }
            bArr4 = gtf0Var.f104282h;
            int iM127935m = gtf0Var.m127935m();
            i4 = 1 << iM127935m;
            i5 = i4 + 1;
            i6 = i4 + 2;
            i7 = iM127935m + 1;
            i8 = (1 << i7) - 1;
            for (i9 = 0; i9 < i4; i9++) {
                sArr[i9] = 0;
                bArr3[i9] = (byte) i9;
            }
            bArr5 = gtf0Var.f104279e;
            iM127934l = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = i7;
            i17 = i6;
            i18 = i8;
            i19 = -1;
            i20 = 0;
            while (i20 < i3) {
                if (iM127934l == 0) {
                    iM127934l = gtf0Var.m127934l();
                    if (iM127934l <= 0) {
                        gtf0Var.f104289o = 3;
                        break;
                    }
                    i10 = b2;
                }
                i12 += (bArr5[i10] & 255) << i11;
                i10++;
                iM127934l--;
                i21 = i11 + 8;
                i22 = i17;
                i23 = i19;
                i24 = i16;
                sArr2 = sArr;
                i25 = i15;
                while (true) {
                    i21 = i21;
                    if (i21 >= i24) {
                        break;
                    }
                    i26 = i12 & i18;
                    i12 >>= i24;
                    i21 -= i24;
                    if (i26 == i4) {
                        i24 = i7;
                        i22 = i6;
                        i18 = i8;
                        i23 = -1;
                    } else {
                        if (i26 == i5) {
                            break;
                        }
                        bArr6 = bArr3;
                        if (i23 == -1) {
                            bArr2[i13] = bArr6[i26];
                            i13++;
                            i20++;
                            i23 = i26;
                            i25 = i23;
                            bArr3 = bArr6;
                        } else {
                            if (i26 >= i22) {
                                bArr4[i14] = (byte) i25;
                                i14++;
                                s = i23;
                            } else {
                                s = i26;
                            }
                            while (s >= i4) {
                                bArr4[i14] = bArr6[s];
                                i14++;
                                s = sArr2[s];
                            }
                            i25 = bArr6[s] & 255;
                            b = (byte) i25;
                            bArr2[i13] = b;
                            while (true) {
                                i13++;
                                i20++;
                                if (i14 > 0) {
                                    break;
                                }
                                i14--;
                                bArr2[i13] = bArr4[i14];
                            }
                            if (i22 < 4096) {
                                sArr2[i22] = (short) i23;
                                bArr6[i22] = b;
                                i22++;
                                if ((i22 & i18) == 0 && i22 < 4096) {
                                    i24++;
                                    i18 += i22;
                                }
                            }
                            bArr3 = bArr6;
                            i23 = i26;
                        }
                    }
                }
                i15 = i25;
                i17 = i22;
                sArr = sArr2;
                i11 = i21;
                b2 = 0;
                i19 = i23;
                i16 = i24;
                gtf0Var = this;
            }
            Arrays.fill(bArr2, i13, i3, b2);
        }
        i = qkjVar.f155134c;
        i2 = qkjVar.f155135d;
        i3 = i * i2;
        bArr = gtf0Var.f104283i;
        if (bArr != null) {
            gtf0Var.f104283i = gtf0Var.f104277c.mo141878a(i3);
        } else {
            gtf0Var.f104283i = gtf0Var.f104277c.mo141878a(i3);
        }
        bArr2 = gtf0Var.f104283i;
        if (gtf0Var.f104280f == null) {
            gtf0Var.f104280f = new short[4096];
        }
        sArr = gtf0Var.f104280f;
        if (gtf0Var.f104281g == null) {
            gtf0Var.f104281g = new byte[4096];
        }
        bArr3 = gtf0Var.f104281g;
        if (gtf0Var.f104282h == null) {
            gtf0Var.f104282h = new byte[4097];
        }
        bArr4 = gtf0Var.f104282h;
        int iM127935m2 = gtf0Var.m127935m();
        i4 = 1 << iM127935m2;
        i5 = i4 + 1;
        i6 = i4 + 2;
        i7 = iM127935m2 + 1;
        i8 = (1 << i7) - 1;
        while (i9 < i4) {
            sArr[i9] = 0;
            bArr3[i9] = (byte) i9;
        }
        bArr5 = gtf0Var.f104279e;
        iM127934l = 0;
        i10 = 0;
        i11 = 0;
        i12 = 0;
        i13 = 0;
        i14 = 0;
        i15 = 0;
        i16 = i7;
        i17 = i6;
        i18 = i8;
        i19 = -1;
        i20 = 0;
        while (i20 < i3) {
            if (iM127934l == 0) {
                iM127934l = gtf0Var.m127934l();
                if (iM127934l <= 0) {
                    gtf0Var.f104289o = 3;
                    break;
                }
                i10 = b2;
            }
            i12 += (bArr5[i10] & 255) << i11;
            i10++;
            iM127934l--;
            i21 = i11 + 8;
            i22 = i17;
            i23 = i19;
            i24 = i16;
            sArr2 = sArr;
            i25 = i15;
            while (true) {
                i21 = i21;
                if (i21 >= i24) {
                    break;
                    break;
                }
                i26 = i12 & i18;
                i12 >>= i24;
                i21 -= i24;
                if (i26 == i4) {
                    i24 = i7;
                    i22 = i6;
                    i18 = i8;
                    i23 = -1;
                } else {
                    if (i26 == i5) {
                        break;
                        break;
                    }
                    bArr6 = bArr3;
                    if (i23 == -1) {
                        bArr2[i13] = bArr6[i26];
                        i13++;
                        i20++;
                        i23 = i26;
                        i25 = i23;
                        bArr3 = bArr6;
                    } else {
                        if (i26 >= i22) {
                            bArr4[i14] = (byte) i25;
                            i14++;
                            s = i23;
                        } else {
                            s = i26;
                        }
                        while (s >= i4) {
                            bArr4[i14] = bArr6[s];
                            i14++;
                            s = sArr2[s];
                        }
                        i25 = bArr6[s] & 255;
                        b = (byte) i25;
                        bArr2[i13] = b;
                        while (true) {
                            i13++;
                            i20++;
                            if (i14 > 0) {
                                break;
                                break;
                            } else {
                                i14--;
                                bArr2[i13] = bArr4[i14];
                            }
                        }
                        if (i22 < 4096) {
                            sArr2[i22] = (short) i23;
                            bArr6[i22] = b;
                            i22++;
                            if ((i22 & i18) == 0) {
                                i24++;
                                i18 += i22;
                            }
                        }
                        bArr3 = bArr6;
                        i23 = i26;
                    }
                }
            }
            i15 = i25;
            i17 = i22;
            sArr = sArr2;
            i11 = i21;
            b2 = 0;
            i19 = i23;
            i16 = i24;
            gtf0Var = this;
        }
        Arrays.fill(bArr2, i13, i3, b2);
    }

    /* JADX INFO: renamed from: k */
    private Bitmap m127933k() {
        Boolean bool = this.f104293s;
        Bitmap bitmapMo141879b = this.f104277c.mo141879b(this.f104292r, this.f104291q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f104294t);
        bitmapMo141879b.setHasAlpha(true);
        return bitmapMo141879b;
    }

    /* JADX INFO: renamed from: l */
    private int m127934l() {
        int iM127935m = m127935m();
        if (iM127935m <= 0) {
            return iM127935m;
        }
        ByteBuffer byteBuffer = this.f104278d;
        byteBuffer.get(this.f104279e, 0, Math.min(iM127935m, byteBuffer.remaining()));
        return iM127935m;
    }

    /* JADX INFO: renamed from: m */
    private int m127935m() {
        return this.f104278d.get() & 255;
    }

    /* JADX INFO: renamed from: o */
    private Bitmap m127936o(qkj qkjVar, qkj qkjVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        tkj tkjVar;
        int[] iArr = this.f104284j;
        int i3 = 0;
        if (qkjVar2 == null) {
            Bitmap bitmap2 = this.f104287m;
            if (bitmap2 != null) {
                this.f104277c.mo141881d(bitmap2);
            }
            this.f104287m = null;
            Arrays.fill(iArr, 0);
        }
        if (qkjVar2 != null && qkjVar2.f155138g == 3 && this.f104287m == null) {
            Arrays.fill(iArr, 0);
        }
        if (qkjVar2 != null && (i2 = qkjVar2.f155138g) > 0) {
            if (i2 == 2) {
                if (!qkjVar.f155137f && (tkjVar = this.f104286l) != null) {
                    int i4 = tkjVar.f170884l;
                    if (qkjVar.f155142k == null || tkjVar.f170882j != qkjVar.f155139h) {
                        i3 = i4;
                    }
                }
                int i5 = qkjVar2.f155135d;
                int i6 = this.f104290p;
                int i7 = i5 / i6;
                int i8 = qkjVar2.f155133b / i6;
                int i9 = qkjVar2.f155134c / i6;
                int i10 = qkjVar2.f155132a / i6;
                int i11 = this.f104292r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f104292r;
                }
            } else if (i2 == 3 && (bitmap = this.f104287m) != null) {
                int i16 = this.f104292r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f104291q);
            }
        }
        m127932i(qkjVar);
        if (qkjVar.f155136e || this.f104290p != 1) {
            m127930g(qkjVar);
        } else {
            m127931h(qkjVar);
        }
        if (this.f104288n && ((i = qkjVar.f155138g) == 0 || i == 1)) {
            if (this.f104287m == null) {
                this.f104287m = m127933k();
            }
            Bitmap bitmap3 = this.f104287m;
            int i17 = this.f104292r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f104291q);
        }
        Bitmap bitmapM127933k = m127933k();
        int i18 = this.f104292r;
        bitmapM127933k.setPixels(iArr, 0, i18, 0, 0, i18, this.f104291q);
        return bitmapM127933k;
    }

    @Override // p149l.kkj
    /* JADX INFO: renamed from: a */
    public void mo127937a(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f104294t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p149l.kkj
    public void advance() {
        tkj tkjVar = this.f104286l;
        if (tkjVar != null) {
            this.f104285k = (this.f104285k + 1) % tkjVar.f170875c;
        }
    }

    @Override // p149l.kkj
    /* JADX INFO: renamed from: b */
    public void mo127938b() {
        this.f104285k = -1;
    }

    @Override // p149l.kkj
    /* JADX INFO: renamed from: c */
    public int mo127939c() {
        return this.f104285k;
    }

    @Override // p149l.kkj
    public void clear() {
        this.f104286l = null;
        byte[] bArr = this.f104283i;
        if (bArr != null) {
            this.f104277c.mo141882e(bArr);
        }
        int[] iArr = this.f104284j;
        if (iArr != null) {
            this.f104277c.mo141883f(iArr);
        }
        Bitmap bitmap = this.f104287m;
        if (bitmap != null) {
            this.f104277c.mo141881d(bitmap);
        }
        this.f104287m = null;
        this.f104278d = null;
        this.f104293s = null;
        byte[] bArr2 = this.f104279e;
        if (bArr2 != null) {
            this.f104277c.mo141882e(bArr2);
        }
    }

    @Override // p149l.kkj
    /* JADX INFO: renamed from: d */
    public int mo127940d() {
        return this.f104278d.limit() + this.f104283i.length + (this.f104284j.length * 4);
    }

    @Override // p149l.kkj
    /* JADX INFO: renamed from: e */
    public int mo127941e() {
        int i;
        tkj tkjVar = this.f104286l;
        if (tkjVar != null && tkjVar.f170875c > 0 && (i = this.f104285k) >= 0) {
            return m127942j(i);
        }
        return 0;
    }

    @Override // p149l.kkj
    @NonNull
    public ByteBuffer getData() {
        return this.f104278d;
    }

    @Override // p149l.kkj
    public int getFrameCount() {
        tkj tkjVar = this.f104286l;
        if (tkjVar != null) {
            return tkjVar.f170875c;
        }
        return 0;
    }

    @Override // p149l.kkj
    @Nullable
    public synchronized Bitmap getNextFrame() {
        try {
            tkj tkjVar = this.f104286l;
            if (tkjVar == null) {
                return null;
            }
            if (tkjVar.f170875c <= 0 || this.f104285k < 0) {
                if (Log.isLoggable(f104274u, 3)) {
                    int i = this.f104286l.f170875c;
                }
                this.f104289o = 1;
            }
            int i2 = this.f104289o;
            if (i2 != 1 && i2 != 2) {
                this.f104289o = 0;
                if (this.f104279e == null) {
                    this.f104279e = this.f104277c.mo141878a(255);
                }
                qkj qkjVar = this.f104286l.f170877e.get(this.f104285k);
                int i3 = this.f104285k - 1;
                qkj qkjVar2 = i3 >= 0 ? this.f104286l.f170877e.get(i3) : null;
                int[] iArr = qkjVar.f155142k;
                if (iArr == null) {
                    iArr = this.f104286l.f170873a;
                }
                this.f104275a = iArr;
                if (iArr == null) {
                    Log.isLoggable(f104274u, 3);
                    this.f104289o = 1;
                    return null;
                }
                if (qkjVar.f155137f) {
                    System.arraycopy(iArr, 0, this.f104276b, 0, iArr.length);
                    int[] iArr2 = this.f104276b;
                    this.f104275a = iArr2;
                    iArr2[qkjVar.f155139h] = 0;
                    if (qkjVar.f155138g == 2 && this.f104285k == 0) {
                        this.f104293s = Boolean.TRUE;
                    }
                }
                return m127936o(qkjVar, qkjVar2);
            }
            Log.isLoggable(f104274u, 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public int m127942j(int i) {
        tkj tkjVar = this.f104286l;
        if (tkjVar == null || i < 0 || i >= tkjVar.f170875c) {
            return -1;
        }
        return tkjVar.f170877e.get(i).f155140i;
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m127943n(@NonNull tkj tkjVar, @NonNull ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.f104289o = 0;
            this.f104286l = tkjVar;
            this.f104285k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f104278d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f104278d.order(ByteOrder.LITTLE_ENDIAN);
            this.f104288n = false;
            Iterator<qkj> it = tkjVar.f170877e.iterator();
            while (it.hasNext()) {
                if (it.next().f155138g == 3) {
                    this.f104288n = true;
                    break;
                }
            }
            this.f104290p = iHighestOneBit;
            int i2 = tkjVar.f170878f;
            this.f104292r = i2 / iHighestOneBit;
            int i3 = tkjVar.f170879g;
            this.f104291q = i3 / iHighestOneBit;
            this.f104283i = this.f104277c.mo141878a(i2 * i3);
            this.f104284j = this.f104277c.mo141880c(this.f104292r * this.f104291q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public gtf0(@NonNull kkj.InterfaceC18040a interfaceC18040a, tkj tkjVar, ByteBuffer byteBuffer, int i) {
        this(interfaceC18040a);
        m127943n(tkjVar, byteBuffer, i);
    }
}
