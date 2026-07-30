package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import p153l.gic0;
import p153l.kfc0;
import p153l.kkl0;
import p153l.s8c0;
import p153l.t0j0;
import p153l.xdc0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements InterfaceC0093h.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public MenuItemImpl f334a;

    /* JADX INFO: renamed from: b */
    public ImageView f335b;

    /* JADX INFO: renamed from: c */
    public RadioButton f336c;

    /* JADX INFO: renamed from: d */
    public TextView f337d;

    /* JADX INFO: renamed from: e */
    public CheckBox f338e;

    /* JADX INFO: renamed from: f */
    public TextView f339f;

    /* JADX INFO: renamed from: g */
    public ImageView f340g;

    /* JADX INFO: renamed from: h */
    public ImageView f341h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f342i;

    /* JADX INFO: renamed from: j */
    public Drawable f343j;

    /* JADX INFO: renamed from: k */
    public int f344k;

    /* JADX INFO: renamed from: l */
    public Context f345l;

    /* JADX INFO: renamed from: m */
    public boolean f346m;

    /* JADX INFO: renamed from: n */
    public Drawable f347n;

    /* JADX INFO: renamed from: o */
    public boolean f348o;

    /* JADX INFO: renamed from: p */
    public int f349p;

    /* JADX INFO: renamed from: q */
    public LayoutInflater f350q;

    /* JADX INFO: renamed from: r */
    public boolean f351r;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        t0j0 t0j0VarM188782u = t0j0.m188782u(getContext(), attributeSet, gic0.f104334X1, i, 0);
        this.f343j = t0j0VarM188782u.m188789g(gic0.f104342Z1);
        this.f344k = t0j0VarM188782u.m188796n(gic0.f104338Y1, -1);
        this.f346m = t0j0VarM188782u.m188783a(gic0.f104347a2, false);
        this.f345l = context;
        this.f347n = t0j0VarM188782u.m188789g(gic0.f104352b2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, s8c0.f166766C, 0);
        this.f348o = typedArrayObtainStyledAttributes.hasValue(0);
        t0j0VarM188782u.m188801v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f350q == null) {
            this.f350q = LayoutInflater.from(getContext());
        }
        return this.f350q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f340g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m377a(View view) {
        m378b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f341h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f341h.getLayoutParams();
        rect.top += this.f341h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    public final void m378b(View view, int i) {
        LinearLayout linearLayout = this.f342i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m379c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(kfc0.f126274j, (ViewGroup) this, false);
        this.f338e = checkBox;
        m377a(checkBox);
    }

    /* JADX INFO: renamed from: d */
    public final void m380d() {
        ImageView imageView = (ImageView) getInflater().inflate(kfc0.f126275k, (ViewGroup) this, false);
        this.f335b = imageView;
        m378b(imageView, 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m381e() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(kfc0.f126277m, (ViewGroup) this, false);
        this.f336c = radioButton;
        m377a(radioButton);
    }

    /* JADX INFO: renamed from: f */
    public void m382f(boolean z, char c) {
        int i = (z && this.f334a.shouldShowShortcut()) ? 0 : 8;
        if (i == 0) {
            this.f339f.setText(this.f334a.getShortcutLabel());
        }
        if (this.f339f.getVisibility() != i) {
            this.f339f.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093h.a
    public MenuItemImpl getItemData() {
        return this.f334a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093h.a
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.f334a = menuItemImpl;
        this.f349p = i;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.getTitleForItemView(this));
        setCheckable(menuItemImpl.isCheckable());
        m382f(menuItemImpl.shouldShowShortcut(), menuItemImpl.getShortcut());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        kkl0.m150170m0(this, this.f343j);
        TextView textView = (TextView) findViewById(xdc0.f193552S);
        this.f337d = textView;
        int i = this.f344k;
        if (i != -1) {
            textView.setTextAppearance(this.f345l, i);
        }
        this.f339f = (TextView) findViewById(xdc0.f193545L);
        ImageView imageView = (ImageView) findViewById(xdc0.f193548O);
        this.f340g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f347n);
        }
        this.f341h = (ImageView) findViewById(xdc0.f193576u);
        this.f342i = (LinearLayout) findViewById(xdc0.f193568m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f335b != null && this.f346m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f335b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093h.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f336c == null && this.f338e == null) {
            return;
        }
        if (this.f334a.isExclusiveCheckable()) {
            if (this.f336c == null) {
                m381e();
            }
            compoundButton = this.f336c;
            view = this.f338e;
        } else {
            if (this.f338e == null) {
                m379c();
            }
            compoundButton = this.f338e;
            view = this.f336c;
        }
        if (z) {
            compoundButton.setChecked(this.f334a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f338e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f336c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f334a.isExclusiveCheckable()) {
            if (this.f336c == null) {
                m381e();
            }
            compoundButton = this.f336c;
        } else {
            if (this.f338e == null) {
                m379c();
            }
            compoundButton = this.f338e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f351r = z;
        this.f346m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f341h;
        if (imageView != null) {
            imageView.setVisibility((this.f348o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f334a.shouldShowIcon() || this.f351r;
        if (z || this.f346m) {
            ImageView imageView = this.f335b;
            if (imageView == null && drawable == null && !this.f346m) {
                return;
            }
            if (imageView == null) {
                m380d();
            }
            if (drawable == null && !this.f346m) {
                this.f335b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f335b;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f335b.getVisibility() != 0) {
                this.f335b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f337d;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f337d.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f337d.getVisibility() != 0) {
                this.f337d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s8c0.f166769F);
    }
}
