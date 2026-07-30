package com.p046p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CommonDoubleTitleIconClick;
import com.p046p1.mobile.putong.core.data.CommonDoubleTitleIconClickList;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageItemButton;
import com.p046p1.mobile.putong.core.data.MessageItemStatistics;
import com.p046p1.mobile.putong.core.data.MessageItemdata;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.h2q;
import p149l.qib0;
import p149l.qsz;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemCommonIconTitleDesClikeView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ItemCommonIconTitleDesClikeView f25780a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f25781b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f25782c;

    /* JADX INFO: renamed from: d */
    public VText f25783d;

    /* JADX INFO: renamed from: e */
    public VText f25784e;

    /* JADX INFO: renamed from: f */
    public VText f25785f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView$a */
    public class ViewOnClickListenerC8178a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CommonDoubleTitleIconClick f25786a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f25787b;

        public ViewOnClickListenerC8178a(CommonDoubleTitleIconClick commonDoubleTitleIconClick, Act act) {
            this.f25786a = commonDoubleTitleIconClick;
            this.f25787b = act;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(this.f25786a) && NullChecker.m81303a(this.f25786a.target) && !TextUtils.isEmpty(this.f25786a.target.deeplink)) {
                CoreModule.m29935P().m94651a().mo158334Y(this.f25787b, Uri.parse(this.f25786a.target.deeplink));
                if (!NullChecker.m81303a(this.f25786a.statistics) || TextUtils.isEmpty(this.f25786a.statistics.f20445id)) {
                    return;
                }
                MessageItemStatistics messageItemStatistics = this.f25786a.statistics;
                MessageItemdata messageItemdata = messageItemStatistics.data;
                zvf0.m220399u(messageItemStatistics.f20445id, ((Act) ItemCommonIconTitleDesClikeView.this.getContext()).pageId(), vwb.m200311Y("tips_source", messageItemdata != null ? messageItemdata.tips_source : ""));
            }
        }
    }

    public ItemCommonIconTitleDesClikeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m42371a(View view) {
        h2q.m129125a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m42372b(Act act, Message message, User user, qsz qszVar) {
        CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = CommonDoubleTitleIconClickList.parse(message.msgData);
        if (commonDoubleTitleIconClickList == null || vwb.m200296J(commonDoubleTitleIconClickList.msgData)) {
            return;
        }
        CommonDoubleTitleIconClick commonDoubleTitleIconClick = commonDoubleTitleIconClickList.msgData.get(0);
        if (NullChecker.m81303a(commonDoubleTitleIconClick)) {
            xdl0.m208368c0(this.f25780a, t100.f167268q);
            this.f25783d.setTextSize(15.0f);
            this.f25783d.setText(commonDoubleTitleIconClick.title);
            this.f25784e.setText(commonDoubleTitleIconClick.subtitle);
            MessageItemButton messageItemButton = commonDoubleTitleIconClick.button;
            if (messageItemButton != null) {
                this.f25785f.setText(messageItemButton.title);
            }
            this.f25785f.setIncludeFontPadding(true);
            VText vText = this.f25785f;
            int i = t100.f167261j;
            vText.setPadding(i, t100.m186890d(7.0f), i, t100.m186890d(7.0f));
            xdl0.m208360X(this.f25784e, t100.m186890d(7.0f));
            this.f25785f.setTypeface(null, 1);
            this.f25783d.setTypeface(null, 1);
            qib0.f154691G.m102354Y0(this.f25782c, c3c0.f78684Z);
            if (!TextUtils.isEmpty(commonDoubleTitleIconClick.iconUrl)) {
                qib0.f154691G.m102331L0(this.f25782c, commonDoubleTitleIconClick.iconUrl);
            }
            xdl0.m208329E0(this.f25785f, new ViewOnClickListenerC8178a(commonDoubleTitleIconClick, act));
            if (!NullChecker.m81303a(commonDoubleTitleIconClick.statistics) || TextUtils.isEmpty(commonDoubleTitleIconClick.statistics.f20445id)) {
                return;
            }
            MessageItemStatistics messageItemStatistics = commonDoubleTitleIconClick.statistics;
            MessageItemdata messageItemdata = messageItemStatistics.data;
            zvf0.m220368A(messageItemStatistics.f20445id, ((Act) getContext()).pageId(), vwb.m200311Y("tips_source", messageItemdata != null ? messageItemdata.tips_source : ""));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42371a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f25783d.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f25784e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f25785f.setBackgroundResource(c3c0.f78863t);
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
