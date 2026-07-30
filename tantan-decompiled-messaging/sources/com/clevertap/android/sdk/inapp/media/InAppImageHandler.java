package com.clevertap.android.sdk.inapp.media;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.apm;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppImageHandler;", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "media", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "<init>", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;)V", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/zom;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "", "setup", "(Landroid/widget/RelativeLayout;Ll/zom;Landroid/view/View$OnClickListener;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class InAppImageHandler implements InAppMediaHandler {

    @NotNull
    private final CTInAppNotificationMedia media;

    @NotNull
    private final FileResourceProvider resourceProvider;

    public InAppImageHandler(@NotNull CTInAppNotificationMedia cTInAppNotificationMedia, @NotNull FileResourceProvider fileResourceProvider) {
        cTInAppNotificationMedia.getClass();
        fileResourceProvider.getClass();
        this.media = cTInAppNotificationMedia;
        this.resourceProvider = fileResourceProvider;
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void cleanup() {
        InAppMediaHandler.C1262b.m6519a(this);
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void setup(@Nullable RelativeLayout relativeLayout, @NotNull zom config, @Nullable View.OnClickListener clickListener) {
        config.getClass();
        Bitmap bitmapM6496i = this.resourceProvider.m6496i(this.media.getMediaUrl());
        if (bitmapM6496i == null) {
            return;
        }
        ImageView imageView = relativeLayout != null ? (ImageView) relativeLayout.findViewById(config.getImageViewId()) : null;
        if (imageView != null) {
            apm.m98143a(imageView, this.media.getContentDescription());
        }
        if (imageView != null) {
            imageView.setImageBitmap(bitmapM6496i);
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (!config.getClickableMedia() || clickListener == null) {
            return;
        }
        if (imageView != null) {
            imageView.setTag(0);
        }
        if (imageView != null) {
            imageView.setOnClickListener(clickListener);
        }
    }
}
