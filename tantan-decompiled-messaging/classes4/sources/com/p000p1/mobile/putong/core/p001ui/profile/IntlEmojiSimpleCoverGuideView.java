package com.p000p1.mobile.putong.core.p001ui.profile;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.settings.addemoji.AddEmojiAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import v.SimpleCoverGuideView;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlEmojiSimpleCoverGuideView extends SimpleCoverGuideView implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c */
    public ImageView f766c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f767d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f768e;

    /* JADX INFO: renamed from: f */
    public Runnable f769f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.IntlEmojiSimpleCoverGuideView$a */
    public static class C0046a extends SimpleCoverGuideView.a<C0046a> {

        /* JADX INFO: renamed from: e */
        public View f770e;

        /* JADX INFO: renamed from: f */
        public View f771f;

        /* JADX INFO: renamed from: g */
        public Activity f772g;

        /* JADX INFO: renamed from: h */
        public User f773h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m1017e(boolean z) {
        e51.J(this.f769f);
        if (NullChecker.a(getParent())) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        super.e(z);
    }

    /* JADX INFO: renamed from: i */
    public C0046a m1018i() {
        return (C0046a) super.b();
    }

    /* JADX INFO: renamed from: j */
    public final void m1019j() {
        int[] iArr = new int[2];
        m1018i().f770e.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int height = m1018i().f770e.getHeight();
        int width = m1018i().f770e.getWidth();
        int iD = ((height / 2) + i2) - t100.d(31.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f766c.getLayoutParams();
        layoutParams.topMargin = Math.max(0, iD);
        layoutParams.leftMargin = ((width / 2) + i) - t100.d(31.0f);
        this.f766c.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f767d.getLayoutParams();
        layoutParams2.topMargin = i2;
        layoutParams2.leftMargin = i;
        this.f767d.setLayoutParams(layoutParams2);
        if (!vwb.J(m1018i().f773h.profile.extensions.interest.emoji)) {
            qib0.G.L0(this.f767d, qib0.X.n((String) m1018i().f773h.profile.extensions.interest.emoji.get(0)) + ".png");
        }
        m1018i().f771f.getLocationInWindow(iArr);
        xdl0.X(this.f768e, Math.max(t100.d(40.0f), (iArr[1] - iD) - t100.d(62.0f)));
        xdl0.E0(this.f768e, new View.OnClickListener() { // from class: l.ban
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8050a.m1020k(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1020k(View view) {
        m1018i().f772g.startActivity(AddEmojiAct.Z1(m1018i().f772g, "other_profile_first"));
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        e51.J(this.f769f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m1019j();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super/*android.view.View*/.onKeyDown(i, keyEvent);
        }
        d();
        return true;
    }
}
