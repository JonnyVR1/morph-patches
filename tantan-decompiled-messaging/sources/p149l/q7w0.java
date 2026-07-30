package p149l;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class q7w0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f153081a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f153082b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f153083c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashSet f153084d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final HashSet f153085e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final HashSet f153086f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final HashMap f153087g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Map f153088h = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    public boolean f153089i;

    /* JADX INFO: renamed from: a */
    public final View m173301a(String str) {
        return (View) this.f153083c.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final p7w0 m173302b(View view) {
        p7w0 p7w0Var = (p7w0) this.f153082b.get(view);
        if (p7w0Var != null) {
            this.f153082b.remove(view);
        }
        return p7w0Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m173303c(String str) {
        return (String) this.f153087g.get(str);
    }

    /* JADX INFO: renamed from: d */
    public final String m173304d(View view) {
        if (this.f153081a.size() == 0) {
            return null;
        }
        String str = (String) this.f153081a.get(view);
        if (str != null) {
            this.f153081a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m173305e() {
        return this.f153086f;
    }

    /* JADX INFO: renamed from: f */
    public final HashSet m173306f() {
        return this.f153085e;
    }

    /* JADX INFO: renamed from: g */
    public final void m173307g() {
        this.f153081a.clear();
        this.f153082b.clear();
        this.f153083c.clear();
        this.f153084d.clear();
        this.f153085e.clear();
        this.f153086f.clear();
        this.f153087g.clear();
        this.f153089i = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m173308h() {
        this.f153089i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m173309i() {
        Boolean bool;
        String str;
        n6w0 n6w0VarM158096a = n6w0.m158096a();
        if (n6w0VarM158096a != null) {
            for (e6w0 e6w0Var : n6w0VarM158096a.m158097b()) {
                View viewM115114f = e6w0Var.m115114f();
                if (e6w0Var.m115118j()) {
                    String strM115116h = e6w0Var.m115116h();
                    if (viewM115114f != null) {
                        if (viewM115114f.isAttachedToWindow()) {
                            boolean zHasWindowFocus = viewM115114f.hasWindowFocus();
                            Map map = this.f153088h;
                            if (zHasWindowFocus) {
                                map.remove(viewM115114f);
                                bool = Boolean.FALSE;
                            } else {
                                boolean zContainsKey = map.containsKey(viewM115114f);
                                Map map2 = this.f153088h;
                                if (zContainsKey) {
                                    bool = (Boolean) map2.get(viewM115114f);
                                } else {
                                    bool = Boolean.FALSE;
                                    map2.put(viewM115114f, bool);
                                }
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = viewM115114f;
                                while (true) {
                                    if (view == null) {
                                        this.f153084d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strM163068a = o7w0.m163068a(view);
                                    if (strM163068a != null) {
                                        str = strM163068a;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f153085e.add(strM115116h);
                            this.f153081a.put(viewM115114f, strM115116h);
                            for (q6w0 q6w0Var : e6w0Var.m115117i()) {
                                View view2 = (View) q6w0Var.m173176b().get();
                                if (view2 != null) {
                                    p7w0 p7w0Var = (p7w0) this.f153082b.get(view2);
                                    if (p7w0Var != null) {
                                        p7w0Var.m167780c(e6w0Var.m115116h());
                                    } else {
                                        this.f153082b.put(view2, new p7w0(q6w0Var, e6w0Var.m115116h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f153086f.add(strM115116h);
                            this.f153083c.put(strM115116h, viewM115114f);
                            this.f153087g.put(strM115116h, str);
                        }
                    } else {
                        this.f153086f.add(strM115116h);
                        this.f153087g.put(strM115116h, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m173310j(View view) {
        if (!this.f153088h.containsKey(view)) {
            return true;
        }
        this.f153088h.put(view, Boolean.TRUE);
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final int m173311k(View view) {
        if (this.f153084d.contains(view)) {
            return 1;
        }
        return this.f153089i ? 2 : 3;
    }
}
