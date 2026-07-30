package com.p046p1.mobile.putong.core.newui.boost;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.boost.BoostGuidePushLayout;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p149l.C16319da;
import p149l.b83;
import p149l.g83;
import p149l.lac0;
import p149l.swh0;
import p149l.u4c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class BoostGuidePushLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f21288a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f21289b;

    /* JADX INFO: renamed from: c */
    public TextView f21290c;

    /* JADX INFO: renamed from: d */
    public View f21291d;

    public BoostGuidePushLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m36178a(Act act, View view) {
        zvf0.m220399u("e_boost_pop", "p_suggest_users_home_view", vwb.m200311Y("button_type", "open"));
        b83.m100710d().f74041f = false;
        b83.m100710d().m100712b();
        C16319da.m110497c(act, false, "p_home,accelerate_banner");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m36179b(View view) {
        zvf0.m220399u("e_boost_pop", "p_suggest_users_home_view", vwb.m200311Y("button_type", "close"));
        b83.m100710d().f74037b = false;
        b83.m100710d().m100712b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m36180c(View view) {
        zvf0.m220399u("e_boost_pop", "p_suggest_users_home_view", vwb.m200311Y("button_type", "close"));
        b83.m100710d().f74041f = false;
        b83.m100710d().m100712b();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m36181d(Act act, View view) {
        zvf0.m220399u("e_boost_pop", "p_suggest_users_home_view", vwb.m200311Y("button_type", "open"));
        b83.m100710d().f74037b = false;
        b83.m100710d().m100712b();
        g83.m124743f(act, false, "p_suggest_users_home_view,e_boost_pop,click");
    }

    /* JADX INFO: renamed from: e */
    public void m36182e(final Act act) {
        boolean zM149136m = lac0.m149136m();
        TextView textView = this.f21290c;
        if (zM149136m) {
            xdl0.m208335H0(textView, xma.m210053R3() ? "获取" : "使用");
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga").autoPlay(true).into(this.f21289b);
            zvf0.m220402x("e_boost_pop", "p_suggest_users_home_view");
            xdl0.m208329E0(this.f21290c, new View.OnClickListener() { // from class: l.c83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostGuidePushLayout.m36178a(act, view);
                }
            });
            xdl0.m208329E0(this.f21291d, new View.OnClickListener() { // from class: l.d83
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BoostGuidePushLayout.m36180c(view);
                }
            });
            return;
        }
        xdl0.m208335H0(textView, swh0.m186269v() ? "获取" : "使用");
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/41db580d-31c8-4180-8063-c656e986409212.svga").autoPlay(true).into(this.f21289b);
        zvf0.m220402x("e_boost_pop", "p_suggest_users_home_view");
        xdl0.m208329E0(this.f21290c, new View.OnClickListener() { // from class: l.e83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuidePushLayout.m36181d(act, view);
            }
        });
        xdl0.m208329E0(this.f21291d, new View.OnClickListener() { // from class: l.f83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BoostGuidePushLayout.m36179b(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f21288a = (TextView) findViewById(u4c0.f174471se);
        this.f21289b = (SVGAnimationView) findViewById(u4c0.f174440r0);
        this.f21290c = (TextView) findViewById(u4c0.f174212d9);
        this.f21291d = findViewById(u4c0.f173718A1);
        this.f21288a.setTypeface(Typeface.defaultFromStyle(1));
        this.f21290c.setTypeface(Typeface.defaultFromStyle(1));
    }

    public BoostGuidePushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostGuidePushLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
