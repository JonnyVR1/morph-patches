package com.p000p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.v;
import com.p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
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
import l.ak50;
import l.e30;
import l.j760;
import l.l9r;
import l.mkd0;
import l.nvb0;
import l.svq;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.x9j;
import l.y9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.m940;
import p009l.mqi0;
import rx.subjects.a;
import v.VLinear;
import v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001:\u0001WB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\fJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\fJ\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\"J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\fJ\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010\u0016J\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\fR\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00104R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106R\u0017\u00109\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b8\u0010\"R\u001a\u0010<\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u0010\"R\u001a\u0010?\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u0010\"R\u001a\u0010B\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010\"R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00106R\u0016\u0010G\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010T\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u0019\"\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010F¨\u0006X"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "B", "()V", "", "speedDuration", "E", "(J)V", "height", "H", "(I)V", "", "A", "()Z", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "y", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "D", "C", "z", "a", "c", "x", "i", "j", "()I", "G", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", "d", "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "f", "", "headViewHeight", "b", "(F)Z", "e", "h", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/a;", "newQuickChatAudioHeaderViewModel", "I", "ALLOW_PULL_START", "getDEFALUE_TIPS_HEIGH", "DEFALUE_TIPS_HEIGH", "k", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "l", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "m", "getLOADING_VIEW_HEIGHT", "LOADING_VIEW_HEIGHT", "n", "OVER_SCROLL_HEIGHT", "o", "Z", "isBottomPlayedVibrateAnim", "p", "isTouchDown", "q", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "r", "J", "lastStartAct", "s", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "getHeaderState", "setHeaderState", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;)V", "headerState", "t", "pushUserMsgFragShowBsChange", "NewHeaderState", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class NewQuickChatAudioHeader extends QuickChatHeaderBaseView {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C0331a newQuickChatAudioHeaderViewModel;

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/NewQuickChatAudioHeader$NewHeaderState;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "SearchState", "NormalTipsState", "VideoTipsState", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum NewHeaderState {
        NormalState,
        SearchState,
        NormalTipsState,
        VideoTipsState;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<NewHeaderState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0321a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4241a;

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
            f4241a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewQuickChatAudioHeader(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.ALLOW_PULL_START = svq.c(70);
        this.DEFALUE_TIPS_HEIGH = svq.c(40);
        this.DEFALUE_NORMAL_HEIGH = svq.c(0);
        this.MAX_PULL_VIEW_HEIGH = svq.c(80);
        this.LOADING_VIEW_HEIGHT = svq.c(40);
        this.OVER_SCROLL_HEIGHT = svq.c(50);
        this.headerState = NewHeaderState.NormalState;
        setAct((Act) context);
        this.newQuickChatAudioHeaderViewModel = new C0331a(this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = 0;
        C0331a c0331a = this.newQuickChatAudioHeaderViewModel;
        if (c0331a != null) {
            c0331a.m6318u();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m6103F(NewQuickChatAudioHeader newQuickChatAudioHeader, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        newQuickChatAudioHeader.m6121E(j);
    }

    /* JADX INFO: renamed from: k */
    public static j760 m6104k(Triple triple) {
        triple.getClass();
        return (j760) triple.getFirst();
    }

    /* JADX INFO: renamed from: l */
    public static Triple m6105l(j760 j760Var, TabName tabName, c cVar) {
        return new Triple(j760Var, tabName, cVar);
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m6106m(j760 j760Var) {
        j760Var.getClass();
        return Boolean.valueOf(j760Var != v.b0);
    }

    /* JADX INFO: renamed from: n */
    public static Boolean m6107n(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static j760 m6108o(TabName tabName, c cVar) {
        return vwb.Y(tabName, cVar);
    }

    /* JADX INFO: renamed from: p */
    public static j760 m6109p(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static void m6110q(NewQuickChatAudioHeader newQuickChatAudioHeader) {
        newQuickChatAudioHeader.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: r */
    public static void m6111r(NewQuickChatAudioHeader newQuickChatAudioHeader, j760 j760Var) {
        j760Var.getClass();
        String str = (String) j760Var.a;
        Object obj = j760Var.b;
        newQuickChatAudioHeader.pushUserMsgFragShowBsChange = true;
        if (Intrinsics.d(str, "notify_search")) {
            C0331a c0331a = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
            if (c0331a != null) {
                C0331a.m6285E(c0331a, 0L, 1, null);
            }
        } else if (Intrinsics.d("match_success", str)) {
            com.p1.mobile.putong.core.ui.onlinematch.c.a aVar = com.p1.mobile.putong.core.ui.onlinematch.c.Companion;
            if (aVar.a().h()) {
                OnlineMatchManager.z().I.onNext(v.b0);
                aVar.a().i(0L);
                m6103F(newQuickChatAudioHeader, 0L, 1, null);
                return;
            } else {
                m6103F(newQuickChatAudioHeader, 0L, 1, null);
                if (!(obj instanceof OnlineMatchMatchUser)) {
                    return;
                }
                C0331a c0331a2 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
                if (c0331a2 != null) {
                    c0331a2.m6307K(str, obj, CorePopLevel.QUICK_NOTIFY_MATCH_SUCCESS);
                }
            }
        } else if (Intrinsics.d("match_timeout", str)) {
            ak50.Companion.a().H(newQuickChatAudioHeader.getAct(), "match_timeout");
            m6103F(newQuickChatAudioHeader, 0L, 1, null);
        } else if (Intrinsics.d("tickets_broadcast", str)) {
            com.p1.mobile.putong.core.ui.onlinematch.c.a aVar2 = com.p1.mobile.putong.core.ui.onlinematch.c.Companion;
            if (aVar2.a().h()) {
                OnlineMatchManager.z().I.onNext(v.b0);
                aVar2.a().i(0L);
                m6103F(newQuickChatAudioHeader, 0L, 1, null);
                CoreModule.c.D0.L4((OnlineMatchPushUser) null);
                return;
            }
            m6103F(newQuickChatAudioHeader, 0L, 1, null);
            if (!(obj instanceof OnlineMatchPushUser)) {
                return;
            }
            C0331a c0331a3 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
            if (c0331a3 != null) {
                c0331a3.m6307K(str, obj, CorePopLevel.QUICK_NOTIFY_BROADCAST);
            }
        } else if (Intrinsics.d("notify_normal_state", str)) {
            m6103F(newQuickChatAudioHeader, 0L, 1, null);
        }
        OnlineMatchManager.z().I.onNext(v.b0);
    }

    /* JADX INFO: renamed from: s */
    public static void m6112s(NewQuickChatAudioHeader newQuickChatAudioHeader, j760 j760Var) {
        if ((j760Var != null ? (c) j760Var.b : null) == c.i) {
            if ((j760Var != null ? (TabName) j760Var.a : null) == TabName.Msg) {
                if (newQuickChatAudioHeader.headerState != NewHeaderState.SearchState) {
                    newQuickChatAudioHeader.m6121E(0L);
                    return;
                }
                C0331a c0331a = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
                if (c0331a != null) {
                    c0331a.m6303D(0L);
                    return;
                }
                return;
            }
        }
        C0331a c0331a2 = newQuickChatAudioHeader.newQuickChatAudioHeaderViewModel;
        if (c0331a2 != null) {
            c0331a2.m6308L(false);
        }
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m6113t(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static Triple m6114u(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: v */
    public static j760 m6115v(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: w */
    public static Boolean m6116w(Triple triple) {
        return Boolean.valueOf(triple.getSecond() == TabName.Msg && Intrinsics.d(triple.getThird(), c.i));
    }

    /* JADX INFO: renamed from: A */
    public final boolean m6117A() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList == null) {
            return false;
        }
        if (conversationsList.f3883V.getCount() != 0) {
            return conversationsList.f3883V.getFirstVisiblePosition() == 0 && conversationsList.f3863E0.getTop() == 0 && conversationsList.f3863E0.f3955m.getLayoutParams().height == getInitHeight();
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final void m6118B() {
        Act act = getAct();
        a aVar = OnlineMatchManager.z().I;
        NewMainAct act2 = getAct();
        act2.getClass();
        rx.c<TabName> cVarM3895i7 = act2.m3895i7();
        rx.c cVarLifecycle = getAct().lifecycle();
        final Function3 function3 = new Function3() { // from class: l.a840
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return NewQuickChatAudioHeader.m6105l((j760) obj, (TabName) obj2, (c) obj3);
            }
        };
        rx.c cVarDuringCreated = act.duringCreated(mkd0.s(aVar, cVarM3895i7, cVarLifecycle, new y9j() { // from class: l.d840
            /* JADX INFO: renamed from: a */
            public final Object m13014a(Object obj, Object obj2, Object obj3) {
                return NewQuickChatAudioHeader.m6114u(function3, obj, obj2, obj3);
            }
        }));
        final Function1 function1 = new Function1() { // from class: l.e840
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m6116w((Triple) obj);
            }
        };
        rx.c cVarFilter = cVarDuringCreated.filter(new w9j() { // from class: l.f840
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m6107n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.g840
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m6104k((Triple) obj);
            }
        };
        rx.c map = cVarFilter.map(new w9j() { // from class: l.h840
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m6109p(function2, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.i840
            public final Object invoke(Object obj) {
                return NewQuickChatAudioHeader.m6106m((j760) obj);
            }
        };
        map.filter(new w9j() { // from class: l.x740
            public final Object call(Object obj) {
                return NewQuickChatAudioHeader.m6113t(function4, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.y740
            public final void call(Object obj) {
                NewQuickChatAudioHeader.m6111r(this.f22913a, (j760) obj);
            }
        }));
        Act act3 = getAct();
        NewMainAct act4 = getAct();
        act4.getClass();
        rx.c<TabName> cVarM3895i8 = act4.m3895i7();
        rx.c cVarLifecycle2 = getAct().lifecycle();
        final Function2 function5 = new Function2() { // from class: l.z740
            public final Object invoke(Object obj, Object obj2) {
                return NewQuickChatAudioHeader.m6108o((TabName) obj, (c) obj2);
            }
        };
        act3.duringCreated(mkd0.r(cVarM3895i8, cVarLifecycle2, new x9j() { // from class: l.b840
            public final Object call(Object obj, Object obj2) {
                return NewQuickChatAudioHeader.m6115v(function5, obj, obj2);
            }
        }), false).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.c840
            public final void call(Object obj) {
                NewQuickChatAudioHeader.m6112s(this.f10460a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m6119C() {
        Long l2 = (Long) OnlineMatchManager.z().u.get();
        return l2 == null || l2.longValue() != mqi0.m18549n();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m6120D() {
        VideoChatSecondFloorSummary videoChatSecondFloorSummary = (VideoChatSecondFloorSummary) CoreModule.c.j2.R.e();
        Long l2 = (Long) OnlineMatchManager.z().u.get();
        long jM18549n = mqi0.m18549n();
        if ((l2 != null && l2.longValue() == jM18549n) || !nvb0.q()) {
            return false;
        }
        if ((videoChatSecondFloorSummary != null ? videoChatSecondFloorSummary.startTime : Long.MAX_VALUE) <= mqi0.m18550o()) {
            return (videoChatSecondFloorSummary != null ? videoChatSecondFloorSummary.endTime : 0L) >= mqi0.m18550o();
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m6121E(long speedDuration) {
        int i = C0321a.f4241a[m6135y().ordinal()];
        if (i == 1) {
            C0331a c0331a = this.newQuickChatAudioHeaderViewModel;
            if (c0331a != null) {
                c0331a.m6302A(speedDuration);
                return;
            }
            return;
        }
        C0331a c0331a2 = this.newQuickChatAudioHeaderViewModel;
        if (i != 2) {
            if (c0331a2 != null) {
                C0331a.m6301z(c0331a2, 0L, 1, null);
            }
        } else if (c0331a2 != null) {
            c0331a2.m6305G(speedDuration);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m6122G() {
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null && SystemClock.uptimeMillis() - this.lastStartAct > 500) {
            this.lastStartAct = SystemClock.uptimeMillis();
            Intent intent = new Intent((Context) getAct(), (Class<?>) QuickChatLoftAct.class);
            intent.putExtra("action", this.headerState == NewHeaderState.VideoTipsState ? "videoTips" : "normal");
            getAct().startActivityWithCustomTransition(intent, new m940(conversationsList, this));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m6123H(int height) {
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

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo6124a() {
        C0331a c0331a = this.newQuickChatAudioHeaderViewModel;
        if (c0331a != null) {
            return !c0331a.m6319v();
        }
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: b */
    public boolean mo6125b(float headViewHeight) {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: c */
    public void mo6126c(int height) {
        m6123H(height);
        C0331a c0331a = this.newQuickChatAudioHeaderViewModel;
        if (c0331a != null) {
            c0331a.m6310m(height);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo6127d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        C0331a c0331a = this.newQuickChatAudioHeaderViewModel;
        if (c0331a != null) {
            c0331a.m6317t();
        }
        m6118B();
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo6128e() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: f */
    public void mo6129f() {
        if (m6117A()) {
            int i = C0321a.f4241a[this.headerState.ordinal()];
            if (i == 1) {
                C0331a c0331a = this.newQuickChatAudioHeaderViewModel;
                if (c0331a != null) {
                    C0331a.m6283B(c0331a, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i == 2) {
                C0331a c0331a2 = this.newQuickChatAudioHeaderViewModel;
                if (c0331a2 != null) {
                    C0331a.m6286H(c0331a2, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i == 3) {
                C0331a c0331a3 = this.newQuickChatAudioHeaderViewModel;
                if (c0331a3 != null) {
                    C0331a.m6301z(c0331a3, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i != 4) {
                l9r.a();
                return;
            }
            C0331a c0331a4 = this.newQuickChatAudioHeaderViewModel;
            if (c0331a4 != null) {
                C0331a.m6285E(c0331a4, 0L, 1, null);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo6130g(int height, boolean isAutoTopShow) {
        if (isAutoTopShow || m6117A()) {
            if (height < 0) {
                height = (int) Math.rint(height * 1.5f);
            }
            NewHeaderState newHeaderState = this.headerState;
            if (newHeaderState == NewHeaderState.NormalState) {
                if (isAutoTopShow) {
                    mo6126c(getDEFALUE_NORMAL_HEIGH());
                    return;
                }
                int iAbs = getLayoutParams().height + Math.abs(height);
                int i = this.OVER_SCROLL_HEIGHT;
                if (iAbs >= i) {
                    iAbs = i;
                }
                mo6126c(iAbs);
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
                mo6126c(iAbs2);
                return;
            }
            if (isAutoTopShow) {
                mo6126c(this.DEFALUE_TIPS_HEIGH);
                return;
            }
            int iAbs3 = getLayoutParams().height + Math.abs(height);
            int i2 = this.DEFALUE_TIPS_HEIGH;
            if (iAbs3 >= i2) {
                iAbs3 = i2;
            }
            mo6126c(iAbs3);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
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

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getInitHeight() {
        int i = t100.i;
        if (upa.F0() || upa.d3() || upa.g()) {
            i = 0;
        }
        return i + getLayoutParams().height;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getLOADING_VIEW_HEIGHT() {
        return this.LOADING_VIEW_HEIGHT;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo6131h() {
        NewHeaderState newHeaderState = this.headerState;
        NewHeaderState newHeaderState2 = NewHeaderState.SearchState;
        C0331a c0331a = this.newQuickChatAudioHeaderViewModel;
        if (newHeaderState == newHeaderState2) {
            if (c0331a != null) {
                C0331a.m6285E(c0331a, 0L, 1, null);
            }
        } else if (c0331a != null) {
            c0331a.m6321y(0L);
        }
        C0331a c0331a2 = this.newQuickChatAudioHeaderViewModel;
        if (c0331a2 != null) {
            C0331a.m6288M(c0331a2, false, 1, null);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: i */
    public void mo6132i() {
        this.isTouchDown = true;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: j */
    public int mo6133j() {
        this.isTouchDown = false;
        postDelayed(new Runnable() { // from class: l.w740
            @Override // java.lang.Runnable
            public final void run() {
                NewQuickChatAudioHeader.m6110q(this.f21932a);
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
            m6122G();
            return getDEFALUE_NORMAL_HEIGH();
        }
        NewHeaderState newHeaderState5 = this.headerState;
        if (newHeaderState5 == newHeaderState2) {
            C0331a c0331a = this.newQuickChatAudioHeaderViewModel;
            if (c0331a != null) {
                C0331a.m6285E(c0331a, 0L, 1, null);
            }
            return getLOADING_VIEW_HEIGHT();
        }
        if (newHeaderState5 == newHeaderState4) {
            C0331a c0331a2 = this.newQuickChatAudioHeaderViewModel;
            if (c0331a2 != null) {
                C0331a.m6283B(c0331a2, 0L, 1, null);
            }
            return this.DEFALUE_TIPS_HEIGH;
        }
        NewHeaderState newHeaderState6 = NewHeaderState.VideoTipsState;
        C0331a c0331a3 = this.newQuickChatAudioHeaderViewModel;
        if (newHeaderState5 == newHeaderState6) {
            if (c0331a3 != null) {
                C0331a.m6286H(c0331a3, 0L, 1, null);
            }
            return this.DEFALUE_TIPS_HEIGH;
        }
        if (c0331a3 != null) {
            C0331a.m6301z(c0331a3, 0L, 1, null);
        }
        return getDEFALUE_NORMAL_HEIGH();
    }

    public final void setHeaderState(@NotNull NewHeaderState newHeaderState) {
        newHeaderState.getClass();
        this.headerState = newHeaderState;
    }

    /* JADX INFO: renamed from: x */
    public final void m6134x(int height) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        e30<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
    }

    /* JADX INFO: renamed from: y */
    public final NewHeaderState m6135y() {
        if (m6120D()) {
            return NewHeaderState.VideoTipsState;
        }
        return m6119C() ? NewHeaderState.NormalTipsState : NewHeaderState.NormalState;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m6136z() {
        VList vList;
        ConversationsList conversationsList;
        VLinear vLinear;
        VList vList2;
        ConversationsList conversationsList2 = this.conversationsList;
        if (conversationsList2 != null && (vList2 = conversationsList2.f3883V) != null && vList2.getCount() == 0) {
            return true;
        }
        ConversationsList conversationsList3 = this.conversationsList;
        return (conversationsList3 == null || (vList = conversationsList3.f3883V) == null || vList.getFirstVisiblePosition() != 0 || (conversationsList = this.conversationsList) == null || (vLinear = conversationsList.f3863E0) == null || vLinear.getTop() != 0) ? false : true;
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
