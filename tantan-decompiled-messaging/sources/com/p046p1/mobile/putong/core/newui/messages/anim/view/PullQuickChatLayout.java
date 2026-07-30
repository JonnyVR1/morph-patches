package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR.\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010/\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u00102\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010*R\u0016\u0010C\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010*R\u0016\u0010E\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00101¨\u0006F"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/PullQuickChatLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "value", "a", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "getHeadView", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "setHeadView", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;)V", "headView", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "b", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "getConversationsList", "()Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "setConversationsList", "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "conversationsList", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "getCanPullChecker", "()Lkotlin/jvm/functions/Function0;", "setCanPullChecker", "(Lkotlin/jvm/functions/Function0;)V", "canPullChecker", "", Constants.INAPP_DATA_TAG, "F", "headViewHeight", "e", "lastY", "f", "radio", "g", "Z", "canPull", "h", "trackForPull", RXScreenCaptureService.KEY_INDEX, "moveDown", "j", "sendDown", "", "k", "Ljava/lang/String;", "horizontalScroll", BLiveStormDanmakuGiftResourceType.f44444l, "I", "touchSlop", "m", "downX", "n", "downY", "o", "catchAndCancel", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PullQuickChatLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public QuickChatHeaderBaseView headView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ConversationsList conversationsList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Function0<Boolean> canPullChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float headViewHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float lastY;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float radio;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean canPull;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean trackForPull;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean moveDown;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean sendDown;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public String horizontalScroll;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int touchSlop;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float downX;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public float downY;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean catchAndCancel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout$a */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bb\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/PullQuickChatLayout$a;", "", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC8158a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f25497a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout$a$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0007¨\u0006\u000e"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/PullQuickChatLayout$a$a;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Horizontal", "c", "Virtual", Constants.INAPP_DATA_TAG, "a", LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ Companion f25497a = new Companion();

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public static final String Horizontal = "Horizontal";

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public static final String Virtual = "Virtual";

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public static final String Default = LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default;

            @NotNull
            /* JADX INFO: renamed from: a */
            public final String m42009a() {
                return Default;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final String m42010b() {
                return Horizontal;
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public final String m42011c() {
                return Virtual;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PullQuickChatLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.radio = 1.0f;
        this.horizontalScroll = InterfaceC8158a.INSTANCE.m42009a();
        this.touchSlop = 10;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setMotionEventSplittingEnabled(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r2 != 3) goto L112;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Nullable
    public final Function0<Boolean> getCanPullChecker() {
        return this.canPullChecker;
    }

    @Nullable
    public final ConversationsList getConversationsList() {
        return this.conversationsList;
    }

    @Nullable
    public final QuickChatHeaderBaseView getHeadView() {
        return this.headView;
    }

    public final void setCanPullChecker(@Nullable Function0<Boolean> function0) {
        this.canPullChecker = function0;
    }

    public final void setConversationsList(@Nullable ConversationsList conversationsList) {
        this.conversationsList = conversationsList;
    }

    public final void setHeadView(@Nullable QuickChatHeaderBaseView quickChatHeaderBaseView) {
        this.headViewHeight = quickChatHeaderBaseView != null ? quickChatHeaderBaseView.getDEFALUE_NORMAL_HEIGH() : 0.0f;
        this.headView = quickChatHeaderBaseView;
        if (quickChatHeaderBaseView != null) {
            quickChatHeaderBaseView.setPullQuickChatLayout(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PullQuickChatLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PullQuickChatLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PullQuickChatLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
