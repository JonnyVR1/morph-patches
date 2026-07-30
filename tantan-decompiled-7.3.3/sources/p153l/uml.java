package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class uml implements o6e {
    @Override // p153l.o6e
    @NonNull
    public List<InetAddress> lookup(@NonNull String str) throws UnknownHostException {
        if (rmw.f163939a == null || rmw.f163939a.getDnsInstance() == null) {
            return o6e.f145159a.lookup(str);
        }
        String usableHost = rmw.f163939a.getDnsInstance().getUsableHost(str);
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(usableHost)) {
            arrayList.add(str);
        } else {
            arrayList.add(usableHost);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.addAll(Arrays.asList(InetAddress.getAllByName((String) it.next())));
        }
        return arrayList2;
    }
}
