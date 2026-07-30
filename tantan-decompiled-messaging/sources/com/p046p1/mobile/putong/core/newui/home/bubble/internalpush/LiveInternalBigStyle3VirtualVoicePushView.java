package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalBigStyle3VirtualVoicePushView;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bt0;
import p149l.dym;
import p149l.gys;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalBigStyle3VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: s */
    public static final int f22179s = t100.f167257f;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f22180c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22181d;

    /* JADX INFO: renamed from: e */
    public TextView f22182e;

    /* JADX INFO: renamed from: f */
    public VImage f22183f;

    /* JADX INFO: renamed from: g */
    public TextView f22184g;

    /* JADX INFO: renamed from: h */
    public LiveMultiAvatarView f22185h;

    /* JADX INFO: renamed from: i */
    public LiveAvatarNumberItemView f22186i;

    /* JADX INFO: renamed from: j */
    public LiveAvatarNumberItemView f22187j;

    /* JADX INFO: renamed from: k */
    public LiveAvatarNumberItemView f22188k;

    /* JADX INFO: renamed from: l */
    public LiveAvatarNumberItemView f22189l;

    /* JADX INFO: renamed from: m */
    public LiveAvatarNumberItemView f22190m;

    /* JADX INFO: renamed from: n */
    public LiveAvatarNumberItemView f22191n;

    /* JADX INFO: renamed from: o */
    public TextView f22192o;

    /* JADX INFO: renamed from: p */
    public float f22193p;

    /* JADX INFO: renamed from: q */
    public dym f22194q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f22195r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalBigStyle3VirtualVoicePushView$a */
    public class ViewOnClickListenerC7938a implements View.OnClickListener {
        public ViewOnClickListenerC7938a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LiveInternalBigStyle3VirtualVoicePushView.this.f22194q == null || LiveInternalBigStyle3VirtualVoicePushView.this.f22194q.f72298a == null) {
                return;
            }
            LiveInternalBigStyle3VirtualVoicePushView.this.f22194q.f72298a.m220844J();
            LiveInternalBigStyle3VirtualVoicePushView.this.f22194q.mo37886f();
        }
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context) {
        super(context);
        this.f22195r = new ViewOnClickListenerC7938a();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m37843c(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m37846g(View view) {
        this.f22248b.call();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo37830a() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo37831b(PushMessage pushMessage, Act act) {
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22184g.setEllipsize(TextUtils.TruncateAt.END);
        this.f22184g.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22192o.setText(pushMessageCustom.buttonText);
        }
        if (!TextUtils.isEmpty(pushMessageCustom.bgImg)) {
            qib0.f154691G.m102331L0(this.f22181d, pushMessageCustom.bgImg);
        }
        this.f22185h.setImageData(vwb.m200304R(pushMessageCustom.avatars.split(Constants.SEPARATOR_COMMA), new w9j() { // from class: l.eys
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveInternalBigStyle3VirtualVoicePushView.m37843c((String) obj);
            }
        }));
        xdl0.m208329E0(this.f22192o, this.f22195r);
        xdl0.m208329E0(this.f22183f, new View.OnClickListener() { // from class: l.fys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99897a.m37846g(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m37847f(View view) {
        gys.m128731a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", 0.0f, -this.f22180c.getLayoutParams().height);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", (-this.f22180c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m37848h(dym dymVar) {
        this.f22194q = dymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37847f(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22193p = motionEvent.getRawY();
        } else if (action == 2 && this.f22193p - motionEvent.getRawY() > f22179s) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f22247a == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action != 1 && action != 3) || this.f22193p - motionEvent.getRawY() <= f22179s) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22247a.call();
        this.f22247a = null;
        return true;
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22195r = new ViewOnClickListenerC7938a();
    }

    public LiveInternalBigStyle3VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22195r = new ViewOnClickListenerC7938a();
    }
}
