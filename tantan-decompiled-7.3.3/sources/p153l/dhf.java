package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.agora.rtc2.internal.AudioRoutingController;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class dhf extends nu0 {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f88491a;

    public dhf(Context context) {
        super(context, agc0.f71111E);
        m115792r(context);
    }

    /* JADX INFO: renamed from: r */
    private void m115792r(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(kec0.f125483K2, (ViewGroup) null);
        setContentView(viewInflate);
        bnl0.m105556g0(viewInflate);
        this.f88491a = (VRecyclerView) viewInflate.findViewById(adc0.f70301d7);
        bnl0.m105509E0(viewInflate.findViewById(adc0.f70395j0), new View.OnClickListener() { // from class: l.chf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81801a.m115793s(view);
            }
        });
        this.f88491a.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f88491a.setOverScrollMode(0);
        m115794u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m115793s(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: u */
    private void m115794u() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -1;
        window.setWindowAnimations(agc0.f71113G);
        window.setAttributes(attributes);
        window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        window.clearFlags(131072);
        window.getDecorView().setSystemUiVisibility(1024);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        c30 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo102186m();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    /* JADX INFO: renamed from: t */
    public void m115795t(bhf bhfVar) {
        this.f88491a.setAdapter(bhfVar);
    }
}
