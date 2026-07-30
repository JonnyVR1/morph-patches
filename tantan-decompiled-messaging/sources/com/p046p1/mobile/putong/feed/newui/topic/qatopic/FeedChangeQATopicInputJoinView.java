package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

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
import com.p046p1.mobile.putong.feed.data.Moment;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.nkg;
import p149l.oe40;
import p149l.utg;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedChangeQATopicInputJoinView extends FeedAbstractInputMomentTextToJoinTopicView {

    /* JADX INFO: renamed from: f */
    public View f43054f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f43055g;

    /* JADX INFO: renamed from: h */
    public VImage f43056h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f43057i;

    /* JADX INFO: renamed from: j */
    public VEditText f43058j;

    /* JADX INFO: renamed from: k */
    public VText f43059k;

    /* JADX INFO: renamed from: l */
    public VImage f43060l;

    /* JADX INFO: renamed from: m */
    public VText f43061m;

    public FeedChangeQATopicInputJoinView(@NonNull Context context) {
        super(context);
        m65943J(context);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    /* JADX INFO: renamed from: D */
    public void mo65920D(Moment moment) {
        if (m65923j() instanceof FeedQaInputAct) {
            oe40.m163821W(moment, true, false, false, true, null);
        } else {
            super.mo65920D(moment);
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    /* JADX INFO: renamed from: E */
    public void mo65921E() {
        if (nkg.m159895n0()) {
            xdl0.m208344M(this.f43060l, m65929p());
            xdl0.m208344M(this.f43061m, m65929p());
            this.f43060l.setSelected(true);
            getSendButton().setEnabled(xdl0.m208349O0(this.f43060l));
            vwb.m200354z(vwb.m200324f0(this.f43060l, this.f43061m), new e30() { // from class: l.stg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166348a.m65945L((View) obj);
                }
            });
        }
        super.mo65921E();
    }

    /* JADX INFO: renamed from: I */
    public View m65942I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return utg.m195305b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final void m65943J(Context context) {
        m65924k(m65942I(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m65944K(View view) {
        boolean zIsSelected = this.f43060l.isSelected();
        VText vText = this.f43059k;
        if (zIsSelected) {
            vText.setEnabled(!TextUtils.isEmpty(this.f43058j.getText().toString()));
        } else {
            vText.setEnabled(true);
        }
        VImage vImage = this.f43060l;
        vImage.setSelected(!vImage.isSelected());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m65945L(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ttg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f172026a.m65944K(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getBackCover() {
        return this.f43054f;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getCloseView() {
        return this.f43056h;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getContainer() {
        return this.f43057i;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VEditText getEditText() {
        return this.f43058j;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getRoot() {
        return this.f43055g;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public TextView getSendButton() {
        return this.f43059k;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VImage getTopicSelectImg() {
        return this.f43060l;
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65943J(context);
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65943J(context);
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m65943J(context);
    }
}
