package p149l;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes11.dex */
public class ebw extends szd {

    /* JADX INFO: renamed from: j */
    public Act f90388j;

    /* JADX INFO: renamed from: k */
    public CoreGiftLayer f90389k;

    /* JADX INFO: renamed from: l */
    public d30 f90390l;

    /* JADX INFO: renamed from: m */
    public d30 f90391m;

    public ebw(Act act, d30 d30Var, d30 d30Var2) {
        super(act, false, v7c0.f180363j);
        this.f90388j = act;
        this.f90390l = d30Var;
        this.f90391m = d30Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m115530H() {
        d30 d30Var = this.f90390l;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m115531I() {
        d30 d30Var = this.f90390l;
        if (d30Var != null) {
            d30Var.call();
        }
        this.f90389k.m45443F();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m115532J() {
        d30 d30Var = this.f90391m;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CoreGiftLayer coreGiftLayer = (CoreGiftLayer) this.f90388j.inflater().inflate(f6c0.f96008t3, (ViewGroup) null, false);
        this.f90389k = coreGiftLayer;
        setContentView(coreGiftLayer);
        setCancelable(false);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        this.f90389k.setErrorWhenFrameJank(true);
        this.f90389k.m45458z(hbw.m130339e().m130343d(), new d30() { // from class: l.bbw
            @Override // p149l.d30
            public final void call() {
                this.f74884a.m115530H();
            }
        }, new d30() { // from class: l.cbw
            @Override // p149l.d30
            public final void call() {
                this.f80185a.m115531I();
            }
        }, new d30() { // from class: l.dbw
            @Override // p149l.d30
            public final void call() {
                this.f85344a.m115532J();
            }
        });
    }
}
