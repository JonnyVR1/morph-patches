package com.p051p1.mobile.putong.core.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C0748b;
import androidx.viewpager2.widget.C0749c;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aum;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002C@B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010/\u001a\u00020\"¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105¢\u0006\u0004\b7\u00108J#\u0010:\u001a\u00020\r2\f\u00109\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\"2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010AR\u0014\u0010K\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u00060PR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010^R\u0016\u0010d\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010^R\u0016\u0010e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010AR\u0014\u0010f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010AR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010h¨\u0006j"}, m88121d2 = {"Lcom/p1/mobile/putong/core/view/banner/Banner;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startPosition", "", ResourceDirection.f39656v, "(I)V", "getRealCount", "()I", "position", "w", "(I)I", "getCurrentPager", Constants.KEY_LIMIT, "r", "(I)Lcom/p1/mobile/putong/core/view/banner/Banner;", "tlWidth", "brWidth", "pageMargin", Constants.KEY_T, "(III)Lcom/p1/mobile/putong/core/view/banner/Banner;", "Landroidx/viewpager2/widget/ViewPager2$k;", "transformer", "n", "(Landroidx/viewpager2/widget/ViewPager2$k;)Lcom/p1/mobile/putong/core/view/banner/Banner;", "", "clipChildren", "u", "(Z)Lcom/p1/mobile/putong/core/view/banner/Banner;", "Landroidx/viewpager2/widget/ViewPager2$i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, BLiveStormDanmakuGiftResourceType.f45294s, "(Landroidx/viewpager2/widget/ViewPager2$i;)Lcom/p1/mobile/putong/core/view/banner/Banner;", "Ll/aum;", "indicator", "attachToRoot", "q", "(Ll/aum;Z)Lcom/p1/mobile/putong/core/view/banner/Banner;", "smoothScroll", "p", "(IZ)V", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager2", "()Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "o", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;I)V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "I", "NORMAL_COUNT", "b", "needPage", "c", "sidePage", Constants.INAPP_DATA_TAG, "tempPosition", "e", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "Landroidx/viewpager2/widget/b;", "f", "Landroidx/viewpager2/widget/b;", "compositePageTransformer", "Lcom/p1/mobile/putong/core/view/banner/Banner$a;", "g", "Lcom/p1/mobile/putong/core/view/banner/Banner$a;", "adapterWrapper", "h", "Landroidx/viewpager2/widget/ViewPager2$i;", "changeCallback", RXScreenCaptureService.KEY_INDEX, "Ll/aum;", "j", "Z", "isBeginPagerChange", "", "k", "F", "startX", BLiveStormDanmakuGiftResourceType.f45292l, "startY", "m", "lastX", "lastY", "scaledTouchSlop", "pagerScrollDuration", "Landroidx/recyclerview/widget/RecyclerView$i;", "Landroidx/recyclerview/widget/RecyclerView$i;", "itemDataSetChangeObserver", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public final C0748b compositePageTransformer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C9330a adapterWrapper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public ViewPager2.AbstractC0742i changeCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public aum indicator;

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
    public final RecyclerView.AbstractC0573i itemDataSetChangeObserver;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.Banner$a */
    @Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0019R\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013¨\u0006!"}, m88121d2 = {"Lcom/p1/mobile/putong/core/view/banner/Banner$a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "<init>", "(Lcom/p1/mobile/putong/core/view/banner/Banner;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "", "getItemId", "(I)J", "adapter", "A", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "a", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", BaseSei.f14625Y, "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setAdapter", BaseSei.f14626Z, "realCount", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class C9330a extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.Banner$a$a */
        @Metadata(m88120d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"com/p1/mobile/putong/core/view/banner/Banner$a$a", "Landroidx/recyclerview/widget/RecyclerView$e0;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
        public static final class a extends RecyclerView.AbstractC0569e0 {
            public a(View view) {
                super(view);
            }
        }

        public C9330a() {
        }

        /* JADX INFO: renamed from: A */
        public final void m60791A(@NotNull RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter) {
            adapter.getClass();
            RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter2 = this.adapter;
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
            return m60793z() > 1 ? m60793z() + Banner.this.needPage : m60793z();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int position) {
            RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter = this.adapter;
            if (adapter == null) {
                return super.getItemId(position);
            }
            adapter.getClass();
            return adapter.getItemId(Banner.this.m60790w(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter = this.adapter;
            if (adapter == null) {
                return 0;
            }
            adapter.getClass();
            return adapter.getItemViewType(Banner.this.m60790w(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.AbstractC0569e0 holder, int position) {
            holder.getClass();
            RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter = this.adapter;
            if (adapter != null) {
                adapter.onBindViewHolder(holder, Banner.this.m60790w(position));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.AbstractC0569e0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            parent.getClass();
            RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter = this.adapter;
            if (adapter == null) {
                return new a(new View(parent.getContext()));
            }
            adapter.getClass();
            RecyclerView.AbstractC0569e0 abstractC0569e0OnCreateViewHolder = adapter.onCreateViewHolder(parent, viewType);
            abstractC0569e0OnCreateViewHolder.getClass();
            return abstractC0569e0OnCreateViewHolder;
        }

        @Nullable
        /* JADX INFO: renamed from: y */
        public final RecyclerView.Adapter<RecyclerView.AbstractC0569e0> m60792y() {
            return this.adapter;
        }

        /* JADX INFO: renamed from: z */
        public final int m60793z() {
            RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter = this.adapter;
            if (adapter == null) {
                return 0;
            }
            adapter.getClass();
            return adapter.getItemCount();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.Banner$b */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m88121d2 = {"Lcom/p1/mobile/putong/core/view/banner/Banner$b;", "Landroidx/viewpager2/widget/ViewPager2$i;", "<init>", "(Lcom/p1/mobile/putong/core/view/banner/Banner;)V", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class C9331b extends ViewPager2.AbstractC0742i {
        public C9331b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrollStateChanged(int state) {
            if (state == 1) {
                int i = Banner.this.tempPosition;
                int i2 = Banner.this.sidePage - 1;
                Banner banner = Banner.this;
                if (i == i2) {
                    banner.isBeginPagerChange = false;
                    Banner.this.viewPager2.m4252j(Banner.this.getRealCount() + Banner.this.tempPosition, false);
                } else {
                    int i3 = banner.tempPosition;
                    int realCount = Banner.this.getRealCount() + Banner.this.sidePage;
                    Banner banner2 = Banner.this;
                    if (i3 == realCount) {
                        banner2.isBeginPagerChange = false;
                        Banner.this.viewPager2.m4252j(Banner.this.sidePage, false);
                    } else {
                        banner2.isBeginPagerChange = true;
                    }
                }
            }
            ViewPager2.AbstractC0742i abstractC0742i = Banner.this.changeCallback;
            if (abstractC0742i != null) {
                abstractC0742i.onPageScrollStateChanged(state);
            }
            aum aumVar = Banner.this.indicator;
            if (aumVar != null) {
                aumVar.onPageScrollStateChanged(state);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            int iM60790w = Banner.this.m60790w(position);
            ViewPager2.AbstractC0742i abstractC0742i = Banner.this.changeCallback;
            if (abstractC0742i != null) {
                abstractC0742i.onPageScrolled(iM60790w, positionOffset, positionOffsetPixels);
            }
            aum aumVar = Banner.this.indicator;
            if (aumVar != null) {
                aumVar.onPageScrolled(iM60790w, positionOffset, positionOffsetPixels);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int position) {
            if (Banner.this.getRealCount() > 1) {
                Banner.this.tempPosition = position;
            }
            if (Banner.this.isBeginPagerChange) {
                int iM60790w = Banner.this.m60790w(position);
                ViewPager2.AbstractC0742i abstractC0742i = Banner.this.changeCallback;
                if (abstractC0742i != null) {
                    abstractC0742i.onPageSelected(iM60790w);
                }
                aum aumVar = Banner.this.indicator;
                if (aumVar != null) {
                    aumVar.onPageSelected(iM60790w);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.banner.Banner$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"com/p1/mobile/putong/core/view/banner/Banner$c", "Landroidx/recyclerview/widget/RecyclerView$i;", "", "positionStart", "itemCount", "", "payload", "", "onItemRangeChanged", "(IILjava/lang/Object;)V", "onItemRangeInserted", "(II)V", "fromPosition", "toPosition", "onItemRangeMoved", "(III)V", "onChanged", "()V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C9332c extends RecyclerView.AbstractC0573i {
        public C9332c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onChanged() {
            Banner banner = Banner.this;
            banner.m60789v(banner.getCurrentPager());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public void onItemRangeInserted(int positionStart, int itemCount) {
            if (positionStart > 1) {
                onChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
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
        C0748b c0748b = new C0748b();
        this.compositePageTransformer = c0748b;
        this.adapterWrapper = new C9330a();
        this.isBeginPagerChange = true;
        this.pagerScrollDuration = 800;
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() >> 1;
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setPageTransformer(c0748b);
        viewPager2.m4249g(new C9331b());
        m60785r(1);
        addView(viewPager2);
        this.itemDataSetChangeObserver = new C9332c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealCount() {
        return this.adapterWrapper.m60793z();
    }

    @Nullable
    public final RecyclerView.Adapter<RecyclerView.AbstractC0569e0> getAdapter() {
        return this.adapterWrapper.m60792y();
    }

    public final int getCurrentPager() {
        return Math.max(m60790w(this.tempPosition), 0);
    }

    @NotNull
    public final ViewPager2 getViewPager2() {
        return this.viewPager2;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final Banner m60781n(@NotNull ViewPager2.InterfaceC0744k transformer) {
        transformer.getClass();
        this.compositePageTransformer.m4291b(transformer);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m60782o(@NotNull RecyclerView.Adapter<RecyclerView.AbstractC0569e0> adapter, int startPosition) {
        adapter.getClass();
        this.adapterWrapper.m60791A(adapter);
        m60789v(startPosition);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 3) goto L34;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        int action = ev.getAction();
        if (action != 0) {
            boolean z = false;
            if (action != 1) {
                if (action == 2) {
                    this.lastX = ev.getRawX();
                    this.lastY = ev.getRawY();
                    if (this.viewPager2.m4247e()) {
                        float fAbs = Math.abs(this.lastX - this.startX);
                        float fAbs2 = Math.abs(this.lastY - this.startY);
                        int orientation = this.viewPager2.getOrientation();
                        int i = this.scaledTouchSlop;
                        if (orientation != 0 ? !(fAbs2 <= i || fAbs2 <= fAbs) : !(fAbs <= i || fAbs <= fAbs2)) {
                            z = true;
                        }
                        getParent().requestDisallowInterceptTouchEvent(z);
                    }
                }
            }
            return Math.abs(this.lastX - this.startX) > ((float) this.scaledTouchSlop) || Math.abs(this.lastY - this.startY) > ((float) this.scaledTouchSlop);
        }
        float rawX = ev.getRawX();
        this.lastX = rawX;
        this.startX = rawX;
        float rawY = ev.getRawY();
        this.lastY = rawY;
        this.startY = rawY;
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX INFO: renamed from: p */
    public final void m60783p(int position, boolean smoothScroll) {
        int i = position + this.sidePage;
        this.tempPosition = i;
        this.viewPager2.m4252j(i, smoothScroll);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final Banner m60784q(@Nullable aum indicator, boolean attachToRoot) {
        aum aumVar = this.indicator;
        if (aumVar != null) {
            removeView(aumVar.getView());
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
    public final Banner m60785r(int limit) {
        this.viewPager2.setOffscreenPageLimit(limit);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final Banner m60786s(@Nullable ViewPager2.AbstractC0742i listener) {
        this.changeCallback = listener;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final Banner m60787t(int tlWidth, int brWidth, int pageMargin) {
        if (pageMargin < 0) {
            pageMargin = 0;
        }
        m60781n(new C0749c(pageMargin));
        View childAt = this.viewPager2.getChildAt(0);
        childAt.getClass();
        RecyclerView recyclerView = (RecyclerView) childAt;
        recyclerView.getRecycledViewPool().m3440m(0, 0);
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
    public final Banner m60788u(boolean clipChildren) {
        this.viewPager2.setClipChildren(clipChildren);
        View childAt = this.viewPager2.getChildAt(0);
        childAt.getClass();
        ((RecyclerView) childAt).setClipChildren(clipChildren);
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final void m60789v(int startPosition) {
        if (this.sidePage == this.NORMAL_COUNT) {
            this.viewPager2.setAdapter(this.adapterWrapper);
        } else {
            this.adapterWrapper.notifyDataSetChanged();
        }
        m60783p(startPosition, false);
        aum aumVar = this.indicator;
        if (aumVar != null) {
            aumVar.mo60794a(getRealCount(), getCurrentPager());
        }
    }

    /* JADX INFO: renamed from: w */
    public final int m60790w(int position) {
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
        C0748b c0748b = new C0748b();
        this.compositePageTransformer = c0748b;
        this.adapterWrapper = new C9330a();
        this.isBeginPagerChange = true;
        this.pagerScrollDuration = 800;
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() >> 1;
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setPageTransformer(c0748b);
        viewPager2.m4249g(new C9331b());
        m60785r(1);
        addView(viewPager2);
        this.itemDataSetChangeObserver = new C9332c();
    }

    public Banner(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.NORMAL_COUNT = 2;
        this.needPage = 2;
        this.sidePage = 2 / 2;
        ViewPager2 viewPager2 = new ViewPager2(getContext());
        this.viewPager2 = viewPager2;
        C0748b c0748b = new C0748b();
        this.compositePageTransformer = c0748b;
        this.adapterWrapper = new C9330a();
        this.isBeginPagerChange = true;
        this.pagerScrollDuration = 800;
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() >> 1;
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setPageTransformer(c0748b);
        viewPager2.m4249g(new C9331b());
        m60785r(1);
        addView(viewPager2);
        this.itemDataSetChangeObserver = new C9332c();
    }
}
