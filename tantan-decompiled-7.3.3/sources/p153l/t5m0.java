package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class t5m0<D extends rwn0> implements iam<v5m0<D>> {

    /* JADX INFO: renamed from: a */
    public v5m0<D> f172216a;

    /* JADX INFO: renamed from: b */
    public ImageView f172217b;

    public t5m0(ImageView imageView) {
        this.f172217b = imageView;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f172217b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v5m0<D> v5m0Var) {
        this.f172216a = v5m0Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m189410d(View view) {
        this.f172216a.m199912q4(zdm0.f203894p);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m189411e(nsv nsvVar, View view) {
        this.f172216a.m199911p4(nsvVar);
        this.f172216a.m100211Z3();
    }

    /* JADX INFO: renamed from: f */
    public void m189412f(final nsv<User> nsvVar) {
        User user;
        if (nsvVar == null || (user = nsvVar.f143542a) == null) {
            ImageView imageView = this.f172217b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        User user2 = user;
        if (user2.f56859id.equals(zrv.f205799a.m207631D0())) {
            ImageView imageView2 = this.f172217b;
            if (imageView2 != null) {
                bnl0.m105524M(imageView2, false);
                return;
            }
            return;
        }
        if (this.f172216a.m199910n4(user2.f56859id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.r5m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161362a.m189410d(view);
                }
            };
            ImageView imageView3 = this.f172217b;
            if (imageView3 != null) {
                imageView3.setImageDrawable(n3d0.m161278b(obc0.f146230W8));
                bnl0.m105509E0(this.f172217b, onClickListener);
            }
        } else {
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.s5m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166438a.m189411e(nsvVar, view);
                }
            };
            ImageView imageView4 = this.f172217b;
            if (imageView4 != null) {
                imageView4.setImageDrawable(n3d0.m161278b(obc0.f145999C9));
                bnl0.m105509E0(this.f172217b, onClickListener2);
            }
        }
        ImageView imageView5 = this.f172217b;
        if (imageView5 != null) {
            bnl0.m105524M(imageView5, true);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
