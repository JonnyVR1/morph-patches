package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n0o0 {
    /* JADX INFO: renamed from: a */
    public static void m18348a(VoiceMembersView voiceMembersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceMembersView.d = viewGroup.getChildAt(0);
        voiceMembersView.e = viewGroup.getChildAt(1);
        voiceMembersView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceMembersView.g = viewGroup.getChildAt(2);
        voiceMembersView.h = viewGroup.getChildAt(3);
    }
}
