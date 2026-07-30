package com.p046p1.mobile.putong.core.newui.home.bubble.internalpush;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import p147v.AutoVDraweeView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.cym;
import p149l.dys;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zxm;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalBigStyle2VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f22168m = t100.f167257f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22169c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22170d;

    /* JADX INFO: renamed from: e */
    public VImage f22171e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f22172f;

    /* JADX INFO: renamed from: g */
    public VText f22173g;

    /* JADX INFO: renamed from: h */
    public VText f22174h;

    /* JADX INFO: renamed from: i */
    public VText f22175i;

    /* JADX INFO: renamed from: j */
    public VButton f22176j;

    /* JADX INFO: renamed from: k */
    public float f22177k;

    /* JADX INFO: renamed from: l */
    public cym f22178l;

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m37839f(View view) {
        this.f22248b.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m37840g(View view) {
        zxm zxmVar;
        cym cymVar = this.f22178l;
        if (cymVar == null || (zxmVar = cymVar.f72298a) == null) {
            return;
        }
        zxmVar.m220844J();
        this.f22178l.mo37886f();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo37830a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo37831b(PushMessage pushMessage, Act act) {
        int i;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22175i.setEllipsize(TextUtils.TruncateAt.END);
        this.f22173g.setText(pushMessageCustom.title);
        this.f22175i.setText(pushMessageCustom.content);
        this.f22174h.setText(pushMessageCustom.subTitle);
        String str = pushMessageCustom.state;
        if (str != null) {
            str.getClass();
            switch (str) {
                case "super_like":
                    i = x2c0.f190071d9;
                    break;
                case "friends":
                    i = x2c0.f190007b9;
                    break;
                case "liked":
                    i = x2c0.f190039c9;
                    break;
                case "following":
                    i = x2c0.f189975a9;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 0;
        }
        this.f22174h.setCompoundDrawablePadding(t100.f167254c);
        this.f22174h.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22176j.setText(pushMessageCustom.buttonText);
        }
        qib0.f154691G.m102331L0(this.f22170d, "https://auto.tancdn.com/v1/images/eyJpZCI6IjQyT05ST0FYS1lCUkpEQk83UlM2WVpUTlJNSFlaVDExIiwidyI6MTQzNiwiaCI6NzU2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzMzMjA3Mjk0ODg5MzEyNDE3M30.png");
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            this.f22172f.setImageUrl(pushMessageCustom.image);
        }
        xdl0.m208329E0(this.f22171e, new View.OnClickListener() { // from class: l.bys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77963a.m37839f(view);
            }
        });
        this.f22176j.setOnClickListener(new View.OnClickListener() { // from class: l.cys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83029a.m37840g(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m37841e(View view) {
        dys.m114092a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", 0.0f, -this.f22169c.getLayoutParams().height);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", (-this.f22169c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m37842h(cym cymVar) {
        this.f22178l = cymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37841e(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22177k = motionEvent.getRawY();
        } else if (action == 2 && this.f22177k - motionEvent.getRawY() > f22168m) {
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
        if ((action != 1 && action != 3) || this.f22177k - motionEvent.getRawY() <= f22168m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22247a.call();
        this.f22247a = null;
        return true;
    }

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalBigStyle2VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
