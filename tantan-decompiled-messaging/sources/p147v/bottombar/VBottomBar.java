package p147v.bottombar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.b9c0;
import p149l.e30;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC22587a f209519a;

    /* JADX INFO: renamed from: b */
    public InterfaceC22588b f209520b;

    /* JADX INFO: renamed from: c */
    public int f209521c;

    /* JADX INFO: renamed from: d */
    public int f209522d;

    /* JADX INFO: renamed from: e */
    public List<? extends InterfaceC22588b> f209523e;

    /* JADX INFO: renamed from: f */
    public boolean f209524f;

    /* JADX INFO: renamed from: g */
    public Runnable f209525g;

    /* JADX INFO: renamed from: h */
    public Runnable f209526h;

    /* JADX INFO: renamed from: i */
    public e30<Boolean> f209527i;

    /* JADX INFO: renamed from: v.bottombar.VBottomBar$a */
    public interface InterfaceC22587a {
        /* JADX INFO: renamed from: a */
        void mo39993a(InterfaceC22588b interfaceC22588b);

        /* JADX INFO: renamed from: b */
        boolean mo39995b(InterfaceC22588b interfaceC22588b);

        /* JADX INFO: renamed from: c */
        void mo39997c(InterfaceC22588b interfaceC22588b);

        /* JADX INFO: renamed from: d */
        void mo39999d(InterfaceC22588b interfaceC22588b);

        /* JADX INFO: renamed from: e */
        boolean mo40001e(InterfaceC22588b interfaceC22588b);

        /* JADX INFO: renamed from: f */
        boolean mo40003f(InterfaceC22588b interfaceC22588b);
    }

    /* JADX INFO: renamed from: v.bottombar.VBottomBar$b */
    public interface InterfaceC22588b {
        /* JADX INFO: renamed from: a */
        void mo40491a(boolean z, boolean z2);

        View getRoot();

        String getTabName();
    }

    public VBottomBar(Context context) {
        super(context);
        this.f209523e = new ArrayList();
        this.f209524f = false;
        this.f209525g = new Runnable() { // from class: l.afk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69181a.m223363k();
            }
        };
        this.f209526h = new Runnable() { // from class: l.bfk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75326a.m223364l();
            }
        };
        this.f209527i = null;
        m223359g(null);
    }

    /* JADX INFO: renamed from: d */
    public void m223356d(List<? extends InterfaceC22588b> list) {
        this.f209523e = list;
        this.f209520b = null;
        removeAllViews();
        if (list.size() == 0) {
            return;
        }
        for (final InterfaceC22588b interfaceC22588b : list) {
            addView(interfaceC22588b.getRoot());
            interfaceC22588b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: l.cfk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80633a.m223362j(interfaceC22588b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public void m223357e(List<? extends InterfaceC22588b> list) {
        for (InterfaceC22588b interfaceC22588b : list) {
            LinearLayout.LayoutParams layoutParams = interfaceC22588b.getRoot().getLayoutParams() == null ? new LinearLayout.LayoutParams(-2, -1) : !(interfaceC22588b.getRoot().getLayoutParams() instanceof LinearLayout.LayoutParams) ? new LinearLayout.LayoutParams(interfaceC22588b.getRoot().getLayoutParams()) : null;
            layoutParams.weight = 1.0f;
            interfaceC22588b.getRoot().setLayoutParams(layoutParams);
        }
        m223356d(list);
    }

    /* JADX INFO: renamed from: f */
    public final void m223358f() {
        if (NullChecker.m81303a(this.f209527i)) {
            int visibility = getVisibility();
            e30<Boolean> e30Var = this.f209527i;
            if (visibility == 0) {
                e30Var.call(Boolean.TRUE);
            } else {
                e30Var.call(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m223359g(AttributeSet attributeSet) {
        setOrientation(0);
        setClipChildren(false);
        setClipToPadding(false);
        m223360h(attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final void m223360h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.f74445i3);
            this.f209521c = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.f74459k3, -3);
            this.f209522d = typedArrayObtainStyledAttributes.getLayoutDimension(b9c0.f74452j3, -3);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m223361i(InterfaceC22588b interfaceC22588b, boolean z) {
        InterfaceC22587a interfaceC22587a = this.f209519a;
        if (interfaceC22587a != null) {
            if (interfaceC22587a.mo40001e(interfaceC22588b)) {
                return;
            }
            InterfaceC22588b interfaceC22588b2 = this.f209520b;
            InterfaceC22587a interfaceC22587a2 = this.f209519a;
            if (interfaceC22588b != interfaceC22588b2) {
                interfaceC22587a2.mo39997c(interfaceC22588b);
                this.f209524f = true;
                postDelayed(this.f209526h, ViewConfiguration.getDoubleTapTimeout());
            } else if (interfaceC22587a2.mo39995b(interfaceC22588b)) {
                this.f209519a.mo39997c(interfaceC22588b);
            } else {
                boolean z2 = this.f209524f;
                Runnable runnable = this.f209525g;
                if (z2) {
                    removeCallbacks(runnable);
                    removeCallbacks(this.f209526h);
                    this.f209519a.mo39999d(interfaceC22588b);
                    this.f209524f = false;
                } else {
                    postDelayed(runnable, ViewConfiguration.getDoubleTapTimeout());
                    this.f209524f = true;
                }
            }
            if (this.f209519a.mo40003f(interfaceC22588b)) {
                return;
            }
        }
        m223365m(interfaceC22588b, z);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m223362j(InterfaceC22588b interfaceC22588b, View view) {
        m223361i(interfaceC22588b, true);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m223363k() {
        this.f209519a.mo39993a(this.f209520b);
        this.f209524f = false;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m223364l() {
        this.f209524f = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m223365m(InterfaceC22588b interfaceC22588b, boolean z) {
        StringBuffer stringBuffer = new StringBuffer("select change:");
        InterfaceC22588b interfaceC22588b2 = this.f209520b;
        if (interfaceC22588b == interfaceC22588b2) {
            stringBuffer.append("same item");
        } else if (interfaceC22588b2 != null) {
            interfaceC22588b2.mo40491a(false, z);
            stringBuffer.append("from : " + this.f209520b.getRoot().getTag());
        }
        interfaceC22588b.mo40491a(true, z);
        this.f209520b = interfaceC22588b;
        stringBuffer.append(" to : " + interfaceC22588b.getRoot().getTag());
        stringBuffer.append(" anim: ");
        stringBuffer.append(z);
    }

    /* JADX INFO: renamed from: n */
    public void m223366n(int i, boolean z) {
        if (i >= this.f209523e.size() || i == -1) {
            return;
        }
        m223365m(this.f209523e.get(i), z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f209525g);
        removeCallbacks(this.f209526h);
        super.onDetachedFromWindow();
    }

    public void setTabClickListener(InterfaceC22587a interfaceC22587a) {
        this.f209519a = interfaceC22587a;
    }

    public void setVisibleCallback(e30<Boolean> e30Var) {
        this.f209527i = e30Var;
        m223358f();
    }

    public VBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209523e = new ArrayList();
        this.f209524f = false;
        this.f209525g = new Runnable() { // from class: l.afk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69181a.m223363k();
            }
        };
        this.f209526h = new Runnable() { // from class: l.bfk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75326a.m223364l();
            }
        };
        this.f209527i = null;
        m223359g(attributeSet);
    }

    public VBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209523e = new ArrayList();
        this.f209524f = false;
        this.f209525g = new Runnable() { // from class: l.afk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69181a.m223363k();
            }
        };
        this.f209526h = new Runnable() { // from class: l.bfk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75326a.m223364l();
            }
        };
        this.f209527i = null;
        m223359g(attributeSet);
    }
}
