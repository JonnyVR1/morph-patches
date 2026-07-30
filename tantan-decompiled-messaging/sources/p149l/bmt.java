package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.view.LiveSettingBaseView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveSettingView;

/* JADX INFO: loaded from: classes4.dex */
public class bmt {
    /* JADX INFO: renamed from: a */
    public static void m102674a(LiveSettingBaseView liveSettingBaseView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSettingBaseView.f52042a = (AnimEffectPlayer) viewGroup.getChildAt(0);
        liveSettingBaseView.f52043b = (LiveSettingView) viewGroup.getChildAt(1);
    }
}
