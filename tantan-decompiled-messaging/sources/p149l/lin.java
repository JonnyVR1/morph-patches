package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p046p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class lin extends eb2 {

    /* JADX INFO: renamed from: e */
    public final e30<BLiveGameOperationConfig> f128234e;

    /* JADX INFO: renamed from: f */
    public final List<BLiveGameOperationConfig> f128235f = new ArrayList();

    public lin(e30<BLiveGameOperationConfig> e30Var) {
        this.f128234e = e30Var;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f128235f.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        IntlGameOperationItemView intlGameOperationItemView = (IntlGameOperationItemView) LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162673I, viewGroup, false);
        intlGameOperationItemView.m69934d(this.f128235f.get(i));
        intlGameOperationItemView.setAction1(this.f128234e);
        intlGameOperationItemView.setTag(Integer.valueOf(i));
        viewGroup.addView(intlGameOperationItemView);
        return intlGameOperationItemView;
    }

    /* JADX INFO: renamed from: q */
    public void m149920q(List<BLiveGameOperationConfig> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f128235f.clear();
        this.f128235f.addAll(list);
        notifyDataSetChanged();
    }
}
