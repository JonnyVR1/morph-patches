package com.p000p1.mobile.putong.feed.newui.status.display.view;

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
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Owner;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bkb0;
import l.e51;
import l.qib0;
import l.t100;
import l.vwb;
import p007l.f3c0;
import p007l.rog;
import p007l.vqg;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f4359a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4360b;

    /* JADX INFO: renamed from: c */
    public VText f4361c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f4362d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4363e;

    /* JADX INFO: renamed from: f */
    public VText f4364f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f4365g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f4366h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f4367i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f4368j;

    /* JADX INFO: renamed from: k */
    public final List<BubbleInfo> f4369k;

    /* JADX INFO: renamed from: l */
    public int f4370l;

    /* JADX INFO: renamed from: m */
    public boolean f4371m;

    /* JADX INFO: renamed from: n */
    public boolean f4372n;

    /* JADX INFO: renamed from: o */
    public Runnable f4373o;

    /* JADX INFO: renamed from: p */
    public List<String> f4374p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView$a */
    public class C2189a implements Animator.AnimatorListener {
        public C2189a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedAutoScrollView.this.f4365g.setTranslationY(FeedAutoScrollView.this.getHeight());
            FeedAutoScrollView.this.f4365g.setAlpha(1.0f);
            ConstraintLayout constraintLayout = FeedAutoScrollView.this.f4366h;
            FeedAutoScrollView feedAutoScrollView = FeedAutoScrollView.this;
            feedAutoScrollView.f4366h = feedAutoScrollView.f4365g;
            FeedAutoScrollView.this.f4365g = constraintLayout;
            FeedAutoScrollView.this.f4370l++;
            FeedAutoScrollView.this.m6885n();
            e51.J(FeedAutoScrollView.this.f4373o);
            FeedAutoScrollView feedAutoScrollView2 = FeedAutoScrollView.this;
            if (feedAutoScrollView2.f4372n) {
                return;
            }
            if (feedAutoScrollView2.f4371m || feedAutoScrollView2.f4370l < FeedAutoScrollView.this.f4369k.size()) {
                e51.H(FeedAutoScrollView.this.getContext(), FeedAutoScrollView.this.f4373o, 3000L);
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
        this.f4369k = new ArrayList();
        this.f4371m = true;
        this.f4372n = false;
        this.f4373o = new Runnable() { // from class: l.qog
            @Override // java.lang.Runnable
            public final void run() {
                this.f12334a.m6884m();
            }
        };
    }

    public List<BubbleInfo> getBubbleInfoLists() {
        return this.f4369k;
    }

    public int getCurrentIndex() {
        return this.f4370l;
    }

    /* JADX INFO: renamed from: j */
    public final void m6881j(View view) {
        rog.m13941a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public AnimatorSet m6882k() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f4365g, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f4365g, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f4366h, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: l */
    public boolean m6883l() {
        return !vwb.J(this.f4369k) && this.f4369k.size() > 1;
    }

    /* JADX INFO: renamed from: n */
    public void m6885n() {
        List<BubbleInfo> list = this.f4369k;
        if (list == null || list.size() == 0 || !NullChecker.a(this.f4366h) || !m6883l()) {
            return;
        }
        List<BubbleInfo> list2 = this.f4369k;
        BubbleInfo bubbleInfo = list2.get((this.f4370l + 1) % list2.size());
        VText childAt = this.f4366h.getChildAt(1);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f4374p.contains(str)) {
                str = "找人一起" + str;
            }
        }
        Owner owner = bubbleInfo.owner;
        String strConcat = "";
        if (owner != null && !TextUtils.isEmpty(owner.f264id)) {
            User userM16628e8 = FeedModule.f316d.m16628e8(bubbleInfo.owner.f264id);
            strConcat = userM16628e8 != null ? userM16628e8.name : "";
            if (!TextUtils.isEmpty(strConcat) && strConcat.length() > 4) {
                strConcat = strConcat.substring(0, 4).concat("...");
            }
            if (!TextUtils.isEmpty(strConcat)) {
                str = strConcat + "：" + str;
            }
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 33);
        childAt.setText(spannableString);
        VDraweeView childAt2 = this.f4366h.getChildAt(0);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            childAt2.setImageResource(f3c0.f7739X4);
            return;
        }
        bkb0 bkb0Var = qib0.G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.v;
        bkb0Var.I0(childAt2, str2, i, i);
    }

    /* JADX INFO: renamed from: o */
    public void m6886o() {
        List<BubbleInfo> list = this.f4369k;
        if (list == null || list.size() == 0 || !NullChecker.a(this.f4365g)) {
            return;
        }
        BubbleInfo bubbleInfo = this.f4369k.get(this.f4370l);
        VText childAt = this.f4365g.getChildAt(1);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f4374p.contains(str)) {
                str = "找人一起" + str;
            }
        }
        Owner owner = bubbleInfo.owner;
        String strConcat = "";
        if (owner != null && !TextUtils.isEmpty(owner.f264id)) {
            User userM16628e8 = FeedModule.f316d.m16628e8(bubbleInfo.owner.f264id);
            strConcat = userM16628e8 != null ? userM16628e8.name : "";
            if (!TextUtils.isEmpty(strConcat) && strConcat.length() > 4) {
                strConcat = strConcat.substring(0, 4).concat("...");
            }
            if (!TextUtils.isEmpty(strConcat)) {
                str = strConcat + "：" + str;
            }
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 33);
        childAt.setText(spannableString);
        VDraweeView childAt2 = this.f4365g.getChildAt(0);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            childAt2.setImageResource(f3c0.f7739X4);
            return;
        }
        bkb0 bkb0Var = qib0.G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.v;
        bkb0Var.I0(childAt2, str2, i, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4372n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4372n = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6881j(this);
        this.f4374p = vqg.m15543u();
        this.f4366h = this.f4362d;
        this.f4365g = this.f4359a;
        this.f4368j = new C2189a();
    }

    /* JADX INFO: renamed from: p */
    public void m6887p() {
        e51.J(this.f4373o);
        if (m6883l()) {
            e51.H(getContext(), this.f4373o, 3000L);
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m6884m() {
        e51.J(this.f4373o);
        if (!(NullChecker.a(this.f4367i) && this.f4367i.isRunning()) && m6883l()) {
            this.f4366h.setTranslationY(getHeight());
            this.f4366h.setVisibility(0);
            AnimatorSet animatorSetM6882k = m6882k();
            this.f4367i = animatorSetM6882k;
            animatorSetM6882k.addListener(this.f4368j);
            this.f4367i.start();
        }
    }

    public void setBubbleInfo(BubbleInfo bubbleInfo) {
        this.f4369k.clear();
        this.f4369k.add(bubbleInfo);
        setCurrentIndex(0);
    }

    public void setBubbleInfoList(List<BubbleInfo> list) {
        this.f4369k.clear();
        this.f4369k.addAll(list);
        setCurrentIndex(0);
    }

    public void setCurrentIndex(int i) {
        this.f4370l = i;
        m6885n();
        m6886o();
    }

    public FeedAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedAutoScrollView(@NonNull Context context) {
        this(context, null);
    }
}
