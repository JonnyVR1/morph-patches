package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hie implements s7m<qj2> {

    /* JADX INFO: renamed from: a */
    public qj2 f12046a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f12047b;

    public hie(FrameLayout frameLayout) {
        this.f12047b = frameLayout;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14385C0() {
        return this.f12047b.getContext();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m14387i1(qj2 qj2Var) {
        this.f12046a = qj2Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
