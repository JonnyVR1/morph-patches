package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p1.mobile.android.app.Act;
import l.l5j0;
import l.p4c0;
import l.upa;
import l.v7c0;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n2l extends l5j0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f6466f;

    /* JADX INFO: renamed from: g */
    public VLinear f6467g;

    /* JADX INFO: renamed from: h */
    public VImage f6468h;

    /* JADX INFO: renamed from: i */
    public VImage f6469i;

    /* JADX INFO: renamed from: j */
    public VText f6470j;

    /* JADX INFO: renamed from: k */
    public VText f6471k;

    /* JADX INFO: renamed from: l */
    public VText f6472l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f6473m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f6474n;

    public n2l(Act act) {
        super(act, v7c0.c);
        this.f6474n = new C3385a();
        m8298C(act);
    }

    /* JADX INFO: renamed from: C */
    private void m8298C(Context context) {
        setContentView(m8304A(LayoutInflater.from(context), null));
        if (upa.z()) {
            this.f6469i.setImageResource(x2c0.ch);
            this.f6472l.setBackgroundResource(x2c0.Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m8299D(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m8300E(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public View m8304A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o2l.m8390b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f6473m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f6473m.setBottomSheetCallback(this.f6474n);
        frameLayout.setBackgroundResource(x2c0.e1);
        xdl0.E0(this.f6472l, new View.OnClickListener() { // from class: l.l2l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5745a.m8299D(view);
            }
        });
        xdl0.E0(this.f6468h, new View.OnClickListener() { // from class: l.m2l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6244a.m8300E(view);
            }
        });
    }

    /* JADX INFO: renamed from: l.n2l$a */
    public class C3385a extends BottomSheetBehavior.BottomSheetCallback {
        public C3385a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                n2l.this.f6473m.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
