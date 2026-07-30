package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VImage;
import p151v.VLinear;
import p153l.bd40;
import p153l.bnl0;
import p153l.cd40;
import p153l.h9i;
import p153l.j4h;

/* JADX INFO: loaded from: classes13.dex */
public class NewPostSelectedTopicItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f44049c;

    /* JADX INFO: renamed from: d */
    public TextView f44050d;

    /* JADX INFO: renamed from: e */
    public TextView f44051e;

    /* JADX INFO: renamed from: f */
    public VImage f44052f;

    /* JADX INFO: renamed from: g */
    public VLinear f44053g;

    /* JADX INFO: renamed from: h */
    public VImage f44054h;

    /* JADX INFO: renamed from: i */
    public TextView f44055i;

    /* JADX INFO: renamed from: j */
    public TextView f44056j;

    /* JADX INFO: renamed from: k */
    public VImage f44057k;

    public NewPostSelectedTopicItemView(@NonNull Context context) {
        super(context);
        m67277R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m67277R(Context context) {
        if (j4h.m143424h()) {
            addView(m67279Q(LayoutInflater.from(context), this));
        } else {
            addView(m67278P(LayoutInflater.from(context), this));
        }
    }

    /* JADX INFO: renamed from: P */
    public View m67278P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bd40.m103593b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public View m67279Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cd40.m109123b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m67280S(TopicMoment topicMoment) {
        if (!j4h.m143424h()) {
            bnl0.m105524M(this.f44056j, topicMoment.isTopicAnonymousType());
            this.f44055i.setText(h9i.m134070k(topicMoment.name, 14));
            return;
        }
        bnl0.m105524M(this.f44051e, topicMoment.isTopicAnonymousType());
        this.f44050d.setText(h9i.m134070k("#" + topicMoment.name, 15));
    }

    public NewPostSelectedTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67277R(context);
    }

    public NewPostSelectedTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67277R(context);
    }
}
