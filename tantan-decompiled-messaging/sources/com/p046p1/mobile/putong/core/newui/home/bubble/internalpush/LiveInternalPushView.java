package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.core.newui.messages.LiveHaloAvatar;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.e30;
import p149l.nvc0;
import p149l.qib0;
import p149l.qym;
import p149l.t100;
import p149l.xdl0;
import p149l.yys;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalPushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f22219m = t100.f167257f;

    /* JADX INFO: renamed from: c */
    public LinearLayout f22220c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f22221d;

    /* JADX INFO: renamed from: e */
    public LiveHaloAvatar f22222e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f22223f;

    /* JADX INFO: renamed from: g */
    public VText f22224g;

    /* JADX INFO: renamed from: h */
    public VText f22225h;

    /* JADX INFO: renamed from: i */
    public VText f22226i;

    /* JADX INFO: renamed from: j */
    public ImageView f22227j;

    /* JADX INFO: renamed from: k */
    public float f22228k;

    /* JADX INFO: renamed from: l */
    public qym f22229l;

    public LiveInternalPushView(@NonNull Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo37831b(PushMessage pushMessage, Act act) {
        xdl0.m208344M(this.f22227j, false);
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22225h.setEllipsize(TextUtils.TruncateAt.END);
        this.f22224g.setText(pushMessageCustom.title);
        this.f22225h.setText(pushMessageCustom.content);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22226i.setText(pushMessageCustom.buttonText);
        }
        if (TextUtils.equals(pushMessage.messageCustom.liveMode, "virtualAvatar")) {
            this.f22222e.m41669e(Color.parseColor("#35D3FF"), Color.parseColor("#35D3FF"));
        }
        if (TextUtils.isEmpty(pushMessageCustom.image)) {
            return;
        }
        xdl0.m208344M(this.f22221d, false);
        xdl0.m208344M(this.f22223f, false);
        xdl0.m208344M(this.f22222e, true);
        qib0.f154691G.m102318F(qib0.f154691G.m184724n(pushMessageCustom.image).m8607O(new nvc0(this.f22222e.getAvatarSize(), this.f22222e.getAvatarSize())).m8614a(), new e30() { // from class: l.vys
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183548a.m37869g((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m37868f(View view) {
        yys.m216562a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m37869g(Bitmap bitmap) {
        this.f22222e.setAvatar(bitmap);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", 0.0f, -this.f22220c.getLayoutParams().height);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", (-this.f22220c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m37870h(View view) {
        qym qymVar = this.f22229l;
        if (qymVar == null || qymVar.f72298a == null) {
            return;
        }
        qymVar.m177045o();
        this.f22229l.f72298a.m220844J();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m37871i(View view) {
        qym qymVar = this.f22229l;
        if (qymVar == null || qymVar.f72298a == null) {
            return;
        }
        qymVar.m177045o();
        this.f22229l.f72298a.m220844J();
    }

    /* JADX INFO: renamed from: j */
    public void m37872j(PushMessage pushMessage, Act act) {
        mo37831b(pushMessage, act);
        xdl0.m208344M(this.f22227j, true);
        this.f22227j.setOnClickListener(new View.OnClickListener() { // from class: l.xys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195135a.m37870h(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m37873k(PushMessage pushMessage) {
        xdl0.m208344M(this.f22227j, true);
        this.f22227j.setOnClickListener(new View.OnClickListener() { // from class: l.wys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188672a.m37871i(view);
            }
        });
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        xdl0.m208344M(this.f22222e, false);
        String str = pushMessageCustom.image;
        if (!TextUtils.isEmpty(str)) {
            boolean zEndsWith = str.endsWith(".svga");
            AnimEffectPlayer animEffectPlayer = this.f22221d;
            if (zEndsWith) {
                xdl0.m208344M(animEffectPlayer, true);
                xdl0.m208344M(this.f22223f, false);
                this.f22221d.startSVGAAnim(str, -1);
            } else {
                xdl0.m208344M(animEffectPlayer, false);
                xdl0.m208344M(this.f22223f, true);
                qib0.f154691G.m102331L0(this.f22223f, str);
            }
        }
        this.f22224g.setText(pushMessageCustom.title);
        this.f22225h.setText(pushMessageCustom.content);
        if (TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            return;
        }
        this.f22226i.setText(pushMessageCustom.buttonText);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37868f(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22228k = motionEvent.getRawY();
        } else if (action == 2 && this.f22228k - motionEvent.getRawY() > f22219m) {
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
        if ((action != 1 && action != 3) || this.f22228k - motionEvent.getRawY() <= f22219m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22247a.call();
        this.f22247a = null;
        return true;
    }

    public void setHandler(qym qymVar) {
        this.f22229l = qymVar;
    }

    public LiveInternalPushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalPushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
