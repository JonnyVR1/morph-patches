package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.VoiceGiftWallBriefView;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class kan0 {
    /* JADX INFO: renamed from: a */
    public static void m145152a(VoiceGiftWallBriefView voiceGiftWallBriefView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallBriefView.f52314d = (VDraweeView) viewGroup.getChildAt(0);
        voiceGiftWallBriefView.f52315e = (VLinear) viewGroup.getChildAt(1);
        voiceGiftWallBriefView.f52316f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceGiftWallBriefView.f52317g = viewGroup.getChildAt(2);
        voiceGiftWallBriefView.f52318h = (RecyclerView) viewGroup.getChildAt(3);
    }
}
