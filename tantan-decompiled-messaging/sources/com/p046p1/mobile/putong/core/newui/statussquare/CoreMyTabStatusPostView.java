package com.p046p1.mobile.putong.core.newui.statussquare;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.StateOption;
import com.p046p1.mobile.putong.core.data.StateQuestion;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.TextTheme;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.b2a;
import p149l.bkb0;
import p149l.c4g0;
import p149l.e30;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.p1i;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreMyTabStatusPostView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CoreMyTabStatusPostView f26778a;

    /* JADX INFO: renamed from: b */
    public VFrame f26779b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f26780c;

    /* JADX INFO: renamed from: d */
    public VFrame f26781d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f26782e;

    /* JADX INFO: renamed from: f */
    public VFrame f26783f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f26784g;

    /* JADX INFO: renamed from: h */
    public StateQuestion f26785h;

    /* JADX INFO: renamed from: i */
    public c4g0 f26786i;

    /* JADX INFO: renamed from: j */
    public String f26787j;

    public CoreMyTabStatusPostView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m43547f(View view) {
        b2a.m99956a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m43548g() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public void m43549h() {
        if (TextUtils.isEmpty(this.f26787j)) {
            return;
        }
        C4348d.m20896l().m20900k(this.f26787j);
        this.f26787j = null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m43550i(roj0 roj0Var) {
        m43555n();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m43551j(View view) {
        m43558q(0);
        m43554m(this.f26785h.stateOptions.get(0));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m43552k(View view) {
        m43558q(1);
        m43554m(this.f26785h.stateOptions.get(1));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m43553l(View view) {
        m43558q(2);
        m43554m(this.f26785h.stateOptions.get(2));
    }

    /* JADX INFO: renamed from: m */
    public final void m43554m(StateOption stateOption) {
        String strSubstring = stateOption.defaultContent;
        Emotion emotion = stateOption.stateEmotion;
        BubbleInfo bubbleInfo = new BubbleInfo();
        if (!TextUtils.isEmpty(strSubstring) && strSubstring.length() > 60) {
            strSubstring = strSubstring.substring(0, 60);
        }
        bubbleInfo.value = strSubstring;
        bubbleInfo.emotion = emotion;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = emotion.backgroundColor;
        textTheme.iconColor = emotion.iconColor;
        bubbleInfo.textTheme = textTheme;
        CoreModule.m29934N().mo60323U6(bubbleInfo, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: n */
    public void m43555n() {
        Emotion emotion;
        StateQuestion stateQuestion = (StateQuestion) CoreModule.m29934N().mo60321Ti(StateQuestion.JSON_ADAPTER);
        this.f26785h = stateQuestion;
        if (stateQuestion == null || vwb.m200296J(stateQuestion.stateOptions)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StateOption stateOption : this.f26785h.stateOptions) {
            if (stateOption != null && (emotion = stateOption.stateEmotion) != null && !TextUtils.isEmpty(emotion.emojiUrl)) {
                arrayList.add(stateOption);
            }
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        zvf0.m220368A("e_fast_state_post", OMSDialogPositon.p_navigation_view, j760.m140076a("question", this.f26785h.question));
        xdl0.m208344M(this.f26779b, false);
        xdl0.m208344M(this.f26781d, false);
        xdl0.m208344M(this.f26783f, false);
        if (arrayList.size() >= 1) {
            xdl0.m208344M(this.f26779b, true);
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f26780c;
            String str = ((StateOption) arrayList.get(0)).stateEmotion.emojiUrl;
            int i = t100.f167268q;
            bkb0Var.m102325I0(vDraweeView, str, i, i);
        }
        if (arrayList.size() >= 2) {
            xdl0.m208344M(this.f26781d, true);
            bkb0 bkb0Var2 = qib0.f154691G;
            VDraweeView vDraweeView2 = this.f26782e;
            String str2 = ((StateOption) arrayList.get(1)).stateEmotion.emojiUrl;
            int i2 = t100.f167268q;
            bkb0Var2.m102325I0(vDraweeView2, str2, i2, i2);
        }
        if (arrayList.size() >= 3) {
            xdl0.m208344M(this.f26783f, true);
            bkb0 bkb0Var3 = qib0.f154691G;
            VDraweeView vDraweeView3 = this.f26784g;
            String str3 = ((StateOption) arrayList.get(2)).stateEmotion.emojiUrl;
            int i3 = t100.f167268q;
            bkb0Var3.m102325I0(vDraweeView3, str3, i3, i3);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m43556o() {
        this.f26779b.setBackgroundResource(x2c0.f190692wp);
        this.f26781d.setBackgroundResource(x2c0.f190692wp);
        this.f26783f.setBackgroundResource(x2c0.f190692wp);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mkd0.m154992z(this.f26786i);
        this.f26786i = m43548g().duringCreated(CoreModule.m29934N().mo60338a6().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.w1a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183981a.m43550i((roj0) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f26786i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43547f(this);
        xdl0.m208329E0(this.f26779b, new View.OnClickListener() { // from class: l.x1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189039a.m43551j(view);
            }
        });
        xdl0.m208329E0(this.f26781d, new View.OnClickListener() { // from class: l.y1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195397a.m43552k(view);
            }
        });
        xdl0.m208329E0(this.f26783f, new View.OnClickListener() { // from class: l.z1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201058a.m43553l(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m43557p() {
        StateQuestion stateQuestion = this.f26785h;
        String str = stateQuestion == null ? "" : stateQuestion.question;
        if (p1i.m167059c().m167060a() && !TextUtils.isEmpty(str) && xdl0.m208349O0(this.f26779b)) {
            VText vText = new VText(m43548g());
            int i = xdl0.f192403e;
            vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            vText.setText(str);
            vText.setTextSize(13.0f);
            vText.setPadding(t100.m186890d(10.0f), t100.m186890d(12.0f), t100.m186890d(10.0f), t100.m186890d(11.0f));
            vText.setTextColor(-1);
            vText.getPaint().setFakeBoldText(true);
            this.f26787j = C4348d.m20896l().m20908t(new C4345a(m43548g()).m20877s(vText).m20864e(true).m20870k(m43548g().getResources().getColor(upa.m194665L3() ? w0c0.f183749A : w0c0.f183773I)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20883y(true).m20875q(C4345a.f15683Q).m20859N(new C4345a.d() { // from class: l.a2a
                @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
                /* JADX INFO: renamed from: a */
                public final void mo20887a(View view) {
                    p1i.m167059c().m167066h();
                }
            }).m20882x(-t100.m186890d(7.0f)), this.f26779b);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m43558q(int i) {
        zvf0.m220399u("e_set_my_state_post", OMSDialogPositon.p_navigation_view, j760.m140076a("question", this.f26785h.question), j760.m140076a("state_id", this.f26785h.stateOptions.get(i).stateEmotion.f38748id));
    }

    public CoreMyTabStatusPostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreMyTabStatusPostView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
