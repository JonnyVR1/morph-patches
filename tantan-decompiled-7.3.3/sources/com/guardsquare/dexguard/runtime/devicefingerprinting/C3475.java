package com.guardsquare.dexguard.runtime.devicefingerprinting;

import android.content.Context;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.wg3;
import p153l.zpg0;

/* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ */
/* JADX INFO: loaded from: classes7.dex */
class C3475 {

    /* JADX INFO: renamed from: ʻ */
    private static Map<Member, Object> f11799 = null;

    /* JADX INFO: renamed from: ʼ */
    private static Field f11800 = null;

    /* JADX INFO: renamed from: ʽ */
    private static final byte[] f11801 = null;

    /* JADX INFO: renamed from: ˊ */
    private static Class f11802 = null;

    /* JADX INFO: renamed from: ˋ */
    private static Class f11803 = null;

    /* JADX INFO: renamed from: ˋॱ */
    private static int f11804 = 1;

    /* JADX INFO: renamed from: ˎ */
    private static EnumC22801 f11805;

    /* JADX INFO: renamed from: ˏ */
    private static List<EnumC22802> f11806;

    /* JADX INFO: renamed from: ॱ */
    private static Class f11807;

    /* JADX INFO: renamed from: ॱॱ */
    private static int f11808;

    /* JADX INFO: renamed from: ᐝ */
    private static Method f11809;

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: ˊ */
        static final /* synthetic */ int[] f11810;

        /* JADX INFO: renamed from: ˎ */
        private static int f11811 = 0;

        /* JADX INFO: renamed from: ˏ */
        private static int f11812 = 1;

        /* JADX INFO: renamed from: ॱ */
        static final /* synthetic */ int[] f11813;

