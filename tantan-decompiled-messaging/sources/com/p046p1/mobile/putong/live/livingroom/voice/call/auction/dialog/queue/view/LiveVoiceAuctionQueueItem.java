package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.live.base.data.AuctionState;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionUserInfo;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionQueueItemBindings;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view.LiveVoiceAuctionQueueItem;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.bgm0;
import p149l.cxq;
import p149l.f30;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.t100;
import p149l.xdl0;
import p149l.yb2;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/queue/view/LiveVoiceAuctionQueueItem;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionQueueItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/bgm0;", "model", "", "h", "(Ll/bgm0;)V", "", "isFemale", "", SeeTextDynamicParam.age, "Landroid/widget/TextView;", "tv_age", RXScreenCaptureService.KEY_INDEX, "(ZILandroid/widget/TextView;)V", "", "role", "g", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVoiceAuctionQueueItem extends LiveVoiceAuctionQueueItemBindings {
    public /* synthetic */ LiveVoiceAuctionQueueItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m77843b(bgm0 bgm0Var, View view) {
        view.getClass();
        f30<String, BLiveAuctionQueueInfo> f30VarM101668H = bgm0Var.m101668H();
        if (f30VarM101668H != null) {
            f30VarM101668H.call("reject", bgm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m77844c(bgm0 bgm0Var, View view) {
        view.getClass();
        f30<String, BLiveAuctionQueueInfo> f30VarM101668H = bgm0Var.m101668H();
        if (f30VarM101668H != null) {
            f30VarM101668H.call("accept", bgm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m77845d(bgm0 bgm0Var, View view) {
        view.getClass();
        f30<String, BLiveAuctionQueueInfo> f30VarM101668H = bgm0Var.m101668H();
        if (f30VarM101668H != null) {
            f30VarM101668H.call("invite", bgm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m77846e(bgm0 bgm0Var, View view) {
        view.getClass();
        f30<String, BLiveAuctionQueueInfo> f30VarM101668H = bgm0Var.m101668H();
        if (f30VarM101668H != null) {
            f30VarM101668H.call(AuctionState.abort, bgm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m77847f(bgm0 bgm0Var, View view) {
        view.getClass();
        f30<String, BLiveAuctionQueueInfo> f30VarM101668H = bgm0Var.m101668H();
        if (f30VarM101668H != null) {
            f30VarM101668H.call("apply", bgm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m77848g(String role) {
        if (!Intrinsics.m87488d(role, "anchor") && !Intrinsics.m87488d(role, "manager")) {
            xdl0.m208344M(this.f48227e, false);
            return;
        }
        xdl0.m208344M(this.f48227e, true);
        boolean zM87488d = Intrinsics.m87488d(role, "anchor");
        VText vText = this.f48227e;
        if (zM87488d) {
            vText.setText("房主");
        } else {
            vText.setText("管理");
        }
        this.f48227e.setBackground(yb2.m213884i(Color.parseColor("#f89438"), 4));
    }

    /* JADX INFO: renamed from: h */
    public final void m77849h(@NotNull final bgm0 model) {
        model.getClass();
        BLiveAuctionUserInfo bLiveAuctionUserInfo = model.getQueueInfo().userInfo;
        bLiveAuctionUserInfo.getClass();
        if (Intrinsics.m87488d(model.getName(), "apply")) {
            xdl0.m208344M(this.f48228f, true);
            this.f48228f.setText("拒绝");
            TextView textView = this.f48228f;
            textView.getClass();
            cxq.m109105c(textView, new Function1() { // from class: l.h1v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveVoiceAuctionQueueItem.m77843b(model, (View) obj);
                }
            });
            xdl0.m208344M(this.f48229g, true);
            this.f48229g.setText("通过");
            TextView textView2 = this.f48229g;
            textView2.getClass();
            cxq.m109105c(textView2, new Function1() { // from class: l.i1v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveVoiceAuctionQueueItem.m77844c(model, (View) obj);
                }
            });
        } else if (Intrinsics.m87488d(model.getName(), "invite")) {
            xdl0.m208344M(this.f48228f, false);
            xdl0.m208344M(this.f48229g, true);
            if (Intrinsics.m87488d(bLiveAuctionUserInfo.userId, ypv.f199493a.m199309D0())) {
                this.f48229g.setText("上拍");
                TextView textView3 = this.f48229g;
                textView3.getClass();
                cxq.m109105c(textView3, new Function1() { // from class: l.j1v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiveVoiceAuctionQueueItem.m77847f(model, (View) obj);
                    }
                });
            } else {
                boolean zM87488d = Intrinsics.m87488d(model.getQueueInfo().state.toString(), "invited");
                TextView textView4 = this.f48229g;
                if (zM87488d) {
                    textView4.setText("已邀请");
                } else {
                    textView4.setText("邀请");
                    TextView textView5 = this.f48229g;
                    textView5.getClass();
                    cxq.m109105c(textView5, new Function1() { // from class: l.k1v
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveVoiceAuctionQueueItem.m77845d(model, (View) obj);
                        }
                    });
                }
            }
        } else if (Intrinsics.m87488d(model.getName(), "list")) {
            xdl0.m208344M(this.f48228f, true);
            this.f48228f.setText("取消");
            TextView textView6 = this.f48228f;
            textView6.getClass();
            cxq.m109105c(textView6, new Function1() { // from class: l.l1v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveVoiceAuctionQueueItem.m77846e(model, (View) obj);
                }
            });
            xdl0.m208344M(this.f48229g, false);
        }
        hxs.m133407t("context_single_room", this.f48224b, bLiveAuctionUserInfo.avatar, t100.f167226A);
        this.f48225c.setText(bLiveAuctionUserInfo.userName);
        boolean zEquals = TextUtils.equals(bLiveAuctionUserInfo.gender, "female");
        int i = bLiveAuctionUserInfo.age;
        VText vText = this.f48226d;
        vText.getClass();
        m77850i(zEquals, i, vText);
        String str = model.getQueueInfo().role;
        str.getClass();
        m77848g(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m77850i(boolean isFemale, int age, TextView tv_age) {
        int i = isFemale ? i3c0.f111094n0 : i3c0.f110673D;
        xdl0.m208383k(tv_age, kvc0.m147353b(isFemale ? i3c0.f110780La : i3c0.f110792Ma));
        StringBuilder sb = new StringBuilder();
        sb.append(age);
        tv_age.setText(sb.toString());
        tv_age.setBackgroundResource(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionQueueItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
