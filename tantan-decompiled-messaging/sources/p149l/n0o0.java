package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class n0o0 {
    /* JADX INFO: renamed from: a */
    public static void m157285a(VoiceMembersView voiceMembersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMembersView.f52827d = viewGroup.getChildAt(0);
        voiceMembersView.f52828e = (VLinear) viewGroup.getChildAt(1);
        voiceMembersView.f52829f = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceMembersView.f52830g = (VText) viewGroup.getChildAt(2);
        voiceMembersView.f52831h = (VText) viewGroup.getChildAt(3);
    }
}
