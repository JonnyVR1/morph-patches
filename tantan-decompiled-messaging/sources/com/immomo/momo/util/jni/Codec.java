package com.immomo.momo.util.jni;

import android.content.Context;
import com.cosmos.mdlog.MDLog;
import p149l.gze;

/* JADX INFO: loaded from: classes7.dex */
public class Codec {
    private static int _bits = 0;
    private static int _bytes = 0;
    private static int _numDigits = 0;
    private static String acct = null;
    private static final String emu_str = "android+momo+";
    private static String hacc;
    private static String mccc;
    private static String pacc;

    static {
        MDLog.m7396i("momoenc", "loadLibrary :%b", Boolean.valueOf(gze.m128844a().loadLibrary("mjni")));
        hacc = null;
        pacc = null;
        acct = null;
        mccc = null;
        _bits = 128;
        int i = 128 / 8;
        _bytes = i;
        _numDigits = i / 8;
    }

    public static native String Dse();

    @Deprecated
    public static native String aaa();

    public static native String acct();

    private static native byte[] aec(byte[] bArr, int i, int i2);

    @Deprecated
    public static native String bbb();

    private static native String bd3ms(Object obj, String str);

    public static native String coo();

    public static native String dbu();

    @Deprecated
    public static native String ddd(Object obj);

    public static native String dde();

    /* JADX INFO: renamed from: dm */
    public static native String m19036dm();

    public static native String dma();

    public static native String dmo();

    /* JADX INFO: renamed from: dr */
    public static native String m19037dr();

    /* JADX INFO: renamed from: ds */
    public static native String m19038ds();

    /* JADX INFO: renamed from: du */
    public static native String m19039du();

    @Deprecated
    public static native String eee();

    public static native String eferfer43rwfe(Object obj, String str);

    @Deprecated
    /* JADX INFO: renamed from: em */
    public static native String m19040em();

    public static native String etr968ww();

    public static native String[] ewfer45te();

    public static native int ewfet4fwesdegrhrtr(Object obj, int i, int i2);

    @Deprecated
    public static native String fff();

    public static native byte[] gdwititwie(Object obj, int i);

    public static native boolean generate(byte[] bArr, byte[] bArr2);

    @Deprecated
    public static native String ggg();

    public static native String gvk();

    public static native String hacc();

    public static native String hewsdrwe(int i);

    public static native String hfdwefher();

    @Deprecated
    public static native int hhh();

    @Deprecated
    public static native String iii();

    @Deprecated
    public static native String iiou(int i);

    private static native boolean isEmulator();

    @Deprecated
    public static native String jjj(Object obj);

    public static native String kjlagfyutsb45(String str, String str2, String str3, int i);

    @Deprecated
    public static native String kkk();

    public static native String kwiwek(int i);

    @Deprecated
    public static native String lll();

    public static native String loiwq(int i);

    @Deprecated
    public static native String lsn();

    private static native String lueo19(Object obj, String str);

    public static native String lwjey(int i);

    public static native String mccc();

    public static native String mksi18sjmmig(Object obj, String str, String str2);

    @Deprecated
    /* JADX INFO: renamed from: mm */
    public static native String m19041mm();

    private static native byte[] mmacc(byte[] bArr, int i, int i2);

    @Deprecated
    public static native String mmm();

    public static native byte[] mmsdwaa(long j, String str, String str2, String str3, Context context);

    public static native String njaei(Object obj, int i);

    @Deprecated
    public static native String nnn();

    @Deprecated
    public static native String ooo();

    @Deprecated
    public static native String opq();

    public static native String oqhyn(Object obj, int i);

    public static native String pacc();

    public static native String ppp();

    @Deprecated
    public static native String qqq();

    @Deprecated
    public static native String rrr();

    public static native String rscccc();

    @Deprecated
    public static native String saa();

    public static native String[] sdfe3434w();

    public static native String sdwwewfe22qasf();

    public static native int secret(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static native int signature(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    @Deprecated
    public static native String sss();

    @Deprecated
    public static native String sssl();

    @Deprecated
    public static native String uuu();

    public static native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static native String wfer68();

    public static native String wfergfe(int i);

    public static native String wfertreg4s(int i);

    public static native byte[] xkdkas(long j, String str, Context context);

    public static native String xxilss();

    public static native int xxmmlloopp();

    @Deprecated
    public static native String xxx();
}
