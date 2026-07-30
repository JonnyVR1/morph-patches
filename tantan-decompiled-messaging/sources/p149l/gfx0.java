package p149l;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class gfx0 {

    /* JADX INFO: renamed from: l.gfx0$a */
    public static class C17069a {

        /* JADX INFO: renamed from: a */
        public static volatile Optional<hgx0> f102440a;

        /* JADX INFO: renamed from: a */
        public static Optional<hgx0> m125935a(Context context) {
            Optional<hgx0> optional;
            Optional<hgx0> optionalM125931a;
            Optional<hgx0> optional2 = f102440a;
            if (optional2 != null) {
                return optional2;
            }
            synchronized (C17069a.class) {
                try {
                    optional = f102440a;
                    if (optional == null) {
                        new gfx0();
                        if (rhx0.m179468c(Build.TYPE, Build.TAGS)) {
                            if (o1x0.m162270a() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            optionalM125931a = gfx0.m125931a(context);
                        } else {
                            optionalM125931a = Optional.absent();
                        }
                        optional = optionalM125931a;
                        f102440a = optional;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return optional;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static Optional<hgx0> m125931a(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            Optional<File> optionalM125934d = m125934d(context);
            return optionalM125934d.isPresent() ? Optional.m15413of(m125933c(context, optionalM125934d.get())) : Optional.absent();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m125932b(String str) {
        return new String(str);
    }

    /* JADX INFO: renamed from: c */
    public static hgx0 m125933c(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                hgf0 hgf0Var = new hgf0();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String.valueOf(file);
                        context.getPackageName();
                        a7x0 a7x0Var = new a7x0(hgf0Var);
                        bufferedReader.close();
                        return a7x0Var;
                    }
                    String[] strArrSplit = line.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + line);
                    } else {
                        String strM125932b = m125932b(strArrSplit[0]);
                        String strDecode = Uri.decode(m125932b(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String strM125932b2 = m125932b(strArrSplit[2]);
                            strDecode2 = Uri.decode(strM125932b2);
                            if (strDecode2.length() < 1024 || strDecode2 == strM125932b2) {
                                map.put(strM125932b2, strDecode2);
                            }
                        }
                        hgf0 hgf0Var2 = (hgf0) hgf0Var.get(strM125932b);
                        if (hgf0Var2 == null) {
                            hgf0Var2 = new hgf0();
                            hgf0Var.put(strM125932b, hgf0Var2);
                        }
                        hgf0Var2.put(strDecode, strDecode2);
                    }
                    aag0.m95543a(e);
                    return null;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Optional<File> m125934d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? Optional.m15413of(file) : Optional.absent();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return Optional.absent();
        }
    }
}
