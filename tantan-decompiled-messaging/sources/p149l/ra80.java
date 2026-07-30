package p149l;

import android.util.SparseArray;
import android.view.View;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ra80 {

    /* JADX INFO: renamed from: a */
    public boolean f158492a = BifrostLayout.f23321d;

    /* JADX INFO: renamed from: b */
    public SparseArray<List<View>> f158493b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public View m178472a(int i) {
        List<View> list = this.f158493b.get(i);
        if (list == null || list.size() == 0) {
            return null;
        }
        if (this.f158492a) {
            String str = BifrostLayout.f23320c;
            list.size();
        }
        View viewRemove = list.remove(0);
        if (this.f158492a && viewRemove.getParent() != null) {
            String str2 = BifrostLayout.f23320c;
            list.size();
        }
        return viewRemove;
    }

    /* JADX INFO: renamed from: b */
    public void m178473b(pol0 pol0Var) {
        List<View> arrayList = this.f158493b.get(pol0Var.f150533d);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f158493b.put(pol0Var.f150533d, arrayList);
        }
        if (this.f158492a) {
            String str = BifrostLayout.f23320c;
            arrayList.size();
        }
        arrayList.add(pol0Var.f150530a);
        m178474c(pol0Var.f150530a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m178474c(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        if (view instanceof qm4) {
            ((qm4) view).mo36365d0(0.0f, 0.0f, 0.0f, CardProgressAction.REMOVE);
        }
    }
}
