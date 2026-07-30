package p006l;

import android.app.Activity;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.profile.ProfileAct_CustomTransition;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l.hpd0;
import l.tpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 12\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\bR\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\bR\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\b¨\u00063"}, d2 = {"Ll/ezc0;", "Ll/ogl0;", "<init>", "()V", "", "canGuideSuperLike", "", "q0", "(Z)V", "l0", "()Z", "n0", "e0", "j0", "k0", "f0", "", "b", "I", "GUIDE_SUPERLIKE_SWIPE_COUNT", "c", "GUIDE_UNDO_SWIPE_COUNT", "Ll/tpd0;", "d", "Ll/tpd0;", "newUiSuperLikeGuideSwipeNum", "e", "newUiUndoGuideSwipeNum", "Ll/hpd0;", "f", "Ll/hpd0;", "getSuperLikeGuideShowed", "()Ll/hpd0;", "setSuperLikeGuideShowed", "(Ll/hpd0;)V", "superLikeGuideShowed", "g", "Z", "getCanGuideSuperLikeCard", "setCanGuideSuperLikeCard", "canGuideSuperLikeCard", "h", "h0", "r0", "canGuideUndoTips", "i", "g0", "p0", "allowUpSwipe", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ezc0 extends ogl0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @Nullable
    public static volatile ezc0 f11531j;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int GUIDE_SUPERLIKE_SWIPE_COUNT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int GUIDE_UNDO_SWIPE_COUNT;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public tpd0 newUiSuperLikeGuideSwipeNum;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public tpd0 newUiUndoGuideSwipeNum;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public hpd0 superLikeGuideShowed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean canGuideSuperLikeCard;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean canGuideUndoTips;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean allowUpSwipe;

    public ezc0() {
        this.GUIDE_SUPERLIKE_SWIPE_COUNT = 20;
        this.GUIDE_UNDO_SWIPE_COUNT = 5;
        this.newUiSuperLikeGuideSwipeNum = new tpd0("new_ui_superlike_guide_swipe_count_" + CoreModule.m1850H().userId(), 0);
        this.newUiUndoGuideSwipeNum = new tpd0("new_ui_undo_guide_swipe_count_" + CoreModule.m1850H().userId(), 0);
        this.superLikeGuideShowed = new hpd0("new_ui_superLike_guide_showed_" + CoreModule.m1850H().userId(), Boolean.FALSE);
        this.allowUpSwipe = true;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public static final ezc0 m14947i0() {
        return INSTANCE.m14961a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: m0 */
    public static final boolean m14948m0() {
        return INSTANCE.m14962b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: o0 */
    public static final void m14949o0() {
        INSTANCE.m14963c();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m14950e0() {
        this.newUiUndoGuideSwipeNum.put(Integer.valueOf(((Integer) this.newUiUndoGuideSwipeNum.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m14951f0() {
        return INSTANCE.m14961a().canGuideUndoTips;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final boolean getAllowUpSwipe() {
        return this.allowUpSwipe;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final boolean getCanGuideUndoTips() {
        return this.canGuideUndoTips;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m14954j0() {
        WeakReference weakReference;
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.SuperlikeGuideCard;
        userInfo.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        Act.r rVarForeground_ = Act.foreground_();
        if (((rVarForeground_ == null || (weakReference = rVarForeground_.a) == null) ? null : (Activity) weakReference.get()) instanceof ProfileAct_CustomTransition) {
            CoreModule.f1534c.f3652m0.m3084w6(userInfo, 1);
        } else {
            CoreModule.f1534c.f3652m0.m3084w6(userInfo, 0);
        }
        this.superLikeGuideShowed.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m14955k0() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.UndoGuideCard;
        userInfo.f3461id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f1534c.f3652m0.m3084w6(userInfo, 0);
        d.l().k("bubble_superlike_bubble");
        rxg0.m23422u();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m14956l0() {
        if (this.canGuideSuperLikeCard) {
            Integer num = (Integer) this.newUiSuperLikeGuideSwipeNum.get();
            if (num.intValue() <= this.GUIDE_SUPERLIKE_SWIPE_COUNT) {
                int iIntValue = num.intValue() + 1;
                this.newUiSuperLikeGuideSwipeNum.put(Integer.valueOf(iIntValue));
                return iIntValue == this.GUIDE_SUPERLIKE_SWIPE_COUNT;
            }
            this.canGuideSuperLikeCard = false;
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m14957n0() {
        return this.canGuideUndoTips && ((Number) this.newUiUndoGuideSwipeNum.get()).intValue() > this.GUIDE_UNDO_SWIPE_COUNT;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m14958p0(boolean z) {
        this.allowUpSwipe = z;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m14959q0(boolean canGuideSuperLike) {
        this.canGuideSuperLikeCard = canGuideSuperLike;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m14960r0(boolean z) {
        this.canGuideUndoTips = z;
    }

    /* JADX INFO: renamed from: l.ezc0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll/ezc0$a;", "", "<init>", "()V", "Ll/ezc0;", "a", "()Ll/ezc0;", "", "b", "()Z", "", "c", "_instance", "Ll/ezc0;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ezc0 m14961a() {
            ezc0 ezc0Var;
            ezc0 ezc0Var2 = ezc0.f11531j;
            if (ezc0Var2 != null) {
                return ezc0Var2;
            }
            synchronized (this) {
                ezc0Var = ezc0.f11531j;
                if (ezc0Var == null) {
                    ezc0Var = new ezc0(null);
                    ezc0.f11531j = ezc0Var;
                }
            }
            return ezc0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m14962b() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m14963c() {
            ezc0.f11531j = null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ ezc0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
