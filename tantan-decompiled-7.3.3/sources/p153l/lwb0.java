package p153l;

import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopFragAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class lwb0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f133794f;

    /* JADX INFO: renamed from: g */
    public VImage f133795g;

    /* JADX INFO: renamed from: h */
    public VImage f133796h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f133797i;

    /* JADX INFO: renamed from: j */
    public VButton f133798j;

    /* JADX INFO: renamed from: k */
    public final Act f133799k;

    /* JADX INFO: renamed from: l */
    public final Question f133800l;

    /* JADX INFO: renamed from: m */
    public l4g0 f133801m;

    public lwb0(@NonNull Act act, Question question) {
        super(act);
        this.f133799k = act;
        this.f133800l = question;
    }

    /* JADX INFO: renamed from: D */
    private void m156029D() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f133794f.post(new Runnable() { // from class: l.iwb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117262a.m156038F();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C18469a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: E */
    private void m156030E() {
        setContentView(m156037C(LayoutInflater.from(this.f133799k), null));
        bnl0.m105509E0(this.f133795g, new View.OnClickListener() { // from class: l.jwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122907a.m156031G(view);
            }
        });
        this.f133797i.setText(this.f133800l.text);
        if (gra.m131778z()) {
            this.f133796h.setImageResource(tbc0.f172872V);
            this.f133798j.setBackgroundResource(dbc0.f86520R);
        }
        bnl0.m105509E0(this.f133798j, new View.OnClickListener() { // from class: l.kwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129044a.m156032H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m156031G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m156032H(View view) {
        i4g0.m138520r("e_add_my_answer", "p_add_my_answer");
        dismiss();
        if (aw90.m100567V()) {
            return;
        }
        Act act = this.f133799k;
        act.startActivity(ProfileLoopFragAct.m52833a2(act, LoopInputType.MY_QUESTION_PATCH, "other_question", this.f133800l.f56859id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m156033I(DialogInterface dialogInterface) {
        w1e.m204401e(this.f133801m);
    }

    /* JADX INFO: renamed from: C */
    public View m156037C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mwb0.m160476b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m156038F() {
        getBehavior().setPeekHeight(this.f133794f.getHeight());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m156030E();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_add_my_answer", Dialog.class.getName());
        this.f133801m = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(pf60.m172085a("qa_question_name", this.f133800l.text));
        w1e.m204402f(this.f133801m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hwb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f111888a.m156033I(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m156029D();
    }

    /* JADX INFO: renamed from: l.lwb0$a */
    public class C18469a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f133802a;

        public C18469a(BottomSheetBehavior bottomSheetBehavior) {
            this.f133802a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f133802a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                lwb0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
