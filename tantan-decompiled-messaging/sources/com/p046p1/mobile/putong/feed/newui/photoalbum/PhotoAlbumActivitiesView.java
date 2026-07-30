package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VListCell;
import p147v.VText;
import p149l.a8c0;
import p149l.aeh;
import p149l.b5c0;
import p149l.bt0;
import p149l.c40;
import p149l.ciz;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.ex60;
import p149l.f3c0;
import p149l.j760;
import p149l.jg5;
import p149l.kjb0;
import p149l.kyg;
import p149l.lsi0;
import p149l.mah;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nkg;
import p149l.o2h;
import p149l.o6c0;
import p149l.osi0;
import p149l.p6j0;
import p149l.pv60;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.uch;
import p149l.v1h;
import p149l.vqg;
import p149l.vs0;
import p149l.vu60;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zi60;
import p149l.zkg;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumActivitiesView extends LinearLayout {

    /* JADX INFO: renamed from: A */
    public zkg f41034A;

    /* JADX INFO: renamed from: B */
    public c40 f41035B;

    /* JADX INFO: renamed from: C */
    public int f41036C;

    /* JADX INFO: renamed from: D */
    public int f41037D;

    /* JADX INFO: renamed from: E */
    public boolean f41038E;

    /* JADX INFO: renamed from: F */
    public int f41039F;

    /* JADX INFO: renamed from: G */
    public Animator f41040G;

    /* JADX INFO: renamed from: H */
    public int f41041H;

    /* JADX INFO: renamed from: I */
    public Runnable f41042I;

    /* JADX INFO: renamed from: J */
    public boolean f41043J;

    /* JADX INFO: renamed from: a */
    public FrameLayout f41044a;

    /* JADX INFO: renamed from: b */
    public View f41045b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f41046c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f41047d;

    /* JADX INFO: renamed from: e */
    public TextView f41048e;

    /* JADX INFO: renamed from: f */
    public VImage f41049f;

    /* JADX INFO: renamed from: g */
    public VText f41050g;

    /* JADX INFO: renamed from: h */
    public VText f41051h;

    /* JADX INFO: renamed from: i */
    public VText f41052i;

    /* JADX INFO: renamed from: j */
    public FeedUserHeaderView f41053j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f41054k;

    /* JADX INFO: renamed from: l */
    public VText f41055l;

    /* JADX INFO: renamed from: m */
    public ImageView f41056m;

    /* JADX INFO: renamed from: n */
    public VText f41057n;

    /* JADX INFO: renamed from: o */
    public VText f41058o;

    /* JADX INFO: renamed from: p */
    public VImage f41059p;

    /* JADX INFO: renamed from: q */
    public VText f41060q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f41061r;

    /* JADX INFO: renamed from: s */
    public VButton f41062s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f41063t;

    /* JADX INFO: renamed from: u */
    public VText f41064u;

    /* JADX INFO: renamed from: v */
    public VDraweeView[] f41065v;

    /* JADX INFO: renamed from: w */
    public MomentActivity f41066w;

    /* JADX INFO: renamed from: x */
    public String f41067x;

    /* JADX INFO: renamed from: y */
    public TopicMoment f41068y;

    /* JADX INFO: renamed from: z */
    public jg5 f41069z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView$a */
    public class C11264a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f41070a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MomentMessage f41071b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MomentActivity f41072c;

        public C11264a(boolean z, MomentMessage momentMessage, MomentActivity momentActivity) {
            this.f41070a = z;
            this.f41071b = momentMessage;
            this.f41072c = momentActivity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            StickerInfo stickerInfo;
            Media media;
            if (this.f41070a) {
                media = !vwb.m200296J(this.f41071b.media) ? this.f41071b.media.get(0) : null;
                stickerInfo = this.f41072c.replyStickerInfo;
            } else {
                MomentActivity momentActivity = this.f41072c;
                Media media2 = momentActivity.media;
                stickerInfo = momentActivity.stickerInfo;
                media = media2;
            }
            PhotoAlbumActivitiesView.this.m63299I().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m64066V1(PhotoAlbumActivitiesView.this.m63299I(), vwb.m200324f0(media), stickerInfo, this.f41072c.reference.f39232id), new o2h());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    public PhotoAlbumActivitiesView(Context context) {
        super(context);
        this.f41065v = new VDraweeView[4];
        this.f41037D = -1;
        this.f41041H = 0;
        this.f41042I = new Runnable() { // from class: l.rw60
            @Override // java.lang.Runnable
            public final void run() {
                this.f161317a.m63341l0();
            }
        };
        this.f41043J = false;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m63290A0(Moment moment, View view) {
        if (NullChecker.m81303a(moment)) {
            if (xdl0.m208349O0(this.f41050g) && NullChecker.m81303a(this.f41066w) && !TextUtils.isEmpty(this.f41050g.getText().toString())) {
                String strM96092a = aeh.m96092a(this.f41066w);
                if (!TextUtils.isEmpty(strM96092a)) {
                    j760 j760VarM140076a = j760.m140076a("usertagname", this.f41050g.getText().toString());
                    MomentActivity momentActivity = this.f41066w;
                    p6j0.m167669c(strM96092a, "p_activity", j760VarM140076a, j760.m140076a("moments_user_id", momentActivity == null ? "" : momentActivity.actors));
                }
            }
            MomentDetailAct.C11306a c11306aM64846m = MomentDetailAct.C11306a.m64834a(getContext()).m64839f(PhotoAlbumActivitiesAct.f42244j.equals(this.f41067x) ? "photo_album_praised" : "from_activities_moment").m64846m(moment.f56011id);
            MomentActivity momentActivity2 = this.f41066w;
            Intent intentM64835b = c11306aM64846m.m64845l(m63309N(momentActivity2.userIds, momentActivity2.actors)).m64855v(TEnum.equals(this.f41066w.action, ActivityActionApi.merge_likes) || TEnum.equals(this.f41066w.action, "like")).m64847n(moment.owner).m64853t(true).m64848o(moment.momentValue).m64849p(m63326W(this.f41066w.action) ? this.f41066w.messageid : "").m64835b();
            if (intentM64835b == null) {
                return;
            }
            m63299I().startActivityForResult(intentM64835b, PhotoAlbumActivitiesAct.f42242h);
            if (TEnum.equals(this.f41066w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f41066w.action, "comment") || TEnum.equals(this.f41066w.action, "like") || TEnum.equals(this.f41066w.action, ActivityActionApi.merge_likes) || TEnum.equals(this.f41066w.action, ActivityActionApi.comment_like)) {
                m63324U0();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m63291B0(vu60 vu60Var) {
        vu60Var.mo67374c(m63299I(), FeedModule.m60222H().mo30834wb()).subscribe(mkd0.m154955G(new e30() { // from class: l.xw60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194706a.m63342m0((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m63292C0(Moment moment) {
        m63324U0();
        p6j0.m167668b("e_red_flower", "p_activity", new p6j0.C19147a[0]);
        FeedModule.m60222H().mo30730Vk(m63299I(), mah.m153662b().m153664c(), this.f41066w.actors, moment == null ? null : moment.f56011id, moment != null ? moment.owner : null, Channel.get(Channel.red_flower), new e30() { // from class: l.sv60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166542a.m63343n0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m63293D0() {
        e51.m114745J(this.f41042I);
        this.f41043J = true;
        if (NullChecker.m81303a(this.f41040G) && this.f41040G.isRunning()) {
            this.f41040G.cancel();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m63294E0(MomentActivity momentActivity, int i, zkg zkgVar, int i2) {
        this.f41066w = momentActivity;
        this.f41034A = zkgVar;
        this.f41036C = i;
        this.f41039F = i2;
        xdl0.m208344M(this.f41053j, false);
        if (nkg.m159887j0()) {
            xdl0.m208360X(this.f41046c, t100.m186890d(i2 == 0 ? 6.0f : 16.0f));
            xdl0.m208360X(this.f41045b, t100.m186890d(i2 == 0 ? 23.0f : 33.0f));
            xdl0.m208360X(this.f41063t, t100.m186890d(i2 == 0 ? 1.0f : 11.0f));
        }
        setBackgroundColor(-1);
        j760<User, Moment> userAndMoment = getUserAndMoment();
        final User user = userAndMoment.f116564a;
        final Moment moment = userAndMoment.f116565b;
        TextView textView = this.f41048e;
        if (user == null) {
            textView.setText("【异常用户】");
            this.f41047d.setBackgroundResource(0);
            return;
        }
        textView.setText(vs0.m199795a(moment, user.name));
        qib0.f154713b0.f139231b.showUserVerificationLogo(m63299I(), user, this.f41049f);
        vs0.m199799e(moment, this.f41047d, user);
        this.f41063t.setVisibility(8);
        List<Double> list = user.profile.extensions.headFrame.expiredTime;
        if (user.needShowFrame() && !TextUtils.isEmpty(user.headFrameUrl())) {
            xdl0.m208344M(this.f41063t, true);
            qib0.f154691G.m102331L0(this.f41063t, user.headFrameUrl());
            xdl0.m208358V(this.f41063t, t100.m186890d(12.0f));
        } else if (!vwb.m200296J(list) && list.get(0).doubleValue() > mqi0.m155944o() && !vwb.m200296J(user.profile.extensions.headFrame.url)) {
            this.f41063t.setVisibility(0);
            qib0.f154691G.m102331L0(this.f41063t, user.profile.extensions.headFrame.url.get(0));
            xdl0.m208358V(this.f41063t, t100.m186890d(7.0f));
        }
        this.f41057n.setText(mqi0.m155932G(momentActivity.createdTime));
        m63296G0();
        String str = null;
        if (TEnum.equals(momentActivity.action, ActivityActionApi.moment_swipe)) {
            m63302J0(user);
        } else if (TEnum.equals(momentActivity.action, "follow")) {
            m63298H0(user, moment);
        } else if (m63323U(momentActivity)) {
            this.f41061r.setVisibility(0);
            this.f41051h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f41051h.setText(m63303K(momentActivity, new SpannableStringBuilder(momentActivity.value), false, null));
            this.f41052i.setMaxLines(3);
            this.f41051h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f41062s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, "like") || TEnum.equals(momentActivity.action, ActivityActionApi.merge_likes)) {
            this.f41061r.setVisibility(0);
            this.f41051h.setCompoundDrawablesWithIntrinsicBounds(f3c0.f94499d2, 0, 0, 0);
            StringBuilder sb = new StringBuilder();
            sb.append(getLikeFontEmoj());
            sb.append(getResources().getString(R$string.f39096l1));
            this.f41051h.setText(sb);
            this.f41062s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, ActivityActionApi.comment_like) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_like)) {
            this.f41061r.setVisibility(0);
            this.f41051h.setText(getLikeFontEmoj() + getResources().getString(R$string.f38874C0));
            this.f41062s.setVisibility(8);
        } else if (TEnum.equals(momentActivity.action, ActivityActionApi.forward_moment)) {
            this.f41061r.setVisibility(0);
            this.f41051h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f41051h.setText("转发了你的视频");
            this.f41062s.setVisibility(8);
        }
        m63308M0();
        xdl0.m208344M(this.f41052i, false);
        if (!TextUtils.isEmpty(this.f41066w.replyMessageId) && m63323U(momentActivity)) {
            MomentMessage momentMessageM63305L = m63305L(this.f41066w.replyMessageId);
            if (NullChecker.m81303a(momentMessageM63305L)) {
                xdl0.m208344M(this.f41052i, true);
                this.f41052i.setText(m63303K(momentActivity, new SpannableStringBuilder(momentMessageM63305L.value), true, momentMessageM63305L));
                this.f41052i.setFocusable(false);
                this.f41052i.setMovementMethod(LinkMovementMethod.getInstance());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("回复了你的评论：");
                VText vText = this.f41051h;
                vText.setText(spannableStringBuilder.append(vText.getText()));
                this.f41052i.setMaxLines(3);
                this.f41052i.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        m63300I0(momentActivity, i, moment);
        m63315Q(moment, user);
        boolean z = TEnum.equals(this.f41066w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f41066w.action, "comment");
        this.f41058o.getPaint().setFakeBoldText(true);
        this.f41060q.getPaint().setFakeBoldText(true);
        xdl0.m208344M(this.f41060q, false);
        if (z && !nkg.m159896o()) {
            xdl0.m208344M(this.f41058o, true);
            this.f41058o.setText("回复评论");
            xdl0.m208329E0(this.f41058o, new View.OnClickListener() { // from class: l.sw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166633a.m63348s0(user, moment, view);
                }
            });
            if (nkg.m159900q() && nkg.m159849F(vqg.m199540d0()) && FeedModule.m60222H().counter_().flower.count > 0) {
                p6j0.m167670d("e_red_flower", "p_activity", new p6j0.C19147a[0]);
                xdl0.m208344M(this.f41060q, true);
                xdl0.m208329E0(this.f41060q, new View.OnClickListener() { // from class: l.tw60
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f172369a.m63349t0(user, moment, view);
                    }
                });
            }
        } else if (!nkg.m159855L() || !TEnum.equals(this.f41066w.action, "like")) {
            xdl0.m208344M(this.f41058o, false);
        } else if (TextUtils.isEmpty(this.f41066w.actors) || !aeh.m96093b(this.f41066w.actors)) {
            m63306L0(moment, user);
        } else {
            xdl0.m208344M(this.f41060q, false);
            xdl0.m208344M(this.f41058o, true);
            this.f41058o.setText("聊聊");
            p6j0.m167671e("e_activity_chat", "p_activity", j760.m140076a("moments_user_id", this.f41066w.actors));
            xdl0.m208329E0(this.f41058o, new View.OnClickListener() { // from class: l.uw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178625a.m63350u0(view);
                }
            });
        }
        if (!nkg.m159855L() || !aeh.m96094c(this.f41066w)) {
            m63311O();
            return;
        }
        if (aeh.m96096e(this.f41066w)) {
            str = aeh.m96093b(this.f41066w.actors) ? "好友" : "你喜欢的人";
        }
        if (TextUtils.isEmpty(str)) {
            m63311O();
            return;
        }
        this.f41050g.getPaint().setFakeBoldText(true);
        xdl0.m208344M(this.f41050g, true);
        this.f41050g.setText(str);
        int i3 = this.f41037D;
        if (i3 > 0) {
            this.f41048e.setMaxWidth((i3 - ((int) this.f41050g.getPaint().measureText(str))) - t100.f167262k);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m63295F0(vu60 vu60Var, final MomentActivity momentActivity, final int i, final zkg zkgVar, final int i2) {
        m63291B0(vu60Var);
        vu60Var.mo67374c(m63299I(), FeedModule.f38855d.f193016S0).subscribe(mkd0.m154955G(new e30() { // from class: l.rv60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161174a.m63344o0((j760) obj);
            }
        }));
        if (nkg.m159900q() && nkg.m159849F(vqg.m199540d0())) {
            vu60Var.mo67374c(m63299I(), C22306c.combineLatest(FeedModule.m60222H().counter().map(new w9j() { // from class: l.cw60
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Counter) obj).flower.count > 0);
                }
            }).distinctUntilChanged(), FeedModule.m60222H().mo30707M9(momentActivity.actors).distinctUntilChanged(), new ciz())).subscribe(mkd0.m154955G(new e30() { // from class: l.nw60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f140893a.m63345p0(momentActivity, i, zkgVar, i2, (j760) obj);
                }
            }));
        } else {
            m63294E0(momentActivity, i, zkgVar, i2);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m63296G0() {
        if (!PhotoAlbumActivitiesAct.f42244j.equals(this.f41067x)) {
            boolean z = this.f41066w.read;
            View view = this.f41045b;
            if (z) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
        this.f41048e.setTextColor(m63299I().getResources().getColor(e1c0.f88794l));
        this.f41051h.setTextColor(m63299I().getResources().getColor(e1c0.f88748C));
        this.f41052i.setTextColor(m63299I().getResources().getColor(e1c0.f88748C));
        this.f41057n.setTextColor(m63299I().getResources().getColor(e1c0.f88792k));
    }

    /* JADX INFO: renamed from: H */
    public final void m63297H(View view) {
        ex60.m118578a(this, view);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m63298H0(User user, Moment moment) {
        this.f41061r.setVisibility(8);
        this.f41062s.setVisibility(0);
        if (NullChecker.m81303a(user.localFollowship) && (TEnum.equals(user.localFollowship.state, "matched") || TEnum.equals(user.localFollowship.state, FollowshipStatus.following))) {
            this.f41062s.setBackground(getResources().getDrawable(f3c0.f94581n4));
            this.f41062s.setSelected(true);
            this.f41062s.setTextColor(-1);
            boolean zEquals = TEnum.equals(user.localFollowship.state, "matched");
            VButton vButton = this.f41062s;
            if (zEquals) {
                vButton.setText(R$string.f38942N2);
                this.f41062s.setTextColor(m63299I().getResources().getColor(e1c0.f88751F));
            } else {
                vButton.setText(R$string.f38954P2);
                this.f41062s.setTextColor(m63299I().getResources().getColor(e1c0.f88751F));
            }
        } else {
            this.f41062s.setBackgroundDrawable(getResources().getDrawable(f3c0.f94605q4));
            this.f41062s.setText("回关");
            this.f41062s.setTextColor(-1);
            xdl0.m208345M0(this.f41062s, true);
            m63301J(FeedModule.f38855d.m209447e8(this.f41066w.actors).mo223809clone());
        }
        this.f41051h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f41051h.setText(R$string.f38930L2);
    }

    /* JADX INFO: renamed from: I */
    public Act m63299I() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m63300I0(MomentActivity momentActivity, int i, Moment moment) {
        if (i == 0) {
            if (m63327X(momentActivity)) {
                TopicMoment topicMoment = pv60.f151422a.get(this.f41066w.reference.f39232id);
                this.f41068y = topicMoment;
                this.f41064u.setText(topicMoment != null ? topicMoment.name : "");
            } else if (NullChecker.m81303a(moment)) {
                this.f41064u.setText(Pattern.compile("\\s*|\t|\r|\n").matcher(moment.value).replaceAll(""));
            }
        }
        if (i == 7 && NullChecker.m81303a(moment)) {
            this.f41064u.setText(String.format("%s''", Integer.valueOf(Math.round(((Audio) moment.media.get(0)).duration))));
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (moment == null) {
                qib0.f154691G.m184725o(this.f41065v[i2]);
            } else {
                Media media = moment.media.get(i2);
                Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
                if (NullChecker.m81304b(picture)) {
                    qib0.f154691G.m102341Q0(this.f41065v[i2], picture.momentPictureSmall());
                } else {
                    qib0.f154691G.m184725o(this.f41065v[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m63301J(User user) {
    }

    /* JADX INFO: renamed from: J0 */
    public final void m63302J0(User user) {
        this.f41061r.setVisibility(8);
        this.f41062s.setVisibility(0);
        this.f41062s.setBackground(getResources().getDrawable(f3c0.f94581n4));
        this.f41062s.setSelected(false);
        this.f41062s.setTextColor(-1);
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f41062s.setText("聊天");
            xdl0.m208344M(this.f41062s, true);
        } else if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "liked")) {
            xdl0.m208344M(this.f41062s, false);
        } else if (FeedModule.m60222H().mo30807pq() || !vqg.m199501D()) {
            this.f41062s.setText("喜欢".concat(user.isFemale() ? "她" : "他"));
            p6j0.m167671e("e_respond_match", "p_activity", j760.m140076a("user_id", user.f56011id));
        } else {
            xdl0.m208344M(this.f41062s, true);
            this.f41062s.setText("查看");
        }
        if (!FeedModule.m60222H().mo30807pq() && nkg.m159884i() && vqg.m199501D()) {
            qib0.f154691G.m102336O(this.f41047d, user.m60124fp().profileMiddle().formatted(), 4, 30);
        }
        this.f41051h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f41051h.setText("通过你发布的动态喜欢了你");
        p6j0.m167671e("e_card_detail", "p_activity", j760.m140076a("moments_user_id", user.f56011id));
    }

    /* JADX INFO: renamed from: K */
    public final SpannableStringBuilder m63303K(MomentActivity momentActivity, SpannableStringBuilder spannableStringBuilder, boolean z, MomentMessage momentMessage) {
        if (spannableStringBuilder.length() == 0) {
            spannableStringBuilder.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        int length = spannableStringBuilder.length();
        boolean z2 = !z && (NullChecker.m81303a(momentActivity.media) || NullChecker.m81303a(momentActivity.stickerInfo));
        if ((z && (NullChecker.m81303a(momentActivity.replyStickerInfo) || TEnum.equals(momentMessage.messageType, "picture"))) || z2) {
            Drawable drawable = m63299I().getDrawable(f3c0.f94592p);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicWidth());
            spannableStringBuilder.setSpan(new uch(drawable, t100.m186890d(length == 0 ? 0.0f : 5.0f), t100.m186890d(3.0f)), length == 0 ? 0 : length - 1, length, 1);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("查看图片");
            spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8f), 0, 4, 18);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 0, 4, 18);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.setSpan(new C11264a(z, momentMessage, momentActivity), length != 0 ? length - 1 : 0, spannableStringBuilder.length() - 1, 17);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m63304K0(User user) {
        xdl0.m208344M(this.f41062s, true);
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) {
            this.f41062s.setText("聊天");
            return;
        }
        if (NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "liked")) {
            xdl0.m208344M(this.f41062s, false);
            return;
        }
        xdl0.m208344M(this.f41062s, true);
        if (FeedModule.m60222H().mo30807pq() || !vqg.m199501D()) {
            this.f41062s.setText("喜欢".concat(user.isFemale() ? "她" : "他"));
        } else {
            this.f41062s.setText("查看");
        }
    }

    /* JADX INFO: renamed from: L */
    public final MomentMessage m63305L(String str) {
        return FeedModule.f38855d.f192990H0.get(str);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m63306L0(final Moment moment, final User user) {
        if (!nkg.m159900q()) {
            this.f41058o.setText("礼貌回谢");
            p6j0.m167671e("e_polite_gratitude", "p_activity", j760.m140076a("moments_user_id", this.f41066w.actors));
        } else if (FeedModule.m60222H().mo30767gp(user.f56011id)) {
            xdl0.m208344M(this.f41060q, false);
            xdl0.m208344M(this.f41058o, true);
            this.f41058o.setText("聊聊");
            zi60.m218961w().m218988t(moment, "p_activity", false, false);
        } else if (!nkg.m159849F(vqg.m199540d0()) || FeedModule.m60222H().counter_().flower.count <= 0) {
            this.f41058o.setText("打招呼");
            xdl0.m208344M(this.f41058o, true);
            xdl0.m208344M(this.f41060q, false);
            zi60.m218961w().m218988t(moment, "p_activity", true, false);
        } else {
            xdl0.m208344M(this.f41058o, false);
            xdl0.m208344M(this.f41060q, true);
            p6j0.m167670d("e_red_flower", "p_activity", new p6j0.C19147a[0]);
            xdl0.m208329E0(this.f41060q, new View.OnClickListener() { // from class: l.vv60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183197a.m63353x0(moment, view);
                }
            });
        }
        xdl0.m208329E0(this.f41058o, new View.OnClickListener() { // from class: l.wv60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188217a.m63352w0(user, moment, view);
            }
        });
        this.f41043J = false;
        m63314P0();
    }

    /* JADX INFO: renamed from: M */
    public final List<j760<String, String>> m63307M(Moment moment, MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        if (moment != null && momentMessage != null) {
            arrayList.add(j760.m140076a("moment_id", moment.f56011id));
            arrayList.add(j760.m140076a("owner_id", moment.owner));
            zi60.m218961w();
            arrayList.add(j760.m140076a("moment_showfrom", zi60.m218960D(this.f41034A.getFrom())));
            arrayList.add(j760.m140076a("moment_type", zi60.m218961w().m218992y(moment)));
            arrayList.add(j760.m140076a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    public void m63308M0() {
        this.f41041H = 0;
        this.f41043J = false;
        xdl0.m208344M(this.f41059p, false);
        m63293D0();
    }

    /* JADX INFO: renamed from: N */
    public final String m63309N(List<String> list, String str) {
        if (TEnum.equals(this.f41066w.action, "like")) {
            return str;
        }
        if (vwb.m200296J(list)) {
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
    public final void m63310N0(Moment moment, User user) {
        if (this.f41069z == null) {
            jg5 jg5Var = new jg5(m63299I(), a8c0.f68013b);
            this.f41069z = jg5Var;
            jg5Var.m141255a0();
        }
        this.f41069z.m141257d0(this.f41048e.getText().toString());
        jg5 jg5Var2 = this.f41069z;
        String str = this.f41067x;
        boolean zIsEmpty = TextUtils.isEmpty(this.f41066w.parentMessageid);
        MomentActivity momentActivity = this.f41066w;
        jg5Var2.m141256b0(moment, str, zIsEmpty ? momentActivity.messageid : momentActivity.parentMessageid, user.f56011id, this.f41066w.messageid, new d30() { // from class: l.jw60
            @Override // p149l.d30
            public final void call() {
                this.f120054a.m63324U0();
            }
        });
        this.f41069z.show();
    }

    /* JADX INFO: renamed from: O */
    public final void m63311O() {
        xdl0.m208344M(this.f41050g, false);
        int i = this.f41037D;
        if (i > 0) {
            this.f41048e.setMaxWidth(i);
        }
    }

    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final void m63346q0(User user, Moment moment) {
        p6j0.m167669c("e_comment", "p_activity", (j760[]) m63307M(moment, m63305L(this.f41066w.messageid)).toArray(new j760[0]));
        m63310N0(moment, user);
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: P */
    public void m63313P(int i) {
        int i2 = o6c0.f141996A1;
        if (i != 0) {
            if (i == 1) {
                i2 = o6c0.f142073M4;
            } else if (i == 2) {
                i2 = o6c0.f142085O4;
            } else if (i == 3) {
                i2 = o6c0.f142079N4;
            } else if (i == 4) {
                i2 = o6c0.f142061K4;
            } else if (i == 6) {
                i2 = o6c0.f142091P4;
            } else if (i == 7) {
                i2 = o6c0.f142003B1;
            }
        }
        int i3 = 0;
        View viewInflate = m63299I().inflater().inflate(i2, (ViewGroup) this.f41061r, false);
        this.f41064u = (VText) viewInflate.findViewById(b5c0.f73513Q1);
        this.f41065v[0] = (VDraweeView) viewInflate.findViewById(b5c0.f73595o0);
        this.f41065v[1] = (VDraweeView) viewInflate.findViewById(b5c0.f73601q0);
        this.f41065v[2] = (VDraweeView) viewInflate.findViewById(b5c0.f73598p0);
        this.f41065v[3] = (VDraweeView) viewInflate.findViewById(b5c0.f73592n0);
        this.f41061r.addView(viewInflate, 0);
        if (i == 1 || i == 6) {
            VDraweeView[] vDraweeViewArr = this.f41065v;
            int length = vDraweeViewArr.length;
            while (i3 < length) {
                VDraweeView vDraweeView = vDraweeViewArr[i3];
                if (vDraweeView != null) {
                    vDraweeView.getHierarchy().m112053H(new RoundingParams().m8265s(t100.m186890d(10.0f)));
                }
                i3++;
            }
            return;
        }
        VDraweeView[] vDraweeViewArr2 = this.f41065v;
        int length2 = vDraweeViewArr2.length;
        while (i3 < length2) {
            VDraweeView vDraweeView2 = vDraweeViewArr2[i3];
            if (vDraweeView2 != null) {
                vDraweeView2.getHierarchy().m112053H(new RoundingParams().m8265s(t100.m186890d(5.0f)));
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m63314P0() {
        if (NullChecker.m81303a(this.f41040G)) {
            this.f41040G.cancel();
        }
        Animator animatorM103743p = bt0.m103743p(this.f41059p, "translationX", 500L, 800L, new AccelerateDecelerateInterpolator(), 0.0f, t100.m186890d(60.0f));
        this.f41040G = animatorM103743p;
        bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.vw60
            @Override // java.lang.Runnable
            public final void run() {
                this.f183315a.m63354y0();
            }
        });
        bt0.m103733f(this.f41040G, new Runnable() { // from class: l.ww60
            @Override // java.lang.Runnable
            public final void run() {
                this.f188340a.m63355z0();
            }
        });
        this.f41040G.start();
    }

    /* JADX INFO: renamed from: Q */
    public final void m63315Q(final Moment moment, final User user) {
        vwb.m200354z(vwb.m200324f0(this.f41044a, this.f41046c, this.f41061r), new e30() { // from class: l.xv60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194583a.m63319S((ViewGroup) obj);
            }
        });
        m63319S(this.f41047d);
        m63319S(this.f41062s);
        final boolean z = NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched");
        if (TEnum.equals(this.f41066w.action, ActivityActionApi.moment_swipe)) {
            this.f41046c.setOnClickListener(new View.OnClickListener() { // from class: l.yv60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200234a.m63328Y(z, moment, user, view);
                }
            });
        } else if (TEnum.equals(this.f41066w.action, "follow")) {
            this.f41046c.setOnClickListener(new View.OnClickListener() { // from class: l.zv60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204970a.m63329Z(moment, user, view);
                }
            });
        } else if (m63327X(this.f41066w)) {
            vwb.m200354z(vwb.m200324f0(this.f41046c, this.f41061r), new e30() { // from class: l.aw60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72022a.m63331b0((ViewGroup) obj);
                }
            });
        } else if (TEnum.equals(this.f41066w.action, ActivityActionApi.comment_reply) || TEnum.equals(this.f41066w.action, "comment")) {
            vwb.m200354z(vwb.m200324f0(this.f41046c, this.f41061r), new e30() { // from class: l.bw60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77590a.m63332c0(moment, (ViewGroup) obj);
                }
            });
        } else if ((nkg.m159866W() && PhotoAlbumActivitiesAct.f42244j.equals(this.f41067x)) || m63325V()) {
            this.f41046c.setOnClickListener(new View.OnClickListener() { // from class: l.dw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88149a.m63333d0(moment, user, view);
                }
            });
            this.f41061r.setOnClickListener(m63316Q0(moment));
        } else {
            vwb.m200354z(vwb.m200324f0(this.f41046c, this.f41061r), new e30() { // from class: l.ew60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f93462a.m63334e0(moment, (ViewGroup) obj);
                }
            });
        }
        boolean zEquals = TEnum.equals(this.f41066w.action, ActivityActionApi.moment_swipe);
        VDraweeView vDraweeView = this.f41047d;
        if (zEquals) {
            vDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.fw60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99620a.m63335f0(z, moment, user, view);
                }
            });
        } else {
            m63321T(moment, vDraweeView, user);
        }
        m63317R(this.f41062s, user);
    }

    /* JADX INFO: renamed from: Q0 */
    public final View.OnClickListener m63316Q0(final Moment moment) {
        return new View.OnClickListener() { // from class: l.iw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115233a.m63290A0(moment, view);
            }
        };
    }

    /* JADX INFO: renamed from: R */
    public final void m63317R(View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.kw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f124936a.m63336g0(user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final void m63318R0(Moment moment, User user, String str) {
        vs0.m199804j(m63299I(), moment, user.f56011id, str, false);
    }

    /* JADX INFO: renamed from: S */
    public final void m63319S(View view) {
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.gw60
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f104681a.m63339j0(view2);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public final void m63320S0(Moment moment, User user) {
        if (vs0.m199798d(moment)) {
            return;
        }
        zvf0.m220399u("e_likes_list", "p_content_likes", j760.m140076a("user_id", user.f56011id), j760.m140076a("moment_id", moment.f56011id));
        m63322T0(user);
    }

    /* JADX INFO: renamed from: T */
    public final void m63321T(final Moment moment, View view, final User user) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.lw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f130246a.m63340k0(moment, user, view2);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public final void m63322T0(User user) {
        m63299I().startActivity(vs0.m199796b(m63299I(), user.f56011id, "photo_album_feed_from_activity"));
    }

    /* JADX INFO: renamed from: U */
    public boolean m63323U(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, "comment") || TEnum.equals(momentActivity.action, ActivityActionApi.comment_reply) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m63324U0() {
        MomentActivity momentActivity = this.f41066w;
        if (momentActivity.read) {
            return;
        }
        momentActivity.read = true;
        this.f41034A.mo64759M1(momentActivity.f56011id, 0);
        this.f41045b.setVisibility(8);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m63325V() {
        return nkg.m159866W() && PhotoAlbumActivitiesAct.f42244j.equals(this.f41067x);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m63326W(ActivityActionApi activityActionApi) {
        return TEnum.equals(activityActionApi, ActivityActionApi.comment_reply) || TEnum.equals(activityActionApi, "comment");
    }

    /* JADX INFO: renamed from: X */
    public final boolean m63327X(MomentActivity momentActivity) {
        return TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_like) || TEnum.equals(momentActivity.action, ActivityActionApi.topic_comment_reply);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m63328Y(boolean z, Moment moment, User user, View view) {
        if (FeedModule.m60222H().mo30807pq() || z || !vqg.m199501D()) {
            m63318R0(moment, user, "photo_album_activities");
        } else {
            kjb0.m146182E(m63299I(), null, "p_activity,default");
        }
        p6j0.m167669c("e_card_detail", "p_activity", j760.m140076a("moments_user_id", user.f56011id));
        m63324U0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m63329Z(Moment moment, User user, View view) {
        m63318R0(moment, user, "photo_album_activities");
        m63324U0();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m63330a0(View view) {
        if (this.f41068y == null) {
            return;
        }
        Act actM63299I = m63299I();
        Act actM63299I2 = m63299I();
        TopicMoment topicMoment = this.f41068y;
        actM63299I.startActivity(TopicVoteAggregationAct.m66171V1(actM63299I2, topicMoment.f39247id, topicMoment.owner.f38759id, null));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m63331b0(ViewGroup viewGroup) {
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.mw60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136024a.m63330a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m63332c0(Moment moment, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(m63316Q0(moment));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m63333d0(Moment moment, User user, View view) {
        m63320S0(moment, user);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m63334e0(Moment moment, ViewGroup viewGroup) {
        viewGroup.setOnClickListener(m63316Q0(moment));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m63335f0(boolean z, Moment moment, User user, View view) {
        if (FeedModule.m60222H().mo30807pq() || z || !vqg.m199501D()) {
            m63318R0(moment, user, "photo_album_activities");
        } else {
            kjb0.m146182E(m63299I(), null, "p_activity,default");
        }
        m63324U0();
        p6j0.m167669c("e_card_detail", "p_activity", j760.m140076a("moments_user_id", user.f56011id));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m63336g0(User user, View view) {
        if (TEnum.equals(this.f41066w.action, ActivityActionApi.moment_swipe)) {
            if (this.f41062s.getText().equals("喜欢".concat(user.isFemale() ? "她" : "他"))) {
                p6j0.m167669c("e_respond_match", "p_activity", j760.m140076a("user_id", user.f56011id));
                FeedModule.m60222H().mo30725Rs(m63299I(), user, true, FeedModule.m60222H().mo30807pq() ? LikeFrom.get("momentPick") : LikeFrom.get("moment"), null, true, "featured");
            } else if (this.f41062s.getText().equals("查看")) {
                p6j0.m167669c("e_card_detail", "p_activity", j760.m140076a("moments_user_id", user.f56011id));
                kjb0.m146182E(m63299I(), null, "p_activity,default");
            } else {
                m63299I().startActivity(kjb0.m146192c(m63299I(), user.f56011id, false, false));
            }
            m63324U0();
            return;
        }
        final User userMo223809clone = FeedModule.f38855d.m209447e8(this.f41066w.actors).mo223809clone();
        if (NullChecker.m81304b(userMo223809clone)) {
            m63324U0();
            if (!NullChecker.m81303a(userMo223809clone.localFollowship)) {
                FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), userMo223809clone, true, "p_activity");
                return;
            }
            FollowshipStatus followshipStatus = userMo223809clone.localFollowship.state;
            if (TEnum.equals(followshipStatus, "matched") || TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                v1h.m196628v0(m63299I(), getResources().getString(R$string.f39183z), new d30() { // from class: l.qw60
                    @Override // p149l.d30
                    public final void call() {
                        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), userMo223809clone, false, "p_activity");
                    }
                });
            } else if (userMo223809clone.profile.moments.hidePublicMoments) {
                lsi0.m151593w(R$string.f39129q);
            } else {
                FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), userMo223809clone, true, "p_activity");
            }
        }
    }

    @NotNull
    public String getLikeFontEmoj() {
        return ((nkg.m159866W() && PhotoAlbumActivitiesAct.f42244j.equals(this.f41067x)) || m63325V()) ? "" : "❤️";
    }

    public j760<User, Moment> getUserAndMoment() {
        return new j760<>(FeedModule.f38855d.m209447e8(this.f41066w.actors), FeedModule.f38855d.f193047i0.get(this.f41066w.reference.f39232id));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m63337h0(View view) {
        this.f41035B.m105113b();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m63338i0(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        this.f41034A.mo64757G3(this.f41066w.f56011id);
        this.f41035B.m105113b();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ boolean m63339j0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R$string.f39052f));
        c40.C16057b c16057b = new c40.C16057b(view.getContext());
        c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.ow60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f145964a.m63337h0(view2);
            }
        }).m105164Q(arrayList).m105165R(new int[]{0}, new int[]{e1c0.f88750E}).m105169V(new c40.InterfaceC16059d() { // from class: l.pw60
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f151546a.m63338i0(vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f41035B = c40VarM105153F;
        c40VarM105153F.m105117f();
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m63340k0(Moment moment, User user, View view) {
        m63324U0();
        if (m63325V()) {
            m63320S0(moment, user);
        } else {
            m63318R0(moment, user, "photo_album_activities");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m63341l0() {
        this.f41041H++;
        m63314P0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m63342m0(roj0 roj0Var) {
        if (this.f41038E != FeedModule.m60222H().mo30807pq()) {
            this.f41038E = FeedModule.m60222H().mo30807pq();
            m63294E0(this.f41066w, this.f41036C, this.f41034A, this.f41039F);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m63343n0(Boolean bool) {
        if (m63299I() == null || m63299I().isDestroyed() || m63299I().isFinishing() || !bool.booleanValue()) {
            return;
        }
        osi0.m165783g("小红花已发送");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m63344o0(j760 j760Var) {
        if (NullChecker.m81303a(this.f41066w) && ((User) j760Var.f116564a).f56011id.equals(this.f41066w.actors)) {
            m63304K0((User) j760Var.f116564a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m63293D0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63297H(this);
        this.f41037D = this.f41048e.getMaxWidth();
        this.f41038E = FeedModule.m60222H().mo30807pq();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m63345p0(MomentActivity momentActivity, int i, zkg zkgVar, int i2, j760 j760Var) {
        m63294E0(momentActivity, i, zkgVar, i2);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m63347r0(User user, Moment moment, Boolean bool) {
        if (bool.booleanValue()) {
            m63346q0(user, moment);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m63348s0(final User user, final Moment moment, View view) {
        if (nkg.m159915x0()) {
            kyg.m147871f(m63299I(), "p_fake_nearby_comments_popup", user, new d30() { // from class: l.tv60
                @Override // p149l.d30
                public final void call() {
                    this.f172264a.m63346q0(user, moment);
                }
            }, new e30() { // from class: l.uv60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178505a.m63347r0(user, moment, (Boolean) obj);
                }
            });
        } else {
            m63346q0(user, moment);
        }
    }

    public void setFrom(String str) {
        this.f41067x = str;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m63349t0(User user, Moment moment, View view) {
        if (FeedModule.m60222H().mo30767gp(user.f56011id)) {
            osi0.m165783g("你们已经是好友了，去聊聊天吧");
        } else {
            m63292C0(moment);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m63350u0(View view) {
        p6j0.m167669c("e_activity_chat", "p_activity", j760.m140076a("moments_user_id", this.f41066w.actors));
        m63299I().startActivity(kjb0.m146192c(m63299I(), this.f41066w.actors, false, false));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m63351v0(Boolean bool) {
        if (m63299I() == null || m63299I().isDestroyed() || m63299I().isFinishing() || !bool.booleanValue()) {
            return;
        }
        osi0.m165783g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m63352w0(User user, Moment moment, View view) {
        m63324U0();
        if (nkg.m159900q()) {
            FeedModule.f38854c.m60724f3(m63299I(), user, null, "p_activity", false);
            zi60.m218961w().m218987s(moment, "p_activity", true, false);
        } else {
            p6j0.m167669c("e_polite_gratitude", "p_activity", j760.m140076a("moments_user_id", this.f41066w.actors));
            FeedModule.m60222H().mo30730Vk(m63299I(), mah.m153662b().m153664c(), this.f41066w.actors, moment == null ? null : moment.f56011id, moment != null ? moment.owner : null, Channel.get(Channel.reply_thanks), new e30() { // from class: l.hw60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109735a.m63351v0((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m63353x0(Moment moment, View view) {
        m63292C0(moment);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m63354y0() {
        xdl0.m208344M(this.f41059p, xdl0.m208349O0(this.f41058o) && TextUtils.equals(this.f41058o.getText().toString(), "礼貌回谢"));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m63355z0() {
        this.f41059p.setVisibility(8);
        this.f41040G = null;
        if (this.f41041H > 1 || this.f41043J) {
            return;
        }
        e51.m114743H(m63299I(), this.f41042I, 750L);
    }

    public PhotoAlbumActivitiesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41065v = new VDraweeView[4];
        this.f41037D = -1;
        this.f41041H = 0;
        this.f41042I = new Runnable() { // from class: l.rw60
            @Override // java.lang.Runnable
            public final void run() {
                this.f161317a.m63341l0();
            }
        };
        this.f41043J = false;
    }

    public PhotoAlbumActivitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41065v = new VDraweeView[4];
        this.f41037D = -1;
        this.f41041H = 0;
        this.f41042I = new Runnable() { // from class: l.rw60
            @Override // java.lang.Runnable
            public final void run() {
                this.f161317a.m63341l0();
            }
        };
        this.f41043J = false;
    }
}
