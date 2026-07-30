package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalBigStyle3VirtualVoicePushView;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.d0n;
import p153l.gt0;
import p153l.h0t;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalBigStyle3VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: s */
    public static final int f22921s = qa00.f156319f;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f22922c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22923d;

    /* JADX INFO: renamed from: e */
    public TextView f22924e;

    /* JADX INFO: renamed from: f */
    public VImage f22925f;

    /* JADX INFO: renamed from: g */
    public TextView f22926g;

    /* JADX INFO: renamed from: h */
    public LiveMultiAvatarView f22927h;

    /* JADX INFO: renamed from: i */
    public LiveAvatarNumberItemView f22928i;

    /* JADX INFO: renamed from: j */
    public LiveAvatarNumberItemView f22929j;

    /* JADX INFO: renamed from: k */
    public LiveAvatarNumberItemView f22930k;

    /* JADX INFO: renamed from: l */
    public LiveAvatarNumberItemView f22931l;

    /* JADX INFO: renamed from: m */
    public LiveAvatarNumberItemView f22932m;

    /* JADX INFO: renamed from: n */
    public LiveAvatarNumberItemView f22933n;

    /* JADX INFO: renamed from: o */
    public TextView f22934o;

    /* JADX INFO: renamed from: p */
    public float f22935p;

    /* JADX INFO: renamed from: q */
    public d0n f22936q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f22937r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalBigStyle3VirtualVoicePushView$a */
    public class ViewOnClickListenerC8089a implements View.OnClickListener {
        public ViewOnClickListenerC8089a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LiveInternalBigStyle3VirtualVoicePushView.this.f22936q == null || LiveInternalBigStyle3VirtualVoicePushView.this.f22936q.f67729a == null) {
                return;
            }
            LiveInternalBigStyle3VirtualVoicePushView.this.f22936q.f67729a.m222272J();
            LiveInternalBigStyle3VirtualVoicePushView.this.f22936q.mo38889f();
        }
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context) {
        super(context);
        this.f22937r = new ViewOnClickListenerC8089a();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m38846c(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m38849g(View view) {
        this.f22990b.call();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo38833a() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo38834b(PushMessage pushMessage, Act act) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22926g.setEllipsize(TextUtils.TruncateAt.END);
        this.f22926g.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22934o.setText(pushMessageCustom.buttonText);
        }
        if (!TextUtils.isEmpty(pushMessageCustom.bgImg)) {
            uqb0.f180374G.m127115L0(this.f22923d, pushMessageCustom.bgImg);
        }
        this.f22927h.setImageData(jyb.m147487R(pushMessageCustom.avatars.split(Constants.SEPARATOR_COMMA), new qcj() { // from class: l.f0t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveInternalBigStyle3VirtualVoicePushView.m38846c((String) obj);
            }
        }));
        bnl0.m105509E0(this.f22934o, this.f22937r);
        bnl0.m105509E0(this.f22925f, new View.OnClickListener() { // from class: l.g0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101679a.m38849g(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m38850f(View view) {
        h0t.m133195a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", 0.0f, -this.f22922c.getLayoutParams().height);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", (-this.f22922c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m38851h(d0n d0nVar) {
        this.f22936q = d0nVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38850f(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22935p = motionEvent.getRawY();
        } else if (action == 2 && this.f22935p - motionEvent.getRawY() > f22921s) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22989a == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || this.f22935p - motionEvent.getRawY() <= f22921s) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22989a.call();
        this.f22989a = null;
        return true;
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22937r = new ViewOnClickListenerC8089a();
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22937r = new ViewOnClickListenerC8089a();
    }
}
