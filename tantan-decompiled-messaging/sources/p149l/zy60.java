package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedInsertCommentView;
import com.p046p1.mobile.putong.feed.newui.view.FeedAutoScrollTextView;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class zy60 extends AbstractC20577v4 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f205615A;

    /* JADX INFO: renamed from: B */
    public FeedAutoScrollTextView f205616B;

    /* JADX INFO: renamed from: C */
    public SVGAnimationView f205617C;

    /* JADX INFO: renamed from: D */
    public VLinear f205618D;

    /* JADX INFO: renamed from: E */
    public VImage f205619E;

    /* JADX INFO: renamed from: F */
    public TextView f205620F;

    /* JADX INFO: renamed from: G */
    public VLinear f205621G;

    /* JADX INFO: renamed from: H */
    public VImage f205622H;

    /* JADX INFO: renamed from: I */
    public TextView f205623I;

    /* JADX INFO: renamed from: J */
    public VText f205624J;

    /* JADX INFO: renamed from: K */
    public VText f205625K;

    /* JADX INFO: renamed from: L */
    public ImageView f205626L;

    /* JADX INFO: renamed from: M */
    public VText f205627M;

    /* JADX INFO: renamed from: N */
    public ConstraintLayout f205628N;

    /* JADX INFO: renamed from: O */
    public VDraweeView f205629O;

    /* JADX INFO: renamed from: P */
    public VText f205630P;

    /* JADX INFO: renamed from: Q */
    public VImage f205631Q;

    /* JADX INFO: renamed from: R */
    public VText f205632R;

    /* JADX INFO: renamed from: S */
    public VLinear f205633S;

    /* JADX INFO: renamed from: T */
    public VText f205634T;

    /* JADX INFO: renamed from: U */
    public VDraweeView f205635U;

    /* JADX INFO: renamed from: V */
    public ImageView f205636V;

    /* JADX INFO: renamed from: W */
    public View f205637W;

    /* JADX INFO: renamed from: X */
    public FeedInsertCommentView f205638X;

    /* JADX INFO: renamed from: a */
    public PhotoAlbumBottomView f205639a;

    /* JADX INFO: renamed from: b */
    public VLinear f205640b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f205641c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f205642d;

    /* JADX INFO: renamed from: e */
    public VText f205643e;

    /* JADX INFO: renamed from: f */
    public VText f205644f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f205645g;

    /* JADX INFO: renamed from: h */
    public VLinear f205646h;

    /* JADX INFO: renamed from: i */
    public VText f205647i;

    /* JADX INFO: renamed from: j */
    public VText f205648j;

    /* JADX INFO: renamed from: k */
    public VText f205649k;

    /* JADX INFO: renamed from: l */
    public VText f205650l;

    /* JADX INFO: renamed from: m */
    public VText f205651m;

    /* JADX INFO: renamed from: n */
    public VText f205652n;

    /* JADX INFO: renamed from: o */
    public VLinear f205653o;

    /* JADX INFO: renamed from: p */
    public FeedUserHeaderView f205654p;

    /* JADX INFO: renamed from: q */
    public VText f205655q;

    /* JADX INFO: renamed from: r */
    public VImage f205656r;

    /* JADX INFO: renamed from: s */
    public VText f205657s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f205658t;

    /* JADX INFO: renamed from: u */
    public VText f205659u;

    /* JADX INFO: renamed from: v */
    public ImageView f205660v;

    /* JADX INFO: renamed from: w */
    public RelativeLayout f205661w;

    /* JADX INFO: renamed from: x */
    public VRelative f205662x;

    /* JADX INFO: renamed from: y */
    public VFrame f205663y;

    /* JADX INFO: renamed from: z */
    public VImage f205664z;

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m220894Q(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.m220399u("e_profile_moment_chat_input", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("moment_id", photoAlbumBottomView.f41094K.f56011id), j760.m140076a("moment_type", zi60.m218961w().m218992y(photoAlbumBottomView.f41094K)));
        Act act = photoAlbumBottomView.act();
        CoreService coreServiceM60222H = FeedModule.m60222H();
        Act act2 = photoAlbumBottomView.act();
        Moment moment = photoAlbumBottomView.f41094K;
        act.startActivity(coreServiceM60222H.mo30784k9(act2, moment.f56011id, moment.owner, "from_moment"));
        photoAlbumBottomView.act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m220895R(PhotoAlbumBottomView photoAlbumBottomView, Moment moment, String str, View view) {
        photoAlbumBottomView.m63399C1(moment.live, photoAlbumBottomView.act(), kjb0.m146202m(moment.live, str));
        osg.m165773h(photoAlbumBottomView.act(), str, moment, photoAlbumBottomView.f41106U, photoAlbumBottomView.f41103R, photoAlbumBottomView.f41105T);
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: A */
    public VImage mo196898A() {
        return this.f205664z;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: B */
    public VText mo196899B() {
        return this.f205651m;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: C */
    public VText mo196900C() {
        return this.f205652n;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: D */
    public VText mo196901D() {
        return this.f205627M;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: E */
    public VLinear mo196902E() {
        return this.f205633S;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: F */
    public ImageView mo196903F() {
        return this.f205626L;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: G */
    public VText mo196904G() {
        return this.f205648j;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: H */
    public VText mo196905H() {
        return this.f205647i;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: I */
    public VLinear mo196906I() {
        return this.f205646h;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: J */
    public VText mo196907J() {
        return this.f205649k;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: K */
    public VImage mo196908K() {
        return this.f205656r;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: L */
    public VText mo196909L() {
        return this.f205655q;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: M */
    public VLinear mo196910M() {
        return this.f205653o;
    }

    /* JADX INFO: renamed from: T */
    public final void m220897T(View view) {
        az60.m99641a(this, view);
    }

    /* JADX INFO: renamed from: U */
    public void m220898U(View view, boolean z) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208344M(view, z);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m220899V() {
        this.f205640b.setPadding(t100.m186890d(40.0f), t100.m186890d(10.0f), t100.m186890d(2.0f), 0);
        xdl0.m208360X(this.f205647i, 0);
        xdl0.m208357U((RelativeLayout) this.f205640b.getParent(), 0);
    }

    /* JADX INFO: renamed from: W */
    public void m220900W(final PhotoAlbumBottomView photoAlbumBottomView) {
        User userM209447e8 = FeedModule.f38855d.m209447e8(photoAlbumBottomView.f41094K.owner);
        if ("from_profile_album".equals(photoAlbumBottomView.f41101P)) {
            Moment moment = photoAlbumBottomView.f41094K;
            if (!moment.isLive && !moment.isVoiceLive && !vqg.m199528V(moment) && !FeedModule.m60222H().me_().f56011id.equals(userM209447e8) && vqg.m199527U(FeedModule.m60222H().mo30741Zj(photoAlbumBottomView.f41094K.owner))) {
                if (this.f205638X == null) {
                    FeedInsertCommentView feedInsertCommentView = new FeedInsertCommentView((Context) photoAlbumBottomView.act(), false);
                    this.f205638X = feedInsertCommentView;
                    qib0.f154691G.m102331L0(feedInsertCommentView.f41717a, FeedModule.m60222H().me_().m60124fp().url);
                    this.f205640b.addView(this.f205638X);
                    VText vText = this.f205638X.f41718b;
                    StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    sb.append(FeedModule.f38852a.getResources().getString(R$string.f39015Z3, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + userM209447e8.name));
                    vText.setHint(sb.toString());
                    xdl0.m208329E0(this.f205638X.f41718b, new View.OnClickListener() { // from class: l.uy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            zy60.m220894Q(photoAlbumBottomView, view);
                        }
                    });
                    xdl0.m208359W(this.f205638X, t100.m186890d(16.0f));
                    xdl0.m208358V(this.f205638X, t100.m186890d(12.0f));
                    xdl0.m208357U(this.f205638X, t100.m186890d(21.0f));
                    xdl0.m208325C0(this.f205638X, t100.m186890d(46.0f));
                    photoAlbumBottomView.f41100O.put(photoAlbumBottomView.f41094K.f56011id, Boolean.TRUE);
                    xdl0.m208329E0(this.f205638X.f41720d, new View.OnClickListener() { // from class: l.vy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f183498a.m220901X(photoAlbumBottomView, view);
                        }
                    });
                    xdl0.m208329E0(this.f205638X.f41721e, new View.OnClickListener() { // from class: l.wy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f188546a.m220902Y(photoAlbumBottomView, view);
                        }
                    });
                    xdl0.m208329E0(this.f205638X.f41722f, new View.OnClickListener() { // from class: l.xy60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f195028a.m220903Z(photoAlbumBottomView, view);
                        }
                    });
                }
                zvf0.m220368A("e_profile_moment_chat_input", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("moment_id", photoAlbumBottomView.f41094K.f56011id), j760.m140076a("moment_type", zi60.m218961w().m218992y(photoAlbumBottomView.f41094K)));
                return;
            }
        }
        if (photoAlbumBottomView.f41100O.containsKey(photoAlbumBottomView.f41094K.f56011id) && photoAlbumBottomView.f41100O.get(photoAlbumBottomView.f41094K.f56011id).booleanValue()) {
            return;
        }
        this.f205640b.removeView(this.f205638X);
        photoAlbumBottomView.f41100O.put(photoAlbumBottomView.f41094K.f56011id, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m220901X(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("moment_id", photoAlbumBottomView.f41094K.f56011id), j760.m140076a("moment_chat_send_from", "profile_emoji"), j760.m140076a("moment_type", zi60.m218961w().m218992y(photoAlbumBottomView.f41094K)));
        CoreService coreServiceM60222H = FeedModule.m60222H();
        Act act = photoAlbumBottomView.act();
        String string = this.f205638X.f41720d.getText().toString();
        Moment moment = photoAlbumBottomView.f41094K;
        coreServiceM60222H.mo30768hd(act, string, moment.f56011id, moment.owner);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m220902Y(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("moment_id", photoAlbumBottomView.f41094K.f56011id), j760.m140076a("moment_chat_send_from", "profile_emoji"), j760.m140076a("moment_type", zi60.m218961w().m218992y(photoAlbumBottomView.f41094K)));
        CoreService coreServiceM60222H = FeedModule.m60222H();
        Act act = photoAlbumBottomView.act();
        String string = this.f205638X.f41721e.getText().toString();
        Moment moment = photoAlbumBottomView.f41094K;
        coreServiceM60222H.mo30768hd(act, string, moment.f56011id, moment.owner);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m220903Z(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("moment_id", photoAlbumBottomView.f41094K.f56011id), j760.m140076a("moment_chat_send_from", "profile_emoji"), j760.m140076a("moment_type", zi60.m218961w().m218992y(photoAlbumBottomView.f41094K)));
        CoreService coreServiceM60222H = FeedModule.m60222H();
        Act act = photoAlbumBottomView.act();
        String string = this.f205638X.f41722f.getText().toString();
        Moment moment = photoAlbumBottomView.f41094K;
        coreServiceM60222H.mo30768hd(act, string, moment.f56011id, moment.owner);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m220904a0(PhotoAlbumBottomView photoAlbumBottomView) {
        return !photoAlbumBottomView.m63396A1(photoAlbumBottomView.f41094K);
    }

    @Override // p149l.zll
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo219282c(PhotoAlbumBottomView photoAlbumBottomView) {
        m220897T(photoAlbumBottomView);
    }

    @Override // p149l.zll
    /* JADX INFO: renamed from: c0 */
    public boolean mo177163b(PhotoAlbumBottomView photoAlbumBottomView) {
        if (!u2h.m191495d()) {
            return false;
        }
        mo177166g0(photoAlbumBottomView);
        return false;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: d */
    public SVGAnimationView mo196911d() {
        return this.f205617C;
    }

    @Override // p149l.zll
    /* JADX INFO: renamed from: d0 */
    public boolean mo177162a(PhotoAlbumBottomView photoAlbumBottomView) {
        Moment moment = photoAlbumBottomView.f41094K;
        if (u2h.m191495d() && NullChecker.m81304b(moment) && moment.isLive) {
            if (m220904a0(photoAlbumBottomView)) {
                m220898U(photoAlbumBottomView.f41111c, false);
                m220898U(this.f205636V, true);
                photoAlbumBottomView.f41109a = this.f205636V;
            } else {
                m220898U(this.f205636V, false);
                photoAlbumBottomView.f41109a = mo196903F();
            }
        }
        if (!moment.isLive) {
            photoAlbumBottomView.f41109a = this.f205626L;
        }
        if (photoAlbumBottomView.m63414L0()) {
            m220899V();
            m220909i0();
        } else {
            m220908h0();
        }
        m220900W(photoAlbumBottomView);
        m220907f0();
        return false;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: e */
    public ConstraintLayout mo196912e() {
        return this.f205628N;
    }

    /* JADX INFO: renamed from: e0 */
    public void m220906e0(Moment moment, PhotoAlbumBottomView photoAlbumBottomView) {
        if (NullChecker.m81303a(moment) && moment.isVoiceLive) {
            photoAlbumBottomView.m63407H1((int) moment.voiceLive.messageCount);
            photoAlbumBottomView.m63417M1((int) moment.voiceLive.rewarderCount);
        }
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: f */
    public VImage mo196913f() {
        return this.f205631Q;
    }

    /* JADX INFO: renamed from: f0 */
    public void m220907f0() {
        qib0.f154691G.m102354Y0(this.f205635U, f3c0.f94515f2);
        this.f205634T.setTypeface(null, 1);
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: g */
    public VDraweeView mo196914g() {
        return this.f205629O;
    }

    /* JADX INFO: renamed from: g0 */
    public void mo177166g0(final PhotoAlbumBottomView photoAlbumBottomView) {
        final Moment moment = photoAlbumBottomView.f41094K;
        m220898U(this.f205658t, false);
        final String str = photoAlbumBottomView.f41101P;
        if (moment.isLive) {
            m220898U(photoAlbumBottomView.f41112d, false);
            m220898U(photoAlbumBottomView.f41113e, false);
            TextUtils.equals(str, "from_discover_dating");
            m220898U(this.f205624J, true);
            m220898U(this.f205625K, false);
            xdl0.m208325C0(this.f205661w, t100.f167227B);
            xdl0.m208329E0(this.f205624J, new View.OnClickListener() { // from class: l.yy60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zy60.m220895R(photoAlbumBottomView, moment, str, view);
                }
            });
            m220898U(this.f205657s, false);
            return;
        }
        this.f205639a.setOnClickListener(null);
        m220898U(this.f205657s, false);
        m220898U(photoAlbumBottomView.f41112d, true);
        m220898U(this.f205624J, false);
        m220898U(this.f205625K, false);
        if (!nkg.m159896o() || TextUtils.equals("from_live_square_tab", photoAlbumBottomView.f41101P)) {
            m220898U(photoAlbumBottomView.f41113e, true);
        } else {
            m220898U(photoAlbumBottomView.f41113e, false);
            m220898U(this.f205621G, false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mo196929w().getLayoutParams();
            layoutParams.addRule(11, -1);
            layoutParams.setMarginEnd(t100.m186890d(12.0f));
        }
        m220906e0(moment, photoAlbumBottomView);
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: h */
    public VText mo196915h() {
        return this.f205630P;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m220908h0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f205637W.getLayoutParams();
        marginLayoutParams.leftMargin = t100.m186890d(78.0f);
        marginLayoutParams.rightMargin = t100.m186890d(16.0f);
        marginLayoutParams.height = t100.m186890d(0.5f);
        this.f205637W.setBackgroundColor(Color.parseColor("#f2f2f2"));
        this.f205637W.setLayoutParams(marginLayoutParams);
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: i */
    public VText mo196916i() {
        return this.f205632R;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m220909i0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f205637W.getLayoutParams();
        marginLayoutParams.height = t100.m186890d(0.5f);
        this.f205637W.setBackgroundColor(Color.parseColor("#f2f2f2"));
        this.f205637W.setLayoutParams(marginLayoutParams);
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: j */
    public VLinear mo196917j() {
        return this.f205618D;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: k */
    public TextView mo196918k() {
        return this.f205620F;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: l */
    public VLinear mo196919l() {
        return this.f205640b;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: m */
    public VText mo196920m() {
        return this.f205650l;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: n */
    public View mo196921n() {
        return this.f205637W;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: o */
    public View mo177167o() {
        return this.f205624J;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: p */
    public LinearLayout mo196922p() {
        return this.f205645g;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: q */
    public FeedUserHeaderView mo196923q() {
        return this.f205654p;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: r */
    public VDraweeView mo196924r() {
        return this.f205642d;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: s */
    public VText mo196925s() {
        return this.f205644f;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: t */
    public VText mo196926t() {
        return this.f205643e;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: u */
    public ConstraintLayout mo196927u() {
        return this.f205641c;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: v */
    public RelativeLayout mo196928v() {
        return this.f205661w;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: w */
    public VRelative mo196929w() {
        return this.f205662x;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: x */
    public FeedAutoScrollTextView mo196930x() {
        return this.f205616B;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: y */
    public VDraweeView mo196931y() {
        return this.f205615A;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: z */
    public VFrame mo196932z() {
        return this.f205663y;
    }

    @Override // p149l.AbstractC20577v4
    /* JADX INFO: renamed from: N */
    public void mo177151N(boolean z) {
    }
}
