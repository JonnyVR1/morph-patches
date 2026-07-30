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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class czf0 extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f84463f;

    /* JADX INFO: renamed from: g */
    public VImage f84464g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f84465h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f84466i;

    /* JADX INFO: renamed from: j */
    public Act f84467j;

    /* JADX INFO: renamed from: k */
    public l4g0 f84468k;

    public czf0(@NonNull Act act) {
        super(act, agc0.f71117c);
        this.f84467j = act;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: E */
    private void m113331E() {
        Window window = getWindow();
        this.f84463f.post(new Runnable() { // from class: l.yyf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f202105a.m113339G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C16399a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m113332F() {
        setContentView(m113338D(LayoutInflater.from(this.f84467j), null));
        m172033v(new zyf0());
        bnl0.m105509E0(this.f84464g, new View.OnClickListener() { // from class: l.azf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74146a.m113333H(view);
            }
        });
        bnl0.m105509E0(this.f84466i, new View.OnClickListener() { // from class: l.bzf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79133a.m113334I(view);
            }
        });
        uqb0.f180374G.m127109I0(this.f84465h, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJISTdVTENZNTZHWEFWTENVR1VMN0YyQUJKTzVNUjE0IiwidyI6NTY0LCJoIjo2MzMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMDMzNDI2MDAyODg5ODQxOTY5fQ.webp", qa00.m175859d(188.0f), qa00.m175859d(211.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m113333H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m113334I(View view) {
        n3x.m161382w(this.f84467j, "homepage_popup");
        i4g0.m138520r("e_marriage_event_popup_enter", "p_marriage_event_popup");
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m113338D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dzf0.m118741b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m113339G() {
        getBehavior().setPeekHeight(this.f84463f.getHeight());
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m113340J(DialogInterface dialogInterface) {
        w1e.m204401e(this.f84468k);
        hlh0.m135741a().m135750j(false, "SpringFestivalActivitiesBottomSheetDialog");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m113332F();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_marriage_event_popup", Dialog.class.getName());
        this.f84468k = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wyf0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f191638a.m113340J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.xyf0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(true, "SpringFestivalActivitiesBottomSheetDialog");
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m113331E();
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfigM131680f1 = gra.m131680f1();
        if (springFestivalMarriageActivitiesConfigM131680f1 != null) {
            CoreModule.f18264c.f20381e0.f89312q4.put(Integer.valueOf(springFestivalMarriageActivitiesConfigM131680f1.version));
        }
    }

    /* JADX INFO: renamed from: l.czf0$a */
    public class C16399a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f84469a;

        public C16399a(BottomSheetBehavior bottomSheetBehavior) {
            this.f84469a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f84469a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                czf0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
