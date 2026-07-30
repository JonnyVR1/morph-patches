package com.p051p1.mobile.putong.live.external.square.search.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.LiveAnchorLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.LivingNewTagView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.hlt;
import p153l.i0k;
import p153l.jyn0;
import p153l.qa00;
import p153l.tbs;
import p153l.wft;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSearchAnchorItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f47083a;

    /* JADX INFO: renamed from: b */
    public LivingNewTagView f47084b;

    /* JADX INFO: renamed from: c */
    public VImage f47085c;

    /* JADX INFO: renamed from: d */
    public VText f47086d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f47087e;

    /* JADX INFO: renamed from: f */
    public VText f47088f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f47089g;

    /* JADX INFO: renamed from: h */
    public AnimEffectPlayer f47090h;

    /* JADX INFO: renamed from: i */
    public VText f47091i;

    /* JADX INFO: renamed from: j */
    public VButton f47092j;

    public LiveSearchAnchorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72021a(View view) {
        hlt.m135775a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72022b(User user) {
        LiveAnchorLevel liveAnchorLevel = user.anchorHierarchy;
        if (liveAnchorLevel != null && liveAnchorLevel.grade == 0) {
            bnl0.m105524M(this.f47087e, false);
            return;
        }
        BLiveAnchorLevel bLiveAnchorLevelM143703e = tbs.f172993f.m143703e(liveAnchorLevel.grade);
        if (bLiveAnchorLevelM143703e == null || TextUtils.isEmpty(bLiveAnchorLevelM143703e.backendUrl)) {
            bnl0.m105524M(this.f47087e, false);
        } else {
            bnl0.m105524M(this.f47087e, true);
            i0k.m137976c(bLiveAnchorLevelM143703e.backendUrl, this.f47087e, i0k.f112378a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m72023c(String str) {
        this.f47086d.setTextColor(jyn0.m147608e(str).mo192549e());
        this.f47088f.setTextColor(jyn0.m147608e(str).mo192553i());
        this.f47092j.setBackgroundResource(jyn0.m147608e(str).mo192547c());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72021a(this);
        if (!wft.m206159b(2)) {
            this.f47092j.setMaxWidth(qa00.m175859d(140.0f));
            this.f47092j.setSingleLine(true);
            this.f47092j.setEllipsize(TextUtils.TruncateAt.END);
        }
        VText vText = this.f47086d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f47092j.setTypeface(typeface);
    }

    public LiveSearchAnchorItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveSearchAnchorItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
