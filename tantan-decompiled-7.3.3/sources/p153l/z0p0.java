package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class z0p0 extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public TextView f202364a;

    /* JADX INFO: renamed from: b */
    public TextView f202365b;

    /* JADX INFO: renamed from: c */
    public TextView f202366c;

    /* JADX INFO: renamed from: d */
    public ImageView f202367d;

    public z0p0(Context context, @NonNull final x20 x20Var, @NonNull final x20 x20Var2, @NonNull final x20 x20Var3) {
        super(-2, -2);
        View viewInflate = LayoutInflater.from(context).inflate(yec0.f199222qa, (ViewGroup) null);
        this.f202364a = (TextView) viewInflate.findViewById(mdc0.f136074V1);
        this.f202365b = (TextView) viewInflate.findViewById(mdc0.f136143c5);
        this.f202367d = (ImageView) viewInflate.findViewById(mdc0.f136046S0);
        this.f202366c = (TextView) viewInflate.findViewById(mdc0.f136037R0);
        setContentView(viewInflate);
        setOutsideTouchable(true);
        bnl0.m105509E0(this.f202364a, new View.OnClickListener() { // from class: l.w0p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186624a.m218143d(x20Var, view);
            }
        });
        bnl0.m105509E0(this.f202365b, new View.OnClickListener() { // from class: l.x0p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191925a.m218144e(x20Var2, view);
            }
        });
        bnl0.m105509E0(this.f202366c, new View.OnClickListener() { // from class: l.y0p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197030a.m218145f(x20Var3, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m218143d(x20 x20Var, View view) {
        x20Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m218144e(x20 x20Var, View view) {
        x20Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m218145f(x20 x20Var, View view) {
        x20Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public void m218146g(View view, boolean z) {
        super.showAsDropDown(view, -qa00.m175859d(30.0f), -qa00.m175859d(10.0f));
        bnl0.m105524M(this.f202365b, z);
    }
}
