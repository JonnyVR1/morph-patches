package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalBigStyle3VirtualVoicePushView;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import l.bt0;
import l.gys;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import p009l.dym;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveInternalBigStyle3VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: s */
    public static final int f957s = t100.f;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f958c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f959d;

    /* JADX INFO: renamed from: e */
    public TextView f960e;

    /* JADX INFO: renamed from: f */
    public VImage f961f;

    /* JADX INFO: renamed from: g */
    public TextView f962g;

    /* JADX INFO: renamed from: h */
    public LiveMultiAvatarView f963h;

    /* JADX INFO: renamed from: i */
    public LiveAvatarNumberItemView f964i;

    /* JADX INFO: renamed from: j */
    public LiveAvatarNumberItemView f965j;

    /* JADX INFO: renamed from: k */
    public LiveAvatarNumberItemView f966k;

    /* JADX INFO: renamed from: l */
    public LiveAvatarNumberItemView f967l;

    /* JADX INFO: renamed from: m */
    public LiveAvatarNumberItemView f968m;

    /* JADX INFO: renamed from: n */
    public LiveAvatarNumberItemView f969n;

    /* JADX INFO: renamed from: o */
    public TextView f970o;

    /* JADX INFO: renamed from: p */
    public float f971p;

    /* JADX INFO: renamed from: q */
    public dym f972q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f973r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalBigStyle3VirtualVoicePushView$a */
    public class ViewOnClickListenerC0102a implements View.OnClickListener {
        public ViewOnClickListenerC0102a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LiveInternalBigStyle3VirtualVoicePushView.this.f972q == null || LiveInternalBigStyle3VirtualVoicePushView.this.f972q.f9776a == null) {
                return;
            }
            LiveInternalBigStyle3VirtualVoicePushView.this.f972q.f9776a.m26111J();
            LiveInternalBigStyle3VirtualVoicePushView.this.f972q.mo1857f();
        }
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context) {
        super(context);
        this.f973r = new ViewOnClickListenerC0102a();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m1814c(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m1817g(View view) {
        this.f1026b.call();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo1801a() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo1802b(PushMessage pushMessage, Act act) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f962g.setEllipsize(TextUtils.TruncateAt.END);
        this.f962g.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f970o.setText(pushMessageCustom.buttonText);
        }
        if (!TextUtils.isEmpty(pushMessageCustom.bgImg)) {
            qib0.G.L0(this.f959d, pushMessageCustom.bgImg);
        }
        this.f963h.setImageData(vwb.R(pushMessageCustom.avatars.split(","), new w9j() { // from class: l.eys
            public final Object call(Object obj) {
                return LiveInternalBigStyle3VirtualVoicePushView.m1814c((String) obj);
            }
        }));
        xdl0.E0(this.f970o, this.f973r);
        xdl0.E0(this.f961f, new View.OnClickListener() { // from class: l.fys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13232a.m1817g(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m1818f(View view) {
        gys.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{0.0f, -this.f958c.getLayoutParams().height});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{(-this.f958c.getLayoutParams().height) - getTranslationY(), 0.0f});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m1819h(dym dymVar) {
        this.f972q = dymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1818f(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f971p = motionEvent.getRawY();
        } else if (action == 2 && this.f971p - motionEvent.getRawY() > f957s) {
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
        if ((action != 1 && action != 3) || this.f971p - motionEvent.getRawY() <= f957s) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1025a.call();
        this.f1025a = null;
        return true;
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f973r = new ViewOnClickListenerC0102a();
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f973r = new ViewOnClickListenerC0102a();
    }
}
