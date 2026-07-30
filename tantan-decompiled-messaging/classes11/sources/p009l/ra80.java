package p009l;

import android.util.SparseArray;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ra80 {

    /* JADX INFO: renamed from: a */
    public boolean f19709a = BifrostLayout.f2099d;

    /* JADX INFO: renamed from: b */
    public SparseArray<List<View>> f19710b = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public View m21469a(int i) {
        List<View> list = this.f19710b.get(i);
        if (list == null || list.size() == 0) {
            return null;
        }
        if (this.f19709a) {
            String str = BifrostLayout.f2098c;
            list.size();
        }
        View viewRemove = list.remove(0);
        if (this.f19709a && viewRemove.getParent() != null) {
            String str2 = BifrostLayout.f2098c;
            list.size();
        }
        return viewRemove;
    }

    /* JADX INFO: renamed from: b */
    public void m21470b(pol0 pol0Var) {
        List<View> arrayList = this.f19710b.get(pol0Var.f18803d);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f19710b.put(pol0Var.f18803d, arrayList);
        }
        if (this.f19709a) {
            String str = BifrostLayout.f2098c;
            arrayList.size();
        }
        arrayList.add(pol0Var.f18800a);
        m21471c(pol0Var.f18800a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m21471c(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        if (view instanceof qm4) {
            ((qm4) view).mo294d0(0.0f, 0.0f, 0.0f, CardProgressAction.REMOVE);
        }
    }
}
