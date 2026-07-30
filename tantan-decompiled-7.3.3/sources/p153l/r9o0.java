package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r9o0 {
    /* JADX INFO: renamed from: a */
    public static void m180622a(VoiceMembersView voiceMembersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMembersView.f53675d = viewGroup.getChildAt(0);
        voiceMembersView.f53676e = (VLinear) viewGroup.getChildAt(1);
        voiceMembersView.f53677f = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceMembersView.f53678g = (VText) viewGroup.getChildAt(2);
        voiceMembersView.f53679h = (VText) viewGroup.getChildAt(3);
    }
}
