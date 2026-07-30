package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeSuperLikeView;
import p147v.AutoVDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ob90 {
    /* JADX INFO: renamed from: a */
    public static void m163412a(PrivilegeSuperLikeView privilegeSuperLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeSuperLikeView.f35105a = (AutoVDraweeView) viewGroup.getChildAt(0);
        privilegeSuperLikeView.f35106b = (AutoVDraweeView) viewGroup.getChildAt(1);
        privilegeSuperLikeView.f35107c = (ImageView) viewGroup.getChildAt(2);
    }
}
