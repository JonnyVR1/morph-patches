package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.share.IntlShareCardItemView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\""}, m88121d2 = {"Ll/edp;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/kdp;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenterIntl", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/kdp;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "K", "(Landroid/view/View;)V", "m", "I", "()V", "", "renderFamilyShareBtn", "M", "(Z)V", "L", "Ll/adp;", "intlShareCardItemInfoDataWrapper", "H", "(Ll/adp;)V", "J", "Lorg/apmem/tools/layouts/FlowLayout;", "k", "Lorg/apmem/tools/layouts/FlowLayout;", "flowLayout", "", BLiveStormDanmakuGiftResourceType.f45292l, "realWidth", "realMarginEnd", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class edp extends LiveMenuDialogHolder<kdp> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public FlowLayout flowLayout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int realWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int realMarginEnd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edp(@NotNull Act act, @NotNull kdp kdpVar) {
        super(yec0.f198694A2, act, kdpVar);
        act.getClass();
        kdpVar.getClass();
    }

    /* JADX INFO: renamed from: F */
    public static void m120511F(edp edpVar, adp adpVar, View view) {
        edpVar.m120516J(adpVar);
    }

    /* JADX INFO: renamed from: G */
    public static void m120512G(edp edpVar, View view) {
        edpVar.m120515I();
    }

    /* JADX INFO: renamed from: K */
    private final void m120513K(View view) {
        View viewFindViewById = view.findViewById(mdc0.f135975K1);
        viewFindViewById.getClass();
        this.flowLayout = (FlowLayout) viewFindViewById;
        bnl0.m105509E0(view.findViewById(mdc0.f135991M), new View.OnClickListener() { // from class: l.cdp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                edp.m120512G(this.f81256a, view2);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l.oo2] */
    /* JADX INFO: renamed from: H */
    public final void m120514H(final adp intlShareCardItemInfoDataWrapper) {
        int iM175859d;
        Act act = this.f48608e;
        act.getClass();
        IntlShareCardItemView intlShareCardItemView = new IntlShareCardItemView(act, null, 0, 6, null);
        ?? M213810E2 = ((kdp) this.f48605b).m213810E2();
        M213810E2.getClass();
        if (M213810E2.m168498Z0()) {
            bnl0.m105505C0(intlShareCardItemView.getShareImage(), qa00.m175859d(60.0f));
            bnl0.m105507D0(qa00.m175859d(60.0f), intlShareCardItemView.getShareName());
            iM175859d = qa00.m175859d(60.0f);
        } else {
            bnl0.m105505C0(intlShareCardItemView.getShareImage(), qa00.m175859d(35.0f));
            bnl0.m105507D0(qa00.m175859d(55.0f), intlShareCardItemView.getShareName());
            iM175859d = qa00.m175859d(55.0f);
        }
        this.realWidth = iM175859d;
        intlShareCardItemView.getShareImage().setImageResource(intlShareCardItemInfoDataWrapper.getImageRes());
        intlShareCardItemView.getShareName().setText(intlShareCardItemInfoDataWrapper.getCardName());
        intlShareCardItemView.setOrientation(1);
        bnl0.m105509E0(intlShareCardItemView, new View.OnClickListener() { // from class: l.ddp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edp.m120511F(this.f87954a, intlShareCardItemInfoDataWrapper, view);
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        FlowLayout flowLayout = this.flowLayout;
        if (flowLayout == null) {
            Intrinsics.m88391r("flowLayout");
            flowLayout = null;
        }
        flowLayout.addView(intlShareCardItemView, marginLayoutParams);
        if (intlShareCardItemInfoDataWrapper.getIsNeedMarginEnd()) {
            bnl0.m105539W(intlShareCardItemView, this.realMarginEnd);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m120515I() {
        mo73021p();
    }

    /* JADX INFO: renamed from: J */
    public final void m120516J(adp intlShareCardItemInfoDataWrapper) {
        String shareType = intlShareCardItemInfoDataWrapper.getShareType();
        if (Intrinsics.m88377d(shareType, "tt_friend")) {
            ((kdp) this.f48605b).m149258a4();
        } else if (Intrinsics.m88377d(shareType, "tt_family")) {
            ((kdp) this.f48605b).m149257Z3();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, l.oo2] */
    /* JADX INFO: renamed from: L */
    public final void m120517L(boolean renderFamilyShareBtn) {
        FlowLayout flowLayout = this.flowLayout;
        if (flowLayout == null) {
            Intrinsics.m88391r("flowLayout");
            flowLayout = null;
        }
        flowLayout.removeAllViews();
        float fM105592y0 = (bnl0.m105592y0() - qa00.m175859d(40.0f)) / 33.0f;
        this.realWidth = (int) (5.0f * fM105592y0);
        this.realMarginEnd = (int) (fM105592y0 * 2.0f);
        ?? M213810E2 = ((kdp) this.f48605b).m213810E2();
        M213810E2.getClass();
        int i = M213810E2.m168498Z0() ? obc0.f146413m3 : obc0.f146341g3;
        String strM161280d = n3d0.m161280d(R$string.f48464wj);
        strM161280d.getClass();
        m120514H(new adp("tt_friend", i, strM161280d, true));
        if (renderFamilyShareBtn) {
            ?? M213810E3 = ((kdp) this.f48605b).m213810E2();
            M213810E3.getClass();
            int i2 = M213810E3.m168498Z0() ? obc0.f146401l3 : obc0.f146329f3;
            String strM161280d2 = n3d0.m161280d(R$string.f48457wc);
            strM161280d2.getClass();
            m120514H(new adp("tt_family", i2, strM161280d2, true));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m120518M(boolean renderFamilyShareBtn) {
        m73017E();
        m120517L(renderFamilyShareBtn);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m120513K(view);
    }
}
