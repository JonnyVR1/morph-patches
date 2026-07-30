package com.p046p1.mobile.putong.core.p053ui.greet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VText;
import p149l.C21368yd;
import p149l.e30;
import p149l.mkd0;
import p149l.o7r;
import p149l.r9k;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GreetMessageMomentNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f29366a;

    /* JADX INFO: renamed from: b */
    public VImage f29367b;

    /* JADX INFO: renamed from: c */
    public VText f29368c;

    /* JADX INFO: renamed from: d */
    public VText f29369d;

    public GreetMessageMomentNewView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public View m45713c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r9k.m178377b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final String m45714d(User user) {
        return (NullChecker.m81303a(user) && TEnum.equals(user.gender, "female")) ? "她" : "他";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m45716f(CoreMomentInfo coreMomentInfo, Throwable th) {
        m45715e(null, coreMomentInfo);
    }

    /* JADX INFO: renamed from: g */
    public void m45717g(Act act, String str, final CoreMomentInfo coreMomentInfo) {
        act.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(str)).filter(new C21368yd()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.p9k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147770a.m45715e(coreMomentInfo, (User) obj);
            }
        }, new e30() { // from class: l.q9k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153442a.m45716f(coreMomentInfo, (Throwable) obj);
            }
        }));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m45715e(User user, CoreMomentInfo coreMomentInfo) {
        int iM186890d;
        this.f29368c.setText(m45714d(user) + "发布了动态");
        String str = NullChecker.m81303a(coreMomentInfo) ? coreMomentInfo.value : "内容已删除";
        float fMeasureText = this.f29369d.getPaint().measureText(str);
        if (fMeasureText > 0.0f) {
            if (fMeasureText <= t100.m186890d(100.0f)) {
                iM186890d = t100.m186890d(78.0f);
                xdl0.m208360X(this.f29369d, t100.m186890d(9.0f));
            } else {
                float fM186890d = t100.m186890d(195.0f);
                VText vText = this.f29369d;
                if (fMeasureText <= fM186890d) {
                    xdl0.m208360X(vText, t100.m186890d(9.0f));
                    iM186890d = t100.m186890d(16.0f);
                } else {
                    xdl0.m208360X(vText, t100.m186890d(6.0f));
                    iM186890d = t100.m186890d(16.0f);
                }
            }
            xdl0.m208359W(this.f29369d, iM186890d);
        }
        this.f29369d.setText(str);
        zvf0.m220368A("e_moment", "p_kankan_chat_popup", vwb.m200311Y("moment_id", coreMomentInfo.f56008id));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(m45713c(o7r.m163037a(getContext()), this));
    }

    public GreetMessageMomentNewView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GreetMessageMomentNewView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
