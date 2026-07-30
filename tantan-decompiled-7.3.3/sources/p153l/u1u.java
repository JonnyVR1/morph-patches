package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.banner.LiveBannerCardView;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.dynamic.LiveSquareDynamicFragment;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class u1u implements s1u {

    /* JADX INFO: renamed from: a */
    public LiveSquareDynamicFragment f177132a;

    /* JADX INFO: renamed from: b */
    public wwr f177133b;

    /* JADX INFO: renamed from: c */
    public xwr f177134c = new xwr();

    @Override // p153l.s1u
    /* JADX INFO: renamed from: a */
    public void mo184061a(VDraweeView vDraweeView, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            i0k.m137976c(str, vDraweeView, i >= 38 ? i0k.f112379b : i0k.f112378a);
        }
    }

    @Override // p153l.s1u
    /* JADX INFO: renamed from: b */
    public void mo184062b(View view, List<bkj0<String, String, String>> list, int i) {
        if (this.f177132a != null && (view instanceof LiveBannerCardView)) {
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            int i2 = qa00.f156323j;
            ((ViewGroup.MarginLayoutParams) c0580p).leftMargin = i2;
            ((ViewGroup.MarginLayoutParams) c0580p).rightMargin = i2;
            view.setLayoutParams(c0580p);
            ArrayList arrayList = new ArrayList();
            for (bkj0<String, String, String> bkj0Var : list) {
                xwr.C21468a c21468a = new xwr.C21468a();
                LiveGoAction liveGoAction = new LiveGoAction();
                liveGoAction.setType(1);
                liveGoAction.setGoData(bkj0Var.f77082b);
                c21468a.m213431e(liveGoAction);
                c21468a.m213432f(bkj0Var.f77083c);
                arrayList.add(c21468a);
            }
            xwr xwrVar = new xwr();
            this.f177134c = xwrVar;
            xwrVar.m213426e(arrayList);
            this.f177134c.localAutoScroll = false;
            wwr wwrVar = new wwr(new hk4(this.f177132a), this.f177134c);
            this.f177133b = wwrVar;
            wwrVar.m208294S((LiveBannerCardView) view);
        }
    }

    @Override // p153l.s1u
    /* JADX INFO: renamed from: c */
    public void mo184063c() {
        this.f177132a = null;
    }

    @Override // p153l.s1u
    /* JADX INFO: renamed from: d */
    public void mo184064d(Fragment fragment) {
        if (fragment instanceof LiveSquareDynamicFragment) {
            this.f177132a = (LiveSquareDynamicFragment) fragment;
        }
    }

    @Override // p153l.s1u
    /* JADX INFO: renamed from: e */
    public int mo184065e() {
        return xec0.f193865g;
    }
}
