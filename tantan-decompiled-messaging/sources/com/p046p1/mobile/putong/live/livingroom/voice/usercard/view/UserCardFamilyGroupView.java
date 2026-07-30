package com.p046p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p149l.bt0;
import p149l.dt0;
import p149l.ezj0;
import p149l.hxs;
import p149l.kvc0;
import p149l.t100;
import p149l.uep0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class UserCardFamilyGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53843d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53844e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53845f;

    /* JADX INFO: renamed from: g */
    public VMarqueeText f53846g;

    /* JADX INFO: renamed from: h */
    public VMarqueeText f53847h;

    /* JADX INFO: renamed from: i */
    public Animator f53848i;

    /* JADX INFO: renamed from: j */
    public int f53849j;

    public UserCardFamilyGroupView(Context context) {
        super(context);
        this.f53849j = t100.m186890d(36.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78726h0(View view) {
        ezj0.m118981a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78727i0() {
        dt0.m113501A(this.f53848i);
    }

    /* JADX INFO: renamed from: j0 */
    public void m78728j0(BLiveUserFamilyCard bLiveUserFamilyCard) {
        xdl0.m208344M(this, true);
        dt0.m113501A(this.f53848i);
        hxs.m133406s("context_single_room", this.f53843d, bLiveUserFamilyCard.bgPic);
        this.f53846g.setText(bLiveUserFamilyCard.title);
        this.f53846g.setTextColor(kvc0.m147358g(bLiveUserFamilyCard.titleColor));
        this.f53847h.setText(bLiveUserFamilyCard.subTitle);
        this.f53847h.setTextColor(kvc0.m147358g(bLiveUserFamilyCard.subTitleColor));
        boolean zIsEmpty = TextUtils.isEmpty(bLiveUserFamilyCard.pic);
        VDraweeView vDraweeView = this.f53844e;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            this.f53844e.setAlpha(1.0f);
            this.f53844e.setTranslationX(0.0f);
            hxs.m133406s("context_single_room", this.f53844e, bLiveUserFamilyCard.pic);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(bLiveUserFamilyCard.familyPic);
        VDraweeView vDraweeView2 = this.f53845f;
        if (zIsEmpty2) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            this.f53845f.setAlpha(1.0f);
            this.f53845f.setTranslationX(0.0f);
            hxs.m133406s("context_single_room", this.f53845f, bLiveUserFamilyCard.familyPic);
        }
        if (TextUtils.isEmpty(bLiveUserFamilyCard.pic) || TextUtils.isEmpty(bLiveUserFamilyCard.familyPic)) {
            return;
        }
        this.f53845f.setAlpha(0.0f);
        this.f53845f.setTranslationX(t100.m186890d(36.0f));
        m78729k0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78729k0() {
        dt0.m113501A(this.f53848i);
        VDraweeView vDraweeView = this.f53844e;
        float[] fArr = {0.0f, -this.f53849j};
        Property property = View.TRANSLATION_X;
        Animator animatorM103741n = bt0.m103741n(vDraweeView, property, fArr);
        Property property2 = View.ALPHA;
        Animator animatorM103753z = bt0.m103753z(animatorM103741n, bt0.m103741n(this.f53845f, property, this.f53849j, 0.0f), bt0.m103741n(this.f53844e, property2, 1.0f, 0.0f).setDuration(300L), bt0.m103741n(this.f53845f, property2, 0.0f, 1.0f));
        this.f53848i = animatorM103753z;
        animatorM103753z.setStartDelay(2500L);
        this.f53848i.setDuration(500L);
        this.f53848i.setInterpolator(new LinearInterpolator());
        this.f53848i.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78726h0(this);
        uep0.m193326m(this, t100.m186890d(16.0f));
    }

    public UserCardFamilyGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53849j = t100.m186890d(36.0f);
    }

    public UserCardFamilyGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53849j = t100.m186890d(36.0f);
    }
}
