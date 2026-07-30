package com.p051p1.mobile.putong.core.newui.statussquare;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.StateOption;
import com.p051p1.mobile.putong.core.data.StateQuestion;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.TextTheme;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.e3i;
import p153l.fo0;
import p153l.fsb0;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.m3a;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CoreMyTabStatusPostView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CoreMyTabStatusPostView f27626a;

    /* JADX INFO: renamed from: b */
    public VFrame f27627b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f27628c;

    /* JADX INFO: renamed from: d */
    public VFrame f27629d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f27630e;

    /* JADX INFO: renamed from: f */
    public VFrame f27631f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f27632g;

    /* JADX INFO: renamed from: h */
    public StateQuestion f27633h;

    /* JADX INFO: renamed from: i */
    public kcg0 f27634i;

    /* JADX INFO: renamed from: j */
    public String f27635j;

    public CoreMyTabStatusPostView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m44733f(View view) {
        m3a.m156922a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m44734g() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public void m44735h() {
        if (TextUtils.isEmpty(this.f27635j)) {
            return;
        }
        C4499d.m21895l().m21899k(this.f27635j);
        this.f27635j = null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m44736i(uxj0 uxj0Var) {
        m44741n();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m44737j(View view) {
        m44744q(0);
        m44740m(this.f27633h.stateOptions.get(0));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m44738k(View view) {
        m44744q(1);
        m44740m(this.f27633h.stateOptions.get(1));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m44739l(View view) {
        m44744q(2);
        m44740m(this.f27633h.stateOptions.get(2));
    }

    /* JADX INFO: renamed from: m */
    public final void m44740m(StateOption stateOption) {
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
        CoreModule.m30932N().mo61507U6(bubbleInfo, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: n */
    public void m44741n() {
        Emotion emotion;
        StateQuestion stateQuestion = (StateQuestion) CoreModule.m30932N().mo61505Ti(StateQuestion.JSON_ADAPTER);
        this.f27633h = stateQuestion;
        if (stateQuestion == null || jyb.m147479J(stateQuestion.stateOptions)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StateOption stateOption : this.f27633h.stateOptions) {
            if (stateOption != null && (emotion = stateOption.stateEmotion) != null && !TextUtils.isEmpty(emotion.emojiUrl)) {
                arrayList.add(stateOption);
            }
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        i4g0.m138492A("e_fast_state_post", OMSDialogPositon.p_navigation_view, pf60.m172085a("question", this.f27633h.question));
        bnl0.m105524M(this.f27627b, false);
        bnl0.m105524M(this.f27629d, false);
        bnl0.m105524M(this.f27631f, false);
        if (arrayList.size() >= 1) {
            bnl0.m105524M(this.f27627b, true);
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f27628c;
            String str = ((StateOption) arrayList.get(0)).stateEmotion.emojiUrl;
            int i = qa00.f156330q;
            fsb0Var.m127109I0(vDraweeView, str, i, i);
        }
        if (arrayList.size() >= 2) {
            bnl0.m105524M(this.f27629d, true);
            fsb0 fsb0Var2 = uqb0.f180374G;
            VDraweeView vDraweeView2 = this.f27630e;
            String str2 = ((StateOption) arrayList.get(1)).stateEmotion.emojiUrl;
            int i2 = qa00.f156330q;
            fsb0Var2.m127109I0(vDraweeView2, str2, i2, i2);
        }
        if (arrayList.size() >= 3) {
            bnl0.m105524M(this.f27631f, true);
            fsb0 fsb0Var3 = uqb0.f180374G;
            VDraweeView vDraweeView3 = this.f27632g;
            String str3 = ((StateOption) arrayList.get(2)).stateEmotion.emojiUrl;
            int i3 = qa00.f156330q;
            fsb0Var3.m127109I0(vDraweeView3, str3, i3, i3);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m44742o() {
        this.f27627b.setBackgroundResource(dbc0.f87162kq);
        this.f27629d.setBackgroundResource(dbc0.f87162kq);
        this.f27631f.setBackgroundResource(dbc0.f87162kq);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        psd0.m173633z(this.f27634i);
        this.f27634i = m44734g().duringCreated(CoreModule.m30932N().mo61522a6().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.h3a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107629a.m44736i((uxj0) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f27634i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44733f(this);
        bnl0.m105509E0(this.f27627b, new View.OnClickListener() { // from class: l.i3a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112701a.m44737j(view);
            }
        });
        bnl0.m105509E0(this.f27629d, new View.OnClickListener() { // from class: l.j3a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118169a.m44738k(view);
            }
        });
        bnl0.m105509E0(this.f27631f, new View.OnClickListener() { // from class: l.k3a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123701a.m44739l(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m44743p() {
        StateQuestion stateQuestion = this.f27633h;
        String str = stateQuestion == null ? "" : stateQuestion.question;
        if (e3i.m119288c().m119289a() && !TextUtils.isEmpty(str) && bnl0.m105529O0(this.f27627b)) {
            VText vText = new VText(m44734g());
            int i = bnl0.f77544e;
            vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            vText.setText(str);
            vText.setTextSize(13.0f);
            vText.setPadding(qa00.m175859d(10.0f), qa00.m175859d(12.0f), qa00.m175859d(10.0f), qa00.m175859d(11.0f));
            vText.setTextColor(-1);
            vText.getPaint().setFakeBoldText(true);
            this.f27635j = C4499d.m21895l().m21907t(new C4496a(m44734g()).m21876s(vText).m21863e(true).m21869k(m44734g().getResources().getColor(gra.m131596L3() ? c9c0.f80318A : c9c0.f80342I)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21882y(true).m21874q(C4496a.f16402Q).m21858N(new C4496a.d() { // from class: l.l3a
                @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
                /* JADX INFO: renamed from: a */
                public final void mo21886a(View view) {
                    e3i.m119288c().m119295h();
                }
            }).m21881x(-qa00.m175859d(7.0f)), this.f27627b);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m44744q(int i) {
        i4g0.m138523u("e_set_my_state_post", OMSDialogPositon.p_navigation_view, pf60.m172085a("question", this.f27633h.question), pf60.m172085a("state_id", this.f27633h.stateOptions.get(i).stateEmotion.f39596id));
    }

    public CoreMyTabStatusPostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreMyTabStatusPostView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
