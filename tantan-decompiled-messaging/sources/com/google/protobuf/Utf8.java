package com.google.protobuf;

import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import p149l.gck0;
import p149l.hpj0;
import p149l.kck0;
import p149l.shg0;

/* JADX INFO: loaded from: classes7.dex */
public final class Utf8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3392a f11561a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Utf8$a */
    public static abstract class AbstractC3392a {
        /* JADX INFO: renamed from: f */
        public static int m17055f(ByteBuffer byteBuffer, int i, int i2) {
            int iM17045j = i + Utf8.m17045j(byteBuffer, i, i2);
            while (iM17045j < i2) {
                int i3 = iM17045j + 1;
                byte b = byteBuffer.get(iM17045j);
                if (b >= 0) {
                    iM17045j = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62 || byteBuffer.get(i3) > -65) {
                        return -1;
                    }
                    iM17045j += 2;
                } else {
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.m17049n(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = iM17045j + 2;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = iM17045j + 3;
                            if (byteBuffer.get(i4) <= -65) {
                                iM17045j += 4;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.m17049n(byteBuffer, b, i3, i2 - i3);
                    }
                    int i6 = iM17045j + 2;
                    byte b3 = byteBuffer.get(i3);
                    if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                        return -1;
                    }
                    iM17045j += 3;
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo17056a(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* JADX INFO: renamed from: b */
        public final boolean m17057b(ByteBuffer byteBuffer, int i, int i2) {
            return m17059d(0, byteBuffer, i, i2) == 0;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m17058c(byte[] bArr, int i, int i2) {
            return mo17060e(0, bArr, i, i2) == 0;
        }

        /* JADX INFO: renamed from: d */
        public final int m17059d(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? mo17062h(i, byteBuffer, i2, i3) : m17061g(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return mo17060e(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        /* JADX INFO: renamed from: e */
        public abstract int mo17060e(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r7.get(r8) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r7.get(r8) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r7.get(r6) > (-65)) goto L53;
         */
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int m17061g(int r6, java.nio.ByteBuffer r7, int r8, int r9) {
            /*
                r5 = this;
                if (r6 == 0) goto L92
                if (r8 < r9) goto L5
                return r6
            L5:
                byte r5 = (byte) r6
                r0 = -32
                r1 = -1
                r2 = -65
                if (r5 >= r0) goto L1e
                r6 = -62
                if (r5 < r6) goto L1d
                int r5 = r8 + 1
                byte r6 = r7.get(r8)
                if (r6 <= r2) goto L1a
                goto L1d
            L1a:
                r8 = r5
                goto L92
            L1d:
                return r1
            L1e:
                r3 = -16
                if (r5 >= r3) goto L4f
                int r6 = r6 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L38
                int r6 = r8 + 1
                byte r8 = r7.get(r8)
                if (r6 < r9) goto L35
                int r5 = com.google.protobuf.Utf8.m17036a(r5, r8)
                return r5
            L35:
                r4 = r8
                r8 = r6
                r6 = r4
            L38:
                if (r6 > r2) goto L4e
                r3 = -96
                if (r5 != r0) goto L40
                if (r6 < r3) goto L4e
            L40:
                r0 = -19
                if (r5 != r0) goto L46
                if (r6 >= r3) goto L4e
            L46:
                int r5 = r8 + 1
                byte r6 = r7.get(r8)
                if (r6 <= r2) goto L1a
            L4e:
                return r1
            L4f:
                int r0 = r6 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L64
                int r6 = r8 + 1
                byte r0 = r7.get(r8)
                if (r6 < r9) goto L62
                int r5 = com.google.protobuf.Utf8.m17036a(r5, r0)
                return r5
            L62:
                r8 = 0
                goto L6a
            L64:
                int r6 = r6 >> 16
                byte r6 = (byte) r6
                r4 = r8
                r8 = r6
                r6 = r4
            L6a:
                if (r8 != 0) goto L7c
                int r8 = r6 + 1
                byte r6 = r7.get(r6)
                if (r8 < r9) goto L79
                int r5 = com.google.protobuf.Utf8.m17037b(r5, r0, r6)
                return r5
            L79:
                r4 = r8
                r8 = r6
                r6 = r4
            L7c:
                if (r0 > r2) goto L91
                int r5 = r5 << 28
                int r0 = r0 + 112
                int r5 = r5 + r0
                int r5 = r5 >> 30
                if (r5 != 0) goto L91
                if (r8 > r2) goto L91
                int r8 = r6 + 1
                byte r5 = r7.get(r6)
                if (r5 <= r2) goto L92
            L91:
                return r1
            L92:
                int r5 = m17055f(r7, r8, r9)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.AbstractC3392a.m17061g(int, java.nio.ByteBuffer, int, int):int");
        }

        /* JADX INFO: renamed from: h */
        public abstract int mo17062h(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Utf8$b */
    public static final class C3393b extends AbstractC3392a {
        /* JADX INFO: renamed from: i */
        public static int m17063i(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m17064j(bArr, i, i2);
        }

        /* JADX INFO: renamed from: j */
        public static int m17064j(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.m17050o(bArr, i3, i2);
                        }
                        int i4 = i + 2;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i + 3;
                            if (bArr[i4] <= -65) {
                                i += 4;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.m17050o(bArr, i3, i2);
                    }
                    int i6 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i += 3;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.AbstractC3392a
        /* JADX INFO: renamed from: a */
        public int mo17056a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = charSequence.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = charSequence.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = charSequence.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i6, length);
                            }
                            kck0.m145443a(cCharAt2, i7);
                            return 0;
                        }
                        int i9 = i6 + 1;
                        if (i9 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new UnpairedSurrogateException(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                }
                i6++;
            }
            return i7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r7[r8] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r7[r8] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r7[r6] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.Utf8.AbstractC3392a
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo17060e(int r6, byte[] r7, int r8, int r9) {
            /*
                r5 = this;
                if (r6 == 0) goto L86
                if (r8 < r9) goto L5
                return r6
            L5:
                byte r5 = (byte) r6
                r0 = -32
                r1 = -1
                r2 = -65
                if (r5 >= r0) goto L1c
                r6 = -62
                if (r5 < r6) goto L1b
                int r5 = r8 + 1
                r6 = r7[r8]
                if (r6 <= r2) goto L18
                goto L1b
            L18:
                r8 = r5
                goto L86
            L1b:
                return r1
            L1c:
                r3 = -16
                if (r5 >= r3) goto L49
                int r6 = r6 >> 8
                int r6 = ~r6
                byte r6 = (byte) r6
                if (r6 != 0) goto L34
                int r6 = r8 + 1
                r8 = r7[r8]
                if (r6 < r9) goto L31
                int r5 = com.google.protobuf.Utf8.m17036a(r5, r8)
                return r5
            L31:
                r4 = r8
                r8 = r6
                r6 = r4
            L34:
                if (r6 > r2) goto L48
                r3 = -96
                if (r5 != r0) goto L3c
                if (r6 < r3) goto L48
            L3c:
                r0 = -19
                if (r5 != r0) goto L42
                if (r6 >= r3) goto L48
            L42:
                int r5 = r8 + 1
                r6 = r7[r8]
                if (r6 <= r2) goto L18
            L48:
                return r1
            L49:
                int r0 = r6 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L5c
                int r6 = r8 + 1
                r0 = r7[r8]
                if (r6 < r9) goto L5a
                int r5 = com.google.protobuf.Utf8.m17036a(r5, r0)
                return r5
            L5a:
                r8 = 0
                goto L62
            L5c:
                int r6 = r6 >> 16
                byte r6 = (byte) r6
                r4 = r8
                r8 = r6
                r6 = r4
            L62:
                if (r8 != 0) goto L72
                int r8 = r6 + 1
                r6 = r7[r6]
                if (r8 < r9) goto L6f
                int r5 = com.google.protobuf.Utf8.m17037b(r5, r0, r6)
                return r5
            L6f:
                r4 = r8
                r8 = r6
                r6 = r4
            L72:
                if (r0 > r2) goto L85
                int r5 = r5 << 28
                int r0 = r0 + 112
                int r5 = r5 + r0
                int r5 = r5 >> 30
                if (r5 != 0) goto L85
                if (r8 > r2) goto L85
                int r8 = r6 + 1
                r5 = r7[r6]
                if (r5 <= r2) goto L86
            L85:
                return r1
            L86:
                int r5 = m17063i(r7, r8, r9)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C3393b.mo17060e(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.AbstractC3392a
        /* JADX INFO: renamed from: h */
        public int mo17062h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return m17061g(i, byteBuffer, i2, i3);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.Utf8$c */
    public static final class C3394c extends AbstractC3392a {
        /* JADX INFO: renamed from: i */
        public static boolean m17065i() {
            return hpj0.m132352k() && hpj0.m132353l();
        }

        /* JADX INFO: renamed from: j */
        public static int m17066j(long j, int i) {
            int iM17068l = m17068l(j, i);
            long j2 = j + ((long) iM17068l);
            int i2 = i - iM17068l;
            while (true) {
                byte bM132347f = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bM132347f = hpj0.m132347f(j2);
                    if (bM132347f < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bM132347f < -32) {
                    if (i3 == 0) {
                        return bM132347f;
                    }
                    i2 -= 2;
                    if (bM132347f >= -62) {
                        long j4 = 1 + j2;
                        if (hpj0.m132347f(j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bM132347f >= -16) {
                    if (i3 < 3) {
                        return m17070n(j2, bM132347f, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bM132347f2 = hpj0.m132347f(j2);
                    if (bM132347f2 <= -65 && (((bM132347f << 28) + (bM132347f2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (hpj0.m132347f(j5) <= -65) {
                            j2 += 3;
                            if (hpj0.m132347f(j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return m17070n(j2, bM132347f, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bM132347f3 = hpj0.m132347f(j2);
                if (bM132347f3 <= -65 && ((bM132347f != -32 || bM132347f3 >= -96) && (bM132347f != -19 || bM132347f3 < -96))) {
                    j2 += 2;
                    if (hpj0.m132347f(j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: k */
        public static int m17067k(byte[] bArr, long j, int i) {
            int iM17069m = m17069m(bArr, j, i);
            int i2 = i - iM17069m;
            long j2 = j + ((long) iM17069m);
            while (true) {
                byte bM132348g = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bM132348g = hpj0.m132348g(bArr, j2);
                    if (bM132348g < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bM132348g < -32) {
                    if (i3 == 0) {
                        return bM132348g;
                    }
                    i2 -= 2;
                    if (bM132348g >= -62) {
                        long j4 = 1 + j2;
                        if (hpj0.m132348g(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bM132348g >= -16) {
                    if (i3 < 3) {
                        return m17071o(bArr, bM132348g, j2, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bM132348g2 = hpj0.m132348g(bArr, j2);
                    if (bM132348g2 <= -65 && (((bM132348g << 28) + (bM132348g2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (hpj0.m132348g(bArr, j5) <= -65) {
                            j2 += 3;
                            if (hpj0.m132348g(bArr, j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return m17071o(bArr, bM132348g, j2, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bM132348g3 = hpj0.m132348g(bArr, j2);
                if (bM132348g3 <= -65 && ((bM132348g != -32 || bM132348g3 >= -96) && (bM132348g != -19 || bM132348g3 < -96))) {
                    j2 += 2;
                    if (hpj0.m132348g(bArr, j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: l */
        public static int m17068l(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (hpj0.m132347f(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (hpj0.m132349h(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX INFO: renamed from: m */
        public static int m17069m(byte[] bArr, long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = ((int) j) & 7;
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (hpj0.m132348g(bArr, j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (hpj0.m132350i(bArr, j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* JADX INFO: renamed from: n */
        public static int m17070n(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.m17046k(i);
            }
            if (i2 == 1) {
                return Utf8.m17047l(i, hpj0.m132347f(j));
            }
            if (i2 == 2) {
                return Utf8.m17048m(i, hpj0.m132347f(j), hpj0.m132347f(j + 1));
            }
            shg0.m184191a();
            return 0;
        }

        /* JADX INFO: renamed from: o */
        public static int m17071o(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.m17046k(i);
            }
            if (i2 == 1) {
                return Utf8.m17047l(i, hpj0.m132348g(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.m17048m(i, hpj0.m132348g(bArr, j), hpj0.m132348g(bArr, j + 1));
            }
            shg0.m184191a();
            return 0;
        }

        @Override // com.google.protobuf.Utf8.AbstractC3392a
        /* JADX INFO: renamed from: a */
        public int mo17056a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            long jM132346e;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long jM132346e2 = hpj0.m132346e() + ((long) i);
            long j4 = ((long) i2) + jM132346e2;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                hpj0.m132354m(bArr, jM132346e2, (byte) cCharAt);
                i4++;
                jM132346e2 = 1 + jM132346e2;
            }
            if (i4 == length) {
                jM132346e = hpj0.m132346e();
            } else {
                while (i4 < length) {
                    char cCharAt2 = charSequence.charAt(i4);
                    if (cCharAt2 < 128 && jM132346e2 < j4) {
                        hpj0.m132354m(bArr, jM132346e2, (byte) cCharAt2);
                        j3 = j4;
                        j2 = j;
                        jM132346e2 += j;
                    } else if (cCharAt2 >= 2048 || jM132346e2 > j4 - 2) {
                        j2 = j;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jM132346e2 > j4 - 3) {
                            j3 = j4;
                            if (jM132346e2 > j3 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                    throw new UnpairedSurrogateException(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jM132346e2);
                            }
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    hpj0.m132354m(bArr, jM132346e2, (byte) ((codePoint >>> 18) | 240));
                                    hpj0.m132354m(bArr, jM132346e2 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j5 = jM132346e2 + 3;
                                    hpj0.m132354m(bArr, jM132346e2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jM132346e2 += 4;
                                    hpj0.m132354m(bArr, j5, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new UnpairedSurrogateException(i4 - 1, length);
                        }
                        hpj0.m132354m(bArr, jM132346e2, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j6 = jM132346e2 + 2;
                        j3 = j4;
                        hpj0.m132354m(bArr, jM132346e2 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jM132346e2 += 3;
                        hpj0.m132354m(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        j2 = j;
                        long j7 = jM132346e2 + j2;
                        hpj0.m132354m(bArr, jM132346e2, (byte) ((cCharAt2 >>> 6) | TXEAudioDef.TXE_OPUS_SAMPLE_NUM));
                        jM132346e2 += 2;
                        hpj0.m132354m(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                        j3 = j4;
                    }
                    i4++;
                    j = j2;
                    j4 = j3;
                }
                jM132346e = hpj0.m132346e();
            }
            return (int) (jM132346e2 - jM132346e);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (p149l.hpj0.m132348g(r12, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (p149l.hpj0.m132348g(r12, r1) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.AbstractC3392a
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo17060e(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C3394c.mo17060e(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (p149l.hpj0.m132347f(r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (p149l.hpj0.m132347f(r1) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.AbstractC3392a
        /* JADX INFO: renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo17062h(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.C3394c.mo17062h(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f11561a = C3394c.m17065i() ? new C3394c() : new C3393b();
    }

    /* JADX INFO: renamed from: g */
    public static int m17042g(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f11561a.mo17056a(charSequence, bArr, i, i2);
    }

    /* JADX INFO: renamed from: h */
    public static int m17043h(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int iM17044i = length;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 2048) {
                iM17044i += m17044i(charSequence, i);
                break;
            }
            iM17044i += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iM17044i >= length) {
            return iM17044i;
        }
        gck0.m125517a("UTF-8 length does not fit in int: ", ((long) iM17044i) + 4294967296L);
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m17044i(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public static int m17045j(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* JADX INFO: renamed from: k */
    public static int m17046k(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static int m17047l(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: m */
    public static int m17048m(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: renamed from: n */
    public static int m17049n(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return m17046k(i);
        }
        if (i3 == 1) {
            return m17047l(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return m17048m(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        shg0.m184191a();
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public static int m17050o(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m17046k(b);
        }
        if (i3 == 1) {
            return m17047l(b, bArr[i]);
        }
        if (i3 == 2) {
            return m17048m(b, bArr[i], bArr[i + 1]);
        }
        shg0.m184191a();
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m17051p(ByteBuffer byteBuffer) {
        return f11561a.m17057b(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: q */
    public static boolean m17052q(byte[] bArr, int i, int i2) {
        return f11561a.m17058c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public static int m17053r(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f11561a.m17059d(i, byteBuffer, i2, i3);
    }

    /* JADX INFO: renamed from: s */
    public static int m17054s(int i, byte[] bArr, int i2, int i3) {
        return f11561a.mo17060e(i, bArr, i2, i3);
    }
}
