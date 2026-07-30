package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import l.j760;
import l.lsi0;
import p007l.llb0;
import p007l.p6j0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QATopicPhotoAlbumTagView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4565a;

    /* JADX INFO: renamed from: b */
    public TextView f4566b;

    /* JADX INFO: renamed from: c */
    public TextView f4567c;

    /* JADX INFO: renamed from: d */
    public TopicMoment f4568d;

    /* JADX INFO: renamed from: e */
    public String f4569e;

    /* JADX INFO: renamed from: f */
    public boolean f4570f;

    public QATopicPhotoAlbumTagView(Context context) {
        super(context);
    }

    private String getPageId() {
        if (this.f4570f) {
            return "p_album";
        }
        if ("from_nearby_focus".equals(this.f4569e)) {
            return "p_follow";
        }
        if ("from_nearby_falls_feed".equals(this.f4569e)) {
            return OMSDialogPositon.p_nearby;
        }
        return "momentDetail".equals(this.f4569e) ? "p_user_moment_interactions_details_view" : "";
    }

    /* JADX INFO: renamed from: b */
    public final void m7152b(View view) {
        llb0.m11641a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m7153c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public boolean m7154d() {
        TopicMoment topicMoment = this.f4568d;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7155e(View view) {
        m7156f(false);
        if (m7154d()) {
            lsi0.y(m7153c().getString(R$string.f544j2));
        } else {
            m7153c().startActivity(QATopicAggregationActivity.m7127V1(m7153c(), this.f4568d.f708id, this.f4569e));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7156f(boolean z) {
        if (TextUtils.isEmpty(getPageId())) {
            return;
        }
        if (z) {
            p6j0.m12915e("e_topic_qa_tag", getPageId(), j760.a("topic_id", this.f4568d.f708id));
        } else {
            p6j0.m12913c("e_topic_qa_tag", getPageId(), j760.a("topic_id", this.f4568d.f708id));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7152b(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.klb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9743a.m7155e(view);
            }
        });
    }

    public QATopicPhotoAlbumTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QATopicPhotoAlbumTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
