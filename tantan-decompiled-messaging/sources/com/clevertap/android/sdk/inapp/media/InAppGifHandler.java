package com.clevertap.android.sdk.inapp.media;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.gif.GifImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.apm;
import p149l.jcr;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/media/InAppGifHandler;", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "media", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "<init>", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;)V", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/zom;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "", "setup", "(Landroid/widget/RelativeLayout;Ll/zom;Landroid/view/View$OnClickListener;)V", "Ll/jcr;", Owner.TYPE, "onStart", "(Ll/jcr;)V", "onStop", "cleanup", "()V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "Lcom/clevertap/android/sdk/gif/GifImageView;", "gifImageView", "Lcom/clevertap/android/sdk/gif/GifImageView;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class InAppGifHandler implements InAppMediaHandler {

    @Nullable
    private GifImageView gifImageView;

    @NotNull
    private final CTInAppNotificationMedia media;

    @NotNull
    private final FileResourceProvider resourceProvider;

    public InAppGifHandler(@NotNull CTInAppNotificationMedia cTInAppNotificationMedia, @NotNull FileResourceProvider fileResourceProvider) {
        cTInAppNotificationMedia.getClass();
        fileResourceProvider.getClass();
        this.media = cTInAppNotificationMedia;
        this.resourceProvider = fileResourceProvider;
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void cleanup() {
        GifImageView gifImageView = this.gifImageView;
        if (gifImageView != null) {
            gifImageView.m6048k();
        }
        this.gifImageView = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull jcr owner) {
        owner.getClass();
        GifImageView gifImageView = this.gifImageView;
        if (gifImageView != null) {
            gifImageView.setBytes(this.resourceProvider.m6495h(this.media.getMediaUrl()));
            gifImageView.m6050m();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull jcr owner) {
        owner.getClass();
        GifImageView gifImageView = this.gifImageView;
        if (gifImageView != null) {
            gifImageView.m6048k();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void setup(@Nullable RelativeLayout relativeLayout, @NotNull zom config, @Nullable View.OnClickListener clickListener) {
        byte[] bArrM6495h;
        ImageView imageView;
        config.getClass();
        if (config.getGifImageId() == 0 || (bArrM6495h = this.resourceProvider.m6495h(this.media.getMediaUrl())) == null) {
            return;
        }
        GifImageView gifImageView = relativeLayout != null ? (GifImageView) relativeLayout.findViewById(config.getGifImageId()) : null;
        this.gifImageView = gifImageView;
        if (gifImageView != null) {
            apm.m98143a(gifImageView, this.media.getContentDescription());
        }
        GifImageView gifImageView2 = this.gifImageView;
        if (gifImageView2 != null) {
            gifImageView2.setVisibility(0);
        }
        GifImageView gifImageView3 = this.gifImageView;
        if (gifImageView3 != null) {
            gifImageView3.setBytes(bArrM6495h);
        }
        GifImageView gifImageView4 = this.gifImageView;
        if (gifImageView4 != null) {
            gifImageView4.m6050m();
        }
        if (config.getClickableMedia() && clickListener != null) {
            GifImageView gifImageView5 = this.gifImageView;
            if (gifImageView5 != null) {
                gifImageView5.setTag(0);
            }
            GifImageView gifImageView6 = this.gifImageView;
            if (gifImageView6 != null) {
                gifImageView6.setOnClickListener(clickListener);
            }
        }
        if (relativeLayout == null || (imageView = (ImageView) relativeLayout.findViewById(config.getImageViewId())) == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
