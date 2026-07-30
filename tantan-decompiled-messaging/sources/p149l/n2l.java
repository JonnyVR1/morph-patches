package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n2l extends l5j0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f136840f;

    /* JADX INFO: renamed from: g */
    public VLinear f136841g;

    /* JADX INFO: renamed from: h */
    public VImage f136842h;

    /* JADX INFO: renamed from: i */
    public VImage f136843i;

    /* JADX INFO: renamed from: j */
    public VText f136844j;

    /* JADX INFO: renamed from: k */
    public VText f136845k;

    /* JADX INFO: renamed from: l */
    public VText f136846l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f136847m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f136848n;

    public n2l(Act act) {
        super(act, v7c0.f180356c);
        this.f136848n = new C18614a();
        m157665C(act);
    }

    /* JADX INFO: renamed from: C */
    private void m157665C(Context context) {
        setContentView(m157671A(LayoutInflater.from(context), null));
        if (upa.m194847z()) {
            this.f136843i.setImageResource(x2c0.f190047ch);
            this.f136846l.setBackgroundResource(x2c0.f189655Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m157666D(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m157667E(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public View m157671A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o2l.m162302b(this, layoutInflater, viewGroup);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f136847m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f136847m.setBottomSheetCallback(this.f136848n);
        frameLayout.setBackgroundResource(x2c0.f190094e1);
        xdl0.m208329E0(this.f136846l, new View.OnClickListener() { // from class: l.l2l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125796a.m157666D(view);
            }
        });
        xdl0.m208329E0(this.f136842h, new View.OnClickListener() { // from class: l.m2l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130930a.m157667E(view);
            }
        });
    }

    /* JADX INFO: renamed from: l.n2l$a */
    public class C18614a extends BottomSheetBehavior.BottomSheetCallback {
        public C18614a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                n2l.this.f136847m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
