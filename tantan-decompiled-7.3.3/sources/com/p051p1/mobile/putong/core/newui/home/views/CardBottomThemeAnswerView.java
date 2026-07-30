package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.cj4;
import p153l.oql;
import p153l.uqb0;
import p153l.yti0;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomThemeAnswerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24327c;

    /* JADX INFO: renamed from: d */
    public VLinear f24328d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f24329e;

    /* JADX INFO: renamed from: f */
    public VLinear f24330f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f24331g;

    /* JADX INFO: renamed from: h */
    public VText f24332h;

    /* JADX INFO: renamed from: i */
    public VText f24333i;

    public CardBottomThemeAnswerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39957P(View view) {
        cj4.m110061a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m39958Q(oql oqlVar) {
        if (yti0.m217322b().m217331h() && NullChecker.m82486a(oqlVar.getUser()) && NullChecker.m82486a(oqlVar.getUser().settings) && NullChecker.m82486a(oqlVar.getUser().settings.omsSetting) && NullChecker.m82486a(oqlVar.getUser().settings.omsSetting.themeView) && !TextUtils.isEmpty(oqlVar.getUser().settings.omsSetting.themeView.icon)) {
            m39959R(oqlVar.getUser());
        } else {
            bnl0.m105524M(this.f24330f, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m39959R(User user) {
        bnl0.m105524M(this.f24330f, true);
        uqb0.f180374G.m127115L0(this.f24331g, user.settings.omsSetting.themeView.icon);
        this.f24332h.setText(user.settings.omsSetting.themeView.title);
        this.f24333i.setText(user.settings.omsSetting.themeView.subTitle);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39957P(this);
    }

    public CardBottomThemeAnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomThemeAnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
