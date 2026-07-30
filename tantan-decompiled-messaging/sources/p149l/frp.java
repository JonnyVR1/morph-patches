package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class frp extends f2s {

    /* JADX INFO: renamed from: A */
    public TextView f98986A;

    /* JADX INFO: renamed from: x */
    public TextView f98987x;

    /* JADX INFO: renamed from: y */
    public TextView f98988y;

    /* JADX INFO: renamed from: z */
    public TextView f98989z;

    public frp(xsp xspVar) {
        super(xspVar, LayoutInflater.from(xspVar.act()).inflate(t6c0.f168022F2, (ViewGroup) null));
        this.f98987x = (TextView) m71760R().findViewById(g5c0.f100762N6);
        this.f98988y = (TextView) m71760R().findViewById(g5c0.f100884b1);
        this.f98989z = (TextView) m71760R().findViewById(g5c0.f100782Q);
        TextView textView = (TextView) m71760R().findViewById(g5c0.f100933g0);
        this.f98986A = textView;
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.drp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87655a.m122887o0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m122887o0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m122888p0(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public void m122889q0(String str, String str2, String str3, String str4, final d30 d30Var) {
        this.f98987x.setText(str);
        this.f98988y.setText(str2);
        this.f98989z.setText(str3);
        this.f98986A.setText(str4);
        xdl0.m208329E0(this.f98989z, new View.OnClickListener() { // from class: l.erp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92952a.m122888p0(d30Var, view);
            }
        });
        show();
    }
}
