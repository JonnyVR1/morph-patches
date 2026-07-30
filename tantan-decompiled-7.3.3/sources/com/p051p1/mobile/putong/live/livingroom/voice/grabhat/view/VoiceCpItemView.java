package com.p051p1.mobile.putong.live.livingroom.voice.grabhat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jcn0;
import p153l.okc0;
import p153l.xau;
import p153l.y20;
import p153l.yau;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCpItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f53930d;

    /* JADX INFO: renamed from: e */
    public VText f53931e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f53932f;

    /* JADX INFO: renamed from: g */
    public SimpleDraweeView f53933g;

    /* JADX INFO: renamed from: h */
    public TextView f53934h;

    /* JADX INFO: renamed from: i */
    public ImageView f53935i;

    /* JADX INFO: renamed from: j */
    public TextView f53936j;

    public VoiceCpItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79268j0(View view) {
        jcn0.m144363a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m79269k0(final BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP, int i, final y20<String> y20Var) {
        okc0.m168005e(getContext(), this.f53930d, this.f53931e, i);
        izs.m142868s("context_single_room", this.f53932f, bLiveVoiceGrabHatCP.userMask.avatar);
        izs.m142868s("context_single_room", this.f53933g, bLiveVoiceGrabHatCP.otherUserMask.avatar);
        bnl0.m105509E0(this.f53932f, new View.OnClickListener() { // from class: l.hcn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceGrabHatCP.userId);
            }
        });
        bnl0.m105509E0(this.f53933g, new View.OnClickListener() { // from class: l.icn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceGrabHatCP.otherUserId);
            }
        });
        this.f53936j.setText(String.format("%s%s", xau.m209910t(R$string.f48057e7), yau.m214935c(bLiveVoiceGrabHatCP.lovePoint)));
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
        this.f53934h.setText(String.format("%s%s%s", bLiveVoiceGrabHatCP.userMask.name, "&", bLiveVoiceGrabHatCP.otherUserMask.name));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79268j0(this);
    }

    public VoiceCpItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCpItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
