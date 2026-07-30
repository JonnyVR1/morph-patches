package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards;
import l.f6c0;
import p002l.ijf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpEditProfileImageCardGroup extends VReorderCards<ExpEditProfileImageCard> {

    /* JADX INFO: renamed from: C */
    public ijf f963C;

    public ExpEditProfileImageCardGroup(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo1153p() {
        ExpEditProfileImageCard expEditProfileImageCard = (ExpEditProfileImageCard) LayoutInflater.from(getContext()).inflate(f6c0.w2, (ViewGroup) this, false);
        expEditProfileImageCard.setUploadDataCallback(this.f963C);
        return expEditProfileImageCard;
    }

    public void setUploadDataCallback(ijf ijfVar) {
        this.f963C = ijfVar;
    }

    public ExpEditProfileImageCardGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpEditProfileImageCardGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
