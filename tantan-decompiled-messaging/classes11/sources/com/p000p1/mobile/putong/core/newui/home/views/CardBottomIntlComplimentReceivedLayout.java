package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomIntlComplimentReceivedLayout;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.co5;
import l.fh4;
import l.qib0;
import l.t100;
import l.tq5;
import l.xdl0;
import p009l.d5m;
import v.AutoVDraweeView;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomIntlComplimentReceivedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2251c;

    /* JADX INFO: renamed from: d */
    public VLinear f2252d;

    /* JADX INFO: renamed from: e */
    public VLinear f2253e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f2254f;

    /* JADX INFO: renamed from: g */
    public VImage f2255g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f2256h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f2257i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f2258j;

    public CardBottomIntlComplimentReceivedLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m2919P(Runnable runnable, View view) {
        co5.g("swipe");
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m2920Q(View view) {
        fh4.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m2921R(User user, SuggestedComplimentItem suggestedComplimentItem, d5m d5mVar, final Runnable runnable) {
        Media media;
        if (user == null) {
            return;
        }
        String strA = (!NullChecker.a(suggestedComplimentItem) || (media = suggestedComplimentItem.media) == null) ? null : tq5.a(media);
        if (TextUtils.isEmpty(strA)) {
            List list = user.pictures;
            if (list == null || list.isEmpty()) {
                xdl0.M(this.f2256h, false);
            } else {
                qib0.G.Q0(this.f2256h, user.fp().profileSize(24));
                xdl0.M(this.f2256h, true);
            }
        } else {
            qib0.G.I0(this.f2256h, strA, t100.d(26.0f), t100.d(26.0f));
            xdl0.M(this.f2256h, true);
        }
        this.f2257i.setText(App.e.getString(R.string.L9));
        xdl0.E0(this.f2253e, new View.OnClickListener() { // from class: l.eh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardBottomIntlComplimentReceivedLayout.m2919P(runnable, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2920Q(this);
    }

    public CardBottomIntlComplimentReceivedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomIntlComplimentReceivedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
