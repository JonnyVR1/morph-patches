package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.xiaomi.push.service.C14853ax;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
class xoq0 {

    /* JADX INFO: renamed from: h */
    private static String f193870h = "/MiPushLog";

    /* JADX INFO: renamed from: b */
    private String f193872b;

    /* JADX INFO: renamed from: c */
    private String f193873c;

    /* JADX INFO: renamed from: d */
    private boolean f193874d;

    /* JADX INFO: renamed from: e */
    private int f193875e;

    /* JADX INFO: renamed from: a */
    @SuppressLint({"SimpleDateFormat"})
    private final SimpleDateFormat f193871a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* JADX INFO: renamed from: f */
    private int f193876f = 2097152;

    /* JADX INFO: renamed from: g */
    private ArrayList<File> f193877g = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    private void m210438e(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) throws IOException {
        char[] cArr = new char[4096];
        int i = bufferedReader.read(cArr);
        boolean z = false;
        while (i != -1 && !z) {
            String str = new String(cArr, 0, i);
            Matcher matcher = pattern.matcher(str);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && matcher.find(i2)) {
                int iStart = matcher.start();
                String strSubstring = str.substring(iStart, this.f193872b.length() + iStart);
                if (this.f193874d) {
                    if (strSubstring.compareTo(this.f193873c) > 0) {
                        z = true;
                        i = iStart;
                        break;
                    }
                } else if (strSubstring.compareTo(this.f193872b) >= 0) {
                    this.f193874d = true;
                    i3 = iStart;
                }
                int iIndexOf = str.indexOf(10, iStart);
                if (iIndexOf == -1) {
                    iIndexOf = this.f193872b.length();
                }
                i2 = iStart + iIndexOf;
            }
            if (this.f193874d) {
                int i4 = i - i3;
                this.f193875e += i4;
                if (z) {
                    bufferedWriter.write(cArr, i3, i4);
                    return;
                } else {
                    bufferedWriter.write(cArr, i3, i4);
                    if (this.f193875e > this.f193876f) {
                        return;
                    }
                }
            }
            i = bufferedReader.read(cArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [l.xoq0] */
    /* JADX INFO: renamed from: f */
    private void m210439f(File file) throws Throwable {
        ?? r2;
        ?? r3;
        ?? bufferedReader = "model :";
        Pattern patternCompile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedWriter bufferedWriter = null;
         = 0;
         = 0;
         = 0;
        ?? r4 = 0;
        bufferedWriter = null;
        bufferedWriter = null;
        bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write("model :" + kvq0.m147391a() + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + C14853ax.m86572a() + "; lng :" + Locale.getDefault().toString() + "; sdk :48; andver :" + Build.VERSION.SDK_INT + SignParameters.NEW_LINE);
                    this.f193875e = 0;
                    Iterator<File> it = this.f193877g.iterator();
                    while (it.hasNext()) {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                        try {
                            m210438e(bufferedReader, bufferedWriter2, patternCompile);
                            bufferedReader.close();
                            r4 = bufferedReader;
                        } catch (FileNotFoundException e) {
                            e = e;
                            bufferedWriter = bufferedWriter2;
                            r3 = bufferedReader;
                            ilq0.m137053z("LOG: filter error = " + e.getMessage());
                            bufferedReader = r3;
                            dxq0.m114018b(bufferedWriter);
                            dxq0.m114018b(bufferedReader);
                            return;
                        } catch (IOException e2) {
                            e = e2;
                            bufferedWriter = bufferedWriter2;
                            r2 = bufferedReader;
                            ilq0.m137053z("LOG: filter error = " + e.getMessage());
                            bufferedReader = r2;
                            dxq0.m114018b(bufferedWriter);
                            dxq0.m114018b(bufferedReader);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            dxq0.m114018b(bufferedWriter);
                            dxq0.m114018b(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedWriter2.write(rnq0.m180126a().m180144c());
                    dxq0.m114018b(bufferedWriter2);
                    dxq0.m114018b(r4);
                } catch (FileNotFoundException e3) {
                    e = e3;
                    bufferedReader = r4;
                } catch (IOException e4) {
                    e = e4;
                    bufferedReader = r4;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = r4;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            r3 = 0;
        } catch (IOException e6) {
            e = e6;
            r2 = 0;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public File m210440a(Context context, Date date, Date date2, File file) throws Throwable {
        File fileM142525a;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            fileM142525a = joq0.m142525a(context);
            if (fileM142525a == null) {
                return null;
            }
            m210441b(new File(fileM142525a, "xmsf.log.1"));
            m210441b(new File(fileM142525a, "xmsf.log"));
        } else {
            File file2 = new File(context.getFilesDir() + f193870h);
            if (!ywq0.m216410b(file2)) {
                return null;
            }
            m210441b(new File(file2, "log0.txt"));
            m210441b(new File(file2, "log1.txt"));
            fileM142525a = file2;
        }
        if (!fileM142525a.isDirectory()) {
            return null;
        }
        File file3 = new File(file, date.getTime() + "-" + date2.getTime() + ".zip");
        if (file3.exists()) {
            return null;
        }
        m210442c(date, date2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file4 = new File(file, "log.txt");
        m210439f(file4);
        ilq0.m137053z("LOG: filter cost = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (file4.exists()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            dxq0.m114019c(file3, file4);
            ilq0.m137053z("LOG: zip cost = " + (System.currentTimeMillis() - jCurrentTimeMillis2));
            file4.delete();
            if (file3.exists()) {
                return file3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public xoq0 m210441b(File file) {
        if (file.exists()) {
            this.f193877g.add(file);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public xoq0 m210442c(Date date, Date date2) {
        boolean zAfter = date.after(date2);
        SimpleDateFormat simpleDateFormat = this.f193871a;
        if (zAfter) {
            this.f193872b = simpleDateFormat.format(date2);
            this.f193873c = this.f193871a.format(date);
            return this;
        }
        this.f193872b = simpleDateFormat.format(date);
        this.f193873c = this.f193871a.format(date2);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void m210443d(int i) {
        if (i != 0) {
            this.f193876f = i;
        }
    }
}
