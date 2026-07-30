package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class lje implements iam<yj2> {

    /* JADX INFO: renamed from: a */
    public yj2 f132328a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f132329b;

    public lje(FrameLayout frameLayout) {
        this.f132329b = frameLayout;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo22061C0() {
        return this.f132329b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yj2 yj2Var) {
        this.f132328a = yj2Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
