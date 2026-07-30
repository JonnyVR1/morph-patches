package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.virtual.share.ShareCardItemView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010$R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, m88121d2 = {"Ll/sso0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/fto0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/fto0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Q", "(Landroid/view/View;)V", "N", "()V", "m", "", "scene", p7f.GPS_DIRECTION_TRUE, "(Ljava/lang/String;)V", "", "Ll/laj;", "shareItemDataList", "L", "(Ljava/util/List;Ljava/lang/String;)V", "", "show", p7f.LATITUDE_SOUTH, "(Z)V", "R", "Ll/b1f0;", "shareCardItemInfoDataWrapper", "K", "(Ll/b1f0;)V", "P", "k", "Landroid/view/View;", "emptyLayout", "Lorg/apmem/tools/layouts/FlowLayout;", BLiveStormDanmakuGiftResourceType.f45292l, "Lorg/apmem/tools/layouts/FlowLayout;", "flowLayout", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "recyclerView", "n", "line", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "titleView", "", "p", "I", "realWidth", "q", "realMarginEnd", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "r", "Lkotlin/Lazy;", BloodType.f39576O, "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class sso0 extends LiveMenuDialogHolder<fto0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public View emptyLayout;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public FlowLayout flowLayout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public VRecyclerView recyclerView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public View line;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public TextView titleView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int realWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int realMarginEnd;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy listAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sso0(@NotNull Act act, @NotNull fto0 fto0Var) {
        super(yec0.f199308x5, act, fto0Var, qag0.m175922c(0.3f));
        act.getClass();
        fto0Var.getClass();
        this.listAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.oso0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sso0.m187771G();
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static void m187770F(sso0 sso0Var, b1f0 b1f0Var, View view) {
        sso0Var.m187781P(b1f0Var);
    }

    /* JADX INFO: renamed from: G */
    public static LiveBaseAdapter m187771G() {
        return new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: H */
    public static void m187772H(sso0 sso0Var, View view) {
        sso0Var.m187776N();
    }

    /* JADX INFO: renamed from: I */
    public static Unit m187773I(sso0 sso0Var, String str) {
        ((fto0) sso0Var.f48605b).m127368j4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m187775M(sso0 sso0Var, String str, laj lajVar) {
        lajVar.getClass();
        ArrayList arrayList = new ArrayList();
        String str2 = lajVar.getUserMask().userId;
        str2.getClass();
        arrayList.add(str2);
        ((fto0) sso0Var.f48605b).m127369k4(arrayList, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    private final void m187776N() {
        mo73021p();
    }

    /* JADX INFO: renamed from: Q */
    private final void m187777Q(View view) {
        View viewFindViewById = view.findViewById(mdc0.f135975K1);
        viewFindViewById.getClass();
        this.flowLayout = (FlowLayout) viewFindViewById;
        this.recyclerView = (VRecyclerView) view.findViewById(mdc0.f136056T1);
        this.titleView = (TextView) view.findViewById(mdc0.f136042R5);
        this.emptyLayout = view.findViewById(mdc0.f136256o1);
        this.line = view.findViewById(mdc0.f136285r3);
        bnl0.m105509E0(view.findViewById(mdc0.f135991M), new View.OnClickListener() { // from class: l.pso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                sso0.m187772H(this.f153955a, view2);
            }
        });
        VRecyclerView vRecyclerView = this.recyclerView;
        if (vRecyclerView != null) {
            vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext(), 0, false));
            int i = qa00.f156328o;
            vRecyclerView.addItemDecoration(new te60(0, i, i));
            vRecyclerView.addItemDecoration(new luf0(0, qa00.f156322i));
            vRecyclerView.setAdapter(m187780O());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m187778K(final b1f0 shareCardItemInfoDataWrapper) {
        Act act = this.f48608e;
        act.getClass();
        ShareCardItemView shareCardItemView = new ShareCardItemView(act, null, 0, 6, null);
        ImageView shareImage = shareCardItemView.getShareImage();
        shareImage.setImageResource(shareCardItemInfoDataWrapper.getImageRes());
        bnl0.m105505C0(shareImage, this.realWidth);
        bnl0.m105507D0(this.realWidth, shareImage);
        bnl0.m105537U(shareImage, qa00.m175859d(22.0f));
        shareCardItemView.getShareName().setText(shareCardItemInfoDataWrapper.getCardName());
        bnl0.m105509E0(shareCardItemView, new View.OnClickListener() { // from class: l.nso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sso0.m187770F(this.f143523a, shareCardItemInfoDataWrapper, view);
            }
        });
        int i = this.realWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, qa00.m175859d(22.0f) + i);
        FlowLayout flowLayout = this.flowLayout;
        if (flowLayout == null) {
            Intrinsics.m88391r("flowLayout");
            flowLayout = null;
        }
        flowLayout.addView(shareCardItemView, marginLayoutParams);
        if (shareCardItemInfoDataWrapper.getIsNeedMarginEnd()) {
            bnl0.m105539W(shareCardItemView, this.realMarginEnd);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m187779L(@NotNull List<laj> shareItemDataList, @NotNull final String scene) {
        shareItemDataList.getClass();
        scene.getClass();
        List arrayList = new ArrayList();
        Iterator<T> it = shareItemDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(new iaj((laj) it.next(), new Function1() { // from class: l.qso0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return sso0.m187775M(this.f159343a, scene, (laj) obj);
                }
            }));
        }
        if (arrayList.size() > 10) {
            arrayList = arrayList.subList(0, 10);
            arrayList.add(new kaj(new Function0() { // from class: l.rso0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return sso0.m187773I(this.f164709a, scene);
                }
            }));
        }
        List list = arrayList;
        if (list.isEmpty()) {
            m187783S(false);
            return;
        }
        m187783S(true);
        List<d3q<?>> listM68538J = m187780O().m68538J();
        if (listM68538J != null) {
            listM68538J.clear();
        }
        m187780O().m68538J().addAll(list);
        m187780O().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final LiveBaseAdapter m187780O() {
        return (LiveBaseAdapter) this.listAdapter.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P */
    public final void m187781P(b1f0 shareCardItemInfoDataWrapper) {
        String shareType;
        int iHashCode;
        if (!ConnectivityReceiver.m82467g() && ((iHashCode = (shareType = shareCardItemInfoDataWrapper.getShareType()).hashCode()) == 3616 ? shareType.equals("qq") : iHashCode == 3790 ? shareType.equals("we") : !(iHashCode == 535274091 ? !shareType.equals("qq_zone") : !(iHashCode == 1231408273 && shareType.equals("we_moment"))))) {
            o1j0.m165649w(R$string.f47612J9);
        }
        String scene = shareCardItemInfoDataWrapper.getScene();
        String shareType2 = shareCardItemInfoDataWrapper.getShareType();
        switch (shareType2.hashCode()) {
            case -1761564355:
                if (shareType2.equals("tt_friend")) {
                    ((fto0) this.f48605b).m127368j4(scene);
                    break;
                }
                break;
            case -1011900419:
                if (shareType2.equals("tt_feed")) {
                    ((fto0) this.f48605b).m127367i4();
                    m187776N();
                    break;
                }
                break;
            case 3616:
                if (shareType2.equals("qq")) {
                    ((fto0) this.f48605b).m127365g4(scene);
                    m187776N();
                    break;
                }
                break;
            case 3790:
                if (shareType2.equals("we")) {
                    ((fto0) this.f48605b).m127371m4(scene);
                    m187776N();
                }
                break;
            case 535274091:
                if (shareType2.equals("qq_zone")) {
                    ((fto0) this.f48605b).m127366h4(scene);
                    m187776N();
                    break;
                }
                break;
            case 1231408273:
                if (shareType2.equals("we_moment")) {
                    ((fto0) this.f48605b).m127370l4(scene);
                    m187776N();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m187782R(String scene) {
        String str;
        boolean zM206161d = wft.m206161d();
        FlowLayout flowLayout = this.flowLayout;
        FlowLayout flowLayout2 = null;
        if (zM206161d) {
            if (flowLayout == null) {
                Intrinsics.m88391r("flowLayout");
                flowLayout = null;
            }
            bnl0.m105524M(flowLayout, false);
            return;
        }
        if (flowLayout == null) {
            Intrinsics.m88391r("flowLayout");
            flowLayout = null;
        }
        bnl0.m105524M(flowLayout, true);
        FlowLayout flowLayout3 = this.flowLayout;
        if (flowLayout3 == null) {
            Intrinsics.m88391r("flowLayout");
        } else {
            flowLayout2 = flowLayout3;
        }
        flowLayout2.removeAllViews();
        float fM105592y0 = (bnl0.m105592y0() - qa00.m175859d(40.0f)) / 33.0f;
        this.realWidth = (int) (5.0f * fM105592y0);
        this.realMarginEnd = (int) (fM105592y0 * 2.0f);
        if (Intrinsics.m88377d(scene, BLiveHeatVoiceRoomTaskType.shareRoom)) {
            int i = obc0.f146394k8;
            String strM161280d = n3d0.m161280d(R$string.f48245mk);
            strM161280d.getClass();
            str = scene;
            m187778K(new b1f0("tt_feed", i, strM161280d, true, scene));
        } else {
            str = scene;
        }
        int i2 = obc0.f146418m8;
        String strM161280d2 = n3d0.m161280d(R$string.f48311pk);
        strM161280d2.getClass();
        m187778K(new b1f0("we", i2, strM161280d2, true, str));
        int i3 = obc0.f146406l8;
        String strM161280d3 = n3d0.m161280d(R$string.f48333qk);
        strM161280d3.getClass();
        m187778K(new b1f0("we_moment", i3, strM161280d3, true, str));
        int i4 = obc0.f146370i8;
        String strM161280d4 = n3d0.m161280d(R$string.f48267nk);
        strM161280d4.getClass();
        m187778K(new b1f0("qq", i4, strM161280d4, true, str));
        int i5 = obc0.f146382j8;
        String strM161280d5 = n3d0.m161280d(R$string.f48289ok);
        strM161280d5.getClass();
        m187778K(new b1f0("qq_zone", i5, strM161280d5, false, str));
    }

    /* JADX INFO: renamed from: S */
    public final void m187783S(boolean show) {
        VRecyclerView vRecyclerView = this.recyclerView;
        if (vRecyclerView != null) {
            bnl0.m105524M(vRecyclerView, show);
        }
        View view = this.line;
        if (view != null) {
            bnl0.m105524M(view, show);
        }
        boolean zM206161d = wft.m206161d();
        View view2 = this.emptyLayout;
        if (!zM206161d) {
            if (view2 != null) {
                bnl0.m105524M(view2, false);
            }
        } else {
            if (view2 != null) {
                bnl0.m105524M(view2, !show);
            }
            View view3 = this.line;
            if (view3 != null) {
                bnl0.m105524M(view3, false);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m187784T(@NotNull String scene) {
        scene.getClass();
        m73017E();
        m187782R(scene);
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(Intrinsics.m88377d(BLiveHeatVoiceRoomTaskType.shareRoom, scene) ? "分享" : "邀请");
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m187777Q(view);
    }
}
