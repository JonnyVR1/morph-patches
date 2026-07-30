package com.p046p1.mobile.putong.core.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C0746b;
import androidx.viewpager2.widget.C0747c;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.yrm;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002C@B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010/\u001a\u00020\"¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105¢\u0006\u0004\b7\u00108J#\u0010:\u001a\u00020\r2\f\u00109\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\"2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010AR\u0014\u0010K\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u00060PR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010^R\u0016\u0010d\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010^R\u0016\u0010e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010AR\u0014\u0010f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010AR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010h¨\u0006j"}, m87232d2 = {"Lcom/p1/mobile/putong/core/view/banner/Banner;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startPosition", "", ResourceDirection.f38808v, "(I)V", "getRealCount", "()I", "position", "w", "(I)I", "getCurrentPager", Constants.KEY_LIMIT, "r", "(I)Lcom/p1/mobile/putong/core/view/banner/Banner;", "tlWidth", "brWidth", "pageMargin", Constants.KEY_T, "(III)Lcom/p1/mobile/putong/core/view/banner/Banner;", "Landroidx/viewpager2/widget/ViewPager2$k;", "transformer", "n", "(Landroidx/viewpager2/widget/ViewPager2$k;)Lcom/p1/mobile/putong/core/view/banner/Banner;", "", "clipChildren", "u", "(Z)Lcom/p1/mobile/putong/core/view/banner/Banner;", "Landroidx/viewpager2/widget/ViewPager2$i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, BLiveStormDanmakuGiftResourceType.f44446s, "(Landroidx/viewpager2/widget/ViewPager2$i;)Lcom/p1/mobile/putong/core/view/banner/Banner;", "Ll/yrm;", "indicator", "attachToRoot", "q", "(Ll/yrm;Z)Lcom/p1/mobile/putong/core/view/banner/Banner;", "smoothScroll", "p", "(IZ)V", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager2", "()Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "o", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;I)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "I", "NORMAL_COUNT", "b", "needPage", "c", "sidePage", Constants.INAPP_DATA_TAG, "tempPosition", "e", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "Landroidx/viewpager2/widget/b;", "f", "Landroidx/viewpager2/widget/b;", "compositePageTransformer", "Lcom/p1/mobile/putong/core/view/banner/Banner$a;", "g", "Lcom/p1/mobile/putong/core/view/banner/Banner$a;", "adapterWrapper", "h", "Landroidx/viewpager2/widget/ViewPager2$i;", "changeCallback", RXScreenCaptureService.KEY_INDEX, "Ll/yrm;", "j", "Z", "isBeginPagerChange", "", "k", "F", "startX", BLiveStormDanmakuGiftResourceType.f44444l, "startY", "m", "lastX", "lastY", "scaledTouchSlop", "pagerScrollDuration", "Landroidx/recyclerview/widget/RecyclerView$i;", "Landroidx/recyclerview/widget/RecyclerView$i;", "itemDataSetChangeObserver", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class Banner extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int NORMAL_COUNT;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int needPage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int sidePage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int tempPosition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ViewPager2 viewPager2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C0746b compositePageTransformer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C9167a adapterWrapper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public ViewPager2.AbstractC0740i changeCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public yrm indicator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isBeginPagerChange;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float startX;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public float startY;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float lastX;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public float lastY;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int scaledTouchSlop;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int pagerScrollDuration;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final RecyclerView.AbstractC0571i itemDataSetChangeObserver;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.Banner$a */
    @Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0019R\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013¨\u0006!"}, m87232d2 = {"Lcom/p1/mobile/putong/core/view/banner/Banner$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "<init>", "(Lcom/p1/mobile/putong/core/view/banner/Banner;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "", "getItemId", "(I)J", "adapter", "A", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "a", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", BaseSei.f13931Y, "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", BaseSei.f13932Z, "realCount", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class C9167a extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.Banner$a$a */
        @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"com/p1/mobile/putong/core/view/banner/Banner$a$a", "Landroidx/recyclerview/widget/RecyclerView$d0;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class a extends RecyclerView.AbstractC0566d0 {
            public a(View view) {
                super(view);
            }
        }

        public C9167a() {
        }

        /* JADX INFO: renamed from: A */
        public final void m59607A(@NotNull RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter) {
            adapter.getClass();
            RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter2 = this.adapter;
            if (adapter2 != null) {
                adapter2.unregisterAdapterDataObserver(Banner.this.itemDataSetChangeObserver);
            }
            this.adapter = adapter;
            if (adapter != null) {
                adapter.getClass();
                adapter.registerAdapterDataObserver(Banner.this.itemDataSetChangeObserver);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return m59609z() > 1 ? m59609z() + Banner.this.needPage : m59609z();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int position) {
            RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter = this.adapter;
            if (adapter == null) {
                return super.getItemId(position);
            }
            adapter.getClass();
            return adapter.getItemId(Banner.this.m59606w(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter = this.adapter;
            if (adapter == null) {
                return 0;
            }
            adapter.getClass();
            return adapter.getItemViewType(Banner.this.m59606w(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.AbstractC0566d0 holder, int position) {
            holder.getClass();
            RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter = this.adapter;
            if (adapter != null) {
                adapter.onBindViewHolder(holder, Banner.this.m59606w(position));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.AbstractC0566d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            parent.getClass();
            RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter = this.adapter;
            if (adapter == null) {
                return new a(new View(parent.getContext()));
            }
            adapter.getClass();
            RecyclerView.AbstractC0566d0 abstractC0566d0OnCreateViewHolder = adapter.onCreateViewHolder(parent, viewType);
            abstractC0566d0OnCreateViewHolder.getClass();
            return abstractC0566d0OnCreateViewHolder;
        }

        @Nullable
        /* JADX INFO: renamed from: y */
        public final RecyclerView.Adapter<RecyclerView.AbstractC0566d0> m59608y() {
            return this.adapter;
        }

        /* JADX INFO: renamed from: z */
        public final int m59609z() {
            RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter = this.adapter;
            if (adapter == null) {
                return 0;
            }
            adapter.getClass();
            return adapter.getItemCount();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.Banner$b */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/core/view/banner/Banner$b;", "Landroidx/viewpager2/widget/ViewPager2$i;", "<init>", "(Lcom/p1/mobile/putong/core/view/banner/Banner;)V", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public final class C9168b extends ViewPager2.AbstractC0740i {
        public C9168b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrollStateChanged(int state) {
            if (state == 1) {
                int i = Banner.this.tempPosition;
                int i2 = Banner.this.sidePage - 1;
                Banner banner = Banner.this;
                if (i == i2) {
                    banner.isBeginPagerChange = false;
                    Banner.this.viewPager2.m4250j(Banner.this.getRealCount() + Banner.this.tempPosition, false);
                } else {
                    int i3 = banner.tempPosition;
                    int realCount = Banner.this.getRealCount() + Banner.this.sidePage;
                    Banner banner2 = Banner.this;
                    if (i3 == realCount) {
                        banner2.isBeginPagerChange = false;
                        Banner.this.viewPager2.m4250j(Banner.this.sidePage, false);
                    } else {
                        banner2.isBeginPagerChange = true;
                    }
                }
            }
            ViewPager2.AbstractC0740i abstractC0740i = Banner.this.changeCallback;
            if (abstractC0740i != null) {
                abstractC0740i.onPageScrollStateChanged(state);
            }
            yrm yrmVar = Banner.this.indicator;
            if (yrmVar != null) {
                yrmVar.onPageScrollStateChanged(state);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            int iM59606w = Banner.this.m59606w(position);
            ViewPager2.AbstractC0740i abstractC0740i = Banner.this.changeCallback;
            if (abstractC0740i != null) {
                abstractC0740i.onPageScrolled(iM59606w, positionOffset, positionOffsetPixels);
            }
            yrm yrmVar = Banner.this.indicator;
            if (yrmVar != null) {
                yrmVar.onPageScrolled(iM59606w, positionOffset, positionOffsetPixels);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int position) {
            if (Banner.this.getRealCount() > 1) {
                Banner.this.tempPosition = position;
            }
            if (Banner.this.isBeginPagerChange) {
                int iM59606w = Banner.this.m59606w(position);
                ViewPager2.AbstractC0740i abstractC0740i = Banner.this.changeCallback;
                if (abstractC0740i != null) {
                    abstractC0740i.onPageSelected(iM59606w);
                }
                yrm yrmVar = Banner.this.indicator;
                if (yrmVar != null) {
                    yrmVar.onPageSelected(iM59606w);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.Banner$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"com/p1/mobile/putong/core/view/banner/Banner$c", "Landroidx/recyclerview/widget/RecyclerView$i;", "", "positionStart", "itemCount", "", "payload", "", "onItemRangeChanged", "(IILjava/lang/Object;)V", "onItemRangeInserted", "(II)V", "fromPosition", "toPosition", "onItemRangeMoved", "(III)V", "onChanged", "()V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C9169c extends RecyclerView.AbstractC0571i {
        public C9169c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onChanged() {
            Banner banner = Banner.this;
            banner.m59605v(banner.getCurrentPager());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeInserted(int positionStart, int itemCount) {
            if (positionStart > 1) {
                onChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            onChanged();
        }
    }

    public Banner(@Nullable Context context) {
        super(context);
        this.NORMAL_COUNT = 2;
        this.needPage = 2;
        this.sidePage = 2 / 2;
        ViewPager2 viewPager2 = new ViewPager2(getContext());
        this.viewPager2 = viewPager2;
        C0746b c0746b = new C0746b();
        this.compositePageTransformer = c0746b;
        this.adapterWrapper = new C9167a();
        this.isBeginPagerChange = true;
        this.pagerScrollDuration = 800;
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() >> 1;
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setPageTransformer(c0746b);
        viewPager2.m4247g(new C9168b());
        m59601r(1);
        addView(viewPager2);
        this.itemDataSetChangeObserver = new C9169c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealCount() {
        return this.adapterWrapper.m59609z();
    }

    @Nullable
    public final RecyclerView.Adapter<RecyclerView.AbstractC0566d0> getAdapter() {
        return this.adapterWrapper.m59608y();
    }

    public final int getCurrentPager() {
        return Math.max(m59606w(this.tempPosition), 0);
    }

    @NotNull
    public final ViewPager2 getViewPager2() {
        return this.viewPager2;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final Banner m59597n(@NotNull ViewPager2.InterfaceC0742k transformer) {
        transformer.getClass();
        this.compositePageTransformer.m4289b(transformer);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m59598o(@NotNull RecyclerView.Adapter<RecyclerView.AbstractC0566d0> adapter, int startPosition) {
        adapter.getClass();
        this.adapterWrapper.m59607A(adapter);
        m59605v(startPosition);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 3) goto L34;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r7) {
        /*
            r6 = this;
            r7.getClass()
            int r0 = r7.getAction()
            if (r0 == 0) goto L85
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            r3 = 2
            if (r0 == r3) goto L15
            r3 = 3
            if (r0 == r3) goto L62
            goto L95
        L15:
            float r0 = r7.getRawX()
            r6.lastX = r0
            float r0 = r7.getRawY()
            r6.lastY = r0
            androidx.viewpager2.widget.ViewPager2 r0 = r6.viewPager2
            boolean r0 = r0.m4245e()
            if (r0 == 0) goto L95
            float r0 = r6.lastX
            float r3 = r6.startX
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r6.lastY
            float r4 = r6.startY
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            androidx.viewpager2.widget.ViewPager2 r4 = r6.viewPager2
            int r4 = r4.getOrientation()
            int r5 = r6.scaledTouchSlop
            if (r4 != 0) goto L50
            float r4 = (float) r5
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L5a
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5a
        L4e:
            r1 = r2
            goto L5a
        L50:
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L5a
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5a
            goto L4e
        L5a:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L95
        L62:
            float r7 = r6.lastX
            float r0 = r6.startX
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r0 = r6.scaledTouchSlop
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L84
            float r7 = r6.lastY
            float r0 = r6.startY
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r6 = r6.scaledTouchSlop
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 <= 0) goto L83
            goto L84
        L83:
            return r1
        L84:
            return r2
        L85:
            float r0 = r7.getRawX()
            r6.lastX = r0
            r6.startX = r0
            float r0 = r7.getRawY()
            r6.lastY = r0
            r6.startY = r0
        L95:
            boolean r6 = super.onInterceptTouchEvent(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.putong.core.view.banner.Banner.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    public final void m59599p(int position, boolean smoothScroll) {
        int i = position + this.sidePage;
        this.tempPosition = i;
        this.viewPager2.m4250j(i, smoothScroll);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final Banner m59600q(@Nullable yrm indicator, boolean attachToRoot) {
        yrm yrmVar = this.indicator;
        if (yrmVar != null) {
            removeView(yrmVar.getView());
        }
        if (indicator != null) {
            this.indicator = indicator;
            if (attachToRoot) {
                addView(indicator.getView(), indicator.getParams());
            }
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final Banner m59601r(int limit) {
        this.viewPager2.setOffscreenPageLimit(limit);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final Banner m59602s(@Nullable ViewPager2.AbstractC0740i listener) {
        this.changeCallback = listener;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final Banner m59603t(int tlWidth, int brWidth, int pageMargin) {
        if (pageMargin < 0) {
            pageMargin = 0;
        }
        m59597n(new C0747c(pageMargin));
        View childAt = this.viewPager2.getChildAt(0);
        childAt.getClass();
        RecyclerView recyclerView = (RecyclerView) childAt;
        recyclerView.getRecycledViewPool().m3431m(0, 0);
        if (this.viewPager2.getOrientation() == 1) {
            recyclerView.setPadding(this.viewPager2.getPaddingLeft(), tlWidth + Math.abs(pageMargin), this.viewPager2.getPaddingRight(), brWidth + Math.abs(pageMargin));
        } else {
            recyclerView.setPadding(tlWidth + Math.abs(pageMargin), this.viewPager2.getPaddingTop(), brWidth + Math.abs(pageMargin), this.viewPager2.getPaddingBottom());
        }
        recyclerView.setClipToPadding(false);
        int i = this.NORMAL_COUNT;
        this.needPage = i + i;
        this.sidePage = i;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final Banner m59604u(boolean clipChildren) {
        this.viewPager2.setClipChildren(clipChildren);
        View childAt = this.viewPager2.getChildAt(0);
        childAt.getClass();
        ((RecyclerView) childAt).setClipChildren(clipChildren);
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final void m59605v(int startPosition) {
        if (this.sidePage == this.NORMAL_COUNT) {
            this.viewPager2.setAdapter(this.adapterWrapper);
        } else {
            this.adapterWrapper.notifyDataSetChanged();
        }
        m59599p(startPosition, false);
        yrm yrmVar = this.indicator;
        if (yrmVar != null) {
            yrmVar.mo59610a(getRealCount(), getCurrentPager());
        }
    }

    /* JADX INFO: renamed from: w */
    public final int m59606w(int position) {
        int realCount = getRealCount() > 1 ? (position - this.sidePage) % getRealCount() : 0;
        return realCount < 0 ? realCount + getRealCount() : realCount;
    }

    public Banner(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.NORMAL_COUNT = 2;
        this.needPage = 2;
        this.sidePage = 2 / 2;
        ViewPager2 viewPager2 = new ViewPager2(getContext());
        this.viewPager2 = viewPager2;
        C0746b c0746b = new C0746b();
        this.compositePageTransformer = c0746b;
        this.adapterWrapper = new C9167a();
        this.isBeginPagerChange = true;
        this.pagerScrollDuration = 800;
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() >> 1;
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setPageTransformer(c0746b);
        viewPager2.m4247g(new C9168b());
        m59601r(1);
        addView(viewPager2);
        this.itemDataSetChangeObserver = new C9169c();
    }

    public Banner(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NORMAL_COUNT = 2;
        this.needPage = 2;
        this.sidePage = 2 / 2;
        ViewPager2 viewPager2 = new ViewPager2(getContext());
        this.viewPager2 = viewPager2;
        C0746b c0746b = new C0746b();
        this.compositePageTransformer = c0746b;
        this.adapterWrapper = new C9167a();
        this.isBeginPagerChange = true;
        this.pagerScrollDuration = 800;
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() >> 1;
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setPageTransformer(c0746b);
        viewPager2.m4247g(new C9168b());
        m59601r(1);
        addView(viewPager2);
        this.itemDataSetChangeObserver = new C9169c();
    }
}
