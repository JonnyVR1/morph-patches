package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatFrag;
import com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveMaxHeightRecyclerView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class nqs {
    /* JADX INFO: renamed from: a */
    public static void m160692a(LiveGroupChatFrag liveGroupChatFrag, View view) {
        liveGroupChatFrag.f46546z = (FrameLayout) view;
        liveGroupChatFrag.f46535A = (LiveMaxHeightRecyclerView) view.findViewById(f5c0.f95114l1);
        ViewGroup viewGroup = (ViewGroup) view;
        liveGroupChatFrag.f46536B = (ConstraintLayout) viewGroup.getChildAt(1);
        liveGroupChatFrag.f46537C = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveGroupChatFrag.f46538D = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveGroupChatFrag.f46539E = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m160693b(LiveGroupChatFrag liveGroupChatFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162783p, viewGroup, false);
        m160692a(liveGroupChatFrag, viewInflate);
        return viewInflate;
    }
}
