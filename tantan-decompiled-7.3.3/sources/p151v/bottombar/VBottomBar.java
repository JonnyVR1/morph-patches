package p151v.bottombar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.hhc0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC22702a f210441a;

    /* JADX INFO: renamed from: b */
    public InterfaceC22703b f210442b;

    /* JADX INFO: renamed from: c */
    public int f210443c;

    /* JADX INFO: renamed from: d */
    public int f210444d;

    /* JADX INFO: renamed from: e */
    public List<? extends InterfaceC22703b> f210445e;

    /* JADX INFO: renamed from: f */
    public boolean f210446f;

    /* JADX INFO: renamed from: g */
    public Runnable f210447g;

    /* JADX INFO: renamed from: h */
    public Runnable f210448h;

    /* JADX INFO: renamed from: i */
    public y20<Boolean> f210449i;

    /* JADX INFO: renamed from: v.bottombar.VBottomBar$a */
    public interface InterfaceC22702a {
        /* JADX INFO: renamed from: a */
        void mo41000a(InterfaceC22703b interfaceC22703b);

        /* JADX INFO: renamed from: b */
        boolean mo41002b(InterfaceC22703b interfaceC22703b);

        /* JADX INFO: renamed from: c */
        void mo41004c(InterfaceC22703b interfaceC22703b);

        /* JADX INFO: renamed from: d */
        void mo41006d(InterfaceC22703b interfaceC22703b);

        /* JADX INFO: renamed from: e */
        boolean mo41008e(InterfaceC22703b interfaceC22703b);

        /* JADX INFO: renamed from: f */
        boolean mo41010f(InterfaceC22703b interfaceC22703b);
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBar$b */
    public interface InterfaceC22703b {
        /* JADX INFO: renamed from: a */
        void mo41502a(boolean z, boolean z2);

        View getRoot();

        String getTabName();
    }

    public VBottomBar(Context context) {
        super(context);
        this.f210445e = new ArrayList();
        this.f210446f = false;
        this.f210447g = new Runnable() { // from class: l.gok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105305a.m224609k();
            }
        };
        this.f210448h = new Runnable() { // from class: l.hok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110931a.m224610l();
            }
        };
        this.f210449i = null;
        m224605g(null);
    }

    /* JADX INFO: renamed from: d */
    public void m224602d(List<? extends InterfaceC22703b> list) {
        this.f210445e = list;
        this.f210442b = null;
        removeAllViews();
        if (list.size() == 0) {
            return;
        }
        for (final InterfaceC22703b interfaceC22703b : list) {
            addView(interfaceC22703b.getRoot());
            interfaceC22703b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.iok0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116177a.m224608j(interfaceC22703b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public void m224603e(List<? extends InterfaceC22703b> list) {
        for (InterfaceC22703b interfaceC22703b : list) {
            LinearLayout.LayoutParams layoutParams = interfaceC22703b.getRoot().getLayoutParams() == null ? new LinearLayout.LayoutParams(-2, -1) : !(interfaceC22703b.getRoot().getLayoutParams() instanceof LinearLayout.LayoutParams) ? new LinearLayout.LayoutParams(interfaceC22703b.getRoot().getLayoutParams()) : null;
            layoutParams.weight = 1.0f;
            interfaceC22703b.getRoot().setLayoutParams(layoutParams);
        }
        m224602d(list);
    }

    /* JADX INFO: renamed from: f */
    public final void m224604f() {
        if (NullChecker.m82486a(this.f210449i)) {
            int visibility = getVisibility();
            y20<Boolean> y20Var = this.f210449i;
            if (visibility == 0) {
                y20Var.call(Boolean.TRUE);
            } else {
                y20Var.call(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m224605g(AttributeSet attributeSet) {
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        m224606h(attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final void m224606h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hhc0.f109754i3);
            this.f210443c = typedArrayObtainStyledAttributes.getLayoutDimension(hhc0.f109768k3, -3);
            this.f210444d = typedArrayObtainStyledAttributes.getLayoutDimension(hhc0.f109761j3, -3);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m224607i(InterfaceC22703b interfaceC22703b, boolean z) {
        InterfaceC22702a interfaceC22702a = this.f210441a;
        if (interfaceC22702a != null) {
            if (interfaceC22702a.mo41008e(interfaceC22703b)) {
                return;
            }
            InterfaceC22703b interfaceC22703b2 = this.f210442b;
            InterfaceC22702a interfaceC22702a2 = this.f210441a;
            if (interfaceC22703b != interfaceC22703b2) {
                interfaceC22702a2.mo41004c(interfaceC22703b);
                this.f210446f = true;
                postDelayed(this.f210448h, ViewConfiguration.getDoubleTapTimeout());
            } else if (interfaceC22702a2.mo41002b(interfaceC22703b)) {
                this.f210441a.mo41004c(interfaceC22703b);
            } else {
                boolean z2 = this.f210446f;
                Runnable runnable = this.f210447g;
                if (z2) {
                    removeCallbacks(runnable);
                    removeCallbacks(this.f210448h);
                    this.f210441a.mo41006d(interfaceC22703b);
                    this.f210446f = false;
                } else {
                    postDelayed(runnable, ViewConfiguration.getDoubleTapTimeout());
                    this.f210446f = true;
                }
            }
            if (this.f210441a.mo41010f(interfaceC22703b)) {
                return;
            }
        }
        m224611m(interfaceC22703b, z);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m224608j(InterfaceC22703b interfaceC22703b, View view) {
        m224607i(interfaceC22703b, true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m224609k() {
        this.f210441a.mo41000a(this.f210442b);
        this.f210446f = false;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m224610l() {
        this.f210446f = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m224611m(InterfaceC22703b interfaceC22703b, boolean z) {
        StringBuffer stringBuffer = new StringBuffer("select change:");
        InterfaceC22703b interfaceC22703b2 = this.f210442b;
        if (interfaceC22703b == interfaceC22703b2) {
            stringBuffer.append("same item");
        } else if (interfaceC22703b2 != null) {
            interfaceC22703b2.mo41502a(false, z);
            stringBuffer.append("from : " + this.f210442b.getRoot().getTag());
        }
        interfaceC22703b.mo41502a(true, z);
        this.f210442b = interfaceC22703b;
        stringBuffer.append(" to : " + interfaceC22703b.getRoot().getTag());
        stringBuffer.append(" anim: ");
        stringBuffer.append(z);
    }

    /* JADX INFO: renamed from: n */
    public void m224612n(int i, boolean z) {
        if (i >= this.f210445e.size() || i == -1) {
            return;
        }
        m224611m(this.f210445e.get(i), z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f210447g);
        removeCallbacks(this.f210448h);
        super.onDetachedFromWindow();
    }

    public void setTabClickListener(InterfaceC22702a interfaceC22702a) {
        this.f210441a = interfaceC22702a;
    }

    public void setVisibleCallback(y20<Boolean> y20Var) {
        this.f210449i = y20Var;
        m224604f();
    }

    public VBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210445e = new ArrayList();
        this.f210446f = false;
        this.f210447g = new Runnable() { // from class: l.gok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105305a.m224609k();
            }
        };
        this.f210448h = new Runnable() { // from class: l.hok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110931a.m224610l();
            }
        };
        this.f210449i = null;
        m224605g(attributeSet);
    }

    public VBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210445e = new ArrayList();
        this.f210446f = false;
        this.f210447g = new Runnable() { // from class: l.gok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105305a.m224609k();
            }
        };
        this.f210448h = new Runnable() { // from class: l.hok0
            @Override // java.lang.Runnable
            public final void run() {
                this.f110931a.m224610l();
            }
        };
        this.f210449i = null;
        m224605g(attributeSet);
    }
}
