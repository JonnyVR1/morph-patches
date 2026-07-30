package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VDraweeView;
import p149l.j760;
import p149l.llb0;
import p149l.lsi0;
import p149l.p6j0;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicPhotoAlbumTagView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f43104a;

    /* JADX INFO: renamed from: b */
    public TextView f43105b;

    /* JADX INFO: renamed from: c */
    public TextView f43106c;

    /* JADX INFO: renamed from: d */
    public TopicMoment f43107d;

    /* JADX INFO: renamed from: e */
    public String f43108e;

    /* JADX INFO: renamed from: f */
    public boolean f43109f;

    public QATopicPhotoAlbumTagView(Context context) {
        super(context);
    }

    private String getPageId() {
        if (this.f43109f) {
            return "p_album";
        }
        if ("from_nearby_focus".equals(this.f43108e)) {
            return "p_follow";
        }
        if ("from_nearby_falls_feed".equals(this.f43108e)) {
            return OMSDialogPositon.p_nearby;
        }
        return "momentDetail".equals(this.f43108e) ? "p_user_moment_interactions_details_view" : "";
    }

    /* JADX INFO: renamed from: b */
    public final void m66000b(View view) {
        llb0.m150466a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m66001c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public boolean m66002d() {
        TopicMoment topicMoment = this.f43107d;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m66003e(View view) {
        m66004f(false);
        if (m66002d()) {
            lsi0.m151595y(m66001c().getString(R$string.f39083j2));
        } else {
            m66001c().startActivity(QATopicAggregationActivity.m65975V1(m66001c(), this.f43107d.f39247id, this.f43108e));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m66004f(boolean z) {
        if (TextUtils.isEmpty(getPageId())) {
            return;
        }
        if (z) {
            p6j0.m167671e("e_topic_qa_tag", getPageId(), j760.m140076a("topic_id", this.f43107d.f39247id));
        } else {
            p6j0.m167669c("e_topic_qa_tag", getPageId(), j760.m140076a("topic_id", this.f43107d.f39247id));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66000b(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.klb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123647a.m66003e(view);
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
