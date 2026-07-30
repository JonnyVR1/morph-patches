package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class v4h extends pej0 {

    /* JADX INFO: renamed from: f */
    public FrameLayout f182366f;

    /* JADX INFO: renamed from: g */
    public VLinear f182367g;

    /* JADX INFO: renamed from: h */
    public VImage f182368h;

    /* JADX INFO: renamed from: i */
    public VText f182369i;

    /* JADX INFO: renamed from: j */
    public TextView f182370j;

    /* JADX INFO: renamed from: k */
    public Act f182371k;

    /* JADX INFO: renamed from: l */
    public BottomSheetBehavior f182372l;

    /* JADX INFO: renamed from: m */
    public l4g0 f182373m;

    /* JADX INFO: renamed from: n */
    public final BottomSheetBehavior.BottomSheetCallback f182374n;

    public v4h(@NonNull Context context) {
        super(context, fgc0.f98903f);
        this.f182374n = new C20756a();
        m199694E(context);
    }

    /* JADX INFO: renamed from: D */
    private String m199693D() {
        return "p_red_flower_explain";
    }

    /* JADX INFO: renamed from: E */
    private void m199694E(Context context) {
        this.f182371k = (Act) context;
        setContentView(m199702C(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: F */
    private void m199695F() {
        bnl0.m105509E0(this.f182368h, new View.OnClickListener() { // from class: l.t4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172074a.m199696G(view);
            }
        });
        bnl0.m105509E0(this.f182370j, new View.OnClickListener() { // from class: l.u4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177463a.m199697H(view);
            }
        });
        this.f182369i.getPaint().setFakeBoldText(true);
        Counter counterCounter_ = FeedModule.m61406H().counter_();
        if (NullChecker.m82486a(counterCounter_)) {
            this.f182369i.setText(q8g0.m175782N(String.format("当前拥有小红花数量：%s", Integer.valueOf(counterCounter_.flower.count)), Color.parseColor("#fe7e1d"), lyh0.m156283c(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m199696G(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m199697H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m199698I(DialogInterface dialogInterface) {
        w1e.m204401e(this.f182373m);
    }

    /* JADX INFO: renamed from: C */
    public View m199702C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w4h.m204896b(this, layoutInflater, viewGroup);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) findViewById(vcc0.f183363E));
        this.f182372l = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f182372l.setBottomSheetCallback(this.f182374n);
        m199695F();
        if (this.f182373m == null) {
            this.f182373m = w1e.m204399c(m199693D(), v4h.class.getSimpleName());
        }
        w1e.m204402f(this.f182373m);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.s4h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f166237a.m199698I(dialogInterface);
            }
        });
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: l.v4h$a */
    public class C20756a extends BottomSheetBehavior.BottomSheetCallback {
        public C20756a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                v4h.this.f182372l.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
