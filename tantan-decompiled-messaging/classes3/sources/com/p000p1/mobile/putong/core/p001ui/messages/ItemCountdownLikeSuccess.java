package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p000p1.mobile.putong.core.p001ui.messages.ItemCountdownLikeSuccess;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.bt0;
import l.j760;
import l.q2q;
import l.qib0;
import l.ura;
import l.xdl0;
import l.zvf0;
import p003l.d30;
import p003l.tqz;
import p028v.VDraweeView;
import p028v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemCountdownLikeSuccess extends FrameLayout {

    /* JADX INFO: renamed from: k */
    public static final InterpolatorC0070a f799k = new InterpolatorC0070a(0.15f);

    /* JADX INFO: renamed from: a */
    public ItemCountdownLikeSuccess f800a;

    /* JADX INFO: renamed from: b */
    public VFrame f801b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f802c;

    /* JADX INFO: renamed from: d */
    public VFrame f803d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f804e;

    /* JADX INFO: renamed from: f */
    public TextView f805f;

    /* JADX INFO: renamed from: g */
    public TextView f806g;

    /* JADX INFO: renamed from: h */
    public boolean f807h;

    /* JADX INFO: renamed from: i */
    public tqz f808i;

    /* JADX INFO: renamed from: j */
    public int f809j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemCountdownLikeSuccess$a */
    public static class InterpolatorC0070a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f810a;

        public InterpolatorC0070a(float f) {
            this.f810a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f810a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public ItemCountdownLikeSuccess(@NonNull Context context) {
        super(context);
        this.f807h = false;
        this.f809j = 1500;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1195b() {
    }

    /* JADX INFO: renamed from: d */
    public final void m1197d(View view) {
        q2q.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1198e() {
        xdl0.M0(this.f802c, true);
        xdl0.M0(this.f804e, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m1199f() {
        VFrame vFrame = this.f801b;
        vFrame.setPivotX((vFrame.getWidth() / 3) * 2);
        VFrame vFrame2 = this.f801b;
        vFrame2.setPivotY(vFrame2.getHeight() * 2);
        VFrame vFrame3 = this.f803d;
        vFrame3.setPivotX(vFrame3.getWidth() / 3);
        VFrame vFrame4 = this.f803d;
        vFrame4.setPivotY(vFrame4.getHeight() * 2);
        VFrame vFrame5 = this.f801b;
        long j = this.f809j;
        InterpolatorC0070a interpolatorC0070a = f799k;
        Property property = View.ROTATION;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(vFrame5, property, 0L, j, interpolatorC0070a, new float[]{-6.0f, 0.0f}), bt0.l(this.f803d, property, 0L, this.f809j, interpolatorC0070a, new float[]{6.0f, 0.0f})});
        bt0.v(animatorZ, new Runnable() { // from class: l.o2q
            @Override // java.lang.Runnable
            public final void run() {
                this.f6026a.m1198e();
            }
        });
        animatorZ.start();
        this.f808i.m7883J1(new d30() { // from class: l.p2q
            @Override // p003l.d30
            public final void call() {
                ItemCountdownLikeSuccess.m1195b();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m1200g(tqz tqzVar, String str, Message message) {
        this.f808i = tqzVar;
        User userPa = CoreModule.c.e0.Pa(str);
        User userP9 = CoreModule.c.e0.p9();
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) userPa).id);
        qib0.G.L0(this.f802c, userP9.fp().profileSmall().formatted());
        qib0.G.L0(this.f804e, userPa.fp().profileSmall().formatted());
        if (NullChecker.a(conversationXe) && conversationXe.isAnonymous()) {
            qib0.G.L0(this.f802c, userP9.getAnonymousUrl());
            qib0.G.L0(this.f804e, userPa.getAnonymousUrl());
        }
        this.f806g.setText(String.format(getContext().getString(R.string.c1), userPa.name));
        if (!this.f807h) {
            this.f807h = true;
            zvf0.A("e_chat_matched", "p_chat_view", new j760[]{j760.a("matched_left_time", message.localExtraInfo)});
        }
        if (tqzVar.m7886L0()) {
            post(new Runnable() { // from class: l.n2q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5824a.m1199f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1197d(this);
        if (ura.e().d().I4()) {
            this.f805f.setTextColor(getResources().getColor(a1c0.g));
            this.f806g.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemCountdownLikeSuccess(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f807h = false;
        this.f809j = 1500;
    }

    public ItemCountdownLikeSuccess(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f807h = false;
        this.f809j = 1500;
    }
}
