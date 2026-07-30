package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class ftp extends g4s {

    /* JADX INFO: renamed from: A */
    public TextView f100768A;

    /* JADX INFO: renamed from: x */
    public TextView f100769x;

    /* JADX INFO: renamed from: y */
    public TextView f100770y;

    /* JADX INFO: renamed from: z */
    public TextView f100771z;

    public ftp(xup xupVar) {
        super(xupVar, LayoutInflater.from(xupVar.act()).inflate(yec0.f198754F2, (ViewGroup) null));
        this.f100769x = (TextView) m72943R().findViewById(mdc0.f136007N6);
        this.f100770y = (TextView) m72943R().findViewById(mdc0.f136129b1);
        this.f100771z = (TextView) m72943R().findViewById(mdc0.f136027Q);
        TextView textView = (TextView) m72943R().findViewById(mdc0.f136178g0);
        this.f100768A = textView;
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.dtp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90610a.m127377o0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m127377o0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m127378p0(x20 x20Var, View view) {
        x20Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public void m127379q0(String str, String str2, String str3, String str4, final x20 x20Var) {
        this.f100769x.setText(str);
        this.f100770y.setText(str2);
        this.f100771z.setText(str3);
        this.f100768A.setText(str4);
        bnl0.m105509E0(this.f100771z, new View.OnClickListener() { // from class: l.etp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95780a.m127378p0(x20Var, view);
            }
        });
        show();
    }
}
