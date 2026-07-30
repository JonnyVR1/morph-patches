package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Options;
import com.p046p1.mobile.putong.core.data.OptionsIcon;
import com.p046p1.mobile.putong.core.data.OptionsSecond;
import com.p046p1.mobile.putong.core.data.QuestionsSecond;
import com.p046p1.mobile.putong.core.data.Survey;
import com.p046p1.mobile.putong.core.data.Surveys;
import com.p046p1.mobile.putong.data.Meta;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.bkb0;
import p149l.c3c0;
import p149l.e30;
import p149l.fcz;
import p149l.guy;
import p149l.j760;
import p149l.mkd0;
import p149l.q940;
import p149l.qib0;
import p149l.roj0;
import p149l.s940;
import p149l.t100;
import p149l.vwb;
import p149l.w940;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.z8q;
import p149l.zb2;

/* JADX INFO: loaded from: classes4.dex */
public class ItemMessageNewSurvey extends VFrame {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32346a;

    /* JADX INFO: renamed from: b */
    public VText f32347b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f32348c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f32349d;

    /* JADX INFO: renamed from: e */
    public VText f32350e;

    /* JADX INFO: renamed from: f */
    public VText f32351f;

    /* JADX INFO: renamed from: g */
    public s940 f32352g;

    /* JADX INFO: renamed from: h */
    public VText f32353h;

    /* JADX INFO: renamed from: i */
    public String f32354i;

    /* JADX INFO: renamed from: j */
    public List<OptionsSecond> f32355j;

    /* JADX INFO: renamed from: k */
    public String f32356k;

    /* JADX INFO: renamed from: l */
    public String f32357l;

    /* JADX INFO: renamed from: m */
    public String f32358m;

    /* JADX INFO: renamed from: n */
    public C22393b<roj0> f32359n;

    /* JADX INFO: renamed from: o */
    public fcz<?, ?> f32360o;

