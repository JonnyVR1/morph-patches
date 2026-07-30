package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceCpItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jcn0 {
    /* JADX INFO: renamed from: a */
    public static void m144363a(VoiceCpItemView voiceCpItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCpItemView.f53930d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceCpItemView.f53931e = (VText) viewGroup.getChildAt(1);
        voiceCpItemView.f53932f = (SimpleDraweeView) viewGroup.getChildAt(2);
        voiceCpItemView.f53933g = (SimpleDraweeView) viewGroup.getChildAt(4);
        voiceCpItemView.f53934h = (TextView) viewGroup.getChildAt(5);
        voiceCpItemView.f53935i = (ImageView) viewGroup.getChildAt(6);
        voiceCpItemView.f53936j = (TextView) viewGroup.getChildAt(7);
    }
}
