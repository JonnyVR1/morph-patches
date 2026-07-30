package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class d5l extends pej0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f85163f;

    /* JADX INFO: renamed from: g */
    public VLinear f85164g;

    /* JADX INFO: renamed from: h */
    public VImage f85165h;

    /* JADX INFO: renamed from: i */
    public VImage f85166i;

    /* JADX INFO: renamed from: j */
    public VText f85167j;

    /* JADX INFO: renamed from: k */
    public VText f85168k;

    /* JADX INFO: renamed from: l */
    public VText f85169l;

    /* JADX INFO: renamed from: m */
    public BottomSheetBehavior f85170m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f85171n;

    public d5l(Act act) {
        super(act, agc0.f71117c);
        this.f85171n = new C16454a();
        m114308C(act);
    }

    /* JADX INFO: renamed from: C */
    private void m114308C(Context context) {
        setContentView(m114314A(LayoutInflater.from(context), null));
        if (gra.m131778z()) {
            this.f85166i.setImageResource(dbc0.f86506Qh);
            this.f85169l.setBackgroundResource(dbc0.f86520R);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public /* synthetic */ void m114309D(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m114310E(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public View m114314A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e5l.m119546b(this, layoutInflater, viewGroup);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f85170m = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f85170m.setBottomSheetCallback(this.f85171n);
        frameLayout.setBackgroundResource(dbc0.f86974f1);
        bnl0.m105509E0(this.f85169l, new View.OnClickListener() { // from class: l.b5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75075a.m114309D(view);
            }
        });
        bnl0.m105509E0(this.f85165h, new View.OnClickListener() { // from class: l.c5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79884a.m114310E(view);
            }
        });
    }

    /* JADX INFO: renamed from: l.d5l$a */
    public class C16454a extends BottomSheetBehavior.BottomSheetCallback {
        public C16454a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                d5l.this.f85170m.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
