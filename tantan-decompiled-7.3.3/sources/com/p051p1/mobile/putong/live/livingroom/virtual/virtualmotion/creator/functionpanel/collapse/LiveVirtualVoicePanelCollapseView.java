package com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoicePanelCollapseViewBindings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.q6s;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/functionpanel/collapse/LiveVirtualVoicePanelCollapseView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoicePanelCollapseViewBindings;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/q6s;", "collapseData", "b", "(Ll/q6s;)V", "c", "", "content", "setText", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVirtualVoicePanelCollapseView extends LiveVirtualVoicePanelCollapseViewBindings<Object> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVirtualVoicePanelCollapseView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m78775b(@NotNull q6s collapseData) {
        collapseData.getClass();
        if (!collapseData.getShow()) {
            bnl0.m105525M0(this, false);
            return;
        }
        bnl0.m105525M0(this, true);
        boolean circleIcon = collapseData.getCircleIcon();
        VDraweeView vDraweeView = this.f48987c;
        if (circleIcon) {
            vDraweeView.getHierarchy().m207045H(RoundingParams.m8301a());
        } else {
            vDraweeView.getHierarchy().m207045H(null);
        }
        if (!TextUtils.isEmpty(collapseData.getIconUrl())) {
            izs.m142868s("context_single_room", this.f48987c, collapseData.getIconUrl());
        }
        this.f48988d.setMarqueeText(collapseData.getContent());
    }

    /* JADX INFO: renamed from: c */
    public final void m78776c(@NotNull q6s collapseData) {
        collapseData.getClass();
        izs.m142868s("context_single_room", this.f48987c, collapseData.getIconUrl());
        this.f48988d.setMarqueeText(collapseData.getContent());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoicePanelCollapseViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48988d.setTextSize(qa00.f156323j);
    }

    public final void setText(@NotNull String content) {
        content.getClass();
        this.f48988d.setMarqueeText(content);
    }
}
