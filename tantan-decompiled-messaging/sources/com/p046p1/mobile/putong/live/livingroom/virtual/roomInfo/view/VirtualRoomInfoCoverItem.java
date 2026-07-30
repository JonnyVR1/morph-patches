package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p046p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualRoomInfoCoverItem;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VText;
import p149l.g9p0;
import p149l.hxs;
import p149l.jul0;
import p149l.lsi0;
import p149l.q4p0;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualRoomInfoCoverItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VirtualRoomInfoCoverItem f52733a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52734b;

    /* JADX INFO: renamed from: c */
    public ImageView f52735c;

    /* JADX INFO: renamed from: d */
    public VText f52736d;

    public VirtualRoomInfoCoverItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m77486a(BLiveExtraData bLiveExtraData, g9p0 g9p0Var, View view) {
        if (q4p0.m172949a(bLiveExtraData.voiceRoomProfile.identity) || q4p0.m172950b(bLiveExtraData.voiceRoomProfile.identity)) {
            if (BLiveVoiceRoomProfile.isStatePending(bLiveExtraData.voiceRoomProfile.coverStatus)) {
                lsi0.m151595y("资料正在审核中");
            } else {
                Frag fragM206029H2 = g9p0Var.m206029H2();
                fragM206029H2.startActivity(LiveCoverAct.m75466b2(fragM206029H2.getContext(), bLiveExtraData.voiceRoomProfile.roomId, "from_voice"));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77487b(View view) {
        jul0.m143335a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m77488c(@NotNull final BLiveExtraData bLiveExtraData, @NotNull final g9p0 g9p0Var) {
        xdl0.m208329E0(this.f52734b, new View.OnClickListener() { // from class: l.iul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualRoomInfoCoverItem.m77486a(bLiveExtraData, g9p0Var, view);
            }
        });
        VDraweeView vDraweeView = this.f52734b;
        String str = bLiveExtraData.voiceRoomProfile.coverUrl;
        int i = t100.f167243R;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
        if (!g9p0Var.mo124821i0(ypv.f199493a.m199309D0()) && !g9p0Var.mo124816d0(ypv.f199493a.m199309D0())) {
            xdl0.m208344M(this.f52736d, false);
            xdl0.m208344M(this.f52735c, false);
            return;
        }
        boolean zEquals = TextUtils.equals(bLiveExtraData.voiceRoomProfile.coverStatus, "pending");
        VText vText = this.f52736d;
        if (!zEquals) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f52735c, true);
        } else {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f52735c, false);
            this.f52736d.setText("审核中");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77487b(this);
    }

    public VirtualRoomInfoCoverItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualRoomInfoCoverItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
