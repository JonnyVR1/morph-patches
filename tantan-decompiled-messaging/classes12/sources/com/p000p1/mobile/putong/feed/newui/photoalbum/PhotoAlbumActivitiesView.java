package com.p000p1.mobile.putong.feed.newui.photoalbum;

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
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.DraweeView;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.LikeFrom;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import l.bt0;
import l.c40;
import l.ciz;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p007l.a8c0;
import p007l.aeh;
import p007l.b5c0;
import p007l.e1c0;
import p007l.ex60;
import p007l.f3c0;
import p007l.jg5;
import p007l.kjb0;
import p007l.kyg;
import p007l.mah;
import p007l.nkg;
import p007l.o2h;
import p007l.o6c0;
import p007l.p6j0;
import p007l.pv60;
import p007l.uch;
import p007l.v1h;
import p007l.vqg;
import p007l.vs0;
import p007l.vu60;
import p007l.zi60;
import p007l.zkg;
import rx.c;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumActivitiesView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public zkg f2495A;

    /* JADX INFO: renamed from: B */
    public c40 f2496B;

    /* JADX INFO: renamed from: C */
    public int f2497C;

    /* JADX INFO: renamed from: D */
    public int f2498D;

    /* JADX INFO: renamed from: E */
    public boolean f2499E;

    /* JADX INFO: renamed from: F */
    public int f2500F;

    /* JADX INFO: renamed from: G */
    public Animator f2501G;

    /* JADX INFO: renamed from: H */
    public int f2502H;

    /* JADX INFO: renamed from: I */
    public Runnable f2503I;

    /* JADX INFO: renamed from: J */
    public boolean f2504J;

    /* JADX INFO: renamed from: a */
    public FrameLayout f2505a;

    /* JADX INFO: renamed from: b */
    public View f2506b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f2507c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f2508d;

    /* JADX INFO: renamed from: e */
    public TextView f2509e;

    /* JADX INFO: renamed from: f */
    public VImage f2510f;

    /* JADX INFO: renamed from: g */
    public VText f2511g;

    /* JADX INFO: renamed from: h */
    public VText f2512h;

    /* JADX INFO: renamed from: i */
    public VText f2513i;

    /* JADX INFO: renamed from: j */
    public FeedUserHeaderView f2514j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f2515k;

    /* JADX INFO: renamed from: l */
    public VText f2516l;

    /* JADX INFO: renamed from: m */
    public ImageView f2517m;

    /* JADX INFO: renamed from: n */
    public VText f2518n;

    /* JADX INFO: renamed from: o */
    public VText f2519o;

    /* JADX INFO: renamed from: p */
    public VImage f2520p;

    /* JADX INFO: renamed from: q */
    public VText f2521q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f2522r;

    /* JADX INFO: renamed from: s */
    public VButton f2523s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f2524t;

    /* JADX INFO: renamed from: u */
    public VText f2525u;

    /* JADX INFO: renamed from: v */
    public VDraweeView[] f2526v;

    /* JADX INFO: renamed from: w */
    public MomentActivity f2527w;

    /* JADX INFO: renamed from: x */
    public String f2528x;

    /* JADX INFO: renamed from: y */
    public TopicMoment f2529y;

    /* JADX INFO: renamed from: z */
    public jg5 f2530z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView$a */
    public class C2108a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f2531a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MomentMessage f2532b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MomentActivity f2533c;

        public C2108a(boolean z, MomentMessage momentMessage, MomentActivity momentActivity) {
            this.f2531a = z;
            this.f2532b = momentMessage;
            this.f2533c = momentActivity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            StickerInfo stickerInfo;
            Media media;
            if (this.f2531a) {
                media = !vwb.J(this.f2532b.media) ? this.f2532b.media.get(0) : null;
                stickerInfo = this.f2533c.replyStickerInfo;
            } else {
                MomentActivity momentActivity = this.f2533c;
                Media media2 = momentActivity.media;
                stickerInfo = momentActivity.stickerInfo;
                media = media2;
            }
            PhotoAlbumActivitiesView.this.m4316I().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m5113V1(PhotoAlbumActivitiesView.this.m4316I(), vwb.f0(new Media[]{media}), stickerInfo, this.f2533c.reference.f693id), new o2h());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    public PhotoAlbumActivitiesView(Context context) {
        super(context);
        this.f2526v = new VDraweeView[4];
        this.f2498D = -1;
        this.f2502H = 0;
        this.f2503I = new Runnable() { // from class: l.rw60
            @Override // java.lang.Runnable
            public final void run() {
                this.f12747a.m4358l0();
            }
        };
        this.f2504J = false;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m4307A0(Moment moment, View view) {
        if (NullChecker.a(moment)) {
            if (xdl0.O0(this.f2511g) && NullChecker.a(this.f2527w) && !TextUtils.isEmpty(this.f2511g.getText().toString())) {
                String strM8504a = aeh.m8504a(this.f2527w);
                if (!TextUtils.isEmpty(strM8504a)) {
                    j760 j760VarA = j760.a("usertagname", this.f2511g.getText().toString());
                    MomentActivity momentActivity = this.f2527w;
                    p6j0.m12913c(strM8504a, "p_activity", j760VarA, j760.a("moments_user_id", momentActivity == null ? "" : momentActivity.actors));
                }
            }
            MomentDetailAct.C2150a c2150aM5943m = MomentDetailAct.C2150a.m5931a(getContext()).m5936f(PhotoAlbumActivitiesAct.f3705j.equals(this.f2528x) ? "photo_album_praised" : "from_activities_moment").m5943m(((DbObject) moment).id);
            MomentActivity momentActivity2 = this.f2527w;
            Intent intentM5932b = c2150aM5943m.m5942l(m4326N(momentActivity2.userIds, momentActivity2.actors)).m5952v(TEnum.equals(this.f2527w.action, ActivityActionApi.merge_likes) || TEnum.equals(this.f2527w.action, "like")).m5944n(moment.owner).m5950t(true).m5945o(moment.momentValue).m5946p(m4343W(this.f2527w.action) ? this.f2527w.messageid : "").m5932b();
            if (intentM5932b == null) {
                return;
            }
            m4316I().startActivityForResult(intentM5932b, PhotoAlbumActivitiesAct.f3703h);
            if (TEnum.equals(this.f2527w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f2527w.action, "comment") || TEnum.equals(this.f2527w.action, "like") || TEnum.equals(this.f2527w.action, ActivityActionApi.merge_likes) || TEnum.equals(this.f2527w.action, ActivityActionApi.comment_like)) {
                m4341U0();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m4308B0(vu60 vu60Var) {
        vu60Var.c(m4316I(), FeedModule.m1140H().wb()).subscribe(mkd0.G(new e30() { // from class: l.xw60
            public final void call(Object obj) {
                this.f15171a.m4359m0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m4309C0(Moment moment) {
        m4341U0();
        p6j0.m12912b("e_red_flower", "p_activity", new p6j0.C2456a[0]);
        FeedModule.m1140H().Vk(m4316I(), mah.m11869b().m11871c(), this.f2527w.actors, moment == null ? null : ((DbObject) moment).id, moment != null ? moment.owner : null, Channel.get(Channel.red_flower), new e30() { // from class: l.sv60
            public final void call(Object obj) {
                this.f13094a.m4360n0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m4310D0() {
        e51.J(this.f2503I);
        this.f2504J = true;
        if (NullChecker.a(this.f2501G) && this.f2501G.isRunning()) {
            this.f2501G.cancel();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m4311E0(MomentActivity momentActivity, int i, zkg zkgVar, int i2) {
        this.f2527w = momentActivity;
        this.f2495A = zkgVar;
        this.f2497C = i;
        this.f2500F = i2;
        xdl0.M(this.f2514j, false);
        if (nkg.m12246j0()) {
            xdl0.X(this.f2507c, t100.d(i2 == 0 ? 6.0f : 16.0f));
            xdl0.X(this.f2506b, t100.d(i2 == 0 ? 23.0f : 33.0f));
            xdl0.X(this.f2524t, t100.d(i2 == 0 ? 1.0f : 11.0f));
        }
        setBackgroundColor(-1);
        j760<User, Moment> userAndMoment = getUserAndMoment();
        final User user = (User) userAndMoment.a;
        final Moment moment = (Moment) userAndMoment.b;
        TextView textView = this.f2509e;
        if (user == null) {
            textView.setText("【异常用户】");
            this.f2508d.setBackgroundResource(0);
            return;
        }
        textView.setText(vs0.m15563a(moment, user.name));
        qib0.b0.b.showUserVerificationLogo(m4316I(), user, this.f2510f);
        vs0.m15567e(moment, this.f2508d, user);
        this.f2524t.setVisibility(8);
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (user.needShowFrame() && !TextUtils.isEmpty(user.headFrameUrl())) {
            xdl0.M(this.f2524t, true);
            qib0.G.L0(this.f2524t, user.headFrameUrl());
            xdl0.V(this.f2524t, t100.d(12.0f));
        } else if (!vwb.J(list) && list.get(0).doubleValue() > mqi0.o() && !vwb.J(user.profile.extensions.headFrame.url)) {
            this.f2524t.setVisibility(0);
            qib0.G.L0(this.f2524t, user.profile.extensions.headFrame.url.get(0));
            xdl0.V(this.f2524t, t100.d(7.0f));
        }
        this.f2518n.setText(mqi0.G(momentActivity.createdTime));
        m4313G0();
        String str = null;
        if (TEnum.equals(momentActivity.action, ActivityActionApi.moment_swipe)) {
            m4319J0(user);
        } else if (TEnum.equals(momentActivity.action, "follow")) {
            m4315H0(user, moment);
        } else if (m4340U(momentActivity)) {
            this.f2522r.setVisibility(0);
            this.f2512h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f2512h.setText(m4320K(momentActivity, new SpannableStringBuilder(momentActivity.value), false, null));
            this.f2513i.setMaxLines(3);
            this.f2512h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f2523s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, "like") || TEnum.equals(momentActivity.action, ActivityActionApi.merge_likes)) {
            this.f2522r.setVisibility(0);
            this.f2512h.setCompoundDrawablesWithIntrinsicBounds(f3c0.f7782d2, 0, 0, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(getLikeFontEmoj());
            sb.append(getResources().getString(R$string.f557l1));
            this.f2512h.setText(sb);
            this.f2523s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_like) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_like)) {
            this.f2522r.setVisibility(0);
            this.f2512h.setText(getLikeFontEmoj() + getResources().getString(R$string.f335C0));
            this.f2523s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, ActivityActionApi.forward_moment)) {
            this.f2522r.setVisibility(0);
            this.f2512h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f2512h.setText("转发了你的视频");
            this.f2523s.setVisibility(8);
        }
        m4325M0();
        xdl0.M(this.f2513i, false);
        if (!TextUtils.isEmpty(this.f2527w.replyMessageId) && m4340U(momentActivity)) {
            MomentMessage momentMessageM4322L = m4322L(this.f2527w.replyMessageId);
            if (NullChecker.a(momentMessageM4322L)) {
                xdl0.M(this.f2513i, true);
                this.f2513i.setText(m4320K(momentActivity, new SpannableStringBuilder(momentMessageM4322L.value), true, momentMessageM4322L));
                this.f2513i.setFocusable(false);
                this.f2513i.setMovementMethod(LinkMovementMethod.getInstance());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("回复了你的评论：");
                VText vText = this.f2512h;
                vText.setText(spannableStringBuilder.append(vText.getText()));
                this.f2513i.setMaxLines(3);
                this.f2513i.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        m4317I0(momentActivity, i, moment);
        m4332Q(moment, user);
        boolean z = TEnum.equals(this.f2527w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f2527w.action, "comment");
        this.f2519o.getPaint().setFakeBoldText(true);
        this.f2521q.getPaint().setFakeBoldText(true);
        xdl0.M(this.f2521q, false);
        if (z && !nkg.m12255o()) {
            xdl0.M(this.f2519o, true);
            this.f2519o.setText("回复评论");
            xdl0.E0(this.f2519o, new View.OnClickListener() { // from class: l.sw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13101a.m4365s0(user, moment, view);
                }
            });
            if (nkg.m12259q() && nkg.m12208F(vqg.m15510d0()) && FeedModule.m1140H().counter_().flower.count > 0) {
                p6j0.m12914d("e_red_flower", "p_activity", new p6j0.C2456a[0]);
                xdl0.M(this.f2521q, true);
                xdl0.E0(this.f2521q, new View.OnClickListener() { // from class: l.tw60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13452a.m4366t0(user, moment, view);
                    }
                });
            }
        } else if (!nkg.m12214L() || !TEnum.equals(this.f2527w.action, "like")) {
            xdl0.M(this.f2519o, false);
        } else if (TextUtils.isEmpty(this.f2527w.actors) || !aeh.m8505b(this.f2527w.actors)) {
            m4323L0(moment, user);
        } else {
            xdl0.M(this.f2521q, false);
            xdl0.M(this.f2519o, true);
            this.f2519o.setText("聊聊");
            p6j0.m12915e("e_activity_chat", "p_activity", j760.a("moments_user_id", this.f2527w.actors));
            xdl0.E0(this.f2519o, new View.OnClickListener() { // from class: l.uw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13970a.m4367u0(view);
                }
            });
        }
        if (!nkg.m12214L() || !aeh.m8506c(this.f2527w)) {
            m4328O();
            return;
        }
        if (aeh.m8508e(this.f2527w)) {
            str = aeh.m8505b(this.f2527w.actors) ? "好友" : "你喜欢的人";
        }
        if (TextUtils.isEmpty(str)) {
            m4328O();
            return;
        }
        this.f2511g.getPaint().setFakeBoldText(true);
        xdl0.M(this.f2511g, true);
        this.f2511g.setText(str);
        int i3 = this.f2498D;
        if (i3 > 0) {
            this.f2509e.setMaxWidth((i3 - ((int) this.f2511g.getPaint().measureText(str))) - t100.k);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m4312F0(vu60 vu60Var, final MomentActivity momentActivity, final int i, final zkg zkgVar, final int i2) {
        m4308B0(vu60Var);
        vu60Var.c(m4316I(), FeedModule.f316d.f14951S0).subscribe(mkd0.G(new e30() { // from class: l.rv60
            public final void call(Object obj) {
                this.f12740a.m4361o0((j760) obj);
            }
        }));
        if (nkg.m12259q() && nkg.m12208F(vqg.m15510d0())) {
            vu60Var.c(m4316I(), c.combineLatest(FeedModule.m1140H().counter().map(new w9j() { // from class: l.cw60
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Counter) obj).flower.count > 0);
                }
            }).distinctUntilChanged(), FeedModule.m1140H().M9(momentActivity.actors).distinctUntilChanged(), new ciz())).subscribe(mkd0.G(new e30() { // from class: l.nw60
                public final void call(Object obj) {
                    this.f10917a.m4362p0(momentActivity, i, zkgVar, i2, (j760) obj);
                }
            }));
        } else {
            m4311E0(momentActivity, i, zkgVar, i2);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m4313G0() {
        if (!PhotoAlbumActivitiesAct.f3705j.equals(this.f2528x)) {
            boolean z = this.f2527w.read;
            View view = this.f2506b;
            if (z) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
        this.f2509e.setTextColor(m4316I().getResources().getColor(e1c0.f7150l));
        this.f2512h.setTextColor(m4316I().getResources().getColor(e1c0.f7104C));
        this.f2513i.setTextColor(m4316I().getResources().getColor(e1c0.f7104C));
        this.f2518n.setTextColor(m4316I().getResources().getColor(e1c0.f7148k));
    }

    /* JADX INFO: renamed from: H */
    public final void m4314H(View view) {
        ex60.m9960a(this, view);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m4315H0(User user, Moment moment) {
        this.f2522r.setVisibility(8);
        this.f2523s.setVisibility(0);
        if (NullChecker.a(user.localFollowship) && (TEnum.equals(user.localFollowship.state, "matched") || TEnum.equals(user.localFollowship.state, FollowshipStatus.following))) {
            this.f2523s.setBackground(getResources().getDrawable(f3c0.f7864n4));
            this.f2523s.setSelected(true);
            this.f2523s.setTextColor(-1);
            boolean zEquals = TEnum.equals(user.localFollowship.state, "matched");
            VButton vButton = this.f2523s;
            if (zEquals) {
                vButton.setText(R$string.f403N2);
                this.f2523s.setTextColor(m4316I().getResources().getColor(e1c0.f7107F));
            } else {
                vButton.setText(R$string.f415P2);
                this.f2523s.setTextColor(m4316I().getResources().getColor(e1c0.f7107F));
            }
        } else {
            this.f2523s.setBackgroundDrawable(getResources().getDrawable(f3c0.f7888q4));
            this.f2523s.setText("回关");
            this.f2523s.setTextColor(-1);
            xdl0.M0(this.f2523s, true);
            m4318J(FeedModule.f316d.m16628e8(this.f2527w.actors).m19150clone());
        }
        this.f2512h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f2512h.setText(R$string.f391L2);
    }

    /* JADX INFO: renamed from: I */
    public Act m4316I() {
        return getContext();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m4317I0(MomentActivity momentActivity, int i, Moment moment) {
        if (i == 0) {
            if (m4344X(momentActivity)) {
                TopicMoment topicMoment = pv60.f11990a.get(this.f2527w.reference.f693id);
                this.f2529y = topicMoment;
                this.f2525u.setText(topicMoment != null ? topicMoment.name : "");
            } else if (NullChecker.a(moment)) {
                this.f2525u.setText(Pattern.compile("\\s*|\t|\r|\n").matcher(moment.value).replaceAll(""));
            }
        }
        if (i == 7 && NullChecker.a(moment)) {
            this.f2525u.setText(String.format("%s''", Integer.valueOf(Math.round(((Audio) moment.media.get(0)).duration))));
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (moment == null) {
                qib0.G.o(this.f2526v[i2]);
            } else {
                Media media = moment.media.get(i2);
                Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
                if (NullChecker.b(picture)) {
                    qib0.G.Q0(this.f2526v[i2], picture.momentPictureSmall());
                } else {
                    qib0.G.o(this.f2526v[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m4318J(User user) {
    }

    /* JADX INFO: renamed from: J0 */
    public final void m4319J0(User user) {
        this.f2522r.setVisibility(8);
        this.f2523s.setVisibility(0);
        this.f2523s.setBackground(getResources().getDrawable(f3c0.f7864n4));
        this.f2523s.setSelected(false);
        this.f2523s.setTextColor(-1);
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f2523s.setText("聊天");
            xdl0.M(this.f2523s, true);
        } else if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "liked")) {
            xdl0.M(this.f2523s, false);
        } else if (FeedModule.m1140H().pq() || !vqg.m15471D()) {
            this.f2523s.setText("喜欢".concat(user.isFemale() ? "她" : "他"));
            p6j0.m12915e("e_respond_match", "p_activity", j760.a("user_id", ((DbObject) user).id));
        } else {
            xdl0.M(this.f2523s, true);
            this.f2523s.setText("查看");
        }
        if (!FeedModule.m1140H().pq() && nkg.m12243i() && vqg.m15471D()) {
            qib0.G.O(this.f2508d, user.m1042fp().profileMiddle().formatted(), 4, 30);
        }
        this.f2512h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f2512h.setText("通过你发布的动态喜欢了你");
        p6j0.m12915e("e_card_detail", "p_activity", j760.a("moments_user_id", ((DbObject) user).id));
    }

    /* JADX INFO: renamed from: K */
    public final SpannableStringBuilder m4320K(MomentActivity momentActivity, SpannableStringBuilder spannableStringBuilder, boolean z, MomentMessage momentMessage) {
        if (spannableStringBuilder.length() == 0) {
            spannableStringBuilder.append(" ");
        }
        int length = spannableStringBuilder.length();
        boolean z2 = !z && (NullChecker.a(momentActivity.media) || NullChecker.a(momentActivity.stickerInfo));
        if ((z && (NullChecker.a(momentActivity.replyStickerInfo) || TEnum.equals(momentMessage.messageType, "picture"))) || z2) {
            Drawable drawable = m4316I().getDrawable(f3c0.f7875p);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicWidth());
            spannableStringBuilder.setSpan(new uch(drawable, t100.d(length == 0 ? 0.0f : 5.0f), t100.d(3.0f)), length == 0 ? 0 : length - 1, length, 1);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("查看图片");
            spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8f), 0, 4, 18);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 0, 4, 18);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.setSpan(new C2108a(z, momentMessage, momentActivity), length != 0 ? length - 1 : 0, spannableStringBuilder.length() - 1, 17);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m4321K0(User user) {
        xdl0.M(this.f2523s, true);
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f2523s.setText("聊天");
            return;
        }
        if (NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "liked")) {
            xdl0.M(this.f2523s, false);
            return;
        }
        xdl0.M(this.f2523s, true);
        if (FeedModule.m1140H().pq() || !vqg.m15471D()) {
            this.f2523s.setText("喜欢".concat(user.isFemale() ? "她" : "他"));
        } else {
            this.f2523s.setText("查看");
        }
    }

    /* JADX INFO: renamed from: L */
    public final MomentMessage m4322L(String str) {
        return FeedModule.f316d.f14925H0.get(str);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m4323L0(final Moment moment, final User user) {
        if (!nkg.m12259q()) {
            this.f2519o.setText("礼貌回谢");
            p6j0.m12915e("e_polite_gratitude", "p_activity", j760.a("moments_user_id", this.f2527w.actors));
        } else if (FeedModule.m1140H().gp(((DbObject) user).id)) {
            xdl0.M(this.f2521q, false);
            xdl0.M(this.f2519o, true);
            this.f2519o.setText("聊聊");
            zi60.m17436w().m17463t(moment, "p_activity", false, false);
        } else if (!nkg.m12208F(vqg.m15510d0()) || FeedModule.m1140H().counter_().flower.count <= 0) {
            this.f2519o.setText("打招呼");
            xdl0.M(this.f2519o, true);
            xdl0.M(this.f2521q, false);
            zi60.m17436w().m17463t(moment, "p_activity", true, false);
        } else {
            xdl0.M(this.f2519o, false);
            xdl0.M(this.f2521q, true);
            p6j0.m12914d("e_red_flower", "p_activity", new p6j0.C2456a[0]);
            xdl0.E0(this.f2521q, new View.OnClickListener() { // from class: l.vv60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14308a.m4370x0(moment, view);
                }
            });
        }
        xdl0.E0(this.f2519o, new View.OnClickListener() { // from class: l.wv60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14690a.m4369w0(user, moment, view);
            }
        });
        this.f2504J = false;
        m4331P0();
    }

    /* JADX INFO: renamed from: M */
    public final List<j760<String, String>> m4324M(Moment moment, MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        if (moment != null && momentMessage != null) {
            arrayList.add(j760.a("moment_id", ((DbObject) moment).id));
            arrayList.add(j760.a("owner_id", moment.owner));
            zi60.m17436w();
            arrayList.add(j760.a("moment_showfrom", zi60.m17435D(this.f2495A.getFrom())));
            arrayList.add(j760.a("moment_type", zi60.m17436w().m17467y(moment)));
            arrayList.add(j760.a("comment_detail", momentMessage.isChildComment() ? "reply" : "comment"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    public void m4325M0() {
        this.f2502H = 0;
        this.f2504J = false;
        xdl0.M(this.f2520p, false);
        m4310D0();
    }

    /* JADX INFO: renamed from: N */
    public final String m4326N(List<String> list, String str) {
        if (TEnum.equals(this.f2527w.action, "like")) {
            return str;
        }
        if (vwb.J(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < list.size()) {
            sb.append(list.get(i));
            i++;
            if (i != list.size()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m4327N0(Moment moment, User user) {
        if (this.f2530z == null) {
            jg5 jg5Var = new jg5(m4316I(), a8c0.f5633b);
            this.f2530z = jg5Var;
            jg5Var.m11174a0();
        }
        this.f2530z.m11176d0(this.f2509e.getText().toString());
        jg5 jg5Var2 = this.f2530z;
        String str = this.f2528x;
        boolean zIsEmpty = TextUtils.isEmpty(this.f2527w.parentMessageid);
        MomentActivity momentActivity = this.f2527w;
        jg5Var2.m11175b0(moment, str, zIsEmpty ? momentActivity.messageid : momentActivity.parentMessageid, ((DbObject) user).id, this.f2527w.messageid, new d30() { // from class: l.jw60
            public final void call() {
                this.f9540a.m4341U0();
            }
        });
        this.f2530z.show();
    }

    /* JADX INFO: renamed from: O */
    public final void m4328O() {
        xdl0.M(this.f2511g, false);
        int i = this.f2498D;
        if (i > 0) {
            this.f2509e.setMaxWidth(i);
        }
    }

    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final void m4363q0(User user, Moment moment) {
        p6j0.m12913c("e_comment", "p_activity", (j760[]) m4324M(moment, m4322L(this.f2527w.messageid)).toArray(new j760[0]));
        m4327N0(moment, user);
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: P */
    public void m4330P(int i) {
        int i2 = o6c0.f11015A1;
        if (i != 0) {
            if (i == 1) {
                i2 = o6c0.f11092M4;
            } else if (i == 2) {
                i2 = o6c0.f11104O4;
            } else if (i == 3) {
                i2 = o6c0.f11098N4;
            } else if (i == 4) {
                i2 = o6c0.f11080K4;
            } else if (i == 6) {
                i2 = o6c0.f11110P4;
            } else if (i == 7) {
                i2 = o6c0.f11022B1;
            }
        }
        int i3 = 0;
        View viewInflate = m4316I().inflater().inflate(i2, (ViewGroup) this.f2522r, false);
        this.f2525u = viewInflate.findViewById(b5c0.f5994Q1);
        this.f2526v[0] = (VDraweeView) viewInflate.findViewById(b5c0.f6076o0);
        this.f2526v[1] = (VDraweeView) viewInflate.findViewById(b5c0.f6082q0);
        this.f2526v[2] = (VDraweeView) viewInflate.findViewById(b5c0.f6079p0);
        this.f2526v[3] = (VDraweeView) viewInflate.findViewById(b5c0.f6073n0);
        this.f2522r.addView(viewInflate, 0);
        if (i == 1 || i == 6) {
            DraweeView[] draweeViewArr = this.f2526v;
            int length = draweeViewArr.length;
            while (i3 < length) {
                DraweeView draweeView = draweeViewArr[i3];
                if (draweeView != null) {
                    draweeView.getHierarchy().H(new RoundingParams().s(t100.d(10.0f)));
                }
                i3++;
            }
            return;
        }
        DraweeView[] draweeViewArr2 = this.f2526v;
        int length2 = draweeViewArr2.length;
        while (i3 < length2) {
            DraweeView draweeView2 = draweeViewArr2[i3];
            if (draweeView2 != null) {
                draweeView2.getHierarchy().H(new RoundingParams().s(t100.d(5.0f)));
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m4331P0() {
        if (NullChecker.a(this.f2501G)) {
            this.f2501G.cancel();
        }
        Animator animatorP = bt0.p(this.f2520p, "translationX", 500L, 800L, new AccelerateDecelerateInterpolator(), new float[]{0.0f, t100.d(60.0f)});
        this.f2501G = animatorP;
        bt0.v(animatorP, new Runnable() { // from class: l.vw60
            @Override // java.lang.Runnable
            public final void run() {
                this.f14313a.m4371y0();
            }
        });
        bt0.f(this.f2501G, new Runnable() { // from class: l.ww60
            @Override // java.lang.Runnable
            public final void run() {
                this.f14696a.m4372z0();
            }
        });
        this.f2501G.start();
    }

    /* JADX INFO: renamed from: Q */
    public final void m4332Q(final Moment moment, final User user) {
        vwb.z(vwb.f0(new ViewGroup[]{this.f2505a, this.f2507c, this.f2522r}), new e30() { // from class: l.xv60
            public final void call(Object obj) {
                this.f15157a.m4336S((ViewGroup) obj);
            }
        });
        m4336S(this.f2508d);
        m4336S(this.f2523s);
        final boolean z = NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched");
        if (TEnum.equals(this.f2527w.action, ActivityActionApi.moment_swipe)) {
            this.f2507c.setOnClickListener(new View.OnClickListener() { // from class: l.yv60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15506a.m4345Y(z, moment, user, view);
                }
            });
        } else if (TEnum.equals(this.f2527w.action, "follow")) {
            this.f2507c.setOnClickListener(new View.OnClickListener() { // from class: l.zv60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15860a.m4346Z(moment, user, view);
                }
            });
        } else if (m4344X(this.f2527w)) {
            vwb.z(vwb.f0(new ViewGroup[]{this.f2507c, this.f2522r}), new e30() { // from class: l.aw60
                public final void call(Object obj) {
                    this.f5865a.m4348b0((ViewGroup) obj);
                }
            });
        } else if (TEnum.equals(this.f2527w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f2527w.action, "comment")) {
            vwb.z(vwb.f0(new ViewGroup[]{this.f2507c, this.f2522r}), new e30() { // from class: l.bw60
                public final void call(Object obj) {
                    this.f6443a.m4349c0(moment, (ViewGroup) obj);
                }
            });
        } else if ((nkg.m12225W() && PhotoAlbumActivitiesAct.f3705j.equals(this.f2528x)) || m4342V()) {
            this.f2507c.setOnClickListener(new View.OnClickListener() { // from class: l.dw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7077a.m4350d0(moment, user, view);
                }
            });
            this.f2522r.setOnClickListener(m4333Q0(moment));
        } else {
            vwb.z(vwb.f0(new ViewGroup[]{this.f2507c, this.f2522r}), new e30() { // from class: l.ew60
                public final void call(Object obj) {
                    this.f7487a.m4351e0(moment, (ViewGroup) obj);
                }
            });
        }
        boolean zEquals = TEnum.equals(this.f2527w.action, ActivityActionApi.moment_swipe);
        VDraweeView vDraweeView = this.f2508d;
        if (zEquals) {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.fw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8259a.m4352f0(z, moment, user, view);
                }
            });
        } else {
            m4338T(moment, vDraweeView, user);
        }
        m4334R(this.f2523s, user);
    }

    /* JADX INFO: renamed from: Q0 */
    public final View.OnClickListener m4333Q0(final Moment moment) {
        return new View.OnClickListener() { // from class: l.iw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9147a.m4307A0(moment, view);
            }
        };
    }

    /* JADX INFO: renamed from: R */
    public final void m4334R(View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.kw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9808a.m4353g0(user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final void m4335R0(Moment moment, User user, String str) {
        vs0.m15572j(m4316I(), moment, ((DbObject) user).id, str, false);
    }

    /* JADX INFO: renamed from: S */
    public final void m4336S(View view) {
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.gw60
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f8529a.m4356j0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public final void m4337S0(Moment moment, User user) {
        if (vs0.m15566d(moment)) {
            return;
        }
        zvf0.u("e_likes_list", "p_content_likes", new j760[]{j760.a("user_id", ((DbObject) user).id), j760.a("moment_id", ((DbObject) moment).id)});
        m4339T0(user);
    }

    /* JADX INFO: renamed from: T */
    public final void m4338T(final Moment moment, View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.lw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10143a.m4357k0(moment, user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final void m4339T0(User user) {
        m4316I().startActivity(vs0.m15564b(m4316I(), ((DbObject) user).id, "photo_album_feed_from_activity"));
    }

    /* JADX INFO: renamed from: U */
    public boolean m4340U(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m4341U0() {
        MomentActivity momentActivity = this.f2527w;
        if (momentActivity.read) {
            return;
        }
        momentActivity.read = true;
        this.f2495A.mo5855M1(((DbObject) momentActivity).id, 0);
        this.f2506b.setVisibility(8);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m4342V() {
        return nkg.m12225W() && PhotoAlbumActivitiesAct.f3705j.equals(this.f2528x);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m4343W(ActivityActionApi activityActionApi) {
        return TEnum.equals(activityActionApi, ActivityActionApi.comment_reply) || TEnum.equals(activityActionApi, "comment");
    }

    /* JADX INFO: renamed from: X */
    public final boolean m4344X(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_like) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m4345Y(boolean z, Moment moment, User user, View view) {
        if (FeedModule.m1140H().pq() || z || !vqg.m15471D()) {
            m4335R0(moment, user, "photo_album_activities");
        } else {
            kjb0.m11441E(m4316I(), null, "p_activity,default");
        }
        p6j0.m12913c("e_card_detail", "p_activity", j760.a("moments_user_id", ((DbObject) user).id));
        m4341U0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m4346Z(Moment moment, User user, View view) {
        m4335R0(moment, user, "photo_album_activities");
        m4341U0();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m4347a0(View view) {
        if (this.f2529y == null) {
            return;
        }
        Act actM4316I = m4316I();
        Act actM4316I2 = m4316I();
        TopicMoment topicMoment = this.f2529y;
        actM4316I.startActivity(TopicVoteAggregationAct.m7327V1(actM4316I2, topicMoment.f708id, topicMoment.owner.f220id, null));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m4348b0(ViewGroup viewGroup) {
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.mw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10585a.m4347a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m4349c0(Moment moment, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(m4333Q0(moment));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m4350d0(Moment moment, User user, View view) {
        m4337S0(moment, user);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m4351e0(Moment moment, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(m4333Q0(moment));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m4352f0(boolean z, Moment moment, User user, View view) {
        if (FeedModule.m1140H().pq() || z || !vqg.m15471D()) {
            m4335R0(moment, user, "photo_album_activities");
        } else {
            kjb0.m11441E(m4316I(), null, "p_activity,default");
        }
        m4341U0();
        p6j0.m12913c("e_card_detail", "p_activity", j760.a("moments_user_id", ((DbObject) user).id));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m4353g0(User user, View view) {
        if (TEnum.equals(this.f2527w.action, ActivityActionApi.moment_swipe)) {
            if (this.f2523s.getText().equals("喜欢".concat(user.isFemale() ? "她" : "他"))) {
                p6j0.m12913c("e_respond_match", "p_activity", j760.a("user_id", ((DbObject) user).id));
                FeedModule.m1140H().Rs(m4316I(), user, true, FeedModule.m1140H().pq() ? LikeFrom.get("momentPick") : LikeFrom.get("moment"), (String) null, true, "featured");
            } else if (this.f2523s.getText().equals("查看")) {
                p6j0.m12913c("e_card_detail", "p_activity", j760.a("moments_user_id", ((DbObject) user).id));
                kjb0.m11441E(m4316I(), null, "p_activity,default");
            } else {
                m4316I().startActivity(kjb0.m11451c(m4316I(), ((DbObject) user).id, false, false));
            }
            m4341U0();
            return;
        }
        final User userM19150clone = FeedModule.f316d.m16628e8(this.f2527w.actors).m19150clone();
        if (NullChecker.b(userM19150clone)) {
            m4341U0();
            if (!NullChecker.a(userM19150clone.localFollowship)) {
                FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), userM19150clone, true, "p_activity");
                return;
            }
            FollowshipStatus followshipStatus = userM19150clone.localFollowship.state;
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                v1h.m15267v0(m4316I(), getResources().getString(R$string.f644z), new d30() { // from class: l.qw60
                    public final void call() {
                        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), userM19150clone, false, "p_activity");
                    }
                });
            } else if (userM19150clone.profile.moments.hidePublicMoments) {
                lsi0.w(R$string.f590q);
            } else {
                FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), userM19150clone, true, "p_activity");
            }
        }
    }

    @NotNull
    public String getLikeFontEmoj() {
        return ((nkg.m12225W() && PhotoAlbumActivitiesAct.f3705j.equals(this.f2528x)) || m4342V()) ? "" : "❤️";
    }

    public j760<User, Moment> getUserAndMoment() {
        return new j760<>(FeedModule.f316d.m16628e8(this.f2527w.actors), FeedModule.f316d.f14982i0.get(this.f2527w.reference.f693id));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m4354h0(View view) {
        this.f2496B.b();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m4355i0(VListCell vListCell, VListCell.a aVar, int i) {
        this.f2495A.mo5853G3(((DbObject) this.f2527w).id);
        this.f2496B.b();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m4356j0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R$string.f513f));
        c40.b bVar = new c40.b(view.getContext());
        bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.ow60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11625a.m4354h0(view2);
            }
        }).Q(arrayList).R(new int[]{0}, new int[]{e1c0.f7106E}).V(new c40.d() { // from class: l.pw60
            /* JADX INFO: renamed from: a */
            public final void m13269a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f11994a.m4355i0(vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f2496B = c40VarF;
        c40VarF.f();
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m4357k0(Moment moment, User user, View view) {
        m4341U0();
        if (m4342V()) {
            m4337S0(moment, user);
        } else {
            m4335R0(moment, user, "photo_album_activities");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m4358l0() {
        this.f2502H++;
        m4331P0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m4359m0(roj0 roj0Var) {
        if (this.f2499E != FeedModule.m1140H().pq()) {
            this.f2499E = FeedModule.m1140H().pq();
            m4311E0(this.f2527w, this.f2497C, this.f2495A, this.f2500F);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m4360n0(Boolean bool) {
        if (m4316I() == null || m4316I().isDestroyed() || m4316I().isFinishing() || !bool.booleanValue()) {
            return;
        }
        osi0.g("小红花已发送");
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m4361o0(j760 j760Var) {
        if (NullChecker.a(this.f2527w) && ((DbObject) ((User) j760Var.a)).id.equals(this.f2527w.actors)) {
            m4321K0((User) j760Var.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4310D0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4314H(this);
        this.f2498D = this.f2509e.getMaxWidth();
        this.f2499E = FeedModule.m1140H().pq();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m4362p0(MomentActivity momentActivity, int i, zkg zkgVar, int i2, j760 j760Var) {
        m4311E0(momentActivity, i, zkgVar, i2);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m4364r0(User user, Moment moment, Boolean bool) {
        if (bool.booleanValue()) {
            m4363q0(user, moment);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m4365s0(final User user, final Moment moment, View view) {
        if (nkg.m12274x0()) {
            kyg.m11537f(m4316I(), "p_fake_nearby_comments_popup", user, new d30() { // from class: l.tv60
                public final void call() {
                    this.f13427a.m4363q0(user, moment);
                }
            }, new e30() { // from class: l.uv60
                public final void call(Object obj) {
                    this.f13963a.m4364r0(user, moment, (Boolean) obj);
                }
            });
        } else {
            m4363q0(user, moment);
        }
    }

    public void setFrom(String str) {
        this.f2528x = str;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m4366t0(User user, Moment moment, View view) {
        if (FeedModule.m1140H().gp(((DbObject) user).id)) {
            osi0.g("你们已经是好友了，去聊聊天吧");
        } else {
            m4309C0(moment);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m4367u0(View view) {
        p6j0.m12913c("e_activity_chat", "p_activity", j760.a("moments_user_id", this.f2527w.actors));
        m4316I().startActivity(kjb0.m11451c(m4316I(), this.f2527w.actors, false, false));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m4368v0(Boolean bool) {
        if (m4316I() == null || m4316I().isDestroyed() || m4316I().isFinishing() || !bool.booleanValue()) {
            return;
        }
        osi0.g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m4369w0(User user, Moment moment, View view) {
        m4341U0();
        if (nkg.m12259q()) {
            FeedModule.f315c.m1650f3(m4316I(), user, null, "p_activity", false);
            zi60.m17436w().m17462s(moment, "p_activity", true, false);
        } else {
            p6j0.m12913c("e_polite_gratitude", "p_activity", j760.a("moments_user_id", this.f2527w.actors));
            FeedModule.m1140H().Vk(m4316I(), mah.m11869b().m11871c(), this.f2527w.actors, moment == null ? null : ((DbObject) moment).id, moment != null ? moment.owner : null, Channel.get(Channel.reply_thanks), new e30() { // from class: l.hw60
                public final void call(Object obj) {
                    this.f8829a.m4368v0((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m4370x0(Moment moment, View view) {
        m4309C0(moment);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m4371y0() {
        xdl0.M(this.f2520p, xdl0.O0(this.f2519o) && TextUtils.equals(this.f2519o.getText().toString(), "礼貌回谢"));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m4372z0() {
        this.f2520p.setVisibility(8);
        this.f2501G = null;
        if (this.f2502H > 1 || this.f2504J) {
            return;
        }
        e51.H(m4316I(), this.f2503I, 750L);
    }

    public PhotoAlbumActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2526v = new VDraweeView[4];
        this.f2498D = -1;
        this.f2502H = 0;
        this.f2503I = new Runnable() { // from class: l.rw60
            @Override // java.lang.Runnable
            public final void run() {
                this.f12747a.m4358l0();
            }
        };
        this.f2504J = false;
    }

    public PhotoAlbumActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2526v = new VDraweeView[4];
        this.f2498D = -1;
        this.f2502H = 0;
        this.f2503I = new Runnable() { // from class: l.rw60
            @Override // java.lang.Runnable
            public final void run() {
                this.f12747a.m4358l0();
            }
        };
        this.f2504J = false;
    }
}
