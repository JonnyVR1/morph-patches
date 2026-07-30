package p006l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import l.szd;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zd0 extends szd {

    /* JADX INFO: renamed from: n */
    public static volatile zd0 f28710n;

    /* JADX INFO: renamed from: j */
    public Act f28711j;

    /* JADX INFO: renamed from: k */
    public cf0 f28712k;

    /* JADX INFO: renamed from: l */
    public df0 f28713l;

    /* JADX INFO: renamed from: m */
    public View f28714m;

    public zd0(Act act) {
        super(act, false, v7c0.f24196p);
        this.f28711j = act;
        m28694I();
    }

    /* JADX INFO: renamed from: H */
    public static zd0 m28693H(Act act) {
        if (f28710n == null) {
            synchronized (zd0.class) {
                try {
                    if (f28710n == null) {
                        f28710n = new zd0(act);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28710n;
    }

    /* JADX INFO: renamed from: I */
    private void m28694I() {
        this.f28712k = new cf0(this.f28711j, this);
        df0 df0Var = new df0(this.f28711j);
        this.f28713l = df0Var;
        this.f28712k.C(df0Var);
        this.f28714m = this.f28713l.inflateView(this.f28711j.getLayoutInflater(), null);
    }

    /* JADX INFO: renamed from: J */
    private void m28695J() {
        xdl0.E0(this.f28713l.f10364b, new View.OnClickListener() { // from class: l.wd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25104a.m28696K(view);
            }
        });
        xdl0.E0(this.f28713l.f10367e, new View.OnClickListener() { // from class: l.xd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27454a.m28697L(view);
            }
        });
        x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f28131a.m28698M(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m28696K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m28697L(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m28698M(DialogInterface dialogInterface) {
        cf0 cf0Var = this.f28712k;
        if (cf0Var != null) {
            cf0Var.m13417m0();
            this.f28712k.m13402W();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final void m28699N() {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        PutongAct.setLightStatusBar(getWindow(), 1024);
    }

    /* JADX INFO: renamed from: O */
    public void m28700O() {
        this.f28712k.m13405Z();
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(this.f28714m);
        m28699N();
        m28695J();
    }
}
