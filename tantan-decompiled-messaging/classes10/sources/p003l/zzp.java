package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemAddTagsGuide;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zzp {
    /* JADX INFO: renamed from: a */
    public static void m11464a(ItemAddTagsGuide itemAddTagsGuide, View view) {
        itemAddTagsGuide.a = (ItemAddTagsGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemAddTagsGuide.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemAddTagsGuide.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemAddTagsGuide.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemAddTagsGuide.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        itemAddTagsGuide.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
