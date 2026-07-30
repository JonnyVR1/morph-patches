package com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCardType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceUserCardMiddleItemViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.bnl0;
import p153l.czq;
import p153l.izs;
import p153l.jyb;
import p153l.mkp0;
import p153l.n3d0;
import p153l.obc0;
import p153l.qa00;
import p153l.qnp0;
import p153l.yau;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceUserCardMiddleItemViewBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;", "model", "Ll/mkp0;", "presenter", "", "userId", "n0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;Ll/mkp0;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCardType;", "type", "", "l0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCardType;)Z", "j0", "k0", "m0", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceVirtualUserCardMiddleItemView extends LiveVirtualVoiceUserCardMiddleItemViewBindings {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceVirtualUserCardMiddleItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static Unit m78748i0(mkp0 mkp0Var, BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards, VoiceVirtualUserCardMiddleItemView voiceVirtualUserCardMiddleItemView, String str, View view) {
        view.getClass();
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType = bLiveVoiceUserProfileMiddleCards.type;
        bLiveVoiceUserProfileMiddleCardType.getClass();
        mkp0Var.m158820p4(bLiveVoiceUserProfileMiddleCardType);
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType2 = bLiveVoiceUserProfileMiddleCards.type;
        bLiveVoiceUserProfileMiddleCardType2.getClass();
        if (voiceVirtualUserCardMiddleItemView.m78749j0(bLiveVoiceUserProfileMiddleCardType2)) {
            mkp0Var.m158818n4();
        } else if (TEnum.equals(bLiveVoiceUserProfileMiddleCards.type, BLiveVoiceUserProfileMiddleCardType.contribute)) {
            mkp0Var.m158819o4(str);
        } else {
            String str2 = bLiveVoiceUserProfileMiddleCards.schema;
            str2.getClass();
            BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType3 = bLiveVoiceUserProfileMiddleCards.type;
            bLiveVoiceUserProfileMiddleCardType3.getClass();
            mkp0Var.m158817m4(str2, !voiceVirtualUserCardMiddleItemView.m78750k0(bLiveVoiceUserProfileMiddleCardType3));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m78749j0(BLiveVoiceUserProfileMiddleCardType type) {
        return TEnum.equals(type, "auction");
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m78750k0(BLiveVoiceUserProfileMiddleCardType type) {
        return TEnum.equals(type, "giftWall");
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m78751l0(BLiveVoiceUserProfileMiddleCardType type) {
        return TEnum.equals(type, "sweetCp");
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m78752m0(BLiveVoiceUserProfileMiddleCardType type) {
        return TEnum.equals(type, BLiveVoiceUserProfileMiddleCardType.contribute);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x0182  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x00b5, please report this as an issue */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public final void m78753n0(@NotNull final BLiveVoiceUserProfileMiddleCards model, @NotNull final mkp0<?> presenter, @NotNull final String userId) {
        model.getClass();
        presenter.getClass();
        userId.getClass();
        this.f49026e.getHierarchy().m207045H(RoundingParams.m8303c(0.0f));
        this.f49032k.setText(model.title);
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType = model.type;
        bLiveVoiceUserProfileMiddleCardType.getClass();
        if (m78751l0(bLiveVoiceUserProfileMiddleCardType) && model.amount == -1) {
            this.f49031j.setText("未解锁");
            this.f49031j.setTextSize(12.0f);
        } else {
            BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType2 = model.type;
            bLiveVoiceUserProfileMiddleCardType2.getClass();
            if (m78752m0(bLiveVoiceUserProfileMiddleCardType2)) {
                this.f49031j.setText("粉丝榜");
                this.f49031j.setTextSize(12.0f);
                this.f49026e.getHierarchy().m207045H(RoundingParams.m8301a());
            } else {
                BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType3 = model.type;
                bLiveVoiceUserProfileMiddleCardType3.getClass();
                if (m78751l0(bLiveVoiceUserProfileMiddleCardType3)) {
                    this.f49031j.setText("Lv." + yau.m214935c(model.amount));
                } else {
                    BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType4 = model.type;
                    bLiveVoiceUserProfileMiddleCardType4.getClass();
                    if (m78749j0(bLiveVoiceUserProfileMiddleCardType4)) {
                        this.f49031j.setText("Lv." + yau.m214935c(model.amount));
                    } else {
                        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType5 = model.type;
                        bLiveVoiceUserProfileMiddleCardType5.getClass();
                        boolean zM78750k0 = m78750k0(bLiveVoiceUserProfileMiddleCardType5);
                        VText vText = this.f49031j;
                        if (zM78750k0) {
                            vText.setText(model.amount + "/" + model.totalAmount);
                        } else {
                            vText.setText(yau.m214938f(model.amount));
                        }
                    }
                }
                this.f49031j.setTextSize(15.0f);
            }
        }
        izs.m142868s("context_livingAct", this.f49026e, model.icon);
        if (jyb.m147479J(model.avatars) || model.avatars.size() < 2) {
            bnl0.m105524M(this.f49028g, false);
            bnl0.m105524M(this.f49027f, false);
            bnl0.m105524M(this.f49030i, false);
            bnl0.m105524M(this.f49029h, false);
        } else {
            bnl0.m105524M(this.f49028g, true);
            bnl0.m105524M(this.f49027f, true);
            bnl0.m105524M(this.f49030i, true);
            bnl0.m105524M(this.f49029h, true);
            izs.m142868s("context_livingAct", this.f49028g, model.avatars.get(0));
            izs.m142868s("context_livingAct", this.f49030i, model.avatars.get(1));
            this.f49027f.setBackground(n3d0.m161279c("#3B262D", 100));
            this.f49029h.setBackground(n3d0.m161279c("#3B262D", 100));
        }
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType6 = model.type;
        bLiveVoiceUserProfileMiddleCardType6.getClass();
        presenter.m158821q4(bLiveVoiceUserProfileMiddleCardType6);
        if (TextUtils.isEmpty(model.backgroundColor)) {
            getRoot().setBackgroundResource(obc0.f146129N7);
        } else {
            String str = model.backgroundColor;
            str.getClass();
            if (C15493d.m94374J(str, "#", false, 2, null)) {
                qnp0.m177261d1(getRoot(), qa00.f156322i);
                getRoot().setBackgroundColor(Color.parseColor(model.backgroundColor));
            } else {
                getRoot().setBackgroundResource(obc0.f146129N7);
            }
        }
        czq.m113347c(this, new Function1() { // from class: l.kkp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualUserCardMiddleItemView.m78748i0(presenter, model, this, userId, (View) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceUserCardMiddleItemViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        bnl0.m105507D0((bnl0.m105592y0() - qa00.m175859d(72.0f)) / 3, this);
    }
}
