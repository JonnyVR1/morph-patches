package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.i3c0;
import l.kvc0;
import l.mqv;
import l.nnn0;
import l.s7m;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pwl0<D extends nnn0> implements s7m<rwl0<D>> {

    /* JADX INFO: renamed from: a */
    public rwl0<D> f18943a;

    /* JADX INFO: renamed from: b */
    public ImageView f18944b;

    public pwl0(ImageView imageView) {
        this.f18944b = imageView;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20746C0() {
        return this.f18944b.getContext();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m20751i1(rwl0<D> rwl0Var) {
        this.f18943a = rwl0Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m20748d(View view) {
        this.f18943a.m21854q4(v4m0.f21444p);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m20749e(mqv mqvVar, View view) {
        this.f18943a.m21853p4(mqvVar);
        this.f18943a.m24297Z3();
    }

    /* JADX INFO: renamed from: f */
    public void m20750f(final mqv<User> mqvVar) {
        Object obj;
        if (mqvVar == null || (obj = mqvVar.a) == null) {
            ImageView imageView = this.f18944b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        User user = (User) obj;
        if (((DbObject) user).id.equals(ypv.f23196a.m23619D0())) {
            ImageView imageView2 = this.f18944b;
            if (imageView2 != null) {
                xdl0.M(imageView2, false);
                return;
            }
            return;
        }
        if (this.f18943a.m21852n4(((DbObject) user).id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.nwl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17753a.m20748d(view);
                }
            };
            ImageView imageView3 = this.f18944b;
            if (imageView3 != null) {
                imageView3.setImageDrawable(kvc0.b(i3c0.W8));
                xdl0.E0(this.f18944b, onClickListener);
            }
        } else {
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.owl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18267a.m20749e(mqvVar, view);
                }
            };
            ImageView imageView4 = this.f18944b;
            if (imageView4 != null) {
                imageView4.setImageDrawable(kvc0.b(i3c0.C9));
                xdl0.E0(this.f18944b, onClickListener2);
            }
        }
        ImageView imageView5 = this.f18944b;
        if (imageView5 != null) {
            xdl0.M(imageView5, true);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
