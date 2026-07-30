package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlPrivilegeCard;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.AbstractC9124a;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.p126bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\u00020\u001f2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d¢\u0006\u0004\b \u0010!J)\u0010$\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, m88121d2 = {"Ll/nfp;", "Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/view/a;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/app/PutongFrag;)V", "", "getCount", "()I", "Landroid/view/View;", OMSTemplateModeType.view, "", Languages.ANY, "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", Item.TYPE, "getItemPosition", "(Ljava/lang/Object;)I", "Landroid/widget/FrameLayout;", "container", "position", "r", "(Landroid/widget/FrameLayout;I)Landroid/widget/FrameLayout;", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Lkotlin/collections/ArrayList;", "purchaseTypes", "", Constants.KEY_T, "(Ljava/util/ArrayList;)V", "Landroid/view/ViewGroup;", "object", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "Landroidx/viewpager/widget/ViewPager;", "viewPager", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroidx/viewpager/widget/ViewPager;)V", "f", "Lcom/p1/mobile/putong/app/PutongFrag;", "getFrag", "()Lcom/p1/mobile/putong/app/PutongFrag;", "", "g", "Ljava/util/List;", "getPurchaseTypes", "()Ljava/util/List;", "setPurchaseTypes", "(Ljava/util/List;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class nfp extends AbstractC9124a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final PutongFrag frag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public List<? extends PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: l.nfp$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C18867a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f141753a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f141753a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nfp(@NotNull PutongFrag putongFrag) {
        putongFrag.getClass();
        Context contextRequireContext = putongFrag.requireContext();
        contextRequireContext.getClass();
        super(contextRequireContext);
        this.frag = putongFrag;
    }

    @Override // p153l.cf60
    public int getCount() {
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // p153l.cf60
    public int getItemPosition(@NotNull Object item) {
        item.getClass();
        return -2;
    }

    @Override // p153l.cf60
    @NotNull
    public CharSequence getPageTitle(int position) {
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list == null || position >= list.size()) {
            return "";
        }
        int i = C18867a.f141753a[list.get(position).ordinal()];
        if (i == 1) {
            String string = this.frag.requireContext().getResources().getString(R$string.f18554Ik);
            string.getClass();
            return string;
        }
        if (i == 2) {
            String string2 = this.frag.requireContext().getResources().getString(R$string.f18680Mn);
            string2.getClass();
            return string2;
        }
        if (i == 3) {
            String string3 = this.frag.requireContext().getResources().getString(R$string.f18412E2);
            string3.getClass();
            return string3;
        }
        if (i != 4) {
            return "";
        }
        String string4 = this.frag.requireContext().getResources().getString(R$string.f18305Aj);
        string4.getClass();
        return string4;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NotNull View view, @NotNull Object any) {
        view.getClass();
        any.getClass();
        return Intrinsics.m88377d(view, any);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(@NotNull ViewGroup container, int position, @Nullable Object object) {
        container.getClass();
        if (object instanceof View) {
            View view = (View) object;
            if (view.getParent() == container) {
                container.removeView(view);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.AbstractC9124a
    @NotNull
    /* JADX INFO: renamed from: r */
    public FrameLayout mo57722r(@NotNull FrameLayout container, int position) {
        container.getClass();
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list == null || position >= list.size()) {
            return container;
        }
        View viewInflate = this.frag.act().inflater().inflate(kec0.f125928l5, (ViewGroup) container, false);
        viewInflate.getClass();
        IntlPrivilegeCard intlPrivilegeCard = (IntlPrivilegeCard) viewInflate;
        container.addView(intlPrivilegeCard, new ViewGroup.LayoutParams(-1, -2));
        intlPrivilegeCard.m57509k(this, this.frag, list.get(position), position);
        intlPrivilegeCard.m57517s();
        return container;
    }

    /* JADX INFO: renamed from: s */
    public final void m162933s(@NotNull ViewPager viewPager) {
        viewPager.getClass();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewPager.getChildAt(i);
            if (childAt instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) childAt;
                if (frameLayout.getChildCount() > 0) {
                    View childAt2 = frameLayout.getChildAt(0);
                    if (childAt2 instanceof IntlPrivilegeCard) {
                        ((IntlPrivilegeCard) childAt2).m57516r();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m162934t(@NotNull ArrayList<PurchaseType> purchaseTypes) {
        purchaseTypes.getClass();
        this.purchaseTypes = purchaseTypes;
        notifyDataSetChanged();
    }
}
