package p153l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.IntlPrivilegeCard;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.AbstractC9189a;
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
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010#\u001a\u00020\u00192\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, m88121d2 = {"Ll/ofp;", "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/view/a;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/app/PutongFrag;)V", "", "getCount", "()I", "Landroid/view/View;", OMSTemplateModeType.view, "", Languages.ANY, "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "object", "getItemPosition", "(Ljava/lang/Object;)I", "Landroid/widget/FrameLayout;", "container", "position", "r", "(Landroid/widget/FrameLayout;I)Landroid/widget/FrameLayout;", "Landroid/view/ViewGroup;", "", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Lkotlin/collections/ArrayList;", "purchaseTypes", Constants.KEY_T, "(Ljava/util/ArrayList;)V", "Landroidx/viewpager/widget/ViewPager;", "viewPager", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroidx/viewpager/widget/ViewPager;)V", "f", "Lcom/p1/mobile/putong/app/PutongFrag;", "getFrag", "()Lcom/p1/mobile/putong/app/PutongFrag;", "", "g", "Ljava/util/List;", "getPurchaseTypes", "()Ljava/util/List;", "setPurchaseTypes", "(Ljava/util/List;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ofp extends AbstractC9189a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final PutongFrag frag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public List<? extends PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: l.ofp$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C19119a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f147094a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f147094a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ofp(@NotNull PutongFrag putongFrag) {
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
    public int getItemPosition(@NotNull Object object) {
        object.getClass();
        return -2;
    }

    @Override // p153l.cf60
    @NotNull
    public CharSequence getPageTitle(int position) {
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list == null) {
            return "";
        }
        int i = C19119a.f147094a[list.get(position).ordinal()];
        if (i == 1) {
            String string = this.frag.requireContext().getResources().getString(R$string.f18554Ik);
            string.getClass();
            return string;
        }
        if (i == 2) {
            String string2 = this.frag.requireContext().getResources().getString(R$string.f18412E2);
            string2.getClass();
            return string2;
        }
        if (i != 3) {
            return "";
        }
        String string3 = this.frag.requireContext().getResources().getString(R$string.f18305Aj);
        string3.getClass();
        return string3;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NotNull View view, @NotNull Object any) {
        view.getClass();
        any.getClass();
        return Intrinsics.m88377d(view, any);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(@NotNull ViewGroup container, int position, @NotNull Object any) {
        container.getClass();
        any.getClass();
        container.removeView((View) any);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.AbstractC9189a
    @NotNull
    /* JADX INFO: renamed from: r */
    public FrameLayout mo58867r(@NotNull FrameLayout container, int position) {
        container.getClass();
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list == null) {
            return container;
        }
        View viewInflate = this.frag.act().inflater().inflate(kec0.f125331Af, (ViewGroup) container, false);
        viewInflate.getClass();
        IntlPrivilegeCard intlPrivilegeCard = (IntlPrivilegeCard) viewInflate;
        container.addView(intlPrivilegeCard, new ViewGroup.LayoutParams(-1, -2));
        intlPrivilegeCard.m58658m(this, this.frag, list.get(position), position);
        intlPrivilegeCard.m58667v();
        return container;
    }

    /* JADX INFO: renamed from: s */
    public final void m167470s(@NotNull ViewPager viewPager) {
        viewPager.getClass();
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewPager.getChildAt(i);
            if (childAt instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) childAt;
                if (frameLayout.getChildCount() > 0) {
                    View childAt2 = frameLayout.getChildAt(0);
                    if (childAt2 instanceof IntlPrivilegeCard) {
                        ((IntlPrivilegeCard) childAt2).m58666u();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m167471t(@NotNull ArrayList<PurchaseType> purchaseTypes) {
        purchaseTypes.getClass();
        this.purchaseTypes = purchaseTypes;
        notifyDataSetChanged();
    }
}
