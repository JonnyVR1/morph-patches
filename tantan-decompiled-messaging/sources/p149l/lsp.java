package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class lsp extends PopupWindow {
    public lsp(Context context, String str, final d30 d30Var, String str2, final d30 d30Var2) {
        super(-2, -2);
        View viewInflate = LayoutInflater.from(context).inflate(t6c0.f168082K2, (ViewGroup) null);
        setContentView(viewInflate);
        setOutsideTouchable(true);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f100767O2);
        textView.setText(str);
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.jsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119530a.m151637c(d30Var, view);
            }
        });
        TextView textView2 = (TextView) viewInflate.findViewById(g5c0.f100776P2);
        textView2.setText(str2);
        xdl0.m208329E0(textView2, new View.OnClickListener() { // from class: l.ksp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124497a.m151638d(d30Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m151637c(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m151638d(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: e */
    public void m151639e(View view, boolean z) {
        super.showAsDropDown(view, 0, t100.f167256e);
    }
}
