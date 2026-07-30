package p149l;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0018J\u001b\u0010\u001e\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001e\u0010\u0015J\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\nH\u0014¢\u0006\u0004\b\"\u0010\u0018R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, m87232d2 = {"Ll/ppn;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/upn;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenterIntl", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/upn;)V", "Landroid/view/View;", "parentView", "", "P", "(Landroid/view/View;)V", "", "isValid", j6f.GPS_DIRECTION_TRUE, "(Z)V", "", "Ll/mfn;", "shareItemDataListIntl", j6f.LATITUDE_SOUTH, "(Ljava/util/List;)V", "J", BloodType.f38728O, "()V", j6f.GPS_MEASUREMENT_INTERRUPTED, OMSTemplateModeType.view, "m", "N", "Q", "U", "M", "()Z", "R", "w", "Landroidx/recyclerview/widget/RecyclerView;", "k", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/widget/Button;", "inviteButton", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "errorLayout", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "n", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "Ll/ofn;", "o", "Ljava/util/List;", "shareItemList", "", "p", "I", "maxLimit", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ppn extends LiveMenuDialogHolder<upn> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public RecyclerView recyclerView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public Button inviteButton;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public FrameLayout errorLayout;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter listAdapter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final List<ofn> shareItemList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int maxLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppn(@NotNull Act act, @NotNull upn upnVar) {
        super(t6c0.f168599z2, act, upnVar);
        act.getClass();
        upnVar.getClass();
        this.listAdapter = new LiveBaseAdapter();
        this.shareItemList = new ArrayList();
        this.maxLimit = ypv.m215672k().m195988y4();
    }

    /* JADX INFO: renamed from: H */
    public static void m170741H(ppn ppnVar, View view) {
        ppnVar.m170746O();
    }

    /* JADX INFO: renamed from: I */
    public static void m170742I(ppn ppnVar, View view) {
        ppnVar.m170752N();
    }

    /* JADX INFO: renamed from: J */
    private final void m170743J(List<mfn> shareItemDataListIntl) {
        this.shareItemList.clear();
        List<d1q<?>> listM67355J = this.listAdapter.m67355J();
        if (listM67355J != null) {
            listM67355J.clear();
        }
        Iterator<T> it = shareItemDataListIntl.iterator();
        while (it.hasNext()) {
            this.shareItemList.add(new ofn((mfn) it.next(), new Function1() { // from class: l.npn
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ppn.m170744K(this.f139987a, ((Boolean) obj).booleanValue());
                }
            }, new Function0() { // from class: l.opn
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(ppn.m170745L(this.f145018a));
                }
            }));
        }
        this.listAdapter.m67355J().addAll(this.shareItemList);
        this.listAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m170744K(ppn ppnVar, boolean z) {
        ppnVar.m170750V();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m170745L(ppn ppnVar) {
        if (ppnVar.m170751M()) {
            return true;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = ppnVar.f47760e.getString(R$string.f47396mj);
        string.getClass();
        lsi0.m151595y(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(ppnVar.maxLimit)}, 1)));
        return false;
    }

    /* JADX INFO: renamed from: O */
    private final void m170746O() {
        ArrayList arrayList = new ArrayList();
        for (ofn ofnVar : this.shareItemList) {
            if (ofnVar.getShareItemDataIntl().getIsSelected()) {
                String str = ofnVar.getShareItemDataIntl().getUserMask().userId;
                str.getClass();
                arrayList.add(str);
            }
        }
        ((upn) this.f47757b).m194898Y3(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, l.ho2] */
    /* JADX INFO: renamed from: P */
    private final void m170747P(View parentView) {
        View viewFindViewById = parentView.findViewById(g5c0.f100850X4);
        viewFindViewById.getClass();
        this.recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = parentView.findViewById(g5c0.f100740L2);
        viewFindViewById2.getClass();
        this.inviteButton = (Button) viewFindViewById2;
        View viewFindViewById3 = parentView.findViewById(g5c0.f101047s1);
        viewFindViewById3.getClass();
        this.errorLayout = (FrameLayout) viewFindViewById3;
        ?? M206027E2 = ((upn) this.f47757b).m206027E2();
        M206027E2.getClass();
        if (!M206027E2.m132112Z0()) {
            Button button = this.inviteButton;
            if (button == null) {
                Intrinsics.m87502r("inviteButton");
                button = null;
            }
            button.setText(w8u.m202217t(R$string.f47631xc));
        }
        xdl0.m208329E0(parentView.findViewById(g5c0.f100665D), new View.OnClickListener() { // from class: l.lpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ppn.m170742I(this.f129231a, view);
            }
        });
        m170749T(false);
    }

    /* JADX INFO: renamed from: S */
    private final void m170748S(List<mfn> shareItemDataListIntl) {
        m170743J(shareItemDataListIntl);
    }

    /* JADX INFO: renamed from: T */
    private final void m170749T(boolean isValid) {
        Button button = this.inviteButton;
        Button button2 = null;
        if (!isValid) {
            if (button == null) {
                Intrinsics.m87502r("inviteButton");
                button = null;
            }
            button.setClickable(false);
            button.setBackground(kvc0.m147353b(i3c0.f110861T0));
            button.setTextColor(kvc0.m147352a(h1c0.f105377j1));
            return;
        }
        if (button == null) {
            Intrinsics.m87502r("inviteButton");
            button = null;
        }
        button.setClickable(true);
        button.setBackground(kvc0.m147353b(i3c0.f111106o0));
        button.setTextColor(kvc0.m147352a(h1c0.f105416w1));
        Button button3 = this.inviteButton;
        if (button3 == null) {
            Intrinsics.m87502r("inviteButton");
        } else {
            button2 = button3;
        }
        xdl0.m208329E0(button2, new View.OnClickListener() { // from class: l.mpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ppn.m170741H(this.f135073a, view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    private final void m170750V() {
        int i;
        List<ofn> list = this.shareItemList;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((ofn) it.next()).getShareItemDataIntl().getIsSelected() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i == 0) {
            m170749T(false);
            return;
        }
        Button button = this.inviteButton;
        if (button == null) {
            Intrinsics.m87502r("inviteButton");
            button = null;
        }
        if (button.isClickable()) {
            return;
        }
        m170749T(true);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m170751M() {
        int i;
        List<ofn> list = this.shareItemList;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((ofn) it.next()).getShareItemDataIntl().getIsSelected() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < this.maxLimit;
    }

    /* JADX INFO: renamed from: N */
    public final void m170752N() {
        mo71838p();
    }

    /* JADX INFO: renamed from: Q */
    public final void m170753Q() {
        m71834E();
        List<d1q<?>> listM67355J = this.listAdapter.m67355J();
        if (listM67355J != null) {
            listM67355J.clear();
        }
        this.listAdapter.notifyDataSetChanged();
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            Intrinsics.m87502r("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.listAdapter);
    }

    /* JADX INFO: renamed from: R */
    public final void m170754R() {
        m170749T(false);
        RecyclerView recyclerView = this.recyclerView;
        FrameLayout frameLayout = null;
        if (recyclerView == null) {
            Intrinsics.m87502r("recyclerView");
            recyclerView = null;
        }
        xdl0.m208345M0(recyclerView, false);
        Button button = this.inviteButton;
        if (button == null) {
            Intrinsics.m87502r("inviteButton");
            button = null;
        }
        xdl0.m208345M0(button, false);
        FrameLayout frameLayout2 = this.errorLayout;
        if (frameLayout2 == null) {
            Intrinsics.m87502r("errorLayout");
        } else {
            frameLayout = frameLayout2;
        }
        xdl0.m208345M0(frameLayout, true);
    }

    /* JADX INFO: renamed from: U */
    public final void m170755U(@NotNull List<mfn> shareItemDataListIntl) {
        shareItemDataListIntl.getClass();
        boolean zIsEmpty = shareItemDataListIntl.isEmpty();
        RecyclerView recyclerView = this.recyclerView;
        FrameLayout frameLayout = null;
        if (zIsEmpty) {
            if (recyclerView == null) {
                Intrinsics.m87502r("recyclerView");
                recyclerView = null;
            }
            xdl0.m208345M0(recyclerView, false);
            Button button = this.inviteButton;
            if (button == null) {
                Intrinsics.m87502r("inviteButton");
                button = null;
            }
            xdl0.m208345M0(button, false);
            FrameLayout frameLayout2 = this.errorLayout;
            if (frameLayout2 == null) {
                Intrinsics.m87502r("errorLayout");
            } else {
                frameLayout = frameLayout2;
            }
            xdl0.m208345M0(frameLayout, true);
            return;
        }
        if (recyclerView == null) {
            Intrinsics.m87502r("recyclerView");
            recyclerView = null;
        }
        xdl0.m208345M0(recyclerView, true);
        Button button2 = this.inviteButton;
        if (button2 == null) {
            Intrinsics.m87502r("inviteButton");
            button2 = null;
        }
        xdl0.m208345M0(button2, true);
        FrameLayout frameLayout3 = this.errorLayout;
        if (frameLayout3 == null) {
            Intrinsics.m87502r("errorLayout");
        } else {
            frameLayout = frameLayout3;
        }
        xdl0.m208345M0(frameLayout, false);
        m170748S(shareItemDataListIntl);
        m170749T(false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m170747P(view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m170749T(false);
    }
}
