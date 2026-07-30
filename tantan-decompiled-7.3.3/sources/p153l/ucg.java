package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p151v.VDraweeView;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class ucg extends LiveMenuDialogHolder<ycg> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f178425k;

    /* JADX INFO: renamed from: l */
    public View f178426l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f178427m;

    /* JADX INFO: renamed from: n */
    public TextView f178428n;

    /* JADX INFO: renamed from: o */
    public TextView f178429o;

    /* JADX INFO: renamed from: p */
    public TextView f178430p;

    /* JADX INFO: renamed from: q */
    public VProgressBar f178431q;

    /* JADX INFO: renamed from: r */
    public TextView f178432r;

    public ucg(Act act, ycg ycgVar) {
        super(yec0.f199228r3, act, ycgVar);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m195391I(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m195392L(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m195393M(View view) {
        mo73021p();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        ConstraintLayout constraintLayout = this.f178425k;
        if (constraintLayout == null) {
            return null;
        }
        return constraintLayout.getContext();
    }

    /* JADX INFO: renamed from: J */
    public final void m195394J(View view) {
        vcg.m200807a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m195396N(View view) {
        ((ycg) this.f48605b).m215151m4();
        mo73021p();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [l.oo2] */
    /* JADX INFO: renamed from: O */
    public void m195397O(boolean z, BLiveAccommpanyTasks bLiveAccommpanyTasks) {
        String localName;
        this.f178425k.setBackgroundColor(z ? -1929379840 : 16777215);
        bnl0.m105524M(this.f178431q, false);
        bnl0.m105524M(this.f178430p, true);
        bnl0.m105509E0(this.f178430p, new View.OnClickListener() { // from class: l.tcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173232a.m195396N(view);
            }
        });
        izs.m142868s("context_single_room", this.f178427m, bLiveAccommpanyTasks.rule.giftIcon);
        try {
            localName = LangModel.JSON_ADAPTER.parse(bLiveAccommpanyTasks.rule.giftName).getLocalName();
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            localName = "";
        }
        TextView textView = this.f178428n;
        textView.setText(String.format(textView.getContext().getString(R$string.f48229m4), localName));
        if (((ycg) this.f48605b).m213810E2().m168546r0() == null || !((ycg) this.f48605b).m213810E2().m168546r0().m199847c(uqb0.f180396b0.f170324a.userId())) {
            TextView textView2 = this.f178429o;
            textView2.setText(String.format(textView2.getContext().getString(R$string.f48207l4), Integer.valueOf(bLiveAccommpanyTasks.rule.giftAmount), localName));
        } else {
            TextView textView3 = this.f178429o;
            textView3.setText(String.format(textView3.getContext().getString(R$string.f48185k4), Integer.valueOf(bLiveAccommpanyTasks.rule.giftAmount), localName));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m195394J(view);
        m73014A(17);
        bnl0.m105509E0(this.f178432r, new View.OnClickListener() { // from class: l.qcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f156598a.m195392L(view2);
            }
        });
        bnl0.m105509E0(this.f178426l, new View.OnClickListener() { // from class: l.rcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ucg.m195391I(view2);
            }
        });
        bnl0.m105509E0(this.f178425k, new View.OnClickListener() { // from class: l.scg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f167251a.m195393M(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ycg ycgVar) {
    }
}
