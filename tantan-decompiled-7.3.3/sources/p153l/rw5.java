package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.remote_config.C13261a;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class rw5 {

    /* JADX INFO: renamed from: c */
    public static final Map<String, rw5> f165105c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f165106a;

    /* JADX INFO: renamed from: b */
    public final String f165107b;

    public rw5(Context context, String str) {
        this.f165106a = context;
        this.f165107b = str;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized rw5 m183342c(Context context, String str) {
        Map<String, rw5> map;
        try {
            map = f165105c;
            if (!map.containsKey(str)) {
                map.put(str, new rw5(context, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: a */
    public synchronized Void m183343a() {
        this.f165106a.deleteFile(this.f165107b);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public String m183344b() {
        return this.f165107b;
    }

    /* JADX INFO: renamed from: d */
    public synchronized C13261a m183345d() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    fileInputStreamOpenFileInput = this.f165106a.openFileInput(this.f165107b);
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        String str = new String(bArr, "UTF-8");
                        if (TextUtils.isEmpty(str)) {
                            fileInputStreamOpenFileInput.close();
                            return null;
                        }
                        C13261a c13261aM80523b = C13261a.m80523b(new JSONObject(str));
                        fileInputStreamOpenFileInput.close();
                        return c13261aM80523b;
                    } catch (FileNotFoundException unused) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        return null;
                    } catch (JSONException e) {
                        e = e;
                        CrashHelper.m82479c(e);
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
    public synchronized Void m183346e(C13261a c13261a) throws IOException {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f165106a.openFileOutput(this.f165107b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(c13261a.toString().getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th) {
            fileOutputStreamOpenFileOutput.close();
            throw th;
        }
        return null;
    }
}
