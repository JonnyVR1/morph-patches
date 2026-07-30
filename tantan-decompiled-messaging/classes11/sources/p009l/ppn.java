package p009l;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
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
import l.g5c0;
import l.h1c0;
import l.ho2;
import l.i3c0;
import l.kvc0;
import l.lsi0;
import l.t6c0;
import l.w8u;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0018J\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0018J\u001b\u0010\u001e\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001e\u0010\u0015J\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\nH\u0014¢\u0006\u0004\b\"\u0010\u0018R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Ll/ppn;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/upn;", "Lcom/p1/mobile/android/app/Act;", "act", "presenterIntl", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/upn;)V", "Landroid/view/View;", "parentView", "", "P", "(Landroid/view/View;)V", "", "isValid", "T", "(Z)V", "", "Ll/mfn;", "shareItemDataListIntl", "S", "(Ljava/util/List;)V", "J", "O", "()V", "V", "view", "m", "N", "Q", "U", "M", "()Z", "R", "w", "Landroidx/recyclerview/widget/RecyclerView;", "k", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "l", "Landroid/widget/Button;", "inviteButton", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "errorLayout", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "n", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "Ll/ofn;", "o", "Ljava/util/List;", "shareItemList", "", "p", "I", "maxLimit", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        super(t6c0.z2, act, upnVar);
        act.getClass();
        upnVar.getClass();
        this.listAdapter = new LiveBaseAdapter();
        this.shareItemList = new ArrayList();
        this.maxLimit = ypv.m25490k().y4();
    }

    /* JADX INFO: renamed from: H */
    public static void m20547H(ppn ppnVar, View view) {
        ppnVar.m20552O();
    }

    /* JADX INFO: renamed from: I */
    public static void m20548I(ppn ppnVar, View view) {
        ppnVar.m20558N();
    }

    /* JADX INFO: renamed from: J */
    private final void m20549J(List<mfn> shareItemDataListIntl) {
        this.shareItemList.clear();
        List listJ = this.listAdapter.J();
        if (listJ != null) {
            listJ.clear();
        }
        Iterator<T> it = shareItemDataListIntl.iterator();
        while (it.hasNext()) {
            this.shareItemList.add(new ofn((mfn) it.next(), new Function1() { // from class: l.npn
                public final Object invoke(Object obj) {
                    return ppn.m20550K(this.f17601a, ((Boolean) obj).booleanValue());
                }
            }, new Function0() { // from class: l.opn
                public final Object invoke() {
                    return Boolean.valueOf(ppn.m20551L(this.f18200a));
                }
            }));
        }
        this.listAdapter.J().addAll(this.shareItemList);
        this.listAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m20550K(ppn ppnVar, boolean z) {
        ppnVar.m20556V();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m20551L(ppn ppnVar) {
        if (ppnVar.m20557M()) {
            return true;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = ((LiveMenuDialogHolder) ppnVar).e.getString(R.string.mj);
        string.getClass();
        lsi0.y(String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(ppnVar.maxLimit)}, 1)));
        return false;
    }

    /* JADX INFO: renamed from: O */
    private final void m20552O() {
        ArrayList arrayList = new ArrayList();
        for (ofn ofnVar : this.shareItemList) {
            if (ofnVar.getShareItemDataIntl().getIsSelected()) {
                String str = ofnVar.getShareItemDataIntl().getUserMask().userId;
                str.getClass();
                arrayList.add(str);
            }
        }
        ((upn) ((LiveMenuDialogHolder) this).b).m23122Y3(arrayList);
    }

    /* JADX INFO: renamed from: P */
    private final void m20553P(View parentView) {
        RecyclerView recyclerViewFindViewById = parentView.findViewById(g5c0.X4);
        recyclerViewFindViewById.getClass();
        this.recyclerView = recyclerViewFindViewById;
        View viewFindViewById = parentView.findViewById(g5c0.L2);
        viewFindViewById.getClass();
        this.inviteButton = (Button) viewFindViewById;
        View viewFindViewById2 = parentView.findViewById(g5c0.s1);
        viewFindViewById2.getClass();
        this.errorLayout = (FrameLayout) viewFindViewById2;
        ho2 ho2VarE2 = ((upn) ((LiveMenuDialogHolder) this).b).E2();
        ho2VarE2.getClass();
        if (!ho2VarE2.Z0()) {
            Button button = this.inviteButton;
            if (button == null) {
                Intrinsics.r("inviteButton");
                button = null;
            }
            button.setText(w8u.t(R.string.xc));
        }
        xdl0.E0(parentView.findViewById(g5c0.D), new View.OnClickListener() { // from class: l.lpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ppn.m20548I(this.f16292a, view);
            }
        });
        m20555T(false);
    }

    /* JADX INFO: renamed from: S */
    private final void m20554S(List<mfn> shareItemDataListIntl) {
        m20549J(shareItemDataListIntl);
    }

    /* JADX INFO: renamed from: T */
    private final void m20555T(boolean isValid) {
        Button button = this.inviteButton;
        Button button2 = null;
        if (!isValid) {
            if (button == null) {
                Intrinsics.r("inviteButton");
                button = null;
            }
            button.setClickable(false);
            button.setBackground(kvc0.b(i3c0.T0));
            button.setTextColor(kvc0.a(h1c0.j1));
            return;
        }
        if (button == null) {
            Intrinsics.r("inviteButton");
            button = null;
        }
        button.setClickable(true);
        button.setBackground(kvc0.b(i3c0.o0));
        button.setTextColor(kvc0.a(h1c0.w1));
        Button button3 = this.inviteButton;
        if (button3 == null) {
            Intrinsics.r("inviteButton");
        } else {
            button2 = button3;
        }
        xdl0.E0(button2, new View.OnClickListener() { // from class: l.mpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ppn.m20547H(this.f17018a, view);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    private final void m20556V() {
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
            m20555T(false);
            return;
        }
        Button button = this.inviteButton;
        if (button == null) {
            Intrinsics.r("inviteButton");
            button = null;
        }
        if (button.isClickable()) {
            return;
        }
        m20555T(true);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m20557M() {
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
    public final void m20558N() {
        p();
    }

    /* JADX INFO: renamed from: Q */
    public final void m20559Q() {
        E();
        List listJ = this.listAdapter.J();
        if (listJ != null) {
            listJ.clear();
        }
        this.listAdapter.notifyDataSetChanged();
        View view = this.recyclerView;
        if (view == null) {
            Intrinsics.r("recyclerView");
            view = null;
        }
        view.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        view.setAdapter(this.listAdapter);
    }

    /* JADX INFO: renamed from: R */
    public final void m20560R() {
        m20555T(false);
        View view = this.recyclerView;
        FrameLayout frameLayout = null;
        if (view == null) {
            Intrinsics.r("recyclerView");
            view = null;
        }
        xdl0.M0(view, false);
        Button button = this.inviteButton;
        if (button == null) {
            Intrinsics.r("inviteButton");
            button = null;
        }
        xdl0.M0(button, false);
        FrameLayout frameLayout2 = this.errorLayout;
        if (frameLayout2 == null) {
            Intrinsics.r("errorLayout");
        } else {
            frameLayout = frameLayout2;
        }
        xdl0.M0(frameLayout, true);
    }

    /* JADX INFO: renamed from: U */
    public final void m20561U(@NotNull List<mfn> shareItemDataListIntl) {
        shareItemDataListIntl.getClass();
        boolean zIsEmpty = shareItemDataListIntl.isEmpty();
        View view = this.recyclerView;
        FrameLayout frameLayout = null;
        if (zIsEmpty) {
            if (view == null) {
                Intrinsics.r("recyclerView");
                view = null;
            }
            xdl0.M0(view, false);
            Button button = this.inviteButton;
            if (button == null) {
                Intrinsics.r("inviteButton");
                button = null;
            }
            xdl0.M0(button, false);
            FrameLayout frameLayout2 = this.errorLayout;
            if (frameLayout2 == null) {
                Intrinsics.r("errorLayout");
            } else {
                frameLayout = frameLayout2;
            }
            xdl0.M0(frameLayout, true);
            return;
        }
        if (view == null) {
            Intrinsics.r("recyclerView");
            view = null;
        }
        xdl0.M0(view, true);
        Button button2 = this.inviteButton;
        if (button2 == null) {
            Intrinsics.r("inviteButton");
            button2 = null;
        }
        xdl0.M0(button2, true);
        FrameLayout frameLayout3 = this.errorLayout;
        if (frameLayout3 == null) {
            Intrinsics.r("errorLayout");
        } else {
            frameLayout = frameLayout3;
        }
        xdl0.M0(frameLayout, false);
        m20554S(shareItemDataListIntl);
        m20555T(false);
    }

    /* JADX INFO: renamed from: m */
    public void m20562m(@NotNull View view) {
        view.getClass();
        super.m(view);
        m20553P(view);
    }

    /* JADX INFO: renamed from: w */
    public void m20563w() {
        super.w();
        m20555T(false);
    }
}
