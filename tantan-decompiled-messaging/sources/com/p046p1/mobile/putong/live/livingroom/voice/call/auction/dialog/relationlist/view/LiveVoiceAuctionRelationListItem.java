package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.Sticker;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionRelationItemBindings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.fld0;
import p149l.hdv;
import p149l.hxs;
import p149l.igm0;
import p149l.kvc0;
import p149l.ngm;
import p149l.r610;
import p149l.t100;
import p149l.x8u;
import p149l.xdl0;
import p149l.yb2;
import p149l.ym2;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionRelationListItem;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionRelationItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/igm0;", "model", "", Constants.INAPP_DATA_TAG, "(Ll/igm0;)V", "b", "e", "()V", "", Sticker.GESTURE_TYPE_HEART, "", "c", "(I)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVoiceAuctionRelationListItem extends LiveVoiceAuctionRelationItemBindings {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionRelationListItem$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionRelationListItem$a", "Ll/ym2;", "", "id", "Ll/ngm;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "", "h", "(Ljava/lang/String;Ll/ngm;Landroid/graphics/drawable/Animatable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12992a extends ym2 {
        public C12992a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String id, ngm imageInfo, Animatable animatable) {
            id.getClass();
            imageInfo.getClass();
            animatable.getClass();
            super.mo39108h(id, imageInfo, animatable);
            xdl0.m208327D0((int) (t100.m186890d(14.0f) * (imageInfo.getWidth() / imageInfo.getHeight())), LiveVoiceAuctionRelationListItem.this.f48243h);
            xdl0.m208325C0(LiveVoiceAuctionRelationListItem.this.f48243h, t100.m186890d(14.0f));
        }
    }

    public /* synthetic */ LiveVoiceAuctionRelationListItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m77865b(igm0 model) {
        if (!((hdv) ypv.m215673l(fld0.f98150e)).f107316v.get().booleanValue() && Intrinsics.m87488d("personal", model.getTabName())) {
            if (Intrinsics.m87488d(model.getRelation().otherUserInfo.userId, ypv.f199493a.m199309D0()) || Intrinsics.m87488d(model.getRelation().userInfo.userId, ypv.f199493a.m199309D0())) {
                m77868e();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m77866c(int heart) {
        if (heart == 0) {
            return "0";
        }
        String strM207433c = x8u.m207433c(heart);
        strM207433c.getClass();
        return strM207433c;
    }

    /* JADX INFO: renamed from: d */
    public final void m77867d(@NotNull igm0 model) {
        model.getClass();
        this.f48237b.setText(String.valueOf(model.getPosition() + 1));
        VText vText = this.f48242g;
        String str = model.getRelation().userInfo.userName;
        str.getClass();
        String strM178016w = r610.m178016w(str, 3);
        String str2 = model.getRelation().otherUserInfo.userName;
        str2.getClass();
        vText.setText(strM178016w + "&" + r610.m178016w(str2, 3));
        this.f48244i.setText(model.getRelation().relationDetail.name);
        xdl0.m208344M(this.f48243h, TextUtils.isEmpty(model.getRelation().relationDetail.tagImage) ^ true);
        xdl0.m208344M(this.f48244i, TextUtils.isEmpty(model.getRelation().relationDetail.tagImage));
        if (TextUtils.isEmpty(model.getRelation().relationDetail.tagImage)) {
            this.f48244i.setBackground(yb2.m213886k(kvc0.m147358g(model.getRelation().relationDetail.startBgColor), kvc0.m147358g(model.getRelation().relationDetail.endBgColor), 4, GradientDrawable.Orientation.LEFT_RIGHT));
        } else {
            hxs.m133409v("context_livingAct", this.f48243h, model.getRelation().relationDetail.tagImage, t100.m186890d(61.0f), t100.m186890d(14.0f), false, false, false, new C12992a());
        }
        this.f48246k.setText("Lv." + model.getRelation().level);
        VText vText2 = this.f48247l;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vText2.setText(String.format("剩余%s天", Arrays.copyOf(new Object[]{String.valueOf((int) Math.ceil(((double) model.getRelation().remainSeconds) / 86400.0d))}, 1)));
        xdl0.m208344M(this.f48245j, model.getRelation().worth > 0);
        this.f48245j.setText(m77866c(model.getRelation().worth));
        String str3 = model.getRelation().userInfo.avatar;
        str3.getClass();
        String str4 = model.getRelation().otherUserInfo.avatar;
        str4.getClass();
        String str5 = model.getRelation().userInfo.tagImage;
        str5.getClass();
        String str6 = model.getRelation().otherUserInfo.tagImage;
        str6.getClass();
        xdl0.m208344M(this.f48240e, !TextUtils.isEmpty(str5));
        xdl0.m208344M(this.f48241f, true ^ TextUtils.isEmpty(str6));
        hxs.m133406s("context_single_room", this.f48238c, str3);
        hxs.m133406s("context_single_room", this.f48239d, str4);
        hxs.m133406s("context_single_room", this.f48240e, str5);
        hxs.m133406s("context_single_room", this.f48241f, str6);
        m77865b(model);
    }

    /* JADX INFO: renamed from: e */
    public final void m77868e() {
        C4345a c4345a = new C4345a(getContext());
        c4345a.m20847B(t100.f167254c).m20874p(75).m20881w(t100.m186890d(8.0f)).m20876r("#ffffff").m20870k(kvc0.m147358g("#FE7E1D")).m20875q(C4345a.f15683Q).m20861b(3000L).m20882x(-t100.m186890d(20.0f)).m20883y(true).m20855J(13.0f).m20849D("长按试一下");
        C4348d.m20896l().m20909u(c4345a, this.f48246k, "dissolveShipTip");
        ((hdv) ypv.m215673l(fld0.f98150e)).f107316v.put(Boolean.TRUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionRelationListItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
