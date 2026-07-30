package com.clevertap.android.sdk.inapp.media;

import android.view.View;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.zom;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/media/NoOpMediaHandler;", "Lcom/clevertap/android/sdk/inapp/media/InAppMediaHandler;", "<init>", "()V", "Landroid/widget/RelativeLayout;", "relativeLayout", "Ll/zom;", Constants.KEY_CONFIG, "Landroid/view/View$OnClickListener;", "clickListener", "", "setup", "(Landroid/widget/RelativeLayout;Ll/zom;Landroid/view/View$OnClickListener;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class NoOpMediaHandler implements InAppMediaHandler {

    @NotNull
    public static final NoOpMediaHandler INSTANCE = new NoOpMediaHandler();

    private NoOpMediaHandler() {
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void cleanup() {
        InAppMediaHandler.C1262b.m6519a(this);
    }

    @Override // com.clevertap.android.sdk.inapp.media.InAppMediaHandler
    public void setup(@Nullable RelativeLayout relativeLayout, @NotNull zom config, @Nullable View.OnClickListener clickListener) {
        config.getClass();
    }
}
