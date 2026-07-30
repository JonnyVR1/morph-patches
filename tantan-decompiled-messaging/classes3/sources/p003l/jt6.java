package p003l;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class jt6 {

    /* JADX INFO: renamed from: a */
    public final Context f4728a;

    /* JADX INFO: renamed from: b */
    public String f4729b;

    /* JADX INFO: renamed from: c */
    public String f4730c;

    public jt6(Context context) {
        this.f4728a = context;
    }

    /* JADX INFO: renamed from: j */
    public static jt6 m5435j(Context context) {
        return new jt6(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5436a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    CrashHelper.c(e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m5437b() {
        return m5438c(this.f4728a, this.f4729b, this.f4730c);
    }

    /* JADX INFO: renamed from: c */
    public boolean m5438c(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        ArrayList<String> arrayListM5442g = m5442g(context, str, null);
        HashMap map = new HashMap();
        int size = arrayListM5442g.size();
        for (int i = 0; i < size; i++) {
            String str3 = arrayListM5442g.get(i);
            File fileM5443h = m5443h(str2 + "/" + str3);
            if (fileM5443h == null) {
                return false;
            }
            try {
                if (!m5445k(fileM5443h, context.getAssets().open(str3))) {
                    return false;
                }
                map.put(fileM5443h, Boolean.TRUE);
            } catch (FileNotFoundException e) {
                CrashHelper.c(e);
                return false;
            } catch (IOException e2) {
                CrashHelper.c(e2);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5439d(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        return file.mkdirs();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5440e(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!m5439d(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public jt6 m5441f(String str) {
        this.f4729b = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList<String> m5442g(Context context, String str, ArrayList<String> arrayList) {
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
                    m5442g(context, str2, arrayList);
                }
            }
            return arrayList;
        } catch (IOException e) {
            CrashHelper.c(e);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: h */
    public final File m5443h(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        return new File(str);
    }

    /* JADX INFO: renamed from: i */
    public jt6 m5444i(String str) {
        this.f4730c = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5445k(File file, InputStream inputStream) throws Throwable {
        if (file == null || inputStream == null || !m5440e(file)) {
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
                            m5436a(inputStream, bufferedOutputStream);
                            return true;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    closeable = bufferedOutputStream;
                    CrashHelper.c(e);
                    m5436a(inputStream, closeable);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    closeable = bufferedOutputStream;
                    m5436a(inputStream, closeable);
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
