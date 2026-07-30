package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.agora.rtc2.internal.AudioRoutingController;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class xff extends hu0 {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f192685a;

    public xff(Context context) {
        super(context, v7c0.f180350E);
        m208605r(context);
    }

    /* JADX INFO: renamed from: r */
    private void m208605r(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(f6c0.f95429K2, (ViewGroup) null);
        setContentView(viewInflate);
        xdl0.m208376g0(viewInflate);
        this.f192685a = (VRecyclerView) viewInflate.findViewById(u4c0.f174176b7);
        xdl0.m208329E0(viewInflate.findViewById(u4c0.f174304j0), new View.OnClickListener() { // from class: l.wff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186078a.m208606s(view);
            }
        });
        this.f192685a.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f192685a.setOverScrollMode(0);
        m208607u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m208606s(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: u */
    private void m208607u() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -1;
        window.setWindowAnimations(v7c0.f180352G);
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        i30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo134126m();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    /* JADX INFO: renamed from: t */
    public void m208608t(vff vffVar) {
        this.f192685a.setAdapter(vffVar);
    }
}
