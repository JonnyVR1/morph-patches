package com.p046p1.mobile.putong.feed.newui.status.aquare;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.j760;
import p149l.jth;
import p149l.s1i;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostMomentStatusSquareHeader extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPostMomentStatusSquareHeader f42711c;

    /* JADX INFO: renamed from: d */
    public VImage f42712d;

    /* JADX INFO: renamed from: e */
    public VText f42713e;

    public FeedPostMomentStatusSquareHeader(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m65466R(View view) {
        s1i.m181965e((Act) getContext());
        zvf0.m220399u("e_set_my_state", "p_moment_post", j760.m140076a("source_page", "p_moment_post"));
    }

    /* JADX INFO: renamed from: Q */
    public final void m65467Q(View view) {
        jth.m143102a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65467Q(this);
        xdl0.m208329E0(this.f42711c, new View.OnClickListener() { // from class: l.ith
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114882a.m65466R(view);
            }
        });
        String string = "分享今日状态";
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("moment_post_status_config");
            if (!TextUtils.isEmpty(strM79302F)) {
                string = new JSONObject(strM79302F).getString("content");
            }
        } catch (Exception unused) {
        }
        this.f42713e.setText(string);
        zvf0.m220368A("e_set_my_state", "p_moment_post", j760.m140076a("source_page", "p_moment_post"));
    }

    public FeedPostMomentStatusSquareHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostMomentStatusSquareHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
