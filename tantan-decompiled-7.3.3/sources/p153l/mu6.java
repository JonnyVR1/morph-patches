package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class mu6 {

    /* JADX INFO: renamed from: a */
    public final Context f138747a;

    /* JADX INFO: renamed from: b */
    public String f138748b;

    /* JADX INFO: renamed from: c */
    public String f138749c;

    public mu6(Context context) {
        this.f138747a = context;
    }

    /* JADX INFO: renamed from: j */
    public static mu6 m160128j(Context context) {
        return new mu6(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m160129a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m160130b() {
        return m160131c(this.f138747a, this.f138748b, this.f138749c);
    }

    /* JADX INFO: renamed from: c */
    public boolean m160131c(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        ArrayList<String> arrayListM160135g = m160135g(context, str, null);
        HashMap map = new HashMap();
        int size = arrayListM160135g.size();
        for (int i = 0; i < size; i++) {
            String str3 = arrayListM160135g.get(i);
            File fileM160136h = m160136h(str2 + "/" + str3);
            if (fileM160136h == null) {
                return false;
            }
            try {
                if (!m160138k(fileM160136h, context.getAssets().open(str3))) {
                    return false;
                }
                map.put(fileM160136h, Boolean.TRUE);
            } catch (FileNotFoundException e) {
                CrashHelper.m82479c(e);
                return false;
            } catch (IOException e2) {
                CrashHelper.m82479c(e2);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m160132d(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m160133e(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!m160132d(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public mu6 m160134f(String str) {
        this.f138748b = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList<String> m160135g(Context context, String str, ArrayList<String> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        try {
            String[] list = context.getAssets().list(str);
            int length = list.length;
            for (int i = 0; i < length; i++) {
                String str2 = list[i];
                if (!str.equals("")) {
                    str2 = str + "/" + str2;
                }
                if (context.getAssets().list(str2).length == 0) {
                    arrayList.add(str2);
                } else {
                    m160135g(context, str2, arrayList);
                }
            }
            return arrayList;
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: h */
    public final File m160136h(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        return new File(str);
    }

    /* JADX INFO: renamed from: i */
    public mu6 m160137i(String str) {
        this.f138749c = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m160138k(File file, InputStream inputStream) throws Throwable {
        if (file == null || inputStream == null || !m160133e(file)) {
            return false;
        }
        Closeable closeable = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 1024);
                        if (i == -1) {
                            m160129a(inputStream, bufferedOutputStream);
                            return true;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    closeable = bufferedOutputStream;
                    CrashHelper.m82479c(e);
                    m160129a(inputStream, closeable);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    closeable = bufferedOutputStream;
                    m160129a(inputStream, closeable);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
