package p003l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.data.DatingGuideData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.i0e;
import l.j760;
import l.l5j0;
import l.lva;
import l.p4c0;
import l.qib0;
import l.t100;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v7c extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f7908f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f7909g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f7910h;

    /* JADX INFO: renamed from: i */
    public VIcon f7911i;

    /* JADX INFO: renamed from: j */
    public VText f7912j;

    /* JADX INFO: renamed from: k */
    public VText f7913k;

    /* JADX INFO: renamed from: l */
    public TextView f7914l;

    /* JADX INFO: renamed from: m */
    public Act f7915m;

    /* JADX INFO: renamed from: n */
    public DatingGuideData f7916n;

    /* JADX INFO: renamed from: o */
    public int f7917o;

    /* JADX INFO: renamed from: p */
    public int f7918p;

    /* JADX INFO: renamed from: q */
    public String f7919q;

    /* JADX INFO: renamed from: r */
    public String f7920r;

    /* JADX INFO: renamed from: s */
    public cwf0 f7921s;

    /* JADX INFO: renamed from: t */
    public BottomSheetBehavior f7922t;

    /* JADX INFO: renamed from: u */
    public final BottomSheetBehavior.BottomSheetCallback f7923u;

    /* JADX INFO: renamed from: l.v7c$b */
    public static class C3450b {

        /* JADX INFO: renamed from: a */
        public Act f7925a;

        /* JADX INFO: renamed from: b */
        public String f7926b;

        /* JADX INFO: renamed from: c */
        public cwf0 f7927c;

        /* JADX INFO: renamed from: d */
        public DatingGuideData f7928d;

        /* JADX INFO: renamed from: e */
        public int f7929e = 220;

        /* JADX INFO: renamed from: f */
        public int f7930f = 220;

        /* JADX INFO: renamed from: g */
        public String f7931g;

        public C3450b(Act act) {
            this.f7925a = act;
        }

        /* JADX INFO: renamed from: a */
        public v7c m9890a() {
            v7c v7cVar = new v7c(this.f7925a);
            v7cVar.m9881R(this.f7926b);
            v7cVar.m9888Q(this.f7927c);
            v7cVar.m9887P(this.f7929e, this.f7930f);
            v7cVar.m9886O(this.f7928d);
            v7cVar.m9889S(this.f7931g);
            return v7cVar;
        }

        /* JADX INFO: renamed from: b */
        public C3450b m9891b(String str) {
            this.f7931g = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3450b m9892c(DatingGuideData datingGuideData) {
            this.f7928d = datingGuideData;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C3450b m9893d(int i, int i2) {
            this.f7929e = i;
            this.f7930f = i2;
            return this;
        }
    }

    public v7c(@NonNull Context context) {
        super(context);
        this.f7917o = 220;
        this.f7918p = 220;
        this.f7923u = new C3449a();
        m9876J(context);
    }

    /* JADX INFO: renamed from: I */
    private String m9875I() {
        DatingGuideData datingGuideData = this.f7916n;
        return datingGuideData != null ? datingGuideData.pageId : this.f7919q;
    }

    /* JADX INFO: renamed from: J */
    private void m9876J(Context context) {
        this.f7915m = (Act) context;
        setContentView(m9885H(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: K */
    private void m9877K() {
        if (NullChecker.b(this.f7916n)) {
            this.f7912j.setTypeface(Typeface.DEFAULT_BOLD);
            boolean zJ = vwb.J(this.f7916n.titles);
            VText vText = this.f7912j;
            if (zJ) {
                xdl0.M(vText, false);
            } else {
                vText.setText(this.f7916n.titles.get(0));
            }
            boolean zJ2 = vwb.J(this.f7916n.subTitles);
            VText vText2 = this.f7913k;
            if (zJ2) {
                xdl0.M(vText2, false);
            } else {
                vText2.setText(this.f7916n.subTitles.get(0));
            }
            this.f7914l.setText(this.f7916n.button);
            if (upa.z()) {
                this.f7914l.setBackgroundResource(x2c0.Q);
            }
            if (vwb.J(this.f7916n.pictures)) {
                xdl0.M(this.f7910h, false);
            } else {
                qib0.G.I0(this.f7910h, this.f7916n.pictures.get(0), t100.d(this.f7917o), t100.d(this.f7918p));
                xdl0.C0(this.f7910h, t100.d(this.f7918p));
                xdl0.D0(t100.d(this.f7917o), new View[]{this.f7910h});
            }
            xdl0.E0(this.f7914l, new View.OnClickListener() { // from class: l.t7c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7516a.m9878L(view);
                }
            });
        }
        xdl0.E0(this.f7911i, new View.OnClickListener() { // from class: l.u7c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7697a.m9879M(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m9878L(View view) {
        if (!TextUtils.isEmpty(this.f7916n.buttonId)) {
            zvf0.r(this.f7916n.buttonId, m9875I());
        }
        lva.D(this.f7915m, Uri.parse(this.f7916n.deeplink));
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m9879M(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m9880N(DialogInterface dialogInterface) {
        i0e.e(this.f7921s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m9881R(String str) {
        this.f7919q = str;
    }

    /* JADX INFO: renamed from: H */
    public View m9885H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w7c.m10452b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public final void m9886O(DatingGuideData datingGuideData) {
        this.f7916n = datingGuideData;
    }

    /* JADX INFO: renamed from: P */
    public final void m9887P(int i, int i2) {
        this.f7918p = i2;
        this.f7917o = i;
    }

    /* JADX INFO: renamed from: Q */
    public final void m9888Q(cwf0 cwf0Var) {
        this.f7921s = cwf0Var;
    }

    /* JADX INFO: renamed from: S */
    public final void m9889S(String str) {
        this.f7920r = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f7922t = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f7922t.setBottomSheetCallback(this.f7923u);
        m9877K();
        if (this.f7921s == null) {
            this.f7921s = i0e.c(m9875I(), CityTopGreetDialog.class.getSimpleName());
            if (TextUtils.equals(m9875I(), "p_add_lifestyle_guidance")) {
                boolean zIsEmpty = TextUtils.isEmpty(this.f7920r);
                cwf0 cwf0Var = this.f7921s;
                if (zIsEmpty) {
                    cwf0Var.p(new j760[]{vwb.Y("add_lifestyle_guidance_type", "receive_like")});
                } else {
                    cwf0Var.p(new j760[]{vwb.Y("add_lifestyle_guidance_type", this.f7920r)});
                }
            }
        }
        i0e.f(this.f7921s);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.s7c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f7291a.m9880N(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l.v7c$a */
    public class C3449a extends BottomSheetBehavior.BottomSheetCallback {
        public C3449a() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                v7c.this.f7922t.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
