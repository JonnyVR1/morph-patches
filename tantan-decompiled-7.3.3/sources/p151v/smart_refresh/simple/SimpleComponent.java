package p151v.smart_refresh.simple;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.constant.RefreshState;
import p153l.gvc0;
import p153l.jvc0;
import p153l.kvc0;
import p153l.lvc0;
import p153l.mvc0;
import p153l.wwf0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleComponent extends RelativeLayout implements gvc0 {

    /* JADX INFO: renamed from: a */
    public View f211012a;

    /* JADX INFO: renamed from: b */
    public wwf0 f211013b;

    /* JADX INFO: renamed from: c */
    public gvc0 f211014c;

    public SimpleComponent(@NonNull View view, @Nullable gvc0 gvc0Var) {
        super(view.getContext(), null, 0);
        this.f211012a = view;
        this.f211014c = gvc0Var;
        if ((this instanceof jvc0) && (gvc0Var instanceof kvc0) && gvc0Var.getSpinnerStyle() == wwf0.f191271h) {
            gvc0Var.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof kvc0) {
            gvc0 gvc0Var2 = this.f211014c;
            if ((gvc0Var2 instanceof jvc0) && gvc0Var2.getSpinnerStyle() == wwf0.f191271h) {
                gvc0Var.getView().setScaleY(-1.0f);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: b */
    public boolean m225029b(boolean z) {
        gvc0 gvc0Var = this.f211014c;
        return (gvc0Var instanceof jvc0) && ((jvc0) gvc0Var).m147010b(z);
    }

    @Override // p153l.gvc0
    /* JADX INFO: renamed from: c */
    public void mo132526c(@NonNull mvc0 mvc0Var, int i, int i2) {
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var == null || gvc0Var == this) {
            return;
        }
        gvc0Var.mo132526c(mvc0Var, i, i2);
    }

    @Override // p153l.gvc0
    /* JADX INFO: renamed from: d */
    public void mo132527d(float f, int i, int i2) {
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var == null || gvc0Var == this) {
            return;
        }
        gvc0Var.mo132527d(f, i, i2);
    }

    @Override // p153l.gvc0
    /* JADX INFO: renamed from: e */
    public boolean mo132528e() {
        gvc0 gvc0Var = this.f211014c;
        return (gvc0Var == null || gvc0Var == this || !gvc0Var.mo132528e()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof gvc0) && getView() == ((gvc0) obj).getView();
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void mo56941f(@NonNull mvc0 mvc0Var, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var == null || gvc0Var == this) {
            return;
        }
        if ((this instanceof jvc0) && (gvc0Var instanceof kvc0)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.toHeader();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.toHeader();
            }
        } else if ((this instanceof kvc0) && (gvc0Var instanceof jvc0)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.toFooter();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.toFooter();
            }
        }
        gvc0 gvc0Var2 = this.f211014c;
        if (gvc0Var2 != null) {
            gvc0Var2.mo56941f(mvc0Var, refreshState, refreshState2);
        }
    }

    @Override // p153l.gvc0
    /* JADX INFO: renamed from: g */
    public void mo132529g(@NonNull mvc0 mvc0Var, int i, int i2) {
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var == null || gvc0Var == this) {
            return;
        }
        gvc0Var.mo132529g(mvc0Var, i, i2);
    }

    @Override // p153l.gvc0
    @NonNull
    public wwf0 getSpinnerStyle() {
        int i;
        wwf0 wwf0Var = this.f211013b;
        if (wwf0Var != null) {
            return wwf0Var;
        }
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var != null && gvc0Var != this) {
            return gvc0Var.getSpinnerStyle();
        }
        View view = this.f211012a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.C22763m) {
                wwf0 wwf0Var2 = ((SmartRefreshLayout.C22763m) layoutParams).f210990b;
                this.f211013b = wwf0Var2;
                if (wwf0Var2 != null) {
                    return wwf0Var2;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                for (wwf0 wwf0Var3 : wwf0.f191272i) {
                    if (wwf0Var3.f191275c) {
                        this.f211013b = wwf0Var3;
                        return wwf0Var3;
                    }
                }
            }
        }
        wwf0 wwf0Var4 = wwf0.f191267d;
        this.f211013b = wwf0Var4;
        return wwf0Var4;
    }

    @Override // p153l.gvc0
    @NonNull
    public View getView() {
        View view = this.f211012a;
        return view == null ? this : view;
    }

    /* JADX INFO: renamed from: h */
    public int mo132530h(@NonNull mvc0 mvc0Var, boolean z) {
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var == null || gvc0Var == this) {
            return 0;
        }
        return gvc0Var.mo132530h(mvc0Var, z);
    }

    /* JADX INFO: renamed from: i */
    public void mo132531i(@NonNull lvc0 lvc0Var, int i, int i2) {
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var != null && gvc0Var != this) {
            gvc0Var.mo132531i(lvc0Var, i, i2);
            return;
        }
        View view = this.f211012a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.C22763m) {
                lvc0Var.mo155984b(this, ((SmartRefreshLayout.C22763m) layoutParams).f210989a);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo132532l(boolean z, float f, int i, int i2, int i3) {
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var == null || gvc0Var == this) {
            return;
        }
        gvc0Var.mo132532l(z, f, i, i2, i3);
    }

    @Override // p153l.gvc0
    public void setPrimaryColors(@ColorInt int... iArr) {
        gvc0 gvc0Var = this.f211014c;
        if (gvc0Var == null || gvc0Var == this) {
            return;
        }
        gvc0Var.setPrimaryColors(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleComponent(@NonNull View view) {
        this(view, view instanceof gvc0 ? (gvc0) view : null);
    }

    public SimpleComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
