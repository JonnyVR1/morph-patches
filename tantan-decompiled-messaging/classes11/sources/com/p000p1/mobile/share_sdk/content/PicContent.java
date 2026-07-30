package com.p000p1.mobile.share_sdk.content;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PicContent implements Content {
    private File file;
    private String largeBmpPath;

    public PicContent(@Nullable String str, @Nullable File file) {
        this.largeBmpPath = str;
        this.file = file;
    }

    @Override // com.p000p1.mobile.share_sdk.content.Content
    public File getFile() {
        return this.file;
    }

    @Override // com.p000p1.mobile.share_sdk.content.Content
    public String getLargeBmpPath() {
        return this.largeBmpPath;
    }

    @Override // com.p000p1.mobile.share_sdk.content.Content
    public String getSummary() {
        return null;
    }

    @Override // com.p000p1.mobile.share_sdk.content.Content
    public String getThumbBmpPath() {
        return null;
    }

    @Override // com.p000p1.mobile.share_sdk.content.Content
    public String getTitle() {
        return null;
    }

    @Override // com.p000p1.mobile.share_sdk.content.Content
    public int getType() {
        return 2;
    }

    @Override // com.p000p1.mobile.share_sdk.content.Content
    public String getURL() {
        return null;
    }

    public PicContent(@NonNull String str) {
        this(str, null);
    }
}
