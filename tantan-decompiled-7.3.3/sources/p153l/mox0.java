package p153l;

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
public final class mox0 {

    /* JADX INFO: renamed from: l.mox0$a */
    public static class C18665a {

        /* JADX INFO: renamed from: a */
        public static volatile Optional<npx0> f137858a;

        /* JADX INFO: renamed from: a */
        public static Optional<npx0> m159324a(Context context) {
            Optional<npx0> optional;
            Optional<npx0> optionalM159320a;
            Optional<npx0> optional2 = f137858a;
            if (optional2 != null) {
                return optional2;
            }
            synchronized (C18665a.class) {
                try {
                    optional = f137858a;
                    if (optional == null) {
                        new mox0();
                        if (xqx0.m212769c(Build.TYPE, Build.TAGS)) {
                            if (uax0.m195203a() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            optionalM159320a = mox0.m159320a(context);
                        } else {
                            optionalM159320a = Optional.absent();
                        }
                        optional = optionalM159320a;
                        f137858a = optional;
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
    public static Optional<npx0> m159320a(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            Optional<File> optionalM159323d = m159323d(context);
            return optionalM159323d.isPresent() ? Optional.m15467of(m159322c(context, optionalM159323d.get())) : Optional.absent();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m159321b(String str) {
        return new String(str);
    }

    /* JADX INFO: renamed from: c */
    public static npx0 m159322c(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                oof0 oof0Var = new oof0();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String.valueOf(file);
                        context.getPackageName();
                        ggx0 ggx0Var = new ggx0(oof0Var);
                        bufferedReader.close();
                        return ggx0Var;
                    }
                    String[] strArrSplit = line.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + line);
                    } else {
                        String strM159321b = m159321b(strArrSplit[0]);
                        String strDecode = Uri.decode(m159321b(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String strM159321b2 = m159321b(strArrSplit[2]);
                            strDecode2 = Uri.decode(strM159321b2);
                            if (strDecode2.length() < 1024 || strDecode2 == strM159321b2) {
                                map.put(strM159321b2, strDecode2);
                            }
                        }
                        oof0 oof0Var2 = (oof0) oof0Var.get(strM159321b);
                        if (oof0Var2 == null) {
                            oof0Var2 = new oof0();
                            oof0Var.put(strM159321b, oof0Var2);
                        }
                        oof0Var2.put(strDecode, strDecode2);
                    }
                    iig0.m140070a(e);
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
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Optional<File> m159323d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? Optional.m15467of(file) : Optional.absent();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return Optional.absent();
        }
    }
}
