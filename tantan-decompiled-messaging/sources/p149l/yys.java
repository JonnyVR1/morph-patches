package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yys {
    /* JADX INFO: renamed from: a */
    public static void m216562a(LiveInternalPushView liveInternalPushView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInternalPushView.f22220c = (LinearLayout) viewGroup.getChildAt(0);
        liveInternalPushView.f22221d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInternalPushView.f22222e = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveInternalPushView.f22223f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveInternalPushView.f22224g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        liveInternalPushView.f22225h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        liveInternalPushView.f22226i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveInternalPushView.f22227j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
