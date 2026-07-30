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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class tqf0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f171579f;

    /* JADX INFO: renamed from: g */
    public VImage f171580g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f171581h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f171582i;

    /* JADX INFO: renamed from: j */
    public Act f171583j;

    /* JADX INFO: renamed from: k */
    public cwf0 f171584k;

    public tqf0(@NonNull Act act) {
        super(act, v7c0.f180356c);
        this.f171583j = act;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: E */
    private void m190102E() {
        Window window = getWindow();
        this.f171579f.post(new Runnable() { // from class: l.pqf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f150784a.m190110G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C20248a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m190103F() {
        setContentView(m190109D(LayoutInflater.from(this.f171583j), null));
        m148650v(new qqf0());
        xdl0.m208329E0(this.f171580g, new View.OnClickListener() { // from class: l.rqf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160629a.m190104H(view);
            }
        });
        xdl0.m208329E0(this.f171582i, new View.OnClickListener() { // from class: l.sqf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165983a.m190105I(view);
            }
        });
        qib0.f154691G.m102325I0(this.f171581h, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJISTdVTENZNTZHWEFWTENVR1VMN0YyQUJKTzVNUjE0IiwidyI6NTY0LCJoIjo2MzMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMDMzNDI2MDAyODg5ODQxOTY5fQ.webp", t100.m186890d(188.0f), t100.m186890d(211.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m190104H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m190105I(View view) {
        o0x.m162214w(this.f171583j, "homepage_popup");
        zvf0.m220396r("e_marriage_event_popup_enter", "p_marriage_event_popup");
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m190109D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uqf0.m194992b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m190110G() {
        getBehavior().setPeekHeight(this.f171579f.getHeight());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m190111J(DialogInterface dialogInterface) {
        i0e.m133796e(this.f171584k);
        zch0.m218024a().m218033j(false, "SpringFestivalActivitiesBottomSheetDialog");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m190103F();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_marriage_event_popup", Dialog.class.getName());
        this.f171584k = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nqf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f140061a.m190111J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.oqf0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(true, "SpringFestivalActivitiesBottomSheetDialog");
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m190102E();
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfigM194749f1 = upa.m194749f1();
        if (springFestivalMarriageActivitiesConfigM194749f1 != null) {
            CoreModule.f17545c.f19639e0.f149455q4.put(Integer.valueOf(springFestivalMarriageActivitiesConfigM194749f1.version));
        }
    }

    /* JADX INFO: renamed from: l.tqf0$a */
    public class C20248a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f171585a;

        public C20248a(BottomSheetBehavior bottomSheetBehavior) {
            this.f171585a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f171585a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                tqf0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
