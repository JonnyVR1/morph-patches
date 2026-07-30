package com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCardType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceUserCardMiddleItemViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.cxq;
import p149l.hxs;
import p149l.i3c0;
import p149l.ibp0;
import p149l.kvc0;
import p149l.mep0;
import p149l.t100;
import p149l.vwb;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceUserCardMiddleItemViewBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;", "model", "Ll/ibp0;", "presenter", "", "userId", "n0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCards;Ll/ibp0;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCardType;", "type", "", "l0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCardType;)Z", "j0", "k0", "m0", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceVirtualUserCardMiddleItemView extends LiveVirtualVoiceUserCardMiddleItemViewBindings {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceVirtualUserCardMiddleItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static Unit m77565i0(ibp0 ibp0Var, BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards, VoiceVirtualUserCardMiddleItemView voiceVirtualUserCardMiddleItemView, String str, View view) {
        view.getClass();
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType = bLiveVoiceUserProfileMiddleCards.type;
        bLiveVoiceUserProfileMiddleCardType.getClass();
        ibp0Var.m135265p4(bLiveVoiceUserProfileMiddleCardType);
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType2 = bLiveVoiceUserProfileMiddleCards.type;
        bLiveVoiceUserProfileMiddleCardType2.getClass();
        if (voiceVirtualUserCardMiddleItemView.m77566j0(bLiveVoiceUserProfileMiddleCardType2)) {
            ibp0Var.m135263n4();
        } else if (TEnum.equals(bLiveVoiceUserProfileMiddleCards.type, BLiveVoiceUserProfileMiddleCardType.contribute)) {
            ibp0Var.m135264o4(str);
        } else {
            String str2 = bLiveVoiceUserProfileMiddleCards.schema;
            str2.getClass();
            BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType3 = bLiveVoiceUserProfileMiddleCards.type;
            bLiveVoiceUserProfileMiddleCardType3.getClass();
            ibp0Var.m135262m4(str2, !voiceVirtualUserCardMiddleItemView.m77567k0(bLiveVoiceUserProfileMiddleCardType3));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m77566j0(BLiveVoiceUserProfileMiddleCardType type) {
        return TEnum.equals(type, "auction");
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m77567k0(BLiveVoiceUserProfileMiddleCardType type) {
        return TEnum.equals(type, "giftWall");
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m77568l0(BLiveVoiceUserProfileMiddleCardType type) {
        return TEnum.equals(type, "sweetCp");
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m77569m0(BLiveVoiceUserProfileMiddleCardType type) {
        return TEnum.equals(type, BLiveVoiceUserProfileMiddleCardType.contribute);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x0182  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x00b5, please report this as an issue */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public final void m77570n0(@NotNull final BLiveVoiceUserProfileMiddleCards model, @NotNull final ibp0<?> presenter, @NotNull final String userId) {
        model.getClass();
        presenter.getClass();
        userId.getClass();
        this.f48178e.getHierarchy().m112053H(RoundingParams.m8249c(0.0f));
        this.f48184k.setText(model.title);
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType = model.type;
        bLiveVoiceUserProfileMiddleCardType.getClass();
        if (m77568l0(bLiveVoiceUserProfileMiddleCardType) && model.amount == -1) {
            this.f48183j.setText("未解锁");
            this.f48183j.setTextSize(12.0f);
        } else {
            BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType2 = model.type;
            bLiveVoiceUserProfileMiddleCardType2.getClass();
            if (m77569m0(bLiveVoiceUserProfileMiddleCardType2)) {
                this.f48183j.setText("粉丝榜");
                this.f48183j.setTextSize(12.0f);
                this.f48178e.getHierarchy().m112053H(RoundingParams.m8247a());
            } else {
                BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType3 = model.type;
                bLiveVoiceUserProfileMiddleCardType3.getClass();
                if (m77568l0(bLiveVoiceUserProfileMiddleCardType3)) {
                    this.f48183j.setText("Lv." + x8u.m207433c(model.amount));
                } else {
                    BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType4 = model.type;
                    bLiveVoiceUserProfileMiddleCardType4.getClass();
                    if (m77566j0(bLiveVoiceUserProfileMiddleCardType4)) {
                        this.f48183j.setText("Lv." + x8u.m207433c(model.amount));
                    } else {
                        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType5 = model.type;
                        bLiveVoiceUserProfileMiddleCardType5.getClass();
                        boolean zM77567k0 = m77567k0(bLiveVoiceUserProfileMiddleCardType5);
                        VText vText = this.f48183j;
                        if (zM77567k0) {
                            vText.setText(model.amount + "/" + model.totalAmount);
                        } else {
                            vText.setText(x8u.m207436f(model.amount));
                        }
                    }
                }
                this.f48183j.setTextSize(15.0f);
            }
        }
        hxs.m133406s("context_livingAct", this.f48178e, model.icon);
        if (vwb.m200296J(model.avatars) || model.avatars.size() < 2) {
            xdl0.m208344M(this.f48180g, false);
            xdl0.m208344M(this.f48179f, false);
            xdl0.m208344M(this.f48182i, false);
            xdl0.m208344M(this.f48181h, false);
        } else {
            xdl0.m208344M(this.f48180g, true);
            xdl0.m208344M(this.f48179f, true);
            xdl0.m208344M(this.f48182i, true);
            xdl0.m208344M(this.f48181h, true);
            hxs.m133406s("context_livingAct", this.f48180g, model.avatars.get(0));
            hxs.m133406s("context_livingAct", this.f48182i, model.avatars.get(1));
            this.f48179f.setBackground(kvc0.m147354c("#3B262D", 100));
            this.f48181h.setBackground(kvc0.m147354c("#3B262D", 100));
        }
        BLiveVoiceUserProfileMiddleCardType bLiveVoiceUserProfileMiddleCardType6 = model.type;
        bLiveVoiceUserProfileMiddleCardType6.getClass();
        presenter.m135266q4(bLiveVoiceUserProfileMiddleCardType6);
        if (TextUtils.isEmpty(model.backgroundColor)) {
            getRoot().setBackgroundResource(i3c0.f110801N7);
        } else {
            String str = model.backgroundColor;
            str.getClass();
            if (C15386d.m93483J(str, "#", false, 2, null)) {
                mep0.m154302d1(getRoot(), t100.f167260i);
                getRoot().setBackgroundColor(Color.parseColor(model.backgroundColor));
            } else {
                getRoot().setBackgroundResource(i3c0.f110801N7);
            }
        }
        cxq.m109105c(this, new Function1() { // from class: l.gbp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualUserCardMiddleItemView.m77565i0(presenter, model, this, userId, (View) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceUserCardMiddleItemViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        xdl0.m208327D0((xdl0.m208412y0() - t100.m186890d(72.0f)) / 3, this);
    }
}
