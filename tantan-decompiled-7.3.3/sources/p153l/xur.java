package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class xur extends LiveMenuDialogHolder<avr> {

    /* JADX INFO: renamed from: k */
    public LinearLayout f196310k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f196311l;

    /* JADX INFO: renamed from: m */
    public TextView f196312m;

    /* JADX INFO: renamed from: n */
    public TextView f196313n;

    /* JADX INFO: renamed from: o */
    public TextView f196314o;

    /* JADX INFO: renamed from: p */
    public LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage f196315p;

    public xur(Act act, @NonNull avr avrVar) {
        super(yec0.f199055e, act, avrVar, qag0.m175926g());
        m73015B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m213187J(View view) {
        ((avr) this.f48605b).m100510T3(this.f196315p.getScheme());
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
    /* JADX INFO: renamed from: r */
    private void m213188r() {
        bnl0.m105509E0(this.f196314o, new View.OnClickListener() { // from class: l.wur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190881a.m213187J(view);
            }
        });
        this.f196312m.setText(this.f196315p.getTitle());
        this.f196313n.setText(this.f196315p.getSubTitle());
        if (jyb.m147479J(this.f196315p.getGiftsList())) {
            return;
        }
        int iM175859d = qa00.m175859d(84.0f);
        List<LongLinkAnchorGrowthMsg.AnchorGift> giftsList = this.f196315p.getGiftsList();
        int iMin = Math.min(giftsList.size(), 4);
        this.f196311l.removeAllViews();
        int[] iArr = new int[iMin];
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f196311l.getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(iM175859d, iM175859d);
        for (int i = 0; i < iMin; i++) {
            View viewInflate = layoutInflaterFrom.inflate(yec0.f199042d, (ViewGroup) null);
            int iM150161i = kkl0.m150161i();
            iArr[i] = iM150161i;
            viewInflate.setId(iM150161i);
            izs.m142868s("context_single_room", (SimpleDraweeView) viewInflate.findViewById(mdc0.f136180g2), giftsList.get(i).getImage());
            String day = giftsList.get(i).getDay();
            if (TextUtils.isEmpty(day)) {
                bnl0.m105524M(viewInflate.findViewById(mdc0.f136119a1), false);
            } else {
                bnl0.m105524M(viewInflate.findViewById(mdc0.f136119a1), true);
                ((TextView) viewInflate.findViewById(mdc0.f136119a1)).setText(day);
            }
            this.f196311l.addView(viewInflate, layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f196311l.getLayoutParams();
        layoutParams2.width = (iMin >= 2 ? 2 : 1) * iM175859d;
        layoutParams2.height = ((iMin / 2) + (iMin % 2)) * iM175859d;
        C0223a c0223a = new C0223a();
        if (iMin == 1) {
            c0223a.m1156j(iArr[0], iM175859d);
            c0223a.m1153g(iArr[0], iM175859d);
            c0223a.m1151e(iArr[0], 6, 0, 6);
            c0223a.m1151e(iArr[0], 7, 0, 7);
            c0223a.m1151e(iArr[0], 3, 0, 3);
            c0223a.m1151e(iArr[0], 4, 0, 4);
            c0223a.m1147a(this.f196311l);
            return;
        }
        if (iMin == 2) {
            c0223a.m1156j(iArr[0], iM175859d);
            c0223a.m1153g(iArr[0], iM175859d);
            c0223a.m1156j(iArr[1], iM175859d);
            c0223a.m1153g(iArr[1], iM175859d);
            c0223a.m1151e(iArr[0], 6, 0, 6);
            c0223a.m1151e(iArr[0], 3, 0, 3);
            c0223a.m1151e(iArr[0], 4, 0, 4);
            c0223a.m1151e(iArr[0], 7, iArr[1], 6);
            c0223a.m1151e(iArr[1], 7, 0, 7);
            c0223a.m1151e(iArr[1], 3, 0, 3);
            c0223a.m1151e(iArr[1], 4, 0, 4);
            c0223a.m1151e(iArr[1], 6, iArr[0], 7);
            c0223a.m1147a(this.f196311l);
            return;
        }
        if (iMin == 3) {
            c0223a.m1156j(iArr[0], iM175859d);
            c0223a.m1153g(iArr[0], iM175859d);
            c0223a.m1156j(iArr[1], iM175859d);
            c0223a.m1153g(iArr[1], iM175859d);
            c0223a.m1156j(iArr[2], iM175859d);
            c0223a.m1153g(iArr[2], iM175859d);
            int iM150161i2 = kkl0.m150161i();
            Guideline guideline = new Guideline(this.f196311l.getContext());
            guideline.setId(iM150161i2);
            ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-2, -2);
            c0221a.f1229S = 0;
            guideline.setLayoutParams(c0221a);
            guideline.setGuidelinePercent(0.5f);
            this.f196311l.addView(guideline);
            c0223a.m1151e(iArr[0], 6, 0, 6);
            c0223a.m1151e(iArr[0], 7, 0, 7);
            c0223a.m1151e(iArr[0], 3, 0, 3);
            c0223a.m1151e(iArr[0], 4, iM150161i2, 3);
            c0223a.m1151e(iArr[1], 6, 0, 6);
            c0223a.m1151e(iArr[1], 7, iArr[2], 6);
            c0223a.m1151e(iArr[1], 3, iM150161i2, 4);
            c0223a.m1151e(iArr[1], 4, 0, 4);
            c0223a.m1151e(iArr[2], 6, iArr[1], 7);
            c0223a.m1151e(iArr[2], 7, 0, 7);
            c0223a.m1151e(iArr[2], 3, iM150161i2, 4);
            c0223a.m1151e(iArr[2], 4, 0, 4);
            c0223a.m1147a(this.f196311l);
            return;
        }
        c0223a.m1156j(iArr[0], iM175859d);
        c0223a.m1153g(iArr[0], iM175859d);
        c0223a.m1156j(iArr[1], iM175859d);
        c0223a.m1153g(iArr[1], iM175859d);
        c0223a.m1156j(iArr[2], iM175859d);
        c0223a.m1153g(iArr[2], iM175859d);
        c0223a.m1156j(iArr[3], iM175859d);
        c0223a.m1153g(iArr[3], iM175859d);
        int iM150161i3 = kkl0.m150161i();
        Guideline guideline2 = new Guideline(this.f196311l.getContext());
        guideline2.setId(iM150161i3);
        ConstraintLayout.C0221a c0221a2 = new ConstraintLayout.C0221a(-2, -2);
        c0221a2.f1229S = 0;
        guideline2.setLayoutParams(c0221a2);
        guideline2.setGuidelinePercent(0.5f);
        this.f196311l.addView(guideline2);
        c0223a.m1151e(iArr[0], 6, 0, 6);
        c0223a.m1151e(iArr[0], 7, iArr[1], 6);
        c0223a.m1151e(iArr[0], 3, 0, 3);
        c0223a.m1151e(iArr[0], 4, iM150161i3, 3);
        c0223a.m1151e(iArr[1], 6, iArr[0], 7);
        c0223a.m1151e(iArr[1], 7, 0, 7);
        c0223a.m1151e(iArr[1], 3, 0, 3);
        c0223a.m1151e(iArr[1], 4, iM150161i3, 3);
        c0223a.m1151e(iArr[2], 6, 0, 6);
        c0223a.m1151e(iArr[2], 7, iArr[3], 6);
        c0223a.m1151e(iArr[2], 3, iM150161i3, 4);
        c0223a.m1151e(iArr[2], 4, 0, 4);
        c0223a.m1151e(iArr[3], 6, iArr[2], 7);
        c0223a.m1151e(iArr[3], 7, 0, 7);
        c0223a.m1151e(iArr[3], 3, iM150161i3, 4);
        c0223a.m1151e(iArr[3], 4, 0, 4);
        c0223a.m1147a(this.f196311l);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f196310k.getContext();
    }

    /* JADX INFO: renamed from: G */
    public final void m213189G(View view) {
        yur.m217470a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public View m213190H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yur.m217471b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public void m213192K(LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage) {
        this.f196315p = voiceAnchorGrowthMessage;
        m73017E();
        m213188r();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m213190H(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m213189G(view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(avr avrVar) {
    }
}
