package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceKtvDialogViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.KtvAcousticsBean;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.ahn0;
import p153l.czq;
import p153l.f4r;
import p153l.i6t;
import p153l.iul;
import p153l.ngn0;
import p153l.qa00;
import p153l.v5r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/ktv/KtvView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceKtvDialogViewBindings;", "Ll/v5r;", "Ll/iul;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/ngn0;", OMSTemplateType.dialog, "", "a", "(Ll/ngn0;)V", "c", "()V", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "e", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "effectAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class KtvView extends LiveVirtualVoiceKtvDialogViewBindings<v5r> implements iul {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter effectAdapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView$a */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/ktv/KtvView$a", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13136a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            int i = qa00.f156319f;
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
    public static Unit m78516i(KtvView ktvView, View view) {
        view.getClass();
        T t = ktvView.f48965a;
        t.getClass();
        ahn0.m97862d((i6t) t, VirtualVoiceMotionType.ktv);
        ((v5r) ktvView.f48965a).m199916L3();
        return Unit.INSTANCE;
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: a */
    public void mo78510a(@NotNull ngn0 dialog) {
        dialog.getClass();
        RecyclerView recyclerView = this.f48967c;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        recyclerView.setAdapter(this.effectAdapter);
        if (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        recyclerView.addItemDecoration(new C13136a());
        VText vText = this.f48968d;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.c7r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KtvView.m78516i(this.f80136a, (View) obj);
            }
        });
        LiveBaseAdapter liveBaseAdapter = this.effectAdapter;
        ArrayList<KtvAcousticsBean> ktvAcoustics = KtvAcousticsBean.getKtvAcoustics();
        ktvAcoustics.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(ktvAcoustics, 10));
        for (KtvAcousticsBean ktvAcousticsBean : ktvAcoustics) {
            ktvAcousticsBean.getClass();
            arrayList.add(new f4r(ktvAcousticsBean));
        }
        liveBaseAdapter.m68554Z(arrayList);
        liveBaseAdapter.notifyDataSetChanged();
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo78511b(boolean z) {
        super.mo78511b(z);
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: c */
    public void mo78512c() {
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo78513d() {
        super.mo78513d();
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: e */
    public /* bridge */ void mo78514e() {
        super.mo78514e();
    }
}
