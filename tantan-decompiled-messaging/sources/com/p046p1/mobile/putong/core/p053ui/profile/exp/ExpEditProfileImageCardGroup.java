package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards;
import p149l.f6c0;
import p149l.ijf;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditProfileImageCardGroup extends VReorderCards<ExpEditProfileImageCard> {

    /* JADX INFO: renamed from: C */
    public ijf f33141C;

    public ExpEditProfileImageCardGroup(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo50717p() {
        ExpEditProfileImageCard expEditProfileImageCard = (ExpEditProfileImageCard) LayoutInflater.from(getContext()).inflate(f6c0.f96058w2, (ViewGroup) this, false);
        expEditProfileImageCard.setUploadDataCallback(this.f33141C);
        return expEditProfileImageCard;
    }

    public void setUploadDataCallback(ijf ijfVar) {
        this.f33141C = ijfVar;
    }

    public ExpEditProfileImageCardGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpEditProfileImageCardGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
