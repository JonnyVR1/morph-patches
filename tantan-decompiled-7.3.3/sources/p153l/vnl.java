package p153l;

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

/* JADX INFO: loaded from: classes11.dex */
public class vnl implements msl {

    /* JADX INFO: renamed from: a */
    public u6e f184891a;

    /* JADX INFO: renamed from: b */
    public xul f184892b;

    /* JADX INFO: renamed from: l.vnl$a */
    public class C20869a implements HostnameVerifier {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpsURLConnection f184893a;

        public C20869a(HttpsURLConnection httpsURLConnection) {
            this.f184893a = httpsURLConnection;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            String requestProperty = this.f184893a.getRequestProperty("host");
            if (requestProperty == null) {
                requestProperty = this.f184893a.getURL().getHost();
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(requestProperty, sSLSession);
        }
    }

    public vnl(u6e u6eVar, xul xulVar) {
        this.f184891a = u6eVar;
        this.f184892b = xulVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0017 A[SYNTHETIC] */
    @Override // p153l.msl
    /* JADX INFO: renamed from: a */
    public void mo159837a(HashSet<String> hashSet, boolean z) throws Throwable {
        if (kyb.m151952a(hashSet)) {
            return;
        }
        Collections.shuffle(Arrays.asList(tv5.f176242a));
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
                    sb.append(vml.f184733g);
                    if (z) {
                        sb.append("&health=true");
                    }
                    String string = sb.toString();
                    URL url = new URL(string);
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(string.replaceFirst(url.getHost(), tv5.f176242a[0])).openConnection();
                    try {
                        HashMap<String, String> header = this.f184892b.getHeader();
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
                        httpsURLConnection2.setHostnameVerifier(new C20869a(httpsURLConnection2));
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
                                                r6e.m180005a(e.getMessage() + " exception retry!!!");
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
                                        r6e.m180005a(e.getMessage() + " exception retry!!!");
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
                                    dataModel.meta = c6c.m108126c(sb2.toString());
                                    r6e.m180005a("HttpUrlNetWorkRequest httpdns url:" + url + " request success! result:" + sb2.toString());
                                    MetaModel metaModel = dataModel.meta;
                                    if (metaModel != null && !v900.m200369a(metaModel.retcode)) {
                                        if (vml.m201753c().m201756b()) {
                                            this.f184891a.m194678g();
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
                                    ArrayList<DomainModel> arrayListM108124a = c6c.m108124a(sb2.toString());
                                    dataModel.domainModels = arrayListM108124a;
                                    if (arrayListM108124a != null) {
                                        this.f184891a.m194681j(arrayListM108124a);
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
                            r6e.m180005a("request fail code:" + responseCode + " retry:" + i);
                        } else {
                            i += 3;
                            r6e.m180005a("request fail,code: " + responseCode + " ,will not retry!");
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
