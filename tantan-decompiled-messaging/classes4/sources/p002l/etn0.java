package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.voice.manager.VoiceLiveManagerInviteItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class etn0 {
    /* JADX INFO: renamed from: a */
    public static void m12698a(VoiceLiveManagerInviteItemView voiceLiveManagerInviteItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveManagerInviteItemView.d = viewGroup.getChildAt(0);
        voiceLiveManagerInviteItemView.e = viewGroup.getChildAt(1);
        voiceLiveManagerInviteItemView.f = (TextView) viewGroup.getChildAt(2);
        voiceLiveManagerInviteItemView.g = (TextView) viewGroup.getChildAt(3);
    }
}
