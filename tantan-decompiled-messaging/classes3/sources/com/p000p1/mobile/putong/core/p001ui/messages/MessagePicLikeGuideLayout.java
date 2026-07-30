package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagePicLikeGuideLayout;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.ProfileLikeComment;
import com.p1.mobile.putong.core.data.ProfileLikeSnapshot;
import com.p1.mobile.putong.core.ui.breaking.ProfileLikeLifePhotoAct;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.muz;
import l.osi0;
import l.qib0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.e30;
import p003l.m250;
import p003l.w9j;
import p014rx.C1099c;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessagePicLikeGuideLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f1509c;

    /* JADX INFO: renamed from: d */
    public VText f1510d;

    /* JADX INFO: renamed from: e */
    public VImage f1511e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1512f;

    /* JADX INFO: renamed from: g */
    public VText f1513g;

    /* JADX INFO: renamed from: h */
    public VText f1514h;

    /* JADX INFO: renamed from: i */
    public VText f1515i;

    /* JADX INFO: renamed from: j */
    public boolean f1516j;

    public MessagePicLikeGuideLayout(Context context) {
        super(context);
        this.f1516j = true;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m1995P(MessagesAct messagesAct, Runnable runnable, View view) {
        zvf0.u("e_close_click", messagesAct.pageId(), new j760[]{j760.a("shortcut_type", "avatar")});
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m1998S(MessagesAct messagesAct, Runnable runnable, Media media, View view) {
        zvf0.r("e_avatar_chat", messagesAct.pageId());
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        ProfileLikeLifePhotoAct.w2(messagesAct, messagesAct.f1531f.f3543c, media.url, vwb.J(media.tags) ? "" : (String) media.tags.get(0));
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ C1099c m2000V(ProfileLikeComment profileLikeComment, Boolean bool) {
        return bool.booleanValue() ? CoreModule.c.K1.w3(profileLikeComment.toJson()) : C1099c.just(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m2001Y(Throwable th) {
        this.f1516j = true;
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (!TextUtils.isEmpty(tantanForbidden.message)) {
                osi0.g(tantanForbidden.message);
                return;
            }
        }
        lsi0.y("发送失败，请重试");
    }

    /* JADX INFO: renamed from: W */
    public final void m2002W(View view) {
        muz.a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m2003X(Runnable runnable, Boolean bool) {
        if (bool.booleanValue() && NullChecker.a(runnable)) {
            runnable.run();
        }
        this.f1516j = true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m2004Z(MessagesAct messagesAct, Media media, final Runnable runnable, View view) {
        if (this.f1516j) {
            zvf0.u("e_avatar_like", messagesAct.pageId(), new j760[]{j760.a("to_uid", messagesAct.f1531f.f3543c)});
            this.f1516j = false;
            final ProfileLikeComment profileLikeCommentNew_ = ProfileLikeComment.new_();
            profileLikeCommentNew_.userId = messagesAct.f1531f.f3543c;
            profileLikeCommentNew_.module = "life_pic";
            profileLikeCommentNew_.category = "life_pic";
            profileLikeCommentNew_.identifier = "life_pic";
            profileLikeCommentNew_.comment = "赞了你的照片";
            ProfileLikeSnapshot profileLikeSnapshotNew_ = ProfileLikeSnapshot.new_();
            profileLikeSnapshotNew_.picture = media.url;
            profileLikeSnapshotNew_.title = "生活照";
            NewTags newTagsGh = vwb.J(media.tags) ? null : ura.e().d().Gh((String) media.tags.get(0));
            profileLikeSnapshotNew_.desc = newTagsGh == null ? "" : newTagsGh.name;
            profileLikeCommentNew_.snapshot = profileLikeSnapshotNew_.toJson();
            messagesAct.duringCreated(CoreModule.c.w2.b3(messagesAct, profileLikeCommentNew_.comment, DetectCategoryType.get("profile_comment")).flatMap(new w9j() { // from class: l.juz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return MessagePicLikeGuideLayout.m2000V(profileLikeCommentNew_, (Boolean) obj);
                }
            })).subscribe((m250) mkd0.H(new e30() { // from class: l.kuz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f5081a.m2003X(runnable, (Boolean) obj);
                }
            }, new e30() { // from class: l.luz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f5417a.m2001Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m2005a0(final MessagesAct messagesAct, final Media media, final Runnable runnable) {
        User userOa = CoreModule.c.e0.oa(messagesAct.f1531f.f3543c);
        if (userOa == null) {
            if (NullChecker.a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        this.f1510d.setText((userOa.isFemale() ? "她" : "他").concat("的照片"));
        AppCompatTextView appCompatTextView = this.f1513g;
        StringBuilder sb = new StringBuilder("夸夸");
        sb.append(userOa.isFemale() ? "她" : "他");
        sb.append("的照片，开启聊天吧");
        appCompatTextView.setText(sb.toString());
        qib0.G.L0(this.f1512f, media.url);
        xdl0.E0(this.f1514h, new View.OnClickListener() { // from class: l.guz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessagePicLikeGuideLayout.m1998S(messagesAct, runnable, media, view);
            }
        });
        xdl0.E0(this.f1515i, new View.OnClickListener() { // from class: l.huz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4283a.m2004Z(messagesAct, media, runnable, view);
            }
        });
        xdl0.E0(this.f1511e, new View.OnClickListener() { // from class: l.iuz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessagePicLikeGuideLayout.m1995P(messagesAct, runnable, view);
            }
        });
        zvf0.x("e_avatar_compliment", messagesAct.pageId());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2002W(this);
        if (ura.e().d().I4()) {
            this.f1509c.setImageResource(c3c0.L7);
            this.f1511e.setImageResource(c3c0.n7);
            this.f1510d.setTextColor(getResources().getColor(a1c0.i));
            this.f1513g.setTextColor(getResources().getColor(a1c0.g));
            this.f1514h.setTextColor(getResources().getColor(a1c0.g));
            this.f1515i.setTextColor(getResources().getColor(a1c0.g));
        }
    }

    public MessagePicLikeGuideLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1516j = true;
    }

    public MessagePicLikeGuideLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1516j = true;
    }
}
