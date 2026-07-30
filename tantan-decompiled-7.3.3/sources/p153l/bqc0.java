package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p051p1.mobile.putong.core.newui.messages.RecommendNormalUserView;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;

/* JADX INFO: loaded from: classes10.dex */
public class bqc0 {
    /* JADX INFO: renamed from: a */
    public static void m105887a(RecommendNormalUserView recommendNormalUserView, View view) {
        recommendNormalUserView.f26022d = (RecommendNormalUserView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        recommendNormalUserView.f26023e = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        recommendNormalUserView.f26024f = (VFrame) viewGroup.getChildAt(1);
        recommendNormalUserView.f26025g = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        recommendNormalUserView.f26026h = (NewTalkProgressView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        recommendNormalUserView.f26027i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        recommendNormalUserView.f26028j = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        recommendNormalUserView.f26029k = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        recommendNormalUserView.f26030l = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        recommendNormalUserView.f26031m = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        recommendNormalUserView.f26032n = (VText_Bold) viewGroup.getChildAt(2);
    }
}
