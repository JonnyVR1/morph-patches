package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: id */
    public final String f7968id;

    public Id3Frame(String str) {
        this.f7968id = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f7968id;
    }
}
