package p007l;

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
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.eqh0;
import l.i0e;
import l.i0g0;
import l.l5j0;
import l.p4c0;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g3h extends l5j0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f8328f;

    /* JADX INFO: renamed from: g */
    public VLinear f8329g;

    /* JADX INFO: renamed from: h */
    public VImage f8330h;

    /* JADX INFO: renamed from: i */
    public VText f8331i;

    /* JADX INFO: renamed from: j */
    public TextView f8332j;

    /* JADX INFO: renamed from: k */
    public Act f8333k;

    /* JADX INFO: renamed from: l */
    public BottomSheetBehavior f8334l;

    /* JADX INFO: renamed from: m */
    public cwf0 f8335m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f8336n;

    public g3h(@NonNull Context context) {
        super(context, a8c0.f5637f);
        this.f8336n = new C2389a();
        m10404E(context);
    }

    /* JADX INFO: renamed from: D */
    private String m10403D() {
        return "p_red_flower_explain";
    }

    /* JADX INFO: renamed from: E */
    private void m10404E(Context context) {
        this.f8333k = (Act) context;
        setContentView(m10412C(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: F */
    private void m10405F() {
        xdl0.E0(this.f8330h, new View.OnClickListener() { // from class: l.e3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7189a.m10406G(view);
            }
        });
        xdl0.E0(this.f8332j, new View.OnClickListener() { // from class: l.f3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7963a.m10407H(view);
            }
        });
        this.f8331i.getPaint().setFakeBoldText(true);
        Counter counterCounter_ = FeedModule.m1140H().counter_();
        if (NullChecker.a(counterCounter_)) {
            this.f8331i.setText(i0g0.N(String.format("当前拥有小红花数量：%s", Integer.valueOf(counterCounter_.flower.count)), Color.parseColor("#fe7e1d"), eqh0.c(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m10406G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m10407H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m10408I(DialogInterface dialogInterface) {
        i0e.e(this.f8335m);
    }

    /* JADX INFO: renamed from: C */
    public View m10412C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h3h.m10517b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) findViewById(p4c0.E));
        this.f8334l = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f8334l.setBottomSheetCallback(this.f8336n);
        m10405F();
        if (this.f8335m == null) {
            this.f8335m = i0e.c(m10403D(), g3h.class.getSimpleName());
        }
        i0e.f(this.f8335m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.d3h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f6794a.m10408I(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: l.g3h$a */
    public class C2389a extends BottomSheetBehavior.BottomSheetCallback {
        public C2389a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                g3h.this.f8334l.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
