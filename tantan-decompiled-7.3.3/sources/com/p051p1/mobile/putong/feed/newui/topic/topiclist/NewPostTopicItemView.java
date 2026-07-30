package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.data.TopicActivityDetail;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.ed40;
import p153l.h9i;
import p153l.i4g0;
import p153l.j4h;
import p153l.jyb;
import p153l.k9c0;
import p153l.lbc0;
import p153l.lyh0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class NewPostTopicItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f44058a;

    /* JADX INFO: renamed from: b */
    public TextView f44059b;

    /* JADX INFO: renamed from: c */
    public VText f44060c;

    /* JADX INFO: renamed from: d */
    public TextView f44061d;

    /* JADX INFO: renamed from: e */
    public View f44062e;

    /* JADX INFO: renamed from: f */
    public ImageView f44063f;

    /* JADX INFO: renamed from: g */
    public TopicMoment f44064g;

    public NewPostTopicItemView(@NonNull Context context) {
        super(context);
        m67285e(context);
    }

    /* JADX INFO: renamed from: b */
    public View m67282b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ed40.m120422b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final Activity m67283c() {
        Context context = getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String m67284d(TopicMoment topicMoment) {
        TopicActivityDetail topicActivityDetail;
        if (topicMoment == null || (topicActivityDetail = topicMoment.details) == null || TextUtils.isEmpty(topicActivityDetail.url)) {
            return "";
        }
        boolean zContains = topicMoment.details.url.contains("?");
        TopicActivityDetail topicActivityDetail2 = topicMoment.details;
        if (zContains) {
            return topicActivityDetail2.url + "&topicId=" + topicMoment.f40095id;
        }
        return topicActivityDetail2.url + "?topicId=" + topicMoment.f40095id;
    }

    /* JADX INFO: renamed from: e */
    public final void m67285e(Context context) {
        addView(m67282b(LayoutInflater.from(context), this));
        this.f44060c.setTypeface(lyh0.m156283c(3), 0);
        if (j4h.m143424h()) {
            this.f44060c.setTextColor(getResources().getColorStateList(k9c0.f124482N));
            this.f44058a.setBackground(getResources().getDrawable(lbc0.f130842F3));
            this.f44059b.setBackground(getResources().getDrawable(lbc0.f130818C3));
            this.f44061d.setBackground(getResources().getDrawable(lbc0.f130834E3));
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m67286f(TopicMoment topicMoment) {
        return NullChecker.m82486a(topicMoment) && topicMoment.isActivityTopic();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m67287g(TopicMoment topicMoment, View view) {
        m67288h(m67283c(), m67284d(topicMoment));
        i4g0.m138523u("e_active_info", "p_moment_post", jyb.m147494Y("topic_id", topicMoment.f40095id));
    }

    /* JADX INFO: renamed from: h */
    public final void m67288h(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM81411Y1 = MkDlgWebViewAct.m81411Y1(activity, "", str);
        intentM81411Y1.putExtra("hideNavigationBar", true);
        intentM81411Y1.putExtra("skipLoading", true);
        intentM81411Y1.putExtra("transparent_status_bar", true);
        intentM81411Y1.putExtra("webviewColor", "transparent");
        intentM81411Y1.putExtra("hideNotch", true);
        activity.startActivity(intentM81411Y1);
    }

    /* JADX INFO: renamed from: i */
    public void m67289i(TopicMoment topicMoment) {
        this.f44064g = topicMoment;
        bnl0.m105524M(this.f44061d, topicMoment.isTopicAnonymousType());
        this.f44060c.setText(h9i.m134070k(topicMoment.getTopicNameWithPrefix(), 15));
        m67290j(topicMoment);
    }

    /* JADX INFO: renamed from: j */
    public final void m67290j(final TopicMoment topicMoment) {
        boolean zM67286f = m67286f(topicMoment);
        bnl0.m105524M(this.f44059b, zM67286f);
        bnl0.m105524M(this.f44062e, zM67286f);
        bnl0.m105524M(this.f44063f, zM67286f);
        if (!zM67286f) {
            this.f44058a.setPadding(0, 0, qa00.f156324k, 0);
            this.f44063f.setOnClickListener(null);
        } else {
            this.f44060c.setText(h9i.m134070k(topicMoment.name, 15));
            this.f44058a.setPadding(0, 0, qa00.f156322i, 0);
            bnl0.m105509E0(this.f44063f, new View.OnClickListener() { // from class: l.dd40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f87855a.m67287g(topicMoment, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public void m67291k(String str) {
        this.f44060c.setTypeface(lyh0.m156283c(2), 1);
        this.f44060c.setText(str);
        this.f44060c.setTextColor(getResources().getColor(j4h.m143424h() ? k9c0.f124507g : k9c0.f124503e));
        this.f44060c.setPadding(qa00.f156323j, 0, 0, 0);
        this.f44060c.setCompoundDrawablePadding(qa00.m175859d(4.0f));
        this.f44060c.setCompoundDrawablesRelativeWithIntrinsicBounds(j4h.m143424h() ? lbc0.f130889L3 : lbc0.f130882K3, 0, 0, 0);
    }

    /* JADX INFO: renamed from: l */
    public void m67292l() {
        this.f44060c.setTypeface(lyh0.m156283c(3), 0);
        this.f44060c.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        this.f44060c.setTextColor(getResources().getColorStateList(j4h.m143424h() ? k9c0.f124482N : k9c0.f124481M));
        this.f44060c.setPadding(m67286f(this.f44064g) ? qa00.f156318e : qa00.f156324k, 0, 0, 0);
    }

    public void setViewSelected(boolean z) {
        setSelected(z);
    }

    public NewPostTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67285e(context);
    }

    public NewPostTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67285e(context);
    }
}
