package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tantanapp.beatles.p077v2.upload.UploadStatus;
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

/* JADX INFO: loaded from: classes11.dex */
public class q3k0 {

    /* JADX INFO: renamed from: a */
    public final rg50 f155453a;

    /* JADX INFO: renamed from: b */
    public final yul f155454b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, Integer> f155455c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public final HashSet<String> f155456d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    public volatile boolean f155457e;

    /* JADX INFO: renamed from: l.q3k0$a */
    public class RunnableC19516a implements Runnable {
        public RunnableC19516a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            x1d0.C21228a c21228a = new x1d0.C21228a();
            q3k0.this.m175135e(c21228a);
            rg50 rg50VarM118048h = du2.m118048h();
            i5d0 i5d0VarExecute = null;
            BufferedReader bufferedReader = null;
            int i = 0;
            boolean z = false;
            InputStream inputStreamByteStream = null;
            while (i <= 2 && !z) {
                try {
                    x1d0 x1d0VarM209028b = c21228a.m209043q(q3k0.m175133k()).m209032f().m209028b();
                    if (du2.m118049i() != null) {
                        x1d0VarM209028b = du2.m118049i().mo137326b(x1d0VarM209028b);
                    }
                    i5d0VarExecute = (rg50VarM118048h == null ? q3k0.this.f155453a : rg50VarM118048h).mo181341a(x1d0VarM209028b).execute();
                    if (i5d0VarExecute.m138673q() != 200 || i5d0VarExecute.m138670k() == null) {
                        i += 3;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        inputStreamByteStream = i5d0VarExecute.m138670k().byteStream();
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
                                m1m.m156698a(bufferedReader);
                                m1m.m156698a(inputStreamByteStream);
                                m1m.m156698a(i5d0VarExecute);
                                throw th;
                            }
                        }
                        q3k0.this.m175140o(sb.toString());
                        z = true;
                        bufferedReader = bufferedReader2;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                m1m.m156698a(bufferedReader);
                m1m.m156698a(inputStreamByteStream);
                m1m.m156698a(i5d0VarExecute);
            }
        }
    }

    public q3k0(yul yulVar) {
        rg50.C19837b c19837b = new rg50.C19837b();
        b1j0.m101483a(c19837b);
        this.f155453a = c19837b.m181365c();
        this.f155454b = yulVar;
    }

    /* JADX INFO: renamed from: h */
    public static String m175130h(@NonNull String str) {
        return m175134l() + "/" + str + "/attachments";
    }

    /* JADX INFO: renamed from: i */
    public static String m175131i() {
        return "https://seiya.tantanapp.com/v1/apps/" + du2.m118044d();
    }

    /* JADX INFO: renamed from: j */
    public static String m175132j() {
        return m175131i() + "/client_logs";
    }

    /* JADX INFO: renamed from: k */
    public static String m175133k() {
        return m175131i() + "/configs";
    }

    /* JADX INFO: renamed from: l */
    public static String m175134l() {
        return m175131i() + "/events";
    }

    /* JADX INFO: renamed from: e */
    public final void m175135e(x1d0.C21228a c21228a) {
        Map<String, String> header;
        yul yulVar = this.f155454b;
        if (yulVar == null || (header = yulVar.getHeader()) == null) {
            return;
        }
        for (Map.Entry<String, String> entry : header.entrySet()) {
            c21228a.m209027a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m175136f(Throwable th, x1d0.C21228a c21228a) {
        String message = th.getMessage();
        if (!TextUtils.isEmpty(message) && message.length() > 100) {
            message = message.substring(0, 100);
        }
        if (th instanceof StreamResetException) {
            c21228a.m209034h("exception", "StreamResetException:" + message);
        } else {
            c21228a.m209034h("exception", th.getClass().getName() + ":" + message);
        }
    }

    /* JADX INFO: renamed from: g */
    public final UploadStatus m175137g(x1d0.C21228a c21228a, String str, z1d0 z1d0Var) {
        UploadStatus uploadStatus;
        UploadStatus uploadStatus2 = UploadStatus.FAILED;
        int i = 0;
        while (i <= 2 && uploadStatus2 != (uploadStatus = UploadStatus.SUCCESS)) {
            try {
                rg50 rg50VarM118048h = du2.m118048h();
                x1d0 x1d0VarM209028b = c21228a.m209043q(str).m209038l(z1d0Var).m209028b();
                if (du2.m118049i() != null) {
                    x1d0VarM209028b = du2.m118049i().mo137326b(x1d0VarM209028b);
                }
                if (rg50VarM118048h == null) {
                    rg50VarM118048h = this.f155453a;
                }
                i5d0 i5d0VarExecute = rg50VarM118048h.mo181341a(x1d0VarM209028b).execute();
                int iM138673q = i5d0VarExecute.m138673q();
                if (iM138673q < 200 || iM138673q >= 300) {
                    uploadStatus = (iM138673q / 100 < 3 || iM138673q / 100 > 5) ? UploadStatus.FAILED : UploadStatus.DISCARD;
                    i += 3;
                }
                m1m.m156698a(i5d0VarExecute);
                uploadStatus2 = uploadStatus;
            } catch (Throwable th) {
                try {
                    if (m175141p(th)) {
                        uploadStatus2 = UploadStatus.DISCARD;
                        i += 3;
                    } else {
                        m175136f(th, c21228a);
                        i++;
                    }
                    du2.m118062v("[beatles]", "[upload] upload exception:" + th.getClass().getName() + " message:" + th.getMessage());
                    m1m.m156698a(null);
                } catch (Throwable th2) {
                    m1m.m156698a(null);
                    throw th2;
                }
            }
        }
        return uploadStatus2;
    }

    /* JADX INFO: renamed from: m */
    public void m175138m() {
        if (this.f155457e) {
            return;
        }
        u21.m194238b(new RunnableC19516a());
    }

    /* JADX INFO: renamed from: n */
    public void m175139n(@NonNull String str) {
        this.f155456d.add(str);
    }

    /* JADX INFO: renamed from: o */
    public final void m175140o(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        for (String str2 : this.f155456d) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2 != null) {
                int iOptInt = jSONObject2.optInt("upload_rate", 100);
                this.f155455c.put(str2, Integer.valueOf(iOptInt));
                f610.m124264b("saveConfig success! type:" + str2 + " rate:" + iOptInt, new Object[0]);
            }
        }
        this.f155457e = true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m175141p(Throwable th) {
        if (!(th instanceof ConnectException)) {
            return false;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) && message.contains("127.0.0.1");
    }

    /* JADX INFO: renamed from: q */
    public boolean m175142q(String str) {
        Integer num = 100;
        if (this.f155457e) {
            Integer num2 = this.f155455c.get(str);
            if (num2 == null) {
                this.f155455c.put(str, num);
            } else {
                num = num2;
            }
        }
        boolean z = true;
        try {
            if (num.intValue() == 0) {
                du2.m118062v("[beatles]", "[upload] shouldReport type:" + str + "rate is 0,will not report!");
                return false;
            }
            if (new Random().nextInt(100) >= num.intValue()) {
                z = false;
            }
            if (!z) {
                du2.m118062v("[beatles]", "[upload] type:" + str + " needReport:" + z);
            }
            return z;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public UploadStatus m175143r(m4f m4fVar) {
        ku10.C18260a c18260aM151432f = new ku10.C18260a().m151432f(ku10.f128786j);
        c18260aM151432f.m151427a("meta", m4fVar.m157004b());
        c18260aM151432f.m151427a("json_data", m4fVar.m157003a());
        String strM157005c = m4fVar.m157005c();
        if (!TextUtils.isEmpty(strM157005c)) {
            c18260aM151432f.m151427a("xcrash_data", strM157005c);
        }
        x1d0.C21228a c21228a = new x1d0.C21228a();
        if (TextUtils.isEmpty(m4fVar.m157003a())) {
            String userId = du2.m118056p().m110248d().getUserInfo().getUserId();
            if (!TextUtils.isEmpty(userId)) {
                c21228a.m209027a("user_id", userId);
            }
        }
        m175135e(c21228a);
        return m175137g(c21228a, m175134l(), c18260aM151432f.m151431e());
    }

    /* JADX INFO: renamed from: s */
    public UploadStatus m175144s(u31 u31Var) {
        ku10.C18260a c18260aM151432f = new ku10.C18260a().m151432f(ku10.f128786j);
        c18260aM151432f.m151427a("meta", u31Var.m194321c());
        File file = new File(u31Var.m194320b());
        c18260aM151432f.m151428b("attachment", file.getName(), z1d0.create(e7y.m119773d("application/zip"), file));
        x1d0.C21228a c21228a = new x1d0.C21228a();
        m175135e(c21228a);
        return m175137g(c21228a, m175130h(u31Var.m194319a()), c18260aM151432f.m151431e());
    }

    /* JADX INFO: renamed from: t */
    public UploadStatus m175145t(tyv tyvVar) {
        ku10.C18260a c18260aM151432f = new ku10.C18260a().m151432f(ku10.f128786j);
        c18260aM151432f.m151427a("meta", tyvVar.m193623b());
        File file = new File(tyvVar.m193622a());
        c18260aM151432f.m151428b("attachment", file.getName(), z1d0.create(e7y.m119773d("application/zip"), file));
        x1d0.C21228a c21228a = new x1d0.C21228a();
        m175135e(c21228a);
        return m175137g(c21228a, m175132j(), c18260aM151432f.m151431e());
    }
}
