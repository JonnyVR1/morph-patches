package p153l;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001a\u0010\u0011J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0015J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010\u0015R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002080\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>"}, m88121d2 = {"Ll/b0q;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/g0q;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/g0q;)V", "Landroid/view/View;", "parentView", "", "P", "(Landroid/view/View;)V", "", "Ll/laj;", "shareItemDataList", p7f.LATITUDE_SOUTH, "(Ljava/util/List;)V", OMSTemplateModeType.view, "m", "N", "()V", "", "inviteScene", "Q", "(Ljava/lang/String;)V", "U", "", "M", "()Z", "R", "isValid", p7f.GPS_DIRECTION_TRUE, "(Z)V", "J", BloodType.f39576O, p7f.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/recyclerview/widget/RecyclerView;", "k", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/widget/Button;", "inviteButton", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "errorLayout", "Landroid/widget/TextView;", "n", "Landroid/widget/TextView;", "titleView", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "o", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "Ll/naj;", "p", "Ljava/util/List;", "shareItemList", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class b0q extends LiveMenuDialogHolder<g0q> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public RecyclerView recyclerView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public Button inviteButton;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public FrameLayout errorLayout;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public TextView titleView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter listAdapter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final List<naj> shareItemList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0q(@NotNull Act act, @NotNull g0q g0qVar) {
        super(yec0.f199295w5, act, g0qVar);
        act.getClass();
        g0qVar.getClass();
        this.listAdapter = new LiveBaseAdapter();
        this.shareItemList = new ArrayList();
    }

    /* JADX INFO: renamed from: G */
    public static void m101338G(b0q b0qVar, View view) {
        b0qVar.m101347N();
    }

    /* JADX INFO: renamed from: H */
    public static void m101339H(b0q b0qVar, View view) {
        b0qVar.m101348O();
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m101341K(b0q b0qVar, boolean z) {
        b0qVar.m101353V();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m101342L(b0q b0qVar) {
        if (b0qVar.m101346M()) {
            return true;
        }
        o1j0.m165649w(R$string.f48355rk);
        return false;
    }

    /* JADX INFO: renamed from: P */
    private final void m101343P(View parentView) {
        View viewFindViewById = parentView.findViewById(mdc0.f136095X4);
        viewFindViewById.getClass();
        this.recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = parentView.findViewById(mdc0.f135985L2);
        viewFindViewById2.getClass();
        this.inviteButton = (Button) viewFindViewById2;
        View viewFindViewById3 = parentView.findViewById(mdc0.f136292s1);
        viewFindViewById3.getClass();
        this.errorLayout = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = parentView.findViewById(mdc0.f136034Q6);
        viewFindViewById4.getClass();
        this.titleView = (TextView) viewFindViewById4;
        bnl0.m105509E0(parentView.findViewById(mdc0.f135910D), new View.OnClickListener() { // from class: l.a0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0q.m101338G(this.f67738a, view);
            }
        });
        m101351T(false);
    }

    /* JADX INFO: renamed from: S */
    private final void m101344S(List<laj> shareItemDataList) {
        m101345J(shareItemDataList);
    }

    /* JADX INFO: renamed from: J */
    public final void m101345J(List<laj> shareItemDataList) {
        this.shareItemList.clear();
        List<d3q<?>> listM68538J = this.listAdapter.m68538J();
        if (listM68538J != null) {
            listM68538J.clear();
        }
        Iterator<T> it = shareItemDataList.iterator();
        while (it.hasNext()) {
            this.shareItemList.add(new naj((laj) it.next(), new Function1() { // from class: l.yzp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b0q.m101341K(this.f202212a, ((Boolean) obj).booleanValue());
                }
            }, new Function0() { // from class: l.zzp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(b0q.m101342L(this.f206733a));
                }
            }));
        }
        this.listAdapter.m68538J().addAll(this.shareItemList);
        this.listAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m101346M() {
        int i;
        List<naj> list = this.shareItemList;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((naj) it.next()).getShareItemData().getIsSelected() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < 10;
    }

    /* JADX INFO: renamed from: N */
    public final void m101347N() {
        mo73021p();
    }

    /* JADX INFO: renamed from: O */
    public final void m101348O() {
        ArrayList arrayList = new ArrayList();
        for (naj najVar : this.shareItemList) {
            if (najVar.getShareItemData().getIsSelected()) {
                String str = najVar.getShareItemData().getUserMask().userId;
                str.getClass();
                arrayList.add(str);
            }
        }
        ((g0q) this.f48605b).m128460X3(arrayList);
    }

    /* JADX INFO: renamed from: Q */
    public final void m101349Q(@NotNull String inviteScene) {
        inviteScene.getClass();
        m73017E();
        boolean zM88377d = Intrinsics.m88377d("inviteSettle", inviteScene);
        TextView textView = this.titleView;
        RecyclerView recyclerView = null;
        if (zM88377d) {
            if (textView == null) {
                Intrinsics.m88391r("titleView");
                textView = null;
            }
            textView.setText("邀请好友");
            Button button = this.inviteButton;
            if (button == null) {
                Intrinsics.m88391r("inviteButton");
                button = null;
            }
            button.setText("发出邀请");
        } else {
            if (textView == null) {
                Intrinsics.m88391r("titleView");
                textView = null;
            }
            textView.setText(xau.m209910t(R$string.f48377sk));
            Button button2 = this.inviteButton;
            if (button2 == null) {
                Intrinsics.m88391r("inviteButton");
                button2 = null;
            }
            button2.setText("分享群聊");
        }
        List<d3q<?>> listM68538J = this.listAdapter.m68538J();
        if (listM68538J != null) {
            listM68538J.clear();
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            Intrinsics.m88391r("recyclerView");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.listAdapter);
    }

    /* JADX INFO: renamed from: R */
    public final void m101350R() {
        m101351T(false);
        RecyclerView recyclerView = this.recyclerView;
        FrameLayout frameLayout = null;
        if (recyclerView == null) {
            Intrinsics.m88391r("recyclerView");
            recyclerView = null;
        }
        bnl0.m105525M0(recyclerView, false);
        Button button = this.inviteButton;
        if (button == null) {
            Intrinsics.m88391r("inviteButton");
            button = null;
        }
        bnl0.m105525M0(button, false);
        FrameLayout frameLayout2 = this.errorLayout;
        if (frameLayout2 == null) {
            Intrinsics.m88391r("errorLayout");
        } else {
            frameLayout = frameLayout2;
        }
        bnl0.m105525M0(frameLayout, true);
    }

    /* JADX INFO: renamed from: T */
    public final void m101351T(boolean isValid) {
        Button button = this.inviteButton;
        Button button2 = null;
        if (!isValid) {
            if (button == null) {
                Intrinsics.m88391r("inviteButton");
                button = null;
            }
            button.setClickable(false);
            button.setBackground(n3d0.m161278b(obc0.f146189T0));
            button.setTextColor(n3d0.m161277a(n9c0.f140838j1));
            return;
        }
        if (button == null) {
            Intrinsics.m88391r("inviteButton");
            button = null;
        }
        button.setClickable(true);
        button.setBackground(n3d0.m161278b(obc0.f146434o0));
        button.setTextColor(n3d0.m161277a(n9c0.f140877w1));
        Button button3 = this.inviteButton;
        if (button3 == null) {
            Intrinsics.m88391r("inviteButton");
        } else {
            button2 = button3;
        }
        bnl0.m105509E0(button2, new View.OnClickListener() { // from class: l.xzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0q.m101339H(this.f196903a, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m101352U(@NotNull List<laj> shareItemDataList) {
        shareItemDataList.getClass();
        boolean zIsEmpty = shareItemDataList.isEmpty();
        RecyclerView recyclerView = this.recyclerView;
        FrameLayout frameLayout = null;
        if (zIsEmpty) {
            if (recyclerView == null) {
                Intrinsics.m88391r("recyclerView");
                recyclerView = null;
            }
            bnl0.m105525M0(recyclerView, false);
            Button button = this.inviteButton;
            if (button == null) {
                Intrinsics.m88391r("inviteButton");
                button = null;
            }
            bnl0.m105525M0(button, false);
            FrameLayout frameLayout2 = this.errorLayout;
            if (frameLayout2 == null) {
                Intrinsics.m88391r("errorLayout");
            } else {
                frameLayout = frameLayout2;
            }
            bnl0.m105525M0(frameLayout, true);
            return;
        }
        if (recyclerView == null) {
            Intrinsics.m88391r("recyclerView");
            recyclerView = null;
        }
        bnl0.m105525M0(recyclerView, true);
        Button button2 = this.inviteButton;
        if (button2 == null) {
            Intrinsics.m88391r("inviteButton");
            button2 = null;
        }
        bnl0.m105525M0(button2, true);
        FrameLayout frameLayout3 = this.errorLayout;
        if (frameLayout3 == null) {
            Intrinsics.m88391r("errorLayout");
        } else {
            frameLayout = frameLayout3;
        }
        bnl0.m105525M0(frameLayout, false);
        m101344S(shareItemDataList);
        m101351T(false);
    }

    /* JADX INFO: renamed from: V */
    public final void m101353V() {
        int i;
        List<naj> list = this.shareItemList;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((naj) it.next()).getShareItemData().getIsSelected() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i == 0) {
            m101351T(false);
            return;
        }
        Button button = this.inviteButton;
        if (button == null) {
            Intrinsics.m88391r("inviteButton");
            button = null;
        }
        if (button.isClickable()) {
            return;
        }
        m101351T(true);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m101343P(view);
    }
}
