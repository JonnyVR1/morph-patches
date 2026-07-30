package com.guardsquare.dexguard.runtime.devicefingerprinting;

import android.content.Context;
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
import p149l.ig3;
import p149l.rhg0;

/* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ */
/* JADX INFO: loaded from: classes7.dex */
class C3452 {

    /* JADX INFO: renamed from: ʻ */
    private static Map<Member, Object> f11762 = null;

    /* JADX INFO: renamed from: ʼ */
    private static Field f11763 = null;

    /* JADX INFO: renamed from: ʽ */
    private static final byte[] f11764 = null;

    /* JADX INFO: renamed from: ˊ */
    private static Class f11765 = null;

    /* JADX INFO: renamed from: ˋ */
    private static Class f11766 = null;

    /* JADX INFO: renamed from: ˋॱ */
    private static int f11767 = 1;

    /* JADX INFO: renamed from: ˎ */
    private static EnumC22685 f11768;

    /* JADX INFO: renamed from: ˏ */
    private static List<EnumC22686> f11769;

    /* JADX INFO: renamed from: ॱ */
    private static Class f11770;

    /* JADX INFO: renamed from: ॱॱ */
    private static int f11771;

    /* JADX INFO: renamed from: ᐝ */
    private static Method f11772;

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: ˊ */
        static final /* synthetic */ int[] f11773;

        /* JADX INFO: renamed from: ˎ */
        private static int f11774 = 0;

        /* JADX INFO: renamed from: ˏ */
        private static int f11775 = 1;

        /* JADX INFO: renamed from: ॱ */
        static final /* synthetic */ int[] f11776;

