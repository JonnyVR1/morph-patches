package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.NavigationIntent;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class g7h0 extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class<?>[] f102543e;

    /* JADX INFO: renamed from: f */
    public static final Class<?>[] f102544f;

    /* JADX INFO: renamed from: a */
    public final Object[] f102545a;

    /* JADX INFO: renamed from: b */
    public final Object[] f102546b;

    /* JADX INFO: renamed from: c */
    public Context f102547c;

    /* JADX INFO: renamed from: d */
    public Object f102548d;

    /* JADX INFO: renamed from: l.g7h0$a */
    public static class MenuItemOnMenuItemClickListenerC17174a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        public static final Class<?>[] f102549c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        public Object f102550a;

        /* JADX INFO: renamed from: b */
        public Method f102551b;

        public MenuItemOnMenuItemClickListenerC17174a(Object obj, String str) {
            this.f102550a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f102551b = cls.getMethod(str, f102549c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                Class<?> returnType = this.f102551b.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Method method = this.f102551b;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(this.f102550a, menuItem)).booleanValue();
                }
                method.invoke(this.f102550a, menuItem);
                return true;
            } catch (Exception e) {
                iig0.m140070a(e);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: l.g7h0$b */
    public class C17175b {

        /* JADX INFO: renamed from: A */
        public t30 f102552A;

        /* JADX INFO: renamed from: B */
        public CharSequence f102553B;

        /* JADX INFO: renamed from: C */
        public CharSequence f102554C;

        /* JADX INFO: renamed from: D */
        public ColorStateList f102555D = null;

        /* JADX INFO: renamed from: E */
        public PorterDuff.Mode f102556E = null;

        /* JADX INFO: renamed from: a */
        public Menu f102558a;

        /* JADX INFO: renamed from: b */
        public int f102559b;

        /* JADX INFO: renamed from: c */
        public int f102560c;

        /* JADX INFO: renamed from: d */
        public int f102561d;

        /* JADX INFO: renamed from: e */
        public int f102562e;

        /* JADX INFO: renamed from: f */
        public boolean f102563f;

        /* JADX INFO: renamed from: g */
        public boolean f102564g;

        /* JADX INFO: renamed from: h */
        public boolean f102565h;

        /* JADX INFO: renamed from: i */
        public int f102566i;

        /* JADX INFO: renamed from: j */
        public int f102567j;

        /* JADX INFO: renamed from: k */
        public CharSequence f102568k;

        /* JADX INFO: renamed from: l */
        public CharSequence f102569l;

        /* JADX INFO: renamed from: m */
        public int f102570m;

        /* JADX INFO: renamed from: n */
        public char f102571n;

        /* JADX INFO: renamed from: o */
        public int f102572o;

        /* JADX INFO: renamed from: p */
        public char f102573p;

        /* JADX INFO: renamed from: q */
        public int f102574q;

        /* JADX INFO: renamed from: r */
        public int f102575r;

        /* JADX INFO: renamed from: s */
        public boolean f102576s;

        /* JADX INFO: renamed from: t */
        public boolean f102577t;

        /* JADX INFO: renamed from: u */
        public boolean f102578u;

        /* JADX INFO: renamed from: v */
        public int f102579v;

        /* JADX INFO: renamed from: w */
        public int f102580w;

        /* JADX INFO: renamed from: x */
        public String f102581x;

        /* JADX INFO: renamed from: y */
        public String f102582y;

        /* JADX INFO: renamed from: z */
        public String f102583z;

        public C17175b(Menu menu) {
            this.f102558a = menu;
            m129329h();
        }

        /* JADX INFO: renamed from: a */
        public void m129322a() {
            this.f102565h = true;
            m129330i(this.f102558a.add(this.f102559b, this.f102566i, this.f102567j, this.f102568k));
        }

        /* JADX INFO: renamed from: b */
        public SubMenu m129323b() {
            this.f102565h = true;
            SubMenu subMenuAddSubMenu = this.f102558a.addSubMenu(this.f102559b, this.f102566i, this.f102567j, this.f102568k);
            m129330i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: c */
        public final char m129324c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* JADX INFO: renamed from: d */
        public boolean m129325d() {
            return this.f102565h;
        }

        /* JADX INFO: renamed from: e */
        public final <T> T m129326e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g7h0.this.f102547c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m129327f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g7h0.this.f102547c.obtainStyledAttributes(attributeSet, gic0.f104436s1);
            this.f102559b = typedArrayObtainStyledAttributes.getResourceId(gic0.f104446u1, 0);
            this.f102560c = typedArrayObtainStyledAttributes.getInt(gic0.f104456w1, 0);
            this.f102561d = typedArrayObtainStyledAttributes.getInt(gic0.f104461x1, 0);
            this.f102562e = typedArrayObtainStyledAttributes.getInt(gic0.f104466y1, 0);
            this.f102563f = typedArrayObtainStyledAttributes.getBoolean(gic0.f104451v1, true);
            this.f102564g = typedArrayObtainStyledAttributes.getBoolean(gic0.f104441t1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: g */
        public void m129328g(AttributeSet attributeSet) {
            t0j0 t0j0VarM188781t = t0j0.m188781t(g7h0.this.f102547c, attributeSet, gic0.f104471z1);
            this.f102566i = t0j0VarM188781t.m188796n(gic0.f104231C1, 0);
            this.f102567j = (t0j0VarM188781t.m188793k(gic0.f104246F1, this.f102560c) & (-65536)) | (t0j0VarM188781t.m188793k(gic0.f104251G1, this.f102561d) & p7f.COLOR_SPACE_UNCALIBRATED);
            this.f102568k = t0j0VarM188781t.m188798p(gic0.f104256H1);
            this.f102569l = t0j0VarM188781t.m188798p(gic0.f104261I1);
            this.f102570m = t0j0VarM188781t.m188796n(gic0.f104221A1, 0);
            this.f102571n = m129324c(t0j0VarM188781t.m188797o(gic0.f104266J1));
            this.f102572o = t0j0VarM188781t.m188793k(gic0.f104301Q1, 4096);
            this.f102573p = m129324c(t0j0VarM188781t.m188797o(gic0.f104271K1));
            this.f102574q = t0j0VarM188781t.m188793k(gic0.f104321U1, 4096);
            if (t0j0VarM188781t.m188800r(gic0.f104276L1)) {
                this.f102575r = t0j0VarM188781t.m188783a(gic0.f104276L1, false) ? 1 : 0;
            } else {
                this.f102575r = this.f102562e;
            }
            this.f102576s = t0j0VarM188781t.m188783a(gic0.f104236D1, false);
            this.f102577t = t0j0VarM188781t.m188783a(gic0.f104241E1, this.f102563f);
            this.f102578u = t0j0VarM188781t.m188783a(gic0.f104226B1, this.f102564g);
            this.f102579v = t0j0VarM188781t.m188793k(gic0.f104326V1, -1);
            this.f102583z = t0j0VarM188781t.m188797o(gic0.f104281M1);
            this.f102580w = t0j0VarM188781t.m188796n(gic0.f104286N1, 0);
            this.f102581x = t0j0VarM188781t.m188797o(gic0.f104296P1);
            String strM188797o = t0j0VarM188781t.m188797o(gic0.f104291O1);
            this.f102582y = strM188797o;
            if (strM188797o != null && this.f102580w == 0 && this.f102581x == null) {
                this.f102552A = (t30) m129326e(strM188797o, g7h0.f102544f, g7h0.this.f102546b);
            } else {
                this.f102552A = null;
            }
            this.f102553B = t0j0VarM188781t.m188798p(gic0.f104306R1);
            this.f102554C = t0j0VarM188781t.m188798p(gic0.f104330W1);
            if (t0j0VarM188781t.m188800r(gic0.f104316T1)) {
                this.f102556E = gde.m129924d(t0j0VarM188781t.m188793k(gic0.f104316T1, -1), this.f102556E);
            } else {
                this.f102556E = null;
            }
            if (t0j0VarM188781t.m188800r(gic0.f104311S1)) {
                this.f102555D = t0j0VarM188781t.m188785c(gic0.f104311S1);
            } else {
                this.f102555D = null;
            }
            t0j0VarM188781t.m188801v();
            this.f102565h = false;
        }

        /* JADX INFO: renamed from: h */
        public void m129329h() {
            this.f102559b = 0;
            this.f102560c = 0;
            this.f102561d = 0;
            this.f102562e = 0;
            this.f102563f = true;
            this.f102564g = true;
        }

        /* JADX INFO: renamed from: i */
        public final void m129330i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f102576s).setVisible(this.f102577t).setEnabled(this.f102578u).setCheckable(this.f102575r >= 1).setTitleCondensed(this.f102569l).setIcon(this.f102570m);
            int i = this.f102579v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f102583z != null) {
                if (g7h0.this.f102547c.isRestricted()) {
                    wtq0.m207906a("The android:onClick attribute cannot be used within a restricted context");
                    return;
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC17174a(g7h0.this.m129320b(), this.f102583z));
            }
            boolean z2 = menuItem instanceof MenuItemImpl;
            if (z2) {
            }
            if (this.f102575r >= 2) {
                if (z2) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).m383f(true);
                }
            }
            String str = this.f102581x;
            if (str != null) {
                menuItem.setActionView((View) m129326e(str, g7h0.f102543e, g7h0.this.f102545a));
                z = true;
            }
            int i2 = this.f102580w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            t30 t30Var = this.f102552A;
            if (t30Var != null) {
                iqy.m141733a(menuItem, t30Var);
            }
            iqy.m141735c(menuItem, this.f102553B);
            iqy.m141739g(menuItem, this.f102554C);
            iqy.m141734b(menuItem, this.f102571n, this.f102572o);
            iqy.m141738f(menuItem, this.f102573p, this.f102574q);
            PorterDuff.Mode mode = this.f102556E;
            if (mode != null) {
                iqy.m141737e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f102555D;
            if (colorStateList != null) {
                iqy.m141736d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f102543e = clsArr;
        f102544f = clsArr;
    }

    public g7h0(Context context) {
        super(context);
        this.f102547c = context;
        Object[] objArr = {context};
        this.f102545a = objArr;
        this.f102546b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final Object m129319a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m129319a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public Object m129320b() {
        if (this.f102548d == null) {
            this.f102548d = m129319a(this.f102547c);
        }
        return this.f102548d;
    }

    /* JADX INFO: renamed from: c */
    public final void m129321c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C17175b c17175b = new C17175b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(NavigationIntent.menu)) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    azk0.m101074a("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                azk0.m101074a("Unexpected end of document");
                return;
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        c17175b.m129329h();
                    } else if (name2.equals(Item.TYPE)) {
                        if (!c17175b.m129325d()) {
                            t30 t30Var = c17175b.f102552A;
                            if (t30Var == null || !t30Var.mo385a()) {
                                c17175b.m129322a();
                            } else {
                                c17175b.m129323b();
                            }
                        }
                    } else if (name2.equals(NavigationIntent.menu)) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c17175b.m129327f(attributeSet);
                } else if (name3.equals(Item.TYPE)) {
                    c17175b.m129328g(attributeSet);
                } else if (name3.equals(NavigationIntent.menu)) {
                    m129321c(xmlPullParser, attributeSet, c17175b.m129323b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(@LayoutRes int i, Menu menu) {
        if (!(menu instanceof f7h0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f102547c.getResources().getLayout(i);
                    m129321c(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
