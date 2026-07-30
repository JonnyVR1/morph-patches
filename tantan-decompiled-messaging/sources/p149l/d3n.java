package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.view.bottom.IntlBottomContentCoverView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class d3n extends eb2 {

    /* JADX INFO: renamed from: e */
    public IntlVipNewUiFrag f84238e;

    /* JADX INFO: renamed from: f */
    public ArrayList<ViewGroup> f84239f;

    public d3n(IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f84238e = intlVipNewUiFrag;
    }

    @Override // p149l.w660
    public int getCount() {
        ArrayList<ViewGroup> arrayList = this.f84239f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            View view = (View) obj;
            if (view.getParent() == viewGroup) {
                viewGroup.removeView(view);
            }
        }
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        IntlBottomContentCoverView intlBottomContentCoverView = new IntlBottomContentCoverView(this.f84238e.requireContext());
        ViewGroup viewGroupM109942q = m109942q(i);
        if (viewGroupM109942q != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroupM109942q.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroupM109942q);
            }
            intlBottomContentCoverView.addView(viewGroupM109942q, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        viewGroup.addView(intlBottomContentCoverView);
        return intlBottomContentCoverView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public ViewGroup m109942q(int i) {
        ArrayList<ViewGroup> arrayList = this.f84239f;
        if (arrayList == null || i >= arrayList.size()) {
            return null;
        }
        ViewGroup viewGroup = this.f84239f.get(i);
        if (viewGroup instanceof hxo) {
            ((hxo) viewGroup).mo56407z(this, this.f84238e);
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: r */
    public void m109943r(ArrayList<ViewGroup> arrayList) {
        this.f84239f = arrayList;
        if (arrayList != null) {
            notifyDataSetChanged();
        }
    }
}
