package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class vro0 extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public TextView f182736a;

    /* JADX INFO: renamed from: b */
    public TextView f182737b;

    /* JADX INFO: renamed from: c */
    public TextView f182738c;

    /* JADX INFO: renamed from: d */
    public ImageView f182739d;

    public vro0(Context context, @NonNull final d30 d30Var, @NonNull final d30 d30Var2, @NonNull final d30 d30Var3) {
        super(-2, -2);
        View viewInflate = LayoutInflater.from(context).inflate(t6c0.f168490qa, (ViewGroup) null);
        this.f182736a = (TextView) viewInflate.findViewById(g5c0.f100829V1);
        this.f182737b = (TextView) viewInflate.findViewById(g5c0.f100898c5);
        this.f182739d = (ImageView) viewInflate.findViewById(g5c0.f100801S0);
        this.f182738c = (TextView) viewInflate.findViewById(g5c0.f100792R0);
        setContentView(viewInflate);
        setOutsideTouchable(true);
        xdl0.m208329E0(this.f182736a, new View.OnClickListener() { // from class: l.sro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166118a.m199745d(d30Var, view);
            }
        });
        xdl0.m208329E0(this.f182737b, new View.OnClickListener() { // from class: l.tro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171830a.m199746e(d30Var2, view);
            }
        });
        xdl0.m208329E0(this.f182738c, new View.OnClickListener() { // from class: l.uro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177852a.m199747f(d30Var3, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m199745d(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m199746e(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m199747f(d30 d30Var, View view) {
        d30Var.call();
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public void m199748g(View view, boolean z) {
        super.showAsDropDown(view, -t100.m186890d(30.0f), -t100.m186890d(10.0f));
        xdl0.m208344M(this.f182737b, z);
    }
}
