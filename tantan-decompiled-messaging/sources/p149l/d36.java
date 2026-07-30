package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class d36 {

    /* JADX INFO: renamed from: d */
    public static volatile d36 f83462d;

    /* JADX INFO: renamed from: a */
    public C22392a<String> f83463a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public List<String> f83464b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f83465c;

    /* JADX INFO: renamed from: c */
    public static d36 m109868c() {
        if (f83462d == null) {
            synchronized (d36.class) {
                try {
                    if (f83462d == null) {
                        f83462d = new d36();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f83462d;
    }

    /* JADX INFO: renamed from: a */
    public void m109869a() {
        this.f83464b.clear();
    }

    /* JADX INFO: renamed from: b */
    public List<String> m109870b() {
        return this.f83464b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m109871d(String str) {
        int iIndexOf;
        List<String> list = this.f83464b;
        return list != null && list.contains(str) && (iIndexOf = this.f83464b.indexOf(str) + 1) > 0 && iIndexOf <= this.f83464b.size() - 1;
    }

    /* JADX INFO: renamed from: e */
    public boolean m109872e() {
        if (mqi0.m155944o() - CoreModule.f17545c.f19639e0.f149510y3.get().longValue() <= 172800000) {
            return mqi0.m155944o() < CoreModule.f17545c.f19639e0.f149503x3.get().longValue();
        }
        m109873f();
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m109873f() {
        CoreModule.f17545c.f19639e0.f149503x3.clear();
        CoreModule.f17545c.f19639e0.f149496w3.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m109874g() {
        CoreModule.f17545c.f19639e0.f149510y3.put(Long.valueOf(mqi0.m155944o()));
        int iIntValue = CoreModule.f17545c.f19639e0.f149496w3.get().intValue() + 1;
        CoreModule.f17545c.f19639e0.f149496w3.put(Integer.valueOf(iIntValue));
        if (iIntValue == 5) {
            CoreModule.f17545c.f19639e0.f149503x3.put(Long.valueOf(mqi0.m155944o() + 172800000));
        } else if (iIntValue == 3) {
            CoreModule.f17545c.f19639e0.f149503x3.put(Long.valueOf(mqi0.m155944o() + 86400000));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m109875h(String str) {
        List<String> list = this.f83464b;
        if (list == null) {
            return;
        }
        list.remove(str);
    }

    /* JADX INFO: renamed from: i */
    public void m109876i(Conversation conversation) {
        if (conversation == null || this.f83465c) {
            return;
        }
        this.f83465c = true;
        CrashHelper.m81296c(new Exception("conversation.id is null, " + conversation.toJson()));
    }

    /* JADX INFO: renamed from: j */
    public void m109877j(List<String> list) {
        this.f83464b = list;
    }
}
