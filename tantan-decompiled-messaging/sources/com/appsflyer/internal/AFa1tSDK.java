package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFa1tSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Map AFLogger;

    /* JADX INFO: renamed from: d */
    private static Object f4242d;

    /* JADX INFO: renamed from: e */
    private static byte[] f4243e;
    private static byte force;

    /* JADX INFO: renamed from: i */
    private static long f4244i;
    private static Object registerClient;
    private static byte[] unregisterClient;

    /* JADX INFO: renamed from: v */
    private static long f4245v;
    public static final Map values;

    /* JADX INFO: renamed from: w */
    private static long f4246w;

    /* JADX WARN: Code duplicated, block: B:10:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0091  */
    /* JADX WARN: Code duplicated, block: B:13:0x0093  */
    /* JADX WARN: Code duplicated, block: B:8:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0093 -> B:14:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0091
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(byte r9, byte r10, int r11) {
        /*
            int r0 = com.appsflyer.internal.AFa1tSDK.$11
            r1 = r0 & 91
            r0 = r0 | 91
            int r1 = r1 + r0
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.$10 = r1
            int r0 = -r11
            int r2 = r0 * (-575)
            r3 = -637675(0xfffffffffff64515, float:NaN)
            int r2 = r2 + r3
            int r3 = ~r0
            r4 = r3 ^ (-1110(0xfffffffffffffbaa, float:NaN))
            r5 = r3 & (-1110(0xfffffffffffffbaa, float:NaN))
            r4 = r4 | r5
            int r4 = ~r4
            r5 = -1110(0xfffffffffffffbaa, float:NaN)
            r6 = r5 | r11
            int r6 = ~r6
            r7 = r4 ^ r6
            r4 = r4 & r6
            r4 = r4 | r7
            int r4 = r4 * 576
            int r4 = ~r4
            int r2 = r2 - r4
            int r2 = r2 + (-1)
            r4 = r3 | 1109(0x455, float:1.554E-42)
            int r4 = ~r4
            int r11 = ~r11
            r11 = r11 | r5
            r6 = r11 ^ r0
            r11 = r11 & r0
            r11 = r11 | r6
            int r11 = ~r11
            r0 = r4 ^ r11
            r11 = r11 & r4
            r11 = r11 | r0
            int r11 = r11 * 576
            int r11 = -r11
            int r11 = -r11
            r0 = r2 ^ r11
            r11 = r11 & r2
            int r11 = r11 << 1
            int r0 = r0 + r11
            r11 = r3 ^ (-1110(0xfffffffffffffbaa, float:NaN))
            r2 = r3 & (-1110(0xfffffffffffffbaa, float:NaN))
            r11 = r11 | r2
            int r11 = ~r11
            int r11 = r11 * 576
            int r11 = -r11
            int r11 = -r11
            r2 = r0 & r11
            r11 = r11 | r0
            int r2 = r2 + r11
            r11 = r9 & 33
            r9 = r9 | 33
            int r11 = r11 + r9
            byte[] r9 = com.appsflyer.internal.AFa1tSDK.$$a
            r0 = r10 & 61
            r10 = r10 | 61
            int r0 = r0 + r10
            r10 = r0 | (-60)
            int r10 = r10 << 1
            r0 = r0 ^ (-60)
            int r10 = r10 - r0
            byte[] r0 = new byte[r10]
            int r10 = r10 + (-1)
            r3 = 0
            if (r9 != 0) goto L72
            int r1 = r1 + 9
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.$11 = r1
            r11 = r10
            r4 = r2
            r1 = r3
            goto La5
        L72:
            r1 = r3
        L73:
            int r2 = r2 + 1
            byte r4 = (byte) r11
            r0[r1] = r4
            if (r1 != r10) goto L93
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0, r3)
            int r10 = com.appsflyer.internal.AFa1tSDK.$11
            r11 = r10 ^ 87
            r10 = r10 & 87
            int r10 = r10 << 1
            int r11 = r11 + r10
            int r10 = r11 % 128
            com.appsflyer.internal.AFa1tSDK.$10 = r10
            int r11 = r11 % 2
            if (r11 != 0) goto L91
            return r9
        L91:
            r9 = 0
            throw r9
        L93:
            int r1 = r1 + 1
            r4 = r9[r2]
            int r5 = com.appsflyer.internal.AFa1tSDK.$10
            r6 = r5 & 105(0x69, float:1.47E-43)
            r5 = r5 | 105(0x69, float:1.47E-43)
            int r6 = r6 + r5
            int r6 = r6 % 128
            com.appsflyer.internal.AFa1tSDK.$11 = r6
            r8 = r4
            r4 = r2
            r2 = r8
        La5:
            int r2 = -r2
            int r2 = -r2
            int r2 = -r2
            r5 = r11 | r2
            int r5 = r5 << 1
            r11 = r11 ^ r2
            int r5 = r5 - r11
            int r11 = r5 + (-3)
            int r2 = com.appsflyer.internal.AFa1tSDK.$11
            int r2 = r2 + 113
            int r2 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.$10 = r2
            r2 = r4
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.$$c(byte, byte, int):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 72061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.<clinit>():void");
    }

    private AFa1tSDK() {
    }

    public static Object getCurrencyIso4217Code(int i, int i2, char c) throws Throwable {
        int i3 = $10;
        int i4 = i3 + 25;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Object obj = f4242d;
        $11 = ((i3 ^ 99) + ((i3 & 99) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte[] bArr = $$a;
            byte b = bArr[242];
            byte b2 = bArr[862];
            Class<?> cls = Class.forName($$c(b, b2, (short) ((b2 ^ 542) | (b2 & 542))), true, (ClassLoader) registerClient);
            byte b3 = (byte) (-bArr[1029]);
            byte b4 = bArr[177];
            String str$$c = $$c(b3, b4, (short) ((b4 ^ 524) | (b4 & 524)));
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i5 = $10;
            $11 = ((i5 ^ 23) + ((i5 & 23) << 1)) % 128;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getMediationNetwork(int i) throws Throwable {
        int i2 = $10 + 33;
        int i3 = i2 % 128;
        $11 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object obj = f4242d;
        $10 = (i3 + 43) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            byte b = bArr[242];
            byte b2 = bArr[862];
            int iIntValue = ((Integer) Class.forName($$c(b, b2, (short) ((b2 ^ 542) | (b2 & 542))), true, (ClassLoader) registerClient).getMethod($$c(bArr[862], bArr[250], bArr[51]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i4 = $11;
            int i5 = ((i4 | 51) << 1) - (i4 ^ 51);
            $10 = i5 % 128;
            if (i5 % 2 == 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getMonetizationNetwork(Object obj) throws Throwable {
        int i = $11;
        int i2 = i + 13;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object obj2 = f4242d;
        $10 = (i + 25) % 128;
        try {
            byte[] bArr = $$a;
            byte b = bArr[242];
            byte b2 = bArr[862];
            Class<?> cls = Class.forName($$c(b, b2, (short) ((b2 ^ 542) | (b2 & 542))), true, (ClassLoader) registerClient);
            byte b3 = (byte) (-bArr[1029]);
            byte b4 = bArr[301];
            int iIntValue = ((Integer) cls.getMethod($$c(b3, b4, b4), Object.class).invoke(obj2, obj)).intValue();
            int i3 = $10;
            $11 = ((i3 ^ 83) + ((i3 & 83) << 1)) % 128;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i = $11;
        $10 = ((i & 103) + (i | 103)) % 128;
        byte[] bArr = new byte[1124];
        System.arraycopy("@Òaüñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-´$\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ë1ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñìý\u000eå\u0013ñüôñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÙ6Ì\f\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøâ-´$\föõýÿî$åþø\u0005ê\b÷þ\u001dæîú\u0005ú\u0004\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-º\u001e\fö$µËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ê2\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHÿî$Ûþ\u0006î\bì\u0016ê\b÷þ\u001dæîú\u0005ú\u0004ø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1124);
        $$a = bArr;
        $$b = 110;
        int i2 = $11 + 95;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
