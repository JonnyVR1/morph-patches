package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.share.IntlShareCardItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.g5c0;
import l.ho2;
import l.i3c0;
import l.kvc0;
import l.t100;
import l.t6c0;
import l.xdl0;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Ll/ebp;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/kbp;", "Lcom/p1/mobile/android/app/Act;", "act", "presenterIntl", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/kbp;)V", "Landroid/view/View;", "view", "", "K", "(Landroid/view/View;)V", "m", "I", "()V", "", "renderFamilyShareBtn", "M", "(Z)V", "L", "Ll/abp;", "intlShareCardItemInfoDataWrapper", "H", "(Ll/abp;)V", "J", "Lorg/apmem/tools/layouts/FlowLayout;", "k", "Lorg/apmem/tools/layouts/FlowLayout;", "flowLayout", "", "l", "realWidth", "realMarginEnd", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class ebp extends LiveMenuDialogHolder<kbp> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public FlowLayout flowLayout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int realWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int realMarginEnd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebp(@NotNull Act act, @NotNull kbp kbpVar) {
        super(t6c0.A2, act, kbpVar);
        act.getClass();
        kbpVar.getClass();
    }

    /* JADX INFO: renamed from: F */
    public static void m13796F(ebp ebpVar, abp abpVar, View view) {
        ebpVar.m13801J(abpVar);
    }

    /* JADX INFO: renamed from: G */
    public static void m13797G(ebp ebpVar, View view) {
        ebpVar.m13800I();
    }

    /* JADX INFO: renamed from: K */
    private final void m13798K(View view) {
        FlowLayout flowLayoutFindViewById = view.findViewById(g5c0.K1);
        flowLayoutFindViewById.getClass();
        this.flowLayout = flowLayoutFindViewById;
        xdl0.E0(view.findViewById(g5c0.M), new View.OnClickListener() { // from class: l.cbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ebp.m13797G(this.f10503a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m13799H(final abp intlShareCardItemInfoDataWrapper) {
        int iD;
        Act act = ((LiveMenuDialogHolder) this).e;
        act.getClass();
        IntlShareCardItemView intlShareCardItemView = new IntlShareCardItemView(act, null, 0, 6, null);
        ho2 ho2VarE2 = ((kbp) ((LiveMenuDialogHolder) this).b).E2();
        ho2VarE2.getClass();
        if (ho2VarE2.Z0()) {
            xdl0.C0(intlShareCardItemView.getShareImage(), t100.d(60.0f));
            xdl0.D0(t100.d(60.0f), new View[]{intlShareCardItemView.getShareName()});
            iD = t100.d(60.0f);
        } else {
            xdl0.C0(intlShareCardItemView.getShareImage(), t100.d(35.0f));
            xdl0.D0(t100.d(55.0f), new View[]{intlShareCardItemView.getShareName()});
            iD = t100.d(55.0f);
        }
        this.realWidth = iD;
        intlShareCardItemView.getShareImage().setImageResource(intlShareCardItemInfoDataWrapper.getImageRes());
        intlShareCardItemView.getShareName().setText(intlShareCardItemInfoDataWrapper.getCardName());
        intlShareCardItemView.setOrientation(1);
        xdl0.E0(intlShareCardItemView, new View.OnClickListener() { // from class: l.dbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebp.m13796F(this.f11717a, intlShareCardItemInfoDataWrapper, view);
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ViewGroup viewGroup = this.flowLayout;
        if (viewGroup == null) {
            Intrinsics.r("flowLayout");
            viewGroup = null;
        }
        viewGroup.addView(intlShareCardItemView, marginLayoutParams);
        if (intlShareCardItemInfoDataWrapper.getIsNeedMarginEnd()) {
            xdl0.W(intlShareCardItemView, this.realMarginEnd);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m13800I() {
        p();
    }

    /* JADX INFO: renamed from: J */
    public final void m13801J(abp intlShareCardItemInfoDataWrapper) {
        String shareType = intlShareCardItemInfoDataWrapper.getShareType();
        if (Intrinsics.d(shareType, "tt_friend")) {
            ((kbp) ((LiveMenuDialogHolder) this).b).m17439a4();
        } else if (Intrinsics.d(shareType, "tt_family")) {
            ((kbp) ((LiveMenuDialogHolder) this).b).m17438Z3();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m13802L(boolean renderFamilyShareBtn) {
        ViewGroup viewGroup = this.flowLayout;
        if (viewGroup == null) {
            Intrinsics.r("flowLayout");
            viewGroup = null;
        }
        viewGroup.removeAllViews();
        float fY0 = (xdl0.y0() - t100.d(40.0f)) / 33.0f;
        this.realWidth = (int) (5.0f * fY0);
        this.realMarginEnd = (int) (fY0 * 2.0f);
        ho2 ho2VarE2 = ((kbp) ((LiveMenuDialogHolder) this).b).E2();
        ho2VarE2.getClass();
        int i = ho2VarE2.Z0() ? i3c0.m3 : i3c0.g3;
        String strD = kvc0.d(R.string.wj);
        strD.getClass();
        m13799H(new abp("tt_friend", i, strD, true));
        if (renderFamilyShareBtn) {
            ho2 ho2VarE3 = ((kbp) ((LiveMenuDialogHolder) this).b).E2();
            ho2VarE3.getClass();
            int i2 = ho2VarE3.Z0() ? i3c0.l3 : i3c0.f3;
            String strD2 = kvc0.d(R.string.wc);
            strD2.getClass();
            m13799H(new abp("tt_family", i2, strD2, true));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m13803M(boolean renderFamilyShareBtn) {
        E();
        m13802L(renderFamilyShareBtn);
    }

    /* JADX INFO: renamed from: m */
    public void m13804m(@NotNull View view) {
        view.getClass();
        super.m(view);
        m13798K(view);
    }
}
