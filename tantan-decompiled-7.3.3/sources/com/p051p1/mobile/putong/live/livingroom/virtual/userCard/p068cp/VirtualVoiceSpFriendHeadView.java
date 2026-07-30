package com.p051p1.mobile.putong.live.livingroom.virtual.userCard.p068cp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialFriendRelation;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceSpFriendHeadLayoutBindings;
import java.util.List;
import java.util.Objects;
import p153l.bnl0;
import p153l.ddm0;
import p153l.izs;
import p153l.jyb;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceSpFriendHeadView extends LiveVirtualVoiceSpFriendHeadLayoutBindings<ddm0> {
    public VirtualVoiceSpFriendHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public void m78737c(final BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, final ddm0<?> ddm0Var) {
        if (bLiveVoiceUserProfileConfig == null) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this.f49005j, true);
        bnl0.m105509E0(this.f49005j, new View.OnClickListener() { // from class: l.zcm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddm0Var.m115362m4(bLiveVoiceUserProfileConfig.specialFriendRelationSchema);
            }
        });
        izs.m142868s("context_livingAct", this.f48998c, "https://auto.tancdn.com/v1/images/eyJpZCI6IjVZMlBZUFlaNlhPSVJBRzRZWllBV0ZCN0hOSVM2RTE0IiwidyI6MTAwNSwiaCI6MjI4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODYzODMxMTk4MDMzNTEwNX0.png");
        this.f48999d.setText("挚\n友");
        bnl0.m105524M(this, bLiveVoiceUserProfileConfig.showSpecialFriendRelation);
        m78738d(bLiveVoiceUserProfileConfig.specialFriendRelations, ddm0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m78738d(List<BLiveSpecialFriendRelation> list, final ddm0<?> ddm0Var) {
        if (jyb.m147479J(list)) {
            return;
        }
        if (list.size() > 0) {
            VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView = this.f49001f;
            BLiveSpecialFriendRelation bLiveSpecialFriendRelation = list.get(0);
            Objects.requireNonNull(ddm0Var);
            virtualVoiceSpFriendItemView.m78741j0(bLiveSpecialFriendRelation, new y20() { // from class: l.adm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ddm0Var.m115361l4((BLiveSpecialFriendRelation) obj);
                }
            });
        }
        if (list.size() > 1) {
            VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView2 = this.f49002g;
            BLiveSpecialFriendRelation bLiveSpecialFriendRelation2 = list.get(1);
            Objects.requireNonNull(ddm0Var);
            virtualVoiceSpFriendItemView2.m78741j0(bLiveSpecialFriendRelation2, new y20() { // from class: l.adm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ddm0Var.m115361l4((BLiveSpecialFriendRelation) obj);
                }
            });
        }
        if (list.size() > 2) {
            VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView3 = this.f49003h;
            BLiveSpecialFriendRelation bLiveSpecialFriendRelation3 = list.get(2);
            Objects.requireNonNull(ddm0Var);
            virtualVoiceSpFriendItemView3.m78741j0(bLiveSpecialFriendRelation3, new y20() { // from class: l.adm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ddm0Var.m115361l4((BLiveSpecialFriendRelation) obj);
                }
            });
        }
        if (list.size() > 3) {
            VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView4 = this.f49004i;
            BLiveSpecialFriendRelation bLiveSpecialFriendRelation4 = list.get(3);
            Objects.requireNonNull(ddm0Var);
            virtualVoiceSpFriendItemView4.m78741j0(bLiveSpecialFriendRelation4, new y20() { // from class: l.adm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ddm0Var.m115361l4((BLiveSpecialFriendRelation) obj);
                }
            });
        }
    }

    public VirtualVoiceSpFriendHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceSpFriendHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
