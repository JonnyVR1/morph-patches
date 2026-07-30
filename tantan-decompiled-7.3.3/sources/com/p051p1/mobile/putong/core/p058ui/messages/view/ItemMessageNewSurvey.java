package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Options;
import com.p051p1.mobile.putong.core.data.OptionsIcon;
import com.p051p1.mobile.putong.core.data.OptionsSecond;
import com.p051p1.mobile.putong.core.data.QuestionsSecond;
import com.p051p1.mobile.putong.core.data.Survey;
import com.p051p1.mobile.putong.core.data.Surveys;
import com.p051p1.mobile.putong.data.Meta;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.clz;
import p153l.d3z;
import p153l.ei40;
import p153l.fsb0;
import p153l.gc2;
import p153l.gi40;
import p153l.ibc0;
import p153l.jyb;
import p153l.ki40;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;
import p153l.zaq;

/* JADX INFO: loaded from: classes4.dex */
public class ItemMessageNewSurvey extends VFrame {

    /* JADX INFO: renamed from: a */
    public LinearLayout f33194a;

    /* JADX INFO: renamed from: b */
    public VText f33195b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f33196c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f33197d;

    /* JADX INFO: renamed from: e */
    public VText f33198e;

    /* JADX INFO: renamed from: f */
    public VText f33199f;

    /* JADX INFO: renamed from: g */
    public gi40 f33200g;

    /* JADX INFO: renamed from: h */
    public VText f33201h;

    /* JADX INFO: renamed from: i */
    public String f33202i;

    /* JADX INFO: renamed from: j */
    public List<OptionsSecond> f33203j;

    /* JADX INFO: renamed from: k */
    public String f33204k;

    /* JADX INFO: renamed from: l */
    public String f33205l;

    /* JADX INFO: renamed from: m */
    public String f33206m;

    /* JADX INFO: renamed from: n */
    public C22508b<uxj0> f33207n;

    /* JADX INFO: renamed from: o */
    public clz<?, ?> f33208o;

