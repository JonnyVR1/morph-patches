package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration;

import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.io.Serializable;
import p153l.rn20;

/* JADX INFO: loaded from: classes10.dex */
public interface MediaItemRenderDecoration extends Serializable {
    void afterItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, rn20 rn20Var, MediaPickerParamsObject mediaPickerParamsObject);

    boolean beforeItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject);
}
