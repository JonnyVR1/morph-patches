package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0075a;
import p153l.kfc0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.e */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC0090e implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0092g.a {

    /* JADX INFO: renamed from: a */
    public MenuBuilder f429a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0075a f430b;

    /* JADX INFO: renamed from: c */
    public C0088c f431c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0092g.a f432d;

    public DialogInterfaceOnKeyListenerC0090e(MenuBuilder menuBuilder) {
        this.f429a = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
    /* JADX INFO: renamed from: a */
    public boolean mo346a(MenuBuilder menuBuilder) {
        InterfaceC0092g.a aVar = this.f432d;
        if (aVar != null) {
            return aVar.mo346a(menuBuilder);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m432b() {
        DialogInterfaceC0075a dialogInterfaceC0075a = this.f430b;
        if (dialogInterfaceC0075a != null) {
            dialogInterfaceC0075a.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m433c(IBinder iBinder) {
        MenuBuilder menuBuilder = this.f429a;
        DialogInterfaceC0075a.a aVar = new DialogInterfaceC0075a.a(menuBuilder.getContext());
        C0088c c0088c = new C0088c(aVar.getContext(), kfc0.f126276l);
        this.f431c = c0088c;
        c0088c.setCallback(this);
        this.f429a.addMenuPresenter(this.f431c);
        aVar.setAdapter(this.f431c.m422a(), this);
        View headerView = menuBuilder.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(menuBuilder.getHeaderIcon()).setTitle(menuBuilder.getHeaderTitle());
        }
        aVar.setOnKeyListener(this);
        DialogInterfaceC0075a dialogInterfaceC0075aCreate = aVar.create();
        this.f430b = dialogInterfaceC0075aCreate;
        dialogInterfaceC0075aCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f430b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f430b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f429a.performItemAction((MenuItemImpl) this.f431c.m422a().getItem(i), 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0092g.a
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (z || menuBuilder == this.f429a) {
            m432b();
        }
        InterfaceC0092g.a aVar = this.f432d;
        if (aVar != null) {
            aVar.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f431c.onCloseMenu(this.f429a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f430b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f430b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f429a.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f429a.performShortcut(i, keyEvent, 0);
    }
}
