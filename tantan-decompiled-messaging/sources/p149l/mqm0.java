package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mqm0 {

    /* JADX INFO: renamed from: e */
    public static mqm0 f135272e;

    /* JADX INFO: renamed from: a */
    public List<String> f135273a;

    /* JADX INFO: renamed from: b */
    public List<String> f135274b;

    /* JADX INFO: renamed from: c */
    public C18537b f135275c = null;

    /* JADX INFO: renamed from: d */
    public Runnable f135276d = new RunnableC18536a();

    /* JADX INFO: renamed from: l.mqm0$a */
    public class RunnableC18536a implements Runnable {
        public RunnableC18536a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mqm0 mqm0Var;
            C18537b c18537b;
            C18537b c18537b2 = mqm0.this.f135275c;
            if (c18537b2 != null) {
                synchronized (c18537b2) {
                    mqm0Var = mqm0.this;
                    c18537b = mqm0Var.f135275c;
                    mqm0Var.f135275c = null;
                }
                mqm0Var.m155974i(c18537b);
            }
        }
    }

    /* JADX INFO: renamed from: l.mqm0$b */
    public static class C18537b {

        /* JADX INFO: renamed from: a */
        public ArrayList<String> f135278a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f135279b = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        public void m155977a(String str) {
            if (this.f135278a.size() < 1000) {
                this.f135278a.add(str);
                return;
            }
            this.f135279b.add(str);
            if (this.f135279b.size() >= 1000) {
                this.f135279b.remove(0);
            }
        }
    }

    public mqm0() {
        this.f135273a = null;
        this.f135274b = null;
        this.f135273a = new ArrayList();
        this.f135274b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m155962a(C18537b c18537b) {
        if (c18537b != null) {
            StringBuilder sb = new StringBuilder("一次语音通话日志\nbegin log =============================\n");
            if (!vwb.m200296J(c18537b.f135278a)) {
                c18537b.f135278a.size();
                Iterator<String> it = c18537b.f135278a.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            sb.append("ebd log =============================\n");
            if (!vwb.m200296J(c18537b.f135279b)) {
                c18537b.f135279b.size();
                Iterator<String> it2 = c18537b.f135279b.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            du2.m113670a("voice_call", sb.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m155964g(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i != 3) {
            return;
        }
        zvf0.m220369B("e_voice_call_finished", "", j760.m140076a("other_user_id", str), j760.m140076a("channel", str2));
    }

    /* JADX INFO: renamed from: h */
    public static mqm0 m155965h() {
        if (f135272e == null) {
            synchronized (mqm0.class) {
                try {
                    if (f135272e == null) {
                        f135272e = new mqm0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f135272e;
    }

    /* JADX INFO: renamed from: j */
    public static void m155966j(String str) {
        zvf0.m220369B("e_voice_call_requested", "", j760.m140076a("other_user_id", str));
    }

    /* JADX INFO: renamed from: k */
    public static void m155967k(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        zvf0.m220399u("e_voice_call_click_finish", OMSDialogPositon.p_chat_view, j760.m140076a("other_user_id", str), j760.m140076a("channel", str2));
    }

    /* JADX INFO: renamed from: l */
    public static void m155968l() {
        String strM190141m = tqm0.m190131p().m190141m();
        String strM190138j = tqm0.m190131p().m190138j();
        if (TextUtils.isEmpty(strM190141m) || TextUtils.isEmpty(strM190138j)) {
            return;
        }
        zvf0.m220369B("e_voice_call_no_audio", "", j760.m140076a("other_user_id", strM190141m), j760.m140076a("channel", strM190138j));
    }

    /* JADX INFO: renamed from: n */
    public static void m155969n(String str, String str2, int i, int i2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i2 != 3) {
            return;
        }
        if (i == 1 || i == 2) {
            zvf0.m220369B("e_voice_call_connected", "", j760.m140076a("other_user_id", str), j760.m140076a("channel", str2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m155970c(String str, String str2) {
        try {
            if (this.f135275c == null) {
                this.f135275c = new C18537b();
            }
            this.f135275c.m155977a(mqi0.f135254f.format(new Date(mqi0.m155944o())) + " detail:[" + mqi0.m155944o() + "]【" + str + "】:" + str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m155971d(String str, String str2) {
        m155970c("PushEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: e */
    public void m155972e(String str, String str2) {
        m155970c("UserEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: f */
    public void m155973f(String str, String str2) {
        m155970c("RtcEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: i */
    public final void m155974i(final C18537b c18537b) {
        e51.m114774y(new Runnable() { // from class: l.lqm0
            @Override // java.lang.Runnable
            public final void run() {
                mqm0.m155962a(c18537b);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m155975m() {
        e51.m114745J(this.f135276d);
        e51.m114743H(CoreModule.f17544b, this.f135276d, 1000L);
    }

    /* JADX INFO: renamed from: o */
    public void m155976o(String str) {
        m155972e("Click entry from", str);
    }
}
