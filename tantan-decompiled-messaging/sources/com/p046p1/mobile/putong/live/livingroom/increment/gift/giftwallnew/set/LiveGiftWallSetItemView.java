package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.set;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallSetDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallSubTab;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hns;
import p149l.lns;
import p149l.mns;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/giftwallnew/set/LiveGiftWallSetItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSetDetail;", Item.TYPE, "Ll/lns;", "presenter", "i0", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftWallSetDetail;Ll/lns;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "get_title", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "get_recycler", "()Landroidx/recyclerview/widget/RecyclerView;", "set_recycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_recycler", "Ll/mns;", "f", "Ll/mns;", "getAdapter", "()Ll/mns;", "setAdapter", "(Ll/mns;)V", "adapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveGiftWallSetItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public RecyclerView _recycler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public mns adapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LiveGiftWallSetItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Nullable
    public final mns getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final RecyclerView get_recycler() {
        RecyclerView recyclerView = this._recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_recycler");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m73648h0(View view) {
        hns.m132013a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: i0 */
    public final void m73649i0(@NotNull BLiveNewGiftWallSetDetail item, @NotNull lns presenter) {
        item.getClass();
        presenter.getClass();
        this.adapter = new mns(presenter);
        get_recycler().setAdapter(this.adapter);
        get_recycler().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        get_recycler().setNestedScrollingEnabled(false);
        get_recycler().setHasFixedSize(true);
        TextView textView = get_title();
        BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab = item.subTab;
        String str = bLiveNewGiftWallSubTab.name;
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = bLiveNewGiftWallSubTab.progress;
        textView.setText(str + "(" + bLiveNewGiftWallProgress.current + "/" + bLiveNewGiftWallProgress.total + ")");
        mns mnsVar = this.adapter;
        if (mnsVar != null) {
            mnsVar.m155564G(item.gifts, presenter);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73648h0(this);
    }

    public final void setAdapter(@Nullable mns mnsVar) {
        this.adapter = mnsVar;
    }

    public final void set_recycler(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._recycler = recyclerView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveGiftWallSetItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ LiveGiftWallSetItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
