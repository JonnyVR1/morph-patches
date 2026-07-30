package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p046p1.mobile.putong.core.p053ui.vip.BotherOptDynamicAvatarRoundView;

/* JADX INFO: loaded from: classes10.dex */
public class ia3 {
    /* JADX INFO: renamed from: a */
    public static void m135124a(BotherOptDynamicAvatarRoundView botherOptDynamicAvatarRoundView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        botherOptDynamicAvatarRoundView.f36948a = (ViewStub) viewGroup.getChildAt(0);
        botherOptDynamicAvatarRoundView.f36949b = (ViewStub) viewGroup.getChildAt(1);
        botherOptDynamicAvatarRoundView.f36950c = (ViewStub) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m135125b(BotherOptDynamicAvatarRoundView botherOptDynamicAvatarRoundView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95666Z, viewGroup, false);
        m135124a(botherOptDynamicAvatarRoundView, viewInflate);
        return viewInflate;
    }
}
