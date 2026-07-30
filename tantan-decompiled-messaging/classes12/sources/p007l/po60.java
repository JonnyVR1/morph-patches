package p007l;

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
import androidx.fragment.app.k;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.LikeFrom;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.RecommendMessage;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.AlbumButton;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.AlbumFeedHeader;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.CoreAutoScrollTextView;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.c40;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.ib1;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.t100;
import l.v0c0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import l.zvf0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VListCell;
import v.VRecyclerView;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class po60 implements s7m<qn60>, View.OnClickListener, yzl {

    /* JADX INFO: renamed from: K */
    public static final cwf0 f11894K = i0e.c("p_album_more_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public AlbumFeedHeader f11895A;

    /* JADX INFO: renamed from: B */
    public nl60 f11896B;

    /* JADX INFO: renamed from: C */
    public d7h f11897C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumBaseFrag f11898D;

    /* JADX INFO: renamed from: E */
    public User f11899E;

    /* JADX INFO: renamed from: F */
    public boolean f11900F;

    /* JADX INFO: renamed from: G */
    public c40 f11901G;

    /* JADX INFO: renamed from: H */
    public xh0 f11902H;

    /* JADX INFO: renamed from: I */
    public xh0 f11903I;

    /* JADX INFO: renamed from: J */
    public boolean f11904J;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f11905a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f11906b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f11907c;

    /* JADX INFO: renamed from: d */
    public VFrame f11908d;

    /* JADX INFO: renamed from: e */
    public VLinear f11909e;

    /* JADX INFO: renamed from: f */
    public VImage f11910f;

    /* JADX INFO: renamed from: g */
    public VText f11911g;

    /* JADX INFO: renamed from: h */
    public VLinear f11912h;

    /* JADX INFO: renamed from: i */
    public VImage f11913i;

    /* JADX INFO: renamed from: j */
    public VText f11914j;

    /* JADX INFO: renamed from: k */
    public VRelative f11915k;

    /* JADX INFO: renamed from: l */
    public VButton f11916l;

    /* JADX INFO: renamed from: m */
    public VLinear f11917m;

    /* JADX INFO: renamed from: n */
    public VImage f11918n;

    /* JADX INFO: renamed from: o */
    public VText f11919o;

    /* JADX INFO: renamed from: p */
    public VRelative f11920p;

    /* JADX INFO: renamed from: q */
    public VButton f11921q;

    /* JADX INFO: renamed from: r */
    public ConstraintLayout f11922r;

    /* JADX INFO: renamed from: s */
    public VLinear f11923s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f11924t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f11925u;

    /* JADX INFO: renamed from: v */
    public CoreAutoScrollTextView f11926v;

    /* JADX INFO: renamed from: w */
    public TextView f11927w;

    /* JADX INFO: renamed from: x */
    public TextView f11928x;

    /* JADX INFO: renamed from: y */
    public PersonalPhotoAlbumFeedFrag f11929y;

    /* JADX INFO: renamed from: z */
    public qn60 f11930z;

    public po60(PersonalPhotoAlbumFeedFrag personalPhotoAlbumFeedFrag) {
        this.f11929y = personalPhotoAlbumFeedFrag;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m13080E(Relationship relationship) {
    }

    /* JADX INFO: renamed from: Q */
    private VRecyclerView m13082Q() {
        return m13127S().f13114b;
    }

    /* JADX INFO: renamed from: W */
    private void m13083W() {
        PhotoAlbumBaseFrag photoAlbumBaseFragI0 = this.f11929y.getChildFragmentManager().i0("PhotoAlbumFeedBaseFrag");
        this.f11898D = photoAlbumBaseFragI0;
        if (NullChecker.a(photoAlbumBaseFragI0)) {
            this.f11898D.m5075k5(true);
            this.f11898D.m5074j5(true);
            m13153x0();
            return;
        }
        qn60 qn60Var = this.f11930z;
        PhotoAlbumBaseFrag photoAlbumBaseFragM5047N4 = PhotoAlbumBaseFrag.m5047N4(qn60Var.f12292m, qn60Var.f12283d, qn60Var.f12284e, qn60Var.f12286g, qn60Var.f12287h, qn60Var.f12285f, true);
        this.f11898D = photoAlbumBaseFragM5047N4;
        photoAlbumBaseFragM5047N4.m5075k5(true);
        this.f11898D.m5074j5(true);
        m13153x0();
        k kVarM = this.f11929y.getChildFragmentManager().m();
        kVarM.c(b5c0.f6046g, this.f11898D, "PhotoAlbumFeedBaseFrag");
        kVarM.j();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13085b(DialogInterface dialogInterface) {
        cwf0 cwf0Var = f11894K;
        if (cwf0Var != null) {
            cwf0Var.k();
            cwf0Var.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m13089e0(View view) {
        zvf0.u(MatchScData.ModuleId.mid_e_likeButton, "p_album", new j760[]{vwb.Y("moments_user_id", ((DbObject) this.f11899E).id)});
        FeedModule.m1140H().kn(act(), this.f11899E, !this.f11930z.f12292m, (String) null, LikeFrom.get("moment"), (String) null, (e30) null, (e30) null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m13090f(User user) {
        user.localRelationship = null;
        FeedModule.f316d.m16479Ic(user, false);
        FeedModule.f316d.m16618cc(((DbObject) user).id, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m13091f0(View view) {
        FeedModule.f315c.m1650f3(act(), this.f11899E, null, "p_album", this.f11930z.f12292m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m13092g0(View view) {
        m13121L();
        p6j0.m12913c("e_moment_post", "p_album", j760.a("album_post_source", "bottom_post_button"), j760.a("post_guide_type", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m13093h0(View view) {
        p6j0.m12913c("e_send_message", act().pageId(), j760.a("is_match", 0), j760.a("owner_id", ((DbObject) this.f11899E).id));
        FeedModule.f315c.m1650f3(act(), this.f11899E, null, "p_album", this.f11930z.f12292m);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m13095j(Act act, d30 d30Var) {
        act.supportInvalidateOptionsMenu();
        d30Var.call();
    }

    /* JADX INFO: renamed from: A0 */
    public void m13108A0(final User user, final boolean z, String str, String str2, String str3) {
        xh0.a aVar = new xh0.a(act());
        aVar.s(str).j(str2).r(str3).o(new View.OnClickListener() { // from class: l.do60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7016a.m13141k0(user, z, view);
            }
        }).e(R$string.f478a).c(new View.OnClickListener() { // from class: l.eo60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7443a.m13142l0(view);
            }
        });
        xh0 xh0VarA = aVar.a();
        this.f11902H = xh0VarA;
        xh0VarA.g();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13110C0() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m13111D0() {
        ab70.C2321a c2321a = ab70.m8476a().m8477b().get(this.f11930z.f12284e);
        return "from_activities_moment".equals(this.f11930z.f12284e) || c2321a == null || !c2321a.f5693b || FeedModule.m1139F().userId().equals(this.f11930z.f12283d);
    }

    /* JADX INFO: renamed from: E0 */
    public void m13112E0(User user, boolean z) {
        p6j0.m12915e("e_send_message", act().pageId(), j760.a("is_reply", Integer.valueOf(z ? 1 : 0)), j760.a("is_match", 0), j760.a("owner_id", ((DbObject) user).id));
    }

    /* JADX INFO: renamed from: G */
    public View m13113G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qo60.m13677b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G0 */
    public void m13114G0(String str) {
        xh0.a aVar = new xh0.a(act());
        aVar.j(str).q(R$string.f596r).p(e1c0.f7154n).o(new View.OnClickListener() { // from class: l.oo60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11546a.m13143m0(view);
            }
        }).e(R$string.f478a).c(new View.OnClickListener() { // from class: l.sn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13010a.m13144n0(view);
            }
        });
        xh0 xh0VarA = aVar.a();
        this.f11903I = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: H */
    public void m13115H() {
        qo60.m13678c(this);
    }

    /* JADX INFO: renamed from: H0 */
    public void m13116H0(String str) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return;
        }
        if (NullChecker.a(this.f11930z.f12291l) && "moment_post_bubble".equals(str) && !vwb.J((Collection) this.f11930z.f12291l.a)) {
            TopicOperations topicOperations = (TopicOperations) vwb.r((Collection) this.f11930z.f12291l.a, new w9j() { // from class: l.tn60
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
                }
            });
            if (NullChecker.a(topicOperations)) {
                final String str2 = topicOperations.postGuide.topicId;
                if (!TextUtils.isEmpty(str2) && !vwb.J((Collection) this.f11930z.f12291l.b)) {
                    TopicMoment topicMoment = (TopicMoment) vwb.r((Collection) this.f11930z.f12291l.b, new w9j() { // from class: l.un60
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((TopicMoment) obj).f708id.equals(str2));
                        }
                    });
                    if (NullChecker.a(topicMoment)) {
                        oe40.m12587m0(this.f11929y.act(), vwb.f0(new Media[0]), true, str, topicOperations.postGuide.momentValue, topicOperations.operationType.toString(), topicMoment);
                        return;
                    }
                }
                oe40.m12585l0(this.f11929y.act(), vwb.f0(new Media[0]), true, str, topicOperations.postGuide.momentValue, topicOperations.operationType.toString());
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            oe40.m12583k0(act(), vwb.f0(new Media[0]), true, "myalbum");
        } else {
            oe40.m12583k0(this.f11929y.act(), vwb.f0(new Media[0]), true, str);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public PhotoAlbumFeedAct act() {
        return this.f11929y.act();
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m13118I0(View view, boolean z) {
        int i = z ? 0 : 8;
        if (view.getVisibility() == i) {
            return false;
        }
        view.setVisibility(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public void m13119J(final User user, final boolean z, final d30 d30Var, final boolean z2, final boolean z3) {
        this.f11906b.B();
        if (nkg.m12228Z()) {
            VText vText = new VText(act());
            vText.setText(this.f11911g.getText().toString());
            vText.setTextSize(16.0f);
            String string = this.f11911g.getText().toString();
            string.getClass();
            if (string.equals("关注")) {
                vText.setTextColor(Color.parseColor("#fe7e1d"));
            } else {
                vText.setTextColor(Color.parseColor("#26000000"));
            }
            if (TextUtils.equals(vText.getText().toString(), act().getString(R$string.f403N2))) {
                return;
            }
            this.f11906b.z(new View[]{vText});
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.vn60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14250a.m13133Z(view);
                }
            });
        }
        this.f11906b.w(f3c0.f7891r, new View.OnClickListener() { // from class: l.wn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14628a.m13134a0(user, z, d30Var, z2, z3, view);
            }
        });
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m13139i1(qn60 qn60Var) {
        this.f11930z = qn60Var;
    }

    /* JADX INFO: renamed from: L */
    public final void m13121L() {
        m13122M(null);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: L0 */
    public hx60 mo3004L0() {
        return this.f11930z.m13614C0();
    }

    /* JADX INFO: renamed from: M */
    public final void m13122M(String str) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (!NullChecker.a(audioBusinessTypeC)) {
            m13116H0(str);
        } else if (audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.w(R$string.f343D2);
        } else {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: N */
    public void m13123N(final Act act, final User user, final boolean z) {
        act.progress(R$string.f445U2, true);
        FeedModule.f315c.f670M.m1698M(((DbObject) user).id, !z).subscribe(mkd0.H(new e30() { // from class: l.fo60
            public final void call(Object obj) {
                this.f8175a.m13135b0(user, act, z, (roj0) obj);
            }
        }, new e30() { // from class: l.go60
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m13124O(User user) {
        if (act().getString(R$string.f427R2).equals(this.f11911g.getText())) {
            return;
        }
        if (act() == null || !"p_christmas_profile".equals(act().m5432Z1())) {
            p6j0.m12915e(MatchScData.ModuleId.mid_e_follow, "p_album", j760.a("owner_id", ((DbObject) user).id), j760.a("receiver_user_id", ((DbObject) user).id));
        } else {
            p6j0.m12915e(MatchScData.ModuleId.mid_e_follow, "p_album", j760.a("owner_id", ((DbObject) user).id), j760.a("album_from", "p_christmas_profile"), j760.a("receiver_user_id", ((DbObject) user).id));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m13125P() {
        if (this.f11904J) {
            return;
        }
        this.f11904J = true;
        zvf0.A(MatchScData.ModuleId.mid_e_likeButton, "p_album", new j760[]{vwb.Y("moments_user_id", this.f11930z.f12283d), vwb.Y("moment_id", "")});
    }

    /* JADX INFO: renamed from: R */
    public String m13126R(String str) {
        String string;
        try {
            String strF = RemoteConfig.x().F("moment_greeting");
            if (TextUtils.isEmpty(strF)) {
                string = str;
            } else {
                JSONArray jSONArray = new JSONArray(new JSONObject(strF).getString(TEnum.equals(this.f11899E.gender, "female") ? "femaleDoc" : "maleDoc"));
                string = jSONArray.length() == 0 ? "" : jSONArray.getString(0);
            }
            return TextUtils.isEmpty(string) ? str : string;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: S */
    public final sy60 m13127S() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f11898D;
        if (photoAlbumBaseFrag == null) {
            return null;
        }
        return photoAlbumBaseFrag.f2915z;
    }

    /* JADX INFO: renamed from: T */
    public final void m13128T() {
        NullChecker.a(this.f11930z.f12289j);
    }

    /* JADX INFO: renamed from: U */
    public void m13129U() {
        if (NullChecker.a(this.f11895A)) {
            this.f11895A.m6160Q();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m13130V(final User user) {
        final d30 d30Var = new d30() { // from class: l.jo60
            public final void call() {
                po60.m13090f(user);
            }
        };
        final Boolean[] boolArr = {Boolean.FALSE};
        final boolean z = !TextUtils.equals("from_kan_kan", this.f11930z.f12284e);
        act().duringCreated(FeedModule.f315c.f670M.k()).first().subscribe(mkd0.H(new e30() { // from class: l.ko60
            public final void call(Object obj) {
                this.f9753a.m13136c0(user, boolArr, d30Var, z, (List) obj);
            }
        }, new e30() { // from class: l.lo60
            public final void call(Object obj) {
                this.f10080a.m13137d0(user, boolArr, d30Var, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public void m13131X(Bundle bundle) {
        this.f11906b.setLeftIconAsBack(act());
        m13083W();
        vqg.m15478G0(this.f11912h, new View.OnClickListener() { // from class: l.rn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12695a.m13093h0(view);
            }
        });
        xdl0.E0(this.f11923s, new View.OnClickListener() { // from class: l.co60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6698a.m13089e0(view);
            }
        });
        xdl0.E0(this.f11924t, new View.OnClickListener() { // from class: l.ho60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8782a.m13091f0(view);
            }
        });
        xdl0.E0(this.f11921q, new View.OnClickListener() { // from class: l.io60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9110a.m13092g0(view);
            }
        });
        this.f11909e.setOnClickListener(this);
        this.f11916l.setOnClickListener(this);
        this.f11917m.setOnClickListener(this);
        this.f11908d.setOnClickListener((View.OnClickListener) null);
        m13154y0(this.f11911g);
        m13154y0(this.f11914j);
        m13154y0(this.f11919o);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: X0 */
    public d7h mo3008X0() {
        this.f11897C = new d7h(this.f11896B);
        m13146p0();
        return this.f11897C;
    }

    /* JADX INFO: renamed from: Y */
    public void m13132Y(boolean z) {
        xdl0.M(this.f11927w, !z);
        xdl0.M(this.f11926v, z);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m13133Z(View view) {
        this.f11930z.m13633u0();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m13134a0(User user, boolean z, d30 d30Var, boolean z2, boolean z3, View view) {
        m13155z0(act(), user, z, d30Var, z2, z3);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m13135b0(User user, Act act, boolean z, roj0 roj0Var) {
        m13130V(user);
        act.progressDismiss();
        lsi0.q(z ? uzh.m15183p(act).mo14417j() : uzh.m15183p(act).mo14414g(), act.getResources().getDrawable(f3c0.f7750Z1));
        FeedModule.f316d.m16618cc(((DbObject) user).id, !z);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m13136c0(User user, Boolean[] boolArr, d30 d30Var, boolean z, List list) {
        boolean z2 = list != null && list.contains(((DbObject) user).id);
        if (user.isTeamAccount()) {
            this.f11906b.B();
        } else {
            m13119J(user, boolArr[0].booleanValue(), d30Var, z, z2);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m13137d0(User user, Boolean[] boolArr, d30 d30Var, boolean z, Throwable th) {
        if (user.isTeamAccount()) {
            this.f11906b.B();
        } else {
            m13119J(user, boolArr[0].booleanValue(), d30Var, z, false);
        }
    }

    public void destroy() {
        if (NullChecker.a(this.f11902H) && this.f11902H.d()) {
            this.f11902H.c();
        }
        if (NullChecker.a(this.f11901G) && this.f11901G.d()) {
            this.f11901G.b();
        }
        if (NullChecker.a(this.f11903I) && this.f11903I.d()) {
            this.f11903I.c();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m13138i0(View view) {
        this.f11901G.b();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM13113G = m13113G(layoutInflater, viewGroup);
        viewM13113G.setBackgroundColor(this.f11929y.getResources().getColor(e1c0.f7159p0));
        this.f11930z.m13630a1();
        act().setStatusBarColorResId(v0c0.p);
        return viewM13113G;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m13140j0(String str, boolean z, final Act act, User user, final d30 d30Var, VListCell vListCell, VListCell.a aVar, int i) {
        po60 po60Var;
        if (!TextUtils.equals(aVar.a, str)) {
            po60Var = this;
            if (TextUtils.equals(aVar.a, po60Var.act().getString(R$string.f649z4))) {
                kjb0.m11440D(act, ((DbObject) user).id, null, null, new d30() { // from class: l.ao60
                    public final void call() {
                        po60.m13095j(act, d30Var);
                    }
                }, "moment_page");
            } else if (TextUtils.equals(aVar.a, "取消喜欢")) {
                zvf0.u("e_unlike", "p_album_more_popup", new j760[]{vwb.Y("unlike_from", "profile_moment"), vwb.Y("other_user_id", NullChecker.a(user) ? ((DbObject) user).id : "")});
                swh.m14338f(act, user, po60Var.act().pageId(), new e30() { // from class: l.bo60
                    public final void call(Object obj) {
                        po60.m13080E((Relationship) obj);
                    }
                });
            } else if (TextUtils.equals(aVar.a, "取消关注")) {
                swh.m14337e(act, user, po60Var.act().pageId(), false);
            }
        } else if (!z) {
            po60Var = this;
            if (uzh.m15183p(act).mo14415h()) {
                po60Var.m13108A0(user, z, uzh.m15183p(act).mo14412e(), uzh.m15183p(act).mo14409b(), uzh.m15183p(act).mo14410c());
            } else {
                po60Var.m13123N(act, user, z);
            }
        } else if (uzh.m15183p(act).mo14411d()) {
            po60Var = this;
            po60Var.m13108A0(user, z, uzh.m15183p(act).mo14413f(), uzh.m15183p(act).mo14418k(user.isFemale()), uzh.m15183p(act).mo14416i());
        } else {
            po60Var = this;
            po60Var.m13123N(act, user, z);
        }
        po60Var.f11901G.b();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m13141k0(User user, boolean z, View view) {
        this.f11902H.c();
        m13123N(act(), user, z);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m13142l0(View view) {
        this.f11902H.c();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m13143m0(View view) {
        this.f11903I.c();
        FeedModule.f316d.m16634f7(FeedModule.m1139F().userId(), this.f11930z.f12289j, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m13144n0(View view) {
        this.f11903I.c();
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: n1 */
    public boolean mo3011n1(List<MomentItem> list, boolean z, User user, int i) {
        m13127S().m14387E(list, z, user, i);
        m13146p0();
        if (NullChecker.a(this.f11896B) && NullChecker.a(this.f11895A)) {
            this.f11895A.m6163T(this.f11930z.f12291l, this.f11896B.m4939C() >= 2);
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m13145o0() {
        AlbumButton albumButton;
        if (!User.isWisdomStar(((DbObject) this.f11899E).id)) {
            if (NullChecker.a(this.f11930z.f12289j)) {
                act().startActivity(kjb0.m11451c(act(), ((DbObject) this.f11930z.f12289j).id, false, false));
                return;
            }
            return;
        }
        NotifyUsers notifyUsersM16537R7 = FeedModule.f316d.m16537R7(((DbObject) this.f11899E).id);
        if (notifyUsersM16537R7 == null || (albumButton = notifyUsersM16537R7.albumButton) == null) {
            return;
        }
        String str = albumButton.deepLink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cxh.m9252b(act(), Uri.parse(str));
        zvf0.u("e_moment_post", act().pageId(), new j760[]{j760.a("robotname", this.f11899E.name)});
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (b5c0.f6034d == id) {
            boolean zM12213K = nkg.m12213K();
            qn60 qn60Var = this.f11930z;
            if (!zM12213K) {
                qn60Var.m13633u0();
                return;
            } else {
                zvf0.u(MatchScData.ModuleId.mid_e_likeButton, "p_album", new j760[]{vwb.Y("moments_user_id", qn60Var.f12283d), vwb.Y("moment_id", "")});
                FeedModule.m1140H().kn(act(), this.f11899E, !this.f11930z.f12292m, (String) null, LikeFrom.get("moment"), (String) null, (e30) null, (e30) null);
                return;
            }
        }
        if (b5c0.f6045f2 == id) {
            if (NullChecker.a(this.f11930z.f12289j)) {
                String string = act().getResources().getString(R$string.f644z);
                p6j0.m12913c("e_cancelfollow", "p_album", j760.a("owner_id", ((DbObject) this.f11930z.f12289j).id), j760.a("receiver_user_id", ((DbObject) this.f11930z.f12289j).id));
                m13114G0(string);
                return;
            }
            return;
        }
        if (b5c0.f5961F1 == id) {
            m13145o0();
        } else if (b5c0.f6090t == id) {
            this.f11929y.mo3012o();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m13146p0() {
        nl60 nl60Var = this.f11896B;
        boolean z = nl60Var != null && nl60Var.m12283A0() && (this.f11896B.m4939C() > 1 || !this.f11896B.m12284B0()) && this.f11930z.m13616F0();
        if (this.f11895A == null) {
            ViewGroup.LayoutParams pVar = new RecyclerView.p(-1, -2);
            AlbumFeedHeader albumFeedHeader = new AlbumFeedHeader(act());
            this.f11895A = albumFeedHeader;
            albumFeedHeader.setUserId(this.f11930z.f12283d);
            this.f11895A.m6161R(this.f11930z.f12283d);
            this.f11895A.setLayoutParams(pVar);
        }
        this.f11895A.m6166X(z, new e30() { // from class: l.mo60
            public final void call(Object obj) {
                this.f10528a.m13122M((String) obj);
            }
        });
        if (NullChecker.a(this.f11899E)) {
            this.f11895A.m6164V(this.f11899E, new d30() { // from class: l.no60
                public final void call() {
                    this.f10843a.m13128T();
                }
            });
        }
        AlbumFeedHeader albumFeedHeader2 = this.f11895A;
        d7h d7hVar = this.f11897C;
        if (albumFeedHeader2 != null) {
            if (d7hVar == null || d7hVar.A()) {
                return;
            }
            this.f11897C.H(this.f11895A);
            this.f11896B.m4968s0(1);
            return;
        }
        if (d7hVar == null || !d7hVar.A()) {
            return;
        }
        this.f11897C.D();
        this.f11896B.m4968s0(0);
    }

    /* JADX INFO: renamed from: q0 */
    public void m13147q0(User user) {
        boolean zM13152w0;
        boolean z;
        boolean z2;
        FollowshipStatus followshipStatus;
        boolean z3;
        if (this.f11930z.f12288i) {
            z3 = true;
            zM13152w0 = false;
            z = false;
            z2 = false;
        } else {
            if (user.isTeamAccount()) {
                boolean z4 = (User.isWisdomStar(((DbObject) user).id) && nkg.m12273x()) || (ovi.m12868a(((DbObject) user).id) && !this.f11900F);
                xdl0.D0(t100.d(256.0f), new View[]{this.f11916l});
                z = z4;
            } else if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && ovi.m12868a(((DbObject) user).id) && !this.f11900F) {
                xdl0.D0(t100.d(256.0f), new View[]{this.f11916l});
                z = true;
            } else {
                Followship followship = user.localFollowship;
                if (followship == null || (followshipStatus = followship.state) == null) {
                    if (!nkg.m12213K()) {
                        m13124O(user);
                    }
                    zM13152w0 = m13152w0(false, Color.parseColor("#ffffff"), FeedModule.f313a.getString(R$string.f427R2));
                } else if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    zM13152w0 = m13152w0(true, Color.parseColor("#bfbfbf"), FeedModule.f313a.getString(R$string.f415P2));
                } else if (TEnum.equals(user.localFollowship.state, "default") || TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(user.localFollowship.state, "unknown_")) {
                    if (!nkg.m12213K()) {
                        m13124O(user);
                    }
                    zM13152w0 = m13152w0(false, Color.parseColor("#ffffff"), FeedModule.f313a.getString(R$string.f427R2));
                } else if (!TEnum.equals(user.localFollowship.state, "matched")) {
                    zM13152w0 = false;
                    z = false;
                    z2 = z;
                    z3 = z2;
                } else if (ovi.m12868a(((DbObject) user).id)) {
                    z2 = !nkg.m12213K();
                    z = true;
                    zM13152w0 = false;
                    z3 = false;
                } else {
                    zM13152w0 = m13152w0(true, Color.parseColor("#bfbfbf"), FeedModule.f313a.getString(R$string.f403N2));
                }
                z = false;
                z2 = z;
                z3 = z2;
            }
            zM13152w0 = false;
            z2 = false;
            z3 = z2;
        }
        m13109B0(zM13152w0);
        boolean z5 = zM13152w0 || z || z3;
        m13118I0(this.f11917m, z2);
        m13118I0(this.f11909e, !(nkg.m12213K() && swh.m14341i(user)) && zM13152w0);
        m13118I0(this.f11915k, z);
        m13118I0(this.f11920p, z3);
        m13118I0(this.f11908d, z5);
        if (!m13111D0()) {
            m13130V(user);
        }
        boolean zM12868a = ovi.m12868a(((DbObject) user).id);
        if (nkg.m12227Y() && !this.f11930z.f12288i && !zM12868a && !User.isTeamAccount(((DbObject) user).id) && !z) {
            xdl0.M(this.f11908d, false);
            xdl0.M(this.f11922r, true);
            if (xdl0.O0(this.f11922r) && nkg.m12236e0()) {
                xdl0.M(this.f11924t, false);
            }
            if (swh.m14341i(user)) {
                xdl0.M(this.f11923s, false);
            }
        }
        if (User.isWisdomStar(((DbObject) user).id)) {
            NotifyUsers notifyUsersM16537R7 = FeedModule.f316d.m16537R7(((DbObject) user).id);
            if (notifyUsersM16537R7 == null || notifyUsersM16537R7.albumButton == null || !nkg.m12273x()) {
                xdl0.M(this.f11915k, false);
                return;
            }
            VButton vButton = this.f11916l;
            int i = t100.R;
            xdl0.V(vButton, i);
            xdl0.W(this.f11916l, i);
            xdl0.C0(this.f11916l, t100.B);
            this.f11916l.setText(notifyUsersM16537R7.albumButton.value);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m13148r0(List<RecommendMessage> list) {
        if (list == null || list.size() == 0) {
            m13132Y(false);
            this.f11925u.setImageResource(f3c0.f7819i);
            StringBuilder sb = new StringBuilder("聊聊");
            sb.append(TEnum.equals(this.f11899E.gender, "female") ? "她" : "他");
            sb.append("的动态吧，更有可能得到回复");
            this.f11927w.setText(m13126R(sb.toString()));
            this.f11927w.setTextColor(Color.parseColor("#26000000"));
            this.f11928x.setText(act().getString(R$string.f419Q0));
            m13112E0(this.f11899E, false);
            return;
        }
        if (list.size() == 1) {
            m13132Y(false);
            qib0.G.Q0(this.f11925u, this.f11899E.m1042fp().profileSmall());
            this.f11927w.setText(list.get(0).messageValue);
            this.f11927w.setTextColor(Color.parseColor("#e6000000"));
            this.f11928x.setText(TEnum.equals(this.f11899E.gender, "female") ? "回应她" : "回应他");
            m13112E0(this.f11899E, true);
            return;
        }
        m13112E0(this.f11899E, true);
        this.f11928x.setText(TEnum.equals(this.f11899E.gender, "female") ? "回应她" : "回应他");
        m13132Y(true);
        qib0.G.Q0(this.f11925u, this.f11899E.m1042fp().profileSmall());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).messageValue);
        }
        this.f11926v.setList(arrayList);
        this.f11926v.h(2000);
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: s0 */
    public C2124a mo3014s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f11898D;
        qn60 qn60Var = this.f11930z;
        VRecyclerView vRecyclerViewM13082Q = m13082Q();
        qn60 qn60Var2 = this.f11930z;
        nl60 nl60Var = new nl60(photoAlbumBaseFrag, qn60Var, vRecyclerViewM13082Q, qn60Var2.f12283d, "from_album", qn60Var2.f12285f, true);
        this.f11896B = nl60Var;
        return nl60Var;
    }

    /* JADX INFO: renamed from: t0 */
    public void m13149t0(boolean z) {
        User user;
        this.f11900F = !z;
        if (this.f11915k.getVisibility() != 0 || z || (user = this.f11899E) == null) {
            return;
        }
        m13147q0(user);
    }

    /* JADX INFO: renamed from: u0 */
    public void m13150u0(User user) {
        if (user == null) {
            CrashHelper.c(new Exception("PhotoAlbumProfileInfoView render user = null userId:" + this.f11930z.f12283d));
        } else {
            this.f11899E = user;
            m13146p0();
            m13147q0(user);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m13151v0(BubbleInfo bubbleInfo) {
        if (NullChecker.a(this.f11895A) && NullChecker.a(this.f11899E)) {
            this.f11895A.m6165W(this.f11899E, act(), "from_album", bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m13152w0(boolean z, @ColorInt int i, String str) {
        if (!nkg.m12213K()) {
            this.f11909e.setSelected(z);
            this.f11911g.setTextColor(i);
            this.f11911g.setText(str);
            return true;
        }
        if (swh.m14341i(this.f11899E)) {
            return true;
        }
        this.f11909e.setSelected(false);
        this.f11911g.setTextColor(Color.parseColor("#ffffff"));
        this.f11911g.setText("喜欢");
        m13125P();
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public void m13153x0() {
        this.f11898D.m5072h5(this);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m13154y0(TextView textView) {
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m13155z0(final Act act, final User user, boolean z, final d30 d30Var, boolean z2, final boolean z3) {
        String strMo14419l;
        ArrayList arrayList = new ArrayList();
        cwf0 cwf0Var = f11894K;
        cwf0Var.p(new j760[]{vwb.Y("other_user_id", NullChecker.a(user) ? ((DbObject) user).id : "")});
        if (nkg.m12213K()) {
            if (swh.m14344l(user)) {
                arrayList.add("取消喜欢");
            } else if (swh.m14340h(user)) {
                arrayList.add("取消关注");
            }
        }
        if (z2) {
            strMo14419l = !z3 ? uzh.m15183p(act).mo14419l() : uzh.m15183p(act).mo14408a();
            arrayList.add(strMo14419l);
        } else {
            strMo14419l = null;
        }
        final String str = strMo14419l;
        if (z) {
            arrayList.add(act().getString(R$string.f649z4));
        }
        c40.b bVar = new c40.b(act());
        bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.xn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15047a.m13138i0(view);
            }
        }).T(new DialogInterface.OnDismissListener() { // from class: l.yn60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                po60.m13085b(dialogInterface);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.zn60
            /* JADX INFO: renamed from: a */
            public final void m17513a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f15806a.m13140j0(str, z3, act, user, d30Var, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f11901G = c40VarF;
        c40VarF.f();
        if (cwf0Var != null) {
            cwf0Var.i();
            cwf0Var.l();
        }
    }

    @Override // p007l.yzl
    /* JADX INFO: renamed from: q */
    public void mo3013q() {
    }

    /* JADX INFO: renamed from: B0 */
    public void m13109B0(boolean z) {
    }
}
