package com.p051p1.mobile.putong.core.newui.femalevip;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.femalevip.FemaleVerificationGuideCardView;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.of7;
import p153l.pei;
import p153l.qa00;
import p153l.sei;
import p153l.uqb0;
import p153l.wlj;
import p153l.xlj;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class FemaleVerificationGuideCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public FemaleVerificationGuideCardView f22204a;

    /* JADX INFO: renamed from: b */
    public VImage f22205b;

    /* JADX INFO: renamed from: c */
    public VText f22206c;

    /* JADX INFO: renamed from: d */
    public VText f22207d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f22208e;

    /* JADX INFO: renamed from: f */
    public AppCompatTextView f22209f;

    /* JADX INFO: renamed from: g */
    public VText f22210g;

    /* JADX INFO: renamed from: h */
    public VText f22211h;

    /* JADX INFO: renamed from: i */
    @DrawableRes
    public int f22212i;

    /* JADX INFO: renamed from: j */
    public boolean f22213j;

    public FemaleVerificationGuideCardView(@NonNull Context context) {
        super(context);
        this.f22212i = dbc0.f86910d2;
        this.f22213j = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m37448b(NewNewHomeFrag newNewHomeFrag, View view) {
        i4g0.m138520r("e_trial_end_buy_svip", "p_suggest_users_home_view");
        C8927c.m54687x0(newNewHomeFrag.act(), "p_home,verification_card", Privilege.advanced_filter);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m37449e(NewNewHomeFrag newNewHomeFrag, View view) {
        i4g0.m138520r("e_trial_end_go_verify", "p_suggest_users_home_view");
        newNewHomeFrag.act().startActivity(VerificationCenterAct.m57175Z1(newNewHomeFrag.act(), false, "button"));
    }

    /* JADX INFO: renamed from: f */
    public final void m37450f(View view) {
        sei.m185544a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0b58  */
    /* JADX INFO: renamed from: h */
    public void m37451h(final NewNewHomeFrag newNewHomeFrag, pei peiVar, List<CoreJustVerificationCardApi.C4869a> list) {
        String str;
        float f;
        float f2;
        float f3;
        float f4;
        List<CoreJustVerificationCardApi.C4869a> listSubList = list;
        if (newNewHomeFrag == null || peiVar == null || jyb.m147479J(listSubList) || !this.f22213j) {
            return;
        }
        this.f22213j = false;
        int size = listSubList.size();
        int i = 1;
        this.f22206c.setTypeface(Typeface.defaultFromStyle(1));
        this.f22210g.setTypeface(Typeface.defaultFromStyle(1));
        this.f22210g.setText(of7.m167422s() ? "认证审核中" : "去认证");
        this.f22209f.setTypeface(Typeface.defaultFromStyle(1));
        this.f22208e.setVisibility(0);
        this.f22207d.setText(String.format("你喜欢了%d位头像已认证的用户", Integer.valueOf(size)));
        if (size == 1) {
            str = listSubList.get(0).f19973a.isFemale() ? "她" : "他";
        } else {
            boolean z = false;
            boolean z2 = false;
            for (int i2 = 0; i2 < listSubList.size(); i2++) {
                if (listSubList.get(i2).f19973a.isFemale()) {
                    z2 = true;
                } else {
                    z = true;
                }
            }
            str = "他们";
            if ((!z || !z2) && !z) {
                str = z2 ? "她们" : "";
            }
        }
        this.f22209f.setText(String.format("完成认证或开通SVIP\n向%s发出喜欢\n并可继续使用“只看认证用户”功能", str));
        float f5 = getResources().getDisplayMetrics().density;
        float f6 = 120.0f;
        float f7 = 10.0f;
        float f8 = 34.0f;
        int i3 = 17;
        float f9 = 13.0f;
        if (size == 1) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8319s(qa00.m175859d(13.0f));
            wlj wljVarM211638a = new xlj(getContext().getResources()).m211638a();
            wljVarM211638a.m207045H(roundingParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(120.0f), qa00.m175859d(160.0f));
            layoutParams.gravity = 17;
            User user = listSubList.get(0).f19973a;
            if (user != null) {
                VDraweeView vDraweeView = new VDraweeView(newNewHomeFrag.act());
                vDraweeView.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
                vDraweeView.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87394rr));
                vDraweeView.setHierarchy(wljVarM211638a);
                uqb0.f180374G.m127115L0(vDraweeView, user.m61308fp().cover().profileMiddle().formatted());
                this.f22208e.addView(vDraweeView, layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(qa00.m175859d(34.0f), qa00.m175859d(34.0f));
                layoutParams2.gravity = 81;
                layoutParams2.bottomMargin = qa00.m175859d(10.0f);
                ImageView imageView = new ImageView(newNewHomeFrag.act());
                imageView.setImageResource(this.f22212i);
                imageView.setTranslationX(f5 * 33.0f);
                this.f22208e.addView(imageView, layoutParams2);
                this.f22208e.setRotation(5.0f);
            }
        } else {
            float f10 = -5.0f;
            int i4 = 2;
            if (size == 2) {
                int i5 = 0;
                while (i5 < size) {
                    User user2 = listSubList.get(i5).f19973a;
                    if (user2 != null) {
                        f2 = f6;
                        VDraweeView vDraweeView2 = new VDraweeView(newNewHomeFrag.act());
                        RoundingParams roundingParams2 = new RoundingParams();
                        f3 = f7;
                        roundingParams2.m8319s(qa00.m175859d(f9));
                        f4 = f8;
                        wlj wljVarM211638a2 = new xlj(getContext().getResources()).m211638a();
                        wljVarM211638a2.m207045H(roundingParams2);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(qa00.m175859d(f2), qa00.m175859d(160.0f));
                        layoutParams3.gravity = i3;
                        vDraweeView2.setHierarchy(wljVarM211638a2);
                        vDraweeView2.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
                        vDraweeView2.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87394rr));
                        if (i5 == 0) {
                            vDraweeView2.setRotation(f10);
                            vDraweeView2.setTranslationX((-48.0f) * f5);
                            this.f22208e.addView(vDraweeView2, layoutParams3);
                        } else {
                            FrameLayout frameLayout = new FrameLayout(newNewHomeFrag.act());
                            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(qa00.m175859d(f2), qa00.m175859d(160.0f));
                            layoutParams4.gravity = i3;
                            ImageView imageView2 = new ImageView(newNewHomeFrag.act());
                            imageView2.setImageResource(this.f22212i);
                            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(qa00.m175859d(f4), qa00.m175859d(f4));
                            layoutParams5.bottomMargin = qa00.m175859d(f3);
                            layoutParams5.rightMargin = qa00.m175859d(f3);
                            layoutParams5.gravity = BadgeDrawable.BOTTOM_END;
                            frameLayout.addView(vDraweeView2, layoutParams3);
                            frameLayout.addView(imageView2, layoutParams5);
                            frameLayout.setRotation(5.0f);
                            frameLayout.setTranslationX(48.0f * f5);
                            this.f22208e.addView(frameLayout, layoutParams4);
                        }
                        uqb0.f180374G.m127115L0(vDraweeView2, user2.m61308fp().cover().profileMiddle().formatted());
                    } else {
                        f2 = f6;
                        f3 = f7;
                        f4 = f8;
                    }
                    i5++;
                    f6 = f2;
                    f7 = f3;
                    f8 = f4;
                    f9 = f9;
                    f10 = -5.0f;
                    i3 = 17;
                }
            } else {
                float f11 = 146.0f;
                float f12 = 110.0f;
                int i6 = 3;
                if (size == 3) {
                    int i7 = 0;
                    while (i7 < size) {
                        User user3 = listSubList.get(i7).f19973a;
                        if (user3 != null) {
                            VDraweeView vDraweeView3 = new VDraweeView(newNewHomeFrag.act());
                            vDraweeView3.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
                            vDraweeView3.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87394rr));
                            RoundingParams roundingParams3 = new RoundingParams();
                            roundingParams3.m8319s(qa00.m175859d(13.0f));
                            wlj wljVarM211638a3 = new xlj(getContext().getResources()).m211638a();
                            wljVarM211638a3.m207045H(roundingParams3);
                            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(qa00.m175859d(f12), qa00.m175859d(f11));
                            layoutParams6.gravity = 17;
                            vDraweeView3.setHierarchy(wljVarM211638a3);
                            if (i7 == 0) {
                                vDraweeView3.setRotation(-5.0f);
                                vDraweeView3.setTranslationX((-76.0f) * f5);
                                this.f22208e.addView(vDraweeView3, layoutParams6);
                            } else {
                                if (i7 == i) {
                                    vDraweeView3.setTranslationY((-8.0f) * f5);
                                    this.f22208e.addView(vDraweeView3, layoutParams6);
                                } else {
                                    FrameLayout frameLayout2 = new FrameLayout(newNewHomeFrag.act());
                                    f = f11;
                                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(qa00.m175859d(f12), qa00.m175859d(f));
                                    layoutParams7.gravity = 17;
                                    ImageView imageView3 = new ImageView(newNewHomeFrag.act());
                                    imageView3.setImageResource(this.f22212i);
                                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(qa00.m175859d(34.0f), qa00.m175859d(34.0f));
                                    layoutParams8.bottomMargin = qa00.m175859d(10.0f);
                                    layoutParams8.rightMargin = qa00.m175859d(10.0f);
                                    layoutParams8.gravity = BadgeDrawable.BOTTOM_END;
                                    frameLayout2.addView(vDraweeView3, layoutParams6);
                                    frameLayout2.addView(imageView3, layoutParams8);
                                    frameLayout2.setRotation(5.0f);
                                    frameLayout2.setTranslationX(76.0f * f5);
                                    this.f22208e.addView(frameLayout2, layoutParams7);
                                }
                                uqb0.f180374G.m127115L0(vDraweeView3, user3.m61308fp().cover().profileMiddle().formatted());
                            }
                            f = f11;
                            uqb0.f180374G.m127115L0(vDraweeView3, user3.m61308fp().cover().profileMiddle().formatted());
                        } else {
                            f = f11;
                            f12 = f12;
                        }
                        i7++;
                        f11 = f;
                        f12 = f12;
                        i = 1;
                    }
                } else if (size == 4) {
                    int i8 = 0;
                    while (i8 < size) {
                        User user4 = listSubList.get(i8).f19973a;
                        if (user4 != null) {
                            VDraweeView vDraweeView4 = new VDraweeView(newNewHomeFrag.act());
                            RoundingParams roundingParams4 = new RoundingParams();
                            roundingParams4.m8319s(qa00.m175859d(13.0f));
                            wlj wljVarM211638a4 = new xlj(getContext().getResources()).m211638a();
                            wljVarM211638a4.m207045H(roundingParams4);
                            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(qa00.m175859d(110.0f), qa00.m175859d(146.0f));
                            layoutParams9.gravity = 17;
                            vDraweeView4.setHierarchy(wljVarM211638a4);
                            vDraweeView4.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
                            vDraweeView4.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87394rr));
                            uqb0.f180374G.m127115L0(vDraweeView4, user4.m61308fp().cover().profileMiddle().formatted());
                            if (i8 == 0) {
                                vDraweeView4.setRotation(-15.0f);
                                vDraweeView4.setTranslationX((-90.0f) * f5);
                                this.f22208e.addView(vDraweeView4, layoutParams9);
                            } else if (i8 == 1) {
                                vDraweeView4.setRotation(-5.0f);
                                vDraweeView4.setTranslationX((-30.0f) * f5);
                                vDraweeView4.setTranslationY((-14.0f) * f5);
                                this.f22208e.addView(vDraweeView4, layoutParams9);
                            } else if (i8 == i4) {
                                vDraweeView4.setRotation(5.0f);
                                vDraweeView4.setTranslationX(30.0f * f5);
                                vDraweeView4.setTranslationY((-14.0f) * f5);
                                this.f22208e.addView(vDraweeView4, layoutParams9);
                            } else {
                                FrameLayout frameLayout3 = new FrameLayout(newNewHomeFrag.act());
                                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(qa00.m175859d(110.0f), qa00.m175859d(146.0f));
                                layoutParams10.gravity = 17;
                                ImageView imageView4 = new ImageView(newNewHomeFrag.act());
                                imageView4.setImageResource(this.f22212i);
                                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(qa00.m175859d(34.0f), qa00.m175859d(34.0f));
                                layoutParams11.bottomMargin = qa00.m175859d(10.0f);
                                layoutParams11.rightMargin = qa00.m175859d(10.0f);
                                layoutParams11.gravity = BadgeDrawable.BOTTOM_END;
                                frameLayout3.addView(vDraweeView4, layoutParams9);
                                frameLayout3.addView(imageView4, layoutParams11);
                                frameLayout3.setRotation(15.0f);
                                frameLayout3.setTranslationX(90.0f * f5);
                                this.f22208e.addView(frameLayout3, layoutParams10);
                            }
                        }
                        i8++;
                        i4 = 2;
                    }
                } else {
                    int i9 = 5;
                    if (size == 5) {
                        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(qa00.m175859d(80.0f), qa00.m175859d(107.0f));
                        layoutParams12.gravity = 17;
                        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(qa00.m175859d(100.0f), qa00.m175859d(133.0f));
                        layoutParams13.gravity = 17;
                        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(qa00.m175859d(120.0f), qa00.m175859d(160.0f));
                        layoutParams14.gravity = 17;
                        int i10 = 0;
                        while (i10 < size) {
                            User user5 = listSubList.get(i10).f19973a;
                            if (user5 != null) {
                                VDraweeView vDraweeView5 = new VDraweeView(newNewHomeFrag.act());
                                if (i10 == 0) {
                                    RoundingParams roundingParams5 = new RoundingParams();
                                    roundingParams5.m8319s(qa00.m175859d(13.0f));
                                    wlj wljVarM211638a5 = new xlj(getContext().getResources()).m211638a();
                                    wljVarM211638a5.m207045H(roundingParams5);
                                    vDraweeView5.setHierarchy(wljVarM211638a5);
                                    vDraweeView5.setRotation(-15.0f);
                                    vDraweeView5.setTranslationX(f5 * (-107.0f));
                                    this.f22208e.addView(vDraweeView5, layoutParams12);
                                } else if (i10 == 1) {
                                    RoundingParams roundingParams6 = new RoundingParams();
                                    roundingParams6.m8319s(qa00.m175859d(13.0f));
                                    wlj wljVarM211638a6 = new xlj(getContext().getResources()).m211638a();
                                    wljVarM211638a6.m207045H(roundingParams6);
                                    vDraweeView5.setHierarchy(wljVarM211638a6);
                                    vDraweeView5.setRotation(15.0f);
                                    vDraweeView5.setTranslationX(f5 * 107.0f);
                                    this.f22208e.addView(vDraweeView5, layoutParams12);
                                } else if (i10 == 2) {
                                    RoundingParams roundingParams7 = new RoundingParams();
                                    roundingParams7.m8319s(qa00.m175859d(13.0f));
                                    wlj wljVarM211638a7 = new xlj(getContext().getResources()).m211638a();
                                    wljVarM211638a7.m207045H(roundingParams7);
                                    vDraweeView5.setHierarchy(wljVarM211638a7);
                                    vDraweeView5.setRotation(-5.0f);
                                    vDraweeView5.setTranslationX(f5 * (-59.0f));
                                    this.f22208e.addView(vDraweeView5, layoutParams13);
                                } else if (i10 == i6) {
                                    RoundingParams roundingParams8 = new RoundingParams();
                                    roundingParams8.m8319s(qa00.m175859d(13.0f));
                                    wlj wljVarM211638a8 = new xlj(getContext().getResources()).m211638a();
                                    wljVarM211638a8.m207045H(roundingParams8);
                                    vDraweeView5.setHierarchy(wljVarM211638a8);
                                    vDraweeView5.setRotation(5.0f);
                                    vDraweeView5.setTranslationX(f5 * 59.0f);
                                    this.f22208e.addView(vDraweeView5, layoutParams13);
                                } else {
                                    RoundingParams roundingParams9 = new RoundingParams();
                                    roundingParams9.m8319s(qa00.m175859d(13.0f));
                                    wlj wljVarM211638a9 = new xlj(getContext().getResources()).m211638a();
                                    wljVarM211638a9.m207045H(roundingParams9);
                                    vDraweeView5.setHierarchy(wljVarM211638a9);
                                    this.f22208e.addView(vDraweeView5, layoutParams14);
                                }
                                vDraweeView5.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
                                vDraweeView5.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87394rr));
                                uqb0.f180374G.m127115L0(vDraweeView5, user5.m61308fp().cover().profileMiddle().formatted());
                            }
                            i10++;
                            i6 = 3;
                        }
                        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(qa00.m175859d(34.0f), qa00.m175859d(34.0f));
                        layoutParams15.bottomMargin = qa00.m175859d(10.0f);
                        layoutParams15.gravity = 81;
                        ImageView imageView5 = new ImageView(newNewHomeFrag.act());
                        imageView5.setImageResource(this.f22212i);
                        imageView5.setTranslationX(f5 * 33.0f);
                        this.f22208e.addView(imageView5, layoutParams15);
                    } else {
                        float f13 = 25.0f;
                        if (size == 6) {
                            FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(qa00.m175859d(60.0f), qa00.m175859d(80.0f));
                            layoutParams16.gravity = 17;
                            FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(qa00.m175859d(80.0f), qa00.m175859d(107.0f));
                            layoutParams17.gravity = 17;
                            FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(qa00.m175859d(100.0f), qa00.m175859d(133.0f));
                            layoutParams18.gravity = 17;
                            FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(qa00.m175859d(120.0f), qa00.m175859d(160.0f));
                            layoutParams19.gravity = 17;
                            wlj wljVarM211638a10 = new xlj(getContext().getResources()).m211638a();
                            wljVarM211638a10.m207041D(dbc0.f87361qr);
                            VDraweeView vDraweeView6 = new VDraweeView(newNewHomeFrag.act());
                            vDraweeView6.setHierarchy(wljVarM211638a10);
                            vDraweeView6.setRotation(25.0f);
                            float f14 = f5 * 5.0f;
                            vDraweeView6.setTranslationY(f14);
                            vDraweeView6.setTranslationX(f5 * 134.0f);
                            this.f22208e.addView(vDraweeView6, layoutParams16);
                            int i11 = 0;
                            while (i11 < size) {
                                User user6 = listSubList.get(i11).f19973a;
                                if (user6 != null) {
                                    VDraweeView vDraweeView7 = new VDraweeView(newNewHomeFrag.act());
                                    if (i11 == 0) {
                                        RoundingParams roundingParams10 = new RoundingParams();
                                        roundingParams10.m8319s(qa00.m175859d(10.0f));
                                        wlj wljVarM211638a11 = new xlj(getContext().getResources()).m211638a();
                                        wljVarM211638a11.m207045H(roundingParams10);
                                        vDraweeView7.setHierarchy(wljVarM211638a11);
                                        vDraweeView7.setAlpha(0.2f);
                                        vDraweeView7.setRotation(-25.0f);
                                        vDraweeView7.setTranslationX(f5 * (-134.0f));
                                        vDraweeView7.setTranslationY(f14);
                                        this.f22208e.addView(vDraweeView7, layoutParams16);
                                    } else if (i11 == 1) {
                                        RoundingParams roundingParams11 = new RoundingParams();
                                        roundingParams11.m8319s(qa00.m175859d(13.0f));
                                        wlj wljVarM211638a12 = new xlj(getContext().getResources()).m211638a();
                                        wljVarM211638a12.m207045H(roundingParams11);
                                        vDraweeView7.setHierarchy(wljVarM211638a12);
                                        vDraweeView7.setRotation(-15.0f);
                                        vDraweeView7.setTranslationX(f5 * (-107.0f));
                                        this.f22208e.addView(vDraweeView7, layoutParams17);
                                    } else if (i11 == 2) {
                                        RoundingParams roundingParams12 = new RoundingParams();
                                        roundingParams12.m8319s(qa00.m175859d(13.0f));
                                        wlj wljVarM211638a13 = new xlj(getContext().getResources()).m211638a();
                                        wljVarM211638a13.m207045H(roundingParams12);
                                        vDraweeView7.setHierarchy(wljVarM211638a13);
                                        vDraweeView7.setRotation(15.0f);
                                        vDraweeView7.setTranslationX(f5 * 107.0f);
                                        this.f22208e.addView(vDraweeView7, layoutParams17);
                                    } else if (i11 == 3) {
                                        RoundingParams roundingParams13 = new RoundingParams();
                                        roundingParams13.m8319s(qa00.m175859d(13.0f));
                                        wlj wljVarM211638a14 = new xlj(getContext().getResources()).m211638a();
                                        wljVarM211638a14.m207045H(roundingParams13);
                                        vDraweeView7.setHierarchy(wljVarM211638a14);
                                        vDraweeView7.setRotation(-5.0f);
                                        vDraweeView7.setTranslationX(f5 * (-59.0f));
                                        this.f22208e.addView(vDraweeView7, layoutParams18);
                                    } else if (i11 == 4) {
                                        RoundingParams roundingParams14 = new RoundingParams();
                                        roundingParams14.m8319s(qa00.m175859d(13.0f));
                                        wlj wljVarM211638a15 = new xlj(getContext().getResources()).m211638a();
                                        wljVarM211638a15.m207045H(roundingParams14);
                                        vDraweeView7.setHierarchy(wljVarM211638a15);
                                        vDraweeView7.setRotation(5.0f);
                                        vDraweeView7.setTranslationX(f5 * 59.0f);
                                        this.f22208e.addView(vDraweeView7, layoutParams18);
                                    } else {
                                        RoundingParams roundingParams15 = new RoundingParams();
                                        roundingParams15.m8319s(qa00.m175859d(13.0f));
                                        wlj wljVarM211638a16 = new xlj(getContext().getResources()).m211638a();
                                        wljVarM211638a16.m207045H(roundingParams15);
                                        vDraweeView7.setHierarchy(wljVarM211638a16);
                                        this.f22208e.addView(vDraweeView7, layoutParams19);
                                    }
                                    vDraweeView7.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
                                    if (i11 == 0) {
                                        vDraweeView7.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87427sr));
                                    } else {
                                        vDraweeView7.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87394rr));
                                    }
                                    uqb0.f180374G.m127115L0(vDraweeView7, user6.m61308fp().cover().profileMiddle().formatted());
                                }
                                i11++;
                                layoutParams16 = layoutParams16;
                            }
                            FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(qa00.m175859d(34.0f), qa00.m175859d(34.0f));
                            layoutParams20.bottomMargin = qa00.m175859d(10.0f);
                            layoutParams20.gravity = 81;
                            ImageView imageView6 = new ImageView(newNewHomeFrag.act());
                            imageView6.setImageResource(this.f22212i);
                            imageView6.setTranslationX(f5 * 33.0f);
                            this.f22208e.addView(imageView6, layoutParams20);
                        } else if (size > 6) {
                            if (size == 8) {
                                listSubList = listSubList.subList(1, size);
                            } else if (size == 9) {
                                listSubList = listSubList.subList(2, size);
                            } else if (size == 10) {
                                listSubList = listSubList.subList(3, size);
                            }
                            FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(qa00.m175859d(60.0f), qa00.m175859d(80.0f));
                            layoutParams21.gravity = 17;
                            FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(qa00.m175859d(80.0f), qa00.m175859d(107.0f));
                            layoutParams22.gravity = 17;
                            FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(qa00.m175859d(100.0f), qa00.m175859d(133.0f));
                            layoutParams23.gravity = 17;
                            FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(qa00.m175859d(120.0f), qa00.m175859d(160.0f));
                            layoutParams24.gravity = 17;
                            int i12 = 0;
                            while (i12 < listSubList.size()) {
                                User user7 = listSubList.get(i12).f19973a;
                                if (user7 != null) {
                                    VDraweeView vDraweeView8 = new VDraweeView(newNewHomeFrag.act());
                                    if (i12 == 0) {
                                        RoundingParams roundingParams16 = new RoundingParams();
                                        roundingParams16.m8319s(qa00.m175859d(10.0f));
                                        wlj wljVarM211638a17 = new xlj(getContext().getResources()).m211638a();
                                        wljVarM211638a17.m207045H(roundingParams16);
                                        vDraweeView8.setHierarchy(wljVarM211638a17);
                                        vDraweeView8.setAlpha(0.2f);
                                        vDraweeView8.setRotation(-25.0f);
                                        vDraweeView8.setTranslationY(f5 * 5.0f);
                                        vDraweeView8.setTranslationX(f5 * (-134.0f));
                                        this.f22208e.addView(vDraweeView8, layoutParams21);
                                    } else {
                                        if (i12 == 1) {
                                            RoundingParams roundingParams17 = new RoundingParams();
                                            roundingParams17.m8319s(qa00.m175859d(10.0f));
                                            wlj wljVarM211638a18 = new xlj(getContext().getResources()).m211638a();
                                            wljVarM211638a18.m207045H(roundingParams17);
                                            vDraweeView8.setHierarchy(wljVarM211638a18);
                                            vDraweeView8.setRotation(f13);
                                            vDraweeView8.setAlpha(0.2f);
                                            vDraweeView8.setTranslationY(f5 * 5.0f);
                                            vDraweeView8.setTranslationX(f5 * 134.0f);
                                            this.f22208e.addView(vDraweeView8, layoutParams21);
                                        } else if (i12 == 2) {
                                            RoundingParams roundingParams18 = new RoundingParams();
                                            roundingParams18.m8319s(qa00.m175859d(13.0f));
                                            wlj wljVarM211638a19 = new xlj(getContext().getResources()).m211638a();
                                            wljVarM211638a19.m207045H(roundingParams18);
                                            vDraweeView8.setHierarchy(wljVarM211638a19);
                                            vDraweeView8.setRotation(-15.0f);
                                            vDraweeView8.setTranslationX(f5 * (-107.0f));
                                            this.f22208e.addView(vDraweeView8, layoutParams22);
                                        } else if (i12 == 3) {
                                            RoundingParams roundingParams19 = new RoundingParams();
                                            roundingParams19.m8319s(qa00.m175859d(13.0f));
                                            wlj wljVarM211638a20 = new xlj(getContext().getResources()).m211638a();
                                            wljVarM211638a20.m207045H(roundingParams19);
                                            vDraweeView8.setHierarchy(wljVarM211638a20);
                                            vDraweeView8.setRotation(15.0f);
                                            vDraweeView8.setTranslationX(f5 * 107.0f);
                                            this.f22208e.addView(vDraweeView8, layoutParams22);
                                        } else if (i12 == 4) {
                                            RoundingParams roundingParams20 = new RoundingParams();
                                            roundingParams20.m8319s(qa00.m175859d(13.0f));
                                            wlj wljVarM211638a21 = new xlj(getContext().getResources()).m211638a();
                                            wljVarM211638a21.m207045H(roundingParams20);
                                            vDraweeView8.setHierarchy(wljVarM211638a21);
                                            vDraweeView8.setRotation(-5.0f);
                                            vDraweeView8.setTranslationX(f5 * (-59.0f));
                                            this.f22208e.addView(vDraweeView8, layoutParams23);
                                        } else if (i12 == i9) {
                                            RoundingParams roundingParams21 = new RoundingParams();
                                            roundingParams21.m8319s(qa00.m175859d(13.0f));
                                            wlj wljVarM211638a22 = new xlj(getContext().getResources()).m211638a();
                                            wljVarM211638a22.m207045H(roundingParams21);
                                            vDraweeView8.setHierarchy(wljVarM211638a22);
                                            vDraweeView8.setRotation(5.0f);
                                            vDraweeView8.setTranslationX(f5 * 59.0f);
                                            this.f22208e.addView(vDraweeView8, layoutParams23);
                                        } else if (i12 == 6) {
                                            RoundingParams roundingParams22 = new RoundingParams();
                                            roundingParams22.m8319s(qa00.m175859d(13.0f));
                                            wlj wljVarM211638a23 = new xlj(getContext().getResources()).m211638a();
                                            wljVarM211638a23.m207045H(roundingParams22);
                                            vDraweeView8.setHierarchy(wljVarM211638a23);
                                            this.f22208e.addView(vDraweeView8, layoutParams24);
                                        }
                                        vDraweeView8.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
                                        if (i12 != 0 || i12 == 1) {
                                            vDraweeView8.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87427sr));
                                        } else {
                                            vDraweeView8.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87394rr));
                                        }
                                        uqb0.f180374G.m127115L0(vDraweeView8, user7.m61308fp().cover().profileMiddle().formatted());
                                    }
                                    vDraweeView8.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
                                    if (i12 != 0) {
                                        vDraweeView8.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87427sr));
                                    } else {
                                        vDraweeView8.setBackground(newNewHomeFrag.getContext().getDrawable(dbc0.f87427sr));
                                    }
                                    uqb0.f180374G.m127115L0(vDraweeView8, user7.m61308fp().cover().profileMiddle().formatted());
                                }
                                i12++;
                                i9 = 5;
                                f13 = 25.0f;
                            }
                            FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(qa00.m175859d(34.0f), qa00.m175859d(34.0f));
                            layoutParams25.bottomMargin = qa00.m175859d(10.0f);
                            layoutParams25.gravity = 81;
                            ImageView imageView7 = new ImageView(newNewHomeFrag.act());
                            imageView7.setImageResource(this.f22212i);
                            imageView7.setTranslationX(f5 * 33.0f);
                            this.f22208e.addView(imageView7, layoutParams25);
                        }
                    }
                }
            }
        }
        bnl0.m105509E0(this.f22210g, new View.OnClickListener() { // from class: l.qei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleVerificationGuideCardView.m37449e(newNewHomeFrag, view);
            }
        });
        bnl0.m105509E0(this.f22211h, new View.OnClickListener() { // from class: l.rei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleVerificationGuideCardView.m37448b(newNewHomeFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37450f(this);
        if (gra.m131778z()) {
            this.f22205b.setImageResource(dbc0.f86474Ph);
            this.f22210g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f22210g.getPaint().setFakeBoldText(true);
            this.f22212i = dbc0.f86346Lh;
        }
    }

    public FemaleVerificationGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22212i = dbc0.f86910d2;
        this.f22213j = true;
    }

    public FemaleVerificationGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22212i = dbc0.f86910d2;
        this.f22213j = true;
    }
}
