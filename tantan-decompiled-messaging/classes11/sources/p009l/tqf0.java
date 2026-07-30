package p009l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.i5c0;
import l.l5j0;
import l.n3c0;
import l.qib0;
import l.t100;
import l.upa;
import l.uqf0;
import l.v7c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tqf0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f20825f;

    /* JADX INFO: renamed from: g */
    public VImage f20826g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f20827h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f20828i;

    /* JADX INFO: renamed from: j */
    public Act f20829j;

    /* JADX INFO: renamed from: k */
    public cwf0 f20830k;

    public tqf0(@NonNull Act act) {
        super(act, v7c0.c);
        this.f20829j = act;
        setCancelable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m22623E() {
        Window window = getWindow();
        this.f20825f.post(new Runnable() { // from class: l.pqf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18840a.m22631G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C1205a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m22624F() {
        setContentView(m22630D(LayoutInflater.from(this.f20829j), null));
        v(new qqf0());
        xdl0.E0(this.f20826g, new View.OnClickListener() { // from class: l.rqf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19946a.m22625H(view);
            }
        });
        xdl0.E0(this.f20828i, new View.OnClickListener() { // from class: l.sqf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20419a.m22626I(view);
            }
        });
        qib0.G.I0(this.f20827h, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJISTdVTENZNTZHWEFWTENVR1VMN0YyQUJKTzVNUjE0IiwidyI6NTY0LCJoIjo2MzMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMDMzNDI2MDAyODg5ODQxOTY5fQ.webp", t100.d(188.0f), t100.d(211.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m22625H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m22626I(View view) {
        o0x.m19594w(this.f20829j, "homepage_popup");
        zvf0.r("e_marriage_event_popup_enter", "p_marriage_event_popup");
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m22630D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uqf0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m22631G() {
        getBehavior().setPeekHeight(this.f20825f.getHeight());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22632J(DialogInterface dialogInterface) {
        i0e.m16064e(this.f20830k);
        zch0.m25654a().m25663j(false, "SpringFestivalActivitiesBottomSheetDialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m22624F();
        cwf0 cwf0VarM16062c = i0e.m16062c("p_marriage_event_popup", Dialog.class.getName());
        this.f20830k = cwf0VarM16062c;
        i0e.m16065f(cwf0VarM16062c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nqf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f17605a.m22632J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.oqf0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.m25654a().m25663j(true, "SpringFestivalActivitiesBottomSheetDialog");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m22623E();
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfigF1 = upa.f1();
        if (springFestivalMarriageActivitiesConfigF1 != null) {
            CoreModule.c.e0.q4.put(Integer.valueOf(springFestivalMarriageActivitiesConfigF1.version));
        }
    }

    /* JADX INFO: renamed from: l.tqf0$a */
    public class C1205a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f20831a;

        public C1205a(BottomSheetBehavior bottomSheetBehavior) {
            this.f20831a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f20831a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                tqf0.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
