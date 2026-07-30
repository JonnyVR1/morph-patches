package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.itemview.ConversationItemGroupSubTitleView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ea6 {
    /* JADX INFO: renamed from: a */
    public static void m120036a(ConversationItemGroupSubTitleView conversationItemGroupSubTitleView, View view) {
        conversationItemGroupSubTitleView.f26557a = (ConversationItemGroupSubTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemGroupSubTitleView.f26558b = (VText) viewGroup.getChildAt(0);
        conversationItemGroupSubTitleView.f26559c = (VImage) viewGroup.getChildAt(1);
        conversationItemGroupSubTitleView.f26560d = viewGroup.getChildAt(2);
        conversationItemGroupSubTitleView.f26561e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
