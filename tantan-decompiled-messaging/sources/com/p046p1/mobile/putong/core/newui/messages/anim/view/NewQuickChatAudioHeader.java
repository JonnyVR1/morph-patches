package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConvCellList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8611c;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ak50;
import p149l.b2s;
import p149l.e30;
import p149l.j760;
import p149l.l9r;
import p149l.m940;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nvb0;
import p149l.svq;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.y9j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001:\u0001WB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\fJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\fJ\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\"J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\fJ\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010\u0016J\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\fR\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00104R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106R\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b8\u0010\"R\u001a\u0010<\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\"R\u001a\u0010?\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u0010\"R\u001a\u0010B\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010\"R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00106R\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010T\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u0019\"\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010F¨\u0006X"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "B", "()V", "", "speedDuration", "E", "(J)V", "height", "H", "(I)V", "", "A", "()Z", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", BaseSei.f13931Y, "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "D", b2s.C_ZONE, BaseSei.f13932Z, "a", "c", BaseSei.f13930X, RXScreenCaptureService.KEY_INDEX, "j", "()I", "G", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "f", "", "headViewHeight", "b", "(F)Z", "e", "h", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "newQuickChatAudioHeaderViewModel", "I", "ALLOW_PULL_START", "getDEFALUE_TIPS_HEIGH", "DEFALUE_TIPS_HEIGH", "k", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", BLiveStormDanmakuGiftResourceType.f44444l, "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "m", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", "n", "OVER_SCROLL_HEIGHT", "o", "Z", "isBottomPlayedVibrateAnim", "p", "isTouchDown", "q", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "r", "J", "lastStartAct", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "getHeaderState", "setHeaderState", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;)V", "headerState", Constants.KEY_T, "pushUserMsgFragShowBsChange", "NewHeaderState", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class NewQuickChatAudioHeader extends QuickChatHeaderBaseView {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C8167a newQuickChatAudioHeaderViewModel;

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

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "NormalTipsState", "VideoTipsState", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum NewHeaderState {
        NormalState,
        SearchState,
        NormalTipsState,
        VideoTipsState;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<NewHeaderState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8157a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25463a;

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
            f25463a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioHeader(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.ALLOW_PULL_START = svq.m186103c(70);
        this.DEFALUE_TIPS_HEIGH = svq.m186103c(40);
        this.DEFALUE_NORMAL_HEIGH = svq.m186103c(0);
        this.MAX_PULL_VIEW_HEIGH = svq.m186103c(80);
        this.LOADING_VIEW_HEIGHT = svq.m186103c(40);
        this.OVER_SCROLL_HEIGHT = svq.m186103c(50);
        this.headerState = NewHeaderState.NormalState;
        setAct((Act) context);
        this.newQuickChatAudioHeaderViewModel = new C8167a(this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = 0;
        C8167a c8167a = this.newQuickChatAudioHeaderViewModel;
        if (c8167a != null) {
            c8167a.m42176u();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m41961F(NewQuickChatAudioHeader newQuickChatAudioHeader, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        newQuickChatAudioHeader.m41979E(j);
    }

    /* JADX INFO: renamed from: k */
    public static j760 m41962k(Triple triple) {
        triple.getClass();
        return (j760) triple.getFirst();
    }

    /* JADX INFO: renamed from: l */
    public static Triple m41963l(j760 j760Var, TabName tabName, C4319c c4319c) {
        return new Triple(j760Var, tabName, c4319c);
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m41964m(j760 j760Var) {
        j760Var.getClass();
        return Boolean.valueOf(j760Var != C4756v.f20124b0);
    }

    /* JADX INFO: renamed from: n */
    public static Boolean m41965n(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static j760 m41966o(TabName tabName, C4319c c4319c) {
        return vwb.m200311Y(tabName, c4319c);
    }

    /* JADX INFO: renamed from: p */
    public static j760 m41967p(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static void m41968q(NewQuickChatAudioHeader newQuickChatAudioHeader) {
        newQuickChatAudioHeader.isBottomPlayedVibrateAnim = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static void m41969r(NewQuickChatAudioHeader newQuickChatAudioHeader, j760 j760Var) {
        j760Var.getClass();
        String str = (String) j760Var.f116564a;
        Object obj = j760Var.f116565b;
        newQuickChatAudioHeader.pushUserMsgFragShowBsChange = true;
        if (Intrinsics.m87488d(str, "notify_search")) {
            C8167a c8167a = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
            if (c8167a != null) {
                C8167a.m42143E(c8167a, 0L, 1, null);
            }
        } else if (Intrinsics.m87488d("match_success", str)) {
            C8611c.Companion companion = C8611c.INSTANCE;
            if (companion.m50302a().m50297h()) {
                OnlineMatchManager.m50143z().f32594I.m132487l(C4756v.f20124b0);
                companion.m50302a().m50298i(0L);
                m41961F(newQuickChatAudioHeader, 0L, 1, null);
                return;
            } else {
                m41961F(newQuickChatAudioHeader, 0L, 1, null);
                if (!(obj instanceof OnlineMatchMatchUser)) {
                    return;
                }
                C8167a c8167a2 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
                if (c8167a2 != null) {
                    c8167a2.m42165K(str, obj, CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS);
                }
            }
        } else if (Intrinsics.m87488d("match_timeout", str)) {
            ak50.INSTANCE.m97144a().m97136H(newQuickChatAudioHeader.getAct(), "match_timeout");
            m41961F(newQuickChatAudioHeader, 0L, 1, null);
        } else if (Intrinsics.m87488d("tickets_broadcast", str)) {
            C8611c.Companion companion2 = C8611c.INSTANCE;
            if (companion2.m50302a().m50297h()) {
                OnlineMatchManager.m50143z().f32594I.m132487l(C4756v.f20124b0);
                companion2.m50302a().m50298i(0L);
                m41961F(newQuickChatAudioHeader, 0L, 1, null);
                CoreModule.f17545c.f19558D0.m34836L4(null);
                return;
            }
            m41961F(newQuickChatAudioHeader, 0L, 1, null);
            if (!(obj instanceof OnlineMatchPushUser)) {
                return;
            }
            C8167a c8167a3 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
            if (c8167a3 != null) {
                c8167a3.m42165K(str, obj, CorePopLevel.QUICK_NOTIFY_BROADCAST);
            }
        } else if (Intrinsics.m87488d("notify_normal_state", str)) {
            m41961F(newQuickChatAudioHeader, 0L, 1, null);
        }
        OnlineMatchManager.m50143z().f32594I.m132487l(C4756v.f20124b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m41970s(NewQuickChatAudioHeader newQuickChatAudioHeader, j760 j760Var) {
        if ((j760Var != null ? (C4319c) j760Var.f116565b : null) == C4319c.f15548i) {
            if ((j760Var != null ? (TabName) j760Var.f116564a : null) == TabName.Msg) {
                if (newQuickChatAudioHeader.headerState != NewHeaderState.SearchState) {
                    newQuickChatAudioHeader.m41979E(0L);
                    return;
                }
                C8167a c8167a = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
                if (c8167a != null) {
                    c8167a.m42161D(0L);
                    return;
                }
                return;
            }
        }
        C8167a c8167a2 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
        if (c8167a2 != null) {
            c8167a2.m42166L(false);
        }
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m41971t(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static Triple m41972u(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: v */
    public static j760 m41973v(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: w */
    public static Boolean m41974w(Triple triple) {
        return Boolean.valueOf(triple.getSecond() == TabName.Msg && Intrinsics.m87488d(triple.getThird(), C4319c.f15548i));
    }

    /* JADX INFO: renamed from: A */
    public final boolean m41975A() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList == null) {
            return false;
        }
        if (conversationsList.f25105V.getCount() != 0) {
            return conversationsList.f25105V.getFirstVisiblePosition() == 0 && conversationsList.f25085E0.getTop() == 0 && conversationsList.f25085E0.f25177m.getLayoutParams().height == getInitHeight();
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final void m41976B() {
        Act act = getAct();
        C22392a<j760<String, Object>> c22392a = OnlineMatchManager.m50143z().f32594I;
        Act act2 = getAct();
        act2.getClass();
        C22306c<TabName> c22306cM39819i7 = ((NewMainAct) act2).m39819i7();
        C22306c<C4319c> c22306cLifecycle = getAct().lifecycle();
        final Function3 function3 = new Function3() { // from class: l.a840
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return NewQuickChatAudioHeader.m41963l((j760) obj, (TabName) obj2, (C4319c) obj3);
            }
        };
        C22306c c22306cDuringCreated = act.duringCreated(mkd0.m154985s(c22392a, c22306cM39819i7, c22306cLifecycle, new y9j() { // from class: l.d840
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return NewQuickChatAudioHeader.m41972u(function3, obj, obj2, obj3);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.e840
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m41974w((Triple) obj);
            }
        };
        C22306c c22306cFilter = c22306cDuringCreated.filter(new w9j() { // from class: l.f840
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m41965n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.g840
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m41962k((Triple) obj);
            }
        };
        C22306c map = c22306cFilter.map(new w9j() { // from class: l.h840
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m41967p(function2, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.i840
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m41964m((j760) obj);
            }
        };
        map.filter(new w9j() { // from class: l.x740
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m41971t(function4, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.y740
            @Override // p149l.e30
            public final void call(Object obj) {
                NewQuickChatAudioHeader.m41969r(this.f196670a, (j760) obj);
            }
        }));
        Act act3 = getAct();
        Act act4 = getAct();
        act4.getClass();
        C22306c<TabName> c22306cM39819i8 = ((NewMainAct) act4).m39819i7();
        C22306c<C4319c> c22306cLifecycle2 = getAct().lifecycle();
        final Function2 function5 = new Function2() { // from class: l.z740
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewQuickChatAudioHeader.m41966o((TabName) obj, (C4319c) obj2);
            }
        };
        act3.duringCreated(mkd0.m154984r(c22306cM39819i8, c22306cLifecycle2, new x9j() { // from class: l.b840
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return NewQuickChatAudioHeader.m41973v(function5, obj, obj2);
            }
        }), false).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.c840
            @Override // p149l.e30
            public final void call(Object obj) {
                NewQuickChatAudioHeader.m41970s(this.f79687a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m41977C() {
        Long l2 = OnlineMatchManager.m50143z().f32617u.get();
        return l2 == null || l2.longValue() != mqi0.m155943n();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m41978D() {
        VideoChatSecondFloorSummary videoChatSecondFloorSummaryM221515e = CoreModule.f17545c.f19656j2.f71926R.m221515e();
        Long l2 = OnlineMatchManager.m50143z().f32617u.get();
        long jM155943n = mqi0.m155943n();
        if ((l2 != null && l2.longValue() == jM155943n) || !nvb0.m161585q()) {
            return false;
        }
        if ((videoChatSecondFloorSummaryM221515e != null ? videoChatSecondFloorSummaryM221515e.startTime : Long.MAX_VALUE) <= mqi0.m155944o()) {
            return (videoChatSecondFloorSummaryM221515e != null ? videoChatSecondFloorSummaryM221515e.endTime : 0L) >= mqi0.m155944o();
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m41979E(long speedDuration) {
        int i = C8157a.f25463a[m41993y().ordinal()];
        if (i == 1) {
            C8167a c8167a = this.newQuickChatAudioHeaderViewModel;
            if (c8167a != null) {
                c8167a.m42160A(speedDuration);
                return;
            }
            return;
        }
        C8167a c8167a2 = this.newQuickChatAudioHeaderViewModel;
        if (i != 2) {
            if (c8167a2 != null) {
                C8167a.m42159z(c8167a2, 0L, 1, null);
            }
        } else if (c8167a2 != null) {
            c8167a2.m42163G(speedDuration);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m41980G() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null && SystemClock.uptimeMillis() - this.lastStartAct > 500) {
            this.lastStartAct = SystemClock.uptimeMillis();
            Intent intent = new Intent(getAct(), (Class<?>) QuickChatLoftAct.class);
            intent.putExtra("action", this.headerState == NewHeaderState.VideoTipsState ? "videoTips" : "normal");
            getAct().startActivityWithCustomTransition(intent, new m940(conversationsList, this));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m41981H(int height) {
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

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo41982a() {
        C8167a c8167a = this.newQuickChatAudioHeaderViewModel;
        if (c8167a != null) {
            return !c8167a.m42177v();
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo41983b(float headViewHeight) {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo41984c(int height) {
        m41981H(height);
        C8167a c8167a = this.newQuickChatAudioHeaderViewModel;
        if (c8167a != null) {
            c8167a.m42168m(height);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo41985d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        C8167a c8167a = this.newQuickChatAudioHeaderViewModel;
        if (c8167a != null) {
            c8167a.m42175t();
        }
        m41976B();
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo41986e() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: f */
    public void mo41987f() {
        if (m41975A()) {
            int i = C8157a.f25463a[this.headerState.ordinal()];
            if (i == 1) {
                C8167a c8167a = this.newQuickChatAudioHeaderViewModel;
                if (c8167a != null) {
                    C8167a.m42141B(c8167a, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i == 2) {
                C8167a c8167a2 = this.newQuickChatAudioHeaderViewModel;
                if (c8167a2 != null) {
                    C8167a.m42144H(c8167a2, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i == 3) {
                C8167a c8167a3 = this.newQuickChatAudioHeaderViewModel;
                if (c8167a3 != null) {
                    C8167a.m42159z(c8167a3, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i != 4) {
                l9r.m149037a();
                return;
            }
            C8167a c8167a4 = this.newQuickChatAudioHeaderViewModel;
            if (c8167a4 != null) {
                C8167a.m42143E(c8167a4, 0L, 1, null);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo41988g(int height, boolean isAutoTopShow) {
        if (isAutoTopShow || m41975A()) {
            if (height < 0) {
                height = (int) Math.rint(height * 1.5f);
            }
            NewHeaderState newHeaderState = this.headerState;
            if (newHeaderState == NewHeaderState.NormalState) {
                if (isAutoTopShow) {
                    mo41984c(getDEFALUE_NORMAL_HEIGH());
                    return;
                }
                int iAbs = getLayoutParams().height + Math.abs(height);
                int i = this.OVER_SCROLL_HEIGHT;
                if (iAbs >= i) {
                    iAbs = i;
                }
                mo41984c(iAbs);
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
                mo41984c(iAbs2);
                return;
            }
            if (isAutoTopShow) {
                mo41984c(this.DEFALUE_TIPS_HEIGH);
                return;
            }
            int iAbs3 = getLayoutParams().height + Math.abs(height);
            int i2 = this.DEFALUE_TIPS_HEIGH;
            if (iAbs3 >= i2) {
                iAbs3 = i2;
            }
            mo41984c(iAbs3);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
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

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getInitHeight() {
        int i = t100.f167260i;
        if (upa.m194632F0() || upa.m194741d3() || upa.m194752g()) {
            i = 0;
        }
        return i + getLayoutParams().height;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo41989h() {
        NewHeaderState newHeaderState = this.headerState;
        NewHeaderState newHeaderState2 = NewHeaderState.SearchState;
        C8167a c8167a = this.newQuickChatAudioHeaderViewModel;
        if (newHeaderState == newHeaderState2) {
            if (c8167a != null) {
                C8167a.m42143E(c8167a, 0L, 1, null);
            }
        } else if (c8167a != null) {
            c8167a.m42179y(0L);
        }
        C8167a c8167a2 = this.newQuickChatAudioHeaderViewModel;
        if (c8167a2 != null) {
            C8167a.m42146M(c8167a2, false, 1, null);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: i */
    public void mo41990i() {
        this.isTouchDown = true;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo41991j() {
        this.isTouchDown = false;
        postDelayed(new Runnable() { // from class: l.w740
            @Override // java.lang.Runnable
            public final void run() {
                NewQuickChatAudioHeader.m41968q(this.f185021a);
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
            m41980G();
            return getDEFALUE_NORMAL_HEIGH();
        }
        NewHeaderState newHeaderState5 = this.headerState;
        if (newHeaderState5 == newHeaderState2) {
            C8167a c8167a = this.newQuickChatAudioHeaderViewModel;
            if (c8167a != null) {
                C8167a.m42143E(c8167a, 0L, 1, null);
            }
            return getLOADING_VIEW_HEIGHT();
        }
        if (newHeaderState5 == newHeaderState4) {
            C8167a c8167a2 = this.newQuickChatAudioHeaderViewModel;
            if (c8167a2 != null) {
                C8167a.m42141B(c8167a2, 0L, 1, null);
            }
            return this.DEFALUE_TIPS_HEIGH;
        }
        NewHeaderState newHeaderState6 = NewHeaderState.VideoTipsState;
        C8167a c8167a3 = this.newQuickChatAudioHeaderViewModel;
        if (newHeaderState5 == newHeaderState6) {
            if (c8167a3 != null) {
                C8167a.m42144H(c8167a3, 0L, 1, null);
            }
            return this.DEFALUE_TIPS_HEIGH;
        }
        if (c8167a3 != null) {
            C8167a.m42159z(c8167a3, 0L, 1, null);
        }
        return getDEFALUE_NORMAL_HEIGH();
    }

    public final void setHeaderState(@NotNull NewHeaderState newHeaderState) {
        newHeaderState.getClass();
        this.headerState = newHeaderState;
    }

    /* JADX INFO: renamed from: x */
    public final void m41992x(int height) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        e30<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
    }

    /* JADX INFO: renamed from: y */
    public final NewHeaderState m41993y() {
        if (m41978D()) {
            return NewHeaderState.VideoTipsState;
        }
        return m41977C() ? NewHeaderState.NormalTipsState : NewHeaderState.NormalState;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m41994z() {
        ConvCellList convCellList;
        ConversationsList conversationsList;
        ConversationsListHeadView conversationsListHeadView;
        ConvCellList convCellList2;
        ConversationsList conversationsList2 = this.conversationsList;
        if (conversationsList2 != null && (convCellList2 = conversationsList2.f25105V) != null && convCellList2.getCount() == 0) {
            return true;
        }
        ConversationsList conversationsList3 = this.conversationsList;
        return (conversationsList3 == null || (convCellList = conversationsList3.f25105V) == null || convCellList.getFirstVisiblePosition() != 0 || (conversationsList = this.conversationsList) == null || (conversationsListHeadView = conversationsList.f25085E0) == null || conversationsListHeadView.getTop() != 0) ? false : true;
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
