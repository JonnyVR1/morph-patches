package com.p000p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import l.bt0;
import l.dt0;
import l.ezj0;
import l.hxs;
import l.kvc0;
import l.t100;
import l.uep0;
import l.xdl0;
import v.VDraweeView;
import v.VMarqueeText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UserCardFamilyGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f7449d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7450e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7451f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f7452g;

    /* JADX INFO: renamed from: h */
    public VMarqueeText f7453h;

    /* JADX INFO: renamed from: i */
    public Animator f7454i;

    /* JADX INFO: renamed from: j */
    public int f7455j;

    public UserCardFamilyGroupView(Context context) {
        super(context);
        this.f7455j = t100.d(36.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8942h0(View view) {
        ezj0.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8943i0() {
        dt0.A(this.f7454i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m8944j0(BLiveUserFamilyCard bLiveUserFamilyCard) {
        xdl0.M(this, true);
        dt0.A(this.f7454i);
        hxs.s("context_single_room", this.f7449d, bLiveUserFamilyCard.bgPic);
        this.f7452g.setText(bLiveUserFamilyCard.title);
        this.f7452g.setTextColor(kvc0.g(bLiveUserFamilyCard.titleColor));
        this.f7453h.setText(bLiveUserFamilyCard.subTitle);
        this.f7453h.setTextColor(kvc0.g(bLiveUserFamilyCard.subTitleColor));
        boolean zIsEmpty = TextUtils.isEmpty(bLiveUserFamilyCard.pic);
        VDraweeView vDraweeView = this.f7450e;
        if (zIsEmpty) {
            xdl0.M(vDraweeView, false);
        } else {
            xdl0.M(vDraweeView, true);
            this.f7450e.setAlpha(1.0f);
            this.f7450e.setTranslationX(0.0f);
            hxs.s("context_single_room", this.f7450e, bLiveUserFamilyCard.pic);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(bLiveUserFamilyCard.familyPic);
        VDraweeView vDraweeView2 = this.f7451f;
        if (zIsEmpty2) {
            xdl0.M(vDraweeView2, false);
        } else {
            xdl0.M(vDraweeView2, true);
            this.f7451f.setAlpha(1.0f);
            this.f7451f.setTranslationX(0.0f);
            hxs.s("context_single_room", this.f7451f, bLiveUserFamilyCard.familyPic);
        }
        if (TextUtils.isEmpty(bLiveUserFamilyCard.pic) || TextUtils.isEmpty(bLiveUserFamilyCard.familyPic)) {
            return;
        }
        this.f7451f.setAlpha(0.0f);
        this.f7451f.setTranslationX(t100.d(36.0f));
        m8945k0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8945k0() {
        dt0.A(this.f7454i);
        VDraweeView vDraweeView = this.f7450e;
        float[] fArr = {0.0f, -this.f7455j};
        Property property = View.TRANSLATION_X;
        Animator animatorN = bt0.n(vDraweeView, property, fArr);
        Property property2 = View.ALPHA;
        Animator animatorZ = bt0.z(new Animator[]{animatorN, bt0.n(this.f7451f, property, new float[]{this.f7455j, 0.0f}), bt0.n(this.f7450e, property2, new float[]{1.0f, 0.0f}).setDuration(300L), bt0.n(this.f7451f, property2, new float[]{0.0f, 1.0f})});
        this.f7454i = animatorZ;
        animatorZ.setStartDelay(2500L);
        this.f7454i.setDuration(500L);
        this.f7454i.setInterpolator(new LinearInterpolator());
        this.f7454i.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8942h0(this);
        uep0.m(this, t100.d(16.0f));
    }

    public UserCardFamilyGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7455j = t100.d(36.0f);
    }

    public UserCardFamilyGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7455j = t100.d(36.0f);
    }
}
