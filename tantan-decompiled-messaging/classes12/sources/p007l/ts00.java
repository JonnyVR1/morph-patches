package p007l;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.CaptionAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import l.bt0;
import l.e30;
import l.e51;
import l.q860;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yij0;
import v.VDraweeView;
import v.VImage;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ts00 implements s7m<bq00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f13391a;

    /* JADX INFO: renamed from: b */
    public VList f13392b;

    /* JADX INFO: renamed from: c */
    public FloatingActionButton f13393c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f13394d;

    /* JADX INFO: renamed from: e */
    public VImage f13395e;

    /* JADX INFO: renamed from: f */
    public VText f13396f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f13397g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f13398h;

    /* JADX INFO: renamed from: i */
    public VImage f13399i;

    /* JADX INFO: renamed from: j */
    public VText f13400j;

    /* JADX INFO: renamed from: k */
    public VText f13401k;

    /* JADX INFO: renamed from: l */
    public View f13402l;

    /* JADX INFO: renamed from: m */
    public View f13403m;

    /* JADX INFO: renamed from: n */
    public View f13404n;

    /* JADX INFO: renamed from: o */
    public MomentsInProfileAct f13405o;

    /* JADX INFO: renamed from: p */
    public kp00 f13406p;

    /* JADX INFO: renamed from: q */
    public bq00 f13407q;

    public ts00(MomentsInProfileAct momentsInProfileAct) {
        this.f13405o = momentsInProfileAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m14622E(View view) {
        if (!this.f13407q.m9008z0() && !this.f13407q.f6404c) {
            this.f13405o.onBackPressed();
        } else {
            PutongAct putongAct = this.f13405o;
            putongAct.startActivity(kjb0.m11456h(putongAct, this.f13407q.f6402a, "moments_in_profile", false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m14623F(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.rs00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12723a.m14622E(view2);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14626c(PutongAct putongAct, Dialog dialog, View view, int i, CharSequence charSequence) {
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
    public static /* synthetic */ boolean m14627d(PutongAct putongAct, View view) {
        if (bt00.m9031c()) {
            return true;
        }
        putongAct.startActivityForResult(CaptionAct.m7774X1(putongAct, vwb.f0(new Media[0])), 50);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m14634m(final PutongAct putongAct, View view) {
        if (bt00.m9031c()) {
            return;
        }
        putongAct.dialog().e0(Arrays.asList(putongAct.getString(R$string.f441T4), putongAct.getString(R$string.f447U4))).g0(new Dialog.g() { // from class: l.ss00
            /* JADX INFO: renamed from: a */
            public final void m14286a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                ts00.m14626c(putongAct, dialog, view2, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m14636A(int[] iArr, Bitmap bitmap) {
        if (NullChecker.a(bitmap)) {
            final Bitmap bitmapQ = yij0.q(bitmap, iArr[0], iArr[1], this.f13405o.getResources().getColor(e1c0.f7122U), t100.d(4.0f));
            e51.M(new Runnable() { // from class: l.js00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9511a.m14658z(bitmapQ);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m14637B(Picture.ImageUri imageUri, final int[] iArr) {
        qib0.G.G(imageUri, new e30() { // from class: l.is00
            public final void call(Object obj) {
                this.f9126a.m14636A(iArr, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m14638C(final Picture.ImageUri imageUri) {
        xdl0.Q0(this.f13395e, new e30() { // from class: l.ms00
            public final void call(Object obj) {
                this.f10549a.m14637B(imageUri, (int[]) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14639C0() {
        return this.f13405o;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m14640G() {
        this.f13392b.setSelectionFromTop(0, 0);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m14641H(String str, View view) {
        PutongAct putongAct = this.f13405o;
        putongAct.startActivity(kjb0.m11452d(putongAct, str, false, false, 3));
    }

    /* JADX INFO: renamed from: I */
    public void m14642I() {
        e51.G(new Runnable() { // from class: l.ks00
            @Override // java.lang.Runnable
            public final void run() {
                this.f9782a.m14640G();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m14643J(q860<Moment> q860Var) {
        this.f13406p.m11511s(q860Var);
    }

    /* JADX INFO: renamed from: K */
    public void m14644K(List<String> list) {
        if (this.f13396f.getVisibility() == 4 && NullChecker.b(list) && list.contains(this.f13407q.f6402a)) {
            this.f13396f.setVisibility(0);
            if (this.f13405o.lifecycle_().b) {
                this.f13396f.setAlpha(0.0f);
                bt0.p(this.f13396f, "alpha", 100L, 300L, (Interpolator) null, new float[]{1.0f}).start();
            }
        } else if (this.f13396f.getVisibility() == 0 && (list == null || !list.contains(this.f13407q.f6402a))) {
            this.f13396f.setVisibility(4);
        }
        this.f13405o.invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: L */
    public void m14645L() {
        m14646M(this.f13405o, this.f13393c);
    }

    /* JADX INFO: renamed from: M */
    public void m14646M(final PutongAct putongAct, View view) {
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ps00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ts00.m14634m(putongAct, view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.qs00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return ts00.m14627d(putongAct, view2);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m14647N(final String str) {
        this.f13404n.setVisibility(0);
        this.f13404n.setOnClickListener(new View.OnClickListener() { // from class: l.ns00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10858a.m14641H(str, view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM14649p = m14649p(layoutInflater, viewGroup);
        m14650q(this.f13405o.inflater(), this.f13392b);
        this.f13404n = this.f13401k;
        View viewInflate = layoutInflater.inflate(o6c0.f11316u4, (ViewGroup) this.f13392b, false);
        this.f13403m = viewInflate;
        viewInflate.setBackgroundColor(-1);
        xdl0.Q0(this.f13392b, new e30() { // from class: l.hs00
            public final void call(Object obj) {
                this.f8813a.m14657y((int[]) obj);
            }
        });
        View viewInflate2 = layoutInflater.inflate(o6c0.f11347z0, (ViewGroup) this.f13392b, false);
        this.f13402l = viewInflate2;
        viewInflate2.setBackgroundColor(-1);
        return viewM14649p;
    }

    /* JADX INFO: renamed from: p */
    public View m14649p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return us00.m15132b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m14650q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vs00.m15574b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m14651r() {
        this.f13406p = new kp00(this.f13405o);
        this.f13392b.setCrashLogFlag("MomentsInProfileViewModel");
        this.f13392b.setAdapter(this.f13406p);
        this.f13392b.setOnScrollListener(new C2500a());
        this.f13404n.setVisibility(8);
        vwb.z(vwb.f0(new View[]{this.f13398h, this.f13400j}), new e30() { // from class: l.os00
            public final void call(Object obj) {
                this.f11611a.m14623F((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m14648i1(bq00 bq00Var) {
        this.f13407q = bq00Var;
    }

    /* JADX INFO: renamed from: u */
    public void m14653u() {
        this.f13404n.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m14654v() {
        this.f13393c.setVisibility(8);
    }

    /* JADX INFO: renamed from: w */
    public void m14655w(final Picture.ImageUri imageUri) {
        qib0.G.Q0(this.f13398h, imageUri);
        e51.M(new Runnable() { // from class: l.ls00
            @Override // java.lang.Runnable
            public final void run() {
                this.f10124a.m14638C(imageUri);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public void m14656x(User user) {
        boolean z = this.f13407q.f6404c;
        MomentsInProfileAct momentsInProfileAct = this.f13405o;
        if (z) {
            momentsInProfileAct.setTitle(R$string.f497c4);
        } else {
            momentsInProfileAct.setTitle(R$string.f583p);
        }
        this.f13400j.setText(user.name);
        String gPMemo = FeedModule.m1140H().getGPMemo(((DbObject) user).id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f13400j.setText(gPMemo);
        }
        qib0.b0.b.showUserVerificationLogo(act(), user, this.f13399i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m14657y(int[] iArr) {
        this.f13403m.setMinimumHeight(iArr[1] - t100.d(200.0f));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m14658z(Bitmap bitmap) {
        this.f13395e.setImageBitmap(bitmap);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ts00$a */
    public class C2500a implements AbsListView.OnScrollListener {
        public C2500a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (i == 0) {
                ts00 ts00Var = ts00.this;
                ts00Var.f13395e.setTranslationY((-ts00Var.f13394d.getTop()) / 2);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }
}
