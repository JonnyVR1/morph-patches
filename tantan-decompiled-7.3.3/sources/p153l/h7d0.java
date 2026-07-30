package p153l;

import android.app.Activity;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct_CustomTransition;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 12\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\bR\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\bR\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\b¨\u00063"}, m88121d2 = {"Ll/h7d0;", "Ll/spl0;", "<init>", "()V", "", "canGuideSuperLike", "", "q0", "(Z)V", "l0", "()Z", "n0", "e0", "j0", "k0", "f0", "", "b", "I", "GUIDE_SUPERLIKE_SWIPE_COUNT", "c", "GUIDE_UNDO_SWIPE_COUNT", "Ll/vxd0;", Constants.INAPP_DATA_TAG, "Ll/vxd0;", "newUiSuperLikeGuideSwipeNum", "e", "newUiUndoGuideSwipeNum", "Ll/jxd0;", "f", "Ll/jxd0;", "getSuperLikeGuideShowed", "()Ll/jxd0;", "setSuperLikeGuideShowed", "(Ll/jxd0;)V", "superLikeGuideShowed", "g", "Z", "getCanGuideSuperLikeCard", "setCanGuideSuperLikeCard", "canGuideSuperLikeCard", "h", "h0", "r0", "canGuideUndoTips", RXScreenCaptureService.KEY_INDEX, "g0", "p0", "allowUpSwipe", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class h7d0 extends spl0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @Nullable
    public static volatile h7d0 f108111j;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int GUIDE_SUPERLIKE_SWIPE_COUNT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int GUIDE_UNDO_SWIPE_COUNT;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public vxd0 newUiSuperLikeGuideSwipeNum;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public vxd0 newUiUndoGuideSwipeNum;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public jxd0 superLikeGuideShowed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean canGuideSuperLikeCard;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean canGuideUndoTips;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean allowUpSwipe;

    public h7d0() {
        this.GUIDE_SUPERLIKE_SWIPE_COUNT = 20;
        this.GUIDE_UNDO_SWIPE_COUNT = 5;
        this.newUiSuperLikeGuideSwipeNum = new vxd0("new_ui_superlike_guide_swipe_count_" + CoreModule.m30929H().userId(), 0);
        this.newUiUndoGuideSwipeNum = new vxd0("new_ui_undo_guide_swipe_count_" + CoreModule.m30929H().userId(), 0);
        this.superLikeGuideShowed = new jxd0("new_ui_superLike_guide_showed_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.allowUpSwipe = true;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i0 */
    public static final h7d0 m133773i0() {
        return INSTANCE.m133787a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: m0 */
    public static final boolean m133774m0() {
        return INSTANCE.m133788b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: o0 */
    public static final void m133775o0() {
        INSTANCE.m133789c();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m133776e0() {
        this.newUiUndoGuideSwipeNum.put(Integer.valueOf(this.newUiUndoGuideSwipeNum.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m133777f0() {
        return INSTANCE.m133787a().canGuideUndoTips;
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
    public final void m133780j0() {
        WeakReference<Activity> weakReference;
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.SuperlikeGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        Act.C4450r c4450rForeground_ = Act.foreground_();
        if (((c4450rForeground_ == null || (weakReference = c4450rForeground_.f16062a) == null) ? null : weakReference.get()) instanceof ProfileAct_CustomTransition) {
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 1);
        } else {
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        }
        this.superLikeGuideShowed.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m133781k0() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.virtualCardType = VirtualCardType.UndoGuideCard;
        userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        C4499d.m21895l().m21899k("bubble_superlike_bubble");
        z5h0.m218680u();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m133782l0() {
        if (this.canGuideSuperLikeCard) {
            Integer num = this.newUiSuperLikeGuideSwipeNum.get();
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
    public final boolean m133783n0() {
        return this.canGuideUndoTips && this.newUiUndoGuideSwipeNum.get().intValue() > this.GUIDE_UNDO_SWIPE_COUNT;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m133784p0(boolean z) {
        this.allowUpSwipe = z;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m133785q0(boolean canGuideSuperLike) {
        this.canGuideSuperLikeCard = canGuideSuperLike;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m133786r0(boolean z) {
        this.canGuideUndoTips = z;
    }

    /* JADX INFO: renamed from: l.h7d0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/h7d0$a;", "", "<init>", "()V", "Ll/h7d0;", "a", "()Ll/h7d0;", "", "b", "()Z", "", "c", "_instance", "Ll/h7d0;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final h7d0 m133787a() {
            h7d0 h7d0Var;
            h7d0 h7d0Var2 = h7d0.f108111j;
            if (h7d0Var2 != null) {
                return h7d0Var2;
            }
            synchronized (this) {
                h7d0Var = h7d0.f108111j;
                if (h7d0Var == null) {
                    h7d0Var = new h7d0(null);
                    h7d0.f108111j = h7d0Var;
                }
            }
            return h7d0Var;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final boolean m133788b() {
            return false;
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m133789c() {
            h7d0.f108111j = null;
        }

        public Companion() {
        }
    }

    public /* synthetic */ h7d0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
