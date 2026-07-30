package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class lup extends PopupWindow {
    public lup(Context context, String str, final x20 x20Var, String str2, final x20 x20Var2) {
        super(-2, -2);
        View viewInflate = LayoutInflater.from(context).inflate(yec0.f198814K2, (ViewGroup) null);
        setContentView(viewInflate);
        setOutsideTouchable(true);
        TextView textView = (TextView) viewInflate.findViewById(mdc0.f136012O2);
        textView.setText(str);
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.jup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122731a.m155952c(x20Var, view);
            }
        });
        TextView textView2 = (TextView) viewInflate.findViewById(mdc0.f136021P2);
        textView2.setText(str2);
        bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.kup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128913a.m155953d(x20Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m155952c(x20 x20Var, View view) {
        x20Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m155953d(x20 x20Var, View view) {
        x20Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: e */
    public void m155954e(View view, boolean z) {
        super.showAsDropDown(view, 0, qa00.f156318e);
    }
}
