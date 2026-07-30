package p149l;

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
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.NavigationIntent;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class yyg0 extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class<?>[] f200732e;

    /* JADX INFO: renamed from: f */
    public static final Class<?>[] f200733f;

    /* JADX INFO: renamed from: a */
    public final Object[] f200734a;

    /* JADX INFO: renamed from: b */
    public final Object[] f200735b;

    /* JADX INFO: renamed from: c */
    public Context f200736c;

    /* JADX INFO: renamed from: d */
    public Object f200737d;

    /* JADX INFO: renamed from: l.yyg0$a */
    public static class MenuItemOnMenuItemClickListenerC21580a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        public static final Class<?>[] f200738c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        public Object f200739a;

        /* JADX INFO: renamed from: b */
        public Method f200740b;

        public MenuItemOnMenuItemClickListenerC21580a(Object obj, String str) {
            this.f200739a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f200740b = cls.getMethod(str, f200738c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                Class<?> returnType = this.f200740b.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Method method = this.f200740b;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(this.f200739a, menuItem)).booleanValue();
                }
                method.invoke(this.f200739a, menuItem);
                return true;
            } catch (Exception e) {
                aag0.m95543a(e);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: l.yyg0$b */
    public class C21581b {

        /* JADX INFO: renamed from: A */
        public z30 f200741A;

        /* JADX INFO: renamed from: B */
        public CharSequence f200742B;

        /* JADX INFO: renamed from: C */
        public CharSequence f200743C;

        /* JADX INFO: renamed from: D */
        public ColorStateList f200744D = null;

        /* JADX INFO: renamed from: E */
        public PorterDuff.Mode f200745E = null;

        /* JADX INFO: renamed from: a */
        public Menu f200747a;

        /* JADX INFO: renamed from: b */
        public int f200748b;

        /* JADX INFO: renamed from: c */
        public int f200749c;

        /* JADX INFO: renamed from: d */
        public int f200750d;

        /* JADX INFO: renamed from: e */
        public int f200751e;

        /* JADX INFO: renamed from: f */
        public boolean f200752f;

        /* JADX INFO: renamed from: g */
        public boolean f200753g;

        /* JADX INFO: renamed from: h */
        public boolean f200754h;

        /* JADX INFO: renamed from: i */
        public int f200755i;

        /* JADX INFO: renamed from: j */
        public int f200756j;

        /* JADX INFO: renamed from: k */
        public CharSequence f200757k;

        /* JADX INFO: renamed from: l */
        public CharSequence f200758l;

        /* JADX INFO: renamed from: m */
        public int f200759m;

        /* JADX INFO: renamed from: n */
        public char f200760n;

        /* JADX INFO: renamed from: o */
        public int f200761o;

        /* JADX INFO: renamed from: p */
        public char f200762p;

        /* JADX INFO: renamed from: q */
        public int f200763q;

        /* JADX INFO: renamed from: r */
        public int f200764r;

        /* JADX INFO: renamed from: s */
        public boolean f200765s;

        /* JADX INFO: renamed from: t */
        public boolean f200766t;

        /* JADX INFO: renamed from: u */
        public boolean f200767u;

        /* JADX INFO: renamed from: v */
        public int f200768v;

        /* JADX INFO: renamed from: w */
        public int f200769w;

        /* JADX INFO: renamed from: x */
        public String f200770x;

        /* JADX INFO: renamed from: y */
        public String f200771y;

        /* JADX INFO: renamed from: z */
        public String f200772z;

        public C21581b(Menu menu) {
            this.f200747a = menu;
            m216538h();
        }

        /* JADX INFO: renamed from: a */
        public void m216531a() {
            this.f200754h = true;
            m216539i(this.f200747a.add(this.f200748b, this.f200755i, this.f200756j, this.f200757k));
        }

        /* JADX INFO: renamed from: b */
        public SubMenu m216532b() {
            this.f200754h = true;
            SubMenu subMenuAddSubMenu = this.f200747a.addSubMenu(this.f200748b, this.f200755i, this.f200756j, this.f200757k);
            m216539i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: c */
        public final char m216533c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* JADX INFO: renamed from: d */
        public boolean m216534d() {
            return this.f200754h;
        }

        /* JADX INFO: renamed from: e */
        public final <T> T m216535e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, yyg0.this.f200736c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: f */
        public void m216536f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = yyg0.this.f200736c.obtainStyledAttributes(attributeSet, aac0.f68510s1);
            this.f200748b = typedArrayObtainStyledAttributes.getResourceId(aac0.f68520u1, 0);
            this.f200749c = typedArrayObtainStyledAttributes.getInt(aac0.f68530w1, 0);
            this.f200750d = typedArrayObtainStyledAttributes.getInt(aac0.f68535x1, 0);
            this.f200751e = typedArrayObtainStyledAttributes.getInt(aac0.f68540y1, 0);
            this.f200752f = typedArrayObtainStyledAttributes.getBoolean(aac0.f68525v1, true);
            this.f200753g = typedArrayObtainStyledAttributes.getBoolean(aac0.f68515t1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: g */
        public void m216537g(AttributeSet attributeSet) {
            qri0 qri0VarM175992t = qri0.m175992t(yyg0.this.f200736c, attributeSet, aac0.f68545z1);
            this.f200755i = qri0VarM175992t.m176007n(aac0.f68305C1, 0);
            this.f200756j = (qri0VarM175992t.m176004k(aac0.f68320F1, this.f200749c) & (-65536)) | (qri0VarM175992t.m176004k(aac0.f68325G1, this.f200750d) & j6f.COLOR_SPACE_UNCALIBRATED);
            this.f200757k = qri0VarM175992t.m176009p(aac0.f68330H1);
            this.f200758l = qri0VarM175992t.m176009p(aac0.f68335I1);
            this.f200759m = qri0VarM175992t.m176007n(aac0.f68295A1, 0);
            this.f200760n = m216533c(qri0VarM175992t.m176008o(aac0.f68340J1));
            this.f200761o = qri0VarM175992t.m176004k(aac0.f68375Q1, 4096);
            this.f200762p = m216533c(qri0VarM175992t.m176008o(aac0.f68345K1));
            this.f200763q = qri0VarM175992t.m176004k(aac0.f68395U1, 4096);
            if (qri0VarM175992t.m176011r(aac0.f68350L1)) {
                this.f200764r = qri0VarM175992t.m175994a(aac0.f68350L1, false) ? 1 : 0;
            } else {
                this.f200764r = this.f200751e;
            }
            this.f200765s = qri0VarM175992t.m175994a(aac0.f68310D1, false);
            this.f200766t = qri0VarM175992t.m175994a(aac0.f68315E1, this.f200752f);
            this.f200767u = qri0VarM175992t.m175994a(aac0.f68300B1, this.f200753g);
            this.f200768v = qri0VarM175992t.m176004k(aac0.f68400V1, -1);
            this.f200772z = qri0VarM175992t.m176008o(aac0.f68355M1);
            this.f200769w = qri0VarM175992t.m176007n(aac0.f68360N1, 0);
            this.f200770x = qri0VarM175992t.m176008o(aac0.f68370P1);
            String strM176008o = qri0VarM175992t.m176008o(aac0.f68365O1);
            this.f200771y = strM176008o;
            if (strM176008o != null && this.f200769w == 0 && this.f200770x == null) {
                this.f200741A = (z30) m216535e(strM176008o, yyg0.f200733f, yyg0.this.f200735b);
            } else {
                this.f200741A = null;
            }
            this.f200742B = qri0VarM175992t.m176009p(aac0.f68380R1);
            this.f200743C = qri0VarM175992t.m176009p(aac0.f68404W1);
            if (qri0VarM175992t.m176011r(aac0.f68390T1)) {
                this.f200745E = cce.m106048d(qri0VarM175992t.m176004k(aac0.f68390T1, -1), this.f200745E);
            } else {
                this.f200745E = null;
            }
            if (qri0VarM175992t.m176011r(aac0.f68385S1)) {
                this.f200744D = qri0VarM175992t.m175996c(aac0.f68385S1);
            } else {
                this.f200744D = null;
            }
            qri0VarM175992t.m176012v();
            this.f200754h = false;
        }

        /* JADX INFO: renamed from: h */
        public void m216538h() {
            this.f200748b = 0;
            this.f200749c = 0;
            this.f200750d = 0;
            this.f200751e = 0;
            this.f200752f = true;
            this.f200753g = true;
        }

        /* JADX INFO: renamed from: i */
        public final void m216539i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f200765s).setVisible(this.f200766t).setEnabled(this.f200767u).setCheckable(this.f200764r >= 1).setTitleCondensed(this.f200758l).setIcon(this.f200759m);
            int i = this.f200768v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f200772z != null) {
                if (yyg0.this.f200736c.isRestricted()) {
                    qkq0.m175383a("The android:onClick attribute cannot be used within a restricted context");
                    return;
                }
                menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC21580a(yyg0.this.m216529b(), this.f200772z));
            }
            boolean z2 = menuItem instanceof MenuItemImpl;
            if (z2) {
            }
            if (this.f200764r >= 2) {
                if (z2) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).m382f(true);
                }
            }
            String str = this.f200770x;
            if (str != null) {
                menuItem.setActionView((View) m216535e(str, yyg0.f200732e, yyg0.this.f200734a));
                z = true;
            }
            int i2 = this.f200769w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            z30 z30Var = this.f200741A;
            if (z30Var != null) {
                lhy.m149863a(menuItem, z30Var);
            }
            lhy.m149865c(menuItem, this.f200742B);
            lhy.m149869g(menuItem, this.f200743C);
            lhy.m149864b(menuItem, this.f200760n, this.f200761o);
            lhy.m149868f(menuItem, this.f200762p, this.f200763q);
            PorterDuff.Mode mode = this.f200745E;
            if (mode != null) {
                lhy.m149867e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f200744D;
            if (colorStateList != null) {
                lhy.m149866d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f200732e = clsArr;
        f200733f = clsArr;
    }

    public yyg0(Context context) {
        super(context);
        this.f200736c = context;
        Object[] objArr = {context};
        this.f200734a = objArr;
        this.f200735b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final Object m216528a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m216528a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX INFO: renamed from: b */
    public Object m216529b() {
        if (this.f200737d == null) {
            this.f200737d = m216528a(this.f200736c);
        }
        return this.f200737d;
    }

    /* JADX INFO: renamed from: c */
    public final void m216530c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C21581b c21581b = new C21581b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(NavigationIntent.menu)) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    upk0.m194883a("Expecting menu, got ".concat(name));
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
                upk0.m194883a("Unexpected end of document");
                return;
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        c21581b.m216538h();
                    } else if (name2.equals(Item.TYPE)) {
                        if (!c21581b.m216534d()) {
                            z30 z30Var = c21581b.f200741A;
                            if (z30Var == null || !z30Var.mo384a()) {
                                c21581b.m216531a();
                            } else {
                                c21581b.m216532b();
                            }
                        }
                    } else if (name2.equals(NavigationIntent.menu)) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c21581b.m216536f(attributeSet);
                } else if (name3.equals(Item.TYPE)) {
                    c21581b.m216537g(attributeSet);
                } else if (name3.equals(NavigationIntent.menu)) {
                    m216530c(xmlPullParser, attributeSet, c21581b.m216532b());
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
        if (!(menu instanceof xyg0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f200736c.getResources().getLayout(i);
                    m216530c(layout, Xml.asAttributeSet(layout), menu);
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
