package p153l;

import com.immomo.components.interfaces.IProcessOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class rdl0 extends kqf0 implements ruf {
    public rdl0(List<kt2> list) {
        super(list);
    }

    @Override // p153l.ruf
    /* JADX INFO: renamed from: d */
    public void mo102835d(IProcessOutput iProcessOutput) {
        ArrayList arrayList = new ArrayList(m150862Z());
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = (kt2) arrayList.get(i);
            if (obj instanceof ruf) {
                ((ruf) obj).mo102835d(iProcessOutput);
            }
        }
    }
}
