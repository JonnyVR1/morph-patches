package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.VoiceGiftWallBriefView;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ojn0 {
    /* JADX INFO: renamed from: a */
    public static void m167868a(VoiceGiftWallBriefView voiceGiftWallBriefView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceGiftWallBriefView.f53162d = (VDraweeView) viewGroup.getChildAt(0);
        voiceGiftWallBriefView.f53163e = (VLinear) viewGroup.getChildAt(1);
        voiceGiftWallBriefView.f53164f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceGiftWallBriefView.f53165g = viewGroup.getChildAt(2);
        voiceGiftWallBriefView.f53166h = (RecyclerView) viewGroup.getChildAt(3);
    }
}
