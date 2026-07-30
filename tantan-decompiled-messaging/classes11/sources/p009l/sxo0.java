package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.d1t;
import l.i3c0;
import l.kvc0;
import l.mqv;
import l.nnn0;
import l.s7m;
import l.w220;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sxo0<D extends nnn0> implements s7m<uxo0<D>> {

    /* JADX INFO: renamed from: a */
    public uxo0<D> f20493a;

    /* JADX INFO: renamed from: b */
    public ImageView f20494b;

    public sxo0(ImageView imageView) {
        this.f20494b = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m22410d(View view) {
        this.f20493a.m23185r4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m22411e(mqv mqvVar, View view) {
        this.f20493a.m23184q4(mqvVar);
        this.f20493a.m24297Z3();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22412C0() {
        return this.f20494b.getContext();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m22415i1(uxo0<D> uxo0Var) {
        this.f20493a = uxo0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m22414f(final mqv<User> mqvVar) {
        if (mqvVar == null || mqvVar.a == null || !this.f20493a.m23183o4()) {
            ImageView imageView = this.f20494b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        User user = (User) mqvVar.a;
        if (d1t.a(mqvVar).d() ? ((DbObject) user).id.equals(w220.a()) : ((DbObject) user).id.equals(ypv.f23196a.m23619D0())) {
            ImageView imageView2 = this.f20494b;
            if (imageView2 != null) {
                xdl0.M(imageView2, false);
                return;
            }
            return;
        }
        if (this.f20493a.m23182n4(((DbObject) user).id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.qxo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19574a.m22410d(view);
                }
            };
            ImageView imageView3 = this.f20494b;
            if (imageView3 != null) {
                imageView3.setImageDrawable(kvc0.b(i3c0.W8));
                xdl0.E0(this.f20494b, onClickListener);
            }
        } else {
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.rxo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20021a.m22411e(mqvVar, view);
                }
            };
            ImageView imageView4 = this.f20494b;
            if (imageView4 != null) {
                imageView4.setImageDrawable(kvc0.b(i3c0.C9));
                xdl0.E0(this.f20494b, onClickListener2);
            }
        }
        ImageView imageView5 = this.f20494b;
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
