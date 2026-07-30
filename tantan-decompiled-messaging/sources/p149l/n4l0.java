package p149l;

import com.immomo.components.interfaces.IProcessOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class n4l0 extends bif0 implements dtf {
    public n4l0(List<us2> list) {
        super(list);
    }

    @Override // p149l.dtf
    /* JADX INFO: renamed from: d */
    public void mo104314d(IProcessOutput iProcessOutput) {
        ArrayList arrayList = new ArrayList(m102036Z());
        for (int i = 0; i < arrayList.size(); i++) {
            kcj kcjVar = (us2) arrayList.get(i);
            if (kcjVar instanceof dtf) {
                ((dtf) kcjVar).mo104314d(iProcessOutput);
            }
        }
    }
}
