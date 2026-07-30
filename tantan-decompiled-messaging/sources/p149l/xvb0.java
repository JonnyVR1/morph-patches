package p149l;

import android.animation.Animator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Ll/xvb0;", "Lcom/p1/mobile/android/app/Act$w;", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "<init>", "()V", "to", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)Landroid/view/View;", SocialConstants.PARAM_ACT, "", "f", "(Lcom/p1/mobile/android/app/Act;)V", "g", "from", "quickChatSearchingAct", "Landroid/animation/Animator;", "j", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)Landroid/animation/Animator;", "k", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xvb0 extends Act.AbstractC4304w<Act, QuickChatSearchingAct> {
    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: f */
    public void mo20412f(@NotNull Act act) {
        act.getClass();
        int i = rzb0.f161651w;
        act.overridePendingTransition(i, i);
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: g */
    public void mo20413g(@NotNull Act act) {
        act.getClass();
        int i = rzb0.f161651w;
        act.overridePendingTransition(i, i);
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public View mo20422a(@NotNull QuickChatSearchingAct to) {
        to.getClass();
        return to.m54498a2().m109266q();
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    @Nullable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(@NotNull Act from, @NotNull QuickChatSearchingAct quickChatSearchingAct) {
        from.getClass();
        quickChatSearchingAct.getClass();
        if (!(from instanceof QuickChatLoftAct)) {
            return null;
        }
        quickChatSearchingAct.m54498a2().m109260j();
        return bt0.m103748u(true, new AccelerateDecelerateInterpolator(), 500L, ((QuickChatLoftAct) from).m54502Z1().exitAnimation(), quickChatSearchingAct.m54498a2().enterAnimation());
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    @Nullable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(@NotNull Act from, @NotNull QuickChatSearchingAct quickChatSearchingAct) {
        from.getClass();
        quickChatSearchingAct.getClass();
        if (from instanceof QuickChatLoftAct) {
            return bt0.m103748u(true, new AccelerateDecelerateInterpolator(), 500L, ((QuickChatLoftAct) from).m54502Z1().enterAnimation(), quickChatSearchingAct.m54498a2().exitAnimation());
        }
        return null;
    }
}
