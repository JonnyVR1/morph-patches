package com.p000p1.mobile.putong.feed.newui.status.aquare;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import l.j760;
import l.xdl0;
import l.zvf0;
import org.json.JSONObject;
import p007l.jth;
import p007l.s1i;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostMomentStatusSquareHeader extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPostMomentStatusSquareHeader f4172c;

    /* JADX INFO: renamed from: d */
    public VImage f4173d;

    /* JADX INFO: renamed from: e */
    public VText f4174e;

    public FeedPostMomentStatusSquareHeader(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m6592R(View view) {
        s1i.m13981e(getContext());
        zvf0.u("e_set_my_state", "p_moment_post", new j760[]{j760.a("source_page", "p_moment_post")});
    }

    /* JADX INFO: renamed from: Q */
    public final void m6593Q(View view) {
        jth.m11328a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6593Q(this);
        xdl0.E0(this.f4172c, new View.OnClickListener() { // from class: l.ith
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9133a.m6592R(view);
            }
        });
        String string = "分享今日状态";
        try {
            String strF = RemoteConfig.x().F("moment_post_status_config");
            if (!TextUtils.isEmpty(strF)) {
                string = new JSONObject(strF).getString("content");
            }
        } catch (Exception unused) {
        }
        this.f4174e.setText(string);
        zvf0.A("e_set_my_state", "p_moment_post", new j760[]{j760.a("source_page", "p_moment_post")});
    }

    public FeedPostMomentStatusSquareHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostMomentStatusSquareHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
