package com.p000p1.mobile.putong.core.newui.statussquare;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.StateOption;
import com.p1.mobile.putong.core.data.StateQuestion;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Emotion;
import com.p1.mobile.putong.data.TextTheme;
import java.util.ArrayList;
import l.b2a;
import l.bkb0;
import l.c4g0;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.t100;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.p1i;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreMyTabStatusPostView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CoreMyTabStatusPostView f5556a;

    /* JADX INFO: renamed from: b */
    public VFrame f5557b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5558c;

    /* JADX INFO: renamed from: d */
    public VFrame f5559d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5560e;

    /* JADX INFO: renamed from: f */
    public VFrame f5561f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5562g;

    /* JADX INFO: renamed from: h */
    public StateQuestion f5563h;

    /* JADX INFO: renamed from: i */
    public c4g0 f5564i;

    /* JADX INFO: renamed from: j */
    public String f5565j;

    public CoreMyTabStatusPostView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m7793f(View view) {
        b2a.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m7794g() {
        return getContext();
    }

    /* JADX INFO: renamed from: h */
    public void m7795h() {
        if (TextUtils.isEmpty(this.f5565j)) {
            return;
        }
        d.l().k(this.f5565j);
        this.f5565j = null;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7796i(roj0 roj0Var) {
        m7801n();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7797j(View view) {
        m7804q(0);
        m7800m((StateOption) this.f5563h.stateOptions.get(0));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7798k(View view) {
        m7804q(1);
        m7800m((StateOption) this.f5563h.stateOptions.get(1));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m7799l(View view) {
        m7804q(2);
        m7800m((StateOption) this.f5563h.stateOptions.get(2));
    }

    /* JADX INFO: renamed from: m */
    public final void m7800m(StateOption stateOption) {
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
        CoreModule.N().U6(bubbleInfo, "p_navigation_view");
    }

    /* JADX INFO: renamed from: n */
    public void m7801n() {
        Emotion emotion;
        StateQuestion stateQuestionTi = CoreModule.N().Ti(StateQuestion.JSON_ADAPTER);
        this.f5563h = stateQuestionTi;
        if (stateQuestionTi == null || vwb.J(stateQuestionTi.stateOptions)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StateOption stateOption : this.f5563h.stateOptions) {
            if (stateOption != null && (emotion = stateOption.stateEmotion) != null && !TextUtils.isEmpty(emotion.emojiUrl)) {
                arrayList.add(stateOption);
            }
        }
        if (vwb.J(arrayList)) {
            return;
        }
        zvf0.A("e_fast_state_post", "p_navigation_view", new j760[]{j760.a("question", this.f5563h.question)});
        xdl0.M(this.f5557b, false);
        xdl0.M(this.f5559d, false);
        xdl0.M(this.f5561f, false);
        if (arrayList.size() >= 1) {
            xdl0.M(this.f5557b, true);
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f5558c;
            String str = ((StateOption) arrayList.get(0)).stateEmotion.emojiUrl;
            int i = t100.q;
            bkb0Var.I0(vDraweeView, str, i, i);
        }
        if (arrayList.size() >= 2) {
            xdl0.M(this.f5559d, true);
            bkb0 bkb0Var2 = qib0.G;
            VDraweeView vDraweeView2 = this.f5560e;
            String str2 = ((StateOption) arrayList.get(1)).stateEmotion.emojiUrl;
            int i2 = t100.q;
            bkb0Var2.I0(vDraweeView2, str2, i2, i2);
        }
        if (arrayList.size() >= 3) {
            xdl0.M(this.f5561f, true);
            bkb0 bkb0Var3 = qib0.G;
            VDraweeView vDraweeView3 = this.f5562g;
            String str3 = ((StateOption) arrayList.get(2)).stateEmotion.emojiUrl;
            int i3 = t100.q;
            bkb0Var3.I0(vDraweeView3, str3, i3, i3);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m7802o() {
        this.f5557b.setBackgroundResource(x2c0.wp);
        this.f5559d.setBackgroundResource(x2c0.wp);
        this.f5561f.setBackgroundResource(x2c0.wp);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mkd0.z(this.f5564i);
        this.f5564i = m7794g().duringCreated(CoreModule.N().a6().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.w1a
            public final void call(Object obj) {
                this.f21839a.m7796i((roj0) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f5564i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7793f(this);
        xdl0.E0(this.f5557b, new View.OnClickListener() { // from class: l.x1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22396a.m7797j(view);
            }
        });
        xdl0.E0(this.f5559d, new View.OnClickListener() { // from class: l.y1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22849a.m7798k(view);
            }
        });
        xdl0.E0(this.f5561f, new View.OnClickListener() { // from class: l.z1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23317a.m7799l(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m7803p() {
        StateQuestion stateQuestion = this.f5563h;
        String str = stateQuestion == null ? "" : stateQuestion.question;
        if (p1i.m20075c().m20076a() && !TextUtils.isEmpty(str) && xdl0.O0(this.f5557b)) {
            VText vText = new VText(m7794g());
            int i = xdl0.e;
            vText.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            vText.setText(str);
            vText.setTextSize(13.0f);
            vText.setPadding(t100.d(10.0f), t100.d(12.0f), t100.d(10.0f), t100.d(11.0f));
            vText.setTextColor(-1);
            vText.getPaint().setFakeBoldText(true);
            this.f5565j = d.l().t(new a(m7794g()).s(vText).e(true).k(new int[]{m7794g().getResources().getColor(upa.L3() ? w0c0.A : w0c0.I)}).b(5000L).y(true).q(a.Q).N(new a.d() { // from class: l.a2a
                /* JADX INFO: renamed from: a */
                public final void m11183a(View view) {
                    p1i.m20075c().m20082h();
                }
            }).x(-t100.d(7.0f)), this.f5557b);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7804q(int i) {
        zvf0.u("e_set_my_state_post", "p_navigation_view", new j760[]{j760.a("question", this.f5563h.question), j760.a("state_id", ((StateOption) this.f5563h.stateOptions.get(i)).stateEmotion.id)});
    }

    public CoreMyTabStatusPostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreMyTabStatusPostView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
