package com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoicePanelCollapseViewBindings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.p4s;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/functionpanel/collapse/LiveVirtualVoicePanelCollapseView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoicePanelCollapseViewBindings;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/p4s;", "collapseData", "b", "(Ll/p4s;)V", "c", "", "content", "setText", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVirtualVoicePanelCollapseView extends LiveVirtualVoicePanelCollapseViewBindings<Object> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVirtualVoicePanelCollapseView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m77592b(@NotNull p4s collapseData) {
        collapseData.getClass();
        if (!collapseData.getShow()) {
            xdl0.m208345M0(this, false);
            return;
        }
        xdl0.m208345M0(this, true);
        boolean circleIcon = collapseData.getCircleIcon();
        VDraweeView vDraweeView = this.f48139c;
        if (circleIcon) {
            vDraweeView.getHierarchy().m112053H(RoundingParams.m8247a());
        } else {
            vDraweeView.getHierarchy().m112053H(null);
        }
        if (!TextUtils.isEmpty(collapseData.getIconUrl())) {
            hxs.m133406s("context_single_room", this.f48139c, collapseData.getIconUrl());
        }
        this.f48140d.setMarqueeText(collapseData.getContent());
    }

    /* JADX INFO: renamed from: c */
    public final void m77593c(@NotNull p4s collapseData) {
        collapseData.getClass();
        hxs.m133406s("context_single_room", this.f48139c, collapseData.getIconUrl());
        this.f48140d.setMarqueeText(collapseData.getContent());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoicePanelCollapseViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48140d.setTextSize(t100.f167261j);
    }

    public final void setText(@NotNull String content) {
        content.getClass();
        this.f48140d.setMarqueeText(content);
    }
}
