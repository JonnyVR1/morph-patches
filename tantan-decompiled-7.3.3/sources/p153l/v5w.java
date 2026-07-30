package p153l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class v5w<D, V extends View> extends cf60 {
    private boolean isInfinite;
    protected List<D> itemList;
    private SparseArray<View> viewCache = new SparseArray<>();
    private boolean dataSetChangeLock = false;

    public v5w(List<D> list, boolean z) {
        this.isInfinite = true;
        if (!z) {
            this.isInfinite = false;
        }
        m199951q(list);
    }

    @Override // p153l.cf60
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        if (this.dataSetChangeLock) {
            return;
        }
        this.viewCache.put(0, view);
    }

    @Override // p153l.cf60
    public int getCount() {
        List<D> list = this.itemList;
        int size = list != null ? list.size() : 0;
        return this.isInfinite ? size + 2 : size;
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View viewMo68592p;
        int iM199947l = this.isInfinite ? m199947l(i) : i;
        int iM199950o = m199950o(iM199947l);
        if (this.viewCache.get(iM199950o, null) == null) {
            viewMo68592p = mo68592p(iM199950o, viewGroup, iM199947l, i);
        } else {
            viewMo68592p = this.viewCache.get(iM199950o);
            this.viewCache.remove(iM199950o);
        }
        mo68591j(viewMo68592p, iM199947l, iM199950o);
        viewGroup.addView(viewMo68592p);
        return viewMo68592p;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo68591j(V v2, int i, int i2);

    /* JADX INFO: renamed from: k */
    public int m199946k() {
        List<D> list = this.itemList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m199947l(int i) {
        if (!this.isInfinite) {
            return i;
        }
        if (i == 0) {
            return this.itemList.size() - 1;
        }
        if (i > getCount() - 2) {
            return 0;
        }
        return i - 1;
    }

    /* JADX INFO: renamed from: m */
    public int m199948m() {
        boolean z = this.isInfinite;
        List<D> list = this.itemList;
        if (z) {
            if (list == null) {
                return 0;
            }
            return list.size();
        }
        if (list == null) {
            return 0;
        }
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: n */
    public int m199949n(int i) {
        if (!this.isInfinite) {
            return i;
        }
        if (i == 0) {
            return 1;
        }
        return i == this.itemList.size() - 1 ? getCount() - 2 : i + 1;
    }

    @Override // p153l.cf60
    public void notifyDataSetChanged() {
        this.dataSetChangeLock = true;
        super.notifyDataSetChanged();
        this.dataSetChangeLock = false;
    }

    /* JADX INFO: renamed from: o */
    public int m199950o(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public abstract V mo68592p(int i, ViewGroup viewGroup, int i2, int i3);

    /* JADX INFO: renamed from: q */
    public final void m199951q(List<D> list) {
        this.viewCache = new SparseArray<>();
        this.itemList = list;
        this.isInfinite = list.size() > 1;
        notifyDataSetChanged();
    }
}
