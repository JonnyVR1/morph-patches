package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopFragAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class hob0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f108805f;

    /* JADX INFO: renamed from: g */
    public VImage f108806g;

    /* JADX INFO: renamed from: h */
    public VImage f108807h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f108808i;

    /* JADX INFO: renamed from: j */
    public VButton f108809j;

    /* JADX INFO: renamed from: k */
    public final Act f108810k;

    /* JADX INFO: renamed from: l */
    public final Question f108811l;

    /* JADX INFO: renamed from: m */
    public cwf0 f108812m;

    public hob0(@NonNull Act act, Question question) {
        super(act);
        this.f108810k = act;
        this.f108811l = question;
    }

    /* JADX INFO: renamed from: D */
    private void m132210D() {
        Window window = getWindow();
        window.setDimAmount(0.3f);
        this.f108805f.post(new Runnable() { // from class: l.eob0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92434a.m132219F();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17362a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: E */
    private void m132211E() {
        setContentView(m132218C(LayoutInflater.from(this.f108810k), null));
        xdl0.m208329E0(this.f108806g, new View.OnClickListener() { // from class: l.fob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98528a.m132212G(view);
            }
        });
        this.f108808i.setText(this.f108811l.text);
        if (upa.m194847z()) {
            this.f108807h.setImageResource(n3c0.f136957V);
            this.f108809j.setBackgroundResource(x2c0.f189655Q);
        }
        xdl0.m208329E0(this.f108809j, new View.OnClickListener() { // from class: l.gob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103669a.m132213H(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m132212G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m132213H(View view) {
        zvf0.m220396r("e_add_my_answer", "p_add_my_answer");
        dismiss();
        if (wn90.m204607V()) {
            return;
        }
        Act act = this.f108810k;
        act.startActivity(ProfileLoopFragAct.m51650Z1(act, LoopInputType.MY_QUESTION_PATCH, "other_question", this.f108811l.f56011id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m132214I(DialogInterface dialogInterface) {
        i0e.m133796e(this.f108812m);
    }

    /* JADX INFO: renamed from: C */
    public View m132218C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iob0.m137313b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m132219F() {
        getBehavior().setPeekHeight(this.f108805f.getHeight());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m132211E();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_add_my_answer", Dialog.class.getName());
        this.f108812m = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(j760.m140076a("qa_question_name", this.f108811l.text));
        i0e.m133797f(this.f108812m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dob0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f87158a.m132214I(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m132210D();
    }

    /* JADX INFO: renamed from: l.hob0$a */
    public class C17362a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f108813a;

        public C17362a(BottomSheetBehavior bottomSheetBehavior) {
            this.f108813a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f108813a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                hob0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
