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
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import p153l.kkl0;
import p153l.kqy;
import p153l.m9k;
import p153l.wac0;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.f */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C0091f {

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
    public InterfaceC0092g.a f441i;

    /* JADX INFO: renamed from: j */
    public kqy f442j;

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
            C0091f.this.mo438e();
        }
    }

    public C0091f(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i, @StyleRes int i2) {
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
    public final kqy m434a() {
        Display defaultDisplay = ((WindowManager) this.f433a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        kqy viewOnKeyListenerC0087b = Math.min(point.x, point.y) >= this.f433a.getResources().getDimensionPixelSize(wac0.f188106c) ? new ViewOnKeyListenerC0087b(this.f433a, this.f438f, this.f436d, this.f437e, this.f435c) : new ViewOnKeyListenerC0094i(this.f433a, this.f434b, this.f438f, this.f436d, this.f437e, this.f435c);
        viewOnKeyListenerC0087b.mo402a(this.f434b);
        viewOnKeyListenerC0087b.mo409k(this.f444l);
        viewOnKeyListenerC0087b.mo404e(this.f438f);
        viewOnKeyListenerC0087b.setCallback(this.f441i);
        viewOnKeyListenerC0087b.mo406h(this.f440h);
        viewOnKeyListenerC0087b.mo407i(this.f439g);
        return viewOnKeyListenerC0087b;
    }

    /* JADX INFO: renamed from: b */
    public void m435b() {
        if (m437d()) {
            this.f442j.dismiss();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public kqy m436c() {
        if (this.f442j == null) {
            this.f442j = m434a();
        }
        return this.f442j;
    }

    /* JADX INFO: renamed from: d */
    public boolean m437d() {
        kqy kqyVar = this.f442j;
        return kqyVar != null && kqyVar.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public void mo438e() {
        this.f442j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f443k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m439f(@NonNull View view) {
        this.f438f = view;
    }

    /* JADX INFO: renamed from: g */
    public void m440g(boolean z) {
        this.f440h = z;
        kqy kqyVar = this.f442j;
        if (kqyVar != null) {
            kqyVar.mo406h(z);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m441h(int i) {
        this.f439g = i;
    }

    /* JADX INFO: renamed from: i */
    public void m442i(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f443k = onDismissListener;
    }

    /* JADX INFO: renamed from: j */
    public void m443j(@Nullable InterfaceC0092g.a aVar) {
        this.f441i = aVar;
        kqy kqyVar = this.f442j;
        if (kqyVar != null) {
            kqyVar.setCallback(aVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m444k() {
        if (m446m()) {
            return;
        }
        wtq0.m207906a("MenuPopupHelper cannot be used without an anchor");
    }

    /* JADX INFO: renamed from: l */
    public final void m445l(int i, int i2, boolean z, boolean z2) {
        kqy kqyVarM436c = m436c();
        kqyVarM436c.mo410l(z2);
        if (z) {
            if ((m9k.m157578b(this.f439g, kkl0.m150191x(this.f438f)) & 7) == 5) {
                i -= this.f438f.getWidth();
            }
            kqyVarM436c.mo408j(i);
            kqyVarM436c.mo411m(i2);
            int i3 = (int) ((this.f433a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kqyVarM436c.m150973f(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        kqyVarM436c.show();
    }

    /* JADX INFO: renamed from: m */
    public boolean m446m() {
        if (m437d()) {
            return true;
        }
        if (this.f438f == null) {
            return false;
        }
        m445l(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m447n(int i, int i2) {
        if (m437d()) {
            return true;
        }
        if (this.f438f == null) {
            return false;
        }
        m445l(i, i2, true, true);
        return true;
    }

    public C0091f(@NonNull Context context, @NonNull MenuBuilder menuBuilder, @NonNull View view, boolean z, @AttrRes int i) {
        this(context, menuBuilder, view, z, i, 0);
    }
}
