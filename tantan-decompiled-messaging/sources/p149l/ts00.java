package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.CaptionAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ts00 implements s7m<bq00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f171886a;

    /* JADX INFO: renamed from: b */
    public VList f171887b;

    /* JADX INFO: renamed from: c */
    public FloatingActionButton f171888c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f171889d;

    /* JADX INFO: renamed from: e */
    public VImage f171890e;

    /* JADX INFO: renamed from: f */
    public VText f171891f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f171892g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f171893h;

    /* JADX INFO: renamed from: i */
    public VImage f171894i;

    /* JADX INFO: renamed from: j */
    public VText f171895j;

    /* JADX INFO: renamed from: k */
    public VText f171896k;

    /* JADX INFO: renamed from: l */
    public View f171897l;

    /* JADX INFO: renamed from: m */
    public View f171898m;

    /* JADX INFO: renamed from: n */
    public View f171899n;

    /* JADX INFO: renamed from: o */
    public MomentsInProfileAct f171900o;

    /* JADX INFO: renamed from: p */
    public kp00 f171901p;

    /* JADX INFO: renamed from: q */
    public bq00 f171902q;

    public ts00(MomentsInProfileAct momentsInProfileAct) {
        this.f171900o = momentsInProfileAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m190468E(View view) {
        if (!this.f171902q.m103348z0() && !this.f171902q.f76745c) {
            this.f171900o.onBackPressed();
        } else {
            MomentsInProfileAct momentsInProfileAct = this.f171900o;
            momentsInProfileAct.startActivity(kjb0.m146197h(momentsInProfileAct, this.f171902q.f76743a, "moments_in_profile", false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m190469F(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.rs00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f160801a.m190468E(view2);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m190472c(PutongAct putongAct, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            putongAct.pickImagesWithPicker(9, true, false, false, Moments.TYPE);
        } else {
            if (i != 1) {
                return;
            }
            putongAct.pickVideoWithPicker(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m190473d(PutongAct putongAct, View view) {
        if (bt00.m103768c()) {
            return true;
        }
        putongAct.startActivityForResult(CaptionAct.m66583X1(putongAct, vwb.m200324f0(new Media[0])), 50);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m190480m(final PutongAct putongAct, View view) {
        if (bt00.m103768c()) {
            return;
        }
        putongAct.dialog().m20535e0(Arrays.asList(putongAct.getString(R$string.f38980T4), putongAct.getString(R$string.f38986U4))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.ss00
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                ts00.m190472c(putongAct, dialog, view2, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m190482A(int[] iArr, Bitmap bitmap) {
        if (NullChecker.m81303a(bitmap)) {
            final Bitmap bitmapM214961q = yij0.m214961q(bitmap, iArr[0], iArr[1], this.f171900o.getResources().getColor(e1c0.f88766U), t100.m186890d(4.0f));
            e51.m114748M(new Runnable() { // from class: l.js00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f119468a.m190502z(bitmapM214961q);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m190483B(Picture.ImageUri imageUri, final int[] iArr) {
        qib0.f154691G.m102320G(imageUri, new e30() { // from class: l.is00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114714a.m190482A(iArr, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m190484C(final Picture.ImageUri imageUri) {
        xdl0.m208353Q0(this.f171890e, new e30() { // from class: l.ms00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135434a.m190483B(imageUri, (int[]) obj);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f171900o;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m190485G() {
        this.f171887b.setSelectionFromTop(0, 0);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m190486H(String str, View view) {
        MomentsInProfileAct momentsInProfileAct = this.f171900o;
        momentsInProfileAct.startActivity(kjb0.m146193d(momentsInProfileAct, str, false, false, 3));
    }

    /* JADX INFO: renamed from: I */
    public void m190487I() {
        e51.m114742G(new Runnable() { // from class: l.ks00
            @Override // java.lang.Runnable
            public final void run() {
                this.f124409a.m190485G();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m190488J(q860<Moment> q860Var) {
        this.f171901p.m146802s(q860Var);
    }

    /* JADX INFO: renamed from: K */
    public void m190489K(List<String> list) {
        if (this.f171891f.getVisibility() == 4 && NullChecker.m81304b(list) && list.contains(this.f171902q.f76743a)) {
            this.f171891f.setVisibility(0);
            if (this.f171900o.lifecycle_().f15556b) {
                this.f171891f.setAlpha(0.0f);
                bt0.m103743p(this.f171891f, "alpha", 100L, 300L, null, 1.0f).start();
            }
        } else if (this.f171891f.getVisibility() == 0 && (list == null || !list.contains(this.f171902q.f76743a))) {
            this.f171891f.setVisibility(4);
        }
        this.f171900o.invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: L */
    public void m190490L() {
        m190491M(this.f171900o, this.f171888c);
    }

    /* JADX INFO: renamed from: M */
    public void m190491M(final PutongAct putongAct, View view) {
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ps00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ts00.m190480m(putongAct, view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.qs00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return ts00.m190473d(putongAct, view2);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m190492N(final String str) {
        this.f171899n.setVisibility(0);
        this.f171899n.setOnClickListener(new View.OnClickListener() { // from class: l.ns00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140234a.m190486H(str, view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM190493p = m190493p(layoutInflater, viewGroup);
        m190494q(this.f171900o.inflater(), this.f171887b);
        this.f171899n = this.f171896k;
        View viewInflate = layoutInflater.inflate(o6c0.f142297u4, (ViewGroup) this.f171887b, false);
        this.f171898m = viewInflate;
        viewInflate.setBackgroundColor(-1);
        xdl0.m208353Q0(this.f171887b, new e30() { // from class: l.hs00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109281a.m190501y((int[]) obj);
            }
        });
        View viewInflate2 = layoutInflater.inflate(o6c0.f142328z0, (ViewGroup) this.f171887b, false);
        this.f171897l = viewInflate2;
        viewInflate2.setBackgroundColor(-1);
        return viewM190493p;
    }

    /* JADX INFO: renamed from: p */
    public View m190493p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return us00.m195176b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m190494q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vs00.m199806b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m190495r() {
        this.f171901p = new kp00(this.f171900o);
        this.f171887b.setCrashLogFlag("MomentsInProfileViewModel");
        this.f171887b.setAdapter((ListAdapter) this.f171901p);
        this.f171887b.setOnScrollListener(new C20264a());
        this.f171899n.setVisibility(8);
        vwb.m200354z(vwb.m200324f0(this.f171893h, this.f171895j), new e30() { // from class: l.os00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145369a.m190469F((View) obj);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bq00 bq00Var) {
        this.f171902q = bq00Var;
    }

    /* JADX INFO: renamed from: u */
    public void m190497u() {
        this.f171899n.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m190498v() {
        this.f171888c.setVisibility(8);
    }

    /* JADX INFO: renamed from: w */
    public void m190499w(final Picture.ImageUri imageUri) {
        qib0.f154691G.m102341Q0(this.f171893h, imageUri);
        e51.m114748M(new Runnable() { // from class: l.ls00
            @Override // java.lang.Runnable
            public final void run() {
                this.f129797a.m190484C(imageUri);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public void m190500x(User user) {
        boolean z = this.f171902q.f76745c;
        MomentsInProfileAct momentsInProfileAct = this.f171900o;
        if (z) {
            momentsInProfileAct.setTitle(R$string.f39036c4);
        } else {
            momentsInProfileAct.setTitle(R$string.f39122p);
        }
        this.f171895j.setText(user.name);
        String gPMemo = FeedModule.m60222H().getGPMemo(user.f56011id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f171895j.setText(gPMemo);
        }
        qib0.f154713b0.f139231b.showUserVerificationLogo(act(), user, this.f171894i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m190501y(int[] iArr) {
        this.f171898m.setMinimumHeight(iArr[1] - t100.m186890d(200.0f));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m190502z(Bitmap bitmap) {
        this.f171890e.setImageBitmap(bitmap);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ts00$a */
    public class C20264a implements AbsListView.OnScrollListener {
        public C20264a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (i == 0) {
                ts00 ts00Var = ts00.this;
                ts00Var.f171890e.setTranslationY((-ts00Var.f171889d.getTop()) / 2);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }
}
