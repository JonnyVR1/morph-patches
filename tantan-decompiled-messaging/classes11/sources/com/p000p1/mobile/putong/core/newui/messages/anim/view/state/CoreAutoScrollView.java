package com.p000p1.mobile.putong.core.newui.messages.anim.view.state;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Emotion;
import com.p1.mobile.putong.data.Owner;
import com.p1.mobile.putong.data.TextTheme;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bkb0;
import l.e51;
import l.j760;
import l.qib0;
import l.t100;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import l.zy6;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreAutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f4433a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4434b;

    /* JADX INFO: renamed from: c */
    public View f4435c;

    /* JADX INFO: renamed from: d */
    public View f4436d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4437e;

    /* JADX INFO: renamed from: f */
    public VText f4438f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f4439g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4440h;

    /* JADX INFO: renamed from: i */
    public View f4441i;

    /* JADX INFO: renamed from: j */
    public View f4442j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f4443k;

    /* JADX INFO: renamed from: l */
    public VText f4444l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f4445m;

    /* JADX INFO: renamed from: n */
    public ConstraintLayout f4446n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f4447o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f4448p;

    /* JADX INFO: renamed from: q */
    public final List<BubbleInfo> f4449q;

    /* JADX INFO: renamed from: r */
    public int f4450r;

    /* JADX INFO: renamed from: s */
    public boolean f4451s;

    /* JADX INFO: renamed from: t */
    public boolean f4452t;

    /* JADX INFO: renamed from: u */
    public Runnable f4453u;

    /* JADX INFO: renamed from: v */
    public List<String> f4454v;

    /* JADX INFO: renamed from: w */
    public boolean f4455w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.state.CoreAutoScrollView$a */
    public class C0333a implements Animator.AnimatorListener {
        public C0333a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CoreAutoScrollView.this.f4445m.setTranslationY(CoreAutoScrollView.this.getHeight());
            CoreAutoScrollView.this.f4445m.setAlpha(1.0f);
            ConstraintLayout constraintLayout = CoreAutoScrollView.this.f4446n;
            CoreAutoScrollView coreAutoScrollView = CoreAutoScrollView.this;
            coreAutoScrollView.f4446n = coreAutoScrollView.f4445m;
            CoreAutoScrollView.this.f4445m = constraintLayout;
            CoreAutoScrollView.this.f4450r++;
            CoreAutoScrollView.this.m6371q();
            e51.J(CoreAutoScrollView.this.f4453u);
            CoreAutoScrollView coreAutoScrollView2 = CoreAutoScrollView.this;
            if (coreAutoScrollView2.f4452t) {
                return;
            }
            if (coreAutoScrollView2.f4451s || coreAutoScrollView2.f4450r < CoreAutoScrollView.this.f4449q.size()) {
                e51.H(CoreAutoScrollView.this.getContext(), CoreAutoScrollView.this.f4453u, 3000L);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public CoreAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4449q = new ArrayList();
        this.f4451s = true;
        this.f4452t = false;
        this.f4453u = new Runnable() { // from class: l.yy6
            @Override // java.lang.Runnable
            public final void run() {
                this.f23286a.m6370p();
            }
        };
    }

    public List<BubbleInfo> getBubbleInfoLists() {
        return this.f4449q;
    }

    public int getCurrentIndex() {
        return this.f4450r;
    }

    /* JADX INFO: renamed from: j */
    public final void m6364j(View view) {
        zy6.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m6365k() {
        List<BubbleInfo> list = this.f4449q;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: l */
    public AnimatorSet m6366l() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f4445m, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f4445m, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f4446n, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: m */
    public GradientDrawable m6367m(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: n */
    public boolean m6368n() {
        return this.f4455w;
    }

    /* JADX INFO: renamed from: o */
    public boolean m6369o() {
        return !vwb.J(this.f4449q) && this.f4449q.size() > 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4452t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4452t = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6364j(this);
        this.f4454v = CoreModule.N().Sd();
        this.f4446n = this.f4439g;
        this.f4445m = this.f4433a;
        this.f4448p = new C0333a();
    }

    /* JADX INFO: renamed from: q */
    public void m6371q() {
        List<BubbleInfo> list = this.f4449q;
        if (list == null || list.size() == 0 || !NullChecker.a(this.f4446n) || !m6369o()) {
            return;
        }
        List<BubbleInfo> list2 = this.f4449q;
        BubbleInfo bubbleInfo = list2.get((this.f4450r + 1) % list2.size());
        if (bubbleInfo == null) {
            return;
        }
        VText childAt = this.f4446n.getChildAt(4);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f4454v.contains(str)) {
                str = "找人一起" + str;
            }
        }
        VDraweeView childAt2 = this.f4446n.getChildAt(0);
        Owner owner = bubbleInfo.owner;
        if (owner == null || TextUtils.isEmpty(owner.id)) {
            xdl0.M(childAt2, false);
        } else {
            User userById = CoreModule.N().getUserById(bubbleInfo.owner.id);
            if (NullChecker.a(userById)) {
                xdl0.M(childAt2, true);
                qib0.G.Q0(childAt2, userById.fp().profileSmall());
            } else {
                xdl0.M(childAt2, false);
            }
        }
        if (!TextUtils.isEmpty(bubbleInfo.locationName)) {
            str = str + "·" + bubbleInfo.locationName;
        }
        childAt.setText(str);
        View childAt3 = this.f4446n.getChildAt(2);
        TextTheme textTheme = bubbleInfo.textTheme;
        try {
            childAt3.setBackgroundDrawable(m6367m(Color.parseColor((textTheme == null || vwb.J(textTheme.iconColor)) ? "#ffffff" : (String) bubbleInfo.textTheme.iconColor.get(0))));
        } catch (Exception e) {
            childAt3.setBackgroundDrawable(m6367m(Color.parseColor("#ffffff")));
            CrashHelper.c(e);
        }
        VDraweeView childAt4 = this.f4446n.getChildAt(3);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            childAt4.setImageResource(x2c0.vp);
            return;
        }
        bkb0 bkb0Var = qib0.G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.k;
        bkb0Var.I0(childAt4, str2, i, i);
    }

    /* JADX INFO: renamed from: r */
    public void m6372r() {
        BubbleInfo bubbleInfo;
        List<BubbleInfo> list = this.f4449q;
        if (list == null || list.size() == 0 || !NullChecker.a(this.f4445m) || (bubbleInfo = this.f4449q.get(this.f4450r)) == null) {
            return;
        }
        zvf0.A("e_state_explore", "p_messages_view", new j760[]{j760.a("state_id", bubbleInfo.id)});
        VText childAt = this.f4445m.getChildAt(4);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f4454v.contains(str)) {
                str = "找人一起" + str;
            }
        }
        VDraweeView childAt2 = this.f4445m.getChildAt(0);
        Owner owner = bubbleInfo.owner;
        if (owner == null || TextUtils.isEmpty(owner.id)) {
            xdl0.M(childAt2, false);
        } else {
            User userById = CoreModule.N().getUserById(bubbleInfo.owner.id);
            if (NullChecker.a(userById)) {
                xdl0.M(childAt2, true);
                qib0.G.Q0(childAt2, userById.fp().profileSmall());
            } else {
                xdl0.M(childAt2, false);
            }
        }
        if (!TextUtils.isEmpty(bubbleInfo.locationName)) {
            str = str + "·" + bubbleInfo.locationName;
        }
        childAt.setText(str);
        View childAt3 = this.f4445m.getChildAt(2);
        TextTheme textTheme = bubbleInfo.textTheme;
        try {
            childAt3.setBackgroundDrawable(m6367m(Color.parseColor((textTheme == null || vwb.J(textTheme.iconColor)) ? "#ffffff" : (String) bubbleInfo.textTheme.iconColor.get(0))));
        } catch (Exception e) {
            childAt3.setBackgroundDrawable(m6367m(Color.parseColor("#ffffff")));
            CrashHelper.c(e);
        }
        VDraweeView childAt4 = this.f4445m.getChildAt(3);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            childAt4.setImageResource(x2c0.vp);
            return;
        }
        bkb0 bkb0Var = qib0.G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.k;
        bkb0Var.I0(childAt4, str2, i, i);
    }

    /* JADX INFO: renamed from: s */
    public void m6373s() {
        this.f4455w = false;
        e51.J(this.f4453u);
        if (m6369o()) {
            e51.H(getContext(), this.f4453u, 3000L);
        }
    }

    public void setBubbleInfo(BubbleInfo bubbleInfo) {
        this.f4449q.clear();
        this.f4449q.add(bubbleInfo);
        setCurrentIndex(0);
    }

    public void setBubbleInfoList(List<BubbleInfo> list) {
        this.f4449q.clear();
        this.f4449q.addAll(list);
        setCurrentIndex(0);
    }

    public void setCurrentIndex(int i) {
        this.f4450r = i;
        m6371q();
        m6372r();
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void m6370p() {
        e51.J(this.f4453u);
        if (!(NullChecker.a(this.f4447o) && this.f4447o.isRunning()) && m6369o()) {
            this.f4446n.setTranslationY(getHeight());
            this.f4446n.setVisibility(0);
            AnimatorSet animatorSetM6366l = m6366l();
            this.f4447o = animatorSetM6366l;
            animatorSetM6366l.addListener(this.f4448p);
            this.f4447o.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m6375u() {
        this.f4455w = true;
        e51.J(this.f4453u);
    }

    public CoreAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoreAutoScrollView(@NonNull Context context) {
        this(context, null);
    }
}
