package p149l;

import android.util.SparseArray;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class x4j {

    /* JADX INFO: renamed from: a */
    public SparseArray<List<rj4>> f191037a = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public synchronized void m206985a(CardBottomFrame cardBottomFrame, rj4 rj4Var) {
        try {
            List<rj4> arrayList = this.f191037a.get(cardBottomFrame.getFrameId());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f191037a.put(cardBottomFrame.getFrameId(), arrayList);
            }
            arrayList.add(rj4Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized rj4 m206986b(CardBottomFrame cardBottomFrame) {
        List<rj4> list = this.f191037a.get(cardBottomFrame.getFrameId());
        if (list != null && !list.isEmpty()) {
            return list.remove(0);
        }
        return null;
    }
}
