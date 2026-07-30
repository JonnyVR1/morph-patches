package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileAudioItemView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class e420 {
    /* JADX INFO: renamed from: a */
    public static void m119338a(MyRoomInProfileAudioItemView myRoomInProfileAudioItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileAudioItemView.f46807d = (VDraweeView) viewGroup.getChildAt(0);
        myRoomInProfileAudioItemView.f46808e = (VImage) viewGroup.getChildAt(2);
        myRoomInProfileAudioItemView.f46809f = (FrameLayout) viewGroup.getChildAt(3);
        myRoomInProfileAudioItemView.f46810g = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        myRoomInProfileAudioItemView.f46811h = (TextView) viewGroup.getChildAt(4);
        myRoomInProfileAudioItemView.f46812i = (TextView) viewGroup.getChildAt(5);
    }
}
