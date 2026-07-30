package com.p051p1.mobile.putong.core.newui.home.bubble.internalpush;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.q0n;
import p153l.q3d0;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;
import p153l.z0t;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalPushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f22961m = qa00.f156319f;

    /* JADX INFO: renamed from: c */
    public LinearLayout f22962c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f22963d;

    /* JADX INFO: renamed from: e */
    public LiveHaloAvatar f22964e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f22965f;

    /* JADX INFO: renamed from: g */
    public VText f22966g;

    /* JADX INFO: renamed from: h */
    public VText f22967h;

    /* JADX INFO: renamed from: i */
    public VText f22968i;

    /* JADX INFO: renamed from: j */
    public ImageView f22969j;

    /* JADX INFO: renamed from: k */
    public float f22970k;

    /* JADX INFO: renamed from: l */
    public q0n f22971l;

    public LiveInternalPushView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo38834b(PushMessage pushMessage, Act act) {
        bnl0.m105524M(this.f22969j, false);
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22967h.setEllipsize(TextUtils.TruncateAt.END);
        this.f22966g.setText(pushMessageCustom.title);
        this.f22967h.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22968i.setText(pushMessageCustom.buttonText);
        }
        if (TextUtils.equals(pushMessage.messageCustom.liveMode, "virtualAvatar")) {
            this.f22964e.m42680e(Color.parseColor("#35D3FF"), Color.parseColor("#35D3FF"));
        }
        if (TextUtils.isEmpty(pushMessageCustom.image)) {
            return;
        }
        bnl0.m105524M(this.f22963d, false);
        bnl0.m105524M(this.f22965f, false);
        bnl0.m105524M(this.f22964e, true);
        uqb0.f180374G.m127102F(uqb0.f180374G.m98797n(pushMessageCustom.image).m8661O(new q3d0(this.f22964e.getAvatarSize(), this.f22964e.getAvatarSize())).m8668a(), new y20() { // from class: l.w0t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186720a.m38872g((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m38871f(View view) {
        z0t.m218151a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m38872g(Bitmap bitmap) {
        this.f22964e.setAvatar(bitmap);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", 0.0f, -this.f22962c.getLayoutParams().height);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM132171q = gt0.m132171q(this, "translationY", (-this.f22962c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM132171q.setDuration(400L);
        return animatorM132171q;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m38873h(View view) {
        q0n q0nVar = this.f22971l;
        if (q0nVar == null || q0nVar.f67729a == null) {
            return;
        }
        q0nVar.m174732o();
        this.f22971l.f67729a.m222272J();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m38874i(View view) {
        q0n q0nVar = this.f22971l;
        if (q0nVar == null || q0nVar.f67729a == null) {
            return;
        }
        q0nVar.m174732o();
        this.f22971l.f67729a.m222272J();
    }

    /* JADX INFO: renamed from: j */
    public void m38875j(PushMessage pushMessage, Act act) {
        mo38834b(pushMessage, act);
        bnl0.m105524M(this.f22969j, true);
        this.f22969j.setOnClickListener(new View.OnClickListener() { // from class: l.y0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197049a.m38873h(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m38876k(PushMessage pushMessage) {
        bnl0.m105524M(this.f22969j, true);
        this.f22969j.setOnClickListener(new View.OnClickListener() { // from class: l.x0t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191936a.m38874i(view);
            }
        });
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        bnl0.m105524M(this.f22964e, false);
        String str = pushMessageCustom.image;
        if (!TextUtils.isEmpty(str)) {
            boolean zEndsWith = str.endsWith(".svga");
            AnimEffectPlayer animEffectPlayer = this.f22963d;
            if (zEndsWith) {
                bnl0.m105524M(animEffectPlayer, true);
                bnl0.m105524M(this.f22965f, false);
                this.f22963d.startSVGAAnim(str, -1);
            } else {
                bnl0.m105524M(animEffectPlayer, false);
                bnl0.m105524M(this.f22965f, true);
                uqb0.f180374G.m127115L0(this.f22965f, str);
            }
        }
        this.f22966g.setText(pushMessageCustom.title);
        this.f22967h.setText(pushMessageCustom.content);
        if (TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            return;
        }
        this.f22968i.setText(pushMessageCustom.buttonText);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38871f(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22970k = motionEvent.getRawY();
        } else if (action == 2 && this.f22970k - motionEvent.getRawY() > f22961m) {
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
        if ((action != 1 && action != 3) || this.f22970k - motionEvent.getRawY() <= f22961m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22989a.call();
        this.f22989a = null;
        return true;
    }

    public void setHandler(q0n q0nVar) {
        this.f22971l = q0nVar;
    }

    public LiveInternalPushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalPushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
