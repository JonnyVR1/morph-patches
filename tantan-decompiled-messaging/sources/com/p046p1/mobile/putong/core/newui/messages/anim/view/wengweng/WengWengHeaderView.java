package com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView;
import com.p046p1.mobile.putong.core.p053ui.BuzzComboAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.e30;
import p149l.j760;
import p149l.l9r;
import p149l.mkd0;
import p149l.svq;
import p149l.t100;
import p149l.u4q0;
import p149l.upa;
import p149l.vwb;
import p149l.x9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001KB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fJ\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0015J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010\u0015J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u0012J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\r\u0010-\u001a\u00020\u0013¢\u0006\u0004\b-\u0010\u0015R\u001a\u00100\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u00102\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b1\u0010\u001dR\u0017\u00104\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b3\u0010\u001dR\u0017\u00107\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u0010\u001dR\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010.R\u0016\u0010@\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010?R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010BR\"\u0010G\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010C\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010I¨\u0006L"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", BLiveStormDanmakuGiftResourceType.f44446s, "()V", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "p", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "height", ResourceDirection.f38808v, "(I)V", "", "r", "()Z", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", Constants.KEY_T, "c", "j", "()I", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "h", RXScreenCaptureService.KEY_INDEX, "f", "a", "", "headViewHeight", "b", "(F)Z", "e", "o", "u", "q", "I", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "getDEFALUE_TIPS_HEIGH", "DEFALUE_TIPS_HEIGH", "k", "getOVER_SCROLL_HEIGHT", "OVER_SCROLL_HEIGHT", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a;", "viewModel", "m", "ALLOW_PULL_START", "n", "Z", "isBottomPlayedVibrateAnim", "isTouchDown", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "getHeaderState", "setHeaderState", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;)V", "headerState", "", "J", "lastStartAct", "State", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class WengWengHeaderView extends QuickChatHeaderBaseView {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int DEFALUE_NORMAL_HEIGH;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int MAX_PULL_VIEW_HEIGH;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int DEFALUE_TIPS_HEIGH;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int OVER_SCROLL_HEIGHT;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public C8174a viewModel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int ALLOW_PULL_START;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isBottomPlayedVibrateAnim;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean isTouchDown;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public ConversationsList conversationsList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public State headerState;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long lastStartAct;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "TipState", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum State {
        NormalState,
        TipState;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8170a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25690a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.NormalState.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.TipState.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25690a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WengWengHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.DEFALUE_NORMAL_HEIGH = svq.m186103c(0);
        this.MAX_PULL_VIEW_HEIGH = svq.m186103c(76);
        this.DEFALUE_TIPS_HEIGH = svq.m186103c(38);
        this.OVER_SCROLL_HEIGHT = svq.m186103c(50);
        this.ALLOW_PULL_START = svq.m186103c(70);
        this.headerState = State.NormalState;
        setAct((Act) context);
        this.viewModel = new C8174a(this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = 0;
        C8174a c8174a = this.viewModel;
        if (c8174a != null) {
            c8174a.m42279j();
        }
    }

    /* JADX INFO: renamed from: k */
    public static j760 m42227k(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static void m42228l(WengWengHeaderView wengWengHeaderView) {
        wengWengHeaderView.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: m */
    public static j760 m42229m(TabName tabName, C4319c c4319c) {
        return vwb.m200311Y(tabName, c4319c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m42230n(WengWengHeaderView wengWengHeaderView, j760 j760Var) {
        if ((j760Var != null ? (C4319c) j760Var.f116565b : null) == C4319c.f15548i) {
            if ((j760Var != null ? (TabName) j760Var.f116564a : null) == TabName.Msg) {
                int i = C8170a.f25690a[wengWengHeaderView.m42235p().ordinal()];
                if (i == 1) {
                    C8174a c8174a = wengWengHeaderView.viewModel;
                    if (c8174a != null) {
                        c8174a.m42281m(0L);
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    l9r.m149037a();
                    return;
                }
                C8174a c8174a2 = wengWengHeaderView.viewModel;
                if (c8174a2 != null) {
                    c8174a2.m42282o(0L);
                }
                zvf0.m220402x("e_intl_buzz_second_level_entry", OMSDialogPositon.p_messages_view);
                return;
            }
        }
        C8174a c8174a3 = wengWengHeaderView.viewModel;
        if (c8174a3 != null) {
            c8174a3.m42283r(false);
        }
    }

    /* JADX INFO: renamed from: r */
    private final boolean m42231r() {
        Function0<Boolean> canPullChecker;
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null) {
            if (conversationsList.f25105V.getCount() != 0) {
                return conversationsList.f25105V.getFirstVisiblePosition() == 0 && conversationsList.f25085E0.getTop() == 0 && conversationsList.f25085E0.f25177m.getLayoutParams().height == getInitHeight();
            }
            return true;
        }
        PullQuickChatLayout pullQuickChatLayout = getPullQuickChatLayout();
        if (pullQuickChatLayout == null || (canPullChecker = pullQuickChatLayout.getCanPullChecker()) == null) {
            return false;
        }
        return canPullChecker.invoke().booleanValue();
    }

    /* JADX INFO: renamed from: s */
    private final void m42232s() {
        Act act = getAct();
        Act act2 = getAct();
        act2.getClass();
        C22306c<TabName> c22306cM39819i7 = ((NewMainAct) act2).m39819i7();
        C22306c<C4319c> c22306cLifecycle = getAct().lifecycle();
        final Function2 function2 = new Function2() { // from class: l.i4q0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WengWengHeaderView.m42229m((TabName) obj, (C4319c) obj2);
            }
        };
        act.duringCreated(mkd0.m154984r(c22306cM39819i7, c22306cLifecycle, new x9j() { // from class: l.j4q0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return WengWengHeaderView.m42227k(function2, obj, obj2);
            }
        }).distinctUntilChanged(), false).subscribe(mkd0.m154955G(new e30() { // from class: l.k4q0
            @Override // p149l.e30
            public final void call(Object obj) {
                WengWengHeaderView.m42230n(this.f121116a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    private final void m42233v(int height) {
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
        m42233v(height);
        C8174a c8174a = this.viewModel;
        if (c8174a != null) {
            c8174a.m42277h(height);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo41985d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        m42232s();
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo41986e() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: f */
    public void mo41987f() {
        if (m42231r()) {
            int i = C8170a.f25690a[this.headerState.ordinal()];
            if (i == 1) {
                C8174a c8174a = this.viewModel;
                if (c8174a != null) {
                    C8174a.m42272n(c8174a, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i != 2) {
                l9r.m149037a();
                return;
            }
            C8174a c8174a2 = this.viewModel;
            if (c8174a2 != null) {
                C8174a.m42273p(c8174a2, 0L, 1, null);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo41988g(int height, boolean isAutoTopShow) {
        if (isAutoTopShow || m42231r()) {
            if (height < 0) {
                height = (int) Math.rint(height * 1.5f);
            }
            State state = this.headerState;
            if (state == State.NormalState) {
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
            if (state == State.TipState) {
                if (isAutoTopShow) {
                    mo41984c(this.DEFALUE_TIPS_HEIGH);
                    return;
                }
                int iAbs2 = getLayoutParams().height + Math.abs(height);
                int i2 = this.DEFALUE_TIPS_HEIGH;
                if (iAbs2 >= i2) {
                    iAbs2 = i2;
                }
                mo41984c(iAbs2);
            }
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
    public final State getHeaderState() {
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
    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    public final int getOVER_SCROLL_HEIGHT() {
        return this.OVER_SCROLL_HEIGHT;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo41989h() {
        C8174a c8174a = this.viewModel;
        if (c8174a != null) {
            c8174a.m42281m(0L);
        }
        C8174a c8174a2 = this.viewModel;
        if (c8174a2 != null) {
            C8174a.m42275s(c8174a2, false, 1, null);
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
        postDelayed(new Runnable() { // from class: l.h4q0
            @Override // java.lang.Runnable
            public final void run() {
                WengWengHeaderView.m42228l(this.f105867a);
            }
        }, 500L);
        if (getLayoutParams().height >= this.ALLOW_PULL_START) {
            m42238u();
            zvf0.m220371D("e_intl_slide_buzz_second_level_entry", "p_buzz_sum", vwb.m200311Y("slide_result", "success"));
            return getDEFALUE_NORMAL_HEIGH();
        }
        zvf0.m220371D("e_intl_slide_buzz_second_level_entry", "p_buzz_sum", vwb.m200311Y("slide_result", "fail"));
        int i = C8170a.f25690a[this.headerState.ordinal()];
        if (i == 1) {
            C8174a c8174a = this.viewModel;
            if (c8174a != null) {
                C8174a.m42272n(c8174a, 0L, 1, null);
            }
            return this.DEFALUE_TIPS_HEIGH;
        }
        C8174a c8174a2 = this.viewModel;
        if (i != 2) {
            if (c8174a2 != null) {
                C8174a.m42272n(c8174a2, 0L, 1, null);
            }
            return getDEFALUE_NORMAL_HEIGH();
        }
        if (c8174a2 != null) {
            C8174a.m42273p(c8174a2, 0L, 1, null);
        }
        return this.DEFALUE_TIPS_HEIGH;
    }

    /* JADX INFO: renamed from: o */
    public final void m42234o(int height) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        e30<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
    }

    /* JADX INFO: renamed from: p */
    public final State m42235p() {
        if (CoreModule.f17545c.f19639e0.f149209K6.get().booleanValue()) {
            return State.NormalState;
        }
        CoreModule.f17545c.f19639e0.f149209K6.put(Boolean.TRUE);
        return State.TipState;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m42236q() {
        Function0<Boolean> canPullChecker;
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null) {
            if (conversationsList.f25105V.getCount() != 0) {
                return conversationsList.f25105V.getFirstVisiblePosition() == 0 && conversationsList.f25085E0.getTop() == 0;
            }
            return true;
        }
        PullQuickChatLayout pullQuickChatLayout = getPullQuickChatLayout();
        if (pullQuickChatLayout == null || (canPullChecker = pullQuickChatLayout.getCanPullChecker()) == null) {
            return false;
        }
        return canPullChecker.invoke().booleanValue();
    }

    public final void setHeaderState(@NotNull State state) {
        state.getClass();
        this.headerState = state;
    }

    /* JADX INFO: renamed from: t */
    public final void m42237t() {
        m42232s();
    }

    /* JADX INFO: renamed from: u */
    public final void m42238u() {
        if (SystemClock.uptimeMillis() - this.lastStartAct <= 500) {
            return;
        }
        this.lastStartAct = SystemClock.uptimeMillis();
        Intent intent = new Intent(getAct(), (Class<?>) BuzzComboAct.class);
        View pullQuickChatLayout = this.conversationsList;
        if (pullQuickChatLayout == null) {
            pullQuickChatLayout = getPullQuickChatLayout();
        }
        if (pullQuickChatLayout != null) {
            getAct().startActivityWithCustomTransition(intent, new u4q0(pullQuickChatLayout, this));
        } else {
            getAct().startActivity(intent);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WengWengHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WengWengHeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WengWengHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
