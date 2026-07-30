package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class d36 {

    /* JADX INFO: renamed from: d */
    public static volatile d36 f10906d;

    /* JADX INFO: renamed from: a */
    public a<String> f10907a = a.b();

    /* JADX INFO: renamed from: b */
    public List<String> f10908b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f10909c;

    /* JADX INFO: renamed from: c */
    public static d36 m12990c() {
        if (f10906d == null) {
            synchronized (d36.class) {
                try {
                    if (f10906d == null) {
                        f10906d = new d36();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10906d;
    }

    /* JADX INFO: renamed from: a */
    public void m12991a() {
        this.f10908b.clear();
    }

    /* JADX INFO: renamed from: b */
    public List<String> m12992b() {
        return this.f10908b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m12993d(String str) {
        int iIndexOf;
        List<String> list = this.f10908b;
        return list != null && list.contains(str) && (iIndexOf = this.f10908b.indexOf(str) + 1) > 0 && iIndexOf <= this.f10908b.size() - 1;
    }

    /* JADX INFO: renamed from: e */
    public boolean m12994e() {
        if (mqi0.m18550o() - ((Long) CoreModule.c.e0.y3.get()).longValue() <= 172800000) {
            return mqi0.m18550o() < ((Long) CoreModule.c.e0.x3.get()).longValue();
        }
        m12995f();
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m12995f() {
        CoreModule.c.e0.x3.clear();
        CoreModule.c.e0.w3.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m12996g() {
        CoreModule.c.e0.y3.put(Long.valueOf(mqi0.m18550o()));
        int iIntValue = ((Integer) CoreModule.c.e0.w3.get()).intValue() + 1;
        CoreModule.c.e0.w3.put(Integer.valueOf(iIntValue));
        if (iIntValue == 5) {
            CoreModule.c.e0.x3.put(Long.valueOf(mqi0.m18550o() + 172800000));
        } else if (iIntValue == 3) {
            CoreModule.c.e0.x3.put(Long.valueOf(mqi0.m18550o() + 86400000));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m12997h(String str) {
        List<String> list = this.f10908b;
        if (list == null) {
            return;
        }
        list.remove(str);
    }

    /* JADX INFO: renamed from: i */
    public void m12998i(Conversation conversation) {
        if (conversation == null || this.f10909c) {
            return;
        }
        this.f10909c = true;
        CrashHelper.c(new Exception("conversation.id is null, " + conversation.toJson()));
    }

    /* JADX INFO: renamed from: j */
    public void m12999j(List<String> list) {
        this.f10908b = list;
    }
}
