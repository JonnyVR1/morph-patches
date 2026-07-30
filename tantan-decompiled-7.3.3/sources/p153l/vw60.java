package p153l;

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
import androidx.fragment.app.AbstractC0428k;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.AlbumButton;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.AlbumFeedHeader;
import com.p051p1.mobile.putong.newui.view.CoreAutoScrollTextView;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class vw60 implements iam<wv60>, View.OnClickListener, s2m {

    /* JADX INFO: renamed from: K */
    public static final l4g0 f186067K = w1e.m204399c("p_album_more_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: A */
    public AlbumFeedHeader f186068A;

    /* JADX INFO: renamed from: B */
    public tt60 f186069B;

    /* JADX INFO: renamed from: C */
    public s8h f186070C;

    /* JADX INFO: renamed from: D */
    public PhotoAlbumBaseFrag f186071D;

    /* JADX INFO: renamed from: E */
    public User f186072E;

    /* JADX INFO: renamed from: F */
    public boolean f186073F;

    /* JADX INFO: renamed from: G */
    public w30 f186074G;

    /* JADX INFO: renamed from: H */
    public th0 f186075H;

    /* JADX INFO: renamed from: I */
    public th0 f186076I;

    /* JADX INFO: renamed from: J */
    public boolean f186077J;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f186078a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f186079b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f186080c;

    /* JADX INFO: renamed from: d */
    public VFrame f186081d;

    /* JADX INFO: renamed from: e */
    public VLinear f186082e;

    /* JADX INFO: renamed from: f */
    public VImage f186083f;

    /* JADX INFO: renamed from: g */
    public VText f186084g;

    /* JADX INFO: renamed from: h */
    public VLinear f186085h;

    /* JADX INFO: renamed from: i */
    public VImage f186086i;

    /* JADX INFO: renamed from: j */
    public VText f186087j;

    /* JADX INFO: renamed from: k */
    public VRelative f186088k;

    /* JADX INFO: renamed from: l */
    public VButton f186089l;

    /* JADX INFO: renamed from: m */
    public VLinear f186090m;

    /* JADX INFO: renamed from: n */
    public VImage f186091n;

    /* JADX INFO: renamed from: o */
    public VText f186092o;

    /* JADX INFO: renamed from: p */
    public VRelative f186093p;

    /* JADX INFO: renamed from: q */
    public VButton f186094q;

    /* JADX INFO: renamed from: r */
    public ConstraintLayout f186095r;

    /* JADX INFO: renamed from: s */
    public VLinear f186096s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f186097t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f186098u;

    /* JADX INFO: renamed from: v */
    public CoreAutoScrollTextView f186099v;

    /* JADX INFO: renamed from: w */
    public TextView f186100w;

    /* JADX INFO: renamed from: x */
    public TextView f186101x;

    /* JADX INFO: renamed from: y */
    public PersonalPhotoAlbumFeedFrag f186102y;

    /* JADX INFO: renamed from: z */
    public wv60 f186103z;

    public vw60(PersonalPhotoAlbumFeedFrag personalPhotoAlbumFeedFrag) {
        this.f186102y = personalPhotoAlbumFeedFrag;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m203074E(Relationship relationship) {
    }

    /* JADX INFO: renamed from: Q */
    private VRecyclerView m203076Q() {
        return m203120S().f197638b;
    }

    /* JADX INFO: renamed from: W */
    private void m203077W() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = (PhotoAlbumBaseFrag) this.f186102y.getChildFragmentManager().m2558i0("PhotoAlbumFeedBaseFrag");
        this.f186071D = photoAlbumBaseFrag;
        if (NullChecker.m82486a(photoAlbumBaseFrag)) {
            this.f186071D.m65213k5(true);
            this.f186071D.m65212j5(true);
            m203145x0();
            return;
        }
        wv60 wv60Var = this.f186103z;
        PhotoAlbumBaseFrag photoAlbumBaseFragM65187N4 = PhotoAlbumBaseFrag.m65187N4(wv60Var.f190926m, wv60Var.f190917d, wv60Var.f190918e, wv60Var.f190920g, wv60Var.f190921h, wv60Var.f190919f, true);
        this.f186071D = photoAlbumBaseFragM65187N4;
        photoAlbumBaseFragM65187N4.m65213k5(true);
        this.f186071D.m65212j5(true);
        m203145x0();
        AbstractC0428k abstractC0428kM2568m = this.f186102y.getChildFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108918g, this.f186071D, "PhotoAlbumFeedBaseFrag");
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m203079b(DialogInterface dialogInterface) {
        l4g0 l4g0Var = f186067K;
        if (l4g0Var != null) {
            l4g0Var.m152776k();
            l4g0Var.m152775j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m203083e0(View view) {
        i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, "p_album", jyb.m147494Y("moments_user_id", this.f186072E.f56859id));
        FeedModule.m61406H().mo31791kn(getAct(), this.f186072E, !this.f186103z.f190926m, null, LikeFrom.get("moment"), null, null, null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m203084f(User user) {
        user.localRelationship = null;
        FeedModule.f39703d.m145539Ic(user, false);
        FeedModule.f39703d.m145678cc(user.f56859id, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m203085f0(View view) {
        FeedModule.f39702c.m61908f3(getAct(), this.f186072E, null, "p_album", this.f186103z.f190926m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m203086g0(View view) {
        m203114L();
        tfj0.m190940c("e_moment_post", "p_album", pf60.m172085a("album_post_source", "bottom_post_button"), pf60.m172085a("post_guide_type", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m203087h0(View view) {
        tfj0.m190940c("e_send_message", getAct().pageId(), pf60.m172085a("is_match", 0), pf60.m172085a("owner_id", this.f186072E.f56859id));
        FeedModule.f39702c.m61908f3(getAct(), this.f186072E, null, "p_album", this.f186103z.f190926m);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m203089j(Act act, x20 x20Var) {
        act.supportInvalidateOptionsMenu();
        x20Var.call();
    }

    /* JADX INFO: renamed from: A0 */
    public void m203102A0(final User user, final boolean z, String str, String str2, String str3) {
        th0.C20312a c20312a = new th0.C20312a(getAct());
        c20312a.m191160s(str).m191151j(str2).m191159r(str3).m191156o(new View.OnClickListener() { // from class: l.jw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122883a.m203133k0(user, z, view);
            }
        }).m191146e(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.kw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129034a.m203134l0(view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        this.f186075H = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m203104D0() {
        gj70.C17230a c17230a = gj70.m130463a().m130464b().get(this.f186103z.f190918e);
        return "from_activities_moment".equals(this.f186103z.f190918e) || c17230a == null || !c17230a.f104610b || FeedModule.m61405F().userId().equals(this.f186103z.f190917d);
    }

    /* JADX INFO: renamed from: E0 */
    public void m203105E0(User user, boolean z) {
        tfj0.m190942e("e_send_message", getAct().pageId(), pf60.m172085a("is_reply", Integer.valueOf(z ? 1 : 0)), pf60.m172085a("is_match", 0), pf60.m172085a("owner_id", user.f56859id));
    }

    /* JADX INFO: renamed from: G */
    public View m203106G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ww60.m208154b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G0 */
    public void m203107G0(String str) {
        th0.C20312a c20312a = new th0.C20312a(getAct());
        c20312a.m191151j(str).m191158q(R$string.f39983r).m191157p(k9c0.f124521n).m191156o(new View.OnClickListener() { // from class: l.uw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181242a.m203135m0(view);
            }
        }).m191146e(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.yv60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201683a.m203136n0(view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        this.f186076I = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: H */
    public void m203108H() {
        ww60.m208155c(this);
    }

    /* JADX INFO: renamed from: H0 */
    public void m203109H0(String str) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return;
        }
        if (NullChecker.m82486a(this.f186103z.f190925l) && "moment_post_bubble".equals(str) && !jyb.m147479J(this.f186103z.f190925l.f77081a)) {
            TopicOperations topicOperations = (TopicOperations) jyb.m147529r(this.f186103z.f190925l.f77081a, new qcj() { // from class: l.zv60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((TopicOperations) obj).operationType, "bubble"));
                }
            });
            if (NullChecker.m82486a(topicOperations)) {
                final String str2 = topicOperations.postGuide.topicId;
                if (!TextUtils.isEmpty(str2) && !jyb.m147479J(this.f186103z.f190925l.f77082b)) {
                    TopicMoment topicMoment = (TopicMoment) jyb.m147529r(this.f186103z.f190925l.f77082b, new qcj() { // from class: l.aw60
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(str2));
                        }
                    });
                    if (NullChecker.m82486a(topicMoment)) {
                        cn40.m111400m0(this.f186102y.act(), jyb.m147507f0(new Media[0]), true, str, topicOperations.postGuide.momentValue, topicOperations.operationType.toString(), topicMoment);
                        return;
                    }
                }
                cn40.m111398l0(this.f186102y.act(), jyb.m147507f0(new Media[0]), true, str, topicOperations.postGuide.momentValue, topicOperations.operationType.toString());
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            cn40.m111396k0(getAct(), jyb.m147507f0(new Media[0]), true, "myalbum");
        } else {
            cn40.m111396k0(this.f186102y.act(), jyb.m147507f0(new Media[0]), true, str);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public PhotoAlbumFeedAct getAct() {
        return (PhotoAlbumFeedAct) this.f186102y.act();
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m203111I0(View view, boolean z) {
        int i = z ? 0 : 8;
        if (view.getVisibility() == i) {
            return false;
        }
        view.setVisibility(i);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public void m203112J(final User user, final boolean z, final x20 x20Var, final boolean z2, final boolean z3) {
        this.f186079b.m224830B();
        if (cmg.m111198Z()) {
            VText vText = new VText(getAct());
            vText.setText(this.f186084g.getText().toString());
            vText.setTextSize(16.0f);
            String string = this.f186084g.getText().toString();
            string.getClass();
            if (string.equals("关注")) {
                vText.setTextColor(Color.parseColor("#fe7e1d"));
            } else {
                vText.setTextColor(Color.parseColor("#26000000"));
            }
            if (TextUtils.equals(vText.getText().toString(), getAct().getString(R$string.f39790N2))) {
                return;
            }
            this.f186079b.m224835z(vText);
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.bw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f78685a.m203126Z(view);
                }
            });
        }
        this.f186079b.m224834w(lbc0.f131126r, new View.OnClickListener() { // from class: l.cw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84097a.m203127a0(user, z, x20Var, z2, z3, view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wv60 wv60Var) {
        this.f186103z = wv60Var;
    }

    /* JADX INFO: renamed from: L */
    public final void m203114L() {
        m203115M(null);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: L0 */
    public n570 mo63211L0() {
        return this.f186103z.m208013C0();
    }

    /* JADX INFO: renamed from: M */
    public final void m203115M(String str) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (!NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            m203109H0(str);
        } else if (audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            o1j0.m165649w(R$string.f39730D2);
        } else {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: N */
    public void m203116N(final Act act, final User user, final boolean z) {
        act.progress(R$string.f39832U2, true);
        FeedModule.f39702c.f40057M.m61956M(user.f56859id, !z).subscribe(psd0.m173597H(new y20() { // from class: l.lw60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133779a.m203128b0(user, act, z, (uxj0) obj);
            }
        }, new y20() { // from class: l.mw60
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m203117O(User user) {
        if (getAct().getString(R$string.f39814R2).equals(this.f186084g.getText())) {
            return;
        }
        if (getAct() == null || !"p_christmas_profile".equals(getAct().m65541a2())) {
            tfj0.m190942e(MatchScData.ModuleId.mid_e_follow, "p_album", pf60.m172085a("owner_id", user.f56859id), pf60.m172085a("receiver_user_id", user.f56859id));
        } else {
            tfj0.m190942e(MatchScData.ModuleId.mid_e_follow, "p_album", pf60.m172085a("owner_id", user.f56859id), pf60.m172085a("album_from", "p_christmas_profile"), pf60.m172085a("receiver_user_id", user.f56859id));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m203118P() {
        if (this.f186077J) {
            return;
        }
        this.f186077J = true;
        i4g0.m138492A(MatchScData.ModuleId.mid_e_likeButton, "p_album", jyb.m147494Y("moments_user_id", this.f186103z.f190917d), jyb.m147494Y("moment_id", ""));
    }

    /* JADX INFO: renamed from: R */
    public String m203119R(String str) {
        String string;
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_greeting");
            if (TextUtils.isEmpty(strM80485F)) {
                string = str;
            } else {
                JSONArray jSONArray = new JSONArray(new JSONObject(strM80485F).getString(TEnum.equals(this.f186072E.gender, "female") ? "femaleDoc" : "maleDoc"));
                string = jSONArray.length() == 0 ? "" : jSONArray.getString(0);
            }
            return TextUtils.isEmpty(string) ? str : string;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return str;
        }
    }

    /* JADX INFO: renamed from: S */
    public final y670 m203120S() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f186071D;
        if (photoAlbumBaseFrag == null) {
            return null;
        }
        return photoAlbumBaseFrag.f42302z;
    }

    /* JADX INFO: renamed from: T */
    public final void m203121T() {
        NullChecker.m82486a(this.f186103z.f190923j);
    }

    /* JADX INFO: renamed from: U */
    public void m203122U() {
        if (NullChecker.m82486a(this.f186068A)) {
            this.f186068A.m66242Q();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m203123V(final User user) {
        final x20 x20Var = new x20() { // from class: l.pw60
            @Override // p153l.x20
            public final void call() {
                vw60.m203084f(user);
            }
        };
        final Boolean[] boolArr = {Boolean.FALSE};
        final boolean z = !TextUtils.equals("from_kan_kan", this.f186103z.f190918e);
        getAct().duringCreated(FeedModule.f39702c.f40057M.m159274k()).first().subscribe(psd0.m173597H(new y20() { // from class: l.qw60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159864a.m203129c0(user, boolArr, x20Var, z, (List) obj);
            }
        }, new y20() { // from class: l.rw60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165112a.m203130d0(user, boolArr, x20Var, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public void m203124X(Bundle bundle) {
        this.f186079b.setLeftIconAsBack(getAct());
        m203077W();
        ksg.m151167G0(this.f186085h, new View.OnClickListener() { // from class: l.xv60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196354a.m203087h0(view);
            }
        });
        bnl0.m105509E0(this.f186096s, new View.OnClickListener() { // from class: l.iw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117249a.m203083e0(view);
            }
        });
        bnl0.m105509E0(this.f186097t, new View.OnClickListener() { // from class: l.nw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143924a.m203085f0(view);
            }
        });
        bnl0.m105509E0(this.f186094q, new View.OnClickListener() { // from class: l.ow60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149456a.m203086g0(view);
            }
        });
        this.f186082e.setOnClickListener(this);
        this.f186089l.setOnClickListener(this);
        this.f186090m.setOnClickListener(this);
        this.f186081d.setOnClickListener(null);
        m203146y0(this.f186084g);
        m203146y0(this.f186087j);
        m203146y0(this.f186092o);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: X0 */
    public s8h mo63215X0() {
        this.f186070C = new s8h(this.f186069B);
        m203138p0();
        return this.f186070C;
    }

    /* JADX INFO: renamed from: Y */
    public void m203125Y(boolean z) {
        bnl0.m105524M(this.f186100w, !z);
        bnl0.m105524M(this.f186099v, z);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m203126Z(View view) {
        this.f186103z.m208031u0();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m203127a0(User user, boolean z, x20 x20Var, boolean z2, boolean z3, View view) {
        m203147z0(getAct(), user, z, x20Var, z2, z3);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m203128b0(User user, Act act, boolean z, uxj0 uxj0Var) {
        m203123V(user);
        act.progressDismiss();
        o1j0.m165643q(z ? j1i.m143129p(act).mo133341j() : j1i.m143129p(act).mo133338g(), act.getResources().getDrawable(lbc0.f130985Z1));
        FeedModule.f39703d.m145678cc(user.f56859id, !z);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m203129c0(User user, Boolean[] boolArr, x20 x20Var, boolean z, List list) {
        boolean z2 = list != null && list.contains(user.f56859id);
        if (user.isTeamAccount()) {
            this.f186079b.m224830B();
        } else {
            m203112J(user, boolArr[0].booleanValue(), x20Var, z, z2);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m203130d0(User user, Boolean[] boolArr, x20 x20Var, boolean z, Throwable th) {
        if (user.isTeamAccount()) {
            this.f186079b.m224830B();
        } else {
            m203112J(user, boolArr[0].booleanValue(), x20Var, z, false);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f186075H) && this.f186075H.m191138d()) {
            this.f186075H.m191137c();
        }
        if (NullChecker.m82486a(this.f186074G) && this.f186074G.m204616d()) {
            this.f186074G.m204614b();
        }
        if (NullChecker.m82486a(this.f186076I) && this.f186076I.m191138d()) {
            this.f186076I.m191137c();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m203131i0(View view) {
        this.f186074G.m204614b();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM203106G = m203106G(layoutInflater, viewGroup);
        viewM203106G.setBackgroundColor(this.f186102y.getResources().getColor(k9c0.f124526p0));
        this.f186103z.m208028a1();
        getAct().setStatusBarColorResId(b9c0.f75570p);
        return viewM203106G;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m203132j0(String str, boolean z, final Act act, User user, final x20 x20Var, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        vw60 vw60Var;
        if (!TextUtils.equals(c22660a.f210081a, str)) {
            vw60Var = this;
            if (TextUtils.equals(c22660a.f210081a, vw60Var.getAct().getString(R$string.f40036z4))) {
                orb0.m168875D(act, user.f56859id, null, null, new x20() { // from class: l.gw60
                    @Override // p153l.x20
                    public final void call() {
                        vw60.m203089j(act, x20Var);
                    }
                }, "moment_page");
            } else if (TextUtils.equals(c22660a.f210081a, "取消喜欢")) {
                i4g0.m138523u("e_unlike", "p_album_more_popup", jyb.m147494Y("unlike_from", "profile_moment"), jyb.m147494Y("other_user_id", NullChecker.m82486a(user) ? user.f56859id : ""));
                hyh.m137729f(act, user, vw60Var.getAct().pageId(), new y20() { // from class: l.hw60
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vw60.m203074E((Relationship) obj);
                    }
                });
            } else if (TextUtils.equals(c22660a.f210081a, "取消关注")) {
                hyh.m137728e(act, user, vw60Var.getAct().pageId(), false);
            }
        } else if (!z) {
            vw60Var = this;
            if (j1i.m143129p(act).mo133339h()) {
                vw60Var.m203102A0(user, z, j1i.m143129p(act).mo133336e(), j1i.m143129p(act).mo133333b(), j1i.m143129p(act).mo133334c());
            } else {
                vw60Var.m203116N(act, user, z);
            }
        } else if (j1i.m143129p(act).mo133335d()) {
            vw60Var = this;
            vw60Var.m203102A0(user, z, j1i.m143129p(act).mo133337f(), j1i.m143129p(act).mo133342k(user.isFemale()), j1i.m143129p(act).mo133340i());
        } else {
            vw60Var = this;
            vw60Var.m203116N(act, user, z);
        }
        vw60Var.f186074G.m204614b();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m203133k0(User user, boolean z, View view) {
        this.f186075H.m191137c();
        m203116N(getAct(), user, z);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m203134l0(View view) {
        this.f186075H.m191137c();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m203135m0(View view) {
        this.f186076I.m191137c();
        FeedModule.f39703d.m145694f7(FeedModule.m61405F().userId(), this.f186103z.f190923j, false);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m203136n0(View view) {
        this.f186076I.m191137c();
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: n1 */
    public boolean mo63216n1(List<MomentItem> list, boolean z, User user, int i) {
        m203120S().m214385E(list, z, user, i);
        m203138p0();
        if (NullChecker.m82486a(this.f186069B) && NullChecker.m82486a(this.f186068A)) {
            this.f186068A.m66245T(this.f186103z.f190925l, this.f186069B.getPageCount() >= 2);
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m203137o0() {
        AlbumButton albumButton;
        if (!User.isWisdomStar(this.f186072E.f56859id)) {
            if (NullChecker.m82486a(this.f186103z.f190923j)) {
                getAct().startActivity(orb0.m168886c(getAct(), this.f186103z.f190923j.f56859id, false, false));
                return;
            }
            return;
        }
        NotifyUsers notifyUsersM145597R7 = FeedModule.f39703d.m145597R7(this.f186072E.f56859id);
        if (notifyUsersM145597R7 == null || (albumButton = notifyUsersM145597R7.albumButton) == null) {
            return;
        }
        String str = albumButton.deepLink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ryh.m183607b(getAct(), Uri.parse(str));
        i4g0.m138523u("e_moment_post", getAct().pageId(), pf60.m172085a("robotname", this.f186072E.name));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (hdc0.f108906d == id) {
            boolean zM111183K = cmg.m111183K();
            wv60 wv60Var = this.f186103z;
            if (!zM111183K) {
                wv60Var.m208031u0();
                return;
            } else {
                i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, "p_album", jyb.m147494Y("moments_user_id", wv60Var.f190917d), jyb.m147494Y("moment_id", ""));
                FeedModule.m61406H().mo31791kn(getAct(), this.f186072E, !this.f186103z.f190926m, null, LikeFrom.get("moment"), null, null, null);
                return;
            }
        }
        if (hdc0.f108917f2 == id) {
            if (NullChecker.m82486a(this.f186103z.f190923j)) {
                String string = getAct().getResources().getString(R$string.f40031z);
                tfj0.m190940c("e_cancelfollow", "p_album", pf60.m172085a("owner_id", this.f186103z.f190923j.f56859id), pf60.m172085a("receiver_user_id", this.f186103z.f190923j.f56859id));
                m203107G0(string);
                return;
            }
            return;
        }
        if (hdc0.f108833F1 == id) {
            m203137o0();
        } else if (hdc0.f108962t == id) {
            this.f186102y.mo63217o();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m203138p0() {
        tt60 tt60Var = this.f186069B;
        boolean z = tt60Var != null && tt60Var.m192654A0() && (this.f186069B.getPageCount() > 1 || !this.f186069B.m192655B0()) && this.f186103z.m208015F0();
        if (this.f186068A == null) {
            RecyclerView.C0580p c0580p = new RecyclerView.C0580p(-1, -2);
            AlbumFeedHeader albumFeedHeader = new AlbumFeedHeader(getAct());
            this.f186068A = albumFeedHeader;
            albumFeedHeader.setUserId(this.f186103z.f190917d);
            this.f186068A.m66243R(this.f186103z.f190917d);
            this.f186068A.setLayoutParams(c0580p);
        }
        this.f186068A.m66248X(z, new y20() { // from class: l.sw60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170924a.m203115M((String) obj);
            }
        });
        if (NullChecker.m82486a(this.f186072E)) {
            this.f186068A.m66246V(this.f186072E, new x20() { // from class: l.tw60
                @Override // p153l.x20
                public final void call() {
                    this.f176378a.m203121T();
                }
            });
        }
        AlbumFeedHeader albumFeedHeader2 = this.f186068A;
        s8h s8hVar = this.f186070C;
        if (albumFeedHeader2 != null) {
            if (s8hVar == null || s8hVar.m222259A()) {
                return;
            }
            this.f186070C.m222265H(this.f186068A);
            this.f186069B.m65113s0(1);
            return;
        }
        if (s8hVar == null || !s8hVar.m222259A()) {
            return;
        }
        this.f186070C.m222261D();
        this.f186069B.m65113s0(0);
    }

    /* JADX INFO: renamed from: q0 */
    public void m203139q0(User user) {
        boolean zM203144w0;
        boolean z;
        boolean z2;
        FollowshipStatus followshipStatus;
        boolean z3;
        if (this.f186103z.f190922i) {
            z3 = true;
            zM203144w0 = false;
            z = false;
            z2 = false;
        } else {
            if (user.isTeamAccount()) {
                boolean z4 = (User.isWisdomStar(user.f56859id) && cmg.m111243x()) || (kyi.m151972a(user.f56859id) && !this.f186073F);
                bnl0.m105507D0(qa00.m175859d(256.0f), this.f186089l);
                z = z4;
            } else if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched") && kyi.m151972a(user.f56859id) && !this.f186073F) {
                bnl0.m105507D0(qa00.m175859d(256.0f), this.f186089l);
                z = true;
            } else {
                Followship followship = user.localFollowship;
                if (followship == null || (followshipStatus = followship.state) == null) {
                    if (!cmg.m111183K()) {
                        m203117O(user);
                    }
                    zM203144w0 = m203144w0(false, Color.parseColor("#ffffff"), FeedModule.f39700a.getString(R$string.f39814R2));
                } else if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                    zM203144w0 = m203144w0(true, Color.parseColor("#bfbfbf"), FeedModule.f39700a.getString(R$string.f39802P2));
                } else if (TEnum.equals(user.localFollowship.state, "default") || TEnum.equals(user.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(user.localFollowship.state, FollowshipStatus.unfollow) || TEnum.equals(user.localFollowship.state, "unknown_")) {
                    if (!cmg.m111183K()) {
                        m203117O(user);
                    }
                    zM203144w0 = m203144w0(false, Color.parseColor("#ffffff"), FeedModule.f39700a.getString(R$string.f39814R2));
                } else if (!TEnum.equals(user.localFollowship.state, "matched")) {
                    zM203144w0 = false;
                    z = false;
                    z2 = z;
                    z3 = z2;
                } else if (kyi.m151972a(user.f56859id)) {
                    z2 = !cmg.m111183K();
                    z = true;
                    zM203144w0 = false;
                    z3 = false;
                } else {
                    zM203144w0 = m203144w0(true, Color.parseColor("#bfbfbf"), FeedModule.f39700a.getString(R$string.f39790N2));
                }
                z = false;
                z2 = z;
                z3 = z2;
            }
            zM203144w0 = false;
            z2 = false;
            z3 = z2;
        }
        m203103B0(zM203144w0);
        boolean z5 = zM203144w0 || z || z3;
        m203111I0(this.f186090m, z2);
        m203111I0(this.f186082e, !(cmg.m111183K() && hyh.m137732i(user)) && zM203144w0);
        m203111I0(this.f186088k, z);
        m203111I0(this.f186093p, z3);
        m203111I0(this.f186081d, z5);
        if (!m203104D0()) {
            m203123V(user);
        }
        boolean zM151972a = kyi.m151972a(user.f56859id);
        if (cmg.m111197Y() && !this.f186103z.f190922i && !zM151972a && !User.isTeamAccount(user.f56859id) && !z) {
            bnl0.m105524M(this.f186081d, false);
            bnl0.m105524M(this.f186095r, true);
            if (bnl0.m105529O0(this.f186095r) && cmg.m111206e0()) {
                bnl0.m105524M(this.f186097t, false);
            }
            if (hyh.m137732i(user)) {
                bnl0.m105524M(this.f186096s, false);
            }
        }
        if (User.isWisdomStar(user.f56859id)) {
            NotifyUsers notifyUsersM145597R7 = FeedModule.f39703d.m145597R7(user.f56859id);
            if (notifyUsersM145597R7 == null || notifyUsersM145597R7.albumButton == null || !cmg.m111243x()) {
                bnl0.m105524M(this.f186088k, false);
                return;
            }
            VButton vButton = this.f186089l;
            int i = qa00.f156305R;
            bnl0.m105538V(vButton, i);
            bnl0.m105539W(this.f186089l, i);
            bnl0.m105505C0(this.f186089l, qa00.f156289B);
            this.f186089l.setText(notifyUsersM145597R7.albumButton.value);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m203140r0(List<RecommendMessage> list) {
        if (list == null || list.size() == 0) {
            m203125Y(false);
            this.f186098u.setImageResource(lbc0.f131054i);
            StringBuilder sb = new StringBuilder("聊聊");
            sb.append(TEnum.equals(this.f186072E.gender, "female") ? "她" : "他");
            sb.append("的动态吧，更有可能得到回复");
            this.f186100w.setText(m203119R(sb.toString()));
            this.f186100w.setTextColor(Color.parseColor("#26000000"));
            this.f186101x.setText(getAct().getString(R$string.f39806Q0));
            m203105E0(this.f186072E, false);
            return;
        }
        if (list.size() == 1) {
            m203125Y(false);
            uqb0.f180374G.m127125Q0(this.f186098u, this.f186072E.m61308fp().profileSmall());
            this.f186100w.setText(list.get(0).messageValue);
            this.f186100w.setTextColor(Color.parseColor("#e6000000"));
            this.f186101x.setText(TEnum.equals(this.f186072E.gender, "female") ? "回应她" : "回应他");
            m203105E0(this.f186072E, true);
            return;
        }
        m203105E0(this.f186072E, true);
        this.f186101x.setText(TEnum.equals(this.f186072E.gender, "female") ? "回应她" : "回应他");
        m203125Y(true);
        uqb0.f180374G.m127125Q0(this.f186098u, this.f186072E.m61308fp().profileSmall());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).messageValue);
        }
        this.f186099v.setList(arrayList);
        this.f186099v.m80332h(2000);
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: s0 */
    public C11443a mo63219s0() {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f186071D;
        wv60 wv60Var = this.f186103z;
        VRecyclerView vRecyclerViewM203076Q = m203076Q();
        wv60 wv60Var2 = this.f186103z;
        tt60 tt60Var = new tt60(photoAlbumBaseFrag, wv60Var, vRecyclerViewM203076Q, wv60Var2.f190917d, "from_album", wv60Var2.f190919f, true);
        this.f186069B = tt60Var;
        return tt60Var;
    }

    /* JADX INFO: renamed from: t0 */
    public void m203141t0(boolean z) {
        User user;
        this.f186073F = !z;
        if (this.f186088k.getVisibility() != 0 || z || (user = this.f186072E) == null) {
            return;
        }
        m203139q0(user);
    }

    /* JADX INFO: renamed from: u0 */
    public void m203142u0(User user) {
        if (user == null) {
            CrashHelper.m82479c(new Exception("PhotoAlbumProfileInfoView render user = null userId:" + this.f186103z.f190917d));
        } else {
            this.f186072E = user;
            m203138p0();
            m203139q0(user);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m203143v0(BubbleInfo bubbleInfo) {
        if (NullChecker.m82486a(this.f186068A) && NullChecker.m82486a(this.f186072E)) {
            this.f186068A.m66247W(this.f186072E, getAct(), "from_album", bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m203144w0(boolean z, @ColorInt int i, String str) {
        if (!cmg.m111183K()) {
            this.f186082e.setSelected(z);
            this.f186084g.setTextColor(i);
            this.f186084g.setText(str);
            return true;
        }
        if (hyh.m137732i(this.f186072E)) {
            return true;
        }
        this.f186082e.setSelected(false);
        this.f186084g.setTextColor(Color.parseColor("#ffffff"));
        this.f186084g.setText("喜欢");
        m203118P();
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public void m203145x0() {
        this.f186071D.m65210h5(this);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m203146y0(TextView textView) {
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m203147z0(final Act act, final User user, boolean z, final x20 x20Var, boolean z2, final boolean z3) {
        String strMo133343l;
        ArrayList arrayList = new ArrayList();
        l4g0 l4g0Var = f186067K;
        l4g0Var.m152781p(jyb.m147494Y("other_user_id", NullChecker.m82486a(user) ? user.f56859id : ""));
        if (cmg.m111183K()) {
            if (hyh.m137735l(user)) {
                arrayList.add("取消喜欢");
            } else if (hyh.m137731h(user)) {
                arrayList.add("取消关注");
            }
        }
        if (z2) {
            strMo133343l = !z3 ? j1i.m143129p(act).mo133343l() : j1i.m143129p(act).mo133332a();
            arrayList.add(strMo133343l);
        } else {
            strMo133343l = null;
        }
        final String str = strMo133343l;
        if (z) {
            arrayList.add(getAct().getString(R$string.f40036z4));
        }
        w30.C21001b c21001b = new w30.C21001b(getAct());
        c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.dw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91001a.m203131i0(view);
            }
        }).m204668T(new DialogInterface.OnDismissListener() { // from class: l.ew60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vw60.m203079b(dialogInterface);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.fw60
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f101127a.m203132j0(str, z3, act, user, x20Var, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f186074G = w30VarM204654F;
        w30VarM204654F.m204618f();
        if (l4g0Var != null) {
            l4g0Var.m152774i();
            l4g0Var.m152777l();
        }
    }

    @Override // p153l.s2m
    /* JADX INFO: renamed from: p */
    public void mo63218p() {
    }

    /* JADX INFO: renamed from: B0 */
    public void m203103B0(boolean z) {
    }
}
