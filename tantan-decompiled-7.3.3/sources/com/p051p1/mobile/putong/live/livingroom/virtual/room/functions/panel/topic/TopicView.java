package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceTopicViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic.TopicView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bhn0;
import p153l.bnl0;
import p153l.czq;
import p153l.gaj0;
import p153l.i6t;
import p153l.i9o0;
import p153l.n3d0;
import p153l.obc0;
import p153l.q6s;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/topic/TopicView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceTopicViewBindings;", "Ll/gaj0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/ViewGroup;", "root", "", "f", "(Landroid/view/ViewGroup;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "topic", "k", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "j", "()V", "", "isCollapse", "", RXScreenCaptureService.KEY_INDEX, "(ZLjava/lang/String;)V", "e", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)V", "h", "Landroid/view/ViewGroup;", "_contentView", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TopicView extends LiveVirtualVoiceTopicViewBindings<gaj0> {

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
    public static Unit m78571b(TopicView topicView, View view) {
        view.getClass();
        ((gaj0) topicView.f49018a).m129738R3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m78573d(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m78574m(ViewGroup viewGroup, TopicView topicView) {
        bnl0.m105505C0(viewGroup, topicView.f49022e.getHeight() + qa00.m175859d(126.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m78575e() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = this.f49020c;
        liveVirtualVoicePanelCollapseView.getClass();
        if (liveVirtualVoicePanelCollapseView.getWidth() > bhn0.m104350a()) {
            bnl0.m105507D0(bhn0.m104350a(), this.f49020c);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f49020c.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = bnl0.f77545f;
            layoutParams.height = qa00.m175859d(44.0f);
            this.f49020c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m78576f(@NotNull ViewGroup root) {
        root.getClass();
        this._contentView = root;
        VText vText = this.f49023f;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.acj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopicView.m78573d((View) obj);
            }
        });
        VText vText2 = this.f49024g;
        vText2.getClass();
        czq.m113347c(vText2, new Function1() { // from class: l.ccj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TopicView.m78571b(this.f80972a, (View) obj);
            }
        });
        m78577i(((gaj0) this.f49018a).getIsCollapse(), "");
        bnl0.m105552e0(this.f49020c, qa00.f156338y);
        bnl0.m105507D0(bhn0.m104350a(), this.f49021d);
        m78580l(((gaj0) this.f49018a).getIsCollapse());
        this.f49021d.setAlpha(1.0f);
        m78575e();
    }

    /* JADX INFO: renamed from: i */
    public final void m78577i(boolean isCollapse, @NotNull String topic) {
        topic.getClass();
        bnl0.m105524M(this.f49021d, !isCollapse);
        this.f49020c.m78775b(new q6s(isCollapse, "res://drawable/" + obc0.f146551x9, topic, false, 8, null));
        m78575e();
    }

    /* JADX INFO: renamed from: j */
    public final void m78578j() {
        T t = this.f49018a;
        t.getClass();
        boolean zM139137h = i9o0.m139137h((i6t) t);
        VText vText = this.f49024g;
        if (zM139137h) {
            vText.setText("编辑");
            bnl0.m105563k(this.f49024g, n3d0.m161278b(obc0.f146263Z8));
        } else {
            vText.setText("讨论");
            bnl0.m105563k(this.f49024g, n3d0.m161278b(obc0.f146552xa));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m78579k(@NotNull BLiveVoiceChatTopic topic) {
        topic.getClass();
        this.f49022e.setText(topic.topic);
        this.f49023f.setText("#" + topic.tag);
        m78580l(((gaj0) this.f49018a).getIsCollapse());
        m78578j();
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = this.f49020c;
        String str = "res://drawable/" + obc0.f146551x9;
        String str2 = topic.topic;
        str2.getClass();
        liveVirtualVoicePanelCollapseView.m78776c(new q6s(false, str, str2, false, 9, null));
        m78575e();
    }

    /* JADX INFO: renamed from: l */
    public final void m78580l(boolean isCollapse) {
        final ViewGroup viewGroup = this._contentView;
        if (isCollapse) {
            bnl0.m105505C0(viewGroup, qa00.m175859d(40.0f));
        } else if (viewGroup != null) {
            this.f49022e.post(new Runnable() { // from class: l.ecj0
                @Override // java.lang.Runnable
                public final void run() {
                    TopicView.m78574m(viewGroup, this);
                }
            });
        }
    }
}
