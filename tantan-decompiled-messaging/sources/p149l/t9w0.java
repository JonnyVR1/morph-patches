package p149l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.core.glcore.util.ErrorCode;
import com.google.android.gms.internal.ads.zzfxs;
import com.meituan.robust.Constants;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import com.tencent.liteav.TXLiteAVCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class t9w0 {
    /* JADX INFO: renamed from: a */
    public static boolean m187683a(int i) {
        int i2 = i - 1;
        return i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x012f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x0138  */
    /* JADX WARN: Code duplicated, block: B:86:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e  */
    /* JADX INFO: renamed from: b */
    public static final int m187684b(Context context, p8w0 p8w0Var) {
        int i;
        String str;
        String strM187685c;
        File file = new File(new File(context.getApplicationInfo().dataDir), ShareConstants.SO_PATH);
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new dkw0(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                p8w0Var.m167826b(5017, "No .so");
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                m187686d(bArr, null, context, p8w0Var);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    fileInputStream.close();
                                    i = 5;
                                } else if (s == 40) {
                                    fileInputStream.close();
                                    i = 3;
                                } else if (s == 62) {
                                    fileInputStream.close();
                                    i = 7;
                                } else if (s == 183) {
                                    fileInputStream.close();
                                    i = 6;
                                } else if (s != 243) {
                                    m187686d(bArr, null, context, p8w0Var);
                                } else {
                                    fileInputStream.close();
                                    i = 8;
                                }
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    m187686d(null, e.toString(), context, p8w0Var);
                }
                i = 1;
            }
            if (i == 1000) {
                strM187685c = m187685c(context, p8w0Var);
                if (TextUtils.isEmpty(strM187685c)) {
                    m187686d(null, "Empty dev arch", context, p8w0Var);
                } else if (!strM187685c.equalsIgnoreCase("i686") || strM187685c.equalsIgnoreCase("x86")) {
                    i = 5;
                } else if (strM187685c.equalsIgnoreCase("x86_64")) {
                    i = 7;
                } else if (strM187685c.equalsIgnoreCase("arm64-v8a")) {
                    i = 6;
                } else if (strM187685c.equalsIgnoreCase("armeabi-v7a") || strM187685c.equalsIgnoreCase("armv71")) {
                    i = 3;
                } else if (strM187685c.equalsIgnoreCase("riscv64")) {
                    i = 8;
                } else {
                    m187686d(null, strM187685c, context, p8w0Var);
                }
                i = 1;
            }
            if (i != 1) {
                str = "UNSUPPORTED";
            } else if (i != 3) {
                str = "ARM7";
            } else if (i != 5) {
                str = "X86";
            } else if (i != 6) {
                str = "ARM64";
            } else if (i != 7) {
                str = "X86_64";
            } else if (i != 8) {
                str = "null";
            } else {
                str = "RISCV64";
            }
            p8w0Var.m167826b(5018, str);
            return i;
        }
        p8w0Var.m167826b(5017, "No lib/");
        i = 1000;
        if (i == 1000) {
            strM187685c = m187685c(context, p8w0Var);
            if (TextUtils.isEmpty(strM187685c)) {
                m187686d(null, "Empty dev arch", context, p8w0Var);
            } else if (strM187685c.equalsIgnoreCase("i686")) {
                i = 5;
            } else {
                i = 5;
            }
            i = 1;
        }
        if (i != 1) {
            str = "UNSUPPORTED";
        } else if (i != 3) {
            str = "ARM7";
        } else if (i != 5) {
            str = "X86";
        } else if (i != 6) {
            str = "ARM64";
        } else if (i != 7) {
            str = "X86_64";
        } else if (i != 8) {
            str = "null";
        } else {
            str = "RISCV64";
        }
        p8w0Var.m167826b(5018, str);
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static final String m187685c(Context context, p8w0 p8w0Var) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzfxs.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            p8w0Var.m167827c(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING, 0L, e);
        } catch (NoSuchFieldException e2) {
            p8w0Var.m167827c(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING, 0L, e2);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    /* JADX INFO: renamed from: d */
    public static final void m187686d(byte[] bArr, String str, Context context, p8w0 p8w0Var) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzfxs.OS_ARCH.zza());
        sb.append(Constants.PACKNAME_END);
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(Constants.PACKNAME_END);
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(Constants.PACKNAME_END);
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(Constants.PACKNAME_END);
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(Constants.PACKNAME_END);
        }
        p8w0Var.m167826b(ErrorCode.CAMEAR_GET_STATUS_FAILED, sb.toString());
    }
}
