package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import p149l.aac0;
import p149l.dti0;
import p149l.tze0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0092h.a, View.OnClickListener, ActionMenuView.InterfaceC0109a {

    /* JADX INFO: renamed from: a */
    public MenuItemImpl f319a;

    /* JADX INFO: renamed from: b */
    public CharSequence f320b;

    /* JADX INFO: renamed from: c */
    public Drawable f321c;

    /* JADX INFO: renamed from: d */
    public MenuBuilder.InterfaceC0079b f322d;

    /* JADX INFO: renamed from: e */
    public AbstractViewOnTouchListenerC0162a f323e;

    /* JADX INFO: renamed from: f */
    public AbstractC0077b f324f;

    /* JADX INFO: renamed from: g */
    public boolean f325g;

    /* JADX INFO: renamed from: h */
    public boolean f326h;

    /* JADX INFO: renamed from: i */
    public int f327i;

    /* JADX INFO: renamed from: j */
    public int f328j;

    /* JADX INFO: renamed from: k */
    public int f329k;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0076a extends AbstractViewOnTouchListenerC0162a {
        public C0076a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
        /* JADX INFO: renamed from: b */
        public tze0 mo372b() {
            AbstractC0077b abstractC0077b = ActionMenuItemView.this.f324f;
            if (abstractC0077b != null) {
                return abstractC0077b.mo374a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
        /* JADX INFO: renamed from: c */
        public boolean mo373c() {
            tze0 tze0VarMo372b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            MenuBuilder.InterfaceC0079b interfaceC0079b = actionMenuItemView.f322d;
            return interfaceC0079b != null && interfaceC0079b.mo375c(actionMenuItemView.f319a) && (tze0VarMo372b = mo372b()) != null && tze0VarMo372b.isShowing();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0077b {
        /* JADX INFO: renamed from: a */
        public abstract tze0 mo374a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f325g = m370i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aac0.f68523v, i, 0);
        this.f327i = typedArrayObtainStyledAttributes.getDimensionPixelSize(aac0.f68528w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f329k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f328j = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0109a
    /* JADX INFO: renamed from: a */
    public boolean mo367a() {
        return m369h();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0109a
    /* JADX INFO: renamed from: b */
    public boolean mo368b() {
        return m369h() && this.f319a.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092h.a
    public MenuItemImpl getItemData() {
        return this.f319a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m369h() {
        return !TextUtils.isEmpty(getText());
    }

    /* JADX INFO: renamed from: i */
    public final boolean m370i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092h.a
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.f319a = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleForItemView(this));
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f323e == null) {
            this.f323e = new C0076a();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m371j() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f320b);
        if (this.f321c != null && (!this.f319a.showsTextAsAction() || (!this.f325g && !this.f326h))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f320b : null);
        CharSequence contentDescription = this.f319a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.f319a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f319a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            dti0.m113570a(this, z3 ? null : this.f319a.getTitle());
        } else {
            dti0.m113570a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MenuBuilder.InterfaceC0079b interfaceC0079b = this.f322d;
        if (interfaceC0079b != null) {
            interfaceC0079b.mo375c(this.f319a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f325g = m370i();
        m371j();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean zM369h = m369h();
        if (zM369h && (i3 = this.f328j) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = this.f327i;
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size, iMin);
        }
        if (mode != 1073741824 && this.f327i > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM369h || this.f321c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f321c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0162a abstractViewOnTouchListenerC0162a;
        if (this.f319a.hasSubMenu() && (abstractViewOnTouchListenerC0162a = this.f323e) != null && abstractViewOnTouchListenerC0162a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092h.a
    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f326h != z) {
            this.f326h = z;
            MenuItemImpl menuItemImpl = this.f319a;
            if (menuItemImpl != null) {
                menuItemImpl.actionFormatChanged();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f321c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f329k;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m371j();
    }

    public void setItemInvoker(MenuBuilder.InterfaceC0079b interfaceC0079b) {
        this.f322d = interfaceC0079b;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f328j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0077b abstractC0077b) {
        this.f324f = abstractC0077b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f320b = charSequence;
        m371j();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
