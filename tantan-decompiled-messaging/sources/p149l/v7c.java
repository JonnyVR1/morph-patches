package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.DatingGuideData;
import com.p046p1.mobile.putong.core.p053ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v7c extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f180322f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f180323g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f180324h;

    /* JADX INFO: renamed from: i */
    public VIcon f180325i;

    /* JADX INFO: renamed from: j */
    public VText f180326j;

    /* JADX INFO: renamed from: k */
    public VText f180327k;

    /* JADX INFO: renamed from: l */
    public TextView f180328l;

    /* JADX INFO: renamed from: m */
    public Act f180329m;

    /* JADX INFO: renamed from: n */
    public DatingGuideData f180330n;

    /* JADX INFO: renamed from: o */
    public int f180331o;

    /* JADX INFO: renamed from: p */
    public int f180332p;

    /* JADX INFO: renamed from: q */
    public String f180333q;

    /* JADX INFO: renamed from: r */
    public String f180334r;

    /* JADX INFO: renamed from: s */
    public cwf0 f180335s;

    /* JADX INFO: renamed from: t */
    public BottomSheetBehavior f180336t;

    /* JADX INFO: renamed from: u */
    public final BottomSheetBehavior.BottomSheetCallback f180337u;

    /* JADX INFO: renamed from: l.v7c$b */
    public static class C20593b {

        /* JADX INFO: renamed from: a */
        public Act f180339a;

        /* JADX INFO: renamed from: b */
        public String f180340b;

        /* JADX INFO: renamed from: c */
        public cwf0 f180341c;

        /* JADX INFO: renamed from: d */
        public DatingGuideData f180342d;

        /* JADX INFO: renamed from: e */
        public int f180343e = 220;

        /* JADX INFO: renamed from: f */
        public int f180344f = 220;

        /* JADX INFO: renamed from: g */
        public String f180345g;

        public C20593b(Act act) {
            this.f180339a = act;
        }

        /* JADX INFO: renamed from: a */
        public v7c m197373a() {
            v7c v7cVar = new v7c(this.f180339a);
            v7cVar.m197364R(this.f180340b);
            v7cVar.m197371Q(this.f180341c);
            v7cVar.m197370P(this.f180343e, this.f180344f);
            v7cVar.m197369O(this.f180342d);
            v7cVar.m197372S(this.f180345g);
            return v7cVar;
        }

        /* JADX INFO: renamed from: b */
        public C20593b m197374b(String str) {
            this.f180345g = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20593b m197375c(DatingGuideData datingGuideData) {
            this.f180342d = datingGuideData;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20593b m197376d(int i, int i2) {
            this.f180343e = i;
            this.f180344f = i2;
            return this;
        }
    }

    public v7c(@NonNull Context context) {
        super(context);
        this.f180331o = 220;
        this.f180332p = 220;
        this.f180337u = new C20592a();
        m197359J(context);
    }

    /* JADX INFO: renamed from: I */
    private String m197358I() {
        DatingGuideData datingGuideData = this.f180330n;
        return datingGuideData != null ? datingGuideData.pageId : this.f180333q;
    }

    /* JADX INFO: renamed from: J */
    private void m197359J(Context context) {
        this.f180329m = (Act) context;
        setContentView(m197368H(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: K */
    private void m197360K() {
        if (NullChecker.m81304b(this.f180330n)) {
            this.f180326j.setTypeface(Typeface.DEFAULT_BOLD);
            boolean zM200296J = vwb.m200296J(this.f180330n.titles);
            VText vText = this.f180326j;
            if (zM200296J) {
                xdl0.m208344M(vText, false);
            } else {
                vText.setText(this.f180330n.titles.get(0));
            }
            boolean zM200296J2 = vwb.m200296J(this.f180330n.subTitles);
            VText vText2 = this.f180327k;
            if (zM200296J2) {
                xdl0.m208344M(vText2, false);
            } else {
                vText2.setText(this.f180330n.subTitles.get(0));
            }
            this.f180328l.setText(this.f180330n.button);
            if (upa.m194847z()) {
                this.f180328l.setBackgroundResource(x2c0.f189655Q);
            }
            if (vwb.m200296J(this.f180330n.pictures)) {
                xdl0.m208344M(this.f180324h, false);
            } else {
                qib0.f154691G.m102325I0(this.f180324h, this.f180330n.pictures.get(0), t100.m186890d(this.f180331o), t100.m186890d(this.f180332p));
                xdl0.m208325C0(this.f180324h, t100.m186890d(this.f180332p));
                xdl0.m208327D0(t100.m186890d(this.f180331o), this.f180324h);
            }
            xdl0.m208329E0(this.f180328l, new View.OnClickListener() { // from class: l.t7c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f168686a.m197361L(view);
                }
            });
        }
        xdl0.m208329E0(this.f180325i, new View.OnClickListener() { // from class: l.u7c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174982a.m197362M(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m197361L(View view) {
        if (!TextUtils.isEmpty(this.f180330n.buttonId)) {
            zvf0.m220396r(this.f180330n.buttonId, m197358I());
        }
        lva.m151843D(this.f180329m, Uri.parse(this.f180330n.deeplink));
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m197362M(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m197363N(DialogInterface dialogInterface) {
        i0e.m133796e(this.f180335s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m197364R(String str) {
        this.f180333q = str;
    }

    /* JADX INFO: renamed from: H */
    public View m197368H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w7c.m202014b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public final void m197369O(DatingGuideData datingGuideData) {
        this.f180330n = datingGuideData;
    }

    /* JADX INFO: renamed from: P */
    public final void m197370P(int i, int i2) {
        this.f180332p = i2;
        this.f180331o = i;
    }

    /* JADX INFO: renamed from: Q */
    public final void m197371Q(cwf0 cwf0Var) {
        this.f180335s = cwf0Var;
    }

    /* JADX INFO: renamed from: S */
    public final void m197372S(String str) {
        this.f180334r = str;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f180336t = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f180336t.setBottomSheetCallback(this.f180337u);
        m197360K();
        if (this.f180335s == null) {
            this.f180335s = i0e.m133794c(m197358I(), CityTopGreetDialog.class.getSimpleName());
            if (TextUtils.equals(m197358I(), "p_add_lifestyle_guidance")) {
                boolean zIsEmpty = TextUtils.isEmpty(this.f180334r);
                cwf0 cwf0Var = this.f180335s;
                if (zIsEmpty) {
                    cwf0Var.m109040p(vwb.m200311Y("add_lifestyle_guidance_type", "receive_like"));
                } else {
                    cwf0Var.m109040p(vwb.m200311Y("add_lifestyle_guidance_type", this.f180334r));
                }
            }
        }
        i0e.m133797f(this.f180335s);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.s7c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f162906a.m197363N(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l.v7c$a */
    public class C20592a extends BottomSheetBehavior.BottomSheetCallback {
        public C20592a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                v7c.this.f180336t.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
