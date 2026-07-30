package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceShipLinkCardView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d1q;
import p149l.d5c0;
import p149l.eko0;
import p149l.rgn0;
import p149l.xps;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ3\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/arch/card/cardmodel/feed/VoiceShipLinkCardView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/rgn0;", "shipLinkData", "", "isWhiteTheme", "Lcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;", "trackData", "e", "(Ll/rgn0;ZLcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;)V", Constants.INAPP_DATA_TAG, "", "Ll/d1q;", "b", "(Ll/rgn0;ZLcom/p1/mobile/putong/live/base/apibean/LiveCardTrackData;)Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView;", "_recycler", "Landroidx/recyclerview/widget/RecyclerView;", "get_recycler", "()Landroidx/recyclerview/widget/RecyclerView;", "set_recycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class VoiceShipLinkCardView extends FrameLayout {
    public RecyclerView _recycler;

    @NotNull
    private final LiveBaseAdapter adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceShipLinkCardView(@NotNull Context context) {
        super(context);
        context.getClass();
        this.adapter = new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: c */
    public static final void m67463c(VoiceShipLinkCardView voiceShipLinkCardView, rgn0.C19695a c19695a, LiveCardTrackData liveCardTrackData, View view) {
        xps.m210534a(voiceShipLinkCardView.getContext(), c19695a.getGoAction());
        LiveCardTracker.trackMc(liveCardTrackData);
    }

    /* JADX INFO: renamed from: b */
    public final List<d1q<?>> m67464b(rgn0 shipLinkData, boolean isWhiteTheme, final LiveCardTrackData trackData) {
        List<rgn0.C19695a> listM179173b = shipLinkData.m179173b();
        ArrayList arrayList = new ArrayList();
        if (!listM179173b.isEmpty()) {
            for (final rgn0.C19695a c19695a : listM179173b) {
                eko0 eko0Var = new eko0(c19695a, isWhiteTheme);
                eko0Var.mo109662A(new View.OnClickListener() { // from class: l.dko0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        VoiceShipLinkCardView.m67463c(this.f86687a, c19695a, trackData, view);
                    }
                });
                arrayList.add(eko0Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m67465d() {
        View viewFindViewById = findViewById(d5c0.f84521x0);
        viewFindViewById.getClass();
        set_recycler((RecyclerView) viewFindViewById);
        get_recycler().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        get_recycler().setAdapter(this.adapter);
    }

    /* JADX INFO: renamed from: e */
    public final void m67466e(@NotNull rgn0 shipLinkData, boolean isWhiteTheme, @Nullable LiveCardTrackData trackData) {
        shipLinkData.getClass();
        this.adapter.m67371Z(m67464b(shipLinkData, isWhiteTheme, trackData));
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

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67465d();
    }

    public final void set_recycler(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._recycler = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceShipLinkCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.adapter = new LiveBaseAdapter();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceShipLinkCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.adapter = new LiveBaseAdapter();
    }
}
