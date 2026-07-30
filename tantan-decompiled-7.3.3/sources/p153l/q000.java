package p153l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.model.moment.MessageMomentExpandItemPlayView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class q000 {
    /* JADX INFO: renamed from: a */
    public static void m174642a(MessageMomentExpandItemPlayView messageMomentExpandItemPlayView, View view) {
        messageMomentExpandItemPlayView.f32891d = (MessageMomentExpandItemPlayView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMomentExpandItemPlayView.f32892e = (TextureView) viewGroup.getChildAt(0);
        messageMomentExpandItemPlayView.f32893f = (VDraweeView) viewGroup.getChildAt(1);
        messageMomentExpandItemPlayView.f32894g = (VImage) viewGroup.getChildAt(2);
        messageMomentExpandItemPlayView.f32895h = (VImage) viewGroup.getChildAt(3);
    }
}
