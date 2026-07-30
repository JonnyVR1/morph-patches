package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class hie implements s7m<qj2> {

    /* JADX INFO: renamed from: a */
    public qj2 f107921a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f107922b;

    public hie(FrameLayout frameLayout) {
        this.f107922b = frameLayout;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo21062C0() {
        return this.f107922b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qj2 qj2Var) {
        this.f107921a = qj2Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
