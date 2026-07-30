package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSuperLikeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ob90 {
    /* JADX INFO: renamed from: a */
    public static void m8436a(PrivilegeSuperLikeView privilegeSuperLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeSuperLikeView.a = viewGroup.getChildAt(0);
        privilegeSuperLikeView.b = viewGroup.getChildAt(1);
        privilegeSuperLikeView.c = (ImageView) viewGroup.getChildAt(2);
    }
}
