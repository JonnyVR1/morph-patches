package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.InterfaceC0091g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface khd {
    /* JADX INFO: renamed from: a */
    boolean mo653a();

    /* JADX INFO: renamed from: b */
    boolean mo654b();

    /* JADX INFO: renamed from: c */
    boolean mo655c();

    void collapseActionView();

    /* JADX INFO: renamed from: d */
    boolean mo656d();

    /* JADX INFO: renamed from: e */
    void mo657e(Menu menu, InterfaceC0091g.a aVar);

    /* JADX INFO: renamed from: f */
    void mo658f();

    /* JADX INFO: renamed from: g */
    boolean mo659g();

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    /* JADX INFO: renamed from: h */
    boolean mo660h();

    /* JADX INFO: renamed from: i */
    void mo661i(int i);

    /* JADX INFO: renamed from: j */
    int mo662j();

    /* JADX INFO: renamed from: k */
    void mo663k();

    /* JADX INFO: renamed from: l */
    void mo664l(boolean z);

    /* JADX INFO: renamed from: m */
    void mo665m();

    /* JADX INFO: renamed from: n */
    void mo666n(int i);

    /* JADX INFO: renamed from: o */
    int mo667o();

    /* JADX INFO: renamed from: p */
    void mo668p();

    /* JADX INFO: renamed from: q */
    void mo669q(Drawable drawable);

    /* JADX INFO: renamed from: r */
    Menu mo670r();

    /* JADX INFO: renamed from: s */
    ddl0 mo671s(int i, long j);

    void setBackgroundDrawable(Drawable drawable);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* JADX INFO: renamed from: t */
    ViewGroup mo672t();

    /* JADX INFO: renamed from: u */
    void mo673u(boolean z);

    /* JADX INFO: renamed from: v */
    void mo674v(ScrollingTabContainerView scrollingTabContainerView);

    /* JADX INFO: renamed from: w */
    void mo675w(int i);

    /* JADX INFO: renamed from: x */
    void mo676x(int i);

    /* JADX INFO: renamed from: y */
    void mo677y(InterfaceC0091g.a aVar, MenuBuilder.InterfaceC0078a interfaceC0078a);
}
