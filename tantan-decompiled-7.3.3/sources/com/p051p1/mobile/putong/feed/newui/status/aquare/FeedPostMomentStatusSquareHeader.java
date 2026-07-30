package com.p051p1.mobile.putong.feed.newui.status.aquare;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import org.json.JSONObject;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.h3i;
import p153l.i4g0;
import p153l.pf60;
import p153l.yuh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostMomentStatusSquareHeader extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPostMomentStatusSquareHeader f43559c;

    /* JADX INFO: renamed from: d */
    public VImage f43560d;

    /* JADX INFO: renamed from: e */
    public VText f43561e;

    public FeedPostMomentStatusSquareHeader(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m66649R(View view) {
        h3i.m133487e((Act) getContext());
        i4g0.m138523u("e_set_my_state", "p_moment_post", pf60.m172085a("source_page", "p_moment_post"));
    }

    /* JADX INFO: renamed from: Q */
    public final void m66650Q(View view) {
        yuh.m217383a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66650Q(this);
        bnl0.m105509E0(this.f43559c, new View.OnClickListener() { // from class: l.xuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196284a.m66649R(view);
            }
        });
        String string = "分享今日状态";
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("moment_post_status_config");
            if (!TextUtils.isEmpty(strM80485F)) {
                string = new JSONObject(strM80485F).getString("content");
            }
        } catch (Exception unused) {
        }
        this.f43561e.setText(string);
        i4g0.m138492A("e_set_my_state", "p_moment_post", pf60.m172085a("source_page", "p_moment_post"));
    }

    public FeedPostMomentStatusSquareHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostMomentStatusSquareHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
