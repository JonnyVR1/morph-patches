package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class g3h extends l5j0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f100463f;

    /* JADX INFO: renamed from: g */
    public VLinear f100464g;

    /* JADX INFO: renamed from: h */
    public VImage f100465h;

    /* JADX INFO: renamed from: i */
    public VText f100466i;

    /* JADX INFO: renamed from: j */
    public TextView f100467j;

    /* JADX INFO: renamed from: k */
    public Act f100468k;

    /* JADX INFO: renamed from: l */
    public BottomSheetBehavior f100469l;

    /* JADX INFO: renamed from: m */
    public cwf0 f100470m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f100471n;

    public g3h(@NonNull Context context) {
        super(context, a8c0.f68017f);
        this.f100471n = new C16990a();
        m124269E(context);
    }

    /* JADX INFO: renamed from: D */
    private String m124268D() {
        return "p_red_flower_explain";
    }

    /* JADX INFO: renamed from: E */
    private void m124269E(Context context) {
        this.f100468k = (Act) context;
        setContentView(m124277C(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: F */
    private void m124270F() {
        xdl0.m208329E0(this.f100465h, new View.OnClickListener() { // from class: l.e3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89179a.m124271G(view);
            }
        });
        xdl0.m208329E0(this.f100467j, new View.OnClickListener() { // from class: l.f3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94684a.m124272H(view);
            }
        });
        this.f100466i.getPaint().setFakeBoldText(true);
        Counter counterCounter_ = FeedModule.m60222H().counter_();
        if (NullChecker.m81303a(counterCounter_)) {
            this.f100466i.setText(i0g0.m133847N(String.format("当前拥有小红花数量：%s", Integer.valueOf(counterCounter_.flower.count)), Color.parseColor("#fe7e1d"), eqh0.m117752c(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m124271G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m124272H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m124273I(DialogInterface dialogInterface) {
        i0e.m133796e(this.f100470m);
    }

    /* JADX INFO: renamed from: C */
    public View m124277C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h3h.m129171b(this, layoutInflater, viewGroup);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) findViewById(p4c0.f147063E));
        this.f100469l = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f100469l.setBottomSheetCallback(this.f100471n);
        m124270F();
        if (this.f100470m == null) {
            this.f100470m = i0e.m133794c(m124268D(), g3h.class.getSimpleName());
        }
        i0e.m133797f(this.f100470m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.d3h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f84219a.m124273I(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: l.g3h$a */
    public class C16990a extends BottomSheetBehavior.BottomSheetCallback {
        public C16990a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                g3h.this.f100469l.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
