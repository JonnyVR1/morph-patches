package p153l;

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
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.CaptionAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class c110 implements iam<ky00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f79314a;

    /* JADX INFO: renamed from: b */
    public VList f79315b;

    /* JADX INFO: renamed from: c */
    public FloatingActionButton f79316c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f79317d;

    /* JADX INFO: renamed from: e */
    public VImage f79318e;

    /* JADX INFO: renamed from: f */
    public VText f79319f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f79320g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f79321h;

    /* JADX INFO: renamed from: i */
    public VImage f79322i;

    /* JADX INFO: renamed from: j */
    public VText f79323j;

    /* JADX INFO: renamed from: k */
    public VText f79324k;

    /* JADX INFO: renamed from: l */
    public View f79325l;

    /* JADX INFO: renamed from: m */
    public View f79326m;

    /* JADX INFO: renamed from: n */
    public View f79327n;

    /* JADX INFO: renamed from: o */
    public MomentsInProfileAct f79328o;

    /* JADX INFO: renamed from: p */
    public tx00 f79329p;

    /* JADX INFO: renamed from: q */
    public ky00 f79330q;

    public c110(MomentsInProfileAct momentsInProfileAct) {
        this.f79328o = momentsInProfileAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m107485E(View view) {
        if (!this.f79330q.m151939z0() && !this.f79330q.f129258c) {
            this.f79328o.onBackPressed();
        } else {
            MomentsInProfileAct momentsInProfileAct = this.f79328o;
            momentsInProfileAct.startActivity(orb0.m168891h(momentsInProfileAct, this.f79330q.f129256a, "moments_in_profile", false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m107486F(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.a110
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f67776a.m107485E(view2);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m107489c(PutongAct putongAct, Dialog dialog, View view, int i, CharSequence charSequence) {
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
    public static /* synthetic */ boolean m107490d(PutongAct putongAct, View view) {
        if (k110.m147842c()) {
            return true;
        }
        putongAct.startActivityForResult(CaptionAct.m67766Y1(putongAct, jyb.m147507f0(new Media[0])), 50);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m107497m(final PutongAct putongAct, View view) {
        if (k110.m147842c()) {
            return;
        }
        putongAct.dialog().m21534e0(Arrays.asList(putongAct.getString(R$string.f39828T4), putongAct.getString(R$string.f39834U4))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.b110
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                c110.m107489c(putongAct, dialog, view2, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m107499A(int[] iArr, Bitmap bitmap) {
        if (NullChecker.m82486a(bitmap)) {
            final Bitmap bitmapM106281q = bsj0.m106281q(bitmap, iArr[0], iArr[1], this.f79328o.getResources().getColor(k9c0.f124489U), qa00.m175859d(4.0f));
            l51.m152893M(new Runnable() { // from class: l.s010
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165655a.m107519z(bitmapM106281q);
                }
            });
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m107500B(Picture.ImageUri imageUri, final int[] iArr) {
        uqb0.f180374G.m127104G(imageUri, new y20() { // from class: l.r010
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160568a.m107499A(iArr, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m107501C(final Picture.ImageUri imageUri) {
        bnl0.m105533Q0(this.f79318e, new y20() { // from class: l.v010
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181832a.m107500B(imageUri, (int[]) obj);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f79328o;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m107502G() {
        this.f79315b.setSelectionFromTop(0, 0);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m107503H(String str, View view) {
        MomentsInProfileAct momentsInProfileAct = this.f79328o;
        momentsInProfileAct.startActivity(orb0.m168887d(momentsInProfileAct, str, false, false, 3));
    }

    /* JADX INFO: renamed from: I */
    public void m107504I() {
        l51.m152887G(new Runnable() { // from class: l.t010
            @Override // java.lang.Runnable
            public final void run() {
                this.f171442a.m107502G();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m107505J(vg60<Moment> vg60Var) {
        this.f79329p.m193464s(vg60Var);
    }

    /* JADX INFO: renamed from: K */
    public void m107506K(List<String> list) {
        if (this.f79319f.getVisibility() == 4 && NullChecker.m82487b(list) && list.contains(this.f79330q.f129256a)) {
            this.f79319f.setVisibility(0);
            if (this.f79328o.lifecycle_().f16275b) {
                this.f79319f.setAlpha(0.0f);
                gt0.m132170p(this.f79319f, "alpha", 100L, 300L, null, 1.0f).start();
            }
        } else if (this.f79319f.getVisibility() == 0 && (list == null || !list.contains(this.f79330q.f129256a))) {
            this.f79319f.setVisibility(4);
        }
        this.f79328o.invalidateOptionsMenu();
    }

    /* JADX INFO: renamed from: L */
    public void m107507L() {
        m107508M(this.f79328o, this.f79316c);
    }

    /* JADX INFO: renamed from: M */
    public void m107508M(final PutongAct putongAct, View view) {
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.y010
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c110.m107497m(putongAct, view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z010
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return c110.m107490d(putongAct, view2);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m107509N(final String str) {
        this.f79327n.setVisibility(0);
        this.f79327n.setOnClickListener(new View.OnClickListener() { // from class: l.w010
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186532a.m107503H(str, view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM107510p = m107510p(layoutInflater, viewGroup);
        m107511q(this.f79328o.inflater(), this.f79315b);
        this.f79327n = this.f79324k;
        View viewInflate = layoutInflater.inflate(tec0.f173766u4, (ViewGroup) this.f79315b, false);
        this.f79326m = viewInflate;
        viewInflate.setBackgroundColor(-1);
        bnl0.m105533Q0(this.f79315b, new y20() { // from class: l.q010
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155005a.m107518y((int[]) obj);
            }
        });
        View viewInflate2 = layoutInflater.inflate(tec0.f173797z0, (ViewGroup) this.f79315b, false);
        this.f79325l = viewInflate2;
        viewInflate2.setBackgroundColor(-1);
        return viewM107510p;
    }

    /* JADX INFO: renamed from: p */
    public View m107510p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d110.m113476b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public View m107511q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e110.m118939b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m107512r() {
        this.f79329p = new tx00(this.f79328o);
        this.f79315b.setCrashLogFlag("MomentsInProfileViewModel");
        this.f79315b.setAdapter((ListAdapter) this.f79329p);
        this.f79315b.setOnScrollListener(new C16160a());
        this.f79327n.setVisibility(8);
        jyb.m147537z(jyb.m147507f0(this.f79321h, this.f79323j), new y20() { // from class: l.x010
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191863a.m107486F((View) obj);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ky00 ky00Var) {
        this.f79330q = ky00Var;
    }

    /* JADX INFO: renamed from: u */
    public void m107514u() {
        this.f79327n.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public void m107515v() {
        this.f79316c.setVisibility(8);
    }

    /* JADX INFO: renamed from: w */
    public void m107516w(final Picture.ImageUri imageUri) {
        uqb0.f180374G.m127125Q0(this.f79321h, imageUri);
        l51.m152893M(new Runnable() { // from class: l.u010
            @Override // java.lang.Runnable
            public final void run() {
                this.f176841a.m107501C(imageUri);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public void m107517x(User user) {
        boolean z = this.f79330q.f129258c;
        MomentsInProfileAct momentsInProfileAct = this.f79328o;
        if (z) {
            momentsInProfileAct.setTitle(R$string.f39884c4);
        } else {
            momentsInProfileAct.setTitle(R$string.f39970p);
        }
        this.f79323j.setText(user.name);
        String gPMemo = FeedModule.m61406H().getGPMemo(user.f56859id);
        if (!TextUtils.isEmpty(gPMemo)) {
            this.f79323j.setText(gPMemo);
        }
        uqb0.f180396b0.f170325b.showUserVerificationLogo(act(), user, this.f79322i);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m107518y(int[] iArr) {
        this.f79326m.setMinimumHeight(iArr[1] - qa00.m175859d(200.0f));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m107519z(Bitmap bitmap) {
        this.f79318e.setImageBitmap(bitmap);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.c110$a */
    public class C16160a implements AbsListView.OnScrollListener {
        public C16160a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (i == 0) {
                c110 c110Var = c110.this;
                c110Var.f79318e.setTranslationY((-c110Var.f79317d.getTop()) / 2);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }
}
