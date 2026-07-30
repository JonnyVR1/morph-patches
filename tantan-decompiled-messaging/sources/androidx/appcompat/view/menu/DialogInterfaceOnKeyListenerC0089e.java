package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0074a;
import p149l.g7c0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.e */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC0089e implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0091g.a {

    /* JADX INFO: renamed from: a */
    public MenuBuilder f429a;

    /* JADX INFO: renamed from: b */
    public DialogInterfaceC0074a f430b;

    /* JADX INFO: renamed from: c */
    public C0087c f431c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0091g.a f432d;

    public DialogInterfaceOnKeyListenerC0089e(MenuBuilder menuBuilder) {
        this.f429a = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
    /* JADX INFO: renamed from: a */
    public boolean mo345a(MenuBuilder menuBuilder) {
        InterfaceC0091g.a aVar = this.f432d;
        if (aVar != null) {
            return aVar.mo345a(menuBuilder);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m431b() {
        DialogInterfaceC0074a dialogInterfaceC0074a = this.f430b;
        if (dialogInterfaceC0074a != null) {
            dialogInterfaceC0074a.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m432c(IBinder iBinder) {
        MenuBuilder menuBuilder = this.f429a;
        DialogInterfaceC0074a.a aVar = new DialogInterfaceC0074a.a(menuBuilder.getContext());
        C0087c c0087c = new C0087c(aVar.getContext(), g7c0.f101364l);
        this.f431c = c0087c;
        c0087c.setCallback(this);
        this.f429a.addMenuPresenter(this.f431c);
        aVar.setAdapter(this.f431c.m421a(), this);
        View headerView = menuBuilder.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(menuBuilder.getHeaderIcon()).setTitle(menuBuilder.getHeaderTitle());
        }
        aVar.setOnKeyListener(this);
        DialogInterfaceC0074a dialogInterfaceC0074aCreate = aVar.create();
        this.f430b = dialogInterfaceC0074aCreate;
        dialogInterfaceC0074aCreate.setOnDismissListener(this);
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
        this.f429a.performItemAction((MenuItemImpl) this.f431c.m421a().getItem(i), 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091g.a
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (z || menuBuilder == this.f429a) {
            m431b();
        }
        InterfaceC0091g.a aVar = this.f432d;
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
