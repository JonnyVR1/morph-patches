package com.p000p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p000p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import l.bt0;
import l.e30;
import l.nvc0;
import l.qib0;
import l.t100;
import l.xdl0;
import l.yys;
import p009l.qym;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveInternalPushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f997m = t100.f;

    /* JADX INFO: renamed from: c */
    public LinearLayout f998c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f999d;

    /* JADX INFO: renamed from: e */
    public LiveHaloAvatar f1000e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1001f;

    /* JADX INFO: renamed from: g */
    public VText f1002g;

    /* JADX INFO: renamed from: h */
    public VText f1003h;

    /* JADX INFO: renamed from: i */
    public VText f1004i;

    /* JADX INFO: renamed from: j */
    public ImageView f1005j;

    /* JADX INFO: renamed from: k */
    public float f1006k;

    /* JADX INFO: renamed from: l */
    public qym f1007l;

    public LiveInternalPushView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo1802b(PushMessage pushMessage, Act act) {
        xdl0.M(this.f1005j, false);
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f1003h.setEllipsize(TextUtils.TruncateAt.END);
        this.f1002g.setText(pushMessageCustom.title);
        this.f1003h.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f1004i.setText(pushMessageCustom.buttonText);
        }
        if (TextUtils.equals(pushMessage.messageCustom.liveMode, "virtualAvatar")) {
            this.f1000e.m5793e(Color.parseColor("#35D3FF"), Color.parseColor("#35D3FF"));
        }
        if (TextUtils.isEmpty(pushMessageCustom.image)) {
            return;
        }
        xdl0.M(this.f999d, false);
        xdl0.M(this.f1001f, false);
        xdl0.M(this.f1000e, true);
        qib0.G.F(qib0.G.n(pushMessageCustom.image).O(new nvc0(this.f1000e.getAvatarSize(), this.f1000e.getAvatarSize())).a(), new e30() { // from class: l.vys
            public final void call(Object obj) {
                this.f21822a.m1840g((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m1839f(View view) {
        yys.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1840g(Bitmap bitmap) {
        this.f1000e.setAvatar(bitmap);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{0.0f, -this.f998c.getLayoutParams().height});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{(-this.f998c.getLayoutParams().height) - getTranslationY(), 0.0f});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1841h(View view) {
        qym qymVar = this.f1007l;
        if (qymVar == null || qymVar.f9776a == null) {
            return;
        }
        qymVar.m21348o();
        this.f1007l.f9776a.m26111J();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1842i(View view) {
        qym qymVar = this.f1007l;
        if (qymVar == null || qymVar.f9776a == null) {
            return;
        }
        qymVar.m21348o();
        this.f1007l.f9776a.m26111J();
    }

    /* JADX INFO: renamed from: j */
    public void m1843j(PushMessage pushMessage, Act act) {
        mo1802b(pushMessage, act);
        xdl0.M(this.f1005j, true);
        this.f1005j.setOnClickListener(new View.OnClickListener() { // from class: l.xys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22815a.m1841h(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m1844k(PushMessage pushMessage) {
        xdl0.M(this.f1005j, true);
        this.f1005j.setOnClickListener(new View.OnClickListener() { // from class: l.wys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22371a.m1842i(view);
            }
        });
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        xdl0.M(this.f1000e, false);
        String str = pushMessageCustom.image;
        if (!TextUtils.isEmpty(str)) {
            boolean zEndsWith = str.endsWith(".svga");
            AnimEffectPlayer animEffectPlayer = this.f999d;
            if (zEndsWith) {
                xdl0.M(animEffectPlayer, true);
                xdl0.M(this.f1001f, false);
                this.f999d.startSVGAAnim(str, -1);
            } else {
                xdl0.M(animEffectPlayer, false);
                xdl0.M(this.f1001f, true);
                qib0.G.L0(this.f1001f, str);
            }
        }
        this.f1002g.setText(pushMessageCustom.title);
        this.f1003h.setText(pushMessageCustom.content);
        if (TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            return;
        }
        this.f1004i.setText(pushMessageCustom.buttonText);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1839f(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1006k = motionEvent.getRawY();
        } else if (action == 2 && this.f1006k - motionEvent.getRawY() > f997m) {
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
        if ((action != 1 && action != 3) || this.f1006k - motionEvent.getRawY() <= f997m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1025a.call();
        this.f1025a = null;
        return true;
    }

    public void setHandler(qym qymVar) {
        this.f1007l = qymVar;
    }

    public LiveInternalPushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalPushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
