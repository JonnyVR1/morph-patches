package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p046p1.mobile.putong.core.newui.messages.RecommendNormalUserView;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class uhc0 {
    /* JADX INFO: renamed from: a */
    public static void m193704a(RecommendNormalUserView recommendNormalUserView, View view) {
        recommendNormalUserView.f25280d = (RecommendNormalUserView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        recommendNormalUserView.f25281e = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        recommendNormalUserView.f25282f = (VFrame) viewGroup.getChildAt(1);
        recommendNormalUserView.f25283g = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        recommendNormalUserView.f25284h = (NewTalkProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        recommendNormalUserView.f25285i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        recommendNormalUserView.f25286j = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        recommendNormalUserView.f25287k = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        recommendNormalUserView.f25288l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        recommendNormalUserView.f25289m = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        recommendNormalUserView.f25290n = (VText_Bold) viewGroup.getChildAt(2);
    }
}
