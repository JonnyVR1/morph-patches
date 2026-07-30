package p153l;

import android.animation.Animator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.QuickChatLoftAct;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Ll/b4c0;", "Lcom/p1/mobile/android/app/Act$w;", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;", "<init>", "()V", "to", "Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)Landroid/view/View;", SocialConstants.PARAM_ACT, "", "f", "(Lcom/p1/mobile/android/app/Act;)V", "g", "from", "quickChatSearchingAct", "Landroid/animation/Animator;", "j", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/quickaudio/newquickchat/searchingPage/QuickChatSearchingAct;)Landroid/animation/Animator;", "k", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class b4c0 extends Act.AbstractC4455w<Act, QuickChatSearchingAct> {
    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: f */
    public void mo21411f(@NotNull Act act) {
        act.getClass();
        int i = x7c0.f192708w;
        act.overridePendingTransition(i, i);
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: g */
    public void mo21412g(@NotNull Act act) {
        act.getClass();
        int i = x7c0.f192708w;
        act.overridePendingTransition(i, i);
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public View mo21421a(@NotNull QuickChatSearchingAct to) {
        to.getClass();
        return to.m55681b2().m129236q();
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    @Nullable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(@NotNull Act from, @NotNull QuickChatSearchingAct quickChatSearchingAct) {
        from.getClass();
        quickChatSearchingAct.getClass();
        if (!(from instanceof QuickChatLoftAct)) {
            return null;
        }
        quickChatSearchingAct.m55681b2().m129230j();
        return gt0.m132175u(true, new AccelerateDecelerateInterpolator(), 500L, ((QuickChatLoftAct) from).m55685a2().exitAnimation(), quickChatSearchingAct.m55681b2().enterAnimation());
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    @Nullable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(@NotNull Act from, @NotNull QuickChatSearchingAct quickChatSearchingAct) {
        from.getClass();
        quickChatSearchingAct.getClass();
        if (from instanceof QuickChatLoftAct) {
            return gt0.m132175u(true, new AccelerateDecelerateInterpolator(), 500L, ((QuickChatLoftAct) from).m55685a2().enterAnimation(), quickChatSearchingAct.m55681b2().exitAnimation());
        }
        return null;
    }
}
