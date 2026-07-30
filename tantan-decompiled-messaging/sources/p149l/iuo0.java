package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\"\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001f¨\u0006-"}, m87232d2 = {"Ll/iuo0;", "Ll/bs2;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/view/NormalVoiceDeputyItemView;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "", Constants.INAPP_DATA_TAG, "()Ljava/util/List;", "", "r", "Landroid/widget/LinearLayout;", "e", "Landroid/widget/LinearLayout;", "get_fl_deputy", "()Landroid/widget/LinearLayout;", "set_fl_deputy", "(Landroid/widget/LinearLayout;)V", "_fl_deputy", "f", "Lcom/p1/mobile/putong/live/livingroom/voice/call/view/NormalVoiceDeputyItemView;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/live/livingroom/voice/call/view/NormalVoiceDeputyItemView;", "set_vc_deputy_1", "(Lcom/p1/mobile/putong/live/livingroom/voice/call/view/NormalVoiceDeputyItemView;)V", "_vc_deputy_1", "g", "get_one", "set_one", "_one", "h", "m", "set_vc_deputy_2", "_vc_deputy_2", RXScreenCaptureService.KEY_INDEX, "n", "set_vc_deputy_3", "_vc_deputy_3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class iuo0 extends bs2<NormalVoiceDeputyItemView> {

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

    @Override // p149l.bs2
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<NormalVoiceDeputyItemView> mo103619d() {
        ArrayList arrayListM200324f0 = vwb.m200324f0(m138434l(), m138435m(), m138436n());
        arrayListM200324f0.getClass();
        return arrayListM200324f0;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m138433k(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m138433k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM143338b = juo0.m143338b(this, inflater, parent);
        viewM143338b.getClass();
        return viewM143338b;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final NormalVoiceDeputyItemView m138434l() {
        NormalVoiceDeputyItemView normalVoiceDeputyItemView = this._vc_deputy_1;
        if (normalVoiceDeputyItemView != null) {
            return normalVoiceDeputyItemView;
        }
        Intrinsics.m87502r("_vc_deputy_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final NormalVoiceDeputyItemView m138435m() {
        NormalVoiceDeputyItemView normalVoiceDeputyItemView = this._vc_deputy_2;
        if (normalVoiceDeputyItemView != null) {
            return normalVoiceDeputyItemView;
        }
        Intrinsics.m87502r("_vc_deputy_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final NormalVoiceDeputyItemView m138436n() {
        NormalVoiceDeputyItemView normalVoiceDeputyItemView = this._vc_deputy_3;
        if (normalVoiceDeputyItemView != null) {
            return normalVoiceDeputyItemView;
        }
        Intrinsics.m87502r("_vc_deputy_3");
        return null;
    }

    @Override // p149l.bs2
    /* JADX INFO: renamed from: r */
    public void mo103624r() {
        super.mo103624r();
        xdl0.m208325C0(m138434l().f52986b, t100.m186890d(88.0f));
        xdl0.m208325C0(m138434l().f52991g, t100.m186890d(120.0f));
        xdl0.m208327D0(t100.m186890d(120.0f), m138434l().f52991g);
        xdl0.m208325C0(m138434l().f52990f, t100.m186890d(190.0f));
        xdl0.m208327D0(t100.m186890d(190.0f), m138434l().f52990f);
        xdl0.m208325C0(m138434l().f52992h, t100.m186890d(88.0f));
        xdl0.m208327D0(t100.m186890d(88.0f), m138434l().f52992h);
        xdl0.m208325C0(m138434l().f52987c, t100.m186890d(88.0f));
        xdl0.m208327D0(t100.m186890d(88.0f), m138434l().f52987c);
        xdl0.m208360X(m138434l().f52996l, t100.m186890d(2.0f));
        m138434l().setVoiceAnimUrl("https://fe-static.tancdn.com/v1/raw/a2d40649-09b1-4272-a65f-1ac44ebed52213.svga");
        m138434l().f52990f.setScaleType(ImageView.ScaleType.FIT_XY);
        xdl0.m208325C0(m138434l().f52998n, t100.m186890d(98.0f));
        xdl0.m208327D0(t100.m186890d(98.0f), m138434l().f52998n);
        m138434l().f53000p.m78128d(t100.m186890d(46.0f), t100.m186890d(46.0f), -t100.m186890d(8.0f), -t100.m186890d(15.0f));
        xdl0.m208327D0(t100.m186890d(184.0f), m138434l().f52985a);
        xdl0.m208325C0(m138434l().f52985a, t100.m186890d(184.0f));
        xdl0.m208360X(m138434l().f52985a, -t100.m186890d(48.0f));
    }
}
