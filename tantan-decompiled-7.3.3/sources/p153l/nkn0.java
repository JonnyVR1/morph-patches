package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.view.VoiceGiftWallItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nkn0 {
    /* JADX INFO: renamed from: a */
    public static void m163662a(VoiceGiftWallItemView voiceGiftWallItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallItemView.f54016d = (RelativeLayout) viewGroup.getChildAt(0);
        voiceGiftWallItemView.f54017e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceGiftWallItemView.f54018f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceGiftWallItemView.f54019g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        voiceGiftWallItemView.f54020h = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        voiceGiftWallItemView.f54021i = (VText) viewGroup.getChildAt(1);
    }
}
