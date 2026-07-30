package p149l;

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
import androidx.recyclerview.widget.AbstractC0616v;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedWithTwoRecyclerNestedScrollView;
import com.p046p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class ec00 implements s7m<ya00> {

    /* JADX INFO: renamed from: A */
    public ya00 f90402A;

    /* JADX INFO: renamed from: B */
    public y900 f90403B;

    /* JADX INFO: renamed from: C */
    public MomentDetailFrag f90404C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumTopView f90405D;

    /* JADX INFO: renamed from: E */
    public ViewTreeObserver.OnGlobalLayoutListener f90406E;

    /* JADX INFO: renamed from: F */
    public Act f90407F;

    /* JADX INFO: renamed from: H */
    public int f90409H;

    /* JADX INFO: renamed from: I */
    public MomentVisibilityStatus f90410I;

    /* JADX INFO: renamed from: J */
    public String f90411J;

    /* JADX INFO: renamed from: K */
    public xa70 f90412K;

    /* JADX INFO: renamed from: O */
    public boolean f90416O;

    /* JADX INFO: renamed from: S */
    public View f90420S;

    /* JADX INFO: renamed from: T */
    public boolean f90421T;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f90423a;

    /* JADX INFO: renamed from: b */
    public View f90424b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f90425c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f90426d;

    /* JADX INFO: renamed from: e */
    public FeedWithTwoRecyclerNestedScrollView f90427e;

    /* JADX INFO: renamed from: f */
    public FeedMaxHeightRecyclerView f90428f;

    /* JADX INFO: renamed from: g */
    public CommonEmptyView f90429g;

    /* JADX INFO: renamed from: h */
    public View f90430h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f90431i;

    /* JADX INFO: renamed from: j */
    public View f90432j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f90433k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f90434l;

    /* JADX INFO: renamed from: m */
    public View f90435m;

    /* JADX INFO: renamed from: n */
    public VLinear f90436n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f90437o;

    /* JADX INFO: renamed from: p */
    public MessageInputEditView f90438p;

    /* JADX INFO: renamed from: q */
    public VImage f90439q;

    /* JADX INFO: renamed from: r */
    public TextView f90440r;

    /* JADX INFO: renamed from: s */
    public FeedItemCommendBotEmojiView f90441s;

    /* JADX INFO: renamed from: t */
    public VLinear f90442t;

    /* JADX INFO: renamed from: u */
    public VImage f90443u;

    /* JADX INFO: renamed from: v */
    public VText f90444v;

    /* JADX INFO: renamed from: w */
    public FeedItemCommendBotEmojiView f90445w;

    /* JADX INFO: renamed from: x */
    public View f90446x;

    /* JADX INFO: renamed from: y */
    public VLinear f90447y;

    /* JADX INFO: renamed from: z */
    public VImage f90448z;

    /* JADX INFO: renamed from: G */
    public boolean f90408G = false;

    /* JADX INFO: renamed from: L */
    public e30<Boolean> f90413L = new e30() { // from class: l.kb00
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f122164a.m115579J0((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: M */
    public boolean f90414M = false;

    /* JADX INFO: renamed from: N */
    public boolean f90415N = false;

    /* JADX INFO: renamed from: P */
    public Runnable f90417P = new RunnableC16572a();

    /* JADX INFO: renamed from: Q */
    public boolean f90418Q = false;

    /* JADX INFO: renamed from: R */
    public ValueAnimator f90419R = null;

    /* JADX INFO: renamed from: U */
    public boolean f90422U = false;

    /* JADX INFO: renamed from: l.ec00$a */
    public class RunnableC16572a implements Runnable {
        public RunnableC16572a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ec00.this.f90447y.setVisibility(4);
        }
    }

    public ec00(MomentDetailFrag momentDetailFrag) {
        this.f90404C = momentDetailFrag;
        this.f90407F = momentDetailFrag.act();
    }

    /* JADX INFO: renamed from: O */
    private void m115545O() {
        ya00 ya00Var = this.f90402A;
        ya00Var.f197122n = "";
        ya00Var.f197121m = null;
        ya00Var.f197120l = null;
    }

    /* JADX INFO: renamed from: W */
    private void m115546W() {
        if (!this.f90418Q && NullChecker.m81303a(this.f90419R)) {
            this.f90419R.cancel();
        }
        this.f90418Q = false;
        m115624k1(0);
    }

    /* JADX INFO: renamed from: X */
    public static void m115547X(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m115550c() {
    }

    /* JADX INFO: renamed from: e0 */
    private void m115553e0() {
        m115617f1();
        if (TextUtils.isEmpty(this.f90438p.getText().toString().trim())) {
            this.f90438p.setHint(getAct().getString(R$string.f38879D));
            ya00 ya00Var = this.f90402A;
            ya00Var.f197122n = "";
            ya00Var.f197121m = null;
            ya00Var.f197120l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public void m115625l0() {
        ya00 ya00Var = this.f90402A;
        if (ya00Var.f197113e == null) {
            return;
        }
        if (ya00Var.f197127s) {
            this.f90433k.setVisibility(0);
            return;
        }
        if (this.f90429g.getVisibility() == 0) {
            this.f90433k.setVisibility(4);
            return;
        }
        if (vqg.m199536b0(FeedModule.f38855d.m209447e8(this.f90402A.m213757O0().owner))) {
            this.f90433k.setVisibility(4);
            return;
        }
        boolean globalVisibleRect = this.f90428f.getGlobalVisibleRect(new Rect());
        LinearLayout linearLayout = this.f90433k;
        if (globalVisibleRect) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private void m115558j1(MomentMessage momentMessage, String str) {
        xdl0.m208320A(this.f90438p);
        this.f90407F.showInput(this.f90438p, 0);
        this.f90438p.setHint(this.f90402A.m213749E1(momentMessage, str));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m115572A0(String str) {
        if (this.f90438p.getText().toString().length() + str.length() > 180) {
            lsi0.m151580j("最多可输入180字");
            return;
        }
        this.f90402A.m213748D1(str);
        this.f90438p.getText().insert(this.f90438p.getSelectionStart(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m115573B0(j760 j760Var) {
        if (this.f90447y == null) {
            return;
        }
        this.f90415N = ((Boolean) j760Var.f116564a).booleanValue();
        if (((Boolean) j760Var.f116564a).booleanValue()) {
            m115621i0(j760Var);
        } else {
            m115619h0(j760Var);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f90407F;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m115575E0(Boolean bool) {
        if (bool.booleanValue()) {
            m115574D0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m115576G0(User user) {
        kyg.m147871f(getAct(), "p_fake_nearby_comments_popup", user, new d30() { // from class: l.ub00
            @Override // p149l.d30
            public final void call() {
                this.f175666a.m115574D0();
            }
        }, new e30() { // from class: l.wb00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185528a.m115575E0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m115577H0(View view) {
        j760<Boolean, String> j760VarM115616f0 = m115616f0();
        Boolean bool = j760VarM115616f0.f116564a;
        if (bool == null || !bool.booleanValue()) {
            m115574D0();
            return;
        }
        final User userM209447e8 = !TextUtils.isEmpty(j760VarM115616f0.f116565b) ? FeedModule.f38855d.m209447e8(j760VarM115616f0.f116565b) : null;
        if (nkg.m159918z()) {
            e51.m114745J(this.f90417P);
            if (xdl0.m208349O0(this.f90447y) && this.f90447y.getLayoutParams().height != 0) {
                this.f90439q.setSelected(false);
                m115624k1(0);
                xdl0.m208325C0(this.f90430h, nkg.m159854K() ? t100.m186890d(38.0f) : 0);
                if (this.f90442t.getVisibility() == 0) {
                    xdl0.m208344M(this.f90442t, false);
                }
            }
            if (this.f90415N) {
                m115546W();
                m115547X(this.f90407F, this.f90438p);
            }
        }
        e51.m114743H(this.f90407F, new Runnable() { // from class: l.qb00
            @Override // java.lang.Runnable
            public final void run() {
                this.f153591a.m115576G0(userM209447e8);
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m115578I0() {
        this.f90438p.setInputType(this.f90409H);
        m115553e0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m115579J0(Boolean bool) {
        if (bool.booleanValue() && NullChecker.m81303a(this.f90402A.f197113e)) {
            m115597T();
        }
        ya00 ya00Var = this.f90402A;
        if (ya00Var.f197129u) {
            ya00Var.f197127s = bool.booleanValue();
            boolean zBooleanValue = bool.booleanValue();
            MessageInputEditView messageInputEditView = this.f90438p;
            if (zBooleanValue) {
                messageInputEditView.requestFocus();
            } else {
                messageInputEditView.setHint(getAct().getString(R$string.f38879D));
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public View m115580K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fc00.m120415b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m115581K0(String str, boolean z) {
        m115582L(false, false);
        if (nkg.m159850G() && this.f90402A.m213760S0() && this.f90443u.isSelected()) {
            ya00 ya00Var = this.f90402A;
            ya00Var.m213747C1(this.f90407F, str, ya00Var.f197124p, ya00Var.f197123o);
        }
        m115608Z0(this.f90403B.m213522l0(this.f90402A.f197120l));
        if (z) {
            m115614d1(false);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m115582L(boolean z, boolean z2) {
        xdl0.m208344M(this.f90424b, z);
        xdl0.m208344M(this.f90432j, z);
        xdl0.m208325C0(this.f90446x, t100.m186890d(((!z && (this.f90447y.getVisibility() == 4 || this.f90447y.getVisibility() == 8)) || z2) ? 33.0f : 11.0f));
        this.f90407F.setStatusBarColor(Color.parseColor(z ? "#4D000000" : "#ffffff"));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m115583L0(MomentMessage momentMessage, String str) {
        this.f90438p.setInputType(this.f90409H);
        m115558j1(momentMessage, str);
    }

    /* JADX INFO: renamed from: M */
    public final void m115584M(d30 d30Var) {
        v1h.m196580P0(this.f90407F, new d30() { // from class: l.hb00
            @Override // p149l.d30
            public final void call() {
                lsi0.m151593w(R$string.f38913I3);
            }
        }, false, d30Var, w1h.f184005c);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m115585M0(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this.f90447y, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ya00 ya00Var) {
        this.f90402A = ya00Var;
    }

    /* JADX INFO: renamed from: N0 */
    public void m115587N0(boolean z) {
        if (nkg.m159918z()) {
            m115582L(false, true);
            e51.m114745J(this.f90417P);
            if (xdl0.m208349O0(this.f90447y) && this.f90447y.getLayoutParams().height != 0) {
                this.f90439q.setSelected(false);
                m115624k1(0);
                xdl0.m208325C0(this.f90430h, nkg.m159850G() ? t100.m186890d(38.0f) : 0);
                if (this.f90442t.getVisibility() == 0) {
                    xdl0.m208344M(this.f90442t, false);
                    return;
                }
                return;
            }
            if (this.f90415N) {
                if (z) {
                    m115546W();
                    m115547X(this.f90407F, this.f90438p);
                    return;
                }
                return;
            }
        }
        if (NullChecker.m81303a(getAct())) {
            getAct().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m115588O0(List<MomentMessage> list) {
        boolean z = this.f90402A.f197125q;
        y900 y900Var = this.f90403B;
        if (z) {
            y900Var.mo111805d0(new ArrayList());
        } else {
            y900Var.mo111805d0(list);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m115589P() {
        this.f90423a.setLeftIconResource(u2c0.f173386n);
        this.f90423a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ib00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112342a.m115622j0(view);
            }
        });
        this.f90433k.setVisibility(4);
        this.f90423a.setTitleView(this.f90405D);
        xdl0.m208359W(this.f90423a.getLeftIconContainer(), 0);
        if (NullChecker.m81304b(this.f90438p)) {
            this.f90404C.duringCreated(this.f90438p.mo28618i(true)).subscribe(mkd0.m154955G(new e30() { // from class: l.jb00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117150a.m115623k0((CharSequence) obj);
                }
            }));
        }
        this.f90429g.f40821b.setText(getAct().getString(R$string.f39050e4));
        this.f90429g.f40820a.setImageResource(f3c0.f94535h6);
        xdl0.m208360X(this.f90429g.f40820a, t100.m186890d(230.0f));
        if (this.f90406E == null) {
            this.f90406E = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.lb00
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f127259a.m115625l0();
                }
            };
            this.f90433k.getViewTreeObserver().addOnGlobalLayoutListener(this.f90406E);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m115590P0(List<MomentMessage> list, List<StickerInfo> list2) {
        if (!vwb.m200296J(list2)) {
            this.f90403B.f86235d.clear();
            this.f90403B.f86235d.addAll(list2);
        }
        m115588O0(list);
    }

    /* JADX INFO: renamed from: Q */
    public void m115591Q() {
        this.f90440r.setOnClickListener(null);
        this.f90438p.setOnTouchListener(null);
        this.f90433k.getViewTreeObserver().removeOnGlobalLayoutListener(this.f90406E);
        this.f90406E = null;
        this.f90413L = null;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m115592Q0(Links links) {
        this.f90403B.f196914p = links;
    }

    /* JADX INFO: renamed from: R */
    public void m115593R(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f90403B.f86236e.get(momentMessage.commentInfo.parentMessageId);
        if (NullChecker.m81303a(list) && list.contains(momentMessage)) {
            list.remove(momentMessage);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m115594R0(Moment moment) {
        this.f90403B.f196917s = moment;
    }

    /* JADX INFO: renamed from: S */
    public final void m115595S() {
        if (vqg.m199530X(this.f90402A.f197113e)) {
            zvf0.m220368A("e_moment_voice", "p_user_moment_interactions_details_view", vwb.m200311Y("owner_id", this.f90402A.f197113e.owner), vwb.m200311Y("moment_id", this.f90402A.f197113e.f56011id), vwb.m200311Y("resource", ""));
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m115596S0(MomentMessage momentMessage) {
        this.f90403B.mo111806e0(momentMessage);
    }

    /* JADX INFO: renamed from: T */
    public final void m115597T() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("moment_id", this.f90402A.f197113e.f56011id));
        arrayList.add(j760.m140076a("owner_id", this.f90402A.f197113e.owner));
        zi60.m218961w();
        arrayList.add(j760.m140076a("moment_showfrom", zi60.m218960D(this.f90402A.f197118j)));
        arrayList.add(j760.m140076a("moment_type", zi60.m218961w().m218992y(this.f90402A.f197113e)));
        arrayList.add(j760.m140076a("comment_detail", this.f90408G ? SysnotifListener.ACTION_REPLY : "comment"));
        arrayList.add(j760.m140076a("moment_distance", Long.valueOf(vqg.m199507G(this.f90402A.f197113e))));
        arrayList.add(j760.m140076a("moment_create_time", Long.valueOf(vqg.m199505F(this.f90402A.f197113e))));
        arrayList.add(j760.m140076a("owner_active_time", Long.valueOf(vqg.m199525S(FeedModule.f38855d.m209447e8(this.f90402A.f197124p)))));
        p6j0.m167669c("e_comment", "p_user_moment_interactions_details_view", (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: T0 */
    public void m115598T0() {
        Moment momentM213757O0 = this.f90402A.m213757O0();
        if (momentM213757O0 == null) {
            return;
        }
        y900 y900Var = this.f90403B;
        y900Var.f196917s = momentM213757O0;
        y900Var.notifyItemChanged(0);
        if (TEnum.equals(momentM213757O0.settings.visibility, this.f90410I)) {
            return;
        }
        ya00 ya00Var = this.f90402A;
        ya00Var.f197113e = momentM213757O0;
        m115604X0(ya00Var.f197112d, ya00Var.f197118j);
    }

    /* JADX INFO: renamed from: U */
    public List<MomentMessage> m115599U(String str) {
        return this.f90403B.m111795S(str);
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m115600U0(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        if (xaj0Var.f191751a == null) {
            this.f90407F.lambda$debugItems$19();
            return false;
        }
        xdl0.m208345M0(this.f90433k, true);
        xdl0.m208345M0(this.f90428f, true);
        xdl0.m208345M0(this.f90429g, false);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m115601V() {
        if (TextUtils.isEmpty(this.f90411J)) {
            return;
        }
        C4348d.m20896l().m20900k(this.f90411J);
        this.f90411J = null;
    }

    /* JADX INFO: renamed from: V0 */
    public void m115602V0(Throwable th) {
        if (xdl0.m208349O0(this.f90429g)) {
            return;
        }
        xdl0.m208345M0(this.f90433k, false);
        boolean z = th instanceof ApiExcep.Client.Forbidden;
        if (z || (th instanceof ApiExcep.Client.NotFound)) {
            if (z && ((TantanException.Client.TantanForbidden) th).code == 40314) {
                lsi0.m151593w(R$string.f39026b1);
                getAct().lambda$debugItems$19();
            } else if (NullChecker.m81303a(this.f90402A.m213757O0()) && NullChecker.m81303a(this.f90402A.m213757O0().owner) && !vqg.m199536b0(FeedModule.f38855d.m209447e8(this.f90402A.m213757O0().owner))) {
                xdl0.m208345M0(this.f90429g, true);
                xdl0.m208345M0(this.f90426d, false);
                xdl0.m208344M(this.f90428f, false);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m115603W0(boolean z) {
        xdl0.m208345M0(this.f90448z, z);
    }

    /* JADX INFO: renamed from: X0 */
    public void m115604X0(hx60 hx60Var, String str) {
        Moment moment = this.f90402A.f197113e;
        if (moment == null) {
            return;
        }
        this.f90410I = moment.settings.visibility;
        xa70.C21052a c21052aM207555h = xa70.C21052a.m207548a().m207551d(this.f90407F).m207558k(this.f90402A.f197113e).m207556i(false).m207557j(this.f90402A.f197132x).m207555h(true);
        if (!TextUtils.isEmpty(this.f90402A.f197119k)) {
            str = this.f90402A.f197119k;
        }
        xa70 xa70VarM207549b = c21052aM207555h.m207554g(str).m207552e(hx60Var).m207559l(null).m207553f(this.f90402A.f197114f).m207549b();
        this.f90412K = xa70VarM207549b;
        User user = xa70VarM207549b.f191694f;
        if (NullChecker.m81303a(user) && user.needShowFrame() && !TextUtils.isEmpty(user.headFrameUrl())) {
            VLinear vLinear = (VLinear) this.f90423a.getTitleContainer().getParent();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = t100.m186890d(4.0f);
            vLinear.setLayoutParams(layoutParams);
        } else if (NullChecker.m81303a(user) && NullChecker.m81303a(user.profile)) {
            List<Double> list = user.profile.extensions.headFrame.expiredTime;
            if (!vwb.m200296J(list) && list.get(0).doubleValue() > mqi0.m155944o() && !vwb.m200296J(user.profile.extensions.headFrame.url)) {
                VLinear vLinear2 = (VLinear) this.f90423a.getTitleContainer().getParent();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = t100.m186890d(4.0f);
                vLinear2.setLayoutParams(layoutParams2);
            }
        }
        this.f90405D.m64705E(this.f90412K);
    }

    /* JADX INFO: renamed from: Y */
    public void m115605Y(hx60 hx60Var) {
        ya00 ya00Var = this.f90402A;
        y900 y900Var = new y900(ya00Var.f197125q, this.f90407F, hx60Var, ya00Var.f197113e, ya00Var.f197124p, ya00Var.f197118j, this.f90404C, this, ya00Var, new d30() { // from class: l.mb00
            @Override // p149l.d30
            public final void call() {
                this.f132978a.m115629p0();
            }
        });
        this.f90403B = y900Var;
        this.f90428f.setAdapter(y900Var);
        if (this.f90402A.f197125q) {
            this.f90403B.mo111805d0(new ArrayList());
        }
        m115595S();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m115606Y0(int i) {
        if (this.f90427e.canScrollVertically(i)) {
            this.f90427e.scrollBy(0, i);
        } else if (this.f90428f.canScrollVertically(i)) {
            this.f90428f.scrollBy(0, i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m115607Z() {
        this.f90436n.removeAllViews();
        View viewMo30747b6 = FeedModule.m60222H().mo30747b6(this.f90407F, this.f90438p, true, new e30() { // from class: l.zb00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202415a.m115638y0((Boolean) obj);
            }
        }, false);
        this.f90420S = viewMo30747b6;
        this.f90436n.addView(viewMo30747b6);
        xdl0.m208329E0(this.f90439q, new View.OnClickListener() { // from class: l.ac00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68760a.m115639z0(view);
            }
        });
        final View viewMo30839yo = FeedModule.m60222H().mo30839yo(this.f90407F, new e30() { // from class: l.bc00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74894a.m115572A0((String) obj);
            }
        }, new d30() { // from class: l.cc00
            @Override // p149l.d30
            public final void call() {
                ec00.m115550c();
            }
        }, this.f90438p, false, this.f90420S);
        this.f90447y.addView(viewMo30839yo);
        if (NullChecker.m81303a(this.f90438p)) {
            this.f90438p.setFilters(new InputFilter[]{new m2h(180)});
        }
        this.f90441s.m64064b0(this.f90407F, new e30() { // from class: l.dc00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85358a.m115630q0(viewMo30839yo, (VImage) obj);
            }
        }, new e30() { // from class: l.ab00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68616a.m115631r0(viewMo30839yo, (VImage) obj);
            }
        }, new d30() { // from class: l.bb00
            @Override // p149l.d30
            public final void call() {
                this.f74753a.m115633t0();
            }
        });
        this.f90445w.m64064b0(this.f90407F, new e30() { // from class: l.cb00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80090a.m115634u0(viewMo30839yo, (VImage) obj);
            }
        }, new e30() { // from class: l.db00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85279a.m115635v0(viewMo30839yo, (VImage) obj);
            }
        }, new d30() { // from class: l.eb00
            @Override // p149l.d30
            public final void call() {
                this.f90282a.m115637x0();
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public void m115608Z0(int i) {
        this.f90428f.scrollToPosition(i);
    }

    /* JADX INFO: renamed from: a0 */
    public void m115609a0() {
        this.f90407F.duringCreated(MomentDetailAct.f42066h).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.yb00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197273a.m115573B0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final void m115574D0() {
        MomentMessage momentMessage;
        if (nkg.m159850G() && this.f90402A.m213760S0() && !this.f90443u.isSelected()) {
            ya00.f197098K.put(Long.valueOf(mqi0.m155944o()));
        }
        final String string = this.f90438p.getText().toString();
        if (nkg.m159850G() && this.f90402A.m213760S0()) {
            zvf0.m220399u("e_greet_together", "p_user_moment_interactions_details_view", vwb.m200311Y("moments_user_id", this.f90402A.f197124p), vwb.m200311Y("selection_situation", this.f90443u.isSelected() ? "1" : "0"));
        }
        this.f90408G = false;
        final boolean z = TextUtils.isEmpty(this.f90402A.f197122n) && ((momentMessage = this.f90402A.f197120l) == null || TextUtils.isEmpty(momentMessage.f56008id));
        this.f90402A.m213783x1(this.f90438p.getText().toString(), this.f90438p.getText().toString().trim(), new d30() { // from class: l.sb00
            @Override // p149l.d30
            public final void call() {
                this.f163490a.m115581K0(string, z);
            }
        });
        if (xdl0.m208349O0(this.f90447y) && this.f90447y.getLayoutParams().height != 0) {
            m115624k1(0);
        }
        this.f90407F.hideInput();
        this.f90438p.setHint(this.f90404C.getResources().getString(R$string.f39002X2));
        this.f90439q.setSelected(false);
        this.f90438p.setText((CharSequence) null);
    }

    /* JADX INFO: renamed from: b0 */
    public void m115611b0(Bundle bundle) {
        PhotoAlbumTopView photoAlbumTopView = (PhotoAlbumTopView) LayoutInflater.from(this.f90407F).inflate(o6c0.f142190f2, (ViewGroup) null, false);
        this.f90405D = photoAlbumTopView;
        FrameLayout frameLayout = (FrameLayout) photoAlbumTopView.getProfile_pic().getParent();
        if (NullChecker.m81304b(frameLayout)) {
            xdl0.m208358V(frameLayout, t100.m186890d(0.0f));
        }
        xdl0.m208359W(this.f90405D.getAttention(), t100.m186890d(4.0f));
        xdl0.m208360X((RelativeLayout) this.f90405D.findViewById(b5c0.f73533X0), t100.m186890d(0.0f));
        this.f90428f.getItemAnimator().setAddDuration(0L);
        this.f90428f.getItemAnimator().setChangeDuration(0L);
        this.f90428f.getItemAnimator().setMoveDuration(0L);
        this.f90428f.getItemAnimator().setRemoveDuration(0L);
        ((AbstractC0616v) this.f90428f.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: c0 */
    public void m115612c0() {
        this.f90440r.setOnClickListener(new View.OnClickListener() { // from class: l.ob00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142875a.m115577H0(view);
            }
        });
        this.f90402A.m213759R0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m115613d0() {
        this.f90408G = false;
        if (this.f90402A.f197127s) {
            m115597T();
        }
        if (sti.m185955a()) {
            m115584M(new d30() { // from class: l.tb00
                @Override // p149l.d30
                public final void call() {
                    this.f169198a.m115578I0();
                }
            });
        } else {
            m115553e0();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m115614d1(boolean z) {
        String string;
        if (xdl0.m208349O0(this.f90405D.getAttention()) && this.f90402A.m213754I0()) {
            String str = z ? "like_click" : "comment_send";
            p6j0.m167671e("e_follow_bubble_guide", "p_user_moment_interactions_details_view", j760.m140076a("trigger_time", str));
            xa70 xa70Var = this.f90412K;
            xa70Var.f191705q = str;
            this.f90405D.m64705E(xa70Var);
            String str2 = "他";
            if (NullChecker.m81303a(this.f90402A.f197113e)) {
                User userM209447e8 = FeedModule.f38855d.m209447e8(this.f90402A.f197113e.owner);
                if (NullChecker.m81303a(userM209447e8) && userM209447e8.isFemale()) {
                    str2 = "她";
                }
            }
            if (z) {
                string = "你刚刚赞了" + str2 + "的动态，对" + str2 + "感兴趣就关注" + str2 + "吧";
            } else {
                string = "你刚刚评论了" + str2 + "的动态，对" + str2 + "感兴趣就关注" + str2 + "吧";
            }
            if (nkg.m159854K()) {
                StringBuilder sb = z ? new StringBuilder("你刚刚赞了") : new StringBuilder("你刚刚评论了");
                sb.append(str2);
                sb.append("的动态，发送喜欢来表达心意吧");
                string = sb.toString();
            }
            this.f90411J = C4348d.m20896l().m20908t(new C4345a(this.f90407F).m20849D(string).m20870k(this.f90407F.getResources().getColor(e1c0.f88798n)).m20855J(13.0f).m20850E(true).m20861b(3000L).m20882x(t100.f167258g).m20875q(C4345a.f15680N | C4345a.f15682P).m20873o(C4345a.f15682P, t100.m186890d(6.0f)), this.f90405D.getAttention());
            this.f90402A.m213756L1();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m115615e1() {
        if (!this.f90415N || xdl0.m208349O0(this.f90442t)) {
            return;
        }
        zvf0.m220368A("e_greet_together", "p_user_moment_interactions_details_view", vwb.m200311Y("moments_user_id", this.f90402A.f197124p));
        xdl0.m208344M(this.f90442t, true);
    }

    /* JADX INFO: renamed from: f0 */
    public final j760<Boolean, String> m115616f0() {
        if (!nkg.m159915x0()) {
            return new j760<>(Boolean.FALSE, "");
        }
        ya00 ya00Var = this.f90402A;
        String str = ya00Var.f197121m;
        String str2 = ya00Var.f197124p;
        String strUserId = FeedModule.m60221F().userId();
        if (TextUtils.isEmpty(str)) {
            return !TextUtils.equals(strUserId, str2) ? new j760<>(Boolean.TRUE, str2) : new j760<>(Boolean.FALSE, "");
        }
        return TextUtils.equals(strUserId, str) ? new j760<>(Boolean.FALSE, "") : new j760<>(Boolean.TRUE, str);
    }

    /* JADX INFO: renamed from: f1 */
    public void m115617f1() {
        this.f90438p.requestFocus();
        this.f90407F.showInput(this.f90438p, 0);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m115618g0() {
        PhotoAlbumTopView photoAlbumTopView = this.f90405D;
        return photoAlbumTopView != null && xdl0.m208349O0(photoAlbumTopView);
    }

    /* JADX INFO: renamed from: h0 */
    public void m115619h0(j760<Boolean, Integer> j760Var) {
        if (this.f90416O) {
            this.f90416O = false;
            if (this.f90447y.getLayoutParams().height == 0 || this.f90447y.getVisibility() == 8) {
                this.f90439q.setSelected(false);
            }
            this.f90438p.setCursorVisible(false);
            if (this.f90414M) {
                this.f90414M = false;
                return;
            }
            m115582L(false, false);
            if (this.f90442t.getVisibility() == 0) {
                xdl0.m208344M(this.f90442t, false);
            }
            xdl0.m208325C0(this.f90430h, nkg.m159850G() ? t100.m186890d(38.0f) : 0);
            this.f90447y.setVisibility(4);
            m115546W();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m115620h1(final MomentMessage momentMessage, final String str) {
        this.f90408G = true;
        if (this.f90402A.f197127s) {
            m115597T();
        }
        if (sti.m185955a()) {
            m115584M(new d30() { // from class: l.pb00
                @Override // p149l.d30
                public final void call() {
                    this.f148020a.m115583L0(momentMessage, str);
                }
            });
        } else {
            m115558j1(momentMessage, str);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m115621i0(j760<Boolean, Integer> j760Var) {
        m115582L(true, false);
        if (nkg.m159850G() && this.f90402A.m213760S0()) {
            zvf0.m220368A("e_greet_together", "p_user_moment_interactions_details_view", vwb.m200311Y("moments_user_id", this.f90402A.f197124p));
            xdl0.m208344M(this.f90442t, true);
        }
        this.f90416O = true;
        xdl0.m208325C0(this.f90430h, j760Var.f116565b.intValue() + (nkg.m159850G() ? t100.m186890d(50.0f) : 0));
        this.f90439q.setSelected(false);
        e51.m114743H(this.f90407F, this.f90417P, 400L);
        if (this.f90447y.getLayoutParams().height == j760Var.f116565b.intValue()) {
            return;
        }
        this.f90418Q = true;
        m115624k1(j760Var.f116565b.intValue());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM115580K = m115580K(layoutInflater, viewGroup);
        viewM115580K.setBackgroundColor(this.f90404C.getResources().getColor(e1c0.f88803p0));
        this.f90404C.duringCreated(Act.keyboardListenerObservable(viewM115580K)).subscribe(this.f90413L);
        this.f90438p.setHintTextColor(this.f90404C.getResources().getColor(e1c0.f88804q));
        this.f90438p.setHint(getAct().getString(R$string.f38879D));
        if (sti.m185955a() || this.f90402A.f197125q) {
            this.f90409H = this.f90438p.getInputType();
            this.f90438p.setInputType(0);
        }
        this.f90438p.setOnTouchListener(new View.OnTouchListener() { // from class: l.vb00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f180801a.m115627n0(view, motionEvent);
            }
        });
        this.f90428f.setMaxHeight(xdl0.m208408w0());
        this.f90427e.setFirstRecyclerUserIntegerMaxHeight(false);
        this.f90428f.setOverScrollMode(2);
        if (nkg.m159918z()) {
            m115607Z();
        }
        xdl0.m208344M(this.f90439q, nkg.m159918z());
        if (!nkg.m159918z()) {
            this.f90440r.setBackground(null);
            this.f90440r.setTextColor(this.f90407F.getResources().getColorStateList(e1c0.f88755J));
        }
        if (nkg.m159850G()) {
            this.f90443u.setSelected(!this.f90402A.m213750F1());
            this.f90444v.setTextColor(this.f90443u.isSelected() ? Color.parseColor("#cc000000") : Color.parseColor("#33000000"));
            xdl0.m208329E0(this.f90443u, new View.OnClickListener() { // from class: l.xb00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191857a.m115628o0(view);
                }
            });
        }
        return viewM115580K;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m115622j0(View view) {
        m115587N0(true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m115623k0(CharSequence charSequence) {
        Editable text = this.f90438p.getText();
        boolean z = (text == null || text.toString().trim().isEmpty()) ? false : true;
        boolean zM159918z = nkg.m159918z();
        TextView textView = this.f90440r;
        if (zM159918z) {
            xdl0.m208344M(textView, z);
        } else {
            textView.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m115624k1(int i) {
        if (i == 0) {
            this.f90419R = ValueAnimator.ofInt(this.f90447y.getLayoutParams().height, 0);
        } else {
            this.f90419R = ValueAnimator.ofInt(0, i);
        }
        this.f90419R.setDuration(150L);
        this.f90419R.setInterpolator(new jig());
        this.f90419R.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.za00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f202321a.m115585M0(valueAnimator);
            }
        });
        this.f90419R.start();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m115626m0() {
        this.f90438p.setInputType(this.f90409H);
        m115545O();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ boolean m115627n0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ya00 ya00Var = this.f90402A;
            if (ya00Var.f197125q) {
                lsi0.m151578h(R$string.f39042d3);
                return false;
            }
            if (!ya00Var.f197127s && TextUtils.isEmpty(this.f90438p.getText())) {
                if (sti.m185955a()) {
                    m115584M(new d30() { // from class: l.fb00
                        @Override // p149l.d30
                        public final void call() {
                            this.f96687a.m115626m0();
                        }
                    });
                    return false;
                }
                m115545O();
            }
            if (!this.f90416O) {
                ya00 ya00Var2 = this.f90402A;
                j2i.m139462a(ya00Var2.f197113e, ya00Var2.f197118j);
            }
        }
        if (nkg.m159918z()) {
            this.f90438p.setCursorVisible(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m115628o0(View view) {
        VImage vImage = this.f90443u;
        vImage.setSelected(!vImage.isSelected());
        this.f90444v.setTextColor(this.f90443u.isSelected() ? Color.parseColor("#cc000000") : Color.parseColor("#33000000"));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m115629p0() {
        m115614d1(true);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m115630q0(View view, VImage vImage) {
        this.f90445w.setImageViewSelected(0);
        FeedModule.m60222H().mo30749c9(view, 1);
        this.f90439q.performClick();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m115631r0(View view, VImage vImage) {
        this.f90445w.setImageViewSelected(1);
        zvf0.m220396r("e_comment_gif", "p_user_moment_interactions_details_view");
        FeedModule.m60222H().mo30749c9(view, 2);
        this.f90439q.performClick();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m115632s0(Media media) {
        FeedModule.m60222H().mo30803p7(this.f90420S, null, media);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m115633t0() {
        zvf0.m220396r("e_comment_picture", "p_user_moment_interactions_details_view");
        this.f90441s.m64063a0(this.f90407F, new e30() { // from class: l.gb00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101786a.m115632s0((Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m115634u0(View view, VImage vImage) {
        if (vImage.isSelected()) {
            return;
        }
        this.f90445w.setImageViewSelected(vImage);
        if (this.f90447y.getVisibility() != 0 || this.f90447y.getLayoutParams().height == 0) {
            this.f90439q.performClick();
        }
        FeedModule.m60222H().mo30749c9(view, 1);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m115635v0(View view, VImage vImage) {
        if (vImage.isSelected()) {
            return;
        }
        zvf0.m220396r("e_comment_gif", "p_user_moment_interactions_details_view");
        this.f90445w.setImageViewSelected(vImage);
        if (this.f90447y.getVisibility() != 0 || this.f90447y.getLayoutParams().height == 0) {
            this.f90439q.performClick();
        }
        FeedModule.m60222H().mo30749c9(view, 2);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m115636w0(Media media) {
        if (this.f90422U) {
            this.f90422U = false;
            e51.m114744I(this.f90404C, new Runnable() { // from class: l.rb00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158573a.m115617f1();
                }
            }, 250L);
        }
        FeedModule.m60222H().mo30803p7(this.f90420S, null, media);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m115637x0() {
        zvf0.m220396r("e_comment_picture", "p_user_moment_interactions_details_view");
        this.f90422U = this.f90415N;
        this.f90445w.m64063a0(this.f90407F, new e30() { // from class: l.nb00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137995a.m115636w0((Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m115638y0(Boolean bool) {
        this.f90421T = bool.booleanValue();
        boolean zBooleanValue = bool.booleanValue();
        TextView textView = this.f90440r;
        if (zBooleanValue) {
            xdl0.m208344M(textView, true);
        } else {
            xdl0.m208344M(textView, !TextUtils.isEmpty(this.f90438p.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m115639z0(View view) {
        if (xdl0.m208349O0(this.f90439q) && this.f90439q.isSelected()) {
            return;
        }
        e51.m114745J(this.f90417P);
        this.f90439q.setSelected(true);
        if (this.f90447y.getVisibility() == 8 || this.f90447y.getLayoutParams().height == 0) {
            m115582L(true, false);
            if (nkg.m159850G() && this.f90402A.m213760S0()) {
                zvf0.m220368A("e_greet_together", "p_user_moment_interactions_details_view", vwb.m200311Y("moments_user_id", this.f90402A.f197124p));
                xdl0.m208344M(this.f90442t, true);
            }
            zvf0.m220396r("e_emoji_comment", "p_user_moment_interactions_details_view");
            xdl0.m208344M(this.f90447y, true);
            m115624k1(Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            xdl0.m208325C0(this.f90430h, Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) + (nkg.m159850G() ? t100.m186890d(50.0f) : 0));
        } else {
            this.f90414M = true;
        }
        xdl0.m208344M(this.f90447y, true);
        m115547X(this.f90407F, this.f90438p);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
