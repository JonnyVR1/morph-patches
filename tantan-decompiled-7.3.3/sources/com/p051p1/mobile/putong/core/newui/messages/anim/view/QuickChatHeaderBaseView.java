package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.txq;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000fH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH&¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010!J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH&¢\u0006\u0004\b&\u0010!R\"\u0010-\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010>\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010\u0016R\u001a\u0010@\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b?\u0010\u0016R\u001a\u0010B\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\bA\u0010\u0016R\u001a\u0010D\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\bC\u0010\u0016¨\u0006E"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "", "a", "()Z", "height", "c", "(I)V", "j", "()I", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "", "headViewHeight", "b", "(F)Z", "e", RXScreenCaptureService.KEY_INDEX, "()V", "f", "Landroid/animation/Animator;", "getGotoNextActAnim", "()Landroid/animation/Animator;", "h", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "setAct", "(Lcom/p1/mobile/android/app/Act;)V", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/PullQuickChatLayout;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/PullQuickChatLayout;", "getPullQuickChatLayout", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/PullQuickChatLayout;", "setPullQuickChatLayout", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/PullQuickChatLayout;)V", "pullQuickChatLayout", "Ll/y20;", "Ll/y20;", "getChangeHeightListrener", "()Ll/y20;", "setChangeHeightListrener", "(Ll/y20;)V", "changeHeightListrener", "I", "getNEW_MATCH_TOP_MARGIN", "NEW_MATCH_TOP_MARGIN", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class QuickChatHeaderBaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public PullQuickChatLayout pullQuickChatLayout;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> changeHeightListrener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int NEW_MATCH_TOP_MARGIN;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int DEFALUE_NORMAL_HEIGH;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int LOADING_VIEW_HEIGHT;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int MAX_PULL_VIEW_HEIGH;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderBaseView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.NEW_MATCH_TOP_MARGIN = txq.m193530c(12);
        this.DEFALUE_NORMAL_HEIGH = txq.m193530c(4);
        this.LOADING_VIEW_HEIGHT = txq.m193530c(4);
        this.MAX_PULL_VIEW_HEIGH = txq.m193530c(120);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo42993a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo42994b(float headViewHeight);

    /* JADX INFO: renamed from: c */
    public abstract void mo42995c(int height);

    /* JADX INFO: renamed from: d */
    public abstract void mo42996d(@NotNull ConversationsList conversationsList);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo42997e();

    /* JADX INFO: renamed from: f */
    public void mo42998f() {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo42999g(int height, boolean isAutoTopShow);

    @NotNull
    public final Act getAct() {
        Act act = this.act;
        if (act != null) {
            return act;
        }
        Intrinsics.m88391r(SocialConstants.PARAM_ACT);
        return null;
    }

    @Nullable
    public final y20<Integer> getChangeHeightListrener() {
        return this.changeHeightListrener;
    }

    public int getDEFALUE_NORMAL_HEIGH() {
        return this.DEFALUE_NORMAL_HEIGH;
    }

    @Nullable
    public Animator getGotoNextActAnim() {
        return null;
    }

    public abstract int getInitHeight();

    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    public int getNEW_MATCH_TOP_MARGIN() {
        return this.NEW_MATCH_TOP_MARGIN;
    }

    @Nullable
    public final PullQuickChatLayout getPullQuickChatLayout() {
        return this.pullQuickChatLayout;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo43000h();

    /* JADX INFO: renamed from: i */
    public void mo43001i() {
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo43002j();

    public final void setAct(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    public final void setChangeHeightListrener(@Nullable y20<Integer> y20Var) {
        this.changeHeightListrener = y20Var;
    }

    public final void setPullQuickChatLayout(@Nullable PullQuickChatLayout pullQuickChatLayout) {
        this.pullQuickChatLayout = pullQuickChatLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderBaseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatHeaderBaseView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ QuickChatHeaderBaseView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
