package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.ProfileLikeComment;
import com.p046p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeLifePhotoAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagePicLikeGuideLayout;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.muz;
import p149l.osi0;
import p149l.qib0;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MessagePicLikeGuideLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f31618c;

    /* JADX INFO: renamed from: d */
    public VText f31619d;

    /* JADX INFO: renamed from: e */
    public VImage f31620e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f31621f;

    /* JADX INFO: renamed from: g */
    public VText f31622g;

    /* JADX INFO: renamed from: h */
    public VText f31623h;

    /* JADX INFO: renamed from: i */
    public VText f31624i;

    /* JADX INFO: renamed from: j */
    public boolean f31625j;

    public MessagePicLikeGuideLayout(Context context) {
        super(context);
        this.f31625j = true;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m48905P(MessagesAct messagesAct, Runnable runnable, View view) {
        zvf0.m220399u("e_close_click", messagesAct.pageId(), j760.m140076a("shortcut_type", "avatar"));
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m48908S(MessagesAct messagesAct, Runnable runnable, Media media, View view) {
        zvf0.m220396r("e_avatar_chat", messagesAct.pageId());
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        ProfileLikeLifePhotoAct.m44443w2(messagesAct, messagesAct.f31640f.f96911c, media.url, vwb.m200296J(media.tags) ? "" : media.tags.get(0));
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ C22306c m48910V(ProfileLikeComment profileLikeComment, Boolean bool) {
        return bool.booleanValue() ? CoreModule.f17545c.f19580K1.m33248w3(profileLikeComment.toJson()) : C22306c.just(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m48911Y(Throwable th) {
        this.f31625j = true;
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!TextUtils.isEmpty(tantanForbidden.message)) {
                osi0.m165783g(tantanForbidden.message);
                return;
            }
        }
        lsi0.m151595y("发送失败，请重试");
    }

    /* JADX INFO: renamed from: W */
    public final void m48912W(View view) {
        muz.m156458a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m48913X(Runnable runnable, Boolean bool) {
        if (bool.booleanValue() && NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        this.f31625j = true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m48914Z(MessagesAct messagesAct, Media media, final Runnable runnable, View view) {
        if (this.f31625j) {
            zvf0.m220399u("e_avatar_like", messagesAct.pageId(), j760.m140076a("to_uid", messagesAct.f31640f.f96911c));
            this.f31625j = false;
            final ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
            profileLikeCommentNew_.userId = messagesAct.f31640f.f96911c;
            profileLikeCommentNew_.module = ProfileLikeType.life_pic;
            profileLikeCommentNew_.category = ProfileLikeType.life_pic;
            profileLikeCommentNew_.identifier = ProfileLikeType.life_pic;
            profileLikeCommentNew_.comment = "赞了你的照片";
            ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
            profileLikeSnapshotNew_.picture = media.url;
            profileLikeSnapshotNew_.title = "生活照";
            NewTags newTagsMo33691Gh = vwb.m200296J(media.tags) ? null : ura.m195053e().m195057d().mo33691Gh(media.tags.get(0));
            profileLikeSnapshotNew_.desc = newTagsMo33691Gh == null ? "" : newTagsMo33691Gh.name;
            profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
            messagesAct.duringCreated((C22306c) CoreModule.f17545c.f19695w2.m165738b3(messagesAct, profileLikeCommentNew_.comment, DetectCategoryType.get(DetectCategoryType.profile_comment)).flatMap(new w9j() { // from class: l.juz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MessagePicLikeGuideLayout.m48910V(profileLikeCommentNew_, (Boolean) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.kuz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f124733a.m48913X(runnable, (Boolean) obj);
                }
            }, new e30() { // from class: l.luz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130106a.m48911Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m48915a0(final MessagesAct messagesAct, final Media media, final Runnable runnable) {
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(messagesAct.f31640f.f96911c);
        if (userM169524oa == null) {
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        this.f31619d.setText((userM169524oa.isFemale() ? "她" : "他").concat("的照片"));
        VText vText = this.f31622g;
        StringBuilder sb = new StringBuilder("夸夸");
        sb.append(userM169524oa.isFemale() ? "她" : "他");
        sb.append("的照片，开启聊天吧");
        vText.setText(sb.toString());
        qib0.f154691G.m102331L0(this.f31621f, media.url);
        xdl0.m208329E0(this.f31623h, new View.OnClickListener() { // from class: l.guz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessagePicLikeGuideLayout.m48908S(messagesAct, runnable, media, view);
            }
        });
        xdl0.m208329E0(this.f31624i, new View.OnClickListener() { // from class: l.huz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109602a.m48914Z(messagesAct, media, runnable, view);
            }
        });
        xdl0.m208329E0(this.f31620e, new View.OnClickListener() { // from class: l.iuz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessagePicLikeGuideLayout.m48905P(messagesAct, runnable, view);
            }
        });
        zvf0.m220402x("e_avatar_compliment", messagesAct.pageId());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48912W(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31618c.setImageResource(c3c0.f78574L7);
            this.f31620e.setImageResource(c3c0.f78817n7);
            this.f31619d.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31622g.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31623h.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31624i.setTextColor(getResources().getColor(a1c0.f67153g));
        }
    }

    public MessagePicLikeGuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31625j = true;
    }

    public MessagePicLikeGuideLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31625j = true;
    }
}
