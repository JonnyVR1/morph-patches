package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.di4;
import p149l.dol;
import p149l.qib0;
import p149l.xdl0;
import p149l.yki0;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomThemeAnswerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23585c;

    /* JADX INFO: renamed from: d */
    public VLinear f23586d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f23587e;

    /* JADX INFO: renamed from: f */
    public VLinear f23588f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f23589g;

    /* JADX INFO: renamed from: h */
    public VText f23590h;

    /* JADX INFO: renamed from: i */
    public VText f23591i;

    public CardBottomThemeAnswerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38954P(View view) {
        di4.m111863a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m38955Q(dol dolVar) {
        if (yki0.m215127b().m215136h() && NullChecker.m81303a(dolVar.getUser()) && NullChecker.m81303a(dolVar.getUser().settings) && NullChecker.m81303a(dolVar.getUser().settings.omsSetting) && NullChecker.m81303a(dolVar.getUser().settings.omsSetting.themeView) && !TextUtils.isEmpty(dolVar.getUser().settings.omsSetting.themeView.icon)) {
            m38956R(dolVar.getUser());
        } else {
            xdl0.m208344M(this.f23588f, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m38956R(User user) {
        xdl0.m208344M(this.f23588f, true);
        qib0.f154691G.m102331L0(this.f23589g, user.settings.omsSetting.themeView.icon);
        this.f23590h.setText(user.settings.omsSetting.themeView.title);
        this.f23591i.setText(user.settings.omsSetting.themeView.subTitle);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38954P(this);
    }

    public CardBottomThemeAnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomThemeAnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
