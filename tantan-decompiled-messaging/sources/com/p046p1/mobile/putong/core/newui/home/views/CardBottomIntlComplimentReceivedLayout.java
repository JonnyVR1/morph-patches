package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.SuggestedComplimentItem;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlComplimentReceivedLayout;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.co5;
import p149l.d5m;
import p149l.fh4;
import p149l.qib0;
import p149l.t100;
import p149l.tq5;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomIntlComplimentReceivedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23473c;

    /* JADX INFO: renamed from: d */
    public VLinear f23474d;

    /* JADX INFO: renamed from: e */
    public VLinear f23475e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f23476f;

    /* JADX INFO: renamed from: g */
    public VImage f23477g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f23478h;

    /* JADX INFO: renamed from: i */
    public VText_NoTopPadding f23479i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f23480j;

    public CardBottomIntlComplimentReceivedLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m38912P(Runnable runnable, View view) {
        co5.m107935g("swipe");
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m38913Q(View view) {
        fh4.m121348a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m38914R(User user, SuggestedComplimentItem suggestedComplimentItem, d5m d5mVar, final Runnable runnable) {
        Media media;
        if (user == null) {
            return;
        }
        String strM190084a = (!NullChecker.m81303a(suggestedComplimentItem) || (media = suggestedComplimentItem.media) == null) ? null : tq5.m190084a(media);
        if (TextUtils.isEmpty(strM190084a)) {
            List<Media> list = user.pictures;
            if (list == null || list.isEmpty()) {
                xdl0.m208344M(this.f23478h, false);
            } else {
                qib0.f154691G.m102341Q0(this.f23478h, user.m60124fp().profileSize(24));
                xdl0.m208344M(this.f23478h, true);
            }
        } else {
            qib0.f154691G.m102325I0(this.f23478h, strM190084a, t100.m186890d(26.0f), t100.m186890d(26.0f));
            xdl0.m208344M(this.f23478h, true);
        }
        this.f23479i.setText(App.f15369e.getString(R$string.f17906L9));
        xdl0.m208329E0(this.f23475e, new View.OnClickListener() { // from class: l.eh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardBottomIntlComplimentReceivedLayout.m38912P(runnable, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38913Q(this);
    }

    public CardBottomIntlComplimentReceivedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomIntlComplimentReceivedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
