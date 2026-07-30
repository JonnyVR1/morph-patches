package com.clevertap.android.pushsdk;

import com.alibaba.fastjson.asm.Opcodes;
import com.tencent.liteav.audio.TXEAudioDef;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public class unregisterForContextMenu {
    private static Object Class = null;
    private static Object DexFile = null;
    public static byte[] FileDescriptor = null;
    private static int getDeclaredAnnotation = 1;
    public static final int getDeclaredClasses = 0;
    public static final byte[] getDeclaringClass = null;
    private static int getEnclosingClass;
    public static long isAnonymousClass;
    public static byte[] isDexOptNeeded;
    public static int newInstance;

    /* JADX WARN: Code duplicated, block: B:10:0x005c A[PHI: r1 r3 r8 r9 r10
      0x005c: PHI (r1v5 byte[]) = (r1v4 byte[]), (r1v8 byte[]) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r3v2 int) = (r3v1 int), (r3v18 int) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r8v3 int) = (r8v2 int), (r8v21 int) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r9v11 byte[]) = (r9v10 byte[]), (r9v18 byte[]) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r10v8 int) = (r10v7 int), (r10v11 int) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x002c A[PHI: r1 r3 r8 r9 r10
      0x002c: PHI (r1v7 byte[]) = (r1v4 byte[]), (r1v8 byte[]) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r3v16 int) = (r3v1 int), (r3v18 int) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r8v18 int) = (r8v2 int), (r8v21 int) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r9v16 byte[]) = (r9v10 byte[]), (r9v18 byte[]) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r10v10 int) = (r10v7 int), (r10v11 int) binds: [B:9:0x005a, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    private static String $$c(int i, short s, short s2) {
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        int i5 = getEnclosingClass;
        int i6 = ((i5 | 43) << 1) - (i5 ^ 43);
        int i7 = i6 % 128;
        getDeclaredAnnotation = i7;
        int i8 = 0;
        if (i6 % 2 == 0) {
            bArr = getDeclaringClass;
            i2 = 12485 / s;
            int i9 = ((i | 53) << 1) - (i ^ 53);
            i3 = (i9 & 65) + (i9 | 65);
            bArr2 = new byte[s2 + 124];
            i4 = s2 + Opcodes.IFNULL;
            if (bArr == null) {
                getEnclosingClass = (i7 + 29) % 128;
                int i10 = i2;
                int i11 = -(-(-i3));
                i3 = ((i2 & i11) + (i11 | i2)) - 3;
                int i12 = ((i10 | TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION) << 1) - (i10 ^ TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION);
                i2 = ((i12 | 105) << 1) - (i12 ^ 105);
                int i13 = getEnclosingClass;
                getDeclaredAnnotation = ((i13 ^ 39) + ((i13 & 39) << 1)) % 128;
            }
        } else {
            bArr = getDeclaringClass;
            int i14 = -s;
            i2 = (i14 ^ 1076) + ((i14 & 1076) << 1);
            int i15 = ((s2 | (-34)) << 1) - (s2 ^ (-34));
            int i16 = ((i15 | 35) << 1) - (i15 ^ 35);
            i3 = ((i | 41) << 1) - (i ^ 41);
            bArr2 = new byte[i16];
            int i17 = (i16 & (-87)) + (i16 | (-87));
            i4 = (i17 & 86) + (i17 | 86);
            if (bArr == null) {
                getEnclosingClass = (i7 + 29) % 128;
                int i18 = i2;
                int i19 = -(-(-i3));
                i3 = ((i2 & i19) + (i19 | i2)) - 3;
                int i110 = ((i18 | TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION) << 1) - (i18 ^ TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION);
                i2 = ((i110 | 105) << 1) - (i110 ^ 105);
                int i111 = getEnclosingClass;
                getDeclaredAnnotation = ((i111 ^ 39) + ((i111 & 39) << 1)) % 128;
            }
        }
        while (true) {
            bArr2[i8] = (byte) i3;
            if (i8 == i4) {
                String str = new String(bArr2, 0);
                getEnclosingClass = (getDeclaredAnnotation + 113) % 128;
                return str;
            }
            int i20 = ((i8 | 1) << 1) - (i8 ^ 1);
            byte b = bArr[i2];
            int i21 = getDeclaredAnnotation;
            getEnclosingClass = ((i21 & 63) + (i21 | 63)) % 128;
            int i22 = i2;
            int i23 = i3;
            i8 = i20;
            int i24 = -(-(-b));
            i3 = ((i23 & i24) + (i24 | i23)) - 3;
            int i25 = ((i22 | TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION) << 1) - (i22 ^ TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION);
            i2 = ((i25 | 105) << 1) - (i25 ^ 105);
            int i26 = getEnclosingClass;
            getDeclaredAnnotation = ((i26 ^ 39) + ((i26 & 39) << 1)) % 128;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 55051. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 5505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.pushsdk.unregisterForContextMenu.<clinit>():void");
    }

    private unregisterForContextMenu() {
    }

    public static void init$0() {
        int i;
        int i2 = getDeclaredAnnotation;
        int i3 = (i2 & 39) + (i2 | 39);
        getEnclosingClass = i3 % 128;
        if (i3 % 2 != 0) {
            byte[] bArr = new byte[1094];
            System.arraycopy("\u0005\u007f¯Æ\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0004ù\nûûóü\fð)Ôú,Ñþ÷\fê\u0001$åôö\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðþ\u001cÜù\b÷þø'Ò\fõ\u0017ëö\u0004ÿì\fþð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØôñÿ;Éô\u0004ì\u000eðû\u0010î>Ëð\u0007ï\u0000\u0003\u00022¼øÿ\bò\fö9·\u0004ù\nûûóü\fð)Ôú,Ñþ÷\fê\u0001$åôöNµ\n\u0001úñÿ<Èô\u0004ì\u000eðû\u0010î?Êð\u0007ï\u0000\u0003\u00023»øÿ\bò\fö\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õñÿ<Èô\u0004ì\u000eðû\u0010î?Êð\u0007ï\u0000\u0003\u00023»øÿ\bò\fö:¼ü\bô(Ñþ÷\fê\u0001$åôöNý\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úö\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜêÉñÿ;Éô\u0004ì\u000eðû\u0010î>Ëð\u0007ï\u0000\u0003\u00022¼øÿ\bò\fö9Ë1\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0005ÿöÿî.Ô\bëý$Ú\u000búüð\b\u0002ñÿ;Éô\u0004ì\u000eðû\u0010î>Ëð\u0007ï\u0000\u0003\u00022¼øÿ\bò\fö9½ü\bô(Ñþ÷\fê\u0001$åôöNýÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000b\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÉñÿ;Éô\u0004ì\u000eðû\u0010î>Ëð\u0007ï\u0000\u0003\u00022¼øÿ\bò\fö9Ê2ÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þ\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úú\u0012ú\u0010õü\bô(Ñþ÷\fê\u0001$åôöë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëý\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr, 0, 1094);
            getDeclaringClass = bArr;
            i = 81;
        } else {
            byte[] bArr2 = new byte[1094];
            System.arraycopy("\u0005\u007f¯Æ\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0004ù\nûûóü\fð)Ôú,Ñþ÷\fê\u0001$åôö\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðþ\u001cÜù\b÷þø'Ò\fõ\u0017ëö\u0004ÿì\fþð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØôñÿ;Éô\u0004ì\u000eðû\u0010î>Ëð\u0007ï\u0000\u0003\u00022¼øÿ\bò\fö9·\u0004ù\nûûóü\fð)Ôú,Ñþ÷\fê\u0001$åôöNµ\n\u0001úñÿ<Èô\u0004ì\u000eðû\u0010î?Êð\u0007ï\u0000\u0003\u00023»øÿ\bò\fö\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õñÿ<Èô\u0004ì\u000eðû\u0010î?Êð\u0007ï\u0000\u0003\u00023»øÿ\bò\fö:¼ü\bô(Ñþ÷\fê\u0001$åôöNý\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úö\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜêÉñÿ;Éô\u0004ì\u000eðû\u0010î>Ëð\u0007ï\u0000\u0003\u00022¼øÿ\bò\fö9Ë1\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0005ÿöÿî.Ô\bëý$Ú\u000búüð\b\u0002ñÿ;Éô\u0004ì\u000eðû\u0010î>Ëð\u0007ï\u0000\u0003\u00022¼øÿ\bò\fö9½ü\bô(Ñþ÷\fê\u0001$åôöNýÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000b\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÉñÿ;Éô\u0004ì\u000eðû\u0010î>Ëð\u0007ï\u0000\u0003\u00022¼øÿ\bò\fö9Ê2ÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þ\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úú\u0012ú\u0010õü\bô(Ñþ÷\fê\u0001$åôöë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëý\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr2, 0, 1094);
            getDeclaringClass = bArr2;
            i = 79;
        }
        getDeclaredClasses = i;
    }

    public static int onOptionsItemSelected(int i) throws Throwable {
        int i2 = getEnclosingClass;
        int i3 = i2 + 47;
        getDeclaredAnnotation = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Object obj = Class;
        int i4 = (((i2 | 77) << 1) - (i2 ^ 77)) % 128;
        getDeclaredAnnotation = i4;
        getEnclosingClass = (i4 + 31) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = getDeclaringClass;
            byte b = bArr[178];
            int iIntValue = ((Integer) Class.forName($$c(b, (short) ((b ^ 581) | (b & 581)), bArr[232]), true, (ClassLoader) DexFile).getMethod($$c((byte) (getDeclaredClasses & HttpStatus.BAD_GATEWAY_502), (short) 973, bArr[405]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i5 = getEnclosingClass;
            int i6 = (i5 & 95) + (i5 | 95);
            getDeclaredAnnotation = i6 % 128;
            if (i6 % 2 != 0) {
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

    public static Object setContentView(int i, int i2, char c) throws Throwable {
        int i3 = getEnclosingClass;
        Object obj = Class;
        int i4 = ((i3 ^ 31) + ((i3 & 31) << 1)) % 128;
        getDeclaredAnnotation = i4;
        getEnclosingClass = (((i4 | 65) << 1) - (i4 ^ 65)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte[] bArr = getDeclaringClass;
            byte b = bArr[178];
            Class<?> cls = Class.forName($$c(b, (short) ((b ^ 581) | (b & 581)), bArr[232]), true, (ClassLoader) DexFile);
            byte b2 = (byte) (getDeclaredClasses & HttpStatus.BAD_GATEWAY_502);
            String str$$c = $$c(b2, (short) ((b2 ^ 25) | (b2 & 25)), bArr[140]);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i5 = getEnclosingClass;
            getDeclaredAnnotation = ((i5 ^ 103) + ((i5 & 103) << 1)) % 128;
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int unregisterForContextMenu(Object obj) throws Throwable {
        int i = (getDeclaredAnnotation + 7) % 128;
        getEnclosingClass = i;
        Object obj2 = Class;
        getDeclaredAnnotation = ((i & 71) + (i | 71)) % 128;
        try {
            byte[] bArr = getDeclaringClass;
            byte b = bArr[178];
            int iIntValue = ((Integer) Class.forName($$c(b, (short) ((b ^ 581) | (b & 581)), bArr[232]), true, (ClassLoader) DexFile).getMethod($$c(bArr[409], (short) 1046, bArr[115]), Object.class).invoke(obj2, obj)).intValue();
            getDeclaredAnnotation = (getEnclosingClass + 105) % 128;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
