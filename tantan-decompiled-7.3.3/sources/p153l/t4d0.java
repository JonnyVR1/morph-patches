package p153l;

import com.p051p1.mobile.putong.core.data.CoreGiftPriority;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class t4d0 {

    /* JADX INFO: renamed from: a */
    public CoreGiftPriority f172063a = CoreGiftPriority.get("LOW");

    /* JADX INFO: renamed from: b */
    public ArrayList<InterfaceC20233a> f172064b = null;

    /* JADX INFO: renamed from: l.t4d0$a */
    public interface InterfaceC20233a {
        /* JADX INFO: renamed from: a */
        void mo189255a(File file);

        /* JADX INFO: renamed from: c */
        void mo189256c(float f);

        void onCancel();

        void onFailed(String str);
    }

    /* JADX INFO: renamed from: a */
    public void m189252a(InterfaceC20233a interfaceC20233a) {
        ArrayList<InterfaceC20233a> arrayList = this.f172064b;
        if (arrayList == null) {
            ArrayList<InterfaceC20233a> arrayList2 = new ArrayList<>();
            this.f172064b = arrayList2;
            arrayList2.add(interfaceC20233a);
        } else {
            if (arrayList.contains(interfaceC20233a)) {
                return;
            }
            this.f172064b.add(interfaceC20233a);
        }
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<InterfaceC20233a> m189253b() {
        return this.f172064b;
    }

    /* JADX INFO: renamed from: c */
    public void m189254c(CoreGiftPriority coreGiftPriority) {
        this.f172063a = coreGiftPriority;
    }
}