    public ItemMessageNewSurvey(Context context) {
        super(context);
        this.f32359n = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: Q */
    public final void m49839Q(View view) {
        z8q.m217620a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m49840R() {
        if (this.f32352g.m182699f()) {
            return;
        }
        C22306c.just(this.f32352g.m182694a()).flatMap(new w9j() { // from class: l.y8q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f196861a.m49847Z((String) obj);
            }
        }).takeUntil(this.f32359n).subscribe(mkd0.m154956H(new e30() { // from class: l.j8q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116769a.m49848a0((Meta) obj);
            }
        }, new e30() { // from class: l.k8q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121847a.m49849b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m49841S(Surveys surveys) {
        if (vwb.m200296J(surveys.questions)) {
            m49861q0("网络错误，该消息无法展示，请退出重试。");
        }
        if (qib0.f154730s.compareTo(surveys.requiredVersion.f210116android) < 0) {
            m49861q0("该消息无法识别， 请更新至最新版本。");
            return;
        }
        this.f32350e.setTextColor(-4144960);
        this.f32350e.setBackgroundResource(c3c0.f78859s4);
        this.f32348c.removeAllViews();
        xdl0.m208344M(this.f32346a, true);
        xdl0.m208344M(this.f32351f, false);
        this.f32352g = new s940(surveys.f20512id, surveys.questions.get(0).f20481id, this.f32356k);
        this.f32347b.setText(surveys.questions.get(0).title);
        q940 q940Var = new q940("multi_selection".equals(surveys.questions.get(0).type) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1);
        List<Options> list = surveys.questions.get(0).content.selection.options;
        final C22393b<j760<Integer, String>> c22393bM221521b = C22393b.m221521b();
        int i = 0;
        while (i < list.size()) {
            final Options options = list.get(i);
            final ItemMessageNewSurvey itemMessageNewSurvey = this;
            LinearLayout linearLayoutM49846Y = itemMessageNewSurvey.m49846Y(options, t100.m186890d(18.0f), 1, q940Var, c22393bM221521b);
            linearLayoutM49846Y.setPadding(0, t100.f167262k, 0, t100.f167259h);
            linearLayoutM49846Y.setOnClickListener(new View.OnClickListener() { // from class: l.v8q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180566a.m49850c0(c22393bM221521b, options, view);
                }
            });
            itemMessageNewSurvey.f32348c.addView(linearLayoutM49846Y);
            if (i < list.size() - 1) {
                itemMessageNewSurvey.f32348c.addView(itemMessageNewSurvey.m49842T());
            }
            i++;
            this = itemMessageNewSurvey;
        }
        final ItemMessageNewSurvey itemMessageNewSurvey2 = this;
        xdl0.m208329E0(itemMessageNewSurvey2.f32350e, new View.OnClickListener() { // from class: l.w8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185245a.m49851e0(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final View m49842T() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX INFO: renamed from: V */
    public final void m49843V(QuestionsSecond questionsSecond) {
        this.f32352g.m182703j(questionsSecond.f20482id);
        List<OptionsSecond> list = questionsSecond.content.selection.options;
        List<OptionsSecond> list2 = this.f32355j;
        if (list2 == null || list2 != list || this.f32349d.getChildCount() == 0) {
            this.f32355j = list;
            this.f32349d.removeAllViews();
            this.f32349d.addView(m49845X(questionsSecond.title));
            q940 q940Var = new q940("multi_selection".equals(questionsSecond.type) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1);
            final C22393b<j760<Integer, String>> c22393bM221521b = C22393b.m221521b();
            int i = 0;
            while (i < list.size()) {
                final OptionsSecond optionsSecond = list.get(i);
                ItemMessageNewSurvey itemMessageNewSurvey = this;
                LinearLayout linearLayoutM49846Y = itemMessageNewSurvey.m49846Y(optionsSecond.mapToOptions(), t100.m186890d(18.0f), 2, q940Var, c22393bM221521b);
                linearLayoutM49846Y.setPadding(0, t100.f167261j, 0, 0);
                linearLayoutM49846Y.setOnClickListener(new View.OnClickListener() { // from class: l.n8q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c22393bM221521b.onNext(vwb.m200311Y(2, optionsSecond.f20464id));
                    }
                });
                itemMessageNewSurvey.f32349d.addView(linearLayoutM49846Y);
                i++;
                this = itemMessageNewSurvey;
            }
        }
        xdl0.m208344M(this.f32349d, true);
    }

    /* JADX INFO: renamed from: W */
    public final VText m49844W(final String str) {
        if (this.f32353h == null) {
            this.f32353h = new VText(getContext());
            this.f32353h.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VText vText = this.f32353h;
            int i = t100.f167259h;
            int i2 = t100.f167258g;
            vText.setPadding(i, i2, i, i2);
            this.f32353h.setBackground(zb2.m217814b("#ededed", 4));
            this.f32353h.setText(str);
            this.f32353h.setTextColor(855638016);
            xdl0.m208329E0(this.f32353h, new View.OnClickListener() { // from class: l.o8q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f142664a.m49853g0(str, view);
                }
            });
        }
        return this.f32353h;
    }

    /* JADX INFO: renamed from: X */
    public final VText m49845X(String str) {
        VText vText = new VText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = t100.f167261j;
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
    public final LinearLayout m49846Y(final Options options, int i, final int i2, final q940 q940Var, C22393b<j760<Integer, String>> c22393b) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i2 == 1 ? 17 : 3;
        linearLayout.setLayoutParams(layoutParams);
        final VDraweeView vDraweeView = new VDraweeView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.rightMargin = t100.f167257f;
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
        qib0.f154691G.m102331L0(vDraweeView, options.icon.nonSelected);
        c22393b.filter(new w9j() { // from class: l.l8q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf((j760Var == null || ((Integer) j760Var.f116564a).intValue() != i2 || TextUtils.isEmpty((CharSequence) j760Var.f116565b)) ? false : true);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.m8q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132604a.m49854h0(options, i2, q940Var, vDraweeView, vText, (j760) obj);
            }
        }));
        return linearLayout;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22306c m49847Z(String str) {
        return CoreModule.f17545c.f19642f0.m33051ne(this.f32354i, str);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m49848a0(Meta meta) {
        int i;
        if (meta != null && (i = meta.code) > 199 && i < 300) {
            this.f32360o.m120665J2(this.f32354i, this.f32358m);
        }
        m49861q0(this.f32358m);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m49849b0(Throwable th) {
        m49861q0("网络错误，该消息无法展示，请退出重试。");
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m49850c0(C22393b c22393b, Options options, View view) {
        c22393b.onNext(vwb.m200311Y(1, options.f20463id));
        List<QuestionsSecond> list = options.questions;
        if (list == null || list.isEmpty()) {
            xdl0.m208344M(this.f32349d, false);
        } else {
            m49843V(options.questions.get(0));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m49851e0(View view) {
        m49840R();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m49852f0(String str, String str2) {
        VText vText = this.f32353h;
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        vText.setText(str);
        this.f32353h.setTextColor(TextUtils.isEmpty(str2) ? 855638016 : -14540254);
        this.f32352g.m182702i(str2);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m49853g0(final String str, View view) {
        this.f32360o.m156455e0().mo48978v0().m187601i0().takeUntil(this.f32359n).subscribe(mkd0.m154955G(new e30() { // from class: l.p8q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147626a.m49852f0(str, (String) obj);
            }
        }));
        w940 w940VarM156457g0 = this.f32360o.m156455e0().mo48978v0().m156457g0();
        guy guyVarM156457g0 = this.f32360o.m156455e0().mo48954A0().m156457g0();
        View viewInflateView = w940VarM156457g0.inflateView(((Act) getContext()).inflater(), guyVarM156457g0.m128210t0().getBarWrapper());
        if (guyVarM156457g0.m128210t0().getBarWrapper().indexOfChild(viewInflateView) < 0) {
            guyVarM156457g0.m128210t0().getBarWrapper().addView(viewInflateView);
            guyVarM156457g0.m128210t0().getBar_center_text().setEnabled(false);
        }
        w940VarM156457g0.m202234i(str.equals(this.f32353h.getText().toString()) ? "" : this.f32353h.getText().toString());
        this.f32360o.m120643D6();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ xaj0 m49855j0(Survey survey, Surveys surveys) {
        this.f32360o.m156455e0().mo48978v0().m187600h0().m178292c(survey.f20511id, surveys);
        return new xaj0(Boolean.FALSE, survey, surveys);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ C22306c m49856k0(final Survey survey) {
        if ("submitted".equals(survey.status)) {
            return C22306c.just(new xaj0(Boolean.TRUE, survey, null));
        }
        return this.f32360o.m156455e0().mo48978v0().m187600h0().m178290a(survey.f20511id) != null ? C22306c.just(new xaj0(Boolean.FALSE, survey, this.f32360o.m156455e0().mo48978v0().m187600h0().m178290a(survey.f20511id))) : CoreModule.f17545c.f19642f0.m33079pg(survey.f20511id).map(new w9j() { // from class: l.x8q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f191537a.m49855j0(survey, (Surveys) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m49857l0(Message message, xaj0 xaj0Var) {
        this.f32358m = ((Survey) xaj0Var.f191752b).submittedTips;
        if (((Boolean) xaj0Var.f191751a).booleanValue()) {
            m49861q0(message.value);
            return;
        }
        C c = xaj0Var.f191753c;
        if (c != 0) {
            this.f32354i = ((Survey) xaj0Var.f191752b).f20511id;
            m49841S((Surveys) c);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m49858m0(Throwable th) {
        th.toString();
        m49861q0("网络错误，该消息无法展示，请退出重试。");
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final void m49854h0(Options options, int i, q940 q940Var, VDraweeView vDraweeView, VText vText, j760<Integer, String> j760Var) {
        this.f32350e.setTextColor(-1);
        this.f32350e.setBackgroundResource(c3c0.f78850r4);
        if (q940Var.m173598a()) {
            boolean zEquals = j760Var.f116565b.equals(options.f20463id);
            if (zEquals && this.f32352g.m182695b(options.f20463id)) {
                return;
            }
            bkb0 bkb0Var = qib0.f154691G;
            OptionsIcon optionsIcon = options.icon;
            bkb0Var.m102331L0(vDraweeView, zEquals ? optionsIcon.selected : optionsIcon.nonSelected);
            s940 s940Var = this.f32352g;
            if (zEquals) {
                s940Var.m182700g(1, options.f20463id, options.text);
            } else {
                s940Var.m182701h(1, options.f20463id);
            }
            if (i == 1) {
                vText.setTextColor(zEquals ? -14540254 : 1275068416);
                return;
            }
            return;
        }
        if (j760Var.f116565b.equals(options.f20463id)) {
            boolean zM173599b = q940Var.m173599b(options.f20463id);
            s940 s940Var2 = this.f32352g;
            if (zM173599b) {
                s940Var2.m182701h(2, options.f20463id);
            } else {
                s940Var2.m182700g(2, options.f20463id, options.text);
            }
            bkb0 bkb0Var2 = qib0.f154691G;
            OptionsIcon optionsIcon2 = options.icon;
            bkb0Var2.m102331L0(vDraweeView, !zM173599b ? optionsIcon2.selected : optionsIcon2.nonSelected);
            if (options.requireInput) {
                xdl0.m208360X(m49844W(options.placeholder), t100.f167259h);
                int iIndexOfChild = this.f32349d.indexOfChild(m49844W(options.placeholder));
                LinearLayout linearLayout = this.f32349d;
                if (iIndexOfChild == -1) {
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), this.f32349d.getPaddingTop(), this.f32349d.getPaddingRight(), t100.f167260i);
                    this.f32349d.addView(m49844W(options.placeholder));
                } else {
                    linearLayout.removeView(m49844W(options.placeholder));
                    LinearLayout linearLayout2 = this.f32349d;
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.f32349d.getPaddingTop(), this.f32349d.getPaddingRight(), t100.f167262k);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f32359n.onNext(roj0.f160388a);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49839Q(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m49860p0(final Message message, fcz<?, ?> fczVar) {
        if (TextUtils.equals(this.f32356k, message.f56011id)) {
            return;
        }
        this.f32355j = null;
        this.f32360o = fczVar;
        this.f32356k = message.f56011id;
        this.f32357l = message.msgData;
        xdl0.m208344M(this.f32349d, false);
        C22306c.just(message).filter(new w9j() { // from class: l.i8q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Message message2 = (Message) obj;
                return Boolean.valueOf((message2 == null || TextUtils.isEmpty(message2.msgData)) ? false : true);
            }
        }).map(new w9j() { // from class: l.q8q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Survey.parse(((Message) obj).msgData);
            }
        }).filter(new w9j() { // from class: l.r8q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Survey) obj) != null);
            }
        }).flatMap(new w9j() { // from class: l.s8q
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163098a.m49856k0((Survey) obj);
            }
        }).takeUntil(this.f32359n).subscribe(mkd0.m154956H(new e30() { // from class: l.t8q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168942a.m49857l0(message, (xaj0) obj);
            }
        }, new e30() { // from class: l.u8q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175151a.m49858m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m49861q0(String str) {
        xdl0.m208344M(this.f32346a, false);
        xdl0.m208344M(this.f32351f, true);
        this.f32351f.setText(str);
    }

    public ItemMessageNewSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32359n = C22393b.m221521b();
    }

    public ItemMessageNewSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32359n = C22393b.m221521b();
    }
}
