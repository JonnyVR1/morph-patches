package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class jec0 extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f117547f;

    /* JADX INFO: renamed from: g */
    public ImageView f117548g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f117549h;

    /* JADX INFO: renamed from: i */
    public VText f117550i;

    /* JADX INFO: renamed from: j */
    public VText_Medium f117551j;

    /* JADX INFO: renamed from: k */
    public VText_Medium f117552k;

    /* JADX INFO: renamed from: l */
    public cwf0 f117553l;

    /* JADX INFO: renamed from: m */
    public final String f117554m;

    public jec0(@NonNull Act act) {
        super(act, z7c0.f201999b);
        this.f117554m = "p_messages_verify_popup";
    }

    /* JADX INFO: renamed from: E */
    private void m141108E() {
        Window window = getWindow();
        this.f117547f.post(new Runnable() { // from class: l.iec0
            @Override // java.lang.Runnable
            public final void run() {
                this.f112751a.m141109F();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            window.setDimAmount(0.3f);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17759a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m141109F() {
        getBehavior().setPeekHeight(this.f117547f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m141110G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m141111H(View view) {
        zvf0.m220396r("e_verify_upper_button", "p_messages_verify_popup");
        wn90.m204632w0((Act) m148647s());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m141112I(View view) {
        zvf0.m220396r("e_verify_svip_button", "p_messages_verify_popup");
        CoreModule.m29935P().m94651a().mo33565pr(mo21139m(), "p_messages,verify_popup", Privilege.see_who_likes_me);
        dismiss();
    }

    /* JADX INFO: renamed from: D */
    public View m141116D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kec0.m145760b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m141117J(DialogInterface dialogInterface) {
        i0e.m133796e(this.f117553l);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m141116D(m148647s().getLayoutInflater(), null));
        this.f117549h.setText("为了保护真实用户体验，未认证用户限制配对次数");
        this.f117550i.setText("每日配对上限" + upa.m194685Q0() + "次，认证后配对无上限");
        xdl0.m208329E0(this.f117548g, new View.OnClickListener() { // from class: l.eec0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90733a.m141110G(view);
            }
        });
        xdl0.m208329E0(this.f117551j, new View.OnClickListener() { // from class: l.fec0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97120a.m141111H(view);
            }
        });
        xdl0.m208329E0(this.f117552k, new View.OnClickListener() { // from class: l.gec0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102183a.m141112I(view);
            }
        });
        setCanceledOnTouchOutside(true);
        if (this.f117553l == null) {
            this.f117553l = i0e.m133794c("p_messages_verify_popup", jec0.class.getSimpleName());
        }
        i0e.m133797f(this.f117553l);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hec0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f107364a.m141117J(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m141108E();
    }

    /* JADX INFO: renamed from: l.jec0$a */
    public class C17759a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f117555a;

        public C17759a(BottomSheetBehavior bottomSheetBehavior) {
            this.f117555a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f117555a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                jec0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
