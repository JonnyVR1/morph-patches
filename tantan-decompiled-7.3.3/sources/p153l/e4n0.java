package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class e4n0 {
    /* JADX INFO: renamed from: a */
    public static void m119456a(VoiceCardGiftWallView voiceCardGiftWallView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardGiftWallView.f54671a = (VDraweeView) viewGroup.getChildAt(0);
        voiceCardGiftWallView.f54672b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCardGiftWallView.f54673c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceCardGiftWallView.f54674d = (RecyclerView) viewGroup.getChildAt(2);
        voiceCardGiftWallView.f54675e = (VImage) viewGroup.getChildAt(3);
    }
}
