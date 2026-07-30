package p003l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class orz {
    /* JADX INFO: renamed from: a */
    public static void m8584a(MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView, View view) {
        messageMomentExpandItemLivePhotoView.d = (MessageMomentExpandItemLivePhotoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMomentExpandItemLivePhotoView.e = (TextureView) viewGroup.getChildAt(0);
        messageMomentExpandItemLivePhotoView.f = viewGroup.getChildAt(1);
        messageMomentExpandItemLivePhotoView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        messageMomentExpandItemLivePhotoView.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        messageMomentExpandItemLivePhotoView.i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
