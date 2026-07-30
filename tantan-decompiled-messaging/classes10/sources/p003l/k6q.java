package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemMarry;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k6q {
    /* JADX INFO: renamed from: a */
    public static void m7544a(ItemMarry itemMarry, View view) {
        itemMarry.a = (ItemMarry) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMarry.b = viewGroup.getChildAt(0);
        itemMarry.c = viewGroup.getChildAt(1);
    }
}
