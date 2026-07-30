package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.newui.profile.newme.ProfilePrivilegePayGuide;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/iix;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "guide", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function0;", "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "bannerRef", "Lkotlin/Function1;", "", "onBannerCreated", "a", "(Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iix {

    @NotNull
    public static final iix INSTANCE = new iix();

    /* JADX INFO: renamed from: a */
    public final void m140169a(@NotNull ViewGroup container, @Nullable IntlTabMePayGuide guide, @Nullable Act act, @NotNull Function0<ProfilePrivilegePayGuide> bannerRef, @NotNull Function1<? super ProfilePrivilegePayGuide, Unit> onBannerCreated) {
        container.getClass();
        bannerRef.getClass();
        onBannerCreated.getClass();
        if (guide == null) {
            ProfilePrivilegePayGuide profilePrivilegePayGuideInvoke = bannerRef.invoke();
            if (profilePrivilegePayGuideInvoke != null) {
                profilePrivilegePayGuideInvoke.m44309o0(act);
            }
            bnl0.m105524M(container, false);
            return;
        }
        if (!guide.showBanner) {
            ProfilePrivilegePayGuide profilePrivilegePayGuideInvoke2 = bannerRef.invoke();
            if (profilePrivilegePayGuideInvoke2 != null) {
                profilePrivilegePayGuideInvoke2.m44309o0(act);
            }
            bnl0.m105524M(container, false);
            return;
        }
        ProfilePrivilegePayGuide profilePrivilegePayGuideInvoke3 = bannerRef.invoke();
        if (profilePrivilegePayGuideInvoke3 == null) {
            View viewInflate = LayoutInflater.from(container.getContext()).inflate(kec0.f125645U4, container, false);
            viewInflate.getClass();
            profilePrivilegePayGuideInvoke3 = (ProfilePrivilegePayGuide) viewInflate;
            container.removeAllViews();
            container.addView(profilePrivilegePayGuideInvoke3);
            onBannerCreated.invoke(profilePrivilegePayGuideInvoke3);
        }
        if (!profilePrivilegePayGuideInvoke3.m44306l0()) {
            bnl0.m105524M(container, false);
            return;
        }
        bnl0.m105524M(container, true);
        bnl0.m105524M(profilePrivilegePayGuideInvoke3, true);
        profilePrivilegePayGuideInvoke3.m44307m0(guide, act);
    }
}
