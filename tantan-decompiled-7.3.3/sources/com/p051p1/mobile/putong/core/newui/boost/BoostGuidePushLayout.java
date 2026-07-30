package com.p051p1.mobile.putong.core.newui.boost;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.boost.BoostGuidePushLayout;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p153l.C21545y9;
import p153l.a5i0;
import p153l.adc0;
import p153l.bnl0;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.q83;
import p153l.ric0;
import p153l.v83;

/* JADX INFO: loaded from: classes11.dex */
public class BoostGuidePushLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f22030a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f22031b;

    /* JADX INFO: renamed from: c */
    public TextView f22032c;

    /* JADX INFO: renamed from: d */
    public View f22033d;

    public BoostGuidePushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37181a(Act act, View view) {
        i4g0.m138523u("e_boost_pop", "p_suggest_users_home_view", jyb.m147494Y("button_type", "open"));
        q83.m175748d().f156070f = false;
        q83.m175748d().m175750b();
        C21545y9.m214784c(act, false, "p_home,accelerate_banner");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m37182b(View view) {
        i4g0.m138523u("e_boost_pop", "p_suggest_users_home_view", jyb.m147494Y("button_type", "close"));
        q83.m175748d().f156066b = false;
        q83.m175748d().m175750b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m37183c(View view) {
        i4g0.m138523u("e_boost_pop", "p_suggest_users_home_view", jyb.m147494Y("button_type", "close"));
        q83.m175748d().f156070f = false;
        q83.m175748d().m175750b();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m37184d(Act act, View view) {
        i4g0.m138523u("e_boost_pop", "p_suggest_users_home_view", jyb.m147494Y("button_type", "open"));
        q83.m175748d().f156066b = false;
        q83.m175748d().m175750b();
        v83.m200286f(act, false, "p_suggest_users_home_view,e_boost_pop,click");
    }

    /* JADX INFO: renamed from: e */
    public void m37185e(final Act act) {
        boolean zM181583m = ric0.m181583m();
        TextView textView = this.f22032c;
        if (zM181583m) {
            bnl0.m105515H0(textView, joa.m146367S3() ? "获取" : "使用");
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga").autoPlay(true).into(this.f22031b);
            i4g0.m138526x("e_boost_pop", "p_suggest_users_home_view");
            bnl0.m105509E0(this.f22032c, new View.OnClickListener() { // from class: l.r83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostGuidePushLayout.m37181a(act, view);
                }
            });
            bnl0.m105509E0(this.f22033d, new View.OnClickListener() { // from class: l.s83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostGuidePushLayout.m37183c(view);
                }
            });
            return;
        }
        bnl0.m105515H0(textView, a5i0.m96174v() ? "获取" : "使用");
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga").autoPlay(true).into(this.f22031b);
        i4g0.m138526x("e_boost_pop", "p_suggest_users_home_view");
        bnl0.m105509E0(this.f22032c, new View.OnClickListener() { // from class: l.t83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuidePushLayout.m37184d(act, view);
            }
        });
        bnl0.m105509E0(this.f22033d, new View.OnClickListener() { // from class: l.u83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuidePushLayout.m37182b(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f22030a = (TextView) findViewById(adc0.f70613ve);
        this.f22031b = (SVGAnimationView) findViewById(adc0.f70531r0);
        this.f22032c = (TextView) findViewById(adc0.f70337f9);
        this.f22033d = findViewById(adc0.f69806A1);
        this.f22030a.setTypeface(Typeface.defaultFromStyle(1));
        this.f22032c.setTypeface(Typeface.defaultFromStyle(1));
    }

    public BoostGuidePushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostGuidePushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
