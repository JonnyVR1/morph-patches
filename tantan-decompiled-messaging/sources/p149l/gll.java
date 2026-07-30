package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.httpdns.model.DataModel;
import com.tantanapp.httpdns.model.DomainModel;
import com.tantanapp.httpdns.model.MetaModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes13.dex */
public class gll implements zpl {

    /* JADX INFO: renamed from: a */
    public g5e f103336a;

    /* JADX INFO: renamed from: b */
    public ksl f103337b;

    /* JADX INFO: renamed from: l.gll$a */
    public class C17107a implements HostnameVerifier {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpsURLConnection f103338a;

        public C17107a(HttpsURLConnection httpsURLConnection) {
            this.f103338a = httpsURLConnection;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            String requestProperty = this.f103338a.getRequestProperty("host");
            if (requestProperty == null) {
                requestProperty = this.f103338a.getURL().getHost();
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(requestProperty, sSLSession);
        }
    }

    public gll(g5e g5eVar, ksl kslVar) {
        this.f103336a = g5eVar;
        this.f103337b = kslVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0017 A[SYNTHETIC] */
    @Override // p149l.zpl
    /* JADX INFO: renamed from: a */
    public void mo126772a(HashSet<String> hashSet, boolean z) throws Throwable {
        if (wwb.m205852a(hashSet)) {
            return;
        }
        Collections.shuffle(Arrays.asList(pu5.f151244a));
        InputStream inputStream = null;
        int i = 0;
        boolean z2 = false;
        BufferedReader bufferedReader = null;
        HttpsURLConnection httpsURLConnection = null;
        while (i <= 2 && !z2) {
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://tm.tantanapp.com/v2/tantantm/httpdns");
                    sb.append("?domains=");
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append("&app_id=");
                    sb.append(hkl.f108248g);
                    if (z) {
                        sb.append("&health=true");
                    }
                    String string = sb.toString();
                    URL url = new URL(string);
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(string.replaceFirst(url.getHost(), pu5.f151244a[0])).openConnection();
                    try {
                        HashMap<String, String> header = this.f103337b.getHeader();
                        if (header != null) {
                            for (Map.Entry<String, String> entry : header.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                                    httpsURLConnection2.setRequestProperty(key, value);
                                }
                            }
                        }
                        httpsURLConnection2.setRequestProperty("host", url.getHost());
                        httpsURLConnection2.setHostnameVerifier(new C17107a(httpsURLConnection2));
                        httpsURLConnection2.setConnectTimeout(5000);
                        httpsURLConnection2.setReadTimeout(10000);
                        httpsURLConnection2.setRequestMethod("GET");
                        httpsURLConnection2.connect();
                        int responseCode = httpsURLConnection2.getResponseCode();
                        if (responseCode == 200) {
                            inputStream = httpsURLConnection2.getInputStream();
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                            try {
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader2.readLine();
                                        if (line != null) {
                                            sb2.append(line);
                                        } else {
                                            try {
                                                break;
                                            } catch (IOException e) {
                                                e = e;
                                                bufferedReader = bufferedReader2;
                                                httpsURLConnection = httpsURLConnection2;
                                                z2 = true;
                                                d5e.m110050a(e.getMessage() + " exception retry!!!");
                                                i++;
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException unused) {
                                                    }
                                                }
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                }
                                                if (httpsURLConnection != null) {
                                                    httpsURLConnection.disconnect();
                                                }
                                            }
                                        }
                                        d5e.m110050a(e.getMessage() + " exception retry!!!");
                                        i++;
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (httpsURLConnection != null) {
                                            httpsURLConnection.disconnect();
                                        }
                                    }
                                    DataModel dataModel = new DataModel();
                                    dataModel.meta = u4c.m191724c(sb2.toString());
                                    d5e.m110050a("HttpUrlNetWorkRequest httpdns url:" + url + " request success! result:" + sb2.toString());
                                    MetaModel metaModel = dataModel.meta;
                                    if (metaModel != null && !y000.m212026a(metaModel.retcode)) {
                                        if (hkl.m131567c().m131570b()) {
                                            this.f103336a.m124490g();
                                        }
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused3) {
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused4) {
                                            }
                                        }
                                        httpsURLConnection2.disconnect();
                                        return;
                                    }
                                    ArrayList<DomainModel> arrayListM191722a = u4c.m191722a(sb2.toString());
                                    dataModel.domainModels = arrayListM191722a;
                                    if (arrayListM191722a != null) {
                                        this.f103336a.m124493j(arrayListM191722a);
                                    }
                                    bufferedReader = bufferedReader2;
                                    z2 = true;
                                } catch (IOException e2) {
                                    e = e2;
                                    bufferedReader = bufferedReader2;
                                    httpsURLConnection = httpsURLConnection2;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                httpsURLConnection = httpsURLConnection2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                if (httpsURLConnection == null) {
                                    throw th;
                                }
                                httpsURLConnection.disconnect();
                                throw th;
                            }
                        } else if (responseCode == 500 || responseCode == 503) {
                            i++;
                            d5e.m110050a("request fail code:" + responseCode + " retry:" + i);
                        } else {
                            i += 3;
                            d5e.m110050a("request fail,code: " + responseCode + " ,will not retry!");
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        httpsURLConnection2.disconnect();
                        httpsURLConnection = httpsURLConnection2;
                    } catch (IOException e3) {
                        e = e3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e4) {
                e = e4;
            }
        }
    }
}
