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
import l.jys;
import l.qib0;
import l.t100;
import l.x2c0;
import l.xdl0;
import p009l.aym;
import p009l.zxm;
import v.AutoVDraweeView;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveInternalBigStyle4VirtualVoicePushView extends LiveInternalPushBaseView {

    /* JADX INFO: renamed from: m */
    public static final int f975m = t100.f;

    /* JADX INFO: renamed from: c */
    public FrameLayout f976c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f977d;

    /* JADX INFO: renamed from: e */
    public VImage f978e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f979f;

    /* JADX INFO: renamed from: g */
    public VText f980g;

    /* JADX INFO: renamed from: h */
    public VText f981h;

    /* JADX INFO: renamed from: i */
    public VText f982i;

    /* JADX INFO: renamed from: j */
    public VButton f983j;

    /* JADX INFO: renamed from: k */
    public float f984k;

    /* JADX INFO: renamed from: l */
    public aym f985l;

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m1822f(View view) {
        this.f1026b.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m1823g(View view) {
        zxm zxmVar;
        aym aymVar = this.f985l;
        if (aymVar == null || (zxmVar = aymVar.f9776a) == null) {
            return;
        }
        zxmVar.m26111J();
        this.f985l.mo1857f();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: a */
    public boolean mo1801a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    /* JADX INFO: renamed from: b */
    public void mo1802b(PushMessage pushMessage, Act act) {
        int i;
        PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
        this.f982i.setEllipsize(TextUtils.TruncateAt.END);
        this.f980g.setText(pushMessageCustom.title);
        this.f982i.setText(pushMessageCustom.content);
        boolean zIsEmpty = TextUtils.isEmpty(pushMessageCustom.subTitle);
        VText vText = this.f981h;
        if (zIsEmpty) {
            xdl0.M(vText, false);
        } else {
            byte b = 1;
            xdl0.M(vText, true);
            this.f981h.setText(pushMessageCustom.subTitle);
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
                        b = !str.equals("following") ? (byte) -1 : (byte) 3;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        i = x2c0.d9;
                        break;
                    case 1:
                        i = x2c0.b9;
                        break;
                    case 2:
                        i = x2c0.c9;
                        break;
                    case 3:
                        i = x2c0.a9;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = 0;
            }
            this.f981h.setCompoundDrawablePadding(t100.c);
            this.f981h.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
        if (!TextUtils.isEmpty(pushMessageCustom.buttonText)) {
            this.f983j.setText(pushMessageCustom.buttonText);
        }
        qib0.G.L0(this.f977d, "https://static.tancdn.com/pe-webplatform/N_ecHA8oYXuERuDq5O45dXsa.webp");
        if (!TextUtils.isEmpty(pushMessageCustom.image)) {
            this.f979f.setImageUrl(pushMessageCustom.image);
        }
        xdl0.E0(this.f978e, new View.OnClickListener() { // from class: l.hys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14311a.m1822f(view);
            }
        });
        this.f983j.setOnClickListener(new View.OnClickListener() { // from class: l.iys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14864a.m1823g(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m1824e(View view) {
        jys.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getHideAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{0.0f, -this.f976c.getLayoutParams().height});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView
    public Animator getShowAnim() {
        Animator animatorQ = bt0.q(this, "translationY", new float[]{(-this.f976c.getLayoutParams().height) - getTranslationY(), 0.0f});
        animatorQ.setDuration(400L);
        return animatorQ;
    }

    /* JADX INFO: renamed from: h */
    public LiveInternalPushBaseView m1825h(aym<?> aymVar) {
        this.f985l = aymVar;
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1824e(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f984k = motionEvent.getRawY();
        } else if (action == 2 && this.f984k - motionEvent.getRawY() > f975m) {
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
        if ((action != 1 && action != 3) || this.f984k - motionEvent.getRawY() <= f975m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1025a.call();
        this.f1025a = null;
        return true;
    }

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveInternalBigStyle4VirtualVoicePushView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
