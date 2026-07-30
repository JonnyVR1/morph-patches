package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.banner.LiveBannerCardView;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.dynamic.LiveSquareDynamicFragment;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class tzt implements rzt {

    /* JADX INFO: renamed from: a */
    public LiveSquareDynamicFragment f172755a;

    /* JADX INFO: renamed from: b */
    public vur f172756b;

    /* JADX INFO: renamed from: c */
    public wur f172757c = new wur();

    @Override // p149l.rzt
    /* JADX INFO: renamed from: a */
    public void mo181765a(VDraweeView vDraweeView, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            sxj.m186442c(str, vDraweeView, i >= 38 ? sxj.f166798b : sxj.f166797a);
        }
    }

    @Override // p149l.rzt
    /* JADX INFO: renamed from: b */
    public void mo181766b(View view, List<xaj0<String, String, String>> list, int i) {
        if (this.f172755a != null && (view instanceof LiveBannerCardView)) {
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            int i2 = t100.f167261j;
            ((ViewGroup.MarginLayoutParams) c0578p).leftMargin = i2;
            ((ViewGroup.MarginLayoutParams) c0578p).rightMargin = i2;
            view.setLayoutParams(c0578p);
            ArrayList arrayList = new ArrayList();
            for (xaj0<String, String, String> xaj0Var : list) {
                wur.C20965a c20965a = new wur.C20965a();
                LiveGoAction liveGoAction = new LiveGoAction();
                liveGoAction.setType(1);
                liveGoAction.setGoData(xaj0Var.f191752b);
                c20965a.m205663e(liveGoAction);
                c20965a.m205664f(xaj0Var.f191753c);
                arrayList.add(c20965a);
            }
            wur wurVar = new wur();
            this.f172757c = wurVar;
            wurVar.m205658e(arrayList);
            this.f172757c.localAutoScroll = false;
            vur vurVar = new vur(new ij4(this.f172755a), this.f172757c);
            this.f172756b = vurVar;
            vurVar.m200094S((LiveBannerCardView) view);
        }
    }

    @Override // p149l.rzt
    /* JADX INFO: renamed from: c */
    public void mo181767c() {
        this.f172755a = null;
    }

    @Override // p149l.rzt
    /* JADX INFO: renamed from: d */
    public void mo181768d(Fragment fragment) {
        if (fragment instanceof LiveSquareDynamicFragment) {
            this.f172755a = (LiveSquareDynamicFragment) fragment;
        }
    }

    @Override // p149l.rzt
    /* JADX INFO: renamed from: e */
    public int mo181769e() {
        return s6c0.f162751g;
    }
}
