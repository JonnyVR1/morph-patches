package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.share.IntlShareCardItemView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\""}, m87232d2 = {"Ll/ebp;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/kbp;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenterIntl", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/kbp;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "K", "(Landroid/view/View;)V", "m", "I", "()V", "", "renderFamilyShareBtn", "M", "(Z)V", "L", "Ll/abp;", "intlShareCardItemInfoDataWrapper", "H", "(Ll/abp;)V", "J", "Lorg/apmem/tools/layouts/FlowLayout;", "k", "Lorg/apmem/tools/layouts/FlowLayout;", "flowLayout", "", BLiveStormDanmakuGiftResourceType.f44444l, "realWidth", "realMarginEnd", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        super(t6c0.f167962A2, act, kbpVar);
        act.getClass();
        kbpVar.getClass();
    }

    /* JADX INFO: renamed from: F */
    public static void m115516F(ebp ebpVar, abp abpVar, View view) {
        ebpVar.m115521J(abpVar);
    }

    /* JADX INFO: renamed from: G */
    public static void m115517G(ebp ebpVar, View view) {
        ebpVar.m115520I();
    }

    /* JADX INFO: renamed from: K */
    private final void m115518K(View view) {
        View viewFindViewById = view.findViewById(g5c0.f100730K1);
        viewFindViewById.getClass();
        this.flowLayout = (FlowLayout) viewFindViewById;
        xdl0.m208329E0(view.findViewById(g5c0.f100746M), new View.OnClickListener() { // from class: l.cbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ebp.m115517G(this.f80175a, view2);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l.ho2] */
    /* JADX INFO: renamed from: H */
    public final void m115519H(final abp intlShareCardItemInfoDataWrapper) {
        int iM186890d;
        Act act = this.f47760e;
        act.getClass();
        IntlShareCardItemView intlShareCardItemView = new IntlShareCardItemView(act, null, 0, 6, null);
        ?? M206027E2 = ((kbp) this.f47757b).m206027E2();
        M206027E2.getClass();
        if (M206027E2.m132112Z0()) {
            xdl0.m208325C0(intlShareCardItemView.getShareImage(), t100.m186890d(60.0f));
            xdl0.m208327D0(t100.m186890d(60.0f), intlShareCardItemView.getShareName());
            iM186890d = t100.m186890d(60.0f);
        } else {
            xdl0.m208325C0(intlShareCardItemView.getShareImage(), t100.m186890d(35.0f));
            xdl0.m208327D0(t100.m186890d(55.0f), intlShareCardItemView.getShareName());
            iM186890d = t100.m186890d(55.0f);
        }
        this.realWidth = iM186890d;
        intlShareCardItemView.getShareImage().setImageResource(intlShareCardItemInfoDataWrapper.getImageRes());
        intlShareCardItemView.getShareName().setText(intlShareCardItemInfoDataWrapper.getCardName());
        intlShareCardItemView.setOrientation(1);
        xdl0.m208329E0(intlShareCardItemView, new View.OnClickListener() { // from class: l.dbp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebp.m115516F(this.f85332a, intlShareCardItemInfoDataWrapper, view);
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        FlowLayout flowLayout = this.flowLayout;
        if (flowLayout == null) {
            Intrinsics.m87502r("flowLayout");
            flowLayout = null;
        }
        flowLayout.addView(intlShareCardItemView, marginLayoutParams);
        if (intlShareCardItemInfoDataWrapper.getIsNeedMarginEnd()) {
            xdl0.m208359W(intlShareCardItemView, this.realMarginEnd);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m115520I() {
        mo71838p();
    }

    /* JADX INFO: renamed from: J */
    public final void m115521J(abp intlShareCardItemInfoDataWrapper) {
        String shareType = intlShareCardItemInfoDataWrapper.getShareType();
        if (Intrinsics.m87488d(shareType, "tt_friend")) {
            ((kbp) this.f47757b).m145317a4();
        } else if (Intrinsics.m87488d(shareType, "tt_family")) {
            ((kbp) this.f47757b).m145316Z3();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, l.ho2] */
    /* JADX INFO: renamed from: L */
    public final void m115522L(boolean renderFamilyShareBtn) {
        FlowLayout flowLayout = this.flowLayout;
        if (flowLayout == null) {
            Intrinsics.m87502r("flowLayout");
            flowLayout = null;
        }
        flowLayout.removeAllViews();
        float fM208412y0 = (xdl0.m208412y0() - t100.m186890d(40.0f)) / 33.0f;
        this.realWidth = (int) (5.0f * fM208412y0);
        this.realMarginEnd = (int) (fM208412y0 * 2.0f);
        ?? M206027E2 = ((kbp) this.f47757b).m206027E2();
        M206027E2.getClass();
        int i = M206027E2.m132112Z0() ? i3c0.f111085m3 : i3c0.f111013g3;
        String strM147355d = kvc0.m147355d(R$string.f47616wj);
        strM147355d.getClass();
        m115519H(new abp("tt_friend", i, strM147355d, true));
        if (renderFamilyShareBtn) {
            ?? M206027E3 = ((kbp) this.f47757b).m206027E2();
            M206027E3.getClass();
            int i2 = M206027E3.m132112Z0() ? i3c0.f111073l3 : i3c0.f111001f3;
            String strM147355d2 = kvc0.m147355d(R$string.f47609wc);
            strM147355d2.getClass();
            m115519H(new abp("tt_family", i2, strM147355d2, true));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m115523M(boolean renderFamilyShareBtn) {
        m71834E();
        m115522L(renderFamilyShareBtn);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m115518K(view);
    }
}
