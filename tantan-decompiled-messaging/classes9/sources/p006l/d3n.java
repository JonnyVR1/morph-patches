package p006l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.view.bottom.IntlBottomContentCoverView;
import java.util.ArrayList;
import l.eb2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d3n extends eb2 {

    /* JADX INFO: renamed from: e */
    public IntlVipNewUiFrag f10002e;

    /* JADX INFO: renamed from: f */
    public ArrayList<ViewGroup> f10003f;

    public d3n(IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f10002e = intlVipNewUiFrag;
    }

    public int getCount() {
        ArrayList<ViewGroup> arrayList = this.f10003f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* JADX INFO: renamed from: o */
    public void m13772o(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            View view = (View) obj;
            if (view.getParent() == viewGroup) {
                viewGroup.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public Object m13773p(ViewGroup viewGroup, int i) {
        IntlBottomContentCoverView intlBottomContentCoverView = new IntlBottomContentCoverView(this.f10002e.requireContext());
        ViewGroup viewGroupM13774q = m13774q(i);
        if (viewGroupM13774q != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroupM13774q.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroupM13774q);
            }
            intlBottomContentCoverView.addView(viewGroupM13774q, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        viewGroup.addView(intlBottomContentCoverView);
        return intlBottomContentCoverView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public ViewGroup m13774q(int i) {
        ArrayList<ViewGroup> arrayList = this.f10003f;
        if (arrayList == null || i >= arrayList.size()) {
            return null;
        }
        ViewGroup viewGroup = this.f10003f.get(i);
        if (viewGroup instanceof hxo) {
            ((hxo) viewGroup).mo9845z(this, this.f10002e);
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: r */
    public void m13775r(ArrayList<ViewGroup> arrayList) {
        this.f10003f = arrayList;
        if (arrayList != null) {
            notifyDataSetChanged();
        }
    }
}
