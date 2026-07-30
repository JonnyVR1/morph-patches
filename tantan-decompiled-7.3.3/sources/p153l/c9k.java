package p153l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;

/* JADX INFO: loaded from: classes5.dex */
public class c9k extends LiveMenuDialogHolder<a9k> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f80493k;

    /* JADX INFO: renamed from: l */
    public View f80494l;

    /* JADX INFO: renamed from: m */
    public TextView f80495m;

    /* JADX INFO: renamed from: n */
    public TextView f80496n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f80497o;

    /* JADX INFO: renamed from: p */
    public View f80498p;

    /* JADX INFO: renamed from: q */
    public CommonMaskAvatarView f80499q;

    /* JADX INFO: renamed from: r */
    public ImageView f80500r;

    /* JADX INFO: renamed from: s */
    public View f80501s;

    /* JADX INFO: renamed from: t */
    public CommonMaskAvatarView f80502t;

    public c9k(@NonNull a9k a9kVar) {
        super(yec0.f199000Z8, a9kVar.act(), a9kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m108442H(View view) {
        mo73021p();
    }

    /* JADX INFO: renamed from: G */
    public final void m108443G(View view) {
        d9k.m115080a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m108444I(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP) {
        super.m73017E();
        this.f80496n.setText(xau.m209912v(R$string.f47517F2, bLiveVoiceGrabHatCP.userMask.name, bLiveVoiceGrabHatCP.otherUserMask.name, Long.valueOf(bLiveVoiceGrabHatCP.lovePoint)));
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveVoiceGrabHatCP.userMask.avatarConfig.frameConfig;
        bLiveAvatarFrameConfig.staticUrl = bLiveVoiceGrabHatCP.hatUrl;
        bLiveAvatarFrameConfig.dynamicUrl = "";
        biv.m104521f(this.f80499q, qa00.m175859d(66.0f), bLiveVoiceGrabHatCP.userMask);
        biv.m104526k(this.f80502t, qa00.m175859d(66.0f), bLiveVoiceGrabHatCP.otherUserMask);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m108443G(view);
        bnl0.m105509E0(this.f80494l, new View.OnClickListener() { // from class: l.b9k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f75589a.m108442H(view2);
            }
        });
    }
}
