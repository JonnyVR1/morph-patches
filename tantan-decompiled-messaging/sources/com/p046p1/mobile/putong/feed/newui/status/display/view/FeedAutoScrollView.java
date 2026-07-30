package com.p046p1.mobile.putong.feed.newui.status.display.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.e51;
import p149l.f3c0;
import p149l.qib0;
import p149l.rog;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f42898a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42899b;

    /* JADX INFO: renamed from: c */
    public VText f42900c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f42901d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42902e;

    /* JADX INFO: renamed from: f */
    public VText f42903f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f42904g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f42905h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f42906i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f42907j;

    /* JADX INFO: renamed from: k */
    public final List<BubbleInfo> f42908k;

    /* JADX INFO: renamed from: l */
    public int f42909l;

    /* JADX INFO: renamed from: m */
    public boolean f42910m;

    /* JADX INFO: renamed from: n */
    public boolean f42911n;

    /* JADX INFO: renamed from: o */
    public Runnable f42912o;

    /* JADX INFO: renamed from: p */
    public List<String> f42913p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView$a */
    public class C11345a implements Animator.AnimatorListener {
        public C11345a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedAutoScrollView.this.f42904g.setTranslationY(FeedAutoScrollView.this.getHeight());
            FeedAutoScrollView.this.f42904g.setAlpha(1.0f);
            ConstraintLayout constraintLayout = FeedAutoScrollView.this.f42905h;
            FeedAutoScrollView feedAutoScrollView = FeedAutoScrollView.this;
            feedAutoScrollView.f42905h = feedAutoScrollView.f42904g;
            FeedAutoScrollView.this.f42904g = constraintLayout;
            FeedAutoScrollView.this.f42909l++;
            FeedAutoScrollView.this.m65739n();
            e51.m114745J(FeedAutoScrollView.this.f42912o);
            FeedAutoScrollView feedAutoScrollView2 = FeedAutoScrollView.this;
            if (feedAutoScrollView2.f42911n) {
                return;
            }
            if (feedAutoScrollView2.f42910m || feedAutoScrollView2.f42909l < FeedAutoScrollView.this.f42908k.size()) {
                e51.m114743H(FeedAutoScrollView.this.getContext(), FeedAutoScrollView.this.f42912o, 3000L);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public FeedAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42908k = new ArrayList();
        this.f42910m = true;
        this.f42911n = false;
        this.f42912o = new Runnable() { // from class: l.qog
            @Override // java.lang.Runnable
            public final void run() {
                this.f155564a.m65738m();
            }
        };
    }

    public List<BubbleInfo> getBubbleInfoLists() {
        return this.f42908k;
    }

    public int getCurrentIndex() {
        return this.f42909l;
    }

    /* JADX INFO: renamed from: j */
    public final void m65735j(View view) {
        rog.m180241a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public AnimatorSet m65736k() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f42904g, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f42904g, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f42905h, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: l */
    public boolean m65737l() {
        return !vwb.m200296J(this.f42908k) && this.f42908k.size() > 1;
    }

    /* JADX INFO: renamed from: n */
    public void m65739n() {
        List<BubbleInfo> list = this.f42908k;
        if (list == null || list.size() == 0 || !NullChecker.m81303a(this.f42905h) || !m65737l()) {
            return;
        }
        List<BubbleInfo> list2 = this.f42908k;
        BubbleInfo bubbleInfo = list2.get((this.f42909l + 1) % list2.size());
        VText vText = (VText) this.f42905h.getChildAt(1);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.m81303a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f42913p.contains(str)) {
                str = "找人一起" + str;
            }
        }
        Owner owner = bubbleInfo.owner;
        String strConcat = "";
        if (owner != null && !TextUtils.isEmpty(owner.f38803id)) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(bubbleInfo.owner.f38803id);
            strConcat = userM209447e8 != null ? userM209447e8.name : "";
            if (!TextUtils.isEmpty(strConcat) && strConcat.length() > 4) {
                strConcat = strConcat.substring(0, 4).concat("...");
            }
            if (!TextUtils.isEmpty(strConcat)) {
                str = strConcat + "：" + str;
            }
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 33);
        vText.setText(spannableString);
        VDraweeView vDraweeView = (VDraweeView) this.f42905h.getChildAt(0);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            vDraweeView.setImageResource(f3c0.f94456X4);
            return;
        }
        bkb0 bkb0Var = qib0.f154691G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167273v;
        bkb0Var.m102325I0(vDraweeView, str2, i, i);
    }

    /* JADX INFO: renamed from: o */
    public void m65740o() {
        List<BubbleInfo> list = this.f42908k;
        if (list == null || list.size() == 0 || !NullChecker.m81303a(this.f42904g)) {
            return;
        }
        BubbleInfo bubbleInfo = this.f42908k.get(this.f42909l);
        VText vText = (VText) this.f42904g.getChildAt(1);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.m81303a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f42913p.contains(str)) {
                str = "找人一起" + str;
            }
        }
        Owner owner = bubbleInfo.owner;
        String strConcat = "";
        if (owner != null && !TextUtils.isEmpty(owner.f38803id)) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(bubbleInfo.owner.f38803id);
            strConcat = userM209447e8 != null ? userM209447e8.name : "";
            if (!TextUtils.isEmpty(strConcat) && strConcat.length() > 4) {
                strConcat = strConcat.substring(0, 4).concat("...");
            }
            if (!TextUtils.isEmpty(strConcat)) {
                str = strConcat + "：" + str;
            }
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 33);
        vText.setText(spannableString);
        VDraweeView vDraweeView = (VDraweeView) this.f42904g.getChildAt(0);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            vDraweeView.setImageResource(f3c0.f94456X4);
            return;
        }
        bkb0 bkb0Var = qib0.f154691G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167273v;
        bkb0Var.m102325I0(vDraweeView, str2, i, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42911n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42911n = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65735j(this);
        this.f42913p = vqg.m199573u();
        this.f42905h = this.f42901d;
        this.f42904g = this.f42898a;
        this.f42907j = new C11345a();
    }

    /* JADX INFO: renamed from: p */
    public void m65741p() {
        e51.m114745J(this.f42912o);
        if (m65737l()) {
            e51.m114743H(getContext(), this.f42912o, 3000L);
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m65738m() {
        e51.m114745J(this.f42912o);
        if (!(NullChecker.m81303a(this.f42906i) && this.f42906i.isRunning()) && m65737l()) {
            this.f42905h.setTranslationY(getHeight());
            this.f42905h.setVisibility(0);
            AnimatorSet animatorSetM65736k = m65736k();
            this.f42906i = animatorSetM65736k;
            animatorSetM65736k.addListener(this.f42907j);
            this.f42906i.start();
        }
    }

    public void setBubbleInfo(BubbleInfo bubbleInfo) {
        this.f42908k.clear();
        this.f42908k.add(bubbleInfo);
        setCurrentIndex(0);
    }

    public void setBubbleInfoList(List<BubbleInfo> list) {
        this.f42908k.clear();
        this.f42908k.addAll(list);
        setCurrentIndex(0);
    }

    public void setCurrentIndex(int i) {
        this.f42909l = i;
        m65739n();
        m65740o();
    }

    public FeedAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedAutoScrollView(@NonNull Context context) {
        this(context, null);
    }
}
