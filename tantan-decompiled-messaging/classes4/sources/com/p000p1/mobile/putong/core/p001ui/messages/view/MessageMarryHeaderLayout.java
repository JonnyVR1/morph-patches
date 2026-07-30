package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.fcz;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zqz;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageMarryHeaderLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageMarryHeaderLayout f258a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f259b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f260c;

    /* JADX INFO: renamed from: d */
    public TextView f261d;

    /* JADX INFO: renamed from: e */
    public TextView f262e;

    /* JADX INFO: renamed from: f */
    public TextView f263f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f264g;

    /* JADX INFO: renamed from: h */
    public VLinear f265h;

    public MessageMarryHeaderLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m368c(View view) {
        zqz.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m369d(boolean z, String str) {
        View vDraweeView = new VDraweeView(getContext());
        int i = t100.K;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        if (!z) {
            layoutParams.leftMargin = t100.e;
        }
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(t100.i);
        vDraweeView.getHierarchy().H(roundingParams);
        this.f265h.addView(vDraweeView, layoutParams);
        qib0.G.L0(vDraweeView, str);
        xdl0.E0(vDraweeView, new View.OnClickListener() { // from class: l.yqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23054a.m373h(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public String m370e(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            return "学生";
        }
        return (TextUtils.isEmpty(profile.work.department) || TextUtils.equals(user.profile.work.department, "其他") || TextUtils.equals(user.profile.work.department, "其它") || TextUtils.equals(user.profile.work.department, "学生")) ? "" : user.profile.work.department;
    }

    /* JADX INFO: renamed from: f */
    public boolean m371f(User user) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m372g() {
        if (getContext() instanceof MessagesAct) {
            fcz fczVar = getContext().f;
            if (NullChecker.a(fczVar)) {
                fczVar.v6("messages_thumbnail_left");
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m373h(View view) {
        m372g();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m374i(View view) {
        m372g();
    }

    /* JADX INFO: renamed from: j */
    public void m375j(User user) {
        String strM370e;
        this.f261d.getPaint().setFakeBoldText(true);
        boolean zM371f = m371f(user);
        TextView textView = this.f261d;
        if (zM371f) {
            textView.setText(user.publicId);
            qib0.G.Y0(this.f260c, CoreModule.P().i().T0());
            xdl0.M(this.f262e, false);
            xdl0.M(this.f263f, false);
            xdl0.M(this.f264g, false);
            return;
        }
        textView.setText(user.name);
        qib0.G.Q0(this.f260c, user.fp().profileSmall());
        xdl0.E0(this, new View.OnClickListener() { // from class: l.xqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22420a.m374i(view);
            }
        });
        if (CoreModule.c.E0.z3(user)) {
            strM370e = m370e(user);
        } else {
            strM370e = user.age + "岁 " + m370e(user);
        }
        xdl0.M(this.f262e, true);
        this.f262e.setText(strM370e);
        String marriageDeclaration = user.getMarriageDeclaration();
        boolean zIsEmpty = TextUtils.isEmpty(marriageDeclaration);
        TextView textView2 = this.f263f;
        if (zIsEmpty) {
            xdl0.M(textView2, false);
        } else {
            textView2.setText(marriageDeclaration);
            xdl0.M(this.f263f, true);
        }
        List marryLifeMoment = user.getMarryLifeMoment();
        boolean zJ = vwb.J(marryLifeMoment);
        HorizontalScrollView horizontalScrollView = this.f264g;
        if (zJ) {
            xdl0.M(horizontalScrollView, false);
            return;
        }
        xdl0.M(horizontalScrollView, true);
        this.f265h.removeAllViews();
        int i = 0;
        while (i < marryLifeMoment.size()) {
            m369d(i == 0, (String) marryLifeMoment.get(i));
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m368c(this);
    }

    public MessageMarryHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageMarryHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
