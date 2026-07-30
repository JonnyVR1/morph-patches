package p153l;

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
import androidx.recyclerview.widget.AbstractC0618v;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedWithTwoRecyclerNestedScrollView;
import com.p051p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class nk00 implements iam<hj00> {

    /* JADX INFO: renamed from: A */
    public hj00 f142374A;

    /* JADX INFO: renamed from: B */
    public hi00 f142375B;

    /* JADX INFO: renamed from: C */
    public MomentDetailFrag f142376C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumTopView f142377D;

    /* JADX INFO: renamed from: E */
    public ViewTreeObserver.OnGlobalLayoutListener f142378E;

    /* JADX INFO: renamed from: F */
    public Act f142379F;

    /* JADX INFO: renamed from: H */
    public int f142381H;

    /* JADX INFO: renamed from: I */
    public MomentVisibilityStatus f142382I;

    /* JADX INFO: renamed from: J */
    public String f142383J;

    /* JADX INFO: renamed from: K */
    public dj70 f142384K;

    /* JADX INFO: renamed from: O */
    public boolean f142388O;

    /* JADX INFO: renamed from: S */
    public View f142392S;

    /* JADX INFO: renamed from: T */
    public boolean f142393T;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f142395a;

    /* JADX INFO: renamed from: b */
    public View f142396b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f142397c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f142398d;

    /* JADX INFO: renamed from: e */
    public FeedWithTwoRecyclerNestedScrollView f142399e;

    /* JADX INFO: renamed from: f */
    public FeedMaxHeightRecyclerView f142400f;

    /* JADX INFO: renamed from: g */
    public CommonEmptyView f142401g;

    /* JADX INFO: renamed from: h */
    public View f142402h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f142403i;

    /* JADX INFO: renamed from: j */
    public View f142404j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f142405k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f142406l;

    /* JADX INFO: renamed from: m */
    public View f142407m;

    /* JADX INFO: renamed from: n */
    public VLinear f142408n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f142409o;

    /* JADX INFO: renamed from: p */
    public MessageInputEditView f142410p;

    /* JADX INFO: renamed from: q */
    public VImage f142411q;

    /* JADX INFO: renamed from: r */
    public TextView f142412r;

    /* JADX INFO: renamed from: s */
    public FeedItemCommendBotEmojiView f142413s;

    /* JADX INFO: renamed from: t */
    public VLinear f142414t;

    /* JADX INFO: renamed from: u */
    public VImage f142415u;

    /* JADX INFO: renamed from: v */
    public VText f142416v;

    /* JADX INFO: renamed from: w */
    public FeedItemCommendBotEmojiView f142417w;

    /* JADX INFO: renamed from: x */
    public View f142418x;

    /* JADX INFO: renamed from: y */
    public VLinear f142419y;

    /* JADX INFO: renamed from: z */
    public VImage f142420z;

    /* JADX INFO: renamed from: G */
    public boolean f142380G = false;

    /* JADX INFO: renamed from: L */
    public y20<Boolean> f142385L = new y20() { // from class: l.tj00
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f174521a.m163528J0((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: M */
    public boolean f142386M = false;

    /* JADX INFO: renamed from: N */
    public boolean f142387N = false;

    /* JADX INFO: renamed from: P */
    public Runnable f142389P = new RunnableC18890a();

    /* JADX INFO: renamed from: Q */
    public boolean f142390Q = false;

    /* JADX INFO: renamed from: R */
    public ValueAnimator f142391R = null;

    /* JADX INFO: renamed from: U */
    public boolean f142394U = false;

    /* JADX INFO: renamed from: l.nk00$a */
    public class RunnableC18890a implements Runnable {
        public RunnableC18890a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nk00.this.f142419y.setVisibility(4);
        }
    }

    public nk00(MomentDetailFrag momentDetailFrag) {
        this.f142376C = momentDetailFrag;
        this.f142379F = momentDetailFrag.act();
    }

    /* JADX INFO: renamed from: O */
    private void m163494O() {
        hj00 hj00Var = this.f142374A;
        hj00Var.f110132n = "";
        hj00Var.f110131m = null;
        hj00Var.f110130l = null;
    }

    /* JADX INFO: renamed from: W */
    private void m163495W() {
        if (!this.f142390Q && NullChecker.m82486a(this.f142391R)) {
            this.f142391R.cancel();
        }
        this.f142390Q = false;
        m163573k1(0);
    }

    /* JADX INFO: renamed from: X */
    public static void m163496X(Act act, View view) {
        ((InputMethodManager) act.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m163499c() {
    }

    /* JADX INFO: renamed from: e0 */
    private void m163502e0() {
        m163566f1();
        if (TextUtils.isEmpty(this.f142410p.getText().toString().trim())) {
            this.f142410p.setHint(getAct().getString(R$string.f39727D));
            hj00 hj00Var = this.f142374A;
            hj00Var.f110132n = "";
            hj00Var.f110131m = null;
            hj00Var.f110130l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public void m163574l0() {
        hj00 hj00Var = this.f142374A;
        if (hj00Var.f110123e == null) {
            return;
        }
        if (hj00Var.f110137s) {
            this.f142405k.setVisibility(0);
            return;
        }
        if (this.f142401g.getVisibility() == 0) {
            this.f142405k.setVisibility(4);
            return;
        }
        if (ksg.m151195b0(FeedModule.f39703d.m145688e8(this.f142374A.m135290O0().owner))) {
            this.f142405k.setVisibility(4);
            return;
        }
        boolean globalVisibleRect = this.f142400f.getGlobalVisibleRect(new Rect());
        LinearLayout linearLayout = this.f142405k;
        if (globalVisibleRect) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private void m163507j1(MomentMessage momentMessage, String str) {
        bnl0.m105500A(this.f142410p);
        this.f142379F.showInput(this.f142410p, 0);
        this.f142410p.setHint(this.f142374A.m135282E1(momentMessage, str));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m163521A0(String str) {
        if (this.f142410p.getText().toString().length() + str.length() > 180) {
            o1j0.m165636j("最多可输入180字");
            return;
        }
        this.f142374A.m135281D1(str);
        this.f142410p.getText().insert(this.f142410p.getSelectionStart(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m163522B0(pf60 pf60Var) {
        if (this.f142419y == null) {
            return;
        }
        this.f142387N = ((Boolean) pf60Var.f152156a).booleanValue();
        if (((Boolean) pf60Var.f152156a).booleanValue()) {
            m163570i0(pf60Var);
        } else {
            m163568h0(pf60Var);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f142379F;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m163524E0(Boolean bool) {
        if (bool.booleanValue()) {
            m163523D0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m163525G0(User user) {
        zzg.m222254f(getAct(), "p_fake_nearby_comments_popup", user, new x20() { // from class: l.dk00
            @Override // p153l.x20
            public final void call() {
                this.f88959a.m163523D0();
            }
        }, new y20() { // from class: l.fk00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99445a.m163524E0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m163526H0(View view) {
        pf60<Boolean, String> pf60VarM163565f0 = m163565f0();
        Boolean bool = pf60VarM163565f0.f152156a;
        if (bool == null || !bool.booleanValue()) {
            m163523D0();
            return;
        }
        final User userM145688e8 = !TextUtils.isEmpty(pf60VarM163565f0.f152157b) ? FeedModule.f39703d.m145688e8(pf60VarM163565f0.f152157b) : null;
        if (cmg.m111247z()) {
            l51.m152890J(this.f142389P);
            if (bnl0.m105529O0(this.f142419y) && this.f142419y.getLayoutParams().height != 0) {
                this.f142411q.setSelected(false);
                m163573k1(0);
                bnl0.m105505C0(this.f142402h, cmg.m111183K() ? qa00.m175859d(38.0f) : 0);
                if (this.f142414t.getVisibility() == 0) {
                    bnl0.m105524M(this.f142414t, false);
                }
            }
            if (this.f142387N) {
                m163495W();
                m163496X(this.f142379F, this.f142410p);
            }
        }
        l51.m152888H(this.f142379F, new Runnable() { // from class: l.zj00
            @Override // java.lang.Runnable
            public final void run() {
                this.f204634a.m163525G0(userM145688e8);
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m163527I0() {
        this.f142410p.setInputType(this.f142381H);
        m163502e0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m163528J0(Boolean bool) {
        if (bool.booleanValue() && NullChecker.m82486a(this.f142374A.f110123e)) {
            m163546T();
        }
        hj00 hj00Var = this.f142374A;
        if (hj00Var.f110139u) {
            hj00Var.f110137s = bool.booleanValue();
            boolean zBooleanValue = bool.booleanValue();
            MessageInputEditView messageInputEditView = this.f142410p;
            if (zBooleanValue) {
                messageInputEditView.requestFocus();
            } else {
                messageInputEditView.setHint(getAct().getString(R$string.f39727D));
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public View m163529K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ok00.m167974b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m163530K0(String str, boolean z) {
        m163531L(false, false);
        if (cmg.m111179G() && this.f142374A.m135293S0() && this.f142415u.isSelected()) {
            hj00 hj00Var = this.f142374A;
            hj00Var.m135280C1(this.f142379F, str, hj00Var.f110134p, hj00Var.f110133o);
        }
        m163557Z0(this.f142375B.m135086l0(this.f142374A.f110130l));
        if (z) {
            m163563d1(false);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m163531L(boolean z, boolean z2) {
        bnl0.m105524M(this.f142396b, z);
        bnl0.m105524M(this.f142404j, z);
        bnl0.m105505C0(this.f142418x, qa00.m175859d(((!z && (this.f142419y.getVisibility() == 4 || this.f142419y.getVisibility() == 8)) || z2) ? 33.0f : 11.0f));
        this.f142379F.setStatusBarColor(Color.parseColor(z ? "#4D000000" : "#ffffff"));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m163532L0(MomentMessage momentMessage, String str) {
        this.f142410p.setInputType(this.f142381H);
        m163507j1(momentMessage, str);
    }

    /* JADX INFO: renamed from: M */
    public final void m163533M(x20 x20Var) {
        k3h.m148057P0(this.f142379F, new x20() { // from class: l.qj00
            @Override // p153l.x20
            public final void call() {
                o1j0.m165649w(R$string.f39761I3);
            }
        }, false, x20Var, l3h.f129877c);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m163534M0(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this.f142419y, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hj00 hj00Var) {
        this.f142374A = hj00Var;
    }

    /* JADX INFO: renamed from: N0 */
    public void m163536N0(boolean z) {
        if (cmg.m111247z()) {
            m163531L(false, true);
            l51.m152890J(this.f142389P);
            if (bnl0.m105529O0(this.f142419y) && this.f142419y.getLayoutParams().height != 0) {
                this.f142411q.setSelected(false);
                m163573k1(0);
                bnl0.m105505C0(this.f142402h, cmg.m111179G() ? qa00.m175859d(38.0f) : 0);
                if (this.f142414t.getVisibility() == 0) {
                    bnl0.m105524M(this.f142414t, false);
                    return;
                }
                return;
            }
            if (this.f142387N) {
                if (z) {
                    m163495W();
                    m163496X(this.f142379F, this.f142410p);
                    return;
                }
                return;
            }
        }
        if (NullChecker.m82486a(getAct())) {
            getAct().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m163537O0(List<MomentMessage> list) {
        boolean z = this.f142374A.f110135q;
        hi00 hi00Var = this.f142375B;
        if (z) {
            hi00Var.mo115865d0(new ArrayList());
        } else {
            hi00Var.mo115865d0(list);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m163538P() {
        this.f142395a.setLeftIconResource(abc0.f69506n);
        this.f142395a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163407a.m163571j0(view);
            }
        });
        this.f142405k.setVisibility(4);
        this.f142395a.setTitleView(this.f142377D);
        bnl0.m105539W(this.f142395a.getLeftIconContainer(), 0);
        if (NullChecker.m82487b(this.f142410p)) {
            this.f142376C.duringCreated(this.f142410p.mo29617i(true)).subscribe(psd0.m173596G(new y20() { // from class: l.sj00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f168890a.m163572k0((CharSequence) obj);
                }
            }));
        }
        this.f142401g.f41669b.setText(getAct().getString(R$string.f39898e4));
        this.f142401g.f41668a.setImageResource(lbc0.f131053h6);
        bnl0.m105540X(this.f142401g.f41668a, qa00.m175859d(230.0f));
        if (this.f142378E == null) {
            this.f142378E = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.uj00
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f179168a.m163574l0();
                }
            };
            this.f142405k.getViewTreeObserver().addOnGlobalLayoutListener(this.f142378E);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m163539P0(List<MomentMessage> list, List<StickerInfo> list2) {
        if (!jyb.m147479J(list2)) {
            this.f142375B.f88579d.clear();
            this.f142375B.f88579d.addAll(list2);
        }
        m163537O0(list);
    }

    /* JADX INFO: renamed from: Q */
    public void m163540Q() {
        this.f142412r.setOnClickListener(null);
        this.f142410p.setOnTouchListener(null);
        this.f142405k.getViewTreeObserver().removeOnGlobalLayoutListener(this.f142378E);
        this.f142378E = null;
        this.f142385L = null;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m163541Q0(Links links) {
        this.f142375B.f109964p = links;
    }

    /* JADX INFO: renamed from: R */
    public void m163542R(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f142375B.f88580e.get(momentMessage.commentInfo.parentMessageId);
        if (NullChecker.m82486a(list) && list.contains(momentMessage)) {
            list.remove(momentMessage);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m163543R0(Moment moment) {
        this.f142375B.f109967s = moment;
    }

    /* JADX INFO: renamed from: S */
    public final void m163544S() {
        if (ksg.m151189X(this.f142374A.f110123e)) {
            i4g0.m138492A("e_moment_voice", "p_user_moment_interactions_details_view", jyb.m147494Y("owner_id", this.f142374A.f110123e.owner), jyb.m147494Y("moment_id", this.f142374A.f110123e.f56859id), jyb.m147494Y("resource", ""));
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m163545S0(MomentMessage momentMessage) {
        this.f142375B.mo115866e0(momentMessage);
    }

    /* JADX INFO: renamed from: T */
    public final void m163546T() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("moment_id", this.f142374A.f110123e.f56859id));
        arrayList.add(pf60.m172085a("owner_id", this.f142374A.f110123e.owner));
        er60.m122104w();
        arrayList.add(pf60.m172085a("moment_showfrom", er60.m122103D(this.f142374A.f110128j)));
        arrayList.add(pf60.m172085a("moment_type", er60.m122104w().m122135y(this.f142374A.f110123e)));
        arrayList.add(pf60.m172085a("comment_detail", this.f142380G ? SysnotifListener.ACTION_REPLY : "comment"));
        arrayList.add(pf60.m172085a("moment_distance", Long.valueOf(ksg.m151166G(this.f142374A.f110123e))));
        arrayList.add(pf60.m172085a("moment_create_time", Long.valueOf(ksg.m151164F(this.f142374A.f110123e))));
        arrayList.add(pf60.m172085a("owner_active_time", Long.valueOf(ksg.m151184S(FeedModule.f39703d.m145688e8(this.f142374A.f110134p)))));
        tfj0.m190940c("e_comment", "p_user_moment_interactions_details_view", (pf60[]) arrayList.toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: T0 */
    public void m163547T0() {
        Moment momentM135290O0 = this.f142374A.m135290O0();
        if (momentM135290O0 == null) {
            return;
        }
        hi00 hi00Var = this.f142375B;
        hi00Var.f109967s = momentM135290O0;
        hi00Var.notifyItemChanged(0);
        if (TEnum.equals(momentM135290O0.settings.visibility, this.f142382I)) {
            return;
        }
        hj00 hj00Var = this.f142374A;
        hj00Var.f110123e = momentM135290O0;
        m163553X0(hj00Var.f110122d, hj00Var.f110128j);
    }

    /* JADX INFO: renamed from: U */
    public List<MomentMessage> m163548U(String str) {
        return this.f142375B.m115855S(str);
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m163549U0(bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>> bkj0Var) {
        if (bkj0Var.f77081a == null) {
            this.f142379F.lambda$debugItems$19();
            return false;
        }
        bnl0.m105525M0(this.f142405k, true);
        bnl0.m105525M0(this.f142400f, true);
        bnl0.m105525M0(this.f142401g, false);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public void m163550V() {
        if (TextUtils.isEmpty(this.f142383J)) {
            return;
        }
        C4499d.m21895l().m21899k(this.f142383J);
        this.f142383J = null;
    }

    /* JADX INFO: renamed from: V0 */
    public void m163551V0(Throwable th) {
        if (bnl0.m105529O0(this.f142401g)) {
            return;
        }
        bnl0.m105525M0(this.f142405k, false);
        boolean z = th instanceof ApiExcep.Client.Forbidden;
        if (z || (th instanceof ApiExcep.Client.NotFound)) {
            if (z && ((TantanException.Client.TantanForbidden) th).code == 40314) {
                o1j0.m165649w(R$string.f39874b1);
                getAct().lambda$debugItems$19();
            } else if (NullChecker.m82486a(this.f142374A.m135290O0()) && NullChecker.m82486a(this.f142374A.m135290O0().owner) && !ksg.m151195b0(FeedModule.f39703d.m145688e8(this.f142374A.m135290O0().owner))) {
                bnl0.m105525M0(this.f142401g, true);
                bnl0.m105525M0(this.f142398d, false);
                bnl0.m105524M(this.f142400f, false);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m163552W0(boolean z) {
        bnl0.m105525M0(this.f142420z, z);
    }

    /* JADX INFO: renamed from: X0 */
    public void m163553X0(n570 n570Var, String str) {
        Moment moment = this.f142374A.f110123e;
        if (moment == null) {
            return;
        }
        this.f142382I = moment.settings.visibility;
        dj70.C16548a c16548aM116064h = dj70.C16548a.m116057a().m116060d(this.f142379F).m116067k(this.f142374A.f110123e).m116065i(false).m116066j(this.f142374A.f110142x).m116064h(true);
        if (!TextUtils.isEmpty(this.f142374A.f110129k)) {
            str = this.f142374A.f110129k;
        }
        dj70 dj70VarM116058b = c16548aM116064h.m116063g(str).m116061e(n570Var).m116068l(null).m116062f(this.f142374A.f110124f).m116058b();
        this.f142384K = dj70VarM116058b;
        User user = dj70VarM116058b.f88796f;
        if (NullChecker.m82486a(user) && user.needShowFrame() && !TextUtils.isEmpty(user.headFrameUrl())) {
            VLinear vLinear = (VLinear) this.f142395a.getTitleContainer().getParent();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = qa00.m175859d(4.0f);
            vLinear.setLayoutParams(layoutParams);
        } else if (NullChecker.m82486a(user) && NullChecker.m82486a(user.profile)) {
            List<Double> list = user.profile.extensions.headFrame.expiredTime;
            if (!jyb.m147479J(list) && list.get(0).doubleValue() > pzi0.m174454o() && !jyb.m147479J(user.profile.extensions.headFrame.url)) {
                VLinear vLinear2 = (VLinear) this.f142395a.getTitleContainer().getParent();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.topMargin = qa00.m175859d(4.0f);
                vLinear2.setLayoutParams(layoutParams2);
            }
        }
        this.f142377D.m65888E(this.f142384K);
    }

    /* JADX INFO: renamed from: Y */
    public void m163554Y(n570 n570Var) {
        hj00 hj00Var = this.f142374A;
        hi00 hi00Var = new hi00(hj00Var.f110135q, this.f142379F, n570Var, hj00Var.f110123e, hj00Var.f110134p, hj00Var.f110128j, this.f142376C, this, hj00Var, new x20() { // from class: l.vj00
            @Override // p153l.x20
            public final void call() {
                this.f184335a.m163578p0();
            }
        });
        this.f142375B = hi00Var;
        this.f142400f.setAdapter(hi00Var);
        if (this.f142374A.f110135q) {
            this.f142375B.mo115865d0(new ArrayList());
        }
        m163544S();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m163555Y0(int i) {
        if (this.f142399e.canScrollVertically(i)) {
            this.f142399e.scrollBy(0, i);
        } else if (this.f142400f.canScrollVertically(i)) {
            this.f142400f.scrollBy(0, i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m163556Z() {
        this.f142408n.removeAllViews();
        View viewMo31750b6 = FeedModule.m61406H().mo31750b6(this.f142379F, this.f142410p, true, new y20() { // from class: l.ik00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115316a.m163587y0((Boolean) obj);
            }
        }, false);
        this.f142392S = viewMo31750b6;
        this.f142408n.addView(viewMo31750b6);
        bnl0.m105509E0(this.f142411q, new View.OnClickListener() { // from class: l.jk00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121258a.m163588z0(view);
            }
        });
        final View viewMo31842yo = FeedModule.m61406H().mo31842yo(this.f142379F, new y20() { // from class: l.kk00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127158a.m163521A0((String) obj);
            }
        }, new x20() { // from class: l.lk00
            @Override // p153l.x20
            public final void call() {
                nk00.m163499c();
            }
        }, this.f142410p, false, this.f142392S);
        this.f142419y.addView(viewMo31842yo);
        if (NullChecker.m82486a(this.f142410p)) {
            this.f142410p.setFilters(new InputFilter[]{new b4h(180)});
        }
        this.f142413s.m65247b0(this.f142379F, new y20() { // from class: l.mk00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137190a.m163579q0(viewMo31842yo, (VImage) obj);
            }
        }, new y20() { // from class: l.jj00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121131a.m163580r0(viewMo31842yo, (VImage) obj);
            }
        }, new x20() { // from class: l.kj00
            @Override // p153l.x20
            public final void call() {
                this.f127058a.m163582t0();
            }
        });
        this.f142417w.m65247b0(this.f142379F, new y20() { // from class: l.lj00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132288a.m163583u0(viewMo31842yo, (VImage) obj);
            }
        }, new y20() { // from class: l.mj00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137046a.m163584v0(viewMo31842yo, (VImage) obj);
            }
        }, new x20() { // from class: l.nj00
            @Override // p153l.x20
            public final void call() {
                this.f142254a.m163586x0();
            }
        });
    }

    /* JADX INFO: renamed from: Z0 */
    public void m163557Z0(int i) {
        this.f142400f.scrollToPosition(i);
    }

    /* JADX INFO: renamed from: a0 */
    public void m163558a0() {
        this.f142379F.duringCreated(MomentDetailAct.f42914h).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.hk00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110359a.m163522B0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final void m163523D0() {
        MomentMessage momentMessage;
        if (cmg.m111179G() && this.f142374A.m135293S0() && !this.f142415u.isSelected()) {
            hj00.f110108K.put(Long.valueOf(pzi0.m174454o()));
        }
        final String string = this.f142410p.getText().toString();
        if (cmg.m111179G() && this.f142374A.m135293S0()) {
            i4g0.m138523u("e_greet_together", "p_user_moment_interactions_details_view", jyb.m147494Y("moments_user_id", this.f142374A.f110134p), jyb.m147494Y("selection_situation", this.f142415u.isSelected() ? "1" : "0"));
        }
        this.f142380G = false;
        final boolean z = TextUtils.isEmpty(this.f142374A.f110132n) && ((momentMessage = this.f142374A.f110130l) == null || TextUtils.isEmpty(momentMessage.f56856id));
        this.f142374A.m135316x1(this.f142410p.getText().toString(), this.f142410p.getText().toString().trim(), new x20() { // from class: l.bk00
            @Override // p153l.x20
            public final void call() {
                this.f77033a.m163530K0(string, z);
            }
        });
        if (bnl0.m105529O0(this.f142419y) && this.f142419y.getLayoutParams().height != 0) {
            m163573k1(0);
        }
        this.f142379F.hideInput();
        this.f142410p.setHint(this.f142376C.getResources().getString(R$string.f39850X2));
        this.f142411q.setSelected(false);
        this.f142410p.setText((CharSequence) null);
    }

    /* JADX INFO: renamed from: b0 */
    public void m163560b0(Bundle bundle) {
        PhotoAlbumTopView photoAlbumTopView = (PhotoAlbumTopView) LayoutInflater.from(this.f142379F).inflate(tec0.f173659f2, (ViewGroup) null, false);
        this.f142377D = photoAlbumTopView;
        FrameLayout frameLayout = (FrameLayout) photoAlbumTopView.getProfile_pic().getParent();
        if (NullChecker.m82487b(frameLayout)) {
            bnl0.m105538V(frameLayout, qa00.m175859d(0.0f));
        }
        bnl0.m105539W(this.f142377D.getAttention(), qa00.m175859d(4.0f));
        bnl0.m105540X((RelativeLayout) this.f142377D.findViewById(hdc0.f108886X0), qa00.m175859d(0.0f));
        this.f142400f.getItemAnimator().setAddDuration(0L);
        this.f142400f.getItemAnimator().setChangeDuration(0L);
        this.f142400f.getItemAnimator().setMoveDuration(0L);
        this.f142400f.getItemAnimator().setRemoveDuration(0L);
        ((AbstractC0618v) this.f142400f.getItemAnimator()).setSupportsChangeAnimations(false);
    }

    /* JADX INFO: renamed from: c0 */
    public void m163561c0() {
        this.f142412r.setOnClickListener(new View.OnClickListener() { // from class: l.xj00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194530a.m163526H0(view);
            }
        });
        this.f142374A.m135292R0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m163562d0() {
        this.f142380G = false;
        if (this.f142374A.f110137s) {
            m163546T();
        }
        if (owi.m169565a()) {
            m163533M(new x20() { // from class: l.ck00
                @Override // p153l.x20
                public final void call() {
                    this.f82252a.m163527I0();
                }
            });
        } else {
            m163502e0();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m163563d1(boolean z) {
        String string;
        if (bnl0.m105529O0(this.f142377D.getAttention()) && this.f142374A.m135287I0()) {
            String str = z ? "like_click" : "comment_send";
            tfj0.m190942e("e_follow_bubble_guide", "p_user_moment_interactions_details_view", pf60.m172085a("trigger_time", str));
            dj70 dj70Var = this.f142384K;
            dj70Var.f88807q = str;
            this.f142377D.m65888E(dj70Var);
            String str2 = "他";
            if (NullChecker.m82486a(this.f142374A.f110123e)) {
                User userM145688e8 = FeedModule.f39703d.m145688e8(this.f142374A.f110123e.owner);
                if (NullChecker.m82486a(userM145688e8) && userM145688e8.isFemale()) {
                    str2 = "她";
                }
            }
            if (z) {
                string = "你刚刚赞了" + str2 + "的动态，对" + str2 + "感兴趣就关注" + str2 + "吧";
            } else {
                string = "你刚刚评论了" + str2 + "的动态，对" + str2 + "感兴趣就关注" + str2 + "吧";
            }
            if (cmg.m111183K()) {
                StringBuilder sb = z ? new StringBuilder("你刚刚赞了") : new StringBuilder("你刚刚评论了");
                sb.append(str2);
                sb.append("的动态，发送喜欢来表达心意吧");
                string = sb.toString();
            }
            this.f142383J = C4499d.m21895l().m21907t(new C4496a(this.f142379F).m21848D(string).m21869k(this.f142379F.getResources().getColor(k9c0.f124521n)).m21854J(13.0f).m21849E(true).m21860b(3000L).m21881x(qa00.f156320g).m21874q(C4496a.f16399N | C4496a.f16401P).m21872o(C4496a.f16401P, qa00.m175859d(6.0f)), this.f142377D.getAttention());
            this.f142374A.m135289L1();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m163564e1() {
        if (!this.f142387N || bnl0.m105529O0(this.f142414t)) {
            return;
        }
        i4g0.m138492A("e_greet_together", "p_user_moment_interactions_details_view", jyb.m147494Y("moments_user_id", this.f142374A.f110134p));
        bnl0.m105524M(this.f142414t, true);
    }

    /* JADX INFO: renamed from: f0 */
    public final pf60<Boolean, String> m163565f0() {
        if (!cmg.m111244x0()) {
            return new pf60<>(Boolean.FALSE, "");
        }
        hj00 hj00Var = this.f142374A;
        String str = hj00Var.f110131m;
        String str2 = hj00Var.f110134p;
        String strUserId = FeedModule.m61405F().userId();
        if (TextUtils.isEmpty(str)) {
            return !TextUtils.equals(strUserId, str2) ? new pf60<>(Boolean.TRUE, str2) : new pf60<>(Boolean.FALSE, "");
        }
        return TextUtils.equals(strUserId, str) ? new pf60<>(Boolean.FALSE, "") : new pf60<>(Boolean.TRUE, str);
    }

    /* JADX INFO: renamed from: f1 */
    public void m163566f1() {
        this.f142410p.requestFocus();
        this.f142379F.showInput(this.f142410p, 0);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m163567g0() {
        PhotoAlbumTopView photoAlbumTopView = this.f142377D;
        return photoAlbumTopView != null && bnl0.m105529O0(photoAlbumTopView);
    }

    /* JADX INFO: renamed from: h0 */
    public void m163568h0(pf60<Boolean, Integer> pf60Var) {
        if (this.f142388O) {
            this.f142388O = false;
            if (this.f142419y.getLayoutParams().height == 0 || this.f142419y.getVisibility() == 8) {
                this.f142411q.setSelected(false);
            }
            this.f142410p.setCursorVisible(false);
            if (this.f142386M) {
                this.f142386M = false;
                return;
            }
            m163531L(false, false);
            if (this.f142414t.getVisibility() == 0) {
                bnl0.m105524M(this.f142414t, false);
            }
            bnl0.m105505C0(this.f142402h, cmg.m111179G() ? qa00.m175859d(38.0f) : 0);
            this.f142419y.setVisibility(4);
            m163495W();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m163569h1(final MomentMessage momentMessage, final String str) {
        this.f142380G = true;
        if (this.f142374A.f110137s) {
            m163546T();
        }
        if (owi.m169565a()) {
            m163533M(new x20() { // from class: l.yj00
                @Override // p153l.x20
                public final void call() {
                    this.f200259a.m163532L0(momentMessage, str);
                }
            });
        } else {
            m163507j1(momentMessage, str);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m163570i0(pf60<Boolean, Integer> pf60Var) {
        m163531L(true, false);
        if (cmg.m111179G() && this.f142374A.m135293S0()) {
            i4g0.m138492A("e_greet_together", "p_user_moment_interactions_details_view", jyb.m147494Y("moments_user_id", this.f142374A.f110134p));
            bnl0.m105524M(this.f142414t, true);
        }
        this.f142388O = true;
        bnl0.m105505C0(this.f142402h, pf60Var.f152157b.intValue() + (cmg.m111179G() ? qa00.m175859d(50.0f) : 0));
        this.f142411q.setSelected(false);
        l51.m152888H(this.f142379F, this.f142389P, 400L);
        if (this.f142419y.getLayoutParams().height == pf60Var.f152157b.intValue()) {
            return;
        }
        this.f142390Q = true;
        m163573k1(pf60Var.f152157b.intValue());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM163529K = m163529K(layoutInflater, viewGroup);
        viewM163529K.setBackgroundColor(this.f142376C.getResources().getColor(k9c0.f124526p0));
        this.f142376C.duringCreated(Act.keyboardListenerObservable(viewM163529K)).subscribe(this.f142385L);
        this.f142410p.setHintTextColor(this.f142376C.getResources().getColor(k9c0.f124527q));
        this.f142410p.setHint(getAct().getString(R$string.f39727D));
        if (owi.m169565a() || this.f142374A.f110135q) {
            this.f142381H = this.f142410p.getInputType();
            this.f142410p.setInputType(0);
        }
        this.f142410p.setOnTouchListener(new View.OnTouchListener() { // from class: l.ek00
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f94336a.m163576n0(view, motionEvent);
            }
        });
        this.f142400f.setMaxHeight(bnl0.m105588w0());
        this.f142399e.setFirstRecyclerUserIntegerMaxHeight(false);
        this.f142400f.setOverScrollMode(2);
        if (cmg.m111247z()) {
            m163556Z();
        }
        bnl0.m105524M(this.f142411q, cmg.m111247z());
        if (!cmg.m111247z()) {
            this.f142412r.setBackground(null);
            this.f142412r.setTextColor(this.f142379F.getResources().getColorStateList(k9c0.f124478J));
        }
        if (cmg.m111179G()) {
            this.f142415u.setSelected(!this.f142374A.m135283F1());
            this.f142416v.setTextColor(this.f142415u.isSelected() ? Color.parseColor("#cc000000") : Color.parseColor("#33000000"));
            bnl0.m105509E0(this.f142415u, new View.OnClickListener() { // from class: l.gk00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104697a.m163577o0(view);
                }
            });
        }
        return viewM163529K;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m163571j0(View view) {
        m163536N0(true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m163572k0(CharSequence charSequence) {
        Editable text = this.f142410p.getText();
        boolean z = (text == null || text.toString().trim().isEmpty()) ? false : true;
        boolean zM111247z = cmg.m111247z();
        TextView textView = this.f142412r;
        if (zM111247z) {
            bnl0.m105524M(textView, z);
        } else {
            textView.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m163573k1(int i) {
        if (i == 0) {
            this.f142391R = ValueAnimator.ofInt(this.f142419y.getLayoutParams().height, 0);
        } else {
            this.f142391R = ValueAnimator.ofInt(0, i);
        }
        this.f142391R.setDuration(150L);
        this.f142391R.setInterpolator(new xjg());
        this.f142391R.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ij00
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f115162a.m163534M0(valueAnimator);
            }
        });
        this.f142391R.start();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m163575m0() {
        this.f142410p.setInputType(this.f142381H);
        m163494O();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ boolean m163576n0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            hj00 hj00Var = this.f142374A;
            if (hj00Var.f110135q) {
                o1j0.m165634h(R$string.f39890d3);
                return false;
            }
            if (!hj00Var.f110137s && TextUtils.isEmpty(this.f142410p.getText())) {
                if (owi.m169565a()) {
                    m163533M(new x20() { // from class: l.oj00
                        @Override // p153l.x20
                        public final void call() {
                            this.f147597a.m163575m0();
                        }
                    });
                    return false;
                }
                m163494O();
            }
            if (!this.f142388O) {
                hj00 hj00Var2 = this.f142374A;
                y3i.m214147a(hj00Var2.f110123e, hj00Var2.f110128j);
            }
        }
        if (cmg.m111247z()) {
            this.f142410p.setCursorVisible(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m163577o0(View view) {
        VImage vImage = this.f142415u;
        vImage.setSelected(!vImage.isSelected());
        this.f142416v.setTextColor(this.f142415u.isSelected() ? Color.parseColor("#cc000000") : Color.parseColor("#33000000"));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m163578p0() {
        m163563d1(true);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m163579q0(View view, VImage vImage) {
        this.f142417w.setImageViewSelected(0);
        FeedModule.m61406H().mo31752c9(view, 1);
        this.f142411q.performClick();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m163580r0(View view, VImage vImage) {
        this.f142417w.setImageViewSelected(1);
        i4g0.m138520r("e_comment_gif", "p_user_moment_interactions_details_view");
        FeedModule.m61406H().mo31752c9(view, 2);
        this.f142411q.performClick();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m163581s0(Media media) {
        FeedModule.m61406H().mo31806p7(this.f142392S, null, media);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m163582t0() {
        i4g0.m138520r("e_comment_picture", "p_user_moment_interactions_details_view");
        this.f142413s.m65246a0(this.f142379F, new y20() { // from class: l.pj00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152643a.m163581s0((Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m163583u0(View view, VImage vImage) {
        if (vImage.isSelected()) {
            return;
        }
        this.f142417w.setImageViewSelected(vImage);
        if (this.f142419y.getVisibility() != 0 || this.f142419y.getLayoutParams().height == 0) {
            this.f142411q.performClick();
        }
        FeedModule.m61406H().mo31752c9(view, 1);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m163584v0(View view, VImage vImage) {
        if (vImage.isSelected()) {
            return;
        }
        i4g0.m138520r("e_comment_gif", "p_user_moment_interactions_details_view");
        this.f142417w.setImageViewSelected(vImage);
        if (this.f142419y.getVisibility() != 0 || this.f142419y.getLayoutParams().height == 0) {
            this.f142411q.performClick();
        }
        FeedModule.m61406H().mo31752c9(view, 2);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m163585w0(Media media) {
        if (this.f142394U) {
            this.f142394U = false;
            l51.m152889I(this.f142376C, new Runnable() { // from class: l.ak00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71927a.m163566f1();
                }
            }, 250L);
        }
        FeedModule.m61406H().mo31806p7(this.f142392S, null, media);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m163586x0() {
        i4g0.m138520r("e_comment_picture", "p_user_moment_interactions_details_view");
        this.f142394U = this.f142387N;
        this.f142417w.m65246a0(this.f142379F, new y20() { // from class: l.wj00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189406a.m163585w0((Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m163587y0(Boolean bool) {
        this.f142393T = bool.booleanValue();
        boolean zBooleanValue = bool.booleanValue();
        TextView textView = this.f142412r;
        if (zBooleanValue) {
            bnl0.m105524M(textView, true);
        } else {
            bnl0.m105524M(textView, !TextUtils.isEmpty(this.f142410p.getText().toString()));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m163588z0(View view) {
        if (bnl0.m105529O0(this.f142411q) && this.f142411q.isSelected()) {
            return;
        }
        l51.m152890J(this.f142389P);
        this.f142411q.setSelected(true);
        if (this.f142419y.getVisibility() == 8 || this.f142419y.getLayoutParams().height == 0) {
            m163531L(true, false);
            if (cmg.m111179G() && this.f142374A.m135293S0()) {
                i4g0.m138492A("e_greet_together", "p_user_moment_interactions_details_view", jyb.m147494Y("moments_user_id", this.f142374A.f110134p));
                bnl0.m105524M(this.f142414t, true);
            }
            i4g0.m138520r("e_emoji_comment", "p_user_moment_interactions_details_view");
            bnl0.m105524M(this.f142419y, true);
            m163573k1(Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()));
            bnl0.m105505C0(this.f142402h, Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) + (cmg.m111179G() ? qa00.m175859d(50.0f) : 0));
        } else {
            this.f142386M = true;
        }
        bnl0.m105524M(this.f142419y, true);
        m163496X(this.f142379F, this.f142410p);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
