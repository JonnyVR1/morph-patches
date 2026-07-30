package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class sxo0<D extends nnn0> implements s7m<uxo0<D>> {

    /* JADX INFO: renamed from: a */
    public uxo0<D> f166811a;

    /* JADX INFO: renamed from: b */
    public ImageView f166812b;

    public sxo0(ImageView imageView) {
        this.f166812b = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m186529d(View view) {
        this.f166811a.m196192r4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m186530e(mqv mqvVar, View view) {
        this.f166811a.m196191q4(mqvVar);
        this.f166811a.m203470Z3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f166812b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(uxo0<D> uxo0Var) {
        this.f166811a = uxo0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m186532f(final mqv<User> mqvVar) {
        if (mqvVar == null || mqvVar.f135304a == null || !this.f166811a.m196190o4()) {
            ImageView imageView = this.f166812b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        User user = mqvVar.f135304a;
        if (d1t.m109678a(mqvVar).m109681d() ? user.f56011id.equals(w220.m201014a()) : user.f56011id.equals(ypv.f199493a.m199309D0())) {
            ImageView imageView2 = this.f166812b;
            if (imageView2 != null) {
                xdl0.m208344M(imageView2, false);
                return;
            }
            return;
        }
        if (this.f166811a.m196189n4(user.f56011id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.qxo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156858a.m186529d(view);
                }
            };
            ImageView imageView3 = this.f166812b;
            if (imageView3 != null) {
                imageView3.setImageDrawable(kvc0.m147353b(i3c0.f110902W8));
                xdl0.m208329E0(this.f166812b, onClickListener);
            }
        } else {
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.rxo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161491a.m186530e(mqvVar, view);
                }
            };
            ImageView imageView4 = this.f166812b;
            if (imageView4 != null) {
                imageView4.setImageDrawable(kvc0.m147353b(i3c0.f110671C9));
                xdl0.m208329E0(this.f166812b, onClickListener2);
            }
        }
        ImageView imageView5 = this.f166812b;
        if (imageView5 != null) {
            xdl0.m208344M(imageView5, true);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
