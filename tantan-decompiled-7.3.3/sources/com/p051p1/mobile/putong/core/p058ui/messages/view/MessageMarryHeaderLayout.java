package com.p051p1.mobile.putong.core.p058ui.messages.view;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.clz;
import p153l.jyb;
import p153l.qa00;
import p153l.uqb0;
import p153l.wzz;

/* JADX INFO: loaded from: classes4.dex */
public class MessageMarryHeaderLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageMarryHeaderLayout f33284a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f33285b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f33286c;

    /* JADX INFO: renamed from: d */
    public TextView f33287d;

    /* JADX INFO: renamed from: e */
    public TextView f33288e;

    /* JADX INFO: renamed from: f */
    public TextView f33289f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f33290g;

    /* JADX INFO: renamed from: h */
    public VLinear f33291h;

    public MessageMarryHeaderLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m51129c(View view) {
        wzz.m208792a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m51130d(boolean z, String str) {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        int i = qa00.f156298K;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        if (!z) {
            layoutParams.leftMargin = qa00.f156318e;
        }
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8319s(qa00.f156322i);
        vDraweeView.getHierarchy().m207045H(roundingParams);
        this.f33291h.addView(vDraweeView, layoutParams);
        uqb0.f180374G.m127115L0(vDraweeView, str);
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.vzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186521a.m51134h(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public String m51131e(User user) {
        Profile profile = user.profile;
        if (profile.studies.active) {
            return "学生";
        }
        return (TextUtils.isEmpty(profile.work.department) || TextUtils.equals(user.profile.work.department, "其他") || TextUtils.equals(user.profile.work.department, "其它") || TextUtils.equals(user.profile.work.department, "学生")) ? "" : user.profile.work.department;
    }

    /* JADX INFO: renamed from: f */
    public boolean m51132f(User user) {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m51133g() {
        if (getContext() instanceof MessagesAct) {
            clz clzVar = ((MessagesAct) getContext()).f32488f;
            if (NullChecker.m82486a(clzVar)) {
                clzVar.m111056v6("messages_thumbnail_left");
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m51134h(View view) {
        m51133g();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m51135i(View view) {
        m51133g();
    }

    /* JADX INFO: renamed from: j */
    public void m51136j(User user) {
        String strM51131e;
        this.f33287d.getPaint().setFakeBoldText(true);
        boolean zM51132f = m51132f(user);
        TextView textView = this.f33287d;
        if (zM51132f) {
            textView.setText(user.publicId);
            uqb0.f180374G.m127138Y0(this.f33286c, CoreModule.m30933P().m143412i().mo180398T0());
            bnl0.m105524M(this.f33288e, false);
            bnl0.m105524M(this.f33289f, false);
            bnl0.m105524M(this.f33290g, false);
            return;
        }
        textView.setText(user.name);
        uqb0.f180374G.m127125Q0(this.f33286c, user.m61308fp().profileSmall());
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.uzz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181826a.m51135i(view);
            }
        });
        if (CoreModule.f18264c.f20303E0.m141091z3(user)) {
            strM51131e = m51131e(user);
        } else {
            strM51131e = user.age + "岁 " + m51131e(user);
        }
        bnl0.m105524M(this.f33288e, true);
        this.f33288e.setText(strM51131e);
        String marriageDeclaration = user.getMarriageDeclaration();
        boolean zIsEmpty = TextUtils.isEmpty(marriageDeclaration);
        TextView textView2 = this.f33289f;
        if (zIsEmpty) {
            bnl0.m105524M(textView2, false);
        } else {
            textView2.setText(marriageDeclaration);
            bnl0.m105524M(this.f33289f, true);
        }
        List<String> marryLifeMoment = user.getMarryLifeMoment();
        boolean zM147479J = jyb.m147479J(marryLifeMoment);
        HorizontalScrollView horizontalScrollView = this.f33290g;
        if (zM147479J) {
            bnl0.m105524M(horizontalScrollView, false);
            return;
        }
        bnl0.m105524M(horizontalScrollView, true);
        this.f33291h.removeAllViews();
        int i = 0;
        while (i < marryLifeMoment.size()) {
            m51130d(i == 0, marryLifeMoment.get(i));
            i++;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51129c(this);
    }

    public MessageMarryHeaderLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageMarryHeaderLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
