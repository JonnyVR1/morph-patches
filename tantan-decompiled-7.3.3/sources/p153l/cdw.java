package p153l;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes11.dex */
public class cdw extends g1e {

    /* JADX INFO: renamed from: j */
    public Act f81282j;

    /* JADX INFO: renamed from: k */
    public CoreGiftLayer f81283k;

    /* JADX INFO: renamed from: l */
    public x20 f81284l;

    /* JADX INFO: renamed from: m */
    public x20 f81285m;

    public cdw(Act act, x20 x20Var, x20 x20Var2) {
        super(act, false, agc0.f71124j);
        this.f81282j = act;
        this.f81284l = x20Var;
        this.f81285m = x20Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m109261H() {
        x20 x20Var = this.f81284l;
        if (x20Var != null) {
            x20Var.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m109262I() {
        x20 x20Var = this.f81284l;
        if (x20Var != null) {
            x20Var.call();
        }
        this.f81283k.m46626F();
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m109263J() {
        x20 x20Var = this.f81285m;
        if (x20Var != null) {
            x20Var.call();
        }
        dismiss();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CoreGiftLayer coreGiftLayer = (CoreGiftLayer) this.f81282j.inflater().inflate(kec0.f126062t3, (ViewGroup) null, false);
        this.f81283k = coreGiftLayer;
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

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        this.f81283k.setErrorWhenFrameJank(true);
        this.f81283k.m46641z(fdw.m125139e().m125143d(), new x20() { // from class: l.zcw
            @Override // p153l.x20
            public final void call() {
                this.f203835a.m109261H();
            }
        }, new x20() { // from class: l.adw
            @Override // p153l.x20
            public final void call() {
                this.f70741a.m109262I();
            }
        }, new x20() { // from class: l.bdw
            @Override // p153l.x20
            public final void call() {
                this.f76306a.m109263J();
            }
        });
    }
}
