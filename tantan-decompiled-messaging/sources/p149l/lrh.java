package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VMenuBar;

/* JADX INFO: loaded from: classes12.dex */
public class lrh extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VMenuBar f129696a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f129697b;

    /* JADX INFO: renamed from: c */
    public Act f129698c;

    /* JADX INFO: renamed from: d */
    public irh f129699d;

    /* JADX INFO: renamed from: e */
    public BottomSheetBehavior f129700e;

    /* JADX INFO: renamed from: f */
    public e30<NotifyUsers> f129701f;

    /* JADX INFO: renamed from: g */
    public NotifyUsers f129702g;

    /* JADX INFO: renamed from: h */
    public d30 f129703h;

    /* JADX INFO: renamed from: i */
    public cwf0 f129704i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior.BottomSheetCallback f129705j;

    /* JADX INFO: renamed from: l.lrh$a */
    public class C18302a extends LinearLayoutManager {
        public C18302a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean canScrollVertically() {
            return false;
        }
    }

    public lrh(@NonNull Act act, @StyleRes int i, d30 d30Var) {
        super(act, i);
        this.f129704i = i0e.m133794c("p_at_list", Dialog.class.getName());
        this.f129705j = new C18303b();
        this.f129703h = d30Var;
        m151368v(act);
    }

    /* JADX INFO: renamed from: u */
    private void m151367u() {
        this.f129696a.setLeftRegionClick(new View.OnClickListener() { // from class: l.krh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124354a.m151369w(view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    private void m151368v(Act act) {
        this.f129698c = act;
        setContentView(o6c0.f142281s2);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f129696a = (VMenuBar) findViewById(b5c0.f73528V1);
        this.f129697b = (RecyclerView) findViewById(b5c0.f73549c);
        m151373y();
        m151367u();
        this.f129704i.m109033i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m151369w(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public lrh m151370A(e30<NotifyUsers> e30Var) {
        this.f129701f = e30Var;
        return this;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        i0e.m133796e(this.f129704i);
        if (NullChecker.m81303a(this.f129703h)) {
            this.f129703h.call();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        this.f129700e = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f129698c.getResources().getDrawable(f3c0.f94361K0));
        this.f129700e.setState(3);
        this.f129700e.setBottomSheetCallback(this.f129705j);
        i0e.m133797f(this.f129704i);
    }

    /* JADX INFO: renamed from: t */
    public lrh m151371t(boolean z) {
        setCancelable(z);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m151372x(NotifyUsers notifyUsers) {
        this.f129702g = notifyUsers;
        if (NullChecker.m81303a(this.f129701f)) {
            this.f129701f.call(this.f129702g);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public void m151373y() {
        this.f129699d = new irh(this.f129698c);
        C18302a c18302a = new C18302a(this.f129698c);
        c18302a.setOrientation(1);
        this.f129699d.m137897K(new e30() { // from class: l.jrh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119410a.m151372x((NotifyUsers) obj);
            }
        });
        this.f129697b.setLayoutManager(c18302a);
        this.f129697b.setAdapter(this.f129699d);
    }

    /* JADX INFO: renamed from: z */
    public void m151374z(List<NotifyUsers> list) {
        xdl0.m208344M(this.f129697b, !vwb.m200296J(list));
        this.f129699d.m137896J(list);
    }

    /* JADX INFO: renamed from: l.lrh$b */
    public class C18303b extends BottomSheetBehavior.BottomSheetCallback {
        public C18303b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                lrh.this.f129700e.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
