package p149l;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class nsm implements a5e {

    /* JADX INFO: renamed from: b */
    private String f140280b;

    public nsm(String str) {
        this.f140280b = str;
    }

    @Override // p149l.a5e
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        List<String> listMo105302b = j0c.m139158b(this.f140280b).mo105302b(str);
        if (listMo105302b == null || listMo105302b.size() <= 0) {
            return Arrays.asList(InetAddress.getAllByName(str));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listMo105302b.iterator();
        while (it.hasNext()) {
            arrayList.add(InetAddress.getByName(it.next()));
        }
        return arrayList;
    }
}
