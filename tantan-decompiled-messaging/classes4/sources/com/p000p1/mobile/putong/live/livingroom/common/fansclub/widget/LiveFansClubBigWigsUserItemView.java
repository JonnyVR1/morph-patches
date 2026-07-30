package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import l.hxs;
import l.x8u;
import l.xdl0;
import p002l.edg;
import p002l.mas;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubBigWigsUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f5125a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5126b;

    /* JADX INFO: renamed from: c */
    public VText f5127c;

    /* JADX INFO: renamed from: d */
    public View f5128d;

    /* JADX INFO: renamed from: e */
    public VText f5129e;

    public LiveFansClubBigWigsUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m6426a(View view) {
        mas.m17790a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m6427b(double d) {
        if (edg.m12318b()) {
            return x8u.e(d);
        }
        return edg.m12319c() ? x8u.d(d) : x8u.g(d);
    }

    /* JADX INFO: renamed from: c */
    public void m6428c(BLiveLeaderboardRecord bLiveLeaderboardRecord, BLiveLeaderboardUser bLiveLeaderboardUser, String str) {
        this.f5125a.setTypeface(Typeface.DEFAULT_BOLD);
        m6429d(bLiveLeaderboardRecord.rank);
        this.f5129e.setText(String.format(str, m6427b(Double.parseDouble(bLiveLeaderboardRecord.amount))));
        if (bLiveLeaderboardUser != null) {
            this.f5127c.setText(bLiveLeaderboardUser.name);
            xdl0.M0(this.f5126b, !TextUtils.isEmpty(bLiveLeaderboardUser.imageUrl));
            hxs.s("context_single_room", this.f5126b, bLiveLeaderboardUser.imageUrl);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6429d(int i) {
        if (i == 1) {
            this.f5125a.setTextColor(-800506);
        } else if (i != 2) {
            VText vText = this.f5125a;
            if (i != 3) {
                vText.setTextColor(637534208);
            } else {
                vText.setTextColor(-91051);
            }
        } else {
            this.f5125a.setTextColor(-5130241);
        }
        this.f5125a.setText(String.valueOf(i));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6426a(this);
    }

    public LiveFansClubBigWigsUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveFansClubBigWigsUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
