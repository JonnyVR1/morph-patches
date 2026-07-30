package p149l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.model.moment.MessageMomentExpandItemPlayView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class trz {
    /* JADX INFO: renamed from: a */
    public static void m190467a(MessageMomentExpandItemPlayView messageMomentExpandItemPlayView, View view) {
        messageMomentExpandItemPlayView.f32043d = (MessageMomentExpandItemPlayView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMomentExpandItemPlayView.f32044e = (TextureView) viewGroup.getChildAt(0);
        messageMomentExpandItemPlayView.f32045f = (VDraweeView) viewGroup.getChildAt(1);
        messageMomentExpandItemPlayView.f32046g = (VImage) viewGroup.getChildAt(2);
        messageMomentExpandItemPlayView.f32047h = (VImage) viewGroup.getChildAt(3);
    }
}
