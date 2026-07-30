package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceCpItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class f3n0 {
    /* JADX INFO: renamed from: a */
    public static void m119262a(VoiceCpItemView voiceCpItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceCpItemView.f53082d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        voiceCpItemView.f53083e = (VText) viewGroup.getChildAt(1);
        voiceCpItemView.f53084f = (SimpleDraweeView) viewGroup.getChildAt(2);
        voiceCpItemView.f53085g = (SimpleDraweeView) viewGroup.getChildAt(4);
        voiceCpItemView.f53086h = (TextView) viewGroup.getChildAt(5);
        voiceCpItemView.f53087i = (ImageView) viewGroup.getChildAt(6);
        voiceCpItemView.f53088j = (TextView) viewGroup.getChildAt(7);
    }
}
