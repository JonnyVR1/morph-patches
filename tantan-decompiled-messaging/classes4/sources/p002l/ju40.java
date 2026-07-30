package p002l;

import com.p1.mobile.putong.core.data.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ju40 {

    /* JADX INFO: renamed from: a */
    public String f14016a;

    /* JADX INFO: renamed from: b */
    public String f14017b;

    /* JADX INFO: renamed from: c */
    public boolean f14018c;

    /* JADX INFO: renamed from: d */
    public List<Message> f14019d = new ArrayList();

    public ju40(String str, String str2, boolean z) {
        this.f14016a = str;
        this.f14017b = str2;
        this.f14018c = z;
    }

    /* JADX INFO: renamed from: a */
    public void m16228a(Message message) {
        this.f14019d.add(message);
    }

    /* JADX INFO: renamed from: b */
    public Message m16229b(int i) {
        return this.f14019d.get(i);
    }

    /* JADX INFO: renamed from: c */
    public String m16230c() {
        return this.f14017b;
    }

    /* JADX INFO: renamed from: d */
    public List<Message> m16231d() {
        return this.f14019d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m16232e() {
        return this.f14018c;
    }

    /* JADX INFO: renamed from: f */
    public int m16233f() {
        return this.f14019d.size();
    }
}
