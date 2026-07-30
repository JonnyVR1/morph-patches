package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatFrag;
import com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveMaxHeightRecyclerView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class oss {
    /* JADX INFO: renamed from: a */
    public static void m169060a(LiveGroupChatFrag liveGroupChatFrag, View view) {
        liveGroupChatFrag.f47394z = (FrameLayout) view;
        liveGroupChatFrag.f47383A = (LiveMaxHeightRecyclerView) view.findViewById(ldc0.f131571l1);
        ViewGroup viewGroup = (ViewGroup) view;
        liveGroupChatFrag.f47384B = (ConstraintLayout) viewGroup.getChildAt(1);
        liveGroupChatFrag.f47385C = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveGroupChatFrag.f47386D = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveGroupChatFrag.f47387E = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m169061b(LiveGroupChatFrag liveGroupChatFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193897p, viewGroup, false);
        m169060a(liveGroupChatFrag, viewInflate);
        return viewInflate;
    }
}
