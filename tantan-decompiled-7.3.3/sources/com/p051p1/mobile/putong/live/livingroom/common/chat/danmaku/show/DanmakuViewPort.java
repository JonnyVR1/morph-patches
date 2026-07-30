package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

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
import com.p051p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.csl;
import p153l.i4g0;
import p153l.iam;
import p153l.jyb;
import p153l.qa00;
import p153l.sh3;
import p153l.u2c;
import p153l.u3c;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuViewPort extends FrameLayout implements iam<u3c>, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g */
    public static final int f49700g = qa00.f156324k;

    /* JADX INFO: renamed from: h */
    public static final int f49701h = bnl0.m105592y0() * 2;

    /* JADX INFO: renamed from: i */
    public static final int f49702i = qa00.m175859d(32.0f);

    /* JADX INFO: renamed from: a */
    public u3c f49703a;

    /* JADX INFO: renamed from: b */
    public final List<FrameLayout.LayoutParams> f49704b;

    /* JADX INFO: renamed from: c */
    public boolean f49705c;

    /* JADX INFO: renamed from: d */
    public final Choreographer f49706d;

    /* JADX INFO: renamed from: e */
    public final int f49707e;

    /* JADX INFO: renamed from: f */
    public int f49708f;

    public DanmakuViewPort(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList(3);
        this.f49704b = arrayList;
        this.f49706d = Choreographer.getInstance();
        int i = f49701h;
        int i2 = f49702i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.topMargin = (i2 * 2) + bnl0.m105587w(48.0f);
        arrayList.add(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i2);
        layoutParams2.topMargin = bnl0.m105587w(24.0f) + i2;
        arrayList.add(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i, i2);
        layoutParams3.topMargin = bnl0.m105587w(8.0f);
        arrayList.add(layoutParams3);
        this.f49707e = (int) ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: k */
    private void m73782k() {
        if (this.f49705c) {
            return;
        }
        this.f49705c = true;
        this.f49706d.postFrameCallback(this);
    }

    /* JADX INFO: renamed from: l */
    private void m73783l() {
        this.f49706d.removeFrameCallback(this);
        this.f49705c = false;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m73784c(int i, csl cslVar) {
        View view;
        IntlVoiceDanmakuItem intlVoiceDanmakuItem;
        View view2;
        ViewGroup.LayoutParams calculateParams = this.f49704b.get(i - 1);
        if (cslVar instanceof DanmakuItem) {
            view2 = (DanmakuItem) cslVar;
        } else if (cslVar instanceof IntlVoiceDanmakuItem) {
            intlVoiceDanmakuItem = (IntlVoiceDanmakuItem) cslVar;
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

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u3c u3cVar) {
        this.f49703a = u3cVar;
    }

    @Override // p153l.iam
    public void destroy() {
        u2c.m194254a();
        m73783l();
        removeAllViews();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f49705c) {
            int childCount = getChildCount();
            if (childCount == 0) {
                m73783l();
                return;
            }
            boolean zM73786e = m73786e(new int[0]);
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    m73790m(childAt);
                }
            }
            if (!zM73786e && m73786e(new int[0])) {
                this.f49703a.m194357g4();
            }
            this.f49706d.postFrameCallback(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: e */
    public boolean m73786e(int... iArr) {
        if (this.f49703a.m213810E2().m168498Z0()) {
            return m73787f(3);
        }
        if (iArr == null) {
            return m73787f(1) || m73787f(2) || m73787f(3);
        }
        for (int i : iArr) {
            if (m73787f(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m73787f(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (((FrameLayout.LayoutParams) childAt.getLayoutParams()).topMargin == this.f49704b.get(i - 1).topMargin && Math.abs(childAt.getTranslationX()) < childAt.getWidth() + f49700g) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m73788i(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f49703a.m194358h4(bulletCommentInfo);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v28, types: [l.oo2] */
    /* JADX INFO: renamed from: j */
    public void m73789j(final LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo, int... iArr) {
        csl cslVarM185850g = new sh3(getContext()).m185844a(bulletCommentInfo.getMasks(0).getAvatar()).m185851h(bulletCommentInfo.getMasks(0).getAvatarConfig().getFrameConfig().getDynamicUrl()).m185857n(bulletCommentInfo.getMasks(0).getAvatarConfig().getFrameConfig().getStaticUrl()).m185845b(new x20() { // from class: l.g3c
            @Override // p153l.x20
            public final void call() {
                this.f101977a.m73788i(bulletCommentInfo);
            }
        }).m185854k(bulletCommentInfo.getMasks(0).getName()).m185858o(bulletCommentInfo.getMasks(0).getFakeType() != LongLinkLiveDanmakuMessage.FakeType.system ? -1 : (int) bulletCommentInfo.getVideoLiveBulletComment().getUserHierarchy()).m185853j(bulletCommentInfo.getVideoLiveBulletComment().getContent()).m185848e(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBorderColor()).m185849f(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBorderColorsList()).m185855l((int) bulletCommentInfo.getVideoLiveBulletComment().getStyle().getOpacity()).m185846c(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBackgroundColorsList()).m185847d(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBackgroundUrl()).m185852i(bulletCommentInfo.getVideoLiveBulletComment().getIconUrl()).m185856m(this.f49703a.m213810E2().m168498Z0()).m185850g();
        for (int i : iArr) {
            if (m73787f(i)) {
                m73784c(i, cslVarM185850g);
                i4g0.m138492A("e_live_bullet_chat", this.f49703a.mo78457R2(), jyb.m147494Y("anchor_id", this.f49703a.m213810E2().m168532l0().f56859id), jyb.m147494Y("bullet_price", Long.valueOf(bulletCommentInfo.getVideoLiveBulletComment().getPayAmount())), jyb.m147494Y("bullet_type", bulletCommentInfo.getVideoLiveBulletComment().getType()), jyb.m147494Y("bullet_user_id", bulletCommentInfo.getMasks(0).getUserId()), jyb.m147494Y("live_id", this.f49703a.m213810E2().m202191k()));
                m73782k();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m73790m(View view) {
        float translationX = view.getTranslationX();
        if (Math.abs(translationX) / (getWidth() + view.getWidth()) < 1.0f) {
            view.setTranslationX(translationX - this.f49708f);
            return;
        }
        removeView(view);
        view.setTranslationX(0.0f);
        u2c.m194256c((csl) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m73783l();
    }

    @Override // android.view.View
    public void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i == i3) {
            return;
        }
        jyb.m147537z(this.f49704b, new y20() { // from class: l.f3c
            @Override // p153l.y20
            public final void call(Object obj) {
                ((FrameLayout.LayoutParams) obj).setMarginStart(i);
            }
        });
        this.f49708f = (int) Math.ceil(i / (6000.0f / (1000.0f / this.f49707e)));
    }
}
