package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel.MedalLabelPageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ggx implements s7m<lgx> {

    /* JADX INFO: renamed from: a */
    public final MedalLabelPageView f102583a;

    /* JADX INFO: renamed from: b */
    public lgx<nnn0, ggx> f102584b;

    /* JADX INFO: renamed from: c */
    public vfx f102585c;

    public ggx(Act act) {
        this.f102583a = MedalLabelPageView.m76988i0(act.inflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m126088f(String str) {
        this.f102584b.m149796e4(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m126089j(String str) {
        if (str.equals("locked")) {
            osi0.m165783g(this.f102584b.m149792Z3() ? "暂未点亮该勋章，快去收集礼物吧～" : "该用户暂未点亮勋章，快去送她/他礼物吧～");
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f102583a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lgx lgxVar) {
        this.f102584b = lgxVar;
    }

    /* JADX INFO: renamed from: e */
    public View m126091e() {
        return this.f102583a;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m126092i(BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        this.f102584b.m149798g4(bLiveVoiceGiftItem);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m126093k(List<BLiveVoiceMedalWallItem> list) {
        this.f102583a.setListData(list);
    }

    /* JADX INFO: renamed from: r */
    public void m126094r() {
        vfx vfxVar = new vfx(this.f102584b, new e30() { // from class: l.dgx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86208a.m126088f((String) obj);
            }
        }, new e30() { // from class: l.egx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91265a.m126092i((BLiveVoiceGiftItem) obj);
            }
        }, new e30() { // from class: l.fgx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97451a.m126089j((String) obj);
            }
        });
        this.f102585c = vfxVar;
        this.f102583a.m76991k0(vfxVar);
        this.f102585c.m198297G(new ArrayList());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
