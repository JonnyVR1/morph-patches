package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p149l.n6c0;

/* JADX INFO: loaded from: classes4.dex */
public class MediaReorderCards extends VReorderCards<MediaReorderCard> {

    /* JADX INFO: renamed from: C */
    public boolean f33002C;

    public MediaReorderCards(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo50717p() {
        return (VReorderCard) LayoutInflater.from(getContext()).inflate(n6c0.f137334Y0, (ViewGroup) this, false);
    }

    public void setEnableLowPhotoValid(boolean z) {
        for (int i = 0; i < this.f33071d; i++) {
            MediaReorderCard mediaReorderCardM50811h = m50811h(i);
            if (NullChecker.m81303a(mediaReorderCardM50811h)) {
                mediaReorderCardM50811h.setEnableLowPhoto(z);
            }
        }
    }

    public MediaReorderCards(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaReorderCards(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
