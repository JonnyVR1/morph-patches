package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FollowActionPopupView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class qti {
    /* JADX INFO: renamed from: a */
    public static void m176462a(FollowActionPopupView followActionPopupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        followActionPopupView.f40893a = (ImageView) viewGroup.getChildAt(1);
        followActionPopupView.f40894b = (VFrame) viewGroup.getChildAt(2);
        followActionPopupView.f40895c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        followActionPopupView.f40896d = (TextView) viewGroup.getChildAt(3);
        followActionPopupView.f40897e = (TextView) viewGroup.getChildAt(4);
        followActionPopupView.f40898f = (VButton) viewGroup.getChildAt(5);
    }
}
