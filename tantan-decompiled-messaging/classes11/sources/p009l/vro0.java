package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import l.d30;
import l.g5c0;
import l.t100;
import l.t6c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vro0 extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public TextView f21755a;

    /* JADX INFO: renamed from: b */
    public TextView f21756b;

    /* JADX INFO: renamed from: c */
    public TextView f21757c;

    /* JADX INFO: renamed from: d */
    public ImageView f21758d;

    public vro0(Context context, @NonNull final d30 d30Var, @NonNull final d30 d30Var2, @NonNull final d30 d30Var3) {
        super(-2, -2);
        View viewInflate = LayoutInflater.from(context).inflate(t6c0.qa, (ViewGroup) null);
        this.f21755a = (TextView) viewInflate.findViewById(g5c0.V1);
        this.f21756b = (TextView) viewInflate.findViewById(g5c0.c5);
        this.f21758d = (ImageView) viewInflate.findViewById(g5c0.S0);
        this.f21757c = (TextView) viewInflate.findViewById(g5c0.R0);
        setContentView(viewInflate);
        setOutsideTouchable(true);
        xdl0.E0(this.f21755a, new View.OnClickListener() { // from class: l.sro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20442a.m23699d(d30Var, view);
            }
        });
        xdl0.E0(this.f21756b, new View.OnClickListener() { // from class: l.tro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20846a.m23700e(d30Var2, view);
            }
        });
        xdl0.E0(this.f21757c, new View.OnClickListener() { // from class: l.uro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21318a.m23701f(d30Var3, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m23699d(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m23700e(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m23701f(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public void m23702g(View view, boolean z) {
        super.showAsDropDown(view, -t100.d(30.0f), -t100.d(10.0f));
        xdl0.M(this.f21756b, z);
    }
}
