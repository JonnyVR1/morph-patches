package com.p046p1.mobile.putong.core.p053ui.messages;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.NewOnlineMatchSuccessItem;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.a1c0;
import p149l.bt0;
import p149l.d30;
import p149l.mz30;
import p149l.qib0;
import p149l.rw6;
import p149l.tqz;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class NewOnlineMatchSuccessItem extends LinearLayout {

    /* JADX INFO: renamed from: j */
    public static final ItemCountdownLikeSuccess.InterpolatorC8487a f31668j = new ItemCountdownLikeSuccess.InterpolatorC8487a(0.15f);

    /* JADX INFO: renamed from: a */
    public NewOnlineMatchSuccessItem f31669a;

    /* JADX INFO: renamed from: b */
    public VFrame f31670b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31671c;

    /* JADX INFO: renamed from: d */
    public VFrame f31672d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f31673e;

    /* JADX INFO: renamed from: f */
    public TextView f31674f;

    /* JADX INFO: renamed from: g */
    public TextView f31675g;

    /* JADX INFO: renamed from: h */
    public tqz f31676h;

    /* JADX INFO: renamed from: i */
    public int f31677i;

    public NewOnlineMatchSuccessItem(Context context) {
        super(context);
        this.f31677i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48985a() {
    }

    /* JADX INFO: renamed from: d */
    public final void m48988d(View view) {
        mz30.m157104a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48989e() {
        xdl0.m208345M0(this.f31671c, true);
        xdl0.m208345M0(this.f31673e, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m48990f() {
        VFrame vFrame = this.f31670b;
        vFrame.setPivotX((vFrame.getWidth() / 3) * 2);
        VFrame vFrame2 = this.f31670b;
        vFrame2.setPivotY(vFrame2.getHeight() * 2);
        VFrame vFrame3 = this.f31672d;
        vFrame3.setPivotX(vFrame3.getWidth() / 3);
        VFrame vFrame4 = this.f31672d;
        vFrame4.setPivotY(vFrame4.getHeight() * 2);
        VFrame vFrame5 = this.f31670b;
        long j = this.f31677i;
        ItemCountdownLikeSuccess.InterpolatorC8487a interpolatorC8487a = f31668j;
        Property property = View.ROTATION;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(vFrame5, property, 0L, j, interpolatorC8487a, -6.0f, 0.0f), bt0.m103739l(this.f31672d, property, 0L, this.f31677i, interpolatorC8487a, 6.0f, 0.0f));
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.kz30
            @Override // java.lang.Runnable
            public final void run() {
                this.f125355a.m48989e();
            }
        });
        animatorM103753z.start();
        this.f31676h.m190258J1(new d30() { // from class: l.lz30
            @Override // p149l.d30
            public final void call() {
                NewOnlineMatchSuccessItem.m48985a();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m48991g(tqz tqzVar, User user, User user2) {
        this.f31676h = tqzVar;
        if (user.isBannedNew() || user.isAccountCancellation()) {
            qib0.f154691G.m102354Y0(this.f31671c, CoreModule.m29935P().m94658i().mo158306T0());
        } else {
            qib0.f154691G.m102331L0(this.f31671c, rw6.m181385a(user).profileSmall().formatted());
        }
        qib0.f154691G.m102331L0(this.f31673e, rw6.m181386b(user2).profileSmall().formatted());
        if (tqzVar.m190261L0()) {
            xdl0.m208345M0(this.f31671c, false);
            xdl0.m208345M0(this.f31673e, false);
            post(new Runnable() { // from class: l.jz30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120349a.m48990f();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48988d(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31674f.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31675g.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public NewOnlineMatchSuccessItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31677i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    public NewOnlineMatchSuccessItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31677i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }
}
