package com.p000p1.mobile.putong.core.newui.boost;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.boost.BoostGuidePushLayout;
import com.p1.mobile.android.app.Act;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.da;
import l.g83;
import l.j760;
import l.lac0;
import l.swh0;
import l.u4c0;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import p009l.b83;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BoostGuidePushLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f66a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f67b;

    /* JADX INFO: renamed from: c */
    public TextView f68c;

    /* JADX INFO: renamed from: d */
    public View f69d;

    public BoostGuidePushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79a(Act act, View view) {
        zvf0.u("e_boost_pop", "p_suggest_users_home_view", new j760[]{vwb.Y("button_type", "open")});
        b83.m11899d().f9952f = false;
        b83.m11899d().m11901b();
        da.c(act, false, "p_home,accelerate_banner");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80b(View view) {
        zvf0.u("e_boost_pop", "p_suggest_users_home_view", new j760[]{vwb.Y("button_type", "close")});
        b83.m11899d().f9948b = false;
        b83.m11899d().m11901b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m81c(View view) {
        zvf0.u("e_boost_pop", "p_suggest_users_home_view", new j760[]{vwb.Y("button_type", "close")});
        b83.m11899d().f9952f = false;
        b83.m11899d().m11901b();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m82d(Act act, View view) {
        zvf0.u("e_boost_pop", "p_suggest_users_home_view", new j760[]{vwb.Y("button_type", "open")});
        b83.m11899d().f9948b = false;
        b83.m11899d().m11901b();
        g83.f(act, false, "p_suggest_users_home_view,e_boost_pop,click");
    }

    /* JADX INFO: renamed from: e */
    public void m83e(final Act act) {
        boolean zM = lac0.m();
        TextView textView = this.f68c;
        if (zM) {
            xdl0.H0(textView, xma.R3() ? "获取" : "使用");
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga").autoPlay(true).into(this.f67b);
            zvf0.x("e_boost_pop", "p_suggest_users_home_view");
            xdl0.E0(this.f68c, new View.OnClickListener() { // from class: l.c83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostGuidePushLayout.m79a(act, view);
                }
            });
            xdl0.E0(this.f69d, new View.OnClickListener() { // from class: l.d83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostGuidePushLayout.m81c(view);
                }
            });
            return;
        }
        xdl0.H0(textView, swh0.v() ? "获取" : "使用");
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga").autoPlay(true).into(this.f67b);
        zvf0.x("e_boost_pop", "p_suggest_users_home_view");
        xdl0.E0(this.f68c, new View.OnClickListener() { // from class: l.e83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuidePushLayout.m82d(act, view);
            }
        });
        xdl0.E0(this.f69d, new View.OnClickListener() { // from class: l.f83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuidePushLayout.m80b(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f66a = (TextView) findViewById(u4c0.se);
        this.f67b = findViewById(u4c0.r0);
        this.f68c = (TextView) findViewById(u4c0.d9);
        this.f69d = findViewById(u4c0.A1);
        this.f66a.setTypeface(Typeface.defaultFromStyle(1));
        this.f68c.setTypeface(Typeface.defaultFromStyle(1));
    }

    public BoostGuidePushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostGuidePushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
