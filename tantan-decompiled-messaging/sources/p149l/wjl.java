package p149l;

import android.text.TextUtils;
import com.immomo.mmutil.task.C3804c;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class wjl extends tm2 {

    /* JADX INFO: renamed from: f */
    private String f186660f;

    /* JADX INFO: renamed from: g */
    private String f186661g;

    /* JADX INFO: renamed from: l.wjl$a */
    public class RunnableC20881a implements Runnable {
        public RunnableC20881a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!wjl.this.m203461r()) {
                    cmc0.m107607b("tanghttp------检测失败,返回结果不对");
                    if (wjl.this.f171129d != null) {
                        wjl.this.f171129d.mo159979b(wjl.this, "wrong data");
                        return;
                    }
                    return;
                }
                cmc0.m107607b("tanghttp------检测成功 " + wjl.this.f171126a + "[" + wjl.this.f171127b + "] ,testUrl 是 " + wjl.this.f186660f);
                if (wjl.this.f171129d != null) {
                    wjl.this.f171129d.mo159978a(wjl.this);
                }
            } catch (Exception e) {
                e.printStackTrace();
                cmc0.m107607b("tanghttp------检测失败 " + wjl.this.f171126a + "[" + wjl.this.f171127b + "] ,testUrl 是 " + wjl.this.f186660f);
                if (wjl.this.f171129d != null) {
                    wjl.this.f171129d.mo159979b(wjl.this, e.getMessage());
                }
            }
        }
    }

    public wjl(String str, String str2) {
        super(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public boolean m203461r() throws Exception {
        cmc0.m107607b("tanghttp------开始检测任务 " + this.f171126a + "[" + this.f171127b + "] ,testUrl 是 " + this.f186660f);
        URL url = new URL(this.f186660f);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(dmc0.m112455e().m112460g());
        httpURLConnection.setRequestMethod("GET");
        if (this.f186660f.startsWith("https://") && !TextUtils.isEmpty(this.f186661g) && na20.m158574e(url.getHost())) {
            cmc0.m107607b("caFilename=" + this.f186661g + "  只有ip才添加证书");
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(rll.m179813c(new InputStream[]{new BufferedInputStream(dmc0.m112455e().m112458d().getAssets().open(this.f186661g))}, null, null));
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 200 || responseCode > 299) {
            throw new Exception("HttpCheckTask request failed:response code:" + responseCode);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
        byte[] bArr = new byte[2048];
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return new JSONObject(new String(byteArrayOutputStream.toByteArray())).optBoolean("ok");
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m203462s(String str) {
        this.f186661g = str;
    }

    /* JADX INFO: renamed from: t */
    public void m203463t(String str) {
        this.f186660f = str;
        if (TextUtils.equals(this.f171127b, this.f171126a)) {
            return;
        }
        this.f186660f = this.f186660f.replaceFirst(this.f171126a, this.f171127b);
    }

    /* JADX INFO: renamed from: u */
    public void m203464u() {
        C3804c.m18444d(2, new RunnableC20881a());
    }
}
