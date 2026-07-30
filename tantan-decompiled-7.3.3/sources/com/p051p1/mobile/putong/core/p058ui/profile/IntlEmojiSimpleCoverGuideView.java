package com.p051p1.mobile.putong.core.p058ui.profile;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.settings.addemoji.AddEmojiAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.SimpleCoverGuideView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.jyb;
import p153l.l51;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes4.dex */
public class IntlEmojiSimpleCoverGuideView extends SimpleCoverGuideView implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c */
    public ImageView f33792c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f33793d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f33794e;

    /* JADX INFO: renamed from: f */
    public Runnable f33795f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.IntlEmojiSimpleCoverGuideView$a */
    public static class C8784a extends SimpleCoverGuideView.C22647a<C8784a> {

        /* JADX INFO: renamed from: e */
        public View f33796e;

        /* JADX INFO: renamed from: f */
        public View f33797f;

        /* JADX INFO: renamed from: g */
        public Activity f33798g;

        /* JADX INFO: renamed from: h */
        public User f33799h;
    }

    @Override // p151v.SimpleCoverGuideView
    /* JADX INFO: renamed from: e */
    public void mo51764e(boolean z) {
        l51.m152890J(this.f33795f);
        if (NullChecker.m82486a(getParent())) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        super.mo51764e(z);
    }

    /* JADX INFO: renamed from: i */
    public C8784a m51765i() {
        return (C8784a) super.m224144b();
    }

    /* JADX INFO: renamed from: j */
    public final void m51766j() {
        int[] iArr = new int[2];
        m51765i().f33796e.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int height = m51765i().f33796e.getHeight();
        int width = m51765i().f33796e.getWidth();
        int iM175859d = ((height / 2) + i2) - qa00.m175859d(31.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33792c.getLayoutParams();
        layoutParams.topMargin = Math.max(0, iM175859d);
        layoutParams.leftMargin = ((width / 2) + i) - qa00.m175859d(31.0f);
        this.f33792c.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f33793d.getLayoutParams();
        layoutParams2.topMargin = i2;
        layoutParams2.leftMargin = i;
        this.f33793d.setLayoutParams(layoutParams2);
        if (!jyb.m147479J(m51765i().f33799h.profile.extensions.interest.emoji)) {
            uqb0.f180374G.m127115L0(this.f33793d, uqb0.f180392X.m135325n(m51765i().f33799h.profile.extensions.interest.emoji.get(0)) + ".png");
        }
        m51765i().f33797f.getLocationInWindow(iArr);
        bnl0.m105540X(this.f33794e, Math.max(qa00.m175859d(40.0f), (iArr[1] - iM175859d) - qa00.m175859d(62.0f)));
        bnl0.m105509E0(this.f33794e, new View.OnClickListener() { // from class: l.bcn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76188a.m51767k(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m51767k(View view) {
        m51765i().f33798g.startActivity(AddEmojiAct.m56413a2(m51765i().f33798g, "other_profile_first"));
        m224146d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l51.m152890J(this.f33795f);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m51766j();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        m224146d();
        return true;
    }
}
