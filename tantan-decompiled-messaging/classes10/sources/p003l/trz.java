package p003l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class trz {
    /* JADX INFO: renamed from: a */
    public static void m9617a(MessageMomentExpandItemPlayView messageMomentExpandItemPlayView, View view) {
        messageMomentExpandItemPlayView.d = (MessageMomentExpandItemPlayView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMomentExpandItemPlayView.e = (TextureView) viewGroup.getChildAt(0);
        messageMomentExpandItemPlayView.f = viewGroup.getChildAt(1);
        messageMomentExpandItemPlayView.g = viewGroup.getChildAt(2);
        messageMomentExpandItemPlayView.h = viewGroup.getChildAt(3);
    }
}
