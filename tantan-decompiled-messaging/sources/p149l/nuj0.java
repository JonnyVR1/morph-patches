package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.p072v2.upload.UploadStatus;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import okhttp3.internal.http2.StreamResetException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class nuj0 {

    /* JADX INFO: renamed from: a */
    public final k850 f140631a;

    /* JADX INFO: renamed from: b */
    public final lsl f140632b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, Integer> f140633c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final HashSet<String> f140634d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    public volatile boolean f140635e;

    /* JADX INFO: renamed from: l.nuj0$a */
    public class RunnableC18776a implements Runnable {
        public RunnableC18776a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            stc0.C20027a c20027a = new stc0.C20027a();
            nuj0.this.m161496e(c20027a);
            k850 k850VarM160817h = nt2.m160817h();
            exc0 exc0VarExecute = null;
            BufferedReader bufferedReader = null;
            int i = 0;
            boolean z = false;
            InputStream inputStreamByteStream = null;
            while (i <= 2 && !z) {
                try {
                    stc0 stc0VarM185883b = c20027a.m185898q(nuj0.m161494k()).m185887f().m185883b();
                    if (nt2.m160818i() != null) {
                        stc0VarM185883b = nt2.m160818i().mo98940b(stc0VarM185883b);
                    }
                    exc0VarExecute = (k850VarM160817h == null ? nuj0.this.f140631a : k850VarM160817h).mo144849a(stc0VarM185883b).execute();
                    if (exc0VarExecute.m118609q() != 200 || exc0VarExecute.m118606k() == null) {
                        i += 3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        inputStreamByteStream = exc0VarExecute.m118606k().byteStream();
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamByteStream));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    sb.append(line);
                                }
                            } catch (Exception unused) {
                                bufferedReader = bufferedReader2;
                                i++;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                ryl.m181666a(bufferedReader);
                                ryl.m181666a(inputStreamByteStream);
                                ryl.m181666a(exc0VarExecute);
                                throw th;
                            }
                        }
                        nuj0.this.m161501o(sb.toString());
                        z = true;
                        bufferedReader = bufferedReader2;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                ryl.m181666a(bufferedReader);
                ryl.m181666a(inputStreamByteStream);
                ryl.m181666a(exc0VarExecute);
            }
        }
    }

    public nuj0(lsl lslVar) {
        k850.C17954b c17954b = new k850.C17954b();
        yri0.m215838a(c17954b);
        this.f140631a = c17954b.m144882c();
        this.f140632b = lslVar;
    }

    /* JADX INFO: renamed from: h */
    public static String m161491h(@NonNull String str) {
        return m161495l() + "/" + str + "/attachments";
    }

    /* JADX INFO: renamed from: i */
    public static String m161492i() {
        return "https://seiya.tantanapp.com/v1/apps/" + nt2.m160813d();
    }

    /* JADX INFO: renamed from: j */
    public static String m161493j() {
        return m161492i() + "/client_logs";
    }

    /* JADX INFO: renamed from: k */
    public static String m161494k() {
        return m161492i() + "/configs";
    }

    /* JADX INFO: renamed from: l */
    public static String m161495l() {
        return m161492i() + "/events";
    }

    /* JADX INFO: renamed from: e */
    public final void m161496e(stc0.C20027a c20027a) {
        Map<String, String> header;
        lsl lslVar = this.f140632b;
        if (lslVar == null || (header = lslVar.getHeader()) == null) {
            return;
        }
        for (Map.Entry<String, String> entry : header.entrySet()) {
            c20027a.m185882a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m161497f(Throwable th, stc0.C20027a c20027a) {
        String message = th.getMessage();
        if (!TextUtils.isEmpty(message) && message.length() > 100) {
            message = message.substring(0, 100);
        }
        if (th instanceof StreamResetException) {
            c20027a.m185889h("exception", "StreamResetException:" + message);
        } else {
            c20027a.m185889h("exception", th.getClass().getName() + ":" + message);
        }
    }

    /* JADX INFO: renamed from: g */
    public final UploadStatus m161498g(stc0.C20027a c20027a, String str, utc0 utc0Var) {
        UploadStatus uploadStatus;
        UploadStatus uploadStatus2 = UploadStatus.FAILED;
        int i = 0;
        while (i <= 2 && uploadStatus2 != (uploadStatus = UploadStatus.SUCCESS)) {
            try {
                k850 k850VarM160817h = nt2.m160817h();
                stc0 stc0VarM185883b = c20027a.m185898q(str).m185893l(utc0Var).m185883b();
                if (nt2.m160818i() != null) {
                    stc0VarM185883b = nt2.m160818i().mo98940b(stc0VarM185883b);
                }
                if (k850VarM160817h == null) {
                    k850VarM160817h = this.f140631a;
                }
                exc0 exc0VarExecute = k850VarM160817h.mo144849a(stc0VarM185883b).execute();
                int iM118609q = exc0VarExecute.m118609q();
                if (iM118609q < 200 || iM118609q >= 300) {
                    uploadStatus = (iM118609q / 100 < 3 || iM118609q / 100 > 5) ? UploadStatus.FAILED : UploadStatus.DISCARD;
                    i += 3;
                }
                ryl.m181666a(exc0VarExecute);
                uploadStatus2 = uploadStatus;
            } catch (Throwable th) {
                try {
                    if (m161502p(th)) {
                        uploadStatus2 = UploadStatus.DISCARD;
                        i += 3;
                    } else {
                        m161497f(th, c20027a);
                        i++;
                    }
                    nt2.m160831v("[beatles]", "[upload] upload exception:" + th.getClass().getName() + " message:" + th.getMessage());
                    ryl.m181666a(null);
                } catch (Throwable th2) {
                    ryl.m181666a(null);
                    throw th2;
                }
            }
        }
        return uploadStatus2;
    }

    /* JADX INFO: renamed from: m */
    public void m161499m() {
        if (this.f140635e) {
            return;
        }
        n21.m157541b(new RunnableC18776a());
    }

    /* JADX INFO: renamed from: n */
    public void m161500n(@NonNull String str) {
        this.f140634d.add(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m161501o(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        for (String str2 : this.f140634d) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2 != null) {
                int iOptInt = jSONObject2.optInt("upload_rate", 100);
                this.f140633c.put(str2, Integer.valueOf(iOptInt));
                vx00.m200472b("saveConfig success! type:" + str2 + " rate:" + iOptInt, new Object[0]);
            }
        }
        this.f140635e = true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m161502p(Throwable th) {
        if (!(th instanceof ConnectException)) {
            return false;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) && message.contains("127.0.0.1");
    }

    /* JADX INFO: renamed from: q */
    public boolean m161503q(String str) {
        Integer num = 100;
        if (this.f140635e) {
            Integer num2 = this.f140633c.get(str);
            if (num2 == null) {
                this.f140633c.put(str, num);
            } else {
                num = num2;
            }
        }
        boolean z = true;
        try {
            if (num.intValue() == 0) {
                nt2.m160831v("[beatles]", "[upload] shouldReport type:" + str + "rate is 0,will not report!");
                return false;
            }
            if (new Random().nextInt(100) >= num.intValue()) {
                z = false;
            }
            if (!z) {
                nt2.m160831v("[beatles]", "[upload] type:" + str + " needReport:" + z);
            }
            return z;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public UploadStatus m161504r(h3f h3fVar) {
        cm10.C16191a c16191aM107600f = new cm10.C16191a().m107600f(cm10.f81492j);
        c16191aM107600f.m107595a("meta", h3fVar.m129166b());
        c16191aM107600f.m107595a("json_data", h3fVar.m129165a());
        String strM129167c = h3fVar.m129167c();
        if (!TextUtils.isEmpty(strM129167c)) {
            c16191aM107600f.m107595a("xcrash_data", strM129167c);
        }
        stc0.C20027a c20027a = new stc0.C20027a();
        if (TextUtils.isEmpty(h3fVar.m129165a())) {
            String userId = nt2.m160825p().m202313d().getUserInfo().getUserId();
            if (!TextUtils.isEmpty(userId)) {
                c20027a.m185882a("user_id", userId);
            }
        }
        m161496e(c20027a);
        return m161498g(c20027a, m161495l(), c16191aM107600f.m107599e());
    }

    /* JADX INFO: renamed from: s */
    public UploadStatus m161505s(n31 n31Var) {
        cm10.C16191a c16191aM107600f = new cm10.C16191a().m107600f(cm10.f81492j);
        c16191aM107600f.m107595a("meta", n31Var.m157688c());
        File file = new File(n31Var.m157687b());
        c16191aM107600f.m107596b("attachment", file.getName(), utc0.create(hyx.m133628d("application/zip"), file));
        stc0.C20027a c20027a = new stc0.C20027a();
        m161496e(c20027a);
        return m161498g(c20027a, m161491h(n31Var.m157686a()), c16191aM107600f.m107599e());
    }

    /* JADX INFO: renamed from: t */
    public UploadStatus m161506t(twv twvVar) {
        cm10.C16191a c16191aM107600f = new cm10.C16191a().m107600f(cm10.f81492j);
        c16191aM107600f.m107595a("meta", twvVar.m190908b());
        File file = new File(twvVar.m190907a());
        c16191aM107600f.m107596b("attachment", file.getName(), utc0.create(hyx.m133628d("application/zip"), file));
        stc0.C20027a c20027a = new stc0.C20027a();
        m161496e(c20027a);
        return m161498g(c20027a, m161493j(), c16191aM107600f.m107599e());
    }
}
