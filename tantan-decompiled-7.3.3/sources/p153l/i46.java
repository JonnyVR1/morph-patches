package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class i46 {

    /* JADX INFO: renamed from: d */
    public static volatile i46 f112833d;

    /* JADX INFO: renamed from: a */
    public C22507a<String> f112834a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public List<String> f112835b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f112836c;

    /* JADX INFO: renamed from: c */
    public static i46 m138395c() {
        if (f112833d == null) {
            synchronized (i46.class) {
                try {
                    if (f112833d == null) {
                        f112833d = new i46();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f112833d;
    }

    /* JADX INFO: renamed from: a */
    public void m138396a() {
        this.f112835b.clear();
    }

    /* JADX INFO: renamed from: b */
    public List<String> m138397b() {
        return this.f112835b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m138398d(String str) {
        int iIndexOf;
        List<String> list = this.f112835b;
        return list != null && list.contains(str) && (iIndexOf = this.f112835b.indexOf(str) + 1) > 0 && iIndexOf <= this.f112835b.size() - 1;
    }

    /* JADX INFO: renamed from: e */
    public boolean m138399e() {
        if (pzi0.m174454o() - CoreModule.f18264c.f20381e0.f89367y3.get().longValue() <= 172800000) {
            return pzi0.m174454o() < CoreModule.f18264c.f20381e0.f89360x3.get().longValue();
        }
        m138400f();
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m138400f() {
        CoreModule.f18264c.f20381e0.f89360x3.clear();
        CoreModule.f18264c.f20381e0.f89353w3.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m138401g() {
        CoreModule.f18264c.f20381e0.f89367y3.put(Long.valueOf(pzi0.m174454o()));
        int iIntValue = CoreModule.f18264c.f20381e0.f89353w3.get().intValue() + 1;
        CoreModule.f18264c.f20381e0.f89353w3.put(Integer.valueOf(iIntValue));
        if (iIntValue == 5) {
            CoreModule.f18264c.f20381e0.f89360x3.put(Long.valueOf(pzi0.m174454o() + 172800000));
        } else if (iIntValue == 3) {
            CoreModule.f18264c.f20381e0.f89360x3.put(Long.valueOf(pzi0.m174454o() + 86400000));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m138402h(String str) {
        List<String> list = this.f112835b;
        if (list == null) {
            return;
        }
        list.remove(str);
    }

    /* JADX INFO: renamed from: i */
    public void m138403i(Conversation conversation) {
        if (conversation == null || this.f112836c) {
            return;
        }
        this.f112836c = true;
        CrashHelper.m82479c(new Exception("conversation.id is null, " + conversation.toJson()));
    }

    /* JADX INFO: renamed from: j */
    public void m138404j(List<String> list) {
        this.f112835b = list;
    }
}
