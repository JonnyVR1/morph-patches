package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceKtvDialogViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.KtvAcousticsBean;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.cxq;
import p149l.e2r;
import p149l.h4t;
import p149l.j7n0;
import p149l.t100;
import p149l.u3r;
import p149l.url;
import p149l.w7n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/ktv/KtvView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceKtvDialogViewBindings;", "Ll/u3r;", "Ll/url;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/j7n0;", OMSTemplateType.dialog, "", "a", "(Ll/j7n0;)V", "c", "()V", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "e", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "effectAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class KtvView extends LiveVirtualVoiceKtvDialogViewBindings<u3r> implements url {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter effectAdapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView$a */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/ktv/KtvView$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12973a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int i = t100.f167257f;
            outRect.left = i;
            outRect.right = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.effectAdapter = new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: i */
    public static Unit m77333i(KtvView ktvView, View view) {
        view.getClass();
        T t = ktvView.f48117a;
        t.getClass();
        w7n0.m202027d((h4t) t, VirtualVoiceMotionType.ktv);
        ((u3r) ktvView.f48117a).m191613L3();
        return Unit.INSTANCE;
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: a */
    public void mo77327a(@NotNull j7n0 dialog) {
        dialog.getClass();
        RecyclerView recyclerView = this.f48119c;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        recyclerView.setAdapter(this.effectAdapter);
        if (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        recyclerView.addItemDecoration(new C12973a());
        VText vText = this.f48120d;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.b5r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KtvView.m77333i(this.f73694a, (View) obj);
            }
        });
        LiveBaseAdapter liveBaseAdapter = this.effectAdapter;
        ArrayList<KtvAcousticsBean> ktvAcoustics = KtvAcousticsBean.getKtvAcoustics();
        ktvAcoustics.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(ktvAcoustics, 10));
        for (KtvAcousticsBean ktvAcousticsBean : ktvAcoustics) {
            ktvAcousticsBean.getClass();
            arrayList.add(new e2r(ktvAcousticsBean));
        }
        liveBaseAdapter.m67371Z(arrayList);
        liveBaseAdapter.notifyDataSetChanged();
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo77328b(boolean z) {
        super.mo77328b(z);
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: c */
    public void mo77329c() {
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo77330d() {
        super.mo77330d();
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: e */
    public /* bridge */ void mo77331e() {
        super.mo77331e();
    }
}
