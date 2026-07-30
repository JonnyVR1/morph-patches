package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VListCell;
import p151v.VText;
import p153l.at0;
import p153l.b370;
import p153l.bch;
import p153l.bnl0;
import p153l.cmg;
import p153l.d4h;
import p153l.er60;
import p153l.fgc0;
import p153l.gt0;
import p153l.hdc0;
import p153l.i4g0;
import p153l.jeh;
import p153l.jh5;
import p153l.jyb;
import p153l.k3h;
import p153l.k570;
import p153l.k9c0;
import p153l.ksg;
import p153l.l51;
import p153l.lbc0;
import p153l.o1j0;
import p153l.omg;
import p153l.orb0;
import p153l.pf60;
import p153l.pfh;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.tec0;
import p153l.tfj0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.v370;
import p153l.w30;
import p153l.x20;
import p153l.y20;
import p153l.zqz;
import p153l.zzg;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumActivitiesView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public omg f41882A;

    /* JADX INFO: renamed from: B */
    public w30 f41883B;

    /* JADX INFO: renamed from: C */
    public int f41884C;

    /* JADX INFO: renamed from: D */
    public int f41885D;

    /* JADX INFO: renamed from: E */
    public boolean f41886E;

    /* JADX INFO: renamed from: F */
    public int f41887F;

    /* JADX INFO: renamed from: G */
    public Animator f41888G;

    /* JADX INFO: renamed from: H */
    public int f41889H;

    /* JADX INFO: renamed from: I */
    public Runnable f41890I;

    /* JADX INFO: renamed from: J */
    public boolean f41891J;

    /* JADX INFO: renamed from: a */
    public FrameLayout f41892a;

    /* JADX INFO: renamed from: b */
    public View f41893b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f41894c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f41895d;

    /* JADX INFO: renamed from: e */
    public TextView f41896e;

    /* JADX INFO: renamed from: f */
    public VImage f41897f;

    /* JADX INFO: renamed from: g */
    public VText f41898g;

    /* JADX INFO: renamed from: h */
    public VText f41899h;

    /* JADX INFO: renamed from: i */
    public VText f41900i;

    /* JADX INFO: renamed from: j */
    public FeedUserHeaderView f41901j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f41902k;

    /* JADX INFO: renamed from: l */
    public VText f41903l;

    /* JADX INFO: renamed from: m */
    public ImageView f41904m;

    /* JADX INFO: renamed from: n */
    public VText f41905n;

    /* JADX INFO: renamed from: o */
    public VText f41906o;

    /* JADX INFO: renamed from: p */
    public VImage f41907p;

    /* JADX INFO: renamed from: q */
    public VText f41908q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f41909r;

    /* JADX INFO: renamed from: s */
    public VButton f41910s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f41911t;

    /* JADX INFO: renamed from: u */
    public VText f41912u;

    /* JADX INFO: renamed from: v */
    public VDraweeView[] f41913v;

    /* JADX INFO: renamed from: w */
    public MomentActivity f41914w;

    /* JADX INFO: renamed from: x */
    public String f41915x;

    /* JADX INFO: renamed from: y */
    public TopicMoment f41916y;

    /* JADX INFO: renamed from: z */
    public jh5 f41917z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView$a */
    public class C11427a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f41918a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MomentMessage f41919b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MomentActivity f41920c;

        public C11427a(boolean z, MomentMessage momentMessage, MomentActivity momentActivity) {
            this.f41918a = z;
            this.f41919b = momentMessage;
            this.f41920c = momentActivity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            StickerInfo stickerInfo;
            Media media;
            if (this.f41918a) {
                media = !jyb.m147479J(this.f41919b.media) ? this.f41919b.media.get(0) : null;
                stickerInfo = this.f41920c.replyStickerInfo;
            } else {
                MomentActivity momentActivity = this.f41920c;
                Media media2 = momentActivity.media;
                stickerInfo = momentActivity.stickerInfo;
                media = media2;
            }
            PhotoAlbumActivitiesView.this.m64482I().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m65249X1(PhotoAlbumActivitiesView.this.m64482I(), jyb.m147507f0(media), stickerInfo, this.f41920c.reference.f40080id), new d4h());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    public PhotoAlbumActivitiesView(Context context) {
        super(context);
        this.f41913v = new VDraweeView[4];
        this.f41885D = -1;
        this.f41889H = 0;
        this.f41890I = new Runnable() { // from class: l.x470
            @Override // java.lang.Runnable
            public final void run() {
                this.f192352a.m64524l0();
            }
        };
        this.f41891J = false;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m64473A0(Moment moment, View view) {
        if (NullChecker.m82486a(moment)) {
            if (bnl0.m105529O0(this.f41898g) && NullChecker.m82486a(this.f41914w) && !TextUtils.isEmpty(this.f41898g.getText().toString())) {
                String strM172096a = pfh.m172096a(this.f41914w);
                if (!TextUtils.isEmpty(strM172096a)) {
                    pf60 pf60VarM172085a = pf60.m172085a("usertagname", this.f41898g.getText().toString());
                    MomentActivity momentActivity = this.f41914w;
                    tfj0.m190940c(strM172096a, "p_activity", pf60VarM172085a, pf60.m172085a("moments_user_id", momentActivity == null ? "" : momentActivity.actors));
                }
            }
            MomentDetailAct.C11469a c11469aM66029m = MomentDetailAct.C11469a.m66017a(getContext()).m66022f(PhotoAlbumActivitiesAct.f43092j.equals(this.f41915x) ? "photo_album_praised" : "from_activities_moment").m66029m(moment.f56859id);
            MomentActivity momentActivity2 = this.f41914w;
            Intent intentM66018b = c11469aM66029m.m66028l(m64492N(momentActivity2.userIds, momentActivity2.actors)).m66038v(TEnum.equals(this.f41914w.action, ActivityActionApi.merge_likes) || TEnum.equals(this.f41914w.action, "like")).m66030n(moment.owner).m66036t(true).m66031o(moment.momentValue).m66032p(m64509W(this.f41914w.action) ? this.f41914w.messageid : "").m66018b();
            if (intentM66018b == null) {
                return;
            }
            m64482I().startActivityForResult(intentM66018b, PhotoAlbumActivitiesAct.f43090h);
            if (TEnum.equals(this.f41914w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f41914w.action, "comment") || TEnum.equals(this.f41914w.action, "like") || TEnum.equals(this.f41914w.action, ActivityActionApi.merge_likes) || TEnum.equals(this.f41914w.action, ActivityActionApi.comment_like)) {
                m64507U0();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m64474B0(b370 b370Var) {
        b370Var.mo68557c(m64482I(), FeedModule.m61406H().mo31837wb()).subscribe(psd0.m173596G(new y20() { // from class: l.d570
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85137a.m64525m0((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m64475C0(Moment moment) {
        m64507U0();
        tfj0.m190939b("e_red_flower", "p_activity", new tfj0.C20302a[0]);
        FeedModule.m61406H().mo31733Vk(m64482I(), bch.m103508b().m103510c(), this.f41914w.actors, moment == null ? null : moment.f56859id, moment != null ? moment.owner : null, Channel.get(Channel.red_flower), new y20() { // from class: l.y370
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197323a.m64526n0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m64476D0() {
        l51.m152890J(this.f41890I);
        this.f41891J = true;
        if (NullChecker.m82486a(this.f41888G) && this.f41888G.isRunning()) {
            this.f41888G.cancel();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m64477E0(MomentActivity momentActivity, int i, omg omgVar, int i2) {
        this.f41914w = momentActivity;
        this.f41882A = omgVar;
        this.f41884C = i;
        this.f41887F = i2;
        bnl0.m105524M(this.f41901j, false);
        if (cmg.m111216j0()) {
            bnl0.m105540X(this.f41894c, qa00.m175859d(i2 == 0 ? 6.0f : 16.0f));
            bnl0.m105540X(this.f41893b, qa00.m175859d(i2 == 0 ? 23.0f : 33.0f));
            bnl0.m105540X(this.f41911t, qa00.m175859d(i2 == 0 ? 1.0f : 11.0f));
        }
        setBackgroundColor(-1);
        pf60<User, Moment> userAndMoment = getUserAndMoment();
        final User user = userAndMoment.f152156a;
        final Moment moment = userAndMoment.f152157b;
        TextView textView = this.f41896e;
        if (user == null) {
            textView.setText("【异常用户】");
            this.f41895d.setBackgroundResource(0);
            return;
        }
        textView.setText(at0.m100007a(moment, user.name));
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m64482I(), user, this.f41897f);
        at0.m100011e(moment, this.f41895d, user);
        this.f41911t.setVisibility(8);
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (user.needShowFrame() && !TextUtils.isEmpty(user.headFrameUrl())) {
            bnl0.m105524M(this.f41911t, true);
            uqb0.f180374G.m127115L0(this.f41911t, user.headFrameUrl());
            bnl0.m105538V(this.f41911t, qa00.m175859d(12.0f));
        } else if (!jyb.m147479J(list) && list.get(0).doubleValue() > pzi0.m174454o() && !jyb.m147479J(user.profile.extensions.headFrame.url)) {
            this.f41911t.setVisibility(0);
            uqb0.f180374G.m127115L0(this.f41911t, user.profile.extensions.headFrame.url.get(0));
            bnl0.m105538V(this.f41911t, qa00.m175859d(7.0f));
        }
        this.f41905n.setText(pzi0.m174442G(momentActivity.createdTime));
        m64479G0();
        String str = null;
        if (TEnum.equals(momentActivity.action, ActivityActionApi.moment_swipe)) {
            m64485J0(user);
        } else if (TEnum.equals(momentActivity.action, "follow")) {
            m64481H0(user, moment);
        } else if (m64506U(momentActivity)) {
            this.f41909r.setVisibility(0);
            this.f41899h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f41899h.setText(m64486K(momentActivity, new SpannableStringBuilder(momentActivity.value), false, null));
            this.f41900i.setMaxLines(3);
            this.f41899h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f41910s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, "like") || TEnum.equals(momentActivity.action, ActivityActionApi.merge_likes)) {
            this.f41909r.setVisibility(0);
            this.f41899h.setCompoundDrawablesWithIntrinsicBounds(lbc0.f131017d2, 0, 0, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(getLikeFontEmoj());
            sb.append(getResources().getString(R$string.f39944l1));
            this.f41899h.setText(sb);
            this.f41910s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_like) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_like)) {
            this.f41909r.setVisibility(0);
            this.f41899h.setText(getLikeFontEmoj() + getResources().getString(R$string.f39722C0));
            this.f41910s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, ActivityActionApi.forward_moment)) {
            this.f41909r.setVisibility(0);
            this.f41899h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f41899h.setText("转发了你的视频");
            this.f41910s.setVisibility(8);
        }
        m64491M0();
        bnl0.m105524M(this.f41900i, false);
        if (!TextUtils.isEmpty(this.f41914w.replyMessageId) && m64506U(momentActivity)) {
            MomentMessage momentMessageM64488L = m64488L(this.f41914w.replyMessageId);
            if (NullChecker.m82486a(momentMessageM64488L)) {
                bnl0.m105524M(this.f41900i, true);
                this.f41900i.setText(m64486K(momentActivity, new SpannableStringBuilder(momentMessageM64488L.value), true, momentMessageM64488L));
                this.f41900i.setFocusable(false);
                this.f41900i.setMovementMethod(LinkMovementMethod.getInstance());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("回复了你的评论：");
                VText vText = this.f41899h;
                vText.setText(spannableStringBuilder.append(vText.getText()));
                this.f41900i.setMaxLines(3);
                this.f41900i.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        m64483I0(momentActivity, i, moment);
        m64498Q(moment, user);
        boolean z = TEnum.equals(this.f41914w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f41914w.action, "comment");
        this.f41906o.getPaint().setFakeBoldText(true);
        this.f41908q.getPaint().setFakeBoldText(true);
        bnl0.m105524M(this.f41908q, false);
        if (z && !cmg.m111225o()) {
            bnl0.m105524M(this.f41906o, true);
            this.f41906o.setText("回复评论");
            bnl0.m105509E0(this.f41906o, new View.OnClickListener() { // from class: l.y470
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197430a.m64531s0(user, moment, view);
                }
            });
            if (cmg.m111229q() && cmg.m111178F(ksg.m151199d0()) && FeedModule.m61406H().counter_().flower.count > 0) {
                tfj0.m190941d("e_red_flower", "p_activity", new tfj0.C20302a[0]);
                bnl0.m105524M(this.f41908q, true);
                bnl0.m105509E0(this.f41908q, new View.OnClickListener() { // from class: l.z470
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f202912a.m64532t0(user, moment, view);
                    }
                });
            }
        } else if (!cmg.m111184L() || !TEnum.equals(this.f41914w.action, "like")) {
            bnl0.m105524M(this.f41906o, false);
        } else if (TextUtils.isEmpty(this.f41914w.actors) || !pfh.m172097b(this.f41914w.actors)) {
            m64489L0(moment, user);
        } else {
            bnl0.m105524M(this.f41908q, false);
            bnl0.m105524M(this.f41906o, true);
            this.f41906o.setText("聊聊");
            tfj0.m190942e("e_activity_chat", "p_activity", pf60.m172085a("moments_user_id", this.f41914w.actors));
            bnl0.m105509E0(this.f41906o, new View.OnClickListener() { // from class: l.a570
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68513a.m64533u0(view);
                }
            });
        }
        if (!cmg.m111184L() || !pfh.m172098c(this.f41914w)) {
            m64494O();
            return;
        }
        if (pfh.m172100e(this.f41914w)) {
            str = pfh.m172097b(this.f41914w.actors) ? "好友" : "你喜欢的人";
        }
        if (TextUtils.isEmpty(str)) {
            m64494O();
            return;
        }
        this.f41898g.getPaint().setFakeBoldText(true);
        bnl0.m105524M(this.f41898g, true);
        this.f41898g.setText(str);
        int i3 = this.f41885D;
        if (i3 > 0) {
            this.f41896e.setMaxWidth((i3 - ((int) this.f41898g.getPaint().measureText(str))) - qa00.f156324k);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m64478F0(b370 b370Var, final MomentActivity momentActivity, final int i, final omg omgVar, final int i2) {
        m64474B0(b370Var);
        b370Var.mo68557c(m64482I(), FeedModule.f39703d.f121326S0).subscribe(psd0.m173596G(new y20() { // from class: l.x370
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192233a.m64527o0((pf60) obj);
            }
        }));
        if (cmg.m111229q() && cmg.m111178F(ksg.m151199d0())) {
            b370Var.mo68557c(m64482I(), C22421c.combineLatest(FeedModule.m61406H().counter().map(new qcj() { // from class: l.i470
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Counter) obj).flower.count > 0);
                }
            }).distinctUntilChanged(), FeedModule.m61406H().mo31710M9(momentActivity.actors).distinctUntilChanged(), new zqz())).subscribe(psd0.m173596G(new y20() { // from class: l.t470
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172021a.m64528p0(momentActivity, i, omgVar, i2, (pf60) obj);
                }
            }));
        } else {
            m64477E0(momentActivity, i, omgVar, i2);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m64479G0() {
        if (!PhotoAlbumActivitiesAct.f43092j.equals(this.f41915x)) {
            boolean z = this.f41914w.read;
            View view = this.f41893b;
            if (z) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
        this.f41896e.setTextColor(m64482I().getResources().getColor(k9c0.f124517l));
        this.f41899h.setTextColor(m64482I().getResources().getColor(k9c0.f124471C));
        this.f41900i.setTextColor(m64482I().getResources().getColor(k9c0.f124471C));
        this.f41905n.setTextColor(m64482I().getResources().getColor(k9c0.f124515k));
    }

    /* JADX INFO: renamed from: H */
    public final void m64480H(View view) {
        k570.m148317a(this, view);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m64481H0(User user, Moment moment) {
        this.f41909r.setVisibility(8);
        this.f41910s.setVisibility(0);
        if (NullChecker.m82486a(user.localFollowship) && (TEnum.equals(user.localFollowship.state, "matched") || TEnum.equals(user.localFollowship.state, FollowshipStatus.following))) {
            this.f41910s.setBackground(getResources().getDrawable(lbc0.f131099n4));
            this.f41910s.setSelected(true);
            this.f41910s.setTextColor(-1);
            boolean zEquals = TEnum.equals(user.localFollowship.state, "matched");
            VButton vButton = this.f41910s;
            if (zEquals) {
                vButton.setText(R$string.f39790N2);
                this.f41910s.setTextColor(m64482I().getResources().getColor(k9c0.f124474F));
            } else {
                vButton.setText(R$string.f39802P2);
                this.f41910s.setTextColor(m64482I().getResources().getColor(k9c0.f124474F));
            }
        } else {
            this.f41910s.setBackgroundDrawable(getResources().getDrawable(lbc0.f131123q4));
            this.f41910s.setText("回关");
            this.f41910s.setTextColor(-1);
            bnl0.m105525M0(this.f41910s, true);
            m64484J(FeedModule.f39703d.m145688e8(this.f41914w.actors).mo225055clone());
        }
        this.f41899h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f41899h.setText(R$string.f39778L2);
    }

    /* JADX INFO: renamed from: I */
    public Act m64482I() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m64483I0(MomentActivity momentActivity, int i, Moment moment) {
        if (i == 0) {
            if (m64510X(momentActivity)) {
                TopicMoment topicMoment = v370.f182168a.get(this.f41914w.reference.f40080id);
                this.f41916y = topicMoment;
                this.f41912u.setText(topicMoment != null ? topicMoment.name : "");
            } else if (NullChecker.m82486a(moment)) {
                this.f41912u.setText(Pattern.compile("\\s*|\t|\r|\n").matcher(moment.value).replaceAll(""));
            }
        }
        if (i == 7 && NullChecker.m82486a(moment)) {
            this.f41912u.setText(String.format("%s''", Integer.valueOf(Math.round(((Audio) moment.media.get(0)).duration))));
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (moment == null) {
                uqb0.f180374G.m98798o(this.f41913v[i2]);
            } else {
                Media media = moment.media.get(i2);
                Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
                if (NullChecker.m82487b(picture)) {
                    uqb0.f180374G.m127125Q0(this.f41913v[i2], picture.momentPictureSmall());
                } else {
                    uqb0.f180374G.m98798o(this.f41913v[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m64484J(User user) {
    }

    /* JADX INFO: renamed from: J0 */
    public final void m64485J0(User user) {
        this.f41909r.setVisibility(8);
        this.f41910s.setVisibility(0);
        this.f41910s.setBackground(getResources().getDrawable(lbc0.f131099n4));
        this.f41910s.setSelected(false);
        this.f41910s.setTextColor(-1);
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f41910s.setText("聊天");
            bnl0.m105524M(this.f41910s, true);
        } else if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "liked")) {
            bnl0.m105524M(this.f41910s, false);
        } else if (FeedModule.m61406H().mo31810pq() || !ksg.m151160D()) {
            this.f41910s.setText("喜欢".concat(user.isFemale() ? "她" : "他"));
            tfj0.m190942e("e_respond_match", "p_activity", pf60.m172085a("user_id", user.f56859id));
        } else {
            bnl0.m105524M(this.f41910s, true);
            this.f41910s.setText("查看");
        }
        if (!FeedModule.m61406H().mo31810pq() && cmg.m111213i() && ksg.m151160D()) {
            uqb0.f180374G.m127120O(this.f41895d, user.m61308fp().profileMiddle().formatted(), 4, 30);
        }
        this.f41899h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f41899h.setText("通过你发布的动态喜欢了你");
        tfj0.m190942e("e_card_detail", "p_activity", pf60.m172085a("moments_user_id", user.f56859id));
    }

    /* JADX INFO: renamed from: K */
    public final SpannableStringBuilder m64486K(MomentActivity momentActivity, SpannableStringBuilder spannableStringBuilder, boolean z, MomentMessage momentMessage) {
        if (spannableStringBuilder.length() == 0) {
            spannableStringBuilder.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        int length = spannableStringBuilder.length();
        boolean z2 = !z && (NullChecker.m82486a(momentActivity.media) || NullChecker.m82486a(momentActivity.stickerInfo));
        if ((z && (NullChecker.m82486a(momentActivity.replyStickerInfo) || TEnum.equals(momentMessage.messageType, "picture"))) || z2) {
            Drawable drawable = m64482I().getDrawable(lbc0.f131110p);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicWidth());
            spannableStringBuilder.setSpan(new jeh(drawable, qa00.m175859d(length == 0 ? 0.0f : 5.0f), qa00.m175859d(3.0f)), length == 0 ? 0 : length - 1, length, 1);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("查看图片");
            spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8f), 0, 4, 18);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 0, 4, 18);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.setSpan(new C11427a(z, momentMessage, momentActivity), length != 0 ? length - 1 : 0, spannableStringBuilder.length() - 1, 17);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m64487K0(User user) {
        bnl0.m105524M(this.f41910s, true);
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f41910s.setText("聊天");
            return;
        }
        if (NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "liked")) {
            bnl0.m105524M(this.f41910s, false);
            return;
        }
        bnl0.m105524M(this.f41910s, true);
        if (FeedModule.m61406H().mo31810pq() || !ksg.m151160D()) {
            this.f41910s.setText("喜欢".concat(user.isFemale() ? "她" : "他"));
        } else {
            this.f41910s.setText("查看");
        }
    }

    /* JADX INFO: renamed from: L */
    public final MomentMessage m64488L(String str) {
        return FeedModule.f39703d.f121300H0.get(str);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m64489L0(final Moment moment, final User user) {
        if (!cmg.m111229q()) {
            this.f41906o.setText("礼貌回谢");
            tfj0.m190942e("e_polite_gratitude", "p_activity", pf60.m172085a("moments_user_id", this.f41914w.actors));
        } else if (FeedModule.m61406H().mo31770gp(user.f56859id)) {
            bnl0.m105524M(this.f41908q, false);
            bnl0.m105524M(this.f41906o, true);
            this.f41906o.setText("聊聊");
            er60.m122104w().m122131t(moment, "p_activity", false, false);
        } else if (!cmg.m111178F(ksg.m151199d0()) || FeedModule.m61406H().counter_().flower.count <= 0) {
            this.f41906o.setText("打招呼");
            bnl0.m105524M(this.f41906o, true);
            bnl0.m105524M(this.f41908q, false);
            er60.m122104w().m122131t(moment, "p_activity", true, false);
        } else {
            bnl0.m105524M(this.f41906o, false);
            bnl0.m105524M(this.f41908q, true);
            tfj0.m190941d("e_red_flower", "p_activity", new tfj0.C20302a[0]);
            bnl0.m105509E0(this.f41908q, new View.OnClickListener() { // from class: l.b470
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74885a.m64536x0(moment, view);
                }
            });
        }
        bnl0.m105509E0(this.f41906o, new View.OnClickListener() { // from class: l.c470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79675a.m64535w0(user, moment, view);
            }
        });
        this.f41891J = false;
        m64497P0();
    }

    /* JADX INFO: renamed from: M */
    public final List<pf60<String, String>> m64490M(Moment moment, MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        if (moment != null && momentMessage != null) {
            arrayList.add(pf60.m172085a("moment_id", moment.f56859id));
            arrayList.add(pf60.m172085a("owner_id", moment.owner));
            er60.m122104w();
            arrayList.add(pf60.m172085a("moment_showfrom", er60.m122103D(this.f41882A.getFrom())));
            arrayList.add(pf60.m172085a("moment_type", er60.m122104w().m122135y(moment)));
            arrayList.add(pf60.m172085a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    public void m64491M0() {
        this.f41889H = 0;
        this.f41891J = false;
        bnl0.m105524M(this.f41907p, false);
        m64476D0();
    }

    /* JADX INFO: renamed from: N */
    public final String m64492N(List<String> list, String str) {
        if (TEnum.equals(this.f41914w.action, "like")) {
            return str;
        }
        if (jyb.m147479J(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < list.size()) {
            sb.append(list.get(i));
            i++;
            if (i != list.size()) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m64493N0(Moment moment, User user) {
        if (this.f41917z == null) {
            jh5 jh5Var = new jh5(m64482I(), fgc0.f98899b);
            this.f41917z = jh5Var;
            jh5Var.m144887a0();
        }
        this.f41917z.m144889d0(this.f41896e.getText().toString());
        jh5 jh5Var2 = this.f41917z;
        String str = this.f41915x;
        boolean zIsEmpty = TextUtils.isEmpty(this.f41914w.parentMessageid);
        MomentActivity momentActivity = this.f41914w;
        jh5Var2.m144888b0(moment, str, zIsEmpty ? momentActivity.messageid : momentActivity.parentMessageid, user.f56859id, this.f41914w.messageid, new x20() { // from class: l.p470
            @Override // p153l.x20
            public final void call() {
                this.f150510a.m64507U0();
            }
        });
        this.f41917z.show();
    }

    /* JADX INFO: renamed from: O */
    public final void m64494O() {
        bnl0.m105524M(this.f41898g, false);
        int i = this.f41885D;
        if (i > 0) {
            this.f41896e.setMaxWidth(i);
        }
    }

    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final void m64529q0(User user, Moment moment) {
        tfj0.m190940c("e_comment", "p_activity", (pf60[]) m64490M(moment, m64488L(this.f41914w.messageid)).toArray(new pf60[0]));
        m64493N0(moment, user);
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: P */
    public void m64496P(int i) {
        int i2 = tec0.f173465A1;
        if (i != 0) {
            if (i == 1) {
                i2 = tec0.f173542M4;
            } else if (i == 2) {
                i2 = tec0.f173554O4;
            } else if (i == 3) {
                i2 = tec0.f173548N4;
            } else if (i == 4) {
                i2 = tec0.f173530K4;
            } else if (i == 6) {
                i2 = tec0.f173560P4;
            } else if (i == 7) {
                i2 = tec0.f173472B1;
            }
        }
        int i3 = 0;
        View viewInflate = m64482I().inflater().inflate(i2, (ViewGroup) this.f41909r, false);
        this.f41912u = (VText) viewInflate.findViewById(hdc0.f108866Q1);
        this.f41913v[0] = (VDraweeView) viewInflate.findViewById(hdc0.f108948o0);
        this.f41913v[1] = (VDraweeView) viewInflate.findViewById(hdc0.f108954q0);
        this.f41913v[2] = (VDraweeView) viewInflate.findViewById(hdc0.f108951p0);
        this.f41913v[3] = (VDraweeView) viewInflate.findViewById(hdc0.f108945n0);
        this.f41909r.addView(viewInflate, 0);
        if (i == 1 || i == 6) {
            VDraweeView[] vDraweeViewArr = this.f41913v;
            int length = vDraweeViewArr.length;
            while (i3 < length) {
                VDraweeView vDraweeView = vDraweeViewArr[i3];
                if (vDraweeView != null) {
                    vDraweeView.getHierarchy().m207045H(new RoundingParams().m8319s(qa00.m175859d(10.0f)));
                }
                i3++;
            }
            return;
        }
        VDraweeView[] vDraweeViewArr2 = this.f41913v;
        int length2 = vDraweeViewArr2.length;
        while (i3 < length2) {
            VDraweeView vDraweeView2 = vDraweeViewArr2[i3];
            if (vDraweeView2 != null) {
                vDraweeView2.getHierarchy().m207045H(new RoundingParams().m8319s(qa00.m175859d(5.0f)));
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m64497P0() {
        if (NullChecker.m82486a(this.f41888G)) {
            this.f41888G.cancel();
        }
        Animator animatorM132170p = gt0.m132170p(this.f41907p, "translationX", 500L, 800L, new AccelerateDecelerateInterpolator(), 0.0f, qa00.m175859d(60.0f));
        this.f41888G = animatorM132170p;
        gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.b570
            @Override // java.lang.Runnable
            public final void run() {
                this.f75038a.m64537y0();
            }
        });
        gt0.m132160f(this.f41888G, new Runnable() { // from class: l.c570
            @Override // java.lang.Runnable
            public final void run() {
                this.f79810a.m64538z0();
            }
        });
        this.f41888G.start();
    }

    /* JADX INFO: renamed from: Q */
    public final void m64498Q(final Moment moment, final User user) {
        jyb.m147537z(jyb.m147507f0(this.f41892a, this.f41894c, this.f41909r), new y20() { // from class: l.d470
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85006a.m64502S((ViewGroup) obj);
            }
        });
        m64502S(this.f41895d);
        m64502S(this.f41910s);
        final boolean z = NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched");
        if (TEnum.equals(this.f41914w.action, ActivityActionApi.moment_swipe)) {
            this.f41894c.setOnClickListener(new View.OnClickListener() { // from class: l.e470
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92069a.m64511Y(z, moment, user, view);
                }
            });
        } else if (TEnum.equals(this.f41914w.action, "follow")) {
            this.f41894c.setOnClickListener(new View.OnClickListener() { // from class: l.f470
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97059a.m64512Z(moment, user, view);
                }
            });
        } else if (m64510X(this.f41914w)) {
            jyb.m147537z(jyb.m147507f0(this.f41894c, this.f41909r), new y20() { // from class: l.g470
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102153a.m64514b0((ViewGroup) obj);
                }
            });
        } else if (TEnum.equals(this.f41914w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f41914w.action, "comment")) {
            jyb.m147537z(jyb.m147507f0(this.f41894c, this.f41909r), new y20() { // from class: l.h470
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107764a.m64515c0(moment, (ViewGroup) obj);
                }
            });
        } else if ((cmg.m111195W() && PhotoAlbumActivitiesAct.f43092j.equals(this.f41915x)) || m64508V()) {
            this.f41894c.setOnClickListener(new View.OnClickListener() { // from class: l.j470
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118270a.m64516d0(moment, user, view);
                }
            });
            this.f41909r.setOnClickListener(m64499Q0(moment));
        } else {
            jyb.m147537z(jyb.m147507f0(this.f41894c, this.f41909r), new y20() { // from class: l.k470
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123863a.m64517e0(moment, (ViewGroup) obj);
                }
            });
        }
        boolean zEquals = TEnum.equals(this.f41914w.action, ActivityActionApi.moment_swipe);
        VDraweeView vDraweeView = this.f41895d;
        if (zEquals) {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.l470
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129943a.m64518f0(z, moment, user, view);
                }
            });
        } else {
            m64504T(moment, vDraweeView, user);
        }
        m64500R(this.f41910s, user);
    }

    /* JADX INFO: renamed from: Q0 */
    public final View.OnClickListener m64499Q0(final Moment moment) {
        return new View.OnClickListener() { // from class: l.o470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144948a.m64473A0(moment, view);
            }
        };
    }

    /* JADX INFO: renamed from: R */
    public final void m64500R(View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.q470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f155537a.m64519g0(user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final void m64501R0(Moment moment, User user, String str) {
        at0.m100016j(m64482I(), moment, user.f56859id, str, false);
    }

    /* JADX INFO: renamed from: S */
    public final void m64502S(View view) {
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.m470
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f134772a.m64522j0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public final void m64503S0(Moment moment, User user) {
        if (at0.m100010d(moment)) {
            return;
        }
        i4g0.m138523u("e_likes_list", "p_content_likes", pf60.m172085a("user_id", user.f56859id), pf60.m172085a("moment_id", moment.f56859id));
        m64505T0(user);
    }

    /* JADX INFO: renamed from: T */
    public final void m64504T(final Moment moment, View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.r470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f161153a.m64523k0(moment, user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final void m64505T0(User user) {
        m64482I().startActivity(at0.m100008b(m64482I(), user.f56859id, "photo_album_feed_from_activity"));
    }

    /* JADX INFO: renamed from: U */
    public boolean m64506U(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m64507U0() {
        MomentActivity momentActivity = this.f41914w;
        if (momentActivity.read) {
            return;
        }
        momentActivity.read = true;
        this.f41882A.mo65942M1(momentActivity.f56859id, 0);
        this.f41893b.setVisibility(8);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m64508V() {
        return cmg.m111195W() && PhotoAlbumActivitiesAct.f43092j.equals(this.f41915x);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m64509W(ActivityActionApi activityActionApi) {
        return TEnum.equals(activityActionApi, ActivityActionApi.comment_reply) || TEnum.equals(activityActionApi, "comment");
    }

    /* JADX INFO: renamed from: X */
    public final boolean m64510X(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_like) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m64511Y(boolean z, Moment moment, User user, View view) {
        if (FeedModule.m61406H().mo31810pq() || z || !ksg.m151160D()) {
            m64501R0(moment, user, "photo_album_activities");
        } else {
            orb0.m168876E(m64482I(), null, "p_activity,default");
        }
        tfj0.m190940c("e_card_detail", "p_activity", pf60.m172085a("moments_user_id", user.f56859id));
        m64507U0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m64512Z(Moment moment, User user, View view) {
        m64501R0(moment, user, "photo_album_activities");
        m64507U0();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m64513a0(View view) {
        if (this.f41916y == null) {
            return;
        }
        Act actM64482I = m64482I();
        Act actM64482I2 = m64482I();
        TopicMoment topicMoment = this.f41916y;
        actM64482I.startActivity(TopicVoteAggregationAct.m67354X1(actM64482I2, topicMoment.f40095id, topicMoment.owner.f39607id, null));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m64514b0(ViewGroup viewGroup) {
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.s470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166177a.m64513a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m64515c0(Moment moment, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(m64499Q0(moment));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m64516d0(Moment moment, User user, View view) {
        m64503S0(moment, user);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m64517e0(Moment moment, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(m64499Q0(moment));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m64518f0(boolean z, Moment moment, User user, View view) {
        if (FeedModule.m61406H().mo31810pq() || z || !ksg.m151160D()) {
            m64501R0(moment, user, "photo_album_activities");
        } else {
            orb0.m168876E(m64482I(), null, "p_activity,default");
        }
        m64507U0();
        tfj0.m190940c("e_card_detail", "p_activity", pf60.m172085a("moments_user_id", user.f56859id));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m64519g0(User user, View view) {
        if (TEnum.equals(this.f41914w.action, ActivityActionApi.moment_swipe)) {
            if (this.f41910s.getText().equals("喜欢".concat(user.isFemale() ? "她" : "他"))) {
                tfj0.m190940c("e_respond_match", "p_activity", pf60.m172085a("user_id", user.f56859id));
                FeedModule.m61406H().mo31728Rs(m64482I(), user, true, FeedModule.m61406H().mo31810pq() ? LikeFrom.get("momentPick") : LikeFrom.get("moment"), null, true, "featured");
            } else if (this.f41910s.getText().equals("查看")) {
                tfj0.m190940c("e_card_detail", "p_activity", pf60.m172085a("moments_user_id", user.f56859id));
                orb0.m168876E(m64482I(), null, "p_activity,default");
            } else {
                m64482I().startActivity(orb0.m168886c(m64482I(), user.f56859id, false, false));
            }
            m64507U0();
            return;
        }
        final User userMo225055clone = FeedModule.f39703d.m145688e8(this.f41914w.actors).mo225055clone();
        if (NullChecker.m82487b(userMo225055clone)) {
            m64507U0();
            if (!NullChecker.m82486a(userMo225055clone.localFollowship)) {
                FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), userMo225055clone, true, "p_activity");
                return;
            }
            FollowshipStatus followshipStatus = userMo225055clone.localFollowship.state;
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                k3h.m148105v0(m64482I(), getResources().getString(R$string.f40031z), new x20() { // from class: l.w470
                    @Override // p153l.x20
                    public final void call() {
                        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), userMo225055clone, false, "p_activity");
                    }
                });
            } else if (userMo225055clone.profile.moments.hidePublicMoments) {
                o1j0.m165649w(R$string.f39977q);
            } else {
                FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), userMo225055clone, true, "p_activity");
            }
        }
    }

    @NotNull
    public String getLikeFontEmoj() {
        return ((cmg.m111195W() && PhotoAlbumActivitiesAct.f43092j.equals(this.f41915x)) || m64508V()) ? "" : "❤️";
    }

    public pf60<User, Moment> getUserAndMoment() {
        return new pf60<>(FeedModule.f39703d.m145688e8(this.f41914w.actors), FeedModule.f39703d.f121357i0.get(this.f41914w.reference.f40080id));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m64520h0(View view) {
        this.f41883B.m204614b();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m64521i0(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        this.f41882A.mo65940G3(this.f41914w.f56859id);
        this.f41883B.m204614b();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m64522j0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R$string.f39900f));
        w30.C21001b c21001b = new w30.C21001b(view.getContext());
        c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.u470
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f177440a.m64520h0(view2);
            }
        }).m204665Q(arrayList).m204666R(new int[]{0}, new int[]{k9c0.f124473E}).m204670V(new w30.InterfaceC21003d() { // from class: l.v470
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f182339a.m64521i0(vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f41883B = w30VarM204654F;
        w30VarM204654F.m204618f();
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m64523k0(Moment moment, User user, View view) {
        m64507U0();
        if (m64508V()) {
            m64503S0(moment, user);
        } else {
            m64501R0(moment, user, "photo_album_activities");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m64524l0() {
        this.f41889H++;
        m64497P0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m64525m0(uxj0 uxj0Var) {
        if (this.f41886E != FeedModule.m61406H().mo31810pq()) {
            this.f41886E = FeedModule.m61406H().mo31810pq();
            m64477E0(this.f41914w, this.f41884C, this.f41882A, this.f41887F);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m64526n0(Boolean bool) {
        if (m64482I() == null || m64482I().isDestroyed() || m64482I().isFinishing() || !bool.booleanValue()) {
            return;
        }
        r1j0.m179420g("小红花已发送");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m64527o0(pf60 pf60Var) {
        if (NullChecker.m82486a(this.f41914w) && ((User) pf60Var.f152156a).f56859id.equals(this.f41914w.actors)) {
            m64487K0((User) pf60Var.f152156a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m64476D0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64480H(this);
        this.f41885D = this.f41896e.getMaxWidth();
        this.f41886E = FeedModule.m61406H().mo31810pq();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m64528p0(MomentActivity momentActivity, int i, omg omgVar, int i2, pf60 pf60Var) {
        m64477E0(momentActivity, i, omgVar, i2);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m64530r0(User user, Moment moment, Boolean bool) {
        if (bool.booleanValue()) {
            m64529q0(user, moment);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m64531s0(final User user, final Moment moment, View view) {
        if (cmg.m111244x0()) {
            zzg.m222254f(m64482I(), "p_fake_nearby_comments_popup", user, new x20() { // from class: l.z370
                @Override // p153l.x20
                public final void call() {
                    this.f202802a.m64529q0(user, moment);
                }
            }, new y20() { // from class: l.a470
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68361a.m64530r0(user, moment, (Boolean) obj);
                }
            });
        } else {
            m64529q0(user, moment);
        }
    }

    public void setFrom(String str) {
        this.f41915x = str;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m64532t0(User user, Moment moment, View view) {
        if (FeedModule.m61406H().mo31770gp(user.f56859id)) {
            r1j0.m179420g("你们已经是好友了，去聊聊天吧");
        } else {
            m64475C0(moment);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m64533u0(View view) {
        tfj0.m190940c("e_activity_chat", "p_activity", pf60.m172085a("moments_user_id", this.f41914w.actors));
        m64482I().startActivity(orb0.m168886c(m64482I(), this.f41914w.actors, false, false));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m64534v0(Boolean bool) {
        if (m64482I() == null || m64482I().isDestroyed() || m64482I().isFinishing() || !bool.booleanValue()) {
            return;
        }
        r1j0.m179420g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m64535w0(User user, Moment moment, View view) {
        m64507U0();
        if (cmg.m111229q()) {
            FeedModule.f39702c.m61908f3(m64482I(), user, null, "p_activity", false);
            er60.m122104w().m122130s(moment, "p_activity", true, false);
        } else {
            tfj0.m190940c("e_polite_gratitude", "p_activity", pf60.m172085a("moments_user_id", this.f41914w.actors));
            FeedModule.m61406H().mo31733Vk(m64482I(), bch.m103508b().m103510c(), this.f41914w.actors, moment == null ? null : moment.f56859id, moment != null ? moment.owner : null, Channel.get(Channel.reply_thanks), new y20() { // from class: l.n470
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140204a.m64534v0((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m64536x0(Moment moment, View view) {
        m64475C0(moment);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m64537y0() {
        bnl0.m105524M(this.f41907p, bnl0.m105529O0(this.f41906o) && TextUtils.equals(this.f41906o.getText().toString(), "礼貌回谢"));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m64538z0() {
        this.f41907p.setVisibility(8);
        this.f41888G = null;
        if (this.f41889H > 1 || this.f41891J) {
            return;
        }
        l51.m152888H(m64482I(), this.f41890I, 750L);
    }

    public PhotoAlbumActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41913v = new VDraweeView[4];
        this.f41885D = -1;
        this.f41889H = 0;
        this.f41890I = new Runnable() { // from class: l.x470
            @Override // java.lang.Runnable
            public final void run() {
                this.f192352a.m64524l0();
            }
        };
        this.f41891J = false;
    }

    public PhotoAlbumActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41913v = new VDraweeView[4];
        this.f41885D = -1;
        this.f41889H = 0;
        this.f41890I = new Runnable() { // from class: l.x470
            @Override // java.lang.Runnable
            public final void run() {
                this.f192352a.m64524l0();
            }
        };
        this.f41891J = false;
    }
}
