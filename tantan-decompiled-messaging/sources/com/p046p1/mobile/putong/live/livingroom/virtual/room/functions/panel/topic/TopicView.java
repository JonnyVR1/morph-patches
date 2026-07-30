package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceTopicViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic.TopicView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.c1j0;
import p149l.cxq;
import p149l.e0o0;
import p149l.h4t;
import p149l.i3c0;
import p149l.kvc0;
import p149l.p4s;
import p149l.t100;
import p149l.x7n0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/topic/TopicView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceTopicViewBindings;", "Ll/c1j0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/ViewGroup;", "root", "", "f", "(Landroid/view/ViewGroup;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "topic", "k", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "j", "()V", "", "isCollapse", "", RXScreenCaptureService.KEY_INDEX, "(ZLjava/lang/String;)V", "e", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)V", "h", "Landroid/view/ViewGroup;", "_contentView", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class TopicView extends LiveVirtualVoiceTopicViewBindings<c1j0> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public ViewGroup _contentView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static Unit m77388b(TopicView topicView, View view) {
        view.getClass();
        ((c1j0) topicView.f48170a).m104851R3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m77390d(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m77391m(ViewGroup viewGroup, TopicView topicView) {
        xdl0.m208325C0(viewGroup, topicView.f48174e.getHeight() + t100.m186890d(126.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m77392e() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = this.f48172c;
        liveVirtualVoicePanelCollapseView.getClass();
        if (liveVirtualVoicePanelCollapseView.getWidth() > x7n0.m207301a()) {
            xdl0.m208327D0(x7n0.m207301a(), this.f48172c);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f48172c.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = xdl0.f192404f;
            layoutParams.height = t100.m186890d(44.0f);
            this.f48172c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m77393f(@NotNull ViewGroup root) {
        root.getClass();
        this._contentView = root;
        VText vText = this.f48175f;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.w2j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopicView.m77390d((View) obj);
            }
        });
        VText vText2 = this.f48176g;
        vText2.getClass();
        cxq.m109105c(vText2, new Function1() { // from class: l.y2j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopicView.m77388b(this.f195619a, (View) obj);
            }
        });
        m77394i(((c1j0) this.f48170a).getIsCollapse(), "");
        xdl0.m208372e0(this.f48172c, t100.f167276y);
        xdl0.m208327D0(x7n0.m207301a(), this.f48173d);
        m77397l(((c1j0) this.f48170a).getIsCollapse());
        this.f48173d.setAlpha(1.0f);
        m77392e();
    }

    /* JADX INFO: renamed from: i */
    public final void m77394i(boolean isCollapse, @NotNull String topic) {
        topic.getClass();
        xdl0.m208344M(this.f48173d, !isCollapse);
        this.f48172c.m77592b(new p4s(isCollapse, "res://drawable/" + i3c0.f111223x9, topic, false, 8, null));
        m77392e();
    }

    /* JADX INFO: renamed from: j */
    public final void m77395j() {
        T t = this.f48170a;
        t.getClass();
        boolean zM114322h = e0o0.m114322h((h4t) t);
        VText vText = this.f48176g;
        if (zM114322h) {
            vText.setText("编辑");
            xdl0.m208383k(this.f48176g, kvc0.m147353b(i3c0.f110935Z8));
        } else {
            vText.setText("讨论");
            xdl0.m208383k(this.f48176g, kvc0.m147353b(i3c0.f111224xa));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m77396k(@NotNull BLiveVoiceChatTopic topic) {
        topic.getClass();
        this.f48174e.setText(topic.topic);
        this.f48175f.setText("#" + topic.tag);
        m77397l(((c1j0) this.f48170a).getIsCollapse());
        m77395j();
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = this.f48172c;
        String str = "res://drawable/" + i3c0.f111223x9;
        String str2 = topic.topic;
        str2.getClass();
        liveVirtualVoicePanelCollapseView.m77593c(new p4s(false, str, str2, false, 9, null));
        m77392e();
    }

    /* JADX INFO: renamed from: l */
    public final void m77397l(boolean isCollapse) {
        final ViewGroup viewGroup = this._contentView;
        if (isCollapse) {
            xdl0.m208325C0(viewGroup, t100.m186890d(40.0f));
        } else if (viewGroup != null) {
            this.f48174e.post(new Runnable() { // from class: l.a3j0
                @Override // java.lang.Runnable
                public final void run() {
                    TopicView.m77391m(viewGroup, this);
                }
            });
        }
    }
}
