package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.JoinCondition;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class nnk implements iam<jnk> {

    /* JADX INFO: renamed from: a */
    public VLinear f142801a;

    /* JADX INFO: renamed from: b */
    public VFrame f142802b;

    /* JADX INFO: renamed from: c */
    public VFrame f142803c;

    /* JADX INFO: renamed from: d */
    public VText f142804d;

    /* JADX INFO: renamed from: e */
    public VFrame f142805e;

    /* JADX INFO: renamed from: f */
    public Act f142806f;

    /* JADX INFO: renamed from: g */
    public jnk f142807g;

    /* JADX INFO: renamed from: l.nnk$a */
    public static class C18905a {
        /* JADX INFO: renamed from: b */
        public static void m163889b(nnk nnkVar, View view) {
            nnkVar.f142801a = (VLinear) view;
            ViewGroup viewGroup = (ViewGroup) view;
            nnkVar.f142802b = (VFrame) viewGroup.getChildAt(0);
            nnkVar.f142803c = (VFrame) viewGroup.getChildAt(1);
            nnkVar.f142804d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            nnkVar.f142805e = (VFrame) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m163890c(nnk nnkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157163z0, viewGroup, false);
            m163889b(nnkVar, viewInflate);
            return viewInflate;
        }
    }

    public nnk(Act act) {
        this.f142806f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m163882n(View view) {
        this.f142807g.m146260r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m163883q(View view) {
        this.f142807g.m146254l0();
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f142806f;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m163884k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m163884k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18905a.m163890c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(jnk jnkVar) {
        this.f142807g = jnkVar;
    }

    /* JADX INFO: renamed from: m */
    public void m163886m(final ChatGroup chatGroup) {
        bnl0.m105509E0(this.f142802b, new View.OnClickListener() { // from class: l.knk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127608a.m163882n(view);
            }
        });
        bnl0.m105509E0(this.f142803c, new View.OnClickListener() { // from class: l.lnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132827a.m163887p(chatGroup, view);
            }
        });
        bnl0.m105509E0(this.f142805e, new View.OnClickListener() { // from class: l.mnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137710a.m163883q(view);
            }
        });
        bnl0.m105524M(this.f142805e, false);
        if (TEnum.equals(chatGroup.joinCondition, JoinCondition.noApplyRequired)) {
            this.f142804d.setText(R$string.f21867y0);
        } else if (TEnum.equals(chatGroup.joinCondition, JoinCondition.applyRequired)) {
            this.f142804d.setText(R$string.f21875z0);
        }
        bnl0.m105524M(this.f142803c, chatGroup.permissions.canChangeJoinCondition);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m163887p(ChatGroup chatGroup, View view) {
        this.f142807g.m146255m0(chatGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
