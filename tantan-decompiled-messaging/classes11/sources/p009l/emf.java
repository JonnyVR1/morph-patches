package p009l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class emf {

    /* JADX INFO: renamed from: a */
    public SparseArray<List<View>> f12602a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public boolean f12603b = false;

    /* JADX INFO: renamed from: a */
    public View m13976a(int i) {
        List<View> list = this.f12602a.get(i);
        if (list == null || list.size() == 0) {
            return null;
        }
        if (this.f12603b) {
            vlf.m23436a("UserCardExpandedView", "获取缓存: " + i + " ====> " + list.size());
        }
        View viewRemove = list.remove(0);
        if (this.f12603b && viewRemove.getParent() != null) {
            vlf.m23436a("UserCardExpandedView", "获取缓存:异常 parent 存在 " + i + " ====> " + list.size());
        }
        return viewRemove;
    }

    /* JADX INFO: renamed from: b */
    public void m13977b(int i, View view) {
        List<View> arrayList = this.f12602a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f12602a.put(i, arrayList);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: c */
    public void m13978c(v1m v1mVar) {
        if (v1mVar.getView() == null) {
            return;
        }
        List<View> arrayList = this.f12602a.get(v1mVar.getType());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f12602a.put(v1mVar.getType(), arrayList);
        }
        if (this.f12603b) {
            vlf.m23436a("UserCardExpandedView", "添加缓存:" + v1mVar.getType() + " ===> " + arrayList.size());
        }
        arrayList.add(v1mVar.getView());
        m13979d(v1mVar.getView());
    }

    /* JADX INFO: renamed from: d */
    public final void m13979d(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }
}
