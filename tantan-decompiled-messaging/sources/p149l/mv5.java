package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.remote_config.C13098a;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mv5 {

    /* JADX INFO: renamed from: c */
    public static final Map<String, mv5> f135870c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f135871a;

    /* JADX INFO: renamed from: b */
    public final String f135872b;

    public mv5(Context context, String str) {
        this.f135871a = context;
        this.f135872b = str;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized mv5 m156470c(Context context, String str) {
        Map<String, mv5> map;
        try {
            map = f135870c;
            if (!map.containsKey(str)) {
                map.put(str, new mv5(context, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: a */
    public synchronized Void m156471a() {
        this.f135871a.deleteFile(this.f135872b);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public String m156472b() {
        return this.f135872b;
    }

    /* JADX INFO: renamed from: d */
    public synchronized C13098a m156473d() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    fileInputStreamOpenFileInput = this.f135871a.openFileInput(this.f135872b);
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        String str = new String(bArr, "UTF-8");
                        if (TextUtils.isEmpty(str)) {
                            fileInputStreamOpenFileInput.close();
                            return null;
                        }
                        C13098a c13098aM79340b = C13098a.m79340b(new JSONObject(str));
                        fileInputStreamOpenFileInput.close();
                        return c13098aM79340b;
                    } catch (FileNotFoundException unused) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        return null;
                    } catch (JSONException e) {
                        e = e;
                        CrashHelper.m81296c(e);
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                fileInputStreamOpenFileInput = null;
            } catch (JSONException e2) {
                e = e2;
                fileInputStreamOpenFileInput = null;
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized Void m156474e(C13098a c13098a) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f135871a.openFileOutput(this.f135872b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(c13098a.toString().getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th) {
            fileOutputStreamOpenFileOutput.close();
            throw th;
        }
        return null;
    }
}
