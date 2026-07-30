package p153l;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes.dex */
public class v3r0 {

    /* JADX INFO: renamed from: a */
    private final String f182281a;

    /* JADX INFO: renamed from: b */
    private HttpURLConnection f182282b;

    /* JADX INFO: renamed from: c */
    private String f182283c;

    /* JADX INFO: renamed from: d */
    private boolean f182284d;

    /* JADX INFO: renamed from: e */
    private o1r0 f182285e;

    /* JADX INFO: renamed from: f */
    private v4r0 f182286f;

    public v3r0(String str, String str2, Map<String, String> map, boolean z) throws ProtocolException {
        this.f182283c = str2;
        this.f182284d = z;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f182281a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f182282b = httpURLConnection;
        irq0.m141848a(httpURLConnection);
        this.f182282b.setUseCaches(false);
        this.f182282b.setDoOutput(true);
        this.f182282b.setDoInput(true);
        this.f182282b.setRequestMethod("POST");
        this.f182282b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f182282b.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (!z) {
            this.f182285e = new o1r0(this.f182282b.getOutputStream());
        } else {
            this.f182282b.setRequestProperty("Content-Encoding", HttpHeaderValues.GZIP);
            this.f182286f = new v4r0(this.f182282b.getOutputStream());
        }
    }

    /* JADX INFO: renamed from: a */
    public String m199621a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f182281a + "--\r\n").getBytes();
        if (this.f182284d) {
            this.f182286f.write(bytes);
            this.f182286f.m199737m();
            this.f182286f.m199736k();
        } else {
            this.f182285e.write(bytes);
            this.f182285e.flush();
            this.f182285e.m165668k();
        }
        int responseCode = this.f182282b.getResponseCode();
        if (responseCode != 200) {
            p3r0.m170507a("Server returned non-OK status: ", responseCode);
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f182282b.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            arrayList.add(line);
        }
        bufferedReader.close();
        this.f182282b.disconnect();
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public void m199622b(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f182281a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f182284d) {
            this.f182286f.write(sb.toString().getBytes());
        } else {
            this.f182285e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                break;
            } else {
                (this.f182284d ? this.f182286f : this.f182285e).write(bArr, 0, i);
            }
        }
        fileInputStream.close();
        if (this.f182284d) {
            this.f182286f.write("\r\n".getBytes());
        } else {
            this.f182285e.write("\r\n".getBytes());
            this.f182285e.flush();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m199623c(String str, String str2) {
        m199624d(str, str2, false);
    }

    /* JADX INFO: renamed from: d */
    public void m199624d(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f182281a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.f182283c);
        sb.append("\r\n\r\n");
        try {
            if (this.f182284d) {
                this.f182286f.write(sb.toString().getBytes());
            } else {
                this.f182285e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = v2r0.m199144a(bytes);
        }
        try {
            if (this.f182284d) {
                this.f182286f.write(bytes);
                this.f182286f.write("\r\n".getBytes());
            } else {
                this.f182285e.write(bytes);
                this.f182285e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m199625e(String str, Map<String, String> map, File... fileArr) throws Throwable {
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f182281a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("; ");
                sb.append(entry.getKey());
                sb.append("=\"");
                sb.append(entry.getValue());
                sb.append("\"");
            }
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f182284d) {
            this.f182286f.write(sb.toString().getBytes());
        } else {
            this.f182285e.write(sb.toString().getBytes());
        }
        r3r0.m179688n(this.f182284d ? this.f182286f : this.f182285e, fileArr);
        if (this.f182284d) {
            this.f182286f.write("\r\n".getBytes());
        } else {
            this.f182285e.write("\r\n".getBytes());
            this.f182285e.flush();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m199626f(String str, File... fileArr) {
        m199625e(str, null, fileArr);
    }

    public v3r0(String str, String str2, boolean z) {
        this(str, str2, null, z);
    }
}
