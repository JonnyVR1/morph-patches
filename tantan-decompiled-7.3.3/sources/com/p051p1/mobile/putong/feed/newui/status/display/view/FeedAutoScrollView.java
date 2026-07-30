package com.p051p1.mobile.putong.feed.newui.status.display.view;

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
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.fsb0;
import p153l.gqg;
import p153l.jyb;
import p153l.ksg;
import p153l.l51;
import p153l.lbc0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f43746a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43747b;

    /* JADX INFO: renamed from: c */
    public VText f43748c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f43749d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43750e;

    /* JADX INFO: renamed from: f */
    public VText f43751f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f43752g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f43753h;

    /* JADX INFO: renamed from: i */
    public AnimatorSet f43754i;

    /* JADX INFO: renamed from: j */
    public Animator.AnimatorListener f43755j;

    /* JADX INFO: renamed from: k */
    public final List<BubbleInfo> f43756k;

    /* JADX INFO: renamed from: l */
    public int f43757l;

    /* JADX INFO: renamed from: m */
    public boolean f43758m;

    /* JADX INFO: renamed from: n */
    public boolean f43759n;

    /* JADX INFO: renamed from: o */
    public Runnable f43760o;

    /* JADX INFO: renamed from: p */
    public List<String> f43761p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.view.FeedAutoScrollView$a */
    public class C11508a implements Animator.AnimatorListener {
        public C11508a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedAutoScrollView.this.f43752g.setTranslationY(FeedAutoScrollView.this.getHeight());
            FeedAutoScrollView.this.f43752g.setAlpha(1.0f);
            ConstraintLayout constraintLayout = FeedAutoScrollView.this.f43753h;
            FeedAutoScrollView feedAutoScrollView = FeedAutoScrollView.this;
            feedAutoScrollView.f43753h = feedAutoScrollView.f43752g;
            FeedAutoScrollView.this.f43752g = constraintLayout;
            FeedAutoScrollView.this.f43757l++;
            FeedAutoScrollView.this.m66922n();
            l51.m152890J(FeedAutoScrollView.this.f43760o);
            FeedAutoScrollView feedAutoScrollView2 = FeedAutoScrollView.this;
            if (feedAutoScrollView2.f43759n) {
                return;
            }
            if (feedAutoScrollView2.f43758m || feedAutoScrollView2.f43757l < FeedAutoScrollView.this.f43756k.size()) {
                l51.m152888H(FeedAutoScrollView.this.getContext(), FeedAutoScrollView.this.f43760o, 3000L);
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
        this.f43756k = new ArrayList();
        this.f43758m = true;
        this.f43759n = false;
        this.f43760o = new Runnable() { // from class: l.fqg
            @Override // java.lang.Runnable
            public final void run() {
                this.f100286a.m66921m();
            }
        };
    }

    public List<BubbleInfo> getBubbleInfoLists() {
        return this.f43756k;
    }

    public int getCurrentIndex() {
        return this.f43757l;
    }

    /* JADX INFO: renamed from: j */
    public final void m66918j(View view) {
        gqg.m131374a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public AnimatorSet m66919k() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f43752g, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f43752g, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f43753h, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: l */
    public boolean m66920l() {
        return !jyb.m147479J(this.f43756k) && this.f43756k.size() > 1;
    }

    /* JADX INFO: renamed from: n */
    public void m66922n() {
        List<BubbleInfo> list = this.f43756k;
        if (list == null || list.size() == 0 || !NullChecker.m82486a(this.f43753h) || !m66920l()) {
            return;
        }
        List<BubbleInfo> list2 = this.f43756k;
        BubbleInfo bubbleInfo = list2.get((this.f43757l + 1) % list2.size());
        VText vText = (VText) this.f43753h.getChildAt(1);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.m82486a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f43761p.contains(str)) {
                str = "找人一起" + str;
            }
        }
        Owner owner = bubbleInfo.owner;
        String strConcat = "";
        if (owner != null && !TextUtils.isEmpty(owner.f39651id)) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(bubbleInfo.owner.f39651id);
            strConcat = userM145688e8 != null ? userM145688e8.name : "";
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
        VDraweeView vDraweeView = (VDraweeView) this.f43753h.getChildAt(0);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            vDraweeView.setImageResource(lbc0.f130974X4);
            return;
        }
        fsb0 fsb0Var = uqb0.f180374G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156335v;
        fsb0Var.m127109I0(vDraweeView, str2, i, i);
    }

    /* JADX INFO: renamed from: o */
    public void m66923o() {
        List<BubbleInfo> list = this.f43756k;
        if (list == null || list.size() == 0 || !NullChecker.m82486a(this.f43752g)) {
            return;
        }
        BubbleInfo bubbleInfo = this.f43756k.get(this.f43757l);
        VText vText = (VText) this.f43752g.getChildAt(1);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.m82486a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f43761p.contains(str)) {
                str = "找人一起" + str;
            }
        }
        Owner owner = bubbleInfo.owner;
        String strConcat = "";
        if (owner != null && !TextUtils.isEmpty(owner.f39651id)) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(bubbleInfo.owner.f39651id);
            strConcat = userM145688e8 != null ? userM145688e8.name : "";
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
        VDraweeView vDraweeView = (VDraweeView) this.f43752g.getChildAt(0);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            vDraweeView.setImageResource(lbc0.f130974X4);
            return;
        }
        fsb0 fsb0Var = uqb0.f180374G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156335v;
        fsb0Var.m127109I0(vDraweeView, str2, i, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43759n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43759n = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66918j(this);
        this.f43761p = ksg.m151232u();
        this.f43753h = this.f43749d;
        this.f43752g = this.f43746a;
        this.f43755j = new C11508a();
    }

    /* JADX INFO: renamed from: p */
    public void m66924p() {
        l51.m152890J(this.f43760o);
        if (m66920l()) {
            l51.m152888H(getContext(), this.f43760o, 3000L);
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m66921m() {
        l51.m152890J(this.f43760o);
        if (!(NullChecker.m82486a(this.f43754i) && this.f43754i.isRunning()) && m66920l()) {
            this.f43753h.setTranslationY(getHeight());
            this.f43753h.setVisibility(0);
            AnimatorSet animatorSetM66919k = m66919k();
            this.f43754i = animatorSetM66919k;
            animatorSetM66919k.addListener(this.f43755j);
            this.f43754i.start();
        }
    }

    public void setBubbleInfo(BubbleInfo bubbleInfo) {
        this.f43756k.clear();
        this.f43756k.add(bubbleInfo);
        setCurrentIndex(0);
    }

    public void setBubbleInfoList(List<BubbleInfo> list) {
        this.f43756k.clear();
        this.f43756k.addAll(list);
        setCurrentIndex(0);
    }

    public void setCurrentIndex(int i) {
        this.f43757l = i;
        m66922n();
        m66923o();
    }

    public FeedAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedAutoScrollView(@NonNull Context context) {
        this(context, null);
    }
}
