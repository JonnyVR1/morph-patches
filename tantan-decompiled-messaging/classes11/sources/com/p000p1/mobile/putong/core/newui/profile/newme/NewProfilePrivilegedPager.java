package com.p000p1.mobile.putong.core.newui.profile.newme;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.eb2;
import l.f6c0;
import l.hmb;
import l.i740;
import l.t100;
import l.ura;
import l.w660;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.o7r;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0012(B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010%J\u0015\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010%J\u001f\u0010+\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010,R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00109\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010BR\u0014\u0010F\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager;", "Landroid/widget/FrameLayout;", "Landroidx/viewpager/widget/ViewPager$j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "force", "d", "(Lcom/p1/mobile/putong/app/PutongFrag;Ljava/util/List;Z)Z", "p0", "", "p1", "p2", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "onPageScrollStateChanged", "position", "b", "size", "content", "c", "(II)F", "Lv/VLinear;", "Lv/VLinear;", "get_container", "()Lv/VLinear;", "set_container", "(Lv/VLinear;)V", "_container", "Landroid/view/View;", "get_empty", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroidx/viewpager/widget/ViewPager;", "Landroidx/viewpager/widget/ViewPager;", "get_privilege_pager", "()Landroidx/viewpager/widget/ViewPager;", "set_privilege_pager", "(Landroidx/viewpager/widget/ViewPager;)V", "_privilege_pager", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$a;", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$a;", "adapter", "e", "I", "with", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewProfilePrivilegedPager extends FrameLayout implements ViewPager.j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VLinear _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ViewPager _privilege_pager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public C0386a adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int with;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager$a */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$a;", "Ll/eb2;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "<init>", "(Lcom/p1/mobile/putong/app/PutongFrag;Ljava/util/List;)V", "", "object", "", "getItemPosition", "(Ljava/lang/Object;)I", "getCount", "()I", "Landroid/view/View;", "p0", "p1", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "p", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "", "m", "(Ljava/lang/Object;)V", "o", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "setPrimaryItem", "q", "e", "Lcom/p1/mobile/putong/app/PutongFrag;", "getFrag", "()Lcom/p1/mobile/putong/app/PutongFrag;", "f", "Ljava/util/List;", "r", "()Ljava/util/List;", "g", "I", "currentPosition", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0386a extends eb2 {

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final PutongFrag frag;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final List<PurchaseType> purchaseTypes;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public int currentPosition;

        public C0386a(@NotNull PutongFrag putongFrag, @NotNull List<PurchaseType> list) {
            putongFrag.getClass();
            list.getClass();
            this.frag = putongFrag;
            this.purchaseTypes = list;
            this.currentPosition = -1;
        }

        public int getCount() {
            return this.purchaseTypes.size();
        }

        public int getItemPosition(@NotNull Object object) {
            object.getClass();
            return -2;
        }

        public boolean isViewFromObject(@NotNull View p0, @NotNull Object p1) {
            p0.getClass();
            p1.getClass();
            return Intrinsics.d(p1, p0);
        }

        /* JADX INFO: renamed from: m */
        public void m7505m(@Nullable Object object) {
            super.m(object);
        }

        /* JADX INFO: renamed from: o */
        public void m7506o(@NotNull ViewGroup container, int position, @Nullable Object object) {
            container.getClass();
            container.removeView((View) object);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: p */
        public Object m7507p(@NotNull ViewGroup container, int position) {
            container.getClass();
            View viewInflate = o7r.m19649a(container.getContext()).inflate(m7508q(), (ViewGroup) null);
            if (viewInflate instanceof InterfaceC0387b) {
                ((InterfaceC0387b) viewInflate).mo7495X(this.purchaseTypes.size(), this.frag, this.purchaseTypes.get(position));
            }
            container.setClipChildren(false);
            container.setClipToPadding(false);
            container.addView(viewInflate);
            viewInflate.getClass();
            return viewInflate;
        }

        /* JADX INFO: renamed from: q */
        public final int m7508q() {
            return f6c0.Y4;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final List<PurchaseType> m7509r() {
            return this.purchaseTypes;
        }

        public void setPrimaryItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            container.getClass();
            object.getClass();
            super/*l.w660*/.setPrimaryItem(container, position, object);
            if (!(object instanceof NewPrivilegeCard) || this.currentPosition == position) {
                return;
            }
            ((NewPrivilegeCard) object).m7498m0();
            this.currentPosition = position;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager$b */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$b;", "", "", "count", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "X", "(ILcom/p1/mobile/putong/app/PutongFrag;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0387b {
        /* JADX INFO: renamed from: X */
        void mo7495X(int count, @NotNull PutongFrag frag, @NotNull PurchaseType purchaseType);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager$c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0388c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5383a;

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
            f5383a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfilePrivilegedPager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.with = xdl0.y0() - t100.d(72.0f);
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(getContext());
        layoutInflaterM19649a.getClass();
        addView(m7501a(layoutInflaterM19649a, this));
        get_privilege_pager().d(this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m7501a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = i740.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: b */
    public final void m7502b(int position) {
        if (position != -1) {
            get_privilege_pager().setCurrentItem(position);
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m7503c(int size, int content) {
        return hmb.o1(size, CoreModule.b.getString(content)) / this.with;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7504d(@NotNull PutongFrag frag, @NotNull List<PurchaseType> purchaseTypes, boolean force) {
        frag.getClass();
        purchaseTypes.getClass();
        C0386a c0386a = this.adapter;
        w660 w660Var = null;
        if (c0386a != null && !force) {
            if (c0386a == null) {
                Intrinsics.r("adapter");
                c0386a = null;
            }
            if (Intrinsics.d(c0386a.m7509r(), purchaseTypes)) {
                return false;
            }
        }
        int iD = t100.d(150.0f);
        for (PurchaseType purchaseType : purchaseTypes) {
            int i = C0388c.f5383a[purchaseType.ordinal()];
            if (i == 1 || i == 2) {
                if (m7503c(12, purchaseType == PurchaseType.TYPE_GET_VIP ? ura.e().d().Oi() ? R.string.Va : R.string.Ua : R.string.Mg) > 2.0f && iD < t100.d(163.0f)) {
                    iD = t100.d(163.0f);
                }
            }
        }
        xdl0.C0(get_privilege_pager(), iD);
        if (purchaseTypes.size() >= 2) {
            xdl0.D0(xdl0.y0() - t100.d(32.0f), new View[]{get_privilege_pager()});
            get_privilege_pager().setPageMargin(t100.d(8.0f));
        } else {
            xdl0.D0(xdl0.y0() - t100.d(24.0f), new View[]{get_privilege_pager()});
        }
        xdl0.M(get_empty(), false);
        this.adapter = new C0386a(frag, purchaseTypes);
        ViewPager viewPager = get_privilege_pager();
        w660 w660Var2 = this.adapter;
        if (w660Var2 == null) {
            Intrinsics.r("adapter");
            w660Var2 = null;
        }
        viewPager.setAdapter(w660Var2);
        get_privilege_pager().setOffscreenPageLimit(3);
        w660 w660Var3 = this.adapter;
        if (w660Var3 == null) {
            Intrinsics.r("adapter");
        } else {
            w660Var = w660Var3;
        }
        w660Var.notifyDataSetChanged();
        return true;
    }

    @NotNull
    public final VLinear get_container() {
        VLinear vLinear = this._container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_container");
        return null;
    }

    @NotNull
    public final View get_empty() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    public final ViewPager get_privilege_pager() {
        ViewPager viewPager = this._privilege_pager;
        if (viewPager != null) {
            return viewPager;
        }
        Intrinsics.r("_privilege_pager");
        return null;
    }

    public void onPageScrollStateChanged(int p0) {
    }

    public void onPageScrolled(int p0, float p1, int p2) {
    }

    public void onPageSelected(int p0) {
        C0386a c0386a = this.adapter;
        C0386a c0386a2 = null;
        if (c0386a == null) {
            Intrinsics.r("adapter");
            c0386a = null;
        }
        if (c0386a.getCount() > 1) {
            C0386a c0386a3 = this.adapter;
            if (c0386a3 == null) {
                Intrinsics.r("adapter");
            } else {
                c0386a2 = c0386a3;
            }
            if (p0 == c0386a2.getCount() - 1) {
                xdl0.M(get_empty(), true);
                return;
            }
        }
        xdl0.M(get_empty(), false);
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
