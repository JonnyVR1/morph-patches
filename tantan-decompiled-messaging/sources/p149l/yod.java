package p149l;

import com.immomo.mmdns.MDDNSEntrance;

/* JADX INFO: loaded from: classes7.dex */
public class yod extends wgf0 {
    @Override // p149l.wgf0
    /* JADX INFO: renamed from: a */
    public void mo203049a(String str, String str2, int i) {
        if (i == 0) {
            MDDNSEntrance.getInstance().requestSucceedForDomain(str, str2);
        } else {
            MDDNSEntrance.getInstance().requestFailedForDomain(str, str2);
        }
    }

    @Override // p149l.wgf0
    /* JADX INFO: renamed from: b */
    public String mo203050b(String str) {
        return MDDNSEntrance.getInstance().getUsableHost(str);
    }

    @Override // p149l.wgf0
    /* JADX INFO: renamed from: c */
    public String[] mo203051c(String str, boolean z) {
        return MDDNSEntrance.getInstance().getUsableHostList(str, z);
    }

    @Override // p149l.wgf0
    /* JADX INFO: renamed from: d */
    public boolean mo203052d(String str) {
        return MDDNSEntrance.getInstance().useDNS(str);
    }
}
