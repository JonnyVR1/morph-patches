package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCountdownLikeSuccess;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.a1c0;
import p149l.bt0;
import p149l.d30;
import p149l.j760;
import p149l.q2q;
import p149l.qib0;
import p149l.tqz;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemCountdownLikeSuccess extends FrameLayout {

    /* JADX INFO: renamed from: k */
    public static final InterpolatorC8487a f30908k = new InterpolatorC8487a(0.15f);

    /* JADX INFO: renamed from: a */
    public ItemCountdownLikeSuccess f30909a;

    /* JADX INFO: renamed from: b */
    public VFrame f30910b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30911c;

    /* JADX INFO: renamed from: d */
    public VFrame f30912d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30913e;

    /* JADX INFO: renamed from: f */
    public TextView f30914f;

    /* JADX INFO: renamed from: g */
    public TextView f30915g;

    /* JADX INFO: renamed from: h */
    public boolean f30916h;

    /* JADX INFO: renamed from: i */
    public tqz f30917i;

    /* JADX INFO: renamed from: j */
    public int f30918j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemCountdownLikeSuccess$a */
    public static class InterpolatorC8487a implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f30919a;

        public InterpolatorC8487a(float f) {
            this.f30919a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f30919a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public ItemCountdownLikeSuccess(@NonNull Context context) {
        super(context);
        this.f30916h = false;
        this.f30918j = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48115b() {
    }

    /* JADX INFO: renamed from: d */
    public final void m48117d(View view) {
        q2q.m172474a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48118e() {
        xdl0.m208345M0(this.f30911c, true);
        xdl0.m208345M0(this.f30913e, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m48119f() {
        VFrame vFrame = this.f30910b;
        vFrame.setPivotX((vFrame.getWidth() / 3) * 2);
        VFrame vFrame2 = this.f30910b;
        vFrame2.setPivotY(vFrame2.getHeight() * 2);
        VFrame vFrame3 = this.f30912d;
        vFrame3.setPivotX(vFrame3.getWidth() / 3);
        VFrame vFrame4 = this.f30912d;
        vFrame4.setPivotY(vFrame4.getHeight() * 2);
        VFrame vFrame5 = this.f30910b;
        long j = this.f30918j;
        InterpolatorC8487a interpolatorC8487a = f30908k;
        Property property = View.ROTATION;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(vFrame5, property, 0L, j, interpolatorC8487a, -6.0f, 0.0f), bt0.m103739l(this.f30912d, property, 0L, this.f30918j, interpolatorC8487a, 6.0f, 0.0f));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.o2q
            @Override // java.lang.Runnable
            public final void run() {
                this.f141544a.m48118e();
            }
        });
        animatorM103753z.start();
        this.f30917i.m190258J1(new d30() { // from class: l.p2q
            @Override // p149l.d30
            public final void call() {
                ItemCountdownLikeSuccess.m48115b();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m48120g(tqz tqzVar, String str, Message message) {
        this.f30917i = tqzVar;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(userM169430Pa.f56011id);
        qib0.f154691G.m102331L0(this.f30911c, userM169527p9.m60124fp().profileSmall().formatted());
        qib0.f154691G.m102331L0(this.f30913e, userM169430Pa.m60124fp().profileSmall().formatted());
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isAnonymous()) {
            qib0.f154691G.m102331L0(this.f30911c, userM169527p9.getAnonymousUrl());
            qib0.f154691G.m102331L0(this.f30913e, userM169430Pa.getAnonymousUrl());
        }
        this.f30915g.setText(String.format(getContext().getString(R$string.f20936c1), userM169430Pa.name));
        if (!this.f30916h) {
            this.f30916h = true;
            zvf0.m220368A("e_chat_matched", OMSDialogPositon.p_chat_view, j760.m140076a("matched_left_time", message.localExtraInfo));
        }
        if (tqzVar.m190261L0()) {
            post(new Runnable() { // from class: l.n2q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136866a.m48119f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48117d(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30914f.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30915g.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemCountdownLikeSuccess(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30916h = false;
        this.f30918j = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    public ItemCountdownLikeSuccess(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30916h = false;
        this.f30918j = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }
}
