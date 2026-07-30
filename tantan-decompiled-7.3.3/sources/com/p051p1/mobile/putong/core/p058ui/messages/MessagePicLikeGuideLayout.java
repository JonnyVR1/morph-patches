package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.ProfileLikeComment;
import com.p051p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeLifePhotoAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagePicLikeGuideLayout;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.j300;
import p153l.jyb;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MessagePicLikeGuideLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f32466c;

    /* JADX INFO: renamed from: d */
    public VText f32467d;

    /* JADX INFO: renamed from: e */
    public VImage f32468e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32469f;

    /* JADX INFO: renamed from: g */
    public VText f32470g;

    /* JADX INFO: renamed from: h */
    public VText f32471h;

    /* JADX INFO: renamed from: i */
    public VText f32472i;

    /* JADX INFO: renamed from: j */
    public boolean f32473j;

    public MessagePicLikeGuideLayout(Context context) {
        super(context);
        this.f32473j = true;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m50088P(MessagesAct messagesAct, Runnable runnable, View view) {
        i4g0.m138523u("e_close_click", messagesAct.pageId(), pf60.m172085a("shortcut_type", "avatar"));
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m50091S(MessagesAct messagesAct, Runnable runnable, Media media, View view) {
        i4g0.m138520r("e_avatar_chat", messagesAct.pageId());
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        ProfileLikeLifePhotoAct.m45627y2(messagesAct, messagesAct.f32488f.f82474c, media.url, jyb.m147479J(media.tags) ? "" : media.tags.get(0));
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ C22421c m50093V(ProfileLikeComment profileLikeComment, Boolean bool) {
        return bool.booleanValue() ? CoreModule.f18264c.f20322K1.m34251w3(profileLikeComment.toJson()) : C22421c.just(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m50094Y(Throwable th) {
        this.f32473j = true;
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!TextUtils.isEmpty(tantanForbidden.message)) {
                r1j0.m179420g(tantanForbidden.message);
                return;
            }
        }
        o1j0.m165651y("发送失败，请重试");
    }

    /* JADX INFO: renamed from: W */
    public final void m50095W(View view) {
        j300.m143299a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m50096X(Runnable runnable, Boolean bool) {
        if (bool.booleanValue() && NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        this.f32473j = true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m50097Z(MessagesAct messagesAct, Media media, final Runnable runnable, View view) {
        if (this.f32473j) {
            i4g0.m138523u("e_avatar_like", messagesAct.pageId(), pf60.m172085a("to_uid", messagesAct.f32488f.f82474c));
            this.f32473j = false;
            final ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
            profileLikeCommentNew_.userId = messagesAct.f32488f.f82474c;
            profileLikeCommentNew_.module = ProfileLikeType.life_pic;
            profileLikeCommentNew_.category = ProfileLikeType.life_pic;
            profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
            profileLikeCommentNew_.comment = "赞了你的照片";
            ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
            profileLikeSnapshotNew_.picture = media.url;
            profileLikeSnapshotNew_.title = "生活照";
            NewTags newTagsMo34694Gh = jyb.m147479J(media.tags) ? null : gta.m132210e().m132214d().mo34694Gh(media.tags.get(0));
            profileLikeSnapshotNew_.desc = newTagsMo34694Gh == null ? "" : newTagsMo34694Gh.name;
            profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
            messagesAct.duringCreated((C22421c) CoreModule.f18264c.f20437w2.m221453b3(messagesAct, profileLikeCommentNew_.comment, DetectCategoryType.get(DetectCategoryType.profile_comment)).flatMap(new qcj() { // from class: l.g300
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MessagePicLikeGuideLayout.m50093V(profileLikeCommentNew_, (Boolean) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.h300
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107611a.m50096X(runnable, (Boolean) obj);
                }
            }, new y20() { // from class: l.i300
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112684a.m50094Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m50098a0(final MessagesAct messagesAct, final Media media, final Runnable runnable) {
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(messagesAct.f32488f.f82474c);
        if (userM116597oa == null) {
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        this.f32467d.setText((userM116597oa.isFemale() ? "她" : "他").concat("的照片"));
        VText vText = this.f32470g;
        StringBuilder sb = new StringBuilder("夸夸");
        sb.append(userM116597oa.isFemale() ? "她" : "他");
        sb.append("的照片，开启聊天吧");
        vText.setText(sb.toString());
        uqb0.f180374G.m127115L0(this.f32469f, media.url);
        bnl0.m105509E0(this.f32471h, new View.OnClickListener() { // from class: l.d300
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessagePicLikeGuideLayout.m50091S(messagesAct, runnable, media, view);
            }
        });
        bnl0.m105509E0(this.f32472i, new View.OnClickListener() { // from class: l.e300
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91909a.m50097Z(messagesAct, media, runnable, view);
            }
        });
        bnl0.m105509E0(this.f32468e, new View.OnClickListener() { // from class: l.f300
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessagePicLikeGuideLayout.m50088P(messagesAct, runnable, view);
            }
        });
        i4g0.m138526x("e_avatar_compliment", messagesAct.pageId());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50095W(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32466c.setImageResource(ibc0.f113849L7);
            this.f32468e.setImageResource(ibc0.f114092n7);
            this.f32467d.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32470g.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32471h.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32472i.setTextColor(getResources().getColor(g9c0.f102817g));
        }
    }

    public MessagePicLikeGuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32473j = true;
    }

    public MessagePicLikeGuideLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32473j = true;
    }
}
