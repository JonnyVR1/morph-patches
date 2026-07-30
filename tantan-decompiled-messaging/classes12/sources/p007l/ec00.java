package p007l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedWithTwoRecyclerNestedScrollView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.jig;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.s7m;
import l.t100;
import l.u2c0;
import l.vwb;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ec00 implements s7m<ya00> {

    /* JADX INFO: renamed from: A */
    public ya00 f7278A;

    /* JADX INFO: renamed from: B */
    public y900 f7279B;

    /* JADX INFO: renamed from: C */
    public MomentDetailFrag f7280C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumTopView f7281D;

    /* JADX INFO: renamed from: E */
    public ViewTreeObserver.OnGlobalLayoutListener f7282E;

    /* JADX INFO: renamed from: F */
    public Act f7283F;

    /* JADX INFO: renamed from: H */
    public int f7285H;

    /* JADX INFO: renamed from: I */
    public MomentVisibilityStatus f7286I;

    /* JADX INFO: renamed from: J */
    public String f7287J;

    /* JADX INFO: renamed from: K */
    public xa70 f7288K;

    /* JADX INFO: renamed from: O */
    public boolean f7292O;

    /* JADX INFO: renamed from: S */
    public View f7296S;

    /* JADX INFO: renamed from: T */
    public boolean f7297T;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f7299a;

    /* JADX INFO: renamed from: b */
    public View f7300b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f7301c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f7302d;

    /* JADX INFO: renamed from: e */
    public FeedWithTwoRecyclerNestedScrollView f7303e;

    /* JADX INFO: renamed from: f */
    public FeedMaxHeightRecyclerView f7304f;

    /* JADX INFO: renamed from: g */
    public CommonEmptyView f7305g;

    /* JADX INFO: renamed from: h */
    public View f7306h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f7307i;

    /* JADX INFO: renamed from: j */
    public View f7308j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f7309k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f7310l;

    /* JADX INFO: renamed from: m */
    public View f7311m;

    /* JADX INFO: renamed from: n */
    public VLinear f7312n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f7313o;

    /* JADX INFO: renamed from: p */
    public MessageInputEditView f7314p;

    /* JADX INFO: renamed from: q */
    public VImage f7315q;

    /* JADX INFO: renamed from: r */
    public TextView f7316r;

    /* JADX INFO: renamed from: s */
    public FeedItemCommendBotEmojiView f7317s;

    /* JADX INFO: renamed from: t */
    public VLinear f7318t;

    /* JADX INFO: renamed from: u */
    public VImage f7319u;

    /* JADX INFO: renamed from: v */
    public VText f7320v;

    /* JADX INFO: renamed from: w */
    public FeedItemCommendBotEmojiView f7321w;

    /* JADX INFO: renamed from: x */
    public View f7322x;

    /* JADX INFO: renamed from: y */
    public VLinear f7323y;

    /* JADX INFO: renamed from: z */
    public VImage f7324z;

    /* JADX INFO: renamed from: G */
    public boolean f7284G = false;

    /* JADX INFO: renamed from: L */
    public e30<Boolean> f7289L = new e30() { // from class: l.kb00
        public final void call(Object obj) {
            this.f9663a.m9748J0((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: M */
    public boolean f7290M = false;

    /* JADX INFO: renamed from: N */
    public boolean f7291N = false;

    /* JADX INFO: renamed from: P */
    public Runnable f7293P = new RunnableC2370a();

    /* JADX INFO: renamed from: Q */
    public boolean f7294Q = false;

    /* JADX INFO: renamed from: R */
    public ValueAnimator f7295R = null;

    /* JADX INFO: renamed from: U */
    public boolean f7298U = false;

    /* JADX INFO: renamed from: l.ec00$a */
    public class RunnableC2370a implements Runnable {
        public RunnableC2370a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ec00.this.f7323y.setVisibility(4);
        }
    }

    public ec00(MomentDetailFrag momentDetailFrag) {
        this.f7280C = momentDetailFrag;
        this.f7283F = momentDetailFrag.act();
    }

    /* JADX INFO: renamed from: O */
    private void m9713O() {
        ya00 ya00Var = this.f7278A;
        ya00Var.f15356n = "";
        ya00Var.f15355m = null;
        ya00Var.f15354l = null;
    }

    /* JADX INFO: renamed from: W */
    private void m9714W() {
        if (!this.f7294Q && NullChecker.a(this.f7295R)) {
            this.f7295R.cancel();
        }
        this.f7294Q = false;
        m9794k1(0);
    }

    /* JADX INFO: renamed from: X */
    public static void m9715X(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9718c() {
    }

    /* JADX INFO: renamed from: e0 */
    private void m9721e0() {
        m9786f1();
        if (TextUtils.isEmpty(this.f7314p.getText().toString().trim())) {
            this.f7314p.setHint(act().getString(R$string.f340D));
            ya00 ya00Var = this.f7278A;
            ya00Var.f15356n = "";
            ya00Var.f15355m = null;
            ya00Var.f15354l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public void m9795l0() {
        ya00 ya00Var = this.f7278A;
        if (ya00Var.f15347e == null) {
            return;
        }
        if (ya00Var.f15361s) {
            this.f7309k.setVisibility(0);
            return;
        }
        if (this.f7305g.getVisibility() == 0) {
            this.f7309k.setVisibility(4);
            return;
        }
        if (vqg.m15506b0(FeedModule.f316d.m16628e8(this.f7278A.m17047O0().owner))) {
            this.f7309k.setVisibility(4);
            return;
        }
        boolean globalVisibleRect = this.f7304f.getGlobalVisibleRect(new Rect());
        LinearLayout linearLayout = this.f7309k;
        if (globalVisibleRect) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private void m9726j1(MomentMessage momentMessage, String str) {
        xdl0.A(this.f7314p);
        this.f7283F.showInput(this.f7314p, 0);
        this.f7314p.setHint(this.f7278A.m17039E1(momentMessage, str));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m9740A0(String str) {
        if (this.f7314p.getText().toString().length() + str.length() > 180) {
            lsi0.j("最多可输入180字");
            return;
        }
        this.f7278A.m17038D1(str);
        this.f7314p.getText().insert(this.f7314p.getSelectionStart(), str);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m9741B0(j760 j760Var) {
        if (this.f7323y == null) {
            return;
        }
        this.f7291N = ((Boolean) j760Var.a).booleanValue();
        if (((Boolean) j760Var.a).booleanValue()) {
            m9790i0(j760Var);
        } else {
            m9788h0(j760Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9742C0() {
        return this.f7283F;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m9744E0(Boolean bool) {
        if (bool.booleanValue()) {
            m9743D0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m9745G0(User user) {
        kyg.m11537f(act(), "p_fake_nearby_comments_popup", user, new d30() { // from class: l.ub00
            public final void call() {
                this.f13792a.m9743D0();
            }
        }, new e30() { // from class: l.wb00
            public final void call(Object obj) {
                this.f14497a.m9744E0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m9746H0(View view) {
        j760<Boolean, String> j760VarM9785f0 = m9785f0();
        Object obj = j760VarM9785f0.a;
        if (obj == null || !((Boolean) obj).booleanValue()) {
            m9743D0();
            return;
        }
        final User userM16628e8 = !TextUtils.isEmpty((CharSequence) j760VarM9785f0.b) ? FeedModule.f316d.m16628e8((String) j760VarM9785f0.b) : null;
        if (nkg.m12277z()) {
            e51.J(this.f7293P);
            if (xdl0.O0(this.f7323y) && this.f7323y.getLayoutParams().height != 0) {
                this.f7315q.setSelected(false);
                m9794k1(0);
                xdl0.C0(this.f7306h, nkg.m12213K() ? t100.d(38.0f) : 0);
                if (this.f7318t.getVisibility() == 0) {
                    xdl0.M(this.f7318t, false);
                }
            }
            if (this.f7291N) {
                m9714W();
                m9715X(this.f7283F, this.f7314p);
            }
        }
        e51.H(this.f7283F, new Runnable() { // from class: l.qb00
            @Override // java.lang.Runnable
            public final void run() {
                this.f12184a.m9745G0(userM16628e8);
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m9747I0() {
        this.f7314p.setInputType(this.f7285H);
        m9721e0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m9748J0(Boolean bool) {
        if (bool.booleanValue() && NullChecker.a(this.f7278A.f15347e)) {
            m9766T();
        }
        ya00 ya00Var = this.f7278A;
        if (ya00Var.f15363u) {
            ya00Var.f15361s = bool.booleanValue();
            boolean zBooleanValue = bool.booleanValue();
            MessageInputEditView messageInputEditView = this.f7314p;
            if (zBooleanValue) {
                messageInputEditView.requestFocus();
            } else {
                messageInputEditView.setHint(act().getString(R$string.f340D));
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public View m9749K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fc00.m10110b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m9750K0(String str, boolean z) {
        m9751L(false, false);
        if (nkg.m12209G() && this.f7278A.m17050S0() && this.f7319u.isSelected()) {
            ya00 ya00Var = this.f7278A;
            ya00Var.m17037C1(this.f7283F, str, ya00Var.f15358p, ya00Var.f15357o);
        }
        m9777Z0(this.f7279B.m16994l0(this.f7278A.f15354l));
        if (z) {
            m9783d1(false);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m9751L(boolean z, boolean z2) {
        xdl0.M(this.f7300b, z);
        xdl0.M(this.f7308j, z);
        xdl0.C0(this.f7322x, t100.d(((!z && (this.f7323y.getVisibility() == 4 || this.f7323y.getVisibility() == 8)) || z2) ? 33.0f : 11.0f));
        this.f7283F.setStatusBarColor(Color.parseColor(z ? "#4D000000" : "#ffffff"));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m9752L0(MomentMessage momentMessage, String str) {
        this.f7314p.setInputType(this.f7285H);
        m9726j1(momentMessage, str);
    }

    /* JADX INFO: renamed from: M */
    public final void m9753M(d30 d30Var) {
        v1h.m15219P0(this.f7283F, new d30() { // from class: l.hb00
            public final void call() {
                lsi0.w(R$string.f374I3);
            }
        }, false, d30Var, w1h.f14363c);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m9754M0(ValueAnimator valueAnimator) {
        xdl0.C0(this.f7323y, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void m9791i1(ya00 ya00Var) {
        this.f7278A = ya00Var;
    }

    /* JADX INFO: renamed from: N0 */
    public void m9756N0(boolean z) {
        if (nkg.m12277z()) {
            m9751L(false, true);
            e51.J(this.f7293P);
            if (xdl0.O0(this.f7323y) && this.f7323y.getLayoutParams().height != 0) {
                this.f7315q.setSelected(false);
                m9794k1(0);
                xdl0.C0(this.f7306h, nkg.m12209G() ? t100.d(38.0f) : 0);
                if (this.f7318t.getVisibility() == 0) {
                    xdl0.M(this.f7318t, false);
                    return;
                }
                return;
            }
            if (this.f7291N) {
                if (z) {
                    m9714W();
                    m9715X(this.f7283F, this.f7314p);
                    return;
                }
                return;
            }
        }
        if (NullChecker.a(act())) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m9757O0(List<MomentMessage> list) {
        boolean z = this.f7278A.f15359q;
        y900 y900Var = this.f7279B;
        if (z) {
            y900Var.mo9400d0(new ArrayList());
        } else {
            y900Var.mo9400d0(list);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m9758P() {
        this.f7299a.setLeftIconResource(u2c0.n);
        this.f7299a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ib00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8978a.m9792j0(view);
            }
        });
        this.f7309k.setVisibility(4);
        this.f7299a.setTitleView(this.f7281D);
        xdl0.W(this.f7299a.getLeftIconContainer(), 0);
        if (NullChecker.b(this.f7314p)) {
            this.f7280C.duringCreated(this.f7314p.i(true)).subscribe(mkd0.G(new e30() { // from class: l.jb00
                public final void call(Object obj) {
                    this.f9301a.m9793k0((CharSequence) obj);
                }
            }));
        }
        this.f7305g.f2282b.setText(act().getString(R$string.f511e4));
        this.f7305g.f2281a.setImageResource(f3c0.f7818h6);
        xdl0.X(this.f7305g.f2281a, t100.d(230.0f));
        if (this.f7282E == null) {
            this.f7282E = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.lb00
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f9991a.m9795l0();
                }
            };
            this.f7309k.getViewTreeObserver().addOnGlobalLayoutListener(this.f7282E);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m9759P0(List<MomentMessage> list, List<StickerInfo> list2) {
        if (!vwb.J(list2)) {
            this.f7279B.f6932d.clear();
            this.f7279B.f6932d.addAll(list2);
        }
        m9757O0(list);
    }

    /* JADX INFO: renamed from: Q */
    public void m9760Q() {
        this.f7316r.setOnClickListener(null);
        this.f7314p.setOnTouchListener(null);
        this.f7309k.getViewTreeObserver().removeOnGlobalLayoutListener(this.f7282E);
        this.f7282E = null;
        this.f7289L = null;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m9761Q0(Links links) {
        this.f7279B.f15314p = links;
    }

    /* JADX INFO: renamed from: R */
    public void m9762R(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f7279B.f6933e.get(momentMessage.commentInfo.parentMessageId);
        if (NullChecker.a(list) && list.contains(momentMessage)) {
            list.remove(momentMessage);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m9763R0(Moment moment) {
        this.f7279B.f15317s = moment;
    }

    /* JADX INFO: renamed from: S */
    public final void m9764S() {
        if (vqg.m15500X(this.f7278A.f15347e)) {
            zvf0.A("e_moment_voice", "p_user_moment_interactions_details_view", new j760[]{vwb.Y("owner_id", this.f7278A.f15347e.owner), vwb.Y("moment_id", ((DbObject) this.f7278A.f15347e).id), vwb.Y("resource", "")});
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m9765S0(MomentMessage momentMessage) {
        this.f7279B.mo9401e0(momentMessage);
    }

    /* JADX INFO: renamed from: T */
    public final void m9766T() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("moment_id", ((DbObject) this.f7278A.f15347e).id));
        arrayList.add(j760.a("owner_id", this.f7278A.f15347e.owner));
        zi60.m17436w();
        arrayList.add(j760.a("moment_showfrom", zi60.m17435D(this.f7278A.f15352j)));
        arrayList.add(j760.a("moment_type", zi60.m17436w().m17467y(this.f7278A.f15347e)));
        arrayList.add(j760.a("comment_detail", this.f7284G ? "reply" : "comment"));
        arrayList.add(j760.a("moment_distance", Long.valueOf(vqg.m15477G(this.f7278A.f15347e))));
        arrayList.add(j760.a("moment_create_time", Long.valueOf(vqg.m15475F(this.f7278A.f15347e))));
        arrayList.add(j760.a("owner_active_time", Long.valueOf(vqg.m15495S(FeedModule.f316d.m16628e8(this.f7278A.f15358p)))));
        p6j0.m12913c("e_comment", "p_user_moment_interactions_details_view", (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: T0 */
    public void m9767T0() {
        Moment momentM17047O0 = this.f7278A.m17047O0();
        if (momentM17047O0 == null) {
            return;
        }
        y900 y900Var = this.f7279B;
        y900Var.f15317s = momentM17047O0;
        y900Var.notifyItemChanged(0);
        if (TEnum.equals(momentM17047O0.settings.visibility, this.f7286I)) {
            return;
        }
        ya00 ya00Var = this.f7278A;
        ya00Var.f15347e = momentM17047O0;
        m9773X0(ya00Var.f15346d, ya00Var.f15352j);
    }

    /* JADX INFO: renamed from: U */
    public List<MomentMessage> m9768U(String str) {
        return this.f7279B.m9390S(str);
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m9769U0(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        if (xaj0Var.a == null) {
            this.f7283F.finish();
            return false;
        }
        xdl0.M0(this.f7309k, true);
        xdl0.M0(this.f7304f, true);
        xdl0.M0(this.f7305g, false);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m9770V() {
        if (TextUtils.isEmpty(this.f7287J)) {
            return;
        }
        d.l().k(this.f7287J);
        this.f7287J = null;
    }

    /* JADX INFO: renamed from: V0 */
    public void m9771V0(Throwable th) {
        if (xdl0.O0(this.f7305g)) {
            return;
        }
        xdl0.M0(this.f7309k, false);
        boolean z = th instanceof ApiExcep.Client.Forbidden;
        if (z || (th instanceof ApiExcep.Client.NotFound)) {
            if (z && ((TantanException.Client.TantanForbidden) th).code == 40314) {
                lsi0.w(R$string.f487b1);
                act().finish();
            } else if (NullChecker.a(this.f7278A.m17047O0()) && NullChecker.a(this.f7278A.m17047O0().owner) && !vqg.m15506b0(FeedModule.f316d.m16628e8(this.f7278A.m17047O0().owner))) {
                xdl0.M0(this.f7305g, true);
                xdl0.M0(this.f7302d, false);
                xdl0.M(this.f7304f, false);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m9772W0(boolean z) {
        xdl0.M0(this.f7324z, z);
    }

    /* JADX INFO: renamed from: X0 */
    public void m9773X0(hx60 hx60Var, String str) {
        Moment moment = this.f7278A.f15347e;
        if (moment == null) {
            return;
        }
        this.f7286I = moment.settings.visibility;
        xa70.C2532a c2532aM16069h = xa70.C2532a.m16062a().m16065d(this.f7283F).m16072k(this.f7278A.f15347e).m16070i(false).m16071j(this.f7278A.f15366x).m16069h(true);
        if (!TextUtils.isEmpty(this.f7278A.f15353k)) {
            str = this.f7278A.f15353k;
        }
        xa70 xa70VarM16063b = c2532aM16069h.m16068g(str).m16066e(hx60Var).m16073l(null).m16067f(this.f7278A.f15348f).m16063b();
        this.f7288K = xa70VarM16063b;
        User user = xa70VarM16063b.f14825f;
        if (NullChecker.a(user) && user.needShowFrame() && !TextUtils.isEmpty(user.headFrameUrl())) {
            VLinear parent = this.f7299a.getTitleContainer().getParent();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = t100.d(4.0f);
            parent.setLayoutParams(layoutParams);
        } else if (NullChecker.a(user) && NullChecker.a(user.profile)) {
            List<Double> list = user.profile.extensions.headFrame.expiredTime;
            if (!vwb.J(list) && list.get(0).doubleValue() > mqi0.o() && !vwb.J(user.profile.extensions.headFrame.url)) {
                VLinear parent2 = this.f7299a.getTitleContainer().getParent();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = t100.d(4.0f);
                parent2.setLayoutParams(layoutParams2);
            }
        }
        this.f7281D.m5799E(this.f7288K);
    }

    /* JADX INFO: renamed from: Y */
    public void m9774Y(hx60 hx60Var) {
        ya00 ya00Var = this.f7278A;
        y900 y900Var = new y900(ya00Var.f15359q, this.f7283F, hx60Var, ya00Var.f15347e, ya00Var.f15358p, ya00Var.f15352j, this.f7280C, this, ya00Var, new d30() { // from class: l.mb00
            public final void call() {
                this.f10407a.m9799p0();
            }
        });
        this.f7279B = y900Var;
        this.f7304f.setAdapter(y900Var);
        if (this.f7278A.f15359q) {
            this.f7279B.mo9400d0(new ArrayList());
        }
        m9764S();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Y0 */
    public void m9775Y0(int i) {
        if (this.f7303e.canScrollVertically(i)) {
            this.f7303e.scrollBy(0, i);
        } else if (this.f7304f.canScrollVertically(i)) {
            this.f7304f.scrollBy(0, i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m9776Z() {
        this.f7312n.removeAllViews();
        View viewB6 = FeedModule.m1140H().b6(this.f7283F, this.f7314p, true, new e30() { // from class: l.zb00
            public final void call(Object obj) {
                this.f15682a.m9808y0((Boolean) obj);
            }
        }, false);
        this.f7296S = viewB6;
        this.f7312n.addView(viewB6);
        xdl0.E0(this.f7315q, new View.OnClickListener() { // from class: l.ac00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5706a.m9809z0(view);
            }
        });
        final View viewYo = FeedModule.m1140H().yo(this.f7283F, new e30() { // from class: l.bc00
            public final void call(Object obj) {
                this.f6260a.m9740A0((String) obj);
            }
        }, new d30() { // from class: l.cc00
            public final void call() {
                ec00.m9718c();
            }
        }, this.f7314p, false, this.f7296S);
        this.f7323y.addView(viewYo);
        if (NullChecker.a(this.f7314p)) {
            this.f7314p.setFilters(new InputFilter[]{new m2h(180)});
        }
        this.f7317s.m5111b0(this.f7283F, new e30() { // from class: l.dc00
            public final void call(Object obj) {
                this.f6891a.m9800q0(viewYo, (VImage) obj);
            }
        }, new e30() { // from class: l.ab00
            public final void call(Object obj) {
                this.f5688a.m9801r0(viewYo, (VImage) obj);
            }
        }, new d30() { // from class: l.bb00
            public final void call() {
                this.f6214a.m9803t0();
            }
        });
        this.f7321w.m5111b0(this.f7283F, new e30() { // from class: l.cb00
            public final void call(Object obj) {
                this.f6592a.m9804u0(viewYo, (VImage) obj);
            }
        }, new e30() { // from class: l.db00
            public final void call(Object obj) {
                this.f6882a.m9805v0(viewYo, (VImage) obj);
            }
        }, new d30() { // from class: l.eb00
            public final void call() {
                this.f7273a.m9807x0();
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public void m9777Z0(int i) {
        this.f7304f.scrollToPosition(i);
    }

    /* JADX INFO: renamed from: a0 */
    public void m9778a0() {
        this.f7283F.duringCreated(MomentDetailAct.f3527h).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.yb00
            public final void call(Object obj) {
                this.f15380a.m9741B0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final void m9743D0() {
        MomentMessage momentMessage;
        if (nkg.m12209G() && this.f7278A.m17050S0() && !this.f7319u.isSelected()) {
            ya00.f15332K.put(Long.valueOf(mqi0.o()));
        }
        final String string = this.f7314p.getText().toString();
        if (nkg.m12209G() && this.f7278A.m17050S0()) {
            zvf0.u("e_greet_together", "p_user_moment_interactions_details_view", new j760[]{vwb.Y("moments_user_id", this.f7278A.f15358p), vwb.Y("selection_situation", this.f7319u.isSelected() ? "1" : "0")});
        }
        this.f7284G = false;
        final boolean z = TextUtils.isEmpty(this.f7278A.f15356n) && ((momentMessage = this.f7278A.f15354l) == null || TextUtils.isEmpty(((CopyObject) momentMessage).id));
        this.f7278A.m17074x1(this.f7314p.getText().toString(), this.f7314p.getText().toString().trim(), new d30() { // from class: l.sb00
            public final void call() {
                this.f12866a.m9750K0(string, z);
            }
        });
        if (xdl0.O0(this.f7323y) && this.f7323y.getLayoutParams().height != 0) {
            m9794k1(0);
        }
        this.f7283F.hideInput();
        this.f7314p.setHint(this.f7280C.getResources().getString(R$string.f463X2));
        this.f7315q.setSelected(false);
        this.f7314p.setText(null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b0 */
    public void m9780b0(Bundle bundle) {
        PhotoAlbumTopView photoAlbumTopView = (PhotoAlbumTopView) LayoutInflater.from(this.f7283F).inflate(o6c0.f11209f2, (ViewGroup) null, false);
        this.f7281D = photoAlbumTopView;
        FrameLayout frameLayout = (FrameLayout) photoAlbumTopView.getProfile_pic().getParent();
        if (NullChecker.b(frameLayout)) {
            xdl0.V(frameLayout, t100.d(0.0f));
        }
        xdl0.W(this.f7281D.getAttention(), t100.d(4.0f));
        xdl0.X((RelativeLayout) this.f7281D.findViewById(b5c0.f6014X0), t100.d(0.0f));
        this.f7304f.getItemAnimator().setAddDuration(0L);
        this.f7304f.getItemAnimator().setChangeDuration(0L);
        this.f7304f.getItemAnimator().setMoveDuration(0L);
        this.f7304f.getItemAnimator().setRemoveDuration(0L);
        this.f7304f.getItemAnimator().setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: c0 */
    public void m9781c0() {
        this.f7316r.setOnClickListener(new View.OnClickListener() { // from class: l.ob00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11408a.m9746H0(view);
            }
        });
        this.f7278A.m17049R0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m9782d0() {
        this.f7284G = false;
        if (this.f7278A.f15361s) {
            m9766T();
        }
        if (sti.m14315a()) {
            m9753M(new d30() { // from class: l.tb00
                public final void call() {
                    this.f13249a.m9747I0();
                }
            });
        } else {
            m9721e0();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m9783d1(boolean z) {
        String string;
        if (xdl0.O0(this.f7281D.getAttention()) && this.f7278A.m17044I0()) {
            String str = z ? "like_click" : "comment_send";
            p6j0.m12915e("e_follow_bubble_guide", "p_user_moment_interactions_details_view", j760.a("trigger_time", str));
            xa70 xa70Var = this.f7288K;
            xa70Var.f14836q = str;
            this.f7281D.m5799E(xa70Var);
            String str2 = "他";
            if (NullChecker.a(this.f7278A.f15347e)) {
                User userM16628e8 = FeedModule.f316d.m16628e8(this.f7278A.f15347e.owner);
                if (NullChecker.a(userM16628e8) && userM16628e8.isFemale()) {
                    str2 = "她";
                }
            }
            if (z) {
                string = "你刚刚赞了" + str2 + "的动态，对" + str2 + "感兴趣就关注" + str2 + "吧";
            } else {
                string = "你刚刚评论了" + str2 + "的动态，对" + str2 + "感兴趣就关注" + str2 + "吧";
            }
            if (nkg.m12213K()) {
                StringBuilder sb = z ? new StringBuilder("你刚刚赞了") : new StringBuilder("你刚刚评论了");
                sb.append(str2);
                sb.append("的动态，发送喜欢来表达心意吧");
                string = sb.toString();
            }
            this.f7287J = d.l().t(new a(this.f7283F).D(string).k(new int[]{this.f7283F.getResources().getColor(e1c0.f7154n)}).J(13.0f).E(true).b(3000L).x(t100.g).q(a.N | a.P).o(a.P, t100.d(6.0f)), this.f7281D.getAttention());
            this.f7278A.m17046L1();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m9784e1() {
        if (!this.f7291N || xdl0.O0(this.f7318t)) {
            return;
        }
        zvf0.A("e_greet_together", "p_user_moment_interactions_details_view", new j760[]{vwb.Y("moments_user_id", this.f7278A.f15358p)});
        xdl0.M(this.f7318t, true);
    }

    /* JADX INFO: renamed from: f0 */
    public final j760<Boolean, String> m9785f0() {
        if (!nkg.m12274x0()) {
            return new j760<>(Boolean.FALSE, "");
        }
        ya00 ya00Var = this.f7278A;
        String str = ya00Var.f15355m;
        String str2 = ya00Var.f15358p;
        String strUserId = FeedModule.m1139F().userId();
        if (TextUtils.isEmpty(str)) {
            return !TextUtils.equals(strUserId, str2) ? new j760<>(Boolean.TRUE, str2) : new j760<>(Boolean.FALSE, "");
        }
        return TextUtils.equals(strUserId, str) ? new j760<>(Boolean.FALSE, "") : new j760<>(Boolean.TRUE, str);
    }

    /* JADX INFO: renamed from: f1 */
    public void m9786f1() {
        this.f7314p.requestFocus();
        this.f7283F.showInput(this.f7314p, 0);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m9787g0() {
        VFrame vFrame = this.f7281D;
        return vFrame != null && xdl0.O0(vFrame);
    }

    /* JADX INFO: renamed from: h0 */
    public void m9788h0(j760<Boolean, Integer> j760Var) {
        if (this.f7292O) {
            this.f7292O = false;
            if (this.f7323y.getLayoutParams().height == 0 || this.f7323y.getVisibility() == 8) {
                this.f7315q.setSelected(false);
            }
            this.f7314p.setCursorVisible(false);
            if (this.f7290M) {
                this.f7290M = false;
                return;
            }
            m9751L(false, false);
            if (this.f7318t.getVisibility() == 0) {
                xdl0.M(this.f7318t, false);
            }
            xdl0.C0(this.f7306h, nkg.m12209G() ? t100.d(38.0f) : 0);
            this.f7323y.setVisibility(4);
            m9714W();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m9789h1(final MomentMessage momentMessage, final String str) {
        this.f7284G = true;
        if (this.f7278A.f15361s) {
            m9766T();
        }
        if (sti.m14315a()) {
            m9753M(new d30() { // from class: l.pb00
                public final void call() {
                    this.f11758a.m9752L0(momentMessage, str);
                }
            });
        } else {
            m9726j1(momentMessage, str);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m9790i0(j760<Boolean, Integer> j760Var) {
        m9751L(true, false);
        if (nkg.m12209G() && this.f7278A.m17050S0()) {
            zvf0.A("e_greet_together", "p_user_moment_interactions_details_view", new j760[]{vwb.Y("moments_user_id", this.f7278A.f15358p)});
            xdl0.M(this.f7318t, true);
        }
        this.f7292O = true;
        xdl0.C0(this.f7306h, ((Integer) j760Var.b).intValue() + (nkg.m12209G() ? t100.d(50.0f) : 0));
        this.f7315q.setSelected(false);
        e51.H(this.f7283F, this.f7293P, 400L);
        if (this.f7323y.getLayoutParams().height == ((Integer) j760Var.b).intValue()) {
            return;
        }
        this.f7294Q = true;
        m9794k1(((Integer) j760Var.b).intValue());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM9749K = m9749K(layoutInflater, viewGroup);
        viewM9749K.setBackgroundColor(this.f7280C.getResources().getColor(e1c0.f7159p0));
        this.f7280C.duringCreated(Act.keyboardListenerObservable(viewM9749K)).subscribe(this.f7289L);
        this.f7314p.setHintTextColor(this.f7280C.getResources().getColor(e1c0.f7160q));
        this.f7314p.setHint(act().getString(R$string.f340D));
        if (sti.m14315a() || this.f7278A.f15359q) {
            this.f7285H = this.f7314p.getInputType();
            this.f7314p.setInputType(0);
        }
        this.f7314p.setOnTouchListener(new View.OnTouchListener() { // from class: l.vb00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f14133a.m9797n0(view, motionEvent);
            }
        });
        this.f7304f.setMaxHeight(xdl0.w0());
        this.f7303e.setFirstRecyclerUserIntegerMaxHeight(false);
        this.f7304f.setOverScrollMode(2);
        if (nkg.m12277z()) {
            m9776Z();
        }
        xdl0.M(this.f7315q, nkg.m12277z());
        if (!nkg.m12277z()) {
            this.f7316r.setBackground(null);
            this.f7316r.setTextColor(this.f7283F.getResources().getColorStateList(e1c0.f7111J));
        }
        if (nkg.m12209G()) {
            this.f7319u.setSelected(!this.f7278A.m17040F1());
            this.f7320v.setTextColor(this.f7319u.isSelected() ? Color.parseColor("#cc000000") : Color.parseColor("#33000000"));
            xdl0.E0(this.f7319u, new View.OnClickListener() { // from class: l.xb00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14857a.m9798o0(view);
                }
            });
        }
        return viewM9749K;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m9792j0(View view) {
        m9756N0(true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m9793k0(CharSequence charSequence) {
        Editable text = this.f7314p.getText();
        boolean z = (text == null || text.toString().trim().isEmpty()) ? false : true;
        boolean zM12277z = nkg.m12277z();
        TextView textView = this.f7316r;
        if (zM12277z) {
            xdl0.M(textView, z);
        } else {
            textView.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m9794k1(int i) {
        if (i == 0) {
            this.f7295R = ValueAnimator.ofInt(this.f7323y.getLayoutParams().height, 0);
        } else {
            this.f7295R = ValueAnimator.ofInt(0, i);
        }
        this.f7295R.setDuration(150L);
        this.f7295R.setInterpolator(new jig());
        this.f7295R.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.za00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f15670a.m9754M0(valueAnimator);
            }
        });
        this.f7295R.start();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m9796m0() {
        this.f7314p.setInputType(this.f7285H);
        m9713O();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ boolean m9797n0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ya00 ya00Var = this.f7278A;
            if (ya00Var.f15359q) {
                lsi0.h(R$string.f503d3);
                return false;
            }
            if (!ya00Var.f15361s && TextUtils.isEmpty(this.f7314p.getText())) {
                if (sti.m14315a()) {
                    m9753M(new d30() { // from class: l.fb00
                        public final void call() {
                            this.f8059a.m9796m0();
                        }
                    });
                    return false;
                }
                m9713O();
            }
            if (!this.f7292O) {
                ya00 ya00Var2 = this.f7278A;
                j2i.m11067a(ya00Var2.f15347e, ya00Var2.f15352j);
            }
        }
        if (nkg.m12277z()) {
            this.f7314p.setCursorVisible(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m9798o0(View view) {
        VImage vImage = this.f7319u;
        vImage.setSelected(!vImage.isSelected());
        this.f7320v.setTextColor(this.f7319u.isSelected() ? Color.parseColor("#cc000000") : Color.parseColor("#33000000"));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m9799p0() {
        m9783d1(true);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m9800q0(View view, VImage vImage) {
        this.f7321w.setImageViewSelected(0);
        FeedModule.m1140H().c9(view, 1);
        this.f7315q.performClick();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m9801r0(View view, VImage vImage) {
        this.f7321w.setImageViewSelected(1);
        zvf0.r("e_comment_gif", "p_user_moment_interactions_details_view");
        FeedModule.m1140H().c9(view, 2);
        this.f7315q.performClick();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m9802s0(Media media) {
        FeedModule.m1140H().p7(this.f7296S, (Object) null, media);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m9803t0() {
        zvf0.r("e_comment_picture", "p_user_moment_interactions_details_view");
        this.f7317s.m5110a0(this.f7283F, new e30() { // from class: l.gb00
            public final void call(Object obj) {
                this.f8412a.m9802s0((Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m9804u0(View view, VImage vImage) {
        if (vImage.isSelected()) {
            return;
        }
        this.f7321w.setImageViewSelected(vImage);
        if (this.f7323y.getVisibility() != 0 || this.f7323y.getLayoutParams().height == 0) {
            this.f7315q.performClick();
        }
        FeedModule.m1140H().c9(view, 1);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m9805v0(View view, VImage vImage) {
        if (vImage.isSelected()) {
            return;
        }
        zvf0.r("e_comment_gif", "p_user_moment_interactions_details_view");
        this.f7321w.setImageViewSelected(vImage);
        if (this.f7323y.getVisibility() != 0 || this.f7323y.getLayoutParams().height == 0) {
            this.f7315q.performClick();
        }
        FeedModule.m1140H().c9(view, 2);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m9806w0(Media media) {
        if (this.f7298U) {
            this.f7298U = false;
            e51.I(this.f7280C, new Runnable() { // from class: l.rb00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12584a.m9786f1();
                }
            }, 250L);
        }
        FeedModule.m1140H().p7(this.f7296S, (Object) null, media);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m9807x0() {
        zvf0.r("e_comment_picture", "p_user_moment_interactions_details_view");
        this.f7298U = this.f7291N;
        this.f7321w.m5110a0(this.f7283F, new e30() { // from class: l.nb00
            public final void call(Object obj) {
                this.f10730a.m9806w0((Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m9808y0(Boolean bool) {
        this.f7297T = bool.booleanValue();
        boolean zBooleanValue = bool.booleanValue();
        TextView textView = this.f7316r;
        if (zBooleanValue) {
            xdl0.M(textView, true);
        } else {
            xdl0.M(textView, !TextUtils.isEmpty(this.f7314p.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m9809z0(View view) {
        if (xdl0.O0(this.f7315q) && this.f7315q.isSelected()) {
            return;
        }
        e51.J(this.f7293P);
        this.f7315q.setSelected(true);
        if (this.f7323y.getVisibility() == 8 || this.f7323y.getLayoutParams().height == 0) {
            m9751L(true, false);
            if (nkg.m12209G() && this.f7278A.m17050S0()) {
                zvf0.A("e_greet_together", "p_user_moment_interactions_details_view", new j760[]{vwb.Y("moments_user_id", this.f7278A.f15358p)});
                xdl0.M(this.f7318t, true);
            }
            zvf0.r("e_emoji_comment", "p_user_moment_interactions_details_view");
            xdl0.M(this.f7323y, true);
            m9794k1(Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            xdl0.C0(this.f7306h, Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) + (nkg.m12209G() ? t100.d(50.0f) : 0));
        } else {
            this.f7290M = true;
        }
        xdl0.M(this.f7323y, true);
        m9715X(this.f7283F, this.f7314p);
    }

    public void destroy() {
    }
}
