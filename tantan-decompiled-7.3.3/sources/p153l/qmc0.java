package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class qmc0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f158313f;

    /* JADX INFO: renamed from: g */
    public ImageView f158314g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f158315h;

    /* JADX INFO: renamed from: i */
    public VText f158316i;

    /* JADX INFO: renamed from: j */
    public VText_Medium f158317j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f158318k;

    /* JADX INFO: renamed from: l */
    public l4g0 f158319l;

    /* JADX INFO: renamed from: m */
    public final String f158320m;

    public qmc0(@NonNull Act act) {
        super(act, egc0.f93914b);
        this.f158320m = "p_messages_verify_popup";
    }

    /* JADX INFO: renamed from: E */
    private void m177080E() {
        Window window = getWindow();
        this.f158313f.post(new Runnable() { // from class: l.pmc0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153133a.m177081F();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C19598a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m177081F() {
        getBehavior().setPeekHeight(this.f158313f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m177082G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m177083H(View view) {
        i4g0.m138520r("e_verify_upper_button", "p_messages_verify_popup");
        aw90.m100592w0((Act) m172030s());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m177084I(View view) {
        i4g0.m138520r("e_verify_svip_button", "p_messages_verify_popup");
        CoreModule.m30933P().m143405a().mo34568pr(mo22138m(), "p_messages,verify_popup", Privilege.see_who_likes_me);
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m177088D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rmc0.m182052b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m177089J(DialogInterface dialogInterface) {
        w1e.m204401e(this.f158319l);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m177088D(m172030s().getLayoutInflater(), null));
        this.f158315h.setText("为了保护真实用户体验，未认证用户限制配对次数");
        this.f158316i.setText("每日配对上限" + gra.m131616Q0() + "次，认证后配对无上限");
        bnl0.m105509E0(this.f158314g, new View.OnClickListener() { // from class: l.lmc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132674a.m177082G(view);
            }
        });
        bnl0.m105509E0(this.f158317j, new View.OnClickListener() { // from class: l.mmc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137559a.m177083H(view);
            }
        });
        bnl0.m105509E0(this.f158318k, new View.OnClickListener() { // from class: l.nmc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142695a.m177084I(view);
            }
        });
        setCanceledOnTouchOutside(true);
        if (this.f158319l == null) {
            this.f158319l = w1e.m204399c("p_messages_verify_popup", qmc0.class.getSimpleName());
        }
        w1e.m204402f(this.f158319l);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.omc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f147921a.m177089J(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m177080E();
    }

    /* JADX INFO: renamed from: l.qmc0$a */
    public class C19598a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f158321a;

        public C19598a(BottomSheetBehavior bottomSheetBehavior) {
            this.f158321a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f158321a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                qmc0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
