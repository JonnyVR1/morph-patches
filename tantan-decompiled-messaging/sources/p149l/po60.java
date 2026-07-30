package p149l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.AlbumButton;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.AlbumFeedHeader;
import com.p046p1.mobile.putong.newui.view.CoreAutoScrollTextView;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class po60 implements s7m<qn60>, View.OnClickListener, yzl {

    /* JADX INFO: renamed from: K */
    public static final cwf0 f150453K = i0e.m133794c("p_album_more_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public AlbumFeedHeader f150454A;

    /* JADX INFO: renamed from: B */
    public nl60 f150455B;

    /* JADX INFO: renamed from: C */
    public d7h f150456C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumBaseFrag f150457D;

    /* JADX INFO: renamed from: E */
    public User f150458E;

    /* JADX INFO: renamed from: F */
    public boolean f150459F;

    /* JADX INFO: renamed from: G */
    public c40 f150460G;

    /* JADX INFO: renamed from: H */
    public xh0 f150461H;

    /* JADX INFO: renamed from: I */
    public xh0 f150462I;

    /* JADX INFO: renamed from: J */
    public boolean f150463J;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f150464a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f150465b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f150466c;

    /* JADX INFO: renamed from: d */
    public VFrame f150467d;

    /* JADX INFO: renamed from: e */
    public VLinear f150468e;

    /* JADX INFO: renamed from: f */
    public VImage f150469f;

    /* JADX INFO: renamed from: g */
    public VText f150470g;

    /* JADX INFO: renamed from: h */
    public VLinear f150471h;

    /* JADX INFO: renamed from: i */
    public VImage f150472i;

    /* JADX INFO: renamed from: j */
    public VText f150473j;

    /* JADX INFO: renamed from: k */
    public VRelative f150474k;

    /* JADX INFO: renamed from: l */
    public VButton f150475l;

    /* JADX INFO: renamed from: m */
    public VLinear f150476m;

    /* JADX INFO: renamed from: n */
    public VImage f150477n;

    /* JADX INFO: renamed from: o */
    public VText f150478o;

    /* JADX INFO: renamed from: p */
    public VRelative f150479p;

    /* JADX INFO: renamed from: q */
    public VButton f150480q;

    /* JADX INFO: renamed from: r */
    public ConstraintLayout f150481r;

    /* JADX INFO: renamed from: s */
    public VLinear f150482s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f150483t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f150484u;

    /* JADX INFO: renamed from: v */
    public CoreAutoScrollTextView f150485v;

    /* JADX INFO: renamed from: w */
    public TextView f150486w;

    /* JADX INFO: renamed from: x */
    public TextView f150487x;

    /* JADX INFO: renamed from: y */
    public PersonalPhotoAlbumFeedFrag f150488y;

    /* JADX INFO: renamed from: z */
    public qn60 f150489z;

    public po60(PersonalPhotoAlbumFeedFrag personalPhotoAlbumFeedFrag) {
        this.f150488y = personalPhotoAlbumFeedFrag;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m170481E(Relationship relationship) {
    }

    /* JADX INFO: renamed from: Q */
    private VRecyclerView m170483Q() {
        return m170527S().f166899b;
    }

    /* JADX INFO: renamed from: W */
    private void m170484W() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = (PhotoAlbumBaseFrag) this.f150488y.getChildFragmentManager().m2557i0("PhotoAlbumFeedBaseFrag");
        this.f150457D = photoAlbumBaseFrag;
        if (NullChecker.m81303a(photoAlbumBaseFrag)) {
            this.f150457D.m64030k5(true);
            this.f150457D.m64029j5(true);
            m170552x0();
            return;
        }
        qn60 qn60Var = this.f150489z;
        PhotoAlbumBaseFrag photoAlbumBaseFragM64004N4 = PhotoAlbumBaseFrag.m64004N4(qn60Var.f155400m, qn60Var.f155391d, qn60Var.f155392e, qn60Var.f155394g, qn60Var.f155395h, qn60Var.f155393f, true);
        this.f150457D = photoAlbumBaseFragM64004N4;
        photoAlbumBaseFragM64004N4.m64030k5(true);
        this.f150457D.m64029j5(true);
        m170552x0();
        AbstractC0427k abstractC0427kM2567m = this.f150488y.getChildFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73565g, this.f150457D, "PhotoAlbumFeedBaseFrag");
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m170486b(DialogInterface dialogInterface) {
        cwf0 cwf0Var = f150453K;
        if (cwf0Var != null) {
            cwf0Var.m109035k();
            cwf0Var.m109034j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m170490e0(View view) {
        zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, "p_album", vwb.m200311Y("moments_user_id", this.f150458E.f56011id));
        FeedModule.m60222H().mo30788kn(getAct(), this.f150458E, !this.f150489z.f155400m, null, LikeFrom.get("moment"), null, null, null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m170491f(User user) {
        user.localRelationship = null;
        FeedModule.f38855d.m209298Ic(user, false);
        FeedModule.f38855d.m209437cc(user.f56011id, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m170492f0(View view) {
        FeedModule.f38854c.m60724f3(getAct(), this.f150458E, null, "p_album", this.f150489z.f155400m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m170493g0(View view) {
        m170521L();
        p6j0.m167669c("e_moment_post", "p_album", j760.m140076a("album_post_source", "bottom_post_button"), j760.m140076a("post_guide_type", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m170494h0(View view) {
        p6j0.m167669c("e_send_message", getAct().pageId(), j760.m140076a("is_match", 0), j760.m140076a("owner_id", this.f150458E.f56011id));
        FeedModule.f38854c.m60724f3(getAct(), this.f150458E, null, "p_album", this.f150489z.f155400m);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m170496j(Act act, d30 d30Var) {
        act.supportInvalidateOptionsMenu();
        d30Var.call();
    }

    /* JADX INFO: renamed from: A0 */
    public void m170509A0(final User user, final boolean z, String str, String str2, String str3) {
        xh0.C21150a c21150a = new xh0.C21150a(getAct());
        c21150a.m208740s(str).m208731j(str2).m208739r(str3).m208736o(new View.OnClickListener() { // from class: l.do60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87132a.m170540k0(user, z, view);
            }
        }).m208726e(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.eo60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92424a.m170541l0(view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f150461H = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m170511D0() {
        ab70.C15567a c15567a = ab70.m95586a().m95587b().get(this.f150489z.f155392e);
        return "from_activities_moment".equals(this.f150489z.f155392e) || c15567a == null || !c15567a.f68630b || FeedModule.m60221F().userId().equals(this.f150489z.f155391d);
    }

    /* JADX INFO: renamed from: E0 */
    public void m170512E0(User user, boolean z) {
        p6j0.m167671e("e_send_message", getAct().pageId(), j760.m140076a("is_reply", Integer.valueOf(z ? 1 : 0)), j760.m140076a("is_match", 0), j760.m140076a("owner_id", user.f56011id));
    }

    /* JADX INFO: renamed from: G */
    public View m170513G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qo60.m175722b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G0 */
    public void m170514G0(String str) {
        xh0.C21150a c21150a = new xh0.C21150a(getAct());
        c21150a.m208731j(str).m208738q(R$string.f39135r).m208737p(e1c0.f88798n).m208736o(new View.OnClickListener() { // from class: l.oo60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144849a.m170542m0(view);
            }
        }).m208726e(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.sn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165414a.m170543n0(view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f150462I = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: H */
    public void m170515H() {
        qo60.m175723c(this);
    }

    /* JADX INFO: renamed from: H0 */
    public void m170516H0(String str) {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
            return;
        }
        if (NullChecker.m81303a(this.f150489z.f155399l) && "moment_post_bubble".equals(str) && !vwb.m200296J(this.f150489z.f155399l.f191751a)) {
            TopicOperations topicOperations = (TopicOperations) vwb.m200346r(this.f150489z.f155399l.f191751a, new w9j() { // from class: l.tn60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
                }
            });
            if (NullChecker.m81303a(topicOperations)) {
                final String str2 = topicOperations.postGuide.topicId;
                if (!TextUtils.isEmpty(str2) && !vwb.m200296J(this.f150489z.f155399l.f191752b)) {
                    TopicMoment topicMoment = (TopicMoment) vwb.m200346r(this.f150489z.f155399l.f191752b, new w9j() { // from class: l.un60
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(str2));
                        }
                    });
                    if (NullChecker.m81303a(topicMoment)) {
                        oe40.m163850m0(this.f150488y.act(), vwb.m200324f0(new Media[0]), true, str, topicOperations.postGuide.momentValue, topicOperations.operationType.toString(), topicMoment);
                        return;
                    }
                }
                oe40.m163848l0(this.f150488y.act(), vwb.m200324f0(new Media[0]), true, str, topicOperations.postGuide.momentValue, topicOperations.operationType.toString());
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            oe40.m163846k0(getAct(), vwb.m200324f0(new Media[0]), true, "myalbum");
        } else {
            oe40.m163846k0(this.f150488y.act(), vwb.m200324f0(new Media[0]), true, str);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public PhotoAlbumFeedAct getAct() {
        return (PhotoAlbumFeedAct) this.f150488y.act();
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m170518I0(View view, boolean z) {
        int i = z ? 0 : 8;
        if (view.getVisibility() == i) {
            return false;
        }
        view.setVisibility(i);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void m170519J(final User user, final boolean z, final d30 d30Var, final boolean z2, final boolean z3) {
        this.f150465b.m223584B();
        if (nkg.m159869Z()) {
            VText vText = new VText(getAct());
            vText.setText(this.f150470g.getText().toString());
            vText.setTextSize(16.0f);
            String string = this.f150470g.getText().toString();
            string.getClass();
            if (string.equals("关注")) {
                vText.setTextColor(Color.parseColor("#fe7e1d"));
            } else {
                vText.setTextColor(Color.parseColor("#26000000"));
            }
            if (TextUtils.equals(vText.getText().toString(), getAct().getString(R$string.f38942N2))) {
                return;
            }
            this.f150465b.m223589z(vText);
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.vn60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182209a.m170533Z(view);
                }
            });
        }
        this.f150465b.m223588w(f3c0.f94608r, new View.OnClickListener() { // from class: l.wn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187254a.m170534a0(user, z, d30Var, z2, z3, view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qn60 qn60Var) {
        this.f150489z = qn60Var;
    }

    /* JADX INFO: renamed from: L */
    public final void m170521L() {
        m170522M(null);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo62028L0() {
        return this.f150489z.m175613C0();
    }

    /* JADX INFO: renamed from: M */
    public final void m170522M(String str) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (!NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            m170516H0(str);
        } else if (audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.m151593w(R$string.f38882D2);
        } else {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: N */
    public void m170523N(final Act act, final User user, final boolean z) {
        act.progress(R$string.f38984U2, true);
        FeedModule.f38854c.f39209M.m60772M(user.f56011id, !z).subscribe(mkd0.m154956H(new e30() { // from class: l.fo60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98509a.m170535b0(user, act, z, (roj0) obj);
            }
        }, new e30() { // from class: l.go60
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m170524O(User user) {
        if (getAct().getString(R$string.f38966R2).equals(this.f150470g.getText())) {
            return;
        }
        if (getAct() == null || !"p_christmas_profile".equals(getAct().m64358Z1())) {
            p6j0.m167671e(MatchScData.ModuleId.mid_e_follow, "p_album", j760.m140076a("owner_id", user.f56011id), j760.m140076a("receiver_user_id", user.f56011id));
        } else {
            p6j0.m167671e(MatchScData.ModuleId.mid_e_follow, "p_album", j760.m140076a("owner_id", user.f56011id), j760.m140076a("album_from", "p_christmas_profile"), j760.m140076a("receiver_user_id", user.f56011id));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m170525P() {
        if (this.f150463J) {
            return;
        }
        this.f150463J = true;
        zvf0.m220368A(MatchScData.ModuleId.mid_e_likeButton, "p_album", vwb.m200311Y("moments_user_id", this.f150489z.f155391d), vwb.m200311Y("moment_id", ""));
    }

    /* JADX INFO: renamed from: R */
    public String m170526R(String str) {
        String string;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_greeting");
            if (TextUtils.isEmpty(strM79302F)) {
                string = str;
            } else {
                JSONArray jSONArray = new JSONArray(new JSONObject(strM79302F).getString(TEnum.equals(this.f150458E.gender, "female") ? "femaleDoc" : "maleDoc"));
                string = jSONArray.length() == 0 ? "" : jSONArray.getString(0);
            }
            return TextUtils.isEmpty(string) ? str : string;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: S */
    public final sy60 m170527S() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f150457D;
        if (photoAlbumBaseFrag == null) {
            return null;
        }
        return photoAlbumBaseFrag.f41454z;
    }

    /* JADX INFO: renamed from: T */
    public final void m170528T() {
        NullChecker.m81303a(this.f150489z.f155397j);
    }

    /* JADX INFO: renamed from: U */
    public void m170529U() {
        if (NullChecker.m81303a(this.f150454A)) {
            this.f150454A.m65059Q();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m170530V(final User user) {
        final d30 d30Var = new d30() { // from class: l.jo60
            @Override // p149l.d30
            public final void call() {
                po60.m170491f(user);
            }
        };
        final Boolean[] boolArr = {Boolean.FALSE};
        final boolean z = !TextUtils.equals("from_kan_kan", this.f150489z.f155392e);
        getAct().duringCreated(FeedModule.f38854c.f39209M.m121230k()).first().subscribe(mkd0.m154956H(new e30() { // from class: l.ko60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123962a.m170536c0(user, boolArr, d30Var, z, (List) obj);
            }
        }, new e30() { // from class: l.lo60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129071a.m170537d0(user, boolArr, d30Var, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public void m170531X(Bundle bundle) {
        this.f150465b.setLeftIconAsBack(getAct());
        m170484W();
        vqg.m199508G0(this.f150471h, new View.OnClickListener() { // from class: l.rn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160247a.m170494h0(view);
            }
        });
        xdl0.m208329E0(this.f150482s, new View.OnClickListener() { // from class: l.co60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81751a.m170490e0(view);
            }
        });
        xdl0.m208329E0(this.f150483t, new View.OnClickListener() { // from class: l.ho60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108795a.m170492f0(view);
            }
        });
        xdl0.m208329E0(this.f150480q, new View.OnClickListener() { // from class: l.io60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114107a.m170493g0(view);
            }
        });
        this.f150468e.setOnClickListener(this);
        this.f150475l.setOnClickListener(this);
        this.f150476m.setOnClickListener(this);
        this.f150467d.setOnClickListener(null);
        m170553y0(this.f150470g);
        m170553y0(this.f150473j);
        m170553y0(this.f150478o);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo62032X0() {
        this.f150456C = new d7h(this.f150455B);
        m170545p0();
        return this.f150456C;
    }

    /* JADX INFO: renamed from: Y */
    public void m170532Y(boolean z) {
        xdl0.m208344M(this.f150486w, !z);
        xdl0.m208344M(this.f150485v, z);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m170533Z(View view) {
        this.f150489z.m175631u0();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m170534a0(User user, boolean z, d30 d30Var, boolean z2, boolean z3, View view) {
        m170554z0(getAct(), user, z, d30Var, z2, z3);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m170535b0(User user, Act act, boolean z, roj0 roj0Var) {
        m170530V(user);
        act.progressDismiss();
        lsi0.m151587q(z ? uzh.m196413p(act).mo186791j() : uzh.m196413p(act).mo186788g(), act.getResources().getDrawable(f3c0.f94467Z1));
        FeedModule.f38855d.m209437cc(user.f56011id, !z);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m170536c0(User user, Boolean[] boolArr, d30 d30Var, boolean z, List list) {
        boolean z2 = list != null && list.contains(user.f56011id);
        if (user.isTeamAccount()) {
            this.f150465b.m223584B();
        } else {
            m170519J(user, boolArr[0].booleanValue(), d30Var, z, z2);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m170537d0(User user, Boolean[] boolArr, d30 d30Var, boolean z, Throwable th) {
        if (user.isTeamAccount()) {
            this.f150465b.m223584B();
        } else {
            m170519J(user, boolArr[0].booleanValue(), d30Var, z, false);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f150461H) && this.f150461H.m208718d()) {
            this.f150461H.m208717c();
        }
        if (NullChecker.m81303a(this.f150460G) && this.f150460G.m105115d()) {
            this.f150460G.m105113b();
        }
        if (NullChecker.m81303a(this.f150462I) && this.f150462I.m208718d()) {
            this.f150462I.m208717c();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m170538i0(View view) {
        this.f150460G.m105113b();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM170513G = m170513G(layoutInflater, viewGroup);
        viewM170513G.setBackgroundColor(this.f150488y.getResources().getColor(e1c0.f88803p0));
        this.f150489z.m175628a1();
        getAct().setStatusBarColorResId(v0c0.f179109p);
        return viewM170513G;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m170539j0(String str, boolean z, final Act act, User user, final d30 d30Var, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        po60 po60Var;
        if (!TextUtils.equals(c22545a.f209159a, str)) {
            po60Var = this;
            if (TextUtils.equals(c22545a.f209159a, po60Var.getAct().getString(R$string.f39188z4))) {
                kjb0.m146181D(act, user.f56011id, null, null, new d30() { // from class: l.ao60
                    @Override // p149l.d30
                    public final void call() {
                        po60.m170496j(act, d30Var);
                    }
                }, "moment_page");
            } else if (TextUtils.equals(c22545a.f209159a, "取消喜欢")) {
                zvf0.m220399u("e_unlike", "p_album_more_popup", vwb.m200311Y("unlike_from", "profile_moment"), vwb.m200311Y("other_user_id", NullChecker.m81303a(user) ? user.f56011id : ""));
                swh.m186169f(act, user, po60Var.getAct().pageId(), new e30() { // from class: l.bo60
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        po60.m170481E((Relationship) obj);
                    }
                });
            } else if (TextUtils.equals(c22545a.f209159a, "取消关注")) {
                swh.m186168e(act, user, po60Var.getAct().pageId(), false);
            }
        } else if (!z) {
            po60Var = this;
            if (uzh.m196413p(act).mo186789h()) {
                po60Var.m170509A0(user, z, uzh.m196413p(act).mo186786e(), uzh.m196413p(act).mo186783b(), uzh.m196413p(act).mo186784c());
            } else {
                po60Var.m170523N(act, user, z);
            }
        } else if (uzh.m196413p(act).mo186785d()) {
            po60Var = this;
            po60Var.m170509A0(user, z, uzh.m196413p(act).mo186787f(), uzh.m196413p(act).mo186792k(user.isFemale()), uzh.m196413p(act).mo186790i());
        } else {
            po60Var = this;
            po60Var.m170523N(act, user, z);
        }
        po60Var.f150460G.m105113b();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m170540k0(User user, boolean z, View view) {
        this.f150461H.m208717c();
        m170523N(getAct(), user, z);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m170541l0(View view) {
        this.f150461H.m208717c();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m170542m0(View view) {
        this.f150462I.m208717c();
        FeedModule.f38855d.m209453f7(FeedModule.m60221F().userId(), this.f150489z.f155397j, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m170543n0(View view) {
        this.f150462I.m208717c();
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo62033n1(List<MomentItem> list, boolean z, User user, int i) {
        m170527S().m186615E(list, z, user, i);
        m170545p0();
        if (NullChecker.m81303a(this.f150455B) && NullChecker.m81303a(this.f150454A)) {
            this.f150454A.m65062T(this.f150489z.f155399l, this.f150455B.getPageCount() >= 2);
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m170544o0() {
        AlbumButton albumButton;
        if (!User.isWisdomStar(this.f150458E.f56011id)) {
            if (NullChecker.m81303a(this.f150489z.f155397j)) {
                getAct().startActivity(kjb0.m146192c(getAct(), this.f150489z.f155397j.f56011id, false, false));
                return;
            }
            return;
        }
        NotifyUsers notifyUsersM209356R7 = FeedModule.f38855d.m209356R7(this.f150458E.f56011id);
        if (notifyUsersM209356R7 == null || (albumButton = notifyUsersM209356R7.albumButton) == null) {
            return;
        }
        String str = albumButton.deepLink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cxh.m109100b(getAct(), Uri.parse(str));
        zvf0.m220399u("e_moment_post", getAct().pageId(), j760.m140076a("robotname", this.f150458E.name));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (b5c0.f73553d == id) {
            boolean zM159854K = nkg.m159854K();
            qn60 qn60Var = this.f150489z;
            if (!zM159854K) {
                qn60Var.m175631u0();
                return;
            } else {
                zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, "p_album", vwb.m200311Y("moments_user_id", qn60Var.f155391d), vwb.m200311Y("moment_id", ""));
                FeedModule.m60222H().mo30788kn(getAct(), this.f150458E, !this.f150489z.f155400m, null, LikeFrom.get("moment"), null, null, null);
                return;
            }
        }
        if (b5c0.f73564f2 == id) {
            if (NullChecker.m81303a(this.f150489z.f155397j)) {
                String string = getAct().getResources().getString(R$string.f39183z);
                p6j0.m167669c("e_cancelfollow", "p_album", j760.m140076a("owner_id", this.f150489z.f155397j.f56011id), j760.m140076a("receiver_user_id", this.f150489z.f155397j.f56011id));
                m170514G0(string);
                return;
            }
            return;
        }
        if (b5c0.f73480F1 == id) {
            m170544o0();
        } else if (b5c0.f73609t == id) {
            this.f150488y.mo62034o();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m170545p0() {
        nl60 nl60Var = this.f150455B;
        boolean z = nl60Var != null && nl60Var.m160014A0() && (this.f150455B.getPageCount() > 1 || !this.f150455B.m160015B0()) && this.f150489z.m175615F0();
        if (this.f150454A == null) {
            RecyclerView.C0578p c0578p = new RecyclerView.C0578p(-1, -2);
            AlbumFeedHeader albumFeedHeader = new AlbumFeedHeader(getAct());
            this.f150454A = albumFeedHeader;
            albumFeedHeader.setUserId(this.f150489z.f155391d);
            this.f150454A.m65060R(this.f150489z.f155391d);
            this.f150454A.setLayoutParams(c0578p);
        }
        this.f150454A.m65065X(z, new e30() { // from class: l.mo60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134845a.m170522M((String) obj);
            }
        });
        if (NullChecker.m81303a(this.f150458E)) {
            this.f150454A.m65063V(this.f150458E, new d30() { // from class: l.no60
                @Override // p149l.d30
                public final void call() {
                    this.f139820a.m170528T();
                }
            });
        }
        AlbumFeedHeader albumFeedHeader2 = this.f150454A;
        d7h d7hVar = this.f150456C;
        if (albumFeedHeader2 != null) {
            if (d7hVar == null || d7hVar.m143809A()) {
                return;
            }
            this.f150456C.m143815H(this.f150454A);
            this.f150455B.m63930s0(1);
            return;
        }
        if (d7hVar == null || !d7hVar.m143809A()) {
            return;
        }
        this.f150456C.m143811D();
        this.f150455B.m63930s0(0);
    }

    /* JADX INFO: renamed from: q0 */
    public void m170546q0(User user) {
        boolean zM170551w0;
        boolean z;
        boolean z2;
        FollowshipStatus followshipStatus;
        boolean z3;
        if (this.f150489z.f155396i) {
            z3 = true;
            zM170551w0 = false;
            z = false;
            z2 = false;
        } else {
            if (user.isTeamAccount()) {
                boolean z4 = (User.isWisdomStar(user.f56011id) && nkg.m159914x()) || (ovi.m166194a(user.f56011id) && !this.f150459F);
                xdl0.m208327D0(t100.m186890d(256.0f), this.f150475l);
                z = z4;
            } else if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && ovi.m166194a(user.f56011id) && !this.f150459F) {
                xdl0.m208327D0(t100.m186890d(256.0f), this.f150475l);
                z = true;
            } else {
                Followship followship = user.localFollowship;
                if (followship == null || (followshipStatus = followship.state) == null) {
                    if (!nkg.m159854K()) {
                        m170524O(user);
                    }
                    zM170551w0 = m170551w0(false, Color.parseColor("#ffffff"), FeedModule.f38852a.getString(R$string.f38966R2));
                } else if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    zM170551w0 = m170551w0(true, Color.parseColor("#bfbfbf"), FeedModule.f38852a.getString(R$string.f38954P2));
                } else if (TEnum.equals(user.localFollowship.state, "default") || TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(user.localFollowship.state, "unknown_")) {
                    if (!nkg.m159854K()) {
                        m170524O(user);
                    }
                    zM170551w0 = m170551w0(false, Color.parseColor("#ffffff"), FeedModule.f38852a.getString(R$string.f38966R2));
                } else if (!TEnum.equals(user.localFollowship.state, "matched")) {
                    zM170551w0 = false;
                    z = false;
                    z2 = z;
                    z3 = z2;
                } else if (ovi.m166194a(user.f56011id)) {
                    z2 = !nkg.m159854K();
                    z = true;
                    zM170551w0 = false;
                    z3 = false;
                } else {
                    zM170551w0 = m170551w0(true, Color.parseColor("#bfbfbf"), FeedModule.f38852a.getString(R$string.f38942N2));
                }
                z = false;
                z2 = z;
                z3 = z2;
            }
            zM170551w0 = false;
            z2 = false;
            z3 = z2;
        }
        m170510B0(zM170551w0);
        boolean z5 = zM170551w0 || z || z3;
        m170518I0(this.f150476m, z2);
        m170518I0(this.f150468e, !(nkg.m159854K() && swh.m186172i(user)) && zM170551w0);
        m170518I0(this.f150474k, z);
        m170518I0(this.f150479p, z3);
        m170518I0(this.f150467d, z5);
        if (!m170511D0()) {
            m170530V(user);
        }
        boolean zM166194a = ovi.m166194a(user.f56011id);
        if (nkg.m159868Y() && !this.f150489z.f155396i && !zM166194a && !User.isTeamAccount(user.f56011id) && !z) {
            xdl0.m208344M(this.f150467d, false);
            xdl0.m208344M(this.f150481r, true);
            if (xdl0.m208349O0(this.f150481r) && nkg.m159877e0()) {
                xdl0.m208344M(this.f150483t, false);
            }
            if (swh.m186172i(user)) {
                xdl0.m208344M(this.f150482s, false);
            }
        }
        if (User.isWisdomStar(user.f56011id)) {
            NotifyUsers notifyUsersM209356R7 = FeedModule.f38855d.m209356R7(user.f56011id);
            if (notifyUsersM209356R7 == null || notifyUsersM209356R7.albumButton == null || !nkg.m159914x()) {
                xdl0.m208344M(this.f150474k, false);
                return;
            }
            VButton vButton = this.f150475l;
            int i = t100.f167243R;
            xdl0.m208358V(vButton, i);
            xdl0.m208359W(this.f150475l, i);
            xdl0.m208325C0(this.f150475l, t100.f167227B);
            this.f150475l.setText(notifyUsersM209356R7.albumButton.value);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m170547r0(List<RecommendMessage> list) {
        if (list == null || list.size() == 0) {
            m170532Y(false);
            this.f150484u.setImageResource(f3c0.f94536i);
            StringBuilder sb = new StringBuilder("聊聊");
            sb.append(TEnum.equals(this.f150458E.gender, "female") ? "她" : "他");
            sb.append("的动态吧，更有可能得到回复");
            this.f150486w.setText(m170526R(sb.toString()));
            this.f150486w.setTextColor(Color.parseColor("#26000000"));
            this.f150487x.setText(getAct().getString(R$string.f38958Q0));
            m170512E0(this.f150458E, false);
            return;
        }
        if (list.size() == 1) {
            m170532Y(false);
            qib0.f154691G.m102341Q0(this.f150484u, this.f150458E.m60124fp().profileSmall());
            this.f150486w.setText(list.get(0).messageValue);
            this.f150486w.setTextColor(Color.parseColor("#e6000000"));
            this.f150487x.setText(TEnum.equals(this.f150458E.gender, "female") ? "回应她" : "回应他");
            m170512E0(this.f150458E, true);
            return;
        }
        m170512E0(this.f150458E, true);
        this.f150487x.setText(TEnum.equals(this.f150458E.gender, "female") ? "回应她" : "回应他");
        m170532Y(true);
        qib0.f154691G.m102341Q0(this.f150484u, this.f150458E.m60124fp().profileSmall());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).messageValue);
        }
        this.f150485v.setList(arrayList);
        this.f150485v.m79149h(2000);
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: s0 */
    public C11280a mo62036s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f150457D;
        qn60 qn60Var = this.f150489z;
        VRecyclerView vRecyclerViewM170483Q = m170483Q();
        qn60 qn60Var2 = this.f150489z;
        nl60 nl60Var = new nl60(photoAlbumBaseFrag, qn60Var, vRecyclerViewM170483Q, qn60Var2.f155391d, "from_album", qn60Var2.f155393f, true);
        this.f150455B = nl60Var;
        return nl60Var;
    }

    /* JADX INFO: renamed from: t0 */
    public void m170548t0(boolean z) {
        User user;
        this.f150459F = !z;
        if (this.f150474k.getVisibility() != 0 || z || (user = this.f150458E) == null) {
            return;
        }
        m170546q0(user);
    }

    /* JADX INFO: renamed from: u0 */
    public void m170549u0(User user) {
        if (user == null) {
            CrashHelper.m81296c(new Exception("PhotoAlbumProfileInfoView render user = null userId:" + this.f150489z.f155391d));
        } else {
            this.f150458E = user;
            m170545p0();
            m170546q0(user);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m170550v0(BubbleInfo bubbleInfo) {
        if (NullChecker.m81303a(this.f150454A) && NullChecker.m81303a(this.f150458E)) {
            this.f150454A.m65064W(this.f150458E, getAct(), "from_album", bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m170551w0(boolean z, @ColorInt int i, String str) {
        if (!nkg.m159854K()) {
            this.f150468e.setSelected(z);
            this.f150470g.setTextColor(i);
            this.f150470g.setText(str);
            return true;
        }
        if (swh.m186172i(this.f150458E)) {
            return true;
        }
        this.f150468e.setSelected(false);
        this.f150470g.setTextColor(Color.parseColor("#ffffff"));
        this.f150470g.setText("喜欢");
        m170525P();
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public void m170552x0() {
        this.f150457D.m64027h5(this);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m170553y0(TextView textView) {
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m170554z0(final Act act, final User user, boolean z, final d30 d30Var, boolean z2, final boolean z3) {
        String strMo186793l;
        ArrayList arrayList = new ArrayList();
        cwf0 cwf0Var = f150453K;
        cwf0Var.m109040p(vwb.m200311Y("other_user_id", NullChecker.m81303a(user) ? user.f56011id : ""));
        if (nkg.m159854K()) {
            if (swh.m186175l(user)) {
                arrayList.add("取消喜欢");
            } else if (swh.m186171h(user)) {
                arrayList.add("取消关注");
            }
        }
        if (z2) {
            strMo186793l = !z3 ? uzh.m196413p(act).mo186793l() : uzh.m196413p(act).mo186782a();
            arrayList.add(strMo186793l);
        } else {
            strMo186793l = null;
        }
        final String str = strMo186793l;
        if (z) {
            arrayList.add(getAct().getString(R$string.f39188z4));
        }
        c40.C16057b c16057b = new c40.C16057b(getAct());
        c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.xn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193642a.m170538i0(view);
            }
        }).m105167T(new DialogInterface.OnDismissListener() { // from class: l.yn60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                po60.m170486b(dialogInterface);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.zn60
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f203962a.m170539j0(str, z3, act, user, d30Var, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f150460G = c40VarM105153F;
        c40VarM105153F.m105117f();
        if (cwf0Var != null) {
            cwf0Var.m109033i();
            cwf0Var.m109036l();
        }
    }

    @Override // p149l.yzl
    /* JADX INFO: renamed from: q */
    public void mo62035q() {
    }

    /* JADX INFO: renamed from: B0 */
    public void m170510B0(boolean z) {
    }
}
