package p003l;

import com.p000p1.mobile.putong.core.data.CoreGiftPriority;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qwc0 {

    /* JADX INFO: renamed from: a */
    public CoreGiftPriority f7097a = CoreGiftPriority.get(CoreGiftPriority.LOW);

    /* JADX INFO: renamed from: b */
    public ArrayList<InterfaceC3412a> f7098b = null;

    /* JADX INFO: renamed from: l.qwc0$a */
    public interface InterfaceC3412a {
        /* JADX INFO: renamed from: a */
        void mo9040a(File file);

        /* JADX INFO: renamed from: c */
        void mo9041c(float f);

        void onCancel();

        void onFailed(String str);
    }

    /* JADX INFO: renamed from: a */
    public void m9037a(InterfaceC3412a interfaceC3412a) {
        ArrayList<InterfaceC3412a> arrayList = this.f7098b;
        if (arrayList == null) {
            ArrayList<InterfaceC3412a> arrayList2 = new ArrayList<>();
            this.f7098b = arrayList2;
            arrayList2.add(interfaceC3412a);
        } else {
            if (arrayList.contains(interfaceC3412a)) {
                return;
            }
            this.f7098b.add(interfaceC3412a);
        }
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<InterfaceC3412a> m9038b() {
        return this.f7098b;
    }

    /* JADX INFO: renamed from: c */
    public void m9039c(CoreGiftPriority coreGiftPriority) {
        this.f7097a = coreGiftPriority;
    }
}
