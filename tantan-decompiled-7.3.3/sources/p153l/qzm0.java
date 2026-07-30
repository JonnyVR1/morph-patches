package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class qzm0 {

    /* JADX INFO: renamed from: e */
    public static qzm0 f160275e;

    /* JADX INFO: renamed from: a */
    public List<String> f160276a;

    /* JADX INFO: renamed from: b */
    public List<String> f160277b;

    /* JADX INFO: renamed from: c */
    public C19699b f160278c = null;

    /* JADX INFO: renamed from: d */
    public Runnable f160279d = new RunnableC19698a();

    /* JADX INFO: renamed from: l.qzm0$a */
    public class RunnableC19698a implements Runnable {
        public RunnableC19698a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qzm0 qzm0Var;
            C19699b c19699b;
            C19699b c19699b2 = qzm0.this.f160278c;
            if (c19699b2 != null) {
                synchronized (c19699b2) {
                    qzm0Var = qzm0.this;
                    c19699b = qzm0Var.f160278c;
                    qzm0Var.f160278c = null;
                }
                qzm0Var.m178821i(c19699b);
            }
        }
    }

    /* JADX INFO: renamed from: l.qzm0$b */
    public static class C19699b {

        /* JADX INFO: renamed from: a */
        public ArrayList<String> f160281a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public ArrayList<String> f160282b = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        public void m178824a(String str) {
            if (this.f160281a.size() < 1000) {
                this.f160281a.add(str);
                return;
            }
            this.f160282b.add(str);
            if (this.f160282b.size() >= 1000) {
                this.f160282b.remove(0);
            }
        }
    }

    public qzm0() {
        this.f160276a = null;
        this.f160277b = null;
        this.f160276a = new ArrayList();
        this.f160277b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m178809a(C19699b c19699b) {
        if (c19699b != null) {
            StringBuilder sb = new StringBuilder("一次语音通话日志\nbegin log =============================\n");
            if (!jyb.m147479J(c19699b.f160281a)) {
                c19699b.f160281a.size();
                Iterator<String> it = c19699b.f160281a.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            sb.append("ebd log =============================\n");
            if (!jyb.m147479J(c19699b.f160282b)) {
                c19699b.f160282b.size();
                Iterator<String> it2 = c19699b.f160282b.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    sb.append(SignParameters.NEW_LINE);
                }
            }
            tu2.m192703a("voice_call", sb.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m178811g(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i != 3) {
            return;
        }
        i4g0.m138493B("e_voice_call_finished", "", pf60.m172085a("other_user_id", str), pf60.m172085a("channel", str2));
    }

    /* JADX INFO: renamed from: h */
    public static qzm0 m178812h() {
        if (f160275e == null) {
            synchronized (qzm0.class) {
                try {
                    if (f160275e == null) {
                        f160275e = new qzm0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f160275e;
    }

    /* JADX INFO: renamed from: j */
    public static void m178813j(String str) {
        i4g0.m138493B("e_voice_call_requested", "", pf60.m172085a("other_user_id", str));
    }

    /* JADX INFO: renamed from: k */
    public static void m178814k(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        i4g0.m138523u("e_voice_call_click_finish", OMSDialogPositon.p_chat_view, pf60.m172085a("other_user_id", str), pf60.m172085a("channel", str2));
    }

    /* JADX INFO: renamed from: l */
    public static void m178815l() {
        String strM213770m = xzm0.m213760p().m213770m();
        String strM213767j = xzm0.m213760p().m213767j();
        if (TextUtils.isEmpty(strM213770m) || TextUtils.isEmpty(strM213767j)) {
            return;
        }
        i4g0.m138493B("e_voice_call_no_audio", "", pf60.m172085a("other_user_id", strM213770m), pf60.m172085a("channel", strM213767j));
    }

    /* JADX INFO: renamed from: n */
    public static void m178816n(String str, String str2, int i, int i2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i2 != 3) {
            return;
        }
        if (i == 1 || i == 2) {
            i4g0.m138493B("e_voice_call_connected", "", pf60.m172085a("other_user_id", str), pf60.m172085a("channel", str2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m178817c(String str, String str2) {
        try {
            if (this.f160278c == null) {
                this.f160278c = new C19699b();
            }
            this.f160278c.m178824a(pzi0.f154859f.format(new Date(pzi0.m174454o())) + " detail:[" + pzi0.m174454o() + "]【" + str + "】:" + str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m178818d(String str, String str2) {
        m178817c("PushEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: e */
    public void m178819e(String str, String str2) {
        m178817c("UserEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: f */
    public void m178820f(String str, String str2) {
        m178817c("RtcEvent", str + ":" + str2);
    }

    /* JADX INFO: renamed from: i */
    public final void m178821i(final C19699b c19699b) {
        l51.m152919y(new Runnable() { // from class: l.pzm0
            @Override // java.lang.Runnable
            public final void run() {
                qzm0.m178809a(c19699b);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m178822m() {
        l51.m152890J(this.f160279d);
        l51.m152888H(CoreModule.f18263b, this.f160279d, 1000L);
    }

    /* JADX INFO: renamed from: o */
    public void m178823o(String str) {
        m178819e("Click entry from", str);
    }
}
