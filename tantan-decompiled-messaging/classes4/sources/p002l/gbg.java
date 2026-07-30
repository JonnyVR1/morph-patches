package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.LangModel;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.hxs;
import l.qib0;
import l.xdl0;
import v.VDraweeView;
import v.VProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gbg extends LiveMenuDialogHolder<kbg> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f11347k;

    /* JADX INFO: renamed from: l */
    public View f11348l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f11349m;

    /* JADX INFO: renamed from: n */
    public TextView f11350n;

    /* JADX INFO: renamed from: o */
    public TextView f11351o;

    /* JADX INFO: renamed from: p */
    public TextView f11352p;

    /* JADX INFO: renamed from: q */
    public VProgressBar f11353q;

    /* JADX INFO: renamed from: r */
    public TextView f11354r;

    public gbg(Act act, kbg kbgVar) {
        super(t6c0.f19992r3, act, kbgVar);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m13707I(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m13708L(View view) {
        mo5216p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m13709M(View view) {
        mo5216p();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        ConstraintLayout constraintLayout = this.f11347k;
        if (constraintLayout == null) {
            return null;
        }
        return constraintLayout.getContext();
    }

    /* JADX INFO: renamed from: J */
    public final void m13710J(View view) {
        hbg.m14305a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m13712N(View view) {
        ((kbg) this.f3799b).m16593m4();
        mo5216p();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [l.ho2] */
    /* JADX INFO: renamed from: O */
    public void m13713O(boolean z, BLiveAccommpanyTasks bLiveAccommpanyTasks) {
        String localName;
        this.f11347k.setBackgroundColor(z ? -1929379840 : 16777215);
        xdl0.M(this.f11353q, false);
        xdl0.M(this.f11352p, true);
        xdl0.E0(this.f11352p, new View.OnClickListener() { // from class: l.fbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10224a.m13712N(view);
            }
        });
        hxs.s("context_single_room", this.f11349m, bLiveAccommpanyTasks.rule.giftIcon);
        try {
            localName = ((LangModel) LangModel.JSON_ADAPTER.parse(bLiveAccommpanyTasks.rule.giftName)).getLocalName();
        } catch (IOException e) {
            CrashHelper.c(e);
            localName = "";
        }
        TextView textView = this.f11350n;
        textView.setText(String.format(textView.getContext().getString(R$string.f3423m4), localName));
        if (((kbg) this.f3799b).m25547E2().m14597r0() == null || !((kbg) this.f3799b).m25547E2().m14597r0().c(qib0.b0.a.userId())) {
            TextView textView2 = this.f11351o;
            textView2.setText(String.format(textView2.getContext().getString(R$string.f3401l4), Integer.valueOf(bLiveAccommpanyTasks.rule.giftAmount), localName));
        } else {
            TextView textView3 = this.f11351o;
            textView3.setText(String.format(textView3.getContext().getString(R$string.f3379k4), Integer.valueOf(bLiveAccommpanyTasks.rule.giftAmount), localName));
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        super.destroy();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        m13710J(view);
        m5207A(17);
        xdl0.E0(this.f11354r, new View.OnClickListener() { // from class: l.cbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8581a.m13708L(view2);
            }
        });
        xdl0.E0(this.f11348l, new View.OnClickListener() { // from class: l.dbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gbg.m13707I(view2);
            }
        });
        xdl0.E0(this.f11347k, new View.OnClickListener() { // from class: l.ebg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9661a.m13709M(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(kbg kbgVar) {
    }
}
