package p149l;

import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes7.dex */
public class tqd implements txf0 {

    /* JADX INFO: renamed from: a */
    private final MMKV f171573a;

    public tqd() {
        this.f171573a = nxf0.m161944a().m161945b("MWC_MMKV_DEFAULT_LOCALSTORAGE_KEY");
    }

    @Override // p149l.txf0
    /* JADX INFO: renamed from: a */
    public String mo190091a(String str) {
        return this.f171573a.decodeString(str);
    }

    @Override // p149l.txf0
    /* JADX INFO: renamed from: b */
    public boolean mo190092b(String str, String str2) {
        return this.f171573a.encode(str, str2);
    }

    @Override // p149l.txf0
    public void clear() {
        this.f171573a.clear();
    }

    public tqd(String str) {
        this.f171573a = nxf0.m161944a().m161945b(str);
    }
}
