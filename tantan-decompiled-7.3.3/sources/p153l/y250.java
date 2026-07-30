package p153l;

import com.p051p1.mobile.putong.core.data.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class y250 {

    /* JADX INFO: renamed from: a */
    public String f197178a;

    /* JADX INFO: renamed from: b */
    public String f197179b;

    /* JADX INFO: renamed from: c */
    public boolean f197180c;

    /* JADX INFO: renamed from: d */
    public List<Message> f197181d = new ArrayList();

    public y250(String str, String str2, boolean z) {
        this.f197178a = str;
        this.f197179b = str2;
        this.f197180c = z;
    }

    /* JADX INFO: renamed from: a */
    public void m214038a(Message message) {
        this.f197181d.add(message);
    }

    /* JADX INFO: renamed from: b */
    public Message m214039b(int i) {
        return this.f197181d.get(i);
    }

    /* JADX INFO: renamed from: c */
    public String m214040c() {
        return this.f197179b;
    }

    /* JADX INFO: renamed from: d */
    public List<Message> m214041d() {
        return this.f197181d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m214042e() {
        return this.f197180c;
    }

    /* JADX INFO: renamed from: f */
    public int m214043f() {
        return this.f197181d.size();
    }
}
