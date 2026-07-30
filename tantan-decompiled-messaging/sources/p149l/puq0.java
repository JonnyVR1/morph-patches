package p149l;

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
public class puq0 {

    /* JADX INFO: renamed from: a */
    private final String f151334a;

    /* JADX INFO: renamed from: b */
    private HttpURLConnection f151335b;

    /* JADX INFO: renamed from: c */
    private String f151336c;

    /* JADX INFO: renamed from: d */
    private boolean f151337d;

    /* JADX INFO: renamed from: e */
    private isq0 f151338e;

    /* JADX INFO: renamed from: f */
    private pvq0 f151339f;

    public puq0(String str, String str2, Map<String, String> map, boolean z) throws ProtocolException {
        this.f151336c = str2;
        this.f151337d = z;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f151334a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f151335b = httpURLConnection;
        diq0.m111907a(httpURLConnection);
        this.f151335b.setUseCaches(false);
        this.f151335b.setDoOutput(true);
        this.f151335b.setDoInput(true);
        this.f151335b.setRequestMethod("POST");
        this.f151335b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f151335b.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (!z) {
            this.f151338e = new isq0(this.f151335b.getOutputStream());
        } else {
            this.f151335b.setRequestProperty("Content-Encoding", HttpHeaderValues.GZIP);
            this.f151339f = new pvq0(this.f151335b.getOutputStream());
        }
    }

    /* JADX INFO: renamed from: a */
    public String m171470a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f151334a + "--\r\n").getBytes();
        if (this.f151337d) {
            this.f151339f.write(bytes);
            this.f151339f.m171692m();
            this.f151339f.m171691k();
        } else {
            this.f151338e.write(bytes);
            this.f151338e.flush();
            this.f151338e.m138087k();
        }
        int responseCode = this.f151335b.getResponseCode();
        if (responseCode != 200) {
            juq0.m143339a("Server returned non-OK status: ", responseCode);
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f151335b.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            arrayList.add(line);
        }
        bufferedReader.close();
        this.f151335b.disconnect();
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public void m171471b(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f151334a);
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
        if (this.f151337d) {
            this.f151339f.write(sb.toString().getBytes());
        } else {
            this.f151338e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                break;
            } else {
                (this.f151337d ? this.f151339f : this.f151338e).write(bArr, 0, i);
            }
        }
        fileInputStream.close();
        if (this.f151337d) {
            this.f151339f.write("\r\n".getBytes());
        } else {
            this.f151338e.write("\r\n".getBytes());
            this.f151338e.flush();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m171472c(String str, String str2) {
        m171473d(str, str2, false);
    }

    /* JADX INFO: renamed from: d */
    public void m171473d(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f151334a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.f151336c);
        sb.append("\r\n\r\n");
        try {
            if (this.f151337d) {
                this.f151339f.write(sb.toString().getBytes());
            } else {
                this.f151338e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = ptq0.m171375a(bytes);
        }
        try {
            if (this.f151337d) {
                this.f151339f.write(bytes);
                this.f151339f.write("\r\n".getBytes());
            } else {
                this.f151338e.write(bytes);
                this.f151338e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m171474e(String str, Map<String, String> map, File... fileArr) throws Throwable {
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.f151334a);
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
        if (this.f151337d) {
            this.f151339f.write(sb.toString().getBytes());
        } else {
            this.f151338e.write(sb.toString().getBytes());
        }
        luq0.m151800n(this.f151337d ? this.f151339f : this.f151338e, fileArr);
        if (this.f151337d) {
            this.f151339f.write("\r\n".getBytes());
        } else {
            this.f151338e.write("\r\n".getBytes());
            this.f151338e.flush();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m171475f(String str, File... fileArr) {
        m171474e(str, null, fileArr);
    }

    public puq0(String str, String str2, boolean z) {
        this(str, str2, null, z);
    }
}
