package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.member.view.MemberLeaderView;
import p151v.VButton;
import p151v.VLinear;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class xiy {
    /* JADX INFO: renamed from: a */
    public static void m211179a(MemberLeaderView memberLeaderView, View view) {
        memberLeaderView.f50084a = (MemberLeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        memberLeaderView.f50085b = (VRecyclerView) viewGroup.getChildAt(0);
        memberLeaderView.f50086c = (VLinear) viewGroup.getChildAt(1);
        memberLeaderView.f50087d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
