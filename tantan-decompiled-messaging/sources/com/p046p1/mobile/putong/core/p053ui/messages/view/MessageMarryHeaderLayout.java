package com.p046p1.mobile.putong.core.p053ui.messages.view;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.fcz;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zqz;

/* JADX INFO: loaded from: classes4.dex */
public class MessageMarryHeaderLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageMarryHeaderLayout f32436a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f32437b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32438c;

    /* JADX INFO: renamed from: d */
    public TextView f32439d;

    /* JADX INFO: renamed from: e */
    public TextView f32440e;

    /* JADX INFO: renamed from: f */
    public TextView f32441f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f32442g;

    /* JADX INFO: renamed from: h */
    public VLinear f32443h;

    public MessageMarryHeaderLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m49946c(View view) {
        zqz.m219913a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m49947d(boolean z, String str) {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        int i = t100.f167236K;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        if (!z) {
            layoutParams.leftMargin = t100.f167256e;
        }
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8265s(t100.f167260i);
        vDraweeView.getHierarchy().m112053H(roundingParams);
        this.f32443h.addView(vDraweeView, layoutParams);
        qib0.f154691G.m102331L0(vDraweeView, str);
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.yqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199622a.m49951h(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public String m49948e(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            return "学生";
        }
        return (TextUtils.isEmpty(profile.work.department) || TextUtils.equals(user.profile.work.department, "其他") || TextUtils.equals(user.profile.work.department, "其它") || TextUtils.equals(user.profile.work.department, "学生")) ? "" : user.profile.work.department;
    }

    /* JADX INFO: renamed from: f */
    public boolean m49949f(User user) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m49950g() {
        if (getContext() instanceof MessagesAct) {
            fcz fczVar = ((MessagesAct) getContext()).f31640f;
            if (NullChecker.m81303a(fczVar)) {
                fczVar.m120850v6("messages_thumbnail_left");
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49951h(View view) {
        m49950g();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m49952i(View view) {
        m49950g();
    }

    /* JADX INFO: renamed from: j */
    public void m49953j(User user) {
        String strM49948e;
        this.f32439d.getPaint().setFakeBoldText(true);
        boolean zM49949f = m49949f(user);
        TextView textView = this.f32439d;
        if (zM49949f) {
            textView.setText(user.publicId);
            qib0.f154691G.m102354Y0(this.f32438c, CoreModule.m29935P().m94658i().mo158306T0());
            xdl0.m208344M(this.f32440e, false);
            xdl0.m208344M(this.f32441f, false);
            xdl0.m208344M(this.f32442g, false);
            return;
        }
        textView.setText(user.name);
        qib0.f154691G.m102341Q0(this.f32438c, user.m60124fp().profileSmall());
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.xqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194062a.m49952i(view);
            }
        });
        if (CoreModule.f17545c.f19561E0.m203803z3(user)) {
            strM49948e = m49948e(user);
        } else {
            strM49948e = user.age + "岁 " + m49948e(user);
        }
        xdl0.m208344M(this.f32440e, true);
        this.f32440e.setText(strM49948e);
        String marriageDeclaration = user.getMarriageDeclaration();
        boolean zIsEmpty = TextUtils.isEmpty(marriageDeclaration);
        TextView textView2 = this.f32441f;
        if (zIsEmpty) {
            xdl0.m208344M(textView2, false);
        } else {
            textView2.setText(marriageDeclaration);
            xdl0.m208344M(this.f32441f, true);
        }
        List<String> marryLifeMoment = user.getMarryLifeMoment();
        boolean zM200296J = vwb.m200296J(marryLifeMoment);
        HorizontalScrollView horizontalScrollView = this.f32442g;
        if (zM200296J) {
            xdl0.m208344M(horizontalScrollView, false);
            return;
        }
        xdl0.m208344M(horizontalScrollView, true);
        this.f32443h.removeAllViews();
        int i = 0;
        while (i < marryLifeMoment.size()) {
            m49947d(i == 0, marryLifeMoment.get(i));
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49946c(this);
    }

    public MessageMarryHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageMarryHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
