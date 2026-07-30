package p149l;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
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
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001a\u0010\u0011J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0015J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010\u0015R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002080\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006>"}, m87232d2 = {"Ll/byp;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/gyp;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/gyp;)V", "Landroid/view/View;", "parentView", "", "P", "(Landroid/view/View;)V", "", "Ll/r7j;", "shareItemDataList", j6f.LATITUDE_SOUTH, "(Ljava/util/List;)V", OMSTemplateModeType.view, "m", "N", "()V", "", "inviteScene", "Q", "(Ljava/lang/String;)V", "U", "", "M", "()Z", "R", "isValid", j6f.GPS_DIRECTION_TRUE, "(Z)V", "J", BloodType.f38728O, j6f.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/recyclerview/widget/RecyclerView;", "k", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/widget/Button;", "inviteButton", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "errorLayout", "Landroid/widget/TextView;", "n", "Landroid/widget/TextView;", "titleView", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "o", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "listAdapter", "Ll/t7j;", "p", "Ljava/util/List;", "shareItemList", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class byp extends LiveMenuDialogHolder<gyp> {

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
    public final List<t7j> shareItemList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byp(@NotNull Act act, @NotNull gyp gypVar) {
        super(t6c0.f168563w5, act, gypVar);
        act.getClass();
        gypVar.getClass();
        this.listAdapter = new LiveBaseAdapter();
        this.shareItemList = new ArrayList();
    }

    /* JADX INFO: renamed from: G */
    public static void m104491G(byp bypVar, View view) {
        bypVar.m104500N();
    }

    /* JADX INFO: renamed from: H */
    public static void m104492H(byp bypVar, View view) {
        bypVar.m104501O();
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m104494K(byp bypVar, boolean z) {
        bypVar.m104506V();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m104495L(byp bypVar) {
        if (bypVar.m104499M()) {
            return true;
        }
        lsi0.m151593w(R$string.f47507rk);
        return false;
    }

    /* JADX INFO: renamed from: P */
    private final void m104496P(View parentView) {
        View viewFindViewById = parentView.findViewById(g5c0.f100850X4);
        viewFindViewById.getClass();
        this.recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = parentView.findViewById(g5c0.f100740L2);
        viewFindViewById2.getClass();
        this.inviteButton = (Button) viewFindViewById2;
        View viewFindViewById3 = parentView.findViewById(g5c0.f101047s1);
        viewFindViewById3.getClass();
        this.errorLayout = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = parentView.findViewById(g5c0.f100789Q6);
        viewFindViewById4.getClass();
        this.titleView = (TextView) viewFindViewById4;
        xdl0.m208329E0(parentView.findViewById(g5c0.f100665D), new View.OnClickListener() { // from class: l.ayp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byp.m104491G(this.f72301a, view);
            }
        });
        m104504T(false);
    }

    /* JADX INFO: renamed from: S */
    private final void m104497S(List<r7j> shareItemDataList) {
        m104498J(shareItemDataList);
    }

    /* JADX INFO: renamed from: J */
    public final void m104498J(List<r7j> shareItemDataList) {
        this.shareItemList.clear();
        List<d1q<?>> listM67355J = this.listAdapter.m67355J();
        if (listM67355J != null) {
            listM67355J.clear();
        }
        Iterator<T> it = shareItemDataList.iterator();
        while (it.hasNext()) {
            this.shareItemList.add(new t7j((r7j) it.next(), new Function1() { // from class: l.yxp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return byp.m104494K(this.f200654a, ((Boolean) obj).booleanValue());
                }
            }, new Function0() { // from class: l.zxp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(byp.m104495L(this.f205478a));
                }
            }));
        }
        this.listAdapter.m67355J().addAll(this.shareItemList);
        this.listAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m104499M() {
        int i;
        List<t7j> list = this.shareItemList;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((t7j) it.next()).getShareItemData().getIsSelected() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < 10;
    }

    /* JADX INFO: renamed from: N */
    public final void m104500N() {
        mo71838p();
    }

    /* JADX INFO: renamed from: O */
    public final void m104501O() {
        ArrayList arrayList = new ArrayList();
        for (t7j t7jVar : this.shareItemList) {
            if (t7jVar.getShareItemData().getIsSelected()) {
                String str = t7jVar.getShareItemData().getUserMask().userId;
                str.getClass();
                arrayList.add(str);
            }
        }
        ((gyp) this.f47757b).m128723X3(arrayList);
    }

    /* JADX INFO: renamed from: Q */
    public final void m104502Q(@NotNull String inviteScene) {
        inviteScene.getClass();
        m71834E();
        boolean zM87488d = Intrinsics.m87488d("inviteSettle", inviteScene);
        TextView textView = this.titleView;
        RecyclerView recyclerView = null;
        if (zM87488d) {
            if (textView == null) {
                Intrinsics.m87502r("titleView");
                textView = null;
            }
            textView.setText("邀请好友");
            Button button = this.inviteButton;
            if (button == null) {
                Intrinsics.m87502r("inviteButton");
                button = null;
            }
            button.setText("发出邀请");
        } else {
            if (textView == null) {
                Intrinsics.m87502r("titleView");
                textView = null;
            }
            textView.setText(w8u.m202217t(R$string.f47529sk));
            Button button2 = this.inviteButton;
            if (button2 == null) {
                Intrinsics.m87502r("inviteButton");
                button2 = null;
            }
            button2.setText("分享群聊");
        }
        List<d1q<?>> listM67355J = this.listAdapter.m67355J();
        if (listM67355J != null) {
            listM67355J.clear();
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            Intrinsics.m87502r("recyclerView");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.listAdapter);
    }

    /* JADX INFO: renamed from: R */
    public final void m104503R() {
        m104504T(false);
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

    /* JADX INFO: renamed from: T */
    public final void m104504T(boolean isValid) {
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
        xdl0.m208329E0(button2, new View.OnClickListener() { // from class: l.xxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byp.m104492H(this.f194901a, view);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m104505U(@NotNull List<r7j> shareItemDataList) {
        shareItemDataList.getClass();
        boolean zIsEmpty = shareItemDataList.isEmpty();
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
        m104497S(shareItemDataList);
        m104504T(false);
    }

    /* JADX INFO: renamed from: V */
    public final void m104506V() {
        int i;
        List<t7j> list = this.shareItemList;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((t7j) it.next()).getShareItemData().getIsSelected() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i == 0) {
            m104504T(false);
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
        m104504T(true);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m104496P(view);
    }
}
