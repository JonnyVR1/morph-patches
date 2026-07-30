package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.p3m0;
import p153l.qa00;
import p153l.wgp0;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualRoomInfoTitleGradeItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VirtualRoomInfoTitleGradeItem f53585d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f53586e;

    /* JADX INFO: renamed from: f */
    public View f53587f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53588g;

    /* JADX INFO: renamed from: h */
    public VText f53589h;

    /* JADX INFO: renamed from: i */
    public VText f53590i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f53591j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f53592k;

    public VirtualRoomInfoTitleGradeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m78673b() {
        this.f53589h.setText("");
        this.f53591j.setController(null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78674i0(View view) {
        p3m0.m170497a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m78675j0() {
        izs.m142870u("context_livingAct", this.f53591j, zft.f204227v, qa00.m175859d(375.0f), qa00.m175859d(186.0f));
    }

    /* JADX INFO: renamed from: k0 */
    public void m78676k0(int i) {
        int i2 = qa00.f156335v;
        FrameLayout frameLayout = this.f53586e;
        if (i > i2) {
            bnl0.m105525M0(frameLayout, true);
        } else {
            bnl0.m105525M0(frameLayout, false);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m78677l0(BLiveExtraData bLiveExtraData, final wgp0 wgp0Var) {
        if (bLiveExtraData == null) {
            return;
        }
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = bLiveExtraData.voiceRoomProfile;
        this.f53589h.setText(bLiveVoiceRoomProfile.title);
        VDraweeView vDraweeView = this.f53588g;
        String str = bLiveVoiceRoomProfile.coverUrl;
        int i = qa00.f156288A;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
        this.f53590i.setText("ID:" + bLiveVoiceRoomProfile.publicRoomId);
        bnl0.m105509E0(this.f53592k, new View.OnClickListener() { // from class: l.o3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wgp0Var.mo149951R();
            }
        });
        izs.m142868s("context_livingAct", this.f53592k, bLiveVoiceRoomProfile.levelIcon);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78674i0(this);
    }

    public VirtualRoomInfoTitleGradeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualRoomInfoTitleGradeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
