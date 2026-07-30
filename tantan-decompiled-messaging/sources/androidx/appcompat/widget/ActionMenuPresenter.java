package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.AbstractC0085a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0090f;
import androidx.appcompat.view.menu.InterfaceC0091g;
import androidx.appcompat.view.menu.InterfaceC0092h;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuC0094j;
import java.util.ArrayList;
import p149l.dti0;
import p149l.g7c0;
import p149l.kbe;
import p149l.l30;
import p149l.n0c0;
import p149l.tze0;
import p149l.z30;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter extends AbstractC0085a implements z30.InterfaceC21612a {

    /* JADX INFO: renamed from: A */
    public RunnableC0106c f534A;

    /* JADX INFO: renamed from: B */
    public C0105b f535B;

    /* JADX INFO: renamed from: C */
    public final C0108e f536C;

    /* JADX INFO: renamed from: D */
    public int f537D;

    /* JADX INFO: renamed from: k */
    public OverflowMenuButton f538k;

    /* JADX INFO: renamed from: l */
    public Drawable f539l;

    /* JADX INFO: renamed from: m */
    public boolean f540m;

    /* JADX INFO: renamed from: n */
    public boolean f541n;

    /* JADX INFO: renamed from: o */
    public boolean f542o;

    /* JADX INFO: renamed from: p */
    public int f543p;

    /* JADX INFO: renamed from: q */
    public int f544q;

    /* JADX INFO: renamed from: r */
    public int f545r;

    /* JADX INFO: renamed from: s */
    public boolean f546s;

    /* JADX INFO: renamed from: t */
    public boolean f547t;

    /* JADX INFO: renamed from: u */
    public boolean f548u;

    /* JADX INFO: renamed from: v */
    public boolean f549v;

    /* JADX INFO: renamed from: w */
    public int f550w;

    /* JADX INFO: renamed from: x */
    public final SparseBooleanArray f551x;

    /* JADX INFO: renamed from: y */
    public C0107d f552y;

    /* JADX INFO: renamed from: z */
    public C0104a f553z;

    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.InterfaceC0109a {

        /* JADX INFO: renamed from: c */
        public final float[] f554c;

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$a */
        public class C0102a extends AbstractViewOnTouchListenerC0162a {

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ ActionMenuPresenter f556j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0102a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f556j = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
            /* JADX INFO: renamed from: b */
            public tze0 mo372b() {
                C0107d c0107d = ActionMenuPresenter.this.f552y;
                if (c0107d == null) {
                    return null;
                }
                return c0107d.m435c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
            /* JADX INFO: renamed from: c */
            public boolean mo373c() {
                ActionMenuPresenter.this.m498C();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0162a
            /* JADX INFO: renamed from: d */
            public boolean mo510d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f534A != null) {
                    return false;
                }
                actionMenuPresenter.m503t();
                return true;
            }
        }

        public OverflowMenuButton(Context context) {
            super(context, null, n0c0.f136520l);
            this.f554c = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            dti0.m113570a(this, getContentDescription());
            setOnTouchListener(new C0102a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0109a
        /* JADX INFO: renamed from: a */
        public boolean mo367a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0109a
        /* JADX INFO: renamed from: b */
        public boolean mo368b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m498C();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                kbe.m145278l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C0104a extends C0090f {
        public C0104a(Context context, SubMenuC0094j subMenuC0094j, View view) {
            super(context, subMenuC0094j, view, false, n0c0.f136521m);
            if (!((MenuItemImpl) subMenuC0094j.getItem()).isActionButton()) {
                View view2 = ActionMenuPresenter.this.f538k;
                m438f(view2 == null ? (View) ActionMenuPresenter.this.f372i : view2);
            }
            m442j(ActionMenuPresenter.this.f536C);
        }

        @Override // androidx.appcompat.view.menu.C0090f
        /* JADX INFO: renamed from: e */
        public void mo437e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f553z = null;
            actionMenuPresenter.f537D = 0;
            super.mo437e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    public class C0105b extends ActionMenuItemView.AbstractC0077b {
        public C0105b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0077b
        /* JADX INFO: renamed from: a */
        public tze0 mo374a() {
            C0104a c0104a = ActionMenuPresenter.this.f553z;
            if (c0104a != null) {
                return c0104a.m435c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class RunnableC0106c implements Runnable {

        /* JADX INFO: renamed from: a */
        public C0107d f560a;

        public RunnableC0106c(C0107d c0107d) {
            this.f560a = c0107d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.f366c != null) {
                ActionMenuPresenter.this.f366c.changeMenuMode();
            }
            View view = (View) ActionMenuPresenter.this.f372i;
            if (view != null && view.getWindowToken() != null && this.f560a.m445m()) {
                ActionMenuPresenter.this.f552y = this.f560a;
            }
            ActionMenuPresenter.this.f534A = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C0107d extends C0090f {
        public C0107d(Context context, MenuBuilder menuBuilder, View view, boolean z) {
            super(context, menuBuilder, view, z, n0c0.f136521m);
            m440h(8388613);
            m442j(ActionMenuPresenter.this.f536C);
        }

        @Override // androidx.appcompat.view.menu.C0090f
        /* JADX INFO: renamed from: e */
        public void mo437e() {
            if (ActionMenuPresenter.this.f366c != null) {
                ActionMenuPresenter.this.f366c.close();
            }
            ActionMenuPresenter.this.f552y = null;
            super.mo437e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C0108e implements InterfaceC0091g.a {
        public C0108e() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
        /* JADX INFO: renamed from: a */
        public boolean mo345a(MenuBuilder menuBuilder) {
            if (menuBuilder == null) {
                return false;
            }
            ActionMenuPresenter.this.f537D = ((SubMenuC0094j) menuBuilder).getItem().getItemId();
            InterfaceC0091g.a aVarM396f = ActionMenuPresenter.this.m396f();
            if (aVarM396f != null) {
                return aVarM396f.mo345a(menuBuilder);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuC0094j) {
                menuBuilder.getRootMenu().close(false);
            }
            InterfaceC0091g.a aVarM396f = ActionMenuPresenter.this.m396f();
            if (aVarM396f != null) {
                aVarM396f.onCloseMenu(menuBuilder, z);
            }
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, g7c0.f101355c, g7c0.f101354b);
        this.f551x = new SparseBooleanArray();
        this.f536C = new C0108e();
    }

    /* JADX INFO: renamed from: A */
    public void m496A(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.f538k;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            this.f540m = true;
            this.f539l = drawable;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m497B(boolean z) {
        this.f541n = z;
        this.f542o = true;
    }

    /* JADX INFO: renamed from: C */
    public boolean m498C() {
        MenuBuilder menuBuilder;
        if (!this.f541n || m506w() || (menuBuilder = this.f366c) == null || this.f372i == null || this.f534A != null || menuBuilder.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC0106c runnableC0106c = new RunnableC0106c(new C0107d(this.f365b, this.f366c, this.f538k, true));
        this.f534A = runnableC0106c;
        ((View) this.f372i).post(runnableC0106c);
        super.onSubMenuSelected(null);
        return true;
    }

    @Override // p149l.z30.InterfaceC21612a
    /* JADX INFO: renamed from: a */
    public void mo499a(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            return;
        }
        MenuBuilder menuBuilder = this.f366c;
        if (menuBuilder != null) {
            menuBuilder.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a
    /* JADX INFO: renamed from: c */
    public void mo393c(MenuItemImpl menuItemImpl, InterfaceC0092h.a aVar) {
        aVar.initialize(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f372i);
        if (this.f535B == null) {
            this.f535B = new C0105b();
        }
        actionMenuItemView.setPopupCallback(this.f535B);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a
    /* JADX INFO: renamed from: e */
    public boolean mo395e(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f538k) {
            return false;
        }
        return super.mo395e(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.MenuItemImpl] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public boolean flagActionItems() {
        ArrayList<MenuItemImpl> visibleItems;
        int size;
        int i;
        int iM513n;
        ?? r0;
        ActionMenuPresenter actionMenuPresenter = this;
        MenuBuilder menuBuilder = actionMenuPresenter.f366c;
        View view = null;
        ?? r3 = 0;
        if (menuBuilder != null) {
            visibleItems = menuBuilder.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i2 = actionMenuPresenter.f545r;
        int i3 = actionMenuPresenter.f544q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f372i;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItemImpl menuItemImpl = visibleItems.get(i6);
            if (menuItemImpl.requiresActionButton()) {
                i4++;
            } else if (menuItemImpl.requestsActionButton()) {
                i5++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f549v && menuItemImpl.isActionViewExpanded()) {
                i2 = 0;
            }
        }
        if (actionMenuPresenter.f541n && (z || i5 + i4 > i2)) {
            i2--;
        }
        int i7 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f551x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f547t) {
            int i8 = actionMenuPresenter.f550w;
            iM513n = i3 / i8;
            i = i8 + ((i3 % i8) / iM513n);
        } else {
            i = 0;
            iM513n = 0;
        }
        int i9 = 0;
        int i10 = 0;
        ?? r1 = actionMenuPresenter;
        while (i9 < size) {
            MenuItemImpl menuItemImpl2 = visibleItems.get(i9);
            if (menuItemImpl2.requiresActionButton()) {
                View viewMo397g = r1.mo397g(menuItemImpl2, view, viewGroup);
                if (r1.f547t) {
                    iM513n -= ActionMenuView.m513n(viewMo397g, i, iM513n, iMakeMeasureSpec, r3);
                } else {
                    viewMo397g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewMo397g.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                menuItemImpl2.setIsActionButton(true);
                r0 = r3;
            } else if (menuItemImpl2.requestsActionButton()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i7 > 0 || z2) && i3 > 0 && (!r1.f547t || iM513n > 0);
                boolean z4 = z3;
                if (z3) {
                    View viewMo397g2 = r1.mo397g(menuItemImpl2, null, viewGroup);
                    if (r1.f547t) {
                        int iM513n2 = ActionMenuView.m513n(viewMo397g2, i, iM513n, iMakeMeasureSpec, 0);
                        iM513n -= iM513n2;
                        if (iM513n2 == 0) {
                            z4 = false;
                        }
                    } else {
                        viewMo397g2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = viewMo397g2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z3 = z5 & (!r1.f547t ? i3 + i10 <= 0 : i3 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i11 = 0; i11 < i9; i11++) {
                        MenuItemImpl menuItemImpl3 = visibleItems.get(i11);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.isActionButton()) {
                                i7++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                    }
                }
                if (z3) {
                    i7--;
                }
                menuItemImpl2.setIsActionButton(z3);
                r0 = 0;
            } else {
                r0 = r3;
                menuItemImpl2.setIsActionButton(r0);
            }
            i9++;
            r3 = r0;
            size = size;
            view = null;
            r1 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a
    /* JADX INFO: renamed from: g */
    public View mo397g(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            actionView = super.mo397g(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a
    /* JADX INFO: renamed from: h */
    public InterfaceC0092h mo398h(ViewGroup viewGroup) {
        InterfaceC0092h interfaceC0092h = this.f372i;
        InterfaceC0092h interfaceC0092hMo398h = super.mo398h(viewGroup);
        if (interfaceC0092h != interfaceC0092hMo398h) {
            ((ActionMenuView) interfaceC0092hMo398h).setPresenter(this);
        }
        return interfaceC0092hMo398h;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a, androidx.appcompat.view.menu.InterfaceC0091g
    public void initForMenu(@NonNull Context context, @Nullable MenuBuilder menuBuilder) {
        super.initForMenu(context, menuBuilder);
        Resources resources = context.getResources();
        l30 l30VarM148325b = l30.m148325b(context);
        if (!this.f542o) {
            this.f541n = l30VarM148325b.m148332h();
        }
        if (!this.f548u) {
            this.f543p = l30VarM148325b.m148327c();
        }
        if (!this.f546s) {
            this.f545r = l30VarM148325b.m148328d();
        }
        int measuredWidth = this.f543p;
        if (this.f541n) {
            if (this.f538k == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f364a);
                this.f538k = overflowMenuButton;
                if (this.f540m) {
                    overflowMenuButton.setImageDrawable(this.f539l);
                    this.f539l = null;
                    this.f540m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f538k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f538k.getMeasuredWidth();
        } else {
            this.f538k = null;
        }
        this.f544q = measuredWidth;
        this.f550w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a
    /* JADX INFO: renamed from: j */
    public boolean mo400j(int i, MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a, androidx.appcompat.view.menu.InterfaceC0091g
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        m500q();
        super.onCloseMenu(menuBuilder, z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).openSubMenuId) > 0 && (menuItemFindItem = this.f366c.findItem(i)) != null) {
            onSubMenuSelected((SubMenuC0094j) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.openSubMenuId = this.f537D;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a, androidx.appcompat.view.menu.InterfaceC0091g
    public boolean onSubMenuSelected(SubMenuC0094j subMenuC0094j) {
        boolean z = false;
        if (!subMenuC0094j.hasVisibleItems()) {
            return false;
        }
        SubMenuC0094j subMenuC0094j2 = subMenuC0094j;
        while (subMenuC0094j2.getParentMenu() != this.f366c) {
            subMenuC0094j2 = (SubMenuC0094j) subMenuC0094j2.getParentMenu();
        }
        View viewM501r = m501r(subMenuC0094j2.getItem());
        if (viewM501r == null) {
            return false;
        }
        this.f537D = subMenuC0094j.getItem().getItemId();
        int size = subMenuC0094j.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = subMenuC0094j.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        C0104a c0104a = new C0104a(this.f365b, subMenuC0094j, viewM501r);
        this.f553z = c0104a;
        c0104a.m439g(z);
        this.f553z.m443k();
        super.onSubMenuSelected(subMenuC0094j);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m500q() {
        return m504u() | m503t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final View m501r(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f372i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0092h.a) && ((InterfaceC0092h.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public Drawable m502s() {
        OverflowMenuButton overflowMenuButton = this.f538k;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.f540m) {
            return this.f539l;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public boolean m503t() {
        Object obj;
        RunnableC0106c runnableC0106c = this.f534A;
        if (runnableC0106c != null && (obj = this.f372i) != null) {
            ((View) obj).removeCallbacks(runnableC0106c);
            this.f534A = null;
            return true;
        }
        C0107d c0107d = this.f552y;
        if (c0107d == null) {
            return false;
        }
        c0107d.m434b();
        return true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m504u() {
        C0104a c0104a = this.f553z;
        if (c0104a == null) {
            return false;
        }
        c0104a.m434b();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0085a, androidx.appcompat.view.menu.InterfaceC0091g
    public void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f372i).requestLayout();
        MenuBuilder menuBuilder = this.f366c;
        boolean z2 = false;
        if (menuBuilder != null) {
            ArrayList<MenuItemImpl> actionItems = menuBuilder.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                z30 supportActionProvider = actionItems.get(i).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.m217004i(this);
                }
            }
        }
        MenuBuilder menuBuilder2 = this.f366c;
        ArrayList<MenuItemImpl> nonActionItems = menuBuilder2 != null ? menuBuilder2.getNonActionItems() : null;
        if (this.f541n && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        OverflowMenuButton overflowMenuButton = this.f538k;
        if (z2) {
            if (overflowMenuButton == null) {
                this.f538k = new OverflowMenuButton(this.f364a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f538k.getParent();
            if (viewGroup != this.f372i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f538k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f372i;
                actionMenuView.addView(this.f538k, actionMenuView.m518h());
            }
        } else if (overflowMenuButton != null) {
            Object parent = overflowMenuButton.getParent();
            Object obj = this.f372i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f538k);
            }
        }
        ((ActionMenuView) this.f372i).setOverflowReserved(this.f541n);
    }

    /* JADX INFO: renamed from: v */
    public boolean m505v() {
        return this.f534A != null || m506w();
    }

    /* JADX INFO: renamed from: w */
    public boolean m506w() {
        C0107d c0107d = this.f552y;
        return c0107d != null && c0107d.m436d();
    }

    /* JADX INFO: renamed from: x */
    public void m507x(Configuration configuration) {
        if (!this.f546s) {
            this.f545r = l30.m148325b(this.f365b).m148328d();
        }
        MenuBuilder menuBuilder = this.f366c;
        if (menuBuilder != null) {
            menuBuilder.onItemsChanged(true);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m508y(boolean z) {
        this.f549v = z;
    }

    /* JADX INFO: renamed from: z */
    public void m509z(ActionMenuView actionMenuView) {
        this.f372i = actionMenuView;
        actionMenuView.initialize(this.f366c);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0103a();
        public int openSubMenuId;

        /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        public static class C0103a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }

        public SavedState() {
        }
    }
}
