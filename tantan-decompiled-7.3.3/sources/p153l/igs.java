package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class igs {
    /* JADX INFO: renamed from: a */
    public static void m139951a(LiveGenderMedalView liveGenderMedalView, View view) {
        liveGenderMedalView._root = (LiveGenderMedalView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveGenderMedalView._gender = (VImage) viewGroup.getChildAt(0);
        liveGenderMedalView._age = (VText) viewGroup.getChildAt(1);
    }
}
