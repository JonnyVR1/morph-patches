package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.immomo.mmdns.LogTag;
import com.immomo.mmdns.MDDNSEntrance;
import com.immomo.mmdns.MoInetAddressHelper;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class j500 implements a5e {
    @Override // p149l.a5e
    @NonNull
    public List<InetAddress> lookup(@NonNull String str) throws UnknownHostException {
        String strM95106a = a600.m95106a(str);
        if (strM95106a != null) {
            MDLog.m7396i(LogTag.DNS, "MomoDNSImp %s replace %s to %s", "MockDNS", str, strM95106a);
            return Arrays.asList(InetAddress.getAllByName(strM95106a));
        }
        try {
            if (MDDNSEntrance.getInstance().useDNS(str)) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                if (hzl.m133707k()) {
                    String[] usableHostList = MDDNSEntrance.getInstance().getUsableHostList(str, true);
                    if (usableHostList != null && usableHostList.length > 0) {
                        arrayList.add(usableHostList[0]);
                    }
                    z = true;
                }
                String usableHost = MDDNSEntrance.getInstance().getUsableHost(str);
                if (TextUtils.isEmpty(usableHost)) {
                    arrayList.add(str);
                } else {
                    arrayList.add(usableHost);
                }
                if (arrayList.size() > 0) {
                    MDLog.m7396i(LogTag.DNS, "MomoDNSImp %s replace %s to %s", z ? "MomoIpv6Util" : "IPV4", str, arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.addAll(Arrays.asList(MoInetAddressHelper.getAllByName((String) it.next())));
                    }
                    return arrayList2;
                }
            }
        } catch (UnknownHostException e) {
            MDLog.printErrStackTrace(LogTag.DNS, e);
        }
        return a5e.f67705a.lookup(str);
    }
}
