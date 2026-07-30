package com.p000p1.mobile.putong.core.newui.messages.anim.view.wengweng;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.BuzzComboAct;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.e30;
import l.j760;
import l.l9r;
import l.mkd0;
import l.svq;
import l.t100;
import l.upa;
import l.vwb;
import l.x9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.u4q0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001KB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\fJ\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0015J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010\u0015J\u0015\u0010+\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u0012J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\r\u0010-\u001a\u00020\u0013¢\u0006\u0004\b-\u0010\u0015R\u001a\u00100\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u0010\u001dR\u001a\u00102\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b1\u0010\u001dR\u0017\u00104\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b3\u0010\u001dR\u0017\u00107\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u0010\u001dR\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010.R\u0016\u0010@\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010?R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010BR\"\u0010G\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010C\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010I¨\u0006L"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatHeaderBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "s", "()V", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "p", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "height", "v", "(I)V", "", "r", "()Z", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "conversationsList", "d", "(Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;)V", "t", "c", "j", "()I", "getInitHeight", "isAutoTopShow", "g", "(IZ)V", "h", "i", "f", "a", "", "headViewHeight", "b", "(F)Z", "e", "o", "u", "q", "I", "getDEFALUE_NORMAL_HEIGH", "DEFALUE_NORMAL_HEIGH", "getMAX_PULL_VIEW_HEIGH", "MAX_PULL_VIEW_HEIGH", "getDEFALUE_TIPS_HEIGH", "DEFALUE_TIPS_HEIGH", "k", "getOVER_SCROLL_HEIGHT", "OVER_SCROLL_HEIGHT", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a;", "l", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a;", "viewModel", "m", "ALLOW_PULL_START", "n", "Z", "isBottomPlayedVibrateAnim", "isTouchDown", "Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "getHeaderState", "setHeaderState", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;)V", "headerState", "", "J", "lastStartAct", "State", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public C0338a viewModel;

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "", "<init>", "(Ljava/lang/String;I)V", "NormalState", "TipState", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum State {
        NormalState,
        TipState;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0334a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4468a;

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
            f4468a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WengWengHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.DEFALUE_NORMAL_HEIGH = svq.c(0);
        this.MAX_PULL_VIEW_HEIGH = svq.c(76);
        this.DEFALUE_TIPS_HEIGH = svq.c(38);
        this.OVER_SCROLL_HEIGHT = svq.c(50);
        this.ALLOW_PULL_START = svq.c(70);
        this.headerState = State.NormalState;
        setAct((Act) context);
        this.viewModel = new C0338a(this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        getLayoutParams().height = 0;
        C0338a c0338a = this.viewModel;
        if (c0338a != null) {
            c0338a.m6428j();
        }
    }

    /* JADX INFO: renamed from: k */
    public static j760 m6376k(Function2 function2, Object obj, Object obj2) {
        return (j760) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static void m6377l(WengWengHeaderView wengWengHeaderView) {
        wengWengHeaderView.isBottomPlayedVibrateAnim = false;
    }

    /* JADX INFO: renamed from: m */
    public static j760 m6378m(TabName tabName, c cVar) {
        return vwb.Y(tabName, cVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m6379n(WengWengHeaderView wengWengHeaderView, j760 j760Var) {
        if ((j760Var != null ? (c) j760Var.b : null) == c.i) {
            if ((j760Var != null ? (TabName) j760Var.a : null) == TabName.Msg) {
                int i = C0334a.f4468a[wengWengHeaderView.m6384p().ordinal()];
                if (i == 1) {
                    C0338a c0338a = wengWengHeaderView.viewModel;
                    if (c0338a != null) {
                        c0338a.m6430m(0L);
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    l9r.a();
                    return;
                }
                C0338a c0338a2 = wengWengHeaderView.viewModel;
                if (c0338a2 != null) {
                    c0338a2.m6431o(0L);
                }
                zvf0.x("e_intl_buzz_second_level_entry", "p_messages_view");
                return;
            }
        }
        C0338a c0338a3 = wengWengHeaderView.viewModel;
        if (c0338a3 != null) {
            c0338a3.m6432r(false);
        }
    }

    /* JADX INFO: renamed from: r */
    private final boolean m6380r() {
        Function0<Boolean> canPullChecker;
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null) {
            if (conversationsList.f3883V.getCount() != 0) {
                return conversationsList.f3883V.getFirstVisiblePosition() == 0 && conversationsList.f3863E0.getTop() == 0 && conversationsList.f3863E0.f3955m.getLayoutParams().height == getInitHeight();
            }
            return true;
        }
        PullQuickChatLayout pullQuickChatLayout = getPullQuickChatLayout();
        if (pullQuickChatLayout == null || (canPullChecker = pullQuickChatLayout.getCanPullChecker()) == null) {
            return false;
        }
        return ((Boolean) canPullChecker.invoke()).booleanValue();
    }

    /* JADX INFO: renamed from: s */
    private final void m6381s() {
        Act act = getAct();
        NewMainAct act2 = getAct();
        act2.getClass();
        rx.c<TabName> cVarM3895i7 = act2.m3895i7();
        rx.c cVarLifecycle = getAct().lifecycle();
        final Function2 function2 = new Function2() { // from class: l.i4q0
            public final Object invoke(Object obj, Object obj2) {
                return WengWengHeaderView.m6378m((TabName) obj, (c) obj2);
            }
        };
        act.duringCreated(mkd0.r(cVarM3895i7, cVarLifecycle, new x9j() { // from class: l.j4q0
            public final Object call(Object obj, Object obj2) {
                return WengWengHeaderView.m6376k(function2, obj, obj2);
            }
        }).distinctUntilChanged(), false).subscribe(mkd0.G(new e30() { // from class: l.k4q0
            public final void call(Object obj) {
                WengWengHeaderView.m6379n(this.f15413a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    private final void m6382v(int height) {
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
        m6382v(height);
        C0338a c0338a = this.viewModel;
        if (c0338a != null) {
            c0338a.m6426h(height);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: d */
    public void mo6127d(@NotNull ConversationsList conversationsList) {
        conversationsList.getClass();
        this.conversationsList = conversationsList;
        m6381s();
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: e */
    public boolean mo6128e() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: f */
    public void mo6129f() {
        if (m6380r()) {
            int i = C0334a.f4468a[this.headerState.ordinal()];
            if (i == 1) {
                C0338a c0338a = this.viewModel;
                if (c0338a != null) {
                    C0338a.m6421n(c0338a, 0L, 1, null);
                    return;
                }
                return;
            }
            if (i != 2) {
                l9r.a();
                return;
            }
            C0338a c0338a2 = this.viewModel;
            if (c0338a2 != null) {
                C0338a.m6422p(c0338a2, 0L, 1, null);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: g */
    public void mo6130g(int height, boolean isAutoTopShow) {
        if (isAutoTopShow || m6380r()) {
            if (height < 0) {
                height = (int) Math.rint(height * 1.5f);
            }
            State state = this.headerState;
            if (state == State.NormalState) {
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
            if (state == State.TipState) {
                if (isAutoTopShow) {
                    mo6126c(this.DEFALUE_TIPS_HEIGH);
                    return;
                }
                int iAbs2 = getLayoutParams().height + Math.abs(height);
                int i2 = this.DEFALUE_TIPS_HEIGH;
                if (iAbs2 >= i2) {
                    iAbs2 = i2;
                }
                mo6126c(iAbs2);
            }
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
    public final State getHeaderState() {
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
    public int getMAX_PULL_VIEW_HEIGH() {
        return this.MAX_PULL_VIEW_HEIGH;
    }

    public final int getOVER_SCROLL_HEIGHT() {
        return this.OVER_SCROLL_HEIGHT;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView
    /* JADX INFO: renamed from: h */
    public void mo6131h() {
        C0338a c0338a = this.viewModel;
        if (c0338a != null) {
            c0338a.m6430m(0L);
        }
        C0338a c0338a2 = this.viewModel;
        if (c0338a2 != null) {
            C0338a.m6424s(c0338a2, false, 1, null);
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
        postDelayed(new Runnable() { // from class: l.h4q0
            @Override // java.lang.Runnable
            public final void run() {
                WengWengHeaderView.m6377l(this.f13865a);
            }
        }, 500L);
        if (getLayoutParams().height >= this.ALLOW_PULL_START) {
            m6387u();
            zvf0.D("e_intl_slide_buzz_second_level_entry", "p_buzz_sum", new j760[]{vwb.Y("slide_result", "success")});
            return getDEFALUE_NORMAL_HEIGH();
        }
        zvf0.D("e_intl_slide_buzz_second_level_entry", "p_buzz_sum", new j760[]{vwb.Y("slide_result", "fail")});
        int i = C0334a.f4468a[this.headerState.ordinal()];
        if (i == 1) {
            C0338a c0338a = this.viewModel;
            if (c0338a != null) {
                C0338a.m6421n(c0338a, 0L, 1, null);
            }
            return this.DEFALUE_TIPS_HEIGH;
        }
        C0338a c0338a2 = this.viewModel;
        if (i != 2) {
            if (c0338a2 != null) {
                C0338a.m6421n(c0338a2, 0L, 1, null);
            }
            return getDEFALUE_NORMAL_HEIGH();
        }
        if (c0338a2 != null) {
            C0338a.m6422p(c0338a2, 0L, 1, null);
        }
        return this.DEFALUE_TIPS_HEIGH;
    }

    /* JADX INFO: renamed from: o */
    public final void m6383o(int height) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = height;
        setLayoutParams(layoutParams);
        e30<Integer> changeHeightListrener = getChangeHeightListrener();
        if (changeHeightListrener != null) {
            changeHeightListrener.call(Integer.valueOf(height));
        }
    }

    /* JADX INFO: renamed from: p */
    public final State m6384p() {
        if (((Boolean) CoreModule.c.e0.K6.get()).booleanValue()) {
            return State.NormalState;
        }
        CoreModule.c.e0.K6.put(Boolean.TRUE);
        return State.TipState;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6385q() {
        Function0<Boolean> canPullChecker;
        ConversationsList conversationsList = this.conversationsList;
        if (conversationsList != null) {
            if (conversationsList.f3883V.getCount() != 0) {
                return conversationsList.f3883V.getFirstVisiblePosition() == 0 && conversationsList.f3863E0.getTop() == 0;
            }
            return true;
        }
        PullQuickChatLayout pullQuickChatLayout = getPullQuickChatLayout();
        if (pullQuickChatLayout == null || (canPullChecker = pullQuickChatLayout.getCanPullChecker()) == null) {
            return false;
        }
        return ((Boolean) canPullChecker.invoke()).booleanValue();
    }

    public final void setHeaderState(@NotNull State state) {
        state.getClass();
        this.headerState = state;
    }

    /* JADX INFO: renamed from: t */
    public final void m6386t() {
        m6381s();
    }

    /* JADX INFO: renamed from: u */
    public final void m6387u() {
        if (SystemClock.uptimeMillis() - this.lastStartAct <= 500) {
            return;
        }
        this.lastStartAct = SystemClock.uptimeMillis();
        Intent intent = new Intent((Context) getAct(), (Class<?>) BuzzComboAct.class);
        SwipeRefreshLayout pullQuickChatLayout = this.conversationsList;
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
