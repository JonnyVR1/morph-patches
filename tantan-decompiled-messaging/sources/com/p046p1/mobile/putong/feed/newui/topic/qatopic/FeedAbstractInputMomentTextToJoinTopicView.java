package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VEditText;
import p147v.VImage;
import p149l.d30;
import p149l.e30;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.nkg;
import p149l.oe40;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedAbstractInputMomentTextToJoinTopicView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f43049a;

    /* JADX INFO: renamed from: b */
    public TopicMoment f43050b;

    /* JADX INFO: renamed from: c */
    public d30 f43051c;

    /* JADX INFO: renamed from: d */
    public d30 f43052d;

    /* JADX INFO: renamed from: e */
    public String f43053e;

    public FeedAbstractInputMomentTextToJoinTopicView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m65918B(View view) {
        if (this.f43049a) {
            return;
        }
        StringBuilder sb = new StringBuilder(getEditText().getText().toString());
        if (nkg.m159895n0() && m65929p() && NullChecker.m81303a(getTopicSelectImg()) && xdl0.m208349O0(getTopicSelectImg()) && getTopicSelectImg().isSelected()) {
            sb.append(" 我投了“");
            sb.append(m65930q());
            sb.append("”，你也来表态吧～");
        }
        final String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        m65926m(string, new d30() { // from class: l.wkg
            @Override // p149l.d30
            public final void call() {
                this.f186745a.m65917A(string);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m65919C(Moment moment) {
        String strM199515K;
        if (TextUtils.isEmpty(this.f43053e) || !nkg.m159893m0()) {
            mo65920D(moment);
            return;
        }
        zi60.f203297b = true;
        mo65920D(moment);
        if (TextUtils.isEmpty(this.f43053e)) {
            strM199515K = "p_user_moment_interactions_details_view";
        } else {
            String str = this.f43053e;
            strM199515K = vqg.m199515K(str, TextUtils.equals(str, "from_album"));
        }
        zi60.m218961w().m218984p(moment, strM199515K, 201, false, new j760<>("posted_source", TextUtils.isEmpty(this.f43053e) ? "p_user_moment_interactions_details_view" : this.f43053e));
    }

    /* JADX INFO: renamed from: D */
    public void mo65920D(Moment moment) {
        oe40.m163822X(moment);
    }

    /* JADX INFO: renamed from: E */
    public void mo65921E() {
        m65932s();
        xdl0.m208329E0(getSendButton(), new View.OnClickListener() { // from class: l.ukg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176922a.m65918B(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m65922F() {
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
    public Act m65923j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m65924k(View view) {
        addView(view);
        m65925l();
    }

    /* JADX INFO: renamed from: l */
    public void m65925l() {
        getContainer().setOnClickListener(null);
        m65928o();
        getEditText().mo28618i(true).subscribe(mkd0.m154955G(new e30() { // from class: l.qkg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155120a.m65933t((CharSequence) obj);
            }
        }));
        xdl0.m208329E0(getCloseView(), new View.OnClickListener() { // from class: l.rkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159838a.m65935v(view);
            }
        });
        xdl0.m208329E0(getBackCover(), new View.OnClickListener() { // from class: l.skg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164969a.m65936w(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m65926m(String str, final d30 d30Var) {
        final String strM199515K;
        this.f43049a = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "moment";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        if (TextUtils.isEmpty(this.f43053e)) {
            strM199515K = "p_user_moment_interactions_details_view";
        } else {
            String str2 = this.f43053e;
            strM199515K = vqg.m199515K(str2, TextUtils.equals(str2, "from_album"));
        }
        m65923j().duringCreated(FeedModule.f38855d.m209341P6(detectRequest)).subscribe(mkd0.m154956H(new e30() { // from class: l.xkg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193296a.m65937x(d30Var, strM199515K, (Envelope) obj);
            }
        }, new e30() { // from class: l.ykg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198748a.m65938y(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m65917A(String str) {
        Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.media = new ArrayList();
        ArrayList arrayList = new ArrayList();
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        TopicMoment topicMoment = this.f43050b;
        topicMomentIdBox.f38824id = topicMoment.f39247id;
        topicMomentIdBox.name = topicMoment.name;
        arrayList.add(topicMomentIdBox);
        momentNew_.topics = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f43050b);
        momentNew_.mTopicList = arrayList2;
        if (nkg.m159895n0()) {
            VImage topicSelectImg = getTopicSelectImg();
            momentNew_.shareMyVote = NullChecker.m81303a(topicSelectImg) && xdl0.m208349O0(topicSelectImg) && topicSelectImg.isSelected();
        }
        m65919C(momentNew_);
        getEditText().setText("");
        m65931r();
        d30 d30Var = this.f43051c;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m65928o() {
        xdl0.m208344M(getContainer(), false);
        xdl0.m208344M(getBackCover(), false);
        xdl0.m208344M(getRoot(), false);
    }

    /* JADX INFO: renamed from: p */
    public boolean m65929p() {
        if (NullChecker.m81303a(this.f43050b) && NullChecker.m81303a(this.f43050b.options)) {
            for (int i = 0; i < this.f43050b.options.size(); i++) {
                if (this.f43050b.options.get(i).haveliked) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public String m65930q() {
        if (!NullChecker.m81303a(this.f43050b) || !NullChecker.m81303a(this.f43050b.options)) {
            return "";
        }
        for (int i = 0; i < this.f43050b.options.size(); i++) {
            if (this.f43050b.options.get(i).haveliked) {
                return this.f43050b.options.get(i).values;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: r */
    public final void m65931r() {
        m65923j().hideInput(getEditText());
        m65928o();
        m65923j().postDelayed(new Runnable() { // from class: l.vkg
            @Override // java.lang.Runnable
            public final void run() {
                this.f181784a.m65939z();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: s */
    public final void m65932s() {
        if (m65923j().hasWindowFocus()) {
            xdl0.m208320A(getEditText());
            m65922F();
            m65923j().showInput(getEditText(), 0);
        }
    }

    public void setCloseAction(d30 d30Var) {
        this.f43052d = d30Var;
    }

    public void setFrom(String str) {
        this.f43053e = str;
    }

    public void setSendSuccess(d30 d30Var) {
        this.f43051c = d30Var;
    }

    public void setTopicMoment(TopicMoment topicMoment) {
        this.f43050b = topicMoment;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m65933t(CharSequence charSequence) {
        Editable text = getEditText().getText();
        if ((!nkg.m159895n0() || getTopicSelectImg() == null || (xdl0.m208349O0(getTopicSelectImg()) && getTopicSelectImg().isSelected())) && nkg.m159895n0()) {
            return;
        }
        getSendButton().setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m65934u() {
        d30 d30Var = this.f43052d;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m65935v(View view) {
        m65931r();
        m65923j().postDelayed(new Runnable() { // from class: l.tkg
            @Override // java.lang.Runnable
            public final void run() {
                this.f170868a.m65934u();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m65936w(View view) {
        m65923j().hideInput(getEditText());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m65937x(d30 d30Var, String str, Envelope envelope) {
        this.f43049a = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.m200296J(detect.text) && vwb.m200296J(detect.media)) {
            d30Var.call();
        } else if (vqg.m199555l(detect, str)) {
            lsi0.m151593w(R$string.f39141s);
        } else {
            lsi0.m151593w(R$string.f38996W2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m65938y(d30 d30Var, Throwable th) {
        this.f43049a = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m65939z() {
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
