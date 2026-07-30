package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.view.View;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import p153l.rn20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostPageMediaItemRenderDecoration implements MediaItemRenderDecoration {
    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration
    public void afterItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, rn20 rn20Var, MediaPickerParamsObject mediaPickerParamsObject) {
        if (media instanceof Video) {
            if (!newAlbumMediaItemView.m80191b(media, rn20Var)) {
                clickable(newAlbumMediaItemView.f54890f, false);
                newAlbumMediaItemView.f54891g.setVisibility(8);
            } else {
                newAlbumMediaItemView.f54891g.setVisibility(0);
                clickable(newAlbumMediaItemView.f54890f, true);
                newAlbumMediaItemView.setChecked(true);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration
    public boolean beforeItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        return false;
    }

    public void clickable(View view, boolean z) {
        view.setClickable(z);
        view.setLongClickable(z);
    }
}
