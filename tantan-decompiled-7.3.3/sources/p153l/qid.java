package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.InterfaceC0092g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface qid {
    /* JADX INFO: renamed from: a */
    boolean mo654a();

    /* JADX INFO: renamed from: b */
    boolean mo655b();

    /* JADX INFO: renamed from: c */
    boolean mo656c();

    void collapseActionView();

    /* JADX INFO: renamed from: d */
    boolean mo657d();

    /* JADX INFO: renamed from: e */
    void mo658e(Menu menu, InterfaceC0092g.a aVar);

    /* JADX INFO: renamed from: f */
    void mo659f();

    /* JADX INFO: renamed from: g */
    boolean mo660g();

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    /* JADX INFO: renamed from: h */
    boolean mo661h();

    /* JADX INFO: renamed from: i */
    void mo662i(int i);

    /* JADX INFO: renamed from: j */
    int mo663j();

    /* JADX INFO: renamed from: k */
    void mo664k();

    /* JADX INFO: renamed from: l */
    void mo665l(boolean z);

    /* JADX INFO: renamed from: m */
    void mo666m();

    /* JADX INFO: renamed from: n */
    void mo667n(int i);

    /* JADX INFO: renamed from: o */
    int mo668o();

    /* JADX INFO: renamed from: p */
    void mo669p();

    /* JADX INFO: renamed from: q */
    void mo670q(Drawable drawable);

    /* JADX INFO: renamed from: r */
    Menu mo671r();

    /* JADX INFO: renamed from: s */
    hml0 mo672s(int i, long j);

    void setBackgroundDrawable(Drawable drawable);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* JADX INFO: renamed from: t */
    ViewGroup mo673t();

    /* JADX INFO: renamed from: u */
    void mo674u(boolean z);

    /* JADX INFO: renamed from: v */
    void mo675v(ScrollingTabContainerView scrollingTabContainerView);

    /* JADX INFO: renamed from: w */
    void mo676w(int i);

    /* JADX INFO: renamed from: x */
    void mo677x(int i);

    /* JADX INFO: renamed from: y */
    void mo678y(InterfaceC0092g.a aVar, MenuBuilder.InterfaceC0079a interfaceC0079a);
}
