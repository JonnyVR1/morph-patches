package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Options;
import com.p1.mobile.putong.core.data.OptionsIcon;
import com.p1.mobile.putong.core.data.OptionsSecond;
import com.p1.mobile.putong.core.data.Questions;
import com.p1.mobile.putong.core.data.QuestionsSecond;
import com.p1.mobile.putong.core.data.Survey;
import com.p1.mobile.putong.core.data.Surveys;
import com.p1.mobile.putong.data.Meta;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.bkb0;
import l.c3c0;
import l.e30;
import l.fcz;
import l.guy;
import l.j760;
import l.mkd0;
import l.q940;
import l.qib0;
import l.roj0;
import l.s940;
import l.t100;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.z8q;
import l.zb2;
import p002l.w940;
import rx.c;
import rx.subjects.b;
import v.VDraweeView;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ItemMessageNewSurvey extends VFrame {

    /* JADX INFO: renamed from: a */
    public LinearLayout f168a;

    /* JADX INFO: renamed from: b */
    public VText f169b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f170c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f171d;

    /* JADX INFO: renamed from: e */
    public VText f172e;

    /* JADX INFO: renamed from: f */
    public VText f173f;

    /* JADX INFO: renamed from: g */
    public s940 f174g;

    /* JADX INFO: renamed from: h */
    public VText f175h;

    /* JADX INFO: renamed from: i */
    public String f176i;

    /* JADX INFO: renamed from: j */
    public List<OptionsSecond> f177j;

    /* JADX INFO: renamed from: k */
    public String f178k;

    /* JADX INFO: renamed from: l */
    public String f179l;

    /* JADX INFO: renamed from: m */
    public String f180m;

    /* JADX INFO: renamed from: n */
    public b<roj0> f181n;

    /* JADX INFO: renamed from: o */
    public fcz<?, ?> f182o;

    public ItemMessageNewSurvey(Context context) {
        super(context);
        this.f181n = b.b();
    }

    /* JADX INFO: renamed from: Q */
    public final void m261Q(View view) {
        z8q.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final void m262R() {
        if (this.f174g.f()) {
            return;
        }
        c.just(this.f174g.a()).flatMap(new w9j() { // from class: l.y8q
            public final Object call(Object obj) {
                return this.f22743a.m269Z((String) obj);
            }
        }).takeUntil(this.f181n).subscribe(mkd0.H(new e30() { // from class: l.j8q
            public final void call(Object obj) {
                this.f13639a.m270a0((Meta) obj);
            }
        }, new e30() { // from class: l.k8q
            public final void call(Object obj) {
                this.f14251a.m271b0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m263S(Surveys surveys) {
        if (vwb.J(surveys.questions)) {
            m283q0("网络错误，该消息无法展示，请退出重试。");
        }
        if (qib0.s.compareTo(surveys.requiredVersion.android) < 0) {
            m283q0("该消息无法识别， 请更新至最新版本。");
            return;
        }
        this.f172e.setTextColor(-4144960);
        this.f172e.setBackgroundResource(c3c0.s4);
        this.f170c.removeAllViews();
        xdl0.M(this.f168a, true);
        xdl0.M(this.f173f, false);
        this.f174g = new s940(surveys.id, ((Questions) surveys.questions.get(0)).id, this.f178k);
        this.f169b.setText(((Questions) surveys.questions.get(0)).title);
        q940 q940Var = new q940("multi_selection".equals(((Questions) surveys.questions.get(0)).type) ? Integer.MAX_VALUE : 1);
        List list = ((Questions) surveys.questions.get(0)).content.selection.options;
        final b<j760<Integer, String>> bVarB = b.b();
        int i = 0;
        while (i < list.size()) {
            final Options options = (Options) list.get(i);
            final ItemMessageNewSurvey itemMessageNewSurvey = this;
            LinearLayout linearLayoutM268Y = itemMessageNewSurvey.m268Y(options, t100.d(18.0f), 1, q940Var, bVarB);
            linearLayoutM268Y.setPadding(0, t100.k, 0, t100.h);
            linearLayoutM268Y.setOnClickListener(new View.OnClickListener() { // from class: l.v8q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21033a.m272c0(bVarB, options, view);
                }
            });
            itemMessageNewSurvey.f170c.addView(linearLayoutM268Y);
            if (i < list.size() - 1) {
                itemMessageNewSurvey.f170c.addView(itemMessageNewSurvey.m264T());
            }
            i++;
            this = itemMessageNewSurvey;
        }
        final ItemMessageNewSurvey itemMessageNewSurvey2 = this;
        xdl0.E0(itemMessageNewSurvey2.f172e, new View.OnClickListener() { // from class: l.w8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21560a.m273e0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final View m264T() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX INFO: renamed from: V */
    public final void m265V(QuestionsSecond questionsSecond) {
        this.f174g.j(questionsSecond.id);
        List<OptionsSecond> list = questionsSecond.content.selection.options;
        List<OptionsSecond> list2 = this.f177j;
        if (list2 == null || list2 != list || this.f171d.getChildCount() == 0) {
            this.f177j = list;
            this.f171d.removeAllViews();
            this.f171d.addView(m267X(questionsSecond.title));
            q940 q940Var = new q940("multi_selection".equals(questionsSecond.type) ? Integer.MAX_VALUE : 1);
            final b<j760<Integer, String>> bVarB = b.b();
            int i = 0;
            while (i < list.size()) {
                final OptionsSecond optionsSecond = list.get(i);
                ItemMessageNewSurvey itemMessageNewSurvey = this;
                LinearLayout linearLayoutM268Y = itemMessageNewSurvey.m268Y(optionsSecond.mapToOptions(), t100.d(18.0f), 2, q940Var, bVarB);
                linearLayoutM268Y.setPadding(0, t100.j, 0, 0);
                linearLayoutM268Y.setOnClickListener(new View.OnClickListener() { // from class: l.n8q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bVarB.onNext(vwb.Y(2, optionsSecond.id));
                    }
                });
                itemMessageNewSurvey.f171d.addView(linearLayoutM268Y);
                i++;
                this = itemMessageNewSurvey;
            }
        }
        xdl0.M(this.f171d, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final VText m266W(final String str) {
        if (this.f175h == null) {
            this.f175h = new VText(getContext());
            this.f175h.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            VText vText = this.f175h;
            int i = t100.h;
            int i2 = t100.g;
            vText.setPadding(i, i2, i, i2);
            this.f175h.setBackground(zb2.b("#ededed", 4));
            this.f175h.setText(str);
            this.f175h.setTextColor(855638016);
            xdl0.E0(this.f175h, new View.OnClickListener() { // from class: l.o8q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16437a.m275g0(str, view);
                }
            });
        }
        return this.f175h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final VText m267X(String str) {
        VText vText = new VText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = t100.j;
        vText.setLayoutParams(layoutParams);
        vText.setTextColor(-14540254);
        vText.setText(str);
        return vText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public final LinearLayout m268Y(final Options options, int i, final int i2, final q940 q940Var, b<j760<Integer, String>> bVar) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i2 == 1 ? 17 : 3;
        linearLayout.setLayoutParams(layoutParams);
        final View vDraweeView = new VDraweeView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.rightMargin = t100.f;
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
        qib0.G.L0(vDraweeView, options.icon.nonSelected);
        bVar.filter(new w9j() { // from class: l.l8q
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf((j760Var == null || ((Integer) j760Var.a).intValue() != i2 || TextUtils.isEmpty((CharSequence) j760Var.b)) ? false : true);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.m8q
            public final void call(Object obj) {
                this.f15280a.m276h0(options, i2, q940Var, vDraweeView, vText, (j760) obj);
            }
        }));
        return linearLayout;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ c m269Z(String str) {
        return CoreModule.c.f0.ne(this.f176i, str);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m270a0(Meta meta) {
        int i;
        if (meta != null && (i = meta.code) > 199 && i < 300) {
            this.f182o.J2(this.f176i, this.f180m);
        }
        m283q0(this.f180m);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m271b0(Throwable th) {
        m283q0("网络错误，该消息无法展示，请退出重试。");
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m272c0(b bVar, Options options, View view) {
        bVar.onNext(vwb.Y(1, options.id));
        List list = options.questions;
        if (list == null || list.isEmpty()) {
            xdl0.M(this.f171d, false);
        } else {
            m265V((QuestionsSecond) options.questions.get(0));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m273e0(View view) {
        m262R();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m274f0(String str, String str2) {
        VText vText = this.f175h;
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        vText.setText(str);
        this.f175h.setTextColor(TextUtils.isEmpty(str2) ? 855638016 : -14540254);
        this.f174g.i(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m275g0(final String str, View view) {
        this.f182o.e0().v0().m22815i0().takeUntil(this.f181n).subscribe(mkd0.G(new e30() { // from class: l.p8q
            public final void call(Object obj) {
                this.f17063a.m274f0(str, (String) obj);
            }
        }));
        w940 w940Var = (w940) this.f182o.e0().v0().g0();
        guy guyVarG0 = this.f182o.e0().A0().g0();
        View viewInflateView = w940Var.inflateView(getContext().inflater(), guyVarG0.t0().getBarWrapper());
        if (guyVarG0.t0().getBarWrapper().indexOfChild(viewInflateView) < 0) {
            guyVarG0.t0().getBarWrapper().addView(viewInflateView);
            guyVarG0.t0().getBar_center_text().setEnabled(false);
        }
        w940Var.m24436i(str.equals(this.f175h.getText().toString()) ? "" : this.f175h.getText().toString());
        this.f182o.D6();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ xaj0 m277j0(Survey survey, Surveys surveys) {
        this.f182o.e0().v0().m22814h0().c(survey.id, surveys);
        return new xaj0(Boolean.FALSE, survey, surveys);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ c m278k0(final Survey survey) {
        if ("submitted".equals(survey.status)) {
            return c.just(new xaj0(Boolean.TRUE, survey, (Object) null));
        }
        return this.f182o.e0().v0().m22814h0().a(survey.id) != null ? c.just(new xaj0(Boolean.FALSE, survey, this.f182o.e0().v0().m22814h0().a(survey.id))) : CoreModule.c.f0.pg(survey.id).map(new w9j() { // from class: l.x8q
            public final Object call(Object obj) {
                return this.f22169a.m277j0(survey, (Surveys) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m279l0(Message message, xaj0 xaj0Var) {
        this.f180m = ((Survey) xaj0Var.b).submittedTips;
        if (((Boolean) xaj0Var.a).booleanValue()) {
            m283q0(message.value);
            return;
        }
        Object obj = xaj0Var.c;
        if (obj != null) {
            this.f176i = ((Survey) xaj0Var.b).id;
            m263S((Surveys) obj);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m280m0(Throwable th) {
        th.toString();
        m283q0("网络错误，该消息无法展示，请退出重试。");
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final void m276h0(Options options, int i, q940 q940Var, VDraweeView vDraweeView, VText vText, j760<Integer, String> j760Var) {
        this.f172e.setTextColor(-1);
        this.f172e.setBackgroundResource(c3c0.r4);
        if (q940Var.a()) {
            boolean zEquals = ((String) j760Var.b).equals(options.id);
            if (zEquals && this.f174g.b(options.id)) {
                return;
            }
            bkb0 bkb0Var = qib0.G;
            OptionsIcon optionsIcon = options.icon;
            bkb0Var.L0(vDraweeView, zEquals ? optionsIcon.selected : optionsIcon.nonSelected);
            s940 s940Var = this.f174g;
            if (zEquals) {
                s940Var.g(1, options.id, options.text);
            } else {
                s940Var.h(1, options.id);
            }
            if (i == 1) {
                vText.setTextColor(zEquals ? -14540254 : 1275068416);
                return;
            }
            return;
        }
        if (((String) j760Var.b).equals(options.id)) {
            boolean zB = q940Var.b(options.id);
            s940 s940Var2 = this.f174g;
            if (zB) {
                s940Var2.h(2, options.id);
            } else {
                s940Var2.g(2, options.id, options.text);
            }
            bkb0 bkb0Var2 = qib0.G;
            OptionsIcon optionsIcon2 = options.icon;
            bkb0Var2.L0(vDraweeView, !zB ? optionsIcon2.selected : optionsIcon2.nonSelected);
            if (options.requireInput) {
                xdl0.X(m266W(options.placeholder), t100.h);
                int iIndexOfChild = this.f171d.indexOfChild(m266W(options.placeholder));
                LinearLayout linearLayout = this.f171d;
                if (iIndexOfChild == -1) {
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), this.f171d.getPaddingTop(), this.f171d.getPaddingRight(), t100.i);
                    this.f171d.addView(m266W(options.placeholder));
                } else {
                    linearLayout.removeView(m266W(options.placeholder));
                    LinearLayout linearLayout2 = this.f171d;
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.f171d.getPaddingTop(), this.f171d.getPaddingRight(), t100.k);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        this.f181n.onNext(roj0.a);
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m261Q(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m282p0(final Message message, fcz<?, ?> fczVar) {
        if (TextUtils.equals(this.f178k, ((DbObject) message).id)) {
            return;
        }
        this.f177j = null;
        this.f182o = fczVar;
        this.f178k = ((DbObject) message).id;
        this.f179l = message.msgData;
        xdl0.M(this.f171d, false);
        c.just(message).filter(new w9j() { // from class: l.i8q
            public final Object call(Object obj) {
                Message message2 = (Message) obj;
                return Boolean.valueOf((message2 == null || TextUtils.isEmpty(message2.msgData)) ? false : true);
            }
        }).map(new w9j() { // from class: l.q8q
            public final Object call(Object obj) {
                return Survey.parse(((Message) obj).msgData);
            }
        }).filter(new w9j() { // from class: l.r8q
            public final Object call(Object obj) {
                return Boolean.valueOf(((Survey) obj) != null);
            }
        }).flatMap(new w9j() { // from class: l.s8q
            public final Object call(Object obj) {
                return this.f18838a.m278k0((Survey) obj);
            }
        }).takeUntil(this.f181n).subscribe(mkd0.H(new e30() { // from class: l.t8q
            public final void call(Object obj) {
                this.f20128a.m279l0(message, (xaj0) obj);
            }
        }, new e30() { // from class: l.u8q
            public final void call(Object obj) {
                this.f20539a.m280m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m283q0(String str) {
        xdl0.M(this.f168a, false);
        xdl0.M(this.f173f, true);
        this.f173f.setText(str);
    }

    public ItemMessageNewSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f181n = b.b();
    }

    public ItemMessageNewSurvey(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f181n = b.b();
    }
}
