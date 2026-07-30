package p028v.bottombar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.b9c0;
import p003l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VBottomBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC1380a f13144a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1381b f13145b;

    /* JADX INFO: renamed from: c */
    public int f13146c;

    /* JADX INFO: renamed from: d */
    public int f13147d;

    /* JADX INFO: renamed from: e */
    public List<? extends InterfaceC1381b> f13148e;

    /* JADX INFO: renamed from: f */
    public boolean f13149f;

    /* JADX INFO: renamed from: g */
    public Runnable f13150g;

    /* JADX INFO: renamed from: h */
    public Runnable f13151h;

    /* JADX INFO: renamed from: i */
    public e30<Boolean> f13152i;

    /* JADX INFO: renamed from: v.bottombar.VBottomBar$a */
    public interface InterfaceC1380a {
        /* JADX INFO: renamed from: a */
        void m11859a(InterfaceC1381b interfaceC1381b);

        /* JADX INFO: renamed from: b */
        boolean m11860b(InterfaceC1381b interfaceC1381b);

        /* JADX INFO: renamed from: c */
        void m11861c(InterfaceC1381b interfaceC1381b);

        /* JADX INFO: renamed from: d */
        void m11862d(InterfaceC1381b interfaceC1381b);

        /* JADX INFO: renamed from: e */
        boolean m11863e(InterfaceC1381b interfaceC1381b);

        /* JADX INFO: renamed from: f */
        boolean m11864f(InterfaceC1381b interfaceC1381b);
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBar$b */
    public interface InterfaceC1381b {
        /* JADX INFO: renamed from: a */
        void mo11865a(boolean z, boolean z2);

        View getRoot();

        String getTabName();
    }

    public VBottomBar(Context context) {
        super(context);
        this.f13148e = new ArrayList();
        this.f13149f = false;
        this.f13150g = new Runnable() { // from class: l.afk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2180a.m11855k();
            }
        };
        this.f13151h = new Runnable() { // from class: l.bfk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2388a.m11856l();
            }
        };
        this.f13152i = null;
        m11851g(null);
    }

    /* JADX INFO: renamed from: d */
    public void m11848d(List<? extends InterfaceC1381b> list) {
        this.f13148e = list;
        this.f13145b = null;
        removeAllViews();
        if (list.size() == 0) {
            return;
        }
        for (final InterfaceC1381b interfaceC1381b : list) {
            addView(interfaceC1381b.getRoot());
            interfaceC1381b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.cfk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2638a.m11854j(interfaceC1381b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11849e(List<? extends InterfaceC1381b> list) {
        for (InterfaceC1381b interfaceC1381b : list) {
            LinearLayout.LayoutParams layoutParams = interfaceC1381b.getRoot().getLayoutParams() == null ? new LinearLayout.LayoutParams(-2, -1) : !(interfaceC1381b.getRoot().getLayoutParams() instanceof LinearLayout.LayoutParams) ? new LinearLayout.LayoutParams(interfaceC1381b.getRoot().getLayoutParams()) : null;
            layoutParams.weight = 1.0f;
            interfaceC1381b.getRoot().setLayoutParams(layoutParams);
        }
        m11848d(list);
    }

    /* JADX INFO: renamed from: f */
    public final void m11850f() {
        if (NullChecker.a(this.f13152i)) {
            int visibility = getVisibility();
            e30<Boolean> e30Var = this.f13152i;
            if (visibility == 0) {
                e30Var.call(Boolean.TRUE);
            } else {
                e30Var.call(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11851g(AttributeSet attributeSet) {
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        m11852h(attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final void m11852h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.i3);
            this.f13146c = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.k3, -3);
            this.f13147d = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.j3, -3);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11853i(InterfaceC1381b interfaceC1381b, boolean z) {
        InterfaceC1380a interfaceC1380a = this.f13144a;
        if (interfaceC1380a != null) {
            if (interfaceC1380a.m11863e(interfaceC1381b)) {
                return;
            }
            InterfaceC1381b interfaceC1381b2 = this.f13145b;
            InterfaceC1380a interfaceC1380a2 = this.f13144a;
            if (interfaceC1381b != interfaceC1381b2) {
                interfaceC1380a2.m11861c(interfaceC1381b);
                this.f13149f = true;
                postDelayed(this.f13151h, ViewConfiguration.getDoubleTapTimeout());
            } else if (interfaceC1380a2.m11860b(interfaceC1381b)) {
                this.f13144a.m11861c(interfaceC1381b);
            } else {
                boolean z2 = this.f13149f;
                Runnable runnable = this.f13150g;
                if (z2) {
                    removeCallbacks(runnable);
                    removeCallbacks(this.f13151h);
                    this.f13144a.m11862d(interfaceC1381b);
                    this.f13149f = false;
                } else {
                    postDelayed(runnable, ViewConfiguration.getDoubleTapTimeout());
                    this.f13149f = true;
                }
            }
            if (this.f13144a.m11864f(interfaceC1381b)) {
                return;
            }
        }
        m11857m(interfaceC1381b, z);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m11854j(InterfaceC1381b interfaceC1381b, View view) {
        m11853i(interfaceC1381b, true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m11855k() {
        this.f13144a.m11859a(this.f13145b);
        this.f13149f = false;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11856l() {
        this.f13149f = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m11857m(InterfaceC1381b interfaceC1381b, boolean z) {
        StringBuffer stringBuffer = new StringBuffer("select change:");
        InterfaceC1381b interfaceC1381b2 = this.f13145b;
        if (interfaceC1381b == interfaceC1381b2) {
            stringBuffer.append("same item");
        } else if (interfaceC1381b2 != null) {
            interfaceC1381b2.mo11865a(false, z);
            stringBuffer.append("from : " + this.f13145b.getRoot().getTag());
        }
        interfaceC1381b.mo11865a(true, z);
        this.f13145b = interfaceC1381b;
        stringBuffer.append(" to : " + interfaceC1381b.getRoot().getTag());
        stringBuffer.append(" anim: ");
        stringBuffer.append(z);
    }

    /* JADX INFO: renamed from: n */
    public void m11858n(int i, boolean z) {
        if (i >= this.f13148e.size() || i == -1) {
            return;
        }
        m11857m(this.f13148e.get(i), z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f13150g);
        removeCallbacks(this.f13151h);
        super.onDetachedFromWindow();
    }

    public void setTabClickListener(InterfaceC1380a interfaceC1380a) {
        this.f13144a = interfaceC1380a;
    }

    public void setVisibleCallback(e30<Boolean> e30Var) {
        this.f13152i = e30Var;
        m11850f();
    }

    public VBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13148e = new ArrayList();
        this.f13149f = false;
        this.f13150g = new Runnable() { // from class: l.afk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2180a.m11855k();
            }
        };
        this.f13151h = new Runnable() { // from class: l.bfk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2388a.m11856l();
            }
        };
        this.f13152i = null;
        m11851g(attributeSet);
    }

    public VBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13148e = new ArrayList();
        this.f13149f = false;
        this.f13150g = new Runnable() { // from class: l.afk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2180a.m11855k();
            }
        };
        this.f13151h = new Runnable() { // from class: l.bfk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2388a.m11856l();
            }
        };
        this.f13152i = null;
        m11851g(attributeSet);
    }
}
