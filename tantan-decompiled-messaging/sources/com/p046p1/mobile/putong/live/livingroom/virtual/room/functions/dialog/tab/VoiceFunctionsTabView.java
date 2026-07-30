package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceFunctionsDialogTabLayoutBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VRecyclerView;
import p149l.b7n0;
import p149l.d1q;
import p149l.e30;
import p149l.hfw;
import p149l.t100;
import p149l.u7n0;
import p149l.vwb;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ!\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+¨\u0006-"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/tab/VoiceFunctionsTabView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceFunctionsDialogTabLayoutBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "Ll/b7n0;", "tabData", "Ll/e30;", "", "tabSelected", "g", "(Ljava/util/List;Ll/e30;)V", FirebaseAnalytics.Param.INDEX, "f", "(I)V", "h", "e", "targetIndex", "", "withNotify", RXScreenCaptureService.KEY_INDEX, "(IZ)V", "c", "(Ljava/util/List;)V", "I", "currentIndex", Constants.INAPP_DATA_TAG, "Ll/e30;", "action", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroidx/recyclerview/widget/RecyclerView$n;", "itemDecoration", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class VoiceFunctionsTabView extends LiveVoiceFunctionsDialogTabLayoutBindings {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> action;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public LiveBaseAdapter adapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayoutManager layoutManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public RecyclerView.AbstractC0576n itemDecoration;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView$a */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/tab/VoiceFunctionsTabView$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12974a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (parent.getAdapter() != null) {
                RecyclerView.Adapter adapter = parent.getAdapter();
                adapter.getClass();
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    outRect.left = t100.m186890d(26.0f);
                    outRect.right = t100.m186890d(20.0f);
                    return;
                }
            }
            if (childAdapterPosition == 0) {
                outRect.left = t100.m186890d(20.0f);
            } else {
                outRect.left = t100.m186890d(26.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFunctionsTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.currentIndex = -1;
        this.itemDecoration = new C12974a();
    }

    /* JADX INFO: renamed from: d */
    public static final void m77339d(VoiceFunctionsTabView voiceFunctionsTabView, int i, View view) {
        m77340j(voiceFunctionsTabView, i, false, 2, null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m77340j(VoiceFunctionsTabView voiceFunctionsTabView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        voiceFunctionsTabView.m77346i(i, z);
    }

    /* JADX INFO: renamed from: c */
    public final void m77341c(List<b7n0> tabData) {
        ArrayList arrayList = new ArrayList();
        final int i = 0;
        for (Object obj : tabData) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            u7n0 u7n0Var = new u7n0((b7n0) obj);
            u7n0Var.mo109662A(new View.OnClickListener() { // from class: l.v7n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceFunctionsTabView.m77339d(this.f180406a, i, view);
                }
            });
            arrayList.add(u7n0Var);
            i = i2;
        }
        LiveBaseAdapter liveBaseAdapter = this.adapter;
        if (liveBaseAdapter == null) {
            Intrinsics.m87502r("adapter");
            liveBaseAdapter = null;
        }
        liveBaseAdapter.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final void m77342e() {
        this.adapter = new LiveBaseAdapter();
        this.f48332b.removeItemDecoration(this.itemDecoration);
        this.f48332b.addItemDecoration(this.itemDecoration);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.layoutManager = linearLayoutManager;
        this.f48332b.setLayoutManager(linearLayoutManager);
        VRecyclerView vRecyclerView = this.f48332b;
        LiveBaseAdapter liveBaseAdapter = this.adapter;
        if (liveBaseAdapter == null) {
            Intrinsics.m87502r("adapter");
            liveBaseAdapter = null;
        }
        vRecyclerView.setAdapter(liveBaseAdapter);
    }

    /* JADX INFO: renamed from: f */
    public final void m77343f(int index) {
        m77346i(index, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m77344g(@NotNull List<b7n0> tabData, @NotNull e30<Integer> tabSelected) {
        tabData.getClass();
        tabSelected.getClass();
        m77341c(tabData);
        this.action = tabSelected;
        m77343f(0);
    }

    /* JADX INFO: renamed from: h */
    public final void m77345h() {
        this.currentIndex = -1;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: i */
    public final void m77346i(int targetIndex, boolean withNotify) {
        e30<Integer> e30Var;
        hfw.m130790a("[voice][call]", "updateStatus:" + targetIndex + ",currentIndex:" + this.currentIndex);
        if (this.currentIndex == targetIndex) {
            return;
        }
        LiveBaseAdapter liveBaseAdapter = this.adapter;
        LinearLayoutManager linearLayoutManager = null;
        if (liveBaseAdapter == null) {
            Intrinsics.m87502r("adapter");
            liveBaseAdapter = null;
        }
        List<d1q<?>> listM67355J = liveBaseAdapter.m67355J();
        if (!vwb.m200296J(listM67355J)) {
            listM67355J.getClass();
            int i = 0;
            for (Object obj : listM67355J) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                d1q d1qVar = (d1q) obj;
                d1qVar.getClass();
                ((u7n0) d1qVar).f175027b = i == targetIndex;
                i = i2;
            }
            LiveBaseAdapter liveBaseAdapter2 = this.adapter;
            if (liveBaseAdapter2 == null) {
                Intrinsics.m87502r("adapter");
                liveBaseAdapter2 = null;
            }
            liveBaseAdapter2.notifyDataSetChanged();
        }
        if (withNotify && (e30Var = this.action) != null) {
            e30Var.call(Integer.valueOf(targetIndex));
        }
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        if (linearLayoutManager2 == null) {
            Intrinsics.m87502r("layoutManager");
            linearLayoutManager2 = null;
        }
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager2.findFirstCompletelyVisibleItemPosition();
        LinearLayoutManager linearLayoutManager3 = this.layoutManager;
        if (linearLayoutManager3 == null) {
            Intrinsics.m87502r("layoutManager");
        } else {
            linearLayoutManager = linearLayoutManager3;
        }
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (targetIndex < iFindFirstCompletelyVisibleItemPosition || targetIndex > iFindLastCompletelyVisibleItemPosition) {
            this.f48332b.scrollToPosition(targetIndex);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceFunctionsDialogTabLayoutBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77342e();
    }

    public /* synthetic */ VoiceFunctionsTabView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
