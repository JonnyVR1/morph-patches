package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlComplimentReceivedLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.ei4;
import p153l.gp5;
import p153l.qa00;
import p153l.t7m;
import p153l.uqb0;
import p153l.xr5;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomIntlComplimentReceivedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24215c;

    /* JADX INFO: renamed from: d */
    public VLinear f24216d;

    /* JADX INFO: renamed from: e */
    public VLinear f24217e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f24218f;

    /* JADX INFO: renamed from: g */
    public VImage f24219g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f24220h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f24221i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f24222j;

    public CardBottomIntlComplimentReceivedLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m39915P(Runnable runnable, View view) {
        gp5.m131233g("swipe");
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m39916Q(View view) {
        ei4.m120879a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m39917R(User user, SuggestedComplimentItem suggestedComplimentItem, t7m t7mVar, final Runnable runnable) {
        Media media;
        if (user == null) {
            return;
        }
        String strM212781a = (!NullChecker.m82486a(suggestedComplimentItem) || (media = suggestedComplimentItem.media) == null) ? null : xr5.m212781a(media);
        if (TextUtils.isEmpty(strM212781a)) {
            List<Media> list = user.pictures;
            if (list == null || list.isEmpty()) {
                bnl0.m105524M(this.f24220h, false);
            } else {
                uqb0.f180374G.m127125Q0(this.f24220h, user.m61308fp().profileSize(24));
                bnl0.m105524M(this.f24220h, true);
            }
        } else {
            uqb0.f180374G.m127109I0(this.f24220h, strM212781a, qa00.m175859d(26.0f), qa00.m175859d(26.0f));
            bnl0.m105524M(this.f24220h, true);
        }
        this.f24221i.setText(App.f16088e.getString(R$string.f18936V9));
        bnl0.m105509E0(this.f24217e, new View.OnClickListener() { // from class: l.di4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardBottomIntlComplimentReceivedLayout.m39915P(runnable, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39916Q(this);
    }

    public CardBottomIntlComplimentReceivedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomIntlComplimentReceivedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
