package p009l;

import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.i5c0;
import l.kec0;
import l.l5j0;
import l.n3c0;
import l.upa;
import l.xdl0;
import l.zvf0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jec0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f15070f;

    /* JADX INFO: renamed from: g */
    public ImageView f15071g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f15072h;

    /* JADX INFO: renamed from: i */
    public VText f15073i;

    /* JADX INFO: renamed from: j */
    public VText_Medium f15074j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f15075k;

    /* JADX INFO: renamed from: l */
    public cwf0 f15076l;

    /* JADX INFO: renamed from: m */
    public final String f15077m;

    public jec0(@NonNull Act act) {
        super(act, z7c0.f23503b);
        this.f15077m = "p_messages_verify_popup";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m16946E() {
        Window window = getWindow();
        this.f15070f.post(new Runnable() { // from class: l.iec0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14592a.m16947F();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0972a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m16947F() {
        getBehavior().setPeekHeight(this.f15070f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m16948G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m16949H(View view) {
        zvf0.r("e_verify_upper_button", "p_messages_verify_popup");
        wn90.m24369w0(s());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m16950I(View view) {
        zvf0.r("e_verify_svip_button", "p_messages_verify_popup");
        CoreModule.P().a().pr(m(), "p_messages,verify_popup", Privilege.see_who_likes_me);
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m16954D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kec0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m16955J(DialogInterface dialogInterface) {
        i0e.m16064e(this.f15076l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        setContentView(m16954D(s().getLayoutInflater(), null));
        this.f15072h.setText("为了保护真实用户体验，未认证用户限制配对次数");
        this.f15073i.setText("每日配对上限" + upa.Q0() + "次，认证后配对无上限");
        xdl0.E0(this.f15071g, new View.OnClickListener() { // from class: l.eec0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12521a.m16948G(view);
            }
        });
        xdl0.E0(this.f15074j, new View.OnClickListener() { // from class: l.fec0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12964a.m16949H(view);
            }
        });
        xdl0.E0(this.f15075k, new View.OnClickListener() { // from class: l.gec0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13458a.m16950I(view);
            }
        });
        setCanceledOnTouchOutside(true);
        if (this.f15076l == null) {
            this.f15076l = i0e.m16062c("p_messages_verify_popup", jec0.class.getSimpleName());
        }
        i0e.m16065f(this.f15076l);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hec0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f14017a.m16955J(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m16946E();
    }

    /* JADX INFO: renamed from: l.jec0$a */
    public class C0972a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f15078a;

        public C0972a(BottomSheetBehavior bottomSheetBehavior) {
            this.f15078a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f15078a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                jec0.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
