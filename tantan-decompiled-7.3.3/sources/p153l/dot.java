package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.view.LiveSettingBaseView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveSettingView;

/* JADX INFO: loaded from: classes4.dex */
public class dot {
    /* JADX INFO: renamed from: a */
    public static void m117362a(LiveSettingBaseView liveSettingBaseView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSettingBaseView.f52890a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        liveSettingBaseView.f52891b = (LiveSettingView) viewGroup.getChildAt(1);
    }
}
