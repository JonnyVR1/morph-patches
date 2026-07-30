package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.Sticker;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionRelationItemBindings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bf10;
import p153l.bnl0;
import p153l.fc2;
import p153l.fn2;
import p153l.htd0;
import p153l.ifv;
import p153l.izs;
import p153l.mpm0;
import p153l.n3d0;
import p153l.qa00;
import p153l.qim;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionRelationListItem;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionRelationItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/mpm0;", "model", "", Constants.INAPP_DATA_TAG, "(Ll/mpm0;)V", "b", "e", "()V", "", Sticker.GESTURE_TYPE_HEART, "", "c", "(I)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVoiceAuctionRelationListItem extends LiveVoiceAuctionRelationItemBindings {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionRelationListItem$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionRelationListItem$a", "Ll/fn2;", "", "id", "Ll/qim;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "", "h", "(Ljava/lang/String;Ll/qim;Landroid/graphics/drawable/Animatable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13155a extends fn2 {
        public C13155a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String id, qim imageInfo, Animatable animatable) {
            id.getClass();
            imageInfo.getClass();
            animatable.getClass();
            super.mo40111h(id, imageInfo, animatable);
            bnl0.m105507D0((int) (qa00.m175859d(14.0f) * (imageInfo.getWidth() / imageInfo.getHeight())), LiveVoiceAuctionRelationListItem.this.f49091h);
            bnl0.m105505C0(LiveVoiceAuctionRelationListItem.this.f49091h, qa00.m175859d(14.0f));
        }
    }

    public /* synthetic */ LiveVoiceAuctionRelationListItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m79048b(mpm0 model) {
        if (!((ifv) zrv.m221194l(htd0.f111523e)).f114713v.get().booleanValue() && Intrinsics.m88377d("personal", model.getTabName())) {
            if (Intrinsics.m88377d(model.getRelation().otherUserInfo.userId, zrv.f205799a.m207631D0()) || Intrinsics.m88377d(model.getRelation().userInfo.userId, zrv.f205799a.m207631D0())) {
                m79051e();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m79049c(int heart) {
        if (heart == 0) {
            return "0";
        }
        String strM214935c = yau.m214935c(heart);
        strM214935c.getClass();
        return strM214935c;
    }

    /* JADX INFO: renamed from: d */
    public final void m79050d(@NotNull mpm0 model) {
        model.getClass();
        this.f49085b.setText(String.valueOf(model.getPosition() + 1));
        VText vText = this.f49090g;
        String str = model.getRelation().userInfo.userName;
        str.getClass();
        String strM103845w = bf10.m103845w(str, 3);
        String str2 = model.getRelation().otherUserInfo.userName;
        str2.getClass();
        vText.setText(strM103845w + "&" + bf10.m103845w(str2, 3));
        this.f49092i.setText(model.getRelation().relationDetail.name);
        bnl0.m105524M(this.f49091h, TextUtils.isEmpty(model.getRelation().relationDetail.tagImage) ^ true);
        bnl0.m105524M(this.f49092i, TextUtils.isEmpty(model.getRelation().relationDetail.tagImage));
        if (TextUtils.isEmpty(model.getRelation().relationDetail.tagImage)) {
            this.f49092i.setBackground(fc2.m124981k(n3d0.m161283g(model.getRelation().relationDetail.startBgColor), n3d0.m161283g(model.getRelation().relationDetail.endBgColor), 4, GradientDrawable.Orientation.LEFT_RIGHT));
        } else {
            izs.m142871v("context_livingAct", this.f49091h, model.getRelation().relationDetail.tagImage, qa00.m175859d(61.0f), qa00.m175859d(14.0f), false, false, false, new C13155a());
        }
        this.f49094k.setText("Lv." + model.getRelation().level);
        VText vText2 = this.f49095l;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        vText2.setText(String.format("剩余%s天", Arrays.copyOf(new Object[]{String.valueOf((int) Math.ceil(((double) model.getRelation().remainSeconds) / 86400.0d))}, 1)));
        bnl0.m105524M(this.f49093j, model.getRelation().worth > 0);
        this.f49093j.setText(m79049c(model.getRelation().worth));
        String str3 = model.getRelation().userInfo.avatar;
        str3.getClass();
        String str4 = model.getRelation().otherUserInfo.avatar;
        str4.getClass();
        String str5 = model.getRelation().userInfo.tagImage;
        str5.getClass();
        String str6 = model.getRelation().otherUserInfo.tagImage;
        str6.getClass();
        bnl0.m105524M(this.f49088e, !TextUtils.isEmpty(str5));
        bnl0.m105524M(this.f49089f, true ^ TextUtils.isEmpty(str6));
        izs.m142868s("context_single_room", this.f49086c, str3);
        izs.m142868s("context_single_room", this.f49087d, str4);
        izs.m142868s("context_single_room", this.f49088e, str5);
        izs.m142868s("context_single_room", this.f49089f, str6);
        m79048b(model);
    }

    /* JADX INFO: renamed from: e */
    public final void m79051e() {
        C4496a c4496a = new C4496a(getContext());
        c4496a.m21846B(qa00.f156316c).m21873p(75).m21880w(qa00.m175859d(8.0f)).m21875r("#ffffff").m21869k(n3d0.m161283g("#FE7E1D")).m21874q(C4496a.f16402Q).m21860b(3000L).m21881x(-qa00.m175859d(20.0f)).m21882y(true).m21854J(13.0f).m21848D("长按试一下");
        C4499d.m21895l().m21908u(c4496a, this.f49094k, "dissolveShipTip");
        ((ifv) zrv.m221194l(htd0.f111523e)).f114713v.put(Boolean.TRUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceAuctionRelationListItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
