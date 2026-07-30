package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import l.f6c0;
import l.hu0;
import l.i30;
import l.u4c0;
import l.v7c0;
import l.xdl0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xff extends hu0 {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f22259a;

    public xff(Context context) {
        super(context, v7c0.E);
        m25910r(context);
    }

    /* JADX INFO: renamed from: r */
    private void m25910r(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(f6c0.K2, (ViewGroup) null);
        setContentView(viewInflate);
        xdl0.g0(new View[]{viewInflate});
        this.f22259a = viewInflate.findViewById(u4c0.b7);
        xdl0.E0(viewInflate.findViewById(u4c0.j0), new View.OnClickListener() { // from class: l.wff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21718a.m25911s(view);
            }
        });
        this.f22259a.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f22259a.setOverScrollMode(0);
        m25912u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m25911s(View view) {
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    private void m25912u() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -1;
        window.setWindowAnimations(v7c0.G);
        window.setAttributes(attributes);
        window.clearFlags(67108864);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        i30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
    }

    /* JADX INFO: renamed from: t */
    public void m25913t(vff vffVar) {
        this.f22259a.setAdapter(vffVar);
    }
}
