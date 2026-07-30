package com.p051p1.mobile.share_sdk.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class WebPageContent implements Content {
    private String summary;
    private String thumbBmpPath;
    private String title;
    private String url;

    public WebPageContent(@NonNull String str, @NonNull String str2, String str3, @Nullable String str4) {
        this.title = str;
        this.summary = str2;
        this.url = str3;
        this.thumbBmpPath = str4;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public File getFile() {
        return null;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public String getLargeBmpPath() {
        return null;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public String getSummary() {
        return this.summary;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public String getThumbBmpPath() {
        return this.thumbBmpPath;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public String getTitle() {
        return this.title;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public int getType() {
        return 3;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public String getURL() {
        return this.url;
    }
}
