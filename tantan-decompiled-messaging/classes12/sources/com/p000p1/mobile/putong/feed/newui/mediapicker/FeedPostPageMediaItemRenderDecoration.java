package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.view.View;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import l.hf20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostPageMediaItemRenderDecoration implements MediaItemRenderDecoration {
    public void afterItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, hf20 hf20Var, MediaPickerParamsObject mediaPickerParamsObject) {
        if (media instanceof Video) {
            if (!newAlbumMediaItemView.b(media, hf20Var)) {
                clickable(newAlbumMediaItemView.f, false);
                newAlbumMediaItemView.g.setVisibility(8);
            } else {
                newAlbumMediaItemView.g.setVisibility(0);
                clickable(newAlbumMediaItemView.f, true);
                newAlbumMediaItemView.setChecked(true);
            }
        }
    }

    public boolean beforeItemRender(NewAlbumMediaItemView newAlbumMediaItemView, Media media, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        return false;
    }

    public void clickable(View view, boolean z) {
        view.setClickable(z);
        view.setLongClickable(z);
    }
}
