package com.p046p1.mobile.putong.live.livingroom.voice.grabhat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.e30;
import p149l.f3n0;
import p149l.hcc0;
import p149l.hxs;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCpItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f53082d;

    /* JADX INFO: renamed from: e */
    public VText f53083e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f53084f;

    /* JADX INFO: renamed from: g */
    public SimpleDraweeView f53085g;

    /* JADX INFO: renamed from: h */
    public TextView f53086h;

    /* JADX INFO: renamed from: i */
    public ImageView f53087i;

    /* JADX INFO: renamed from: j */
    public TextView f53088j;

    public VoiceCpItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78085j0(View view) {
        f3n0.m119262a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m78086k0(final BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP, int i, final e30<String> e30Var) {
        hcc0.m130420e(getContext(), this.f53082d, this.f53083e, i);
        hxs.m133406s("context_single_room", this.f53084f, bLiveVoiceGrabHatCP.userMask.avatar);
        hxs.m133406s("context_single_room", this.f53085g, bLiveVoiceGrabHatCP.otherUserMask.avatar);
        xdl0.m208329E0(this.f53084f, new View.OnClickListener() { // from class: l.d3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceGrabHatCP.userId);
            }
        });
        xdl0.m208329E0(this.f53085g, new View.OnClickListener() { // from class: l.e3n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceGrabHatCP.otherUserId);
            }
        });
        this.f53088j.setText(String.format("%s%s", w8u.m202217t(R$string.f47209e7), x8u.m207433c(bLiveVoiceGrabHatCP.lovePoint)));
        String str = bLiveVoiceGrabHatCP.userMask.name;
        if (str != null && str.length() > 4) {
            BLiveUserMask bLiveUserMask = bLiveVoiceGrabHatCP.userMask;
            bLiveUserMask.name = bLiveUserMask.name.substring(0, 4).concat("...");
        }
        String str2 = bLiveVoiceGrabHatCP.otherUserMask.name;
        if (str2 != null && str2.length() > 4) {
            BLiveUserMask bLiveUserMask2 = bLiveVoiceGrabHatCP.otherUserMask;
            bLiveUserMask2.name = bLiveUserMask2.name.substring(0, 4).concat("...");
        }
        this.f53086h.setText(String.format("%s%s%s", bLiveVoiceGrabHatCP.userMask.name, "&", bLiveVoiceGrabHatCP.otherUserMask.name));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78085j0(this);
    }

    public VoiceCpItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCpItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
