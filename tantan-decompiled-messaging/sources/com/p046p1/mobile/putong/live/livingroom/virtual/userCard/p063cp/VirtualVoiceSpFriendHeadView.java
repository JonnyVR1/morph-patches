package com.p046p1.mobile.putong.live.livingroom.virtual.userCard.p063cp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialFriendRelation;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceSpFriendHeadLayoutBindings;
import java.util.List;
import java.util.Objects;
import p149l.e30;
import p149l.hxs;
import p149l.vwb;
import p149l.xdl0;
import p149l.z3m0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceSpFriendHeadView extends LiveVirtualVoiceSpFriendHeadLayoutBindings<z3m0> {
    public VirtualVoiceSpFriendHeadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public void m77554c(final BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, final z3m0<?> z3m0Var) {
        if (bLiveVoiceUserProfileConfig == null) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this.f48157j, true);
        xdl0.m208329E0(this.f48157j, new View.OnClickListener() { // from class: l.v3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z3m0Var.m217053m4(bLiveVoiceUserProfileConfig.specialFriendRelationSchema);
            }
        });
        hxs.m133406s("context_livingAct", this.f48150c, "https://auto.tancdn.com/v1/images/eyJpZCI6IjVZMlBZUFlaNlhPSVJBRzRZWllBV0ZCN0hOSVM2RTE0IiwidyI6MTAwNSwiaCI6MjI4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTAwODYzODMxMTk4MDMzNTEwNX0.png");
        this.f48151d.setText("挚\n友");
        xdl0.m208344M(this, bLiveVoiceUserProfileConfig.showSpecialFriendRelation);
        m77555d(bLiveVoiceUserProfileConfig.specialFriendRelations, z3m0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m77555d(List<BLiveSpecialFriendRelation> list, final z3m0<?> z3m0Var) {
        if (vwb.m200296J(list)) {
            return;
        }
        if (list.size() > 0) {
            VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView = this.f48153f;
            BLiveSpecialFriendRelation bLiveSpecialFriendRelation = list.get(0);
            Objects.requireNonNull(z3m0Var);
            virtualVoiceSpFriendItemView.m77558j0(bLiveSpecialFriendRelation, new e30() { // from class: l.w3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    z3m0Var.m217052l4((BLiveSpecialFriendRelation) obj);
                }
            });
        }
        if (list.size() > 1) {
            VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView2 = this.f48154g;
            BLiveSpecialFriendRelation bLiveSpecialFriendRelation2 = list.get(1);
            Objects.requireNonNull(z3m0Var);
            virtualVoiceSpFriendItemView2.m77558j0(bLiveSpecialFriendRelation2, new e30() { // from class: l.w3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    z3m0Var.m217052l4((BLiveSpecialFriendRelation) obj);
                }
            });
        }
        if (list.size() > 2) {
            VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView3 = this.f48155h;
            BLiveSpecialFriendRelation bLiveSpecialFriendRelation3 = list.get(2);
            Objects.requireNonNull(z3m0Var);
            virtualVoiceSpFriendItemView3.m77558j0(bLiveSpecialFriendRelation3, new e30() { // from class: l.w3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    z3m0Var.m217052l4((BLiveSpecialFriendRelation) obj);
                }
            });
        }
        if (list.size() > 3) {
            VirtualVoiceSpFriendItemView virtualVoiceSpFriendItemView4 = this.f48156i;
            BLiveSpecialFriendRelation bLiveSpecialFriendRelation4 = list.get(3);
            Objects.requireNonNull(z3m0Var);
            virtualVoiceSpFriendItemView4.m77558j0(bLiveSpecialFriendRelation4, new e30() { // from class: l.w3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    z3m0Var.m217052l4((BLiveSpecialFriendRelation) obj);
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
