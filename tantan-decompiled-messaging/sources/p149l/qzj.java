package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallListDetail;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.GiftWallPageView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class qzj implements s7m<uzj> {

    /* JADX INFO: renamed from: a */
    public final GiftWallPageView f157056a;

    /* JADX INFO: renamed from: b */
    public uzj<nnn0, qzj> f157057b;

    public qzj(Act act) {
        this.f157056a = GiftWallPageView.m76963d0(act.inflater());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f157056a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(uzj uzjVar) {
        this.f157057b = uzjVar;
    }

    /* JADX INFO: renamed from: b */
    public void m177218b() {
        this.f157056a.m76966c0();
    }

    /* JADX INFO: renamed from: c */
    public View m177219c() {
        return this.f157056a;
    }

    /* JADX INFO: renamed from: d */
    public void m177220d(List<BLiveVoiceGiftWallListDetail> list) {
        this.f157056a.setListDate(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m177221r() {
        this.f157056a.m76968f0(this.f157057b);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
