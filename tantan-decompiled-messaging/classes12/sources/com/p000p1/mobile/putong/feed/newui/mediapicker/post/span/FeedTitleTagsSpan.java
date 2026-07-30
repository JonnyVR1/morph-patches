package com.p000p1.mobile.putong.feed.newui.mediapicker.post.span;

import android.os.Parcel;
import android.text.NoCopySpan;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedTitleTagsSpan extends ForegroundColorSpan implements NoCopySpan {
    public String titleTag;

    public FeedTitleTagsSpan(int i, String str) {
        super(i);
        this.titleTag = str;
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.titleTag);
    }
}
