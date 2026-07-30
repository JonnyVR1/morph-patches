package com.p051p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CommonDoubleTitleIconClick;
import com.p051p1.mobile.putong.core.data.CommonDoubleTitleIconClickList;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageItemButton;
import com.p051p1.mobile.putong.core.data.MessageItemStatistics;
import com.p051p1.mobile.putong.core.data.MessageItemdata;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.h4q;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.n100;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemCommonIconTitleDesClikeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemCommonIconTitleDesClikeView f26522a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f26523b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f26524c;

    /* JADX INFO: renamed from: d */
    public VText f26525d;

    /* JADX INFO: renamed from: e */
    public VText f26526e;

    /* JADX INFO: renamed from: f */
    public VText f26527f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView$a */
    public class ViewOnClickListenerC8329a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CommonDoubleTitleIconClick f26528a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f26529b;

        public ViewOnClickListenerC8329a(CommonDoubleTitleIconClick commonDoubleTitleIconClick, Act act) {
            this.f26528a = commonDoubleTitleIconClick;
            this.f26529b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(this.f26528a) && NullChecker.m82486a(this.f26528a.target) && !TextUtils.isEmpty(this.f26528a.target.deeplink)) {
                CoreModule.m30933P().m143405a().mo180426Y(this.f26529b, Uri.parse(this.f26528a.target.deeplink));
                if (!NullChecker.m82486a(this.f26528a.statistics) || TextUtils.isEmpty(this.f26528a.statistics.f21187id)) {
                    return;
                }
                MessageItemStatistics messageItemStatistics = this.f26528a.statistics;
                MessageItemdata messageItemdata = messageItemStatistics.data;
                i4g0.m138523u(messageItemStatistics.f21187id, ((Act) ItemCommonIconTitleDesClikeView.this.getContext()).pageId(), jyb.m147494Y("tips_source", messageItemdata != null ? messageItemdata.tips_source : ""));
            }
        }
    }

    public ItemCommonIconTitleDesClikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43382a(View view) {
        h4q.m133592a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m43383b(Act act, Message message, User user, n100 n100Var) {
        CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = CommonDoubleTitleIconClickList.parse(message.msgData);
        if (commonDoubleTitleIconClickList == null || jyb.m147479J(commonDoubleTitleIconClickList.msgData)) {
            return;
        }
        CommonDoubleTitleIconClick commonDoubleTitleIconClick = commonDoubleTitleIconClickList.msgData.get(0);
        if (NullChecker.m82486a(commonDoubleTitleIconClick)) {
            bnl0.m105548c0(this.f26522a, qa00.f156330q);
            this.f26525d.setTextSize(15.0f);
            this.f26525d.setText(commonDoubleTitleIconClick.title);
            this.f26526e.setText(commonDoubleTitleIconClick.subtitle);
            MessageItemButton messageItemButton = commonDoubleTitleIconClick.button;
            if (messageItemButton != null) {
                this.f26527f.setText(messageItemButton.title);
            }
            this.f26527f.setIncludeFontPadding(true);
            VText vText = this.f26527f;
            int i = qa00.f156323j;
            vText.setPadding(i, qa00.m175859d(7.0f), i, qa00.m175859d(7.0f));
            bnl0.m105540X(this.f26526e, qa00.m175859d(7.0f));
            this.f26527f.setTypeface(null, 1);
            this.f26525d.setTypeface(null, 1);
            uqb0.f180374G.m127138Y0(this.f26524c, ibc0.f113959Z);
            if (!TextUtils.isEmpty(commonDoubleTitleIconClick.iconUrl)) {
                uqb0.f180374G.m127115L0(this.f26524c, commonDoubleTitleIconClick.iconUrl);
            }
            bnl0.m105509E0(this.f26527f, new ViewOnClickListenerC8329a(commonDoubleTitleIconClick, act));
            if (!NullChecker.m82486a(commonDoubleTitleIconClick.statistics) || TextUtils.isEmpty(commonDoubleTitleIconClick.statistics.f21187id)) {
                return;
            }
            MessageItemStatistics messageItemStatistics = commonDoubleTitleIconClick.statistics;
            MessageItemdata messageItemdata = messageItemStatistics.data;
            i4g0.m138492A(messageItemStatistics.f21187id, ((Act) getContext()).pageId(), jyb.m147494Y("tips_source", messageItemdata != null ? messageItemdata.tips_source : ""));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43382a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f26525d.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f26526e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f26527f.setBackgroundResource(ibc0.f114138t);
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
