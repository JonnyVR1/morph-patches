package p149l;

import com.p046p1.mobile.putong.core.data.CoreGiftPriority;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class qwc0 {

    /* JADX INFO: renamed from: a */
    public CoreGiftPriority f156677a = CoreGiftPriority.get("LOW");

    /* JADX INFO: renamed from: b */
    public ArrayList<InterfaceC19597a> f156678b = null;

    /* JADX INFO: renamed from: l.qwc0$a */
    public interface InterfaceC19597a {
        /* JADX INFO: renamed from: a */
        void mo176788a(File file);

        /* JADX INFO: renamed from: c */
        void mo176789c(float f);

        void onCancel();

        void onFailed(String str);
    }

    /* JADX INFO: renamed from: a */
    public void m176785a(InterfaceC19597a interfaceC19597a) {
        ArrayList<InterfaceC19597a> arrayList = this.f156678b;
        if (arrayList == null) {
            ArrayList<InterfaceC19597a> arrayList2 = new ArrayList<>();
            this.f156678b = arrayList2;
            arrayList2.add(interfaceC19597a);
        } else {
            if (arrayList.contains(interfaceC19597a)) {
                return;
            }
            this.f156678b.add(interfaceC19597a);
        }
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<InterfaceC19597a> m176786b() {
        return this.f156678b;
    }

    /* JADX INFO: renamed from: c */
    public void m176787c(CoreGiftPriority coreGiftPriority) {
        this.f156677a = coreGiftPriority;
    }
}
