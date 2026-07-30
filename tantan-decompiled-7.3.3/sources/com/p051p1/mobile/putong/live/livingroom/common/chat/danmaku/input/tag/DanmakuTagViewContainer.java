package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.tag;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuTag;
import p153l.a3c;
import p153l.bnl0;
import p153l.dw40;
import p153l.fc2;
import p153l.i4g0;
import p153l.iam;
import p153l.obc0;
import p153l.qa00;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuTagViewContainer extends LinearLayout implements iam<a3c<dw40>> {

    /* JADX INFO: renamed from: a */
    public a3c<dw40> f49689a;

    public DanmakuTagViewContainer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m73761e(View view) {
        this.f49689a.m95795e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m73762f(View view) {
        this.f49689a.m95794d4();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(a3c<dw40> a3cVar) {
        this.f49689a = a3cVar;
    }

    /* JADX INFO: renamed from: d */
    public void m73764d(float f, boolean z) {
        if (z) {
            bnl0.m105524M(this, false);
        }
        setAlpha(f);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: i */
    public void m73765i() {
        removeAllViews();
        Context context = getContext();
        DanmakuTag danmakuTag = (DanmakuTag) View.inflate(context, yec0.f198967X, null);
        danmakuTag.setOnClickListener(new View.OnClickListener() { // from class: l.b3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74722a.m73761e(view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, bnl0.m105587w(40.0f));
        int i = qa00.f156323j;
        layoutParams.setMarginStart(i);
        danmakuTag.m73702b(obc0.f146070I8, R$string.f48437ve, -1, fc2.m124971a(-30697, i, false), true);
        addView(danmakuTag, layoutParams);
        DanmakuTag danmakuTag2 = (DanmakuTag) View.inflate(context, yec0.f198967X, null);
        danmakuTag2.setOnClickListener(new View.OnClickListener() { // from class: l.c3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79591a.m73762f(view);
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, bnl0.m105587w(40.0f));
        layoutParams2.setMarginStart(qa00.f156322i);
        danmakuTag2.m73702b(obc0.f146058H8, R$string.f47838U2, -419430401, fc2.m124971a(-434562786, i, false), false);
        addView(danmakuTag2, layoutParams2);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m73766j(float f) {
        if (getChildCount() == 0) {
            m73765i();
        }
        setAlpha(f);
        if (getVisibility() != 0) {
            bnl0.m105524M(this, true);
            i4g0.m138526x("e_live_bullet_storm_entrance", this.f49689a.mo78457R2());
        }
    }
}
