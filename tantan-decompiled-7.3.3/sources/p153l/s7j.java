package p153l;

import android.util.SparseArray;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class s7j {

    /* JADX INFO: renamed from: a */
    public SparseArray<List<qk4>> f166692a = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public synchronized void m185008a(CardBottomFrame cardBottomFrame, qk4 qk4Var) {
        try {
            List<qk4> arrayList = this.f166692a.get(cardBottomFrame.getFrameId());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f166692a.put(cardBottomFrame.getFrameId(), arrayList);
            }
            arrayList.add(qk4Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized qk4 m185009b(CardBottomFrame cardBottomFrame) {
        List<qk4> list = this.f166692a.get(cardBottomFrame.getFrameId());
        if (list != null && !list.isEmpty()) {
            return list.remove(0);
        }
        return null;
    }
}
