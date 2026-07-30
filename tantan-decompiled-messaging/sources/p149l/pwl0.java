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
public class pwl0<D extends nnn0> implements s7m<rwl0<D>> {

    /* JADX INFO: renamed from: a */
    public rwl0<D> f151582a;

    /* JADX INFO: renamed from: b */
    public ImageView f151583b;

    public pwl0(ImageView imageView) {
        this.f151583b = imageView;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f151583b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rwl0<D> rwl0Var) {
        this.f151582a = rwl0Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m171757d(View view) {
        this.f151582a.m181436q4(v4m0.f179941p);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m171758e(mqv mqvVar, View view) {
        this.f151582a.m181435p4(mqvVar);
        this.f151582a.m203470Z3();
    }

    /* JADX INFO: renamed from: f */
    public void m171759f(final mqv<User> mqvVar) {
        User user;
        if (mqvVar == null || (user = mqvVar.f135304a) == null) {
            ImageView imageView = this.f151583b;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        User user2 = user;
        if (user2.f56011id.equals(ypv.f199493a.m199309D0())) {
            ImageView imageView2 = this.f151583b;
            if (imageView2 != null) {
                xdl0.m208344M(imageView2, false);
                return;
            }
            return;
        }
        if (this.f151582a.m181434n4(user2.f56011id)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.nwl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140954a.m171757d(view);
                }
            };
            ImageView imageView3 = this.f151583b;
            if (imageView3 != null) {
                imageView3.setImageDrawable(kvc0.m147353b(i3c0.f110902W8));
                xdl0.m208329E0(this.f151583b, onClickListener);
            }
        } else {
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.owl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f146069a.m171758e(mqvVar, view);
                }
            };
            ImageView imageView4 = this.f151583b;
            if (imageView4 != null) {
                imageView4.setImageDrawable(kvc0.m147353b(i3c0.f110671C9));
                xdl0.m208329E0(this.f151583b, onClickListener2);
            }
        }
        ImageView imageView5 = this.f151583b;
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
