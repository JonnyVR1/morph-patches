package p149l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.model.moment.MessageMomentExpandItemLivePhotoView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class orz {
    /* JADX INFO: renamed from: a */
    public static void m165683a(MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView, View view) {
        messageMomentExpandItemLivePhotoView.f32018d = (MessageMomentExpandItemLivePhotoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMomentExpandItemLivePhotoView.f32019e = (TextureView) viewGroup.getChildAt(0);
        messageMomentExpandItemLivePhotoView.f32020f = (VDraweeView) viewGroup.getChildAt(1);
        messageMomentExpandItemLivePhotoView.f32021g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        messageMomentExpandItemLivePhotoView.f32022h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        messageMomentExpandItemLivePhotoView.f32023i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
