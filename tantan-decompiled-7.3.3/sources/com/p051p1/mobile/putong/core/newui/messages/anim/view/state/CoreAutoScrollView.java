package com.p051p1.mobile.putong.core.newui.messages.anim.view.state;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.c07;
import p153l.dbc0;
import p153l.fsb0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.pf60;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreAutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f26397a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f26398b;

    /* JADX INFO: renamed from: c */
    public View f26399c;

    /* JADX INFO: renamed from: d */
    public View f26400d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f26401e;

    /* JADX INFO: renamed from: f */
    public VText f26402f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f26403g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f26404h;

    /* JADX INFO: renamed from: i */
    public View f26405i;

    /* JADX INFO: renamed from: j */
    public View f26406j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f26407k;

    /* JADX INFO: renamed from: l */
    public VText f26408l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f26409m;

    /* JADX INFO: renamed from: n */
    public ConstraintLayout f26410n;

    /* JADX INFO: renamed from: o */
    public AnimatorSet f26411o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f26412p;

    /* JADX INFO: renamed from: q */
    public final List<BubbleInfo> f26413q;

    /* JADX INFO: renamed from: r */
    public int f26414r;

    /* JADX INFO: renamed from: s */
    public boolean f26415s;

    /* JADX INFO: renamed from: t */
    public boolean f26416t;

    /* JADX INFO: renamed from: u */
    public Runnable f26417u;

    /* JADX INFO: renamed from: v */
    public List<String> f26418v;

    /* JADX INFO: renamed from: w */
    public boolean f26419w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.state.CoreAutoScrollView$a */
    public class C8320a implements Animator.AnimatorListener {
        public C8320a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CoreAutoScrollView.this.f26409m.setTranslationY(CoreAutoScrollView.this.getHeight());
            CoreAutoScrollView.this.f26409m.setAlpha(1.0f);
            ConstraintLayout constraintLayout = CoreAutoScrollView.this.f26410n;
            CoreAutoScrollView coreAutoScrollView = CoreAutoScrollView.this;
            coreAutoScrollView.f26410n = coreAutoScrollView.f26409m;
            CoreAutoScrollView.this.f26409m = constraintLayout;
            CoreAutoScrollView.this.f26414r++;
            CoreAutoScrollView.this.m43233q();
            l51.m152890J(CoreAutoScrollView.this.f26417u);
            CoreAutoScrollView coreAutoScrollView2 = CoreAutoScrollView.this;
            if (coreAutoScrollView2.f26416t) {
                return;
            }
            if (coreAutoScrollView2.f26415s || coreAutoScrollView2.f26414r < CoreAutoScrollView.this.f26413q.size()) {
                l51.m152888H(CoreAutoScrollView.this.getContext(), CoreAutoScrollView.this.f26417u, 3000L);
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
        this.f26413q = new ArrayList();
        this.f26415s = true;
        this.f26416t = false;
        this.f26417u = new Runnable() { // from class: l.b07
            @Override // java.lang.Runnable
            public final void run() {
                this.f74250a.m43232p();
            }
        };
    }

    public List<BubbleInfo> getBubbleInfoLists() {
        return this.f26413q;
    }

    public int getCurrentIndex() {
        return this.f26414r;
    }

    /* JADX INFO: renamed from: j */
    public final void m43226j(View view) {
        c07.m107371a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m43227k() {
        List<BubbleInfo> list = this.f26413q;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: l */
    public AnimatorSet m43228l() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26409m, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f26409m, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat2.setDuration(600L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f26410n, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat3.setDuration(600L);
        objectAnimatorOfFloat3.setStartDelay(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        return animatorSet;
    }

    /* JADX INFO: renamed from: m */
    public GradientDrawable m43229m(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: n */
    public boolean m43230n() {
        return this.f26419w;
    }

    /* JADX INFO: renamed from: o */
    public boolean m43231o() {
        return !jyb.m147479J(this.f26413q) && this.f26413q.size() > 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26416t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26416t = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43226j(this);
        this.f26418v = CoreModule.m30932N().mo61500Sd();
        this.f26410n = this.f26403g;
        this.f26409m = this.f26397a;
        this.f26412p = new C8320a();
    }

    /* JADX INFO: renamed from: q */
    public void m43233q() {
        List<BubbleInfo> list = this.f26413q;
        if (list == null || list.size() == 0 || !NullChecker.m82486a(this.f26410n) || !m43231o()) {
            return;
        }
        List<BubbleInfo> list2 = this.f26413q;
        BubbleInfo bubbleInfo = list2.get((this.f26414r + 1) % list2.size());
        if (bubbleInfo == null) {
            return;
        }
        VText vText = (VText) this.f26410n.getChildAt(4);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.m82486a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f26418v.contains(str)) {
                str = "找人一起" + str;
            }
        }
        VDraweeView vDraweeView = (VDraweeView) this.f26410n.getChildAt(0);
        Owner owner = bubbleInfo.owner;
        if (owner == null || TextUtils.isEmpty(owner.f39651id)) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            User userById = CoreModule.m30932N().getUserById(bubbleInfo.owner.f39651id);
            if (NullChecker.m82486a(userById)) {
                bnl0.m105524M(vDraweeView, true);
                uqb0.f180374G.m127125Q0(vDraweeView, userById.m61308fp().profileSmall());
            } else {
                bnl0.m105524M(vDraweeView, false);
            }
        }
        if (!TextUtils.isEmpty(bubbleInfo.locationName)) {
            str = str + "·" + bubbleInfo.locationName;
        }
        vText.setText(str);
        View childAt = this.f26410n.getChildAt(2);
        TextTheme textTheme = bubbleInfo.textTheme;
        try {
            childAt.setBackgroundDrawable(m43229m(Color.parseColor((textTheme == null || jyb.m147479J(textTheme.iconColor)) ? "#ffffff" : bubbleInfo.textTheme.iconColor.get(0))));
        } catch (Exception e) {
            childAt.setBackgroundDrawable(m43229m(Color.parseColor("#ffffff")));
            CrashHelper.m82479c(e);
        }
        VDraweeView vDraweeView2 = (VDraweeView) this.f26410n.getChildAt(3);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            vDraweeView2.setImageResource(dbc0.f87129jq);
            return;
        }
        fsb0 fsb0Var = uqb0.f180374G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156324k;
        fsb0Var.m127109I0(vDraweeView2, str2, i, i);
    }

    /* JADX INFO: renamed from: r */
    public void m43234r() {
        BubbleInfo bubbleInfo;
        List<BubbleInfo> list = this.f26413q;
        if (list == null || list.size() == 0 || !NullChecker.m82486a(this.f26409m) || (bubbleInfo = this.f26413q.get(this.f26414r)) == null) {
            return;
        }
        i4g0.m138492A("e_state_explore", OMSDialogPositon.p_messages_view, pf60.m172085a("state_id", bubbleInfo.f39578id));
        VText vText = (VText) this.f26409m.getChildAt(4);
        String str = bubbleInfo.value;
        if (TextUtils.isEmpty(str) && NullChecker.m82486a(bubbleInfo.emotion)) {
            str = bubbleInfo.emotion.text;
            if (this.f26418v.contains(str)) {
                str = "找人一起" + str;
            }
        }
        VDraweeView vDraweeView = (VDraweeView) this.f26409m.getChildAt(0);
        Owner owner = bubbleInfo.owner;
        if (owner == null || TextUtils.isEmpty(owner.f39651id)) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            User userById = CoreModule.m30932N().getUserById(bubbleInfo.owner.f39651id);
            if (NullChecker.m82486a(userById)) {
                bnl0.m105524M(vDraweeView, true);
                uqb0.f180374G.m127125Q0(vDraweeView, userById.m61308fp().profileSmall());
            } else {
                bnl0.m105524M(vDraweeView, false);
            }
        }
        if (!TextUtils.isEmpty(bubbleInfo.locationName)) {
            str = str + "·" + bubbleInfo.locationName;
        }
        vText.setText(str);
        View childAt = this.f26409m.getChildAt(2);
        TextTheme textTheme = bubbleInfo.textTheme;
        try {
            childAt.setBackgroundDrawable(m43229m(Color.parseColor((textTheme == null || jyb.m147479J(textTheme.iconColor)) ? "#ffffff" : bubbleInfo.textTheme.iconColor.get(0))));
        } catch (Exception e) {
            childAt.setBackgroundDrawable(m43229m(Color.parseColor("#ffffff")));
            CrashHelper.m82479c(e);
        }
        VDraweeView vDraweeView2 = (VDraweeView) this.f26409m.getChildAt(3);
        Emotion emotion = bubbleInfo.emotion;
        if (emotion == null || TextUtils.isEmpty(emotion.emojiUrl)) {
            vDraweeView2.setImageResource(dbc0.f87129jq);
            return;
        }
        fsb0 fsb0Var = uqb0.f180374G;
        String str2 = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156324k;
        fsb0Var.m127109I0(vDraweeView2, str2, i, i);
    }

    /* JADX INFO: renamed from: s */
    public void m43235s() {
        this.f26419w = false;
        l51.m152890J(this.f26417u);
        if (m43231o()) {
            l51.m152888H(getContext(), this.f26417u, 3000L);
        }
    }

    public void setBubbleInfo(BubbleInfo bubbleInfo) {
        this.f26413q.clear();
        this.f26413q.add(bubbleInfo);
        setCurrentIndex(0);
    }

    public void setBubbleInfoList(List<BubbleInfo> list) {
        this.f26413q.clear();
        this.f26413q.addAll(list);
        setCurrentIndex(0);
    }

    public void setCurrentIndex(int i) {
        this.f26414r = i;
        m43233q();
        m43234r();
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void m43232p() {
        l51.m152890J(this.f26417u);
        if (!(NullChecker.m82486a(this.f26411o) && this.f26411o.isRunning()) && m43231o()) {
            this.f26410n.setTranslationY(getHeight());
            this.f26410n.setVisibility(0);
            AnimatorSet animatorSetM43228l = m43228l();
            this.f26411o = animatorSetM43228l;
            animatorSetM43228l.addListener(this.f26412p);
            this.f26411o.start();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m43237u() {
        this.f26419w = true;
        l51.m152890J(this.f26417u);
    }

    public CoreAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoreAutoScrollView(@NonNull Context context) {
        this(context, null);
    }
}
