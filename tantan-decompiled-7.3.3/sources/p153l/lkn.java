package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p051p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class lkn extends lb2 {

    /* JADX INFO: renamed from: e */
    public final y20<BLiveGameOperationConfig> f132487e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveGameOperationConfig> f132488f = new ArrayList();

    public lkn(y20<BLiveGameOperationConfig> y20Var) {
        this.f132487e = y20Var;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f132488f.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        IntlGameOperationItemView intlGameOperationItemView = (IntlGameOperationItemView) LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193787I, viewGroup, false);
        intlGameOperationItemView.m71117d(this.f132488f.get(i));
        intlGameOperationItemView.setAction1(this.f132487e);
        intlGameOperationItemView.setTag(Integer.valueOf(i));
        viewGroup.addView(intlGameOperationItemView);
        return intlGameOperationItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m154648q(List<BLiveGameOperationConfig> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f132488f.clear();
        this.f132488f.addAll(list);
        notifyDataSetChanged();
    }
}
