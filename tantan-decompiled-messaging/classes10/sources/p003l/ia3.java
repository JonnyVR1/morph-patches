package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p1.mobile.putong.core.ui.vip.BotherOptDynamicAvatarRoundView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ia3 {
    /* JADX INFO: renamed from: a */
    public static void m7141a(BotherOptDynamicAvatarRoundView botherOptDynamicAvatarRoundView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        botherOptDynamicAvatarRoundView.a = (ViewStub) viewGroup.getChildAt(0);
        botherOptDynamicAvatarRoundView.b = (ViewStub) viewGroup.getChildAt(1);
        botherOptDynamicAvatarRoundView.c = (ViewStub) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7142b(BotherOptDynamicAvatarRoundView botherOptDynamicAvatarRoundView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Z, viewGroup, false);
        m7141a(botherOptDynamicAvatarRoundView, viewInflate);
        return viewInflate;
    }
}
