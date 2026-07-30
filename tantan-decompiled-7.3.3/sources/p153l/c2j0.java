package p153l;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.hellogroup.p036mk.business.base.activity.BaseMkActivity;
import com.hellogroup.p036mk.business.base.fragment.BaseMkFragment;
import com.hellogroup.p036mk.business.widget.CompatAppbarLayout;

/* JADX INFO: loaded from: classes7.dex */
public class c2j0 {

    /* JADX INFO: renamed from: a */
    private View f79487a;

    /* JADX INFO: renamed from: b */
    private Toolbar f79488b;

    private c2j0() {
    }

    /* JADX INFO: renamed from: c */
    public static c2j0 m107688c(BaseMkActivity baseMkActivity, View.OnClickListener onClickListener) {
        c2j0 c2j0Var = new c2j0();
        View viewFindViewById = baseMkActivity.findViewById(pcc0.f151547a);
        View viewFindViewById2 = baseMkActivity.findViewById(pcc0.f151565s);
        if (viewFindViewById2 != null) {
            Toolbar toolbar = (Toolbar) viewFindViewById2;
            toolbar.setOnMenuItemClickListener(baseMkActivity);
            if (onClickListener != null) {
                toolbar.setNavigationOnClickListener(onClickListener);
            }
            c2j0Var.f79488b = toolbar;
            c2j0Var.m107690i();
        }
        if (viewFindViewById != null) {
            c2j0Var.f79487a = viewFindViewById;
        }
        return c2j0Var;
    }

    /* JADX INFO: renamed from: d */
    public static c2j0 m107689d(BaseMkFragment baseMkFragment) {
        c2j0 c2j0Var = new c2j0();
        View viewM17790Z3 = baseMkFragment.m17790Z3(pcc0.f151547a);
        View viewM17790Z4 = baseMkFragment.m17790Z3(pcc0.f151565s);
        if (viewM17790Z3 != null && (viewM17790Z3 instanceof CompatAppbarLayout)) {
            c2j0Var.f79487a = viewM17790Z3;
        }
        if (viewM17790Z4 != null && (viewM17790Z4 instanceof Toolbar)) {
            c2j0Var.f79488b = (Toolbar) viewM17790Z4;
        }
        return c2j0Var;
    }

    /* JADX INFO: renamed from: i */
    private void m107690i() {
        m107704q(true);
    }

    /* JADX INFO: renamed from: a */
    public MenuItem m107691a(int i, CharSequence charSequence, @DrawableRes int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return m107692b(i, charSequence, i2, onMenuItemClickListener, 0);
    }

    /* JADX INFO: renamed from: b */
    public MenuItem m107692b(int i, CharSequence charSequence, @DrawableRes int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i3) {
        Toolbar toolbar = this.f79488b;
        if (toolbar == null) {
            return null;
        }
        Menu menu = toolbar.getMenu();
        if (i == 0) {
            i = 0;
        }
        if (i3 == 0) {
            i3 = 0;
        }
        MenuItem menuItemAdd = menu.add(0, i, i3, charSequence);
        if (onMenuItemClickListener != null) {
            menuItemAdd.setOnMenuItemClickListener(onMenuItemClickListener);
        }
        if (i2 > 0) {
            menuItemAdd.setIcon(i2);
        }
        menuItemAdd.setShowAsAction(2);
        return menuItemAdd;
    }

    /* JADX INFO: renamed from: e */
    public void m107693e() {
        Toolbar toolbar = this.f79488b;
        if (toolbar != null) {
            toolbar.getMenu().clear();
        }
    }

    /* JADX INFO: renamed from: f */
    public View m107694f() {
        return this.f79487a;
    }

    /* JADX INFO: renamed from: g */
    public Toolbar m107695g() {
        return this.f79488b;
    }

    /* JADX INFO: renamed from: h */
    public void m107696h() {
        View view = this.f79487a;
        if (view != null && view.getVisibility() != 8) {
            this.f79487a.setVisibility(8);
        }
        Toolbar toolbar = this.f79488b;
        if (toolbar == null || toolbar.getVisibility() == 8) {
            return;
        }
        this.f79488b.setVisibility(8);
    }

    /* JADX INFO: renamed from: j */
    public void m107697j(int i) {
        View view = this.f79487a;
        if (view != null) {
            view.setBackgroundColor(i);
            return;
        }
        Toolbar toolbar = this.f79488b;
        if (toolbar != null) {
            toolbar.setBackgroundColor(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m107698k(MenuItem menuItem, @ColorInt int i) {
        Toolbar toolbar;
        if (menuItem == null || (toolbar = this.f79488b) == null) {
            return;
        }
        View viewFindViewById = toolbar.findViewById(menuItem.getItemId());
        if (viewFindViewById instanceof ActionMenuItemView) {
            ((ActionMenuItemView) viewFindViewById).setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m107699l(@DrawableRes int i) {
        Toolbar toolbar = this.f79488b;
        if (i <= 0) {
            toolbar.setNavigationIcon((Drawable) null);
        } else {
            toolbar.setNavigationIcon(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m107700m(Drawable drawable) {
        Toolbar toolbar = this.f79488b;
        if (toolbar != null) {
            toolbar.setNavigationIcon(drawable);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m107701n(@StringRes int i) {
        Toolbar toolbar = this.f79488b;
        if (toolbar != null) {
            toolbar.setTitle(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m107702o(CharSequence charSequence) {
        Toolbar toolbar = this.f79488b;
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m107703p() {
        View view = this.f79487a;
        if (view != null && view.getVisibility() != 0) {
            this.f79487a.setVisibility(0);
        }
        Toolbar toolbar = this.f79488b;
        if (toolbar == null || toolbar.getVisibility() == 0) {
            return;
        }
        this.f79488b.setVisibility(0);
    }

    /* JADX INFO: renamed from: q */
    public void m107704q(boolean z) {
        View view = this.f79487a;
        if (view == null || !(view instanceof CompatAppbarLayout)) {
            return;
        }
        ((CompatAppbarLayout) view).m18267b(z);
    }
}
