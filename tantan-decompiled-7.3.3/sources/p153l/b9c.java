package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.DatingGuideData;
import com.p051p1.mobile.putong.core.p058ui.profile.CityTopGreetDialog;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class b9c extends pej0 {

    /* JADX INFO: renamed from: f */
    public View f75531f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f75532g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f75533h;

    /* JADX INFO: renamed from: i */
    public VIcon f75534i;

    /* JADX INFO: renamed from: j */
    public VText f75535j;

    /* JADX INFO: renamed from: k */
    public VText f75536k;

    /* JADX INFO: renamed from: l */
    public TextView f75537l;

    /* JADX INFO: renamed from: m */
    public Act f75538m;

    /* JADX INFO: renamed from: n */
    public DatingGuideData f75539n;

    /* JADX INFO: renamed from: o */
    public int f75540o;

    /* JADX INFO: renamed from: p */
    public int f75541p;

    /* JADX INFO: renamed from: q */
    public String f75542q;

    /* JADX INFO: renamed from: r */
    public String f75543r;

    /* JADX INFO: renamed from: s */
    public l4g0 f75544s;

    /* JADX INFO: renamed from: t */
    public BottomSheetBehavior f75545t;

    /* JADX INFO: renamed from: u */
    public final BottomSheetBehavior.BottomSheetCallback f75546u;

    /* JADX INFO: renamed from: l.b9c$b */
    public static class C15951b {

        /* JADX INFO: renamed from: a */
        public Act f75548a;

        /* JADX INFO: renamed from: b */
        public String f75549b;

        /* JADX INFO: renamed from: c */
        public l4g0 f75550c;

        /* JADX INFO: renamed from: d */
        public DatingGuideData f75551d;

        /* JADX INFO: renamed from: e */
        public int f75552e = 220;

        /* JADX INFO: renamed from: f */
        public int f75553f = 220;

        /* JADX INFO: renamed from: g */
        public String f75554g;

        public C15951b(Act act) {
            this.f75548a = act;
        }

        /* JADX INFO: renamed from: a */
        public b9c m103088a() {
            b9c b9cVar = new b9c(this.f75548a);
            b9cVar.m103079R(this.f75549b);
            b9cVar.m103086Q(this.f75550c);
            b9cVar.m103085P(this.f75552e, this.f75553f);
            b9cVar.m103084O(this.f75551d);
            b9cVar.m103087S(this.f75554g);
            return b9cVar;
        }

        /* JADX INFO: renamed from: b */
        public C15951b m103089b(String str) {
            this.f75554g = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C15951b m103090c(DatingGuideData datingGuideData) {
            this.f75551d = datingGuideData;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C15951b m103091d(int i, int i2) {
            this.f75552e = i;
            this.f75553f = i2;
            return this;
        }
    }

    public b9c(@NonNull Context context) {
        super(context);
        this.f75540o = 220;
        this.f75541p = 220;
        this.f75546u = new C15950a();
        m103074J(context);
    }

    /* JADX INFO: renamed from: I */
    private String m103073I() {
        DatingGuideData datingGuideData = this.f75539n;
        return datingGuideData != null ? datingGuideData.pageId : this.f75542q;
    }

    /* JADX INFO: renamed from: J */
    private void m103074J(Context context) {
        this.f75538m = (Act) context;
        setContentView(m103083H(LayoutInflater.from(context), null));
    }

    /* JADX INFO: renamed from: K */
    private void m103075K() {
        if (NullChecker.m82487b(this.f75539n)) {
            this.f75535j.setTypeface(Typeface.DEFAULT_BOLD);
            boolean zM147479J = jyb.m147479J(this.f75539n.titles);
            VText vText = this.f75535j;
            if (zM147479J) {
                bnl0.m105524M(vText, false);
            } else {
                vText.setText(this.f75539n.titles.get(0));
            }
            boolean zM147479J2 = jyb.m147479J(this.f75539n.subTitles);
            VText vText2 = this.f75536k;
            if (zM147479J2) {
                bnl0.m105524M(vText2, false);
            } else {
                vText2.setText(this.f75539n.subTitles.get(0));
            }
            this.f75537l.setText(this.f75539n.button);
            if (gra.m131778z()) {
                this.f75537l.setBackgroundResource(dbc0.f86520R);
            }
            if (jyb.m147479J(this.f75539n.pictures)) {
                bnl0.m105524M(this.f75533h, false);
            } else {
                uqb0.f180374G.m127109I0(this.f75533h, this.f75539n.pictures.get(0), qa00.m175859d(this.f75540o), qa00.m175859d(this.f75541p));
                bnl0.m105505C0(this.f75533h, qa00.m175859d(this.f75541p));
                bnl0.m105507D0(qa00.m175859d(this.f75540o), this.f75533h);
            }
            bnl0.m105509E0(this.f75537l, new View.OnClickListener() { // from class: l.z8c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203333a.m103076L(view);
                }
            });
        }
        bnl0.m105509E0(this.f75534i, new View.OnClickListener() { // from class: l.a9c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69015a.m103077M(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m103076L(View view) {
        if (!TextUtils.isEmpty(this.f75539n.buttonId)) {
            i4g0.m138520r(this.f75539n.buttonId, m103073I());
        }
        xwa.m213304D(this.f75538m, Uri.parse(this.f75539n.deeplink));
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m103077M(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m103078N(DialogInterface dialogInterface) {
        w1e.m204401e(this.f75544s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m103079R(String str) {
        this.f75542q = str;
    }

    /* JADX INFO: renamed from: H */
    public View m103083H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c9c.m108438b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public final void m103084O(DatingGuideData datingGuideData) {
        this.f75539n = datingGuideData;
    }

    /* JADX INFO: renamed from: P */
    public final void m103085P(int i, int i2) {
        this.f75541p = i2;
        this.f75540o = i;
    }

    /* JADX INFO: renamed from: Q */
    public final void m103086Q(l4g0 l4g0Var) {
        this.f75544s = l4g0Var;
    }

    /* JADX INFO: renamed from: S */
    public final void m103087S(String str) {
        this.f75543r = str;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f75545t = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f75545t.setBottomSheetCallback(this.f75546u);
        m103075K();
        if (this.f75544s == null) {
            this.f75544s = w1e.m204399c(m103073I(), CityTopGreetDialog.class.getSimpleName());
            if (TextUtils.equals(m103073I(), "p_add_lifestyle_guidance")) {
                boolean zIsEmpty = TextUtils.isEmpty(this.f75543r);
                l4g0 l4g0Var = this.f75544s;
                if (zIsEmpty) {
                    l4g0Var.m152781p(jyb.m147494Y("add_lifestyle_guidance_type", "receive_like"));
                } else {
                    l4g0Var.m152781p(jyb.m147494Y("add_lifestyle_guidance_type", this.f75543r));
                }
            }
        }
        w1e.m204402f(this.f75544s);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.y8c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f197985a.m103078N(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l.b9c$a */
    public class C15950a extends BottomSheetBehavior.BottomSheetCallback {
        public C15950a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                b9c.this.f75545t.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
