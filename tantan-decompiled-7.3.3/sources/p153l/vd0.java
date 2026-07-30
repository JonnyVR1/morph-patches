package p153l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes9.dex */
public class vd0 extends g1e {

    /* JADX INFO: renamed from: n */
    public static volatile vd0 f183504n;

    /* JADX INFO: renamed from: j */
    public Act f183505j;

    /* JADX INFO: renamed from: k */
    public ye0 f183506k;

    /* JADX INFO: renamed from: l */
    public ze0 f183507l;

    /* JADX INFO: renamed from: m */
    public View f183508m;

    public vd0(Act act) {
        super(act, false, agc0.f71130p);
        this.f183505j = act;
        m200896I();
    }

    /* JADX INFO: renamed from: H */
    public static vd0 m200895H(Act act) {
        if (f183504n == null) {
            synchronized (vd0.class) {
                try {
                    if (f183504n == null) {
                        f183504n = new vd0(act);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f183504n;
    }

    /* JADX INFO: renamed from: I */
    private void m200896I() {
        this.f183506k = new ye0(this.f183505j, this);
        ze0 ze0Var = new ze0(this.f183505j);
        this.f183507l = ze0Var;
        this.f183506k.mo52715C(ze0Var);
        this.f183508m = this.f183507l.inflateView(this.f183505j.getLayoutInflater(), null);
    }

    /* JADX INFO: renamed from: J */
    private void m200897J() {
        bnl0.m105509E0(this.f183507l.f203957b, new View.OnClickListener() { // from class: l.sd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167365a.m200898K(view);
            }
        });
        bnl0.m105509E0(this.f183507l.f203960e, new View.OnClickListener() { // from class: l.td0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173289a.m200899L(view);
            }
        });
        m128500x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ud0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f178479a.m200900M(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m200898K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m200899L(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m200900M(DialogInterface dialogInterface) {
        ye0 ye0Var = this.f183506k;
        if (ye0Var != null) {
            ye0Var.m215390m0();
            this.f183506k.m215375W();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m200901N() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
    }

    /* JADX INFO: renamed from: O */
    public void m200902O() {
        this.f183506k.m215378Z();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f183508m);
        m200901N();
        m200897J();
    }
}
