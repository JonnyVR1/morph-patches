package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopFragAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.i0e;
import l.i5c0;
import l.iob0;
import l.j760;
import l.l5j0;
import l.n3c0;
import l.upa;
import l.wn90;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VButton;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hob0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f12192f;

    /* JADX INFO: renamed from: g */
    public VImage f12193g;

    /* JADX INFO: renamed from: h */
    public VImage f12194h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f12195i;

    /* JADX INFO: renamed from: j */
    public VButton f12196j;

    /* JADX INFO: renamed from: k */
    public final Act f12197k;

    /* JADX INFO: renamed from: l */
    public final Question f12198l;

    /* JADX INFO: renamed from: m */
    public cwf0 f12199m;

    public hob0(@NonNull Act act, Question question) {
        super(act);
        this.f12197k = act;
        this.f12198l = question;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    private void m14652D() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f12192f.post(new Runnable() { // from class: l.eob0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9895a.m14661F();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C0608a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: E */
    private void m14653E() {
        setContentView(m14660C(LayoutInflater.from(this.f12197k), null));
        xdl0.E0(this.f12193g, new View.OnClickListener() { // from class: l.fob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10571a.m14654G(view);
            }
        });
        this.f12195i.setText(this.f12198l.text);
        if (upa.z()) {
            this.f12194h.setImageResource(n3c0.V);
            this.f12196j.setBackgroundResource(x2c0.Q);
        }
        xdl0.E0(this.f12196j, new View.OnClickListener() { // from class: l.gob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11564a.m14655H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m14654G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m14655H(View view) {
        zvf0.r("e_add_my_answer", "p_add_my_answer");
        dismiss();
        if (wn90.V()) {
            return;
        }
        Act act = this.f12197k;
        act.startActivity(ProfileLoopFragAct.m2147Z1(act, LoopInputType.MY_QUESTION_PATCH, "other_question", ((DbObject) this.f12198l).id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m14656I(DialogInterface dialogInterface) {
        i0e.e(this.f12199m);
    }

    /* JADX INFO: renamed from: C */
    public View m14660C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iob0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m14661F() {
        getBehavior().setPeekHeight(this.f12192f.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m14653E();
        cwf0 cwf0VarC = i0e.c("p_add_my_answer", Dialog.class.getName());
        this.f12199m = cwf0VarC;
        cwf0VarC.p(new j760[]{j760.a("qa_question_name", this.f12198l.text)});
        i0e.f(this.f12199m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dob0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f9373a.m14656I(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m14652D();
    }

    /* JADX INFO: renamed from: l.hob0$a */
    public class C0608a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f12200a;

        public C0608a(BottomSheetBehavior bottomSheetBehavior) {
            this.f12200a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f12200a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                hob0.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
