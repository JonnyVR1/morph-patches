package com.p051p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConvCellList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8774c;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.ai40;
import p153l.c4s;
import p153l.gra;
import p153l.gs50;
import p153l.jyb;
import p153l.nbr;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.r3c0;
import p153l.rcj;
import p153l.scj;
import p153l.txq;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001:\u0001WB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\fJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\fJ\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\"J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\fJ\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010\u0016J\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\fR\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00104R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106R\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b8\u0010\"R\u001a\u0010<\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\"R\u001a\u0010?\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u0010\"R\u001a\u0010B\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010\"R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00106R\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010T\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u0019\"\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010F¨\u0006X"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "B", "()V", "", "speedDuration", "E", "(J)V", "height", "H", "(I)V", "", "A", "()Z", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", BaseSei.f14625Y, "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "D", c4s.C_ZONE, BaseSei.f14626Z, "a", "c", BaseSei.f14624X, RXScreenCaptureService.KEY_INDEX, "j", "()I", "G", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "f", "", "headViewHeight", "b", "(F)Z", "e", "h", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "newQuickChatAudioHeaderViewModel", "I", "ALLOW_PULL_START", "getDEFALUE_TIPS_HEIGH", "DEFALUE_TIPS_HEIGH", "k", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", BLiveStormDanmakuGiftResourceType.f45292l, "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "m", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", "n", "OVER_SCROLL_HEIGHT", "o", "Z", "isBottomPlayedVibrateAnim", "p", "isTouchDown", "q", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "r", "J", "lastStartAct", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "getHeaderState", "setHeaderState", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;)V", "headerState", Constants.KEY_T, "pushUserMsgFragShowBsChange", "NewHeaderState", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class NewQuickChatAudioHeader extends QuickChatHeaderBaseView {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C8318a newQuickChatAudioHeaderViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int ALLOW_PULL_START;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int DEFALUE_TIPS_HEIGH;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int DEFALUE_NORMAL_HEIGH;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final int MAX_PULL_VIEW_HEIGH;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int LOADING_VIEW_HEIGHT;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final int OVER_SCROLL_HEIGHT;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean isBottomPlayedVibrateAnim;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isTouchDown;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public ConversationsList conversationsList;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long lastStartAct;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public NewHeaderState headerState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean pushUserMsgFragShowBsChange;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "NormalTipsState", "VideoTipsState", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum NewHeaderState {
        NormalState,
        SearchState,
        NormalTipsState,
        VideoTipsState;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<NewHeaderState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8308a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26205a;

        static {
            int[] iArr = new int[NewHeaderState.values().length];
            try {
                iArr[NewHeaderState.NormalTipsState.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewHeaderState.VideoTipsState.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NewHeaderState.NormalState.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NewHeaderState.SearchState.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26205a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioHeader(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.ALLOW_PULL_START = txq.m193530c(70);
        this.DEFALUE_TIPS_HEIGH = txq.m193530c(40);
        this.DEFALUE_NORMAL_HEIGH = txq.m193530c(0);
        this.MAX_PULL_VIEW_HEIGH = txq.m193530c(80);
        this.LOADING_VIEW_HEIGHT = txq.m193530c(40);
        this.OVER_SCROLL_HEIGHT = txq.m193530c(50);
        this.headerState = NewHeaderState.NormalState;
        setAct((Act) context);
        this.newQuickChatAudioHeaderViewModel = new C8318a(this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = 0;
        C8318a c8318a = this.newQuickChatAudioHeaderViewModel;
        if (c8318a != null) {
            c8318a.m43187u();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m42972F(NewQuickChatAudioHeader newQuickChatAudioHeader, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        newQuickChatAudioHeader.m42990E(j);
    }

    /* JADX INFO: renamed from: k */
    public static pf60 m42973k(Triple triple) {
        triple.getClass();
        return (pf60) triple.getFirst();
    }

    /* JADX INFO: renamed from: l */
    public static Triple m42974l(pf60 pf60Var, TabName tabName, C4470c c4470c) {
        return new Triple(pf60Var, tabName, c4470c);
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m42975m(pf60 pf60Var) {
        pf60Var.getClass();
        return Boolean.valueOf(pf60Var != C4907v.f20866b0);
    }

    /* JADX INFO: renamed from: n */
    public static Boolean m42976n(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static pf60 m42977o(TabName tabName, C4470c c4470c) {
        return jyb.m147494Y(tabName, c4470c);
    }

    /* JADX INFO: renamed from: p */
    public static pf60 m42978p(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static void m42979q(NewQuickChatAudioHeader newQuickChatAudioHeader) {
        newQuickChatAudioHeader.isBottomPlayedVibrateAnim = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static void m42980r(NewQuickChatAudioHeader newQuickChatAudioHeader, pf60 pf60Var) {
        pf60Var.getClass();
        String str = (String) pf60Var.f152156a;
        Object obj = pf60Var.f152157b;
        newQuickChatAudioHeader.pushUserMsgFragShowBsChange = true;
        if (Intrinsics.m88377d(str, "notify_search")) {
            C8318a c8318a = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
            if (c8318a != null) {
                C8318a.m43154E(c8318a, 0L, 1, null);
            }
        } else if (Intrinsics.m88377d("match_success", str)) {
            C8774c.Companion companion = C8774c.INSTANCE;
            if (companion.m51485a().m51480h()) {
                OnlineMatchManager.m51326z().f33442I.m137019l(C4907v.f20866b0);
                companion.m51485a().m51481i(0L);
                m42972F(newQuickChatAudioHeader, 0L, 1, null);
                return;
            } else {
                m42972F(newQuickChatAudioHeader, 0L, 1, null);
                if (!(obj instanceof OnlineMatchMatchUser)) {
                    return;
                }
                C8318a c8318a2 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
                if (c8318a2 != null) {
                    c8318a2.m43176K(str, obj, CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS);
                }
            }
        } else if (Intrinsics.m88377d("match_timeout", str)) {
            gs50.INSTANCE.m132001a().m131993H(newQuickChatAudioHeader.getAct(), "match_timeout");
            m42972F(newQuickChatAudioHeader, 0L, 1, null);
        } else if (Intrinsics.m88377d("tickets_broadcast", str)) {
            C8774c.Companion companion2 = C8774c.INSTANCE;
            if (companion2.m51485a().m51480h()) {
                OnlineMatchManager.m51326z().f33442I.m137019l(C4907v.f20866b0);
                companion2.m51485a().m51481i(0L);
                m42972F(newQuickChatAudioHeader, 0L, 1, null);
                CoreModule.f18264c.f20300D0.m35839L4(null);
                return;
            }
            m42972F(newQuickChatAudioHeader, 0L, 1, null);
            if (!(obj instanceof OnlineMatchPushUser)) {
                return;
            }
            C8318a c8318a3 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
            if (c8318a3 != null) {
                c8318a3.m43176K(str, obj, CorePopLevel.QUICK_NOTIFY_BROADCAST);
            }
        } else if (Intrinsics.m88377d("notify_normal_state", str)) {
            m42972F(newQuickChatAudioHeader, 0L, 1, null);
        }
        OnlineMatchManager.m51326z().f33442I.m137019l(C4907v.f20866b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m42981s(NewQuickChatAudioHeader newQuickChatAudioHeader, pf60 pf60Var) {
        if ((pf60Var != null ? (C4470c) pf60Var.f152157b : null) == C4470c.f16267i) {
            if ((pf60Var != null ? (TabName) pf60Var.f152156a : null) == TabName.Msg) {
                if (newQuickChatAudioHeader.headerState != NewHeaderState.SearchState) {
                    newQuickChatAudioHeader.m42990E(0L);
                    return;
                }
                C8318a c8318a = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
                if (c8318a != null) {
                    c8318a.m43172D(0L);
                    return;
                }
                return;
            }
        }
        C8318a c8318a2 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
        if (c8318a2 != null) {
            c8318a2.m43177L(false);
        }
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m42982t(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static Triple m42983u(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: v */
    public static pf60 m42984v(Function2 function2, Object obj, Object obj2) {
        return (pf60) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: w */
    public static Boolean m42985w(Triple triple) {
        return Boolean.valueOf(triple.getSecond() == TabName.Msg && Intrinsics.m88377d(triple.getThird(), C4470c.f16267i));
    }

    /* JADX INFO: renamed from: A */
    public final boolean m42986A() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList == null) {
            return false;
        }
        if (conversationsList.f25847V.getCount() != 0) {
            return conversationsList.f25847V.getFirstVisiblePosition() == 0 && conversationsList.f25827E0.getTop() == 0 && conversationsList.f25827E0.f25919m.getLayoutParams().height == getInitHeight();
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final void m42987B() {
        Act act = getAct();
        C22507a<pf60<String, Object>> c22507a = OnlineMatchManager.m51326z().f33442I;
        Act act2 = getAct();
        act2.getClass();
        C22421c<TabName> c22421cM40829o7 = ((NewMainAct) act2).m40829o7();
        C22421c<C4470c> c22421cLifecycle = getAct().lifecycle();
        final Function3 function3 = new Function3() { // from class: l.og40
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return NewQuickChatAudioHeader.m42974l((pf60) obj, (TabName) obj2, (C4470c) obj3);
            }
        };
        C22421c c22421cDuringCreated = act.duringCreated(psd0.m173626s(c22507a, c22421cM40829o7, c22421cLifecycle, new scj() { // from class: l.rg40
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return NewQuickChatAudioHeader.m42983u(function3, obj, obj2, obj3);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.sg40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m42985w((Triple) obj);
            }
        };
        C22421c c22421cFilter = c22421cDuringCreated.filter(new qcj() { // from class: l.tg40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m42976n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ug40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m42973k((Triple) obj);
            }
        };
        C22421c map = c22421cFilter.map(new qcj() { // from class: l.vg40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m42978p(function2, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.wg40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m42975m((pf60) obj);
            }
        };
        map.filter(new qcj() { // from class: l.lg40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m42982t(function4, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.mg40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewQuickChatAudioHeader.m42980r(this.f136693a, (pf60) obj);
            }
        }));
        Act act3 = getAct();
        Act act4 = getAct();
        act4.getClass();
        C22421c<TabName> c22421cM40829o8 = ((NewMainAct) act4).m40829o7();
        C22421c<C4470c> c22421cLifecycle2 = getAct().lifecycle();
        final Function2 function5 = new Function2() { // from class: l.ng40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewQuickChatAudioHeader.m42977o((TabName) obj, (C4470c) obj2);
            }
        };
        act3.duringCreated(psd0.m173625r(c22421cM40829o8, c22421cLifecycle2, new rcj() { // from class: l.pg40
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return NewQuickChatAudioHeader.m42984v(function5, obj, obj2);
            }
        }), false).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.qg40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewQuickChatAudioHeader.m42981s(this.f157381a, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m42988C() {
        Long l2 = OnlineMatchManager.m51326z().f33465u.get();
        return l2 == null || l2.longValue() != pzi0.m174453n();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m42989D() {
        VideoChatSecondFloorSummary videoChatSecondFloorSummaryM222761e = CoreModule.f18264c.f20398j2.f91949R.m222761e();
        Long l2 = OnlineMatchManager.m51326z().f33465u.get();
        long jM174453n = pzi0.m174453n();
        if ((l2 != null && l2.longValue() == jM174453n) || !r3c0.m179594q()) {
            return false;
        }
        if ((videoChatSecondFloorSummaryM222761e != null ? videoChatSecondFloorSummaryM222761e.startTime : Long.MAX_VALUE) <= pzi0.m174454o()) {
            return (videoChatSecondFloorSummaryM222761e != null ? videoChatSecondFloorSummaryM222761e.endTime : 0L) >= pzi0.m174454o();
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m42990E(long speedDuration) {
        int i = C8308a.f26205a[m43004y().ordinal()];
        if (i == 1) {
            C8318a c8318a = this.newQuickChatAudioHeaderViewModel;
            if (c8318a != null) {
                c8318a.m43171A(speedDuration);
                return;
            }
            return;
        }
        C8318a c8318a2 = this.newQuickChatAudioHeaderViewModel;
        if (i != 2) {
            if (c8318a2 != null) {
                C8318a.m43170z(c8318a2, 0L, 1, null);
            }
        } else if (c8318a2 != null) {
            c8318a2.m43174G(speedDuration);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m42991G() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null && SystemClock.uptimeMillis() - this.lastStartAct > 500) {
            this.lastStartAct = SystemClock.uptimeMillis();
            Intent intent = new Intent(getAct(), (Class<?>) QuickChatLoftAct.class);
            intent.putExtra("action", this.headerState == NewHeaderState.VideoTipsState ? "videoTips" : "normal");
            getAct().startActivityWithCustomTransition(intent, new ai40(conversationsList, this));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m42992H(int height) {
        if (height < this.ALLOW_PULL_START || this.isBottomPlayedVibrateAnim || !this.isTouchDown) {
            return;
        }
        this.isBottomPlayedVibrateAnim = true;
        Object systemService = getAct().getSystemService("vibrator");
        systemService.getClass();
        Vibrator vibrator = (Vibrator) systemService;
        vibrator.vibrate(500L);
        vibrator.vibrate(new long[]{100, 100}, -1);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo42993a() {
        C8318a c8318a = this.newQuickChatAudioHeaderViewModel;
        if (c8318a != null) {
            return !c8318a.m43188v();
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo42994b(float headViewHeight) {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo42995c(int height) {
        m42992H(height);
        C8318a c8318a = this.newQuickChatAudioHeaderViewModel;
        if (c8318a != null) {
            c8318a.m43179m(height);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo42996d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        C8318a c8318a = this.newQuickChatAudioHeaderViewModel;
        if (c8318a != null) {
            c8318a.m43186t();
        }
        m42987B();
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo42997e() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: f */
    public void mo42998f() {
        if (m42986A()) {
            int i = C8308a.f26205a[this.headerState.ordinal()];
            if (i == 1) {
                C8318a c8318a = this.newQuickChatAudioHeaderViewModel;
                if (c8318a != null) {
                    C8318a.m43152B(c8318a, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i == 2) {
                C8318a c8318a2 = this.newQuickChatAudioHeaderViewModel;
                if (c8318a2 != null) {
                    C8318a.m43155H(c8318a2, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i == 3) {
                C8318a c8318a3 = this.newQuickChatAudioHeaderViewModel;
                if (c8318a3 != null) {
                    C8318a.m43170z(c8318a3, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i != 4) {
                nbr.m162172a();
                return;
            }
            C8318a c8318a4 = this.newQuickChatAudioHeaderViewModel;
            if (c8318a4 != null) {
                C8318a.m43154E(c8318a4, 0L, 1, null);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo42999g(int height, boolean isAutoTopShow) {
        if (isAutoTopShow || m42986A()) {
            if (height < 0) {
                height = (int) Math.rint(height * 1.5f);
            }
            NewHeaderState newHeaderState = this.headerState;
            if (newHeaderState == NewHeaderState.NormalState) {
                if (isAutoTopShow) {
                    mo42995c(getDEFALUE_NORMAL_HEIGH());
                    return;
                }
                int iAbs = getLayoutParams().height + Math.abs(height);
                int i = this.OVER_SCROLL_HEIGHT;
                if (iAbs >= i) {
                    iAbs = i;
                }
                mo42995c(iAbs);
                return;
            }
            if (newHeaderState != NewHeaderState.NormalTipsState && newHeaderState != NewHeaderState.VideoTipsState) {
                int iAbs2 = getLayoutParams().height + Math.abs(height);
                if (iAbs2 >= getLOADING_VIEW_HEIGHT()) {
                    iAbs2 = getLOADING_VIEW_HEIGHT();
                }
                if (isAutoTopShow) {
                    iAbs2 = getLOADING_VIEW_HEIGHT();
                }
                mo42995c(iAbs2);
                return;
            }
            if (isAutoTopShow) {
                mo42995c(this.DEFALUE_TIPS_HEIGH);
                return;
            }
            int iAbs3 = getLayoutParams().height + Math.abs(height);
            int i2 = this.DEFALUE_TIPS_HEIGH;
            if (iAbs3 >= i2) {
                iAbs3 = i2;
            }
            mo42995c(iAbs3);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getDEFALUE_NORMAL_HEIGH() {
        return this.DEFALUE_NORMAL_HEIGH;
    }

    public final int getDEFALUE_TIPS_HEIGH() {
        return this.DEFALUE_TIPS_HEIGH;
    }

    @NotNull
    public final NewHeaderState getHeaderState() {
        return this.headerState;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getInitHeight() {
        int i = qa00.f156322i;
        if (gra.m131563F0() || gra.m131672d3() || gra.m131683g()) {
            i = 0;
        }
        return i + getLayoutParams().height;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo43000h() {
        NewHeaderState newHeaderState = this.headerState;
        NewHeaderState newHeaderState2 = NewHeaderState.SearchState;
        C8318a c8318a = this.newQuickChatAudioHeaderViewModel;
        if (newHeaderState == newHeaderState2) {
            if (c8318a != null) {
                C8318a.m43154E(c8318a, 0L, 1, null);
            }
        } else if (c8318a != null) {
            c8318a.m43190y(0L);
        }
        C8318a c8318a2 = this.newQuickChatAudioHeaderViewModel;
        if (c8318a2 != null) {
            C8318a.m43157M(c8318a2, false, 1, null);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: i */
    public void mo43001i() {
        this.isTouchDown = true;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo43002j() {
        this.isTouchDown = false;
        postDelayed(new Runnable() { // from class: l.kg40
            @Override // java.lang.Runnable
            public final void run() {
                NewQuickChatAudioHeader.m42979q(this.f126573a);
            }
        }, 500L);
        NewHeaderState newHeaderState = this.headerState;
        NewHeaderState newHeaderState2 = NewHeaderState.SearchState;
        if (newHeaderState == newHeaderState2 && getLayoutParams().height <= getLOADING_VIEW_HEIGHT()) {
            return getLayoutParams().height;
        }
        if (this.headerState == NewHeaderState.NormalState && getLayoutParams().height <= getDEFALUE_NORMAL_HEIGH()) {
            return getLayoutParams().height;
        }
        NewHeaderState newHeaderState3 = this.headerState;
        NewHeaderState newHeaderState4 = NewHeaderState.NormalTipsState;
        if (newHeaderState3 == newHeaderState4 && getLayoutParams().height <= this.DEFALUE_TIPS_HEIGH) {
            return getLayoutParams().height;
        }
        if (getLayoutParams().height >= this.ALLOW_PULL_START) {
            m42991G();
            return getDEFALUE_NORMAL_HEIGH();
        }
        NewHeaderState newHeaderState5 = this.headerState;
        if (newHeaderState5 == newHeaderState2) {
            C8318a c8318a = this.newQuickChatAudioHeaderViewModel;
            if (c8318a != null) {
                C8318a.m43154E(c8318a, 0L, 1, null);
            }
            return getLOADING_VIEW_HEIGHT();
        }
        if (newHeaderState5 == newHeaderState4) {
            C8318a c8318a2 = this.newQuickChatAudioHeaderViewModel;
            if (c8318a2 != null) {
                C8318a.m43152B(c8318a2, 0L, 1, null);
            }
            return this.DEFALUE_TIPS_HEIGH;
        }
        NewHeaderState newHeaderState6 = NewHeaderState.VideoTipsState;
        C8318a c8318a3 = this.newQuickChatAudioHeaderViewModel;
        if (newHeaderState5 == newHeaderState6) {
            if (c8318a3 != null) {
                C8318a.m43155H(c8318a3, 0L, 1, null);
            }
            return this.DEFALUE_TIPS_HEIGH;
        }
        if (c8318a3 != null) {
            C8318a.m43170z(c8318a3, 0L, 1, null);
        }
        return getDEFALUE_NORMAL_HEIGH();
    }

    public final void setHeaderState(@NotNull NewHeaderState newHeaderState) {
        newHeaderState.getClass();
        this.headerState = newHeaderState;
    }

    /* JADX INFO: renamed from: x */
    public final void m43003x(int height) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        y20<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
    }

    /* JADX INFO: renamed from: y */
    public final NewHeaderState m43004y() {
        if (m42989D()) {
            return NewHeaderState.VideoTipsState;
        }
        return m42988C() ? NewHeaderState.NormalTipsState : NewHeaderState.NormalState;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m43005z() {
        ConvCellList convCellList;
        ConversationsList conversationsList;
        ConversationsListHeadView conversationsListHeadView;
        ConvCellList convCellList2;
        ConversationsList conversationsList2 = this.conversationsList;
        if (conversationsList2 != null && (convCellList2 = conversationsList2.f25847V) != null && convCellList2.getCount() == 0) {
            return true;
        }
        ConversationsList conversationsList3 = this.conversationsList;
        return (conversationsList3 == null || (convCellList = conversationsList3.f25847V) == null || convCellList.getFirstVisiblePosition() != 0 || (conversationsList = this.conversationsList) == null || (conversationsListHeadView = conversationsList.f25827E0) == null || conversationsListHeadView.getTop() != 0) ? false : true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioHeader(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioHeader(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ NewQuickChatAudioHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
