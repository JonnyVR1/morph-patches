package p149l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;

/* JADX INFO: loaded from: classes5.dex */
public class k6k extends LiveMenuDialogHolder<i6k> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f121480k;

    /* JADX INFO: renamed from: l */
    public View f121481l;

    /* JADX INFO: renamed from: m */
    public TextView f121482m;

    /* JADX INFO: renamed from: n */
    public TextView f121483n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f121484o;

    /* JADX INFO: renamed from: p */
    public View f121485p;

    /* JADX INFO: renamed from: q */
    public CommonMaskAvatarView f121486q;

    /* JADX INFO: renamed from: r */
    public ImageView f121487r;

    /* JADX INFO: renamed from: s */
    public View f121488s;

    /* JADX INFO: renamed from: t */
    public CommonMaskAvatarView f121489t;

    public k6k(@NonNull i6k i6kVar) {
        super(t6c0.f168268Z8, i6kVar.act(), i6kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m144625H(View view) {
        mo71838p();
    }

    /* JADX INFO: renamed from: G */
    public final void m144626G(View view) {
        l6k.m148751a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m144627I(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP) {
        super.m71834E();
        this.f121483n.setText(w8u.m202219v(R$string.f46669F2, bLiveVoiceGrabHatCP.userMask.name, bLiveVoiceGrabHatCP.otherUserMask.name, Long.valueOf(bLiveVoiceGrabHatCP.lovePoint)));
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveVoiceGrabHatCP.userMask.avatarConfig.frameConfig;
        bLiveAvatarFrameConfig.staticUrl = bLiveVoiceGrabHatCP.hatUrl;
        bLiveAvatarFrameConfig.dynamicUrl = "";
        agv.m96348f(this.f121486q, t100.m186890d(66.0f), bLiveVoiceGrabHatCP.userMask);
        agv.m96353k(this.f121489t, t100.m186890d(66.0f), bLiveVoiceGrabHatCP.otherUserMask);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m144626G(view);
        xdl0.m208329E0(this.f121481l, new View.OnClickListener() { // from class: l.j6k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f116483a.m144625H(view2);
            }
        });
    }
}
