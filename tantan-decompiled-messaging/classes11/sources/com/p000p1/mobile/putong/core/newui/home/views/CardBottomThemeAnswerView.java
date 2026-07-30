package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.di4;
import l.qib0;
import l.xdl0;
import p009l.dol;
import p009l.yki0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomThemeAnswerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2363c;

    /* JADX INFO: renamed from: d */
    public VLinear f2364d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f2365e;

    /* JADX INFO: renamed from: f */
    public VLinear f2366f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f2367g;

    /* JADX INFO: renamed from: h */
    public VText f2368h;

    /* JADX INFO: renamed from: i */
    public VText f2369i;

    public CardBottomThemeAnswerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2961P(View view) {
        di4.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m2962Q(dol dolVar) {
        if (yki0.m25445b().m25454h() && NullChecker.a(dolVar.getUser()) && NullChecker.a(dolVar.getUser().settings) && NullChecker.a(dolVar.getUser().settings.omsSetting) && NullChecker.a(dolVar.getUser().settings.omsSetting.themeView) && !TextUtils.isEmpty(dolVar.getUser().settings.omsSetting.themeView.icon)) {
            m2963R(dolVar.getUser());
        } else {
            xdl0.M(this.f2366f, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m2963R(User user) {
        xdl0.M(this.f2366f, true);
        qib0.G.L0(this.f2367g, user.settings.omsSetting.themeView.icon);
        this.f2368h.setText(user.settings.omsSetting.themeView.title);
        this.f2369i.setText(user.settings.omsSetting.themeView.subTitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2961P(this);
    }

    public CardBottomThemeAnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomThemeAnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
