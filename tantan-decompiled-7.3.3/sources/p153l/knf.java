package p153l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class knf {

    /* JADX INFO: renamed from: a */
    public SparseArray<List<View>> f127581a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public boolean f127582b = false;

    /* JADX INFO: renamed from: a */
    public View m150507a(int i) {
        List<View> list = this.f127581a.get(i);
        if (list == null || list.size() == 0) {
            return null;
        }
        if (this.f127582b) {
            bnf.m105390a("UserCardExpandedView", "获取缓存: " + i + " ====> " + list.size());
        }
        View viewRemove = list.remove(0);
        if (this.f127582b && viewRemove.getParent() != null) {
            bnf.m105390a("UserCardExpandedView", "获取缓存:异常 parent 存在 " + i + " ====> " + list.size());
        }
        return viewRemove;
    }

    /* JADX INFO: renamed from: b */
    public void m150508b(int i, View view) {
        List<View> arrayList = this.f127581a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f127581a.put(i, arrayList);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: c */
    public void m150509c(o4m o4mVar) {
        if (o4mVar.getView() == null) {
            return;
        }
        List<View> arrayList = this.f127581a.get(o4mVar.getType());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f127581a.put(o4mVar.getType(), arrayList);
        }
        if (this.f127582b) {
            bnf.m105390a("UserCardExpandedView", "添加缓存:" + o4mVar.getType() + " ===> " + arrayList.size());
        }
        arrayList.add(o4mVar.getView());
        m150510d(o4mVar.getView());
    }

    /* JADX INFO: renamed from: d */
    public final void m150510d(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }
}
