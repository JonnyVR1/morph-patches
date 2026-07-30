package com.p000p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CommonDoubleTitleIconClick;
import com.p1.mobile.putong.core.data.CommonDoubleTitleIconClickList;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageItemButton;
import com.p1.mobile.putong.core.data.MessageItemStatistics;
import com.p1.mobile.putong.core.data.MessageItemdata;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.h2q;
import l.j760;
import l.qib0;
import l.qsz;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ItemCommonIconTitleDesClikeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemCommonIconTitleDesClikeView f4558a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f4559b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4560c;

    /* JADX INFO: renamed from: d */
    public VText f4561d;

    /* JADX INFO: renamed from: e */
    public VText f4562e;

    /* JADX INFO: renamed from: f */
    public VText f4563f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView$a */
    public class ViewOnClickListenerC0342a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CommonDoubleTitleIconClick f4564a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f4565b;

        public ViewOnClickListenerC0342a(CommonDoubleTitleIconClick commonDoubleTitleIconClick, Act act) {
            this.f4564a = commonDoubleTitleIconClick;
            this.f4565b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(this.f4564a) && NullChecker.a(this.f4564a.target) && !TextUtils.isEmpty(this.f4564a.target.deeplink)) {
                CoreModule.P().a().Y(this.f4565b, Uri.parse(this.f4564a.target.deeplink));
                if (!NullChecker.a(this.f4564a.statistics) || TextUtils.isEmpty(this.f4564a.statistics.id)) {
                    return;
                }
                MessageItemStatistics messageItemStatistics = this.f4564a.statistics;
                MessageItemdata messageItemdata = messageItemStatistics.data;
                zvf0.u(messageItemStatistics.id, ItemCommonIconTitleDesClikeView.this.getContext().pageId(), new j760[]{vwb.Y("tips_source", messageItemdata != null ? messageItemdata.tips_source : "")});
            }
        }
    }

    public ItemCommonIconTitleDesClikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m6526a(View view) {
        h2q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6527b(Act act, Message message, User user, qsz qszVar) {
        CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = CommonDoubleTitleIconClickList.parse(message.msgData);
        if (commonDoubleTitleIconClickList == null || vwb.J(commonDoubleTitleIconClickList.msgData)) {
            return;
        }
        CommonDoubleTitleIconClick commonDoubleTitleIconClick = (CommonDoubleTitleIconClick) commonDoubleTitleIconClickList.msgData.get(0);
        if (NullChecker.a(commonDoubleTitleIconClick)) {
            xdl0.c0(this.f4558a, t100.q);
            this.f4561d.setTextSize(15.0f);
            this.f4561d.setText(commonDoubleTitleIconClick.title);
            this.f4562e.setText(commonDoubleTitleIconClick.subtitle);
            MessageItemButton messageItemButton = commonDoubleTitleIconClick.button;
            if (messageItemButton != null) {
                this.f4563f.setText(messageItemButton.title);
            }
            this.f4563f.setIncludeFontPadding(true);
            VText vText = this.f4563f;
            int i = t100.j;
            vText.setPadding(i, t100.d(7.0f), i, t100.d(7.0f));
            xdl0.X(this.f4562e, t100.d(7.0f));
            this.f4563f.setTypeface((Typeface) null, 1);
            this.f4561d.setTypeface((Typeface) null, 1);
            qib0.G.Y0(this.f4560c, c3c0.Z);
            if (!TextUtils.isEmpty(commonDoubleTitleIconClick.iconUrl)) {
                qib0.G.L0(this.f4560c, commonDoubleTitleIconClick.iconUrl);
            }
            xdl0.E0(this.f4563f, new ViewOnClickListenerC0342a(commonDoubleTitleIconClick, act));
            if (!NullChecker.a(commonDoubleTitleIconClick.statistics) || TextUtils.isEmpty(commonDoubleTitleIconClick.statistics.id)) {
                return;
            }
            MessageItemStatistics messageItemStatistics = commonDoubleTitleIconClick.statistics;
            MessageItemdata messageItemdata = messageItemStatistics.data;
            zvf0.A(messageItemStatistics.id, getContext().pageId(), new j760[]{vwb.Y("tips_source", messageItemdata != null ? messageItemdata.tips_source : "")});
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6526a(this);
        if (ura.e().d().I4()) {
            this.f4561d.setTextColor(getResources().getColor(a1c0.g));
            this.f4562e.setTextColor(getResources().getColor(a1c0.i));
            this.f4563f.setBackgroundResource(c3c0.t);
        }
    }

    public ItemCommonIconTitleDesClikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCommonIconTitleDesClikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ItemCommonIconTitleDesClikeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
