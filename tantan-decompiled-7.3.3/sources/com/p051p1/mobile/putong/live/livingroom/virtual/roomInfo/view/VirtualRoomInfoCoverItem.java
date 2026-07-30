package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p051p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoCoverItem;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.kip0;
import p153l.n3m0;
import p153l.o1j0;
import p153l.qa00;
import p153l.udp0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualRoomInfoCoverItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VirtualRoomInfoCoverItem f53581a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53582b;

    /* JADX INFO: renamed from: c */
    public ImageView f53583c;

    /* JADX INFO: renamed from: d */
    public VText f53584d;

    public VirtualRoomInfoCoverItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m78669a(BLiveExtraData bLiveExtraData, kip0 kip0Var, View view) {
        if (udp0.m195521a(bLiveExtraData.voiceRoomProfile.identity) || udp0.m195522b(bLiveExtraData.voiceRoomProfile.identity)) {
            if (BLiveVoiceRoomProfile.isStatePending(bLiveExtraData.voiceRoomProfile.coverStatus)) {
                o1j0.m165651y("资料正在审核中");
            } else {
                Frag fragM213812H2 = kip0Var.m213812H2();
                fragM213812H2.startActivity(LiveCoverAct.m76649c2(fragM213812H2.getContext(), bLiveExtraData.voiceRoomProfile.roomId, "from_voice"));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m78670b(View view) {
        n3m0.m161325a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m78671c(@NotNull final BLiveExtraData bLiveExtraData, @NotNull final kip0 kip0Var) {
        bnl0.m105509E0(this.f53582b, new View.OnClickListener() { // from class: l.m3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualRoomInfoCoverItem.m78669a(bLiveExtraData, kip0Var, view);
            }
        });
        VDraweeView vDraweeView = this.f53582b;
        String str = bLiveExtraData.voiceRoomProfile.coverUrl;
        int i = qa00.f156305R;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
        if (!kip0Var.mo149957i0(zrv.f205799a.m207631D0()) && !kip0Var.mo149952d0(zrv.f205799a.m207631D0())) {
            bnl0.m105524M(this.f53584d, false);
            bnl0.m105524M(this.f53583c, false);
            return;
        }
        boolean zEquals = TextUtils.equals(bLiveExtraData.voiceRoomProfile.coverStatus, "pending");
        VText vText = this.f53584d;
        if (!zEquals) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f53583c, true);
        } else {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f53583c, false);
            this.f53584d.setText("审核中");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78670b(this);
    }

    public VirtualRoomInfoCoverItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualRoomInfoCoverItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
