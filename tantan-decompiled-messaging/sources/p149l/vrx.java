package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface vrx {
    /* JADX INFO: renamed from: a */
    boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: c */
    default boolean m199756c(Frag frag, NewAlbumMediaItemView newAlbumMediaItemView, Media media, MediaPickerParamsObject mediaPickerParamsObject, MediaWrapper mediaWrapper) {
        frag.startActivityForResult(vdc0.m197987a(frag.act(), mediaWrapper, mediaPickerParamsObject, media), 1);
        return true;
    }

    /* JADX INFO: renamed from: d */
    default boolean m199757d(Frag frag, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        return mo95873a(frag.act(), mediaWrapper, mediaPickerParamsObject);
    }

    /* JADX INFO: renamed from: b */
    default void mo96814b(Intent intent) {
    }

    /* JADX INFO: renamed from: e */
    default void mo177022e(int i, String str, Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: f */
    default void mo142779f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
    }
}
