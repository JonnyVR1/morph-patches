package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards;
import p153l.kec0;
import p153l.okf;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditProfileImageCardGroup extends VReorderCards<ExpEditProfileImageCard> {

    /* JADX INFO: renamed from: C */
    public okf f33989C;

    public ExpEditProfileImageCardGroup(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards
    /* JADX INFO: renamed from: p */
    public VReorderCard mo51900p() {
        ExpEditProfileImageCard expEditProfileImageCard = (ExpEditProfileImageCard) LayoutInflater.from(getContext()).inflate(kec0.f126112w2, (ViewGroup) this, false);
        expEditProfileImageCard.setUploadDataCallback(this.f33989C);
        return expEditProfileImageCard;
    }

    public void setUploadDataCallback(okf okfVar) {
        this.f33989C = okfVar;
    }

    public ExpEditProfileImageCardGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpEditProfileImageCardGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
