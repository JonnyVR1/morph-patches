package com.p051p1.mobile.share_sdk.content;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class TextContent implements Content {
    public String summary;

    public TextContent(@NonNull String str) {
        this.summary = str;
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
        return null;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public String getTitle() {
        return null;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public int getType() {
        return 1;
    }

    @Override // com.p051p1.mobile.share_sdk.content.Content
    public String getURL() {
        return null;
    }
}
