package p007l;

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
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.p4c0;
import l.vwb;
import l.xdl0;
import v.VMenuBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lrh extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VMenuBar f10109a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f10110b;

    /* JADX INFO: renamed from: c */
    public Act f10111c;

    /* JADX INFO: renamed from: d */
    public irh f10112d;

    /* JADX INFO: renamed from: e */
    public BottomSheetBehavior f10113e;

    /* JADX INFO: renamed from: f */
    public e30<NotifyUsers> f10114f;

    /* JADX INFO: renamed from: g */
    public NotifyUsers f10115g;

    /* JADX INFO: renamed from: h */
    public d30 f10116h;

    /* JADX INFO: renamed from: i */
    public cwf0 f10117i;

    /* JADX INFO: renamed from: j */
    public BottomSheetBehavior.BottomSheetCallback f10118j;

    /* JADX INFO: renamed from: l.lrh$a */
    public class C2420a extends LinearLayoutManager {
        public C2420a(Context context) {
            super(context);
        }

        public boolean canScrollVertically() {
            return false;
        }
    }

    public lrh(@NonNull Act act, @StyleRes int i, d30 d30Var) {
        super(act, i);
        this.f10117i = i0e.c("p_at_list", Dialog.class.getName());
        this.f10118j = new C2421b();
        this.f10116h = d30Var;
        m11703v(act);
    }

    /* JADX INFO: renamed from: u */
    private void m11702u() {
        this.f10109a.setLeftRegionClick(new View.OnClickListener() { // from class: l.krh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9780a.m11704w(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    private void m11703v(Act act) {
        this.f10111c = act;
        setContentView(o6c0.f11300s2);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f10109a = findViewById(b5c0.f6009V1);
        this.f10110b = findViewById(b5c0.f6030c);
        m11708y();
        m11702u();
        this.f10117i.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m11704w(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public lrh m11705A(e30<NotifyUsers> e30Var) {
        this.f10114f = e30Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        i0e.e(this.f10117i);
        if (NullChecker.a(this.f10116h)) {
            this.f10116h.call();
        }
        super/*android.app.Dialog*/.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        this.f10113e = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f10111c.getResources().getDrawable(f3c0.f7644K0));
        this.f10113e.setState(3);
        this.f10113e.setBottomSheetCallback(this.f10118j);
        i0e.f(this.f10117i);
    }

    /* JADX INFO: renamed from: t */
    public lrh m11706t(boolean z) {
        setCancelable(z);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m11707x(NotifyUsers notifyUsers) {
        this.f10115g = notifyUsers;
        if (NullChecker.a(this.f10114f)) {
            this.f10114f.call(this.f10115g);
        }
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public void m11708y() {
        this.f10112d = new irh(this.f10111c);
        C2420a c2420a = new C2420a(this.f10111c);
        c2420a.setOrientation(1);
        this.f10112d.m11033K(new e30() { // from class: l.jrh
            public final void call(Object obj) {
                this.f9508a.m11707x((NotifyUsers) obj);
            }
        });
        this.f10110b.setLayoutManager(c2420a);
        this.f10110b.setAdapter(this.f10112d);
    }

    /* JADX INFO: renamed from: z */
    public void m11709z(List<NotifyUsers> list) {
        xdl0.M(this.f10110b, !vwb.J(list));
        this.f10112d.m11032J(list);
    }

    /* JADX INFO: renamed from: l.lrh$b */
    public class C2421b extends BottomSheetBehavior.BottomSheetCallback {
        public C2421b() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                lrh.this.f10113e.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
