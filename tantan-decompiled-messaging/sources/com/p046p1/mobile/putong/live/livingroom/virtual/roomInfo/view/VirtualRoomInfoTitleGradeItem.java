package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.lul0;
import p149l.s7p0;
import p149l.t100;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualRoomInfoTitleGradeItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VirtualRoomInfoTitleGradeItem f52737d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f52738e;

    /* JADX INFO: renamed from: f */
    public View f52739f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52740g;

    /* JADX INFO: renamed from: h */
    public VText f52741h;

    /* JADX INFO: renamed from: i */
    public VText f52742i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f52743j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f52744k;

    public VirtualRoomInfoTitleGradeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m77490b() {
        this.f52741h.setText("");
        this.f52743j.setController(null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m77491i0(View view) {
        lul0.m151774a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m77492j0() {
        hxs.m133408u("context_livingAct", this.f52743j, ydt.f197632v, t100.m186890d(375.0f), t100.m186890d(186.0f));
    }

    /* JADX INFO: renamed from: k0 */
    public void m77493k0(int i) {
        int i2 = t100.f167273v;
        FrameLayout frameLayout = this.f52738e;
        if (i > i2) {
            xdl0.m208345M0(frameLayout, true);
        } else {
            xdl0.m208345M0(frameLayout, false);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m77494l0(BLiveExtraData bLiveExtraData, final s7p0 s7p0Var) {
        if (bLiveExtraData == null) {
            return;
        }
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = bLiveExtraData.voiceRoomProfile;
        this.f52741h.setText(bLiveVoiceRoomProfile.title);
        VDraweeView vDraweeView = this.f52740g;
        String str = bLiveVoiceRoomProfile.coverUrl;
        int i = t100.f167226A;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
        this.f52742i.setText("ID:" + bLiveVoiceRoomProfile.publicRoomId);
        xdl0.m208329E0(this.f52744k, new View.OnClickListener() { // from class: l.kul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s7p0Var.mo124815R();
            }
        });
        hxs.m133406s("context_livingAct", this.f52744k, bLiveVoiceRoomProfile.levelIcon);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77491i0(this);
    }

    public VirtualRoomInfoTitleGradeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualRoomInfoTitleGradeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
