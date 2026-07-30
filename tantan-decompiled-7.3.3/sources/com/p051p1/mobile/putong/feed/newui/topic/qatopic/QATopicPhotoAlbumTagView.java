package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VDraweeView;
import p153l.o1j0;
import p153l.pf60;
import p153l.ptb0;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicPhotoAlbumTagView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f43952a;

    /* JADX INFO: renamed from: b */
    public TextView f43953b;

    /* JADX INFO: renamed from: c */
    public TextView f43954c;

    /* JADX INFO: renamed from: d */
    public TopicMoment f43955d;

    /* JADX INFO: renamed from: e */
    public String f43956e;

    /* JADX INFO: renamed from: f */
    public boolean f43957f;

    public QATopicPhotoAlbumTagView(Context context) {
        super(context);
    }

    private String getPageId() {
        if (this.f43957f) {
            return "p_album";
        }
        if ("from_nearby_focus".equals(this.f43956e)) {
            return "p_follow";
        }
        if ("from_nearby_falls_feed".equals(this.f43956e)) {
            return OMSDialogPositon.p_nearby;
        }
        return "momentDetail".equals(this.f43956e) ? "p_user_moment_interactions_details_view" : "";
    }

    /* JADX INFO: renamed from: b */
    public final void m67183b(View view) {
        ptb0.m173765a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m67184c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public boolean m67185d() {
        TopicMoment topicMoment = this.f43955d;
        return topicMoment != null && "deleted".equals(topicMoment.status);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m67186e(View view) {
        m67187f(false);
        if (m67185d()) {
            o1j0.m165651y(m67184c().getString(R$string.f39931j2));
        } else {
            m67184c().startActivity(QATopicAggregationActivity.m67158X1(m67184c(), this.f43955d.f40095id, this.f43956e));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m67187f(boolean z) {
        if (TextUtils.isEmpty(getPageId())) {
            return;
        }
        if (z) {
            tfj0.m190942e("e_topic_qa_tag", getPageId(), pf60.m172085a("topic_id", this.f43955d.f40095id));
        } else {
            tfj0.m190940c("e_topic_qa_tag", getPageId(), pf60.m172085a("topic_id", this.f43955d.f40095id));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67183b(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.otb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148944a.m67186e(view);
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
