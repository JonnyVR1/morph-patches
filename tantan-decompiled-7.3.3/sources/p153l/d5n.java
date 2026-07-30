package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.bottom.IntlBottomContentCoverView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class d5n extends lb2 {

    /* JADX INFO: renamed from: e */
    public IntlVipNewUiFrag f85176e;

    /* JADX INFO: renamed from: f */
    public ArrayList<ViewGroup> f85177f;

    public d5n(IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f85176e = intlVipNewUiFrag;
    }

    @Override // p153l.cf60
    public int getCount() {
        ArrayList<ViewGroup> arrayList = this.f85177f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            View view = (View) obj;
            if (view.getParent() == viewGroup) {
                viewGroup.removeView(view);
            }
        }
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        IntlBottomContentCoverView intlBottomContentCoverView = new IntlBottomContentCoverView(this.f85176e.requireContext());
        ViewGroup viewGroupM114315q = m114315q(i);
        if (viewGroupM114315q != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroupM114315q.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroupM114315q);
            }
            intlBottomContentCoverView.addView(viewGroupM114315q, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        viewGroup.addView(intlBottomContentCoverView);
        return intlBottomContentCoverView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public ViewGroup m114315q(int i) {
        ArrayList<ViewGroup> arrayList = this.f85177f;
        if (arrayList == null || i >= arrayList.size()) {
            return null;
        }
        ViewGroup viewGroup = this.f85177f.get(i);
        if (viewGroup instanceof hzo) {
            ((hzo) viewGroup).mo57590z(this, this.f85176e);
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: r */
    public void m114316r(ArrayList<ViewGroup> arrayList) {
        this.f85177f = arrayList;
        if (arrayList != null) {
            notifyDataSetChanged();
        }
    }
}
