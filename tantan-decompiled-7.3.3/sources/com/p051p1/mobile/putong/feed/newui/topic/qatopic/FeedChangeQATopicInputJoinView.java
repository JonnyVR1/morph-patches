package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

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
import com.p051p1.mobile.putong.feed.data.Moment;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cmg;
import p153l.cn40;
import p153l.jvg;
import p153l.jyb;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedChangeQATopicInputJoinView extends FeedAbstractInputMomentTextToJoinTopicView {

    /* JADX INFO: renamed from: f */
    public View f43902f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f43903g;

    /* JADX INFO: renamed from: h */
    public VImage f43904h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f43905i;

    /* JADX INFO: renamed from: j */
    public VEditText f43906j;

    /* JADX INFO: renamed from: k */
    public VText f43907k;

    /* JADX INFO: renamed from: l */
    public VImage f43908l;

    /* JADX INFO: renamed from: m */
    public VText f43909m;

    public FeedChangeQATopicInputJoinView(@NonNull Context context) {
        super(context);
        m67126J(context);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    /* JADX INFO: renamed from: D */
    public void mo67103D(Moment moment) {
        if (m67106j() instanceof FeedQaInputAct) {
            cn40.m111371W(moment, true, false, false, true, null);
        } else {
            super.mo67103D(moment);
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    /* JADX INFO: renamed from: E */
    public void mo67104E() {
        if (cmg.m111224n0()) {
            bnl0.m105524M(this.f43908l, m67112p());
            bnl0.m105524M(this.f43909m, m67112p());
            this.f43908l.setSelected(true);
            getSendButton().setEnabled(bnl0.m105529O0(this.f43908l));
            jyb.m147537z(jyb.m147507f0(this.f43908l, this.f43909m), new y20() { // from class: l.hvg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111758a.m67128L((View) obj);
                }
            });
        }
        super.mo67104E();
    }

    /* JADX INFO: renamed from: I */
    public View m67125I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jvg.m147037b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public final void m67126J(Context context) {
        m67107k(m67125I(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m67127K(View view) {
        boolean zIsSelected = this.f43908l.isSelected();
        VText vText = this.f43907k;
        if (zIsSelected) {
            vText.setEnabled(!TextUtils.isEmpty(this.f43906j.getText().toString()));
        } else {
            vText.setEnabled(true);
        }
        VImage vImage = this.f43908l;
        vImage.setSelected(!vImage.isSelected());
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m67128L(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ivg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f117067a.m67127K(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getBackCover() {
        return this.f43902f;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getCloseView() {
        return this.f43904h;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getContainer() {
        return this.f43905i;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VEditText getEditText() {
        return this.f43906j;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public View getRoot() {
        return this.f43903g;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public TextView getSendButton() {
        return this.f43907k;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedAbstractInputMomentTextToJoinTopicView
    public VImage getTopicSelectImg() {
        return this.f43908l;
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67126J(context);
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67126J(context);
    }

    public FeedChangeQATopicInputJoinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m67126J(context);
    }
}
