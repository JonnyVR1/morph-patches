package p153l;

import android.R;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class gyp extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f107082f;

    /* JADX INFO: renamed from: g */
    public VImage f107083g;

    /* JADX INFO: renamed from: h */
    public VImage f107084h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f107085i;

    /* JADX INFO: renamed from: j */
    public VText f107086j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f107087k;

    /* JADX INFO: renamed from: l */
    public Act f107088l;

    /* JADX INFO: renamed from: m */
    public l4g0 f107089m;

    public gyp(@NonNull Act act) {
        super(act, agc0.f71117c);
        this.f107088l = act;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: E */
    private void m132994E() {
        Window window = getWindow();
        this.f107082f.post(new Runnable() { // from class: l.dyp
            @Override // java.lang.Runnable
            public final void run() {
                this.f91269a.m132996G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17352a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m132995F() {
        setContentView(m133003D(LayoutInflater.from(this.f107088l), null));
        m172033v(new zyf0());
        SpannableString spannableString = new SpannableString("  " + this.f107088l.getResources().getString(R$string.f18405Dq));
        Drawable drawableM143192e = j26.m143192e(this.f107088l, dbc0.f86822ad);
        if (drawableM143192e != null) {
            drawableM143192e.setBounds(0, 0, drawableM143192e.getIntrinsicWidth(), drawableM143192e.getIntrinsicHeight());
            spannableString.setSpan(new ImageSpan(drawableM143192e, 1), 0, 1, 17);
        }
        this.f107086j.setText(spannableString);
        bnl0.m105509E0(this.f107083g, new View.OnClickListener() { // from class: l.eyp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96466a.m132997H(view);
            }
        });
        bnl0.m105509E0(this.f107087k, new View.OnClickListener() { // from class: l.fyp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101413a.m132998I(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m132996G() {
        getBehavior().setPeekHeight(this.f107082f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m132997H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m132998I(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m132999J(DialogInterface dialogInterface) {
        w1e.m204401e(this.f107089m);
        hlh0.m135741a().m135750j(false, "IntrRiskBottomSheetDialog");
    }

    /* JADX INFO: renamed from: D */
    public View m133003D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hyp.m137764b(this, layoutInflater, viewGroup);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m132995F();
        l4g0 l4g0VarM204399c = w1e.m204399c("", Dialog.class.getName());
        this.f107089m = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.byp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f79045a.m132999J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cyp
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(true, "IntrRiskBottomSheetDialog");
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m132994E();
    }

    /* JADX INFO: renamed from: l.gyp$a */
    public class C17352a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f107090a;

        public C17352a(BottomSheetBehavior bottomSheetBehavior) {
            this.f107090a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f107090a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                gyp.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
