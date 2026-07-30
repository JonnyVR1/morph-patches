package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

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
import com.p000p1.mobile.putong.feed.data.TopicActivityDetail;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.putong.ui.webview.mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.q440;
import p007l.s7i;
import p007l.u2h;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewPostTopicItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f4671a;

    /* JADX INFO: renamed from: b */
    public TextView f4672b;

    /* JADX INFO: renamed from: c */
    public VText f4673c;

    /* JADX INFO: renamed from: d */
    public TextView f4674d;

    /* JADX INFO: renamed from: e */
    public View f4675e;

    /* JADX INFO: renamed from: f */
    public ImageView f4676f;

    /* JADX INFO: renamed from: g */
    public TopicMoment f4677g;

    public NewPostTopicItemView(@NonNull Context context) {
        super(context);
        m7254e(context);
    }

    /* JADX INFO: renamed from: b */
    public View m7251b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q440.m13384b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final Activity m7252c() {
        Context context = getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String m7253d(TopicMoment topicMoment) {
        TopicActivityDetail topicActivityDetail;
        if (topicMoment == null || (topicActivityDetail = topicMoment.details) == null || TextUtils.isEmpty(topicActivityDetail.url)) {
            return "";
        }
        boolean zContains = topicMoment.details.url.contains("?");
        TopicActivityDetail topicActivityDetail2 = topicMoment.details;
        if (zContains) {
            return topicActivityDetail2.url + "&topicId=" + topicMoment.f708id;
        }
        return topicActivityDetail2.url + "?topicId=" + topicMoment.f708id;
    }

    /* JADX INFO: renamed from: e */
    public final void m7254e(Context context) {
        addView(m7251b(LayoutInflater.from(context), this));
        this.f4673c.setTypeface(eqh0.c(3), 0);
        if (u2h.m14723h()) {
            this.f4673c.setTextColor(getResources().getColorStateList(e1c0.f7115N));
            this.f4671a.setBackground(getResources().getDrawable(f3c0.f7607F3));
            this.f4672b.setBackground(getResources().getDrawable(f3c0.f7583C3));
            this.f4674d.setBackground(getResources().getDrawable(f3c0.f7599E3));
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7255f(TopicMoment topicMoment) {
        return NullChecker.a(topicMoment) && topicMoment.isActivityTopic();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m7256g(TopicMoment topicMoment, View view) {
        m7257h(m7252c(), m7253d(topicMoment));
        zvf0.u("e_active_info", "p_moment_post", new j760[]{vwb.Y("topic_id", topicMoment.f708id)});
    }

    /* JADX INFO: renamed from: h */
    public final void m7257h(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentX1 = MkDlgWebViewAct.X1(activity, "", str);
        intentX1.putExtra("hideNavigationBar", true);
        intentX1.putExtra("skipLoading", true);
        intentX1.putExtra("transparent_status_bar", true);
        intentX1.putExtra("webviewColor", "transparent");
        intentX1.putExtra("hideNotch", true);
        activity.startActivity(intentX1);
    }

    /* JADX INFO: renamed from: i */
    public void m7258i(TopicMoment topicMoment) {
        this.f4677g = topicMoment;
        xdl0.M(this.f4674d, topicMoment.isTopicAnonymousType());
        this.f4673c.setText(s7i.m14045k(topicMoment.getTopicNameWithPrefix(), 15));
        m7259j(topicMoment);
    }

    /* JADX INFO: renamed from: j */
    public final void m7259j(final TopicMoment topicMoment) {
        boolean zM7255f = m7255f(topicMoment);
        xdl0.M(this.f4672b, zM7255f);
        xdl0.M(this.f4675e, zM7255f);
        xdl0.M(this.f4676f, zM7255f);
        if (!zM7255f) {
            this.f4671a.setPadding(0, 0, t100.k, 0);
            this.f4676f.setOnClickListener(null);
        } else {
            this.f4673c.setText(s7i.m14045k(topicMoment.name, 15));
            this.f4671a.setPadding(0, 0, t100.i, 0);
            xdl0.E0(this.f4676f, new View.OnClickListener() { // from class: l.p440
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11688a.m7256g(topicMoment, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7260k(String str) {
        this.f4673c.setTypeface(eqh0.c(2), 1);
        this.f4673c.setText(str);
        this.f4673c.setTextColor(getResources().getColor(u2h.m14723h() ? e1c0.f7140g : e1c0.f7136e));
        this.f4673c.setPadding(t100.j, 0, 0, 0);
        this.f4673c.setCompoundDrawablePadding(t100.d(4.0f));
        this.f4673c.setCompoundDrawablesRelativeWithIntrinsicBounds(u2h.m14723h() ? f3c0.f7654L3 : f3c0.f7647K3, 0, 0, 0);
    }

    /* JADX INFO: renamed from: l */
    public void m7261l() {
        this.f4673c.setTypeface(eqh0.c(3), 0);
        this.f4673c.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        this.f4673c.setTextColor(getResources().getColorStateList(u2h.m14723h() ? e1c0.f7115N : e1c0.f7114M));
        this.f4673c.setPadding(m7255f(this.f4677g) ? t100.e : t100.k, 0, 0, 0);
    }

    public void setViewSelected(boolean z) {
        setSelected(z);
    }

    public NewPostTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7254e(context);
    }

    public NewPostTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7254e(context);
    }
}
