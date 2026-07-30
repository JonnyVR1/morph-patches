package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import l.bt0;
import l.dys;
import l.qib0;
import l.t100;
import l.x2c0;
import l.xdl0;
import p009l.cym;
import p009l.zxm;
import v.AutoVDraweeView;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveInternalBigStyle2VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f946m = t100.f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f947c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f948d;

    /* JADX INFO: renamed from: e */
    public VImage f949e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f950f;

    /* JADX INFO: renamed from: g */
    public VText f951g;

    /* JADX INFO: renamed from: h */
    public VText f952h;

    /* JADX INFO: renamed from: i */
    public VText f953i;

    /* JADX INFO: renamed from: j */
    public VButton f954j;

    /* JADX INFO: renamed from: k */
    public float f955k;

    /* JADX INFO: renamed from: l */
    public cym f956l;

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m1810f(View view) {
        this.f1026b.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m1811g(View view) {
        zxm zxmVar;
        cym cymVar = this.f956l;
        if (cymVar == null || (zxmVar = cymVar.f9776a) == null) {
            return;
        }
        zxmVar.m26111J();
        this.f956l.mo1857f();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo1801a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo1802b(PushMessage pushMessage, Act act) {
        int i;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f953i.setEllipsize(TextUtils.TruncateAt.END);
        this.f951g.setText(pushMessageCustom.title);
        this.f953i.setText(pushMessageCustom.content);
        this.f952h.setText(pushMessageCustom.subTitle);
        String str = pushMessageCustom.state;
        if (str != null) {
            str.getClass();
            switch (str) {
                case "super_like":
                    i = x2c0.d9;
                    break;
                case "friends":
                    i = x2c0.b9;
                    break;
                case "liked":
                    i = x2c0.c9;
                    break;
                case "following":
                    i = x2c0.a9;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 0;
        }
        this.f952h.setCompoundDrawablePadding(t100.c);
        this.f952h.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f954j.setText(pushMessageCustom.buttonText);
        }
        qib0.G.L0(this.f948d, "https://auto.tancdn.com/v1/images/eyJpZCI6IjQyT05ST0FYS1lCUkpEQk83UlM2WVpUTlJNSFlaVDExIiwidyI6MTQzNiwiaCI6NzU2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzMzMjA3Mjk0ODg5MzEyNDE3M30.png");
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            this.f950f.setImageUrl(pushMessageCustom.image);
        }
        xdl0.E0(this.f949e, new View.OnClickListener() { // from class: l.bys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10363a.m1810f(view);
            }
        });
        this.f954j.setOnClickListener(new View.OnClickListener() { // from class: l.cys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10826a.m1811g(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m1812e(View view) {
        dys.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{0.0f, -this.f947c.getLayoutParams().height});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{(-this.f947c.getLayoutParams().height) - getTranslationY(), 0.0f});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m1813h(cym cymVar) {
        this.f956l = cymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1812e(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f955k = motionEvent.getRawY();
        } else if (action == 2 && this.f955k - motionEvent.getRawY() > f946m) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1025a == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || this.f955k - motionEvent.getRawY() <= f946m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1025a.call();
        this.f1025a = null;
        return true;
    }

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
