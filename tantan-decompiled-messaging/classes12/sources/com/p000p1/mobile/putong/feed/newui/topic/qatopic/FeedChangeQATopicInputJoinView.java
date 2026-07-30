package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.Moment;
import l.e30;
import l.vwb;
import l.xdl0;
import p007l.nkg;
import p007l.oe40;
import p007l.utg;
import v.VEditText;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedChangeQATopicInputJoinView extends FeedAbstractInputMomentTextToJoinTopicView {

    /* JADX INFO: renamed from: f */
    public View f4515f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f4516g;

    /* JADX INFO: renamed from: h */
    public VImage f4517h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f4518i;

    /* JADX INFO: renamed from: j */
    public VEditText f4519j;

    /* JADX INFO: renamed from: k */
    public VText f4520k;

    /* JADX INFO: renamed from: l */
    public VImage f4521l;

    /* JADX INFO: renamed from: m */
    public VText f4522m;

    public FeedChangeQATopicInputJoinView(@NonNull Context context) {
        super(context);
        m7095J(context);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    /* JADX INFO: renamed from: D */
    public void mo7072D(Moment moment) {
        if (m7075j() instanceof FeedQaInputAct) {
            oe40.m12558W(moment, true, false, false, true, null);
        } else {
            super.mo7072D(moment);
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    /* JADX INFO: renamed from: E */
    public void mo7073E() {
        if (nkg.m12254n0()) {
            xdl0.M(this.f4521l, m7081p());
            xdl0.M(this.f4522m, m7081p());
            this.f4521l.setSelected(true);
            getSendButton().setEnabled(xdl0.O0(this.f4521l));
            vwb.z(vwb.f0(new View[]{this.f4521l, this.f4522m}), new e30() { // from class: l.stg
                public final void call(Object obj) {
                    this.f13073a.m7097L((View) obj);
                }
            });
        }
        super.mo7073E();
    }

    /* JADX INFO: renamed from: I */
    public View m7094I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return utg.m15136b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final void m7095J(Context context) {
        m7076k(m7094I(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m7096K(View view) {
        boolean zIsSelected = this.f4521l.isSelected();
        VText vText = this.f4520k;
        if (zIsSelected) {
            vText.setEnabled(!TextUtils.isEmpty(this.f4519j.getText().toString()));
        } else {
            vText.setEnabled(true);
        }
        VImage vImage = this.f4521l;
        vImage.setSelected(!vImage.isSelected());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m7097L(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ttg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13416a.m7096K(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getBackCover() {
        return this.f4515f;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getCloseView() {
        return this.f4517h;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getContainer() {
        return this.f4518i;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VEditText getEditText() {
        return this.f4519j;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getRoot() {
        return this.f4516g;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public TextView getSendButton() {
        return this.f4520k;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VImage getTopicSelectImg() {
        return this.f4521l;
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7095J(context);
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7095J(context);
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m7095J(context);
    }
}
