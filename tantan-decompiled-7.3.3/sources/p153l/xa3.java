package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p051p1.mobile.putong.core.p058ui.vip.BotherOptDynamicAvatarRoundView;

/* JADX INFO: loaded from: classes10.dex */
public class xa3 {
    /* JADX INFO: renamed from: a */
    public static void m209832a(BotherOptDynamicAvatarRoundView botherOptDynamicAvatarRoundView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        botherOptDynamicAvatarRoundView.f37796a = (ViewStub) viewGroup.getChildAt(0);
        botherOptDynamicAvatarRoundView.f37797b = (ViewStub) viewGroup.getChildAt(1);
        botherOptDynamicAvatarRoundView.f37798c = (ViewStub) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m209833b(BotherOptDynamicAvatarRoundView botherOptDynamicAvatarRoundView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125720Z, viewGroup, false);
        m209832a(botherOptDynamicAvatarRoundView, viewInflate);
        return viewInflate;
    }
}
