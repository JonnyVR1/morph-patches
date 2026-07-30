package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MediaReorderCards extends VReorderCards<MediaReorderCard> {

    /* JADX INFO: renamed from: C */
    public boolean f824C;

    public MediaReorderCards(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo1153p() {
        return (VReorderCard) LayoutInflater.from(getContext()).inflate(n6c0.Y0, (ViewGroup) this, false);
    }

    public void setEnableLowPhotoValid(boolean z) {
        for (int i = 0; i < this.f893d; i++) {
            MediaReorderCard mediaReorderCardM1257h = m1257h(i);
            if (NullChecker.a(mediaReorderCardM1257h)) {
                mediaReorderCardM1257h.setEnableLowPhoto(z);
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
