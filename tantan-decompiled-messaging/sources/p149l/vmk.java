package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.group.ChatGroupTags;
import com.p046p1.mobile.putong.core.newui.group.GroupSuggestItemView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.GroupAvatarView;
import p147v.VButton;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vmk {
    /* JADX INFO: renamed from: a */
    public static void m198951a(GroupSuggestItemView groupSuggestItemView, View view) {
        groupSuggestItemView.f21566a = (GroupSuggestItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        groupSuggestItemView.f21567b = (VLinear) viewGroup.getChildAt(0);
        groupSuggestItemView.f21568c = (GroupAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        groupSuggestItemView.f21569d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        groupSuggestItemView.f21570e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        groupSuggestItemView.f21571f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        groupSuggestItemView.f21572g = (ChatGroupTags) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        groupSuggestItemView.f21573h = (VButton) viewGroup.getChildAt(1);
    }
}
