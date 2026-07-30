package com.p046p1.mobile.putong.core.newui.messages.anim.view.state;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.e51;
import p149l.j760;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zy6;

/* JADX INFO: loaded from: classes11.dex */
public class CoreAutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f25655a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25656b;

    /* JADX INFO: renamed from: c */
    public View f25657c;

    /* JADX INFO: renamed from: d */
    public View f25658d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f25659e;

    /* JADX INFO: renamed from: f */
    public VText f25660f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f25661g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f25662h;

    /* JADX INFO: renamed from: i */
    public View f25663i;

    /* JADX INFO: renamed from: j */
    public View f25664j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f25665k;

    /* JADX INFO: renamed from: l */
    public VText f25666l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f25667m;

    /* JADX INFO: renamed from: n */
    public ConstraintLayout f25668n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f25669o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f25670p;

    /* JADX INFO: renamed from: q */
    public final List<BubbleInfo> f25671q;

    /* JADX INFO: renamed from: r */
    public int f25672r;

    /* JADX INFO: renamed from: s */
    public boolean f25673s;

    /* JADX INFO: renamed from: t */
    public boolean f25674t;

    /* JADX INFO: renamed from: u */
    public Runnable f25675u;

    /* JADX INFO: renamed from: v */
    public List<String> f25676v;

    /* JADX INFO: renamed from: w */
    public boolean f25677w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.state.CoreAutoScrollView$a */
    public class C8169a implements Animator.AnimatorListener {
        public C8169a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CoreAutoScrollView.this.f25667m.setTranslationY(CoreAutoScrollView.this.getHeight());
            CoreAutoScrollView.this.f25667m.setAlpha(1.0f);
            ConstraintLayout constraintLayout = CoreAutoScrollView.this.f25668n;
            CoreAutoScrollView coreAutoScrollView = CoreAutoScrollView.this;
            coreAutoScrollView.f25668n = coreAutoScrollView.f25667m;
            CoreAutoScrollView.this.f25667m = constraintLayout;
            CoreAutoScrollView.this.f25672r++;
            CoreAutoScrollView.this.m42222q();
            e51.m114745J(CoreAutoScrollView.this.f25675u);
            CoreAutoScrollView coreAutoScrollView2 = CoreAutoScrollView.this;
            if (coreAutoScrollView2.f25674t) {
                return;
            }
            if (coreAutoScrollView2.f25673s || coreAutoScrollView2.f25672r < CoreAutoScrollView.this.f25671q.size()) {
                e51.m114743H(CoreAutoScrollView.this.getContext(), CoreAutoScrollView.this.f25675u, 3000L);
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
        this.f25671q = new ArrayList();
        this.f25673s = true;
        this.f25674t = false;
        this.f25675u = new Runnable() { // from class: l.yy6
            @Override // java.lang.Runnable
            public final void run() {
                this.f200711a.m42221p();
            }
        };
    }

    public List<BubbleInfo> getBubbleInfoLists() {
        return this.f25671q;
    }

    public int getCurrentIndex() {
        return this.f25672r;
    }

    /* JADX INFO: renamed from: j */
    public final void m42215j(View view) {
        zy6.m220891a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m42216k() {
        List<BubbleInfo> list = this.f25671q;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: l */
    public AnimatorSet m42217l() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25667m, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f25667m, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f25668n, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: m */
    public GradientDrawable m42218m(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: n */
    public boolean m42219n() {
        return this.f25677w;
    }

    /* JADX INFO: renamed from: o */
    public boolean m42220o() {
        return !vwb.m200296J(this.f25671q) && this.f25671q.size() > 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25674t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25674t = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42215j(this);
        this.f25676v = CoreModule.m29934N().mo60316Sd();
        this.f25668n = this.f25661g;
        this.f25667m = this.f25655a;
        this.f25670p = new C8169a();
    }

    /* JADX INFO: renamed from: q */
    public void m42222q() {
        List<BubbleInfo> list = this.f25671q;
        if (list == null || list.size() == 0 || !NullChecker.m81303a(this.f25668n) || !m42220o()) {
            return;
        }
        List<BubbleInfo> list2 = this.f25671q;
        BubbleInfo bubbleInfo = list2.get((this.f25672r + 1) % list2.size());
        if (bubbleInfo == null) {
            return;
        }
        VText vText = (VText) this.f25668n.getChildAt(4);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.m81303a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f25676v.contains(str)) {
                str = "找人一起" + str;
            }
        }
        VDraweeView vDraweeView = (VDraweeView) this.f25668n.getChildAt(0);
        Owner owner = bubbleInfo.owner;
        if (owner == null || TextUtils.isEmpty(owner.f38803id)) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            User userById = CoreModule.m29934N().getUserById(bubbleInfo.owner.f38803id);
            if (NullChecker.m81303a(userById)) {
                xdl0.m208344M(vDraweeView, true);
                qib0.f154691G.m102341Q0(vDraweeView, userById.m60124fp().profileSmall());
            } else {
                xdl0.m208344M(vDraweeView, false);
            }
        }
        if (!TextUtils.isEmpty(bubbleInfo.locationName)) {
            str = str + "·" + bubbleInfo.locationName;
        }
        vText.setText(str);
        View childAt = this.f25668n.getChildAt(2);
        TextTheme textTheme = bubbleInfo.textTheme;
        try {
            childAt.setBackgroundDrawable(m42218m(Color.parseColor((textTheme == null || vwb.m200296J(textTheme.iconColor)) ? "#ffffff" : bubbleInfo.textTheme.iconColor.get(0))));
        } catch (Exception e) {
            childAt.setBackgroundDrawable(m42218m(Color.parseColor("#ffffff")));
            CrashHelper.m81296c(e);
        }
        VDraweeView vDraweeView2 = (VDraweeView) this.f25668n.getChildAt(3);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            vDraweeView2.setImageResource(x2c0.f190660vp);
            return;
        }
        bkb0 bkb0Var = qib0.f154691G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167262k;
        bkb0Var.m102325I0(vDraweeView2, str2, i, i);
    }

    /* JADX INFO: renamed from: r */
    public void m42223r() {
        BubbleInfo bubbleInfo;
        List<BubbleInfo> list = this.f25671q;
        if (list == null || list.size() == 0 || !NullChecker.m81303a(this.f25667m) || (bubbleInfo = this.f25671q.get(this.f25672r)) == null) {
            return;
        }
        zvf0.m220368A("e_state_explore", OMSDialogPositon.p_messages_view, j760.m140076a("state_id", bubbleInfo.f38730id));
        VText vText = (VText) this.f25667m.getChildAt(4);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.m81303a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f25676v.contains(str)) {
                str = "找人一起" + str;
            }
        }
        VDraweeView vDraweeView = (VDraweeView) this.f25667m.getChildAt(0);
        Owner owner = bubbleInfo.owner;
        if (owner == null || TextUtils.isEmpty(owner.f38803id)) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            User userById = CoreModule.m29934N().getUserById(bubbleInfo.owner.f38803id);
            if (NullChecker.m81303a(userById)) {
                xdl0.m208344M(vDraweeView, true);
                qib0.f154691G.m102341Q0(vDraweeView, userById.m60124fp().profileSmall());
            } else {
                xdl0.m208344M(vDraweeView, false);
            }
        }
        if (!TextUtils.isEmpty(bubbleInfo.locationName)) {
            str = str + "·" + bubbleInfo.locationName;
        }
        vText.setText(str);
        View childAt = this.f25667m.getChildAt(2);
        TextTheme textTheme = bubbleInfo.textTheme;
        try {
            childAt.setBackgroundDrawable(m42218m(Color.parseColor((textTheme == null || vwb.m200296J(textTheme.iconColor)) ? "#ffffff" : bubbleInfo.textTheme.iconColor.get(0))));
        } catch (Exception e) {
            childAt.setBackgroundDrawable(m42218m(Color.parseColor("#ffffff")));
            CrashHelper.m81296c(e);
        }
        VDraweeView vDraweeView2 = (VDraweeView) this.f25667m.getChildAt(3);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            vDraweeView2.setImageResource(x2c0.f190660vp);
            return;
        }
        bkb0 bkb0Var = qib0.f154691G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167262k;
        bkb0Var.m102325I0(vDraweeView2, str2, i, i);
    }

    /* JADX INFO: renamed from: s */
    public void m42224s() {
        this.f25677w = false;
        e51.m114745J(this.f25675u);
        if (m42220o()) {
            e51.m114743H(getContext(), this.f25675u, 3000L);
        }
    }

    public void setBubbleInfo(BubbleInfo bubbleInfo) {
        this.f25671q.clear();
        this.f25671q.add(bubbleInfo);
        setCurrentIndex(0);
    }

    public void setBubbleInfoList(List<BubbleInfo> list) {
        this.f25671q.clear();
        this.f25671q.addAll(list);
        setCurrentIndex(0);
    }

    public void setCurrentIndex(int i) {
        this.f25672r = i;
        m42222q();
        m42223r();
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void m42221p() {
        e51.m114745J(this.f25675u);
        if (!(NullChecker.m81303a(this.f25669o) && this.f25669o.isRunning()) && m42220o()) {
            this.f25668n.setTranslationY(getHeight());
            this.f25668n.setVisibility(0);
            AnimatorSet animatorSetM42217l = m42217l();
            this.f25669o = animatorSetM42217l;
            animatorSetM42217l.addListener(this.f25670p);
            this.f25669o.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m42226u() {
        this.f25677w = true;
        e51.m114745J(this.f25675u);
    }

    public CoreAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoreAutoScrollView(@NonNull Context context) {
        this(context, null);
    }
}
