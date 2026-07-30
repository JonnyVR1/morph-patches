package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p000p1.mobile.putong.live.livingroom.common.member.view.MemberWeekLeaderBoardContentView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sey {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m22410a(MemberWeekLeaderBoardContentView memberWeekLeaderBoardContentView, View view) {
        memberWeekLeaderBoardContentView.f5283d = (MemberWeekLeaderBoardContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberWeekLeaderBoardContentView.f5284e = (RadioGroup) viewGroup.getChildAt(0);
        memberWeekLeaderBoardContentView.f5285f = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memberWeekLeaderBoardContentView.f5286g = (RadioButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memberWeekLeaderBoardContentView.f5287h = viewGroup.getChildAt(1);
        memberWeekLeaderBoardContentView.f5288i = viewGroup.getChildAt(2);
        memberWeekLeaderBoardContentView.f5289j = view.findViewById(g5c0.f10991W4);
        ViewGroup viewGroup2 = (ViewGroup) view;
        memberWeekLeaderBoardContentView.f5290k = (FrameLayout) viewGroup2.getChildAt(3);
        memberWeekLeaderBoardContentView.f5291l = (LiveMemberItem) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(0);
    }
}
