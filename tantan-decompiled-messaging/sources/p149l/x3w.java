package p149l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class x3w<D, V extends View> extends w660 {
    private boolean isInfinite;
    protected List<D> itemList;
    private SparseArray<View> viewCache = new SparseArray<>();
    private boolean dataSetChangeLock = false;

    public x3w(List<D> list, boolean z) {
        this.isInfinite = true;
        if (!z) {
            this.isInfinite = false;
        }
        m206954q(list);
    }

    @Override // p149l.w660
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        if (this.dataSetChangeLock) {
            return;
        }
        this.viewCache.put(0, view);
    }

    @Override // p149l.w660
    public int getCount() {
        List<D> list = this.itemList;
        int size = list != null ? list.size() : 0;
        return this.isInfinite ? size + 2 : size;
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        View viewMo67409p;
        int iM206950l = this.isInfinite ? m206950l(i) : i;
        int iM206953o = m206953o(iM206950l);
        if (this.viewCache.get(iM206953o, null) == null) {
            viewMo67409p = mo67409p(iM206953o, viewGroup, iM206950l, i);
        } else {
            viewMo67409p = this.viewCache.get(iM206953o);
            this.viewCache.remove(iM206953o);
        }
        mo67408j(viewMo67409p, iM206950l, iM206953o);
        viewGroup.addView(viewMo67409p);
        return viewMo67409p;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo67408j(V v2, int i, int i2);

    /* JADX INFO: renamed from: k */
    public int m206949k() {
        List<D> list = this.itemList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m206950l(int i) {
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
    public int m206951m() {
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
    public int m206952n(int i) {
        if (!this.isInfinite) {
            return i;
        }
        if (i == 0) {
            return 1;
        }
        return i == this.itemList.size() - 1 ? getCount() - 2 : i + 1;
    }

    @Override // p149l.w660
    public void notifyDataSetChanged() {
        this.dataSetChangeLock = true;
        super.notifyDataSetChanged();
        this.dataSetChangeLock = false;
    }

    /* JADX INFO: renamed from: o */
    public int m206953o(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public abstract V mo67409p(int i, ViewGroup viewGroup, int i2, int i3);

    /* JADX INFO: renamed from: q */
    public final void m206954q(List<D> list) {
        this.viewCache = new SparseArray<>();
        this.itemList = list;
        this.isInfinite = list.size() > 1;
        notifyDataSetChanged();
    }
}
