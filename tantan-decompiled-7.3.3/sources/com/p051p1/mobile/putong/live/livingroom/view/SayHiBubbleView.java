package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.czq;
import p153l.dhw;
import p153l.itv;
import p153l.izs;
import p153l.mdc0;
import p153l.t3m0;
import p153l.x20;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJa\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/view/SayHiBubbleView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "greetToUserAvatar", "greetToUserName", "greetToUserContent", "greetBtn", "greetToUserId", "actionType", "roomId", "anchorId", "liveId", "Ll/x20;", "onClick", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/x20;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTagBubble;", "bubble", "f", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTagBubble;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/x20;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "avatar", "Lv/VText;", "b", "Lv/VText;", "getUser", "()Lv/VText;", "setUser", "(Lv/VText;)V", "user", "c", "getContent", "setContent", "content", "Lv/VButton;", Constants.INAPP_DATA_TAG, "Lv/VButton;", "btn", "Companion", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class SayHiBubbleView extends LinearLayout {

    /* JADX INFO: renamed from: e */
    @Nullable
    public static String f52931e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView avatar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VButton btn;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f52932f = "GREETING";

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.SayHiBubbleView$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\f\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\r\u0010\b¨\u0006\u000f"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/view/SayHiBubbleView$a;", "", "<init>", "()V", "", "greetedToUserId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "getGreetedToUserId$annotations", "greetViewTag", "a", "getGreetViewTag$annotations", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m77833a() {
            return SayHiBubbleView.f52932f;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final String m77834b() {
            return SayHiBubbleView.f52931e;
        }

        /* JADX INFO: renamed from: c */
        public final void m77835c(@Nullable String str) {
            SayHiBubbleView.f52931e = str;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SayHiBubbleView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static Unit m77826b(String str, String str2, String str3, String str4, String str5, x20 x20Var, View view) {
        view.getClass();
        itv.m142094R(str, str2, str3).subscribe(dhw.m115829h(new y20() { // from class: l.ezd0
            @Override // p153l.y20
            public final void call(Object obj) {
                SayHiBubbleView.m77830h((BLiveEnvelope) obj);
            }
        }));
        t3m0.m189103q(str3, str4, str5, str);
        if (x20Var != null) {
            x20Var.call();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public static final String getGreetViewTag() {
        return INSTANCE.m77833a();
    }

    @Nullable
    public static final String getGreetedToUserId() {
        return INSTANCE.m77834b();
    }

    /* JADX INFO: renamed from: h */
    public static final void m77830h(BLiveEnvelope bLiveEnvelope) {
    }

    public static final void setGreetedToUserId(@Nullable String str) {
        INSTANCE.m77835c(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m77831f(@NotNull BLiveVoiceTagBubble bubble, @NotNull String roomId, @NotNull String anchorId, @NotNull String liveId, @Nullable x20 onClick) {
        bubble.getClass();
        roomId.getClass();
        anchorId.getClass();
        liveId.getClass();
        String str = bubble.fromUserAvatar;
        str.getClass();
        String str2 = bubble.fromUserName;
        str2.getClass();
        String str3 = bubble.text;
        str3.getClass();
        String str4 = bubble.buttonText;
        str4.getClass();
        String str5 = bubble.fromUserId;
        str5.getClass();
        String str6 = bubble.chatActionType;
        str6.getClass();
        m77832g(str, str2, str3, str4, str5, str6, roomId, anchorId, liveId, onClick);
    }

    /* JADX INFO: renamed from: g */
    public final void m77832g(@NotNull String greetToUserAvatar, @NotNull String greetToUserName, @NotNull String greetToUserContent, @NotNull String greetBtn, @NotNull final String greetToUserId, @NotNull final String actionType, @NotNull final String roomId, @NotNull final String anchorId, @NotNull final String liveId, @Nullable final x20 onClick) {
        greetToUserAvatar.getClass();
        greetToUserName.getClass();
        greetToUserContent.getClass();
        greetBtn.getClass();
        greetToUserId.getClass();
        actionType.getClass();
        roomId.getClass();
        anchorId.getClass();
        liveId.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(greetToUserAvatar);
        VDraweeView vDraweeView = this.avatar;
        VButton vButton = null;
        if (zIsEmpty) {
            if (vDraweeView == null) {
                Intrinsics.m88391r("avatar");
                vDraweeView = null;
            }
            bnl0.m105524M(vDraweeView, false);
        } else {
            if (vDraweeView == null) {
                Intrinsics.m88391r("avatar");
                vDraweeView = null;
            }
            bnl0.m105524M(vDraweeView, true);
            VDraweeView vDraweeView2 = this.avatar;
            if (vDraweeView2 == null) {
                Intrinsics.m88391r("avatar");
                vDraweeView2 = null;
            }
            izs.m142868s("context_single_room", vDraweeView2, greetToUserAvatar);
        }
        getUser().setText(xau.m209906p(greetToUserName, 4) + ":");
        getContent().setText(xau.m209906p(greetToUserContent, 8));
        VButton vButton2 = this.btn;
        if (vButton2 == null) {
            Intrinsics.m88391r("btn");
            vButton2 = null;
        }
        vButton2.setText(greetBtn);
        VButton vButton3 = this.btn;
        if (vButton3 == null) {
            Intrinsics.m88391r("btn");
        } else {
            vButton = vButton3;
        }
        czq.m113347c(vButton, new Function1() { // from class: l.dzd0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SayHiBubbleView.m77826b(liveId, actionType, greetToUserId, anchorId, roomId, onClick, (View) obj);
            }
        });
        f52931e = greetToUserId;
        t3m0.m189104r(greetToUserId, anchorId, roomId, liveId);
    }

    @NotNull
    public final VText getContent() {
        VText vText = this.content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("content");
        return null;
    }

    @NotNull
    public final VText getUser() {
        VText vText = this.user;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("user");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(mdc0.f136339x3);
        viewFindViewById.getClass();
        this.avatar = (VDraweeView) viewFindViewById;
        View viewFindViewById2 = findViewById(mdc0.f135887A3);
        viewFindViewById2.getClass();
        setUser((VText) viewFindViewById2);
        View viewFindViewById3 = findViewById(mdc0.f136357z3);
        viewFindViewById3.getClass();
        setContent((VText) viewFindViewById3);
        View viewFindViewById4 = findViewById(mdc0.f136348y3);
        viewFindViewById4.getClass();
        this.btn = (VButton) viewFindViewById4;
    }

    public final void setContent(@NotNull VText vText) {
        vText.getClass();
        this.content = vText;
    }

    public final void setUser(@NotNull VText vText) {
        vText.getClass();
        this.user = vText;
    }
}
