package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileAudioItemView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class wv10 {
    /* JADX INFO: renamed from: a */
    public static void m205714a(MyRoomInProfileAudioItemView myRoomInProfileAudioItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileAudioItemView.f45959d = (VDraweeView) viewGroup.getChildAt(0);
        myRoomInProfileAudioItemView.f45960e = (VImage) viewGroup.getChildAt(2);
        myRoomInProfileAudioItemView.f45961f = (FrameLayout) viewGroup.getChildAt(3);
        myRoomInProfileAudioItemView.f45962g = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        myRoomInProfileAudioItemView.f45963h = (TextView) viewGroup.getChildAt(4);
        myRoomInProfileAudioItemView.f45964i = (TextView) viewGroup.getChildAt(5);
    }
}
