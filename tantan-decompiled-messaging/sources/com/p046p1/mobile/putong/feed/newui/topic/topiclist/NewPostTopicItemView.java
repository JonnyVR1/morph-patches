package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

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
import com.p046p1.mobile.putong.feed.data.TopicActivityDetail;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VText;
import p149l.e1c0;
import p149l.eqh0;
import p149l.f3c0;
import p149l.q440;
import p149l.s7i;
import p149l.t100;
import p149l.u2h;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class NewPostTopicItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f43210a;

    /* JADX INFO: renamed from: b */
    public TextView f43211b;

    /* JADX INFO: renamed from: c */
    public VText f43212c;

    /* JADX INFO: renamed from: d */
    public TextView f43213d;

    /* JADX INFO: renamed from: e */
    public View f43214e;

    /* JADX INFO: renamed from: f */
    public ImageView f43215f;

    /* JADX INFO: renamed from: g */
    public TopicMoment f43216g;

    public NewPostTopicItemView(@NonNull Context context) {
        super(context);
        m66102e(context);
    }

    /* JADX INFO: renamed from: b */
    public View m66099b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q440.m172924b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final Activity m66100c() {
        Context context = getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String m66101d(TopicMoment topicMoment) {
        TopicActivityDetail topicActivityDetail;
        if (topicMoment == null || (topicActivityDetail = topicMoment.details) == null || TextUtils.isEmpty(topicActivityDetail.url)) {
            return "";
        }
        boolean zContains = topicMoment.details.url.contains("?");
        TopicActivityDetail topicActivityDetail2 = topicMoment.details;
        if (zContains) {
            return topicActivityDetail2.url + "&topicId=" + topicMoment.f39247id;
        }
        return topicActivityDetail2.url + "?topicId=" + topicMoment.f39247id;
    }

    /* JADX INFO: renamed from: e */
    public final void m66102e(Context context) {
        addView(m66099b(LayoutInflater.from(context), this));
        this.f43212c.setTypeface(eqh0.m117752c(3), 0);
        if (u2h.m191499h()) {
            this.f43212c.setTextColor(getResources().getColorStateList(e1c0.f88759N));
            this.f43210a.setBackground(getResources().getDrawable(f3c0.f94324F3));
            this.f43211b.setBackground(getResources().getDrawable(f3c0.f94300C3));
            this.f43213d.setBackground(getResources().getDrawable(f3c0.f94316E3));
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m66103f(TopicMoment topicMoment) {
        return NullChecker.m81303a(topicMoment) && topicMoment.isActivityTopic();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m66104g(TopicMoment topicMoment, View view) {
        m66105h(m66100c(), m66101d(topicMoment));
        zvf0.m220399u("e_active_info", "p_moment_post", vwb.m200311Y("topic_id", topicMoment.f39247id));
    }

    /* JADX INFO: renamed from: h */
    public final void m66105h(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM80228X1 = MkDlgWebViewAct.m80228X1(activity, "", str);
        intentM80228X1.putExtra("hideNavigationBar", true);
        intentM80228X1.putExtra("skipLoading", true);
        intentM80228X1.putExtra("transparent_status_bar", true);
        intentM80228X1.putExtra("webviewColor", "transparent");
        intentM80228X1.putExtra("hideNotch", true);
        activity.startActivity(intentM80228X1);
    }

    /* JADX INFO: renamed from: i */
    public void m66106i(TopicMoment topicMoment) {
        this.f43216g = topicMoment;
        xdl0.m208344M(this.f43213d, topicMoment.isTopicAnonymousType());
        this.f43212c.setText(s7i.m182497k(topicMoment.getTopicNameWithPrefix(), 15));
        m66107j(topicMoment);
    }

    /* JADX INFO: renamed from: j */
    public final void m66107j(final TopicMoment topicMoment) {
        boolean zM66103f = m66103f(topicMoment);
        xdl0.m208344M(this.f43211b, zM66103f);
        xdl0.m208344M(this.f43214e, zM66103f);
        xdl0.m208344M(this.f43215f, zM66103f);
        if (!zM66103f) {
            this.f43210a.setPadding(0, 0, t100.f167262k, 0);
            this.f43215f.setOnClickListener(null);
        } else {
            this.f43212c.setText(s7i.m182497k(topicMoment.name, 15));
            this.f43210a.setPadding(0, 0, t100.f167260i, 0);
            xdl0.m208329E0(this.f43215f, new View.OnClickListener() { // from class: l.p440
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147033a.m66104g(topicMoment, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public void m66108k(String str) {
        this.f43212c.setTypeface(eqh0.m117752c(2), 1);
        this.f43212c.setText(str);
        this.f43212c.setTextColor(getResources().getColor(u2h.m191499h() ? e1c0.f88784g : e1c0.f88780e));
        this.f43212c.setPadding(t100.f167261j, 0, 0, 0);
        this.f43212c.setCompoundDrawablePadding(t100.m186890d(4.0f));
        this.f43212c.setCompoundDrawablesRelativeWithIntrinsicBounds(u2h.m191499h() ? f3c0.f94371L3 : f3c0.f94364K3, 0, 0, 0);
    }

    /* JADX INFO: renamed from: l */
    public void m66109l() {
        this.f43212c.setTypeface(eqh0.m117752c(3), 0);
        this.f43212c.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        this.f43212c.setTextColor(getResources().getColorStateList(u2h.m191499h() ? e1c0.f88759N : e1c0.f88758M));
        this.f43212c.setPadding(m66103f(this.f43216g) ? t100.f167256e : t100.f167262k, 0, 0, 0);
    }

    public void setViewSelected(boolean z) {
        setSelected(z);
    }

    public NewPostTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66102e(context);
    }

    public NewPostTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66102e(context);
    }
}
