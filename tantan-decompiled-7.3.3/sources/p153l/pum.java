package p153l;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class pum implements o6e {

    /* JADX INFO: renamed from: b */
    private String f154198b;

    public pum(String str) {
        this.f154198b = str;
    }

    @Override // p153l.o6e
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        List<String> listMo155715b = w1c.m204391b(this.f154198b).mo155715b(str);
        if (listMo155715b == null || listMo155715b.size() <= 0) {
            return Arrays.asList(InetAddress.getAllByName(str));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listMo155715b.iterator();
        while (it.hasNext()) {
            arrayList.add(InetAddress.getByName(it.next()));
        }
        return arrayList;
    }
}
