package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p153l.sec0;

/* JADX INFO: loaded from: classes4.dex */
public class MediaReorderCards extends VReorderCards<MediaReorderCard> {

    /* JADX INFO: renamed from: C */
    public boolean f33850C;

    public MediaReorderCards(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo51900p() {
        return (VReorderCard) LayoutInflater.from(getContext()).inflate(sec0.f167548Y0, (ViewGroup) this, false);
    }

    public void setEnableLowPhotoValid(boolean z) {
        for (int i = 0; i < this.f33919d; i++) {
            MediaReorderCard mediaReorderCardM51994h = m51994h(i);
            if (NullChecker.m82486a(mediaReorderCardM51994h)) {
                mediaReorderCardM51994h.setEnableLowPhoto(z);
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
