package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetUserItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class f3p0 {
    /* JADX INFO: renamed from: a */
    public static void m123772a(VoiceSweetUserItemView voiceSweetUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetUserItemView.f54479a = (VDraweeView) viewGroup.getChildAt(0);
        voiceSweetUserItemView.f54480b = (VText) viewGroup.getChildAt(1);
        voiceSweetUserItemView.f54481c = (LinearLayout) viewGroup.getChildAt(2);
        voiceSweetUserItemView.f54482d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        voiceSweetUserItemView.f54483e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        voiceSweetUserItemView.f54484f = (VDraweeView) viewGroup.getChildAt(3);
        voiceSweetUserItemView.f54485g = (VText) viewGroup.getChildAt(4);
    }
}
