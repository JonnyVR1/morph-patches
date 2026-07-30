package p153l;

import com.immomo.mmdns.MDDNSEntrance;

/* JADX INFO: loaded from: classes7.dex */
public class dqd extends epf0 {
    @Override // p153l.epf0
    /* JADX INFO: renamed from: a */
    public void mo117511a(String str, String str2, int i) {
        if (i == 0) {
            MDDNSEntrance.getInstance().requestSucceedForDomain(str, str2);
        } else {
            MDDNSEntrance.getInstance().requestFailedForDomain(str, str2);
        }
    }

    @Override // p153l.epf0
    /* JADX INFO: renamed from: b */
    public String mo117512b(String str) {
        return MDDNSEntrance.getInstance().getUsableHost(str);
    }

    @Override // p153l.epf0
    /* JADX INFO: renamed from: c */
    public String[] mo117513c(String str, boolean z) {
        return MDDNSEntrance.getInstance().getUsableHostList(str, z);
    }

    @Override // p153l.epf0
    /* JADX INFO: renamed from: d */
    public boolean mo117514d(String str) {
        return MDDNSEntrance.getInstance().useDNS(str);
    }
}
