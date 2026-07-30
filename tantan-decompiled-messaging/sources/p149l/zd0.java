package p149l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes9.dex */
public class zd0 extends szd {

    /* JADX INFO: renamed from: n */
    public static volatile zd0 f202607n;

    /* JADX INFO: renamed from: j */
    public Act f202608j;

    /* JADX INFO: renamed from: k */
    public cf0 f202609k;

    /* JADX INFO: renamed from: l */
    public df0 f202610l;

    /* JADX INFO: renamed from: m */
    public View f202611m;

    public zd0(Act act) {
        super(act, false, v7c0.f180369p);
        this.f202608j = act;
        m218115I();
    }

    /* JADX INFO: renamed from: H */
    public static zd0 m218114H(Act act) {
        if (f202607n == null) {
            synchronized (zd0.class) {
                try {
                    if (f202607n == null) {
                        f202607n = new zd0(act);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f202607n;
    }

    /* JADX INFO: renamed from: I */
    private void m218115I() {
        this.f202609k = new cf0(this.f202608j, this);
        df0 df0Var = new df0(this.f202608j);
        this.f202610l = df0Var;
        this.f202609k.mo51532C(df0Var);
        this.f202611m = this.f202610l.inflateView(this.f202608j.getLayoutInflater(), null);
    }

    /* JADX INFO: renamed from: J */
    private void m218116J() {
        xdl0.m208329E0(this.f202610l.f85873b, new View.OnClickListener() { // from class: l.wd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185747a.m218117K(view);
            }
        });
        xdl0.m208329E0(this.f202610l.f85876e, new View.OnClickListener() { // from class: l.xd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192288a.m218118L(view);
            }
        });
        m186758x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f197510a.m218119M(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m218117K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m218118L(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m218119M(DialogInterface dialogInterface) {
        cf0 cf0Var = this.f202609k;
        if (cf0Var != null) {
            cf0Var.m106471m0();
            this.f202609k.m106456W();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m218120N() {
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
    }

    /* JADX INFO: renamed from: O */
    public void m218121O() {
        this.f202609k.m106459Z();
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f202611m);
        m218120N();
        m218116J();
    }
}
