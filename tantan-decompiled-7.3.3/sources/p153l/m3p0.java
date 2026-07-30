package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001f¨\u0006-"}, m88121d2 = {"Ll/m3p0;", "Ll/rs2;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/view/NormalVoiceDeputyItemView;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "", Constants.INAPP_DATA_TAG, "()Ljava/util/List;", "", "r", "Landroid/widget/LinearLayout;", "e", "Landroid/widget/LinearLayout;", "get_fl_deputy", "()Landroid/widget/LinearLayout;", "set_fl_deputy", "(Landroid/widget/LinearLayout;)V", "_fl_deputy", "f", "Lcom/p1/mobile/putong/live/livingroom/voice/call/view/NormalVoiceDeputyItemView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/live/livingroom/voice/call/view/NormalVoiceDeputyItemView;", "set_vc_deputy_1", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/view/NormalVoiceDeputyItemView;)V", "_vc_deputy_1", "g", "get_one", "set_one", "_one", "h", "m", "set_vc_deputy_2", "_vc_deputy_2", RXScreenCaptureService.KEY_INDEX, "n", "set_vc_deputy_3", "_vc_deputy_3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class m3p0 extends rs2<NormalVoiceDeputyItemView> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public LinearLayout _fl_deputy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public NormalVoiceDeputyItemView _vc_deputy_1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LinearLayout _one;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public NormalVoiceDeputyItemView _vc_deputy_2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public NormalVoiceDeputyItemView _vc_deputy_3;

    @Override // p153l.rs2
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<NormalVoiceDeputyItemView> mo134610d() {
        ArrayList arrayListM147507f0 = jyb.m147507f0(m156942l(), m156943m(), m156944n());
        arrayListM147507f0.getClass();
        return arrayListM147507f0;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m156941k(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m156941k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM161351b = n3p0.m161351b(this, inflater, parent);
        viewM161351b.getClass();
        return viewM161351b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final NormalVoiceDeputyItemView m156942l() {
        NormalVoiceDeputyItemView normalVoiceDeputyItemView = this._vc_deputy_1;
        if (normalVoiceDeputyItemView != null) {
            return normalVoiceDeputyItemView;
        }
        Intrinsics.m88391r("_vc_deputy_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final NormalVoiceDeputyItemView m156943m() {
        NormalVoiceDeputyItemView normalVoiceDeputyItemView = this._vc_deputy_2;
        if (normalVoiceDeputyItemView != null) {
            return normalVoiceDeputyItemView;
        }
        Intrinsics.m88391r("_vc_deputy_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final NormalVoiceDeputyItemView m156944n() {
        NormalVoiceDeputyItemView normalVoiceDeputyItemView = this._vc_deputy_3;
        if (normalVoiceDeputyItemView != null) {
            return normalVoiceDeputyItemView;
        }
        Intrinsics.m88391r("_vc_deputy_3");
        return null;
    }

    @Override // p153l.rs2
    /* JADX INFO: renamed from: r */
    public void mo154019r() {
        super.mo154019r();
        bnl0.m105505C0(m156942l().f53834b, qa00.m175859d(88.0f));
        bnl0.m105505C0(m156942l().f53839g, qa00.m175859d(120.0f));
        bnl0.m105507D0(qa00.m175859d(120.0f), m156942l().f53839g);
        bnl0.m105505C0(m156942l().f53838f, qa00.m175859d(190.0f));
        bnl0.m105507D0(qa00.m175859d(190.0f), m156942l().f53838f);
        bnl0.m105505C0(m156942l().f53840h, qa00.m175859d(88.0f));
        bnl0.m105507D0(qa00.m175859d(88.0f), m156942l().f53840h);
        bnl0.m105505C0(m156942l().f53835c, qa00.m175859d(88.0f));
        bnl0.m105507D0(qa00.m175859d(88.0f), m156942l().f53835c);
        bnl0.m105540X(m156942l().f53844l, qa00.m175859d(2.0f));
        m156942l().setVoiceAnimUrl("https://fe-static.tancdn.com/v1/raw/a2d40649-09b1-4272-a65f-1ac44ebed52213.svga");
        m156942l().f53838f.setScaleType(ImageView.ScaleType.FIT_XY);
        bnl0.m105505C0(m156942l().f53846n, qa00.m175859d(98.0f));
        bnl0.m105507D0(qa00.m175859d(98.0f), m156942l().f53846n);
        m156942l().f53848p.m79311d(qa00.m175859d(46.0f), qa00.m175859d(46.0f), -qa00.m175859d(8.0f), -qa00.m175859d(15.0f));
        bnl0.m105507D0(qa00.m175859d(184.0f), m156942l().f53833a);
        bnl0.m105505C0(m156942l().f53833a, qa00.m175859d(184.0f));
        bnl0.m105540X(m156942l().f53833a, -qa00.m175859d(48.0f));
    }
}
