package com.p046p1.mobile.putong.core.newui.femalevip;

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
import com.p046p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.femalevip.FemaleVerificationGuideCardView;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.adi;
import p149l.ddi;
import p149l.djj;
import p149l.ejj;
import p149l.ke7;
import p149l.qib0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class FemaleVerificationGuideCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public FemaleVerificationGuideCardView f21462a;

    /* JADX INFO: renamed from: b */
    public VImage f21463b;

    /* JADX INFO: renamed from: c */
    public VText f21464c;

    /* JADX INFO: renamed from: d */
    public VText f21465d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f21466e;

    /* JADX INFO: renamed from: f */
    public AppCompatTextView f21467f;

    /* JADX INFO: renamed from: g */
    public VText f21468g;

    /* JADX INFO: renamed from: h */
    public VText f21469h;

    /* JADX INFO: renamed from: i */
    @DrawableRes
    public int f21470i;

    /* JADX INFO: renamed from: j */
    public boolean f21471j;

    public FemaleVerificationGuideCardView(@NonNull Context context) {
        super(context);
        this.f21470i = x2c0.f190032c2;
        this.f21471j = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m36445b(NewNewHomeFrag newNewHomeFrag, View view) {
        zvf0.m220396r("e_trial_end_buy_svip", "p_suggest_users_home_view");
        C8764c.m53504x0(newNewHomeFrag.act(), "p_home,verification_card", Privilege.advanced_filter);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m36446e(NewNewHomeFrag newNewHomeFrag, View view) {
        zvf0.m220396r("e_trial_end_go_verify", "p_suggest_users_home_view");
        newNewHomeFrag.act().startActivity(VerificationCenterAct.m55992Y1(newNewHomeFrag.act(), false, "button"));
    }

    /* JADX INFO: renamed from: f */
    public final void m36447f(View view) {
        ddi.m111019a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0b58  */
    /* JADX INFO: renamed from: h */
    public void m36448h(final NewNewHomeFrag newNewHomeFrag, adi adiVar, List<CoreJustVerificationCardApi.C4718a> list) {
        String str;
        float f;
        float f2;
        float f3;
        float f4;
        List<CoreJustVerificationCardApi.C4718a> listSubList = list;
        if (newNewHomeFrag == null || adiVar == null || vwb.m200296J(listSubList) || !this.f21471j) {
            return;
        }
        this.f21471j = false;
        int size = listSubList.size();
        int i = 1;
        this.f21464c.setTypeface(Typeface.defaultFromStyle(1));
        this.f21468g.setTypeface(Typeface.defaultFromStyle(1));
        this.f21468g.setText(ke7.m145734s() ? "认证审核中" : "去认证");
        this.f21467f.setTypeface(Typeface.defaultFromStyle(1));
        this.f21466e.setVisibility(0);
        this.f21465d.setText(String.format("你喜欢了%d位头像已认证的用户", Integer.valueOf(size)));
        if (size == 1) {
            str = listSubList.get(0).f19232a.isFemale() ? "她" : "他";
        } else {
            boolean z = false;
            boolean z2 = false;
            for (int i2 = 0; i2 < listSubList.size(); i2++) {
                if (listSubList.get(i2).f19232a.isFemale()) {
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
        this.f21467f.setText(String.format("完成认证或开通SVIP\n向%s发出喜欢\n并可继续使用“只看认证用户”功能", str));
        float f5 = getResources().getDisplayMetrics().density;
        float f6 = 120.0f;
        float f7 = 10.0f;
        float f8 = 34.0f;
        int i3 = 17;
        float f9 = 13.0f;
        if (size == 1) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8265s(t100.m186890d(13.0f));
            djj djjVarM116872a = new ejj(getContext().getResources()).m116872a();
            djjVarM116872a.m112053H(roundingParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(120.0f), t100.m186890d(160.0f));
            layoutParams.gravity = 17;
            User user = listSubList.get(0).f19232a;
            if (user != null) {
                VDraweeView vDraweeView = new VDraweeView(newNewHomeFrag.act());
                vDraweeView.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
                vDraweeView.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189276Dq));
                vDraweeView.setHierarchy(djjVarM116872a);
                qib0.f154691G.m102331L0(vDraweeView, user.m60124fp().cover().profileMiddle().formatted());
                this.f21466e.addView(vDraweeView, layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(t100.m186890d(34.0f), t100.m186890d(34.0f));
                layoutParams2.gravity = 81;
                layoutParams2.bottomMargin = t100.m186890d(10.0f);
                ImageView imageView = new ImageView(newNewHomeFrag.act());
                imageView.setImageResource(this.f21470i);
                imageView.setTranslationX(f5 * 33.0f);
                this.f21466e.addView(imageView, layoutParams2);
                this.f21466e.setRotation(5.0f);
            }
        } else {
            float f10 = -5.0f;
            int i4 = 2;
            if (size == 2) {
                int i5 = 0;
                while (i5 < size) {
                    User user2 = listSubList.get(i5).f19232a;
                    if (user2 != null) {
                        f2 = f6;
                        VDraweeView vDraweeView2 = new VDraweeView(newNewHomeFrag.act());
                        RoundingParams roundingParams2 = new RoundingParams();
                        f3 = f7;
                        roundingParams2.m8265s(t100.m186890d(f9));
                        f4 = f8;
                        djj djjVarM116872a2 = new ejj(getContext().getResources()).m116872a();
                        djjVarM116872a2.m112053H(roundingParams2);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(t100.m186890d(f2), t100.m186890d(160.0f));
                        layoutParams3.gravity = i3;
                        vDraweeView2.setHierarchy(djjVarM116872a2);
                        vDraweeView2.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
                        vDraweeView2.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189276Dq));
                        if (i5 == 0) {
                            vDraweeView2.setRotation(f10);
                            vDraweeView2.setTranslationX((-48.0f) * f5);
                            this.f21466e.addView(vDraweeView2, layoutParams3);
                        } else {
                            FrameLayout frameLayout = new FrameLayout(newNewHomeFrag.act());
                            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(t100.m186890d(f2), t100.m186890d(160.0f));
                            layoutParams4.gravity = i3;
                            ImageView imageView2 = new ImageView(newNewHomeFrag.act());
                            imageView2.setImageResource(this.f21470i);
                            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(t100.m186890d(f4), t100.m186890d(f4));
                            layoutParams5.bottomMargin = t100.m186890d(f3);
                            layoutParams5.rightMargin = t100.m186890d(f3);
                            layoutParams5.gravity = BadgeDrawable.BOTTOM_END;
                            frameLayout.addView(vDraweeView2, layoutParams3);
                            frameLayout.addView(imageView2, layoutParams5);
                            frameLayout.setRotation(5.0f);
                            frameLayout.setTranslationX(48.0f * f5);
                            this.f21466e.addView(frameLayout, layoutParams4);
                        }
                        qib0.f154691G.m102331L0(vDraweeView2, user2.m60124fp().cover().profileMiddle().formatted());
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
                        User user3 = listSubList.get(i7).f19232a;
                        if (user3 != null) {
                            VDraweeView vDraweeView3 = new VDraweeView(newNewHomeFrag.act());
                            vDraweeView3.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
                            vDraweeView3.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189276Dq));
                            RoundingParams roundingParams3 = new RoundingParams();
                            roundingParams3.m8265s(t100.m186890d(13.0f));
                            djj djjVarM116872a3 = new ejj(getContext().getResources()).m116872a();
                            djjVarM116872a3.m112053H(roundingParams3);
                            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(t100.m186890d(f12), t100.m186890d(f11));
                            layoutParams6.gravity = 17;
                            vDraweeView3.setHierarchy(djjVarM116872a3);
                            if (i7 == 0) {
                                vDraweeView3.setRotation(-5.0f);
                                vDraweeView3.setTranslationX((-76.0f) * f5);
                                this.f21466e.addView(vDraweeView3, layoutParams6);
                            } else {
                                if (i7 == i) {
                                    vDraweeView3.setTranslationY((-8.0f) * f5);
                                    this.f21466e.addView(vDraweeView3, layoutParams6);
                                } else {
                                    FrameLayout frameLayout2 = new FrameLayout(newNewHomeFrag.act());
                                    f = f11;
                                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(t100.m186890d(f12), t100.m186890d(f));
                                    layoutParams7.gravity = 17;
                                    ImageView imageView3 = new ImageView(newNewHomeFrag.act());
                                    imageView3.setImageResource(this.f21470i);
                                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(t100.m186890d(34.0f), t100.m186890d(34.0f));
                                    layoutParams8.bottomMargin = t100.m186890d(10.0f);
                                    layoutParams8.rightMargin = t100.m186890d(10.0f);
                                    layoutParams8.gravity = BadgeDrawable.BOTTOM_END;
                                    frameLayout2.addView(vDraweeView3, layoutParams6);
                                    frameLayout2.addView(imageView3, layoutParams8);
                                    frameLayout2.setRotation(5.0f);
                                    frameLayout2.setTranslationX(76.0f * f5);
                                    this.f21466e.addView(frameLayout2, layoutParams7);
                                }
                                qib0.f154691G.m102331L0(vDraweeView3, user3.m60124fp().cover().profileMiddle().formatted());
                            }
                            f = f11;
                            qib0.f154691G.m102331L0(vDraweeView3, user3.m60124fp().cover().profileMiddle().formatted());
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
                        User user4 = listSubList.get(i8).f19232a;
                        if (user4 != null) {
                            VDraweeView vDraweeView4 = new VDraweeView(newNewHomeFrag.act());
                            RoundingParams roundingParams4 = new RoundingParams();
                            roundingParams4.m8265s(t100.m186890d(13.0f));
                            djj djjVarM116872a4 = new ejj(getContext().getResources()).m116872a();
                            djjVarM116872a4.m112053H(roundingParams4);
                            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(t100.m186890d(110.0f), t100.m186890d(146.0f));
                            layoutParams9.gravity = 17;
                            vDraweeView4.setHierarchy(djjVarM116872a4);
                            vDraweeView4.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
                            vDraweeView4.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189276Dq));
                            qib0.f154691G.m102331L0(vDraweeView4, user4.m60124fp().cover().profileMiddle().formatted());
                            if (i8 == 0) {
                                vDraweeView4.setRotation(-15.0f);
                                vDraweeView4.setTranslationX((-90.0f) * f5);
                                this.f21466e.addView(vDraweeView4, layoutParams9);
                            } else if (i8 == 1) {
                                vDraweeView4.setRotation(-5.0f);
                                vDraweeView4.setTranslationX((-30.0f) * f5);
                                vDraweeView4.setTranslationY((-14.0f) * f5);
                                this.f21466e.addView(vDraweeView4, layoutParams9);
                            } else if (i8 == i4) {
                                vDraweeView4.setRotation(5.0f);
                                vDraweeView4.setTranslationX(30.0f * f5);
                                vDraweeView4.setTranslationY((-14.0f) * f5);
                                this.f21466e.addView(vDraweeView4, layoutParams9);
                            } else {
                                FrameLayout frameLayout3 = new FrameLayout(newNewHomeFrag.act());
                                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(t100.m186890d(110.0f), t100.m186890d(146.0f));
                                layoutParams10.gravity = 17;
                                ImageView imageView4 = new ImageView(newNewHomeFrag.act());
                                imageView4.setImageResource(this.f21470i);
                                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(t100.m186890d(34.0f), t100.m186890d(34.0f));
                                layoutParams11.bottomMargin = t100.m186890d(10.0f);
                                layoutParams11.rightMargin = t100.m186890d(10.0f);
                                layoutParams11.gravity = BadgeDrawable.BOTTOM_END;
                                frameLayout3.addView(vDraweeView4, layoutParams9);
                                frameLayout3.addView(imageView4, layoutParams11);
                                frameLayout3.setRotation(15.0f);
                                frameLayout3.setTranslationX(90.0f * f5);
                                this.f21466e.addView(frameLayout3, layoutParams10);
                            }
                        }
                        i8++;
                        i4 = 2;
                    }
                } else {
                    int i9 = 5;
                    if (size == 5) {
                        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(t100.m186890d(80.0f), t100.m186890d(107.0f));
                        layoutParams12.gravity = 17;
                        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(t100.m186890d(100.0f), t100.m186890d(133.0f));
                        layoutParams13.gravity = 17;
                        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(t100.m186890d(120.0f), t100.m186890d(160.0f));
                        layoutParams14.gravity = 17;
                        int i10 = 0;
                        while (i10 < size) {
                            User user5 = listSubList.get(i10).f19232a;
                            if (user5 != null) {
                                VDraweeView vDraweeView5 = new VDraweeView(newNewHomeFrag.act());
                                if (i10 == 0) {
                                    RoundingParams roundingParams5 = new RoundingParams();
                                    roundingParams5.m8265s(t100.m186890d(13.0f));
                                    djj djjVarM116872a5 = new ejj(getContext().getResources()).m116872a();
                                    djjVarM116872a5.m112053H(roundingParams5);
                                    vDraweeView5.setHierarchy(djjVarM116872a5);
                                    vDraweeView5.setRotation(-15.0f);
                                    vDraweeView5.setTranslationX(f5 * (-107.0f));
                                    this.f21466e.addView(vDraweeView5, layoutParams12);
                                } else if (i10 == 1) {
                                    RoundingParams roundingParams6 = new RoundingParams();
                                    roundingParams6.m8265s(t100.m186890d(13.0f));
                                    djj djjVarM116872a6 = new ejj(getContext().getResources()).m116872a();
                                    djjVarM116872a6.m112053H(roundingParams6);
                                    vDraweeView5.setHierarchy(djjVarM116872a6);
                                    vDraweeView5.setRotation(15.0f);
                                    vDraweeView5.setTranslationX(f5 * 107.0f);
                                    this.f21466e.addView(vDraweeView5, layoutParams12);
                                } else if (i10 == 2) {
                                    RoundingParams roundingParams7 = new RoundingParams();
                                    roundingParams7.m8265s(t100.m186890d(13.0f));
                                    djj djjVarM116872a7 = new ejj(getContext().getResources()).m116872a();
                                    djjVarM116872a7.m112053H(roundingParams7);
                                    vDraweeView5.setHierarchy(djjVarM116872a7);
                                    vDraweeView5.setRotation(-5.0f);
                                    vDraweeView5.setTranslationX(f5 * (-59.0f));
                                    this.f21466e.addView(vDraweeView5, layoutParams13);
                                } else if (i10 == i6) {
                                    RoundingParams roundingParams8 = new RoundingParams();
                                    roundingParams8.m8265s(t100.m186890d(13.0f));
                                    djj djjVarM116872a8 = new ejj(getContext().getResources()).m116872a();
                                    djjVarM116872a8.m112053H(roundingParams8);
                                    vDraweeView5.setHierarchy(djjVarM116872a8);
                                    vDraweeView5.setRotation(5.0f);
                                    vDraweeView5.setTranslationX(f5 * 59.0f);
                                    this.f21466e.addView(vDraweeView5, layoutParams13);
                                } else {
                                    RoundingParams roundingParams9 = new RoundingParams();
                                    roundingParams9.m8265s(t100.m186890d(13.0f));
                                    djj djjVarM116872a9 = new ejj(getContext().getResources()).m116872a();
                                    djjVarM116872a9.m112053H(roundingParams9);
                                    vDraweeView5.setHierarchy(djjVarM116872a9);
                                    this.f21466e.addView(vDraweeView5, layoutParams14);
                                }
                                vDraweeView5.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
                                vDraweeView5.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189276Dq));
                                qib0.f154691G.m102331L0(vDraweeView5, user5.m60124fp().cover().profileMiddle().formatted());
                            }
                            i10++;
                            i6 = 3;
                        }
                        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(t100.m186890d(34.0f), t100.m186890d(34.0f));
                        layoutParams15.bottomMargin = t100.m186890d(10.0f);
                        layoutParams15.gravity = 81;
                        ImageView imageView5 = new ImageView(newNewHomeFrag.act());
                        imageView5.setImageResource(this.f21470i);
                        imageView5.setTranslationX(f5 * 33.0f);
                        this.f21466e.addView(imageView5, layoutParams15);
                    } else {
                        float f13 = 25.0f;
                        if (size == 6) {
                            FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(t100.m186890d(60.0f), t100.m186890d(80.0f));
                            layoutParams16.gravity = 17;
                            FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(t100.m186890d(80.0f), t100.m186890d(107.0f));
                            layoutParams17.gravity = 17;
                            FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(t100.m186890d(100.0f), t100.m186890d(133.0f));
                            layoutParams18.gravity = 17;
                            FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(t100.m186890d(120.0f), t100.m186890d(160.0f));
                            layoutParams19.gravity = 17;
                            djj djjVarM116872a10 = new ejj(getContext().getResources()).m116872a();
                            djjVarM116872a10.m112049D(x2c0.f189244Cq);
                            VDraweeView vDraweeView6 = new VDraweeView(newNewHomeFrag.act());
                            vDraweeView6.setHierarchy(djjVarM116872a10);
                            vDraweeView6.setRotation(25.0f);
                            float f14 = f5 * 5.0f;
                            vDraweeView6.setTranslationY(f14);
                            vDraweeView6.setTranslationX(f5 * 134.0f);
                            this.f21466e.addView(vDraweeView6, layoutParams16);
                            int i11 = 0;
                            while (i11 < size) {
                                User user6 = listSubList.get(i11).f19232a;
                                if (user6 != null) {
                                    VDraweeView vDraweeView7 = new VDraweeView(newNewHomeFrag.act());
                                    if (i11 == 0) {
                                        RoundingParams roundingParams10 = new RoundingParams();
                                        roundingParams10.m8265s(t100.m186890d(10.0f));
                                        djj djjVarM116872a11 = new ejj(getContext().getResources()).m116872a();
                                        djjVarM116872a11.m112053H(roundingParams10);
                                        vDraweeView7.setHierarchy(djjVarM116872a11);
                                        vDraweeView7.setAlpha(0.2f);
                                        vDraweeView7.setRotation(-25.0f);
                                        vDraweeView7.setTranslationX(f5 * (-134.0f));
                                        vDraweeView7.setTranslationY(f14);
                                        this.f21466e.addView(vDraweeView7, layoutParams16);
                                    } else if (i11 == 1) {
                                        RoundingParams roundingParams11 = new RoundingParams();
                                        roundingParams11.m8265s(t100.m186890d(13.0f));
                                        djj djjVarM116872a12 = new ejj(getContext().getResources()).m116872a();
                                        djjVarM116872a12.m112053H(roundingParams11);
                                        vDraweeView7.setHierarchy(djjVarM116872a12);
                                        vDraweeView7.setRotation(-15.0f);
                                        vDraweeView7.setTranslationX(f5 * (-107.0f));
                                        this.f21466e.addView(vDraweeView7, layoutParams17);
                                    } else if (i11 == 2) {
                                        RoundingParams roundingParams12 = new RoundingParams();
                                        roundingParams12.m8265s(t100.m186890d(13.0f));
                                        djj djjVarM116872a13 = new ejj(getContext().getResources()).m116872a();
                                        djjVarM116872a13.m112053H(roundingParams12);
                                        vDraweeView7.setHierarchy(djjVarM116872a13);
                                        vDraweeView7.setRotation(15.0f);
                                        vDraweeView7.setTranslationX(f5 * 107.0f);
                                        this.f21466e.addView(vDraweeView7, layoutParams17);
                                    } else if (i11 == 3) {
                                        RoundingParams roundingParams13 = new RoundingParams();
                                        roundingParams13.m8265s(t100.m186890d(13.0f));
                                        djj djjVarM116872a14 = new ejj(getContext().getResources()).m116872a();
                                        djjVarM116872a14.m112053H(roundingParams13);
                                        vDraweeView7.setHierarchy(djjVarM116872a14);
                                        vDraweeView7.setRotation(-5.0f);
                                        vDraweeView7.setTranslationX(f5 * (-59.0f));
                                        this.f21466e.addView(vDraweeView7, layoutParams18);
                                    } else if (i11 == 4) {
                                        RoundingParams roundingParams14 = new RoundingParams();
                                        roundingParams14.m8265s(t100.m186890d(13.0f));
                                        djj djjVarM116872a15 = new ejj(getContext().getResources()).m116872a();
                                        djjVarM116872a15.m112053H(roundingParams14);
                                        vDraweeView7.setHierarchy(djjVarM116872a15);
                                        vDraweeView7.setRotation(5.0f);
                                        vDraweeView7.setTranslationX(f5 * 59.0f);
                                        this.f21466e.addView(vDraweeView7, layoutParams18);
                                    } else {
                                        RoundingParams roundingParams15 = new RoundingParams();
                                        roundingParams15.m8265s(t100.m186890d(13.0f));
                                        djj djjVarM116872a16 = new ejj(getContext().getResources()).m116872a();
                                        djjVarM116872a16.m112053H(roundingParams15);
                                        vDraweeView7.setHierarchy(djjVarM116872a16);
                                        this.f21466e.addView(vDraweeView7, layoutParams19);
                                    }
                                    vDraweeView7.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
                                    if (i11 == 0) {
                                        vDraweeView7.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189308Eq));
                                    } else {
                                        vDraweeView7.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189276Dq));
                                    }
                                    qib0.f154691G.m102331L0(vDraweeView7, user6.m60124fp().cover().profileMiddle().formatted());
                                }
                                i11++;
                                layoutParams16 = layoutParams16;
                            }
                            FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(t100.m186890d(34.0f), t100.m186890d(34.0f));
                            layoutParams20.bottomMargin = t100.m186890d(10.0f);
                            layoutParams20.gravity = 81;
                            ImageView imageView6 = new ImageView(newNewHomeFrag.act());
                            imageView6.setImageResource(this.f21470i);
                            imageView6.setTranslationX(f5 * 33.0f);
                            this.f21466e.addView(imageView6, layoutParams20);
                        } else if (size > 6) {
                            if (size == 8) {
                                listSubList = listSubList.subList(1, size);
                            } else if (size == 9) {
                                listSubList = listSubList.subList(2, size);
                            } else if (size == 10) {
                                listSubList = listSubList.subList(3, size);
                            }
                            FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(t100.m186890d(60.0f), t100.m186890d(80.0f));
                            layoutParams21.gravity = 17;
                            FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(t100.m186890d(80.0f), t100.m186890d(107.0f));
                            layoutParams22.gravity = 17;
                            FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(t100.m186890d(100.0f), t100.m186890d(133.0f));
                            layoutParams23.gravity = 17;
                            FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(t100.m186890d(120.0f), t100.m186890d(160.0f));
                            layoutParams24.gravity = 17;
                            int i12 = 0;
                            while (i12 < listSubList.size()) {
                                User user7 = listSubList.get(i12).f19232a;
                                if (user7 != null) {
                                    VDraweeView vDraweeView8 = new VDraweeView(newNewHomeFrag.act());
                                    if (i12 == 0) {
                                        RoundingParams roundingParams16 = new RoundingParams();
                                        roundingParams16.m8265s(t100.m186890d(10.0f));
                                        djj djjVarM116872a17 = new ejj(getContext().getResources()).m116872a();
                                        djjVarM116872a17.m112053H(roundingParams16);
                                        vDraweeView8.setHierarchy(djjVarM116872a17);
                                        vDraweeView8.setAlpha(0.2f);
                                        vDraweeView8.setRotation(-25.0f);
                                        vDraweeView8.setTranslationY(f5 * 5.0f);
                                        vDraweeView8.setTranslationX(f5 * (-134.0f));
                                        this.f21466e.addView(vDraweeView8, layoutParams21);
                                    } else {
                                        if (i12 == 1) {
                                            RoundingParams roundingParams17 = new RoundingParams();
                                            roundingParams17.m8265s(t100.m186890d(10.0f));
                                            djj djjVarM116872a18 = new ejj(getContext().getResources()).m116872a();
                                            djjVarM116872a18.m112053H(roundingParams17);
                                            vDraweeView8.setHierarchy(djjVarM116872a18);
                                            vDraweeView8.setRotation(f13);
                                            vDraweeView8.setAlpha(0.2f);
                                            vDraweeView8.setTranslationY(f5 * 5.0f);
                                            vDraweeView8.setTranslationX(f5 * 134.0f);
                                            this.f21466e.addView(vDraweeView8, layoutParams21);
                                        } else if (i12 == 2) {
                                            RoundingParams roundingParams18 = new RoundingParams();
                                            roundingParams18.m8265s(t100.m186890d(13.0f));
                                            djj djjVarM116872a19 = new ejj(getContext().getResources()).m116872a();
                                            djjVarM116872a19.m112053H(roundingParams18);
                                            vDraweeView8.setHierarchy(djjVarM116872a19);
                                            vDraweeView8.setRotation(-15.0f);
                                            vDraweeView8.setTranslationX(f5 * (-107.0f));
                                            this.f21466e.addView(vDraweeView8, layoutParams22);
                                        } else if (i12 == 3) {
                                            RoundingParams roundingParams19 = new RoundingParams();
                                            roundingParams19.m8265s(t100.m186890d(13.0f));
                                            djj djjVarM116872a20 = new ejj(getContext().getResources()).m116872a();
                                            djjVarM116872a20.m112053H(roundingParams19);
                                            vDraweeView8.setHierarchy(djjVarM116872a20);
                                            vDraweeView8.setRotation(15.0f);
                                            vDraweeView8.setTranslationX(f5 * 107.0f);
                                            this.f21466e.addView(vDraweeView8, layoutParams22);
                                        } else if (i12 == 4) {
                                            RoundingParams roundingParams20 = new RoundingParams();
                                            roundingParams20.m8265s(t100.m186890d(13.0f));
                                            djj djjVarM116872a21 = new ejj(getContext().getResources()).m116872a();
                                            djjVarM116872a21.m112053H(roundingParams20);
                                            vDraweeView8.setHierarchy(djjVarM116872a21);
                                            vDraweeView8.setRotation(-5.0f);
                                            vDraweeView8.setTranslationX(f5 * (-59.0f));
                                            this.f21466e.addView(vDraweeView8, layoutParams23);
                                        } else if (i12 == i9) {
                                            RoundingParams roundingParams21 = new RoundingParams();
                                            roundingParams21.m8265s(t100.m186890d(13.0f));
                                            djj djjVarM116872a22 = new ejj(getContext().getResources()).m116872a();
                                            djjVarM116872a22.m112053H(roundingParams21);
                                            vDraweeView8.setHierarchy(djjVarM116872a22);
                                            vDraweeView8.setRotation(5.0f);
                                            vDraweeView8.setTranslationX(f5 * 59.0f);
                                            this.f21466e.addView(vDraweeView8, layoutParams23);
                                        } else if (i12 == 6) {
                                            RoundingParams roundingParams22 = new RoundingParams();
                                            roundingParams22.m8265s(t100.m186890d(13.0f));
                                            djj djjVarM116872a23 = new ejj(getContext().getResources()).m116872a();
                                            djjVarM116872a23.m112053H(roundingParams22);
                                            vDraweeView8.setHierarchy(djjVarM116872a23);
                                            this.f21466e.addView(vDraweeView8, layoutParams24);
                                        }
                                        vDraweeView8.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
                                        if (i12 != 0 || i12 == 1) {
                                            vDraweeView8.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189308Eq));
                                        } else {
                                            vDraweeView8.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189276Dq));
                                        }
                                        qib0.f154691G.m102331L0(vDraweeView8, user7.m60124fp().cover().profileMiddle().formatted());
                                    }
                                    vDraweeView8.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
                                    if (i12 != 0) {
                                        vDraweeView8.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189308Eq));
                                    } else {
                                        vDraweeView8.setBackground(newNewHomeFrag.getContext().getDrawable(x2c0.f189308Eq));
                                    }
                                    qib0.f154691G.m102331L0(vDraweeView8, user7.m60124fp().cover().profileMiddle().formatted());
                                }
                                i12++;
                                i9 = 5;
                                f13 = 25.0f;
                            }
                            FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(t100.m186890d(34.0f), t100.m186890d(34.0f));
                            layoutParams25.bottomMargin = t100.m186890d(10.0f);
                            layoutParams25.gravity = 81;
                            ImageView imageView7 = new ImageView(newNewHomeFrag.act());
                            imageView7.setImageResource(this.f21470i);
                            imageView7.setTranslationX(f5 * 33.0f);
                            this.f21466e.addView(imageView7, layoutParams25);
                        }
                    }
                }
            }
        }
        xdl0.m208329E0(this.f21468g, new View.OnClickListener() { // from class: l.bdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleVerificationGuideCardView.m36446e(newNewHomeFrag, view);
            }
        });
        xdl0.m208329E0(this.f21469h, new View.OnClickListener() { // from class: l.cdi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FemaleVerificationGuideCardView.m36445b(newNewHomeFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36447f(this);
        if (upa.m194847z()) {
            this.f21463b.setImageResource(x2c0.f190015bh);
            this.f21468g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            this.f21468g.getPaint().setFakeBoldText(true);
            this.f21470i = x2c0.f189889Xg;
        }
    }

    public FemaleVerificationGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21470i = x2c0.f190032c2;
        this.f21471j = true;
    }

    public FemaleVerificationGuideCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21470i = x2c0.f190032c2;
        this.f21471j = true;
    }
}
