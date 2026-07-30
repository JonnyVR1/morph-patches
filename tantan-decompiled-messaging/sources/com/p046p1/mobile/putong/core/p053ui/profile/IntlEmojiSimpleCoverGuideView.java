package com.p046p1.mobile.putong.core.p053ui.profile;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.settings.addemoji.AddEmojiAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.SimpleCoverGuideView;
import p147v.VDraweeView;
import p149l.e51;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class IntlEmojiSimpleCoverGuideView extends SimpleCoverGuideView implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c */
    public ImageView f32944c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f32945d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f32946e;

    /* JADX INFO: renamed from: f */
    public Runnable f32947f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.IntlEmojiSimpleCoverGuideView$a */
    public static class C8621a extends SimpleCoverGuideView.C22532a<C8621a> {

        /* JADX INFO: renamed from: e */
        public View f32948e;

        /* JADX INFO: renamed from: f */
        public View f32949f;

        /* JADX INFO: renamed from: g */
        public Activity f32950g;

        /* JADX INFO: renamed from: h */
        public User f32951h;
    }

    @Override // p147v.SimpleCoverGuideView
    /* JADX INFO: renamed from: e */
    public void mo50581e(boolean z) {
        e51.m114745J(this.f32947f);
        if (NullChecker.m81303a(getParent())) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        super.mo50581e(z);
    }

    /* JADX INFO: renamed from: i */
    public C8621a m50582i() {
        return (C8621a) super.m222898b();
    }

    /* JADX INFO: renamed from: j */
    public final void m50583j() {
        int[] iArr = new int[2];
        m50582i().f32948e.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int height = m50582i().f32948e.getHeight();
        int width = m50582i().f32948e.getWidth();
        int iM186890d = ((height / 2) + i2) - t100.m186890d(31.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32944c.getLayoutParams();
        layoutParams.topMargin = Math.max(0, iM186890d);
        layoutParams.leftMargin = ((width / 2) + i) - t100.m186890d(31.0f);
        this.f32944c.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f32945d.getLayoutParams();
        layoutParams2.topMargin = i2;
        layoutParams2.leftMargin = i;
        this.f32945d.setLayoutParams(layoutParams2);
        if (!vwb.m200296J(m50582i().f32951h.profile.extensions.interest.emoji)) {
            qib0.f154691G.m102331L0(this.f32945d, qib0.f154709X.m126254n(m50582i().f32951h.profile.extensions.interest.emoji.get(0)) + ".png");
        }
        m50582i().f32949f.getLocationInWindow(iArr);
        xdl0.m208360X(this.f32946e, Math.max(t100.m186890d(40.0f), (iArr[1] - iM186890d) - t100.m186890d(62.0f)));
        xdl0.m208329E0(this.f32946e, new View.OnClickListener() { // from class: l.ban
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74706a.m50584k(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m50584k(View view) {
        m50582i().f32950g.startActivity(AddEmojiAct.m55230Z1(m50582i().f32950g, "other_profile_first"));
        m222900d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.m114745J(this.f32947f);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m50583j();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        m222900d();
        return true;
    }
}
