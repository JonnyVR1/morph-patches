package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import p149l.gbl0;
import p149l.nhy;
import p149l.p2c0;
import p149l.qkq0;
import p149l.u6k;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.f */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C0090f {

    /* JADX INFO: renamed from: a */
    public final Context f433a;

    /* JADX INFO: renamed from: b */
    public final MenuBuilder f434b;

    /* JADX INFO: renamed from: c */
    public final boolean f435c;

    /* JADX INFO: renamed from: d */
    public final int f436d;

    /* JADX INFO: renamed from: e */
    public final int f437e;

    /* JADX INFO: renamed from: f */
    public View f438f;

    /* JADX INFO: renamed from: g */
    public int f439g;

    /* JADX INFO: renamed from: h */
    public boolean f440h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0091g.a f441i;

    /* JADX INFO: renamed from: j */
    public nhy f442j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f443k;

    /* JADX INFO: renamed from: l */
    public final PopupWindow.OnDismissListener f444l;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.f$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0090f.this.mo437e();
        }
    }

    public C0090f(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i, @StyleRes int i2) {
        this.f439g = 8388611;
        this.f444l = new a();
        this.f433a = context;
        this.f434b = menuBuilder;
        this.f438f = view;
        this.f435c = z;
        this.f436d = i;
        this.f437e = i2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final nhy m433a() {
        Display defaultDisplay = ((WindowManager) this.f433a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        nhy viewOnKeyListenerC0086b = Math.min(point.x, point.y) >= this.f433a.getResources().getDimensionPixelSize(p2c0.f146834c) ? new ViewOnKeyListenerC0086b(this.f433a, this.f438f, this.f436d, this.f437e, this.f435c) : new ViewOnKeyListenerC0093i(this.f433a, this.f434b, this.f438f, this.f436d, this.f437e, this.f435c);
        viewOnKeyListenerC0086b.mo401a(this.f434b);
        viewOnKeyListenerC0086b.mo408k(this.f444l);
        viewOnKeyListenerC0086b.mo403e(this.f438f);
        viewOnKeyListenerC0086b.setCallback(this.f441i);
        viewOnKeyListenerC0086b.mo405h(this.f440h);
        viewOnKeyListenerC0086b.mo406i(this.f439g);
        return viewOnKeyListenerC0086b;
    }

    /* JADX INFO: renamed from: b */
    public void m434b() {
        if (m436d()) {
            this.f442j.dismiss();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public nhy m435c() {
        if (this.f442j == null) {
            this.f442j = m433a();
        }
        return this.f442j;
    }

    /* JADX INFO: renamed from: d */
    public boolean m436d() {
        nhy nhyVar = this.f442j;
        return nhyVar != null && nhyVar.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public void mo437e() {
        this.f442j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f443k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m438f(@NonNull View view) {
        this.f438f = view;
    }

    /* JADX INFO: renamed from: g */
    public void m439g(boolean z) {
        this.f440h = z;
        nhy nhyVar = this.f442j;
        if (nhyVar != null) {
            nhyVar.mo405h(z);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m440h(int i) {
        this.f439g = i;
    }

    /* JADX INFO: renamed from: i */
    public void m441i(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f443k = onDismissListener;
    }

    /* JADX INFO: renamed from: j */
    public void m442j(@Nullable InterfaceC0091g.a aVar) {
        this.f441i = aVar;
        nhy nhyVar = this.f442j;
        if (nhyVar != null) {
            nhyVar.setCallback(aVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m443k() {
        if (m445m()) {
            return;
        }
        qkq0.m175383a("MenuPopupHelper cannot be used without an anchor");
    }

    /* JADX INFO: renamed from: l */
    public final void m444l(int i, int i2, boolean z, boolean z2) {
        nhy nhyVarM435c = m435c();
        nhyVarM435c.mo409l(z2);
        if (z) {
            if ((u6k.m191981b(this.f439g, gbl0.m125228x(this.f438f)) & 7) == 5) {
                i -= this.f438f.getWidth();
            }
            nhyVarM435c.mo407j(i);
            nhyVarM435c.mo410m(i2);
            int i3 = (int) ((this.f433a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            nhyVarM435c.m159482f(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        nhyVarM435c.show();
    }

    /* JADX INFO: renamed from: m */
    public boolean m445m() {
        if (m436d()) {
            return true;
        }
        if (this.f438f == null) {
            return false;
        }
        m444l(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m446n(int i, int i2) {
        if (m436d()) {
            return true;
        }
        if (this.f438f == null) {
            return false;
        }
        m444l(i, i2, true, true);
        return true;
    }

    public C0090f(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i) {
        this(context, menuBuilder, view, z, i, 0);
    }
}
