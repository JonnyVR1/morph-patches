package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.virtual.share.ShareCardItemView;
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
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010$R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, m87232d2 = {"Ll/ojo0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/bko0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/bko0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "Q", "(Landroid/view/View;)V", "N", "()V", "m", "", "scene", j6f.GPS_DIRECTION_TRUE, "(Ljava/lang/String;)V", "", "Ll/r7j;", "shareItemDataList", "L", "(Ljava/util/List;Ljava/lang/String;)V", "", "show", j6f.LATITUDE_SOUTH, "(Z)V", "R", "Ll/use0;", "shareCardItemInfoDataWrapper", "K", "(Ll/use0;)V", "P", "k", "Landroid/view/View;", "emptyLayout", "Lorg/apmem/tools/layouts/FlowLayout;", BLiveStormDanmakuGiftResourceType.f44444l, "Lorg/apmem/tools/layouts/FlowLayout;", "flowLayout", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "recyclerView", "n", "line", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "titleView", "", "p", "I", "realWidth", "q", "realMarginEnd", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "r", "Lkotlin/Lazy;", BloodType.f38728O, "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ojo0 extends LiveMenuDialogHolder<bko0> {

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
    public ojo0(@NotNull Act act, @NotNull bko0 bko0Var) {
        super(t6c0.f168576x5, act, bko0Var, j2g0.m139456c(0.3f));
        act.getClass();
        bko0Var.getClass();
        this.listAdapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.kjo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ojo0.m164720G();
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static void m164719F(ojo0 ojo0Var, use0 use0Var, View view) {
        ojo0Var.m164730P(use0Var);
    }

    /* JADX INFO: renamed from: G */
    public static LiveBaseAdapter m164720G() {
        return new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: H */
    public static void m164721H(ojo0 ojo0Var, View view) {
        ojo0Var.m164725N();
    }

    /* JADX INFO: renamed from: I */
    public static Unit m164722I(ojo0 ojo0Var, String str) {
        ((bko0) ojo0Var.f47757b).m102454j4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m164724M(ojo0 ojo0Var, String str, r7j r7jVar) {
        r7jVar.getClass();
        ArrayList arrayList = new ArrayList();
        String str2 = r7jVar.getUserMask().userId;
        str2.getClass();
        arrayList.add(str2);
        ((bko0) ojo0Var.f47757b).m102455k4(arrayList, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    private final void m164725N() {
        mo71838p();
    }

    /* JADX INFO: renamed from: Q */
    private final void m164726Q(View view) {
        View viewFindViewById = view.findViewById(g5c0.f100730K1);
        viewFindViewById.getClass();
        this.flowLayout = (FlowLayout) viewFindViewById;
        this.recyclerView = (VRecyclerView) view.findViewById(g5c0.f100811T1);
        this.titleView = (TextView) view.findViewById(g5c0.f100797R5);
        this.emptyLayout = view.findViewById(g5c0.f101011o1);
        this.line = view.findViewById(g5c0.f101040r3);
        xdl0.m208329E0(view.findViewById(g5c0.f100746M), new View.OnClickListener() { // from class: l.ljo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ojo0.m164721H(this.f128375a, view2);
            }
        });
        VRecyclerView vRecyclerView = this.recyclerView;
        if (vRecyclerView != null) {
            vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext(), 0, false));
            int i = t100.f167266o;
            vRecyclerView.addItemDecoration(new n660(0, i, i));
            vRecyclerView.addItemDecoration(new cmf0(0, t100.f167260i));
            vRecyclerView.setAdapter(m164729O());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m164727K(final use0 shareCardItemInfoDataWrapper) {
        Act act = this.f47760e;
        act.getClass();
        ShareCardItemView shareCardItemView = new ShareCardItemView(act, null, 0, 6, null);
        ImageView shareImage = shareCardItemView.getShareImage();
        shareImage.setImageResource(shareCardItemInfoDataWrapper.getImageRes());
        xdl0.m208325C0(shareImage, this.realWidth);
        xdl0.m208327D0(this.realWidth, shareImage);
        xdl0.m208357U(shareImage, t100.m186890d(22.0f));
        shareCardItemView.getShareName().setText(shareCardItemInfoDataWrapper.getCardName());
        xdl0.m208329E0(shareCardItemView, new View.OnClickListener() { // from class: l.jjo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ojo0.m164719F(this.f118309a, shareCardItemInfoDataWrapper, view);
            }
        });
        int i = this.realWidth;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, t100.m186890d(22.0f) + i);
        FlowLayout flowLayout = this.flowLayout;
        if (flowLayout == null) {
            Intrinsics.m87502r("flowLayout");
            flowLayout = null;
        }
        flowLayout.addView(shareCardItemView, marginLayoutParams);
        if (shareCardItemInfoDataWrapper.getIsNeedMarginEnd()) {
            xdl0.m208359W(shareCardItemView, this.realMarginEnd);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m164728L(@NotNull List<r7j> shareItemDataList, @NotNull final String scene) {
        shareItemDataList.getClass();
        scene.getClass();
        List arrayList = new ArrayList();
        Iterator<T> it = shareItemDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(new o7j((r7j) it.next(), new Function1() { // from class: l.mjo0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ojo0.m164724M(this.f134222a, scene, (r7j) obj);
                }
            }));
        }
        if (arrayList.size() > 10) {
            arrayList = arrayList.subList(0, 10);
            arrayList.add(new q7j(new Function0() { // from class: l.njo0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ojo0.m164722I(this.f139301a, scene);
                }
            }));
        }
        List list = arrayList;
        if (list.isEmpty()) {
            m164732S(false);
            return;
        }
        m164732S(true);
        List<d1q<?>> listM67355J = m164729O().m67355J();
        if (listM67355J != null) {
            listM67355J.clear();
        }
        m164729O().m67355J().addAll(list);
        m164729O().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public final LiveBaseAdapter m164729O() {
        return (LiveBaseAdapter) this.listAdapter.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P */
    public final void m164730P(use0 shareCardItemInfoDataWrapper) {
        String shareType;
        int iHashCode;
        if (!ConnectivityReceiver.m81284g() && ((iHashCode = (shareType = shareCardItemInfoDataWrapper.getShareType()).hashCode()) == 3616 ? shareType.equals("qq") : iHashCode == 3790 ? shareType.equals("we") : !(iHashCode == 535274091 ? !shareType.equals("qq_zone") : !(iHashCode == 1231408273 && shareType.equals("we_moment"))))) {
            lsi0.m151593w(R$string.f46764J9);
        }
        String scene = shareCardItemInfoDataWrapper.getScene();
        String shareType2 = shareCardItemInfoDataWrapper.getShareType();
        switch (shareType2.hashCode()) {
            case -1761564355:
                if (shareType2.equals("tt_friend")) {
                    ((bko0) this.f47757b).m102454j4(scene);
                    break;
                }
                break;
            case -1011900419:
                if (shareType2.equals("tt_feed")) {
                    ((bko0) this.f47757b).m102453i4();
                    m164725N();
                    break;
                }
                break;
            case 3616:
                if (shareType2.equals("qq")) {
                    ((bko0) this.f47757b).m102451g4(scene);
                    m164725N();
                    break;
                }
                break;
            case 3790:
                if (shareType2.equals("we")) {
                    ((bko0) this.f47757b).m102457m4(scene);
                    m164725N();
                }
                break;
            case 535274091:
                if (shareType2.equals("qq_zone")) {
                    ((bko0) this.f47757b).m102452h4(scene);
                    m164725N();
                    break;
                }
                break;
            case 1231408273:
                if (shareType2.equals("we_moment")) {
                    ((bko0) this.f47757b).m102456l4(scene);
                    m164725N();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m164731R(String scene) {
        String str;
        boolean zM198094d = vdt.m198094d();
        FlowLayout flowLayout = this.flowLayout;
        FlowLayout flowLayout2 = null;
        if (zM198094d) {
            if (flowLayout == null) {
                Intrinsics.m87502r("flowLayout");
                flowLayout = null;
            }
            xdl0.m208344M(flowLayout, false);
            return;
        }
        if (flowLayout == null) {
            Intrinsics.m87502r("flowLayout");
            flowLayout = null;
        }
        xdl0.m208344M(flowLayout, true);
        FlowLayout flowLayout3 = this.flowLayout;
        if (flowLayout3 == null) {
            Intrinsics.m87502r("flowLayout");
        } else {
            flowLayout2 = flowLayout3;
        }
        flowLayout2.removeAllViews();
        float fM208412y0 = (xdl0.m208412y0() - t100.m186890d(40.0f)) / 33.0f;
        this.realWidth = (int) (5.0f * fM208412y0);
        this.realMarginEnd = (int) (fM208412y0 * 2.0f);
        if (Intrinsics.m87488d(scene, BLiveHeatVoiceRoomTaskType.shareRoom)) {
            int i = i3c0.f111066k8;
            String strM147355d = kvc0.m147355d(R$string.f47397mk);
            strM147355d.getClass();
            str = scene;
            m164727K(new use0("tt_feed", i, strM147355d, true, scene));
        } else {
            str = scene;
        }
        int i2 = i3c0.f111090m8;
        String strM147355d2 = kvc0.m147355d(R$string.f47463pk);
        strM147355d2.getClass();
        m164727K(new use0("we", i2, strM147355d2, true, str));
        int i3 = i3c0.f111078l8;
        String strM147355d3 = kvc0.m147355d(R$string.f47485qk);
        strM147355d3.getClass();
        m164727K(new use0("we_moment", i3, strM147355d3, true, str));
        int i4 = i3c0.f111042i8;
        String strM147355d4 = kvc0.m147355d(R$string.f47419nk);
        strM147355d4.getClass();
        m164727K(new use0("qq", i4, strM147355d4, true, str));
        int i5 = i3c0.f111054j8;
        String strM147355d5 = kvc0.m147355d(R$string.f47441ok);
        strM147355d5.getClass();
        m164727K(new use0("qq_zone", i5, strM147355d5, false, str));
    }

    /* JADX INFO: renamed from: S */
    public final void m164732S(boolean show) {
        VRecyclerView vRecyclerView = this.recyclerView;
        if (vRecyclerView != null) {
            xdl0.m208344M(vRecyclerView, show);
        }
        View view = this.line;
        if (view != null) {
            xdl0.m208344M(view, show);
        }
        boolean zM198094d = vdt.m198094d();
        View view2 = this.emptyLayout;
        if (!zM198094d) {
            if (view2 != null) {
                xdl0.m208344M(view2, false);
            }
        } else {
            if (view2 != null) {
                xdl0.m208344M(view2, !show);
            }
            View view3 = this.line;
            if (view3 != null) {
                xdl0.m208344M(view3, false);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m164733T(@NotNull String scene) {
        scene.getClass();
        m71834E();
        m164731R(scene);
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(Intrinsics.m87488d(BLiveHeatVoiceRoomTaskType.shareRoom, scene) ? "分享" : "邀请");
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m164726Q(view);
    }
}