        static {
            int[] iArr = new int[EnumC22802.values().length];
            f11813 = iArr;
            try {
                iArr[EnumC22802.f11839.ordinal()] = 1;
                int i = f11811;
                f11812 = ((i & 103) + (i | 103)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[Cif.values().length];
            f11810 = iArr2;
            try {
                iArr2[Cif.f11817.ordinal()] = 1;
                int i2 = f11812;
                f11811 = ((i2 & 21) + (i2 | 21)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11810[Cif.f11821.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11810[Cif.f11818.ordinal()] = 3;
                int i3 = f11811 + 87;
                f11812 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˊ' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ$if, reason: invalid class name */
    public static final class Cif {

        /* JADX INFO: renamed from: ʻ */
        private static int f11814 = 0;

        /* JADX INFO: renamed from: ʼ */
        private static int f11815 = 1;

        /* JADX INFO: renamed from: ʽ */
        private static int f11816;

        /* JADX INFO: renamed from: ˊ */
        public static final Cif f11817;

        /* JADX INFO: renamed from: ˋ */
        public static final Cif f11818;

        /* JADX INFO: renamed from: ˎ */
        private static final /* synthetic */ Cif[] f11819;

        /* JADX INFO: renamed from: ˏ */
        private static final byte[] f11820 = null;

        /* JADX INFO: renamed from: ॱ */
        public static final Cif f11821;

        static {
            m17504();
            int i = f11814;
            byte[] bArr = f11820;
            Cif cif = new Cif(m17505((byte) (i & 45), bArr[5], (byte) (i & 40)).intern(), 0);
            f11817 = cif;
            byte b = bArr[2];
            Cif cif2 = new Cif(m17505(b, bArr[5], b).intern(), 1);
            f11821 = cif2;
            Cif cif3 = new Cif(m17505(bArr[7], bArr[2], bArr[23]).intern(), 2);
            f11818 = cif3;
            f11819 = new Cif[]{cif, cif2, cif3};
            int i2 = f11816;
            int i3 = (i2 & 39) + (i2 | 39);
            f11815 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 20 / 0;
            }
        }

        private Cif(String str, int i) {
            super(str, i);
        }

        public static Cif valueOf(String str) {
            int i = f11815;
            int i2 = (i ^ 79) + ((i & 79) << 1);
            f11816 = i2 % 128;
            if (i2 % 2 != 0) {
                Enum.valueOf(Cif.class, str);
                throw null;
            }
            Cif cif = (Cif) Enum.valueOf(Cif.class, str);
            int i3 = f11816;
            f11815 = (((i3 | 39) << 1) - (i3 ^ 39)) % 128;
            return cif;
        }

        public static Cif[] values() {
            f11815 = (f11816 + 83) % 128;
            Cif[] cifArr = (Cif[]) f11819.clone();
            int i = f11816 + 17;
            f11815 = i % 128;
            if (i % 2 != 0) {
                return cifArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ˊ */
        private static void m17504() {
            f11820 = new byte[]{39, -95, 0, -100, -9, 1, -15, 7, 4, -15, -1, -21, 17, -3, -5, -9, -15, 26, -15, -4, -23, 26, -25, HttpTokens.CARRIAGE_RETURN, -17, -6, 11, -3, -15, -4, -23, 26, -25, HttpTokens.CARRIAGE_RETURN, -17, -6, 11, -3};
            f11814 = 158;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002e  */
        /* JADX WARN: Code duplicated, block: B:14:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:15:0x0043). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: ˎ */
        private static java.lang.String m17505(short r7, int r8, short r9) {
            /*
                byte[] r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.Cif.f11820
                int r8 = r8 * 4
                int r8 = 15 - r8
                int r9 = r9 + 65
                int r7 = r7 * 2
                int r7 = 27 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L24
                int r9 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.Cif.f11816
                int r9 = r9 + 77
                int r3 = r9 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.Cif.f11815 = r3
                int r9 = r9 % 2
                if (r9 == 0) goto L22
                r9 = r7
                r3 = r0
                r4 = r2
                r0 = r8
                goto L43
            L22:
                r7 = 0
                throw r7
            L24:
                r3 = r2
            L25:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L3c
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                int r8 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.Cif.f11815
                int r8 = r8 + 81
                int r8 = r8 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.Cif.f11816 = r8
                return r7
            L3c:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r0
                r0 = r6
            L43:
                int r0 = r0 - r7
                int r7 = r0 + (-4)
                r0 = r9
                r9 = r7
                r7 = r0
                r0 = r3
                r3 = r4
                goto L25
            */
            throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.Cif.m17505(short, int, short):java.lang.String");
        }
    }

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ$ı, reason: contains not printable characters */
    public static class C22800 {

        /* JADX INFO: renamed from: ˏ */
        private static int f11822 = 0;

        /* JADX INFO: renamed from: ॱ */
        private static int f11823 = 1;

        /* JADX INFO: renamed from: ˋ */
        private Cif f11825 = Cif.f11817;

        /* JADX INFO: renamed from: ˊ */
        private Set<EnumC22802> f11824 = EnumSet.noneOf(EnumC22802.class);

        /* JADX INFO: renamed from: ˏ */
        public static /* synthetic */ Set m17506(C22800 c22800) {
            int i = f11823;
            int i2 = ((i ^ 77) + ((i & 77) << 1)) % 128;
            f11822 = i2;
            Set<EnumC22802> set = c22800.f11824;
            f11823 = ((i2 ^ 3) + ((i2 & 3) << 1)) % 128;
            return set;
        }

        /* JADX INFO: renamed from: ˋ */
        public void mo17487(boolean z) {
            Cif cif;
            int i = f11822;
            f11823 = (((i | 97) << 1) - (i ^ 97)) % 128;
            int i2 = AnonymousClass2.f11810[this.f11825.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (z) {
                    int i3 = f11822 + 79;
                    f11823 = i3 % 128;
                    if (i3 % 2 == 0) {
                        Cif cif2 = Cif.f11817;
                        throw null;
                    }
                    cif = Cif.f11821;
                } else {
                    cif = Cif.f11818;
                }
                this.f11825 = cif;
            }
            int i4 = f11822 + 119;
            f11823 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˏ' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ$ǃ, reason: contains not printable characters */
    public static final class EnumC22801 {

        /* JADX INFO: renamed from: ʼ */
        private static int f11826 = 0;

        /* JADX INFO: renamed from: ˊ */
        public static final EnumC22801 f11827;

        /* JADX INFO: renamed from: ˋ */
        private static final /* synthetic */ EnumC22801[] f11828;

        /* JADX INFO: renamed from: ˎ */
        private static final byte[] f11829 = null;

        /* JADX INFO: renamed from: ˏ */
        public static final EnumC22801 f11830;

        /* JADX INFO: renamed from: ॱ */
        public static final EnumC22801 f11831;

        /* JADX INFO: renamed from: ॱॱ */
        private static int f11832 = 0;

        /* JADX INFO: renamed from: ᐝ */
        private static int f11833 = 1;

        static {
            m17507();
            byte[] bArr = f11829;
            byte b = bArr[5];
            byte b2 = b;
            EnumC22801 enumC22801 = new EnumC22801(m17508(b2, (byte) ((b2 ^ 7) | (b2 & 7)), b).intern(), 0);
            f11830 = enumC22801;
            byte b3 = (byte) (f11826 & 7);
            byte b4 = bArr[6];
            EnumC22801 enumC22802 = new EnumC22801(m17508(b3, b4, (byte) (b4 - 2)).intern(), 1);
            f11831 = enumC22802;
            byte b5 = bArr[5];
            EnumC22801 enumC22803 = new EnumC22801(m17508((byte) 20, b5, (byte) (b5 + 4)).intern(), 2);
            f11827 = enumC22803;
            f11828 = new EnumC22801[]{enumC22801, enumC22802, enumC22803};
            int i = f11832 + 1;
            f11833 = i % 128;
            if (i % 2 == 0) {
                int i2 = 64 / 0;
            }
        }

        private EnumC22801(String str, int i) {
            super(str, i);
        }

        public static EnumC22801 valueOf(String str) {
            int i = f11832;
            f11833 = ((i & 25) + (i | 25)) % 128;
            EnumC22801 enumC22801 = (EnumC22801) Enum.valueOf(EnumC22801.class, str);
            int i2 = f11833;
            f11832 = ((i2 & 89) + (i2 | 89)) % 128;
            return enumC22801;
        }

        public static EnumC22801[] values() {
            f11832 = (f11833 + 47) % 128;
            EnumC22801[] enumC22801Arr = (EnumC22801[]) f11828.clone();
            f11833 = (f11832 + 83) % 128;
            return enumC22801Arr;
        }

        /* JADX INFO: renamed from: ˋ */
        private static void m17507() {
            f11829 = new byte[]{93, -57, 117, -116, -15, 0, 5, -9, -8, 15, 0, 9, 5, -1, 1, -6, 11};
            f11826 = CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: ॱ */
        private static java.lang.String m17508(byte r6, byte r7, byte r8) {
            /*
                int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22801.f11833
                int r0 = r0 + 83
                int r0 = r0 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22801.f11832 = r0
                byte[] r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22801.f11829
                int r1 = r8 + 3
                int r6 = r6 + 65
                int r7 = 10 - r7
                byte[] r1 = new byte[r1]
                int r8 = r8 + 2
                r2 = 0
                if (r0 != 0) goto L1a
                r3 = r8
                r4 = r2
                goto L34
            L1a:
                r3 = r2
            L1b:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L2a:
                r3 = r0[r7]
                int r5 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22801.f11833
                int r5 = r5 + 67
                int r5 = r5 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22801.f11832 = r5
            L34:
                int r6 = r6 - r3
                int r6 = r6 + 2
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22801.m17508(byte, byte, byte):java.lang.String");
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˏ' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ$ɩ, reason: contains not printable characters */
    public static final class EnumC22802 {

        /* JADX INFO: renamed from: ʼ */
        private static int f11834 = 1;

        /* JADX INFO: renamed from: ʽ */
        private static int f11835;

        /* JADX INFO: renamed from: ˊ */
        public static final EnumC22802 f11836;

        /* JADX INFO: renamed from: ˋ */
        private static EnumC22802 f11837;

        /* JADX INFO: renamed from: ˎ */
        private static EnumC22802 f11838;

        /* JADX INFO: renamed from: ˏ */
        public static final EnumC22802 f11839;

        /* JADX INFO: renamed from: ॱ */
        private static final /* synthetic */ EnumC22802[] f11840;

        /* JADX INFO: renamed from: ᐝ */
        private static final byte[] f11841 = null;

        static {
            m17510();
            byte[] bArr = f11841;
            byte b = (byte) (bArr[5] - 1);
            byte b2 = bArr[10];
            EnumC22802 enumC22802 = new EnumC22802(m17509(b, b2, (byte) (b2 - 2)).intern(), 0);
            f11839 = enumC22802;
            f11837 = new EnumC22802(m17509(bArr[19], bArr[5], bArr[7]).intern(), 1);
            f11838 = new EnumC22802(m17509((byte) 23, (byte) (bArr[5] - 1), (byte) (-bArr[20])).intern(), 2);
            byte b3 = bArr[13];
            EnumC22802 enumC22803 = new EnumC22802(m17509(b3, b3, bArr[4]).intern(), 3);
            f11836 = enumC22803;
            f11840 = new EnumC22802[]{enumC22802, f11837, f11838, enumC22803};
            int i = f11835;
            int i2 = ((i | 119) << 1) - (i ^ 119);
            f11834 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        private EnumC22802(String str, int i) {
            super(str, i);
        }

        public static EnumC22802 valueOf(String str) {
            int i = f11834;
            int i2 = ((i | 115) << 1) - (i ^ 115);
            f11835 = i2 % 128;
            int i3 = i2 % 2;
            EnumC22802 enumC22802 = (EnumC22802) Enum.valueOf(EnumC22802.class, str);
            if (i3 != 0) {
                int i4 = 58 / 0;
            }
            return enumC22802;
        }

        public static EnumC22802[] values() {
            int i = f11835;
            f11834 = ((i ^ 55) + ((i & 55) << 1)) % 128;
            EnumC22802[] enumC22802Arr = (EnumC22802[]) f11840.clone();
            int i2 = f11835;
            int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
            f11834 = i3 % 128;
            if (i3 % 2 != 0) {
                return enumC22802Arr;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0041  */
        /* JADX WARN: Code duplicated, block: B:17:0x0047  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0047 -> B:18:0x004e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: ˎ */
        private static java.lang.String m17509(byte r7, int r8, short r9) {
            /*
                int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22802.f11834
                int r0 = r0 + 77
                int r1 = r0 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22802.f11835 = r1
                int r0 = r0 % 2
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L20
                int r0 = r8 + 2
                int r7 = 58 - r7
                byte[] r4 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22802.f11841
                int r9 = r9 + 17
                byte[] r0 = new byte[r0]
                int r8 = r8 + 123
                if (r4 != 0) goto L1e
                r5 = r3
                goto L2f
            L1e:
                r1 = r3
                goto L3a
            L20:
                int r0 = r8 + 4
                int r7 = 88 - r7
                byte[] r4 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22802.f11841
                int r9 = r9 + 4
                byte[] r0 = new byte[r0]
                int r8 = r8 + 3
                if (r4 != 0) goto L39
                r5 = r2
            L2f:
                int r1 = r1 + 71
                int r1 = r1 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22802.f11834 = r1
                r1 = r0
                r0 = r9
                r9 = r8
                goto L4e
            L39:
                r1 = r2
            L3a:
                byte r5 = (byte) r7
                r0[r1] = r5
                int r5 = r1 + 1
                if (r1 != r8) goto L47
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r2)
                return r7
            L47:
                r1 = r4[r9]
                r6 = r9
                r9 = r8
                r8 = r1
                r1 = r0
                r0 = r6
            L4e:
                int r7 = r7 - r8
                int r8 = r0 + 1
                int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22802.f11834
                int r0 = r0 + 119
                int r0 = r0 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22802.f11835 = r0
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r1
                r1 = r5
                goto L3a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.EnumC22802.m17509(byte, int, short):java.lang.String");
        }

        /* JADX INFO: renamed from: ॱ */
        private static void m17510() {
            f11841 = new byte[]{122, 125, -103, -123, 8, 1, -4, 14, 1, -3, 2, -7, 7, 3, -3, -1, -8, 9, -22, 21, -5, 8};
        }
    }

    static {
        m17494();
        f11806 = new ArrayList();
        byte[] bArr = f11801;
        String property = System.getProperty(m17493((short) 103, bArr[48], bArr[141]));
        EnumC22801 enumC22801 = EnumC22801.f11827;
        f11805 = enumC22801;
        if (property == null) {
            int i = f11808;
            int i2 = ((i | 67) << 1) - (i ^ 67);
            f11804 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } else {
            try {
                if (Integer.parseInt(property.substring(0, 1)) >= 2) {
                    int i3 = f11808 + 71;
                    f11804 = i3 % 128;
                    if (i3 % 2 == 0) {
                        EnumC22801 enumC22802 = EnumC22801.f11830;
                        throw null;
                    }
                    enumC22801 = EnumC22801.f11830;
                    int i4 = f11804;
                    f11808 = ((i4 ^ 7) + ((i4 & 7) << 1)) % 128;
                } else {
                    enumC22801 = EnumC22801.f11831;
                }
            } catch (NumberFormatException unused) {
            }
        }
        f11805 = enumC22801;
        int i5 = f11804;
        f11808 = ((i5 & 103) + (i5 | 103)) % 128;
        try {
            byte[] bArr2 = f11801;
            byte b = bArr2[309];
            Class<?> cls = Class.forName(m17493((short) 260, (byte) ((b ^ (-1)) + (b << 1)), bArr2[396]), true, ClassLoader.getSystemClassLoader());
            f11803 = cls;
            if (cls != null) {
                int i6 = f11804;
                f11808 = ((i6 ^ 63) + ((i6 & 63) << 1)) % 128;
                f11806.add(EnumC22802.f11839);
                try {
                    Field declaredField = f11803.getDeclaredField(m17493((short) 295, bArr2[439], bArr2[5]));
                    declaredField.setAccessible(true);
                    f11799 = (HashMap) declaredField.get(f11803);
                    Field declaredField2 = f11803.getDeclaredField(m17493((short) 311, (byte) 70, bArr2[396]));
                    f11800 = declaredField2;
                    declaredField2.setAccessible(true);
                    f11809 = f11803.getDeclaredMethod(m17493(bArr2[204], bArr2[110], bArr2[37]), Member.class, Object.class, Object[].class);
                    try {
                        f11807 = Class.forName(m17493((short) 402, bArr2[233], bArr2[396]), true, ClassLoader.getSystemClassLoader());
                        f11803.getDeclaredMethod(m17493((short) 501, (byte) 70, bArr2[83]), Member.class, f11807);
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (Exception unused3) {
                    int i7 = f11804;
                    f11808 = ((i7 & 65) + (i7 | 65)) % 128;
                }
            } else {
                int i8 = f11804;
                f11808 = ((i8 & 65) + (i8 | 65)) % 128;
            }
        } catch (ClassNotFoundException unused4) {
            String strM17488 = C3474.m17488();
            byte[] bArr3 = f11801;
            if (strM17488.contains(m17493((short) 300, bArr3[286], bArr3[14]))) {
                f11806.add(EnumC22802.f11839);
            }
        }
        f11805.equals(EnumC22801.f11831);
        int i9 = f11808;
        f11804 = ((i9 ^ 83) + ((i9 & 83) << 1)) % 128;
    }

    /* JADX INFO: renamed from: ˊ */
    private static Object m17491(Member member, Object obj, Object[] objArr, C22800 c22800) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        int i = f11804 + 95;
        f11808 = i % 128;
        if (i % 2 != 0) {
            m17496(member);
            throw null;
        }
        List<EnumC22802> listM17496 = m17496(member);
        if (c22800 != null) {
            C22800.m17506(c22800).addAll(listM17496);
            f11808 = (f11804 + 21) % 128;
        }
        if ((!listM17496.isEmpty()) && listM17496.size() == 1) {
            int i2 = f11804;
            f11808 = (((i2 | 7) << 1) - (i2 ^ 7)) % 128;
            if (AnonymousClass2.f11813[listM17496.get(0).ordinal()] == 1) {
                if (c22800 != null) {
                    c22800.mo17487(true);
                    int i3 = f11804;
                    f11808 = ((i3 ^ 67) + ((i3 & 67) << 1)) % 128;
                }
                if (!(member instanceof Method)) {
                    f11800.setBoolean(f11803, true);
                    Object objNewInstance = ((Constructor) member).newInstance(objArr);
                    f11800.setBoolean(f11803, false);
                    return objNewInstance;
                }
                int i4 = f11808;
                f11804 = (((i4 | 77) << 1) - (i4 ^ 77)) % 128;
                Object objInvoke = f11809.invoke(f11803, member, obj, objArr);
                int i5 = f11804 + 115;
                f11808 = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvoke;
                }
                throw null;
            }
        }
        if (c22800 != null) {
            int i6 = f11804;
            int i7 = ((i6 | 109) << 1) - (i6 ^ 109);
            f11808 = i7 % 128;
            int i8 = i7 % 2;
            c22800.mo17487(false);
        }
        return member instanceof Constructor ? ((Constructor) member).newInstance(objArr) : ((Method) member).invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: ˋ */
    public static String m17495(Context context, String str, C22800 c22800) {
        String str2;
        String strTrim;
        Object objM17503;
        if (f11802 == null) {
            int i = f11808;
            f11804 = ((i ^ 15) + ((i & 15) << 1)) % 128;
            ClassLoader classLoader = context.getClassLoader();
            byte[] bArr = f11801;
            String[] strArr = {m17493((short) 206, bArr[533], bArr[151]), m17493((short) 226, (byte) (-bArr[109]), bArr[151])};
            f11804 = (f11808 + 9) % 128;
            for (int i2 = 0; i2 < 2; i2 = ((i2 | 1) << 1) - (i2 ^ 1)) {
                try {
                    f11802 = classLoader.loadClass(strArr[i2]);
                    f11804 = (f11808 + 117) % 128;
                    break;
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        if (f11802 != null) {
            int i3 = f11804;
            int i4 = (i3 & 75) + (i3 | 75);
            f11808 = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    byte[] bArr2 = f11801;
                    String strM17493 = m17493((short) 22057, bArr2[107], bArr2[3903]);
                    Class cls = f11802;
                    Class[] clsArr = new Class[0];
                    clsArr[1] = String.class;
                    Object[] objArr = new Object[0];
                    objArr[0] = str;
                    objM17503 = m17503(strM17493, cls, clsArr, objArr, c22800);
                } else {
                    byte[] bArr3 = f11801;
                    objM17503 = m17503(m17493((short) 344, bArr3[74], bArr3[139]), f11802, new Class[]{String.class}, new Object[]{str}, c22800);
                }
                str2 = (String) objM17503;
            } catch (Exception unused2) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            byte[] bArr4 = f11801;
            sb.append(m17493((short) 409, (byte) (bArr4[167] + 1), bArr4[139]));
            sb.append(str);
            strTrim = m17502(new String[]{sb.toString()}, c22800).trim();
        } catch (IOException unused3) {
            strTrim = null;
        }
        if (str2 != null) {
            f11804 = (f11808 + 115) % 128;
            if (strTrim != null) {
                if (str2.equals(strTrim)) {
                    int i5 = f11804;
                    f11808 = ((i5 ^ 49) + ((i5 & 49) << 1)) % 128;
                    return str2;
                }
                if (c22800 != null) {
                    f11804 = (f11808 + 119) % 128;
                    C22800.m17506(c22800).add(EnumC22802.f11836);
                    c22800.mo17487(false);
                    int i6 = f11804;
                    f11808 = ((i6 & 61) + (i6 | 61)) % 128;
                }
            }
        }
        if (str2 != null) {
            f11804 = (f11808 + 7) % 128;
            return str2;
        }
        if (strTrim == null) {
            return "";
        }
        int i7 = f11804;
        int i8 = ((i7 | 33) << 1) - (i7 ^ 33);
        f11808 = i8 % 128;
        if (i8 % 2 == 0) {
            return strTrim;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ˎ */
    private static boolean m17499(File file, C22800 c22800) {
        f11804 = (f11808 + 17) % 128;
        try {
            byte[] bArr = f11801;
            if (!((Boolean) m17503(m17493(bArr[1], bArr[286], bArr[204]), file, null, null, c22800)).booleanValue()) {
                int i = f11804;
                f11808 = ((i ^ 9) + ((i & 9) << 1)) % 128;
                if (!((Boolean) m17503(m17493(bArr[31], (byte) (-bArr[330]), bArr[37]), file, null, null, c22800)).booleanValue()) {
                    int i2 = f11804 + 63;
                    f11808 = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (!((Boolean) m17503(m17493((short) 19112, bArr[28448], bArr[53]), file, null, null, c22800)).booleanValue()) {
                            return false;
                        }
                    } else if (!((Boolean) m17503(m17493((short) 274, bArr[286], bArr[37]), file, null, null, c22800)).booleanValue()) {
                        return false;
                    }
                }
            }
            f11808 = (f11804 + 31) % 128;
            return true;
        } catch (Exception unused) {
            new RuntimeException();
            return file.exists();
        }
    }

    /* JADX INFO: renamed from: ˏ */
    private static String m17502(String[] strArr, C22800 c22800) throws IOException {
        char c = 15;
        try {
            try {
                byte[] bArr = f11801;
                Process process = (Process) m17503(m17493(bArr[164], bArr[349], bArr[204]), Runtime.getRuntime(), new Class[]{String[].class, String[].class, File.class}, new Object[]{new String[]{m17493((short) 345, bArr[15], bArr[5])}, null, null}, c22800);
                C3471If c3471If = new C3471If(process.getInputStream());
                C3471If c3471If2 = new C3471If(process.getErrorStream());
                DataOutputStream dataOutputStream = new DataOutputStream(process.getOutputStream());
                c3471If.start();
                c3471If2.start();
                int i = f11808;
                f11804 = (((i | 45) << 1) - (i ^ 45)) % 128;
                int i2 = 0;
                while (i2 <= 0) {
                    String str = strArr[0];
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    byte[] bArr2 = f11801;
                    char c2 = c;
                    try {
                        sb.append(m17493((short) 367, bArr2[380], (byte) 110));
                        dataOutputStream.write(sb.toString().getBytes(m17493((short) 268, bArr2[57], bArr2[10])));
                        dataOutputStream.flush();
                        i2 = ((i2 | 1) << 1) - (i2 ^ 1);
                        c = c2;
                    } catch (InvocationTargetException e) {
                        e = e;
                        Exception exc = (Exception) e.getCause();
                        if (!(exc instanceof NullPointerException) && !(exc instanceof IllegalArgumentException)) {
                            int i3 = f11804;
                            int i4 = (i3 & 15) + (i3 | 15);
                            int i5 = i4 % 128;
                            f11808 = i5;
                            if (i4 % 2 != 0) {
                                throw null;
                            }
                            if (!(exc instanceof SecurityException)) {
                                if (exc instanceof IOException) {
                                    f11804 = ((i5 ^ 29) + ((i5 & 29) << 1)) % 128;
                                    throw ((IOException) exc);
                                }
                                byte[] bArr3 = f11801;
                                zpg0.m220844a(m17493((short) (-bArr3[23]), bArr3[533], bArr3[135]));
                                return null;
                            }
                        }
                        throw ((RuntimeException) exc);
                    }
                }
                byte[] bArr4 = f11801;
                dataOutputStream.write(m17493((short) 264, bArr4[57], bArr4[204]).getBytes(m17493((short) 268, bArr4[57], bArr4[10])));
                dataOutputStream.flush();
                try {
                    process.waitFor();
                    try {
                        dataOutputStream.close();
                        int i6 = f11804;
                        f11808 = (((i6 | 79) << 1) - (i6 ^ 79)) % 128;
                    } catch (IOException unused) {
                    }
                    c3471If.join();
                    c3471If2.join();
                    try {
                        process.destroy();
                    } catch (Exception unused2) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c3471If.m17486());
                    sb2.append(c3471If2.m17486());
                    String string = sb2.toString();
                    int i7 = f11808 + 71;
                    f11804 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 6 / 0;
                    }
                    return string;
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (Throwable th) {
                    try {
                        process.destroy();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            } catch (Exception unused4) {
                byte[] bArr5 = f11801;
                zpg0.m220844a(m17493((short) (-bArr5[23]), bArr5[533], bArr5[135]));
                return null;
            }
        } catch (InvocationTargetException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ॱ */
    public static Object m17503(String str, Object obj, Class[] clsArr, Object[] objArr, C22800 c22800) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls;
        Class cls2;
        Class cls3;
        int i = f11808;
        f11804 = ((i & 9) + (i | 9)) % 128;
        if (obj instanceof Class) {
            cls3 = (Class) obj;
            f11804 = ((i & 119) + (i | 119)) % 128;
        } else {
            cls = obj.getClass();
        }
        if (clsArr == null) {
            cls2 = cls;
            int i2 = f11804 + 121;
            int i3 = i2 % 128;
            f11808 = i3;
            if (i2 % 2 != 0) {
                cls2 = cls3;
                clsArr = new Class[1];
            } else {
                cls2 = cls3;
                clsArr = new Class[0];
            }
            f11804 = ((i3 ^ 47) + ((i3 & 47) << 1)) % 128;
        } else {
            cls2 = cls;
            cls2 = cls3;
            f11808 = (f11804 + 89) % 128;
        }
        try {
            Object objM17491 = m17491(cls2.getMethod(str, clsArr), obj, objArr, c22800);
            f11804 = (f11808 + 43) % 128;
            return objM17491;
        } catch (InstantiationException unused) {
            new RuntimeException();
            return null;
        }
    }

    /* JADX INFO: renamed from: ˎ */
    private static int m17497(Member member) {
        int i = f11808;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        f11804 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(member instanceof Method)) {
                f11804 = (((i | 17) << 1) - (i ^ 17)) % 128;
                if (!(member instanceof Constructor)) {
                    byte[] bArr = f11801;
                    wg3.m206174a(m17493((short) 180, bArr[447], (byte) (-bArr[117])));
                    return 0;
                }
            }
            try {
                if (f11805 == EnumC22801.f11830) {
                    int i3 = f11804 + 57;
                    f11808 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 48 / 0;
                    }
                }
                f11808 = (f11804 + 31) % 128;
            } catch (Throwable unused) {
            }
            int modifiers = member.getModifiers();
            int i5 = f11808 + 25;
            f11804 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return modifiers;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ˎ */
    public static String m17498(String str, C22800 c22800) {
        byte b;
        byte b2;
        short s;
        int i = f11804;
        int i2 = (i & 113) + (i | 113);
        f11808 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = f11801;
        if (i3 != 0) {
            b = bArr[64];
            b2 = bArr[63];
            s = 31878;
        } else {
            b = bArr[15];
            b2 = bArr[61];
            s = 269;
        }
        return m17492(str, m17493(s, b, b2), c22800);
    }

    /* JADX INFO: renamed from: ˊ */
    private static void m17494() {
        byte[] bArr = new byte[540];
        System.arraycopy("\u0006Y\u0001X\u0004\u0005\u0012\u000b\u0007í#\u001aÿ\u0012\u0000P,\u0010·^ù\u0010\nÆ_\u0006¼P\u001eø\t\u001d\nüÆ[\n\u000f\u000b\u0001\u0004\u0015\u0018²Y\f\u0010ÄC\u001eü\u0015\f\u0000\u0010\u0004ÄM\u0012\u0010þ\u001c\u0002\u0007\u0019¸Z\n½_ÿ\f\u0015¸O\f\u001cþ\u0005\rÒÿ^\u0003\t\u0012\u000b\u0004\u0010\u0004Ä_ü\u0019\fÅ\t\u001a\u0007\r\b\f»\fÔO\bþ\u001fÃ>\u0018\u0001\u0019\b\u0005\u0006ÕU\u0003\n\u000fý\nÕ5ö'ù#\u001aÿ\u0012\u0000ï2\u000b\u0007\u0005\u0011\u0005\u000e\r\u000b\r\u0019\u000bÞ1\u0000\u0011\u0017\u001c\rä#\u001aÿ\u0012\u0000\u0000\t\u001a\u0002 öØI\u0000\u0018\u0004ÒOþ\f\u0011\u0004\t\u001cÅ\u001e,\u001c\f\tú\r\u001cä#\u001aÿ\u0012\u0000\u0010\u0015ù\f\u0015\u0004î2\u000b\u0007\u0013\u0003\n\u000fý\nà2\u000b\u0007\u0005\nô#\u001aÿ\u0012\u0000ê)\u0016\u000b\u0001\n\r\u0013\u0013\u0015Þ.\u000e\u0004ð\nýò\u0016\u001eü\u0016¡\fÔO\bþ\u001fÃ>\u0018\u0001\u0019\b\u0005\u0006ÕU\u0003\n\u000fý\nÕ5#\n\u000fý\né;\u0002\u0006\u000e\t\u0018\u0001\u0019\b\u0005\u0006ÕL\u000fÆM\r\b\f\u0000\u0018\r\u0000\u0007\u0019\u0018\u0001\u0019\b\u0005\u0006ÕL\u000fÆ01\u0005\fü\u0013î-\b\f\u0000\u0018\r\u0000\u0007\u0019#\u0013\u0000\u000e\u0018¹X\u0013\t\f·M\u000eÆX\u0003\u001aÿ\u0012\u0000ÇZ\u000e¹N\u0017\n\u0010\f\t\u000eù\u001c\u0006\u000e¹Zþ\u0013\u0006\t\u001cÅ\t\u001aç-\b\f\u0000\u0018\r\u0010ÍðQ\u0006\u0013\u000e\u0004\nÇ_\u0006¼Q\u000e\u0010\u0001ÇN\u0014\u0000\u001d\u000b¸\u0012\u0002 öØS\u0002ÌSú\u0018\f\u0001\u0011\n\u001eü\u0015\f\n\u0002 öØI\u0000\u0018\u0004ÒOþ\f\u0011\u0004\t\u001cÅ\u001e<\rä#\u001aÿ\u0012\u0000&\u0013\u000e\u0004\nÇ_\u0006¼N\u001aþ\u0007\u001eüÆLÊ[\r\bÿ\r\u0019\u000bÆ\u001eø\t\u0015Ü0\u0014þ\t\u001c\u0006\u000e\u0012\u0010\u0013\u0004\u0007\u0005õ.\u0002\t\r\u0010þ\u0016ì#\u001aÿ\u0012\u0000$\u0002\u001e\u0003\u0000\t\u001cü\nÇP\u001eö\r\u0016\u000f\u0000\u0011\n½T\u0010½P\u001eø\të7\t\u000bÿ\u0018\u0001Õ".getBytes("ISO-8859-1"), 0, bArr, 0, 540);
        f11801 = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:15:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ˊ */
    private static java.lang.String m17493(short r7, byte r8, byte r9) {
        /*
            int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.f11804
            int r1 = r0 + 17
            int r1 = r1 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.f11808 = r1
            byte[] r1 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.f11801
            int r7 = 505 - r7
            int r9 = 120 - r9
            int r2 = 82 - r8
            byte[] r2 = new byte[r2]
            int r8 = 81 - r8
            r3 = 0
            if (r1 != 0) goto L27
            int r0 = r0 + 17
            int r4 = r0 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.f11808 = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L25
            r4 = r9
            r0 = r3
            r9 = r7
            goto L49
        L25:
            r7 = 0
            throw r7
        L27:
            r0 = r9
            r9 = r7
            r7 = r0
            r0 = r3
        L2b:
            byte r4 = (byte) r7
            r2[r0] = r4
            if (r0 != r8) goto L3a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2, r3)
            java.lang.String r7 = r7.intern()
            return r7
        L3a:
            int r0 = r0 + 1
            r4 = r1[r9]
            int r5 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.f11804
            int r5 = r5 + 31
            int r5 = r5 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.f11808 = r5
            r6 = r9
            r9 = r7
            r7 = r6
        L49:
            int r7 = r7 + 1
            int r9 = r9 + r4
            int r9 = r9 + (-11)
            r6 = r9
            r9 = r7
            r7 = r6
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3475.m17493(short, byte, byte):java.lang.String");
    }

    /* JADX INFO: renamed from: ˊ */
    public static String m17492(String str, String str2, C22800 c22800) {
        String next;
        int i = f11804;
        int i2 = ((i | 83) << 1) - (i ^ 83);
        f11808 = i2 % 128;
        if (i2 % 2 == 0) {
            File fileM17500 = m17500(str, c22800);
            if (fileM17500 != null) {
                int i3 = f11808;
                f11804 = (((i3 | 103) << 1) - (i3 ^ 103)) % 128;
                if (m17499(fileM17500, c22800)) {
                    int i4 = f11808;
                    f11804 = ((i4 ^ 43) + ((i4 & 43) << 1)) % 128;
                    if (fileM17500.isFile()) {
                        try {
                            Scanner scannerUseDelimiter = new Scanner(new FileInputStream(fileM17500)).useDelimiter(str2);
                            if (!scannerUseDelimiter.hasNext()) {
                                next = "";
                            } else {
                                int i5 = f11808;
                                int i6 = (i5 & 89) + (i5 | 89);
                                f11804 = i6 % 128;
                                if (i6 % 2 != 0) {
                                    next = scannerUseDelimiter.next();
                                } else {
                                    scannerUseDelimiter.next();
                                    throw null;
                                }
                            }
                            scannerUseDelimiter.close();
                            return next;
                        } catch (IOException unused) {
                        }
                    }
                }
            }
            return "";
        }
        m17500(str, c22800);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX INFO: renamed from: ˋ */
    private static List<EnumC22802> m17496(Member member) {
        int i;
        Map<Member, Object> map;
        if (!(member instanceof Method)) {
            f11804 = (f11808 + 109) % 128;
            if (!(member instanceof Constructor)) {
                byte[] bArr = f11801;
                wg3.m206174a(m17493((short) 180, bArr[447], (byte) (-bArr[117])));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(0);
        List<EnumC22802> list = f11806;
        EnumC22802 enumC22802 = EnumC22802.f11839;
        if (list.contains(enumC22802)) {
            int i2 = f11804;
            f11808 = (((i2 | 83) << 1) - (i2 ^ 83)) % 128;
            int iM17497 = m17497(member);
            if ((iM17497 & 256) == 0) {
                int i3 = f11808;
                int i4 = (i3 & 77) + (i3 | 77);
                f11804 = i4 % 128;
                if (i4 % 2 == 0) {
                    if ((((~iM17497) & SQLiteDatabase.CREATE_IF_NECESSARY) | ((-268435457) & iM17497)) == 0) {
                        map = f11799;
                        if (map != null) {
                            f11804 = (i3 + 1) % 128;
                            if (map.keySet().contains(member)) {
                                int i5 = f11804;
                                f11808 = ((i5 ^ 59) + ((i5 & 59) << 1)) % 128;
                                arrayList.add(enumC22802);
                                int i6 = f11804;
                                i = (i6 & 5) + (i6 | 5);
                            }
                        }
                    } else {
                        arrayList.add(enumC22802);
                        int i7 = f11804;
                        i = ((i7 | 65) << 1) - (i7 ^ 65);
                    }
                    f11808 = i % 128;
                } else {
                    if ((iM17497 & SQLiteDatabase.CREATE_IF_NECESSARY) == 0) {
                        map = f11799;
                        if (map != null) {
                            f11804 = (i3 + 1) % 128;
                            if (map.keySet().contains(member)) {
                                int i8 = f11804;
                                f11808 = ((i8 ^ 59) + ((i8 & 59) << 1)) % 128;
                                arrayList.add(enumC22802);
                                int i9 = f11804;
                                i = (i9 & 5) + (i9 | 5);
                            }
                        }
                    } else {
                        arrayList.add(enumC22802);
                        int i10 = f11804;
                        i = ((i10 | 65) << 1) - (i10 ^ 65);
                    }
                    f11808 = i % 128;
                }
            } else {
                arrayList.add(enumC22802);
                int i11 = f11804;
                i = ((i11 | 65) << 1) - (i11 ^ 65);
                f11808 = i % 128;
            }
        }
        if (!f11806.isEmpty()) {
            int i12 = f11808;
            f11804 = ((i12 ^ 19) + ((i12 & 19) << 1)) % 128;
            if (!f11806.contains(EnumC22802.f11836)) {
                return arrayList;
            }
        }
        if ((member.getModifiers() & 256) != 0) {
            arrayList.add(EnumC22802.f11836);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ˏ */
    public static Object m17501(String str, Object obj, C22800 c22800) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        int i = f11808;
        f11804 = (((i | 69) << 1) - (i ^ 69)) % 128;
        Object objM17503 = m17503(str, obj, null, null, c22800);
        int i2 = f11804;
        int i3 = ((i2 | 21) << 1) - (i2 ^ 21);
        f11808 = i3 % 128;
        if (i3 % 2 == 0) {
            return objM17503;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ˏ */
    private static File m17500(String str, C22800 c22800) {
        Object objM17491;
        int i = f11808 + 45;
        f11804 = i % 128;
        try {
            if (i % 2 == 0) {
                new Class[0][1] = String.class;
                Object[] objArr = new Object[0];
                objArr[1] = str;
                objM17491 = m17491(File.class.getConstructor(null), File.class, objArr, c22800);
            } else {
                objM17491 = m17491(File.class.getConstructor(String.class), File.class, new Object[]{str}, c22800);
            }
            return (File) objM17491;
        } catch (Exception unused) {
            return new File(str);
        }
    }
}
