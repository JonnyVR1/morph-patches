package p006l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.PrivilegeBaseCard;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.view.AbstractC0450a;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u00020\u00162\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Ll/lti0;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/a;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/app/PutongFrag;)V", "", "getCount", "()I", "Landroid/view/View;", "view", "", "any", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/widget/FrameLayout;", "container", "position", "r", "(Landroid/widget/FrameLayout;I)Landroid/widget/FrameLayout;", "Landroid/view/ViewGroup;", "", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Lkotlin/collections/ArrayList;", "purchaseTypes", "s", "(Ljava/util/ArrayList;)V", "object", "setPrimaryItem", "f", "Lcom/p1/mobile/putong/app/PutongFrag;", "getFrag", "()Lcom/p1/mobile/putong/app/PutongFrag;", "", "g", "Ljava/util/List;", "getPurchaseTypes", "()Ljava/util/List;", "setPurchaseTypes", "(Ljava/util/List;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class lti0 extends AbstractC0450a {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final PutongFrag frag;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public List<? extends PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: l.lti0$a */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0992a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16644a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f16644a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lti0(@NotNull PutongFrag putongFrag) {
        putongFrag.getClass();
        Context contextRequireContext = putongFrag.requireContext();
        contextRequireContext.getClass();
        super(contextRequireContext);
        this.frag = putongFrag;
    }

    public int getCount() {
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @NotNull
    public CharSequence getPageTitle(int position) {
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list == null) {
            return "";
        }
        switch (C0992a.f16644a[list.get(position).ordinal()]) {
            case 1:
                return "青春专享会员";
            case 2:
                return "她专享会员";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                String string = this.frag.requireContext().getResources().getString(R$string.f2725mk);
                string.getClass();
                return string;
            case CameraSticker.STATE_ERROR /* 4 */:
                if (g6a.m15588k()) {
                    return "SVIP会员";
                }
                String string2 = this.frag.requireContext().getResources().getString(R$string.f1618C2);
                string2.getClass();
                return string2;
            case 5:
                return "黑金会员";
            case 6:
                return "白金会员";
            case 7:
                return "至尊合伙人";
            default:
                return "";
        }
    }

    public boolean isViewFromObject(@NotNull View view, @NotNull Object any) {
        view.getClass();
        any.getClass();
        return Intrinsics.d(view, any);
    }

    /* JADX INFO: renamed from: o */
    public void m19015o(@NotNull ViewGroup container, int position, @NotNull Object any) {
        container.getClass();
        any.getClass();
        container.removeView((View) any);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View, com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeBaseCard] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.view.AbstractC0450a
    @NotNull
    /* JADX INFO: renamed from: r */
    public FrameLayout mo10943r(@NotNull FrameLayout container, int position) {
        ?? r1;
        container.getClass();
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list == null) {
            return container;
        }
        if (g6a.m15592o() && ahl0.m11842t0(PurchaseType.TYPE_O_DIAMOND, position)) {
            Object objInflate = this.frag.act().inflater().inflate(f6c0.f11913O8, (ViewGroup) container, false);
            objInflate.getClass();
            r1 = (PrivilegeBaseCard) objInflate;
        } else {
            boolean zM11842t0 = ahl0.m11842t0(PurchaseType.TYPE_SUPREME_PARTNER, position);
            PutongFrag putongFrag = this.frag;
            if (zM11842t0) {
                Object objInflate2 = putongFrag.act().inflater().inflate(f6c0.f12242i9, (ViewGroup) container, false);
                objInflate2.getClass();
                r1 = (PrivilegeBaseCard) objInflate2;
            } else {
                Object objInflate3 = putongFrag.act().inflater().inflate(f6c0.f11897N8, (ViewGroup) container, false);
                objInflate3.getClass();
                r1 = (PrivilegeBaseCard) objInflate3;
            }
        }
        container.addView((View) r1, new ViewGroup.LayoutParams(-1, -1));
        r1.mo10307h0(this, this.frag, list.get(position));
        r1.mo10309j0();
        return container;
    }

    /* JADX INFO: renamed from: s */
    public final void m19016s(@NotNull ArrayList<PurchaseType> purchaseTypes) {
        purchaseTypes.getClass();
        this.purchaseTypes = purchaseTypes;
        notifyDataSetChanged();
    }

    public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.getClass();
        object.getClass();
        super/*l.w660*/.setPrimaryItem(container, position, object);
        if (object instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) object;
            if (frameLayout.getChildAt(0) instanceof PrivilegeBaseCard) {
                Object childAt = frameLayout.getChildAt(0);
                childAt.getClass();
                ((PrivilegeBaseCard) childAt).mo10308i0();
            }
        }
    }
}
