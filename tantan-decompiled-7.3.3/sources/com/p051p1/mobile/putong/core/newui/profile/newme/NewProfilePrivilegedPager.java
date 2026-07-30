package com.p051p1.mobile.putong.core.newui.profile.newme;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VLinear;
import p153l.bnl0;
import p153l.gta;
import p153l.kec0;
import p153l.lb2;
import p153l.p9r;
import p153l.qa00;
import p153l.vnb;
import p153l.wf40;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0012(B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010%J\u0015\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010%J\u001f\u0010+\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010,R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00109\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010BR\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "Landroid/widget/FrameLayout;", "Landroidx/viewpager/widget/ViewPager$j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "force", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/app/PutongFrag;Ljava/util/List;Z)Z", "p0", "", "p1", "p2", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "onPageScrollStateChanged", "position", "b", "size", "content", "c", "(II)F", "Lv/VLinear;", "Lv/VLinear;", "get_container", "()Lv/VLinear;", "set_container", "(Lv/VLinear;)V", "_container", "Landroid/view/View;", "get_empty", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroidx/viewpager/widget/ViewPager;", "Landroidx/viewpager/widget/ViewPager;", "get_privilege_pager", "()Landroidx/viewpager/widget/ViewPager;", "set_privilege_pager", "(Landroidx/viewpager/widget/ViewPager;)V", "_privilege_pager", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$a;", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$a;", "adapter", "e", "I", "with", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class NewProfilePrivilegedPager extends FrameLayout implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VLinear _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ViewPager _privilege_pager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public C8373a adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int with;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager$a */
    @Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$a;", "Ll/lb2;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "<init>", "(Lcom/p1/mobile/putong/app/PutongFrag;Ljava/util/List;)V", "", "object", "", "getItemPosition", "(Ljava/lang/Object;)I", "getCount", "()I", "Landroid/view/View;", "p0", "p1", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "m", "(Ljava/lang/Object;)V", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "setPrimaryItem", "q", "e", "Lcom/p1/mobile/putong/app/PutongFrag;", "getFrag", "()Lcom/p1/mobile/putong/app/PutongFrag;", "f", "Ljava/util/List;", "r", "()Ljava/util/List;", "g", "I", "currentPosition", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8373a extends lb2 {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final PutongFrag frag;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<PurchaseType> purchaseTypes;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public int currentPosition;

        public C8373a(@NotNull PutongFrag putongFrag, @NotNull List<PurchaseType> list) {
            putongFrag.getClass();
            list.getClass();
            this.frag = putongFrag;
            this.purchaseTypes = list;
            this.currentPosition = -1;
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.purchaseTypes.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(@NotNull Object object) {
            object.getClass();
            return -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NotNull View p0, @NotNull Object p1) {
            p0.getClass();
            p1.getClass();
            return Intrinsics.m88377d(p1, p0);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: m */
        public void mo44299m(@Nullable Object object) {
            super.mo44299m(object);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(@NotNull ViewGroup container, int position, @Nullable Object object) {
            container.getClass();
            container.removeView((View) object);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.lb2
        @NotNull
        /* JADX INFO: renamed from: p */
        public Object mo40046p(@NotNull ViewGroup container, int position) {
            container.getClass();
            View viewInflate = p9r.m171370a(container.getContext()).inflate(m44300q(), (ViewGroup) null);
            if (viewInflate instanceof InterfaceC8374b) {
                ((InterfaceC8374b) viewInflate).mo44285X(this.purchaseTypes.size(), this.frag, this.purchaseTypes.get(position));
            }
            container.setClipChildren(false);
            container.setClipToPadding(false);
            container.addView(viewInflate);
            viewInflate.getClass();
            return viewInflate;
        }

        /* JADX INFO: renamed from: q */
        public final int m44300q() {
            return kec0.f125725Z4;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final List<PurchaseType> m44301r() {
            return this.purchaseTypes;
        }

        @Override // p153l.cf60
        public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            container.getClass();
            object.getClass();
            super.setPrimaryItem(container, position, object);
            if (!(object instanceof NewPrivilegeCard) || this.currentPosition == position) {
                return;
            }
            ((NewPrivilegeCard) object).m44291p0();
            this.currentPosition = position;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager$b */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$b;", "", "", "count", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "X", "(ILcom/p1/mobile/putong/app/PutongFrag;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC8374b {
        /* JADX INFO: renamed from: X */
        void mo44285X(int count, @NotNull PutongFrag frag, @NotNull PurchaseType purchaseType);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager$c */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8375c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27347a;

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
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27347a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfilePrivilegedPager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.with = bnl0.m105592y0() - qa00.m175859d(72.0f);
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        addView(m44295a(layoutInflaterM171370a, this));
        get_privilege_pager().m4187d(this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m44295a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM206046b = wf40.m206046b(this, inflater, parent);
        viewM206046b.getClass();
        return viewM206046b;
    }

    /* JADX INFO: renamed from: b */
    public final void m44296b(int position) {
        if (position != -1) {
            get_privilege_pager().setCurrentItem(position);
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m44297c(int size, int content) {
        return vnb.m201955o1(size, CoreModule.f18263b.getString(content)) / this.with;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m44298d(@NotNull PutongFrag frag, @NotNull List<PurchaseType> purchaseTypes, boolean force) {
        frag.getClass();
        purchaseTypes.getClass();
        C8373a c8373a = this.adapter;
        C8373a c8373a2 = null;
        if (c8373a != null && !force) {
            if (c8373a == null) {
                Intrinsics.m88391r("adapter");
                c8373a = null;
            }
            if (Intrinsics.m88377d(c8373a.m44301r(), purchaseTypes)) {
                return false;
            }
        }
        int iM175859d = qa00.m175859d(150.0f);
        for (PurchaseType purchaseType : purchaseTypes) {
            int i = C8375c.f27347a[purchaseType.ordinal()];
            if (i == 1 || i == 2) {
                if (m44297c(12, purchaseType == PurchaseType.TYPE_GET_VIP ? gta.m132210e().m132214d().mo34737Oi() ? R$string.f19364jb : R$string.f19335ib : R$string.f19279gh) > 2.0f && iM175859d < qa00.m175859d(163.0f)) {
                    iM175859d = qa00.m175859d(163.0f);
                }
            }
        }
        bnl0.m105505C0(get_privilege_pager(), iM175859d);
        if (purchaseTypes.size() >= 2) {
            bnl0.m105507D0(bnl0.m105592y0() - qa00.m175859d(32.0f), get_privilege_pager());
            get_privilege_pager().setPageMargin(qa00.m175859d(8.0f));
        } else {
            bnl0.m105507D0(bnl0.m105592y0() - qa00.m175859d(24.0f), get_privilege_pager());
        }
        bnl0.m105524M(get_empty(), false);
        this.adapter = new C8373a(frag, purchaseTypes);
        ViewPager viewPager = get_privilege_pager();
        C8373a c8373a3 = this.adapter;
        if (c8373a3 == null) {
            Intrinsics.m88391r("adapter");
            c8373a3 = null;
        }
        viewPager.setAdapter(c8373a3);
        get_privilege_pager().setOffscreenPageLimit(3);
        C8373a c8373a4 = this.adapter;
        if (c8373a4 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            c8373a2 = c8373a4;
        }
        c8373a2.notifyDataSetChanged();
        return true;
    }

    @NotNull
    public final VLinear get_container() {
        VLinear vLinear = this._container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    public final View get_empty() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    public final ViewPager get_privilege_pager() {
        ViewPager viewPager = this._privilege_pager;
        if (viewPager != null) {
            return viewPager;
        }
        Intrinsics.m88391r("_privilege_pager");
        return null;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int p0) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int p0, float p1, int p2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int p0) {
        C8373a c8373a = this.adapter;
        C8373a c8373a2 = null;
        if (c8373a == null) {
            Intrinsics.m88391r("adapter");
            c8373a = null;
        }
        if (c8373a.getCount() > 1) {
            C8373a c8373a3 = this.adapter;
            if (c8373a3 == null) {
                Intrinsics.m88391r("adapter");
            } else {
                c8373a2 = c8373a3;
            }
            if (p0 == c8373a2.getCount() - 1) {
                bnl0.m105524M(get_empty(), true);
                return;
            }
        }
        bnl0.m105524M(get_empty(), false);
    }

    public final void set_container(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._container = vLinear;
    }

    public final void set_empty(@NotNull View view) {
        view.getClass();
        this._empty = view;
    }

    public final void set_privilege_pager(@NotNull ViewPager viewPager) {
        viewPager.getClass();
        this._privilege_pager = viewPager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewProfilePrivilegedPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewProfilePrivilegedPager(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
