package com.p000p1.mobile.putong.core.p001ui.greet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;
import l.o7r;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yd;
import l.zvf0;
import p003l.r9k;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GreetMessageMomentNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f1760a;

    /* JADX INFO: renamed from: b */
    public VImage f1761b;

    /* JADX INFO: renamed from: c */
    public VText f1762c;

    /* JADX INFO: renamed from: d */
    public VText f1763d;

    public GreetMessageMomentNewView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public View m3051c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r9k.m9092b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final String m3052d(User user) {
        return (NullChecker.a(user) && TEnum.equals(user.gender, "female")) ? "她" : "他";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m3054f(CoreMomentInfo coreMomentInfo, Throwable th) {
        m3053e(null, coreMomentInfo);
    }

    /* JADX INFO: renamed from: g */
    public void m3055g(Act act, String str, final CoreMomentInfo coreMomentInfo) {
        act.duringCreated(CoreModule.c.e0.Ka(str)).filter(new yd()).take(1).subscribe(mkd0.H(new e30() { // from class: l.p9k
            public final void call(Object obj) {
                this.f6836a.m3053e(coreMomentInfo, (User) obj);
            }
        }, new e30() { // from class: l.q9k
            public final void call(Object obj) {
                this.f6990a.m3054f(coreMomentInfo, (Throwable) obj);
            }
        }));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m3053e(User user, CoreMomentInfo coreMomentInfo) {
        int iD;
        this.f1762c.setText(m3052d(user) + "发布了动态");
        String str = NullChecker.a(coreMomentInfo) ? coreMomentInfo.value : "内容已删除";
        float fMeasureText = this.f1763d.getPaint().measureText(str);
        if (fMeasureText > 0.0f) {
            if (fMeasureText <= t100.d(100.0f)) {
                iD = t100.d(78.0f);
                xdl0.X(this.f1763d, t100.d(9.0f));
            } else {
                float fD = t100.d(195.0f);
                VText vText = this.f1763d;
                if (fMeasureText <= fD) {
                    xdl0.X(vText, t100.d(9.0f));
                    iD = t100.d(16.0f);
                } else {
                    xdl0.X(vText, t100.d(6.0f));
                    iD = t100.d(16.0f);
                }
            }
            xdl0.W(this.f1763d, iD);
        }
        this.f1763d.setText(str);
        zvf0.A("e_moment", "p_kankan_chat_popup", new j760[]{vwb.Y("moment_id", ((CopyObject) coreMomentInfo).id)});
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m3051c(o7r.a(getContext()), this));
    }

    public GreetMessageMomentNewView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GreetMessageMomentNewView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
