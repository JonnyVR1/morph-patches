package com.p051p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.k8k0;
import p153l.n3d0;
import p153l.qa00;
import p153l.ynp0;

/* JADX INFO: loaded from: classes10.dex */
public class UserCardFamilyGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f54691d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54692e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54693f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f54694g;

    /* JADX INFO: renamed from: h */
    public VMarqueeText f54695h;

    /* JADX INFO: renamed from: i */
    public Animator f54696i;

    /* JADX INFO: renamed from: j */
    public int f54697j;

    public UserCardFamilyGroupView(Context context) {
        super(context);
        this.f54697j = qa00.m175859d(36.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79909h0(View view) {
        k8k0.m148712a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m79910i0() {
        it0.m142007A(this.f54696i);
    }

    /* JADX INFO: renamed from: j0 */
    public void m79911j0(BLiveUserFamilyCard bLiveUserFamilyCard) {
        bnl0.m105524M(this, true);
        it0.m142007A(this.f54696i);
        izs.m142868s("context_single_room", this.f54691d, bLiveUserFamilyCard.bgPic);
        this.f54694g.setText(bLiveUserFamilyCard.title);
        this.f54694g.setTextColor(n3d0.m161283g(bLiveUserFamilyCard.titleColor));
        this.f54695h.setText(bLiveUserFamilyCard.subTitle);
        this.f54695h.setTextColor(n3d0.m161283g(bLiveUserFamilyCard.subTitleColor));
        boolean zIsEmpty = TextUtils.isEmpty(bLiveUserFamilyCard.pic);
        VDraweeView vDraweeView = this.f54692e;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            this.f54692e.setAlpha(1.0f);
            this.f54692e.setTranslationX(0.0f);
            izs.m142868s("context_single_room", this.f54692e, bLiveUserFamilyCard.pic);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(bLiveUserFamilyCard.familyPic);
        VDraweeView vDraweeView2 = this.f54693f;
        if (zIsEmpty2) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            this.f54693f.setAlpha(1.0f);
            this.f54693f.setTranslationX(0.0f);
            izs.m142868s("context_single_room", this.f54693f, bLiveUserFamilyCard.familyPic);
        }
        if (TextUtils.isEmpty(bLiveUserFamilyCard.pic) || TextUtils.isEmpty(bLiveUserFamilyCard.familyPic)) {
            return;
        }
        this.f54693f.setAlpha(0.0f);
        this.f54693f.setTranslationX(qa00.m175859d(36.0f));
        m79912k0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m79912k0() {
        it0.m142007A(this.f54696i);
        VDraweeView vDraweeView = this.f54692e;
        float[] fArr = {0.0f, -this.f54697j};
        Property property = View.TRANSLATION_X;
        Animator animatorM132168n = gt0.m132168n(vDraweeView, property, fArr);
        Property property2 = View.ALPHA;
        Animator animatorM132180z = gt0.m132180z(animatorM132168n, gt0.m132168n(this.f54693f, property, this.f54697j, 0.0f), gt0.m132168n(this.f54692e, property2, 1.0f, 0.0f).setDuration(300L), gt0.m132168n(this.f54693f, property2, 0.0f, 1.0f));
        this.f54696i = animatorM132180z;
        animatorM132180z.setStartDelay(2500L);
        this.f54696i.setDuration(500L);
        this.f54696i.setInterpolator(new LinearInterpolator());
        this.f54696i.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79909h0(this);
        ynp0.m216936m(this, qa00.m175859d(16.0f));
    }

    public UserCardFamilyGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54697j = qa00.m175859d(36.0f);
    }

    public UserCardFamilyGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54697j = qa00.m175859d(36.0f);
    }
}
