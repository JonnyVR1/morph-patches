package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VEditText;
import p151v.VImage;
import p153l.bnl0;
import p153l.cmg;
import p153l.cn40;
import p153l.er60;
import p153l.jyb;
import p153l.ksg;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FeedAbstractInputMomentTextToJoinTopicView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f43897a;

    /* JADX INFO: renamed from: b */
    public TopicMoment f43898b;

    /* JADX INFO: renamed from: c */
    public x20 f43899c;

    /* JADX INFO: renamed from: d */
    public x20 f43900d;

    /* JADX INFO: renamed from: e */
    public String f43901e;

    public FeedAbstractInputMomentTextToJoinTopicView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m67101B(View view) {
        if (this.f43897a) {
            return;
        }
        StringBuilder sb = new StringBuilder(getEditText().getText().toString());
        if (cmg.m111224n0() && m67112p() && NullChecker.m82486a(getTopicSelectImg()) && bnl0.m105529O0(getTopicSelectImg()) && getTopicSelectImg().isSelected()) {
            sb.append(" 我投了“");
            sb.append(m67113q());
            sb.append("”，你也来表态吧～");
        }
        final String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        m67109m(string, new x20() { // from class: l.lmg
            @Override // p153l.x20
            public final void call() {
                this.f132688a.m67100A(string);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m67102C(Moment moment) {
        String strM151174K;
        if (TextUtils.isEmpty(this.f43901e) || !cmg.m111222m0()) {
            mo67103D(moment);
            return;
        }
        er60.f95451b = true;
        mo67103D(moment);
        if (TextUtils.isEmpty(this.f43901e)) {
            strM151174K = "p_user_moment_interactions_details_view";
        } else {
            String str = this.f43901e;
            strM151174K = ksg.m151174K(str, TextUtils.equals(str, "from_album"));
        }
        er60.m122104w().m122127p(moment, strM151174K, 201, false, new pf60<>("posted_source", TextUtils.isEmpty(this.f43901e) ? "p_user_moment_interactions_details_view" : this.f43901e));
    }

    /* JADX INFO: renamed from: D */
    public void mo67103D(Moment moment) {
        cn40.m111372X(moment);
    }

    /* JADX INFO: renamed from: E */
    public void mo67104E() {
        m67115s();
        bnl0.m105509E0(getSendButton(), new View.OnClickListener() { // from class: l.jmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121669a.m67101B(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m67105F() {
        getRoot().setVisibility(0);
        getBackCover().setVisibility(0);
        getContainer().setVisibility(0);
    }

    public abstract View getBackCover();

    public abstract View getCloseView();

    public abstract View getContainer();

    public abstract VEditText getEditText();

    public abstract View getRoot();

    public abstract TextView getSendButton();

    public abstract VImage getTopicSelectImg();

    /* JADX INFO: renamed from: j */
    public Act m67106j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m67107k(View view) {
        addView(view);
        m67108l();
    }

    /* JADX INFO: renamed from: l */
    public void m67108l() {
        getContainer().setOnClickListener(null);
        m67111o();
        getEditText().mo29617i(true).subscribe(psd0.m173596G(new y20() { // from class: l.fmg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99777a.m67116t((CharSequence) obj);
            }
        }));
        bnl0.m105509E0(getCloseView(), new View.OnClickListener() { // from class: l.gmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104975a.m67118v(view);
            }
        });
        bnl0.m105509E0(getBackCover(), new View.OnClickListener() { // from class: l.hmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110624a.m67119w(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m67109m(String str, final x20 x20Var) {
        final String strM151174K;
        this.f43897a = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "moment";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        if (TextUtils.isEmpty(this.f43901e)) {
            strM151174K = "p_user_moment_interactions_details_view";
        } else {
            String str2 = this.f43901e;
            strM151174K = ksg.m151174K(str2, TextUtils.equals(str2, "from_album"));
        }
        m67106j().duringCreated(FeedModule.f39703d.m145582P6(detectRequest)).subscribe(psd0.m173597H(new y20() { // from class: l.mmg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137565a.m67120x(x20Var, strM151174K, (Envelope) obj);
            }
        }, new y20() { // from class: l.nmg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142702a.m67121y(x20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m67100A(String str) {
        Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.media = new ArrayList();
        ArrayList arrayList = new ArrayList();
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        TopicMoment topicMoment = this.f43898b;
        topicMomentIdBox.f39672id = topicMoment.f40095id;
        topicMomentIdBox.name = topicMoment.name;
        arrayList.add(topicMomentIdBox);
        momentNew_.topics = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f43898b);
        momentNew_.mTopicList = arrayList2;
        if (cmg.m111224n0()) {
            VImage topicSelectImg = getTopicSelectImg();
            momentNew_.shareMyVote = NullChecker.m82486a(topicSelectImg) && bnl0.m105529O0(topicSelectImg) && topicSelectImg.isSelected();
        }
        m67102C(momentNew_);
        getEditText().setText("");
        m67114r();
        x20 x20Var = this.f43899c;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m67111o() {
        bnl0.m105524M(getContainer(), false);
        bnl0.m105524M(getBackCover(), false);
        bnl0.m105524M(getRoot(), false);
    }

    /* JADX INFO: renamed from: p */
    public boolean m67112p() {
        if (NullChecker.m82486a(this.f43898b) && NullChecker.m82486a(this.f43898b.options)) {
            for (int i = 0; i < this.f43898b.options.size(); i++) {
                if (this.f43898b.options.get(i).haveliked) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public String m67113q() {
        if (!NullChecker.m82486a(this.f43898b) || !NullChecker.m82486a(this.f43898b.options)) {
            return "";
        }
        for (int i = 0; i < this.f43898b.options.size(); i++) {
            if (this.f43898b.options.get(i).haveliked) {
                return this.f43898b.options.get(i).values;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: r */
    public final void m67114r() {
        m67106j().hideInput(getEditText());
        m67111o();
        m67106j().postDelayed(new Runnable() { // from class: l.kmg
            @Override // java.lang.Runnable
            public final void run() {
                this.f127477a.m67122z();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: s */
    public final void m67115s() {
        if (m67106j().hasWindowFocus()) {
            bnl0.m105500A(getEditText());
            m67105F();
            m67106j().showInput(getEditText(), 0);
        }
    }

    public void setCloseAction(x20 x20Var) {
        this.f43900d = x20Var;
    }

    public void setFrom(String str) {
        this.f43901e = str;
    }

    public void setSendSuccess(x20 x20Var) {
        this.f43899c = x20Var;
    }

    public void setTopicMoment(TopicMoment topicMoment) {
        this.f43898b = topicMoment;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m67116t(CharSequence charSequence) {
        Editable text = getEditText().getText();
        if ((!cmg.m111224n0() || getTopicSelectImg() == null || (bnl0.m105529O0(getTopicSelectImg()) && getTopicSelectImg().isSelected())) && cmg.m111224n0()) {
            return;
        }
        getSendButton().setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m67117u() {
        x20 x20Var = this.f43900d;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m67118v(View view) {
        m67114r();
        m67106j().postDelayed(new Runnable() { // from class: l.img
            @Override // java.lang.Runnable
            public final void run() {
                this.f115773a.m67117u();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m67119w(View view) {
        m67106j().hideInput(getEditText());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m67120x(x20 x20Var, String str, Envelope envelope) {
        this.f43897a = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (jyb.m147479J(detect.text) && jyb.m147479J(detect.media)) {
            x20Var.call();
        } else if (ksg.m151214l(detect, str)) {
            o1j0.m165649w(R$string.f39989s);
        } else {
            o1j0.m165649w(R$string.f39844W2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m67121y(x20 x20Var, Throwable th) {
        this.f43897a = false;
        x20Var.call();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m67122z() {
        if (getContainer().getVisibility() == 8) {
            getEditText().setText("");
        }
    }

    public FeedAbstractInputMomentTextToJoinTopicView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedAbstractInputMomentTextToJoinTopicView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedAbstractInputMomentTextToJoinTopicView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