    public ItemMessageNewSurvey(Context context) {
        super(context);
        this.f33207n = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: Q */
    public final void m51022Q(View view) {
        zaq.m219132a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m51023R() {
        if (this.f33200g.m130290f()) {
            return;
        }
        C22421c.just(this.f33200g.m130285a()).flatMap(new qcj() { // from class: l.yaq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198232a.m51030Z((String) obj);
            }
        }).takeUntil(this.f33207n).subscribe(psd0.m173597H(new y20() { // from class: l.jaq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119005a.m51031a0((Meta) obj);
            }
        }, new y20() { // from class: l.kaq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124707a.m51032b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m51024S(Surveys surveys) {
        if (jyb.m147479J(surveys.questions)) {
            m51044q0("网络错误，该消息无法展示，请退出重试。");
        }
        if (uqb0.f180413s.compareTo(surveys.requiredVersion.f211038android) < 0) {
            m51044q0("该消息无法识别， 请更新至最新版本。");
            return;
        }
        this.f33198e.setTextColor(-4144960);
        this.f33198e.setBackgroundResource(ibc0.f114134s4);
        this.f33196c.removeAllViews();
        bnl0.m105524M(this.f33194a, true);
        bnl0.m105524M(this.f33199f, false);
        this.f33200g = new gi40(surveys.f21254id, surveys.questions.get(0).f21223id, this.f33204k);
        this.f33195b.setText(surveys.questions.get(0).title);
        ei40 ei40Var = new ei40("multi_selection".equals(surveys.questions.get(0).type) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1);
        List<Options> list = surveys.questions.get(0).content.selection.options;
        final C22508b<pf60<Integer, String>> c22508bM222767b = C22508b.m222767b();
        int i = 0;
        while (i < list.size()) {
            final Options options = list.get(i);
            final ItemMessageNewSurvey itemMessageNewSurvey = this;
            LinearLayout linearLayoutM51029Y = itemMessageNewSurvey.m51029Y(options, qa00.m175859d(18.0f), 1, ei40Var, c22508bM222767b);
            linearLayoutM51029Y.setPadding(0, qa00.f156324k, 0, qa00.f156321h);
            linearLayoutM51029Y.setOnClickListener(new View.OnClickListener() { // from class: l.vaq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183144a.m51033c0(c22508bM222767b, options, view);
                }
            });
            itemMessageNewSurvey.f33196c.addView(linearLayoutM51029Y);
            if (i < list.size() - 1) {
                itemMessageNewSurvey.f33196c.addView(itemMessageNewSurvey.m51025T());
            }
            i++;
            this = itemMessageNewSurvey;
        }
        final ItemMessageNewSurvey itemMessageNewSurvey2 = this;
        bnl0.m105509E0(itemMessageNewSurvey2.f33198e, new View.OnClickListener() { // from class: l.waq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188154a.m51034e0(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final View m51025T() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX INFO: renamed from: V */
    public final void m51026V(QuestionsSecond questionsSecond) {
        this.f33200g.m130294j(questionsSecond.f21224id);
        List<OptionsSecond> list = questionsSecond.content.selection.options;
        List<OptionsSecond> list2 = this.f33203j;
        if (list2 == null || list2 != list || this.f33197d.getChildCount() == 0) {
            this.f33203j = list;
            this.f33197d.removeAllViews();
            this.f33197d.addView(m51028X(questionsSecond.title));
            ei40 ei40Var = new ei40("multi_selection".equals(questionsSecond.type) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1);
            final C22508b<pf60<Integer, String>> c22508bM222767b = C22508b.m222767b();
            int i = 0;
            while (i < list.size()) {
                final OptionsSecond optionsSecond = list.get(i);
                ItemMessageNewSurvey itemMessageNewSurvey = this;
                LinearLayout linearLayoutM51029Y = itemMessageNewSurvey.m51029Y(optionsSecond.mapToOptions(), qa00.m175859d(18.0f), 2, ei40Var, c22508bM222767b);
                linearLayoutM51029Y.setPadding(0, qa00.f156323j, 0, 0);
                linearLayoutM51029Y.setOnClickListener(new View.OnClickListener() { // from class: l.naq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c22508bM222767b.onNext(jyb.m147494Y(2, optionsSecond.f21206id));
                    }
                });
                itemMessageNewSurvey.f33197d.addView(linearLayoutM51029Y);
                i++;
                this = itemMessageNewSurvey;
            }
        }
        bnl0.m105524M(this.f33197d, true);
    }

    /* JADX INFO: renamed from: W */
    public final VText m51027W(final String str) {
        if (this.f33201h == null) {
            this.f33201h = new VText(getContext());
            this.f33201h.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VText vText = this.f33201h;
            int i = qa00.f156321h;
            int i2 = qa00.f156320g;
            vText.setPadding(i, i2, i, i2);
            this.f33201h.setBackground(gc2.m129823b("#ededed", 4));
            this.f33201h.setText(str);
            this.f33201h.setTextColor(855638016);
            bnl0.m105509E0(this.f33201h, new View.OnClickListener() { // from class: l.oaq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145748a.m51036g0(str, view);
                }
            });
        }
        return this.f33201h;
    }

    /* JADX INFO: renamed from: X */
    public final VText m51028X(String str) {
        VText vText = new VText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = qa00.f156323j;
        vText.setLayoutParams(layoutParams);
        vText.setTextColor(-14540254);
        vText.setText(str);
        return vText;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Y */
    public final LinearLayout m51029Y(final Options options, int i, final int i2, final ei40 ei40Var, C22508b<pf60<Integer, String>> c22508b) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i2 == 1 ? 17 : 3;
        linearLayout.setLayoutParams(layoutParams);
        final VDraweeView vDraweeView = new VDraweeView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.rightMargin = qa00.f156319f;
        layoutParams2.gravity = 17;
        vDraweeView.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        final VText vText = new VText(getContext());
        vText.setTextSize(14.0f);
        vText.setTextColor(i2 == 1 ? 1275068416 : -14540254);
        vText.setText(options.text);
        vText.setLayoutParams(layoutParams3);
        linearLayout.addView(vDraweeView);
        linearLayout.addView(vText);
        uqb0.f180374G.m127115L0(vDraweeView, options.icon.nonSelected);
        c22508b.filter(new qcj() { // from class: l.laq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf((pf60Var == null || ((Integer) pf60Var.f152156a).intValue() != i2 || TextUtils.isEmpty((CharSequence) pf60Var.f152157b)) ? false : true);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.maq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135576a.m51037h0(options, i2, ei40Var, vDraweeView, vText, (pf60) obj);
            }
        }));
        return linearLayout;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22421c m51030Z(String str) {
        return CoreModule.f18264c.f20384f0.m34054ne(this.f33202i, str);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m51031a0(Meta meta) {
        int i;
        if (meta != null && (i = meta.code) > 199 && i < 300) {
            this.f33208o.m110871J2(this.f33202i, this.f33206m);
        }
        m51044q0(this.f33206m);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m51032b0(Throwable th) {
        m51044q0("网络错误，该消息无法展示，请退出重试。");
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m51033c0(C22508b c22508b, Options options, View view) {
        c22508b.onNext(jyb.m147494Y(1, options.f21205id));
        List<QuestionsSecond> list = options.questions;
        if (list == null || list.isEmpty()) {
            bnl0.m105524M(this.f33197d, false);
        } else {
            m51026V(options.questions.get(0));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m51034e0(View view) {
        m51023R();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m51035f0(String str, String str2) {
        VText vText = this.f33201h;
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        vText.setText(str);
        this.f33201h.setTextColor(TextUtils.isEmpty(str2) ? 855638016 : -14540254);
        this.f33200g.m130293i(str2);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m51036g0(final String str, View view) {
        this.f33208o.m143372e0().mo50163x0().m135108i0().takeUntil(this.f33207n).subscribe(psd0.m173596G(new y20() { // from class: l.paq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151318a.m51035f0(str, (String) obj);
            }
        }));
        ki40 ki40VarM143374g0 = this.f33208o.m143372e0().mo50163x0().m143374g0();
        d3z d3zVarM143374g0 = this.f33208o.m143372e0().mo50138B0().m143374g0();
        View viewInflateView = ki40VarM143374g0.inflateView(((Act) getContext()).inflater(), d3zVarM143374g0.m114041t0().getBarWrapper());
        if (d3zVarM143374g0.m114041t0().getBarWrapper().indexOfChild(viewInflateView) < 0) {
            d3zVarM143374g0.m114041t0().getBarWrapper().addView(viewInflateView);
            d3zVarM143374g0.m114041t0().getBar_center_text().setEnabled(false);
        }
        ki40VarM143374g0.m149865i(str.equals(this.f33201h.getText().toString()) ? "" : this.f33201h.getText().toString());
        this.f33208o.m110849D6();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ bkj0 m51038j0(Survey survey, Surveys surveys) {
        this.f33208o.m143372e0().mo50163x0().m135107h0().m125671c(survey.f21253id, surveys);
        return new bkj0(Boolean.FALSE, survey, surveys);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C22421c m51039k0(final Survey survey) {
        if ("submitted".equals(survey.status)) {
            return C22421c.just(new bkj0(Boolean.TRUE, survey, null));
        }
        return this.f33208o.m143372e0().mo50163x0().m135107h0().m125669a(survey.f21253id) != null ? C22421c.just(new bkj0(Boolean.FALSE, survey, this.f33208o.m143372e0().mo50163x0().m135107h0().m125669a(survey.f21253id))) : CoreModule.f18264c.f20384f0.m34082pg(survey.f21253id).map(new qcj() { // from class: l.xaq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193063a.m51038j0(survey, (Surveys) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m51040l0(Message message, bkj0 bkj0Var) {
        this.f33206m = ((Survey) bkj0Var.f77082b).submittedTips;
        if (((Boolean) bkj0Var.f77081a).booleanValue()) {
            m51044q0(message.value);
            return;
        }
        C c = bkj0Var.f77083c;
        if (c != 0) {
            this.f33202i = ((Survey) bkj0Var.f77082b).f21253id;
            m51024S((Surveys) c);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m51041m0(Throwable th) {
        th.toString();
        m51044q0("网络错误，该消息无法展示，请退出重试。");
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final void m51037h0(Options options, int i, ei40 ei40Var, VDraweeView vDraweeView, VText vText, pf60<Integer, String> pf60Var) {
        this.f33198e.setTextColor(-1);
        this.f33198e.setBackgroundResource(ibc0.f114125r4);
        if (ei40Var.m120880a()) {
            boolean zEquals = pf60Var.f152157b.equals(options.f21205id);
            if (zEquals && this.f33200g.m130286b(options.f21205id)) {
                return;
            }
            fsb0 fsb0Var = uqb0.f180374G;
            OptionsIcon optionsIcon = options.icon;
            fsb0Var.m127115L0(vDraweeView, zEquals ? optionsIcon.selected : optionsIcon.nonSelected);
            gi40 gi40Var = this.f33200g;
            if (zEquals) {
                gi40Var.m130291g(1, options.f21205id, options.text);
            } else {
                gi40Var.m130292h(1, options.f21205id);
            }
            if (i == 1) {
                vText.setTextColor(zEquals ? -14540254 : 1275068416);
                return;
            }
            return;
        }
        if (pf60Var.f152157b.equals(options.f21205id)) {
            boolean zM120881b = ei40Var.m120881b(options.f21205id);
            gi40 gi40Var2 = this.f33200g;
            if (zM120881b) {
                gi40Var2.m130292h(2, options.f21205id);
            } else {
                gi40Var2.m130291g(2, options.f21205id, options.text);
            }
            fsb0 fsb0Var2 = uqb0.f180374G;
            OptionsIcon optionsIcon2 = options.icon;
            fsb0Var2.m127115L0(vDraweeView, !zM120881b ? optionsIcon2.selected : optionsIcon2.nonSelected);
            if (options.requireInput) {
                bnl0.m105540X(m51027W(options.placeholder), qa00.f156321h);
                int iIndexOfChild = this.f33197d.indexOfChild(m51027W(options.placeholder));
                LinearLayout linearLayout = this.f33197d;
                if (iIndexOfChild == -1) {
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), this.f33197d.getPaddingTop(), this.f33197d.getPaddingRight(), qa00.f156322i);
                    this.f33197d.addView(m51027W(options.placeholder));
                } else {
                    linearLayout.removeView(m51027W(options.placeholder));
                    LinearLayout linearLayout2 = this.f33197d;
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.f33197d.getPaddingTop(), this.f33197d.getPaddingRight(), qa00.f156324k);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f33207n.onNext(uxj0.f181467a);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51022Q(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m51043p0(final Message message, clz<?, ?> clzVar) {
        if (TextUtils.equals(this.f33204k, message.f56859id)) {
            return;
        }
        this.f33203j = null;
        this.f33208o = clzVar;
        this.f33204k = message.f56859id;
        this.f33205l = message.msgData;
        bnl0.m105524M(this.f33197d, false);
        C22421c.just(message).filter(new qcj() { // from class: l.iaq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message2 = (Message) obj;
                return Boolean.valueOf((message2 == null || TextUtils.isEmpty(message2.msgData)) ? false : true);
            }
        }).map(new qcj() { // from class: l.qaq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Survey.parse(((Message) obj).msgData);
            }
        }).filter(new qcj() { // from class: l.raq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Survey) obj) != null);
            }
        }).flatMap(new qcj() { // from class: l.saq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167065a.m51039k0((Survey) obj);
            }
        }).takeUntil(this.f33207n).subscribe(psd0.m173597H(new y20() { // from class: l.taq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172756a.m51040l0(message, (bkj0) obj);
            }
        }, new y20() { // from class: l.uaq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178223a.m51041m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m51044q0(String str) {
        bnl0.m105524M(this.f33194a, false);
        bnl0.m105524M(this.f33199f, true);
        this.f33199f.setText(str);
    }

    public ItemMessageNewSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33207n = C22508b.m222767b();
    }

    public ItemMessageNewSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33207n = C22508b.m222767b();
    }
}
