package com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.decoration;

import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.putong.data.Media;
import java.io.Serializable;
import p009l.hf20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface MediaItemRenderDecoration extends Serializable {
    void afterItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, hf20 hf20Var, MediaPickerParamsObject mediaPickerParamsObject);

    boolean beforeItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject);
}
