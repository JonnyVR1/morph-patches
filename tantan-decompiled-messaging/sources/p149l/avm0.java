package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class avm0 {
    /* JADX INFO: renamed from: a */
    public static void m99204a(VoiceCardGiftWallView voiceCardGiftWallView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCardGiftWallView.f53823a = (VDraweeView) viewGroup.getChildAt(0);
        voiceCardGiftWallView.f53824b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceCardGiftWallView.f53825c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceCardGiftWallView.f53826d = (RecyclerView) viewGroup.getChildAt(2);
        voiceCardGiftWallView.f53827e = (VImage) viewGroup.getChildAt(3);
    }
}