        static {
            int[] iArr = new int[EnumC22686.values().length];
            f11776 = iArr;
            try {
                iArr[EnumC22686.f11802.ordinal()] = 1;
                int i = f11774;
                f11775 = ((i & 103) + (i | 103)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[Cif.values().length];
            f11773 = iArr2;
            try {
                iArr2[Cif.f11780.ordinal()] = 1;
                int i2 = f11775;
                f11774 = ((i2 & 21) + (i2 | 21)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11773[Cif.f11784.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11773[Cif.f11781.ordinal()] = 3;
                int i3 = f11774 + 87;
                f11775 = i3 % 128;
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
        private static int f11777 = 0;

        /* JADX INFO: renamed from: ʼ */
        private static int f11778 = 1;

        /* JADX INFO: renamed from: ʽ */
        private static int f11779;

        /* JADX INFO: renamed from: ˊ */
        public static final Cif f11780;

        /* JADX INFO: renamed from: ˋ */
        public static final Cif f11781;

        /* JADX INFO: renamed from: ˎ */
        private static final /* synthetic */ Cif[] f11782;

        /* JADX INFO: renamed from: ˏ */
        private static final byte[] f11783 = null;

        /* JADX INFO: renamed from: ॱ */
        public static final Cif f11784;

        static {
            m17449();
            int i = f11777;
            byte[] bArr = f11783;
            Cif cif = new Cif(m17450((byte) (i & 45), bArr[5], (byte) (i & 40)).intern(), 0);
            f11780 = cif;
            byte b = bArr[2];
            Cif cif2 = new Cif(m17450(b, bArr[5], b).intern(), 1);
            f11784 = cif2;
            Cif cif3 = new Cif(m17450(bArr[7], bArr[2], bArr[23]).intern(), 2);
            f11781 = cif3;
            f11782 = new Cif[]{cif, cif2, cif3};
            int i2 = f11779;
            int i3 = (i2 & 39) + (i2 | 39);
            f11778 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 20 / 0;
            }
        }

        private Cif(String str, int i) {
            super(str, i);
        }

        public static Cif valueOf(String str) {
            int i = f11778;
            int i2 = (i ^ 79) + ((i & 79) << 1);
            f11779 = i2 % 128;
            if (i2 % 2 != 0) {
                Enum.valueOf(Cif.class, str);
                throw null;
            }
            Cif cif = (Cif) Enum.valueOf(Cif.class, str);
            int i3 = f11779;
            f11778 = (((i3 | 39) << 1) - (i3 ^ 39)) % 128;
            return cif;
        }

        public static Cif[] values() {
            f11778 = (f11779 + 83) % 128;
            Cif[] cifArr = (Cif[]) f11782.clone();
            int i = f11779 + 17;
            f11778 = i % 128;
            if (i % 2 != 0) {
                return cifArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ˊ */
        private static void m17449() {
            f11783 = new byte[]{39, -95, 0, -100, -9, 1, -15, 7, 4, -15, -1, -21, 17, -3, -5, -9, -15, 26, -15, -4, -23, 26, -25, HttpTokens.CARRIAGE_RETURN, -17, -6, 11, -3, -15, -4, -23, 26, -25, HttpTokens.CARRIAGE_RETURN, -17, -6, 11, -3};
            f11777 = 158;
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
        private static java.lang.String m17450(short r7, int r8, short r9) {
            /*
                byte[] r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.Cif.f11783
                int r8 = r8 * 4
                int r8 = 15 - r8
                int r9 = r9 + 65
                int r7 = r7 * 2
                int r7 = 27 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L24
                int r9 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.Cif.f11779
                int r9 = r9 + 77
                int r3 = r9 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.Cif.f11778 = r3
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
                int r8 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.Cif.f11778
                int r8 = r8 + 81
                int r8 = r8 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.Cif.f11779 = r8
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
            throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.Cif.m17450(short, int, short):java.lang.String");
        }
    }

    /* JADX INFO: renamed from: com.guardsquare.dexguard.runtime.devicefingerprinting.ɩ$ı, reason: contains not printable characters */
    public static class C22684 {

        /* JADX INFO: renamed from: ˏ */
        private static int f11785 = 0;

        /* JADX INFO: renamed from: ॱ */
        private static int f11786 = 1;

        /* JADX INFO: renamed from: ˋ */
        private Cif f11788 = Cif.f11780;

        /* JADX INFO: renamed from: ˊ */
        private Set<EnumC22686> f11787 = EnumSet.noneOf(EnumC22686.class);

        /* JADX INFO: renamed from: ˏ */
        public static /* synthetic */ Set m17451(C22684 c22684) {
            int i = f11786;
            int i2 = ((i ^ 77) + ((i & 77) << 1)) % 128;
            f11785 = i2;
            Set<EnumC22686> set = c22684.f11787;
            f11786 = ((i2 ^ 3) + ((i2 & 3) << 1)) % 128;
            return set;
        }

        /* JADX INFO: renamed from: ˋ */
        public void mo17432(boolean z) {
            Cif cif;
            int i = f11785;
            f11786 = (((i | 97) << 1) - (i ^ 97)) % 128;
            int i2 = AnonymousClass2.f11773[this.f11788.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (z) {
                    int i3 = f11785 + 79;
                    f11786 = i3 % 128;
                    if (i3 % 2 == 0) {
                        Cif cif2 = Cif.f11780;
                        throw null;
                    }
                    cif = Cif.f11784;
                } else {
                    cif = Cif.f11781;
                }
                this.f11788 = cif;
            }
            int i4 = f11785 + 119;
            f11786 = i4 % 128;
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
    public static final class EnumC22685 {

        /* JADX INFO: renamed from: ʼ */
        private static int f11789 = 0;

        /* JADX INFO: renamed from: ˊ */
        public static final EnumC22685 f11790;

        /* JADX INFO: renamed from: ˋ */
        private static final /* synthetic */ EnumC22685[] f11791;

        /* JADX INFO: renamed from: ˎ */
        private static final byte[] f11792 = null;

        /* JADX INFO: renamed from: ˏ */
        public static final EnumC22685 f11793;

        /* JADX INFO: renamed from: ॱ */
        public static final EnumC22685 f11794;

        /* JADX INFO: renamed from: ॱॱ */
        private static int f11795 = 0;

        /* JADX INFO: renamed from: ᐝ */
        private static int f11796 = 1;

        static {
            m17452();
            byte[] bArr = f11792;
            byte b = bArr[5];
            byte b2 = b;
            EnumC22685 enumC22685 = new EnumC22685(m17453(b2, (byte) ((b2 ^ 7) | (b2 & 7)), b).intern(), 0);
            f11793 = enumC22685;
            byte b3 = (byte) (f11789 & 7);
            byte b4 = bArr[6];
            EnumC22685 enumC22686 = new EnumC22685(m17453(b3, b4, (byte) (b4 - 2)).intern(), 1);
            f11794 = enumC22686;
            byte b5 = bArr[5];
            EnumC22685 enumC22687 = new EnumC22685(m17453((byte) 20, b5, (byte) (b5 + 4)).intern(), 2);
            f11790 = enumC22687;
            f11791 = new EnumC22685[]{enumC22685, enumC22686, enumC22687};
            int i = f11795 + 1;
            f11796 = i % 128;
            if (i % 2 == 0) {
                int i2 = 64 / 0;
            }
        }

        private EnumC22685(String str, int i) {
            super(str, i);
        }

        public static EnumC22685 valueOf(String str) {
            int i = f11795;
            f11796 = ((i & 25) + (i | 25)) % 128;
            EnumC22685 enumC22685 = (EnumC22685) Enum.valueOf(EnumC22685.class, str);
            int i2 = f11796;
            f11795 = ((i2 & 89) + (i2 | 89)) % 128;
            return enumC22685;
        }

        public static EnumC22685[] values() {
            f11795 = (f11796 + 47) % 128;
            EnumC22685[] enumC22685Arr = (EnumC22685[]) f11791.clone();
            f11796 = (f11795 + 83) % 128;
            return enumC22685Arr;
        }

        /* JADX INFO: renamed from: ˋ */
        private static void m17452() {
            f11792 = new byte[]{93, -57, 117, -116, -15, 0, 5, -9, -8, 15, 0, 9, 5, -1, 1, -6, 11};
            f11789 = CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
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
        private static java.lang.String m17453(byte r6, byte r7, byte r8) {
            /*
                int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22685.f11796
                int r0 = r0 + 83
                int r0 = r0 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22685.f11795 = r0
                byte[] r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22685.f11792
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
                int r5 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22685.f11796
                int r5 = r5 + 67
                int r5 = r5 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22685.f11795 = r5
            L34:
                int r6 = r6 - r3
                int r6 = r6 + 2
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22685.m17453(byte, byte, byte):java.lang.String");
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
    public static final class EnumC22686 {

        /* JADX INFO: renamed from: ʼ */
        private static int f11797 = 1;

        /* JADX INFO: renamed from: ʽ */
        private static int f11798;

        /* JADX INFO: renamed from: ˊ */
        public static final EnumC22686 f11799;

        /* JADX INFO: renamed from: ˋ */
        private static EnumC22686 f11800;

        /* JADX INFO: renamed from: ˎ */
        private static EnumC22686 f11801;

        /* JADX INFO: renamed from: ˏ */
        public static final EnumC22686 f11802;

        /* JADX INFO: renamed from: ॱ */
        private static final /* synthetic */ EnumC22686[] f11803;

        /* JADX INFO: renamed from: ᐝ */
        private static final byte[] f11804 = null;

        static {
            m17455();
            byte[] bArr = f11804;
            byte b = (byte) (bArr[5] - 1);
            byte b2 = bArr[10];
            EnumC22686 enumC22686 = new EnumC22686(m17454(b, b2, (byte) (b2 - 2)).intern(), 0);
            f11802 = enumC22686;
            f11800 = new EnumC22686(m17454(bArr[19], bArr[5], bArr[7]).intern(), 1);
            f11801 = new EnumC22686(m17454((byte) 23, (byte) (bArr[5] - 1), (byte) (-bArr[20])).intern(), 2);
            byte b3 = bArr[13];
            EnumC22686 enumC22687 = new EnumC22686(m17454(b3, b3, bArr[4]).intern(), 3);
            f11799 = enumC22687;
            f11803 = new EnumC22686[]{enumC22686, f11800, f11801, enumC22687};
            int i = f11798;
            int i2 = ((i | 119) << 1) - (i ^ 119);
            f11797 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        private EnumC22686(String str, int i) {
            super(str, i);
        }

        public static EnumC22686 valueOf(String str) {
            int i = f11797;
            int i2 = ((i | 115) << 1) - (i ^ 115);
            f11798 = i2 % 128;
            int i3 = i2 % 2;
            EnumC22686 enumC22686 = (EnumC22686) Enum.valueOf(EnumC22686.class, str);
            if (i3 != 0) {
                int i4 = 58 / 0;
            }
            return enumC22686;
        }

        public static EnumC22686[] values() {
            int i = f11798;
            f11797 = ((i ^ 55) + ((i & 55) << 1)) % 128;
            EnumC22686[] enumC22686Arr = (EnumC22686[]) f11803.clone();
            int i2 = f11798;
            int i3 = ((i2 | 109) << 1) - (i2 ^ 109);
            f11797 = i3 % 128;
            if (i3 % 2 != 0) {
                return enumC22686Arr;
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
        private static java.lang.String m17454(byte r7, int r8, short r9) {
            /*
                int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22686.f11797
                int r0 = r0 + 77
                int r1 = r0 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22686.f11798 = r1
                int r0 = r0 % 2
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L20
                int r0 = r8 + 2
                int r7 = 58 - r7
                byte[] r4 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22686.f11804
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
                byte[] r4 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22686.f11804
                int r9 = r9 + 4
                byte[] r0 = new byte[r0]
                int r8 = r8 + 3
                if (r4 != 0) goto L39
                r5 = r2
            L2f:
                int r1 = r1 + 71
                int r1 = r1 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22686.f11797 = r1
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
                int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22686.f11797
                int r0 = r0 + 119
                int r0 = r0 % 128
                com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22686.f11798 = r0
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r1
                r1 = r5
                goto L3a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.EnumC22686.m17454(byte, int, short):java.lang.String");
        }

        /* JADX INFO: renamed from: ॱ */
        private static void m17455() {
            f11804 = new byte[]{122, 125, -103, -123, 8, 1, -4, 14, 1, -3, 2, -7, 7, 3, -3, -1, -8, 9, -22, 21, -5, 8};
        }
    }

    static {
        m17439();
        f11769 = new ArrayList();
        byte[] bArr = f11764;
        String property = System.getProperty(m17438((short) 103, bArr[48], bArr[141]));
        EnumC22685 enumC22685 = EnumC22685.f11790;
        f11768 = enumC22685;
        if (property == null) {
            int i = f11771;
            int i2 = ((i | 67) << 1) - (i ^ 67);
            f11767 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } else {
            try {
                if (Integer.parseInt(property.substring(0, 1)) >= 2) {
                    int i3 = f11771 + 71;
                    f11767 = i3 % 128;
                    if (i3 % 2 == 0) {
                        EnumC22685 enumC22686 = EnumC22685.f11793;
                        throw null;
                    }
                    enumC22685 = EnumC22685.f11793;
                    int i4 = f11767;
                    f11771 = ((i4 ^ 7) + ((i4 & 7) << 1)) % 128;
                } else {
                    enumC22685 = EnumC22685.f11794;
                }
            } catch (NumberFormatException unused) {
            }
        }
        f11768 = enumC22685;
        int i5 = f11767;
        f11771 = ((i5 & 103) + (i5 | 103)) % 128;
        try {
            byte[] bArr2 = f11764;
            byte b = bArr2[309];
            Class<?> cls = Class.forName(m17438((short) 260, (byte) ((b ^ (-1)) + (b << 1)), bArr2[396]), true, ClassLoader.getSystemClassLoader());
            f11766 = cls;
            if (cls != null) {
                int i6 = f11767;
                f11771 = ((i6 ^ 63) + ((i6 & 63) << 1)) % 128;
                f11769.add(EnumC22686.f11802);
                try {
                    Field declaredField = f11766.getDeclaredField(m17438((short) 295, bArr2[439], bArr2[5]));
                    declaredField.setAccessible(true);
                    f11762 = (HashMap) declaredField.get(f11766);
                    Field declaredField2 = f11766.getDeclaredField(m17438((short) 311, (byte) 70, bArr2[396]));
                    f11763 = declaredField2;
                    declaredField2.setAccessible(true);
                    f11772 = f11766.getDeclaredMethod(m17438(bArr2[204], bArr2[110], bArr2[37]), Member.class, Object.class, Object[].class);
                    try {
                        f11770 = Class.forName(m17438((short) 402, bArr2[233], bArr2[396]), true, ClassLoader.getSystemClassLoader());
                        f11766.getDeclaredMethod(m17438((short) 501, (byte) 70, bArr2[83]), Member.class, f11770);
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (Exception unused3) {
                    int i7 = f11767;
                    f11771 = ((i7 & 65) + (i7 | 65)) % 128;
                }
            } else {
                int i8 = f11767;
                f11771 = ((i8 & 65) + (i8 | 65)) % 128;
            }
        } catch (ClassNotFoundException unused4) {
            String strM17433 = C3451.m17433();
            byte[] bArr3 = f11764;
            if (strM17433.contains(m17438((short) 300, bArr3[286], bArr3[14]))) {
                f11769.add(EnumC22686.f11802);
            }
        }
        f11768.equals(EnumC22685.f11794);
        int i9 = f11771;
        f11767 = ((i9 ^ 83) + ((i9 & 83) << 1)) % 128;
    }

    /* JADX INFO: renamed from: ˊ */
    private static Object m17436(Member member, Object obj, Object[] objArr, C22684 c22684) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        int i = f11767 + 95;
        f11771 = i % 128;
        if (i % 2 != 0) {
            m17441(member);
            throw null;
        }
        List<EnumC22686> listM17441 = m17441(member);
        if (c22684 != null) {
            C22684.m17451(c22684).addAll(listM17441);
            f11771 = (f11767 + 21) % 128;
        }
        if ((!listM17441.isEmpty()) && listM17441.size() == 1) {
            int i2 = f11767;
            f11771 = (((i2 | 7) << 1) - (i2 ^ 7)) % 128;
            if (AnonymousClass2.f11776[listM17441.get(0).ordinal()] == 1) {
                if (c22684 != null) {
                    c22684.mo17432(true);
                    int i3 = f11767;
                    f11771 = ((i3 ^ 67) + ((i3 & 67) << 1)) % 128;
                }
                if (!(member instanceof Method)) {
                    f11763.setBoolean(f11766, true);
                    Object objNewInstance = ((Constructor) member).newInstance(objArr);
                    f11763.setBoolean(f11766, false);
                    return objNewInstance;
                }
                int i4 = f11771;
                f11767 = (((i4 | 77) << 1) - (i4 ^ 77)) % 128;
                Object objInvoke = f11772.invoke(f11766, member, obj, objArr);
                int i5 = f11767 + 115;
                f11771 = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvoke;
                }
                throw null;
            }
        }
        if (c22684 != null) {
            int i6 = f11767;
            int i7 = ((i6 | 109) << 1) - (i6 ^ 109);
            f11771 = i7 % 128;
            int i8 = i7 % 2;
            c22684.mo17432(false);
        }
        return member instanceof Constructor ? ((Constructor) member).newInstance(objArr) : ((Method) member).invoke(obj, objArr);
    }

    /* JADX INFO: renamed from: ˋ */
    public static String m17440(Context context, String str, C22684 c22684) {
        String str2;
        String strTrim;
        Object objM17448;
        if (f11765 == null) {
            int i = f11771;
            f11767 = ((i ^ 15) + ((i & 15) << 1)) % 128;
            ClassLoader classLoader = context.getClassLoader();
            byte[] bArr = f11764;
            String[] strArr = {m17438((short) 206, bArr[533], bArr[151]), m17438((short) 226, (byte) (-bArr[109]), bArr[151])};
            f11767 = (f11771 + 9) % 128;
            for (int i2 = 0; i2 < 2; i2 = ((i2 | 1) << 1) - (i2 ^ 1)) {
                try {
                    f11765 = classLoader.loadClass(strArr[i2]);
                    f11767 = (f11771 + 117) % 128;
                    break;
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        if (f11765 != null) {
            int i3 = f11767;
            int i4 = (i3 & 75) + (i3 | 75);
            f11771 = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    byte[] bArr2 = f11764;
                    String strM17438 = m17438((short) 22057, bArr2[107], bArr2[3903]);
                    Class cls = f11765;
                    Class[] clsArr = new Class[0];
                    clsArr[1] = String.class;
                    Object[] objArr = new Object[0];
                    objArr[0] = str;
                    objM17448 = m17448(strM17438, cls, clsArr, objArr, c22684);
                } else {
                    byte[] bArr3 = f11764;
                    objM17448 = m17448(m17438((short) 344, bArr3[74], bArr3[139]), f11765, new Class[]{String.class}, new Object[]{str}, c22684);
                }
                str2 = (String) objM17448;
            } catch (Exception unused2) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            byte[] bArr4 = f11764;
            sb.append(m17438((short) 409, (byte) (bArr4[167] + 1), bArr4[139]));
            sb.append(str);
            strTrim = m17447(new String[]{sb.toString()}, c22684).trim();
        } catch (IOException unused3) {
            strTrim = null;
        }
        if (str2 != null) {
            f11767 = (f11771 + 115) % 128;
            if (strTrim != null) {
                if (str2.equals(strTrim)) {
                    int i5 = f11767;
                    f11771 = ((i5 ^ 49) + ((i5 & 49) << 1)) % 128;
                    return str2;
                }
                if (c22684 != null) {
                    f11767 = (f11771 + 119) % 128;
                    C22684.m17451(c22684).add(EnumC22686.f11799);
                    c22684.mo17432(false);
                    int i6 = f11767;
                    f11771 = ((i6 & 61) + (i6 | 61)) % 128;
                }
            }
        }
        if (str2 != null) {
            f11767 = (f11771 + 7) % 128;
            return str2;
        }
        if (strTrim == null) {
            return "";
        }
        int i7 = f11767;
        int i8 = ((i7 | 33) << 1) - (i7 ^ 33);
        f11771 = i8 % 128;
        if (i8 % 2 == 0) {
            return strTrim;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ˎ */
    private static boolean m17444(File file, C22684 c22684) {
        f11767 = (f11771 + 17) % 128;
        try {
            byte[] bArr = f11764;
            if (!((Boolean) m17448(m17438(bArr[1], bArr[286], bArr[204]), file, null, null, c22684)).booleanValue()) {
                int i = f11767;
                f11771 = ((i ^ 9) + ((i & 9) << 1)) % 128;
                if (!((Boolean) m17448(m17438(bArr[31], (byte) (-bArr[330]), bArr[37]), file, null, null, c22684)).booleanValue()) {
                    int i2 = f11767 + 63;
                    f11771 = i2 % 128;
                    if (i2 % 2 != 0) {
                        if (!((Boolean) m17448(m17438((short) 19112, bArr[28448], bArr[53]), file, null, null, c22684)).booleanValue()) {
                            return false;
                        }
                    } else if (!((Boolean) m17448(m17438((short) 274, bArr[286], bArr[37]), file, null, null, c22684)).booleanValue()) {
                        return false;
                    }
                }
            }
            f11771 = (f11767 + 31) % 128;
            return true;
        } catch (Exception unused) {
            new RuntimeException();
            return file.exists();
        }
    }

    /* JADX INFO: renamed from: ˏ */
    private static String m17447(String[] strArr, C22684 c22684) throws IOException {
        char c = 15;
        try {
            try {
                byte[] bArr = f11764;
                Process process = (Process) m17448(m17438(bArr[164], bArr[349], bArr[204]), Runtime.getRuntime(), new Class[]{String[].class, String[].class, File.class}, new Object[]{new String[]{m17438((short) 345, bArr[15], bArr[5])}, null, null}, c22684);
                C3448If c3448If = new C3448If(process.getInputStream());
                C3448If c3448If2 = new C3448If(process.getErrorStream());
                DataOutputStream dataOutputStream = new DataOutputStream(process.getOutputStream());
                c3448If.start();
                c3448If2.start();
                int i = f11771;
                f11767 = (((i | 45) << 1) - (i ^ 45)) % 128;
                int i2 = 0;
                while (i2 <= 0) {
                    String str = strArr[0];
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    byte[] bArr2 = f11764;
                    char c2 = c;
                    try {
                        sb.append(m17438((short) 367, bArr2[380], (byte) 110));
                        dataOutputStream.write(sb.toString().getBytes(m17438((short) 268, bArr2[57], bArr2[10])));
                        dataOutputStream.flush();
                        i2 = ((i2 | 1) << 1) - (i2 ^ 1);
                        c = c2;
                    } catch (InvocationTargetException e) {
                        e = e;
                        Exception exc = (Exception) e.getCause();
                        if (!(exc instanceof NullPointerException) && !(exc instanceof IllegalArgumentException)) {
                            int i3 = f11767;
                            int i4 = (i3 & 15) + (i3 | 15);
                            int i5 = i4 % 128;
                            f11771 = i5;
                            if (i4 % 2 != 0) {
                                throw null;
                            }
                            if (!(exc instanceof SecurityException)) {
                                if (exc instanceof IOException) {
                                    f11767 = ((i5 ^ 29) + ((i5 & 29) << 1)) % 128;
                                    throw ((IOException) exc);
                                }
                                byte[] bArr3 = f11764;
                                rhg0.m179353a(m17438((short) (-bArr3[23]), bArr3[533], bArr3[135]));
                                return null;
                            }
                        }
                        throw ((RuntimeException) exc);
                    }
                }
                byte[] bArr4 = f11764;
                dataOutputStream.write(m17438((short) 264, bArr4[57], bArr4[204]).getBytes(m17438((short) 268, bArr4[57], bArr4[10])));
                dataOutputStream.flush();
                try {
                    process.waitFor();
                    try {
                        dataOutputStream.close();
                        int i6 = f11767;
                        f11771 = (((i6 | 79) << 1) - (i6 ^ 79)) % 128;
                    } catch (IOException unused) {
                    }
                    c3448If.join();
                    c3448If2.join();
                    try {
                        process.destroy();
                    } catch (Exception unused2) {
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c3448If.m17431());
                    sb2.append(c3448If2.m17431());
                    String string = sb2.toString();
                    int i7 = f11771 + 71;
                    f11767 = i7 % 128;
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
                byte[] bArr5 = f11764;
                rhg0.m179353a(m17438((short) (-bArr5[23]), bArr5[533], bArr5[135]));
                return null;
            }
        } catch (InvocationTargetException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ॱ */
    public static Object m17448(String str, Object obj, Class[] clsArr, Object[] objArr, C22684 c22684) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls;
        Class cls2;
        Class cls3;
        int i = f11771;
        f11767 = ((i & 9) + (i | 9)) % 128;
        if (obj instanceof Class) {
            cls3 = (Class) obj;
            f11767 = ((i & 119) + (i | 119)) % 128;
        } else {
            cls = obj.getClass();
        }
        if (clsArr == null) {
            cls2 = cls;
            int i2 = f11767 + 121;
            int i3 = i2 % 128;
            f11771 = i3;
            if (i2 % 2 != 0) {
                cls2 = cls3;
                clsArr = new Class[1];
            } else {
                cls2 = cls3;
                clsArr = new Class[0];
            }
            f11767 = ((i3 ^ 47) + ((i3 & 47) << 1)) % 128;
        } else {
            cls2 = cls;
            cls2 = cls3;
            f11771 = (f11767 + 89) % 128;
        }
        try {
            Object objM17436 = m17436(cls2.getMethod(str, clsArr), obj, objArr, c22684);
            f11767 = (f11771 + 43) % 128;
            return objM17436;
        } catch (InstantiationException unused) {
            new RuntimeException();
            return null;
        }
    }

    /* JADX INFO: renamed from: ˎ */
    private static int m17442(Member member) {
        int i = f11771;
        int i2 = ((i | 97) << 1) - (i ^ 97);
        f11767 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!(member instanceof Method)) {
                f11767 = (((i | 17) << 1) - (i ^ 17)) % 128;
                if (!(member instanceof Constructor)) {
                    byte[] bArr = f11764;
                    ig3.m135964a(m17438((short) 180, bArr[447], (byte) (-bArr[117])));
                    return 0;
                }
            }
            try {
                if (f11768 == EnumC22685.f11793) {
                    int i3 = f11767 + 57;
                    f11771 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 48 / 0;
                    }
                }
                f11771 = (f11767 + 31) % 128;
            } catch (Throwable unused) {
            }
            int modifiers = member.getModifiers();
            int i5 = f11771 + 25;
            f11767 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return modifiers;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ˎ */
    public static String m17443(String str, C22684 c22684) {
        byte b;
        byte b2;
        short s;
        int i = f11767;
        int i2 = (i & 113) + (i | 113);
        f11771 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = f11764;
        if (i3 != 0) {
            b = bArr[64];
            b2 = bArr[63];
            s = 31878;
        } else {
            b = bArr[15];
            b2 = bArr[61];
            s = 269;
        }
        return m17437(str, m17438(s, b, b2), c22684);
    }

    /* JADX INFO: renamed from: ˊ */
    private static void m17439() {
        byte[] bArr = new byte[540];
        System.arraycopy("\u0006Y\u0001X\u0004\u0005\u0012\u000b\u0007í#\u001aÿ\u0012\u0000P,\u0010·^ù\u0010\nÆ_\u0006¼P\u001eø\t\u001d\nüÆ[\n\u000f\u000b\u0001\u0004\u0015\u0018²Y\f\u0010ÄC\u001eü\u0015\f\u0000\u0010\u0004ÄM\u0012\u0010þ\u001c\u0002\u0007\u0019¸Z\n½_ÿ\f\u0015¸O\f\u001cþ\u0005\rÒÿ^\u0003\t\u0012\u000b\u0004\u0010\u0004Ä_ü\u0019\fÅ\t\u001a\u0007\r\b\f»\fÔO\bþ\u001fÃ>\u0018\u0001\u0019\b\u0005\u0006ÕU\u0003\n\u000fý\nÕ5ö'ù#\u001aÿ\u0012\u0000ï2\u000b\u0007\u0005\u0011\u0005\u000e\r\u000b\r\u0019\u000bÞ1\u0000\u0011\u0017\u001c\rä#\u001aÿ\u0012\u0000\u0000\t\u001a\u0002 öØI\u0000\u0018\u0004ÒOþ\f\u0011\u0004\t\u001cÅ\u001e,\u001c\f\tú\r\u001cä#\u001aÿ\u0012\u0000\u0010\u0015ù\f\u0015\u0004î2\u000b\u0007\u0013\u0003\n\u000fý\nà2\u000b\u0007\u0005\nô#\u001aÿ\u0012\u0000ê)\u0016\u000b\u0001\n\r\u0013\u0013\u0015Þ.\u000e\u0004ð\nýò\u0016\u001eü\u0016¡\fÔO\bþ\u001fÃ>\u0018\u0001\u0019\b\u0005\u0006ÕU\u0003\n\u000fý\nÕ5#\n\u000fý\né;\u0002\u0006\u000e\t\u0018\u0001\u0019\b\u0005\u0006ÕL\u000fÆM\r\b\f\u0000\u0018\r\u0000\u0007\u0019\u0018\u0001\u0019\b\u0005\u0006ÕL\u000fÆ01\u0005\fü\u0013î-\b\f\u0000\u0018\r\u0000\u0007\u0019#\u0013\u0000\u000e\u0018¹X\u0013\t\f·M\u000eÆX\u0003\u001aÿ\u0012\u0000ÇZ\u000e¹N\u0017\n\u0010\f\t\u000eù\u001c\u0006\u000e¹Zþ\u0013\u0006\t\u001cÅ\t\u001aç-\b\f\u0000\u0018\r\u0010ÍðQ\u0006\u0013\u000e\u0004\nÇ_\u0006¼Q\u000e\u0010\u0001ÇN\u0014\u0000\u001d\u000b¸\u0012\u0002 öØS\u0002ÌSú\u0018\f\u0001\u0011\n\u001eü\u0015\f\n\u0002 öØI\u0000\u0018\u0004ÒOþ\f\u0011\u0004\t\u001cÅ\u001e<\rä#\u001aÿ\u0012\u0000&\u0013\u000e\u0004\nÇ_\u0006¼N\u001aþ\u0007\u001eüÆLÊ[\r\bÿ\r\u0019\u000bÆ\u001eø\t\u0015Ü0\u0014þ\t\u001c\u0006\u000e\u0012\u0010\u0013\u0004\u0007\u0005õ.\u0002\t\r\u0010þ\u0016ì#\u001aÿ\u0012\u0000$\u0002\u001e\u0003\u0000\t\u001cü\nÇP\u001eö\r\u0016\u000f\u0000\u0011\n½T\u0010½P\u001eø\të7\t\u000bÿ\u0018\u0001Õ".getBytes("ISO-8859-1"), 0, bArr, 0, 540);
        f11764 = bArr;
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
    private static java.lang.String m17438(short r7, byte r8, byte r9) {
        /*
            int r0 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.f11767
            int r1 = r0 + 17
            int r1 = r1 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.f11771 = r1
            byte[] r1 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.f11764
            int r7 = 505 - r7
            int r9 = 120 - r9
            int r2 = 82 - r8
            byte[] r2 = new byte[r2]
            int r8 = 81 - r8
            r3 = 0
            if (r1 != 0) goto L27
            int r0 = r0 + 17
            int r4 = r0 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.f11771 = r4
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
            int r5 = com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.f11767
            int r5 = r5 + 31
            int r5 = r5 % 128
            com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.f11771 = r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.guardsquare.dexguard.runtime.devicefingerprinting.C3452.m17438(short, byte, byte):java.lang.String");
    }

    /* JADX INFO: renamed from: ˊ */
    public static String m17437(String str, String str2, C22684 c22684) {
        String next;
        int i = f11767;
        int i2 = ((i | 83) << 1) - (i ^ 83);
        f11771 = i2 % 128;
        if (i2 % 2 == 0) {
            File fileM17445 = m17445(str, c22684);
            if (fileM17445 != null) {
                int i3 = f11771;
                f11767 = (((i3 | 103) << 1) - (i3 ^ 103)) % 128;
                if (m17444(fileM17445, c22684)) {
                    int i4 = f11771;
                    f11767 = ((i4 ^ 43) + ((i4 & 43) << 1)) % 128;
                    if (fileM17445.isFile()) {
                        try {
                            Scanner scannerUseDelimiter = new Scanner(new FileInputStream(fileM17445)).useDelimiter(str2);
                            if (!scannerUseDelimiter.hasNext()) {
                                next = "";
                            } else {
                                int i5 = f11771;
                                int i6 = (i5 & 89) + (i5 | 89);
                                f11767 = i6 % 128;
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
        m17445(str, c22684);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX INFO: renamed from: ˋ */
    private static List<EnumC22686> m17441(Member member) {
        int i;
        Map<Member, Object> map;
        if (!(member instanceof Method)) {
            f11767 = (f11771 + 109) % 128;
            if (!(member instanceof Constructor)) {
                byte[] bArr = f11764;
                ig3.m135964a(m17438((short) 180, bArr[447], (byte) (-bArr[117])));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(0);
        List<EnumC22686> list = f11769;
        EnumC22686 enumC22686 = EnumC22686.f11802;
        if (list.contains(enumC22686)) {
            int i2 = f11767;
            f11771 = (((i2 | 83) << 1) - (i2 ^ 83)) % 128;
            int iM17442 = m17442(member);
            if ((iM17442 & 256) == 0) {
                int i3 = f11771;
                int i4 = (i3 & 77) + (i3 | 77);
                f11767 = i4 % 128;
                if (i4 % 2 == 0) {
                    if ((((~iM17442) & 268435456) | ((-268435457) & iM17442)) == 0) {
                        map = f11762;
                        if (map != null) {
                            f11767 = (i3 + 1) % 128;
                            if (map.keySet().contains(member)) {
                                int i5 = f11767;
                                f11771 = ((i5 ^ 59) + ((i5 & 59) << 1)) % 128;
                                arrayList.add(enumC22686);
                                int i6 = f11767;
                                i = (i6 & 5) + (i6 | 5);
                            }
                        }
                    } else {
                        arrayList.add(enumC22686);
                        int i7 = f11767;
                        i = ((i7 | 65) << 1) - (i7 ^ 65);
                    }
                    f11771 = i % 128;
                } else {
                    if ((iM17442 & 268435456) == 0) {
                        map = f11762;
                        if (map != null) {
                            f11767 = (i3 + 1) % 128;
                            if (map.keySet().contains(member)) {
                                int i8 = f11767;
                                f11771 = ((i8 ^ 59) + ((i8 & 59) << 1)) % 128;
                                arrayList.add(enumC22686);
                                int i9 = f11767;
                                i = (i9 & 5) + (i9 | 5);
                            }
                        }
                    } else {
                        arrayList.add(enumC22686);
                        int i10 = f11767;
                        i = ((i10 | 65) << 1) - (i10 ^ 65);
                    }
                    f11771 = i % 128;
                }
            } else {
                arrayList.add(enumC22686);
                int i11 = f11767;
                i = ((i11 | 65) << 1) - (i11 ^ 65);
                f11771 = i % 128;
            }
        }
        if (!f11769.isEmpty()) {
            int i12 = f11771;
            f11767 = ((i12 ^ 19) + ((i12 & 19) << 1)) % 128;
            if (!f11769.contains(EnumC22686.f11799)) {
                return arrayList;
            }
        }
        if ((member.getModifiers() & 256) != 0) {
            arrayList.add(EnumC22686.f11799);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ˏ */
    public static Object m17446(String str, Object obj, C22684 c22684) throws IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        int i = f11771;
        f11767 = (((i | 69) << 1) - (i ^ 69)) % 128;
        Object objM17448 = m17448(str, obj, null, null, c22684);
        int i2 = f11767;
        int i3 = ((i2 | 21) << 1) - (i2 ^ 21);
        f11771 = i3 % 128;
        if (i3 % 2 == 0) {
            return objM17448;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ˏ */
    private static File m17445(String str, C22684 c22684) {
        Object objM17436;
        int i = f11771 + 45;
        f11767 = i % 128;
        try {
            if (i % 2 == 0) {
                new Class[0][1] = String.class;
                Object[] objArr = new Object[0];
                objArr[1] = str;
                objM17436 = m17436(File.class.getConstructor(null), File.class, objArr, c22684);
            } else {
                objM17436 = m17436(File.class.getConstructor(String.class), File.class, new Object[]{str}, c22684);
            }
            return (File) objM17436;
        } catch (Exception unused) {
            return new File(str);
        }
    }
}
