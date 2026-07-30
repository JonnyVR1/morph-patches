package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface s0y {
    /* JADX INFO: renamed from: a */
    boolean mo99892a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: c */
    default boolean m183991c(Frag frag, NewAlbumMediaItemView newAlbumMediaItemView, Media media, MediaPickerParamsObject mediaPickerParamsObject, MediaWrapper mediaWrapper) {
        frag.startActivityForResult(cmc0.m111161a(frag.act(), mediaWrapper, mediaPickerParamsObject, media), 1);
        return true;
    }

    /* JADX INFO: renamed from: d */
    default boolean m183992d(Frag frag, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        return mo99892a(frag.act(), mediaWrapper, mediaPickerParamsObject);
    }

    /* JADX INFO: renamed from: b */
    default void mo172491b(Intent intent) {
    }

    /* JADX INFO: renamed from: e */
    default void mo174342e(int i, String str, Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: f */
    default void mo99893f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
    }
}
