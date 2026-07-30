package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show;

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
import com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p002l.eh3;
import p002l.h1c;
import p002l.h2c;
import p002l.ppl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DanmakuViewPort extends FrameLayout implements s7m<h2c>, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g */
    public static final int f4894g = t100.k;

    /* JADX INFO: renamed from: h */
    public static final int f4895h = xdl0.y0() * 2;

    /* JADX INFO: renamed from: i */
    public static final int f4896i = t100.d(32.0f);

    /* JADX INFO: renamed from: a */
    public h2c f4897a;

    /* JADX INFO: renamed from: b */
    public final List<FrameLayout.LayoutParams> f4898b;

    /* JADX INFO: renamed from: c */
    public boolean f4899c;

    /* JADX INFO: renamed from: d */
    public final Choreographer f4900d;

    /* JADX INFO: renamed from: e */
    public final int f4901e;

    /* JADX INFO: renamed from: f */
    public int f4902f;

    public DanmakuViewPort(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList(3);
        this.f4898b = arrayList;
        this.f4900d = Choreographer.getInstance();
        int i = f4895h;
        int i2 = f4896i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.topMargin = (i2 * 2) + xdl0.w(48.0f);
        arrayList.add(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i2);
        layoutParams2.topMargin = xdl0.w(24.0f) + i2;
        arrayList.add(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i, i2);
        layoutParams3.topMargin = xdl0.w(8.0f);
        arrayList.add(layoutParams3);
        this.f4901e = (int) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: k */
    private void m6097k() {
        if (this.f4899c) {
            return;
        }
        this.f4899c = true;
        this.f4900d.postFrameCallback(this);
    }

    /* JADX INFO: renamed from: l */
    private void m6098l() {
        this.f4900d.removeFrameCallback(this);
        this.f4899c = false;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6099C0() {
        return getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: c */
    public final void m6100c(int i, ppl pplVar) {
        ?? r3;
        IntlVoiceDanmakuItem intlVoiceDanmakuItem;
        DanmakuItem danmakuItem;
        FrameLayout.LayoutParams calculateParams = this.f4898b.get(i - 1);
        if (pplVar instanceof DanmakuItem) {
            danmakuItem = (DanmakuItem) pplVar;
        } else if (pplVar instanceof IntlVoiceDanmakuItem) {
            intlVoiceDanmakuItem = (IntlVoiceDanmakuItem) pplVar;
            calculateParams = intlVoiceDanmakuItem.getCalculateParams();
        } else {
            r3 = 0;
        }
        if (r3 == 0) {
            r3 = intlVoiceDanmakuItem;
            r3 = danmakuItem;
            return;
        } else {
            r3 = intlVoiceDanmakuItem;
            r3 = danmakuItem;
            addView(r3, calculateParams);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m6105i1(h2c h2cVar) {
        this.f4897a = h2cVar;
    }

    public void destroy() {
        h1c.m14127a();
        m6098l();
        removeAllViews();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f4899c) {
            int childCount = getChildCount();
            if (childCount == 0) {
                m6098l();
                return;
            }
            boolean zM6102e = m6102e(new int[0]);
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    m6107m(childAt);
                }
            }
            if (!zM6102e && m6102e(new int[0])) {
                this.f4897a.m14155g4();
            }
            this.f4900d.postFrameCallback(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public boolean m6102e(int... iArr) {
        if (this.f4897a.m25547E2().m14548Z0()) {
            return m6103f(3);
        }
        if (iArr == null) {
            return m6103f(1) || m6103f(2) || m6103f(3);
        }
        for (int i : iArr) {
            if (m6103f(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6103f(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (((FrameLayout.LayoutParams) childAt.getLayoutParams()).topMargin == this.f4898b.get(i - 1).topMargin && Math.abs(childAt.getTranslationX()) < childAt.getWidth() + f4894g) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6104i(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f4897a.m14156h4(bulletCommentInfo);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v28, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public void m6106j(final LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo, int... iArr) {
        ppl pplVarM12524g = new eh3(getContext()).m12518a(bulletCommentInfo.getMasks(0).getAvatar()).m12525h(bulletCommentInfo.getMasks(0).getAvatarConfig().getFrameConfig().getDynamicUrl()).m12531n(bulletCommentInfo.getMasks(0).getAvatarConfig().getFrameConfig().getStaticUrl()).m12519b(new d30() { // from class: l.t1c
            public final void call() {
                this.f19360a.m6104i(bulletCommentInfo);
            }
        }).m12528k(bulletCommentInfo.getMasks(0).getName()).m12532o(bulletCommentInfo.getMasks(0).getFakeType() != LongLinkLiveDanmakuMessage.FakeType.system ? -1 : (int) bulletCommentInfo.getVideoLiveBulletComment().getUserHierarchy()).m12527j(bulletCommentInfo.getVideoLiveBulletComment().getContent()).m12522e(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBorderColor()).m12523f(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBorderColorsList()).m12529l((int) bulletCommentInfo.getVideoLiveBulletComment().getStyle().getOpacity()).m12520c(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBackgroundColorsList()).m12521d(bulletCommentInfo.getVideoLiveBulletComment().getStyle().getBackgroundUrl()).m12526i(bulletCommentInfo.getVideoLiveBulletComment().getIconUrl()).m12530m(this.f4897a.m25547E2().m14548Z0()).m12524g();
        for (int i : iArr) {
            if (m6103f(i)) {
                m6100c(i, pplVarM12524g);
                zvf0.A("e_live_bullet_chat", this.f4897a.mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) this.f4897a.m25547E2().m14582l0()).id), vwb.Y("bullet_price", Long.valueOf(bulletCommentInfo.getVideoLiveBulletComment().getPayAmount())), vwb.Y("bullet_type", bulletCommentInfo.getVideoLiveBulletComment().getType()), vwb.Y("bullet_user_id", bulletCommentInfo.getMasks(0).getUserId()), vwb.Y("live_id", this.f4897a.m25547E2().m17235k())});
                m6097k();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m6107m(View view) {
        float translationX = view.getTranslationX();
        if (Math.abs(translationX) / (getWidth() + view.getWidth()) < 1.0f) {
            view.setTranslationX(translationX - this.f4902f);
            return;
        }
        removeView(view);
        view.setTranslationX(0.0f);
        h1c.m14129c((ppl) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6098l();
    }

    @Override // android.view.View
    public void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i == i3) {
            return;
        }
        vwb.z(this.f4898b, new e30() { // from class: l.s1c
            public final void call(Object obj) {
                ((FrameLayout.LayoutParams) obj).setMarginStart(i);
            }
        });
        this.f4902f = (int) Math.ceil(i / (6000.0f / (1000.0f / this.f4901e)));
    }
}
