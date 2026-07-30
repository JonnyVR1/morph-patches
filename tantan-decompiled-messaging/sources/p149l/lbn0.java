package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail.VoiceGiftWallLightItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lbn0 {
    /* JADX INFO: renamed from: a */
    public static void m149258a(VoiceGiftWallLightItemView voiceGiftWallLightItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallLightItemView.f53164a = (TextView) viewGroup.getChildAt(1);
        voiceGiftWallLightItemView.f53165b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceGiftWallLightItemView.f53166c = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceGiftWallLightItemView.f53167d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
