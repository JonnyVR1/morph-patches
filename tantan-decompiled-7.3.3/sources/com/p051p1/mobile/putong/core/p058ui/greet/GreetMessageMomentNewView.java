package com.p051p1.mobile.putong.core.p058ui.greet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VText;
import p153l.C20291td;
import p153l.bnl0;
import p153l.i4g0;
import p153l.ick;
import p153l.jyb;
import p153l.p9r;
import p153l.psd0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class GreetMessageMomentNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f30214a;

    /* JADX INFO: renamed from: b */
    public VImage f30215b;

    /* JADX INFO: renamed from: c */
    public VText f30216c;

    /* JADX INFO: renamed from: d */
    public VText f30217d;

    public GreetMessageMomentNewView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public View m46896c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ick.m139443b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final String m46897d(User user) {
        return (NullChecker.m82486a(user) && TEnum.equals(user.gender, "female")) ? "她" : "他";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m46899f(CoreMomentInfo coreMomentInfo, Throwable th) {
        m46898e(null, coreMomentInfo);
    }

    /* JADX INFO: renamed from: g */
    public void m46900g(Act act, String str, final CoreMomentInfo coreMomentInfo) {
        act.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(str)).filter(new C20291td()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.gck
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103585a.m46898e(coreMomentInfo, (User) obj);
            }
        }, new y20() { // from class: l.hck
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108703a.m46899f(coreMomentInfo, (Throwable) obj);
            }
        }));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m46898e(User user, CoreMomentInfo coreMomentInfo) {
        int iM175859d;
        this.f30216c.setText(m46897d(user) + "发布了动态");
        String str = NullChecker.m82486a(coreMomentInfo) ? coreMomentInfo.value : "内容已删除";
        float fMeasureText = this.f30217d.getPaint().measureText(str);
        if (fMeasureText > 0.0f) {
            if (fMeasureText <= qa00.m175859d(100.0f)) {
                iM175859d = qa00.m175859d(78.0f);
                bnl0.m105540X(this.f30217d, qa00.m175859d(9.0f));
            } else {
                float fM175859d = qa00.m175859d(195.0f);
                VText vText = this.f30217d;
                if (fMeasureText <= fM175859d) {
                    bnl0.m105540X(vText, qa00.m175859d(9.0f));
                    iM175859d = qa00.m175859d(16.0f);
                } else {
                    bnl0.m105540X(vText, qa00.m175859d(6.0f));
                    iM175859d = qa00.m175859d(16.0f);
                }
            }
            bnl0.m105539W(this.f30217d, iM175859d);
        }
        this.f30217d.setText(str);
        i4g0.m138492A("e_moment", "p_kankan_chat_popup", jyb.m147494Y("moment_id", coreMomentInfo.f56856id));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m46896c(p9r.m171370a(getContext()), this));
    }

    public GreetMessageMomentNewView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GreetMessageMomentNewView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
