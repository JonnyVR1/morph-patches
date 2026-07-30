package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.group.ChatGroupTags;
import com.p051p1.mobile.putong.core.newui.group.GroupSuggestItemView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.GroupAvatarView;
import p151v.VButton;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lpk {
    /* JADX INFO: renamed from: a */
    public static void m155255a(GroupSuggestItemView groupSuggestItemView, View view) {
        groupSuggestItemView.f22308a = (GroupSuggestItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        groupSuggestItemView.f22309b = (VLinear) viewGroup.getChildAt(0);
        groupSuggestItemView.f22310c = (GroupAvatarView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        groupSuggestItemView.f22311d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        groupSuggestItemView.f22312e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        groupSuggestItemView.f22313f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        groupSuggestItemView.f22314g = (ChatGroupTags) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        groupSuggestItemView.f22315h = (VButton) viewGroup.getChildAt(1);
    }
}
