package p009l;

import android.content.Intent;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.Media;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface vrx {
    /* JADX INFO: renamed from: a */
    boolean m23703a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: c */
    default boolean m23705c(Frag frag, NewAlbumMediaItemView newAlbumMediaItemView, Media media, MediaPickerParamsObject mediaPickerParamsObject, MediaWrapper mediaWrapper) {
        frag.startActivityForResult(vdc0.m23356a(frag.act(), mediaWrapper, mediaPickerParamsObject, media), 1);
        return true;
    }

    /* JADX INFO: renamed from: d */
    default boolean m23706d(Frag frag, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        return m23703a(frag.act(), mediaWrapper, mediaPickerParamsObject);
    }

    /* JADX INFO: renamed from: b */
    default void m23704b(Intent intent) {
    }

    /* JADX INFO: renamed from: e */
    default void m23707e(int i, String str, Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: f */
    default void m23708f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
    }
}
