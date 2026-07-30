package com.p051p1.mobile.putong.core.p058ui.messages;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCountdownLikeSuccess;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gt0;
import p153l.gta;
import p153l.i4g0;
import p153l.pf60;
import p153l.q4q;
import p153l.qzz;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemCountdownLikeSuccess extends FrameLayout {

    /* JADX INFO: renamed from: k */
    public static final InterpolatorC8650a f31756k = new InterpolatorC8650a(0.15f);

    /* JADX INFO: renamed from: a */
    public ItemCountdownLikeSuccess f31757a;

    /* JADX INFO: renamed from: b */
    public VFrame f31758b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31759c;

    /* JADX INFO: renamed from: d */
    public VFrame f31760d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f31761e;

    /* JADX INFO: renamed from: f */
    public TextView f31762f;

    /* JADX INFO: renamed from: g */
    public TextView f31763g;

    /* JADX INFO: renamed from: h */
    public boolean f31764h;

    /* JADX INFO: renamed from: i */
    public qzz f31765i;

    /* JADX INFO: renamed from: j */
    public int f31766j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemCountdownLikeSuccess$a */
    public static class InterpolatorC8650a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f31767a;

        public InterpolatorC8650a(float f) {
            this.f31767a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f31767a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public ItemCountdownLikeSuccess(@NonNull Context context) {
        super(context);
        this.f31764h = false;
        this.f31766j = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49298b() {
    }

    /* JADX INFO: renamed from: d */
    public final void m49300d(View view) {
        q4q.m175255a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49301e() {
        bnl0.m105525M0(this.f31759c, true);
        bnl0.m105525M0(this.f31761e, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m49302f() {
        VFrame vFrame = this.f31758b;
        vFrame.setPivotX((vFrame.getWidth() / 3) * 2);
        VFrame vFrame2 = this.f31758b;
        vFrame2.setPivotY(vFrame2.getHeight() * 2);
        VFrame vFrame3 = this.f31760d;
        vFrame3.setPivotX(vFrame3.getWidth() / 3);
        VFrame vFrame4 = this.f31760d;
        vFrame4.setPivotY(vFrame4.getHeight() * 2);
        VFrame vFrame5 = this.f31758b;
        long j = this.f31766j;
        InterpolatorC8650a interpolatorC8650a = f31756k;
        Property property = View.ROTATION;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(vFrame5, property, 0L, j, interpolatorC8650a, -6.0f, 0.0f), gt0.m132166l(this.f31760d, property, 0L, this.f31766j, interpolatorC8650a, 6.0f, 0.0f));
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.o4q
            @Override // java.lang.Runnable
            public final void run() {
                this.f145002a.m49301e();
            }
        });
        animatorM132180z.start();
        this.f31765i.m178899J1(new x20() { // from class: l.p4q
            @Override // p153l.x20
            public final void call() {
                ItemCountdownLikeSuccess.m49298b();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m49303g(qzz qzzVar, String str, Message message) {
        this.f31765i = qzzVar;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(userM116503Pa.f56859id);
        uqb0.f180374G.m127115L0(this.f31759c, userM116600p9.m61308fp().profileSmall().formatted());
        uqb0.f180374G.m127115L0(this.f31761e, userM116503Pa.m61308fp().profileSmall().formatted());
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isAnonymous()) {
            uqb0.f180374G.m127115L0(this.f31759c, userM116600p9.getAnonymousUrl());
            uqb0.f180374G.m127115L0(this.f31761e, userM116503Pa.getAnonymousUrl());
        }
        this.f31763g.setText(String.format(getContext().getString(R$string.f21678c1), userM116503Pa.name));
        if (!this.f31764h) {
            this.f31764h = true;
            i4g0.m138492A("e_chat_matched", OMSDialogPositon.p_chat_view, pf60.m172085a("matched_left_time", message.localExtraInfo));
        }
        if (qzzVar.m178902L0()) {
            post(new Runnable() { // from class: l.n4q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140249a.m49302f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49300d(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31762f.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31763g.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemCountdownLikeSuccess(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31764h = false;
        this.f31766j = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    public ItemCountdownLikeSuccess(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31764h = false;
        this.f31766j = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }
}
