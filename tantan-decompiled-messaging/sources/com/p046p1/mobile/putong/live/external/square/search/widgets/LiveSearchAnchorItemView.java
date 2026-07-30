package com.p046p1.mobile.putong.live.external.square.search.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.LiveAnchorLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.LivingNewTagView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.fpn0;
import p149l.gjt;
import p149l.s9s;
import p149l.sxj;
import p149l.t100;
import p149l.vdt;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSearchAnchorItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f46235a;

    /* JADX INFO: renamed from: b */
    public LivingNewTagView f46236b;

    /* JADX INFO: renamed from: c */
    public VImage f46237c;

    /* JADX INFO: renamed from: d */
    public VText f46238d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46239e;

    /* JADX INFO: renamed from: f */
    public VText f46240f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f46241g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f46242h;

    /* JADX INFO: renamed from: i */
    public VText f46243i;

    /* JADX INFO: renamed from: j */
    public VButton f46244j;

    public LiveSearchAnchorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m70838a(View view) {
        gjt.m126563a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m70839b(User user) {
        LiveAnchorLevel liveAnchorLevel = user.anchorHierarchy;
        if (liveAnchorLevel != null && liveAnchorLevel.grade == 0) {
            xdl0.m208344M(this.f46239e, false);
            return;
        }
        BLiveAnchorLevel bLiveAnchorLevelM134372e = s9s.f163232f.m134372e(liveAnchorLevel.grade);
        if (bLiveAnchorLevelM134372e == null || TextUtils.isEmpty(bLiveAnchorLevelM134372e.backendUrl)) {
            xdl0.m208344M(this.f46239e, false);
        } else {
            xdl0.m208344M(this.f46239e, true);
            sxj.m186442c(bLiveAnchorLevelM134372e.backendUrl, this.f46239e, sxj.f166797a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m70840c(String str) {
        this.f46238d.setTextColor(fpn0.m122615e(str).mo113371e());
        this.f46240f.setTextColor(fpn0.m122615e(str).mo113375i());
        this.f46244j.setBackgroundResource(fpn0.m122615e(str).mo113369c());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70838a(this);
        if (!vdt.m198092b(2)) {
            this.f46244j.setMaxWidth(t100.m186890d(140.0f));
            this.f46244j.setSingleLine(true);
            this.f46244j.setEllipsize(TextUtils.TruncateAt.END);
        }
        VText vText = this.f46238d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f46244j.setTypeface(typeface);
    }

    public LiveSearchAnchorItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSearchAnchorItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
