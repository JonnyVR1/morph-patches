package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class wsr extends LiveMenuDialogHolder<zsr> {

    /* JADX INFO: renamed from: k */
    public LinearLayout f187959k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f187960l;

    /* JADX INFO: renamed from: m */
    public TextView f187961m;

    /* JADX INFO: renamed from: n */
    public TextView f187962n;

    /* JADX INFO: renamed from: o */
    public TextView f187963o;

    /* JADX INFO: renamed from: p */
    public LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage f187964p;

    public wsr(Act act, @NonNull zsr zsrVar) {
        super(t6c0.f168323e, act, zsrVar, j2g0.m139460g());
        m71832B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m205524J(View view) {
        ((zsr) this.f47757b).m220077T3(this.f187964p.getScheme());
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
    private void m205525r() {
        xdl0.m208329E0(this.f187963o, new View.OnClickListener() { // from class: l.vsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182882a.m205524J(view);
            }
        });
        this.f187961m.setText(this.f187964p.getTitle());
        this.f187962n.setText(this.f187964p.getSubTitle());
        if (vwb.m200296J(this.f187964p.getGiftsList())) {
            return;
        }
        int iM186890d = t100.m186890d(84.0f);
        List<LongLinkAnchorGrowthMsg.AnchorGift> giftsList = this.f187964p.getGiftsList();
        int iMin = Math.min(giftsList.size(), 4);
        this.f187960l.removeAllViews();
        int[] iArr = new int[iMin];
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f187960l.getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(iM186890d, iM186890d);
        for (int i = 0; i < iMin; i++) {
            View viewInflate = layoutInflaterFrom.inflate(t6c0.f168310d, (ViewGroup) null);
            int iM125198i = gbl0.m125198i();
            iArr[i] = iM125198i;
            viewInflate.setId(iM125198i);
            hxs.m133406s("context_single_room", (SimpleDraweeView) viewInflate.findViewById(g5c0.f100935g2), giftsList.get(i).getImage());
            String day = giftsList.get(i).getDay();
            if (TextUtils.isEmpty(day)) {
                xdl0.m208344M(viewInflate.findViewById(g5c0.f100874a1), false);
            } else {
                xdl0.m208344M(viewInflate.findViewById(g5c0.f100874a1), true);
                ((TextView) viewInflate.findViewById(g5c0.f100874a1)).setText(day);
            }
            this.f187960l.addView(viewInflate, layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f187960l.getLayoutParams();
        layoutParams2.width = (iMin >= 2 ? 2 : 1) * iM186890d;
        layoutParams2.height = ((iMin / 2) + (iMin % 2)) * iM186890d;
        C0222a c0222a = new C0222a();
        if (iMin == 1) {
            c0222a.m1155j(iArr[0], iM186890d);
            c0222a.m1152g(iArr[0], iM186890d);
            c0222a.m1150e(iArr[0], 6, 0, 6);
            c0222a.m1150e(iArr[0], 7, 0, 7);
            c0222a.m1150e(iArr[0], 3, 0, 3);
            c0222a.m1150e(iArr[0], 4, 0, 4);
            c0222a.m1146a(this.f187960l);
            return;
        }
        if (iMin == 2) {
            c0222a.m1155j(iArr[0], iM186890d);
            c0222a.m1152g(iArr[0], iM186890d);
            c0222a.m1155j(iArr[1], iM186890d);
            c0222a.m1152g(iArr[1], iM186890d);
            c0222a.m1150e(iArr[0], 6, 0, 6);
            c0222a.m1150e(iArr[0], 3, 0, 3);
            c0222a.m1150e(iArr[0], 4, 0, 4);
            c0222a.m1150e(iArr[0], 7, iArr[1], 6);
            c0222a.m1150e(iArr[1], 7, 0, 7);
            c0222a.m1150e(iArr[1], 3, 0, 3);
            c0222a.m1150e(iArr[1], 4, 0, 4);
            c0222a.m1150e(iArr[1], 6, iArr[0], 7);
            c0222a.m1146a(this.f187960l);
            return;
        }
        if (iMin == 3) {
            c0222a.m1155j(iArr[0], iM186890d);
            c0222a.m1152g(iArr[0], iM186890d);
            c0222a.m1155j(iArr[1], iM186890d);
            c0222a.m1152g(iArr[1], iM186890d);
            c0222a.m1155j(iArr[2], iM186890d);
            c0222a.m1152g(iArr[2], iM186890d);
            int iM125198i2 = gbl0.m125198i();
            Guideline guideline = new Guideline(this.f187960l.getContext());
            guideline.setId(iM125198i2);
            ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(-2, -2);
            c0220a.f1229S = 0;
            guideline.setLayoutParams(c0220a);
            guideline.setGuidelinePercent(0.5f);
            this.f187960l.addView(guideline);
            c0222a.m1150e(iArr[0], 6, 0, 6);
            c0222a.m1150e(iArr[0], 7, 0, 7);
            c0222a.m1150e(iArr[0], 3, 0, 3);
            c0222a.m1150e(iArr[0], 4, iM125198i2, 3);
            c0222a.m1150e(iArr[1], 6, 0, 6);
            c0222a.m1150e(iArr[1], 7, iArr[2], 6);
            c0222a.m1150e(iArr[1], 3, iM125198i2, 4);
            c0222a.m1150e(iArr[1], 4, 0, 4);
            c0222a.m1150e(iArr[2], 6, iArr[1], 7);
            c0222a.m1150e(iArr[2], 7, 0, 7);
            c0222a.m1150e(iArr[2], 3, iM125198i2, 4);
            c0222a.m1150e(iArr[2], 4, 0, 4);
            c0222a.m1146a(this.f187960l);
            return;
        }
        c0222a.m1155j(iArr[0], iM186890d);
        c0222a.m1152g(iArr[0], iM186890d);
        c0222a.m1155j(iArr[1], iM186890d);
        c0222a.m1152g(iArr[1], iM186890d);
        c0222a.m1155j(iArr[2], iM186890d);
        c0222a.m1152g(iArr[2], iM186890d);
        c0222a.m1155j(iArr[3], iM186890d);
        c0222a.m1152g(iArr[3], iM186890d);
        int iM125198i3 = gbl0.m125198i();
        Guideline guideline2 = new Guideline(this.f187960l.getContext());
        guideline2.setId(iM125198i3);
        ConstraintLayout.C0220a c0220a2 = new ConstraintLayout.C0220a(-2, -2);
        c0220a2.f1229S = 0;
        guideline2.setLayoutParams(c0220a2);
        guideline2.setGuidelinePercent(0.5f);
        this.f187960l.addView(guideline2);
        c0222a.m1150e(iArr[0], 6, 0, 6);
        c0222a.m1150e(iArr[0], 7, iArr[1], 6);
        c0222a.m1150e(iArr[0], 3, 0, 3);
        c0222a.m1150e(iArr[0], 4, iM125198i3, 3);
        c0222a.m1150e(iArr[1], 6, iArr[0], 7);
        c0222a.m1150e(iArr[1], 7, 0, 7);
        c0222a.m1150e(iArr[1], 3, 0, 3);
        c0222a.m1150e(iArr[1], 4, iM125198i3, 3);
        c0222a.m1150e(iArr[2], 6, 0, 6);
        c0222a.m1150e(iArr[2], 7, iArr[3], 6);
        c0222a.m1150e(iArr[2], 3, iM125198i3, 4);
        c0222a.m1150e(iArr[2], 4, 0, 4);
        c0222a.m1150e(iArr[3], 6, iArr[2], 7);
        c0222a.m1150e(iArr[3], 7, 0, 7);
        c0222a.m1150e(iArr[3], 3, iM125198i3, 4);
        c0222a.m1150e(iArr[3], 4, 0, 4);
        c0222a.m1146a(this.f187960l);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f187959k.getContext();
    }

    /* JADX INFO: renamed from: G */
    public final void m205526G(View view) {
        xsr.m210832a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public View m205527H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xsr.m210833b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public void m205529K(LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage) {
        this.f187964p = voiceAnchorGrowthMessage;
        m71834E();
        m205525r();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m205527H(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m205526G(view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zsr zsrVar) {
    }
}
