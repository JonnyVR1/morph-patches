package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasks;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import p147v.VDraweeView;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class gbg extends LiveMenuDialogHolder<kbg> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f101845k;

    /* JADX INFO: renamed from: l */
    public View f101846l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f101847m;

    /* JADX INFO: renamed from: n */
    public TextView f101848n;

    /* JADX INFO: renamed from: o */
    public TextView f101849o;

    /* JADX INFO: renamed from: p */
    public TextView f101850p;

    /* JADX INFO: renamed from: q */
    public VProgressBar f101851q;

    /* JADX INFO: renamed from: r */
    public TextView f101852r;

    public gbg(Act act, kbg kbgVar) {
        super(t6c0.f168496r3, act, kbgVar);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m125135I(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m125136L(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m125137M(View view) {
        mo71838p();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        ConstraintLayout constraintLayout = this.f101845k;
        if (constraintLayout == null) {
            return null;
        }
        return constraintLayout.getContext();
    }

    /* JADX INFO: renamed from: J */
    public final void m125138J(View view) {
        hbg.m130329a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m125140N(View view) {
        ((kbg) this.f47757b).m145300m4();
        mo71838p();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [l.ho2] */
    /* JADX INFO: renamed from: O */
    public void m125141O(boolean z, BLiveAccommpanyTasks bLiveAccommpanyTasks) {
        String localName;
        this.f101845k.setBackgroundColor(z ? -1929379840 : 16777215);
        xdl0.m208344M(this.f101851q, false);
        xdl0.m208344M(this.f101850p, true);
        xdl0.m208329E0(this.f101850p, new View.OnClickListener() { // from class: l.fbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96712a.m125140N(view);
            }
        });
        hxs.m133406s("context_single_room", this.f101847m, bLiveAccommpanyTasks.rule.giftIcon);
        try {
            localName = LangModel.JSON_ADAPTER.parse(bLiveAccommpanyTasks.rule.giftName).getLocalName();
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            localName = "";
        }
        TextView textView = this.f101848n;
        textView.setText(String.format(textView.getContext().getString(R$string.f47381m4), localName));
        if (((kbg) this.f47757b).m206027E2().m132161r0() == null || !((kbg) this.f47757b).m206027E2().m132161r0().m129238c(qib0.f154713b0.f139230a.userId())) {
            TextView textView2 = this.f101849o;
            textView2.setText(String.format(textView2.getContext().getString(R$string.f47359l4), Integer.valueOf(bLiveAccommpanyTasks.rule.giftAmount), localName));
        } else {
            TextView textView3 = this.f101849o;
            textView3.setText(String.format(textView3.getContext().getString(R$string.f47337k4), Integer.valueOf(bLiveAccommpanyTasks.rule.giftAmount), localName));
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m125138J(view);
        m71831A(17);
        xdl0.m208329E0(this.f101852r, new View.OnClickListener() { // from class: l.cbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80138a.m125136L(view2);
            }
        });
        xdl0.m208329E0(this.f101846l, new View.OnClickListener() { // from class: l.dbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gbg.m125135I(view2);
            }
        });
        xdl0.m208329E0(this.f101845k, new View.OnClickListener() { // from class: l.ebg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f90326a.m125137M(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kbg kbgVar) {
    }
}
