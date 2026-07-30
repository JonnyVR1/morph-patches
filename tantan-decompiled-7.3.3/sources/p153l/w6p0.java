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
public class w6p0<D extends rwn0> implements iam<y6p0<D>> {

    /* JADX INFO: renamed from: a */
    public y6p0<D> f187642a;

    /* JADX INFO: renamed from: b */
    public ImageView f187643b;

    public w6p0(ImageView imageView) {
        this.f187643b = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m205191d(View view) {
        this.f187642a.m214492r4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m205192e(nsv nsvVar, View view) {
        this.f187642a.m214491q4(nsvVar);
        this.f187642a.m100211Z3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f187643b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(y6p0<D> y6p0Var) {
        this.f187642a = y6p0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m205194f(final nsv<User> nsvVar) {
        if (nsvVar == null || nsvVar.f143542a == null || !this.f187642a.m214490o4()) {
            ImageView imageView = this.f187643b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        User user = nsvVar.f143542a;
        if (e3t.m119319a(nsvVar).m119322d() ? user.f56859id.equals(eb20.m120148a()) : user.f56859id.equals(zrv.f205799a.m207631D0())) {
            ImageView imageView2 = this.f187643b;
            if (imageView2 != null) {
                bnl0.m105524M(imageView2, false);
                return;
            }
            return;
        }
        if (this.f187642a.m214489n4(user.f56859id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.u6p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177800a.m205191d(view);
                }
            };
            ImageView imageView3 = this.f187643b;
            if (imageView3 != null) {
                imageView3.setImageDrawable(n3d0.m161278b(obc0.f146230W8));
                bnl0.m105509E0(this.f187643b, onClickListener);
            }
        } else {
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.v6p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182676a.m205192e(nsvVar, view);
                }
            };
            ImageView imageView4 = this.f187643b;
            if (imageView4 != null) {
                imageView4.setImageDrawable(n3d0.m161278b(obc0.f145999C9));
                bnl0.m105509E0(this.f187643b, onClickListener2);
            }
        }
        ImageView imageView5 = this.f187643b;
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
