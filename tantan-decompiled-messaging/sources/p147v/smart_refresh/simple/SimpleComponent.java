package p147v.smart_refresh.simple;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.constant.RefreshState;
import p149l.bnc0;
import p149l.enc0;
import p149l.fnc0;
import p149l.gnc0;
import p149l.hnc0;
import p149l.nof0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleComponent extends RelativeLayout implements bnc0 {

    /* JADX INFO: renamed from: a */
    public View f210090a;

    /* JADX INFO: renamed from: b */
    public nof0 f210091b;

    /* JADX INFO: renamed from: c */
    public bnc0 f210092c;

    public SimpleComponent(@NonNull View view, @Nullable bnc0 bnc0Var) {
        super(view.getContext(), null, 0);
        this.f210090a = view;
        this.f210092c = bnc0Var;
        if ((this instanceof enc0) && (bnc0Var instanceof fnc0) && bnc0Var.getSpinnerStyle() == nof0.f139835h) {
            bnc0Var.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof fnc0) {
            bnc0 bnc0Var2 = this.f210092c;
            if ((bnc0Var2 instanceof enc0) && bnc0Var2.getSpinnerStyle() == nof0.f139835h) {
                bnc0Var.getView().setScaleY(-1.0f);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: b */
    public boolean m223783b(boolean z) {
        bnc0 bnc0Var = this.f210092c;
        return (bnc0Var instanceof enc0) && ((enc0) bnc0Var).m117257b(z);
    }

    @Override // p149l.bnc0
    /* JADX INFO: renamed from: c */
    public void mo102765c(@NonNull hnc0 hnc0Var, int i, int i2) {
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.mo102765c(hnc0Var, i, i2);
    }

    @Override // p149l.bnc0
    /* JADX INFO: renamed from: d */
    public void mo102766d(float f, int i, int i2) {
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.mo102766d(f, i, i2);
    }

    @Override // p149l.bnc0
    /* JADX INFO: renamed from: e */
    public boolean mo102767e() {
        bnc0 bnc0Var = this.f210092c;
        return (bnc0Var == null || bnc0Var == this || !bnc0Var.mo102767e()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bnc0) && getView() == ((bnc0) obj).getView();
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void mo55758f(@NonNull hnc0 hnc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        if ((this instanceof enc0) && (bnc0Var instanceof fnc0)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.toHeader();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.toHeader();
            }
        } else if ((this instanceof fnc0) && (bnc0Var instanceof enc0)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.toFooter();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.toFooter();
            }
        }
        bnc0 bnc0Var2 = this.f210092c;
        if (bnc0Var2 != null) {
            bnc0Var2.mo55758f(hnc0Var, refreshState, refreshState2);
        }
    }

    @Override // p149l.bnc0
    /* JADX INFO: renamed from: g */
    public void mo102768g(@NonNull hnc0 hnc0Var, int i, int i2) {
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.mo102768g(hnc0Var, i, i2);
    }

    @Override // p149l.bnc0
    @NonNull
    public nof0 getSpinnerStyle() {
        int i;
        nof0 nof0Var = this.f210091b;
        if (nof0Var != null) {
            return nof0Var;
        }
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var != null && bnc0Var != this) {
            return bnc0Var.getSpinnerStyle();
        }
        View view = this.f210090a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.C22648m) {
                nof0 nof0Var2 = ((SmartRefreshLayout.C22648m) layoutParams).f210068b;
                this.f210091b = nof0Var2;
                if (nof0Var2 != null) {
                    return nof0Var2;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                for (nof0 nof0Var3 : nof0.f139836i) {
                    if (nof0Var3.f139839c) {
                        this.f210091b = nof0Var3;
                        return nof0Var3;
                    }
                }
            }
        }
        nof0 nof0Var4 = nof0.f139831d;
        this.f210091b = nof0Var4;
        return nof0Var4;
    }

    @Override // p149l.bnc0
    @NonNull
    public View getView() {
        View view = this.f210090a;
        return view == null ? this : view;
    }

    /* JADX INFO: renamed from: h */
    public int mo102769h(@NonNull hnc0 hnc0Var, boolean z) {
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var == null || bnc0Var == this) {
            return 0;
        }
        return bnc0Var.mo102769h(hnc0Var, z);
    }

    /* JADX INFO: renamed from: i */
    public void mo102770i(@NonNull gnc0 gnc0Var, int i, int i2) {
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var != null && bnc0Var != this) {
            bnc0Var.mo102770i(gnc0Var, i, i2);
            return;
        }
        View view = this.f210090a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.C22648m) {
                gnc0Var.mo127122b(this, ((SmartRefreshLayout.C22648m) layoutParams).f210067a);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo102771l(boolean z, float f, int i, int i2, int i3) {
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.mo102771l(z, f, i, i2, i3);
    }

    @Override // p149l.bnc0
    public void setPrimaryColors(@ColorInt int... iArr) {
        bnc0 bnc0Var = this.f210092c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.setPrimaryColors(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleComponent(@NonNull View view) {
        this(view, view instanceof bnc0 ? (bnc0) view : null);
    }

    public SimpleComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
