package p153l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.model.moment.MessageMomentExpandItemLivePhotoView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class l000 {
    /* JADX INFO: renamed from: a */
    public static void m152241a(MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView, View view) {
        messageMomentExpandItemLivePhotoView.f32866d = (MessageMomentExpandItemLivePhotoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMomentExpandItemLivePhotoView.f32867e = (TextureView) viewGroup.getChildAt(0);
        messageMomentExpandItemLivePhotoView.f32868f = (VDraweeView) viewGroup.getChildAt(1);
        messageMomentExpandItemLivePhotoView.f32869g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        messageMomentExpandItemLivePhotoView.f32870h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        messageMomentExpandItemLivePhotoView.f32871i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
