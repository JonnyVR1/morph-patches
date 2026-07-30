package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.Detect;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.DetectRequest;
import com.p000p1.mobile.putong.data.DetectText;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.xdl0;
import p007l.nkg;
import p007l.oe40;
import p007l.vqg;
import p007l.zi60;
import v.VEditText;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class FeedAbstractInputMomentTextToJoinTopicView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f4510a;

    /* JADX INFO: renamed from: b */
    public TopicMoment f4511b;

    /* JADX INFO: renamed from: c */
    public d30 f4512c;

    /* JADX INFO: renamed from: d */
    public d30 f4513d;

    /* JADX INFO: renamed from: e */
    public String f4514e;

    public FeedAbstractInputMomentTextToJoinTopicView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m7070B(View view) {
        if (this.f4510a) {
            return;
        }
        StringBuilder sb = new StringBuilder(getEditText().getText().toString());
        if (nkg.m12254n0() && m7081p() && NullChecker.a(getTopicSelectImg()) && xdl0.O0(getTopicSelectImg()) && getTopicSelectImg().isSelected()) {
            sb.append(" 我投了“");
            sb.append(m7082q());
            sb.append("”，你也来表态吧～");
        }
        final String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        m7078m(string, new d30() { // from class: l.wkg
            public final void call() {
                this.f14561a.m7069A(string);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m7071C(Moment moment) {
        String strM15485K;
        if (TextUtils.isEmpty(this.f4514e) || !nkg.m12252m0()) {
            mo7072D(moment);
            return;
        }
        zi60.f15782b = true;
        mo7072D(moment);
        if (TextUtils.isEmpty(this.f4514e)) {
            strM15485K = "p_user_moment_interactions_details_view";
        } else {
            String str = this.f4514e;
            strM15485K = vqg.m15485K(str, TextUtils.equals(str, "from_album"));
        }
        zi60.m17436w().m17459p(moment, strM15485K, 201, false, new j760<>("posted_source", TextUtils.isEmpty(this.f4514e) ? "p_user_moment_interactions_details_view" : this.f4514e));
    }

    /* JADX INFO: renamed from: D */
    public void mo7072D(Moment moment) {
        oe40.m12559X(moment);
    }

    /* JADX INFO: renamed from: E */
    public void mo7073E() {
        m7084s();
        xdl0.E0(getSendButton(), new View.OnClickListener() { // from class: l.ukg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13848a.m7070B(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m7074F() {
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
    public Act m7075j() {
        return getContext();
    }

    /* JADX INFO: renamed from: k */
    public void m7076k(View view) {
        addView(view);
        m7077l();
    }

    /* JADX INFO: renamed from: l */
    public void m7077l() {
        getContainer().setOnClickListener(null);
        m7080o();
        getEditText().i(true).subscribe(mkd0.G(new e30() { // from class: l.qkg
            public final void call(Object obj) {
                this.f12265a.m7085t((CharSequence) obj);
            }
        }));
        xdl0.E0(getCloseView(), new View.OnClickListener() { // from class: l.rkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12666a.m7087v(view);
            }
        });
        xdl0.E0(getBackCover(), new View.OnClickListener() { // from class: l.skg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12975a.m7088w(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m7078m(String str, final d30 d30Var) {
        final String strM15485K;
        this.f4510a = true;
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = DetectCategoryType.get("moment");
        DetectText detectText = new DetectText();
        detectText.key = "moment";
        detectText.value = str;
        ArrayList arrayList = new ArrayList();
        detectRequest.text = arrayList;
        arrayList.add(detectText);
        if (TextUtils.isEmpty(this.f4514e)) {
            strM15485K = "p_user_moment_interactions_details_view";
        } else {
            String str2 = this.f4514e;
            strM15485K = vqg.m15485K(str2, TextUtils.equals(str2, "from_album"));
        }
        m7075j().duringCreated(FeedModule.f316d.m16522P6(detectRequest)).subscribe(mkd0.H(new e30() { // from class: l.xkg
            public final void call(Object obj) {
                this.f15027a.m7089x(d30Var, strM15485K, (Envelope) obj);
            }
        }, new e30() { // from class: l.ykg
            public final void call(Object obj) {
                this.f15462a.m7090y(d30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m7069A(String str) {
        Moment momentNew_ = Moment.new_();
        momentNew_.value = str;
        momentNew_.media = new ArrayList();
        ArrayList arrayList = new ArrayList();
        TopicMomentIdBox topicMomentIdBox = new TopicMomentIdBox();
        TopicMoment topicMoment = this.f4511b;
        topicMomentIdBox.f285id = topicMoment.f708id;
        topicMomentIdBox.name = topicMoment.name;
        arrayList.add(topicMomentIdBox);
        momentNew_.topics = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f4511b);
        momentNew_.mTopicList = arrayList2;
        if (nkg.m12254n0()) {
            VImage topicSelectImg = getTopicSelectImg();
            momentNew_.shareMyVote = NullChecker.a(topicSelectImg) && xdl0.O0(topicSelectImg) && topicSelectImg.isSelected();
        }
        m7071C(momentNew_);
        getEditText().setText("");
        m7083r();
        d30 d30Var = this.f4512c;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7080o() {
        xdl0.M(getContainer(), false);
        xdl0.M(getBackCover(), false);
        xdl0.M(getRoot(), false);
    }

    /* JADX INFO: renamed from: p */
    public boolean m7081p() {
        if (NullChecker.a(this.f4511b) && NullChecker.a(this.f4511b.options)) {
            for (int i = 0; i < this.f4511b.options.size(); i++) {
                if (this.f4511b.options.get(i).haveliked) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public String m7082q() {
        if (!NullChecker.a(this.f4511b) || !NullChecker.a(this.f4511b.options)) {
            return "";
        }
        for (int i = 0; i < this.f4511b.options.size(); i++) {
            if (this.f4511b.options.get(i).haveliked) {
                return this.f4511b.options.get(i).values;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: r */
    public final void m7083r() {
        m7075j().hideInput(getEditText());
        m7080o();
        m7075j().postDelayed(new Runnable() { // from class: l.vkg
            @Override // java.lang.Runnable
            public final void run() {
                this.f14182a.m7091z();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: s */
    public final void m7084s() {
        if (m7075j().hasWindowFocus()) {
            xdl0.A(getEditText());
            m7074F();
            m7075j().showInput(getEditText(), 0);
        }
    }

    public void setCloseAction(d30 d30Var) {
        this.f4513d = d30Var;
    }

    public void setFrom(String str) {
        this.f4514e = str;
    }

    public void setSendSuccess(d30 d30Var) {
        this.f4512c = d30Var;
    }

    public void setTopicMoment(TopicMoment topicMoment) {
        this.f4511b = topicMoment;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7085t(CharSequence charSequence) {
        Editable text = getEditText().getText();
        if ((!nkg.m12254n0() || getTopicSelectImg() == null || (xdl0.O0(getTopicSelectImg()) && getTopicSelectImg().isSelected())) && nkg.m12254n0()) {
            return;
        }
        getSendButton().setEnabled((text == null || text.toString().trim().isEmpty()) ? false : true);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7086u() {
        d30 d30Var = this.f4513d;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m7087v(View view) {
        m7083r();
        m7075j().postDelayed(new Runnable() { // from class: l.tkg
            @Override // java.lang.Runnable
            public final void run() {
                this.f13324a.m7086u();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m7088w(View view) {
        m7075j().hideInput(getEditText());
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m7089x(d30 d30Var, String str, Envelope envelope) {
        this.f4510a = false;
        Detect detect = ((CommonData) envelope.getModuleData(CommonData.class)).detect;
        if (vwb.J(detect.text) && vwb.J(detect.media)) {
            d30Var.call();
        } else if (vqg.m15525l(detect, str)) {
            lsi0.w(R$string.f602s);
        } else {
            lsi0.w(R$string.f457W2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m7090y(d30 d30Var, Throwable th) {
        this.f4510a = false;
        d30Var.call();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m7091z() {
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
