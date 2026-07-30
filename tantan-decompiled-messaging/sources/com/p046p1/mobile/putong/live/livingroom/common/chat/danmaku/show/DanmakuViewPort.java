package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.ArrayList;
import java.util.List;
import p149l.d30;
import p149l.e30;
import p149l.eh3;
import p149l.h1c;
import p149l.h2c;
import p149l.ppl;
import p149l.s7m;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuViewPort extends FrameLayout implements s7m<h2c>, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g */
    public static final int f48852g = t100.f167262k;

    /* JADX INFO: renamed from: h */
    public static final int f48853h = xdl0.m208412y0() * 2;

    /* JADX INFO: renamed from: i */
    public static final int f48854i = t100.m186890d(32.0f);

    /* JADX INFO: renamed from: a */
    public h2c f48855a;

    /* JADX INFO: renamed from: b */
    public final List<FrameLayout.LayoutParams> f48856b;

    /* JADX INFO: renamed from: c */
    public boolean f48857c;

    /* JADX INFO: renamed from: d */
    public final Choreographer f48858d;

    /* JADX INFO: renamed from: e */
    public final int f48859e;

    /* JADX INFO: renamed from: f */
    public int f48860f;

    public DanmakuViewPort(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList(3);
        this.f48856b = arrayList;
        this.f48858d = Choreographer.getInstance();
        int i = f48853h;
        int i2 = f48854i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.topMargin = (i2 * 2) + xdl0.m208407w(48.0f);
        arrayList.add(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i2);
        layoutParams2.topMargin = xdl0.m208407w(24.0f) + i2;
        arrayList.add(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i, i2);
        layoutParams3.topMargin = xdl0.m208407w(8.0f);
        arrayList.add(layoutParams3);
        this.f48859e = (int) ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: k */
    private void m72599k() {
        if (this.f48857c) {
            return;
        }
        this.f48857c = true;
        this.f48858d.postFrameCallback(this);
    }

    /* JADX INFO: renamed from: l */
    private void m72600l() {
        this.f48858d.removeFrameCallback(this);
        this.f48857c = false;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m72601c(int i, ppl pplVar) {
        View view;
        IntlVoiceDanmakuItem intlVoiceDanmakuItem;
        View view2;
        ViewGroup.LayoutParams calculateParams = this.f48856b.get(i - 1);
        if (pplVar instanceof DanmakuItem) {
            view2 = (DanmakuItem) pplVar;
        } else if (pplVar instanceof IntlVoiceDanmakuItem) {
            intlVoiceDanmakuItem = (IntlVoiceDanmakuItem) pplVar;
            calculateParams = intlVoiceDanmakuItem.getCalculateParams();
        } else {
            view = null;
        }
        if (view == null) {
            view = intlVoiceDanmakuItem;
            view = view2;
            return;
        } else {
            view = intlVoiceDanmakuItem;
            view = view2;
            addView(view, calculateParams);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(h2c h2cVar) {
        this.f48855a = h2cVar;
    }

    @Override // p149l.s7m
    public void destroy() {
        h1c.m129021a();
        m72600l();
        removeAllViews();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f48857c) {
            int childCount = getChildCount();
            if (childCount == 0) {
                m72600l();
                return;
            }
            boolean zM72603e = m72603e(new int[0]);
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    m72607m(childAt);
                }
            }
            if (!zM72603e && m72603e(new int[0])) {
                this.f48855a.m129117g4();
            }
            this.f48858d.postFrameCallback(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public boolean m72603e(int... iArr) {
        if (this.f48855a.m206027E2().m132112Z0()) {
            return m72604f(3);
        }
        if (iArr == null) {
            return m72604f(1) || m72604f(2) || m72604f(3);
        }
        for (int i : iArr) {
            if (m72604f(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m72604f(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (((FrameLayout.LayoutParams) childAt.getLayoutParams()).topMargin == this.f48856b.get(i - 1).topMargin && Math.abs(childAt.getTranslationX()) < childAt.getWidth() + f48852g) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m72605i(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f48855a.m129118h4(bulletCommentInfo);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v28, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public void m72606j(final LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo, int... iArr) {
        ppl pplVarM116435g = new eh3(getContext()).m116429a(bulletCommentInfo.getMasks(0).getAvatar()).m116436h(bulletCommentInfo.getMasks(0).getAvatarConfig().getFrameConfig().getDynamicUrl()).m116442n(bulletCommentInfo.getMasks(0).getAvatarConfig().getFrameConfig().getStaticUrl()).m116430b(new d30() { // from class: l.t1c
            @Override // p149l.d30
            public final void call() {
                this.f167304a.m72605i(bulletCommentInfo);
            }
        }).m116439k(bulletCommentInfo.getMasks(0).getName()).m116443o(bulletCommentInfo.getMasks(0).getFakeType() != LongLinkLiveDanmakuMessage.FakeType.system ? -1 : (int) bulletCommentInfo.getVideoLiveBulletComment().getUserHierarchy()).m116438j(bulletCommentInfo.getVideoLiveBulletComment().getContent()).m116433e(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBorderColor()).m116434f(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBorderColorsList()).m116440l((int) bulletCommentInfo.getVideoLiveBulletComment().getStyle().getOpacity()).m116431c(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBackgroundColorsList()).m116432d(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBackgroundUrl()).m116437i(bulletCommentInfo.getVideoLiveBulletComment().getIconUrl()).m116441m(this.f48855a.m206027E2().m132112Z0()).m116435g();
        for (int i : iArr) {
            if (m72604f(i)) {
                m72601c(i, pplVarM116435g);
                zvf0.m220368A("e_live_bullet_chat", this.f48855a.mo77274R2(), vwb.m200311Y("anchor_id", this.f48855a.m206027E2().m132146l0().f56011id), vwb.m200311Y("bullet_price", Long.valueOf(bulletCommentInfo.getVideoLiveBulletComment().getPayAmount())), vwb.m200311Y("bullet_type", bulletCommentInfo.getVideoLiveBulletComment().getType()), vwb.m200311Y("bullet_user_id", bulletCommentInfo.getMasks(0).getUserId()), vwb.m200311Y("live_id", this.f48855a.m206027E2().m149814k()));
                m72599k();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m72607m(View view) {
        float translationX = view.getTranslationX();
        if (Math.abs(translationX) / (getWidth() + view.getWidth()) < 1.0f) {
            view.setTranslationX(translationX - this.f48860f);
            return;
        }
        removeView(view);
        view.setTranslationX(0.0f);
        h1c.m129023c((ppl) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72600l();
    }

    @Override // android.view.View
    public void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i == i3) {
            return;
        }
        vwb.m200354z(this.f48856b, new e30() { // from class: l.s1c
            @Override // p149l.e30
            public final void call(Object obj) {
                ((FrameLayout.LayoutParams) obj).setMarginStart(i);
            }
        });
        this.f48860f = (int) Math.ceil(i / (6000.0f / (1000.0f / this.f48859e)));
    }
}
