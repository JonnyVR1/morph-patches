package p153l;

import android.util.SparseArray;
import android.view.View;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class xi80 {

    /* JADX INFO: renamed from: a */
    public boolean f194439a = BifrostLayout.f24063d;

    /* JADX INFO: renamed from: b */
    public SparseArray<List<View>> f194440b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public View m211129a(int i) {
        List<View> list = this.f194440b.get(i);
        if (list == null || list.size() == 0) {
            return null;
        }
        if (this.f194439a) {
            String str = BifrostLayout.f24062c;
            list.size();
        }
        View viewRemove = list.remove(0);
        if (this.f194439a && viewRemove.getParent() != null) {
            String str2 = BifrostLayout.f24062c;
            list.size();
        }
        return viewRemove;
    }

    /* JADX INFO: renamed from: b */
    public void m211130b(txl0 txl0Var) {
        List<View> arrayList = this.f194440b.get(txl0Var.f176571d);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f194440b.put(txl0Var.f176571d, arrayList);
        }
        if (this.f194439a) {
            String str = BifrostLayout.f24062c;
            arrayList.size();
        }
        arrayList.add(txl0Var.f176568a);
        m211131c(txl0Var.f176568a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m211131c(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        if (view instanceof pn4) {
            ((pn4) view).mo37368d0(0.0f, 0.0f, 0.0f, CardProgressAction.REMOVE);
        }
    }
}
