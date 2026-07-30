package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.live.base.data.AuctionState;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionUserInfo;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionQueueItemBindings;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.queue.view.LiveVoiceAuctionQueueItem;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.czq;
import p153l.fc2;
import p153l.fpm0;
import p153l.izs;
import p153l.n3d0;
import p153l.obc0;
import p153l.qa00;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/queue/view/LiveVoiceAuctionQueueItem;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionQueueItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/fpm0;", "model", "", "h", "(Ll/fpm0;)V", "", "isFemale", "", SeeTextDynamicParam.age, "Landroid/widget/TextView;", "tv_age", RXScreenCaptureService.KEY_INDEX, "(ZILandroid/widget/TextView;)V", "", "role", "g", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVoiceAuctionQueueItem extends LiveVoiceAuctionQueueItemBindings {
    public /* synthetic */ LiveVoiceAuctionQueueItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m79026b(fpm0 fpm0Var, View view) {
        view.getClass();
        z20<String, BLiveAuctionQueueInfo> z20VarM126697H = fpm0Var.m126697H();
        if (z20VarM126697H != null) {
            z20VarM126697H.call("reject", fpm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m79027c(fpm0 fpm0Var, View view) {
        view.getClass();
        z20<String, BLiveAuctionQueueInfo> z20VarM126697H = fpm0Var.m126697H();
        if (z20VarM126697H != null) {
            z20VarM126697H.call("accept", fpm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m79028d(fpm0 fpm0Var, View view) {
        view.getClass();
        z20<String, BLiveAuctionQueueInfo> z20VarM126697H = fpm0Var.m126697H();
        if (z20VarM126697H != null) {
            z20VarM126697H.call("invite", fpm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m79029e(fpm0 fpm0Var, View view) {
        view.getClass();
        z20<String, BLiveAuctionQueueInfo> z20VarM126697H = fpm0Var.m126697H();
        if (z20VarM126697H != null) {
            z20VarM126697H.call(AuctionState.abort, fpm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m79030f(fpm0 fpm0Var, View view) {
        view.getClass();
        z20<String, BLiveAuctionQueueInfo> z20VarM126697H = fpm0Var.m126697H();
        if (z20VarM126697H != null) {
            z20VarM126697H.call("apply", fpm0Var.getQueueInfo());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m79031g(String role) {
        if (!Intrinsics.m88377d(role, "anchor") && !Intrinsics.m88377d(role, "manager")) {
            bnl0.m105524M(this.f49075e, false);
            return;
        }
        bnl0.m105524M(this.f49075e, true);
        boolean zM88377d = Intrinsics.m88377d(role, "anchor");
        VText vText = this.f49075e;
        if (zM88377d) {
            vText.setText("房主");
        } else {
            vText.setText("管理");
        }
        this.f49075e.setBackground(fc2.m124979i(Color.parseColor("#f89438"), 4));
    }

    /* JADX INFO: renamed from: h */
    public final void m79032h(@NotNull final fpm0 model) {
        model.getClass();
        BLiveAuctionUserInfo bLiveAuctionUserInfo = model.getQueueInfo().userInfo;
        bLiveAuctionUserInfo.getClass();
        if (Intrinsics.m88377d(model.getName(), "apply")) {
            bnl0.m105524M(this.f49076f, true);
            this.f49076f.setText("拒绝");
            TextView textView = this.f49076f;
            textView.getClass();
            czq.m113347c(textView, new Function1() { // from class: l.i3v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveVoiceAuctionQueueItem.m79026b(model, (View) obj);
                }
            });
            bnl0.m105524M(this.f49077g, true);
            this.f49077g.setText("通过");
            TextView textView2 = this.f49077g;
            textView2.getClass();
            czq.m113347c(textView2, new Function1() { // from class: l.j3v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveVoiceAuctionQueueItem.m79027c(model, (View) obj);
                }
            });
        } else if (Intrinsics.m88377d(model.getName(), "invite")) {
            bnl0.m105524M(this.f49076f, false);
            bnl0.m105524M(this.f49077g, true);
            if (Intrinsics.m88377d(bLiveAuctionUserInfo.userId, zrv.f205799a.m207631D0())) {
                this.f49077g.setText("上拍");
                TextView textView3 = this.f49077g;
                textView3.getClass();
                czq.m113347c(textView3, new Function1() { // from class: l.k3v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiveVoiceAuctionQueueItem.m79030f(model, (View) obj);
                    }
                });
            } else {
                boolean zM88377d = Intrinsics.m88377d(model.getQueueInfo().state.toString(), "invited");
                TextView textView4 = this.f49077g;
                if (zM88377d) {
                    textView4.setText("已邀请");
                } else {
                    textView4.setText("邀请");
                    TextView textView5 = this.f49077g;
                    textView5.getClass();
                    czq.m113347c(textView5, new Function1() { // from class: l.l3v
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveVoiceAuctionQueueItem.m79028d(model, (View) obj);
                        }
                    });
                }
            }
        } else if (Intrinsics.m88377d(model.getName(), "list")) {
            bnl0.m105524M(this.f49076f, true);
            this.f49076f.setText("取消");
            TextView textView6 = this.f49076f;
            textView6.getClass();
            czq.m113347c(textView6, new Function1() { // from class: l.m3v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LiveVoiceAuctionQueueItem.m79029e(model, (View) obj);
                }
            });
            bnl0.m105524M(this.f49077g, false);
        }
        izs.m142869t("context_single_room", this.f49072b, bLiveAuctionUserInfo.avatar, qa00.f156288A);
        this.f49073c.setText(bLiveAuctionUserInfo.userName);
        boolean zEquals = TextUtils.equals(bLiveAuctionUserInfo.gender, "female");
        int i = bLiveAuctionUserInfo.age;
        VText vText = this.f49074d;
        vText.getClass();
        m79033i(zEquals, i, vText);
        String str = model.getQueueInfo().role;
        str.getClass();
        m79031g(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m79033i(boolean isFemale, int age, TextView tv_age) {
        int i = isFemale ? obc0.f146422n0 : obc0.f146001D;
        bnl0.m105563k(tv_age, n3d0.m161278b(isFemale ? obc0.f146108La : obc0.f146120Ma));
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
