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
import p153l.brm;
import p153l.crm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppImageHandler;", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "media", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "<init>", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;)V", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/brm;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "", "setup", "(Landroid/widget/RelativeLayout;Ll/brm;Landroid/view/View$OnClickListener;)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
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
        InAppMediaHandler.C1285b.m6573a(this);
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void setup(@Nullable RelativeLayout relativeLayout, @NotNull brm config, @Nullable View.OnClickListener clickListener) {
        config.getClass();
        Bitmap bitmapM6550i = this.resourceProvider.m6550i(this.media.getMediaUrl());
        if (bitmapM6550i == null) {
            return;
        }
        ImageView imageView = relativeLayout != null ? (ImageView) relativeLayout.findViewById(config.getImageViewId()) : null;
        if (imageView != null) {
            crm.m112083a(imageView, this.media.getContentDescription());
        }
        if (imageView != null) {
            imageView.setImageBitmap(bitmapM6550i);
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
