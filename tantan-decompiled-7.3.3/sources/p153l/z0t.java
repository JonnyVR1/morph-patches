package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z0t {
    /* JADX INFO: renamed from: a */
    public static void m218151a(LiveInternalPushView liveInternalPushView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveInternalPushView.f22962c = (LinearLayout) viewGroup.getChildAt(0);
        liveInternalPushView.f22963d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveInternalPushView.f22964e = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveInternalPushView.f22965f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        liveInternalPushView.f22966g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        liveInternalPushView.f22967h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
        liveInternalPushView.f22968i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        liveInternalPushView.f22969j = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
