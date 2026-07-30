package p153l;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class wgw0 {

    /* JADX INFO: renamed from: a */
    public final HashMap f189018a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f189019b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f189020c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashSet f189021d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final HashSet f189022e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final HashSet f189023f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final HashMap f189024g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Map f189025h = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    public boolean f189026i;

    /* JADX INFO: renamed from: a */
    public final View m206272a(String str) {
        return (View) this.f189020c.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final vgw0 m206273b(View view) {
        vgw0 vgw0Var = (vgw0) this.f189019b.get(view);
        if (vgw0Var != null) {
            this.f189019b.remove(view);
        }
        return vgw0Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m206274c(String str) {
        return (String) this.f189024g.get(str);
    }

    /* JADX INFO: renamed from: d */
    public final String m206275d(View view) {
        if (this.f189018a.size() == 0) {
            return null;
        }
        String str = (String) this.f189018a.get(view);
        if (str != null) {
            this.f189018a.remove(view);
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m206276e() {
        return this.f189023f;
    }

    /* JADX INFO: renamed from: f */
    public final HashSet m206277f() {
        return this.f189022e;
    }

    /* JADX INFO: renamed from: g */
    public final void m206278g() {
        this.f189018a.clear();
        this.f189019b.clear();
        this.f189020c.clear();
        this.f189021d.clear();
        this.f189022e.clear();
        this.f189023f.clear();
        this.f189024g.clear();
        this.f189026i = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m206279h() {
        this.f189026i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m206280i() {
        Boolean bool;
        String str;
        tfw0 tfw0VarM190995a = tfw0.m190995a();
        if (tfw0VarM190995a != null) {
            for (kfw0 kfw0Var : tfw0VarM190995a.m190996b()) {
                View viewM149626f = kfw0Var.m149626f();
                if (kfw0Var.m149630j()) {
                    String strM149628h = kfw0Var.m149628h();
                    if (viewM149626f != null) {
                        if (viewM149626f.isAttachedToWindow()) {
                            boolean zHasWindowFocus = viewM149626f.hasWindowFocus();
                            Map map = this.f189025h;
                            if (zHasWindowFocus) {
                                map.remove(viewM149626f);
                                bool = Boolean.FALSE;
                            } else {
                                boolean zContainsKey = map.containsKey(viewM149626f);
                                Map map2 = this.f189025h;
                                if (zContainsKey) {
                                    bool = (Boolean) map2.get(viewM149626f);
                                } else {
                                    bool = Boolean.FALSE;
                                    map2.put(viewM149626f, bool);
                                }
                            }
                            if (!bool.booleanValue()) {
                                HashSet hashSet = new HashSet();
                                View view = viewM149626f;
                                while (true) {
                                    if (view == null) {
                                        this.f189021d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String strM195951a = ugw0.m195951a(view);
                                    if (strM195951a != null) {
                                        str = strM195951a;
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
                            this.f189022e.add(strM149628h);
                            this.f189018a.put(viewM149626f, strM149628h);
                            for (wfw0 wfw0Var : kfw0Var.m149629i()) {
                                View view2 = (View) wfw0Var.m206167b().get();
                                if (view2 != null) {
                                    vgw0 vgw0Var = (vgw0) this.f189019b.get(view2);
                                    if (vgw0Var != null) {
                                        vgw0Var.m201246c(kfw0Var.m149628h());
                                    } else {
                                        this.f189019b.put(view2, new vgw0(wfw0Var, kfw0Var.m149628h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f189023f.add(strM149628h);
                            this.f189020c.put(strM149628h, viewM149626f);
                            this.f189024g.put(strM149628h, str);
                        }
                    } else {
                        this.f189023f.add(strM149628h);
                        this.f189024g.put(strM149628h, "noAdView");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m206281j(View view) {
        if (!this.f189025h.containsKey(view)) {
            return true;
        }
        this.f189025h.put(view, Boolean.TRUE);
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final int m206282k(View view) {
        if (this.f189021d.contains(view)) {
            return 1;
        }
        return this.f189026i ? 2 : 3;
    }
}
