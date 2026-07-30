package com.clevertap.android.sdk.inapp.media;

import android.view.View;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.brm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/media/NoOpMediaHandler;", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "<init>", "()V", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/brm;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "", "setup", "(Landroid/widget/RelativeLayout;Ll/brm;Landroid/view/View$OnClickListener;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class NoOpMediaHandler implements InAppMediaHandler {

    @NotNull
    public static final NoOpMediaHandler INSTANCE = new NoOpMediaHandler();

    private NoOpMediaHandler() {
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void cleanup() {
        InAppMediaHandler.C1285b.m6573a(this);
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void setup(@Nullable RelativeLayout relativeLayout, @NotNull brm config, @Nullable View.OnClickListener clickListener) {
        config.getClass();
    }
}
