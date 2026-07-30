package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.view.View;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import p149l.hf20;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostPageMediaItemRenderDecoration implements MediaItemRenderDecoration {
    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration
    public void afterItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, hf20 hf20Var, MediaPickerParamsObject mediaPickerParamsObject) {
        if (media instanceof Video) {
            if (!newAlbumMediaItemView.m79008b(media, hf20Var)) {
                clickable(newAlbumMediaItemView.f54042f, false);
                newAlbumMediaItemView.f54043g.setVisibility(8);
            } else {
                newAlbumMediaItemView.f54043g.setVisibility(0);
                clickable(newAlbumMediaItemView.f54042f, true);
                newAlbumMediaItemView.setChecked(true);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration
    public boolean beforeItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        return false;
    }

    public void clickable(View view, boolean z) {
        view.setClickable(z);
        view.setLongClickable(z);
    }
}
