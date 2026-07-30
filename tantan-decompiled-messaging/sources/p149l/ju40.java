package p149l;

import com.p046p1.mobile.putong.core.data.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ju40 {

    /* JADX INFO: renamed from: a */
    public String f119729a;

    /* JADX INFO: renamed from: b */
    public String f119730b;

    /* JADX INFO: renamed from: c */
    public boolean f119731c;

    /* JADX INFO: renamed from: d */
    public List<Message> f119732d = new ArrayList();

    public ju40(String str, String str2, boolean z) {
        this.f119729a = str;
        this.f119730b = str2;
        this.f119731c = z;
    }

    /* JADX INFO: renamed from: a */
    public void m143219a(Message message) {
        this.f119732d.add(message);
    }

    /* JADX INFO: renamed from: b */
    public Message m143220b(int i) {
        return this.f119732d.get(i);
    }

    /* JADX INFO: renamed from: c */
    public String m143221c() {
        return this.f119730b;
    }

    /* JADX INFO: renamed from: d */
    public List<Message> m143222d() {
        return this.f119732d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m143223e() {
        return this.f119731c;
    }

    /* JADX INFO: renamed from: f */
    public int m143224f() {
        return this.f119732d.size();
    }
}
