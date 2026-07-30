package p153l;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VMenuBar;

/* JADX INFO: loaded from: classes13.dex */
public class ath extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VMenuBar f73352a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f73353b;

    /* JADX INFO: renamed from: c */
    public Act f73354c;

    /* JADX INFO: renamed from: d */
    public xsh f73355d;

    /* JADX INFO: renamed from: e */
    public BottomSheetBehavior f73356e;

    /* JADX INFO: renamed from: f */
    public y20<NotifyUsers> f73357f;

    /* JADX INFO: renamed from: g */
    public NotifyUsers f73358g;

    /* JADX INFO: renamed from: h */
    public x20 f73359h;

    /* JADX INFO: renamed from: i */
    public l4g0 f73360i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior.BottomSheetCallback f73361j;

    /* JADX INFO: renamed from: l.ath$a */
    public class C15835a extends LinearLayoutManager {
        public C15835a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean canScrollVertically() {
            return false;
        }
    }

    public ath(@NonNull Act act, @StyleRes int i, x20 x20Var) {
        super(act, i);
        this.f73360i = w1e.m204399c("p_at_list", Dialog.class.getName());
        this.f73361j = new C15836b();
        this.f73359h = x20Var;
        m100188v(act);
    }

    /* JADX INFO: renamed from: u */
    private void m100187u() {
        this.f73352a.setLeftRegionClick(new View.OnClickListener() { // from class: l.zsh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205875a.m100189w(view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    private void m100188v(Act act) {
        this.f73354c = act;
        setContentView(tec0.f173750s2);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f73352a = (VMenuBar) findViewById(hdc0.f108881V1);
        this.f73353b = (RecyclerView) findViewById(hdc0.f108902c);
        m100193y();
        m100187u();
        this.f73360i.m152774i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m100189w(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public ath m100190A(y20<NotifyUsers> y20Var) {
        this.f73357f = y20Var;
        return this;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        w1e.m204401e(this.f73360i);
        if (NullChecker.m82486a(this.f73359h)) {
            this.f73359h.call();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        this.f73356e = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f73354c.getResources().getDrawable(lbc0.f130879K0));
        this.f73356e.setState(3);
        this.f73356e.setBottomSheetCallback(this.f73361j);
        w1e.m204402f(this.f73360i);
    }

    /* JADX INFO: renamed from: t */
    public ath m100191t(boolean z) {
        setCancelable(z);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m100192x(NotifyUsers notifyUsers) {
        this.f73358g = notifyUsers;
        if (NullChecker.m82486a(this.f73357f)) {
            this.f73357f.call(this.f73358g);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public void m100193y() {
        this.f73355d = new xsh(this.f73354c);
        C15835a c15835a = new C15835a(this.f73354c);
        c15835a.setOrientation(1);
        this.f73355d.m212984K(new y20() { // from class: l.ysh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201405a.m100192x((NotifyUsers) obj);
            }
        });
        this.f73353b.setLayoutManager(c15835a);
        this.f73353b.setAdapter(this.f73355d);
    }

    /* JADX INFO: renamed from: z */
    public void m100194z(List<NotifyUsers> list) {
        bnl0.m105524M(this.f73353b, !jyb.m147479J(list));
        this.f73355d.m212983J(list);
    }

    /* JADX INFO: renamed from: l.ath$b */
    public class C15836b extends BottomSheetBehavior.BottomSheetCallback {
        public C15836b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                ath.this.f73356e.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
