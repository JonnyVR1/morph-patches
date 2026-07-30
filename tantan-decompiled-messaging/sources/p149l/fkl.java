package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.hdata.android.MDevice;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fkl implements a5e {
    @Override // p149l.a5e
    @NonNull
    public List<InetAddress> lookup(@NonNull String str) throws UnknownHostException {
        if (sjw.f164921a == null || sjw.f164921a.getDnsInstance() == null) {
            return a5e.f67705a.lookup(str);
        }
        String usableHost = MDevice.config.getDnsInstance().getUsableHost(str);
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
