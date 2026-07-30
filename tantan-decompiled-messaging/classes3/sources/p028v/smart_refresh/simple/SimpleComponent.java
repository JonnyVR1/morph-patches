package p028v.smart_refresh.simple;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p003l.bnc0;
import p003l.enc0;
import p003l.fnc0;
import p003l.gnc0;
import p003l.hnc0;
import p003l.nof0;
import p028v.smart_refresh.SmartRefreshLayout;
import p028v.smart_refresh.constant.RefreshState;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class SimpleComponent extends RelativeLayout implements bnc0 {

    /* JADX INFO: renamed from: a */
    public View f13715a;

    /* JADX INFO: renamed from: b */
    public nof0 f13716b;

    /* JADX INFO: renamed from: c */
    public bnc0 f13717c;

    public SimpleComponent(@NonNull View view, @Nullable bnc0 bnc0Var) {
        super(view.getContext(), null, 0);
        this.f13715a = view;
        this.f13717c = bnc0Var;
        if ((this instanceof enc0) && (bnc0Var instanceof fnc0) && bnc0Var.getSpinnerStyle() == nof0.f5936h) {
            bnc0Var.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof fnc0) {
            bnc0 bnc0Var2 = this.f13717c;
            if ((bnc0Var2 instanceof enc0) && bnc0Var2.getSpinnerStyle() == nof0.f5936h) {
                bnc0Var.getView().setScaleY(-1.0f);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: b */
    public boolean m12289b(boolean z) {
        bnc0 bnc0Var = this.f13717c;
        return (bnc0Var instanceof enc0) && ((enc0) bnc0Var).m3911b(z);
    }

    @Override // p003l.bnc0
    /* JADX INFO: renamed from: c */
    public void mo2968c(@NonNull hnc0 hnc0Var, int i, int i2) {
        bnc0 bnc0Var = this.f13717c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.mo2968c(hnc0Var, i, i2);
    }

    @Override // p003l.bnc0
    /* JADX INFO: renamed from: d */
    public void mo2969d(float f, int i, int i2) {
        bnc0 bnc0Var = this.f13717c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.mo2969d(f, i, i2);
    }

    @Override // p003l.bnc0
    /* JADX INFO: renamed from: e */
    public boolean mo2970e() {
        bnc0 bnc0Var = this.f13717c;
        return (bnc0Var == null || bnc0Var == this || !bnc0Var.mo2970e()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bnc0) && getView() == ((bnc0) obj).getView();
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void mo2876f(@NonNull hnc0 hnc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        bnc0 bnc0Var = this.f13717c;
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
        bnc0 bnc0Var2 = this.f13717c;
        if (bnc0Var2 != null) {
            bnc0Var2.mo2876f(hnc0Var, refreshState, refreshState2);
        }
    }

    @Override // p003l.bnc0
    /* JADX INFO: renamed from: g */
    public void mo2971g(@NonNull hnc0 hnc0Var, int i, int i2) {
        bnc0 bnc0Var = this.f13717c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.mo2971g(hnc0Var, i, i2);
    }

    @Override // p003l.bnc0
    @NonNull
    public nof0 getSpinnerStyle() {
        int i;
        nof0 nof0Var = this.f13716b;
        if (nof0Var != null) {
            return nof0Var;
        }
        bnc0 bnc0Var = this.f13717c;
        if (bnc0Var != null && bnc0Var != this) {
            return bnc0Var.getSpinnerStyle();
        }
        View view = this.f13715a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.C1441m) {
                nof0 nof0Var2 = ((SmartRefreshLayout.C1441m) layoutParams).f13693b;
                this.f13716b = nof0Var2;
                if (nof0Var2 != null) {
                    return nof0Var2;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                for (nof0 nof0Var3 : nof0.f5937i) {
                    if (nof0Var3.f5940c) {
                        this.f13716b = nof0Var3;
                        return nof0Var3;
                    }
                }
            }
        }
        nof0 nof0Var4 = nof0.f5932d;
        this.f13716b = nof0Var4;
        return nof0Var4;
    }

    @Override // p003l.bnc0
    @NonNull
    public View getView() {
        View view = this.f13715a;
        return view == null ? this : view;
    }

    /* JADX INFO: renamed from: h */
    public int mo2972h(@NonNull hnc0 hnc0Var, boolean z) {
        bnc0 bnc0Var = this.f13717c;
        if (bnc0Var == null || bnc0Var == this) {
            return 0;
        }
        return bnc0Var.mo2972h(hnc0Var, z);
    }

    /* JADX INFO: renamed from: i */
    public void mo2973i(@NonNull gnc0 gnc0Var, int i, int i2) {
        bnc0 bnc0Var = this.f13717c;
        if (bnc0Var != null && bnc0Var != this) {
            bnc0Var.mo2973i(gnc0Var, i, i2);
            return;
        }
        View view = this.f13715a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.C1441m) {
                gnc0Var.mo4651b(this, ((SmartRefreshLayout.C1441m) layoutParams).f13692a);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo2974l(boolean z, float f, int i, int i2, int i3) {
        bnc0 bnc0Var = this.f13717c;
        if (bnc0Var == null || bnc0Var == this) {
            return;
        }
        bnc0Var.mo2974l(z, f, i, i2, i3);
    }

    @Override // p003l.bnc0
    public void setPrimaryColors(@ColorInt int... iArr) {
        bnc0 bnc0Var = this.f13717c;
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
