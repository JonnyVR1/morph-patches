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
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import p147v.AutoVDraweeView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.aym;
import p149l.bt0;
import p149l.jys;
import p149l.qib0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zxm;

/* JADX INFO: loaded from: classes11.dex */
public class LiveInternalBigStyle4VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f22197m = t100.f167257f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22198c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f22199d;

    /* JADX INFO: renamed from: e */
    public VImage f22200e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f22201f;

    /* JADX INFO: renamed from: g */
    public VText f22202g;

    /* JADX INFO: renamed from: h */
    public VText f22203h;

    /* JADX INFO: renamed from: i */
    public VText f22204i;

    /* JADX INFO: renamed from: j */
    public VButton f22205j;

    /* JADX INFO: renamed from: k */
    public float f22206k;

    /* JADX INFO: renamed from: l */
    public aym f22207l;

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m37851f(View view) {
        this.f22248b.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m37852g(View view) {
        zxm zxmVar;
        aym aymVar = this.f22207l;
        if (aymVar == null || (zxmVar = aymVar.f72298a) == null) {
            return;
        }
        zxmVar.m220844J();
        this.f22207l.mo37886f();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo37830a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo37831b(PushMessage pushMessage, Act act) {
        int i;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f22204i.setEllipsize(TextUtils.TruncateAt.END);
        this.f22202g.setText(pushMessageCustom.title);
        this.f22204i.setText(pushMessageCustom.content);
        boolean zIsEmpty = TextUtils.isEmpty(pushMessageCustom.subTitle);
        VText vText = this.f22203h;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            byte b = 1;
            xdl0.m208344M(vText, true);
            this.f22203h.setText(pushMessageCustom.subTitle);
            String str = pushMessageCustom.state;
            if (str != null) {
                str.getClass();
                switch (str.hashCode()) {
                    case -1718391333:
                        b = !str.equals("super_like") ? (byte) -1 : (byte) 0;
                        break;
                    case -600094315:
                        if (!str.equals("friends")) {
                            b = -1;
                        }
                        break;
                    case 102974381:
                        b = !str.equals("liked") ? (byte) -1 : (byte) 2;
                        break;
                    case 765915793:
                        b = !str.equals(FollowshipStatus.following) ? (byte) -1 : (byte) 3;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        i = x2c0.f190071d9;
                        break;
                    case 1:
                        i = x2c0.f190007b9;
                        break;
                    case 2:
                        i = x2c0.f190039c9;
                        break;
                    case 3:
                        i = x2c0.f189975a9;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 0;
            }
            this.f22203h.setCompoundDrawablePadding(t100.f167254c);
            this.f22203h.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f22205j.setText(pushMessageCustom.buttonText);
        }
        qib0.f154691G.m102331L0(this.f22199d, "https://static.tancdn.com/pe-webplatform/N_ecHA8oYXuERuDq5O45dXsa.webp");
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            this.f22201f.setImageUrl(pushMessageCustom.image);
        }
        xdl0.m208329E0(this.f22200e, new View.OnClickListener() { // from class: l.hys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110143a.m37851f(view);
            }
        });
        this.f22205j.setOnClickListener(new View.OnClickListener() { // from class: l.iys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115477a.m37852g(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m37853e(View view) {
        jys.m143879a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", 0.0f, -this.f22198c.getLayoutParams().height);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorM103744q = bt0.m103744q(this, "translationY", (-this.f22198c.getLayoutParams().height) - getTranslationY(), 0.0f);
        animatorM103744q.setDuration(400L);
        return animatorM103744q;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m37854h(aym<?> aymVar) {
        this.f22207l = aymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37853e(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22206k = motionEvent.getRawY();
        } else if (action == 2 && this.f22206k - motionEvent.getRawY() > f22197m) {
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
        if ((action != 1 && action != 3) || this.f22206k - motionEvent.getRawY() <= f22197m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f22247a.call();
        this.f22247a = null;
        return true;
    }

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
